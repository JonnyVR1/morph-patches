package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreSuggested;
import com.p051p1.mobile.putong.core.card.VSwipeCard;
import com.p051p1.mobile.putong.core.card.VSwipeStack;
import com.p051p1.mobile.putong.core.data.CoreData;
import com.p051p1.mobile.putong.core.data.PartialListOpt;
import com.p051p1.mobile.putong.core.data.SwipeDirection;
import com.p051p1.mobile.putong.core.data.VirtualCardType;
import com.p051p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p051p1.mobile.putong.core.p058ui.impresssignal.ImpressSignalCardNewUIView;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.C8772a;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes3.dex */
public class snm implements sxl0 {

    /* JADX INFO: renamed from: a */
    public NewNewHomeFrag f169736a;

    /* JADX INFO: renamed from: b */
    public ImpressSignalCardNewUIView f169737b;

    /* JADX INFO: renamed from: c */
    public CoreSuggested.UserInfo f169738c;

    /* JADX INFO: renamed from: d */
    public Boolean f169739d;

    /* JADX INFO: renamed from: e */
    public Boolean f169740e;

    public snm(NewNewHomeFrag newNewHomeFrag) {
        Boolean bool = Boolean.FALSE;
        this.f169739d = bool;
        this.f169740e = bool;
        this.f169736a = newNewHomeFrag;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m186989k(Throwable th) {
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: d */
    public View mo31009d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(kec0.f125995p4, viewGroup, false);
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: e */
    public void mo31010e(View view, int i, VirtualCardType virtualCardType, View view2) {
        if (NullChecker.m82486a(this.f169736a) && NullChecker.m82486a(this.f169736a.f22420C)) {
            this.f169736a.f22420C.m38207P2();
            if (view instanceof ImpressSignalCardNewUIView) {
                this.f169737b = (ImpressSignalCardNewUIView) view;
                PartialListOpt<CoreSuggested.UserInfo> partialListOptM222761e = CoreModule.f18264c.f20405m0.f20136a0.m222761e();
                if (!jyb.m147479J(partialListOptM222761e.loaded) && i < partialListOptM222761e.loaded.size()) {
                    this.f169738c = partialListOptM222761e.loaded.get(i);
                }
                if (NullChecker.m82486a(this.f169738c)) {
                    this.f169737b.m47318v(this.f169736a, this, this.f169738c.impressSignalCardWrapper);
                }
            }
        }
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: f */
    public boolean mo31011f() {
        return false;
    }

    @Override // p153l.sxl0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo31012g(SwipeDirection swipeDirection, jam jamVar) {
        String str;
        boolean z = swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
        Boolean bool = Boolean.FALSE;
        this.f169740e = bool;
        if (NullChecker.m82486a(this.f169738c) && NullChecker.m82486a(this.f169738c.impressSignalCardWrapper) && NullChecker.m82486a(this.f169738c.impressSignalCardWrapper.getPushCustom())) {
            SwipeDirection swipeDirection2 = SwipeDirection.LEFT;
            if (swipeDirection == swipeDirection2) {
                str = BLiveGiftBubblePopupTitlePosition.left;
            } else {
                str = swipeDirection == swipeDirection2 ? "right" : "up";
            }
            i4g0.m138525w("e_love_signal_card", "p_suggest_users_home_view", jyb.m147494Y("receiver_user_id", this.f169738c.impressSignalCardWrapper.getPushCustom().userId), jyb.m147494Y("remainingtimes", Integer.valueOf(C8772a.m51429b0())), jyb.m147494Y("love_sign_content", ""), jyb.m147494Y("swipe_directions", str), jyb.m147494Y("signal_resource", Integer.valueOf(upm.m197120Q())), jyb.m147494Y("accept_duration", "" + (pzi0.m174454o() - this.f169737b.f30606u)));
        }
        gra.m131594L1();
        if (z) {
            if (this.f169739d.booleanValue()) {
                this.f169739d = bool;
                m186990l();
            } else if (upm.m197108E(this.f169736a.act()) && NullChecker.m82486a(this.f169738c) && NullChecker.m82486a(this.f169738c.impressSignalCardWrapper) && NullChecker.m82486a(this.f169738c.impressSignalCardWrapper.getPushCustom()) && this.f169736a.act() != null) {
                this.f169736a.act().duringCreated(CoreModule.f18264c.f20313H1.m123929v3(this.f169738c.impressSignalCardWrapper.getPushCustom().tracker)).subscribe(psd0.m173597H(new y20() { // from class: l.onm
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f148096a.m186992n((Envelope) obj);
                    }
                }, new y20() { // from class: l.pnm
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        r1j0.m179420g("网络异常！");
                    }
                }));
            }
        } else if (NullChecker.m82486a(this.f169738c) && NullChecker.m82486a(this.f169738c.impressSignalCardWrapper) && NullChecker.m82486a(this.f169738c.impressSignalCardWrapper.getPushCustom())) {
            CoreModule.f18264c.f20313H1.m123919Y3(this.f169738c.impressSignalCardWrapper.getPushCustom().tracker);
        }
        this.f169736a.f22420C.m38289e6();
        upm.m197113J(TabName.Card);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: l */
    public final void m186990l() {
        this.f169736a.act().startActivity(MessagesAct.m50131p2(this.f169736a.act(), this.f169738c.impressSignalCardWrapper.userId, false, false, false, false, null, 34));
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m186991m(uxj0 uxj0Var) {
        m186990l();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m186992n(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (NullChecker.m82486a(coreData) && NullChecker.m82486a(coreData.heartbeatMatch) && coreData.heartbeatMatch.matched) {
            this.f169736a.act().duringCreated(CoreModule.f18264c.f20384f0.m33905ap(this.f169738c.impressSignalCardWrapper.getPushCustom().userId)).subscribe(psd0.m173597H(new y20() { // from class: l.qnm
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f158497a.m186991m((uxj0) obj);
                }
            }, new y20() { // from class: l.rnm
                @Override // p153l.y20
                public final void call(Object obj) {
                    snm.m186989k((Throwable) obj);
                }
            }));
        } else {
            r1j0.m179420g("对方信号波动，暂时无法接收");
        }
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
