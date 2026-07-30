package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.UserHomeMode;
import com.p051p1.mobile.putong.core.newui.home.insert.myself.SeeMyselfRootLayout;
import com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view.UserInfoProfileOptTransAnimLayout;
import com.p051p1.mobile.putong.core.newui.statussquare.CoreMyTabStatusPostView;
import com.p051p1.mobile.putong.core.newui.statussquare.CoreStatusSquareEnterView;
import com.p051p1.mobile.putong.core.newui.view.CoreSvgaOptView;
import com.p051p1.mobile.putong.core.newui.view.ShimmerOptLayout;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.profile.views.RingProgressBarView;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.newui.view.ODiamondTagLabel;
import com.tantanapp.common.utils.NullChecker;
import p151v.VDraweeView;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes11.dex */
public class kfk0 implements y6k0 {

    /* JADX INFO: renamed from: A */
    public TextView f126404A;

    /* JADX INFO: renamed from: B */
    public CoreStatusSquareEnterView f126405B;

    /* JADX INFO: renamed from: C */
    public CoreMyTabStatusPostView f126406C;

    /* JADX INFO: renamed from: D */
    public Act f126407D;

    /* JADX INFO: renamed from: E */
    public User f126408E;

    /* JADX INFO: renamed from: F */
    public int f126409F = -1;

    /* JADX INFO: renamed from: G */
    public Runnable f126410G = new RunnableC18150b();

    /* JADX INFO: renamed from: a */
    public UserInfoProfileOptTransAnimLayout f126411a;

    /* JADX INFO: renamed from: b */
    public VText_Bold f126412b;

    /* JADX INFO: renamed from: c */
    public VLinear f126413c;

    /* JADX INFO: renamed from: d */
    public SeeMyselfRootLayout f126414d;

    /* JADX INFO: renamed from: e */
    public VImage f126415e;

    /* JADX INFO: renamed from: f */
    public VLinear f126416f;

    /* JADX INFO: renamed from: g */
    public LinearLayout f126417g;

    /* JADX INFO: renamed from: h */
    public FrameLayout f126418h;

    /* JADX INFO: renamed from: i */
    public RingProgressBarView f126419i;

    /* JADX INFO: renamed from: j */
    public VDraweeView f126420j;

    /* JADX INFO: renamed from: k */
    public ShimmerOptLayout f126421k;

    /* JADX INFO: renamed from: l */
    public CoreSvgaOptView f126422l;

    /* JADX INFO: renamed from: m */
    public VText f126423m;

    /* JADX INFO: renamed from: n */
    public VText f126424n;

    /* JADX INFO: renamed from: o */
    public VImage f126425o;

    /* JADX INFO: renamed from: p */
    public VImage f126426p;

    /* JADX INFO: renamed from: q */
    public ODiamondTagLabel f126427q;

    /* JADX INFO: renamed from: r */
    public VLinear f126428r;

    /* JADX INFO: renamed from: s */
    public VLinear f126429s;

    /* JADX INFO: renamed from: t */
    public VDraweeView f126430t;

    /* JADX INFO: renamed from: u */
    public VText_Medium f126431u;

    /* JADX INFO: renamed from: v */
    public VText_Medium f126432v;

    /* JADX INFO: renamed from: w */
    public VText_Medium f126433w;

    /* JADX INFO: renamed from: x */
    public VLinear f126434x;

    /* JADX INFO: renamed from: y */
    public VLinear f126435y;

    /* JADX INFO: renamed from: z */
    public VDraweeView f126436z;

    /* JADX INFO: renamed from: l.kfk0$a */
    public class C18149a implements UserInfoProfileOptTransAnimLayout.InterfaceC8400c {
        public C18149a() {
        }

