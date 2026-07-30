package p149l;

import android.os.Build;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes13.dex */
public class s620 {
    /* JADX INFO: renamed from: a */
    public static String m182406a() {
        return TextUtils.join(Constants.SEPARATOR_COMMA, Build.SUPPORTED_ABIS);
    }
}
