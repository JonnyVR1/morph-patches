package p149l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class eix {

    /* JADX INFO: renamed from: a */
    private String f91642a = "";

    /* JADX INFO: renamed from: b */
    private String f91643b = "";

    /* JADX INFO: renamed from: c */
    private String f91644c = "";

    /* JADX INFO: renamed from: d */
    private String f91645d = "";

    /* JADX INFO: renamed from: e */
    private int f91646e = 0;

    /* JADX INFO: renamed from: f */
    private int f91647f = 0;

    /* JADX INFO: renamed from: g */
    private String f91648g = "";

    /* JADX INFO: renamed from: h */
    private String f91649h = "";

    /* JADX INFO: renamed from: i */
    private String f91650i = "";

    /* JADX INFO: renamed from: j */
    private String f91651j = "";

    /* JADX INFO: renamed from: k */
    private boolean f91652k = true;

    /* JADX INFO: renamed from: a */
    public String m116725a() {
        return this.f91651j;
    }

    /* JADX INFO: renamed from: b */
    public String m116726b() {
        return this.f91643b;
    }

    /* JADX INFO: renamed from: c */
    public int m116727c() {
        return this.f91647f;
    }

    /* JADX INFO: renamed from: d */
    public dix.InterfaceC16385b m116728d() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public String m116729e() {
        return this.f91650i;
    }

    /* JADX INFO: renamed from: f */
    public int m116730f() {
        return this.f91646e;
    }

    /* JADX INFO: renamed from: g */
    public boolean m116731g() {
        return this.f91652k;
    }

    /* JADX INFO: renamed from: h */
    public String m116732h() {
        return this.f91645d;
    }

    /* JADX INFO: renamed from: i */
    public String m116733i() {
        return this.f91644c;
    }

    /* JADX INFO: renamed from: j */
    public String m116734j() {
        return this.f91648g;
    }

    /* JADX INFO: renamed from: k */
    public String m116735k() {
        return this.f91642a;
    }

    /* JADX INFO: renamed from: l */
    public void m116736l() {
        hjx.m131421d("MediaCfgParams", "appid: " + this.f91643b);
        hjx.m131421d("MediaCfgParams", "secretKey: " + this.f91644c);
        hjx.m131421d("MediaCfgParams", "userid: " + this.f91642a);
        hjx.m131421d("MediaCfgParams", "roomid: " + this.f91645d);
        hjx.m131421d("MediaCfgParams", "provider: " + this.f91646e);
        hjx.m131421d("MediaCfgParams", "businessType: " + this.f91647f);
        hjx.m131421d("MediaCfgParams", "appVer: " + this.f91651j);
        hjx.m131421d("MediaCfgParams", "patch: " + this.f91650i);
    }

    /* JADX INFO: renamed from: m */
    public String m116737m() {
        return "(id:" + this.f91643b + ",key:" + this.f91644c + ",userid:" + this.f91642a + ",roomid:" + this.f91645d + ",provider:" + this.f91646e + ",bType:" + this.f91647f + ",ver:" + this.f91651j + ",patch:" + this.f91650i + ")";
    }

    /* JADX INFO: renamed from: n */
    public void m116738n(String str) {
        this.f91651j = str;
    }

    /* JADX INFO: renamed from: o */
    public void m116739o(String str) {
        this.f91643b = str;
    }

    /* JADX INFO: renamed from: p */
    public void m116740p(int i) {
        this.f91647f = i;
    }

    /* JADX INFO: renamed from: q */
    public void m116741q(String str) {
        this.f91650i = str;
    }

    /* JADX INFO: renamed from: r */
    public void m116742r(int i) {
        this.f91646e = i;
    }

    /* JADX INFO: renamed from: s */
    public void m116743s(String str) {
        hjx.m131421d("MediaCfgParams", "roomid = " + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f91645d = str;
    }

    /* JADX INFO: renamed from: t */
    public void m116744t(String str) {
        this.f91644c = str;
    }

    public String toString() {
        return "MediaCfgParams{userid='" + this.f91642a + "', appid='" + this.f91643b + "', roomid='" + this.f91645d + "', provider=" + this.f91646e + ", businessType=" + this.f91647f + ", servicetype='" + this.f91648g + "', sdkVersion='" + this.f91649h + "', patch='" + this.f91650i + "', appVer='" + this.f91651j + "'}";
    }

    /* JADX INFO: renamed from: u */
    public void m116745u(String str) {
        this.f91642a = str;
    }
}
