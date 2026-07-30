package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.PartialListOpt;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.view.OnlineMatchBaseCardView;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class ji50 implements ool0 {

    /* JADX INFO: renamed from: a */
    public final NewNewHomeFrag f118048a;

    /* JADX INFO: renamed from: b */
    public OnlineMatchBaseCardView f118049b;

    /* JADX INFO: renamed from: c */
    public CoreSuggested.UserInfo f118050c;

    /* JADX INFO: renamed from: d */
    public User f118051d;

    public ji50(NewNewHomeFrag newNewHomeFrag) {
        this.f118048a = newNewHomeFrag;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m141623m(PurchaseType purchaseType) {
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: d */
    public View mo30011d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return ogl0.m164239R() ? layoutInflater.inflate(f6c0.f95999sb, viewGroup, false) : layoutInflater.inflate(f6c0.f95965qb, viewGroup, false);
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(View view, int i, VirtualCardType virtualCardType, final View view2) {
        if (view2 instanceof VSwipeCard) {
            ((VSwipeCard) view2).m35147O0(false);
            view2.postDelayed(new Runnable() { // from class: l.di50
                @Override // java.lang.Runnable
                public final void run() {
                    ((VSwipeCard) view2).m35147O0(true);
                }
            }, 1000L);
        }
        this.f118049b = (OnlineMatchBaseCardView) view;
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e = CoreModule.f17545c.f19663m0.f19394a0.m221515e();
        if (!vwb.m200296J(partialListOptM221515e.loaded)) {
            this.f118050c = partialListOptM221515e.loaded.get(i);
        }
        User user = this.f118050c.quickChatCardWrapper.getUser();
        this.f118051d = user;
        if (NullChecker.m81304b(user)) {
            this.f118049b.mo50306f(this.f118050c.quickChatCardWrapper, new f30() { // from class: l.ei50
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    this.f91550a.m141627q((Boolean) obj, (String) obj2);
                }
            });
        }
        C8609a.f32670f = true;
        if (i == 0) {
            this.f118048a.f21678C.m37204P2();
        }
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo30013f() {
        return true;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo30014g(SwipeDirection swipeDirection, t7m t7mVar) {
        SwipeDirection swipeDirection2 = SwipeDirection.LEFT;
        if (swipeDirection != swipeDirection2 && swipeDirection != SwipeDirection.RIGHT) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        CoreModule.f17545c.f19663m0.m31031O5();
        if (swipeDirection == swipeDirection2) {
            this.f118050c.quickChatCardWrapper.getInsertCard();
            if (this.f118050c.isInitiateQuickChat()) {
                CoreModule.f17545c.f19558D0.m34835K4(this.f118050c.quickChatCardWrapper.getInsertCard().secretKey);
            } else {
                CoreModule.f17545c.f19558D0.m34836L4(this.f118050c.quickChatCardWrapper.getBroadcastCard());
            }
        } else {
            VSwipeStack.OnCardSwipeResult onCardSwipeResultM141629s = m141629s(this.f118048a.f21678C.m37125A2(), false, null);
            if (onCardSwipeResultM141629s != VSwipeStack.OnCardSwipeResult.pass) {
                return onCardSwipeResultM141629s;
            }
        }
        this.f118050c.quickChatCardWrapper.markAsConsumed();
        m141624n();
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: n */
    public final void m141624n() {
        C8609a.f32670f = false;
        this.f118048a.f21678C.m37286e6();
    }

    /* JADX INFO: renamed from: o */
    public final String m141625o() {
        return "p_home,quickchat_card";
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m141626p() {
        this.f118050c.quickChatCardWrapper.markAsConsumed();
        CoreModule.f17545c.f19663m0.m30986C8("online_card_adapter_render");
        m141624n();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m141627q(Boolean bool, String str) {
        this.f118048a.f21678C.m37125A2().mo38809d();
        zvf0.m220399u("e_card_quickchat", "p_suggest_users_home_view", vwb.m200311Y("other_user_id", this.f118051d.f56011id), vwb.m200311Y("direction", "like"), vwb.m200311Y("is_emoji", bool));
        if (m141629s(this.f118048a.f21678C.m37125A2(), true, str) == VSwipeStack.OnCardSwipeResult.pass) {
            e51.m114744I(this.f118048a, new Runnable() { // from class: l.ii50
                @Override // java.lang.Runnable
                public final void run() {
                    this.f113368a.m141626p();
                }
            }, 200L);
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m141628r() {
        this.f118048a.f21677B.m161176W8(true);
        swh0.m186255p0().m186303W0();
        this.f118048a.f21678C.m37125A2().mo38801A(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: s */
    public final VSwipeStack.OnCardSwipeResult m141629s(final wsf0 wsf0Var, boolean z, String str) {
        C8609a.m50246b0();
        CoreModule.f17545c.f19555C0.m210112u4();
        boolean z2 = swh0.m186186E0() && swh0.m186201K();
        User userM169527p9 = CoreModule.f17545c.f19639e0.m169527p9();
        if (NullChecker.m81303a(this.f118050c.quickChatCardWrapper.getBroadcastCard()) && this.f118050c.quickChatCardWrapper.getBroadcastCard().isMaleQuickChatRing && upa.m194735c2() && NullChecker.m81303a(userM169527p9) && !userM169527p9.isFemale()) {
            C8609a.m50220D(this.f118048a.act(), this.f118050c.quickChatCardWrapper.getBroadcastCard(), z2, null, !z, str);
        } else {
            if (swh0.m186263s0() <= 0) {
                C8764c.m53482p1(this.f118048a.act(), new e30() { // from class: l.fi50
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ji50.m141623m((PurchaseType) obj);
                    }
                }, C8609a.m50274p0(), m141625o(), this.f118051d.f56011id);
                return VSwipeStack.OnCardSwipeResult.back;
            }
            if (z2 && swh0.m186255p0().m186313g1() && !this.f118048a.f21677B.m161259o6()) {
                swh0.m186180B1(this.f118048a.act(), PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA, new d30() { // from class: l.gi50
                    @Override // p149l.d30
                    public final void call() {
                        this.f102842a.m141628r();
                    }
                }, new d30() { // from class: l.hi50
                    @Override // p149l.d30
                    public final void call() {
                        wsf0Var.mo38822y();
                    }
                });
                return VSwipeStack.OnCardSwipeResult.stay;
            }
            this.f118048a.f21677B.m161176W8(false);
            boolean zIsInitiateQuickChat = this.f118050c.isInitiateQuickChat();
            NewNewHomeFrag newNewHomeFrag = this.f118048a;
            if (zIsInitiateQuickChat) {
                xzc0.m211970q0(newNewHomeFrag.act(), this.f118050c.quickChatCardWrapper.getInsertCard(), z2, z, str);
            } else {
                C8609a.m50220D(newNewHomeFrag.act(), this.f118050c.quickChatCardWrapper.getBroadcastCard(), z2, null, !z, str);
            }
        }
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: b */
    public void mo30009b(VSwipeCard vSwipeCard) {
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: c */
    public void mo30010c(View view) {
    }
}
