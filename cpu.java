class cpu
{
double price;
public cpu(double price)
{
this.price=price;
}
class processor
{
int cores;
String manufacture;
processor(int cores,String manufacture)
{
this.cores=cores;
this.manufacture=manufacture;
}
void display_processor_info()
{
System.out.println("Processor or cores:" + cores);
System.out.println("Processor Manufacture:" + manufacture);
}
}
static class RAM
{
int size;
String type;
RAM(int size, String type)
{
this.size=size;
this.type=type;
}
void displays_RAM_info()
{
System.out.println("RAM size:" + size + "GB");
System.out.println("RAM type:" + type);
}
}
void display_cpu_info()
{
    System.out.println("CPU price: $" + price);
}
public static void main (String[] args)
{
    cpu myCpu=new cpu (250.00);
    cpu.processor myprocessor = myCpu.new processor(8,"intel");
    cpu.RAM myRAM = new cpu.RAM(16,"DDR4");
    myCpu.display_cpu_info();
    myprocessor.display_processor_info();
    myRAM.displays_RAM_info();
}
}



