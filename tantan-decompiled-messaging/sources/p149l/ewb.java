package p149l;

import android.util.Base64;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000\f\n\u0002\u0010\u0012\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m87232d2 = {"", "", "b", "([B)Ljava/lang/String;", "a", "(Ljava/lang/String;)[B", "clevertap-core_release"}, m87233k = 2, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class ewb {
    @NotNull
    /* JADX INFO: renamed from: a */
    public static final byte[] m118462a(@NotNull String str) {
        str.getClass();
        byte[] bArrDecode = Base64.decode(str, 2);
        bArrDecode.getClass();
        return bArrDecode;
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public static final String m118463b(@NotNull byte[] bArr) {
        bArr.getClass();
        String strEncodeToString = Base64.encodeToString(bArr, 2);
        strEncodeToString.getClass();
        return strEncodeToString;
    }
}
