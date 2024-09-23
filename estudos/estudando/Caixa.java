public class Caixa<T> {
    ArrayList<T> caixinha = new ArrayList<>();
    private T item;

    public ArrayList<T> getCaixinha() {
        return caixinha;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}