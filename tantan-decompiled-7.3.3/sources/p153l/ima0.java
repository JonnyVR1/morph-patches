package p153l;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.C0610n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.core.CoreBusinessModule;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p051p1.mobile.putong.core.p058ui.profile.ParallaxView;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.performance.PerformanceLogUtil;
import com.p051p1.mobile.putong.core.p058ui.profile.helpers.performance.ProfileLogEntity;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.SmoothScrollLinearLayoutManager;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.C8885a;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.InterfaceC8886b;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.LayoutDesc;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.ProfileButton;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.imp.ProfileListFragLocalImpl;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.itemholders.ProfileGameItemHolder;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.itemholders.ProfileImagesItemHolder;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileCustomBar;
import com.p051p1.mobile.putong.core.p058ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p137rx.subjects.C22507a;
import p151v.VFrame;
import p151v.VImage;
import p151v.VProgressBar;

/* JADX INFO: loaded from: classes4.dex */
public class ima0 implements iam<cla0> {

    /* JADX INFO: renamed from: a */
    public VFrame f115720a;

    /* JADX INFO: renamed from: b */
    public VFrame f115721b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f115722c;

    /* JADX INFO: renamed from: d */
    public ParallaxView f115723d;

    /* JADX INFO: renamed from: e */
    public RecyclerView f115724e;

    /* JADX INFO: renamed from: f */
    public SuperLikeComboAnimView f115725f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f115726g;

    /* JADX INFO: renamed from: h */
    public ProfileCustomBar f115727h;

    /* JADX INFO: renamed from: i */
    public View f115728i;

    /* JADX INFO: renamed from: j */
    public final ProfileListFragLocalImpl f115729j;

    /* JADX INFO: renamed from: k */
    public cla0 f115730k;

    /* JADX INFO: renamed from: l */
    public final mw90 f115731l;

    /* JADX INFO: renamed from: m */
    public hr90 f115732m;

    /* JADX INFO: renamed from: n */
    public hr90 f115733n;

    /* JADX INFO: renamed from: o */
    public ProfileImagesItemHolder f115734o;

    /* JADX INFO: renamed from: p */
    public no90 f115735p;

    /* JADX INFO: renamed from: r */
    public zq90 f115737r;

    /* JADX INFO: renamed from: s */
    public sz90 f115738s;

    /* JADX INFO: renamed from: t */
    public b43 f115739t;

    /* JADX INFO: renamed from: u */
    public LinearLayoutManager f115740u;

    /* JADX INFO: renamed from: w */
    public InterfaceC8886b f115742w;

    /* JADX INFO: renamed from: q */
    public lp90 f115736q = null;

    /* JADX INFO: renamed from: v */
    public final List<InterfaceC8886b> f115741v = new ArrayList();

    /* JADX INFO: renamed from: x */
    public final List<on2<?>> f115743x = new ArrayList();

    /* JADX INFO: renamed from: y */
    public q1a0 f115744y = new q1a0();

    /* JADX INFO: renamed from: z */
    public int f115745z = 0;

    /* JADX INFO: renamed from: A */
    public final RecyclerView.AbstractC0584t f115718A = new C17740c();

    /* JADX INFO: renamed from: B */
    public final C22507a<uxj0> f115719B = C22507a.m222758b();

