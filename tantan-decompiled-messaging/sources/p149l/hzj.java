package p149l;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.GiftWallRankInfo;
import com.p046p1.mobile.putong.core.data.GiftWallSocial;
import com.p046p1.mobile.putong.core.data.GiftWallSocialItem;
import com.p046p1.mobile.putong.core.data.NewGiftWall;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class hzj extends jq2<ozj> {

    /* JADX INFO: renamed from: a */
    public final int f110200a;

    /* JADX INFO: renamed from: b */
    public int f110201b;

    /* JADX INFO: renamed from: c */
    public boolean f110202c;

    /* JADX INFO: renamed from: d */
    public GiftWallRankInfo f110203d;

    /* JADX INFO: renamed from: e */
    public ArrayList<NewGiftWall> f110204e;

    /* JADX INFO: renamed from: f */
    public GiftWallSocialItem f110205f;

    public hzj(mcr mcrVar) {
        super(mcrVar);
        this.f110200a = 99;
        this.f110201b = 1;
        this.f110202c = true;
        this.f110203d = null;
        this.f110204e = new ArrayList<>();
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m133674e0(Throwable th) {
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m133677h0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m133680k0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m133684o0(C4319c c4319c) {
        ((ozj) this.viewModel).m166882u();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        super.mo39470a0();
        m133690t0(1);
        lifecycle().filter(new w9j() { // from class: l.xyj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15550k);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.yyj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f200776a.m133684o0((C4319c) obj);
            }
        }, new e30() { // from class: l.zyj
            @Override // p149l.e30
            public final void call(Object obj) {
                hzj.m133680k0((Throwable) obj);
            }
        }));
        lifecycle().filter(new w9j() { // from class: l.azj
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.bzj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f78039a.m133686p0((C4319c) obj);
            }
        }, new e30() { // from class: l.czj
            @Override // p149l.e30
            public final void call(Object obj) {
                hzj.m133674e0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b */
    public void m133685b() {
        if (this.f110202c) {
            m133690t0(this.f110201b);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m133686p0(C4319c c4319c) {
        m133691u0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m133687q0(int i, xaj0 xaj0Var) {
        if (((Integer) xaj0Var.f191753c).intValue() == 0) {
            ((ozj) this.viewModel).m166886y();
            this.f110202c = false;
        } else if (vwb.m200296J((Collection) xaj0Var.f191752b)) {
            this.f110202c = false;
        } else {
            this.f110204e.addAll((Collection) xaj0Var.f191752b);
            this.f110202c = ((List) xaj0Var.f191752b).size() >= 99;
            this.f110201b++;
            ((ozj) this.viewModel).m166885x(this.f110204e, i == 1);
        }
        GiftWallRankInfo giftWallRankInfo = (GiftWallRankInfo) xaj0Var.f191751a;
        this.f110203d = giftWallRankInfo;
        if (!NullChecker.m81303a(giftWallRankInfo) || TEnum.equals(this.f110203d.rankLevel, "hide")) {
            ((ozj) this.viewModel).m166879k();
        } else {
            xaj0<String, String, String> xaj0VarM186679h = syj.m186679h(this.f110203d);
            ((ozj) this.viewModel).m166887z(xaj0VarM186679h.f191751a + xaj0VarM186679h.f191752b + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + xaj0VarM186679h.f191753c);
        }
        ((ozj) this.viewModel).m166884w(((Integer) xaj0Var.f191753c).intValue());
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m133688r0(int i, Throwable th) {
        if (i == 1) {
            ((ozj) this.viewModel).m166886y();
            ((ozj) this.viewModel).m166879k();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m133689s0(GiftWallSocial giftWallSocial) {
        boolean z;
        if (giftWallSocial == null) {
            ((ozj) this.viewModel).m166880l();
            this.f110205f = null;
            return;
        }
        if (NullChecker.m81303a(giftWallSocial.dailySocial)) {
            this.f110205f = giftWallSocial.dailySocial;
            z = true;
        } else {
            if (NullChecker.m81303a(giftWallSocial.totalSocial)) {
                this.f110205f = giftWallSocial.totalSocial;
            } else {
                ((ozj) this.viewModel).m166880l();
                this.f110205f = null;
            }
            z = false;
        }
        if (NullChecker.m81303a(this.f110205f)) {
            ((ozj) this.viewModel).m166876A(z, this.f110205f);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m133690t0(final int i) {
        duringCreated(CoreModule.f17545c.f19643f1.m118049M3(i, 99)).subscribe(mkd0.m154956H(new e30() { // from class: l.fzj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f99972a.m133687q0(i, (xaj0) obj);
            }
        }, new e30() { // from class: l.gzj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f105148a.m133688r0(i, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public void m133691u0() {
        duringCreated(CoreModule.f17545c.f19643f1.m118048L3()).subscribe(mkd0.m154956H(new e30() { // from class: l.dzj
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f88487a.m133689s0((GiftWallSocial) obj);
            }
        }, new e30() { // from class: l.ezj
            @Override // p149l.e30
            public final void call(Object obj) {
                hzj.m133677h0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x0 */
    public void m133692x0() {
        new guj(act(), this.f110203d, "p_presentwall").m128045l();
    }

    /* JADX INFO: renamed from: y0 */
    public void m133693y0() {
        if (NullChecker.m81303a(this.f110205f)) {
            if (this.f110205f.canChat) {
                act().startActivity(MessagesAct.m48943i2(act(), this.f110205f.userID, false, false));
            } else {
                act().startActivity(CoreModule.m29935P().m94658i().mo158268M1(act(), this.f110205f.userID, "from_giftwall", false));
            }
        }
    }

    @Override // p149l.q0m
    public void destroy() {
    }
}
