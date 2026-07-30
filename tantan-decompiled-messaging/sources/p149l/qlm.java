package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreSuggested;
import com.p046p1.mobile.putong.core.card.VSwipeCard;
import com.p046p1.mobile.putong.core.card.VSwipeStack;
import com.p046p1.mobile.putong.core.data.CoreData;
import com.p046p1.mobile.putong.core.data.PartialListOpt;
import com.p046p1.mobile.putong.core.data.SwipeDirection;
import com.p046p1.mobile.putong.core.data.VirtualCardType;
import com.p046p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p046p1.mobile.putong.core.p053ui.impresssignal.ImpressSignalCardNewUIView;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.C8609a;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftBubblePopupTitlePosition;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes10.dex */
public class qlm implements ool0 {

    /* JADX INFO: renamed from: a */
    public NewNewHomeFrag f155241a;

    /* JADX INFO: renamed from: b */
    public ImpressSignalCardNewUIView f155242b;

    /* JADX INFO: renamed from: c */
    public CoreSuggested.UserInfo f155243c;

    /* JADX INFO: renamed from: d */
    public Boolean f155244d;

    /* JADX INFO: renamed from: e */
    public Boolean f155245e;

    public qlm(NewNewHomeFrag newNewHomeFrag) {
        Boolean bool = Boolean.FALSE;
        this.f155244d = bool;
        this.f155245e = bool;
        this.f155241a = newNewHomeFrag;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m175495k(Throwable th) {
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: d */
    public View mo30011d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(f6c0.f95941p4, viewGroup, false);
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: e */
    public void mo30012e(View view, int i, VirtualCardType virtualCardType, View view2) {
        if (NullChecker.m81303a(this.f155241a) && NullChecker.m81303a(this.f155241a.f21678C)) {
            this.f155241a.f21678C.m37204P2();
            if (view instanceof ImpressSignalCardNewUIView) {
                this.f155242b = (ImpressSignalCardNewUIView) view;
                PartialListOpt<CoreSuggested.UserInfo> partialListOptM221515e = CoreModule.f17545c.f19663m0.f19394a0.m221515e();
                if (!vwb.m200296J(partialListOptM221515e.loaded) && i < partialListOptM221515e.loaded.size()) {
                    this.f155243c = partialListOptM221515e.loaded.get(i);
                }
                if (NullChecker.m81303a(this.f155243c)) {
                    this.f155242b.m46135v(this.f155241a, this, this.f155243c.impressSignalCardWrapper);
                }
            }
        }
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo30013f() {
        return false;
    }

    @Override // p149l.ool0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo30014g(SwipeDirection swipeDirection, t7m t7mVar) {
        String str;
        boolean z = swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
        Boolean bool = Boolean.FALSE;
        this.f155245e = bool;
        if (NullChecker.m81303a(this.f155243c) && NullChecker.m81303a(this.f155243c.impressSignalCardWrapper) && NullChecker.m81303a(this.f155243c.impressSignalCardWrapper.getPushCustom())) {
            SwipeDirection swipeDirection2 = SwipeDirection.LEFT;
            if (swipeDirection == swipeDirection2) {
                str = BLiveGiftBubblePopupTitlePosition.left;
            } else {
                str = swipeDirection == swipeDirection2 ? "right" : "up";
            }
            zvf0.m220401w("e_love_signal_card", "p_suggest_users_home_view", vwb.m200311Y("receiver_user_id", this.f155243c.impressSignalCardWrapper.getPushCustom().userId), vwb.m200311Y("remainingtimes", Integer.valueOf(C8609a.m50246b0())), vwb.m200311Y("love_sign_content", ""), vwb.m200311Y("swipe_directions", str), vwb.m200311Y("signal_resource", Integer.valueOf(snm.m185086Q())), vwb.m200311Y("accept_duration", "" + (mqi0.m155944o() - this.f155242b.f29758u)));
        }
        upa.m194663L1();
        if (z) {
            if (this.f155244d.booleanValue()) {
                this.f155244d = bool;
                m175496l();
            } else if (snm.m185074E(this.f155241a.act()) && NullChecker.m81303a(this.f155243c) && NullChecker.m81303a(this.f155243c.impressSignalCardWrapper) && NullChecker.m81303a(this.f155243c.impressSignalCardWrapper.getPushCustom()) && this.f155241a.act() != null) {
                this.f155241a.act().duringCreated(CoreModule.f17545c.f19571H1.m201076v3(this.f155243c.impressSignalCardWrapper.getPushCustom().tracker)).subscribe(mkd0.m154956H(new e30() { // from class: l.mlm
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f134456a.m175498n((Envelope) obj);
                    }
                }, new e30() { // from class: l.nlm
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        osi0.m165783g("网络异常！");
                    }
                }));
            }
        } else if (NullChecker.m81303a(this.f155243c) && NullChecker.m81303a(this.f155243c.impressSignalCardWrapper) && NullChecker.m81303a(this.f155243c.impressSignalCardWrapper.getPushCustom())) {
            CoreModule.f17545c.f19571H1.m201066Y3(this.f155243c.impressSignalCardWrapper.getPushCustom().tracker);
        }
        this.f155241a.f21678C.m37286e6();
        snm.m185079J(TabName.Card);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: l */
    public final void m175496l() {
        this.f155241a.act().startActivity(MessagesAct.m48948o2(this.f155241a.act(), this.f155243c.impressSignalCardWrapper.userId, false, false, false, false, null, 34));
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m175497m(roj0 roj0Var) {
        m175496l();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m175498n(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (NullChecker.m81303a(coreData) && NullChecker.m81303a(coreData.heartbeatMatch) && coreData.heartbeatMatch.matched) {
            this.f155241a.act().duringCreated(CoreModule.f17545c.f19642f0.m32902ap(this.f155243c.impressSignalCardWrapper.getPushCustom().userId)).subscribe(mkd0.m154956H(new e30() { // from class: l.olm
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f144518a.m175497m((roj0) obj);
                }
            }, new e30() { // from class: l.plm
                @Override // p149l.e30
                public final void call(Object obj) {
                    qlm.m175495k((Throwable) obj);
                }
            }));
        } else {
            osi0.m165783g("对方信号波动，暂时无法接收");
        }
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
