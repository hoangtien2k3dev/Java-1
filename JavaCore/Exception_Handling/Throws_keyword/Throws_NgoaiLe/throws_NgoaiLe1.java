package JavaCore.Exception_Handling.Throws_keyword.Throws_NgoaiLe;

import java.io.IOException;

class Mount {
    void method() throws IOException {
        throw new IOException("Thiet bi");
    }
}

public class throws_NgoaiLe1 {
    public static void main(String args[]) throws IOException {
        Mount m = new Mount();
        m.method();
        System.out.println("Luong binh thuong...");
    }
}
