package OOP_part01;

public class Tablet {

	// TODO - Object Attributes
	private String name;
	private String deviceBody;
	private float screenSize;
	private int memoryRAM;;
	private int memoryROM;
	private int camera;
	
	
	// Another way of instantiating our Object - {Constructor}
	public Tablet (String name, String deviceBody, float screenSize, int memoryRAM, int memoryROM, int camera) {
			this.name = name;
			this.deviceBody = deviceBody;
			this.screenSize = screenSize;
			this.memoryRAM = memoryRAM;
			this.memoryROM = memoryROM;
			this.camera = camera;
	}
	
	
}


