package p003l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p000p1.mobile.putong.core.p001ui.match.C0038a;
import com.p000p1.mobile.putong.core.p001ui.match.MatchAct;
import com.p000p1.mobile.putong.core.p001ui.messages.MessagesAct;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.newui.main.NewMainAct;
import com.p1.mobile.putong.core.oms.OmsDialog;
import com.p1.mobile.putong.data.IdBoxed;
import com.p1.mobile.putong.data.Link;
import com.p1.mobile.putong.data.LinkChannel;
import com.p1.mobile.putong.data.LinkIntent;
import com.p1.mobile.putong.data.NavigationIntent;
import com.p1.mobile.putong.ui.share.ShareHelper;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import l.dyq;
import l.e51;
import l.ic50;
import l.j760;
import l.jq2;
import l.mcr;
import l.mgh0;
import l.mkd0;
import l.mx0;
import l.o6j0;
import l.ogl0;
import l.qib0;
import l.roj0;
import l.rs4;
import l.s7m;
import l.u59;
import l.vwb;
import l.zvf0;
import p014rx.subjects.C1185a;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class i4x extends l5x<z4x> {

    /* JADX INFO: renamed from: d */
    public ArrayList<String> f4344d;

    /* JADX INFO: renamed from: e */
    public ArrayList<String> f4345e;

    /* JADX INFO: renamed from: f */
    public int f4346f;

    /* JADX INFO: renamed from: g */
    public C1185a<roj0> f4347g;

    /* JADX INFO: renamed from: h */
    public boolean f4348h;

    public i4x(mcr mcrVar) {
        super(mcrVar);
        this.f4346f = 2;
        this.f4347g = C1185a.m9970c(roj0.a);
        this.f4348h = false;
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ void m5032C0() {
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m5044Q0(PurchaseType purchaseType) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public /* synthetic */ void m5045V0() {
        m5063k1(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public /* synthetic */ void m5046W0() {
        m5064l1(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public /* synthetic */ void m5047X0(Bundle bundle) {
        act().setSwipeBackEnable(false);
        mgh0.s();
        if (this.f5219a == 13 && mx0.o().B()) {
            if (ogl0.F()) {
                ic50.j().f().b0(OmsDialog.p_appstore_rating_filter_popup_store.getIdentifier(), 0, true);
            }
            mx0.I(act(), false, 5.0f, "superlike");
        }
        ((z4x) ((jq2) this).viewModel).m9337x0(NullChecker.a(bundle), this.f5219a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public /* synthetic */ void m5048Y0(roj0 roj0Var) {
        ((z4x) ((jq2) this).viewModel).m9322R0(CoreModule.c.e0.p9(), CoreModule.c.e0.Pa(this.f5220b), this.f5219a, this.f4345e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public /* synthetic */ void m5049a1(c cVar) {
        if (cVar == c.i) {
            s7m s7mVar = ((jq2) this).viewModel;
            ((z4x) s7mVar).f9248p0.g(((z4x) s7mVar).act());
            ((z4x) ((jq2) this).viewModel).m9326V0();
            ((z4x) ((jq2) this).viewModel).m9328X0();
            return;
        }
        if (cVar == c.j) {
            ((z4x) ((jq2) this).viewModel).f9248p0.g((dyq) null);
        } else if (cVar == c.m) {
            ((z4x) ((jq2) this).viewModel).f9248p0.b();
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final String m5050R0() {
        if (!(act() instanceof MatchAct)) {
            return "p_intl_instantmatch_no_ultra_view,e_intl_instantmatch_no_ultra_click,click";
        }
        String str = act().f360e;
        return !TextUtils.isEmpty(str) ? str : "p_intl_instantmatch_no_ultra_view,e_intl_instantmatch_no_ultra_click,click";
    }

    /* JADX INFO: renamed from: S0 */
    public int m5051S0() {
        return this.f5219a;
    }

    /* JADX INFO: renamed from: U0 */
    public void m5052U0() {
        act().startActivity(NewMainAct.I5(act(), NavigationIntent.get("cards")));
        act().finish();
    }

    /* JADX INFO: renamed from: a0 */
    public void m5053a0() {
        int i = this.f5219a;
        if (i == 49) {
            this.f4348h = true;
            e51.H(act(), new Runnable() { // from class: l.v3x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8204a.m5045V0();
                }
            }, 1500L);
        } else if (i == 50) {
            this.f4348h = true;
            e51.H(act(), new Runnable() { // from class: l.z3x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9192a.m5046W0();
                }
            }, 1500L);
        }
        if (u59.f0()) {
            CoreModule.c.f0.Fo();
        }
        creates(new e30() { // from class: l.a4x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f2079a.m5047X0((Bundle) obj);
            }
        });
        duringCreated(this.f4347g).subscribe((m250) mkd0.G(new e30() { // from class: l.b4x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f2341a.m5048Y0((roj0) obj);
            }
        }));
        lifecycle().subscribe((m250) mkd0.G(new e30() { // from class: l.c4x
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f2578a.m5049a1((c) obj);
            }
        }));
        int i2 = this.f5219a;
        if (i2 == 49) {
            m5987r0();
        } else if (i2 == 50) {
            m5988s0();
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m5055c1(String str, boolean z) {
        rs4.e.put(Boolean.TRUE);
        ((z4x) ((jq2) this).viewModel).m9320P0();
        m5054b1(str, z);
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m5056d1(Boolean bool) {
        this.f4348h = false;
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m5057e1() {
        this.f4348h = false;
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m5058f1() {
        this.f4347g.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m5059g1(String str) {
        act().startActivity(MessagesAct.m2037l2(act(), this.f5220b, false, false, this.f4346f, str));
        act().finish();
    }

    /* JADX INFO: renamed from: h1 */
    public void m5060h1() {
        if (this.f4344d.size() <= 1) {
            ((z4x) ((jq2) this).viewModel).m9321Q0();
            act().finish();
        } else {
            this.f5220b = this.f4344d.get(1);
            this.f4344d.remove(0);
            this.f4345e.remove(0);
            this.f4347g.onNext(roj0.a);
        }
    }

    /* JADX INFO: renamed from: i1 */
    public void m5061i1(final String str, final boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (qib0.Z.K(str)) {
            act().dialog().E0(R.string.zi).D(R.string.xi).k0(R.string.wi).t0(R.string.yi, new Runnable() { // from class: l.h4x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4113a.m5054b1(str, z);
                }
            }).z0();
            HashSet hashSet = new HashSet((Collection) MessagesAct.f1526r.get());
            hashSet.add(((DbObject) CoreModule.c.e0.Pa(this.f5220b)).id);
            MessagesAct.f1526r.put(hashSet);
            return;
        }
        if (((Boolean) MessagesAct.f1527s.get()).booleanValue()) {
            m5054b1(str, z);
        } else {
            act().dialog().G0(act().getResources().getString(R.string.bk)).F(act().getResources().getString(R.string.ak)).v0(act().getResources().getString(R.string.p), new Runnable() { // from class: l.w3x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f8480a.m5055c1(str, z);
                }
            }).n0(act().getResources().getString(R.string.o), new Runnable() { // from class: l.x3x
                @Override // java.lang.Runnable
                public final void run() {
                    i4x.m5032C0();
                }
            }).z0();
            MessagesAct.f1527s.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public void m5062j1() {
        Link link = new Link();
        link.intent = LinkIntent.get("matched");
        link.channel = LinkChannel.get(IjkMediaMeta.IJKM_VAL_TYPE__UNKNOWN);
        zvf0.u("e_match_share_button", "p_successful_match_view", new j760[]{vwb.Y("share_to", "system")});
        link.resources = vwb.f0(new IdBoxed[]{new IdBoxed(this.f5220b, "relationship")});
        new ShareHelper(link).w0(act(), act().string(R.string.wo), act().string(R.string.xo), vwb.f0(new LinkChannel[]{LinkChannel.get(IjkMediaMeta.IJKM_VAL_TYPE__UNKNOWN)}), true);
    }

    /* JADX INFO: renamed from: k1 */
    public void m5063k1(boolean z) {
        if (z || !this.f4348h) {
            this.f4348h = true;
            CoreModule.P().a().Lf(act(), "p_intl_premium_match,e_intl_match_sayhi,click", Privilege.see_who_likes_me, new e30() { // from class: l.f4x
                @Override // p003l.e30
                public final void call(Object obj) {
                    i4x.m5044Q0((PurchaseType) obj);
                }
            }, new e30() { // from class: l.g4x
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f3801a.m5056d1((Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l1 */
    public void m5064l1(boolean z) {
        if (z || !this.f4348h) {
            C0038a.m652w().m673o(act(), m5050R0(), new d30() { // from class: l.d4x
                @Override // p003l.d30
                public final void call() {
                    this.f2898a.m5057e1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: m1 */
    public void m5065m1() {
        o6j0.c("e_match_chat", "p_successful_match_view", new o6j0.a[0]);
        if (this.f4344d.size() <= 1) {
            act().startActivity(MessagesAct.m2036k2(act(), this.f5220b, false, false, this.f4346f));
            act().finishWithoutCustomAnimation();
            return;
        }
        this.f5220b = this.f4344d.get(1);
        this.f4344d.remove(0);
        this.f4345e.remove(0);
        ((z4x) ((jq2) this).viewModel).act().startActivity(MessagesAct.m2036k2(act(), this.f5220b, false, false, this.f4346f));
        e51.H(act(), new Runnable() { // from class: l.e4x
            @Override // java.lang.Runnable
            public final void run() {
                this.f3202a.m5058f1();
            }
        }, 600L);
    }

    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public final void m5054b1(final String str, boolean z) {
        act().postDelayed(new Runnable() { // from class: l.y3x
            @Override // java.lang.Runnable
            public final void run() {
                this.f8908a.m5059g1(str);
            }
        }, z ? 500L : 1L);
        if (z) {
            act().hideInput();
        }
    }

    @Override // p003l.l5x
    /* JADX INFO: renamed from: q0 */
    public void mo5067q0(String str, int i, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        super.mo5067q0(str, i, arrayList, arrayList2);
        this.f4344d = arrayList;
        this.f4345e = arrayList2;
    }

    @Override // p003l.l5x
    public void destroy() {
    }
}
