import java.util.Arrays;

public class gear2 {



        public static void selection() {
            double gear[] = new double[200];

            for(int i=1;i<=200;i++)
                gear[i-1]=i;

            //System.out.println(Arrays.toString(gear));
            int count = 0;
            double one;
            double two;
            double three;
            double four;
            double input=1800;

            for (int i = 0; i < gear.length; i++) {
                one=gear[i];
                two=200-one;
                for (int k=0;k<gear.length;k++){
                    three=gear[k];
                    four=200-three;
                    double result=((one*three)/(two*four))*input;
                    //System.out.println(result);
                    if ((result>=150)&&(result<=170)){
                        if((one+two)==(three+four)){
                            if((one+two)<=400){

                                double input_p=60*745.7;
                                double speedIn=1800*2*Math.PI/60;
                                count++;
                                double temp_one=one/1000;
                                double temp_two=two/1000;
                                double temp_three=three/1000;
                                double temp_four=four/1000;
                                double T1=input_p/speedIn;
                                double F1=T1/temp_one;
                                double F2=F1;
                                double T2=F2*temp_two;
                                double T3=T2;
                                double F3=T3/temp_three;
                                double F4=F3;
                                double T4=F4*temp_four;
                                //double powerOut=T4*result*2*Math.PI/60;

                                System.out.println(count+".");
                                System.out.println("Gear Ratio: "+((one*three)/(two*four)));
                                System.out.println("Gear Radius: one: "+one+"m, two: "+two+"m, three: "+three+"m, four: "+four+"m");
                                System.out.println("Output RPM: "+result+"RPM");
                                System.out.println("F1=F2="+F1+"N ,F3=F4="+F3+"N");
                                System.out.println("T1="+T1+"N*mm ,T2=T3="+T2*two/one+"N*mm ,T4="+T4+"N*mm");
                                //System.out.println(input_p+" "+powerOut);
                                System.out.println("");
                            }
                        }
                    }
                }
            }

        }


        public static void main(String[] args) {
            selection();
        }
    }



