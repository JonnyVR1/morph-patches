package p002l;

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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import com.p000p1.mobile.putong.core.p001ui.profile.ParallaxView;
import com.p000p1.mobile.putong.core.p001ui.profile.ProfileAct;
import com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.PerformanceLogUtil;
import com.p000p1.mobile.putong.core.p001ui.profile.helpers.performance.ProfileLogEntity;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.SmoothScrollLinearLayoutManager;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.C0147a;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.InterfaceC0148b;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.LayoutDesc;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.buttons.ProfileButton;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.imp.ProfileListFragLocalImpl;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.itemholders.ProfileGameItemHolder;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.itemholders.ProfileImagesItemHolder;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileCustomBar;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.core.CoreBusinessModule;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.newui.container.NewUI1ContainerActivity;
import com.p1.mobile.putong.core.ui.superlikeopt.upgrade.SuperLikeComboAnimView;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.c30;
import l.d30;
import l.du2;
import l.e30;
import l.e51;
import l.f9k0;
import l.fea0;
import l.lra0;
import l.myc0;
import l.ogl0;
import l.roj0;
import l.rxg0;
import l.s7m;
import l.swh0;
import l.t100;
import l.u4c0;
import l.v9j;
import l.wge0;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import rx.subjects.a;
import v.VFrame;
import v.VProgressBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class eea0 implements s7m<yca0> {

    /* JADX INFO: renamed from: a */
    public VFrame f9692a;

    /* JADX INFO: renamed from: b */
    public VFrame f9693b;

    /* JADX INFO: renamed from: c */
    public VProgressBar f9694c;

    /* JADX INFO: renamed from: d */
    public ParallaxView f9695d;

    /* JADX INFO: renamed from: e */
    public RecyclerView f9696e;

    /* JADX INFO: renamed from: f */
    public SuperLikeComboAnimView f9697f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f9698g;

    /* JADX INFO: renamed from: h */
    public ProfileCustomBar f9699h;

    /* JADX INFO: renamed from: i */
    public View f9700i;

    /* JADX INFO: renamed from: j */
    public final ProfileListFragLocalImpl f9701j;

    /* JADX INFO: renamed from: k */
    public yca0 f9702k;

    /* JADX INFO: renamed from: l */
    public final io90 f9703l;

    /* JADX INFO: renamed from: m */
    public dj90 f9704m;

    /* JADX INFO: renamed from: n */
    public dj90 f9705n;

    /* JADX INFO: renamed from: o */
    public ProfileImagesItemHolder f9706o;

    /* JADX INFO: renamed from: p */
    public jg90 f9707p;

    /* JADX INFO: renamed from: r */
    public vi90 f9709r;

    /* JADX INFO: renamed from: s */
    public or90 f9710s;

    /* JADX INFO: renamed from: t */
    public l33 f9711t;

    /* JADX INFO: renamed from: u */
    public LinearLayoutManager f9712u;

    /* JADX INFO: renamed from: w */
    public InterfaceC0148b f9714w;

    /* JADX INFO: renamed from: q */
    public hh90 f9708q = null;

    /* JADX INFO: renamed from: v */
    public final List<InterfaceC0148b> f9713v = new ArrayList();

    /* JADX INFO: renamed from: x */
    public final List<hn2<?>> f9715x = new ArrayList();

    /* JADX INFO: renamed from: y */
    public mt90 f9716y = new mt90();

    /* JADX INFO: renamed from: z */
    public int f9717z = 0;

    /* JADX INFO: renamed from: A */
    public final RecyclerView.t f9690A = new C0542c();

    /* JADX INFO: renamed from: B */
    public final a<roj0> f9691B = a.b();

    /* JADX INFO: renamed from: l.eea0$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC0540a implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC0540a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            eea0.this.f9696e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            eea0.this.m12390Q();
        }
    }

    /* JADX INFO: renamed from: l.eea0$b */
    public class C0541b extends RecyclerView.t {
        public C0541b() {
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            eea0.this.m12385M0();
            eea0.this.m12386N0(recyclerView.canScrollVertically(-1));
        }
    }

    /* JADX INFO: renamed from: l.eea0$c */
    public class C0542c extends RecyclerView.t {

        /* JADX INFO: renamed from: a */
        public int f9720a = 0;

        public C0542c() {
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            eea0.this.f9717z += i2;
            eea0 eea0Var = eea0.this;
            eea0Var.f9706o.m3361S1(eea0Var.f9717z);
            if (f9k0.a()) {
                return;
            }
            if ((TextUtils.equals("share_profile", eea0.this.f9709r.f21138b) || eea0.this.f9709r.m23992o() || eea0.this.f9709r.m23958F()) && !User.isTeamAccount(eea0.this.f9709r.f21140d) && !eea0.this.f9709r.m23963K() && NullChecker.a(recyclerView.getAdapter()) && recyclerView.getAdapter().getItemCount() >= 1) {
                if (NullChecker.a(eea0.this.f9712u) && eea0.this.f9712u.findLastVisibleItemPosition() == recyclerView.getAdapter().getItemCount() - 1 && this.f9720a != recyclerView.getAdapter().getItemCount() - 1) {
                    zvf0.x("e_suggest_user_profile_info_view_share", eea0.this.f9702k.pageId());
                }
                this.f9720a = eea0.this.f9712u.findLastVisibleItemPosition();
            }
        }
    }

    /* JADX INFO: renamed from: l.eea0$d */
    public class C0543d extends n {
        public C0543d(Context context) {
            super(context);
        }

        public float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 50.0f / displayMetrics.densityDpi;
        }

        public int getVerticalSnapPreference() {
            return -1;
        }
    }

    public eea0(ProfileListFragLocalImpl profileListFragLocalImpl, vi90 vi90Var) {
        this.f9701j = profileListFragLocalImpl;
        this.f9709r = vi90Var;
        this.f9703l = profileListFragLocalImpl.f1797B;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ Boolean m12332B() {
        PerformanceLogUtil.logEnd(PerformanceLogUtil.instance().tranceHash, ProfileLogEntity.ProfileLogName.CARD_CLICK);
        PerformanceLogUtil.instance().endTrance();
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: H0 */
    private void m12338H0() {
        xdl0.b0(this.f9693b, new v9j() { // from class: l.dda0
            public final Object call() {
                return eea0.m12332B();
            }
        });
    }

    /* JADX INFO: renamed from: V */
    private InterfaceC0148b m12346V(vi90 vi90Var) {
        for (InterfaceC0148b interfaceC0148b : this.f9713v) {
            if (interfaceC0148b.mo2929a(vi90Var)) {
                this.f9714w = interfaceC0148b;
                du2.a("[core][profile]", "init Button Strategy : ".concat(interfaceC0148b.getClass().getSimpleName()));
                return this.f9714w;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: X */
    private ProfileButton m12347X(ProfileButton.ProfileButtonType profileButtonType) {
        return this.f9708q.mo12175e(profileButtonType);
    }

    /* JADX INFO: renamed from: Z */
    private void m12348Z() {
        this.f9713v.add(new uf70(this.f9709r));
        this.f9713v.add(new xic0(this.f9709r));
        this.f9713v.add(new gfr(this.f9709r));
        this.f9713v.add(new geb0(this.f9709r));
        this.f9713v.add(new g45(this.f9709r));
        this.f9713v.add(new h7l0(this.f9709r));
        this.f9713v.add(new f5l(this.f9709r));
        this.f9713v.add(new fl5(this.f9709r));
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m12349a(String str) {
    }

    /* JADX INFO: renamed from: b0 */
    private void m12351b0() {
        m12348Z();
        this.f9714w = m12346V(this.f9709r);
        hh90 hh90VarM2928a = new C0147a(m12377C0()).m2928a(this.f9714w);
        this.f9708q = hh90VarM2928a;
        du2.a("[core][profile]", "generate button layout : ".concat(hh90VarM2928a.getClass().getSimpleName()));
        this.f9698g.addView(this.f9708q.m14370k(), new FrameLayout.LayoutParams(-1, t100.d(164.0f)));
        this.f9714w.mo2932d(this.f9708q);
        this.f9702k.f22793b.onNext(roj0.a);
        if (this.f9708q.m14368d().m2923a() != LayoutDesc.ComboType.None) {
            this.f9711t.mo14451a(new d30() { // from class: l.cda0
                public final void call() {
                    this.f8598a.m12409i0();
                }
            });
        }
    }

    /* JADX INFO: renamed from: c0 */
    private void m12353c0() {
        if (NullChecker.a(act().getSupportActionBar())) {
            act().getSupportActionBar().m();
        }
        CoreBusinessModule.m0().h(this.f9699h);
        this.f9699h.setBackCallBack(new d30() { // from class: l.wda0
            public final void call() {
                this.f21657a.m12365o0();
            }
        });
        if (this.f9709r.m23963K()) {
            final d30 d30Var = new d30() { // from class: l.cea0
                public final void call() {
                    this.f8612a.m12414m0();
                }
            };
            this.f9699h.setEditCallBack(d30Var);
            this.f9706o.mo14451a(new d30() { // from class: l.dea0
                public final void call() {
                    this.f9182a.m12415n0(d30Var);
                }
            });
        } else {
            boolean zA = f9k0.a();
            ProfileCustomBar profileCustomBar = this.f9699h;
            if (zA) {
                profileCustomBar.setMoreCallBack(new d30() { // from class: l.aea0
                    public final void call() {
                        this.f7518a.m12411j0();
                    }
                });
                this.f9706o.mo14451a(new d30() { // from class: l.bea0
                    public final void call() {
                        this.f8094a.m12413l0();
                    }
                });
            } else {
                profileCustomBar.setMoreCallBack(new d30() { // from class: l.xda0
                    public final void call() {
                        this.f22237a.m12416p0();
                    }
                });
                this.f9706o.mo14451a(new d30() { // from class: l.yda0
                    public final void call() {
                        this.f22810a.m12419r0();
                    }
                });
                if (this.f9709r.m23992o() || TextUtils.equals("share_profile", this.f9709r.f21138b) || this.f9709r.m23958F()) {
                    this.f9706o.mo14451a(new d30() { // from class: l.zda0
                        public final void call() {
                            this.f23348a.m12421t0();
                        }
                    });
                }
            }
        }
        this.f9696e.addOnScrollListener(new C0541b());
    }

    /* JADX INFO: renamed from: d0 */
    private void m12355d0() {
        int i = this.f9709r.f21141e.f21163l;
        if (i >= 0) {
            this.f9703l.mo2820m2(i, false);
        }
        this.f9712u = new SmoothScrollLinearLayoutManager(m12377C0());
        this.f9696e.setItemAnimator((RecyclerView.l) null);
        this.f9696e.setLayoutManager(this.f9712u);
        this.f9696e.setAdapter(this.f9716y);
        this.f9696e.addOnScrollListener(this.f9690A);
        if (this.f9709r.m23957E()) {
            this.f9696e.post(new Runnable() { // from class: l.eda0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f9678a.m12422u0();
                }
            });
        }
        this.f9696e.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0540a());
    }

    /* JADX INFO: renamed from: f0 */
    private void m12358f0() {
        if (ogl0.a0()) {
            if ((this.f9709r.m23992o() || this.f9709r.m23958F()) && !CoreModule.c.e0.c8() && !CoreModule.c.e0.na().isJailed() && swh0.v0() > 0 && !myc0.d0().j.contains(this.f9709r.f21140d) && myc0.d0().f0() && (this.f9708q instanceof fm40)) {
                e51.H(act(), new Runnable() { // from class: l.nda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f15959a.m12427z0();
                    }
                }, 1000L);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o0 */
    public /* synthetic */ void m12365o0() {
        lra0.h("button");
        this.f9702k.m26608U2();
    }

    /* JADX INFO: renamed from: w */
    public static /* synthetic */ void m12371w() {
        if (d.l().x("share_tip")) {
            d.l().k("share_tip");
        }
    }

    /* JADX INFO: renamed from: A0 */
    public final /* synthetic */ void m12375A0() {
        this.f9706o.m3391y1();
    }

    /* JADX INFO: renamed from: B0 */
    public final /* synthetic */ void m12376B0() {
        this.f9706o.m3392z1();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m12377C0() {
        return this.f9701j.act();
    }

    /* JADX INFO: renamed from: D0 */
    public final /* synthetic */ void m12378D0() {
        this.f9706o.m3331A1();
    }

    /* JADX INFO: renamed from: E0 */
    public final /* synthetic */ void m12379E0(LinearLayout linearLayout) {
        if (this.f9702k.m26601N1().m3266V()) {
            return;
        }
        m12402W0("点击推荐给好友", linearLayout);
        this.f9702k.m26601N1().m3262R();
    }

    /* JADX INFO: renamed from: G0 */
    public final /* synthetic */ void m12380G0() {
        this.f9706o.m3342I1(new e30() { // from class: l.tda0
            public final void call(Object obj) {
                this.f20189a.m12379E0((LinearLayout) obj);
            }
        }, 0L);
    }

    /* JADX INFO: renamed from: I0 */
    public void m12381I0() {
        du2.a("[core][profile]", "onEnterAnimEnd");
        this.f9701j.f1800E = false;
        PerformanceLogUtil.logBegin(new Object().hashCode(), ProfileLogEntity.ProfileLogName.CUSTOM, "onEnterAnimEnd");
        this.f9691B.onNext(roj0.a);
        this.f9706o.mo14451a(new d30() { // from class: l.uda0
            public final void call() {
                this.f20594a.m12375A0();
            }
        });
        if (this.f9701j.f1801F) {
            this.f9702k.m26612W2();
        }
    }

    /* JADX INFO: renamed from: J0 */
    public void m12382J0() {
        du2.a("[core][profile]", "onEnterAnimStart");
        PerformanceLogUtil.logBegin(new Object().hashCode(), ProfileLogEntity.ProfileLogName.CUSTOM, "preEnterAnimStart");
        this.f9701j.f1800E = true;
        this.f9706o.mo14451a(new d30() { // from class: l.rda0
            public final void call() {
                this.f18479a.m12376B0();
            }
        });
    }

    /* JADX INFO: renamed from: K0 */
    public void m12383K0() {
        this.f9701j.f1800E = true;
        this.f9706o.mo14451a(new d30() { // from class: l.vda0
            public final void call() {
                this.f21087a.m12378D0();
            }
        });
    }

    /* JADX INFO: renamed from: L0 */
    public void m12384L0(Bundle bundle) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.PRE_CREATE_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        this.f9701j.setHasOptionsMenu(true);
        m12405a0();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
    }

    /* JADX INFO: renamed from: M0 */
    public final void m12385M0() {
        jg90 jg90Var = this.f9707p;
        if (jg90Var.f13755v == null || !jg90Var.m14463u().isAttachedToWindow()) {
            if (this.f9712u.findFirstCompletelyVisibleItemPosition() > 2) {
                this.f9699h.m3507g(1.0f);
                return;
            }
            return;
        }
        int[] iArr = new int[2];
        this.f9699h.getLocationInWindow(iArr);
        float height = iArr[1] + this.f9699h.getHeight();
        int[] iArr2 = new int[2];
        this.f9707p.f13755v.getLocationInWindow(iArr2);
        this.f9699h.m3507g((height - iArr2[1]) / this.f9707p.f13755v.getHeight());
    }

    /* JADX INFO: renamed from: N0 */
    public final void m12386N0(boolean z) {
        if (NullChecker.a(this.f9706o.f1831H) && NullChecker.a(this.f9706o.f1837K) && NullChecker.a(this.f9706o.f1839L) && this.f9706o.m14463u().isAttachedToWindow()) {
            if (!this.f9702k.m26609V1(this.f9709r.f21137a) || NullChecker.a(this.f9706o.f1835J)) {
                this.f9706o.m3390x1(z);
            }
        }
    }

    /* JADX INFO: renamed from: O0 */
    public int m12387O0() {
        return this.f9717z;
    }

    /* JADX INFO: renamed from: P */
    public View m12388P(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return fea0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: P0 */
    public void m12389P0() {
        this.f9699h.setVisibility(0);
        ProfileCustomBar profileCustomBar = this.f9699h;
        vi90 vi90Var = this.f9709r;
        profileCustomBar.m3511k(vi90Var.f21137a, vi90Var.f21138b, vi90Var.m23964L(), act() instanceof NewUI1ContainerActivity);
    }

    /* JADX INFO: renamed from: Q */
    public final void m12390Q() {
        e51.H(act(), new Runnable() { // from class: l.qda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f17940a.m12408h0();
            }
        }, 500L);
    }

    /* JADX INFO: renamed from: Q0 */
    public void m12391Q0() {
        List<hn2<?>> arrayList = new ArrayList<>();
        if (NullChecker.a(this.f9693b) && NullChecker.a(this.f9709r.f21137a) && this.f9709r.m23983e()) {
            int childCount = this.f9693b.getChildCount();
            for (int i = 0; i < childCount; i++) {
                RecyclerView childAt = this.f9693b.getChildAt(i);
                xdl0.M0(childAt, childAt == this.f9695d || childAt == this.f9696e);
            }
            arrayList.add(this.f9706o);
            arrayList.add(this.f9707p);
        } else {
            arrayList = m12396T(this.f9715x);
        }
        this.f9716y.m18160M(arrayList);
    }

    /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
    public void m12410i1(yca0 yca0Var) {
        this.f9702k = yca0Var;
    }

    /* JADX INFO: renamed from: R0 */
    public void m12393R0(final int i) {
        final kea0 kea0Var = (kea0) this.f9710s.m19695d(kea0.class);
        if (NullChecker.a(kea0Var)) {
            kea0Var.mo14451a(new d30() { // from class: l.jda0
                public final void call() {
                    kea0Var.m16607Y(i);
                }
            });
        }
    }

    /* JADX INFO: renamed from: S */
    public int m12394S() {
        return this.f9706o.m3349N0();
    }

    /* JADX INFO: renamed from: S0 */
    public void m12395S0(boolean z) {
        boolean zIsFemale = false;
        if (z) {
            ((ViewGroup) act().getWindow().getDecorView()).setMotionEventSplittingEnabled(true);
            xdl0.M0(this.f9697f, false);
            wge0.f().c(this.f9709r.f21140d, this.f9697f.u(), false, "p_suggest_user_profile_info_view");
            m12347X(ProfileButton.ProfileButtonType.SuperLike).m2926a().callOnClick();
            return;
        }
        ((ViewGroup) act().getWindow().getDecorView()).setMotionEventSplittingEnabled(false);
        boolean zEquals = TextUtils.equals(this.f9709r.f21140d, rxg0.j().m);
        xdl0.M0(this.f9697f, true);
        SuperLikeComboAnimView superLikeComboAnimView = this.f9697f;
        if (NullChecker.a(this.f9709r.f21137a)) {
            zIsFemale = this.f9709r.f21137a.isFemale();
        } else if (NullChecker.a(this.f9702k.m26606R2()) && !this.f9702k.m26606R2().isFemale()) {
            zIsFemale = true;
        }
        superLikeComboAnimView.r(zEquals, true, zIsFemale);
    }

    /* JADX INFO: renamed from: T */
    public final List<hn2<?>> m12396T(List<hn2<?>> list) {
        ArrayList arrayList = new ArrayList();
        hn2<?> hn2Var = null;
        int i = 0;
        for (hn2<?> hn2Var2 : list) {
            if (hn2Var2.mo3280l()) {
                if (hn2Var2.mo2919k() && (i = i + 1) > 1) {
                    if (hn2Var instanceof yqa0) {
                        dj90 dj90Var = new dj90(this.f9703l, this.f9701j);
                        this.f9705n = dj90Var;
                        dj90Var.m14464v(t100.d(4.0f));
                        arrayList.add(this.f9705n);
                    } else if (hn2Var instanceof fr90) {
                        dj90 dj90Var2 = new dj90(this.f9703l, this.f9701j);
                        this.f9705n = dj90Var2;
                        dj90Var2.m14464v(t100.d(9.0f));
                        arrayList.add(this.f9705n);
                    } else if (hn2Var instanceof bq90) {
                        dj90 dj90Var3 = new dj90(this.f9703l, this.f9701j);
                        this.f9705n = dj90Var3;
                        dj90Var3.m14464v(t100.d(16.0f));
                        arrayList.add(this.f9705n);
                    } else if (hn2Var instanceof uta0) {
                        dj90 dj90Var4 = new dj90(this.f9703l, this.f9701j);
                        this.f9705n = dj90Var4;
                        dj90Var4.m14464v(t100.d(9.0f));
                        arrayList.add(this.f9705n);
                    } else if (hn2Var instanceof kr90) {
                        dj90 dj90Var5 = new dj90(this.f9703l, this.f9701j);
                        this.f9705n = dj90Var5;
                        dj90Var5.m14464v(t100.d(24.0f));
                        arrayList.add(this.f9705n);
                    } else {
                        arrayList.add(this.f9704m);
                    }
                }
                arrayList.add(hn2Var2);
                hn2Var = hn2Var2;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: T0 */
    public void m12397T0() {
        this.f9694c.setVisibility(4);
        this.f9696e.setVisibility(0);
        this.f9695d.setVisibility(0);
    }

    /* JADX INFO: renamed from: U */
    public ProfileButton m12398U(ProfileButton.ProfileButtonType profileButtonType) {
        if (NullChecker.a(this.f9708q)) {
            return this.f9708q.mo12175e(profileButtonType);
        }
        return null;
    }

    /* JADX INFO: renamed from: U0 */
    public void m12399U0() {
        this.f9696e.setVisibility(4);
        this.f9695d.setVisibility(4);
        this.f9694c.setVisibility(0);
    }

    /* JADX INFO: renamed from: V0 */
    public void m12400V0() {
        this.f9706o.mo14451a(new d30() { // from class: l.hda0
            public final void call() {
                this.f11992a.m12380G0();
            }
        });
    }

    /* JADX INFO: renamed from: W */
    public hh90 m12401W() {
        return this.f9708q;
    }

    /* JADX INFO: renamed from: W0 */
    public final void m12402W0(String str, LinearLayout linearLayout) {
        if (c30.f(this.f9709r.m23979a())) {
            if (d.l().x("share_tip")) {
                d.l().k("share_tip");
            }
            d.l().u(new com.p1.mobile.android.ui.bubble.a(this.f9709r.m23979a()).D(str).B(t100.d(2.0f)).l(t100.d(9.0f)).p(75).J(13.0f).w(t100.d(5.0f)).b(5000L).e(false).j(new com.p1.mobile.android.ui.bubble.a.c() { // from class: l.sda0
                /* JADX INFO: renamed from: a */
                public final void m22359a(String str2) {
                    eea0.m12349a(str2);
                }
            }).q(com.p1.mobile.android.ui.bubble.a.N | com.p1.mobile.android.ui.bubble.a.R), linearLayout, "share_tip");
        }
    }

    /* JADX INFO: renamed from: X0 */
    public void m12403X0(int i) {
        if (NullChecker.a(this.f9714w)) {
            this.f9714w.mo2930b(i);
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m12404Y() {
        if (NullChecker.a(this.f9706o.f1875g1)) {
            ProfileImagesItemHolder profileImagesItemHolder = this.f9706o;
            profileImagesItemHolder.m3365V0(profileImagesItemHolder.f1875g1, false);
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m12405a0() {
        this.f9704m = new dj90(this.f9703l, this.f9701j);
        if (!this.f9709r.m23963K() && NullChecker.a(this.f9702k.m26618Z2()) && this.f9702k.m26618Z2().unilateralBlock()) {
            this.f9710s = new v33(this.f9703l, this.f9701j);
        } else {
            this.f9710s = new un40(this.f9703l, this.f9701j);
        }
        this.f9715x.addAll(this.f9710s.m19694c());
        this.f9706o = (ProfileImagesItemHolder) this.f9710s.m19695d(ProfileImagesItemHolder.class);
        this.f9707p = (jg90) this.f9710s.m19695d(wg90.class);
        this.f9711t = (l33) this.f9710s.m19695d(l33.class);
    }

    /* JADX INFO: renamed from: e0 */
    public final void m12406e0() {
        if (this.f9709r.m23992o() || TextUtils.equals("share_profile", this.f9709r.f21138b) || this.f9709r.m23958F()) {
            this.f9702k.m26601N1().m3261Q();
            if (this.f9702k.m26601N1().m3267W()) {
                this.f9706o.mo14451a(new d30() { // from class: l.fda0
                    public final void call() {
                        this.f10292a.m12424w0();
                    }
                });
            }
        } else if (TextUtils.equals(this.f9709r.f21138b, "p_game_cp") || TextUtils.equals(this.f9709r.f21138b, "p_game_cp_msg")) {
            this.f9706o.mo14451a(new d30() { // from class: l.gda0
                public final void call() {
                    this.f11380a.m12426y0();
                }
            });
        }
        if (NullChecker.a(this.f9699h)) {
            if (this.f9709r.m23992o() || TextUtils.equals("share_profile", this.f9709r.f21138b)) {
                this.f9699h.findViewById(u4c0.S8).setImageResource(x2c0.ip);
            }
        }
    }

    /* JADX INFO: renamed from: g0 */
    public final boolean m12407g0(Class<? extends hn2<a1m>> cls) {
        ah90 ah90Var = (ah90) this.f9710s.m19695d(cls);
        return NullChecker.a(ah90Var) && ah90Var.mo3280l();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0036  */
    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m12408h0() {
        Class<? extends hn2<a1m>> cls;
        if (TextUtils.equals(this.f9709r.f21138b, "from_auto_scroll_to_question")) {
            cls = ioe.class;
            if (!m12407g0(cls)) {
                cls = null;
            }
        } else {
            if (!TextUtils.equals(this.f9709r.f21138b, "p_game_cp") && !TextUtils.equals(this.f9709r.f21138b, "p_game_cp_msg")) {
                return;
            }
            cls = ProfileGameItemHolder.class;
            if (!m12407g0(cls)) {
                cls = null;
            }
        }
        if (cls == null) {
            return;
        }
        int iM18156I = this.f9716y.m18156I(cls);
        if (!NullChecker.a(this.f9716y) || iM18156I < 0 || iM18156I >= this.f9716y.m18152C()) {
            return;
        }
        C0543d c0543d = new C0543d(this.f9709r.m23979a());
        c0543d.setTargetPosition(iM18156I);
        this.f9712u.startSmoothScroll(c0543d);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m12409i0() {
        ViewGroup.LayoutParams layoutParams = this.f9711t.m14463u().getLayoutParams();
        if (layoutParams != null) {
            layoutParams.height = this.f9708q.m14368d().m2923a() != LayoutDesc.ComboType.None ? t100.d(164.0f) : t100.d(0.0f);
            this.f9711t.m14463u().setLayoutParams(layoutParams);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.INFLATE_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        View viewM12388P = m12388P(layoutInflater, viewGroup);
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        return viewM12388P;
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m12411j0() {
        this.f9702k.m26601N1().m3258N();
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m12412k0() {
        this.f9702k.m26601N1().m3258N();
    }

    /* JADX INFO: renamed from: l0 */
    public final /* synthetic */ void m12413l0() {
        this.f9706o.m3347L1(new d30() { // from class: l.ida0
            public final void call() {
                this.f13156a.m12412k0();
            }
        }, null);
    }

    /* JADX INFO: renamed from: m0 */
    public final /* synthetic */ void m12414m0() {
        gd70.m13725b().m13727d(act());
        this.f9701j.startActivity(ProfileAct.m1176p2(act(), this.f9709r.f21140d, "profile_frag_menu", false, true));
    }

    /* JADX INFO: renamed from: n0 */
    public final /* synthetic */ void m12415n0(d30 d30Var) {
        this.f9706o.m3345K1(d30Var);
    }

    /* JADX INFO: renamed from: p0 */
    public final /* synthetic */ void m12416p0() {
        this.f9702k.m26601N1().m3259O();
    }

    /* JADX INFO: renamed from: q0 */
    public final /* synthetic */ void m12417q0() {
        this.f9702k.m26601N1().m3259O();
    }

    /* JADX INFO: renamed from: r */
    public void m12418r() {
        int iHashCode = new Object().hashCode();
        ProfileLogEntity.ProfileLogName profileLogName = ProfileLogEntity.ProfileLogName.INIT_VIEW;
        PerformanceLogUtil.logBegin(iHashCode, profileLogName);
        if (this.f9709r.m23963K()) {
            act().setTitle(this.f9701j.x4(R.string.ei));
        }
        m12353c0();
        m12351b0();
        m12338H0();
        m12358f0();
        m12406e0();
        m12355d0();
        PerformanceLogUtil.logEnd(iHashCode, profileLogName);
        if (this.f9709r.m23964L() && this.f9709r.f21141e.f21162k == null) {
            act().finish();
        }
    }

    /* JADX INFO: renamed from: r0 */
    public final /* synthetic */ void m12419r0() {
        this.f9706o.m3347L1(new d30() { // from class: l.oda0
            public final void call() {
                this.f16542a.m12417q0();
            }
        }, new d30() { // from class: l.pda0
            public final void call() {
                eea0.m12371w();
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ void m12420s0(LinearLayout linearLayout) {
        if (this.f9702k.m26601N1().m3266V()) {
            return;
        }
        m12402W0("点击推荐给好友", linearLayout);
        this.f9702k.m26601N1().m3262R();
    }

    /* JADX INFO: renamed from: t0 */
    public final /* synthetic */ void m12421t0() {
        this.f9706o.m3342I1(new e30() { // from class: l.mda0
            public final void call(Object obj) {
                this.f15348a.m12420s0((LinearLayout) obj);
            }
        }, 2000L);
    }

    /* JADX INFO: renamed from: u0 */
    public final /* synthetic */ void m12422u0() {
        Act act = act();
        if (act == null || act.isFinishing()) {
            return;
        }
        this.f9696e.scrollBy(0, ProfileImagesItemHolder.f1819k1);
    }

    /* JADX INFO: renamed from: v0 */
    public final /* synthetic */ void m12423v0(LinearLayout linearLayout) {
        if (this.f9702k.m26601N1().m3266V()) {
            return;
        }
        m12402W0("点击推荐给好友", linearLayout);
        this.f9702k.m26601N1().m3262R();
    }

    /* JADX INFO: renamed from: w0 */
    public final /* synthetic */ void m12424w0() {
        this.f9706o.m3342I1(new e30() { // from class: l.lda0
            public final void call(Object obj) {
                this.f14783a.m12423v0((LinearLayout) obj);
            }
        }, 0L);
    }

    /* JADX INFO: renamed from: x0 */
    public final /* synthetic */ void m12425x0(LinearLayout linearLayout) {
        if (this.f9702k.m26601N1().m3270w()) {
            m12402W0("分享用户，一起组队打游戏", linearLayout);
            this.f9702k.m26601N1().m3260P();
        }
    }

    /* JADX INFO: renamed from: y0 */
    public final /* synthetic */ void m12426y0() {
        this.f9706o.m3342I1(new e30() { // from class: l.kda0
            public final void call(Object obj) {
                this.f14287a.m12425x0((LinearLayout) obj);
            }
        }, 0L);
    }

    /* JADX INFO: renamed from: z0 */
    public final /* synthetic */ void m12427z0() {
        myc0.d0().j.add(this.f9709r.f21140d);
        myc0.d0().l0();
    }

    public void destroy() {
    }
}
