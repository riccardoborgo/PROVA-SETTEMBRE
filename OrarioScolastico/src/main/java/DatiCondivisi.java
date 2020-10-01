/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author borgonovo_riccardo
 */
public class DatiCondivisi {
    int MAXEL = 10;
    static String vettoreOrario[];
    static String Orario;
    static String AGOSTONI = ",2BI,2CI LFS,1AI LFS,.,.,.,2CI,1AI,1BI LFS,2AI,.,.,-,-,-,-,-,-,1BI,2BI LFS,1CI LFS,.,2AI,.,1CI,2CI,1AI,.,2AI LFS,.,1CI,1BI,2BI,.,.";
    static String ALI = ",3AL,4BS,.,4AL,5AS,.,5AL,5BL,.,4BL,3AS,.,-,-,-,-,-,-,4BS,3BS,3AL,4BL,.,.,.,.,4AL,3BS,4AS,.,3AS,5BL,5AL,5AS,4AS,20";
    static String ALIPRANDI = "4AM LI5,4AM LI5,4BE,.,3EE,.,.,.,5AM LSM,5AM LSM,3EE LSM,3EE LSM,-,-,-,-,-,-,.,.,.,4BE LSM,4BE LSM,4AM,4AM,5AM LSM,.,4BE,5BM LSM,.,.,.,5BM LSM,5BM LSM,3EE";
    static String ANDREACCHI = "5AI LI6,1CI LI4,4BI LI7,5BI LI7,.,.,3BI LI7,3BI LI7,5BI LI7,4CI LI7,4CI LI7,.,5AI LI6,5AI LI6,.,4BI LI7,4BI LI7,.,.,5BI LI7,5BI LI7,.,.,.,.,.,1CI LI4,3BI LI7,4CI LI7,.,-,-,-,-,-";
    static String ASTA ="-,-,-,-,-,-,.,.,.,4AM,2AM,2AM,3EE,3EE,.,4AM,2AM,.,2AM,4AM,4AM,.,.,.,3EE,3EE,2AM,4AM,.,.,4AM,3EE,3EE,.,2AM";
    static String BALLABIO ="5D,2B,1D,.,5AI,.,.,.,2B,5AI,2C,5D,.,.,1D,5D,2C,.,,,,,,,.,5AI,1D,2C,2B,.,-,-,-,-,-";
    static String BARDI =".,.,1BM LI4,5AI LI6,1CM LI4,.,-,-,-,-,-,-,1AM LI4,.,1CM LI4,.,.,.,5AI LI6,5AI LI6,1BM LI4,.,1AM LI4,.,1AC LI2,1AC LI2,1BC LI2,1BC LI2,.,.,5AI LI6,5AI LI6,4AI LI6,4AI LI6,3AI LI6";
   
    public DatiCondivisi(){
    vettoreOrario = new String[MAXEL];
    
}
    public void inizializzaV(){
    vettoreOrario[0]= AGOSTONI;
    vettoreOrario[1]= ALI;
    vettoreOrario[2]= ALIPRANDI;
    vettoreOrario[3]= ANDREACCHI;
    vettoreOrario[4]= ASTA;
    vettoreOrario[5]= BALLABIO;
    vettoreOrario[6]= BARDI;
    
    for(int i = 0; i<= 6; i++){
        vettoreOrario[i].split(",");
    }
    
}
    public synchronized void cerca(int nProf, String classe){
        if(nProf == 1){
        for(int i = 0; i<=vettoreOrario[0].length() ; i++){
         if(vettoreOrario[0].substring(i, 2) == classe){
             Orario += "AGOSTONI";
         }    
        }
        }
        else if(nProf == 2){
        for(int i = 0; i<=vettoreOrario[1].length() ; i++){
         if(vettoreOrario[1].substring(i, 2) == classe){
             Orario += "ALI";
         }    
        }
        }
        else if(nProf == 3){
        for(int i = 0; i<=vettoreOrario[2].length() ; i++){
         if(vettoreOrario[2].substring(i, 2) == classe){
             Orario += "ALIPRANDI";
         }    
        }
        }
        else if(nProf == 4){
        for(int i = 0; i<=vettoreOrario[3].length() ; i++){
         if(vettoreOrario[3].substring(i, 2) == classe){
             Orario += "ANDREACCHI";
         }    
        }
        }
        else if(nProf == 5){
        for(int i = 0; i<=vettoreOrario[4].length() ; i++){
         if(vettoreOrario[4].substring(i, 2) == classe){
             Orario += "ASTA";
         }    
        }
        }
        else if(nProf == 6){
        for(int i = 0; i<=vettoreOrario[5].length() ; i++){
         if(vettoreOrario[5].substring(i, 2) == classe){
             Orario += "BALLABIO";
         }    
        }
        }
        else if(nProf == 7){
        for(int i = 0; i<=vettoreOrario[6].length() ; i++){
         if(vettoreOrario[6].substring(i, 2) == classe){
             Orario += "BARDI";
         }    
        }
        }
    }


}
