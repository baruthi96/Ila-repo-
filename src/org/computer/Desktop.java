package org.computer;

public class Desktop implements Hardware,Software{

	@Override
	public void softwareResources() {
		System.out.println("Software resources: Windows 10 pro, MS office.");
	}

	@Override
	public void hardwareResources() {
		System.out.println("Hardware resources:Core intel i5 3rd gen,8GB RAM,1TB HDD.");
	}
    private void desktopModel() {
		System.out.println("DesktopModel:Dell Optiplex");
	}
    public static void main(String[] args) {
		Desktop ds= new Desktop();
		ds.desktopModel();
		ds.hardwareResources();
		ds.softwareResources();
	}
}
