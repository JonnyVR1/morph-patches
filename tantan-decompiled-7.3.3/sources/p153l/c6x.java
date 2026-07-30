package p153l;

import android.graphics.Bitmap;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\u0003J\u001a\u0010\f\u001a\u00020\u000b2\b\u0010\n\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u0006R0\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R0\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015\"\u0004\b\u001a\u0010\u0017R\u0016\u0010\u001d\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\u001cR.\u0010$\u001a\u0004\u0018\u00010\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010 \u001a\u0004\b\u0012\u0010!\"\u0004\b\"\u0010#¨\u0006%"}, m88121d2 = {"Ll/c6x;", "", "<init>", "()V", "", "c", "()I", "g", "", "e", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "Lkotlin/Pair;", "Ll/mi80;", "Ll/iuc0;", "a", "Lkotlin/Pair;", Constants.INAPP_DATA_TAG, "()Lkotlin/Pair;", "setMaskTexPair", "(Lkotlin/Pair;)V", "maskTexPair", "b", "setMaskPositionPair", "maskPositionPair", "I", "maskTexId", "Landroid/graphics/Bitmap;", "value", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "f", "(Landroid/graphics/Bitmap;)V", "alphaMaskBitmap", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class c6x {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public Pair<mi80, iuc0> maskTexPair;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Pair<mi80, iuc0> maskPositionPair;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public int maskTexId;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public Bitmap alphaMaskBitmap;

    @Nullable
    /* JADX INFO: renamed from: a, reason: from getter */
    public final Bitmap getAlphaMaskBitmap() {
        return this.alphaMaskBitmap;
    }

    @Nullable
    /* JADX INFO: renamed from: b */
    public final Pair<mi80, iuc0> m108188b() {
        return this.maskPositionPair;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getMaskTexId() {
        return this.maskTexId;
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public final Pair<mi80, iuc0> m108190d() {
        return this.maskTexPair;
    }

    /* JADX INFO: renamed from: e */
    public final void m108191e() {
        m108192f(null);
        this.maskTexPair = null;
        this.maskPositionPair = null;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof c6x)) {
            return false;
        }
        c6x c6xVar = (c6x) other;
        if (Intrinsics.m88377d(this.alphaMaskBitmap, c6xVar.alphaMaskBitmap)) {
            return false;
        }
        Pair<mi80, iuc0> pair = this.maskTexPair;
        mi80 first = pair != null ? pair.getFirst() : null;
        Pair<mi80, iuc0> pair2 = c6xVar.maskTexPair;
        if (Intrinsics.m88377d(first, pair2 != null ? pair2.getFirst() : null)) {
            return false;
        }
        Pair<mi80, iuc0> pair3 = this.maskTexPair;
        iuc0 second = pair3 != null ? pair3.getSecond() : null;
        Pair<mi80, iuc0> pair4 = c6xVar.maskTexPair;
        if (Intrinsics.m88377d(second, pair4 != null ? pair4.getSecond() : null)) {
            return false;
        }
        Pair<mi80, iuc0> pair5 = this.maskPositionPair;
        mi80 first2 = pair5 != null ? pair5.getFirst() : null;
        Pair<mi80, iuc0> pair6 = c6xVar.maskPositionPair;
        if (Intrinsics.m88377d(first2, pair6 != null ? pair6.getFirst() : null)) {
            return false;
        }
        Pair<mi80, iuc0> pair7 = this.maskPositionPair;
        iuc0 second2 = pair7 != null ? pair7.getSecond() : null;
        Pair<mi80, iuc0> pair8 = c6xVar.maskPositionPair;
        return !Intrinsics.m88377d(second2, pair8 != null ? pair8.getSecond() : null);
    }

    /* JADX INFO: renamed from: f */
    public final void m108192f(Bitmap bitmap) {
        this.alphaMaskBitmap = bitmap;
    }

    /* JADX INFO: renamed from: g */
    public final int m108193g() {
        int iM192670a = tti0.INSTANCE.m192670a(this.alphaMaskBitmap);
        this.maskTexId = iM192670a;
        return iM192670a;
    }

    public int hashCode() {
        Bitmap bitmap = this.alphaMaskBitmap;
        int iHashCode = (bitmap != null ? bitmap.hashCode() : 0) * 31;
        Pair<mi80, iuc0> pair = this.maskTexPair;
        int iHashCode2 = (iHashCode + (pair != null ? pair.hashCode() : 0)) * 31;
        Pair<mi80, iuc0> pair2 = this.maskPositionPair;
        return iHashCode2 + (pair2 != null ? pair2.hashCode() : 0);
    }
}
