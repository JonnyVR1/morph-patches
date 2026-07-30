package p149l;

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
import androidx.recyclerview.widget.C0608n;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.core.CoreBusinessModule;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p046p1.mobile.putong.core.p053ui.profile.ParallaxView;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.performance.PerformanceLogUtil;
import com.p046p1.mobile.putong.core.p053ui.profile.helpers.performance.ProfileLogEntity;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.SmoothScrollLinearLayoutManager;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.C8722a;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.InterfaceC8723b;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.LayoutDesc;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.buttons.ProfileButton;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.imp.ProfileListFragLocalImpl;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.itemholders.ProfileGameItemHolder;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.itemholders.ProfileImagesItemHolder;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileCustomBar;
import com.p046p1.mobile.putong.core.p053ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p133rx.subjects.C22392a;
import p147v.VFrame;
import p147v.VImage;
import p147v.VProgressBar;

/* JADX INFO: loaded from: classes4.dex */
public class eea0 implements s7m<yca0> {

    /* JADX INFO: renamed from: a */
    public VFrame f90698a;

    /* JADX INFO: renamed from: b */
    public VFrame f90699b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f90700c;

    /* JADX INFO: renamed from: d */
    public ParallaxView f90701d;

    /* JADX INFO: renamed from: e */
    public RecyclerView f90702e;

    /* JADX INFO: renamed from: f */
    public SuperLikeComboAnimView f90703f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f90704g;

    /* JADX INFO: renamed from: h */
    public ProfileCustomBar f90705h;

    /* JADX INFO: renamed from: i */
    public View f90706i;

    /* JADX INFO: renamed from: j */
    public final ProfileListFragLocalImpl f90707j;

    /* JADX INFO: renamed from: k */
    public yca0 f90708k;

    /* JADX INFO: renamed from: l */
    public final io90 f90709l;

    /* JADX INFO: renamed from: m */
    public dj90 f90710m;

    /* JADX INFO: renamed from: n */
    public dj90 f90711n;

    /* JADX INFO: renamed from: o */
    public ProfileImagesItemHolder f90712o;

    /* JADX INFO: renamed from: p */
    public jg90 f90713p;

    /* JADX INFO: renamed from: r */
    public vi90 f90715r;

    /* JADX INFO: renamed from: s */
    public or90 f90716s;

    /* JADX INFO: renamed from: t */
    public l33 f90717t;

    /* JADX INFO: renamed from: u */
    public LinearLayoutManager f90718u;

    /* JADX INFO: renamed from: w */
    public InterfaceC8723b f90720w;

    /* JADX INFO: renamed from: q */
    public hh90 f90714q = null;

    /* JADX INFO: renamed from: v */
    public final List<InterfaceC8723b> f90719v = new ArrayList();

    /* JADX INFO: renamed from: x */
    public final List<hn2<?>> f90721x = new ArrayList();

    /* JADX INFO: renamed from: y */
    public mt90 f90722y = new mt90();

    /* JADX INFO: renamed from: z */
    public int f90723z = 0;

    /* JADX INFO: renamed from: A */
    public final RecyclerView.AbstractC0582t f90696A = new C16586c();

    /* JADX INFO: renamed from: B */
    public final C22392a<roj0> f90697B = C22392a.m221512b();

