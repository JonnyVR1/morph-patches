package p002l;

import android.text.TextUtils;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fpq {

    /* JADX INFO: renamed from: a */
    public String f10592a;

    /* JADX INFO: renamed from: b */
    public String f10593b;

    /* JADX INFO: renamed from: c */
    public String f10594c;

    public fpq(String str, String str2, String str3) {
        this.f10592a = str;
        this.f10593b = str2;
        this.f10594c = str3;
    }

    /* JADX INFO: renamed from: a */
    public String m13454a() {
        return this.f10593b;
    }

    /* JADX INFO: renamed from: b */
    public boolean m13455b() {
        return TextUtils.equals(this.f10592a, "show");
    }

    /* JADX INFO: renamed from: c */
    public boolean m13456c() {
        return TextUtils.isEmpty(this.f10593b) || this.f10593b.equals("0");
    }
}
