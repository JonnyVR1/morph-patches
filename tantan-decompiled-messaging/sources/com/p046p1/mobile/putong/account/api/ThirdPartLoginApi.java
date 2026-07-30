package com.p046p1.mobile.putong.account.api;

import android.content.Context;
import com.p046p1.mobile.putong.account.AccountModule;
import com.p046p1.mobile.putong.account.data.ThirdPartVetify;
import com.p046p1.mobile.putong.account.data.WeChatToken;
import com.p046p1.mobile.putong.account.data.WeChatUserInfo;
import p133rx.C22306c;
import p133rx.subjects.C22393b;
import p149l.hpd0;

/* JADX INFO: loaded from: classes9.dex */
public class ThirdPartLoginApi extends C4576b {

    /* JADX INFO: renamed from: h */
    public static hpd0 f16319h = new hpd0("has_report_mobile_number", Boolean.FALSE);

    /* JADX INFO: renamed from: g */
    public C22393b<C4574a> f16320g = C22393b.m221521b();

    public enum ReportMobileSource {
        landing_page,
        wechat_login,
        dau
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.api.ThirdPartLoginApi$a */
    public static class C4574a {

        /* JADX INFO: renamed from: a */
        public int f16321a;

        /* JADX INFO: renamed from: b */
        public int f16322b;

        /* JADX INFO: renamed from: c */
        public String f16323c;
    }

    /* JADX INFO: renamed from: g */
    public C22306c<WeChatToken> m28179g(String str) {
        return AccountModule.f16038d.f183285c.m219339e(str).compose(C4576b.m28376f());
    }

    /* JADX INFO: renamed from: h */
    public void m28180h(Context context, ReportMobileSource reportMobileSource, String str) {
    }

    /* JADX INFO: renamed from: i */
    public C22306c<C4574a> m28181i() {
        return this.f16320g;
    }

    /* JADX INFO: renamed from: j */
    public void m28182j(C4574a c4574a) {
        this.f16320g.m132487l(c4574a);
    }

    /* JADX INFO: renamed from: k */
    public void m28183k(int i, String str) {
        C4574a c4574a = new C4574a();
        c4574a.f16322b = i;
        c4574a.f16323c = str;
        c4574a.f16321a = 1;
        AccountModule.f16039e.m28182j(c4574a);
    }

    /* JADX INFO: renamed from: l */
    public C22306c<WeChatUserInfo> m28184l(String str, String str2) {
        return AccountModule.f16038d.f183285c.m219340f(str2, str).compose(C4576b.m28376f());
    }

    /* JADX INFO: renamed from: m */
    public C22306c<ThirdPartVetify> m28185m(String str, String str2, boolean z) {
        return AccountModule.f16038d.f183285c.m219345l(str, str2, z).compose(C4576b.m28376f());
    }
}
