package AfterFour;

import java.util.Arrays;
import java.util.Collection;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class Lesson6_HWTasc1Test {
    private static AfterFour dz;

    @Before
    public void prepare() {
        dz = new AfterFour();
    }

    @Test(expected = RuntimeException.class)
    public void test_task1_empty_array() {
        dz.СheckingFours(new int[0]);
    }

    @Test(expected = RuntimeException.class)
    public void test_task1_without_4() {
        dz.СheckingFours(new int[]{1, 2, 3});
    }

    @RunWith(Parameterized.class)
    public static class ParamTask1 {


        @Before
        public void prepare() {
            dz = new AfterFour();
        }

        private int[] input;
        private int[] result;

        @Parameterized.Parameters
        public static Collection<int[][]> data() {
            return Arrays.asList(new int[][][] {
                    {

                            new int[]{7, 15, 32, 55, 4, 56, 8, 73, 99},
                            new int[]{56, 8, 73, 99},
                    },
                    {
                            new int[]{7, 15, 32, 55, 4, 56, 8, 73, 99, 4},
                            new int[]{},
                    },
                    {
                            new int[]{7, 15, 32, 55, 56, 8, 73, 4},
                            new int[]{},
                    },
                    {
                            new int[]{11, 4, 82, 4},
                            new int[]{},
                    },
                    {
                            new int[]{6, 4, 9, 15},
                            new int[]{9, 15},
                    }
            });
        }

        public ParamTask1( int[] input, int[] result){
            this.input = input;
            this.result = result;
        }

        @Test
        public void test () {
            Assert.assertArrayEquals(result, dz.СheckingFours(input));
        }
    }
}