        @Override // com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view.UserInfoProfileOptTransAnimLayout.InterfaceC8400c
        /* JADX INFO: renamed from: a */
        public void mo44715a(int i) {
            kfk0 kfk0Var = kfk0.this;
            if (i != 0) {
                bnl0.m105524M(kfk0Var.f126413c, true);
                bnl0.m105524M(kfk0.this.f126412b, true);
                bnl0.m105524M(kfk0.this.f126416f, false);
            } else {
                bnl0.m105524M(kfk0Var.f126413c, false);
                bnl0.m105524M(kfk0.this.f126412b, false);
                bnl0.m105524M(kfk0.this.f126416f, true);
                kfk0.this.f126414d.m39614x();
            }
        }

        @Override // com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view.UserInfoProfileOptTransAnimLayout.InterfaceC8400c
        /* JADX INFO: renamed from: b */
        public void mo44716b(float f, boolean z) {
            kfk0.this.m149537X(f);
        }

        @Override // com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.view.UserInfoProfileOptTransAnimLayout.InterfaceC8400c
        /* JADX INFO: renamed from: c */
        public void mo44717c(int i, float f) {
            bnl0.m105524M(kfk0.this.f126413c, true);
            bnl0.m105524M(kfk0.this.f126416f, true);
            bnl0.m105524M(kfk0.this.f126412b, true);
            kfk0.this.m149537X(f);
        }
    }

