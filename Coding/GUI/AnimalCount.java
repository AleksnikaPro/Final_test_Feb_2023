package GUI;

public class AnimalCount implements AutoCloseable{
    boolean isClosed;
    static int variable = 0;

    AnimalCount() {
        isClosed = false;
    }


    public void add() {
        if (isClosed) {
            throw new RuntimeException();
        }
        variable++;
    }

    @Override
    public void close() throws Exception {
        this.isClosed = true;
    }
}