import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ImpressaoImpl extends UnicastRemoteObject implements Impressao
{
	private static final long serialVersionUID = 1L;

	public ImpressaoImpl() throws RemoteException
	{
		super();
	}
	
	public synchronized boolean imprimir(int[] sequencia) throws RemoteException
	{
		if(sequencia.length > 0)
		{
			for(int i = 0; i < sequencia.length; i++)
			{
				System.out.println(sequencia[i]);
				
				try
				{
					Thread.sleep(500);
				}
				
				catch(InterruptedException e)
				{
					
				}
			}
			
			return true;
		}
		
		return false;
	}
}
