package p153l;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public final class brx {

    /* JADX INFO: renamed from: a */
    private String f78066a = "";

    /* JADX INFO: renamed from: b */
    private String f78067b = "";

    /* JADX INFO: renamed from: c */
    private String f78068c = "";

    /* JADX INFO: renamed from: d */
    private String f78069d = "";

    /* JADX INFO: renamed from: e */
    private int f78070e = 0;

    /* JADX INFO: renamed from: f */
    private int f78071f = 0;

    /* JADX INFO: renamed from: g */
    private String f78072g = "";

    /* JADX INFO: renamed from: h */
    private String f78073h = "";

    /* JADX INFO: renamed from: i */
    private String f78074i = "";

    /* JADX INFO: renamed from: j */
    private String f78075j = "";

    /* JADX INFO: renamed from: k */
    private boolean f78076k = true;

    /* JADX INFO: renamed from: a */
    public String m106169a() {
        return this.f78075j;
    }

    /* JADX INFO: renamed from: b */
    public String m106170b() {
        return this.f78067b;
    }

    /* JADX INFO: renamed from: c */
    public int m106171c() {
        return this.f78071f;
    }

    /* JADX INFO: renamed from: d */
    public arx.InterfaceC15812b m106172d() {
        return null;
    }

    /* JADX INFO: renamed from: e */
    public String m106173e() {
        return this.f78074i;
    }

    /* JADX INFO: renamed from: f */
    public int m106174f() {
        return this.f78070e;
    }

    /* JADX INFO: renamed from: g */
    public boolean m106175g() {
        return this.f78076k;
    }

    /* JADX INFO: renamed from: h */
    public String m106176h() {
        return this.f78069d;
    }

    /* JADX INFO: renamed from: i */
    public String m106177i() {
        return this.f78068c;
    }

    /* JADX INFO: renamed from: j */
    public String m106178j() {
        return this.f78072g;
    }

    /* JADX INFO: renamed from: k */
    public String m106179k() {
        return this.f78066a;
    }

    /* JADX INFO: renamed from: l */
    public void m106180l() {
        esx.m122399d("MediaCfgParams", "appid: " + this.f78067b);
        esx.m122399d("MediaCfgParams", "secretKey: " + this.f78068c);
        esx.m122399d("MediaCfgParams", "userid: " + this.f78066a);
        esx.m122399d("MediaCfgParams", "roomid: " + this.f78069d);
        esx.m122399d("MediaCfgParams", "provider: " + this.f78070e);
        esx.m122399d("MediaCfgParams", "businessType: " + this.f78071f);
        esx.m122399d("MediaCfgParams", "appVer: " + this.f78075j);
        esx.m122399d("MediaCfgParams", "patch: " + this.f78074i);
    }

    /* JADX INFO: renamed from: m */
    public String m106181m() {
        return "(id:" + this.f78067b + ",key:" + this.f78068c + ",userid:" + this.f78066a + ",roomid:" + this.f78069d + ",provider:" + this.f78070e + ",bType:" + this.f78071f + ",ver:" + this.f78075j + ",patch:" + this.f78074i + ")";
    }

    /* JADX INFO: renamed from: n */
    public void m106182n(String str) {
        this.f78075j = str;
    }

    /* JADX INFO: renamed from: o */
    public void m106183o(String str) {
        this.f78067b = str;
    }

    /* JADX INFO: renamed from: p */
    public void m106184p(int i) {
        this.f78071f = i;
    }

    /* JADX INFO: renamed from: q */
    public void m106185q(String str) {
        this.f78074i = str;
    }

    /* JADX INFO: renamed from: r */
    public void m106186r(int i) {
        this.f78070e = i;
    }

    /* JADX INFO: renamed from: s */
    public void m106187s(String str) {
        esx.m122399d("MediaCfgParams", "roomid = " + str);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        this.f78069d = str;
    }

    /* JADX INFO: renamed from: t */
    public void m106188t(String str) {
        this.f78068c = str;
    }

    public String toString() {
        return "MediaCfgParams{userid='" + this.f78066a + "', appid='" + this.f78067b + "', roomid='" + this.f78069d + "', provider=" + this.f78070e + ", businessType=" + this.f78071f + ", servicetype='" + this.f78072g + "', sdkVersion='" + this.f78073h + "', patch='" + this.f78074i + "', appVer='" + this.f78075j + "'}";
    }

    /* JADX INFO: renamed from: u */
    public void m106189u(String str) {
        this.f78066a = str;
    }
}
