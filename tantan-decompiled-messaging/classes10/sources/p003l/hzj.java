package p003l;

import com.p000p1.mobile.putong.core.data.GiftWallRankInfo;
import com.p000p1.mobile.putong.core.data.GiftWallSocial;
import com.p000p1.mobile.putong.core.data.GiftWallSocialItem;
import com.p000p1.mobile.putong.core.data.NewGiftWall;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import l.e30;
import l.jq2;
import l.mcr;
import l.mkd0;
import l.vwb;
import l.w9j;
import l.xaj0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class hzj extends jq2<ozj> {

    /* JADX INFO: renamed from: a */
    public final int f4972a;

    /* JADX INFO: renamed from: b */
    public int f4973b;

    /* JADX INFO: renamed from: c */
    public boolean f4974c;

    /* JADX INFO: renamed from: d */
    public GiftWallRankInfo f4975d;

    /* JADX INFO: renamed from: e */
    public ArrayList<NewGiftWall> f4976e;

    /* JADX INFO: renamed from: f */
    public GiftWallSocialItem f4977f;

    public hzj(mcr mcrVar) {
        super(mcrVar);
        this.f4972a = 99;
        this.f4973b = 1;
        this.f4974c = true;
        this.f4975d = null;
        this.f4976e = new ArrayList<>();
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m7091e0(Throwable th) {
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m7094h0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m7097k0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m7101o0(c cVar) {
        ((ozj) ((jq2) this).viewModel).m8642u();
    }

    /* JADX INFO: renamed from: a0 */
    public void m7102a0() {
        super.a0();
        m7108t0(1);
        lifecycle().filter(new w9j() { // from class: l.xyj
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.k);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.yyj
            public final void call(Object obj) {
                this.f9152a.m7101o0((c) obj);
            }
        }, new e30() { // from class: l.zyj
            public final void call(Object obj) {
                hzj.m7097k0((Throwable) obj);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.azj
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.i);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.bzj
            public final void call(Object obj) {
                this.f3492a.m7104p0((c) obj);
            }
        }, new e30() { // from class: l.czj
            public final void call(Object obj) {
                hzj.m7091e0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b */
    public void m7103b() {
        if (this.f4974c) {
            m7108t0(this.f4973b);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m7104p0(c cVar) {
        m7109u0();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m7105q0(int i, xaj0 xaj0Var) {
        if (((Integer) xaj0Var.c).intValue() == 0) {
            ((ozj) ((jq2) this).viewModel).m8646y();
            this.f4974c = false;
        } else if (vwb.J((Collection) xaj0Var.b)) {
            this.f4974c = false;
        } else {
            this.f4976e.addAll((Collection) xaj0Var.b);
            this.f4974c = ((List) xaj0Var.b).size() >= 99;
            this.f4973b++;
            ((ozj) ((jq2) this).viewModel).m8645x(this.f4976e, i == 1);
        }
        GiftWallRankInfo giftWallRankInfo = (GiftWallRankInfo) xaj0Var.a;
        this.f4975d = giftWallRankInfo;
        if (!NullChecker.a(giftWallRankInfo) || TEnum.equals(this.f4975d.rankLevel, "hide")) {
            ((ozj) ((jq2) this).viewModel).m8639k();
        } else {
            xaj0<String, String, String> xaj0VarM9512h = syj.m9512h(this.f4975d);
            ((ozj) ((jq2) this).viewModel).m8647z(((String) xaj0VarM9512h.a) + ((String) xaj0VarM9512h.b) + " " + ((String) xaj0VarM9512h.c));
        }
        ((ozj) ((jq2) this).viewModel).m8644w(((Integer) xaj0Var.c).intValue());
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m7106r0(int i, Throwable th) {
        if (i == 1) {
            ((ozj) ((jq2) this).viewModel).m8646y();
            ((ozj) ((jq2) this).viewModel).m8639k();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m7107s0(GiftWallSocial giftWallSocial) {
        boolean z;
        if (giftWallSocial == null) {
            ((ozj) ((jq2) this).viewModel).m8640l();
            this.f4977f = null;
            return;
        }
        if (NullChecker.a(giftWallSocial.dailySocial)) {
            this.f4977f = giftWallSocial.dailySocial;
            z = true;
        } else {
            if (NullChecker.a(giftWallSocial.totalSocial)) {
                this.f4977f = giftWallSocial.totalSocial;
            } else {
                ((ozj) ((jq2) this).viewModel).m8640l();
                this.f4977f = null;
            }
            z = false;
        }
        if (NullChecker.a(this.f4977f)) {
            ((ozj) ((jq2) this).viewModel).m8634A(z, this.f4977f);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m7108t0(final int i) {
        duringCreated(CoreModule.c.f1.M3(i, 99)).subscribe(mkd0.H(new e30() { // from class: l.fzj
            public final void call(Object obj) {
                this.f4530a.m7105q0(i, (xaj0) obj);
            }
        }, new e30() { // from class: l.gzj
            public final void call(Object obj) {
                this.f4779a.m7106r0(i, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public void m7109u0() {
        duringCreated(CoreModule.c.f1.L3()).subscribe(mkd0.H(new e30() { // from class: l.dzj
            public final void call(Object obj) {
                this.f4242a.m7107s0((GiftWallSocial) obj);
            }
        }, new e30() { // from class: l.ezj
            public final void call(Object obj) {
                hzj.m7094h0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x0 */
    public void m7110x0() {
        new guj(act(), this.f4975d, "p_presentwall").m6824l();
    }

    /* JADX INFO: renamed from: y0 */
    public void m7111y0() {
        if (NullChecker.a(this.f4977f)) {
            if (this.f4977f.canChat) {
                act().startActivity(MessagesAct.i2(act(), this.f4977f.userID, false, false));
            } else {
                act().startActivity(CoreModule.P().i().M1(act(), this.f4977f.userID, "from_giftwall", false));
            }
        }
    }

    public void destroy() {
    }
}
