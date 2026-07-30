package p149l;

import com.clevertap.android.sdk.Constants;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.ULong;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m87231d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e¨\u0006\u0015"}, m87232d2 = {"Ll/mgj0;", "", "Lkotlin/ULong;", "first", "last", "", "step", "<init>", "(JJJLkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "hasNext", "()Z", "a", "()J", "J", "finalElement", "b", "Z", "c", Constants.INAPP_DATA_TAG, "next", "kotlin-stdlib"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class mgj0 implements Iterator<ULong>, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final long finalElement;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean hasNext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final long step;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public long next;

    public mgj0(long j, long j2, long j3) {
        this.finalElement = j2;
        boolean z = false;
        if (j3 <= 0 ? Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) >= 0 : Long.compare(j ^ Long.MIN_VALUE, j2 ^ Long.MIN_VALUE) <= 0) {
            z = true;
        }
        this.hasNext = z;
        this.step = ULong.m87288b(j3);
        this.next = this.hasNext ? j : j2;
    }

    /* JADX INFO: renamed from: a */
    public long m154568a() {
        long j = this.next;
        if (j != this.finalElement) {
            this.next = ULong.m87288b(this.step + j);
            return j;
        }
        if (this.hasNext) {
            this.hasNext = false;
            return j;
        }
        lmr.m150601a();
        return 0L;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ ULong next() {
        return ULong.m87287a(m154568a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ mgj0(long j, long j2, long j3, DefaultConstructorMarker defaultConstructorMarker) {
        this(j, j2, j3);
    }
}
