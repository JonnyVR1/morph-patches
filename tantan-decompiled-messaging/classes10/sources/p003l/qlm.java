package p003l;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p000p1.mobile.putong.core.data.CoreData;
import com.p000p1.mobile.putong.core.data.PartialListOpt;
import com.p000p1.mobile.putong.core.data.SwipeDirection;
import com.p000p1.mobile.putong.core.data.VirtualCardType;
import com.p000p1.mobile.putong.core.p001ui.impresssignal.ImpressSignalCardNewUIView;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreSuggested;
import com.p1.mobile.putong.core.card.VSwipeCard;
import com.p1.mobile.putong.core.card.VSwipeStack;
import com.p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.onlinematch.a;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.f6c0;
import l.j760;
import l.mkd0;
import l.mqi0;
import l.osi0;
import l.roj0;
import l.upa;
import l.vwb;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class qlm implements ool0 {

    /* JADX INFO: renamed from: a */
    public NewNewHomeFrag f7037a;

    /* JADX INFO: renamed from: b */
    public ImpressSignalCardNewUIView f7038b;

    /* JADX INFO: renamed from: c */
    public CoreSuggested.UserInfo f7039c;

    /* JADX INFO: renamed from: d */
    public Boolean f7040d;

    /* JADX INFO: renamed from: e */
    public Boolean f7041e;

    public qlm(NewNewHomeFrag newNewHomeFrag) {
        Boolean bool = Boolean.FALSE;
        this.f7040d = bool;
        this.f7041e = bool;
        this.f7037a = newNewHomeFrag;
    }

    /* JADX INFO: renamed from: k */
    public static /* synthetic */ void m9016k(Throwable th) {
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: d */
    public View mo5288d(LayoutInflater layoutInflater, ViewGroup viewGroup, VirtualCardType virtualCardType) {
        return layoutInflater.inflate(f6c0.p4, viewGroup, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p003l.ool0
    /* JADX INFO: renamed from: e */
    public void mo5289e(View view, int i, VirtualCardType virtualCardType, View view2) {
        if (NullChecker.a(this.f7037a) && NullChecker.a(this.f7037a.C)) {
            this.f7037a.C.P2();
            if (view instanceof ImpressSignalCardNewUIView) {
                this.f7038b = (ImpressSignalCardNewUIView) view;
                PartialListOpt partialListOpt = (PartialListOpt) CoreModule.c.m0.a0.e();
                if (!vwb.J(partialListOpt.loaded) && i < partialListOpt.loaded.size()) {
                    this.f7039c = (CoreSuggested.UserInfo) partialListOpt.loaded.get(i);
                }
                if (NullChecker.a(this.f7039c)) {
                    this.f7038b.m3500v(this.f7037a, this, this.f7039c.impressSignalCardWrapper);
                }
            }
        }
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: f */
    public boolean mo5290f() {
        return false;
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: g */
    public VSwipeStack.OnCardSwipeResult mo5291g(SwipeDirection swipeDirection, t7m t7mVar) {
        String str;
        boolean z = swipeDirection == SwipeDirection.RIGHT || swipeDirection == SwipeDirection.UP;
        Boolean bool = Boolean.FALSE;
        this.f7041e = bool;
        if (NullChecker.a(this.f7039c) && NullChecker.a(this.f7039c.impressSignalCardWrapper) && NullChecker.a(this.f7039c.impressSignalCardWrapper.getPushCustom())) {
            SwipeDirection swipeDirection2 = SwipeDirection.LEFT;
            if (swipeDirection == swipeDirection2) {
                str = "left";
            } else {
                str = swipeDirection == swipeDirection2 ? "right" : "up";
            }
            zvf0.w("e_love_signal_card", "p_suggest_users_home_view", new j760[]{vwb.Y("receiver_user_id", this.f7039c.impressSignalCardWrapper.getPushCustom().userId), vwb.Y("remainingtimes", Integer.valueOf(a.b0())), vwb.Y("love_sign_content", ""), vwb.Y("swipe_directions", str), vwb.Y("signal_resource", Integer.valueOf(snm.m9388Q())), vwb.Y("accept_duration", "" + (mqi0.o() - this.f7038b.f2152u))});
        }
        upa.L1();
        if (z) {
            if (this.f7040d.booleanValue()) {
                this.f7040d = bool;
                m9017l();
            } else if (snm.m9376E(this.f7037a.Y4()) && NullChecker.a(this.f7039c) && NullChecker.a(this.f7039c.impressSignalCardWrapper) && NullChecker.a(this.f7039c.impressSignalCardWrapper.getPushCustom()) && this.f7037a.Y4() != null) {
                this.f7037a.Y4().duringCreated(CoreModule.c.H1.v3(this.f7039c.impressSignalCardWrapper.getPushCustom().tracker)).subscribe(mkd0.H(new e30() { // from class: l.mlm
                    public final void call(Object obj) {
                        this.f6356a.m9019n((Envelope) obj);
                    }
                }, new e30() { // from class: l.nlm
                    public final void call(Object obj) {
                        osi0.g("网络异常！");
                    }
                }));
            }
        } else if (NullChecker.a(this.f7039c) && NullChecker.a(this.f7039c.impressSignalCardWrapper) && NullChecker.a(this.f7039c.impressSignalCardWrapper.getPushCustom())) {
            CoreModule.c.H1.Y3(this.f7039c.impressSignalCardWrapper.getPushCustom().tracker);
        }
        this.f7037a.C.e6();
        snm.m9381J(TabName.Card);
        return VSwipeStack.OnCardSwipeResult.pass;
    }

    /* JADX INFO: renamed from: l */
    public final void m9017l() {
        this.f7037a.Y4().startActivity(MessagesAct.o2(this.f7037a.Y4(), this.f7039c.impressSignalCardWrapper.userId, false, false, false, false, (Intent) null, 34));
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m9018m(roj0 roj0Var) {
        m9017l();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m9019n(Envelope envelope) {
        CoreData coreData = (CoreData) envelope.getModuleData(CoreData.class);
        if (NullChecker.a(coreData) && NullChecker.a(coreData.heartbeatMatch) && coreData.heartbeatMatch.matched) {
            this.f7037a.Y4().duringCreated(CoreModule.c.f0.ap(this.f7039c.impressSignalCardWrapper.getPushCustom().userId)).subscribe(mkd0.H(new e30() { // from class: l.olm
                public final void call(Object obj) {
                    this.f6680a.m9018m((roj0) obj);
                }
            }, new e30() { // from class: l.plm
                public final void call(Object obj) {
                    qlm.m9016k((Throwable) obj);
                }
            }));
        } else {
            osi0.g("对方信号波动，暂时无法接收");
        }
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: b */
    public void mo5286b(VSwipeCard vSwipeCard) {
    }

    @Override // p003l.ool0
    /* JADX INFO: renamed from: c */
    public void mo5287c(View view) {
    }
}
