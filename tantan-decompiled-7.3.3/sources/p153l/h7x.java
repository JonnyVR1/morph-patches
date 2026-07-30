package p153l;

import android.os.Bundle;
import android.text.TextUtils;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.oms.OmsDialog;
import com.p051p1.mobile.putong.core.p058ui.match.C8618a;
import com.p051p1.mobile.putong.core.p058ui.match.MatchAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.IdBoxed;
import com.p051p1.mobile.putong.data.Link;
import com.p051p1.mobile.putong.data.LinkChannel;
import com.p051p1.mobile.putong.data.LinkIntent;
import com.p051p1.mobile.putong.data.NavigationIntent;
import com.p051p1.mobile.putong.p070ui.share.ShareHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import p137rx.subjects.C22507a;

/* JADX INFO: loaded from: classes3.dex */
public class h7x extends k8x<y7x> {

    /* JADX INFO: renamed from: d */
    public ArrayList<String> f108173d;

    /* JADX INFO: renamed from: e */
    public ArrayList<String> f108174e;

    /* JADX INFO: renamed from: f */
    public int f108175f;

    /* JADX INFO: renamed from: g */
    public C22507a<uxj0> f108176g;

    /* JADX INFO: renamed from: h */
    public boolean f108177h;

    public h7x(ner nerVar) {
        super(nerVar);
        this.f108175f = 2;
        this.f108176g = C22507a.m222759c(uxj0.f181467a);
        this.f108177h = false;
    }

    /* JADX INFO: renamed from: C0 */
    public static /* synthetic */ void m133840C0() {
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m133852Q0(PurchaseType purchaseType) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V0 */
    public /* synthetic */ void m133853V0() {
        m133870k1(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W0 */
    public /* synthetic */ void m133854W0() {
        m133871l1(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X0 */
    public /* synthetic */ void m133855X0(Bundle bundle) {
        act().setSwipeBackEnable(false);
        toh0.m192059s();
        if (this.f124420a == 13 && tx0.m193439o().m193441B()) {
            if (spl0.m187354F()) {
                pk50.m172568j().m172574f().m181664b0(OmsDialog.p_appstore_rating_filter_popup_store.getIdentifier(), 0, true);
            }
            tx0.m193419I(act(), false, 5.0f, "superlike");
        }
        ((y7x) this.viewModel).m214698x0(NullChecker.m82486a(bundle), this.f124420a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y0 */
    public /* synthetic */ void m133856Y0(uxj0 uxj0Var) {
        ((y7x) this.viewModel).m214684R0(CoreModule.f18264c.f20381e0.m116600p9(), CoreModule.f18264c.f20381e0.m116503Pa(this.f124421b), this.f124420a, this.f108174e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a1 */
    public /* synthetic */ void m133857a1(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            V v2 = this.viewModel;
            ((y7x) v2).f197888p0.m123509g(((y7x) v2).getAct());
            ((y7x) this.viewModel).m214688V0();
            ((y7x) this.viewModel).m214690X0();
            return;
        }
        if (c4470c == C4470c.f16268j) {
            ((y7x) this.viewModel).f197888p0.m123509g(null);
        } else if (c4470c == C4470c.f16271m) {
            ((y7x) this.viewModel).f197888p0.m123504b();
        }
    }

    /* JADX INFO: renamed from: R0 */
    public final String m133858R0() {
        if (!(act() instanceof MatchAct)) {
            return "p_intl_instantmatch_no_ultra_view,e_intl_instantmatch_no_ultra_click,click";
        }
        String str = ((MatchAct) act()).f31317e;
        return !TextUtils.isEmpty(str) ? str : "p_intl_instantmatch_no_ultra_view,e_intl_instantmatch_no_ultra_click,click";
    }

    /* JADX INFO: renamed from: S0 */
    public int m133859S0() {
        return this.f124420a;
    }

    /* JADX INFO: renamed from: U0 */
    public void m133860U0() {
        act().startActivity(NewMainAct.m40697M5(act(), NavigationIntent.get("cards")));
        act().m68056e2();
    }

    @Override // p153l.ar2
    /* JADX INFO: renamed from: a0 */
    public void mo40473a0() {
        int i = this.f124420a;
        if (i == 49) {
            this.f108177h = true;
            l51.m152888H(act(), new Runnable() { // from class: l.u6x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f177813a.m133853V0();
                }
            }, 1500L);
        } else if (i == 50) {
            this.f108177h = true;
            l51.m152888H(act(), new Runnable() { // from class: l.y6x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f197722a.m133854W0();
                }
            }, 1500L);
        }
        if (d79.m114685j0()) {
            CoreModule.f18264c.f20384f0.m33653Fo();
        }
        creates(new y20() { // from class: l.z6x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203202a.m133855X0((Bundle) obj);
            }
        });
        duringCreated(this.f108176g).subscribe(psd0.m173596G(new y20() { // from class: l.a7x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68856a.m133856Y0((uxj0) obj);
            }
        }));
        lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.b7x
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f75344a.m133857a1((C4470c) obj);
            }
        }));
        int i2 = this.f124420a;
        if (i2 == 49) {
            m148777r0();
        } else if (i2 == 50) {
            m148778s0();
        }
    }

    /* JADX INFO: renamed from: c1 */
    public final /* synthetic */ void m133862c1(String str, boolean z) {
        qt4.f159383e.put(Boolean.TRUE);
        ((y7x) this.viewModel).m214682P0();
        m133861b1(str, z);
    }

