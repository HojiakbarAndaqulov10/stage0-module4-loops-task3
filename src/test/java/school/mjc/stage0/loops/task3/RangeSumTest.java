package school.mjc.stage0.loops.task3;

import school.mjc.stage0.base.BaseIOTest;
import org.junit.jupiter.api.Test;

class RangeSumTest extends BaseIOTest {

    @Test
    void printSumPrintsSumWhenSecondIsBigger() {
        RangeSum sum = new RangeSum();

        sum.printSumInclusive(0, 10);

        assertOutEquals("55\n");
    }

    @Test
    void printSumPrintsSumWhenEqual() {
        RangeSum sum = new RangeSum();

        sum.printSumInclusive(0, 10);

        assertOutEquals("55\n");
    }

    @Test
    void printSumPrintsSumWhenModulo() {
        RangeSum sum = new RangeSum();

        sum.printSumInclusive(0, 10);

        assertOutEquals("55\n");
    }
}