import java.rmi.RemoteException;

public interface Impressao extends java.rmi.Remote
{
	  public boolean imprimir(int[] sequencia) throws RemoteException;
}
