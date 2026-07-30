package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.p001ui.onlinematch.C0034a;
import com.p000p1.mobile.putong.core.p001ui.onlinematch.view.OnlineMatchBaseCardView;
import com.p000p1.mobile.putong.core.p001ui.purchase.C0189c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.card.VSwipeCard;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.data.PartialListOpt;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.SwipeDirection;
import com.p1.mobile.putong.core.data.VirtualCardType;
import com.p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.e30;
import l.e51;
import l.f30;
import l.f6c0;
import l.j760;
import l.ogl0;
import l.ool0;
import l.swh0;
import l.t7m;
import l.upa;
import l.vwb;
import l.wsf0;
import l.xzc0;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ji50 implements ool0 {

    /* JADX INFO: renamed from: a */
    public final NewNewHomeFrag f13781a;

    /* JADX INFO: renamed from: b */
    public OnlineMatchBaseCardView f13782b;

    /* JADX INFO: renamed from: c */
    public CoreSuggested.UserInfo f13783c;

    /* JADX INFO: renamed from: d */
    public User f13784d;

    public ji50(NewNewHomeFrag newNewHomeFrag) {
        this.f13781a = newNewHomeFrag;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m15945m(PurchaseType purchaseType) {
    }

    /* JADX INFO: renamed from: d */
    public View m15948d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return ogl0.R() ? layoutInflater.inflate(f6c0.sb, viewGroup, false) : layoutInflater.inflate(f6c0.qb, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: e */
    public void m15949e(View view, int i, VirtualCardType virtualCardType, final View view2) {
        if (view2 instanceof VSwipeCard) {
            ((VSwipeCard) view2).O0(false);
            view2.postDelayed(new Runnable() { // from class: l.di50
                @Override // java.lang.Runnable
                public final void run() {
                    ((VSwipeCard) view2).O0(true);
                }
            }, 1000L);
        }
        this.f13782b = (OnlineMatchBaseCardView) view;
        PartialListOpt partialListOpt = (PartialListOpt) CoreModule.c.m0.a0.e();
        if (!vwb.J(partialListOpt.loaded)) {
            this.f13783c = (CoreSuggested.UserInfo) partialListOpt.loaded.get(i);
        }
        User user = this.f13783c.quickChatCardWrapper.getUser();
        this.f13784d = user;
        if (NullChecker.b(user)) {
            this.f13782b.mo737f(this.f13783c.quickChatCardWrapper, new f30() { // from class: l.ei50
                public final void call(Object obj, Object obj2) {
                    this.f9800a.m15955q((Boolean) obj, (String) obj2);
                }
            });
        }
        C0034a.f492f = true;
        if (i == 0) {
            this.f13781a.C.P2();
        }
    }

    /* JADX INFO: renamed from: f */
    public boolean m15950f() {
        return true;
    }

    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult m15951g(SwipeDirection swipeDirection, t7m t7mVar) {
        SwipeDirection swipeDirection2 = SwipeDirection.LEFT;
        if (swipeDirection != swipeDirection2 && swipeDirection != SwipeDirection.RIGHT) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        CoreModule.c.m0.O5();
        if (swipeDirection == swipeDirection2) {
            this.f13783c.quickChatCardWrapper.getInsertCard();
            if (this.f13783c.isInitiateQuickChat()) {
                CoreModule.c.D0.K4(this.f13783c.quickChatCardWrapper.getInsertCard().secretKey);
            } else {
                CoreModule.c.D0.L4(this.f13783c.quickChatCardWrapper.getBroadcastCard());
            }
        } else {
            VSwipeStack.OnCardSwipeResult onCardSwipeResultM15957s = m15957s(this.f13781a.C.A2(), false, null);
            if (onCardSwipeResultM15957s != VSwipeStack.OnCardSwipeResult.pass) {
                return onCardSwipeResultM15957s;
            }
        }
        this.f13783c.quickChatCardWrapper.markAsConsumed();
        m15952n();
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: n */
    public final void m15952n() {
        C0034a.f492f = false;
        this.f13781a.C.e6();
    }

    /* JADX INFO: renamed from: o */
    public final String m15953o() {
        return "p_home,quickchat_card";
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m15954p() {
        this.f13783c.quickChatCardWrapper.markAsConsumed();
        CoreModule.c.m0.C8("online_card_adapter_render");
        m15952n();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m15955q(Boolean bool, String str) {
        this.f13781a.C.A2().d();
        zvf0.u("e_card_quickchat", "p_suggest_users_home_view", new j760[]{vwb.Y("other_user_id", ((DbObject) this.f13784d).id), vwb.Y("direction", "like"), vwb.Y("is_emoji", bool)});
        if (m15957s(this.f13781a.C.A2(), true, str) == VSwipeStack.OnCardSwipeResult.pass) {
            e51.I(this.f13781a, new Runnable() { // from class: l.ii50
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13261a.m15954p();
                }
            }, 200L);
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m15956r() {
        this.f13781a.B.W8(true);
        swh0.p0().W0();
        this.f13781a.C.A2().A(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: s */
    public final VSwipeStack.OnCardSwipeResult m15957s(final wsf0 wsf0Var, boolean z, String str) {
        C0034a.m677b0();
        CoreModule.c.C0.u4();
        boolean z2 = swh0.E0() && swh0.K();
        User userP9 = CoreModule.c.e0.p9();
        if (NullChecker.a(this.f13783c.quickChatCardWrapper.getBroadcastCard()) && this.f13783c.quickChatCardWrapper.getBroadcastCard().isMaleQuickChatRing && upa.c2() && NullChecker.a(userP9) && !userP9.isFemale()) {
            C0034a.m651D(this.f13781a.Y4(), this.f13783c.quickChatCardWrapper.getBroadcastCard(), z2, null, !z, str);
        } else {
            if (swh0.s0() <= 0) {
                C0189c.m4048p1(this.f13781a.Y4(), new e30() { // from class: l.fi50
                    public final void call(Object obj) {
                        ji50.m15945m((PurchaseType) obj);
                    }
                }, C0034a.m705p0(), m15953o(), ((DbObject) this.f13784d).id);
                return VSwipeStack.OnCardSwipeResult.back;
            }
            if (z2 && swh0.p0().g1() && !this.f13781a.B.o6()) {
                swh0.B1(this.f13781a.Y4(), PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA, new d30() { // from class: l.gi50
                    public final void call() {
                        this.f11447a.m15956r();
                    }
                }, new d30() { // from class: l.hi50
                    public final void call() {
                        wsf0Var.y();
                    }
                });
                return VSwipeStack.OnCardSwipeResult.stay;
            }
            this.f13781a.B.W8(false);
            boolean zIsInitiateQuickChat = this.f13783c.isInitiateQuickChat();
            NewNewHomeFrag newNewHomeFrag = this.f13781a;
            if (zIsInitiateQuickChat) {
                xzc0.q0(newNewHomeFrag.Y4(), this.f13783c.quickChatCardWrapper.getInsertCard(), z2, z, str);
            } else {
                C0034a.m651D(newNewHomeFrag.Y4(), this.f13783c.quickChatCardWrapper.getBroadcastCard(), z2, null, !z, str);
            }
        }
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: b */
    public void m15946b(VSwipeCard vSwipeCard) {
    }

    /* JADX INFO: renamed from: c */
    public void m15947c(View view) {
    }
}
