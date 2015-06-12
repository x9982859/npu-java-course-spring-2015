/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;

/**
 *
 * @author Ying Sheng
 */
public class Controller implements java.awt.event.ActionListener{
    
        private Model mModel;
        private View mView;
        
        @Override
        public void actionPerformed(java.awt.event.ActionEvent e){
            String Str = e.getSource().toString().substring(e.getSource().toString().indexOf("text=")+5, e.getSource().toString().lastIndexOf(","));
            mModel.count(Str);
	}
    
        public void addModel(Model m){
		this.mModel = m;
	}
    
        public void addView(View v){
		this.mView = v;
	}
}
