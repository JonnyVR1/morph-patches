package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.livingroom.archi.frag.LiveScrollViewContainer;
import com.p046p1.mobile.putong.live.livingroom.archi.frag.RoomIndicatorView;
import com.p046p1.mobile.putong.live.livingroom.base.room.RoomScrollGuideView;
import com.p046p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p046p1.mobile.putong.live.livingroom.other.side.LiveSideView;
import com.p046p1.mobile.putong.live.livingroom.view.LiveScrollView;
import com.p046p1.mobile.putong.live.livingroom.view.RightSideViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public class o8d0 implements s7m<l8d0> {

    /* JADX INFO: renamed from: a */
    public RightSideViewGroup f142611a;

    /* JADX INFO: renamed from: b */
    public LiveScrollView f142612b;

    /* JADX INFO: renamed from: c */
    public ViewStub f142613c;

    /* JADX INFO: renamed from: d */
    public LiveSideView f142614d;

    /* JADX INFO: renamed from: e */
    public RoomScrollGuideView f142615e;

    /* JADX INFO: renamed from: f */
    public l8d0 f142616f;

    /* JADX INFO: renamed from: l.o8d0$a */
    public class C18871a implements LiveScrollView.InterfaceC12932b {
        public C18871a() {
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.view.LiveScrollView.InterfaceC12932b
        /* JADX INFO: renamed from: a */
        public void mo76569a(boolean z) {
            ((RoomIndicatorView) o8d0.this.f142612b.getIndicatorView()).m71814d(z);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.view.LiveScrollView.InterfaceC12932b
        /* JADX INFO: renamed from: b */
        public void mo76570b() {
            ((RoomIndicatorView) o8d0.this.f142612b.getIndicatorView()).m71813c();
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.view.LiveScrollView.InterfaceC12932b
        /* JADX INFO: renamed from: c */
        public boolean mo76571c(boolean z) {
            j760<Boolean, BLiveAbsData> j760VarM148901m1 = o8d0.this.f142616f.m148901m1(z);
            ((RoomIndicatorView) o8d0.this.f142612b.getIndicatorView()).m71812b(z, j760VarM148901m1);
            return j760VarM148901m1.f116564a.booleanValue();
        }
    }

    /* JADX INFO: renamed from: l.o8d0$b */
    public class C18872b implements LiveScrollView.InterfaceC12933c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f142618a;

        public C18872b(Act act) {
            this.f142618a = act;
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.view.LiveScrollView.InterfaceC12933c
        /* JADX INFO: renamed from: a */
        public void mo76572a(boolean z, LiveScrollViewContainer liveScrollViewContainer, boolean z2, JumpRoomData jumpRoomData) {
            if (this.f142618a.lifecycle_() == null || !this.f142618a.lifecycle_().f15555a) {
                return;
            }
            o8d0.this.f142616f.m148864B1(z, liveScrollViewContainer, z2, jumpRoomData);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.view.LiveScrollView.InterfaceC12933c
        /* JADX INFO: renamed from: b */
        public boolean mo76573b() {
            return !o8d0.this.f142616f.m148880P0(4);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.view.LiveScrollView.InterfaceC12933c
        /* JADX INFO: renamed from: c */
        public void mo76574c() {
            o8d0.this.f142616f.m148893e1(6);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.view.LiveScrollView.InterfaceC12933c
        /* JADX INFO: renamed from: d */
        public boolean mo76575d(boolean z) {
            return o8d0.this.f142616f.m148901m1(z).f116564a.booleanValue();
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.view.LiveScrollView.InterfaceC12933c
        /* JADX INFO: renamed from: e */
        public void mo76576e(boolean z) {
            o8d0.this.f142616f.m148903o1(z);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.view.LiveScrollView.InterfaceC12933c
        /* JADX INFO: renamed from: f */
        public boolean mo76577f() {
            return o8d0.this.f142616f.m148911t0();
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.view.LiveScrollView.InterfaceC12933c
        /* JADX INFO: renamed from: g */
        public void mo76578g() {
            o8d0.this.f142616f.m148893e1(1);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.view.LiveScrollView.InterfaceC12933c
        /* JADX INFO: renamed from: h */
        public void mo76579h(LiveScrollViewContainer liveScrollViewContainer, boolean z) {
            o8d0.this.f142616f.m148910s1(liveScrollViewContainer, z);
        }

        @Override // com.p046p1.mobile.putong.live.livingroom.view.LiveScrollView.InterfaceC12933c
        /* JADX INFO: renamed from: i */
        public void mo76580i() {
            o8d0.this.f142616f.m148908r1();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m163115b(LiveScrollViewContainer liveScrollViewContainer) {
        if (liveScrollViewContainer.getPresenter() != null) {
            liveScrollViewContainer.getPresenter().mo111727s2();
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return m163121j().getContext();
    }

    /* JADX INFO: renamed from: d */
    public View m163117d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return p8d0.m167795b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    public void destroy() {
        this.f142612b.m76566z(new e30() { // from class: l.n8d0
            @Override // p149l.e30
            public final void call(Object obj) {
                o8d0.m163115b((LiveScrollViewContainer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m163118e(RightSideViewGroup.InterfaceC12939c interfaceC12939c) {
        this.f142611a.m76615G(interfaceC12939c);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(l8d0 l8d0Var) {
        this.f142616f = l8d0Var;
    }

    /* JADX INFO: renamed from: i */
    public LiveScrollViewContainer m163120i() {
        return this.f142612b.getBackupView();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM163117d = m163117d(layoutInflater, viewGroup);
        this.f142611a.m76615G(new RightSideViewGroup.InterfaceC12939c() { // from class: l.m8d0
            @Override // com.p046p1.mobile.putong.live.livingroom.view.RightSideViewGroup.InterfaceC12939c
            /* JADX INFO: renamed from: d */
            public final void mo76629d(boolean z) {
                this.f132563a.m163127q(z);
            }
        });
        return viewM163117d;
    }

    /* JADX INFO: renamed from: j */
    public LiveScrollViewContainer m163121j() {
        return this.f142612b.getCurrentView();
    }

    /* JADX INFO: renamed from: k */
    public RightSideViewGroup.C12940d m163122k() {
        return this.f142611a.getViewStates();
    }

    /* JADX INFO: renamed from: l */
    public boolean m163123l() {
        RoomScrollGuideView roomScrollGuideView = this.f142615e;
        return roomScrollGuideView != null && roomScrollGuideView.m71995h();
    }

    /* JADX INFO: renamed from: m */
    public void m163124m() {
        this.f142615e.m71993f();
    }

    /* JADX INFO: renamed from: n */
    public void m163125n(Act act) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f142612b.m76550A();
        this.f142616f.m148902n1();
        gkh0.m126627j("[live]quickPlay", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        this.f142612b.setIndicatorView((RoomIndicatorView) View.inflate(act, t6c0.f168433m5, null));
        this.f142612b.setOnLiveScrollListener(new C18871a());
        this.f142612b.setOnViewListener(new C18872b(act));
    }

    /* JADX INFO: renamed from: p */
    public boolean m163126p() {
        return this.f142611a.getViewStates().m76641k();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m163127q(boolean z) {
        if (this.f142612b.getBackupView().getPresenter() != null) {
            this.f142612b.getBackupView().getPresenter().mo95102g4(z);
        }
        if (this.f142612b.getCurrentView().getPresenter() != null) {
            this.f142612b.getCurrentView().getPresenter().mo95102g4(z);
        }
        this.f142614d.m75575x(z);
    }

    /* JADX INFO: renamed from: s */
    public void m163128s(JumpRoomData jumpRoomData) {
        this.f142612b.m76558I(jumpRoomData);
    }

    /* JADX INFO: renamed from: u */
    public void m163129u(RightSideViewGroup.InterfaceC12939c interfaceC12939c) {
        this.f142611a.m76624S(interfaceC12939c);
    }

    /* JADX INFO: renamed from: v */
    public void m163130v(boolean z) {
        this.f142611a.setEnable(z);
    }

    /* JADX INFO: renamed from: w */
    public void m163131w(boolean z, boolean z2) {
        RightSideViewGroup rightSideViewGroup = this.f142611a;
        if (z) {
            rightSideViewGroup.m76625T(z2);
        } else {
            rightSideViewGroup.m76617L(z2);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m163132x(float f) {
        this.f142612b.m76559J(f);
    }

    /* JADX INFO: renamed from: y */
    public void m163133y(int i) {
        if (this.f142615e == null) {
            this.f142615e = (RoomScrollGuideView) this.f142613c.inflate();
        }
        this.f142615e.m71994g(this, this.f142616f);
        this.f142615e.m72001n(i);
    }

    /* JADX INFO: renamed from: z */
    public void m163134z() {
        this.f142612b.m76560K();
    }
}
