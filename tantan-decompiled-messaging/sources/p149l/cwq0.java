package p149l;

import android.content.Context;
import com.p046p1.mobile.putong.data.User;
import com.xiaomi.mipush.sdk.C14722f;
import com.xiaomi.push.C14758gx;
import com.xiaomi.push.C14766he;
import com.xiaomi.push.C14788m;
import com.xiaomi.push.EnumC14740gf;
import com.xiaomi.push.EnumC14746gl;
import com.xiaomi.push.EnumC14750gp;
import com.xiaomi.push.service.C14837ah;
import com.xiaomi.push.service.C14838ai;

/* JADX INFO: loaded from: classes2.dex */
public class cwq0 extends njq0.AbstractRunnableC18717c {

    /* JADX INFO: renamed from: c */
    private Context f82804c;

    /* JADX INFO: renamed from: d */
    private boolean f82805d = false;

    public cwq0(Context context) {
        this.f82804c = context;
    }

    @Override // p149l.njq0.AbstractRunnableC18717c
    /* JADX INFO: renamed from: a */
    public String mo86627a() {
        return "2";
    }

    @Override // java.lang.Runnable
    public void run() {
        C14837ah c14837ahM86477a = C14837ah.m86477a(this.f82804c);
        C14758gx c14758gx = new C14758gx();
        if (this.f82805d) {
            c14758gx.m85836a(0);
            c14758gx.m85841b(0);
        } else {
            c14758gx.m85836a(C14838ai.m86491a(c14837ahM86477a, EnumC14746gl.MISC_CONFIG));
            c14758gx.m85841b(C14838ai.m86491a(c14837ahM86477a, EnumC14746gl.PLUGIN_CONFIG));
        }
        C14766he c14766he = new C14766he(User.ID_TEAM_ACCOUNT, false);
        c14766he.m85960c(EnumC14750gp.DailyCheckClientConfig.f62110a);
        c14766he.m85947a(C14788m.m86277e(c14758gx));
        ilq0.m137052y("OcVersionCheckJob", "-->check version: checkMessage=", c14758gx);
        C14722f.m85402h(this.f82804c).m85435w(c14766he, EnumC14740gf.Notification, null);
    }
}
