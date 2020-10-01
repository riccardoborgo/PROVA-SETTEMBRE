/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author borgonovo_riccardo
 */
public class ThreadProf7 {
 private DatiCondivisi dc;
    private int nProf;
    private String classe;
    
    public ThreadProf7(){
    this.dc = dc;
    this.nProf = nProf;
    }
    
    public void run(){
    
        dc.cerca(nProf, classe);
    }}
