import java.io.*;

 class WriteLines {
   public WriteLines(String filename) throws IOException {
        PrintWriter output = new PrintWriter(new FileWriter(filename));
        
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Inserisci le linee di testo (lascia vuoto per terminare):");
        String linea = input.readLine();
        
        while (!linea.equals("")) {
            output.println(linea);
            linea = input.readLine();
        }
        
        input.close();
        output.close();
    }

    public static void main(String[] args) {
        try {
            new WriteLines("output.txt");
            System.out.println("Scrittura completata su output.txt");
        } catch (IOException e) {
            System.out.println("Si è verificato un errore: " + e.getMessage());
        }
    }
}