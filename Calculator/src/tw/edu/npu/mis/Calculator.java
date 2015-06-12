/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tw.edu.npu.mis;

/**
 * The model class of the calculator application.
 */
public class Calculator{

    /**
     * 所有類別實作的部分
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Model mModel = new Model();
        View mView = new View();
        mModel.addObserver(mView);
        Controller mController = new Controller();
        mController.addModel(mModel);
        mController.addView(mView);
        mView.addController(mController);
    }

}
