
public class main {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(new File("sample.in"));
		int cities = scan.nextInt();
		scan.nextLine();
		
		for(int x = 0; x<cities; x++) {
			int m = scan.nextInt();
			scan.nextLine();
		
			graph g = new graph(m);
			
			int r = scan.nextInt();
			scan.nextLine();
			
			for(int i = 0; i<r; i++) {
				g.addEdge(scan.nextInt(), scan.nextInt());
			}
			
		}
	}
}
