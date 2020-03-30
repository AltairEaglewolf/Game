package com.example.detective;

public class Level1 {
    private Story start_level1;
    public Story current_level1;

    Level1(){
        start_level1 = new Story("Чаепитие мёртвых", "У входа в театр вас встретил диретор этого здания",2);
    }

    public void go(int num) {
        if (num <= current_level1.direction.length)
            current_level1 = current_level1.direction[num - 1];
        else
            System.out.println("Вы можете выбирать из "
                    + current_level1.direction.length + " вариантов");
    }

    public boolean isEnd() {
        return current_level1.direction.length == 0;
    }
}
