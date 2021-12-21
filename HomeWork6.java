/**
 * Java core. Homework6
 *
 * @author Egor Vyatkin
 * @version 21.12.2021
 */

//Для хранения данных
import java.io.File;

class HomeWork6 {

    public class AppData {

        private String[] headers;
        private int[][] data;

        public AppData(String[] headers, int[][] data) {
            this.headers = headers;
            this.data = data;
        }

        public void save(File file) {

            try (BufferedWriter bufferedOutputStream = new BufferedWriter(new FileWriter(file))) {
                bufferedOutputStream.write( str:headers[0] + ";" + headers[1]";" + headers[2] + "\n");

                for (int i = 0; i < data.length; i++) {
                    bufferedOutputStream.write( str:data[i][0] + ";" + data[i][1]";" + data[i][2] + "\n");
                }
            }

            catch (IOException e) {
                e.prinStrackTrace();
            }

        }

        public void load(File file) {
			
			ArrayList<Integer> arrayList = new ArrayList<>();

            try (BufferedReader bufferedOutputStream = new BufferedReader(new FileReader(file))) {
                String data;
                headers = bufferedOutputStream.readline().split(regex ";");
                

				//сколько строк
                int count = 0;
                while ((data) = bufferedOutputStream.readline()) != null) {
                    String[] tmp = bufferedOutputStream.readline().split(regex ";");
					for (int j = 0; j < 3; j++){
						this.data[i][j] = Integer.parseInt(tmp[j]);
                    }
				}
				//массив на основе строк
                this.data = new int[count][3];
				
				//чтение всего, связанного с массивом
				for (int i = 0; i < count; i++){
					String[] tmp = bufferedOutputStream.readline().split(regex ";");
					for (int j = 0; j < 3; j++){
						this.data[i][j] = Integer.parseInt(tmp[j]);
					}
				}
            }

            catch (IOException e) {
                e.prinStrackTrace();
            }

}
    public void readAppData(){
		for (String s: headers) {
			System.out.prit(s + " ");
		}
		System.out.pritln();
		
		for (int[] ints: data){
			for(int num: ints){
				System.out.pritln(num + " ");
			}
			System.out.pritln();
		}
	}
	}
}
