import java.rmi.Naming;

public class ImpressaoCliente
{
	public static boolean argsValid(String[] args)
	{
		boolean tmp = (args.length == 10);
				
		if(tmp)
		{
			for(int i = 0; i < args.length && tmp; i++)
			{
				try
				{
					Integer.parseInt(args[i]);
				}
				
				catch(NumberFormatException e)
				{
					tmp = false;
				}
			}
		}
		
		return tmp;
	}
	
	public static void main(String[] args)
	{
		try
		{
			Impressao imp = (Impressao) Naming.lookup("rmi://192.168.25.7:1099/ImpressaoService");
			
			int[] sequencia = new int[10];
			
			
			if(argsValid(args))
			{
				for(int i = 0; i < args.length; i++)
				{
					sequencia[i] = Integer.parseInt(args[i]);
				}
				
				imp.imprimir(sequencia);				
			}
		}
		
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
