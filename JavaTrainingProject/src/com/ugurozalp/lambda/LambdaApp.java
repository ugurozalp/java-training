package com.ugurozalp.lambda;

public class LambdaApp {

    // Örnek 2 (2) gibi
    public int fonk(int a, int b, Anonim anonim) {
        return anonim.call(a, b) * 2; // anonim iş birimi burada koşturuluyor (2)
    };

    public static void main(String[] args) {
        LambdaApp app = new LambdaApp();

        // Örnek 2 (1) gibi
        app.fonk(2, 3, new Anonim() { // Anonim iş birimi burada tanımlanıyor (1)
            @Override
            public int call(int a, int b) {
                return a + b;
            }
        });
        
        app.fonk(2, 3, (a, b) -> a + b); // Dikkat (1)
    }
}