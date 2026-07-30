package com.p000p1.mobile.putong.core.newui.main;

import android.animation.Animator;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Build;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.ColorInt;
import androidx.annotation.DrawableRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.p000p1.mobile.putong.core.newui.admob.NavigationBarAdmobHelper;
import com.p000p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p000p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p000p1.mobile.putong.core.newui.main.BottomBarManager;
import com.p000p1.mobile.putong.core.newui.main.NewMainViewModel;
import com.p000p1.mobile.putong.core.newui.main.view.ExpandedSplashLayout;
import com.p000p1.mobile.putong.core.newui.messages.ConversationsTabFrag;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.app.Frag;
import com.p1.mobile.android.ui.bubble.a;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.admob.NavigationBarAdView;
import com.p1.mobile.putong.core.data.Figure;
import com.p1.mobile.putong.core.data.PopGuide;
import com.p1.mobile.putong.core.ui.vip.likers.LikersAct;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import l.bne0;
import l.bt0;
import l.d30;
import l.d8e0;
import l.e30;
import l.e51;
import l.eqh0;
import l.g6a;
import l.j760;
import l.ma30;
import l.n3b0;
import l.o660;
import l.o6j0;
import l.p660;
import l.p8l;
import l.qib0;
import l.rza;
import l.s7m;
import l.t100;
import l.uc80;
import l.uld0;
import l.upa;
import l.v930;
import l.vwb;
import l.w0c0;
import l.w9j;
import l.wc80;
import l.x2c0;
import l.x4i;
import l.xaj0;
import l.xdl0;
import l.zvf0;
import p009l.jtk;
import p009l.mqi0;
import p009l.psl;
import p009l.ptk;
import p009l.sdt;
import p009l.va40;
import p009l.w85;
import p009l.wb3;
import v.AutoVDraweeView;
import v.VDraweeView;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText;
import v.bottombar.VBottomBar;
import v.bottombar.VBottomBarDefaultItem;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class NewMainViewModel implements s7m<C0260a>, VBottomBar.a {

    /* JADX INFO: renamed from: J */
    public static final int f3229J = t100.d(48.0f);

    /* JADX INFO: renamed from: A */
    public d30 f3230A;

    /* JADX INFO: renamed from: C */
    public String f3232C;

    /* JADX INFO: renamed from: E */
    public BottomBarManager f3234E;

    /* JADX INFO: renamed from: F */
    public ExpandedSplashLayout f3235F;

    /* JADX INFO: renamed from: I */
    public IconDotType f3238I;

    /* JADX INFO: renamed from: a */
    public DrawerLayout f3239a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f3240b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f3241c;

    /* JADX INFO: renamed from: d */
    public VFrame f3242d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f3243e;

    /* JADX INFO: renamed from: f */
    public VLinear f3244f;

    /* JADX INFO: renamed from: g */
    public VBottomBar f3245g;

    /* JADX INFO: renamed from: h */
    public NavigationBarAdView f3246h;

    /* JADX INFO: renamed from: i */
    public VImage f3247i;

    /* JADX INFO: renamed from: j */
    public VLinear f3248j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f3249k;

    /* JADX INFO: renamed from: l */
    public ImageView f3250l;

    /* JADX INFO: renamed from: m */
    public VText f3251m;

    /* JADX INFO: renamed from: n */
    public View f3252n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f3253o;

    /* JADX INFO: renamed from: p */
    public ConstraintLayout f3254p;

    /* JADX INFO: renamed from: q */
    public VImage f3255q;

    /* JADX INFO: renamed from: r */
    public VText f3256r;

    /* JADX INFO: renamed from: s */
    public VImage f3257s;

    /* JADX INFO: renamed from: t */
    public ConstraintLayout f3258t;

    /* JADX INFO: renamed from: u */
    public VImage f3259u;

    /* JADX INFO: renamed from: v */
    public VText f3260v;

    /* JADX INFO: renamed from: w */
    public VImage f3261w;

    /* JADX INFO: renamed from: x */
    public Act f3262x;

    /* JADX INFO: renamed from: y */
    public C0260a f3263y;

    /* JADX INFO: renamed from: z */
    public Animator f3264z;

    /* JADX INFO: renamed from: B */
    public int f3231B = t100.d(200.0f);

    /* JADX INFO: renamed from: D */
    public String f3233D = "number";

    /* JADX INFO: renamed from: G */
    public final w9j<BottomBarManager.DotType, String> f3236G = new w9j() { // from class: l.w930
        public final Object call(Object obj) {
            return NewMainViewModel.m4020i((BottomBarManager.DotType) obj);
        }
    };

    /* JADX INFO: renamed from: H */
    public Map<TabName, xaj0<BottomBarManager.DotType, Boolean, Integer>> f3237H = new HashMap();

    public enum IconDotType {
        diamond,
        edit_profile,
        warning
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.NewMainViewModel$a */
    public class ViewOnClickListenerC0256a implements View.OnClickListener {
        public ViewOnClickListenerC0256a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            zvf0.u("e_mode_sidebar", "p_suggest_users_home_view", new j760[]{new j760("mode_select", "love")});
            NewMainViewModel newMainViewModel = NewMainViewModel.this;
            newMainViewModel.f3239a.f(newMainViewModel.f3253o);
            NewMainViewModel.this.f3263y.m4378L9(false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.NewMainViewModel$b */
    public class ViewOnClickListenerC0257b implements View.OnClickListener {
        public ViewOnClickListenerC0257b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            zvf0.u("e_mode_sidebar", "p_suggest_users_home_view", new j760[]{new j760("mode_select", "marry")});
            NewMainViewModel newMainViewModel = NewMainViewModel.this;
            newMainViewModel.f3239a.f(newMainViewModel.f3253o);
            NewMainViewModel.this.f3263y.m4378L9(true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.NewMainViewModel$c */
    public class C0258c implements DrawerLayout.d {
        public C0258c() {
        }

        /* JADX INFO: renamed from: a */
        public void m4104a(@NonNull View view) {
            NewMainViewModel.this.m4063P0();
            CoreModule.c.e0.b4.put(Boolean.TRUE);
            zvf0.A("e_mode_sidebar", "p_suggest_users_home_view", new j760[]{vwb.Y("mode_select", CoreModule.c.e0.a8() ? "marry" : "love")});
        }

        /* JADX INFO: renamed from: b */
        public void m4105b(@NonNull View view) {
        }

        /* JADX INFO: renamed from: c */
        public void m4106c(int i) {
        }

        /* JADX INFO: renamed from: d */
        public void m4107d(@NonNull View view, float f) {
            if (f >= 0.02d) {
                NewMainViewModel.this.m4061O0();
            } else {
                p8l.a(NewMainViewModel.this.act(), va40.m23334e());
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.NewMainViewModel$d */
    public static /* synthetic */ class C0259d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f3268a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f3269b;

        static {
            int[] iArr = new int[BottomBarManager.DotType.values().length];
            f3269b = iArr;
            try {
                iArr[BottomBarManager.DotType.Num.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f3269b[BottomBarManager.DotType.Dot.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f3269b[BottomBarManager.DotType.TextDot.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[IconDotType.values().length];
            f3268a = iArr2;
            try {
                iArr2[IconDotType.diamond.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f3268a[IconDotType.edit_profile.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f3268a[IconDotType.warning.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public NewMainViewModel(Act act) {
        this.f3262x = act;
    }

    /* JADX INFO: renamed from: Q */
    private void m4017Q() {
        if (g6a.w()) {
            this.f3242d.bringChildToFront(this.f3243e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m4018Y(View view) {
        m4043F();
        xdl0.M(this.f3248j, false);
        zvf0.u("e_see_floating_bubble", "p_suggest_users_home_view", new j760[]{vwb.Y("alertType", this.f3232C), vwb.Y("alertTextType", this.f3233D)});
        if (n3b0.q()) {
            CoreModule.P().a().l1(this.f3262x, "NA,NA,seeFloat");
        } else {
            this.f3262x.startActivity(new Intent((Context) this.f3262x, (Class<?>) LikersAct.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void m4019Z() {
        xdl0.c0(this.f3240b, act().m3867T5());
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ String m4020i(BottomBarManager.DotType dotType) {
        int i = C0259d.f3269b[dotType.ordinal()];
        if (i != 1) {
            return i != 2 ? "other" : "red_dot";
        }
        return "bubble";
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ Boolean m4032x(BottomBarManager.DotType dotType, int i, boolean z, xaj0 xaj0Var) {
        if (xaj0Var == null) {
            return Boolean.TRUE;
        }
        int i2 = C0259d.f3269b[dotType.ordinal()];
        if (i2 == 1) {
            return (xaj0Var.a == dotType && ((Integer) xaj0Var.c).intValue() == i) ? Boolean.FALSE : Boolean.TRUE;
        }
        if (i2 == 2 || i2 == 3) {
            return (xaj0Var.a == dotType && ((Boolean) xaj0Var.b).booleanValue() == z) ? Boolean.FALSE : Boolean.TRUE;
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: A0 */
    public void m4035A0(int i, a.c cVar) {
        a aVar = new a(act());
        aVar.D(i > 0 ? String.format(App.e.getString(R.string.Ka), Integer.valueOf(i)) : App.e.getString(R.string.Fa)).k(new int[]{Color.parseColor("#FF3865")}).l(t100.d(7.0f)).J(13.0f).p(75).x(t100.e).y(false).j(cVar).b(4000L).q(a.Q);
        VBottomBarDefaultItem vBottomBarDefaultItemM3725n = this.f3234E.m3725n(TabName.Meet);
        if (NullChecker.a(vBottomBarDefaultItemM3725n)) {
            wc80.e().q(uc80.a(aVar).r(new WeakReference(vBottomBarDefaultItemM3725n)).n("key_intl_tribe_pop").p(3));
            zvf0.A("e_intl_tribe_guided_bubble", "p_suggest_users_home_view", new j760[]{j760.a("tribe_bubble_type", "guide")});
            CoreModule.c.e0.M6.put(Boolean.TRUE);
            CoreModule.c.e0.N6.put(Long.valueOf(mqi0.m18550o()));
        }
    }

    /* JADX INFO: renamed from: B */
    public View m4036B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ma30.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: B0 */
    public void m4037B0() {
        d.l().u(new a(act()).D("惊喜礼盒可在侧边栏查看").r("#ffffff").J(13.0f).k(new int[]{act().getResources().getColor(upa.z() ? w0c0.A : w0c0.I)}).t(true).e(true).b(5000L).H(t100.d(10.0f), t100.d(10.0f), t100.d(10.0f), t100.d(10.0f)).w(8).y(true).z(t100.d(10.0f)).q(jtk.f15296D | jtk.f15297E), this.f3234E.m3725n(TabName.Me), "surprise_box_bubble");
    }

    /* JADX INFO: renamed from: C */
    public void m4038C(boolean z) {
        NavigationBarAdmobHelper.INSTANCE.m59w(z);
        m4091n0();
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m4039C0() {
        return this.f3262x;
    }

    /* JADX INFO: renamed from: D0 */
    public void m4040D0(int i) {
        VLinear vLinear = this.f3248j;
        if (vLinear == null || this.f3247i == null) {
            return;
        }
        xdl0.U(vLinear, f3229J + i);
        xdl0.U(this.f3247i, i);
    }

    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void m4086i1(C0260a c0260a) {
        this.f3263y = c0260a;
    }

    /* JADX INFO: renamed from: E0 */
    public void m4042E0(TabName tabName, boolean z) {
        this.f3234E.m3709A(tabName, z);
        HashMap map = new HashMap();
        if (TextUtils.equals(tabName.toString(), TabName.Msg.toString())) {
            map.put("Page Name", "Message");
            w85.INSTANCE.m24000m("View Page", map);
            return;
        }
        if (TextUtils.equals(tabName.toString(), TabName.Card.toString())) {
            map.put("Page Name", "Swipe Page");
            w85.INSTANCE.m24000m("View Page", map);
            return;
        }
        if (TextUtils.equals(tabName.toString(), TabName.Me.toString())) {
            map.put("Page Name", "Me");
            w85.INSTANCE.m24000m("View Page", map);
        } else if (TextUtils.equals(tabName.toString(), TabName.Meet.toString())) {
            map.put("Page Name", "Discover");
            w85.INSTANCE.m24000m("View Page", map);
        } else if (TextUtils.equals(tabName.toString(), TabName.Live.toString())) {
            map.put("Page Name", "Livestream");
            w85.INSTANCE.m24000m("View Page", map);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m4043F() {
        if (NullChecker.a(this.f3264z)) {
            this.f3230A = null;
            if (this.f3264z.isRunning()) {
                this.f3264z.cancel();
            }
            this.f3264z = null;
        }
    }

    /* JADX INFO: renamed from: G */
    public void m4044G(@ColorInt int i) {
        this.f3245g.setBackgroundColor(i);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m4045G0(TabName tabName) {
        o660 o660VarD = p660.d();
        String strC = o660VarD == null ? "" : o660VarD.c();
        xaj0<BottomBarManager.DotType, Boolean, Integer> xaj0Var = this.f3237H.get(tabName);
        if (tabName == TabName.Msg && xaj0Var != null && ((Boolean) xaj0Var.b).booleanValue()) {
            o6j0.c("e_red_dot_messages", strC, new o6j0.a[]{o6j0.a.f("numbers_on_bubble", ((Integer) xaj0Var.c).intValue()), o6j0.a.h("red_dot_type", (String) this.f3236G.call((BottomBarManager.DotType) xaj0Var.a))});
        }
    }

    /* JADX INFO: renamed from: H */
    public void m4046H(float f) {
    }

    /* JADX INFO: renamed from: H0 */
    public final void m4047H0(TabName tabName, final BottomBarManager.DotType dotType, final boolean z, final int i) {
        e30 e30Var = new e30() { // from class: l.da30
            public final void call(Object obj) {
                this.f11687a.m4088k0(dotType, z, i, (String) obj);
            }
        };
        w9j w9jVar = new w9j() { // from class: l.ea30
            public final Object call(Object obj) {
                return NewMainViewModel.m4032x(dotType, i, z, (xaj0) obj);
            }
        };
        if (tabName == TabName.Msg && ((Boolean) w9jVar.call(this.f3237H.get(tabName))).booleanValue()) {
            this.f3237H.put(tabName, xaj0.a(dotType, Boolean.valueOf(z), Integer.valueOf(i)));
            e30Var.call("e_red_dot_messages_change");
        }
    }

    /* JADX INFO: renamed from: I */
    public void m4048I() {
        if (NullChecker.a(this.f3235F)) {
            xdl0.M(this.f3235F, false);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public void m4049I0() {
        this.f3246h.L(act());
    }

    /* JADX INFO: renamed from: J */
    public void m4050J(boolean z) {
        VBottomBar vBottomBar = this.f3245g;
        if (z) {
            Animator duration = bt0.q(vBottomBar, "translationY", new float[]{v930.f}).setDuration(ExpandedCardStyleHelper.f1185h);
            VBottomBar vBottomBar2 = this.f3245g;
            bt0.z(new Animator[]{duration, bt0.q(vBottomBar2, "alpha", new float[]{vBottomBar2.getAlpha(), 0.0f}).setDuration(ExpandedCardStyleHelper.f1185h)}).start();
        } else {
            Animator duration2 = bt0.q(vBottomBar, "translationY", new float[]{vBottomBar.getTranslationY(), 0.0f}).setDuration(ExpandedCardStyleHelper.f1185h);
            VBottomBar vBottomBar3 = this.f3245g;
            bt0.z(new Animator[]{duration2, bt0.q(vBottomBar3, "alpha", new float[]{vBottomBar3.getAlpha(), 1.0f}).setDuration(ExpandedCardStyleHelper.f1185h)}).start();
        }
    }

    /* JADX INFO: renamed from: J0 */
    public void m4051J0(boolean z) {
        this.f3234E.m3719K(z);
    }

    /* JADX INFO: renamed from: K */
    public void m4052K() {
        if (NullChecker.a(this.f3234E)) {
            this.f3234E.m3736y();
        }
    }

    /* JADX INFO: renamed from: K0 */
    public void m4053K0(Integer num) {
        xdl0.U(this.f3243e, num.intValue());
        xdl0.U(this.f3252n, num.intValue());
    }

    /* JADX INFO: renamed from: L */
    public View m4054L(TabName tabName) {
        return this.f3234E.m3725n(tabName);
    }

    /* JADX INFO: renamed from: L0 */
    public void m4055L0(String str) {
        m4057M0(str, false);
    }

    /* JADX INFO: renamed from: M */
    public void m4056M(TabName tabName, IconDotType iconDotType, boolean z) {
        IconDotType iconDotType2;
        if (z || (iconDotType2 = this.f3238I) == null || iconDotType == iconDotType2) {
            this.f3234E.m3726o(tabName);
            this.f3238I = null;
        }
    }

    /* JADX INFO: renamed from: M0 */
    public void m4057M0(String str, boolean z) {
        this.f3234E.m3720L(str, z);
    }

    /* JADX INFO: renamed from: N */
    public void m4058N() {
        this.f3262x.alwaysHideInput();
    }

    /* JADX INFO: renamed from: N0 */
    public void m4059N0(boolean z) {
        this.f3234E.m3722N(z);
    }

    /* JADX INFO: renamed from: O */
    public void m4060O() {
        VLinear vLinear = this.f3248j;
        if (vLinear == null || !xdl0.O0(vLinear)) {
            return;
        }
        xdl0.M(this.f3248j, false);
    }

    /* JADX INFO: renamed from: O0 */
    public void m4061O0() {
        act().setStatusBarColor(act().getResources().getColor(w0c0.U1));
        int systemUiVisibility = act().getWindow().getDecorView().getSystemUiVisibility();
        int i = systemUiVisibility & (-8193);
        if (Build.VERSION.SDK_INT >= 26) {
            i = systemUiVisibility & (-8209);
        }
        act().getWindow().getDecorView().setSystemUiVisibility(i);
        if (NullChecker.a(act()) && (act() instanceof NewMainAct)) {
            act().m3877Z5().m4044G(act().getResources().getColor(w0c0.N));
            act().m3877Z5().m4046H(1.0f);
            act().setNavigationBarColor(act().color(w0c0.b2));
        }
    }

    /* JADX INFO: renamed from: P */
    public void m4062P() {
        ptk.m20688h().m20690g("SURPRISE_BOX_BUBBLE");
    }

    /* JADX INFO: renamed from: P0 */
    public void m4063P0() {
        this.f3256r.setTypeface(eqh0.c(3), 1);
        this.f3260v.setTypeface(eqh0.c(3), 1);
        boolean zEquals = TextUtils.equals((CharSequence) CoreModule.c.e0.Z3.get(), "marryMode");
        VImage vImage = this.f3257s;
        if (zEquals) {
            vImage.setImageResource(x2c0.pq);
            this.f3261w.setImageResource(x2c0.oq);
        } else {
            vImage.setImageResource(x2c0.oq);
            this.f3261w.setImageResource(x2c0.pq);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m4064R() {
        this.f3235F = new ExpandedSplashLayout(act());
        ((ViewGroup) act().getWindow().getDecorView()).addView(this.f3235F, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX INFO: renamed from: S */
    public void m4065S() {
        xdl0.E0(this.f3254p, new ViewOnClickListenerC0256a());
        xdl0.E0(this.f3258t, new ViewOnClickListenerC0257b());
        this.f3239a.a(new C0258c());
    }

    /* JADX INFO: renamed from: T */
    public View m4066T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflateView = inflateView(layoutInflater, viewGroup);
        this.f3234E = new BottomBarManager(this.f3262x, this.f3245g);
        viewInflateView.setBackgroundResource(w0c0.z1);
        this.f3245g.setBackgroundResource(w0c0.N);
        this.f3245g.setTabClickListener(this);
        if (this.f3234E.m3729r()) {
            this.f3248j.setBackground(act().drawable(x2c0.Bi));
        }
        xdl0.C0(this.f3245g, v930.f);
        boolean zN3 = upa.N3();
        FrameLayout frameLayout = this.f3243e;
        if (zN3) {
            xdl0.U(frameLayout, NavigationBarAdmobHelper.INSTANCE.m47k());
        } else {
            xdl0.U(frameLayout, v930.f + NavigationBarAdmobHelper.INSTANCE.m47k());
        }
        m4040D0(NavigationBarAdmobHelper.INSTANCE.m47k());
        this.f3248j.setOnClickListener(new View.OnClickListener() { // from class: l.fa30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f12884a.m4018Y(view);
            }
        });
        if (bne0.j()) {
            final androidx.appcompat.app.a aVarCreate = new androidx.appcompat.app.a.a(act()).setView(new View(act())).setCancelable(true).create();
            aVarCreate.setCanceledOnTouchOutside(true);
            Window window = aVarCreate.getWindow();
            if (NullChecker.a(window)) {
                window.setLayout(1, 1);
            }
            aVarCreate.show();
            act().post(new Runnable() { // from class: l.ga30
                @Override // java.lang.Runnable
                public final void run() {
                    aVarCreate.dismiss();
                }
            });
        }
        if (upa.e2()) {
            m4065S();
        }
        m4017Q();
        if (act().m4004i4()) {
            m4064R();
            e51.F(act(), new Runnable() { // from class: l.ha30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13917a.m4019Z();
                }
            });
        }
        return viewInflateView;
    }

    /* JADX INFO: renamed from: U */
    public boolean m4067U() {
        return NullChecker.a(this.f3245g) && xdl0.O0(this.f3245g) && Math.abs(this.f3245g.getTranslationY()) < 1.0f;
    }

    /* JADX INFO: renamed from: V */
    public boolean m4068V() {
        return NullChecker.a(this.f3264z) && this.f3264z.isRunning();
    }

    /* JADX INFO: renamed from: W */
    public boolean m4069W(TabName tabName, BottomBarManager.DotType dotType) {
        return this.f3234E.m3730s(tabName, dotType);
    }

    /* JADX INFO: renamed from: X */
    public boolean m4070X(TabName tabName) {
        return this.f3234E.m3731t(tabName);
    }

    /* JADX INFO: renamed from: a */
    public void m4071a(VBottomBar.b bVar) {
        TabName tabNameTransform = TabName.transform(bVar.getTabName());
        if (tabNameTransform != null) {
            m4045G0(tabNameTransform);
        }
        this.f3263y.m4464g9();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m4072a0(String str) {
        zvf0.A("e_see_floating_bubble", "p_suggest_users_home_view", new j760[]{vwb.Y("alertType", str), vwb.Y("alertTextType", this.f3233D), vwb.Y("tooltips_trigger_mode", "passive"), vwb.Y("tooltips_type", "bubble"), vwb.Y("tooltips_type_ui", "bubble_basic_with_icon"), vwb.Y("tooltips_trigger_module", "message_tab"), vwb.Y("tooltips_trigger_page", "swipe_page"), vwb.Y("tooltips_trigger_reason", "guide")});
    }

    /* JADX INFO: renamed from: b */
    public boolean m4073b(VBottomBar.b bVar) {
        return !TextUtils.equals(TabName.Msg.toString(), bVar.getTabName());
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m4074b0() {
        xdl0.M0(this.f3247i, false);
        xdl0.M0(this.f3248j, false);
        if (NullChecker.a(this.f3230A)) {
            this.f3230A.call();
        }
    }

    /* JADX INFO: renamed from: c */
    public void m4075c(VBottomBar.b bVar) {
        wb3 wb3VarM9035Ys;
        TabName tabNameTransform = TabName.transform(bVar.getTabName());
        if (tabNameTransform == null) {
            return;
        }
        m4045G0(tabNameTransform);
        if (!this.f3263y.m25147b1().equals(tabNameTransform)) {
            this.f3262x.hideDeepLinkFloatButton(true);
        }
        if (TabName.Post.equals(tabNameTransform)) {
            if (CoreModule.N().isPostingMoment()) {
                return;
            }
            this.f3262x.pickMediasWithInstaPicker();
            return;
        }
        boolean zEquals = TabName.Card.equals(tabNameTransform);
        View view = this.f3252n;
        if (zEquals) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
        }
        if (TabName.Me == tabNameTransform) {
            uld0.e().s();
            uld0.e().o();
        }
        if (tabNameTransform == TabName.Live) {
            CoreModule.Q().m9028Sf();
            if (this.f3263y.m4360H7() && (wb3VarM9035Ys = CoreModule.Q().m9035Ys()) != null) {
                sdt.m22107b((String) this.f3262x.m3875Y5().a, wb3VarM9035Ys.m24043a(), wb3VarM9035Ys.f21984b, wb3VarM9035Ys.f21985c, wb3VarM9035Ys.f21986d);
            }
        }
        this.f3263y.mo4436a1(tabNameTransform, true);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m4076c0(int[] iArr) {
        int iY0;
        xdl0.g gVarJ0 = xdl0.j0(this.f3234E.m3725n(TabName.Msg).getIconView(), this.f3240b);
        xdl0.g gVarJ1 = xdl0.j0(this.f3248j, this.f3240b);
        int iD = t100.d(40.0f);
        if (this.f3234E.m3729r()) {
            iD = (gVarJ1.c / 2) - t100.d(6.0f);
        }
        int iD2 = ((gVarJ0.a + (gVarJ0.c / 2)) - gVarJ1.a) - iD;
        if (gVarJ1.c + iD2 > xdl0.y0()) {
            iY0 = xdl0.y0() - iD2;
            iD2 = ((gVarJ0.a + (gVarJ0.c / 2)) - gVarJ1.a) - ((iY0 / 2) - t100.d(6.0f));
        } else {
            iY0 = 0;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f3248j.getLayoutParams();
        layoutParams.leftMargin += iD2;
        this.f3248j.setLayoutParams(layoutParams);
        xdl0.m0(this.f3248j, iD2, 0);
        if (iY0 != 0) {
            this.f3251m.setWidth(iY0);
        }
    }

    /* JADX INFO: renamed from: d */
    public void m4077d(VBottomBar.b bVar) {
        TabName tabNameTransform = TabName.transform(bVar.getTabName());
        if (tabNameTransform != null) {
            m4045G0(tabNameTransform);
        }
        this.f3263y.m4485l9();
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m4078d0() {
        xdl0.Q0(this.f3248j, new e30() { // from class: l.ca30
            public final void call(Object obj) {
                this.f10481a.m4076c0((int[]) obj);
            }
        });
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: e */
    public boolean m4079e(VBottomBar.b bVar) {
        return upa.N3() && ExpandedCardStyleHelper.m2064o().m2077s();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m4080e0(int[] iArr) {
        xdl0.g gVarJ0 = xdl0.j0(this.f3234E.m3725n(TabName.Msg).getIconView(), this.f3240b);
        xdl0.g gVarJ1 = xdl0.j0(this.f3247i, this.f3240b);
        int i = (gVarJ0.a - gVarJ1.a) + ((gVarJ0.c - gVarJ1.c) / 2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f3247i.getLayoutParams();
        layoutParams.leftMargin += i;
        this.f3247i.setLayoutParams(layoutParams);
        xdl0.m0(this.f3247i, i, 0);
    }

    /* JADX INFO: renamed from: f */
    public boolean m4081f(VBottomBar.b bVar) {
        return CoreModule.Q().m9020M7() && !TabName.Live.name().equals(bVar.getTabName());
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m4082f0() {
        xdl0.Q0(this.f3247i, new e30() { // from class: l.ba30
            public final void call(Object obj) {
                this.f9976a.m4080e0((int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m4083g0() {
        xdl0.M0(this.f3248j, true);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m4084h0() {
        xdl0.M0(this.f3248j, true);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m4085i0() {
        this.f3248j.setScaleX(0.0f);
        this.f3248j.setScaleY(0.0f);
        xdl0.M0(this.f3248j, true);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m4036B(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m4087j0() {
        xdl0.M0(this.f3247i, true);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m4088k0(BottomBarManager.DotType dotType, boolean z, int i, String str) {
        o660 o660VarD = p660.d();
        o6j0.n(str, o660VarD == null ? "" : o660VarD.c(), new o6j0.a[]{o6j0.a.h("red_dot_type", (String) this.f3236G.call(dotType)), o6j0.a.f("red_dot_status", z ? 1 : 0), o6j0.a.f("numbers_on_bubble", i)});
    }

    /* JADX INFO: renamed from: l0 */
    public void m4089l0() {
        if (NullChecker.a(this.f3263y)) {
            m4091n0();
            Frag fragM4506r6 = this.f3263y.m4506r6(TabName.Card);
            if (fragM4506r6 instanceof psl) {
                fragM4506r6 = ((psl) fragM4506r6).mo2542Y();
            }
            if (fragM4506r6 instanceof NewNewHomeFrag) {
                ((NewNewHomeFrag) fragM4506r6).f456C.m1343w5();
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m4090m0(TabName tabName) {
        if (upa.z()) {
            this.f3240b.setBackgroundColor(-1);
            xdl0.M(this.f3241c, true);
            if (tabName == TabName.Card) {
                this.f3241c.setImageResource(x2c0.F);
                return;
            }
            if (tabName == TabName.FEATURED) {
                this.f3241c.setImageResource(x2c0.G);
                return;
            }
            if (tabName == TabName.Msg) {
                this.f3241c.setImageResource(x2c0.K);
                return;
            }
            if (tabName == TabName.Moment) {
                this.f3241c.setImageResource(x2c0.J);
            } else if (tabName == TabName.Me) {
                this.f3241c.setImageResource(x2c0.I);
            } else if (tabName == TabName.Live) {
                this.f3241c.setImageResource(x2c0.H);
            }
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m4091n0() {
        if (this.f3246h == null) {
            return;
        }
        boolean zM60x = NavigationBarAdmobHelper.INSTANCE.m60x();
        NavigationBarAdView navigationBarAdView = this.f3246h;
        if (zM60x) {
            navigationBarAdView.E();
        } else {
            navigationBarAdView.G();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m4092o0(j760<TabName, Boolean> j760Var) {
        this.f3234E.m3710B(j760Var);
    }

    /* JADX INFO: renamed from: p0 */
    public void m4093p0(TabName tabName, boolean z) {
        m4047H0(tabName, BottomBarManager.DotType.Dot, z, 0);
        this.f3234E.m3711C(tabName, z);
    }

    /* JADX INFO: renamed from: q0 */
    public void m4094q0(boolean z) {
        this.f3234E.m3712D(z);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0060  */
    /* JADX WARN: Code duplicated, block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: r0 */
    public void m4095r0(TabName tabName, IconDotType iconDotType) {
        int i;
        View view = this.f3234E.m3725n(tabName).e;
        xdl0.V(view, t100.d(17.0f));
        int i2 = C0259d.f3268a[iconDotType.ordinal()];
        int i3 = 0;
        if (i2 == 1) {
            i = x2c0.Oh;
            xdl0.D0(t100.d(29.0f), new View[]{view});
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    i = x2c0.q;
                    xdl0.D0(t100.d(20.0f), new View[]{view});
                }
                if (i3 > 0) {
                    this.f3234E.m3713E(tabName, i3);
                    this.f3238I = iconDotType;
                }
            }
            i = x2c0.M6;
            xdl0.D0(t100.d(42.0f), new View[]{view});
            xdl0.V(view, t100.d(12.0f));
        }
        i3 = i;
        if (i3 > 0) {
            this.f3234E.m3713E(tabName, i3);
            this.f3238I = iconDotType;
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m4096s0(boolean z) {
        xdl0.M(this.f3245g, z);
        NavigationBarAdView navigationBarAdView = this.f3246h;
        if (z) {
            navigationBarAdView.G();
        } else {
            navigationBarAdView.E();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m4097t0(boolean z, String str) {
        m4096s0(z);
        if (ConversationsTabFrag.f3969H0.equals(str)) {
            if (upa.N3() && TabName.Card.equals(this.f3263y.m25147b1())) {
                z = false;
            }
            xdl0.M(this.f3252n, z);
            View view = this.f3252n;
            int i = v930.f;
            NavigationBarAdmobHelper navigationBarAdmobHelper = NavigationBarAdmobHelper.INSTANCE;
            xdl0.U(view, i + navigationBarAdmobHelper.m47k());
            xdl0.U(this.f3243e, (z ? v930.f : 0) + navigationBarAdmobHelper.m47k());
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m4098u0(boolean z) {
        xdl0.M(this.f3262x.toolbar(), z);
    }

    /* JADX INFO: renamed from: v0 */
    public void m4099v0(TabName tabName, int i) {
        m4100w0(tabName, i, -1);
    }

    /* JADX INFO: renamed from: w0 */
    public void m4100w0(TabName tabName, int i, @DrawableRes int i2) {
        m4047H0(tabName, BottomBarManager.DotType.Num, i > 0, i);
        this.f3234E.m3716H(tabName, i, i2);
    }

    /* JADX INFO: renamed from: x0 */
    public void m4101x0(TabName tabName, @DrawableRes int i) {
        this.f3234E.m3717I(tabName, i);
    }

    /* JADX INFO: renamed from: y0 */
    public void m4102y0(CharSequence charSequence, String str, Figure figure, final String str2, double d, d30 d30Var) {
        this.f3232C = str2;
        this.f3230A = d30Var;
        m4040D0(NavigationBarAdmobHelper.INSTANCE.m47k());
        boolean zA = d8e0.a(CoreModule.c.e0.p9());
        if (zA) {
            if (NullChecker.a(figure) && TEnum.equals(figure.type, "distance") && figure.total > 0) {
                this.f3251m.setText(charSequence);
                this.f3233D = figure.type.toString();
            } else if (!NullChecker.a(figure) || TEnum.equals(figure.type, "number") || !NullChecker.a(figure.message) || TextUtils.isEmpty(figure.message.template)) {
                this.f3251m.setText(rza.O0(charSequence.toString(), Color.parseColor("#ff3200"), Typeface.create("sans-serif", 3)));
                this.f3233D = "number";
            } else {
                this.f3251m.setText(rza.C0(figure));
                this.f3233D = figure.type.toString();
            }
            xdl0.M0(this.f3250l, mqi0.m18542K(d));
        } else {
            this.f3251m.setText(charSequence);
            this.f3233D = "number";
        }
        if (!TextUtils.isEmpty(str)) {
            if (zA && n3b0.q()) {
                qib0.G.O(this.f3249k, str, 2, 100);
            } else {
                qib0.G.L0(this.f3249k, str);
            }
        }
        if (NullChecker.a(this.f3264z)) {
            if (this.f3264z.isRunning()) {
                return;
            }
            xdl0.M0(this.f3247i, false);
            xdl0.M0(this.f3248j, false);
            this.f3264z.setStartDelay(0L);
            this.f3264z.start();
            return;
        }
        e51.G(new Runnable() { // from class: l.ia30
            @Override // java.lang.Runnable
            public final void run() {
                this.f14451a.m4078d0();
            }
        });
        e51.G(new Runnable() { // from class: l.ja30
            @Override // java.lang.Runnable
            public final void run() {
                this.f15026a.m4082f0();
            }
        });
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        Animator animatorS = bt0.s(new Animator[]{bt0.p(this.f3247i, "alpha", 0L, 200L, linearInterpolator, new float[]{0.0f, 1.0f}), bt0.j(1100), bt0.p(this.f3247i, "alpha", 0L, 200L, linearInterpolator, new float[]{1.0f, 0.0f})});
        Animator animatorS2 = bt0.s(new Animator[]{bt0.p(this.f3247i, "translationY", 0L, 500L, linearInterpolator, new float[]{0.0f, -this.f3231B}), bt0.j(200), bt0.p(this.f3247i, "translationY", 0L, 800L, linearInterpolator, new float[]{-this.f3231B, 0.0f})});
        Animator animatorS3 = bt0.s(new Animator[]{bt0.l(this.f3247i, bt0.i, 0L, 500L, linearInterpolator, new float[]{1.0f, 2.4f}), bt0.j(200), bt0.l(this.f3247i, bt0.i, 0L, 800L, linearInterpolator, new float[]{2.4f, 1.0f})});
        Animator animatorP = bt0.p(this.f3247i, "rotation", 0L, 1500L, linearInterpolator, new float[]{0.0f, 720.0f});
        if (!zA) {
            this.f3248j.setPivotX(t100.d(20.0f));
            this.f3248j.setPivotY(t100.d(40.0f));
        }
        Animator animatorP2 = bt0.p(this.f3248j, "alpha", 1500L, 400L, linearInterpolator, new float[]{0.0f, 1.0f});
        VLinear vLinear = this.f3248j;
        Animator animatorP3 = zA ? bt0.p(vLinear, "translationY", 0L, 4600L, linearInterpolator, new float[]{1.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 0.0f}) : bt0.p(vLinear, "translationY", 0L, 2000L, linearInterpolator, new float[]{1.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 0.0f});
        Animator animatorP4 = bt0.p(this.f3248j, "alpha", 0L, 500L, linearInterpolator, new float[]{1.0f, 0.0f});
        Animator animatorL = bt0.l(this.f3248j, bt0.i, 1500L, 400L, linearInterpolator, new float[]{0.0f, 1.0f});
        Animator animatorP5 = bt0.p(this.f3248j, "translationY", 1500L, 400L, linearInterpolator, new float[]{t100.d(24.0f), 0.0f});
        Animator animatorS4 = bt0.s(new Animator[]{animatorP2, animatorP3, animatorP4});
        this.f3264z = bt0.z(new Animator[]{animatorS, animatorS2, animatorS3, animatorP, bt0.z(new Animator[]{animatorS4, animatorL, animatorP5})});
        bt0.v(animatorP5, new Runnable() { // from class: l.ka30
            @Override // java.lang.Runnable
            public final void run() {
                this.f15564a.m4083g0();
            }
        });
        bt0.f(animatorS4, new Runnable() { // from class: l.la30
            @Override // java.lang.Runnable
            public final void run() {
                this.f16032a.m4084h0();
            }
        });
        bt0.f(animatorP, new Runnable() { // from class: l.x930
            @Override // java.lang.Runnable
            public final void run() {
                this.f22474a.m4085i0();
            }
        });
        bt0.v(animatorP, new Runnable() { // from class: l.y930
            @Override // java.lang.Runnable
            public final void run() {
                this.f22935a.m4087j0();
            }
        });
        bt0.w(this.f3264z, new Runnable() { // from class: l.z930
            @Override // java.lang.Runnable
            public final void run() {
                this.f23519a.m4072a0(str2);
            }
        }, new Runnable() { // from class: l.aa30
            @Override // java.lang.Runnable
            public final void run() {
                this.f9343a.m4074b0();
            }
        });
        if ("old".equals(str2)) {
            this.f3264z.setStartDelay(1000L);
        }
        this.f3264z.start();
    }

    /* JADX INFO: renamed from: z0 */
    public void m4103z0(PopGuide popGuide) {
        x4i.f(act(), this.f3240b, this.f3234E.m3725n(TabName.Moment).getIconView(), popGuide);
    }
}
