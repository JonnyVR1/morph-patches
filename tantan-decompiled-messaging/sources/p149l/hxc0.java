package p149l;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes7.dex */
public class hxc0 {

    /* JADX INFO: renamed from: a */
    public int f109844a;

    /* JADX INFO: renamed from: b */
    public int f109845b;

    /* JADX INFO: renamed from: c */
    public String f109846c;

    /* JADX INFO: renamed from: d */
    public String f109847d;

    /* JADX INFO: renamed from: e */
    public String f109848e;

    /* JADX INFO: renamed from: f */
    public long f109849f;

    /* JADX INFO: renamed from: g */
    public String f109850g;

    /* JADX INFO: renamed from: a */
    public static hxc0 m133320a(String str) {
        int iIndexOf = str.indexOf(58);
        String strSubstring = "";
        if (-1 != iIndexOf) {
            String strSubstring2 = str.substring(0, iIndexOf);
            strSubstring = iIndexOf < str.length() ? str.substring(iIndexOf + 1) : "";
            str = strSubstring2;
        }
        String[] strArrSplit = TextUtils.split(str, Pattern.quote("|"));
        if (strArrSplit.length < 6) {
            ig3.m135964a("Wrong number of fields.");
            return null;
        }
        hxc0 hxc0Var = new hxc0();
        hxc0Var.f109850g = strSubstring;
        hxc0Var.f109844a = Integer.parseInt(strArrSplit[0]);
        hxc0Var.f109845b = Integer.parseInt(strArrSplit[1]);
        hxc0Var.f109846c = strArrSplit[2];
        hxc0Var.f109847d = strArrSplit[3];
        hxc0Var.f109848e = strArrSplit[4];
        hxc0Var.f109849f = Long.parseLong(strArrSplit[5]);
        return hxc0Var;
    }

    public String toString() {
        return TextUtils.join("|", new Object[]{Integer.valueOf(this.f109844a), Integer.valueOf(this.f109845b), this.f109846c, this.f109847d, this.f109848e, Long.valueOf(this.f109849f)});
    }
}