    /* JADX INFO: renamed from: l.eea0$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC16584a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC16584a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            eea0.this.f90702e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            eea0.this.m115922Q();
        }
    }

    /* JADX INFO: renamed from: l.eea0$b */
    public class C16585b extends RecyclerView.AbstractC0582t {
        public C16585b() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            eea0.this.m115917M0();
            eea0.this.m115918N0(recyclerView.canScrollVertically(-1));
        }
    }

    /* JADX INFO: renamed from: l.eea0$c */
    public class C16586c extends RecyclerView.AbstractC0582t {

        /* JADX INFO: renamed from: a */
        public int f90726a = 0;

        public C16586c() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            eea0.this.f90723z += i2;
            eea0 eea0Var = eea0.this;
            eea0Var.f90712o.m52810S1(eea0Var.f90723z);
            if (f9k0.m120088a()) {
                return;
            }
            if ((TextUtils.equals("share_profile", eea0.this.f90715r.f181562b) || eea0.this.f90715r.m198539o() || eea0.this.f90715r.m198505F()) && !User.isTeamAccount(eea0.this.f90715r.f181564d) && !eea0.this.f90715r.m198510K() && NullChecker.m81303a(recyclerView.getAdapter()) && recyclerView.getAdapter().getItemCount() >= 1) {
                if (NullChecker.m81303a(eea0.this.f90718u) && eea0.this.f90718u.findLastVisibleItemPosition() == recyclerView.getAdapter().getItemCount() - 1 && this.f90726a != recyclerView.getAdapter().getItemCount() - 1) {
                    zvf0.m220402x("e_suggest_user_profile_info_view_share", eea0.this.f90708k.pageId());
                }
                this.f90726a = eea0.this.f90718u.findLastVisibleItemPosition();
            }
        }
    }

    /* JADX INFO: renamed from: l.eea0$d */
    public class C16587d extends C0608n {
        public C16587d(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.C0608n
        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 50.0f / displayMetrics.densityDpi;
        }

        @Override // androidx.recyclerview.widget.C0608n
        public int getVerticalSnapPreference() {
            return -1;
        }
    }

    public eea0(ProfileListFragLocalImpl profileListFragLocalImpl, vi90 vi90Var) {
        this.f90707j = profileListFragLocalImpl;
        this.f90715r = vi90Var;
        this.f90709l = profileListFragLocalImpl.f33975B;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ Boolean m115865B() {
        PerformanceLogUtil.logEnd(PerformanceLogUtil.instance().tranceHash, ProfileLogEntity.ProfileLogName.CARD_CLICK);
        PerformanceLogUtil.instance().endTrance();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: H0 */
    private void m115871H0() {
        xdl0.m208366b0(this.f90699b, new v9j() { // from class: l.dda0
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return eea0.m115865B();
            }
        });
    }

    /* JADX INFO: renamed from: V */
    private InterfaceC8723b m115879V(vi90 vi90Var) {
        for (InterfaceC8723b interfaceC8723b : this.f90719v) {
            if (interfaceC8723b.mo52395a(vi90Var)) {
                this.f90720w = interfaceC8723b;
                du2.m113670a("[core][profile]", "init Button Strategy : ".concat(interfaceC8723b.getClass().getSimpleName()));
                return this.f90720w;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: X */
    private ProfileButton m115880X(ProfileButton.ProfileButtonType profileButtonType) {
        return this.f90714q.mo114662e(profileButtonType);
    }

    /* JADX INFO: renamed from: Z */
    private void m115881Z() {
        this.f90719v.add(new uf70(this.f90715r));
        this.f90719v.add(new xic0(this.f90715r));
        this.f90719v.add(new gfr(this.f90715r));
        this.f90719v.add(new geb0(this.f90715r));
        this.f90719v.add(new g45(this.f90715r));
        this.f90719v.add(new h7l0(this.f90715r));
        this.f90719v.add(new f5l(this.f90715r));
        this.f90719v.add(new fl5(this.f90715r));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m115882a(String str) {
    }

    /* JADX INFO: renamed from: b0 */
    private void m115884b0() {
        m115881Z();
        this.f90720w = m115879V(this.f90715r);
        hh90 hh90VarM52394a = new C8722a(getContext()).m52394a(this.f90720w);
        this.f90714q = hh90VarM52394a;
        du2.m113670a("[core][profile]", "generate button layout : ".concat(hh90VarM52394a.getClass().getSimpleName()));
        this.f90704g.addView(this.f90714q.m130944k(), new FrameLayout.LayoutParams(-1, t100.m186890d(164.0f)));
        this.f90720w.mo52398d(this.f90714q);
        this.f90708k.f197424b.onNext(roj0.f160388a);
        if (this.f90714q.m130942d().m52389a() != LayoutDesc.ComboType.None) {
            this.f90717t.mo131811a(new d30() { // from class: l.cda0
                @Override // p149l.d30
                public final void call() {
                    this.f80357a.m115941i0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: c0 */
    private void m115886c0() {
        if (NullChecker.m81303a(getAct().getSupportActionBar())) {
            getAct().getSupportActionBar().mo134126m();
        }
        CoreBusinessModule.m29908m0().mo190521h(this.f90705h);
        this.f90705h.setBackCallBack(new d30() { // from class: l.wda0
            @Override // p149l.d30
            public final void call() {
                this.f185774a.m115898o0();
            }
        });
        if (this.f90715r.m198510K()) {
            final d30 d30Var = new d30() { // from class: l.cea0
                @Override // p149l.d30
                public final void call() {
                    this.f80449a.m115945m0();
                }
            };
            this.f90705h.setEditCallBack(d30Var);
            this.f90712o.mo131811a(new d30() { // from class: l.dea0
                @Override // p149l.d30
                public final void call() {
                    this.f85768a.m115946n0(d30Var);
                }
            });
        } else {
            boolean zM120088a = f9k0.m120088a();
            ProfileCustomBar profileCustomBar = this.f90705h;
            if (zM120088a) {
                profileCustomBar.setMoreCallBack(new d30() { // from class: l.aea0
                    @Override // p149l.d30
                    public final void call() {
                        this.f69023a.m115942j0();
                    }
                });
                this.f90712o.mo131811a(new d30() { // from class: l.bea0
                    @Override // p149l.d30
                    public final void call() {
                        this.f75127a.m115944l0();
                    }
                });
            } else {
                profileCustomBar.setMoreCallBack(new d30() { // from class: l.xda0
                    @Override // p149l.d30
                    public final void call() {
                        this.f192376a.m115947p0();
                    }
                });
                this.f90712o.mo131811a(new d30() { // from class: l.yda0
                    @Override // p149l.d30
                    public final void call() {
                        this.f197532a.m115950r0();
                    }
                });
                if (this.f90715r.m198539o() || TextUtils.equals("share_profile", this.f90715r.f181562b) || this.f90715r.m198505F()) {
                    this.f90712o.mo131811a(new d30() { // from class: l.zda0
                        @Override // p149l.d30
                        public final void call() {
                            this.f202659a.m115952t0();
                        }
                    });
                }
            }
        }
        this.f90702e.addOnScrollListener(new C16585b());
    }

    /* JADX INFO: renamed from: d0 */
    private void m115888d0() {
        int i = this.f90715r.f181565e.f181587l;
        if (i >= 0) {
            this.f90709l.mo52288m2(i, false);
        }
        this.f90718u = new SmoothScrollLinearLayoutManager(getContext());
        this.f90702e.setItemAnimator(null);
        this.f90702e.setLayoutManager(this.f90718u);
        this.f90702e.setAdapter(this.f90722y);
        this.f90702e.addOnScrollListener(this.f90696A);
        if (this.f90715r.m198504E()) {
            this.f90702e.post(new Runnable() { // from class: l.eda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f90597a.m115953u0();
                }
            });
        }
        this.f90702e.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC16584a());
    }

    /* JADX INFO: renamed from: f0 */
    private void m115891f0() {
        if (ogl0.m164248a0()) {
            if ((this.f90715r.m198539o() || this.f90715r.m198505F()) && !CoreModule.f17545c.f19639e0.m169476c8() && !CoreModule.f17545c.f19639e0.m169520na().isJailed() && swh0.m186270v0() > 0 && !myc0.m157001d0().f136285j.contains(this.f90715r.f181564d) && myc0.m157001d0().m157005f0() && (this.f90714q instanceof fm40)) {
                e51.m114743H(getAct(), new Runnable() { // from class: l.nda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f138273a.m115958z0();
                    }
                }, 1000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m115898o0() {
        lra0.m151149h("button");
        this.f90708k.m214108U2();
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m115904w() {
        if (C4348d.m20896l().m20912x("share_tip")) {
            C4348d.m20896l().m20900k("share_tip");
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m115908A0() {
        this.f90712o.m52840y1();
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m115909B0() {
        this.f90712o.m52841z1();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f90707j.act();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m115910D0() {
        this.f90712o.m52780A1();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m115911E0(LinearLayout linearLayout) {
        if (this.f90708k.m214101N1().m52715V()) {
            return;
        }
        m115934W0("点击推荐给好友", linearLayout);
        this.f90708k.m214101N1().m52711R();
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m115912G0() {
        this.f90712o.m52791I1(new e30() { // from class: l.tda0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f169543a.m115911E0((LinearLayout) obj);
            }
        }, 0L);
    }

    /* JADX INFO: renamed from: I0 */
    public void m115913I0() {
        du2.m113670a("[core][profile]", "onEnterAnimEnd");
        this.f90707j.f33978E = false;
        PerformanceLogUtil.logBegin(new Object().hashCode(), ProfileLogEntity.ProfileLogName.CUSTOM, "onEnterAnimEnd");
        this.f90697B.onNext(roj0.f160388a);
        this.f90712o.mo131811a(new d30() { // from class: l.uda0
            @Override // p149l.d30
            public final void call() {
                this.f175905a.m115908A0();
            }
        });
        if (this.f90707j.f33979F) {
            this.f90708k.m214112W2();
        }
    }

    /* JADX INFO: renamed from: J0 */
    public void m115914J0() {
        du2.m113670a("[core][profile]", "onEnterAnimStart");
        PerformanceLogUtil.logBegin(new Object().hashCode(), ProfileLogEntity.ProfileLogName.CUSTOM, "preEnterAnimStart");
        this.f90707j.f33978E = true;
        this.f90712o.mo131811a(new d30() { // from class: l.rda0
            @Override // p149l.d30
            public final void call() {
                this.f158906a.m115909B0();
            }
        });
    }

    /* JADX INFO: renamed from: K0 */
    public void m115915K0() {
        this.f90707j.f33978E = true;
        this.f90712o.mo131811a(new d30() { // from class: l.vda0
            @Override // p149l.d30
            public final void call() {
                this.f181071a.m115910D0();
            }
        });
    }

    /* JADX INFO: renamed from: L0 */
    public void m115916L0(Bundle bundle) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.PRE_CREATE_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        this.f90707j.setHasOptionsMenu(true);
        m115937a0();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
    }

    /* JADX INFO: renamed from: M0 */
    public final void m115917M0() {
        jg90 jg90Var = this.f90713p;
        if (jg90Var.f117758v == null || !jg90Var.m131823u().isAttachedToWindow()) {
            if (this.f90718u.findFirstCompletelyVisibleItemPosition() > 2) {
                this.f90705h.m52949g(1.0f);
                return;
            }
            return;
        }
        int[] iArr = new int[2];
        this.f90705h.getLocationInWindow(iArr);
        float height = iArr[1] + this.f90705h.getHeight();
        int[] iArr2 = new int[2];
        this.f90713p.f117758v.getLocationInWindow(iArr2);
        this.f90705h.m52949g((height - iArr2[1]) / this.f90713p.f117758v.getHeight());
    }

    /* JADX INFO: renamed from: N0 */
    public final void m115918N0(boolean z) {
        if (NullChecker.m81303a(this.f90712o.f34009H) && NullChecker.m81303a(this.f90712o.f34015K) && NullChecker.m81303a(this.f90712o.f34017L) && this.f90712o.m131823u().isAttachedToWindow()) {
            if (!this.f90708k.m214109V1(this.f90715r.f181561a) || NullChecker.m81303a(this.f90712o.f34013J)) {
                this.f90712o.m52839x1(z);
            }
        }
    }

    /* JADX INFO: renamed from: O0 */
    public int m115919O0() {
        return this.f90723z;
    }

    /* JADX INFO: renamed from: P */
    public View m115920P(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fea0.m121028b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: P0 */
    public void m115921P0() {
        this.f90705h.setVisibility(0);
        ProfileCustomBar profileCustomBar = this.f90705h;
        vi90 vi90Var = this.f90715r;
        profileCustomBar.m52953k(vi90Var.f181561a, vi90Var.f181562b, vi90Var.m198511L(), getAct() instanceof NewUI1ContainerActivity);
    }

    /* JADX INFO: renamed from: Q */
    public final void m115922Q() {
        e51.m114743H(getAct(), new Runnable() { // from class: l.qda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f153901a.m115940h0();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m115923Q0() {
        List<hn2<?>> arrayList = new ArrayList<>();
        if (NullChecker.m81303a(this.f90699b) && NullChecker.m81303a(this.f90715r.f181561a) && this.f90715r.m198530e()) {
            int childCount = this.f90699b.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.f90699b.getChildAt(i);
                xdl0.m208345M0(childAt, childAt == this.f90701d || childAt == this.f90702e);
            }
            arrayList.add(this.f90712o);
            arrayList.add(this.f90713p);
        } else {
            arrayList = m115928T(this.f90721x);
        }
        this.f90722y.m156190M(arrayList);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(yca0 yca0Var) {
        this.f90708k = yca0Var;
    }

    /* JADX INFO: renamed from: R0 */
    public void m115925R0(final int i) {
        final kea0 kea0Var = (kea0) this.f90716s.m165527d(kea0.class);
        if (NullChecker.m81303a(kea0Var)) {
            kea0Var.mo131811a(new d30() { // from class: l.jda0
                @Override // p149l.d30
                public final void call() {
                    kea0Var.m145758Y(i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: S */
    public int m115926S() {
        return this.f90712o.m52798N0();
    }

    /* JADX INFO: renamed from: S0 */
    public void m115927S0(boolean z) {
        boolean zIsFemale = false;
        if (z) {
            ((ViewGroup) getAct().getWindow().getDecorView()).setMotionEventSplittingEnabled(true);
            xdl0.m208345M0(this.f90703f, false);
            wge0.m203034f().m203036c(this.f90715r.f181564d, this.f90703f.m55791u(), false, OMSDialogPositon.p_suggest_user_profile_info_view);
            m115880X(ProfileButton.ProfileButtonType.SuperLike).m52392a().callOnClick();
            return;
        }
        ((ViewGroup) getAct().getWindow().getDecorView()).setMotionEventSplittingEnabled(false);
        boolean zEquals = TextUtils.equals(this.f90715r.f181564d, rxg0.m181572j().f161468m);
        xdl0.m208345M0(this.f90703f, true);
        SuperLikeComboAnimView superLikeComboAnimView = this.f90703f;
        if (NullChecker.m81303a(this.f90715r.f181561a)) {
            zIsFemale = this.f90715r.f181561a.isFemale();
        } else if (NullChecker.m81303a(this.f90708k.m214106R2()) && !this.f90708k.m214106R2().isFemale()) {
            zIsFemale = true;
        }
        superLikeComboAnimView.m55788r(zEquals, true, zIsFemale);
    }

    /* JADX INFO: renamed from: T */
    public final List<hn2<?>> m115928T(List<hn2<?>> list) {
        ArrayList arrayList = new ArrayList();
        hn2<?> hn2Var = null;
        int i = 0;
        for (hn2<?> hn2Var2 : list) {
            if (hn2Var2.mo52729l()) {
                if (hn2Var2.mo52385k() && (i = i + 1) > 1) {
                    if (hn2Var instanceof yqa0) {
                        dj90 dj90Var = new dj90(this.f90709l, this.f90707j);
                        this.f90711n = dj90Var;
                        dj90Var.m131824v(t100.m186890d(4.0f));
                        arrayList.add(this.f90711n);
                    } else if (hn2Var instanceof fr90) {
                        dj90 dj90Var2 = new dj90(this.f90709l, this.f90707j);
                        this.f90711n = dj90Var2;
                        dj90Var2.m131824v(t100.m186890d(9.0f));
                        arrayList.add(this.f90711n);
                    } else if (hn2Var instanceof bq90) {
                        dj90 dj90Var3 = new dj90(this.f90709l, this.f90707j);
                        this.f90711n = dj90Var3;
                        dj90Var3.m131824v(t100.m186890d(16.0f));
                        arrayList.add(this.f90711n);
                    } else if (hn2Var instanceof uta0) {
                        dj90 dj90Var4 = new dj90(this.f90709l, this.f90707j);
                        this.f90711n = dj90Var4;
                        dj90Var4.m131824v(t100.m186890d(9.0f));
                        arrayList.add(this.f90711n);
                    } else if (hn2Var instanceof kr90) {
                        dj90 dj90Var5 = new dj90(this.f90709l, this.f90707j);
                        this.f90711n = dj90Var5;
                        dj90Var5.m131824v(t100.m186890d(24.0f));
                        arrayList.add(this.f90711n);
                    } else {
                        arrayList.add(this.f90710m);
                    }
                }
                arrayList.add(hn2Var2);
                hn2Var = hn2Var2;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: T0 */
    public void m115929T0() {
        this.f90700c.setVisibility(4);
        this.f90702e.setVisibility(0);
        this.f90701d.setVisibility(0);
    }

    /* JADX INFO: renamed from: U */
    public ProfileButton m115930U(ProfileButton.ProfileButtonType profileButtonType) {
        if (NullChecker.m81303a(this.f90714q)) {
            return this.f90714q.mo114662e(profileButtonType);
        }
        return null;
    }

    /* JADX INFO: renamed from: U0 */
    public void m115931U0() {
        this.f90702e.setVisibility(4);
        this.f90701d.setVisibility(4);
        this.f90700c.setVisibility(0);
    }

    /* JADX INFO: renamed from: V0 */
    public void m115932V0() {
        this.f90712o.mo131811a(new d30() { // from class: l.hda0
            @Override // p149l.d30
            public final void call() {
                this.f107225a.m115912G0();
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public hh90 m115933W() {
        return this.f90714q;
    }

    /* JADX INFO: renamed from: W0 */
    public final void m115934W0(String str, LinearLayout linearLayout) {
        if (c30.m104964f(this.f90715r.m198526a())) {
            if (C4348d.m20896l().m20912x("share_tip")) {
                C4348d.m20896l().m20900k("share_tip");
            }
            C4348d.m20896l().m20909u(new C4345a(this.f90715r.m198526a()).m20849D(str).m20847B(t100.m186890d(2.0f)).m20871l(t100.m186890d(9.0f)).m20874p(75).m20855J(13.0f).m20881w(t100.m186890d(5.0f)).m20861b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m20864e(false).m20869j(new C4345a.c() { // from class: l.sda0
                @Override // com.p046p1.mobile.android.p048ui.bubble.C4345a.c
                /* JADX INFO: renamed from: a */
                public final void mo20886a(String str2) {
                    eea0.m115882a(str2);
                }
            }).m20875q(C4345a.f15680N | C4345a.f15684R), linearLayout, "share_tip");
        }
    }

    /* JADX INFO: renamed from: X0 */
    public void m115935X0(int i) {
        if (NullChecker.m81303a(this.f90720w)) {
            this.f90720w.mo52396b(i);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m115936Y() {
        if (NullChecker.m81303a(this.f90712o.f34053g1)) {
            ProfileImagesItemHolder profileImagesItemHolder = this.f90712o;
            profileImagesItemHolder.m52814V0(profileImagesItemHolder.f34053g1, false);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m115937a0() {
        this.f90710m = new dj90(this.f90709l, this.f90707j);
        if (!this.f90715r.m198510K() && NullChecker.m81303a(this.f90708k.m214117Z2()) && this.f90708k.m214117Z2().unilateralBlock()) {
            this.f90716s = new v33(this.f90709l, this.f90707j);
        } else {
            this.f90716s = new un40(this.f90709l, this.f90707j);
        }
        this.f90721x.addAll(this.f90716s.m165526c());
        this.f90712o = (ProfileImagesItemHolder) this.f90716s.m165527d(ProfileImagesItemHolder.class);
        this.f90713p = (jg90) this.f90716s.m165527d(wg90.class);
        this.f90717t = (l33) this.f90716s.m165527d(l33.class);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m115938e0() {
        if (this.f90715r.m198539o() || TextUtils.equals("share_profile", this.f90715r.f181562b) || this.f90715r.m198505F()) {
            this.f90708k.m214101N1().m52710Q();
            if (this.f90708k.m214101N1().m52716W()) {
                this.f90712o.mo131811a(new d30() { // from class: l.fda0
                    @Override // p149l.d30
                    public final void call() {
                        this.f97022a.m115955w0();
                    }
                });
            }
        } else if (TextUtils.equals(this.f90715r.f181562b, "p_game_cp") || TextUtils.equals(this.f90715r.f181562b, "p_game_cp_msg")) {
            this.f90712o.mo131811a(new d30() { // from class: l.gda0
                @Override // p149l.d30
                public final void call() {
                    this.f102097a.m115957y0();
                }
            });
        }
        if (NullChecker.m81303a(this.f90705h)) {
            if (this.f90715r.m198539o() || TextUtils.equals("share_profile", this.f90715r.f181562b)) {
                ((VImage) this.f90705h.findViewById(u4c0.f174031S8)).setImageResource(x2c0.f190245ip);
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m115939g0(Class<? extends hn2<a1m>> cls) {
        ah90 ah90Var = (ah90) this.f90716s.m165527d(cls);
        return NullChecker.m81303a(ah90Var) && ah90Var.mo52729l();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m115940h0() {
        Class<? extends hn2<a1m>> cls;
        if (TextUtils.equals(this.f90715r.f181562b, "from_auto_scroll_to_question")) {
            cls = ioe.class;
            if (!m115939g0(cls)) {
                cls = null;
            }
        } else {
            if (!TextUtils.equals(this.f90715r.f181562b, "p_game_cp") && !TextUtils.equals(this.f90715r.f181562b, "p_game_cp_msg")) {
                return;
            }
            cls = ProfileGameItemHolder.class;
            if (!m115939g0(cls)) {
                cls = null;
            }
        }
        if (cls == null) {
            return;
        }
        int iM156186I = this.f90722y.m156186I(cls);
        if (!NullChecker.m81303a(this.f90722y) || iM156186I < 0 || iM156186I >= this.f90722y.getPageCount()) {
            return;
        }
        C16587d c16587d = new C16587d(this.f90715r.m198526a());
        c16587d.setTargetPosition(iM156186I);
        this.f90718u.startSmoothScroll(c16587d);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m115941i0() {
        ViewGroup.LayoutParams layoutParams = this.f90717t.m131823u().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.f90714q.m130942d().m52389a() != LayoutDesc.ComboType.None ? t100.m186890d(164.0f) : t100.m186890d(0.0f);
            this.f90717t.m131823u().setLayoutParams(layoutParams);
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.INFLATE_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        View viewM115920P = m115920P(layoutInflater, viewGroup);
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        return viewM115920P;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m115942j0() {
        this.f90708k.m214101N1().m52707N();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m115943k0() {
        this.f90708k.m214101N1().m52707N();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m115944l0() {
        this.f90712o.m52796L1(new d30() { // from class: l.ida0
            @Override // p149l.d30
            public final void call() {
                this.f112541a.m115943k0();
            }
        }, null);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m115945m0() {
        gd70.m125540b().m125542d(getAct());
        this.f90707j.startActivity(ProfileAct.m50738p2(getAct(), this.f90715r.f181564d, "profile_frag_menu", false, true));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m115946n0(d30 d30Var) {
        this.f90712o.m52794K1(d30Var);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m115947p0() {
        this.f90708k.m214101N1().m52708O();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m115948q0() {
        this.f90708k.m214101N1().m52708O();
    }

    /* JADX INFO: renamed from: r */
    public void m115949r() {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.INIT_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        if (this.f90715r.m198510K()) {
            getAct().setTitle(this.f90707j.m20604x4(R$string.f18488ei));
        }
        m115886c0();
        m115884b0();
        m115871H0();
        m115891f0();
        m115938e0();
        m115888d0();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        if (this.f90715r.m198511L() && this.f90715r.f181565e.f181586k == null) {
            getAct().lambda$debugItems$19();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m115950r0() {
        this.f90712o.m52796L1(new d30() { // from class: l.oda0
            @Override // p149l.d30
            public final void call() {
                this.f143193a.m115948q0();
            }
        }, new d30() { // from class: l.pda0
            @Override // p149l.d30
            public final void call() {
                eea0.m115904w();
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m115951s0(LinearLayout linearLayout) {
        if (this.f90708k.m214101N1().m52715V()) {
            return;
        }
        m115934W0("点击推荐给好友", linearLayout);
        this.f90708k.m214101N1().m52711R();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m115952t0() {
        this.f90712o.m52791I1(new e30() { // from class: l.mda0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133224a.m115951s0((LinearLayout) obj);
            }
        }, 2000L);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m115953u0() {
        Act act = getAct();
        if (act == null || act.isFinishing()) {
            return;
        }
        this.f90702e.scrollBy(0, ProfileImagesItemHolder.f33997k1);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m115954v0(LinearLayout linearLayout) {
        if (this.f90708k.m214101N1().m52715V()) {
            return;
        }
        m115934W0("点击推荐给好友", linearLayout);
        this.f90708k.m214101N1().m52711R();
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m115955w0() {
        this.f90712o.m52791I1(new e30() { // from class: l.lda0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f127531a.m115954v0((LinearLayout) obj);
            }
        }, 0L);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m115956x0(LinearLayout linearLayout) {
        if (this.f90708k.m214101N1().m52719w()) {
            m115934W0("分享用户，一起组队打游戏", linearLayout);
            this.f90708k.m214101N1().m52709P();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m115957y0() {
        this.f90712o.m52791I1(new e30() { // from class: l.kda0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122548a.m115956x0((LinearLayout) obj);
            }
        }, 0L);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m115958z0() {
        myc0.m157001d0().f136285j.add(this.f90715r.f181564d);
        myc0.m157001d0().m157010l0();
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
