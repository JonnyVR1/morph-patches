package com.cmic.sso.sdk.p017c.p021d;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.d.a */
/* JADX INFO: loaded from: classes.dex */
public class C1379a {

    /* JADX INFO: renamed from: a */
    private int f5697a;

    /* JADX INFO: renamed from: b */
    private String f5698b;

    private C1379a(int i, String str) {
        this.f5697a = i;
        this.f5698b = str;
    }

    /* JADX INFO: renamed from: a */
    public static C1379a m7236a(int i) {
        switch (i) {
            case 102102:
                return new C1379a(102102, "网络异常");
            case 102223:
                return new C1379a(102223, "数据解析异常");
            case 102508:
                return new C1379a(102508, "数据网络切换失败");
            case 200025:
                return new C1379a(200025, "登录超时");
            case 200039:
                return new C1379a(200039, "电信取号接口失败");
            case 200050:
                return new C1379a(200050, "EOF异常");
            default:
                return new C1379a(i, "网络异常");
        }
    }

    /* JADX INFO: renamed from: b */
    public String m7238b() {
        return this.f5698b;
    }

    /* JADX INFO: renamed from: a */
    public int m7237a() {
        return this.f5697a;
    }
}
