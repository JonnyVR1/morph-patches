package p153l;

import android.os.Build;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes11.dex */
public class af20 {
    /* JADX INFO: renamed from: a */
    public static String m97277a() {
        return TextUtils.join(Constants.SEPARATOR_COMMA, Build.SUPPORTED_ABIS);
    }
}
