package p153l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes4.dex */
public class frq {

    /* JADX INFO: renamed from: a */
    public String f100451a;

    /* JADX INFO: renamed from: b */
    public String f100452b;

    /* JADX INFO: renamed from: c */
    public String f100453c;

    public frq(String str, String str2, String str3) {
        this.f100451a = str;
        this.f100452b = str2;
        this.f100453c = str3;
    }

    /* JADX INFO: renamed from: a */
    public String m126948a() {
        return this.f100452b;
    }

    /* JADX INFO: renamed from: b */
    public boolean m126949b() {
        return TextUtils.equals(this.f100451a, "show");
    }

    /* JADX INFO: renamed from: c */
    public boolean m126950c() {
        return TextUtils.isEmpty(this.f100452b) || this.f100452b.equals("0");
    }
}
