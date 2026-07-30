package p153l;

import com.clevertap.android.sdk.Constants;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.SinceKotlin;
import kotlin.UInt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.markers.KMappedMarker;

/* JADX INFO: loaded from: classes2.dex */
@SinceKotlin
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000eR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0014\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u000e¨\u0006\u0015"}, m88121d2 = {"Ll/opj0;", "", "Lkotlin/UInt;", "first", "last", "", "step", "<init>", "(IIILkotlin/jvm/internal/DefaultConstructorMarker;)V", "", "hasNext", "()Z", "a", "()I", "I", "finalElement", "b", "Z", "c", Constants.INAPP_DATA_TAG, "next", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class opj0 implements Iterator<UInt>, KMappedMarker {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int finalElement;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public boolean hasNext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int step;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int next;

    public opj0(int i, int i2, int i3) {
        this.finalElement = i2;
        boolean z = false;
        int iCompare = Integer.compare(i ^ Integer.MIN_VALUE, i2 ^ Integer.MIN_VALUE);
        if (i3 <= 0 ? iCompare >= 0 : iCompare <= 0) {
            z = true;
        }
        this.hasNext = z;
        this.step = UInt.m88154b(i3);
        this.next = this.hasNext ? i : i2;
    }

    /* JADX INFO: renamed from: a */
    public int m168678a() {
        int i = this.next;
        if (i != this.finalElement) {
            this.next = UInt.m88154b(this.step + i);
            return i;
        }
        if (this.hasNext) {
            this.hasNext = false;
            return i;
        }
        mor.m159308a();
        return 0;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // java.util.Iterator
    public /* bridge */ /* synthetic */ UInt next() {
        return UInt.m88153a(m168678a());
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public /* synthetic */ opj0(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, i3);
    }
}
