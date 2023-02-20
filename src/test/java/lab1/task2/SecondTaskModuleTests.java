package lab1.task2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SecondTaskModuleTests {

    static BinomialHeap binHeap;

    //2d tests

    @Test
    void Insertable(){
        binHeap = new BinomialHeap();
        binHeap.insert(12);
        assertEquals(binHeap.getSize(), 1);
        assertArrayEquals(binHeap.getArray(), new int[]{12});
    }

    @Nested
    public class Insertable{

        @BeforeEach
        void initEach(){
            binHeap = new BinomialHeap();
            binHeap.insert(12);
            binHeap.insert(8);
            binHeap.insert(5);
            binHeap.insert(15);
            binHeap.insert(7);
        }

        @Test
        void HeapSortedAndGettable(){
            assertArrayEquals(binHeap.getArray(), new int[]{7, 12, 8, 15, 5});
        }

        @Test
        void SizeCorrect(){
            assertEquals(binHeap.getSize(), 5);
        }

        @Test
        void Clearable(){
            binHeap.makeEmpty();
            assertEquals(binHeap.getSize(), 0);
            assertArrayEquals(binHeap.getArray(), new int[]{});
        }

        @Test
        void FindMinTest(){
            assertEquals(binHeap.findMinimum(), 5);
        }

        @Test
        void Deletable(){
            binHeap.delete(8);
            assertArrayEquals(binHeap.getArray(), new int[]{15, 7, 12, 5});
        }

        @Test
        void DecreaseWithoutMerge(){
            binHeap.decreaseKeyValue(15, 9);
            assertArrayEquals(binHeap.getArray(), new int[]{7, 12, 8, 9, 5});
        }

        @Test
        void DecreaseWithMerge(){
            binHeap.decreaseKeyValue(12, 7);
            assertArrayEquals(binHeap.getArray(), new int[]{7, 8, 7, 15, 5});
        }

        @Test
        void MinExtractableInTree(){
            binHeap.extractMin();
            assertArrayEquals(binHeap.getArray(), new int[]{12, 8, 15, 7});
        }

        @Test
        void MinExtractableWithoutTree(){
            binHeap = new BinomialHeap();
            binHeap.insert(12);
            binHeap.insert(8);
            binHeap.insert(7);

            binHeap.extractMin();
            assertArrayEquals(binHeap.getArray(), new int[]{12, 8});
        }

        @Test
        void MinExtractableEmpty(){
            binHeap = new BinomialHeap();

            binHeap.extractMin();
            assertArrayEquals(binHeap.getArray(), new int[]{});
        }

        @Test
        void MinExtractableSolo(){
            binHeap = new BinomialHeap();
            binHeap.insert(12);

            binHeap.extractMin();
            assertArrayEquals(binHeap.getArray(), new int[]{});
        }

        @Test
        void sameNumbers(){
            binHeap = new BinomialHeap();
            binHeap.insert(7);
            binHeap.insert(7);
            binHeap.insert(7);
            binHeap.insert(7);
            binHeap.insert(7);
            assertArrayEquals(binHeap.getArray(), new int[]{7, 7, 7, 7, 7});
        }

        @Test
        void degreeTest(){
            binHeap.insert(8);
            binHeap.insert(6);

//            binHeap.insert(6);

//            assertArrayEquals(binHeap.getArray(), new int[]{12, 8, 15, 5, 8, 7, 6, 3});
//            assertArrayEquals(binHeap.getArray(), new int[]{8, 7, 6, 6, 12, 8, 15, 5});

//            binHeap.extractMin();
//            assertArrayEquals(binHeap.getArray(), new int[]{15, 12, 8, 8, 7, 6, 6});

            binHeap.insert(4);
            assertArrayEquals(binHeap.getArray(), new int[]{12, 8, 15, 5, 8, 7, 6, 4});

            binHeap.extractMin();
            assertArrayEquals(binHeap.getArray(), new int[]{6, 8, 7, 12, 8, 15, 5});

        }

        @Test
        void decreaseNoExistKey(){
            binHeap.decreaseKeyValue(20, 7);
            assertArrayEquals(binHeap.getArray(), new int[]{7, 12, 8, 15, 5});
        }

        @Test
        void deleteNoExistKey(){
            binHeap.delete(20);
            assertArrayEquals(binHeap.getArray(), new int[]{7, 12, 8, 15, 5});
        }
    }


}
