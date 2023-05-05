package main;

public class Audio extends ElementoMultimediale implements Volume{
	
	private int volume;
	private int durata;
	
	
	
	public Audio(String title, int volume, int durata) {
		super(title);
		this.volume = volume;
		this.durata = durata;
		
	}
	
	
	public int alzaVolume() {
		return volume++;
	}
	public int abbassaVolume() {
		return volume--;
	}


	@Override
	public void play() {
		for (int i = 0; i < durata; i++) {
			System.out.print(title);
            for (int j = 0; j < volume; j++) {
                System.out.print(" ! ");
            }
            System.out.println();
        }
	}


}
