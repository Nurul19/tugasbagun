public class Testsemua {
	public static void main(String[] args) {
		segitiga sgt = new segitiga(2, 6, 8);
		sgt.CetakSegitiga();
		System.out.println("");
		sgt.HitungSegitiga();

		System.out.println();
		System.out.println();

		lingkaran lnk = new lingkaran(7);
		lnk.CetakLingkaran();
		System.out.println("");
		lnk.HitungLingkaran();
	}
}