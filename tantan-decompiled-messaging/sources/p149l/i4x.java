package p149l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.oms.OmsDialog;
import com.p046p1.mobile.putong.core.p053ui.match.C8455a;
import com.p046p1.mobile.putong.core.p053ui.match.MatchAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.IdBoxed;
import com.p046p1.mobile.putong.data.Link;
import com.p046p1.mobile.putong.data.LinkChannel;
import com.p046p1.mobile.putong.data.LinkIntent;
import com.p046p1.mobile.putong.data.NavigationIntent;
import com.p046p1.mobile.putong.p065ui.share.ShareHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import p133rx.subjects.C22392a;

/* JADX INFO: loaded from: classes3.dex */
public class i4x extends l5x<z4x> {

    /* JADX INFO: renamed from: d */
    public ArrayList<String> f111489d;

    /* JADX INFO: renamed from: e */
    public ArrayList<String> f111490e;

    /* JADX INFO: renamed from: f */
    public int f111491f;

    /* JADX INFO: renamed from: g */
    public C22392a<roj0> f111492g;

    /* JADX INFO: renamed from: h */
    public boolean f111493h;

    public i4x(mcr mcrVar) {
        super(mcrVar);
        this.f111491f = 2;
        this.f111492g = C22392a.m221513c(roj0.f160388a);
        this.f111493h = false;
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ void m134397C0() {
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m134409Q0(PurchaseType purchaseType) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public /* synthetic */ void m134410V0() {
        m134427k1(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public /* synthetic */ void m134411W0() {
        m134428l1(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public /* synthetic */ void m134412X0(Bundle bundle) {
        act().setSwipeBackEnable(false);
        mgh0.m154563s();
        if (this.f126210a == 13 && mx0.m156802o().m156804B()) {
            if (ogl0.m164227F()) {
                ic50.m135327j().m135333f().m145241b0(OmsDialog.p_appstore_rating_filter_popup_store.getIdentifier(), 0, true);
            }
            mx0.m156782I(act(), false, 5.0f, "superlike");
        }
        ((z4x) this.viewModel).m217224x0(NullChecker.m81303a(bundle), this.f126210a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public /* synthetic */ void m134413Y0(roj0 roj0Var) {
        ((z4x) this.viewModel).m217210R0(CoreModule.f17545c.f19639e0.m169527p9(), CoreModule.f17545c.f19639e0.m169430Pa(this.f126211b), this.f126210a, this.f111490e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public /* synthetic */ void m134414a1(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            V v2 = this.viewModel;
            ((z4x) v2).f201694p0.m123794g(((z4x) v2).getAct());
            ((z4x) this.viewModel).m217214V0();
            ((z4x) this.viewModel).m217216X0();
            return;
        }
        if (c4319c == C4319c.f15549j) {
            ((z4x) this.viewModel).f201694p0.m123794g(null);
        } else if (c4319c == C4319c.f15552m) {
            ((z4x) this.viewModel).f201694p0.m123789b();
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final String m134415R0() {
        if (!(act() instanceof MatchAct)) {
            return "p_intl_instantmatch_no_ultra_view,e_intl_instantmatch_no_ultra_click,click";
        }
        String str = ((MatchAct) act()).f30469e;
        return !TextUtils.isEmpty(str) ? str : "p_intl_instantmatch_no_ultra_view,e_intl_instantmatch_no_ultra_click,click";
    }

    /* JADX INFO: renamed from: S0 */
    public int m134416S0() {
        return this.f126210a;
    }

    /* JADX INFO: renamed from: U0 */
    public void m134417U0() {
        act().startActivity(NewMainAct.m39685I5(act(), NavigationIntent.get("cards")));
        act().m66873d2();
    }

    @Override // p149l.jq2
    /* JADX INFO: renamed from: a0 */
    public void mo39470a0() {
        int i = this.f126210a;
        if (i == 49) {
            this.f111493h = true;
            e51.m114743H(act(), new Runnable() { // from class: l.v3x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f179858a.m134410V0();
                }
            }, 1500L);
        } else if (i == 50) {
            this.f111493h = true;
            e51.m114743H(act(), new Runnable() { // from class: l.z3x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f201422a.m134411W0();
                }
            }, 1500L);
        }
        if (u59.m191827f0()) {
            CoreModule.f17545c.f19642f0.m32650Fo();
        }
        creates(new e30() { // from class: l.a4x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f67574a.m134412X0((Bundle) obj);
            }
        });
        duringCreated(this.f111492g).subscribe(mkd0.m154955G(new e30() { // from class: l.b4x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f73422a.m134413Y0((roj0) obj);
            }
        }));
        lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.c4x
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79304a.m134414a1((C4319c) obj);
            }
        }));
        int i2 = this.f126210a;
        if (i2 == 49) {
            m148673r0();
        } else if (i2 == 50) {
            m148674s0();
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m134419c1(String str, boolean z) {
        rs4.f160804e.put(Boolean.TRUE);
        ((z4x) this.viewModel).m217208P0();
        m134418b1(str, z);
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m134420d1(Boolean bool) {
        this.f111493h = false;
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m134421e1() {
        this.f111493h = false;
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m134422f1() {
        this.f111492g.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m134423g1(String str) {
        act().startActivity(MessagesAct.m48945l2(act(), this.f126211b, false, false, this.f111491f, str));
        act().m66873d2();
    }

    /* JADX INFO: renamed from: h1 */
    public void m134424h1() {
        if (this.f111489d.size() <= 1) {
            ((z4x) this.viewModel).m217209Q0();
            act().m66873d2();
        } else {
            this.f126211b = this.f111489d.get(1);
            this.f111489d.remove(0);
            this.f111490e.remove(0);
            this.f111492g.m132487l(roj0.f160388a);
        }
    }

    /* JADX INFO: renamed from: i1 */
    public void m134425i1(final String str, final boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (qib0.f154711Z.m119125K(str)) {
            act().dialog().m20503E0(R$string.f19127zi).m20500D(R$string.f19067xi).m20541k0(R$string.f19037wi).m20556t0(R$string.f19097yi, new Runnable() { // from class: l.h4x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f105898a.m134418b1(str, z);
                }
            }).m20568z0();
            HashSet hashSet = new HashSet(MessagesAct.f31635r.get());
            hashSet.add(CoreModule.f17545c.f19639e0.m169430Pa(this.f126211b).f56011id);
            MessagesAct.f31635r.put(hashSet);
            return;
        }
        if (MessagesAct.f31636s.get().booleanValue()) {
            m134418b1(str, z);
        } else {
            act().dialog().m20507G0(act().getResources().getString(R$string.f18398bk)).m20504F(act().getResources().getString(R$string.f18367ak)).m20560v0(act().getResources().getString(R$string.f18808p), new Runnable() { // from class: l.w3x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f184452a.m134419c1(str, z);
                }
            }).m20544n0(act().getResources().getString(R$string.f18777o), new Runnable() { // from class: l.x3x
                @Override // java.lang.Runnable
                public final void run() {
                    i4x.m134397C0();
                }
            }).m20568z0();
            MessagesAct.f31636s.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public void m134426j1() {
        Link link = new Link();
        link.intent = LinkIntent.get("matched");
        link.channel = LinkChannel.get("unknown");
        zvf0.m220399u("e_match_share_button", "p_successful_match_view", vwb.m200311Y("share_to", "system"));
        link.resources = vwb.m200324f0(new IdBoxed(this.f126211b, "relationship"));
        new ShareHelper(link).m80019w0(act(), act().string(R$string.f19043wo), act().string(R$string.f19073xo), vwb.m200324f0(LinkChannel.get("unknown")), true);
    }

    /* JADX INFO: renamed from: k1 */
    public void m134427k1(boolean z) {
        if (z || !this.f111493h) {
            this.f111493h = true;
            CoreModule.m29935P().m94651a().mo33362Lf(act(), "p_intl_premium_match,e_intl_match_sayhi,click", Privilege.see_who_likes_me, new e30() { // from class: l.f4x
                @Override // p149l.e30
                public final void call(Object obj) {
                    i4x.m134409Q0((PurchaseType) obj);
                }
            }, new e30() { // from class: l.g4x
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f100595a.m134420d1((Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l1 */
    public void m134428l1(boolean z) {
        if (z || !this.f111493h) {
            C8455a.m47588w().m47609o(act(), m134415R0(), new d30() { // from class: l.d4x
                @Override // p149l.d30
                public final void call() {
                    this.f84361a.m134421e1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: m1 */
    public void m134429m1() {
        o6j0.m162859c("e_match_chat", "p_successful_match_view", new o6j0.C18854a[0]);
        if (this.f111489d.size() <= 1) {
            act().startActivity(MessagesAct.m48944k2(act(), this.f126211b, false, false, this.f111491f));
            act().finishWithoutCustomAnimation();
            return;
        }
        this.f126211b = this.f111489d.get(1);
        this.f111489d.remove(0);
        this.f111490e.remove(0);
        ((z4x) this.viewModel).getAct().startActivity(MessagesAct.m48944k2(act(), this.f126211b, false, false, this.f111491f));
        e51.m114743H(act(), new Runnable() { // from class: l.e4x
            @Override // java.lang.Runnable
            public final void run() {
                this.f89332a.m134422f1();
            }
        }, 600L);
    }

    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public final void m134418b1(final String str, boolean z) {
        act().postDelayed(new Runnable() { // from class: l.y3x
            @Override // java.lang.Runnable
            public final void run() {
                this.f195860a.m134423g1(str);
            }
        }, z ? 500L : 1L);
        if (z) {
            act().hideInput();
        }
    }

    @Override // p149l.l5x
    /* JADX INFO: renamed from: q0 */
    public void mo134431q0(String str, int i, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        super.mo134431q0(str, i, arrayList, arrayList2);
        this.f111489d = arrayList;
        this.f111490e = arrayList2;
    }

    @Override // p149l.l5x, p149l.q0m
    public void destroy() {
    }
}
