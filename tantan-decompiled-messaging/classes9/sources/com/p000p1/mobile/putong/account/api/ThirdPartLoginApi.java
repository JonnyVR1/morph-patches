package com.p000p1.mobile.putong.account.api;

import android.content.Context;
import com.p000p1.mobile.putong.account.AccountModule;
import com.p000p1.mobile.putong.account.data.ThirdPartVetify;
import com.p000p1.mobile.putong.account.data.WeChatToken;
import com.p000p1.mobile.putong.account.data.WeChatUserInfo;
import l.hpd0;
import rx.c;
import rx.subjects.b;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class ThirdPartLoginApi extends C0002b {

    /* JADX INFO: renamed from: h */
    public static hpd0 f308h = new hpd0("has_report_mobile_number", Boolean.FALSE);

    /* JADX INFO: renamed from: g */
    public b<C0000a> f309g = b.b();

    public enum ReportMobileSource {
        landing_page,
        wechat_login,
        dau
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.api.ThirdPartLoginApi$a */
    public static class C0000a {

        /* JADX INFO: renamed from: a */
        public int f310a;

        /* JADX INFO: renamed from: b */
        public int f311b;

        /* JADX INFO: renamed from: c */
        public String f312c;
    }

    /* JADX INFO: renamed from: g */
    public c<WeChatToken> m74g(String str) {
        return AccountModule.f27d.f24491c.m28733e(str).compose(C0002b.m271f());
    }

    /* JADX INFO: renamed from: h */
    public void m75h(Context context, ReportMobileSource reportMobileSource, String str) {
    }

    /* JADX INFO: renamed from: i */
    public c<C0000a> m76i() {
        return this.f309g;
    }

    /* JADX INFO: renamed from: j */
    public void m77j(C0000a c0000a) {
        this.f309g.onNext(c0000a);
    }

    /* JADX INFO: renamed from: k */
    public void m78k(int i, String str) {
        C0000a c0000a = new C0000a();
        c0000a.f311b = i;
        c0000a.f312c = str;
        c0000a.f310a = 1;
        AccountModule.f28e.m77j(c0000a);
    }

    /* JADX INFO: renamed from: l */
    public c<WeChatUserInfo> m79l(String str, String str2) {
        return AccountModule.f27d.f24491c.m28734f(str2, str).compose(C0002b.m271f());
    }

    /* JADX INFO: renamed from: m */
    public c<ThirdPartVetify> m80m(String str, String str2, boolean z) {
        return AccountModule.f27d.f24491c.m28739l(str, str2, z).compose(C0002b.m271f());
    }
}
