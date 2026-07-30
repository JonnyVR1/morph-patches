package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.livingroom.archi.frag.LiveScrollViewContainer;
import com.p051p1.mobile.putong.live.livingroom.archi.frag.RoomIndicatorView;
import com.p051p1.mobile.putong.live.livingroom.base.room.RoomScrollGuideView;
import com.p051p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p051p1.mobile.putong.live.livingroom.other.side.LiveSideView;
import com.p051p1.mobile.putong.live.livingroom.view.LiveScrollView;
import com.p051p1.mobile.putong.live.livingroom.view.RightSideViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public class rgd0 implements iam<ogd0> {

    /* JADX INFO: renamed from: a */
    public RightSideViewGroup f162993a;

    /* JADX INFO: renamed from: b */
    public LiveScrollView f162994b;

    /* JADX INFO: renamed from: c */
    public ViewStub f162995c;

    /* JADX INFO: renamed from: d */
    public LiveSideView f162996d;

    /* JADX INFO: renamed from: e */
    public RoomScrollGuideView f162997e;

    /* JADX INFO: renamed from: f */
    public ogd0 f162998f;

    /* JADX INFO: renamed from: l.rgd0$a */
    public class C19841a implements LiveScrollView.InterfaceC13095b {
        public C19841a() {
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.view.LiveScrollView.InterfaceC13095b
        /* JADX INFO: renamed from: a */
        public void mo77752a(boolean z) {
            ((RoomIndicatorView) rgd0.this.f162994b.getIndicatorView()).m72997d(z);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.view.LiveScrollView.InterfaceC13095b
        /* JADX INFO: renamed from: b */
        public void mo77753b() {
            ((RoomIndicatorView) rgd0.this.f162994b.getIndicatorView()).m72996c();
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.view.LiveScrollView.InterfaceC13095b
        /* JADX INFO: renamed from: c */
        public boolean mo77754c(boolean z) {
            pf60<Boolean, BLiveAbsData> pf60VarM167576m1 = rgd0.this.f162998f.m167576m1(z);
            ((RoomIndicatorView) rgd0.this.f162994b.getIndicatorView()).m72995b(z, pf60VarM167576m1);
            return pf60VarM167576m1.f152156a.booleanValue();
        }
    }

    /* JADX INFO: renamed from: l.rgd0$b */
    public class C19842b implements LiveScrollView.InterfaceC13096c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f163000a;

        public C19842b(Act act) {
            this.f163000a = act;
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.view.LiveScrollView.InterfaceC13096c
        /* JADX INFO: renamed from: a */
        public void mo77755a(boolean z, LiveScrollViewContainer liveScrollViewContainer, boolean z2, JumpRoomData jumpRoomData) {
            if (this.f163000a.lifecycle_() == null || !this.f163000a.lifecycle_().f16274a) {
                return;
            }
            rgd0.this.f162998f.m167539B1(z, liveScrollViewContainer, z2, jumpRoomData);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.view.LiveScrollView.InterfaceC13096c
        /* JADX INFO: renamed from: b */
        public boolean mo77756b() {
            return !rgd0.this.f162998f.m167555P0(4);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.view.LiveScrollView.InterfaceC13096c
        /* JADX INFO: renamed from: c */
        public void mo77757c() {
            rgd0.this.f162998f.m167568e1(6);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.view.LiveScrollView.InterfaceC13096c
        /* JADX INFO: renamed from: d */
        public boolean mo77758d(boolean z) {
            return rgd0.this.f162998f.m167576m1(z).f152156a.booleanValue();
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.view.LiveScrollView.InterfaceC13096c
        /* JADX INFO: renamed from: e */
        public void mo77759e(boolean z) {
            rgd0.this.f162998f.m167578o1(z);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.view.LiveScrollView.InterfaceC13096c
        /* JADX INFO: renamed from: f */
        public boolean mo77760f() {
            return rgd0.this.f162998f.m167586t0();
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.view.LiveScrollView.InterfaceC13096c
        /* JADX INFO: renamed from: g */
        public void mo77761g() {
            rgd0.this.f162998f.m167568e1(1);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.view.LiveScrollView.InterfaceC13096c
        /* JADX INFO: renamed from: h */
        public void mo77762h(LiveScrollViewContainer liveScrollViewContainer, boolean z) {
            rgd0.this.f162998f.m167585s1(liveScrollViewContainer, z);
        }

        @Override // com.p051p1.mobile.putong.live.livingroom.view.LiveScrollView.InterfaceC13096c
        /* JADX INFO: renamed from: i */
        public void mo77763i() {
            rgd0.this.f162998f.m167583r1();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m181407b(LiveScrollViewContainer liveScrollViewContainer) {
        if (liveScrollViewContainer.getPresenter() != null) {
            liveScrollViewContainer.getPresenter().mo120629s2();
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return m181413j().getContext();
    }

    /* JADX INFO: renamed from: d */
    public View m181409d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return sgd0.m185769b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    public void destroy() {
        this.f162994b.m77749z(new y20() { // from class: l.qgd0
            @Override // p153l.y20
            public final void call(Object obj) {
                rgd0.m181407b((LiveScrollViewContainer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m181410e(RightSideViewGroup.InterfaceC13102c interfaceC13102c) {
        this.f162993a.m77798G(interfaceC13102c);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ogd0 ogd0Var) {
        this.f162998f = ogd0Var;
    }

    /* JADX INFO: renamed from: i */
    public LiveScrollViewContainer m181412i() {
        return this.f162994b.getBackupView();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM181409d = m181409d(layoutInflater, viewGroup);
        this.f162993a.m77798G(new RightSideViewGroup.InterfaceC13102c() { // from class: l.pgd0
            @Override // com.p051p1.mobile.putong.live.livingroom.view.RightSideViewGroup.InterfaceC13102c
            /* JADX INFO: renamed from: d */
            public final void mo77812d(boolean z) {
                this.f152255a.m181419q(z);
            }
        });
        return viewM181409d;
    }

    /* JADX INFO: renamed from: j */
    public LiveScrollViewContainer m181413j() {
        return this.f162994b.getCurrentView();
    }

    /* JADX INFO: renamed from: k */
    public RightSideViewGroup.C13103d m181414k() {
        return this.f162993a.getViewStates();
    }

    /* JADX INFO: renamed from: l */
    public boolean m181415l() {
        RoomScrollGuideView roomScrollGuideView = this.f162997e;
        return roomScrollGuideView != null && roomScrollGuideView.m73178h();
    }

    /* JADX INFO: renamed from: m */
    public void m181416m() {
        this.f162997e.m73176f();
    }

    /* JADX INFO: renamed from: n */
    public void m181417n(Act act) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f162994b.m77733A();
        this.f162998f.m167577n1();
        nsh0.m164608j("[live]quickPlay", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        this.f162994b.setIndicatorView((RoomIndicatorView) View.inflate(act, yec0.f199165m5, null));
        this.f162994b.setOnLiveScrollListener(new C19841a());
        this.f162994b.setOnViewListener(new C19842b(act));
    }

    /* JADX INFO: renamed from: p */
    public boolean m181418p() {
        return this.f162993a.getViewStates().m77824k();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m181419q(boolean z) {
        if (this.f162994b.getBackupView().getPresenter() != null) {
            this.f162994b.getBackupView().getPresenter().mo120626g4(z);
        }
        if (this.f162994b.getCurrentView().getPresenter() != null) {
            this.f162994b.getCurrentView().getPresenter().mo120626g4(z);
        }
        this.f162996d.m76758x(z);
    }

    /* JADX INFO: renamed from: s */
    public void m181420s(JumpRoomData jumpRoomData) {
        this.f162994b.m77741I(jumpRoomData);
    }

    /* JADX INFO: renamed from: u */
    public void m181421u(RightSideViewGroup.InterfaceC13102c interfaceC13102c) {
        this.f162993a.m77807S(interfaceC13102c);
    }

    /* JADX INFO: renamed from: v */
    public void m181422v(boolean z) {
        this.f162993a.setEnable(z);
    }

    /* JADX INFO: renamed from: w */
    public void m181423w(boolean z, boolean z2) {
        RightSideViewGroup rightSideViewGroup = this.f162993a;
        if (z) {
            rightSideViewGroup.m77808T(z2);
        } else {
            rightSideViewGroup.m77800L(z2);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m181424x(float f) {
        this.f162994b.m77742J(f);
    }

    /* JADX INFO: renamed from: y */
    public void m181425y(int i) {
        if (this.f162997e == null) {
            this.f162997e = (RoomScrollGuideView) this.f162995c.inflate();
        }
        this.f162997e.m73177g(this, this.f162998f);
        this.f162997e.m73184n(i);
    }

    /* JADX INFO: renamed from: z */
    public void m181426z() {
        this.f162994b.m77743K();
    }
}
