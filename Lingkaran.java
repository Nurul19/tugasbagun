public class lingkaran {
	private int jari;
	private double luasLink;
	private double kelLink;

	public lingkaran(int r){
		jari = r;
	}

	public void CetakLingkaran(){
		System.out.println("=== LINGKARAN ===");
		System.out.println("Jari-Jari lingkaran = " +jari);
	}

	public void HitungLingkaran(){
		luasLink = Math.PI*jari*jari;
		System.out.println("Luas Lingkaran : 3,14 X jari-jari X jari-jari = " +luasLink);

		kelLink = Math.PI*(jari+jari);
		System.out.println("Kelililng Lingkaran : 3,14 X Diameter = " +kelLink);
	}
}