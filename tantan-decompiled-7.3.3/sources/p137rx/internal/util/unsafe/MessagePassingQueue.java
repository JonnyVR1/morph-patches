package p137rx.internal.util.unsafe;

/* JADX INFO: loaded from: classes3.dex */
public interface MessagePassingQueue<M> {
    boolean isEmpty();

    boolean offer(M m);

    M peek();

    M poll();

    int size();
}
