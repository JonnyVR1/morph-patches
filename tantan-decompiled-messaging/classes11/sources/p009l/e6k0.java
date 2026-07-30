package p009l;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.newui.home.insert.myself.SeeMyselfRootLayout;
import com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.view.UserInfoProfileOptTransAnimLayout;
import com.p000p1.mobile.putong.core.newui.statussquare.CoreMyTabStatusPostView;
import com.p000p1.mobile.putong.core.newui.statussquare.CoreStatusSquareEnterView;
import com.p000p1.mobile.putong.core.newui.view.CoreSvgaOptView;
import com.p000p1.mobile.putong.core.newui.view.ShimmerOptLayout;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p000p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.MyTabTask;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.core.ui.VText_Medium;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.core.ui.profile.views.RingProgressBarView;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.bzc0;
import l.e51;
import l.eqh0;
import l.f6k0;
import l.j760;
import l.o6j0;
import l.qib0;
import l.qqi0;
import l.t100;
import l.upa;
import l.v930;
import l.vwb;
import l.w0c0;
import l.x2c0;
import l.xaj0;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class e6k0 implements sxj0 {

    /* JADX INFO: renamed from: A */
    public TextView f12393A;

    /* JADX INFO: renamed from: B */
    public CoreStatusSquareEnterView f12394B;

    /* JADX INFO: renamed from: C */
    public CoreMyTabStatusPostView f12395C;

    /* JADX INFO: renamed from: D */
    public Act f12396D;

    /* JADX INFO: renamed from: E */
    public User f12397E;

    /* JADX INFO: renamed from: F */
    public int f12398F = -1;

    /* JADX INFO: renamed from: G */
    public Runnable f12399G = new RunnableC0872b();

    /* JADX INFO: renamed from: a */
    public UserInfoProfileOptTransAnimLayout f12400a;

    /* JADX INFO: renamed from: b */
    public VText_Bold f12401b;

    /* JADX INFO: renamed from: c */
    public VLinear f12402c;

    /* JADX INFO: renamed from: d */
    public SeeMyselfRootLayout f12403d;

    /* JADX INFO: renamed from: e */
    public VImage f12404e;

    /* JADX INFO: renamed from: f */
    public VLinear f12405f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f12406g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f12407h;

    /* JADX INFO: renamed from: i */
    public RingProgressBarView f12408i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f12409j;

    /* JADX INFO: renamed from: k */
    public ShimmerOptLayout f12410k;

    /* JADX INFO: renamed from: l */
    public CoreSvgaOptView f12411l;

    /* JADX INFO: renamed from: m */
    public VText f12412m;

    /* JADX INFO: renamed from: n */
    public VText f12413n;

    /* JADX INFO: renamed from: o */
    public VImage f12414o;

    /* JADX INFO: renamed from: p */
    public VImage f12415p;

    /* JADX INFO: renamed from: q */
    public ODiamondTagLabel f12416q;

    /* JADX INFO: renamed from: r */
    public VLinear f12417r;

    /* JADX INFO: renamed from: s */
    public VLinear f12418s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f12419t;

    /* JADX INFO: renamed from: u */
    public VText_Medium f12420u;

    /* JADX INFO: renamed from: v */
    public VText_Medium f12421v;

    /* JADX INFO: renamed from: w */
    public VText_Medium f12422w;

    /* JADX INFO: renamed from: x */
    public VLinear f12423x;

    /* JADX INFO: renamed from: y */
    public VLinear f12424y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f12425z;

    /* JADX INFO: renamed from: l.e6k0$a */
    public class C0871a implements UserInfoProfileOptTransAnimLayout.InterfaceC0401c {
        public C0871a() {
        }

        @Override // com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.view.UserInfoProfileOptTransAnimLayout.InterfaceC0401c
        /* JADX INFO: renamed from: a */
        public void mo7775a(int i) {
            e6k0 e6k0Var = e6k0.this;
            if (i != 0) {
                xdl0.M(e6k0Var.f12402c, true);
                xdl0.M(e6k0.this.f12401b, true);
                xdl0.M(e6k0.this.f12405f, false);
            } else {
                xdl0.M(e6k0Var.f12402c, false);
                xdl0.M(e6k0.this.f12401b, false);
                xdl0.M(e6k0.this.f12405f, true);
                e6k0.this.f12403d.m2596x();
            }
        }

        @Override // com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.view.UserInfoProfileOptTransAnimLayout.InterfaceC0401c
        /* JADX INFO: renamed from: b */
        public void mo7776b(float f, boolean z) {
            e6k0.this.m13773X(f);
        }

        @Override // com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.view.UserInfoProfileOptTransAnimLayout.InterfaceC0401c
        /* JADX INFO: renamed from: c */
        public void mo7777c(int i, float f) {
            xdl0.M(e6k0.this.f12402c, true);
            xdl0.M(e6k0.this.f12405f, true);
            xdl0.M(e6k0.this.f12401b, true);
            e6k0.this.m13773X(f);
        }
    }

    /* JADX INFO: renamed from: l.e6k0$b */
    public class RunnableC0872b implements Runnable {
        public RunnableC0872b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e6k0 e6k0Var = e6k0.this;
            e6k0Var.f12400a.m7774j(e6k0Var.f12398F);
        }
    }

    public e6k0(Act act) {
        this.f12396D = act;
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m13746A(View view) {
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: K */
    private void m13754K() {
        xdl0.E0(this.f12403d, new View.OnClickListener() { // from class: l.u5k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20996a.m13762M(view);
            }
        });
        boolean zM13761L = m13761L();
        VLinear vLinear = this.f12423x;
        if (zM13761L) {
            xdl0.M(vLinear, false);
            xdl0.M(this.f12417r, true);
            xdl0.E0(this.f12422w, new View.OnClickListener() { // from class: l.v5k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f21458a.m13763N(view);
                }
            });
        } else {
            xdl0.M(vLinear, true);
            xdl0.M(this.f12417r, false);
            boolean z = upa.z();
            ConstraintLayout constraintLayout = this.f12394B;
            if (z) {
                constraintLayout.setBackgroundResource(x2c0.wp);
                this.f12394B.m7816s0();
                this.f12424y.setBackgroundResource(x2c0.wp);
                this.f12395C.m7802o();
            } else {
                constraintLayout.setBackgroundResource(x2c0.xp);
            }
            this.f12394B.f5574l.setText("更多");
            TextPaint paint = this.f12394B.f5574l.getPaint();
            if (paint != null) {
                paint.setFakeBoldText(false);
            }
        }
        boolean z2 = upa.z();
        VText_Bold vText_Bold = this.f12401b;
        if (z2) {
            vText_Bold.setCompoundDrawablesWithIntrinsicBounds(x2c0.Wo, 0, 0, 0);
            this.f12408i.setRingColor(this.f12396D.color(w0c0.A));
        } else {
            vText_Bold.setCompoundDrawablesWithIntrinsicBounds(x2c0.Vo, 0, 0, 0);
            this.f12408i.setRingColor(this.f12396D.color(w0c0.I));
        }
        this.f12400a.setTransCallback(new C0871a());
        if (upa.p2()) {
            ShimmerOptLayout.C0419b c0419b = new ShimmerOptLayout.C0419b(new int[]{16777215, 1728053247, 1728053247, 16777215}, new float[]{0.0f, 0.43f, 0.57f, 1.0f});
            c0419b.m8051n(30.0f).m8053p(t100.d(45.0f)).m8049l(1050L).m8050m(t100.d(20.0f));
            this.f12410k.setShimmerConfig(c0419b);
        }
    }

    /* JADX INFO: renamed from: I */
    public View m13759I(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f6k0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: J */
    public void m13760J() {
        int i = (this.f12398F + 1) % 2;
        this.f12398F = i;
        this.f12400a.m7774j(i);
        int i2 = this.f12398F;
        SeeMyselfRootLayout seeMyselfRootLayout = this.f12403d;
        if (i2 == 1) {
            seeMyselfRootLayout.m2586O(this.f12396D);
        } else {
            seeMyselfRootLayout.m2596x();
        }
    }

    /* JADX INFO: renamed from: L */
    public final boolean m13761L() {
        return bzc0.f();
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m13762M(View view) {
        o6j0.c("e_self_edit", "p_navigation_view", new o6j0.a[0]);
        Intent intentP2 = ProfileAct.p2(this.f12396D, qib0.b0.a.userId(), "profile_frag_me_avatar", false, true);
        intentP2.putExtra("preview_type", 0);
        this.f12396D.startActivity(intentP2);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m13763N(View view) {
        zvf0.r("e_my_moment", "p_navigation_view");
        this.f12396D.startActivity(CoreModule.N().bb(this.f12396D, CoreModule.H().userId(), "from_profile", -1, "", 2, "pageid", false));
    }

    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m13764O(xaj0 xaj0Var, String str, View view) {
        zvf0.u("e_my_state", "p_navigation_view", new j760[]{vwb.Y("state_id", (String) xaj0Var.a)});
        CoreModule.N().Dk(this.f12396D, str, (String) xaj0Var.a, "p_navigation_view");
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m13765P(xaj0 xaj0Var, String str, View view) {
        zvf0.u("e_my_state", "p_navigation_view", new j760[]{vwb.Y("state_id", (String) xaj0Var.a)});
        CoreModule.N().Dk(this.f12396D, str, (String) xaj0Var.a, "p_navigation_view");
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m13766Q(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        this.f12395C.m7795h();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m13767R(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        this.f12395C.m7795h();
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m13768S() {
        CoreModule.c.e0.D6.put(Boolean.TRUE);
        this.f12410k.m8033b();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m13769T(String str) {
        CoreModule.c.e0.E6.put(str);
        this.f12410k.m8033b();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m13770U(User user, View view) {
        zvf0.r("e_complete_card_info_close", "p_navigation_view");
        CoreModule.c.e0.w6.put(Boolean.TRUE);
        mo13776m(user);
    }

    /* JADX INFO: renamed from: V */
    public final boolean m13771V(User user) {
        if (upa.p2() || ((Boolean) CoreModule.c.e0.w6.get()).booleanValue()) {
            return false;
        }
        long jLongValue = ((Long) CoreModule.c.e0.x6.get()).longValue();
        int iI3 = upa.i3();
        if (jLongValue <= 1 || iI3 <= 0 || mqi0.m18550o() - jLongValue <= ((long) iI3) * 86400000) {
            return ((upa.X2() && ((String) CoreModule.c.e0.Z3.get()).equals("marryMode")) || qqi0.h(mqi0.m18550o(), (long) user.createdTime, upa.j3()) || (!TextUtils.isEmpty(user.description) && user.pictures.size() >= 3)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: W */
    public void m13772W(boolean z) {
        xdl0.M(this.f12402c, z);
        SeeMyselfRootLayout seeMyselfRootLayout = this.f12403d;
        if (z) {
            seeMyselfRootLayout.m2586O(this.f12396D);
        } else {
            seeMyselfRootLayout.m2596x();
        }
        xdl0.M(this.f12405f, !z);
    }

    /* JADX INFO: renamed from: X */
    public final void m13773X(float f) {
        float f2 = f < 0.56f ? 0.0f : (f - 0.56f) / 0.44f;
        float f3 = f < 0.8f ? 0.0f : (f - 0.8f) / 0.19999999f;
        this.f12402c.setAlpha(Math.min(1.0f, f2));
        this.f12401b.setAlpha(Math.min(1.0f, f3));
        this.f12405f.setAlpha(Math.max(0.0f, 1.0f - (f * 1.0f)));
    }

    @Override // p009l.sxj0
    @NonNull
    /* JADX INFO: renamed from: a */
    public View mo12204a() {
        return this.f12424y;
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: b */
    public void mo12205b(boolean z) {
        boolean zM13761L = m13761L();
        VLinear vLinear = this.f12423x;
        if (zM13761L) {
            xdl0.M(vLinear, false);
            xdl0.M(this.f12417r, true);
        } else {
            xdl0.M(vLinear, true);
            xdl0.M(this.f12417r, false);
            xdl0.M(this.f12394B, !z);
            xdl0.M(this.f12395C, z);
        }
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: c */
    public void mo12206c() {
        xdl0.M(this.f12424y, true);
    }

    @Override // p009l.sxj0
    @NonNull
    /* JADX INFO: renamed from: d */
    public VImage mo12207d() {
        return this.f12415p;
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: e */
    public void mo12208e(final String str, final xaj0<String, String, String> xaj0Var) {
        if (m13761L()) {
            xdl0.M(this.f12418s, true);
            xdl0.M(this.f12421v, false);
            this.f12420u.setText((CharSequence) xaj0Var.b);
            qib0.G.I0(this.f12419t, (String) xaj0Var.c, t100.d(22.0f), t100.d(22.0f));
            this.f12418s.setOnClickListener(new View.OnClickListener() { // from class: l.y5k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f22899a.m13764O(xaj0Var, str, view);
                }
            });
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f12424y.getLayoutParams();
        layoutParams.width = -2;
        VLinear vLinear = this.f12424y;
        vLinear.setPadding(t100.h, vLinear.getPaddingTop(), t100.j, this.f12424y.getPaddingBottom());
        this.f12424y.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f12425z.getLayoutParams();
        int i = t100.q;
        layoutParams2.height = i;
        layoutParams2.width = i;
        this.f12425z.setLayoutParams(layoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f12393A.getLayoutParams();
        marginLayoutParams.leftMargin = t100.e;
        this.f12393A.setLayoutParams(marginLayoutParams);
        this.f12393A.setTextSize(13.0f);
        this.f12394B.f5574l.setTextSize(13.0f);
        this.f12394B.f5574l.setTextColor(Color.parseColor("#6a000000"));
        this.f12394B.f5574l.setTypeface(Typeface.create(eqh0.c(3), 0));
        this.f12393A.setTextColor(Color.parseColor("#1A1A1B"));
        this.f12393A.setTypeface(Typeface.create(eqh0.c(3), 0));
        this.f12393A.setText((CharSequence) xaj0Var.b);
        this.f12425z.setBackgroundResource(0);
        qib0.G.I0(this.f12425z, (String) xaj0Var.c, t100.d(24.0f), t100.d(24.0f));
        this.f12424y.setOnClickListener(new View.OnClickListener() { // from class: l.z5k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23483a.m13765P(xaj0Var, str, view);
            }
        });
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: f */
    public void mo13774f() {
        if (xdl0.O0(this.f12404e)) {
            if (((Long) CoreModule.c.e0.x6.get()).longValue() < 1) {
                CoreModule.c.e0.x6.put(Long.valueOf(mqi0.m18550o()));
            }
            zvf0.x("e_complete_card_info_close", "p_navigation_view");
        }
    }

    @Override // p009l.sxj0
    @NonNull
    /* JADX INFO: renamed from: g */
    public ODiamondTagLabel mo12209g() {
        return this.f12416q;
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: h */
    public void mo12210h(View.OnClickListener onClickListener) {
        xdl0.E0(this.f12410k, onClickListener);
    }

    @Override // p009l.sxj0
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM13759I = m13759I(layoutInflater, viewGroup);
        this.f12403d.setRenderType(1);
        m13754K();
        return viewM13759I;
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: k */
    public void mo13775k(View.OnClickListener onClickListener) {
        xdl0.E0(this.f12407h, onClickListener);
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: l */
    public void mo12213l(User user) {
        qib0.G.J0(this.f12409j, user.fp().calculatedWidth(t100.O), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // p009l.sxj0
    /* JADX INFO: renamed from: m */
    public void mo13776m(final User user) {
        boolean zM13771V = m13771V(user);
        int i = this.f12398F;
        if (i != zM13771V) {
            Object[] objArr = i == -1;
            this.f12398F = zM13771V ? 1 : 0;
            if (objArr == true) {
                this.f12400a.m7774j(zM13771V ? 1 : 0);
            } else {
                e51.J(this.f12399G);
                e51.H(this.f12396D, this.f12399G, 500L);
            }
            if (this.f12398F != 1) {
                xdl0.E0(this.f12400a, (View.OnClickListener) null);
                this.f12400a.setClickable(false);
            } else {
                this.f12403d.m2586O(this.f12396D);
                xdl0.E0(this.f12400a, new View.OnClickListener() { // from class: l.a6k0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        e6k0.m13746A(view);
                    }
                });
                xdl0.E0(this.f12404e, new View.OnClickListener() { // from class: l.b6k0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f9916a.m13770U(user, view);
                    }
                });
                xdl0.M(this.f12404e, true);
            }
        }
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: n */
    public void mo12214n(final View.OnClickListener onClickListener) {
        if (m13761L()) {
            xdl0.M(this.f12418s, false);
            xdl0.M(this.f12421v, true);
            xdl0.E0(this.f12421v, new View.OnClickListener() { // from class: l.c6k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f10444a.m13766Q(onClickListener, view);
                }
            });
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f12424y.getLayoutParams();
        layoutParams.width = t100.d(80.0f);
        this.f12424y.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f12425z.getLayoutParams();
        int i = t100.m;
        layoutParams2.height = i;
        layoutParams2.width = i;
        this.f12425z.setLayoutParams(layoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f12393A.getLayoutParams();
        marginLayoutParams.leftMargin = t100.e;
        marginLayoutParams.rightMargin = t100.c;
        this.f12393A.setLayoutParams(marginLayoutParams);
        this.f12393A.setTextSize(14.0f);
        this.f12394B.f5574l.setTextSize(13.0f);
        this.f12393A.setTextColor(-16777216);
        this.f12393A.setTypeface(eqh0.c(3), 0);
        this.f12393A.setText("状态");
        qib0.G.Y0(this.f12425z, upa.z() ? x2c0.Ze : x2c0.Ye);
        xdl0.E0(this.f12424y, new View.OnClickListener() { // from class: l.d6k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11651a.m13767R(onClickListener, view);
            }
        });
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: q */
    public void mo12217q(User user) {
        final String str;
        this.f12397E = user;
        int iM24371B = wn90.m24339F().m24371B(this.f12396D, user);
        if (upa.X2() && ((String) CoreModule.c.e0.Z3.get()).equals("marryMode")) {
            iM24371B = 100;
        }
        if (iM24371B >= 100) {
            xdl0.M(this.f12408i, false);
            ViewGroup.LayoutParams layoutParams = this.f12409j.getLayoutParams();
            layoutParams.width = t100.d(90.0f);
            layoutParams.height = t100.d(90.0f);
            this.f12409j.setLayoutParams(layoutParams);
            this.f12412m.setTextSize(13.0f);
            str = "编辑";
        } else {
            ViewGroup.LayoutParams layoutParams2 = this.f12409j.getLayoutParams();
            layoutParams2.width = t100.d(78.0f);
            layoutParams2.height = t100.d(78.0f);
            this.f12409j.setLayoutParams(layoutParams2);
            xdl0.M(this.f12408i, true);
            this.f12408i.setProgress(iM24371B);
            str = iM24371B + "%";
            this.f12412m.setTextSize(14.0f);
        }
        if (!upa.p2() || (upa.e2() && TextUtils.equals((CharSequence) CoreModule.c.e0.Z3.get(), "marryMode"))) {
            this.f12411l.setLocalRes(x2c0.gg);
        } else if (wn90.m24343U(user)) {
            if (((Boolean) CoreModule.c.e0.D6.get()).booleanValue() || v930.h() != TabName.Me) {
                this.f12411l.setLocalRes(x2c0.yf);
            } else {
                this.f12411l.m7969e("https://auto.tancdn.com/v1/raw/21b5cc87-9734-44c1-b353-993bb8cc343e14.svga", x2c0.yf, 60, new Runnable() { // from class: l.w5k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f21898a.m13768S();
                    }
                });
            }
            this.f12412m.setTextSize(10.0f);
            str = "吸引力较低";
        } else if (!NullChecker.a(CoreModule.c.e0.j7.e()) || TextUtils.isEmpty(((MyTabTask) CoreModule.c.e0.j7.e()).type)) {
            this.f12411l.setLocalRes(x2c0.gg);
        } else {
            str = ((MyTabTask) CoreModule.c.e0.j7.e()).title;
            if (TextUtils.equals((CharSequence) CoreModule.c.e0.E6.get(), str) || v930.h() != TabName.Me) {
                this.f12411l.setLocalRes(x2c0.Bf);
            } else {
                this.f12411l.m7969e("https://fe-static.tancdn.com/v1/raw/f2005b92-dd66-401a-abd9-9b6dca2c049814.svga", x2c0.Bf, 60, new Runnable() { // from class: l.x5k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f22440a.m13769T(str);
                    }
                });
            }
            this.f12412m.setTextSize(10.0f);
        }
        this.f12412m.setText(str);
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: r */
    public boolean mo13777r() {
        if (this.f12398F == 1) {
            return true;
        }
        return super.mo13777r();
    }

    @Override // p009l.sxj0
    @NonNull
    /* JADX INFO: renamed from: t */
    public VText mo12219t() {
        return this.f12413n;
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: u */
    public void mo12220u() {
        if (m13761L()) {
            return;
        }
        this.f12395C.m7803p();
    }

    @Override // p009l.sxj0
    @NonNull
    /* JADX INFO: renamed from: v */
    public VImage mo12221v() {
        return this.f12414o;
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: i */
    public void mo12211i(User user) {
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: o */
    public void mo12215o(int i) {
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: p */
    public void mo12216p(User user) {
    }

    @Override // p009l.sxj0
    /* JADX INFO: renamed from: j */
    public void mo12212j(View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
    }
}
