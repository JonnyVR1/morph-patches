package p153l;

import com.fasterxml.jackson.core.util.MinimalPrettyPrinter;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.GiftWallRankInfo;
import com.p051p1.mobile.putong.core.data.GiftWallSocial;
import com.p051p1.mobile.putong.core.data.GiftWallSocialItem;
import com.p051p1.mobile.putong.core.data.NewGiftWall;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class x1k extends ar2<e2k> {

    /* JADX INFO: renamed from: a */
    public final int f192068a;

    /* JADX INFO: renamed from: b */
    public int f192069b;

    /* JADX INFO: renamed from: c */
    public boolean f192070c;

    /* JADX INFO: renamed from: d */
    public GiftWallRankInfo f192071d;

    /* JADX INFO: renamed from: e */
    public ArrayList<NewGiftWall> f192072e;

    /* JADX INFO: renamed from: f */
    public GiftWallSocialItem f192073f;

    public x1k(ner nerVar) {
        super(nerVar);
        this.f192068a = 99;
        this.f192069b = 1;
        this.f192070c = true;
        this.f192071d = null;
        this.f192072e = new ArrayList<>();
    }

    /* JADX INFO: renamed from: e0 */
    public static /* synthetic */ void m209065e0(Throwable th) {
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m209068h0(Throwable th) {
    }

    /* JADX INFO: renamed from: k0 */
    public static /* synthetic */ void m209071k0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m209075o0(C4470c c4470c) {
        ((e2k) this.viewModel).m119106u();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        super.mo40473a0();
        m209081t0(1);
        lifecycle().filter(new qcj() { // from class: l.n1k
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16269k);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.o1k
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f144667a.m209075o0((C4470c) obj);
            }
        }, new y20() { // from class: l.p1k
            @Override // p153l.y20
            public final void call(Object obj) {
                x1k.m209071k0((Throwable) obj);
            }
        }));
        lifecycle().filter(new qcj() { // from class: l.q1k
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.r1k
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f160837a.m209077p0((C4470c) obj);
            }
        }, new y20() { // from class: l.s1k
            @Override // p153l.y20
            public final void call(Object obj) {
                x1k.m209065e0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: b */
    public void m209076b() {
        if (this.f192070c) {
            m209081t0(this.f192069b);
        }
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m209077p0(C4470c c4470c) {
        m209082u0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m209078q0(int i, bkj0 bkj0Var) {
        if (((Integer) bkj0Var.f77083c).intValue() == 0) {
            ((e2k) this.viewModel).m119110y();
            this.f192070c = false;
        } else if (jyb.m147479J((Collection) bkj0Var.f77082b)) {
            this.f192070c = false;
        } else {
            this.f192072e.addAll((Collection) bkj0Var.f77082b);
            this.f192070c = ((List) bkj0Var.f77082b).size() >= 99;
            this.f192069b++;
            ((e2k) this.viewModel).m119109x(this.f192072e, i == 1);
        }
        GiftWallRankInfo giftWallRankInfo = (GiftWallRankInfo) bkj0Var.f77081a;
        this.f192071d = giftWallRankInfo;
        if (!NullChecker.m82486a(giftWallRankInfo) || TEnum.equals(this.f192071d.rankLevel, "hide")) {
            ((e2k) this.viewModel).m119103k();
        } else {
            bkj0<String, String, String> bkj0VarM138111h = i1k.m138111h(this.f192071d);
            ((e2k) this.viewModel).m119111z(bkj0VarM138111h.f77081a + bkj0VarM138111h.f77082b + MinimalPrettyPrinter.DEFAULT_ROOT_VALUE_SEPARATOR + bkj0VarM138111h.f77083c);
        }
        ((e2k) this.viewModel).m119108w(((Integer) bkj0Var.f77083c).intValue());
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m209079r0(int i, Throwable th) {
        if (i == 1) {
            ((e2k) this.viewModel).m119110y();
            ((e2k) this.viewModel).m119103k();
        }
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m209080s0(GiftWallSocial giftWallSocial) {
        boolean z;
        if (giftWallSocial == null) {
            ((e2k) this.viewModel).m119104l();
            this.f192073f = null;
            return;
        }
        if (NullChecker.m82486a(giftWallSocial.dailySocial)) {
            this.f192073f = giftWallSocial.dailySocial;
            z = true;
        } else {
            if (NullChecker.m82486a(giftWallSocial.totalSocial)) {
                this.f192073f = giftWallSocial.totalSocial;
            } else {
                ((e2k) this.viewModel).m119104l();
                this.f192073f = null;
            }
            z = false;
        }
        if (NullChecker.m82486a(this.f192073f)) {
            ((e2k) this.viewModel).m119100A(z, this.f192073f);
        }
    }

    /* JADX INFO: renamed from: t0 */
    public final void m209081t0(final int i) {
        duringCreated(CoreModule.f18264c.f20385f1.m155887M3(i, 99)).subscribe(psd0.m173597H(new y20() { // from class: l.v1k
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181981a.m209078q0(i, (bkj0) obj);
            }
        }, new y20() { // from class: l.w1k
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186821a.m209079r0(i, (Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u0 */
    public void m209082u0() {
        duringCreated(CoreModule.f18264c.f20385f1.m155886L3()).subscribe(psd0.m173597H(new y20() { // from class: l.t1k
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f171680a.m209080s0((GiftWallSocial) obj);
            }
        }, new y20() { // from class: l.u1k
            @Override // p153l.y20
            public final void call(Object obj) {
                x1k.m209068h0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: x0 */
    public void m209083x0() {
        new wwj(act(), this.f192071d, "p_presentwall").m208258l();
    }

    /* JADX INFO: renamed from: y0 */
    public void m209084y0() {
        if (NullChecker.m82486a(this.f192073f)) {
            if (this.f192073f.canChat) {
                act().startActivity(MessagesAct.m50126k2(act(), this.f192073f.userID, false, false));
            } else {
                act().startActivity(CoreModule.m30933P().m143412i().mo180360M1(act(), this.f192073f.userID, "from_giftwall", false));
            }
        }
    }

    @Override // p153l.k3m
    public void destroy() {
    }
}
