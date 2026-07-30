package p153l;

import android.content.Context;
import com.p051p1.mobile.putong.data.User;
import com.xiaomi.mipush.sdk.C14870f;
import com.xiaomi.push.C14906gx;
import com.xiaomi.push.C14914he;
import com.xiaomi.push.C14936m;
import com.xiaomi.push.EnumC14888gf;
import com.xiaomi.push.EnumC14894gl;
import com.xiaomi.push.EnumC14898gp;
import com.xiaomi.push.service.C14985ah;
import com.xiaomi.push.service.C14986ai;

/* JADX INFO: loaded from: classes2.dex */
public class i5r0 extends tsq0.AbstractRunnableC20394c {

    /* JADX INFO: renamed from: c */
    private Context f113091c;

    /* JADX INFO: renamed from: d */
    private boolean f113092d = false;

    public i5r0(Context context) {
        this.f113091c = context;
    }

    @Override // p153l.tsq0.AbstractRunnableC20394c
    /* JADX INFO: renamed from: a */
    public String mo87798a() {
        return "2";
    }

    @Override // java.lang.Runnable
    public void run() {
        C14985ah c14985ahM87648a = C14985ah.m87648a(this.f113091c);
        C14906gx c14906gx = new C14906gx();
        if (this.f113092d) {
            c14906gx.m87007a(0);
            c14906gx.m87012b(0);
        } else {
            c14906gx.m87007a(C14986ai.m87662a(c14985ahM87648a, EnumC14894gl.MISC_CONFIG));
            c14906gx.m87012b(C14986ai.m87662a(c14985ahM87648a, EnumC14894gl.PLUGIN_CONFIG));
        }
        C14914he c14914he = new C14914he(User.ID_TEAM_ACCOUNT, false);
        c14914he.m87131c(EnumC14898gp.DailyCheckClientConfig.f62957a);
        c14914he.m87118a(C14936m.m87448e(c14906gx));
        ouq0.m169405y("OcVersionCheckJob", "-->check version: checkMessage=", c14906gx);
        C14870f.m86573h(this.f113091c).m86606w(c14914he, EnumC14888gf.Notification, null);
    }
}
