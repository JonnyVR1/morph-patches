package p153l;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class y0g0 {

    /* JADX INFO: renamed from: a */
    public final int f196970a;

    /* JADX INFO: renamed from: b */
    public final int f196971b;

    /* JADX INFO: renamed from: c */
    public final int f196972c;

    /* JADX INFO: renamed from: d */
    public final int f196973d;

    /* JADX INFO: renamed from: e */
    public final int f196974e;

    public y0g0(int i, int i2, int i3, int i4, int i5) {
        this.f196970a = i;
        this.f196971b = i2;
        this.f196972c = i3;
        this.f196973d = i4;
        this.f196974e = i5;
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public static y0g0 m213848a(String str) {
        w11.m204365a(str.startsWith("Format:"));
        String[] strArrSplit = TextUtils.split(str.substring(7), Constants.SEPARATOR_COMMA);
        int i = -1;
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        for (int i5 = 0; i5 < strArrSplit.length; i5++) {
            String strM138051e = i11.m138051e(strArrSplit[i5].trim());
            strM138051e.getClass();
            switch (strM138051e) {
                case "end":
                    i2 = i5;
                    break;
                case "text":
                    i4 = i5;
                    break;
                case "start":
                    i = i5;
                    break;
                case "style":
                    i3 = i5;
                    break;
            }
        }
        if (i == -1 || i2 == -1 || i4 == -1) {
            return null;
        }
        return new y0g0(i, i2, i3, i4, strArrSplit.length);
    }
}
