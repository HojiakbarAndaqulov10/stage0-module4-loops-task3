package school.mjc.stage0.loops.task3;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

class NinesSumTest extends BaseIOTest {

    @Test
    void calculateSumForRowOf5() {
        NinesSum ninesSum = new NinesSum();

        ninesSum.calculateSum(5);

        assertOutEquals("805255\n");
    }

    @Test
    void calculateSumForRowOf6() {
        NinesSum ninesSum = new NinesSum();

        ninesSum.calculateSum(6);

        assertOutEquals("966306\n");
    }

    @Test
    void calculateSumForNegative() {
        NinesSum ninesSum = new NinesSum();

        ninesSum.calculateSum(-6);

        assertOutEquals("-966306\n");
    }

    @Test
    void calculateSumForZero() {
        NinesSum ninesSum = new NinesSum();

        ninesSum.calculateSum(0);

        assertOutEquals("0\n");
    }
}