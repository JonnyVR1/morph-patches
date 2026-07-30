package kotlin.sequences;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.markers.KMappedMarker;
import p149l.lmr;

/* JADX INFO: Add missing generic type declarations: [T] */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0015\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0010\u0010\u0002\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0096\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, m87232d2 = {"kotlin/sequences/SequencesKt__SequencesKt$sequenceOf$1$1", "", "next", "()Ljava/lang/Object;", "", "hasNext", "()Z", "a", "Z", "_hasNext", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class SequencesKt__SequencesKt$sequenceOf$1$1<T> implements Iterator<T>, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public boolean _hasNext = true;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ T f66527b;

    public SequencesKt__SequencesKt$sequenceOf$1$1(T t) {
        this.f66527b = t;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this._hasNext;
    }

    @Override // java.util.Iterator
    public T next() {
        if (this._hasNext) {
            this._hasNext = false;
            return this.f66527b;
        }
        lmr.m150601a();
        return null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
