package kotlin.ranges;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.collections.LongIterator;
import p153l.mor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\fR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u000e¨\u0006\u0016"}, m88121d2 = {"Lkotlin/ranges/LongProgressionIterator;", "Lkotlin/collections/LongIterator;", "", "first", "last", "step", "<init>", "(JJJ)V", "", "hasNext", "()Z", "nextLong", "()J", "a", "J", "getStep", "b", "finalElement", "c", "Z", Constants.INAPP_DATA_TAG, "next", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class LongProgressionIterator extends LongIterator {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long step;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final long finalElement;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean hasNext;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long next;

    public LongProgressionIterator(long j, long j2, long j3) {
        this.step = j3;
        this.finalElement = j2;
        boolean z = false;
        if (j3 <= 0 ? j >= j2 : j <= j2) {
            z = true;
        }
        this.hasNext = z;
        this.next = z ? j : j2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // kotlin.collections.LongIterator
    public long nextLong() {
        long j = this.next;
        if (j != this.finalElement) {
            this.next = this.step + j;
            return j;
        }
        if (this.hasNext) {
            this.hasNext = false;
            return j;
        }
        mor.m159308a();
        return 0L;
    }
}
