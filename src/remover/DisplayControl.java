package remover;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class DisplayControl extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private DisplayPanel view;
	private ModelForFile model;
	private RecrusionCounter counter;
	
	public DisplayControl(String name) {
		super(name);
		
		view = new DisplayPanel();
		model = new ModelForFile();
		counter = new RecrusionCounter();
		
		this.view.getComfirm().addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				model.path = view.getInputpath().getText();
//				model.inputsuffix = view.getSourcesuffix().getText().toLowerCase();
//				model.outputsuffix = view.getOutputsuffix().getText().toLowerCase();
//				suffixRename(model.path,model.inputsuffix,model.outputsuffix);
				model.originalpath = view.getSourcesuffix().getText();
				
				fileReplacement(model.path,model.originalpath, counter);
				JOptionPane.showMessageDialog(null,
						"Complete with changing "+counter.getCount()+" files", "",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});
		this.getContentPane().setLayout(null);
		this.getContentPane().add(view);
		// Set program to stop when window closed
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLayout(null);
		setSize(1280,720); // manually computed sizes
	}
    public static void fileReplacement(String path, String originalFilePath, RecrusionCounter counter) {
        File file = new File(path);
        File[] fs = file.listFiles();
        
        for (int i = 0; i < fs.length; i++) {
            File f2 = fs[i];
            if (f2.isDirectory()) {
                fileReplacement(f2.getPath(),originalFilePath, counter);
            } else {
                String name = f2.getName();
                String suffix = name.substring(name.length()-3,name.length());
                
                if(suffix.equals("c2s")) {
                	try {
                	    // 创建字符输入流
                	    FileReader reader = new FileReader(originalFilePath);
                	    BufferedReader br = new BufferedReader(reader);
                	  
                	    // 创建字符输出流
                	    FileWriter writer = new FileWriter(f2.getParent() + File.separator+name);
                	    BufferedWriter bw = new BufferedWriter(writer);
                	  
                	    // 读取并写入文件内容
                	    String line;
                	    while ((line = br.readLine()) != null) {
                	        bw.write(line);
                	        bw.newLine();
                	    }
                	  
                	    // 关闭流
                	    br.close();
                	    bw.close();
                	    counter.increaseCount();
                	    System.out.println("文件覆盖成功！ "+counter.getCount());
                	   
                	} catch (IOException e) {
                	    e.printStackTrace();

                	}
                	
                	
                }
                
                
        }
    }
 }
}