    /* JADX INFO: renamed from: l.ima0$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC17738a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC17738a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ima0.this.f115724e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            ima0.this.m140861Q();
        }
    }

    /* JADX INFO: renamed from: l.ima0$b */
    public class C17739b extends RecyclerView.AbstractC0584t {
        public C17739b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            ima0.this.m140856M0();
            ima0.this.m140857N0(recyclerView.canScrollVertically(-1));
        }
    }

    /* JADX INFO: renamed from: l.ima0$c */
    public class C17740c extends RecyclerView.AbstractC0584t {

        /* JADX INFO: renamed from: a */
        public int f115748a = 0;

        public C17740c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            ima0.this.f115745z += i2;
            ima0 ima0Var = ima0.this;
            ima0Var.f115734o.m53993S1(ima0Var.f115745z);
            if (lik0.m154375a()) {
                return;
            }
            if ((TextUtils.equals("share_profile", ima0.this.f115737r.f205577b) || ima0.this.f115737r.m220987o() || ima0.this.f115737r.m220953F()) && !User.isTeamAccount(ima0.this.f115737r.f205579d) && !ima0.this.f115737r.m220958K() && NullChecker.m82486a(recyclerView.getAdapter()) && recyclerView.getAdapter().getItemCount() >= 1) {
                if (NullChecker.m82486a(ima0.this.f115740u) && ima0.this.f115740u.findLastVisibleItemPosition() == recyclerView.getAdapter().getItemCount() - 1 && this.f115748a != recyclerView.getAdapter().getItemCount() - 1) {
                    i4g0.m138526x("e_suggest_user_profile_info_view_share", ima0.this.f115730k.pageId());
                }
                this.f115748a = ima0.this.f115740u.findLastVisibleItemPosition();
            }
        }
    }

    /* JADX INFO: renamed from: l.ima0$d */
    public class C17741d extends C0610n {
        public C17741d(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C0610n
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 50.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C0610n
        public int getVerticalSnapPreference() {
            return -1;
        }
    }

    public ima0(ProfileListFragLocalImpl profileListFragLocalImpl, zq90 zq90Var) {
        this.f115729j = profileListFragLocalImpl;
        this.f115737r = zq90Var;
        this.f115731l = profileListFragLocalImpl.f34823B;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ Boolean m140804B() {
        PerformanceLogUtil.logEnd(PerformanceLogUtil.instance().tranceHash, ProfileLogEntity.ProfileLogName.CARD_CLICK);
        PerformanceLogUtil.instance().endTrance();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: H0 */
    private void m140810H0() {
        bnl0.m105546b0(this.f115721b, new pcj() { // from class: l.hla0
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return ima0.m140804B();
            }
        });
    }

    /* JADX INFO: renamed from: V */
    private InterfaceC8886b m140818V(zq90 zq90Var) {
        for (InterfaceC8886b interfaceC8886b : this.f115741v) {
            if (interfaceC8886b.mo53578a(zq90Var)) {
                this.f115742w = interfaceC8886b;
                tu2.m192703a("[core][profile]", "init Button Strategy : ".concat(interfaceC8886b.getClass().getSimpleName()));
                return this.f115742w;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: X */
    private ProfileButton m140819X(ProfileButton.ProfileButtonType profileButtonType) {
        return this.f115736q.mo112044e(profileButtonType);
    }

    /* JADX INFO: renamed from: Z */
    private void m140820Z() {
        this.f115741v.add(new ao70(this.f115737r));
        this.f115741v.add(new erc0(this.f115737r));
        this.f115741v.add(new hhr(this.f115737r));
        this.f115741v.add(new kmb0(this.f115737r));
        this.f115741v.add(new h55(this.f115737r));
        this.f115741v.add(new lgl0(this.f115737r));
        this.f115741v.add(new v7l(this.f115737r));
        this.f115741v.add(new im5(this.f115737r));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m140821a(String str) {
    }

    /* JADX INFO: renamed from: b0 */
    private void m140823b0() {
        m140820Z();
        this.f115742w = m140818V(this.f115737r);
        lp90 lp90VarM53577a = new C8885a(getContext()).m53577a(this.f115742w);
        this.f115736q = lp90VarM53577a;
        tu2.m192703a("[core][profile]", "generate button layout : ".concat(lp90VarM53577a.getClass().getSimpleName()));
        this.f115726g.addView(this.f115736q.m155169k(), new FrameLayout.LayoutParams(-1, qa00.m175859d(164.0f)));
        this.f115742w.mo53581d(this.f115736q);
        this.f115730k.f82357b.onNext(uxj0.f181467a);
        if (this.f115736q.m155166d().m53572a() != LayoutDesc.ComboType.None) {
            this.f115739t.mo168208a(new x20() { // from class: l.gla0
                @Override // p153l.x20
                public final void call() {
                    this.f104833a.m140880i0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: c0 */
    private void m140825c0() {
        if (NullChecker.m82486a(getAct().getSupportActionBar())) {
            getAct().getSupportActionBar().mo102186m();
        }
        CoreBusinessModule.m30906m0().mo122548h(this.f115727h);
        this.f115727h.setBackCallBack(new x20() { // from class: l.ama0
            @Override // p153l.x20
            public final void call() {
                this.f72214a.m140837o0();
            }
        });
        if (this.f115737r.m220958K()) {
            final x20 x20Var = new x20() { // from class: l.gma0
                @Override // p153l.x20
                public final void call() {
                    this.f104961a.m140884m0();
                }
            };
            this.f115727h.setEditCallBack(x20Var);
            this.f115734o.mo168208a(new x20() { // from class: l.hma0
                @Override // p153l.x20
                public final void call() {
                    this.f110608a.m140885n0(x20Var);
                }
            });
        } else {
            boolean zM154375a = lik0.m154375a();
            ProfileCustomBar profileCustomBar = this.f115727h;
            if (zM154375a) {
                profileCustomBar.setMoreCallBack(new x20() { // from class: l.ema0
                    @Override // p153l.x20
                    public final void call() {
                        this.f94642a.m140881j0();
                    }
                });
                this.f115734o.mo168208a(new x20() { // from class: l.fma0
                    @Override // p153l.x20
                    public final void call() {
                        this.f99755a.m140883l0();
                    }
                });
            } else {
                profileCustomBar.setMoreCallBack(new x20() { // from class: l.bma0
                    @Override // p153l.x20
                    public final void call() {
                        this.f77284a.m140886p0();
                    }
                });
                this.f115734o.mo168208a(new x20() { // from class: l.cma0
                    @Override // p153l.x20
                    public final void call() {
                        this.f82564a.m140889r0();
                    }
                });
                if (this.f115737r.m220987o() || TextUtils.equals("share_profile", this.f115737r.f205577b) || this.f115737r.m220953F()) {
                    this.f115734o.mo168208a(new x20() { // from class: l.dma0
                        @Override // p153l.x20
                        public final void call() {
                            this.f89615a.m140891t0();
                        }
                    });
                }
            }
        }
        this.f115724e.addOnScrollListener(new C17739b());
    }

    /* JADX INFO: renamed from: d0 */
    private void m140827d0() {
        int i = this.f115737r.f205580e.f205602l;
        if (i >= 0) {
            this.f115731l.mo53471m2(i, false);
        }
        this.f115740u = new SmoothScrollLinearLayoutManager(getContext());
        this.f115724e.setItemAnimator(null);
        this.f115724e.setLayoutManager(this.f115740u);
        this.f115724e.setAdapter(this.f115744y);
        this.f115724e.addOnScrollListener(this.f115718A);
        if (this.f115737r.m220952E()) {
            this.f115724e.post(new Runnable() { // from class: l.ila0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f115561a.m140892u0();
                }
            });
        }
        this.f115724e.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC17738a());
    }

    /* JADX INFO: renamed from: f0 */
    private void m140830f0() {
        if (spl0.m187375a0()) {
            if ((this.f115737r.m220987o() || this.f115737r.m220953F()) && !CoreModule.f18264c.f20381e0.m116549c8() && !CoreModule.f18264c.f20381e0.m116593na().isJailed() && a5i0.m96175v0() > 0 && !p6d0.m170847d0().f150817j.contains(this.f115737r.f205579d) && p6d0.m170847d0().m170851f0() && (this.f115736q instanceof tu40)) {
                l51.m152888H(getAct(), new Runnable() { // from class: l.rla0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f163710a.m140897z0();
                    }
                }, 1000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m140837o0() {
        pza0.m174356h("button");
        this.f115730k.m110553U2();
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m140843w() {
        if (C4499d.m21895l().m21911x("share_tip")) {
            C4499d.m21895l().m21899k("share_tip");
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m140847A0() {
        this.f115734o.m54023y1();
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m140848B0() {
        this.f115734o.m54024z1();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f115729j.act();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m140849D0() {
        this.f115734o.m53963A1();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m140850E0(LinearLayout linearLayout) {
        if (this.f115730k.m110546N1().m53898V()) {
            return;
        }
        m140873W0("点击推荐给好友", linearLayout);
        this.f115730k.m110546N1().m53894R();
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m140851G0() {
        this.f115734o.m53974I1(new y20() { // from class: l.xla0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f194938a.m140850E0((LinearLayout) obj);
            }
        }, 0L);
    }

    /* JADX INFO: renamed from: I0 */
    public void m140852I0() {
        tu2.m192703a("[core][profile]", "onEnterAnimEnd");
        this.f115729j.f34826E = false;
        PerformanceLogUtil.logBegin(new Object().hashCode(), ProfileLogEntity.ProfileLogName.CUSTOM, "onEnterAnimEnd");
        this.f115719B.onNext(uxj0.f181467a);
        this.f115734o.mo168208a(new x20() { // from class: l.yla0
            @Override // p153l.x20
            public final void call() {
                this.f200541a.m140847A0();
            }
        });
        if (this.f115729j.f34827F) {
            this.f115730k.m110557W2();
        }
    }

    /* JADX INFO: renamed from: J0 */
    public void m140853J0() {
        tu2.m192703a("[core][profile]", "onEnterAnimStart");
        PerformanceLogUtil.logBegin(new Object().hashCode(), ProfileLogEntity.ProfileLogName.CUSTOM, "preEnterAnimStart");
        this.f115729j.f34826E = true;
        this.f115734o.mo168208a(new x20() { // from class: l.vla0
            @Override // p153l.x20
            public final void call() {
                this.f184554a.m140848B0();
            }
        });
    }

    /* JADX INFO: renamed from: K0 */
    public void m140854K0() {
        this.f115729j.f34826E = true;
        this.f115734o.mo168208a(new x20() { // from class: l.zla0
            @Override // p153l.x20
            public final void call() {
                this.f204894a.m140849D0();
            }
        });
    }

    /* JADX INFO: renamed from: L0 */
    public void m140855L0(Bundle bundle) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.PRE_CREATE_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        this.f115729j.setHasOptionsMenu(true);
        m140876a0();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
    }

    /* JADX INFO: renamed from: M0 */
    public final void m140856M0() {
        no90 no90Var = this.f115735p;
        if (no90Var.f142965v == null || !no90Var.m168323u().isAttachedToWindow()) {
            if (this.f115740u.findFirstCompletelyVisibleItemPosition() > 2) {
                this.f115727h.m54132g(1.0f);
                return;
            }
            return;
        }
        int[] iArr = new int[2];
        this.f115727h.getLocationInWindow(iArr);
        float height = iArr[1] + this.f115727h.getHeight();
        int[] iArr2 = new int[2];
        this.f115735p.f142965v.getLocationInWindow(iArr2);
        this.f115727h.m54132g((height - iArr2[1]) / this.f115735p.f142965v.getHeight());
    }

    /* JADX INFO: renamed from: N0 */
    public final void m140857N0(boolean z) {
        if (NullChecker.m82486a(this.f115734o.f34857H) && NullChecker.m82486a(this.f115734o.f34863K) && NullChecker.m82486a(this.f115734o.f34865L) && this.f115734o.m168323u().isAttachedToWindow()) {
            if (!this.f115730k.m110554V1(this.f115737r.f205576a) || NullChecker.m82486a(this.f115734o.f34861J)) {
                this.f115734o.m54022x1(z);
            }
        }
    }

    /* JADX INFO: renamed from: O0 */
    public int m140858O0() {
        return this.f115745z;
    }

    /* JADX INFO: renamed from: P */
    public View m140859P(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return jma0.m146145b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: P0 */
    public void m140860P0() {
        this.f115727h.setVisibility(0);
        ProfileCustomBar profileCustomBar = this.f115727h;
        zq90 zq90Var = this.f115737r;
        profileCustomBar.m54136k(zq90Var.f205576a, zq90Var.f205577b, zq90Var.m220959L(), getAct() instanceof NewUI1ContainerActivity);
    }

    /* JADX INFO: renamed from: Q */
    public final void m140861Q() {
        l51.m152888H(getAct(), new Runnable() { // from class: l.ula0
            @Override // java.lang.Runnable
            public final void run() {
                this.f179497a.m140879h0();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m140862Q0() {
        List<on2<?>> arrayList = new ArrayList<>();
        if (NullChecker.m82486a(this.f115721b) && NullChecker.m82486a(this.f115737r.f205576a) && this.f115737r.m220978e()) {
            int childCount = this.f115721b.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f115721b.getChildAt(i);
                bnl0.m105525M0(childAt, childAt == this.f115723d || childAt == this.f115724e);
            }
            arrayList.add(this.f115734o);
            arrayList.add(this.f115735p);
        } else {
            arrayList = m140867T(this.f115743x);
        }
        this.f115744y.m174851M(arrayList);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(cla0 cla0Var) {
        this.f115730k = cla0Var;
    }

    /* JADX INFO: renamed from: R0 */
    public void m140864R0(final int i) {
        final oma0 oma0Var = (oma0) this.f115738s.m188630d(oma0.class);
        if (NullChecker.m82486a(oma0Var)) {
            oma0Var.mo168208a(new x20() { // from class: l.nla0
                @Override // p153l.x20
                public final void call() {
                    oma0Var.m168207Y(i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: S */
    public int m140865S() {
        return this.f115734o.m53981N0();
    }

    /* JADX INFO: renamed from: S0 */
    public void m140866S0(boolean z) {
        boolean zIsFemale = false;
        if (z) {
            ((ViewGroup) getAct().getWindow().getDecorView()).setMotionEventSplittingEnabled(true);
            bnl0.m105525M0(this.f115725f, false);
            bpe0.m105814f().m105816c(this.f115737r.f205579d, this.f115725f.m56974u(), false, OMSDialogPositon.p_suggest_user_profile_info_view);
            m140819X(ProfileButton.ProfileButtonType.SuperLike).m53575a().callOnClick();
            return;
        }
        ((ViewGroup) getAct().getWindow().getDecorView()).setMotionEventSplittingEnabled(false);
        boolean zEquals = TextUtils.equals(this.f115737r.f205579d, z5h0.m218675j().f203055m);
        bnl0.m105525M0(this.f115725f, true);
        SuperLikeComboAnimView superLikeComboAnimView = this.f115725f;
        if (NullChecker.m82486a(this.f115737r.f205576a)) {
            zIsFemale = this.f115737r.f205576a.isFemale();
        } else if (NullChecker.m82486a(this.f115730k.m110551R2()) && !this.f115730k.m110551R2().isFemale()) {
            zIsFemale = true;
        }
        superLikeComboAnimView.m56971r(zEquals, true, zIsFemale);
    }

    /* JADX INFO: renamed from: T */
    public final List<on2<?>> m140867T(List<on2<?>> list) {
        ArrayList arrayList = new ArrayList();
        on2<?> on2Var = null;
        int i = 0;
        for (on2<?> on2Var2 : list) {
            if (on2Var2.mo53912l()) {
                if (on2Var2.mo53568k() && (i = i + 1) > 1) {
                    if (on2Var instanceof cza0) {
                        hr90 hr90Var = new hr90(this.f115731l, this.f115729j);
                        this.f115733n = hr90Var;
                        hr90Var.m168324v(qa00.m175859d(4.0f));
                        arrayList.add(this.f115733n);
                    } else if (on2Var instanceof jz90) {
                        hr90 hr90Var2 = new hr90(this.f115731l, this.f115729j);
                        this.f115733n = hr90Var2;
                        hr90Var2.m168324v(qa00.m175859d(9.0f));
                        arrayList.add(this.f115733n);
                    } else if (on2Var instanceof fy90) {
                        hr90 hr90Var3 = new hr90(this.f115731l, this.f115729j);
                        this.f115733n = hr90Var3;
                        hr90Var3.m168324v(qa00.m175859d(16.0f));
                        arrayList.add(this.f115733n);
                    } else if (on2Var instanceof y1b0) {
                        hr90 hr90Var4 = new hr90(this.f115731l, this.f115729j);
                        this.f115733n = hr90Var4;
                        hr90Var4.m168324v(qa00.m175859d(9.0f));
                        arrayList.add(this.f115733n);
                    } else if (on2Var instanceof oz90) {
                        hr90 hr90Var5 = new hr90(this.f115731l, this.f115729j);
                        this.f115733n = hr90Var5;
                        hr90Var5.m168324v(qa00.m175859d(24.0f));
                        arrayList.add(this.f115733n);
                    } else {
                        arrayList.add(this.f115732m);
                    }
                }
                arrayList.add(on2Var2);
                on2Var = on2Var2;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: T0 */
    public void m140868T0() {
        this.f115722c.setVisibility(4);
        this.f115724e.setVisibility(0);
        this.f115723d.setVisibility(0);
    }

    /* JADX INFO: renamed from: U */
    public ProfileButton m140869U(ProfileButton.ProfileButtonType profileButtonType) {
        if (NullChecker.m82486a(this.f115736q)) {
            return this.f115736q.mo112044e(profileButtonType);
        }
        return null;
    }

    /* JADX INFO: renamed from: U0 */
    public void m140870U0() {
        this.f115724e.setVisibility(4);
        this.f115723d.setVisibility(4);
        this.f115722c.setVisibility(0);
    }

    /* JADX INFO: renamed from: V0 */
    public void m140871V0() {
        this.f115734o.mo168208a(new x20() { // from class: l.lla0
            @Override // p153l.x20
            public final void call() {
                this.f132536a.m140851G0();
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public lp90 m140872W() {
        return this.f115736q;
    }

    /* JADX INFO: renamed from: W0 */
    public final void m140873W0(String str, LinearLayout linearLayout) {
        if (w20.m204491f(this.f115737r.m220974a())) {
            if (C4499d.m21895l().m21911x("share_tip")) {
                C4499d.m21895l().m21899k("share_tip");
            }
            C4499d.m21895l().m21908u(new C4496a(this.f115737r.m220974a()).m21848D(str).m21846B(qa00.m175859d(2.0f)).m21870l(qa00.m175859d(9.0f)).m21873p(75).m21854J(13.0f).m21880w(qa00.m175859d(5.0f)).m21860b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m21863e(false).m21868j(new C4496a.c() { // from class: l.wla0
                @Override // com.p051p1.mobile.android.p053ui.bubble.C4496a.c
                /* JADX INFO: renamed from: a */
                public final void mo21885a(String str2) {
                    ima0.m140821a(str2);
                }
            }).m21874q(C4496a.f16399N | C4496a.f16403R), linearLayout, "share_tip");
        }
    }

    /* JADX INFO: renamed from: X0 */
    public void m140874X0(int i) {
        if (NullChecker.m82486a(this.f115742w)) {
            this.f115742w.mo53579b(i);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m140875Y() {
        if (NullChecker.m82486a(this.f115734o.f34901g1)) {
            ProfileImagesItemHolder profileImagesItemHolder = this.f115734o;
            profileImagesItemHolder.m53997V0(profileImagesItemHolder.f34901g1, false);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m140876a0() {
        this.f115732m = new hr90(this.f115731l, this.f115729j);
        if (!this.f115737r.m220958K() && NullChecker.m82486a(this.f115730k.m110562Z2()) && this.f115730k.m110562Z2().unilateralBlock()) {
            this.f115738s = new l43(this.f115731l, this.f115729j);
        } else {
            this.f115738s = new iw40(this.f115731l, this.f115729j);
        }
        this.f115743x.addAll(this.f115738s.m188629c());
        this.f115734o = (ProfileImagesItemHolder) this.f115738s.m188630d(ProfileImagesItemHolder.class);
        this.f115735p = (no90) this.f115738s.m188630d(ap90.class);
        this.f115739t = (b43) this.f115738s.m188630d(b43.class);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m140877e0() {
        if (this.f115737r.m220987o() || TextUtils.equals("share_profile", this.f115737r.f205577b) || this.f115737r.m220953F()) {
            this.f115730k.m110546N1().m53893Q();
            if (this.f115730k.m110546N1().m53899W()) {
                this.f115734o.mo168208a(new x20() { // from class: l.jla0
                    @Override // p153l.x20
                    public final void call() {
                        this.f121539a.m140894w0();
                    }
                });
            }
        } else if (TextUtils.equals(this.f115737r.f205577b, "p_game_cp") || TextUtils.equals(this.f115737r.f205577b, "p_game_cp_msg")) {
            this.f115734o.mo168208a(new x20() { // from class: l.kla0
                @Override // p153l.x20
                public final void call() {
                    this.f127357a.m140896y0();
                }
            });
        }
        if (NullChecker.m82486a(this.f115727h)) {
            if (this.f115737r.m220987o() || TextUtils.equals("share_profile", this.f115737r.f205577b)) {
                ((VImage) this.f115727h.findViewById(adc0.f70153U8)).setImageResource(dbc0.f86706Wp);
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m140878g0(Class<? extends on2<t3m>> cls) {
        ep90 ep90Var = (ep90) this.f115738s.m188630d(cls);
        return NullChecker.m82486a(ep90Var) && ep90Var.mo53912l();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m140879h0() {
        Class<? extends on2<t3m>> cls;
        if (TextUtils.equals(this.f115737r.f205577b, "from_auto_scroll_to_question")) {
            cls = mpe.class;
            if (!m140878g0(cls)) {
                cls = null;
            }
        } else {
            if (!TextUtils.equals(this.f115737r.f205577b, "p_game_cp") && !TextUtils.equals(this.f115737r.f205577b, "p_game_cp_msg")) {
                return;
            }
            cls = ProfileGameItemHolder.class;
            if (!m140878g0(cls)) {
                cls = null;
            }
        }
        if (cls == null) {
            return;
        }
        int iM174847I = this.f115744y.m174847I(cls);
        if (!NullChecker.m82486a(this.f115744y) || iM174847I < 0 || iM174847I >= this.f115744y.getPageCount()) {
            return;
        }
        C17741d c17741d = new C17741d(this.f115737r.m220974a());
        c17741d.setTargetPosition(iM174847I);
        this.f115740u.startSmoothScroll(c17741d);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m140880i0() {
        ViewGroup.LayoutParams layoutParams = this.f115739t.m168323u().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.f115736q.m155166d().m53572a() != LayoutDesc.ComboType.None ? qa00.m175859d(164.0f) : qa00.m175859d(0.0f);
            this.f115739t.m168323u().setLayoutParams(layoutParams);
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.INFLATE_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        View viewM140859P = m140859P(layoutInflater, viewGroup);
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        return viewM140859P;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m140881j0() {
        this.f115730k.m110546N1().m53890N();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m140882k0() {
        this.f115730k.m110546N1().m53890N();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m140883l0() {
        this.f115734o.m53979L1(new x20() { // from class: l.mla0
            @Override // p153l.x20
            public final void call() {
                this.f137387a.m140882k0();
            }
        }, null);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m140884m0() {
        ml70.m158856b().m158858d(getAct());
        this.f115729j.startActivity(ProfileAct.m51922q2(getAct(), this.f115737r.f205579d, "profile_frag_menu", false, true));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m140885n0(x20 x20Var) {
        this.f115734o.m53977K1(x20Var);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m140886p0() {
        this.f115730k.m110546N1().m53891O();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m140887q0() {
        this.f115730k.m110546N1().m53891O();
    }

    /* JADX INFO: renamed from: r */
    public void m140888r() {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.INIT_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        if (this.f115737r.m220958K()) {
            getAct().setTitle(this.f115729j.m21603x4(R$string.f19867zi));
        }
        m140825c0();
        m140823b0();
        m140810H0();
        m140830f0();
        m140877e0();
        m140827d0();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        if (this.f115737r.m220959L() && this.f115737r.f205580e.f205601k == null) {
            getAct().lambda$debugItems$19();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m140889r0() {
        this.f115734o.m53979L1(new x20() { // from class: l.sla0
            @Override // p153l.x20
            public final void call() {
                this.f169358a.m140887q0();
            }
        }, new x20() { // from class: l.tla0
            @Override // p153l.x20
            public final void call() {
                ima0.m140843w();
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m140890s0(LinearLayout linearLayout) {
        if (this.f115730k.m110546N1().m53898V()) {
            return;
        }
        m140873W0("点击推荐给好友", linearLayout);
        this.f115730k.m110546N1().m53894R();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m140891t0() {
        this.f115734o.m53974I1(new y20() { // from class: l.qla0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f158217a.m140890s0((LinearLayout) obj);
            }
        }, 2000L);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m140892u0() {
        Act act = getAct();
        if (act == null || act.isFinishing()) {
            return;
        }
        this.f115724e.scrollBy(0, ProfileImagesItemHolder.f34845k1);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m140893v0(LinearLayout linearLayout) {
        if (this.f115730k.m110546N1().m53898V()) {
            return;
        }
        m140873W0("点击推荐给好友", linearLayout);
        this.f115730k.m110546N1().m53894R();
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m140894w0() {
        this.f115734o.m53974I1(new y20() { // from class: l.pla0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153016a.m140893v0((LinearLayout) obj);
            }
        }, 0L);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m140895x0(LinearLayout linearLayout) {
        if (this.f115730k.m110546N1().m53902w()) {
            m140873W0("分享用户，一起组队打游戏", linearLayout);
            this.f115730k.m110546N1().m53892P();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m140896y0() {
        this.f115734o.m53974I1(new y20() { // from class: l.ola0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f147818a.m140895x0((LinearLayout) obj);
            }
        }, 0L);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m140897z0() {
        p6d0.m170847d0().f150817j.add(this.f115737r.f205579d);
        p6d0.m170847d0().m170856l0();
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
