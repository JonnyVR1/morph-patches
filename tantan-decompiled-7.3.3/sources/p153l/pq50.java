package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.view.OnlineMatchBaseCardView;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class pq50 implements sxl0 {

    /* JADX INFO: renamed from: a */
    public final NewNewHomeFrag f153635a;

    /* JADX INFO: renamed from: b */
    public OnlineMatchBaseCardView f153636b;

    /* JADX INFO: renamed from: c */
    public CoreSuggested.UserInfo f153637c;

    /* JADX INFO: renamed from: d */
    public User f153638d;

    public pq50(NewNewHomeFrag newNewHomeFrag) {
        this.f153635a = newNewHomeFrag;
    }

    /* JADX INFO: renamed from: m */
    public static /* synthetic */ void m173317m(PurchaseType purchaseType) {
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: d */
    public View mo31009d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return spl0.m187366R() ? layoutInflater.inflate(kec0.f126172zb, viewGroup, false) : layoutInflater.inflate(kec0.f126138xb, viewGroup, false);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(View view, int i, VirtualCardType virtualCardType, final View view2) {
        if (view2 instanceof VSwipeCard) {
            ((VSwipeCard) view2).m36150O0(false);
            view2.postDelayed(new Runnable() { // from class: l.jq50
                @Override // java.lang.Runnable
                public final void run() {
                    ((VSwipeCard) view2).m36150O0(true);
                }
            }, 1000L);
        }
        this.f153636b = (OnlineMatchBaseCardView) view;
        PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = CoreModule.f18264c.f20405m0.f20136a0.m222761e();
        if (!jyb.m147479J(partialListOptM222761e.loaded)) {
            this.f153637c = partialListOptM222761e.loaded.get(i);
        }
        User user = this.f153637c.quickChatCardWrapper.getUser();
        this.f153638d = user;
        if (NullChecker.m82487b(user)) {
            this.f153636b.mo51489f(this.f153637c.quickChatCardWrapper, new z20() { // from class: l.kq50
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    this.f128175a.m173321q((Boolean) obj, (String) obj2);
                }
            });
        }
        C8772a.f33518f = true;
        if (i == 0) {
            this.f153635a.f22420C.m38207P2();
        }
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: f */
    public boolean mo31011f() {
        return true;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo31012g(SwipeDirection swipeDirection, jam jamVar) {
        SwipeDirection swipeDirection2 = SwipeDirection.LEFT;
        if (swipeDirection != swipeDirection2 && swipeDirection != SwipeDirection.RIGHT) {
            return VSwipeStack.OnCardSwipeResult.back;
        }
        CoreModule.f18264c.f20405m0.m32034O5();
        if (swipeDirection == swipeDirection2) {
            this.f153637c.quickChatCardWrapper.getInsertCard();
            if (this.f153637c.isInitiateQuickChat()) {
                CoreModule.f18264c.f20300D0.m35838K4(this.f153637c.quickChatCardWrapper.getInsertCard().secretKey);
            } else {
                CoreModule.f18264c.f20300D0.m35839L4(this.f153637c.quickChatCardWrapper.getBroadcastCard());
            }
        } else {
            VSwipeStack.OnCardSwipeResult onCardSwipeResultM173323s = m173323s(this.f153635a.f22420C.m38128A2(), false, null);
            if (onCardSwipeResultM173323s != VSwipeStack.OnCardSwipeResult.pass) {
                return onCardSwipeResultM173323s;
            }
        }
        this.f153637c.quickChatCardWrapper.markAsConsumed();
        m173318n();
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: n */
    public final void m173318n() {
        C8772a.f33518f = false;
        this.f153635a.f22420C.m38289e6();
    }

    /* JADX INFO: renamed from: o */
    public final String m173319o() {
        return "p_home,quickchat_card";
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m173320p() {
        this.f153637c.quickChatCardWrapper.markAsConsumed();
        CoreModule.f18264c.f20405m0.m31989C8("online_card_adapter_render");
        m173318n();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m173321q(Boolean bool, String str) {
        this.f153635a.f22420C.m38128A2().mo39812d();
        i4g0.m138523u("e_card_quickchat", "p_suggest_users_home_view", jyb.m147494Y("other_user_id", this.f153638d.f56859id), jyb.m147494Y("direction", "like"), jyb.m147494Y("is_emoji", bool));
        if (m173323s(this.f153635a.f22420C.m38128A2(), true, str) == VSwipeStack.OnCardSwipeResult.pass) {
            l51.m152889I(this.f153635a, new Runnable() { // from class: l.oq50
                @Override // java.lang.Runnable
                public final void run() {
                    this.f148548a.m173320p();
                }
            }, 200L);
        }
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m173322r() {
        this.f153635a.f22419B.m101970W8(true);
        a5i0.m96160p0().m96208W0();
        this.f153635a.f22420C.m38128A2().mo39804A(SwipeDirection.RIGHT);
    }

    /* JADX INFO: renamed from: s */
    public final VSwipeStack.OnCardSwipeResult m173323s(final f1g0 f1g0Var, boolean z, String str) {
        C8772a.m51429b0();
        CoreModule.f18264c.f20297C0.m146425v4();
        boolean z2 = a5i0.m96091E0() && a5i0.m96106K();
        User userM116600p9 = CoreModule.f18264c.f20381e0.m116600p9();
        if (NullChecker.m82486a(this.f153637c.quickChatCardWrapper.getBroadcastCard()) && this.f153637c.quickChatCardWrapper.getBroadcastCard().isMaleQuickChatRing && gra.m131666c2() && NullChecker.m82486a(userM116600p9) && !userM116600p9.isFemale()) {
            C8772a.m51403D(this.f153635a.act(), this.f153637c.quickChatCardWrapper.getBroadcastCard(), z2, null, !z, str);
        } else {
            if (a5i0.m96168s0() <= 0) {
                C8927c.m54665p1(this.f153635a.act(), new y20() { // from class: l.lq50
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        pq50.m173317m((PurchaseType) obj);
                    }
                }, C8772a.m51457p0(), m173319o(), this.f153638d.f56859id);
                return VSwipeStack.OnCardSwipeResult.back;
            }
            if (z2 && a5i0.m96160p0().m96218g1() && !this.f153635a.f22419B.m102053o6()) {
                a5i0.m96085B1(this.f153635a.act(), PurchaseType.TYPE_GET_ONLINE_MATCH_TICKETS_EXTRA, new x20() { // from class: l.mq50
                    @Override // p153l.x20
                    public final void call() {
                        this.f138006a.m173322r();
                    }
                }, new x20() { // from class: l.nq50
                    @Override // p153l.x20
                    public final void call() {
                        f1g0Var.mo39825y();
                    }
                });
                return VSwipeStack.OnCardSwipeResult.stay;
            }
            this.f153635a.f22419B.m101970W8(false);
            boolean zIsInitiateQuickChat = this.f153637c.isInitiateQuickChat();
            NewNewHomeFrag newNewHomeFrag = this.f153635a;
            if (zIsInitiateQuickChat) {
                a8d0.m96433q0(newNewHomeFrag.act(), this.f153637c.quickChatCardWrapper.getInsertCard(), z2, z, str);
            } else {
                C8772a.m51403D(newNewHomeFrag.act(), this.f153637c.quickChatCardWrapper.getBroadcastCard(), z2, null, !z, str);
            }
        }
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: b */
    public void mo31007b(VSwipeCard vSwipeCard) {
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: c */
    public void mo31008c(View view) {
    }
}
