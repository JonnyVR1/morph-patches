package com.cmic.sso.sdk.p016c.p018b;

import java.net.URLEncoder;

/* JADX INFO: renamed from: com.cmic.sso.sdk.c.b.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1342a extends AbstractC1348g {

    /* JADX INFO: renamed from: a */
    protected String f5581a = "";

    /* JADX INFO: renamed from: b */
    protected String f5582b = "";

    /* JADX INFO: renamed from: c */
    protected String f5583c = "";

    /* JADX INFO: renamed from: d */
    protected String f5584d = "";

    /* JADX INFO: renamed from: e */
    protected String f5585e = "";

    /* JADX INFO: renamed from: f */
    protected String f5586f = "";

    /* JADX INFO: renamed from: g */
    protected String f5587g = "";

    /* JADX INFO: renamed from: h */
    protected String f5588h = "";

    /* JADX INFO: renamed from: i */
    protected String f5589i = "";

    /* JADX INFO: renamed from: j */
    protected String f5590j = "0";

    /* JADX INFO: renamed from: k */
    protected String f5591k = "1.0";

    /* JADX INFO: renamed from: l */
    protected String f5592l = "";

    /* JADX INFO: renamed from: m */
    protected String f5593m = "";

    /* JADX INFO: renamed from: n */
    protected String f5594n = "";

    /* JADX INFO: renamed from: o */
    protected String f5595o = "";

    /* JADX INFO: renamed from: p */
    protected String f5596p = "";

    /* JADX INFO: renamed from: q */
    protected String f5597q = "";

    /* JADX INFO: renamed from: r */
    protected String f5598r = "";

    /* JADX INFO: renamed from: s */
    protected String f5599s = "";

    /* JADX INFO: renamed from: t */
    protected String f5600t = "";

    /* JADX INFO: renamed from: u */
    protected String f5601u = "002";

    /* JADX INFO: renamed from: v */
    protected String f5602v = "";

    /* JADX INFO: renamed from: w */
    protected String f5603w = "";

    /* JADX INFO: renamed from: x */
    protected String f5604x = "";

    /* JADX INFO: renamed from: a */
    public void mo7103a(String str) {
        this.f5602v = str;
    }

    /* JADX INFO: renamed from: b */
    public void m7104b(String str) {
        this.f5581a = m7122t(str);
    }

    /* JADX INFO: renamed from: c */
    public void m7105c(String str) {
        this.f5582b = m7122t(str);
    }

    /* JADX INFO: renamed from: d */
    public void m7106d(String str) {
        this.f5583c = m7122t(str);
    }

    /* JADX INFO: renamed from: e */
    public void m7107e(String str) {
        this.f5585e = m7122t(str);
    }

    /* JADX INFO: renamed from: f */
    public void m7108f(String str) {
        this.f5586f = m7122t(str);
    }

    /* JADX INFO: renamed from: g */
    public void m7109g(String str) {
        this.f5587g = URLEncoder.encode(m7122t(str));
    }

    /* JADX INFO: renamed from: h */
    public void m7110h(String str) {
        this.f5588h = URLEncoder.encode(m7122t(str));
    }

    /* JADX INFO: renamed from: i */
    public void m7111i(String str) {
        this.f5589i = URLEncoder.encode(m7122t(str));
    }

    /* JADX INFO: renamed from: j */
    public void m7112j(String str) {
        this.f5590j = m7122t(str);
    }

    /* JADX INFO: renamed from: k */
    public void m7113k(String str) {
        this.f5591k = m7122t(str);
    }

    /* JADX INFO: renamed from: l */
    public void m7114l(String str) {
        this.f5593m = m7122t(str);
    }

    /* JADX INFO: renamed from: m */
    public void m7115m(String str) {
        this.f5594n = m7122t(str);
    }

    /* JADX INFO: renamed from: n */
    public void m7116n(String str) {
        this.f5596p = m7122t(str);
    }

    /* JADX INFO: renamed from: o */
    public void m7117o(String str) {
        this.f5597q = m7122t(str);
    }

    /* JADX INFO: renamed from: p */
    public void m7118p(String str) {
        this.f5598r = m7122t(str);
    }

    /* JADX INFO: renamed from: q */
    public void m7119q(String str) {
        this.f5599s = m7122t(str);
    }

    /* JADX INFO: renamed from: r */
    public void m7120r(String str) {
        this.f5600t = m7122t(str);
    }

    /* JADX INFO: renamed from: s */
    public void m7121s(String str) {
        this.f5603w = str;
    }

    /* JADX INFO: renamed from: t */
    public final String m7122t(String str) {
        return str == null ? "" : str;
    }

    /* JADX INFO: renamed from: u */
    public void m7123u(String str) {
        this.f5604x = str;
    }

    @Override // com.cmic.sso.sdk.p016c.p018b.AbstractC1348g
    /* JADX INFO: renamed from: a */
    public String mo7102a() {
        return this.f5583c;
    }
}
