package p002l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.archi.frag.LiveScrollViewContainer;
import com.p000p1.mobile.putong.live.livingroom.archi.frag.RoomIndicatorView;
import com.p000p1.mobile.putong.live.livingroom.base.room.RoomScrollGuideView;
import com.p000p1.mobile.putong.live.livingroom.common.jumproom.JumpRoomData;
import com.p000p1.mobile.putong.live.livingroom.other.side.LiveSideView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p1.mobile.putong.live.livingroom.view.LiveScrollView;
import com.p1.mobile.putong.live.livingroom.view.RightSideViewGroup;
import l.e30;
import l.gkh0;
import l.j760;
import l.s7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class o8d0 implements s7m<l8d0> {

    /* JADX INFO: renamed from: a */
    public RightSideViewGroup f16427a;

    /* JADX INFO: renamed from: b */
    public LiveScrollView f16428b;

    /* JADX INFO: renamed from: c */
    public ViewStub f16429c;

    /* JADX INFO: renamed from: d */
    public LiveSideView f16430d;

    /* JADX INFO: renamed from: e */
    public RoomScrollGuideView f16431e;

    /* JADX INFO: renamed from: f */
    public l8d0 f16432f;

    /* JADX INFO: renamed from: l.o8d0$a */
    public class C0717a implements LiveScrollView.b {
        public C0717a() {
        }

        /* JADX INFO: renamed from: a */
        public void m19313a(boolean z) {
            ((RoomIndicatorView) o8d0.this.f16428b.getIndicatorView()).m5185d(z);
        }

        /* JADX INFO: renamed from: b */
        public void m19314b() {
            ((RoomIndicatorView) o8d0.this.f16428b.getIndicatorView()).m5184c();
        }

        /* JADX INFO: renamed from: c */
        public boolean m19315c(boolean z) {
            j760<Boolean, BLiveAbsData> j760VarM17092m1 = o8d0.this.f16432f.m17092m1(z);
            ((RoomIndicatorView) o8d0.this.f16428b.getIndicatorView()).m5183b(z, j760VarM17092m1);
            return ((Boolean) j760VarM17092m1.a).booleanValue();
        }
    }

    /* JADX INFO: renamed from: l.o8d0$b */
    public class C0718b implements LiveScrollView.c {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ Act f16434a;

        public C0718b(Act act) {
            this.f16434a = act;
        }

        /* JADX INFO: renamed from: a */
        public void m19316a(boolean z, LiveScrollViewContainer liveScrollViewContainer, boolean z2, JumpRoomData jumpRoomData) {
            if (this.f16434a.lifecycle_() == null || !this.f16434a.lifecycle_().a) {
                return;
            }
            o8d0.this.f16432f.m17055B1(z, liveScrollViewContainer, z2, jumpRoomData);
        }

        /* JADX INFO: renamed from: b */
        public boolean m19317b() {
            return !o8d0.this.f16432f.m17071P0(4);
        }

        /* JADX INFO: renamed from: c */
        public void m19318c() {
            o8d0.this.f16432f.m17084e1(6);
        }

        /* JADX INFO: renamed from: d */
        public boolean m19319d(boolean z) {
            return ((Boolean) o8d0.this.f16432f.m17092m1(z).a).booleanValue();
        }

        /* JADX INFO: renamed from: e */
        public void m19320e(boolean z) {
            o8d0.this.f16432f.m17094o1(z);
        }

        /* JADX INFO: renamed from: f */
        public boolean m19321f() {
            return o8d0.this.f16432f.m17102t0();
        }

        /* JADX INFO: renamed from: g */
        public void m19322g() {
            o8d0.this.f16432f.m17084e1(1);
        }

        /* JADX INFO: renamed from: h */
        public void m19323h(LiveScrollViewContainer liveScrollViewContainer, boolean z) {
            o8d0.this.f16432f.m17101s1(liveScrollViewContainer, z);
        }

        /* JADX INFO: renamed from: i */
        public void m19324i() {
            o8d0.this.f16432f.m17099r1();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m19291b(LiveScrollViewContainer liveScrollViewContainer) {
        if (liveScrollViewContainer.getPresenter() != null) {
            liveScrollViewContainer.getPresenter().s2();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m19293C0() {
        return m19299j().getContext();
    }

    /* JADX INFO: renamed from: d */
    public View m19294d(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return p8d0.m20131b(this, layoutInflater, viewGroup);
    }

    public void destroy() {
        this.f16428b.z(new e30() { // from class: l.n8d0
            public final void call(Object obj) {
                o8d0.m19291b((LiveScrollViewContainer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public void m19295e(RightSideViewGroup.c cVar) {
        this.f16427a.G(cVar);
    }

    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void m19298i1(l8d0 l8d0Var) {
        this.f16432f = l8d0Var;
    }

    /* JADX INFO: renamed from: i */
    public LiveScrollViewContainer m19297i() {
        return this.f16428b.getBackupView();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM19294d = m19294d(layoutInflater, viewGroup);
        this.f16427a.G(new RightSideViewGroup.c() { // from class: l.m8d0
            /* JADX INFO: renamed from: d */
            public final void m17763d(boolean z) {
                this.f15277a.m19305q(z);
            }
        });
        return viewM19294d;
    }

    /* JADX INFO: renamed from: j */
    public LiveScrollViewContainer m19299j() {
        return this.f16428b.getCurrentView();
    }

    /* JADX INFO: renamed from: k */
    public RightSideViewGroup.d m19300k() {
        return this.f16427a.getViewStates();
    }

    /* JADX INFO: renamed from: l */
    public boolean m19301l() {
        RoomScrollGuideView roomScrollGuideView = this.f16431e;
        return roomScrollGuideView != null && roomScrollGuideView.m5386h();
    }

    /* JADX INFO: renamed from: m */
    public void m19302m() {
        this.f16431e.m5384f();
    }

    /* JADX INFO: renamed from: n */
    public void m19303n(Act act) {
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f16428b.A();
        this.f16432f.m17093n1();
        gkh0.j("[live]quickPlay", String.valueOf(System.currentTimeMillis() - jCurrentTimeMillis));
        this.f16428b.setIndicatorView((RoomIndicatorView) View.inflate(act, t6c0.f19929m5, null));
        this.f16428b.setOnLiveScrollListener(new C0717a());
        this.f16428b.setOnViewListener(new C0718b(act));
    }

    /* JADX INFO: renamed from: p */
    public boolean m19304p() {
        return this.f16427a.getViewStates().k();
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m19305q(boolean z) {
        if (this.f16428b.getBackupView().getPresenter() != null) {
            this.f16428b.getBackupView().getPresenter().mo9423g4(z);
        }
        if (this.f16428b.getCurrentView().getPresenter() != null) {
            this.f16428b.getCurrentView().getPresenter().mo9423g4(z);
        }
        this.f16430d.m9214x(z);
    }

    /* JADX INFO: renamed from: s */
    public void m19306s(JumpRoomData jumpRoomData) {
        this.f16428b.I(jumpRoomData);
    }

    /* JADX INFO: renamed from: u */
    public void m19307u(RightSideViewGroup.c cVar) {
        this.f16427a.S(cVar);
    }

    /* JADX INFO: renamed from: v */
    public void m19308v(boolean z) {
        this.f16427a.setEnable(z);
    }

    /* JADX INFO: renamed from: w */
    public void m19309w(boolean z, boolean z2) {
        RightSideViewGroup rightSideViewGroup = this.f16427a;
        if (z) {
            rightSideViewGroup.T(z2);
        } else {
            rightSideViewGroup.L(z2);
        }
    }

    /* JADX INFO: renamed from: x */
    public void m19310x(float f) {
        this.f16428b.J(f);
    }

    /* JADX INFO: renamed from: y */
    public void m19311y(int i) {
        if (this.f16431e == null) {
            this.f16431e = (RoomScrollGuideView) this.f16429c.inflate();
        }
        this.f16431e.m5385g(this, this.f16432f);
        this.f16431e.m5392n(i);
    }

    /* JADX INFO: renamed from: z */
    public void m19312z() {
        this.f16428b.K();
    }
}
