class CPU{
    double price;
    RAM obj1;
    Processor obj2;
    CPU(double p,String rmemory,String rmanufacturer,String pmanufacturer,int pcores){
        price=p;
        obj1=new RAM(rmemory,rmanufacturer);
        obj2=new Processor(pcores,pmanufacturer);
    }
    class Processor{
        int pcores;
        String pmanufacturer;
        Processor(int pcores,String pmanufacturer){
            this.pcores=pcores;
            this.pmanufacturer=pmanufacturer;
        }
        void pdisplay(){
            System.out.println("Processor Core = "+pcores);
            System.out.println("Processor manufacturer = "+pmanufacturer);
        }
    }
    static class RAM{
        String rmemory;
        String rmanufacturer;
        RAM(String rmemory, String rmanufacturer){
            this.rmemory=rmemory;
            this.rmanufacturer=rmanufacturer;
        }
        void rdisplay(){
            System.out.println("RAM Memory = "+rmemory);
            System.out.println("RAM manufacturer = "+rmanufacturer);
        }
    }
    void display(){
        System.out.println("CPU Price = "+price);
        obj1.rdisplay();
        obj2.pdisplay();
    }

    public static void main(String args[]) {
        CPU c=new CPU(9000,"8 GB","Kingston","Intel",4);
        c.display();

    }
}