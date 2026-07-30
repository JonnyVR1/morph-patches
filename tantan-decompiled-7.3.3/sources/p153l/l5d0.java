package p153l;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class l5d0 {

    /* JADX INFO: renamed from: a */
    public int f130096a;

    /* JADX INFO: renamed from: b */
    public int f130097b;

    /* JADX INFO: renamed from: c */
    public String f130098c;

    /* JADX INFO: renamed from: d */
    public String f130099d;

    /* JADX INFO: renamed from: e */
    public String f130100e;

    /* JADX INFO: renamed from: f */
    public long f130101f;

    /* JADX INFO: renamed from: g */
    public String f130102g;

    /* JADX INFO: renamed from: a */
    public static l5d0 m152931a(String str) {
        int iIndexOf = str.indexOf(58);
        String strSubstring = "";
        if (-1 != iIndexOf) {
            String strSubstring2 = str.substring(0, iIndexOf);
            strSubstring = iIndexOf < str.length() ? str.substring(iIndexOf + 1) : "";
            str = strSubstring2;
        }
        String[] strArrSplit = TextUtils.split(str, Pattern.quote("|"));
        if (strArrSplit.length < 6) {
            wg3.m206174a("Wrong number of fields.");
            return null;
        }
        l5d0 l5d0Var = new l5d0();
        l5d0Var.f130102g = strSubstring;
        l5d0Var.f130096a = Integer.parseInt(strArrSplit[0]);
        l5d0Var.f130097b = Integer.parseInt(strArrSplit[1]);
        l5d0Var.f130098c = strArrSplit[2];
        l5d0Var.f130099d = strArrSplit[3];
        l5d0Var.f130100e = strArrSplit[4];
        l5d0Var.f130101f = Long.parseLong(strArrSplit[5]);
        return l5d0Var;
    }

    public String toString() {
        return TextUtils.join("|", new Object[]{Integer.valueOf(this.f130096a), Integer.valueOf(this.f130097b), this.f130098c, this.f130099d, this.f130100e, Long.valueOf(this.f130101f)});
    }
}
