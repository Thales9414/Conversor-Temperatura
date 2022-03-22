package Conversor;

import java.util.Scanner;  


public class Temperatura {  
	
		
		
		static char menu;
		static double tempx;
		static char menuTo;
		
          
        public static void main( String[] args ){  
          
        	            	
            char   scaleFrom = ' '; 
            char   scaleTo   = ' '; 
              
            double tempFrom  = 0.0;
   
            double result    = 0.0; 
              
              
        do {  
                  
                /*  
                    Method to display the menu and store the scale from  
                        which the temperature will be converted from 
                */  
                  
                scaleFrom = displayMenu();  
                  
                  
                /*  
                    Only asks user to input more information,  
                    if scaleFrom is different than "x" ( x = Exit ) 
                */  
                if ( scaleFrom != 'x' ){  
                  
                    /*  
                        Method to get the temperature value to be  
                            converted and store the value entered by user 
                    */  
                    tempFrom = getTemp();  
                      
                      
                    /*  
                        Method to get the scale to which the  
                            temperature value will be converted to 
                    */  
                    scaleTo = getUnitTo();  
                      
                      
                    result = convertTemp( scaleFrom, tempFrom, scaleTo );  
                      
                      
                    displayResult( scaleFrom, tempFrom, scaleTo, result );  
                      
                }  
            } while ( scaleFrom != 'x' );  
        }  
          
		  
       public static double convertTemp( char uFrom, double temp, char uTo ){  
           
            
    	   	double tempConv = temp;
              
            if(uFrom=='a'){  
                return convFromCelsius(tempConv, uTo); 
            }else if(uFrom=='b'){  
                return convFromFahrenheit(tempConv, uTo);  
            }else if(uFrom=='c'){  
                return convFromKelvin(tempConv, uTo);  
           }  
             return 0;  
                      
        }  
          
          
        public static double convFromCelsius( double value, char unitTo ){  
          
            
			 
              
        	if(unitTo=='b') {
    			double newvalue=(1.8 * value) + 32;
    			return newvalue;
    		}
    		else if(unitTo=='a'){
    			return value;
    		}
    		else if(unitTo=='c') {
    			double newvalue = value + 273.15;
    			return newvalue;
    		}     
           
           return 0;  
               
        }  
          
          
        public static double convFromFahrenheit( double value, char unitTo ){  
          
             
        	
        	if(unitTo=='b') {
    			return value;
    		}
    		else if(unitTo=='a'){
    			double newvalue=(value - 32)*5/9;
    			return newvalue;
    		}
    		else if(unitTo=='c') {
    			double newvalue=(value + 459.67) * 5/9 ;
    			return newvalue;
    		}
            return 0;  
           
        }  
  
          
        public static double convFromKelvin( double value, char unitTo ){  
          
             
        	if(unitTo=='b') {
    			double newvalue=value * 9/5 - 459.67;
    			return newvalue;
    		}
    		else if(unitTo=='a'){
    			double newvalue = value - 273.15;
    			return newvalue;
    		}
    		else if(unitTo=='c') {
    			return value;
    			}
            return 0;  
               
        }  
         
        
        
        private static void displayResult(char scaleFrom, double tempFrom,char scaleTo, double result) {  
              
            System.out.println("First option: "+scaleFrom+  
                                "\nTemperature:"+tempFrom+  
                                "\nTo be convert to:"+scaleTo+  
                                "\nThe result is:"+result); 
            
            System.out.println("");
            Scanner in = new Scanner(System.in);
    		System.out.println("Do you have another conversion?(Y/N): ");
    		String next = in.next();
    		next= next.toUpperCase();
    		if(next.equals("N")){
    			System.exit(0);
    		}
              
        }  
        
        
        private static double getTemp() {  
              
            System.out.println("Enter the temperature: ");  
              
            Scanner sc = new Scanner(System.in);  
            tempx = Double.parseDouble(sc.nextLine());  
              
            return tempx;  
        }  
  
        private static char getUnitTo() {  
  
                System.out.println();  
                System.out.println("============================"+  
                        "\nTemperature Conversion"+  
                        "\n=========== MENU ==========="+  
                        "\na. To Celsius"+  
                        "\nb. To Fahrenheit"+  
                        "\nc. To Kelvin"+  
                        "\nx. Exit"+  
                        "\n============================"+  
                        "\nEnter an option:");  
                try {  
                      
                	 @SuppressWarnings("resource")
					Scanner sc = new Scanner(System.in);
                     
                     String menu1=sc.nextLine(); 
                                     
                     menuTo = menu1.charAt(0);  
                      
                    switch (menuTo) {  
                      
                    case 'a':  
                          
                        break;  
                          
                    case 'b':   
                          
                        break;    
                          
                    case 'c':  
                          
                        break;  
                          
                    case 'x':  
                        System.out.println("Good bye!!");  
                        System.exit(0);  
                          
                        break;    
                          
                    default:  
                        System.out.println("Please enter a valid value");  
                        break;  
                    }  
                } catch (NumberFormatException e) {  
                      
                    e.printStackTrace();  
                }  
              
            return menuTo;  
        }  
      
        private static char displayMenu() {  
              
            System.out.println();  
            System.out.println("============================"+  
                    "\nTemperature Conversion"+  
                    "\n=========== MENU ==========="+  
                    "\na. From Celsius"+  
                    "\nb. From Fahrenheit"+  
                    "\nc. From Kelvin"+  
                    "\nx. Exit"+  
                    "\n============================"+  
                    "\nEnter an option:");  
            try {  
                  
                @SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
                
                String menu1 = sc.nextLine(); 
                                
                menu = menu1.charAt(0);  
                
                switch (menu) {  
                case 'a':  
                  
                    break;  
                      
                case 'b':   
                	  
                    break;    
                      
                case 'c':  
                	
                    break;  
                      
                case 'x':  
                    System.out.println("Good bye!!");  
                    System.exit(0);  
                      
                    break;    
                      
                default:  
                    System.out.println("Please enter a valid value");  
                    break;  
                }  
            } catch (NumberFormatException e) {  
                
                e.printStackTrace();  
            }  
            return menu ;  
              
        }  
}  



