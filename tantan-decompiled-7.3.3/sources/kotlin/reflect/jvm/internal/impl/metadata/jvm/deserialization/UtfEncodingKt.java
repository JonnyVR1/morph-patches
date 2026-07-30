package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension
public final class UtfEncodingKt {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final byte[] m91922a(@NotNull String[] strArr) {
        strArr.getClass();
        int length = 0;
        for (String str : strArr) {
            length += str.length();
        }
        byte[] bArr = new byte[length];
        int i = 0;
        for (String str2 : strArr) {
            int length2 = str2.length();
            int i2 = 0;
            while (i2 < length2) {
                bArr[i] = (byte) str2.charAt(i2);
                i2++;
                i++;
            }
        }
        return bArr;
    }
}
