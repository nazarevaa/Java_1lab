public class ArrayList <T> {

        private int length;
        private int last;
        private Object[] array;
        private static final double NEW_SIZE_MULTIPLICITY = 2;
        private static final int DEFAULT_SIZE = 16;

        ArrayList ( ) {
                this.last = -1;
                this.length = DEFAULT_SIZE;
                this.array = new Object[ length ];

        }

        void add ( T elemet ) {
                if (this.last + 1 > (this.length - 1)) {
                        this.length *= NEW_SIZE_MULTIPLICITY;
                        this.array = Arrays.copyOf(this.array, this.length);
                        this.last++;
                } else {
                        this.last++;
                        this.array[last] = elemet;
                }

        }


        public int capacity ( ) {
                return this.last;
        }

        T getByIndex ( int index ) {
                if ( index > this.last )
                        throw new IndexOutOfBoundsException ( );
                return (T) this.array[ index ];
        }

        void remove ( int index ) {
                if ( index > this.last )
                        throw new IndexOutOfBoundsException ( );
                if ( last - index >= 0 ) System.arraycopy ( array, index + 1, array, index, last - index );
                this.last--;
        }

    }
