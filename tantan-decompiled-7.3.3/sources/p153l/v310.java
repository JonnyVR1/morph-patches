package p153l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes8.dex */
public class v310 {

    /* JADX INFO: renamed from: a */
    protected String[] f182148a;

    /* JADX INFO: renamed from: b */
    protected int f182149b = 0;

    /* JADX INFO: renamed from: a */
    public void m199181a(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String[] strArr = this.f182148a;
        if (i >= strArr.length) {
            return;
        }
        strArr[i] = str;
    }

    public String toString() {
        String[] strArr = this.f182148a;
        if (strArr == null) {
            return "";
        }
        if (this.f182149b == 0) {
            this.f182149b = strArr.length;
        }
        String strConcat = "{";
        int i = 0;
        for (int i2 = 0; i2 < this.f182149b; i2++) {
            if (i != 0) {
                strConcat = strConcat.concat(Constants.SEPARATOR_COMMA);
            }
            i++;
            strConcat = strConcat + this.f182148a[i2];
        }
        return strConcat.concat("}");
    }
}
