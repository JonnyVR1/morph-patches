package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.UserHomeMode;
import com.p046p1.mobile.putong.core.newui.home.insert.myself.SeeMyselfRootLayout;
import com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view.UserInfoProfileOptTransAnimLayout;
import com.p046p1.mobile.putong.core.newui.statussquare.CoreMyTabStatusPostView;
import com.p046p1.mobile.putong.core.newui.statussquare.CoreStatusSquareEnterView;
import com.p046p1.mobile.putong.core.newui.view.CoreSvgaOptView;
import com.p046p1.mobile.putong.core.newui.view.ShimmerOptLayout;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.profile.views.RingProgressBarView;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.tantanapp.common.utils.NullChecker;
import p147v.VDraweeView;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class e6k0 implements sxj0 {

    /* JADX INFO: renamed from: A */
    public TextView f89588A;

    /* JADX INFO: renamed from: B */
    public CoreStatusSquareEnterView f89589B;

    /* JADX INFO: renamed from: C */
    public CoreMyTabStatusPostView f89590C;

    /* JADX INFO: renamed from: D */
    public Act f89591D;

    /* JADX INFO: renamed from: E */
    public User f89592E;

    /* JADX INFO: renamed from: F */
    public int f89593F = -1;

    /* JADX INFO: renamed from: G */
    public Runnable f89594G = new RunnableC16550b();

    /* JADX INFO: renamed from: a */
    public UserInfoProfileOptTransAnimLayout f89595a;

    /* JADX INFO: renamed from: b */
    public VText_Bold f89596b;

    /* JADX INFO: renamed from: c */
    public VLinear f89597c;

    /* JADX INFO: renamed from: d */
    public SeeMyselfRootLayout f89598d;

    /* JADX INFO: renamed from: e */
    public VImage f89599e;

    /* JADX INFO: renamed from: f */
    public VLinear f89600f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f89601g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f89602h;

    /* JADX INFO: renamed from: i */
    public RingProgressBarView f89603i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f89604j;

    /* JADX INFO: renamed from: k */
    public ShimmerOptLayout f89605k;

    /* JADX INFO: renamed from: l */
    public CoreSvgaOptView f89606l;

    /* JADX INFO: renamed from: m */
    public VText f89607m;

    /* JADX INFO: renamed from: n */
    public VText f89608n;

    /* JADX INFO: renamed from: o */
    public VImage f89609o;

    /* JADX INFO: renamed from: p */
    public VImage f89610p;

    /* JADX INFO: renamed from: q */
    public ODiamondTagLabel f89611q;

    /* JADX INFO: renamed from: r */
    public VLinear f89612r;

    /* JADX INFO: renamed from: s */
    public VLinear f89613s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f89614t;

    /* JADX INFO: renamed from: u */
    public VText_Medium f89615u;

    /* JADX INFO: renamed from: v */
    public VText_Medium f89616v;

    /* JADX INFO: renamed from: w */
    public VText_Medium f89617w;

    /* JADX INFO: renamed from: x */
    public VLinear f89618x;

    /* JADX INFO: renamed from: y */
    public VLinear f89619y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f89620z;

    /* JADX INFO: renamed from: l.e6k0$a */
    public class C16549a implements UserInfoProfileOptTransAnimLayout.InterfaceC8237c {
        public C16549a() {
        }

        @Override // com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view.UserInfoProfileOptTransAnimLayout.InterfaceC8237c
        /* JADX INFO: renamed from: a */
        public void mo43529a(int i) {
            e6k0 e6k0Var = e6k0.this;
            if (i != 0) {
                xdl0.m208344M(e6k0Var.f89597c, true);
                xdl0.m208344M(e6k0.this.f89596b, true);
                xdl0.m208344M(e6k0.this.f89600f, false);
            } else {
                xdl0.m208344M(e6k0Var.f89597c, false);
                xdl0.m208344M(e6k0.this.f89596b, false);
                xdl0.m208344M(e6k0.this.f89600f, true);
                e6k0.this.f89598d.m38611x();
            }
        }

        @Override // com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view.UserInfoProfileOptTransAnimLayout.InterfaceC8237c
        /* JADX INFO: renamed from: b */
        public void mo43530b(float f, boolean z) {
            e6k0.this.m115095X(f);
        }

        @Override // com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.view.UserInfoProfileOptTransAnimLayout.InterfaceC8237c
        /* JADX INFO: renamed from: c */
        public void mo43531c(int i, float f) {
            xdl0.m208344M(e6k0.this.f89597c, true);
            xdl0.m208344M(e6k0.this.f89600f, true);
            xdl0.m208344M(e6k0.this.f89596b, true);
            e6k0.this.m115095X(f);
        }
    }

    /* JADX INFO: renamed from: l.e6k0$b */
    public class RunnableC16550b implements Runnable {
        public RunnableC16550b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e6k0 e6k0Var = e6k0.this;
            e6k0Var.f89595a.m43528j(e6k0Var.f89593F);
        }
    }

    public e6k0(Act act) {
        this.f89591D = act;
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m115068A(View view) {
    }

    /* JADX INFO: renamed from: K */
    private void m115076K() {
        xdl0.m208329E0(this.f89598d, new View.OnClickListener() { // from class: l.u5k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174730a.m115084M(view);
            }
        });
        boolean zM115083L = m115083L();
        VLinear vLinear = this.f89618x;
        if (zM115083L) {
            xdl0.m208344M(vLinear, false);
            xdl0.m208344M(this.f89612r, true);
            xdl0.m208329E0(this.f89617w, new View.OnClickListener() { // from class: l.v5k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f180063a.m115085N(view);
                }
            });
        } else {
            xdl0.m208344M(vLinear, true);
            xdl0.m208344M(this.f89612r, false);
            boolean zM194847z = upa.m194847z();
            CoreStatusSquareEnterView coreStatusSquareEnterView = this.f89589B;
            if (zM194847z) {
                coreStatusSquareEnterView.setBackgroundResource(x2c0.f190692wp);
                this.f89589B.m43570s0();
                this.f89619y.setBackgroundResource(x2c0.f190692wp);
                this.f89590C.m43556o();
            } else {
                coreStatusSquareEnterView.setBackgroundResource(x2c0.f190724xp);
            }
            this.f89589B.f26796l.setText("更多");
            TextPaint paint = this.f89589B.f26796l.getPaint();
            if (paint != null) {
                paint.setFakeBoldText(false);
            }
        }
        boolean zM194847z2 = upa.m194847z();
        VText_Bold vText_Bold = this.f89596b;
        if (zM194847z2) {
            vText_Bold.setCompoundDrawablesWithIntrinsicBounds(x2c0.f189866Wo, 0, 0, 0);
            this.f89603i.setRingColor(this.f89591D.color(w0c0.f183749A));
        } else {
            vText_Bold.setCompoundDrawablesWithIntrinsicBounds(x2c0.f189835Vo, 0, 0, 0);
            this.f89603i.setRingColor(this.f89591D.color(w0c0.f183773I));
        }
        this.f89595a.setTransCallback(new C16549a());
        if (upa.m194800p2()) {
            ShimmerOptLayout.C8255b c8255b = new ShimmerOptLayout.C8255b(new int[]{16777215, 1728053247, 1728053247, 16777215}, new float[]{0.0f, 0.43f, 0.57f, 1.0f});
            c8255b.m43787n(30.0f).m43789p(t100.m186890d(45.0f)).m43785l(1050L).m43786m(t100.m186890d(20.0f));
            this.f89605k.setShimmerConfig(c8255b);
        }
    }

    /* JADX INFO: renamed from: I */
    public View m115081I(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return f6k0.m119621b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: J */
    public void m115082J() {
        int i = (this.f89593F + 1) % 2;
        this.f89593F = i;
        this.f89595a.m43528j(i);
        int i2 = this.f89593F;
        SeeMyselfRootLayout seeMyselfRootLayout = this.f89598d;
        if (i2 == 1) {
            seeMyselfRootLayout.m38601O(this.f89591D);
        } else {
            seeMyselfRootLayout.m38611x();
        }
    }

    /* JADX INFO: renamed from: L */
    public final boolean m115083L() {
        return bzc0.m104566f();
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m115084M(View view) {
        o6j0.m162859c("e_self_edit", OMSDialogPositon.p_navigation_view, new o6j0.C18854a[0]);
        Intent intentM50738p2 = ProfileAct.m50738p2(this.f89591D, qib0.f154713b0.f139230a.userId(), "profile_frag_me_avatar", false, true);
        intentM50738p2.putExtra("preview_type", 0);
        this.f89591D.startActivity(intentM50738p2);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m115085N(View view) {
        zvf0.m220396r("e_my_moment", OMSDialogPositon.p_navigation_view);
        this.f89591D.startActivity(CoreModule.m29934N().mo60339bb(this.f89591D, CoreModule.m29931H().userId(), "from_profile", -1, "", 2, "pageid", false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m115086O(xaj0 xaj0Var, String str, View view) {
        zvf0.m220399u("e_my_state", OMSDialogPositon.p_navigation_view, vwb.m200311Y("state_id", (String) xaj0Var.f191751a));
        CoreModule.m29934N().mo60270Dk(this.f89591D, str, (String) xaj0Var.f191751a, OMSDialogPositon.p_navigation_view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m115087P(xaj0 xaj0Var, String str, View view) {
        zvf0.m220399u("e_my_state", OMSDialogPositon.p_navigation_view, vwb.m200311Y("state_id", (String) xaj0Var.f191751a));
        CoreModule.m29934N().mo60270Dk(this.f89591D, str, (String) xaj0Var.f191751a, OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m115088Q(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        this.f89590C.m43549h();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m115089R(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        this.f89590C.m43549h();
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m115090S() {
        CoreModule.f17545c.f19639e0.f149161D6.put(Boolean.TRUE);
        this.f89605k.m43769b();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m115091T(String str) {
        CoreModule.f17545c.f19639e0.f149168E6.put(str);
        this.f89605k.m43769b();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m115092U(User user, View view) {
        zvf0.m220396r("e_complete_card_info_close", OMSDialogPositon.p_navigation_view);
        CoreModule.f17545c.f19639e0.f149499w6.put(Boolean.TRUE);
        mo115098m(user);
    }

    /* JADX INFO: renamed from: V */
    public final boolean m115093V(User user) {
        if (upa.m194800p2() || CoreModule.f17545c.f19639e0.f149499w6.get().booleanValue()) {
            return false;
        }
        long jLongValue = CoreModule.f17545c.f19639e0.f149506x6.get().longValue();
        int iM194766i3 = upa.m194766i3();
        if (jLongValue <= 1 || iM194766i3 <= 0 || mqi0.m155944o() - jLongValue <= ((long) iM194766i3) * 86400000) {
            return ((upa.m194715X2() && CoreModule.f17545c.f19639e0.f149321Z3.get().equals(UserHomeMode.marryMode)) || qqi0.m175940h(mqi0.m155944o(), (long) user.createdTime, upa.m194771j3()) || (!TextUtils.isEmpty(user.description) && user.pictures.size() >= 3)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: W */
    public void m115094W(boolean z) {
        xdl0.m208344M(this.f89597c, z);
        SeeMyselfRootLayout seeMyselfRootLayout = this.f89598d;
        if (z) {
            seeMyselfRootLayout.m38601O(this.f89591D);
        } else {
            seeMyselfRootLayout.m38611x();
        }
        xdl0.m208344M(this.f89600f, !z);
    }

    /* JADX INFO: renamed from: X */
    public final void m115095X(float f) {
        float f2 = f < 0.56f ? 0.0f : (f - 0.56f) / 0.44f;
        float f3 = f < 0.8f ? 0.0f : (f - 0.8f) / 0.19999999f;
        this.f89597c.setAlpha(Math.min(1.0f, f2));
        this.f89596b.setAlpha(Math.min(1.0f, f3));
        this.f89600f.setAlpha(Math.max(0.0f, 1.0f - (f * 1.0f)));
    }

    @Override // p149l.sxj0
    @NonNull
    /* JADX INFO: renamed from: a */
    public View mo103678a() {
        return this.f89619y;
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: b */
    public void mo103679b(boolean z) {
        boolean zM115083L = m115083L();
        VLinear vLinear = this.f89618x;
        if (zM115083L) {
            xdl0.m208344M(vLinear, false);
            xdl0.m208344M(this.f89612r, true);
        } else {
            xdl0.m208344M(vLinear, true);
            xdl0.m208344M(this.f89612r, false);
            xdl0.m208344M(this.f89589B, !z);
            xdl0.m208344M(this.f89590C, z);
        }
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: c */
    public void mo103680c() {
        xdl0.m208344M(this.f89619y, true);
    }

    @Override // p149l.sxj0
    @NonNull
    /* JADX INFO: renamed from: d */
    public VImage mo103681d() {
        return this.f89610p;
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: e */
    public void mo103682e(final String str, final xaj0<String, String, String> xaj0Var) {
        if (m115083L()) {
            xdl0.m208344M(this.f89613s, true);
            xdl0.m208344M(this.f89616v, false);
            this.f89615u.setText(xaj0Var.f191752b);
            qib0.f154691G.m102325I0(this.f89614t, xaj0Var.f191753c, t100.m186890d(22.0f), t100.m186890d(22.0f));
            this.f89613s.setOnClickListener(new View.OnClickListener() { // from class: l.y5k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f196447a.m115086O(xaj0Var, str, view);
                }
            });
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f89619y.getLayoutParams();
        layoutParams.width = -2;
        VLinear vLinear = this.f89619y;
        vLinear.setPadding(t100.f167259h, vLinear.getPaddingTop(), t100.f167261j, this.f89619y.getPaddingBottom());
        this.f89619y.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f89620z.getLayoutParams();
        int i = t100.f167268q;
        layoutParams2.height = i;
        layoutParams2.width = i;
        this.f89620z.setLayoutParams(layoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f89588A.getLayoutParams();
        marginLayoutParams.leftMargin = t100.f167256e;
        this.f89588A.setLayoutParams(marginLayoutParams);
        this.f89588A.setTextSize(13.0f);
        this.f89589B.f26796l.setTextSize(13.0f);
        this.f89589B.f26796l.setTextColor(Color.parseColor("#6a000000"));
        this.f89589B.f26796l.setTypeface(Typeface.create(eqh0.m117752c(3), 0));
        this.f89588A.setTextColor(Color.parseColor("#1A1A1B"));
        this.f89588A.setTypeface(Typeface.create(eqh0.m117752c(3), 0));
        this.f89588A.setText(xaj0Var.f191752b);
        this.f89620z.setBackgroundResource(0);
        qib0.f154691G.m102325I0(this.f89620z, xaj0Var.f191753c, t100.m186890d(24.0f), t100.m186890d(24.0f));
        this.f89619y.setOnClickListener(new View.OnClickListener() { // from class: l.z5k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f201823a.m115087P(xaj0Var, str, view);
            }
        });
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: f */
    public void mo115096f() {
        if (xdl0.m208349O0(this.f89599e)) {
            if (CoreModule.f17545c.f19639e0.f149506x6.get().longValue() < 1) {
                CoreModule.f17545c.f19639e0.f149506x6.put(Long.valueOf(mqi0.m155944o()));
            }
            zvf0.m220402x("e_complete_card_info_close", OMSDialogPositon.p_navigation_view);
        }
    }

    @Override // p149l.sxj0
    @NonNull
    /* JADX INFO: renamed from: g */
    public ODiamondTagLabel mo103683g() {
        return this.f89611q;
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: h */
    public void mo103684h(View.OnClickListener onClickListener) {
        xdl0.m208329E0(this.f89605k, onClickListener);
    }

    @Override // p149l.sxj0
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM115081I = m115081I(layoutInflater, viewGroup);
        this.f89598d.setRenderType(1);
        m115076K();
        return viewM115081I;
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: k */
    public void mo115097k(View.OnClickListener onClickListener) {
        xdl0.m208329E0(this.f89602h, onClickListener);
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: l */
    public void mo103687l(User user) {
        qib0.f154691G.m102327J0(this.f89604j, user.m60124fp().calculatedWidth(t100.f167240O), false);
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
    @Override // p149l.sxj0
    /* JADX INFO: renamed from: m */
    public void mo115098m(final User user) {
        boolean zM115093V = m115093V(user);
        int i = this.f89593F;
        if (i != zM115093V) {
            Object[] objArr = i == -1;
            this.f89593F = zM115093V ? 1 : 0;
            if (objArr == true) {
                this.f89595a.m43528j(zM115093V ? 1 : 0);
            } else {
                e51.m114745J(this.f89594G);
                e51.m114743H(this.f89591D, this.f89594G, 500L);
            }
            if (this.f89593F != 1) {
                xdl0.m208329E0(this.f89595a, null);
                this.f89595a.setClickable(false);
            } else {
                this.f89598d.m38601O(this.f89591D);
                xdl0.m208329E0(this.f89595a, new View.OnClickListener() { // from class: l.a6k0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        e6k0.m115068A(view);
                    }
                });
                xdl0.m208329E0(this.f89599e, new View.OnClickListener() { // from class: l.b6k0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f73839a.m115092U(user, view);
                    }
                });
                xdl0.m208344M(this.f89599e, true);
            }
        }
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: n */
    public void mo103688n(final View.OnClickListener onClickListener) {
        if (m115083L()) {
            xdl0.m208344M(this.f89613s, false);
            xdl0.m208344M(this.f89616v, true);
            xdl0.m208329E0(this.f89616v, new View.OnClickListener() { // from class: l.c6k0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f79553a.m115088Q(onClickListener, view);
                }
            });
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f89619y.getLayoutParams();
        layoutParams.width = t100.m186890d(80.0f);
        this.f89619y.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f89620z.getLayoutParams();
        int i = t100.f167264m;
        layoutParams2.height = i;
        layoutParams2.width = i;
        this.f89620z.setLayoutParams(layoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f89588A.getLayoutParams();
        marginLayoutParams.leftMargin = t100.f167256e;
        marginLayoutParams.rightMargin = t100.f167254c;
        this.f89588A.setLayoutParams(marginLayoutParams);
        this.f89588A.setTextSize(14.0f);
        this.f89589B.f26796l.setTextSize(13.0f);
        this.f89588A.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f89588A.setTypeface(eqh0.m117752c(3), 0);
        this.f89588A.setText("状态");
        qib0.f154691G.m102354Y0(this.f89620z, upa.m194847z() ? x2c0.f189949Ze : x2c0.f189918Ye);
        xdl0.m208329E0(this.f89619y, new View.OnClickListener() { // from class: l.d6k0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f84632a.m115089R(onClickListener, view);
            }
        });
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: q */
    public void mo103691q(User user) {
        final String str;
        this.f89592E = user;
        int iM204634B = wn90.m204602F().m204634B(this.f89591D, user);
        if (upa.m194715X2() && CoreModule.f17545c.f19639e0.f149321Z3.get().equals(UserHomeMode.marryMode)) {
            iM204634B = 100;
        }
        if (iM204634B >= 100) {
            xdl0.m208344M(this.f89603i, false);
            ViewGroup.LayoutParams layoutParams = this.f89604j.getLayoutParams();
            layoutParams.width = t100.m186890d(90.0f);
            layoutParams.height = t100.m186890d(90.0f);
            this.f89604j.setLayoutParams(layoutParams);
            this.f89607m.setTextSize(13.0f);
            str = "编辑";
        } else {
            ViewGroup.LayoutParams layoutParams2 = this.f89604j.getLayoutParams();
            layoutParams2.width = t100.m186890d(78.0f);
            layoutParams2.height = t100.m186890d(78.0f);
            this.f89604j.setLayoutParams(layoutParams2);
            xdl0.m208344M(this.f89603i, true);
            this.f89603i.setProgress(iM204634B);
            str = iM204634B + "%";
            this.f89607m.setTextSize(14.0f);
        }
        if (!upa.m194800p2() || (upa.m194745e2() && TextUtils.equals(CoreModule.f17545c.f19639e0.f149321Z3.get(), UserHomeMode.marryMode))) {
            this.f89606l.setLocalRes(x2c0.f190173gg);
        } else if (wn90.m204606U(user)) {
            if (CoreModule.f17545c.f19639e0.f149161D6.get().booleanValue() || v930.m197534h() != TabName.Me) {
                this.f89606l.setLocalRes(x2c0.f190746yf);
            } else {
                this.f89606l.m43705e("https://auto.tancdn.com/v1/raw/21b5cc87-9734-44c1-b353-993bb8cc343e14.svga", x2c0.f190746yf, 60, new Runnable() { // from class: l.w5k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f184708a.m115090S();
                    }
                });
            }
            this.f89607m.setTextSize(10.0f);
            str = "吸引力较低";
        } else if (!NullChecker.m81303a(CoreModule.f17545c.f19639e0.f149404j7.m221515e()) || TextUtils.isEmpty(CoreModule.f17545c.f19639e0.f149404j7.m221515e().type)) {
            this.f89606l.setLocalRes(x2c0.f190173gg);
        } else {
            str = CoreModule.f17545c.f19639e0.f149404j7.m221515e().title;
            if (TextUtils.equals(CoreModule.f17545c.f19639e0.f149168E6.get(), str) || v930.m197534h() != TabName.Me) {
                this.f89606l.setLocalRes(x2c0.f189201Bf);
            } else {
                this.f89606l.m43705e("https://fe-static.tancdn.com/v1/raw/f2005b92-dd66-401a-abd9-9b6dca2c049814.svga", x2c0.f189201Bf, 60, new Runnable() { // from class: l.x5k0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f191170a.m115091T(str);
                    }
                });
            }
            this.f89607m.setTextSize(10.0f);
        }
        this.f89607m.setText(str);
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: r */
    public boolean mo115099r() {
        if (this.f89593F == 1) {
            return true;
        }
        return super.mo115099r();
    }

    @Override // p149l.sxj0
    @NonNull
    /* JADX INFO: renamed from: t */
    public VText mo103693t() {
        return this.f89608n;
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: u */
    public void mo103694u() {
        if (m115083L()) {
            return;
        }
        this.f89590C.m43557p();
    }

    @Override // p149l.sxj0
    @NonNull
    /* JADX INFO: renamed from: v */
    public VImage mo103695v() {
        return this.f89609o;
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: i */
    public void mo103685i(User user) {
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: o */
    public void mo103689o(int i) {
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: p */
    public void mo103690p(User user) {
    }

    @Override // p149l.sxj0
    /* JADX INFO: renamed from: j */
    public void mo103686j(View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
    }
}
