package com.p051p1.mobile.putong.account.api;

import android.content.Context;
import com.p051p1.mobile.putong.account.AccountModule;
import com.p051p1.mobile.putong.account.data.ThirdPartVetify;
import com.p051p1.mobile.putong.account.data.WeChatToken;
import com.p051p1.mobile.putong.account.data.WeChatUserInfo;
import p137rx.C22421c;
import p137rx.subjects.C22508b;
import p153l.jxd0;

/* JADX INFO: loaded from: classes9.dex */
public class ThirdPartLoginApi extends C4727b {

    /* JADX INFO: renamed from: h */
    public static jxd0 f17038h = new jxd0("has_report_mobile_number", Boolean.FALSE);

    /* JADX INFO: renamed from: g */
    public C22508b<C4725a> f17039g = C22508b.m222767b();

    public enum ReportMobileSource {
        landing_page,
        wechat_login,
        dau
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.api.ThirdPartLoginApi$a */
    public static class C4725a {

        /* JADX INFO: renamed from: a */
        public int f17040a;

        /* JADX INFO: renamed from: b */
        public int f17041b;

        /* JADX INFO: renamed from: c */
        public String f17042c;
    }

    /* JADX INFO: renamed from: g */
    public C22421c<WeChatToken> m29178g(String str) {
        return AccountModule.f16757d.f154353c.m100657e(str).compose(C4727b.m29375f());
    }

    /* JADX INFO: renamed from: h */
    public void m29179h(Context context, ReportMobileSource reportMobileSource, String str) {
    }

    /* JADX INFO: renamed from: i */
    public C22421c<C4725a> m29180i() {
        return this.f17039g;
    }

    /* JADX INFO: renamed from: j */
    public void m29181j(C4725a c4725a) {
        this.f17039g.m137019l(c4725a);
    }

    /* JADX INFO: renamed from: k */
    public void m29182k(int i, String str) {
        C4725a c4725a = new C4725a();
        c4725a.f17041b = i;
        c4725a.f17042c = str;
        c4725a.f17040a = 1;
        AccountModule.f16758e.m29181j(c4725a);
    }

    /* JADX INFO: renamed from: l */
    public C22421c<WeChatUserInfo> m29183l(String str, String str2) {
        return AccountModule.f16757d.f154353c.m100658f(str2, str).compose(C4727b.m29375f());
    }

    /* JADX INFO: renamed from: m */
    public C22421c<ThirdPartVetify> m29184m(String str, String str2, boolean z) {
        return AccountModule.f16757d.f154353c.m100663l(str, str2, z).compose(C4727b.m29375f());
    }
}
