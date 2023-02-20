package lab1.task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import lab1.task3.entities.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ModelTest {
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    void CornerTest(){
        Entity[] ents = new Entity[] {new They(), new ComputerBank()};
        Corner cor = new Corner(ents);
        cor.enterTheCorner(new They());
        cor.enterTheCorner(new MoltenMetal());
        assertEquals("Они добавлен в угол" + System.lineSeparator() +
                "В углу:" + System.lineSeparator() +
                "Они" + System.lineSeparator() +
                "Компьютерный банк" + System.lineSeparator() +
                "Они" + System.lineSeparator() +
                "Раскаленный металл добавлен в угол" + System.lineSeparator() +
                "В углу:" + System.lineSeparator() +
                "Они" + System.lineSeparator() +
                "Компьютерный банк" + System.lineSeparator() +
                "Они" + System.lineSeparator() +
                "Раскаленный металл" + System.lineSeparator() +
                "Они решили cгрудиться плотнее и ждать конца" + System.lineSeparator() +
                "Они решили cгрудиться плотнее и ждать конца", outputStreamCaptor.toString().trim());
    }

    @Test
    void SurroundingsTest()
    {
        Surroundings sur = new Surroundings();
        sur.addToCornerEntity(new FrontSide("коробки"));
        sur.addToCornerEntity(new ComputerBank());
        String[] strs = new String[] {"Эффект1", "Эффект2"};
        sur.setEffects(strs);
        assertEquals("Лицевая сторона коробки добавлен в угол" + System.lineSeparator() +
                "В углу:" + System.lineSeparator() +
                "Лицевая сторона коробки" + System.lineSeparator() +
                "Компьютерный банк добавлен в угол" + System.lineSeparator() +
                "В углу:" + System.lineSeparator() +
                "Лицевая сторона коробки" + System.lineSeparator() +
                "Компьютерный банк" + System.lineSeparator() +
                "Вокруг эффект1" + System.lineSeparator() +
                "Вокруг эффект2", outputStreamCaptor.toString().trim());
    }

    @Test
    void BombingTest()
    {
        Surroundings surroundings = new Surroundings();
        ComputerBank computerBank = new ComputerBank();
        Bombing bombing = new Bombing(surroundings);
        bombing.giveDamage(computerBank, 15);
        computerBank.printLife();
        assertEquals("Началась Бомбардировка" + System.lineSeparator() +
                "Вокруг невообразимый жар" + System.lineSeparator() +
                "Вокруг невообразимый шум" + System.lineSeparator() +
                "Состояние Компьютерный банк = 85%", outputStreamCaptor.toString().trim());
    }

    @Test
    void MetalMeltingTest()
    {
        Surroundings surroundings = new Surroundings();
        ComputerBank computerBank = new ComputerBank();
        Bombing bombing = new Bombing(surroundings);
        bombing.giveDamage(computerBank, 30);
        computerBank.printLife();
        assertEquals("Началась Бомбардировка" + System.lineSeparator() +
                "Вокруг невообразимый жар" + System.lineSeparator() +
                "Вокруг невообразимый шум" + System.lineSeparator() +
                "Лицевая сторона компьютерного банка почти вся оплавилась" + System.lineSeparator() +
                "Компьютерный банк разваливается на куски" + System.lineSeparator() +
                "Раскаленный металл добавлен в угол" + System.lineSeparator() +
                "В углу:" + System.lineSeparator() +
                "Раскаленный металл" + System.lineSeparator() +
                "Состояние Компьютерный банк = 70%", outputStreamCaptor.toString().trim());
    }

    @Test
    void WholeStoryTest()
    {
        Surroundings surroundings = new Surroundings();
        surroundings.addToCornerEntity(new They());
        ComputerBank computerBank = new ComputerBank();
        Bombing bombing = new Bombing(surroundings);
        bombing.giveDamage(computerBank, 30);
        assertEquals("Они добавлен в угол" + System.lineSeparator() +
                "В углу:" + System.lineSeparator() +
                "Они" + System.lineSeparator() +
                "Началась Бомбардировка" + System.lineSeparator() +
                "Вокруг невообразимый жар" + System.lineSeparator() +
                "Вокруг невообразимый шум" + System.lineSeparator() +
                "Лицевая сторона компьютерного банка почти вся оплавилась" + System.lineSeparator() +
                "Компьютерный банк разваливается на куски" + System.lineSeparator() +
                "Раскаленный металл добавлен в угол" + System.lineSeparator() +
                "В углу:" + System.lineSeparator() +
                "Они" + System.lineSeparator() +
                "Раскаленный металл" + System.lineSeparator() +
                "Они решили cгрудиться плотнее и ждать конца", outputStreamCaptor.toString().trim());
    }
}
