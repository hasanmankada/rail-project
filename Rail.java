import java.util.Scanner;
class Train{
    String  name;
    int no;
    String [] stations;
    int [] kms;
    int s1=72,s2=72,b1=72,a1=48,h1=24;
    public Train(String name, int no, String[] stations, int[] kms){
        this.name = name;
        this.no = no;
        this.stations = stations;
        this.kms = kms;
    }


}


public class Rail{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        Train[] t= new Train[5];

        String[] stations1 = {"porbandar","rajkot","ahmedabad","vadodara","bharuch","surat","vapi","mumbai"};
        int[] kms1 = {0,216,463,563,633,692,784,954};
        t[0] = new Train("SAURASHTRA EXP",19016,stations1,kms1);

        String[] stations2 = {"jamnagar","rajkot","ahmedabad","surat","panvel","goa"};
        int[] kms2 = {0,92,323,394,576,913};
        t[1] = new Train("GOA EXP",19024,stations2,kms2);

        String[] stations3 ={"howrah","dhanbad","gaya","allahbad","kanpur","tundla","agra","new delhi"};
        int[] kms3 = {0,259,456,642,1013,1243,1306,1451};
        t[2] = new Train("RAJDHANI EXP",12301,stations3,kms3);

        String[] stations4 = {"sabarmati","mehsana","palanpur","abu road","falna","jodhpur"};
        int[] kms4 = {0,63,128,181,279,449};
        t[3] = new Train("vande bharat",12462,stations4,kms4);

        String[] stations5 = {"new delhi","mathura","agra","gwalior","jhasi","bhopal","nagpur"};
        int[] kms5 = {0,141,195,313,403,707,1061};
        t[4] = new Train("shatabdi",12002,stations5,kms5);

        System.out.println("Enter the start point");
        String startpoint = sc.nextLine();

        System.out.println("Enter the end point");
        String Endpoint = sc.nextLine();

        System.out.println("Enter the coach class\n\tS->Sleeper\n\tB->AC 3 Tier\n\tA->AC 2 Tier\n\tH->AC 1 Tier");
        String coachClass = sc.nextLine();

        System.out.println("Enter no of passengers");
        int noOfPassenger = sc.nextInt();

           for(int i=0;i<t.length;i++)
           {

                int startIndex = -1;
                int endIndex = -1;
                for(int j=0;j<t[i].stations.length;j++)
                {
                    if(startIndex==-1 && t[i].stations[j].equals(startpoint)){
                    startIndex = j;
                    }
                    if(startIndex!=-1 && t[i].stations[j].equals(Endpoint)){
                        endIndex = j;
                        break;
                    }
                }
                
                if(endIndex>-1){
                    if(coachClass.equals("S")&& t[i].s1>=noOfPassenger){
                        System.out.println(" --------Train Available --------");
                        System.out.println("Train Name: "+t[i].name+" "+t[i].no);
                    }
                    if(coachClass.equals("B")&& t[i].b1>=noOfPassenger){
                        System.out.println(" --------Train Available --------");
                        System.out.println("Train Name: "+t[i].name+" "+t[i].no);
                    }
                    if(coachClass.equals("A")&& t[i].a1>=noOfPassenger){
                        System.out.println(" --------Train Available --------");
                        System.out.println("Train Name: "+t[i].name+" "+t[i].no);
                    }
                    if(coachClass.equals("H")&& t[i].h1>=noOfPassenger){
                        System.out.println(" --------Train Available --------");
                        System.out.println("Train Name: "+t[i].name+" "+t[i].no);
                    }
                    else{
                        System.out.println(" --------Train Not Available --------");
                    }
                }

        }
    }
}
        
    
