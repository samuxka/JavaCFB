public class decisao {
    public static void main(String[] args){
        //if, if...else, ?, swich

        //if else
        /*
        int humor = 4;

        if(humor <= 4){
            System.out.println("triste");
        } else if(humor <= 7){
            System.out.println("Mais ou Menos");
        } else{
            System.out.println("feliz");
        }*/

        //operação ternaria (?)
        /*
        int humor = 4;
        String res;

        res = (humor >= 5 ? "feliz" : "triste");
        System.out.print("você está " + res);*/

        //swich
        int pos = 10;

        switch(pos){
            case 1:
                System.out.println("Campeão");
                break;
            case 2:
            System.out.println("Vice-campeão");
                break;
            case 3:
            System.out.println("Terceiro lugar");
                break;
            case 4: case 5:
            System.out.println("Premio de participação");
            break;
            default:
            System.out.println("Não Ganhou nada");
            break;
        }
    }
}
