package p014rx.internal.util.unsafe;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public interface MessagePassingQueue<M> {
    boolean isEmpty();

    boolean offer(M m);

    M peek();

    M poll();

    int size();
}
