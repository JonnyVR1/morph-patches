package p149l;

import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes6.dex */
public class mv00 {

    /* JADX INFO: renamed from: a */
    protected String[] f135859a;

    /* JADX INFO: renamed from: b */
    protected int f135860b = 0;

    /* JADX INFO: renamed from: a */
    public void m156461a(int i, String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String[] strArr = this.f135859a;
        if (i >= strArr.length) {
            return;
        }
        strArr[i] = str;
    }

    public String toString() {
        String[] strArr = this.f135859a;
        if (strArr == null) {
            return "";
        }
        if (this.f135860b == 0) {
            this.f135860b = strArr.length;
        }
        String strConcat = "{";
        int i = 0;
        for (int i2 = 0; i2 < this.f135860b; i2++) {
            if (i != 0) {
                strConcat = strConcat.concat(Constants.SEPARATOR_COMMA);
            }
            i++;
            strConcat = strConcat + this.f135859a[i2];
        }
        return strConcat.concat("}");
    }
}
