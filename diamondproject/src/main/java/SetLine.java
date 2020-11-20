
public class SetLine {

	public static void main(String[] args) {
		register();
	}
	
	
	public static void register() {
		for(int p=1; p<34; p++) {
			for(int l=1; l<4; l++) {
				addLine(p, l);
			}
		}
	}
	
	public static void addLine(int p, int l) {
		//int r=(pi-1)*li+li;
		String field=("P"+Integer.toString(p))+("L"+Integer.toString(setFieldIndex(p, l,3))+" -REV");
		System.out.println(field);
	}
	
	private static int setFieldIndex(int p, int l, int linePerPage) {
		int lineNumber=0;
		if(p==1) {
		lineNumber=l;
	}else {
		lineNumber=((p*linePerPage)+l-linePerPage);
		
	}
	return lineNumber;
}
}