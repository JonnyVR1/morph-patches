package kotlin.ranges;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.collections.CharIterator;
import kotlin.jvm.internal.Intrinsics;
import p153l.mor;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u000fR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u000f¨\u0006\u0018"}, m88121d2 = {"Lkotlin/ranges/CharProgressionIterator;", "Lkotlin/collections/CharIterator;", "", "first", "last", "", "step", "<init>", "(CCI)V", "", "hasNext", "()Z", "nextChar", "()C", "a", "I", "getStep", "()I", "b", "finalElement", "c", "Z", Constants.INAPP_DATA_TAG, "next", "kotlin-stdlib"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class CharProgressionIterator extends CharIterator {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final int step;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public final int finalElement;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public boolean hasNext;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public int next;

    public CharProgressionIterator(char c, char c2, int i) {
        this.step = i;
        this.finalElement = c2;
        boolean z = false;
        if (i <= 0 ? Intrinsics.m88378e(c, c2) >= 0 : Intrinsics.m88378e(c, c2) <= 0) {
            z = true;
        }
        this.hasNext = z;
        this.next = z ? c : c2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.hasNext;
    }

    @Override // kotlin.collections.CharIterator
    public char nextChar() {
        int i = this.next;
        if (i != this.finalElement) {
            this.next = this.step + i;
        } else {
            if (!this.hasNext) {
                mor.m159308a();
                return (char) 0;
            }
            this.hasNext = false;
        }
        return (char) i;
    }
}
