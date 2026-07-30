package kotlin.uuid;

import com.clevertap.android.sdk.Constants;
import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.HexExtensionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kotlin.uuid.b */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0010\t\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\u001a3\u0010\b\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\b\u0010\t\u001a#\u0010\f\u001a\u00020\u0007*\u00020\u00012\u0006\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m87232d2 = {"", "", "dst", "", "dstOffset", "startIndex", "endIndex", "", Constants.INAPP_DATA_TAG, "(J[BIII)V", FirebaseAnalytics.Param.INDEX, "value", "e", "([BIJ)V", "kotlin-stdlib"}, m87233k = 5, m87234mv = {2, 2, 0}, m87236xi = 49, m87237xs = "kotlin/uuid/UuidKt")
@SourceDebugExtension
public class C15393b extends C15392a {
    @ExperimentalUuidApi
    /* JADX INFO: renamed from: d */
    public static final void m93598d(long j, @NotNull byte[] bArr, int i, int i2, int i3) {
        bArr.getClass();
        int i4 = 7 - i2;
        int i5 = 8 - i3;
        if (i5 > i4) {
            return;
        }
        while (true) {
            int i6 = HexExtensionsKt.m93339a()[(int) ((j >> (i4 << 3)) & 255)];
            int i7 = i + 1;
            bArr[i] = (byte) (i6 >> 8);
            i += 2;
            bArr[i7] = (byte) i6;
            if (i4 == i5) {
                return;
            } else {
                i4--;
            }
        }
    }

    /* JADX INFO: renamed from: e */
    public static final void m93599e(@NotNull byte[] bArr, int i, long j) {
        bArr.getClass();
        int i2 = 7;
        while (-1 < i2) {
            bArr[i] = (byte) (j >> (i2 << 3));
            i2--;
            i++;
        }
    }
}