    /* JADX INFO: renamed from: d1 */
    public final /* synthetic */ void m133863d1(Boolean bool) {
        this.f108177h = false;
    }

    /* JADX INFO: renamed from: e1 */
    public final /* synthetic */ void m133864e1() {
        this.f108177h = false;
    }

    /* JADX INFO: renamed from: f1 */
    public final /* synthetic */ void m133865f1() {
        this.f108176g.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: g1 */
    public final /* synthetic */ void m133866g1(String str) {
        act().startActivity(MessagesAct.m50128m2(act(), this.f124421b, false, false, this.f108175f, str));
        act().m68056e2();
    }

    /* JADX INFO: renamed from: h1 */
    public void m133867h1() {
        if (this.f108173d.size() <= 1) {
            ((y7x) this.viewModel).m214683Q0();
            act().m68056e2();
        } else {
            this.f124421b = this.f108173d.get(1);
            this.f108173d.remove(0);
            this.f108174e.remove(0);
            this.f108176g.m137019l(uxj0.f181467a);
        }
    }

    /* JADX INFO: renamed from: i1 */
    public void m133868i1(final String str, final boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (uqb0.f180394Z.m95954K(str)) {
            act().dialog().m21502E0(R$string.f18945Vi).m21499D(R$string.f18885Ti).m21540k0(R$string.f18855Si).m21555t0(R$string.f18915Ui, new Runnable() { // from class: l.g7x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f102627a.m133861b1(str, z);
                }
            }).m21567z0();
            HashSet hashSet = new HashSet(MessagesAct.f32483r.get());
            hashSet.add(CoreModule.f18264c.f20381e0.m116503Pa(this.f124421b).f56859id);
            MessagesAct.f32483r.put(hashSet);
            return;
        }
        if (MessagesAct.f32484s.get().booleanValue()) {
            m133861b1(str, z);
        } else {
            act().dialog().m21506G0(act().getResources().getString(R$string.f19807xk)).m21503F(act().getResources().getString(R$string.f19776wk)).m21559v0(act().getResources().getString(R$string.f19538p), new Runnable() { // from class: l.v6x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f182699a.m133862c1(str, z);
                }
            }).m21543n0(act().getResources().getString(R$string.f19507o), new Runnable() { // from class: l.w6x
                @Override // java.lang.Runnable
                public final void run() {
                    h7x.m133840C0();
                }
            }).m21567z0();
            MessagesAct.f32484s.put(Boolean.TRUE);
        }
    }

    /* JADX INFO: renamed from: j1 */
    public void m133869j1() {
        Link link = new Link();
        link.intent = LinkIntent.get("matched");
        link.channel = LinkChannel.get("unknown");
        i4g0.m138523u("e_match_share_button", "p_successful_match_view", jyb.m147494Y("share_to", "system"));
        link.resources = jyb.m147507f0(new IdBoxed(this.f124421b, "relationship"));
        new ShareHelper(link).m81202w0(act(), act().string(R$string.f18861So), act().string(R$string.f18891To), jyb.m147507f0(LinkChannel.get("unknown")), true);
    }

    /* JADX INFO: renamed from: k1 */
    public void m133870k1(boolean z) {
        if (z || !this.f108177h) {
            this.f108177h = true;
            CoreModule.m30933P().m143405a().mo34365Lf(act(), "p_intl_premium_match,e_intl_match_sayhi,click", Privilege.see_who_likes_me, new y20() { // from class: l.e7x
                @Override // p153l.y20
                public final void call(Object obj) {
                    h7x.m133852Q0((PurchaseType) obj);
                }
            }, new y20() { // from class: l.f7x
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f97675a.m133863d1((Boolean) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: l1 */
    public void m133871l1(boolean z) {
        if (z || !this.f108177h) {
            C8618a.m48771w().m48792o(act(), m133858R0(), new x20() { // from class: l.c7x
                @Override // p153l.x20
                public final void call() {
                    this.f80153a.m133864e1();
                }
            });
        }
    }

    /* JADX INFO: renamed from: m1 */
    public void m133872m1() {
        sfj0.m185596c("e_match_chat", "p_successful_match_view", new sfj0.C20032a[0]);
        if (this.f108173d.size() <= 1) {
            act().startActivity(MessagesAct.m50127l2(act(), this.f124421b, false, false, this.f108175f));
            act().finishWithoutCustomAnimation();
            return;
        }
        this.f124421b = this.f108173d.get(1);
        this.f108173d.remove(0);
        this.f108174e.remove(0);
        ((y7x) this.viewModel).getAct().startActivity(MessagesAct.m50127l2(act(), this.f124421b, false, false, this.f108175f));
        l51.m152888H(act(), new Runnable() { // from class: l.d7x
            @Override // java.lang.Runnable
            public final void run() {
                this.f85556a.m133865f1();
            }
        }, 600L);
    }

    /* JADX INFO: renamed from: n1, reason: merged with bridge method [inline-methods] */
    public final void m133861b1(final String str, boolean z) {
        act().postDelayed(new Runnable() { // from class: l.x6x
            @Override // java.lang.Runnable
            public final void run() {
                this.f192645a.m133866g1(str);
            }
        }, z ? 500L : 1L);
        if (z) {
            act().hideInput();
        }
    }

    @Override // p153l.k8x
    /* JADX INFO: renamed from: q0 */
    public void mo96040q0(String str, int i, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        super.mo96040q0(str, i, arrayList, arrayList2);
        this.f108173d = arrayList;
        this.f108174e = arrayList2;
    }

    @Override // p153l.k8x, p153l.k3m
    public void destroy() {
    }
}
