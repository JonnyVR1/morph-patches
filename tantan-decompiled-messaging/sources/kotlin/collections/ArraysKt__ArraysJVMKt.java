package kotlin.collections;

import com.p046p1.mobile.putong.feed.data.Reference;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.PublishedApi;
import kotlin.SinceKotlin;
import kotlin.internal.InlineOnly;
import kotlin.jvm.JvmName;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.j6f;
import p149l.s0g0;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u00002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\u001a,\u0010\u0000\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u0001H\u0086\b¢\u0006\u0002\u0010\u0003\u001a\u0015\u0010\u0004\u001a\u00020\u0005*\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0087\b\u001a&\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0006\b\u0000\u0010\u0002\u0018\u0001*\b\u0012\u0004\u0012\u0002H\u00020\nH\u0086\b¢\u0006\u0002\u0010\u000b\u001a/\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0000¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0001\u001a#\u0010\u0014\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0002*\f\u0012\u0006\b\u0001\u0012\u0002H\u0002\u0018\u00010\u0001H\u0001¢\u0006\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m87232d2 = {"orEmpty", "", j6f.GPS_DIRECTION_TRUE, "([Ljava/lang/Object;)[Ljava/lang/Object;", "toString", "", "", "charset", "Ljava/nio/charset/Charset;", "toTypedArray", "", "(Ljava/util/Collection;)[Ljava/lang/Object;", "arrayOfNulls", Reference.TYPE, "size", "", "([Ljava/lang/Object;I)[Ljava/lang/Object;", "copyOfRangeToIndexCheck", "", "toIndex", "contentDeepHashCodeImpl", "contentDeepHashCode", "([Ljava/lang/Object;)I", "kotlin-stdlib"}, m87233k = 5, m87234mv = {2, 2, 0}, m87236xi = 49, m87237xs = "kotlin/collections/ArraysKt")
public class ArraysKt__ArraysJVMKt {
    @NotNull
    public static final <T> T[] arrayOfNulls(@NotNull T[] tArr, int i) {
        tArr.getClass();
        Object objNewInstance = Array.newInstance(tArr.getClass().getComponentType(), i);
        objNewInstance.getClass();
        return (T[]) ((Object[]) objNewInstance);
    }

    @SinceKotlin
    @PublishedApi
    @JvmName
    public static <T> int contentDeepHashCode(@Nullable T[] tArr) {
        return Arrays.deepHashCode(tArr);
    }

    @SinceKotlin
    public static final void copyOfRangeToIndexCheck(int i, int i2) {
        if (i <= i2) {
            return;
        }
        s0g0.m181862a("toIndex (", i, ") is greater than size (", i2);
    }

    public static final /* synthetic */ <T> T[] orEmpty(T[] tArr) {
        if (tArr != null) {
            return tArr;
        }
        Intrinsics.m87493i(0, j6f.GPS_DIRECTION_TRUE);
        return (T[]) new Object[0];
    }

    @InlineOnly
    private static final String toString(byte[] bArr, Charset charset) {
        bArr.getClass();
        charset.getClass();
        return new String(bArr, charset);
    }

    public static final /* synthetic */ <T> T[] toTypedArray(Collection<? extends T> collection) {
        collection.getClass();
        Intrinsics.m87493i(0, "T?");
        return (T[]) collection.toArray(new Object[0]);
    }
}
