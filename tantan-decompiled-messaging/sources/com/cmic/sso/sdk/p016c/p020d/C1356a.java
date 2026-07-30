package com.cmic.sso.sdk.p016c.p020d;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.d.a */
/* JADX INFO: loaded from: classes.dex */
public class C1356a {

    /* JADX INFO: renamed from: a */
    private int f5660a;

    /* JADX INFO: renamed from: b */
    private String f5661b;

    private C1356a(int i, String str) {
        this.f5660a = i;
        this.f5661b = str;
    }

    /* JADX INFO: renamed from: a */
    public static C1356a m7182a(int i) {
        switch (i) {
            case 102102:
                return new C1356a(102102, "网络异常");
            case 102223:
                return new C1356a(102223, "数据解析异常");
            case 102508:
                return new C1356a(102508, "数据网络切换失败");
            case 200025:
                return new C1356a(200025, "登录超时");
            case 200039:
                return new C1356a(200039, "电信取号接口失败");
            case 200050:
                return new C1356a(200050, "EOF异常");
            default:
                return new C1356a(i, "网络异常");
        }
    }

    /* JADX INFO: renamed from: b */
    public String m7184b() {
        return this.f5661b;
    }

    /* JADX INFO: renamed from: a */
    public int m7183a() {
        return this.f5660a;
    }
}
