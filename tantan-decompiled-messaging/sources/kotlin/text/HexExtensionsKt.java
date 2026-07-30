package kotlin.text;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u0010\n\u0002\u0010\u0015\n\u0002\b\b\n\u0002\u0010\u0016\n\u0002\b\u0004\"\u001a\u0010\u0004\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0001\u0010\u0003\"\u0014\u0010\u0006\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0002\"\u0014\u0010\b\u001a\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0002\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\r"}, m87232d2 = {"", "a", "[I", "()[I", "BYTE_TO_LOWER_CASE_HEX_DIGITS", "b", "BYTE_TO_UPPER_CASE_HEX_DIGITS", "c", "HEX_DIGITS_TO_DECIMAL", "", Constants.INAPP_DATA_TAG, "[J", "HEX_DIGITS_TO_LONG_DECIMAL", "kotlin-stdlib"}, m87233k = 2, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class HexExtensionsKt {

    /* JADX INFO: renamed from: a */
    @NotNull
    public static final int[] f66586a;

    /* JADX INFO: renamed from: b */
    @NotNull
    public static final int[] f66587b;

    /* JADX INFO: renamed from: c */
    @NotNull
    public static final int[] f66588c;

    /* JADX INFO: renamed from: d */
    @NotNull
    public static final long[] f66589d;

    static {
        int[] iArr = new int[256];
        int i = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            iArr[i2] = "0123456789abcdef".charAt(i2 & 15) | ("0123456789abcdef".charAt(i2 >> 4) << '\b');
        }
        f66586a = iArr;
        int[] iArr2 = new int[256];
        for (int i3 = 0; i3 < 256; i3++) {
            iArr2[i3] = "0123456789ABCDEF".charAt(i3 & 15) | ("0123456789ABCDEF".charAt(i3 >> 4) << '\b');
        }
        f66587b = iArr2;
        int[] iArr3 = new int[256];
        for (int i4 = 0; i4 < 256; i4++) {
            iArr3[i4] = -1;
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < "0123456789abcdef".length()) {
            iArr3["0123456789abcdef".charAt(i5)] = i6;
            i5++;
            i6++;
        }
        int i7 = 0;
        int i8 = 0;
        while (i7 < "0123456789ABCDEF".length()) {
            iArr3["0123456789ABCDEF".charAt(i7)] = i8;
            i7++;
            i8++;
        }
        f66588c = iArr3;
        long[] jArr = new long[256];
        for (int i9 = 0; i9 < 256; i9++) {
            jArr[i9] = -1;
        }
        int i10 = 0;
        int i11 = 0;
        while (i10 < "0123456789abcdef".length()) {
            jArr["0123456789abcdef".charAt(i10)] = i11;
            i10++;
            i11++;
        }
        int i12 = 0;
        while (i < "0123456789ABCDEF".length()) {
            jArr["0123456789ABCDEF".charAt(i)] = i12;
            i++;
            i12++;
        }
        f66589d = jArr;
    }

    @NotNull
    /* JADX INFO: renamed from: a */
    public static final int[] m93339a() {
        return f66586a;
    }
}
