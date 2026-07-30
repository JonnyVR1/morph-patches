package kotlin.jvm.internal;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.collections.BooleanIterator;
import kotlin.collections.ByteIterator;
import kotlin.collections.CharIterator;
import kotlin.collections.DoubleIterator;
import kotlin.collections.FloatIterator;
import kotlin.collections.IntIterator;
import kotlin.collections.LongIterator;
import kotlin.collections.ShortIterator;
import org.jetbrains.annotations.NotNull;
import p153l.c01;
import p153l.d01;
import p153l.e01;
import p153l.f01;
import p153l.h01;
import p153l.i01;
import p153l.k01;
import p153l.q01;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m88120d1 = {"\u0000b\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0013\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0018\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f\u001a\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0015\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0001\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0001\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0001\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0015\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0001\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 ¨\u0006!"}, m88121d2 = {"", "array", "Lkotlin/collections/ByteIterator;", "b", "([B)Lkotlin/collections/ByteIterator;", "", "Lkotlin/collections/CharIterator;", "c", "([C)Lkotlin/collections/CharIterator;", "", "Lkotlin/collections/ShortIterator;", "h", "([S)Lkotlin/collections/ShortIterator;", "", "Lkotlin/collections/IntIterator;", "f", "([I)Lkotlin/collections/IntIterator;", "", "Lkotlin/collections/LongIterator;", "g", "([J)Lkotlin/collections/LongIterator;", "", "Lkotlin/collections/FloatIterator;", "e", "([F)Lkotlin/collections/FloatIterator;", "", "Lkotlin/collections/DoubleIterator;", Constants.INAPP_DATA_TAG, "([D)Lkotlin/collections/DoubleIterator;", "", "Lkotlin/collections/BooleanIterator;", "a", "([Z)Lkotlin/collections/BooleanIterator;", "kotlin-stdlib"}, m88122k = 2, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class ArrayIteratorsKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final BooleanIterator m88346a(@NotNull boolean[] zArr) {
        zArr.getClass();
        return new c01(zArr);
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final ByteIterator m88347b(@NotNull byte[] bArr) {
        bArr.getClass();
        return new d01(bArr);
    }

    @NotNull
    /* JADX INFO: renamed from: c */
    public static final CharIterator m88348c(@NotNull char[] cArr) {
        cArr.getClass();
        return new e01(cArr);
    }

    @NotNull
    /* JADX INFO: renamed from: d */
    public static final DoubleIterator m88349d(@NotNull double[] dArr) {
        dArr.getClass();
        return new f01(dArr);
    }

    @NotNull
    /* JADX INFO: renamed from: e */
    public static final FloatIterator m88350e(@NotNull float[] fArr) {
        fArr.getClass();
        return new h01(fArr);
    }

    @NotNull
    /* JADX INFO: renamed from: f */
    public static final IntIterator m88351f(@NotNull int[] iArr) {
        iArr.getClass();
        return new i01(iArr);
    }

    @NotNull
    /* JADX INFO: renamed from: g */
    public static final LongIterator m88352g(@NotNull long[] jArr) {
        jArr.getClass();
        return new k01(jArr);
    }

    @NotNull
    /* JADX INFO: renamed from: h */
    public static final ShortIterator m88353h(@NotNull short[] sArr) {
        sArr.getClass();
        return new q01(sArr);
    }
}
