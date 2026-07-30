package p006l;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.k;
import com.p000p1.mobile.putong.app.PutongAct;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p000p1.mobile.putong.core.p004ui.seepage.likers.FakeLikersFrag;
import com.p000p1.mobile.putong.core.p004ui.seepage.likers.IntlFakeTurboItem;
import com.p000p1.mobile.putong.core.p004ui.vip.picks.view.header.PicksHeaderView;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.core.member.R;
import com.p1.mobile.putong.core.member.module.CoreMemberModule;
import com.p1.mobile.putong.core.newui.view.BoostViewContainer;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.b3c0;
import l.c4g0;
import l.d30;
import l.e30;
import l.e51;
import l.mkd0;
import l.o6j0;
import l.r0g;
import l.s0g;
import l.s7m;
import l.sjc0;
import l.t100;
import l.x4c0;
import l.xdl0;
import l.y93;
import l.zvf0;
import rx.c;
import v.VButton_FakeShadow;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VProgressBar;
import v.VRecyclerView;
import v.VText;
import v.navigationbar.VNavigationBar;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class l0g implements s7m<yzf> {

    /* JADX INFO: renamed from: a */
    public VFrame f16143a;

    /* JADX INFO: renamed from: b */
    public BoostViewContainer f16144b;

    /* JADX INFO: renamed from: c */
    public VLinear f16145c;

    /* JADX INFO: renamed from: d */
    public VNavigationBar f16146d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f16147e;

    /* JADX INFO: renamed from: f */
    public LinearLayout f16148f;

    /* JADX INFO: renamed from: g */
    public VImage f16149g;

    /* JADX INFO: renamed from: h */
    public VText f16150h;

    /* JADX INFO: renamed from: i */
    public VProgressBar f16151i;

    /* JADX INFO: renamed from: j */
    public VRecyclerView f16152j;

    /* JADX INFO: renamed from: k */
    public VButton_FakeShadow f16153k;

    /* JADX INFO: renamed from: l */
    public VButton_FakeShadow f16154l;

    /* JADX INFO: renamed from: m */
    public ConstraintLayout f16155m;

    /* JADX INFO: renamed from: n */
    public Guideline f16156n;

    /* JADX INFO: renamed from: o */
    public Guideline f16157o;

    /* JADX INFO: renamed from: p */
    public Guideline f16158p;

    /* JADX INFO: renamed from: q */
    public ImageView f16159q;

    /* JADX INFO: renamed from: r */
    public ImageView f16160r;

    /* JADX INFO: renamed from: s */
    public yzf f16161s;

    /* JADX INFO: renamed from: t */
    public PutongAct f16162t;

    /* JADX INFO: renamed from: u */
    public FakeLikersFrag f16163u;

    /* JADX INFO: renamed from: y */
    public boolean f16167y;

    /* JADX INFO: renamed from: z */
    public k f16168z;

    /* JADX INFO: renamed from: v */
    public boolean f16164v = false;

    /* JADX INFO: renamed from: w */
    public boolean f16165w = false;

    /* JADX INFO: renamed from: x */
    public int f16166x = 0;

    /* JADX INFO: renamed from: A */
    public boolean f16139A = false;

    /* JADX INFO: renamed from: B */
    public c4g0 f16140B = null;

    /* JADX INFO: renamed from: C */
    public boolean f16141C = false;

    /* JADX INFO: renamed from: D */
    public boolean f16142D = false;

    /* JADX INFO: renamed from: l.l0g$a */
    public class C0957a extends GridLayoutManager.c {
        public C0957a() {
        }

        /* JADX INFO: renamed from: f */
        public int m18481f(int i) {
            if (CoreModule.f1543l.m11706a().m5466k() && i == 0) {
                return 2;
            }
            return (gr9.m15939h() && i == 1) ? 2 : 1;
        }
    }

    /* JADX INFO: renamed from: l.l0g$b */
    public class C0958b extends RecyclerView.t {
        public C0958b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: f */
        public /* synthetic */ void m18487f() {
            l0g.this.f16142D = false;
        }

        /* JADX INFO: renamed from: i */
        public final /* synthetic */ void m18488i() {
            l0g.this.f16142D = false;
        }

        /* JADX INFO: renamed from: j */
        public final /* synthetic */ void m18489j() {
            l0g.this.f16152j.stopScroll();
        }

        /* JADX INFO: renamed from: k */
        public final /* synthetic */ void m18490k() {
            l0g.this.f16152j.smoothScrollToPosition(0);
            l0g.this.f16165w = false;
            l0g.this.f16166x = 0;
        }

        /* JADX INFO: renamed from: l */
        public final /* synthetic */ void m18491l() {
            e51.F(l0g.this.f16162t, new Runnable() { // from class: l.q0g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f19505a.m18490k();
                }
            });
        }

        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            l0g l0gVar = l0g.this;
            boolean z = true;
            if (i != 1 && i != 2) {
                z = false;
            }
            l0gVar.f16164v = z;
            if (!l0g.this.f16161s.m28506P0()) {
                l0g.this.f16165w = false;
            }
            l0g.this.f16166x = 0;
        }

        public void onScrolled(@NonNull RecyclerView recyclerView, int i, int i2) {
            super.onScrolled(recyclerView, i, i2);
            boolean zM15939h = gr9.m15939h();
            l0g l0gVar = l0g.this;
            if (zM15939h) {
                if (!l0gVar.f16141C && recyclerView.computeVerticalScrollOffset() > t100.d(600.0f)) {
                    l0g.this.f16141C = true;
                    l0g.this.f16142D = true;
                    l0g.this.f16161s.m28501I0(new d30() { // from class: l.m0g
                        public final void call() {
                            this.f16743a.m18487f();
                        }
                    });
                    return;
                } else {
                    if (sjc0.a(recyclerView) && sjc0.b(recyclerView) && !l0g.this.f16142D) {
                        l0g.this.f16161s.m28501I0(new d30() { // from class: l.n0g
                            public final void call() {
                                this.f17435a.m18488i();
                            }
                        });
                        return;
                    }
                    return;
                }
            }
            if (!l0gVar.f16164v || l0g.this.f16165w) {
                return;
            }
            l0g.this.f16166x += i2;
            if (!l0g.this.f16161s.m28506P0() || l0g.this.f16166x <= t100.d(100.0f)) {
                return;
            }
            l0g.this.f16165w = true;
            e51.F(l0g.this.f16162t, new Runnable() { // from class: l.o0g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f17963a.m18489j();
                }
            });
            l0g.this.f16161s.m28504N0("p_intl_plm,swipe", new d30() { // from class: l.p0g
                public final void call() {
                    this.f18543a.m18491l();
                }
            });
        }
    }

    public l0g(FakeLikersFrag fakeLikersFrag) {
        this.f16163u = fakeLikersFrag;
        this.f16162t = (PutongAct) fakeLikersFrag.act();
    }

    /* JADX INFO: renamed from: K */
    private void m18433K() {
        o6j0.h("e_boost_button", this.f16162t.pageId(), new o6j0.a[]{o6j0.a.i("is_privileged", !CoreModule.m1854P().m11706a().m5426e2())});
        View viewM18462G = m18462G(LayoutInflater.from(this.f16162t), this.f16146d.getRightIconContainer());
        m18460E(viewM18462G);
        this.f16146d.z(new View[]{viewM18462G});
        this.f16144b.a(new y93() { // from class: l.g0g
            /* JADX INFO: renamed from: a */
            public final void m15559a(int i) {
                this.f13016a.m18468N(i);
            }
        });
        this.f16144b.getBoostButton().setOnLongClickListener(new View.OnLongClickListener() { // from class: l.h0g
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f13624a.m18469O(view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m18434S(View view) {
        this.f16161s.m28502J0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m18435T(View view) {
        this.f16161s.m28502J0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: U */
    public /* synthetic */ void m18436U(View view) {
        if (!this.f16161s.m28506P0()) {
            this.f16161s.m28502J0();
        } else {
            zvf0.r("e_intl_plm_button", "p_intl_plm");
            this.f16161s.m28503L0("p_intl_plm,e_intl_plm_button,click");
        }
    }

    /* JADX INFO: renamed from: n */
    public static /* synthetic */ void m18448n(Throwable th) {
    }

    /* JADX INFO: renamed from: r */
    private void m18451r() {
        this.f16146d.setLeftIconAsBack(this.f16162t);
        this.f16146d.setLeftIconResource(b3c0.b);
        if (CoreModule.f1534c.f3661p0.m21961e3()) {
            this.f16154l.setBackgroundResource(b3c0.Q);
            this.f16154l.setTextColor(Color.parseColor("#000000"));
            xdl0.M(this.f16154l, true);
            xdl0.E0(this.f16154l, new View.OnClickListener() { // from class: l.zzf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f29053a.m18434S(view);
                }
            });
        } else if (this.f16161s.m28506P0()) {
            xdl0.M(this.f16154l, true);
            if (this.f16161s.m28506P0()) {
                xdl0.H0(this.f16154l, act().getResources().getString(R.string.K));
            }
            xdl0.E0(this.f16154l, new View.OnClickListener() { // from class: l.d0g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9965a.m18436U(view);
                }
            });
        } else {
            xdl0.M(this.f16153k, true);
            xdl0.E0(this.f16153k, new View.OnClickListener() { // from class: l.c0g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9266a.m18435T(view);
                }
            });
        }
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this.f16162t, 2);
        gridLayoutManager.v(new C0957a());
        this.f16152j.setLayoutManager(gridLayoutManager);
        this.f16152j.setAdapter(this.f16163u.m8324O4());
        this.f16152j.setOnScrollListener(new C0958b());
        this.f16163u.m8324O4().m24864U(new tyf.InterfaceC1326a() { // from class: l.e0g
            @Override // p006l.tyf.InterfaceC1326a
            /* JADX INFO: renamed from: a */
            public final void mo14325a(User user, int i) {
                this.f10687a.m18471Q(user, i);
            }
        });
        k kVar = new k(new nyf(new nyf.InterfaceC1066a() { // from class: l.f0g
            @Override // p006l.nyf.InterfaceC1066a
            /* JADX INFO: renamed from: a */
            public final void mo14980a(View view, User user, int i, boolean z, int i2) {
                this.f11553a.m18472R(view, user, i, z, i2);
            }
        }));
        this.f16168z = kVar;
        kVar.g(this.f16152j);
        if (gr9.m15939h()) {
            xdl0.X(this.f16155m, t100.O);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m18459C0() {
        return this.f16162t;
    }

    /* JADX INFO: renamed from: E */
    public final void m18460E(View view) {
        s0g.a(this, view);
    }

    /* JADX INFO: renamed from: F */
    public View m18461F(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return r0g.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: G */
    public View m18462G(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return s0g.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
    public void m18480i1(yzf yzfVar) {
        this.f16161s = yzfVar;
    }

    /* JADX INFO: renamed from: I */
    public void m18464I(boolean z) {
        if (z && !xdl0.O0(this.f16144b)) {
            o6j0.h("e_intl_plm_turbo_button", this.f16162t.pageId(), new o6j0.a[0]);
        }
        xdl0.y(this.f16144b, z);
        xdl0.M(this.f16144b, z);
    }

    /* JADX INFO: renamed from: J */
    public PicksHeaderView m18465J() {
        return (PicksHeaderView) this.f16152j.findViewById(x4c0.z);
    }

    /* JADX INFO: renamed from: L */
    public final void m18466L() {
        View viewM18462G = m18462G(LayoutInflater.from(this.f16162t), this.f16146d.getRightIconContainer());
        m18460E(viewM18462G);
        this.f16146d.z(new View[]{viewM18462G});
        xdl0.M(this.f16144b, false);
        xdl0.E0(this.f16144b.getBoostButton(), new View.OnClickListener() { // from class: l.i0g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14184a.m18470P(view);
            }
        });
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m18467M() {
        this.f16144b.g(true);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m18468N(int i) {
        if (i == 2) {
            CoreModule.m1854P().m11706a().m5268Hc(this.f16162t, new d30() { // from class: l.b0g
                public final void call() {
                    this.f8648a.m18467M();
                }
            }, null);
        }
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ boolean m18469O(View view) {
        if (CoreModule.f1534c.f3565J0.m17204F3()) {
            return true;
        }
        d.l().k("boost_see_page_guide");
        this.f16144b.f();
        return true;
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m18470P(View view) {
        o6j0.c("e_intl_plm_turbo_button", this.f16162t.pageId(), new o6j0.a[0]);
        ura.m25555e().m25559d().m5632Hb(this.f16162t, false, "p_intl_plm,e_intl_plm_turbo_button,click", null);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m18471Q(User user, int i) {
        if (!this.f16161s.m28506P0()) {
            this.f16161s.m28500H0(user);
        } else {
            zvf0.r("e_intl_plm_card", "p_intl_plm");
            this.f16161s.m28503L0("p_intl_plm,e_intl_plm_card,click");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m18472R(View view, User user, int i, boolean z, int i2) {
        this.f16163u.m8324O4().notifyDataSetChanged();
        if (this.f16161s.m28506P0()) {
            if (view instanceof IntlFakeTurboItem) {
                ((IntlFakeTurboItem) view).m8344n0(i2, this.f16162t);
                return;
            } else {
                zvf0.r("e_intl_plm_card", "p_intl_plm");
                this.f16161s.m28503L0("p_intl_plm,e_intl_plm_card,swipe");
                return;
            }
        }
        if (i == 2 || i == 4 || !z) {
            return;
        }
        this.f16161s.m28500H0(user);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m18473V() {
        this.f16163u.m8324O4().m24856L(true);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m18474W(View view) {
        if (NullChecker.a(this.f16163u) && NullChecker.a(view)) {
            User userNew_ = User.new_();
            userNew_.name = "intlSeeListAd";
            ((DbObject) userNew_).id = "intlSeeListAd";
            this.f16163u.m8324O4().m24855K(userNew_, 3, view);
        }
    }

    /* JADX INFO: renamed from: X */
    public final void m18475X(List<User> list) {
        if (NullChecker.a(this.f16140B)) {
            if (NullChecker.a(this.f16163u.m8324O4().f22347l)) {
                list.add(3, this.f16163u.m8324O4().f22347l);
            }
        } else {
            c<View> cVarM5240Dc = CoreModule.f1543l.m11706a().m5240Dc(this.f16162t, new d30() { // from class: l.j0g
                public final void call() {
                    this.f14917a.m18473V();
                }
            });
            if (NullChecker.a(cVarM5240Dc)) {
                this.f16140B = cVarM5240Dc.subscribe(mkd0.H(new e30() { // from class: l.k0g
                    public final void call(Object obj) {
                        this.f15533a.m18474W((View) obj);
                    }
                }, new e30() { // from class: l.a0g
                    public final void call(Object obj) {
                        l0g.m18448n((Throwable) obj);
                    }
                }));
            }
        }
    }

    /* JADX INFO: renamed from: Y */
    public void m18476Y(List<User> list) {
        if (!NullChecker.a(list) || list.size() < 4) {
            m18464I(false);
        } else {
            m18464I(true);
            m18475X(list);
        }
        this.f16163u.m8324O4().m24865V(list);
        this.f16163u.m8324O4().notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: Z */
    public void m18477Z(int i) {
        this.f16146d.setTitle(i);
    }

    /* JADX INFO: renamed from: a0 */
    public void m18478a0(CharSequence charSequence) {
        this.f16146d.setTitle(charSequence);
    }

    /* JADX INFO: renamed from: b0 */
    public void m18479b0() {
        if (!this.f16167y && !this.f16139A) {
            this.f16167y = true;
            qae0.m22002d(act(), this.f16159q, this.f16160r, this.f16155m);
        }
        if (CoreModule.f1543l.m11706a().m5377X6() || !NullChecker.a(this.f16144b)) {
            return;
        }
        if (CoreModule.m1854P().m11706a().m5523s8()) {
            CoreModule.f1543l.m11706a().m5515ri();
        } else {
            this.f16144b.d(this.f16143a);
        }
        CoreMemberModule.F().b().Qe(act(), this.f16144b);
    }

    public void destroy() {
        if (NullChecker.a(this.f16163u)) {
            this.f16163u.m8324O4().m24856L(false);
        }
        if (NullChecker.a(this.f16140B)) {
            mkd0.z(this.f16140B);
        }
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM18461F = m18461F(layoutInflater, viewGroup);
        m18451r();
        if (!this.f16161s.m28506P0()) {
            m18433K();
            return viewM18461F;
        }
        m18466L();
        xdl0.c0(this.f16152j, t100.d(90.0f));
        return viewM18461F;
    }
}