    /* JADX INFO: renamed from: l.kfk0$b */
    public class RunnableC18150b implements Runnable {
        public RunnableC18150b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            kfk0 kfk0Var = kfk0.this;
            kfk0Var.f126411a.m44714j(kfk0Var.f126409F);
        }
    }

    public kfk0(Act act) {
        this.f126407D = act;
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m149510A(View view) {
    }

    /* JADX INFO: renamed from: K */
    private void m149518K() {
        bnl0.m105509E0(this.f126414d, new View.OnClickListener() { // from class: l.afk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f70920a.m149526M(view);
            }
        });
        boolean zM149525L = m149525L();
        VLinear vLinear = this.f126434x;
        if (zM149525L) {
            bnl0.m105524M(vLinear, false);
            bnl0.m105524M(this.f126428r, true);
            bnl0.m105509E0(this.f126433w, new View.OnClickListener() { // from class: l.bfk0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f76520a.m149527N(view);
                }
            });
        } else {
            bnl0.m105524M(vLinear, true);
            bnl0.m105524M(this.f126428r, false);
            boolean zM131778z = gra.m131778z();
            CoreStatusSquareEnterView coreStatusSquareEnterView = this.f126405B;
            if (zM131778z) {
                coreStatusSquareEnterView.setBackgroundResource(dbc0.f87162kq);
                this.f126405B.m44756s0();
                this.f126435y.setBackgroundResource(dbc0.f87162kq);
                this.f126406C.m44742o();
            } else {
                coreStatusSquareEnterView.setBackgroundResource(dbc0.f87195lq);
            }
            this.f126405B.f27644l.setText("更多");
            TextPaint paint = this.f126405B.f27644l.getPaint();
            if (paint != null) {
                paint.setFakeBoldText(false);
            }
        }
        boolean zM131778z2 = gra.m131778z();
        VText_Bold vText_Bold = this.f126412b;
        if (zM131778z2) {
            vText_Bold.setCompoundDrawablesWithIntrinsicBounds(dbc0.f86322Kp, 0, 0, 0);
            this.f126419i.setRingColor(this.f126407D.color(c9c0.f80318A));
        } else {
            vText_Bold.setCompoundDrawablesWithIntrinsicBounds(dbc0.f86290Jp, 0, 0, 0);
            this.f126419i.setRingColor(this.f126407D.color(c9c0.f80342I));
        }
        this.f126411a.setTransCallback(new C18149a());
        if (gra.m131731p2()) {
            ShimmerOptLayout.C8418b c8418b = new ShimmerOptLayout.C8418b(new int[]{16777215, 1728053247, 1728053247, 16777215}, new float[]{0.0f, 0.43f, 0.57f, 1.0f});
            c8418b.m44973n(30.0f).m44975p(qa00.m175859d(45.0f)).m44971l(1050L).m44972m(qa00.m175859d(20.0f));
            this.f126421k.setShimmerConfig(c8418b);
        }
    }

    /* JADX INFO: renamed from: I */
    public View m149523I(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return lfk0.m154000b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: J */
    public void m149524J() {
        int i = (this.f126409F + 1) % 2;
        this.f126409F = i;
        this.f126411a.m44714j(i);
        int i2 = this.f126409F;
        SeeMyselfRootLayout seeMyselfRootLayout = this.f126414d;
        if (i2 == 1) {
            seeMyselfRootLayout.m39604O(this.f126407D);
        } else {
            seeMyselfRootLayout.m39614x();
        }
    }

    /* JADX INFO: renamed from: L */
    public final boolean m149525L() {
        return e7d0.m119697f();
    }

    /* JADX INFO: renamed from: M */
    public final /* synthetic */ void m149526M(View view) {
        sfj0.m185596c("e_self_edit", OMSDialogPositon.p_navigation_view, new sfj0.C20032a[0]);
        Intent intentM51922q2 = ProfileAct.m51922q2(this.f126407D, uqb0.f180396b0.f170324a.userId(), "profile_frag_me_avatar", false, true);
        intentM51922q2.putExtra("preview_type", 0);
        this.f126407D.startActivity(intentM51922q2);
    }

    /* JADX INFO: renamed from: N */
    public final /* synthetic */ void m149527N(View view) {
        i4g0.m138520r("e_my_moment", OMSDialogPositon.p_navigation_view);
        this.f126407D.startActivity(CoreModule.m30932N().mo61523bb(this.f126407D, CoreModule.m30929H().userId(), "from_profile", -1, "", 2, "pageid", false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: O */
    public final /* synthetic */ void m149528O(bkj0 bkj0Var, String str, View view) {
        i4g0.m138523u("e_my_state", OMSDialogPositon.p_navigation_view, jyb.m147494Y("state_id", (String) bkj0Var.f77081a));
        CoreModule.m30932N().mo61454Dk(this.f126407D, str, (String) bkj0Var.f77081a, OMSDialogPositon.p_navigation_view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m149529P(bkj0 bkj0Var, String str, View view) {
        i4g0.m138523u("e_my_state", OMSDialogPositon.p_navigation_view, jyb.m147494Y("state_id", (String) bkj0Var.f77081a));
        CoreModule.m30932N().mo61454Dk(this.f126407D, str, (String) bkj0Var.f77081a, OMSDialogPositon.p_navigation_view);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m149530Q(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        this.f126406C.m44735h();
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m149531R(View.OnClickListener onClickListener, View view) {
        onClickListener.onClick(view);
        this.f126406C.m44735h();
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m149532S() {
        CoreModule.f18264c.f20381e0.f89018D6.put(Boolean.TRUE);
        this.f126421k.m44955b();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m149533T(String str) {
        CoreModule.f18264c.f20381e0.f89025E6.put(str);
        this.f126421k.m44955b();
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m149534U(User user, View view) {
        i4g0.m138520r("e_complete_card_info_close", OMSDialogPositon.p_navigation_view);
        CoreModule.f18264c.f20381e0.f89356w6.put(Boolean.TRUE);
        mo149550m(user);
    }

    /* JADX INFO: renamed from: V */
    public final boolean m149535V(User user) {
        if (gra.m131731p2() || CoreModule.f18264c.f20381e0.f89356w6.get().booleanValue()) {
            return false;
        }
        long jLongValue = CoreModule.f18264c.f20381e0.f89363x6.get().longValue();
        int iM131697i3 = gra.m131697i3();
        if (jLongValue <= 1 || iM131697i3 <= 0 || pzi0.m174454o() - jLongValue <= ((long) iM131697i3) * 86400000) {
            return ((gra.m131646X2() && CoreModule.f18264c.f20381e0.f89178Z3.get().equals(UserHomeMode.marryMode)) || tzi0.m193670h(pzi0.m174454o(), (long) user.createdTime, gra.m131702j3()) || (!TextUtils.isEmpty(user.description) && user.pictures.size() >= 3)) ? false : true;
        }
        return false;
    }

    /* JADX INFO: renamed from: W */
    public void m149536W(boolean z) {
        bnl0.m105524M(this.f126413c, z);
        SeeMyselfRootLayout seeMyselfRootLayout = this.f126414d;
        if (z) {
            seeMyselfRootLayout.m39604O(this.f126407D);
        } else {
            seeMyselfRootLayout.m39614x();
        }
        bnl0.m105524M(this.f126416f, !z);
    }

    /* JADX INFO: renamed from: X */
    public final void m149537X(float f) {
        float f2 = f < 0.56f ? 0.0f : (f - 0.56f) / 0.44f;
        float f3 = f < 0.8f ? 0.0f : (f - 0.8f) / 0.19999999f;
        this.f126413c.setAlpha(Math.min(1.0f, f2));
        this.f126412b.setAlpha(Math.min(1.0f, f3));
        this.f126416f.setAlpha(Math.max(0.0f, 1.0f - (f * 1.0f)));
    }

    @Override // p153l.y6k0
    @NonNull
    /* JADX INFO: renamed from: a */
    public View mo149538a() {
        return this.f126435y;
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: b */
    public void mo149539b(boolean z) {
        boolean zM149525L = m149525L();
        VLinear vLinear = this.f126434x;
        if (zM149525L) {
            bnl0.m105524M(vLinear, false);
            bnl0.m105524M(this.f126428r, true);
        } else {
            bnl0.m105524M(vLinear, true);
            bnl0.m105524M(this.f126428r, false);
            bnl0.m105524M(this.f126405B, !z);
            bnl0.m105524M(this.f126406C, z);
        }
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: c */
    public void mo149540c() {
        bnl0.m105524M(this.f126435y, true);
    }

    @Override // p153l.y6k0
    @NonNull
    /* JADX INFO: renamed from: d */
    public VImage mo149541d() {
        return this.f126426p;
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: e */
    public void mo149542e(final String str, final bkj0<String, String, String> bkj0Var) {
        if (m149525L()) {
            bnl0.m105524M(this.f126429s, true);
            bnl0.m105524M(this.f126432v, false);
            this.f126431u.setText(bkj0Var.f77082b);
            uqb0.f180374G.m127109I0(this.f126430t, bkj0Var.f77083c, qa00.m175859d(22.0f), qa00.m175859d(22.0f));
            this.f126429s.setOnClickListener(new View.OnClickListener() { // from class: l.efk0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f93792a.m149528O(bkj0Var, str, view);
                }
            });
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f126435y.getLayoutParams();
        layoutParams.width = -2;
        VLinear vLinear = this.f126435y;
        vLinear.setPadding(qa00.f156321h, vLinear.getPaddingTop(), qa00.f156323j, this.f126435y.getPaddingBottom());
        this.f126435y.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f126436z.getLayoutParams();
        int i = qa00.f156330q;
        layoutParams2.height = i;
        layoutParams2.width = i;
        this.f126436z.setLayoutParams(layoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f126404A.getLayoutParams();
        marginLayoutParams.leftMargin = qa00.f156318e;
        this.f126404A.setLayoutParams(marginLayoutParams);
        this.f126404A.setTextSize(13.0f);
        this.f126405B.f27644l.setTextSize(13.0f);
        this.f126405B.f27644l.setTextColor(Color.parseColor("#6a000000"));
        this.f126405B.f27644l.setTypeface(Typeface.create(lyh0.m156283c(3), 0));
        this.f126404A.setTextColor(Color.parseColor("#1A1A1B"));
        this.f126404A.setTypeface(Typeface.create(lyh0.m156283c(3), 0));
        this.f126404A.setText(bkj0Var.f77082b);
        this.f126436z.setBackgroundResource(0);
        uqb0.f180374G.m127109I0(this.f126436z, bkj0Var.f77083c, qa00.m175859d(24.0f), qa00.m175859d(24.0f));
        this.f126435y.setOnClickListener(new View.OnClickListener() { // from class: l.ffk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f98790a.m149529P(bkj0Var, str, view);
            }
        });
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: f */
    public void mo149543f() {
        if (bnl0.m105529O0(this.f126415e)) {
            if (CoreModule.f18264c.f20381e0.f89363x6.get().longValue() < 1) {
                CoreModule.f18264c.f20381e0.f89363x6.put(Long.valueOf(pzi0.m174454o()));
            }
            i4g0.m138526x("e_complete_card_info_close", OMSDialogPositon.p_navigation_view);
        }
    }

    @Override // p153l.y6k0
    @NonNull
    /* JADX INFO: renamed from: g */
    public ODiamondTagLabel mo149544g() {
        return this.f126427q;
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: h */
    public void mo149545h(View.OnClickListener onClickListener) {
        bnl0.m105509E0(this.f126421k, onClickListener);
    }

    @Override // p153l.y6k0
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM149523I = m149523I(layoutInflater, viewGroup);
        this.f126414d.setRenderType(1);
        m149518K();
        return viewM149523I;
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: k */
    public void mo149548k(View.OnClickListener onClickListener) {
        bnl0.m105509E0(this.f126418h, onClickListener);
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: l */
    public void mo149549l(User user) {
        uqb0.f180374G.m127111J0(this.f126420j, user.m61308fp().calculatedWidth(qa00.f156302O), false);
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
    @Override // p153l.y6k0
    /* JADX INFO: renamed from: m */
    public void mo149550m(final User user) {
        boolean zM149535V = m149535V(user);
        int i = this.f126409F;
        if (i != zM149535V) {
            Object[] objArr = i == -1;
            this.f126409F = zM149535V ? 1 : 0;
            if (objArr == true) {
                this.f126411a.m44714j(zM149535V ? 1 : 0);
            } else {
                l51.m152890J(this.f126410G);
                l51.m152888H(this.f126407D, this.f126410G, 500L);
            }
            if (this.f126409F != 1) {
                bnl0.m105509E0(this.f126411a, null);
                this.f126411a.setClickable(false);
            } else {
                this.f126414d.m39604O(this.f126407D);
                bnl0.m105509E0(this.f126411a, new View.OnClickListener() { // from class: l.gfk0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        kfk0.m149510A(view);
                    }
                });
                bnl0.m105509E0(this.f126415e, new View.OnClickListener() { // from class: l.hfk0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f109311a.m149534U(user, view);
                    }
                });
                bnl0.m105524M(this.f126415e, true);
            }
        }
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: n */
    public void mo149551n(final View.OnClickListener onClickListener) {
        if (m149525L()) {
            bnl0.m105524M(this.f126429s, false);
            bnl0.m105524M(this.f126432v, true);
            bnl0.m105509E0(this.f126432v, new View.OnClickListener() { // from class: l.ifk0
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f114675a.m149530Q(onClickListener, view);
                }
            });
            return;
        }
        ViewGroup.LayoutParams layoutParams = this.f126435y.getLayoutParams();
        layoutParams.width = qa00.m175859d(80.0f);
        this.f126435y.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = this.f126436z.getLayoutParams();
        int i = qa00.f156326m;
        layoutParams2.height = i;
        layoutParams2.width = i;
        this.f126436z.setLayoutParams(layoutParams2);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f126404A.getLayoutParams();
        marginLayoutParams.leftMargin = qa00.f156318e;
        marginLayoutParams.rightMargin = qa00.f156316c;
        this.f126404A.setLayoutParams(marginLayoutParams);
        this.f126404A.setTextSize(14.0f);
        this.f126405B.f27644l.setTextSize(13.0f);
        this.f126404A.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
        this.f126404A.setTypeface(lyh0.m156283c(3), 0);
        this.f126404A.setText("状态");
        uqb0.f180374G.m127138Y0(this.f126436z, gra.m131778z() ? dbc0.f86440Of : dbc0.f86408Nf);
        bnl0.m105509E0(this.f126435y, new View.OnClickListener() { // from class: l.jfk0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120598a.m149531R(onClickListener, view);
            }
        });
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: q */
    public void mo149554q(User user) {
        final String str;
        this.f126408E = user;
        int iM100594B = aw90.m100562F().m100594B(this.f126407D, user);
        if (gra.m131646X2() && CoreModule.f18264c.f20381e0.f89178Z3.get().equals(UserHomeMode.marryMode)) {
            iM100594B = 100;
        }
        if (iM100594B >= 100) {
            bnl0.m105524M(this.f126419i, false);
            ViewGroup.LayoutParams layoutParams = this.f126420j.getLayoutParams();
            layoutParams.width = qa00.m175859d(90.0f);
            layoutParams.height = qa00.m175859d(90.0f);
            this.f126420j.setLayoutParams(layoutParams);
            this.f126423m.setTextSize(13.0f);
            str = "编辑";
        } else {
            ViewGroup.LayoutParams layoutParams2 = this.f126420j.getLayoutParams();
            layoutParams2.width = qa00.m175859d(78.0f);
            layoutParams2.height = qa00.m175859d(78.0f);
            this.f126420j.setLayoutParams(layoutParams2);
            bnl0.m105524M(this.f126419i, true);
            this.f126419i.setProgress(iM100594B);
            str = iM100594B + "%";
            this.f126423m.setTextSize(14.0f);
        }
        if (!gra.m131731p2() || (gra.m131676e2() && TextUtils.equals(CoreModule.f18264c.f20381e0.f89178Z3.get(), UserHomeMode.marryMode))) {
            this.f126422l.setLocalRes(dbc0.f86633Ug);
        } else if (aw90.m100566U(user)) {
            if (CoreModule.f18264c.f20381e0.f89018D6.get().booleanValue() || ji30.m144964h() != TabName.Me) {
                this.f126422l.setLocalRes(dbc0.f87218mg);
            } else {
                this.f126422l.m44891e("https://auto.tancdn.com/v1/raw/21b5cc87-9734-44c1-b353-993bb8cc343e14.svga", dbc0.f87218mg, 60, new Runnable() { // from class: l.cfk0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f81512a.m149532S();
                    }
                });
            }
            this.f126423m.setTextSize(10.0f);
            str = "吸引力较低";
        } else if (!NullChecker.m82486a(CoreModule.f18264c.f20381e0.f89261j7.m222761e()) || TextUtils.isEmpty(CoreModule.f18264c.f20381e0.f89261j7.m222761e().type)) {
            this.f126422l.setLocalRes(dbc0.f86633Ug);
        } else {
            str = CoreModule.f18264c.f20381e0.f89261j7.m222761e().title;
            if (TextUtils.equals(CoreModule.f18264c.f20381e0.f89025E6.get(), str) || ji30.m144964h() != TabName.Me) {
                this.f126422l.setLocalRes(dbc0.f87317pg);
            } else {
                this.f126422l.m44891e("https://fe-static.tancdn.com/v1/raw/f2005b92-dd66-401a-abd9-9b6dca2c049814.svga", dbc0.f87317pg, 60, new Runnable() { // from class: l.dfk0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f88165a.m149533T(str);
                    }
                });
            }
            this.f126423m.setTextSize(10.0f);
        }
        this.f126423m.setText(str);
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: r */
    public boolean mo149555r() {
        if (this.f126409F == 1) {
            return true;
        }
        return super.mo149555r();
    }

    @Override // p153l.y6k0
    @NonNull
    /* JADX INFO: renamed from: t */
    public VText mo149556t() {
        return this.f126424n;
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: u */
    public void mo149557u() {
        if (m149525L()) {
            return;
        }
        this.f126406C.m44743p();
    }

    @Override // p153l.y6k0
    @NonNull
    /* JADX INFO: renamed from: v */
    public VImage mo149558v() {
        return this.f126425o;
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: i */
    public void mo149546i(User user) {
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: o */
    public void mo149552o(int i) {
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: p */
    public void mo149553p(User user) {
    }

    @Override // p153l.y6k0
    /* JADX INFO: renamed from: j */
    public void mo149547j(View.OnClickListener onClickListener, View.OnClickListener onClickListener2) {
    }
}
