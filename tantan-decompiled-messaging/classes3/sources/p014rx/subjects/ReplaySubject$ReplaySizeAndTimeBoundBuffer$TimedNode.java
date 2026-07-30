package p014rx.subjects;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
final class ReplaySubject$ReplaySizeAndTimeBoundBuffer$TimedNode<T> extends AtomicReference<ReplaySubject$ReplaySizeAndTimeBoundBuffer$TimedNode<T>> {
    private static final long serialVersionUID = 3713592843205853725L;
    final long timestamp;
    final T value;

    public ReplaySubject$ReplaySizeAndTimeBoundBuffer$TimedNode(T t, long j) {
        this.value = t;
        this.timestamp = j;
    }
}
