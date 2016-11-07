import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class ImpressaoServer 
{
	ImpressaoServer()
	{
		try
		{
			LocateRegistry.createRegistry(1099);
			Impressao i = new ImpressaoImpl();
			Naming.rebind("rmi://192.168.25.7:1099/ImpressaoService", i);
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args)
	{
		new ImpressaoServer();
	}
}
