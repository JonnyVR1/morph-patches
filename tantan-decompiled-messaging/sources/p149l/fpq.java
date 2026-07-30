package p149l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class fpq {

    /* JADX INFO: renamed from: a */
    public String f98731a;

    /* JADX INFO: renamed from: b */
    public String f98732b;

    /* JADX INFO: renamed from: c */
    public String f98733c;

    public fpq(String str, String str2, String str3) {
        this.f98731a = str;
        this.f98732b = str2;
        this.f98733c = str3;
    }

    /* JADX INFO: renamed from: a */
    public String m122622a() {
        return this.f98732b;
    }

    /* JADX INFO: renamed from: b */
    public boolean m122623b() {
        return TextUtils.equals(this.f98731a, "show");
    }

    /* JADX INFO: renamed from: c */
    public boolean m122624c() {
        return TextUtils.isEmpty(this.f98732b) || this.f98732b.equals("0");
    }
}
