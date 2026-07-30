package com.p046p1.mobile.putong.core.newui.main;

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
import androidx.appcompat.app.DialogInterfaceC0074a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.p048ui.bubble.C4345a;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.admob.NavigationBarAdView;
import com.p046p1.mobile.putong.core.data.Figure;
import com.p046p1.mobile.putong.core.data.PopGuide;
import com.p046p1.mobile.putong.core.data.SeeSwitchName;
import com.p046p1.mobile.putong.core.data.UserHomeMode;
import com.p046p1.mobile.putong.core.newui.admob.NavigationBarAdmobHelper;
import com.p046p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p046p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p046p1.mobile.putong.core.newui.main.BottomBarManager;
import com.p046p1.mobile.putong.core.newui.main.NewMainViewModel;
import com.p046p1.mobile.putong.core.newui.main.view.ExpandedSplashLayout;
import com.p046p1.mobile.putong.core.newui.messages.ConversationsTabFrag;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAct;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p147v.AutoVDraweeView;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p147v.bottombar.VBottomBar;
import p147v.bottombar.VBottomBarDefaultItem;
import p149l.bne0;
import p149l.bt0;
import p149l.d30;
import p149l.d8e0;
import p149l.e30;
import p149l.e51;
import p149l.eqh0;
import p149l.g6a;
import p149l.j760;
import p149l.jtk;
import p149l.ma30;
import p149l.mqi0;
import p149l.n3b0;
import p149l.o660;
import p149l.o6j0;
import p149l.p660;
import p149l.p8l;
import p149l.pcl0;
import p149l.psl;
import p149l.ptk;
import p149l.qib0;
import p149l.rza;
import p149l.s7m;
import p149l.sdt;
import p149l.t100;
import p149l.uc80;
import p149l.uld0;
import p149l.upa;
import p149l.v930;
import p149l.va40;
import p149l.vwb;
import p149l.w0c0;
import p149l.w85;
import p149l.w9j;
import p149l.wb3;
import p149l.wc80;
import p149l.x2c0;
import p149l.x4i;
import p149l.xaj0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class NewMainViewModel implements s7m<C8096a>, VBottomBar.InterfaceC22587a {

    /* JADX INFO: renamed from: J */
    public static final int f24451J = t100.m186890d(48.0f);

    /* JADX INFO: renamed from: A */
    public d30 f24452A;

    /* JADX INFO: renamed from: C */
    public String f24454C;

    /* JADX INFO: renamed from: E */
    public BottomBarManager f24456E;

    /* JADX INFO: renamed from: F */
    public ExpandedSplashLayout f24457F;

    /* JADX INFO: renamed from: I */
    public IconDotType f24460I;

    /* JADX INFO: renamed from: a */
    public DrawerLayout f24461a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f24462b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f24463c;

    /* JADX INFO: renamed from: d */
    public VFrame f24464d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f24465e;

    /* JADX INFO: renamed from: f */
    public VLinear f24466f;

    /* JADX INFO: renamed from: g */
    public VBottomBar f24467g;

    /* JADX INFO: renamed from: h */
    public NavigationBarAdView f24468h;

    /* JADX INFO: renamed from: i */
    public VImage f24469i;

    /* JADX INFO: renamed from: j */
    public VLinear f24470j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f24471k;

    /* JADX INFO: renamed from: l */
    public ImageView f24472l;

    /* JADX INFO: renamed from: m */
    public VText f24473m;

    /* JADX INFO: renamed from: n */
    public View f24474n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f24475o;

    /* JADX INFO: renamed from: p */
    public ConstraintLayout f24476p;

    /* JADX INFO: renamed from: q */
    public VImage f24477q;

    /* JADX INFO: renamed from: r */
    public VText f24478r;

    /* JADX INFO: renamed from: s */
    public VImage f24479s;

    /* JADX INFO: renamed from: t */
    public ConstraintLayout f24480t;

    /* JADX INFO: renamed from: u */
    public VImage f24481u;

    /* JADX INFO: renamed from: v */
    public VText f24482v;

    /* JADX INFO: renamed from: w */
    public VImage f24483w;

    /* JADX INFO: renamed from: x */
    public Act f24484x;

    /* JADX INFO: renamed from: y */
    public C8096a f24485y;

    /* JADX INFO: renamed from: z */
    public Animator f24486z;

    /* JADX INFO: renamed from: B */
    public int f24453B = t100.m186890d(200.0f);

    /* JADX INFO: renamed from: D */
    public String f24455D = "number";

    /* JADX INFO: renamed from: G */
    public final w9j<BottomBarManager.DotType, String> f24458G = new w9j() { // from class: l.w930
        @Override // p149l.w9j
        public final Object call(Object obj) {
            return NewMainViewModel.m39943i((BottomBarManager.DotType) obj);
        }
    };

    /* JADX INFO: renamed from: H */
    public Map<TabName, xaj0<BottomBarManager.DotType, Boolean, Integer>> f24459H = new HashMap();

    public enum IconDotType {
        diamond,
        edit_profile,
        warning
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.NewMainViewModel$a */
    public class ViewOnClickListenerC8092a implements View.OnClickListener {
        public ViewOnClickListenerC8092a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            zvf0.m220399u("e_mode_sidebar", "p_suggest_users_home_view", new j760("mode_select", "love"));
            NewMainViewModel newMainViewModel = NewMainViewModel.this;
            newMainViewModel.f24461a.m2417f(newMainViewModel.f24475o);
            NewMainViewModel.this.f24485y.m40295L9(false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.NewMainViewModel$b */
    public class ViewOnClickListenerC8093b implements View.OnClickListener {
        public ViewOnClickListenerC8093b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            zvf0.m220399u("e_mode_sidebar", "p_suggest_users_home_view", new j760("mode_select", "marry"));
            NewMainViewModel newMainViewModel = NewMainViewModel.this;
            newMainViewModel.f24461a.m2417f(newMainViewModel.f24475o);
            NewMainViewModel.this.f24485y.m40295L9(true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.NewMainViewModel$c */
    public class C8094c implements DrawerLayout.InterfaceC0362d {
        public C8094c() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0362d
        /* JADX INFO: renamed from: a */
        public void mo2441a(@NonNull View view) {
            NewMainViewModel.this.m39985P0();
            CoreModule.f17545c.f19639e0.f149337b4.put(Boolean.TRUE);
            zvf0.m220368A("e_mode_sidebar", "p_suggest_users_home_view", vwb.m200311Y("mode_select", CoreModule.f17545c.f19639e0.m169468a8() ? "marry" : "love"));
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0362d
        /* JADX INFO: renamed from: b */
        public void mo2442b(@NonNull View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0362d
        /* JADX INFO: renamed from: c */
        public void mo2443c(int i) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0362d
        /* JADX INFO: renamed from: d */
        public void mo2444d(@NonNull View view, float f) {
            if (f >= 0.02d) {
                NewMainViewModel.this.m39983O0();
            } else {
                p8l.m167802a(NewMainViewModel.this.getAct(), va40.m197623e());
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.NewMainViewModel$d */
    public static /* synthetic */ class C8095d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f24490a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f24491b;

        static {
            int[] iArr = new int[BottomBarManager.DotType.values().length];
            f24491b = iArr;
            try {
                iArr[BottomBarManager.DotType.Num.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f24491b[BottomBarManager.DotType.Dot.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f24491b[BottomBarManager.DotType.TextDot.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[IconDotType.values().length];
            f24490a = iArr2;
            try {
                iArr2[IconDotType.diamond.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f24490a[IconDotType.edit_profile.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f24490a[IconDotType.warning.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public NewMainViewModel(Act act) {
        this.f24484x = act;
    }

    /* JADX INFO: renamed from: Q */
    private void m39940Q() {
        if (g6a.m124574w()) {
            this.f24464d.bringChildToFront(this.f24465e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m39941Y(View view) {
        m39965F();
        xdl0.m208344M(this.f24470j, false);
        zvf0.m220399u("e_see_floating_bubble", "p_suggest_users_home_view", vwb.m200311Y("alertType", this.f24454C), vwb.m200311Y("alertTextType", this.f24455D));
        if (n3b0.m157742q()) {
            CoreModule.m29935P().m94651a().mo33534l1(this.f24484x, "NA,NA,seeFloat");
        } else {
            this.f24484x.startActivity(new Intent(this.f24484x, (Class<?>) LikersAct.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void m39942Z() {
        xdl0.m208368c0(this.f24462b, ((NewMainAct) getAct()).m39791T5());
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ String m39943i(BottomBarManager.DotType dotType) {
        int i = C8095d.f24491b[dotType.ordinal()];
        if (i != 1) {
            return i != 2 ? "other" : "red_dot";
        }
        return "bubble";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public static /* synthetic */ Boolean m39955x(BottomBarManager.DotType dotType, int i, boolean z, xaj0 xaj0Var) {
        if (xaj0Var == null) {
            return Boolean.TRUE;
        }
        int i2 = C8095d.f24491b[dotType.ordinal()];
        if (i2 == 1) {
            return (xaj0Var.f191751a == dotType && ((Integer) xaj0Var.f191753c).intValue() == i) ? Boolean.FALSE : Boolean.TRUE;
        }
        if (i2 == 2 || i2 == 3) {
            return (xaj0Var.f191751a == dotType && ((Boolean) xaj0Var.f191752b).booleanValue() == z) ? Boolean.FALSE : Boolean.TRUE;
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: A0 */
    public void m39958A0(int i, C4345a.c cVar) {
        C4345a c4345a = new C4345a(getAct());
        c4345a.m20849D(i > 0 ? String.format(App.f15369e.getString(R$string.f17877Ka), Integer.valueOf(i)) : App.f15369e.getString(R$string.f17727Fa)).m20870k(Color.parseColor("#FF3865")).m20871l(t100.m186890d(7.0f)).m20855J(13.0f).m20874p(75).m20882x(t100.f167256e).m20883y(false).m20869j(cVar).m20861b(4000L).m20875q(C4345a.f15683Q);
        VBottomBarDefaultItem vBottomBarDefaultItemM39649n = this.f24456E.m39649n(TabName.Meet);
        if (NullChecker.m81303a(vBottomBarDefaultItemM39649n)) {
            wc80.m202636e().m202649q(uc80.m192995a(c4345a).m193007r(new WeakReference<>(vBottomBarDefaultItemM39649n)).m193003n("key_intl_tribe_pop").m193005p(3));
            zvf0.m220368A("e_intl_tribe_guided_bubble", "p_suggest_users_home_view", j760.m140076a("tribe_bubble_type", "guide"));
            CoreModule.f17545c.f19639e0.f149223M6.put(Boolean.TRUE);
            CoreModule.f17545c.f19639e0.f149230N6.put(Long.valueOf(mqi0.m155944o()));
        }
    }

    /* JADX INFO: renamed from: B */
    public View m39959B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ma30.m153636b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: B0 */
    public void m39960B0() {
        C4348d.m20896l().m20909u(new C4345a(getAct()).m20849D("惊喜礼盒可在侧边栏查看").m20876r("#ffffff").m20855J(13.0f).m20870k(getAct().getResources().getColor(upa.m194847z() ? w0c0.f183749A : w0c0.f183773I)).m20878t(true).m20864e(true).m20861b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m20853H(t100.m186890d(10.0f), t100.m186890d(10.0f), t100.m186890d(10.0f), t100.m186890d(10.0f)).m20881w(8).m20883y(true).m20884z(t100.m186890d(10.0f)).m20875q(jtk.f119617D | jtk.f119618E), this.f24456E.m39649n(TabName.Me), "surprise_box_bubble");
    }

    /* JADX INFO: renamed from: C */
    public void m39961C(boolean z) {
        NavigationBarAdmobHelper.INSTANCE.m36162w(z);
        m40012n0();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f24484x;
    }

    /* JADX INFO: renamed from: D0 */
    public void m39962D0(int i) {
        VLinear vLinear = this.f24470j;
        if (vLinear == null || this.f24469i == null) {
            return;
        }
        xdl0.m208357U(vLinear, f24451J + i);
        xdl0.m208357U(this.f24469i, i);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(C8096a c8096a) {
        this.f24485y = c8096a;
    }

    /* JADX INFO: renamed from: E0 */
    public void m39964E0(TabName tabName, boolean z) {
        this.f24456E.m39633A(tabName, z);
        HashMap map = new HashMap();
        if (TextUtils.equals(tabName.toString(), TabName.Msg.toString())) {
            map.put("Page Name", "Message");
            w85.INSTANCE.m202145m("View Page", map);
            return;
        }
        if (TextUtils.equals(tabName.toString(), TabName.Card.toString())) {
            map.put("Page Name", "Swipe Page");
            w85.INSTANCE.m202145m("View Page", map);
            return;
        }
        if (TextUtils.equals(tabName.toString(), TabName.Me.toString())) {
            map.put("Page Name", "Me");
            w85.INSTANCE.m202145m("View Page", map);
        } else if (TextUtils.equals(tabName.toString(), TabName.Meet.toString())) {
            map.put("Page Name", "Discover");
            w85.INSTANCE.m202145m("View Page", map);
        } else if (TextUtils.equals(tabName.toString(), TabName.Live.toString())) {
            map.put("Page Name", "Livestream");
            w85.INSTANCE.m202145m("View Page", map);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m39965F() {
        if (NullChecker.m81303a(this.f24486z)) {
            this.f24452A = null;
            if (this.f24486z.isRunning()) {
                this.f24486z.cancel();
            }
            this.f24486z = null;
        }
    }

    /* JADX INFO: renamed from: G */
    public void m39966G(@ColorInt int i) {
        this.f24467g.setBackgroundColor(i);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m39967G0(TabName tabName) {
        o660 o660VarM167645d = p660.m167645d();
        String strM162820c = o660VarM167645d == null ? "" : o660VarM167645d.m162820c();
        xaj0<BottomBarManager.DotType, Boolean, Integer> xaj0Var = this.f24459H.get(tabName);
        if (tabName == TabName.Msg && xaj0Var != null && xaj0Var.f191752b.booleanValue()) {
            o6j0.m162859c("e_red_dot_messages", strM162820c, o6j0.C18854a.m162876f("numbers_on_bubble", xaj0Var.f191753c.intValue()), o6j0.C18854a.m162878h("red_dot_type", this.f24458G.call(xaj0Var.f191751a)));
        }
    }

    /* JADX INFO: renamed from: H */
    public void m39968H(float f) {
    }

    /* JADX INFO: renamed from: H0 */
    public final void m39969H0(TabName tabName, final BottomBarManager.DotType dotType, final boolean z, final int i) {
        e30 e30Var = new e30() { // from class: l.da30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f85184a.m40009k0(dotType, z, i, (String) obj);
            }
        };
        w9j w9jVar = new w9j() { // from class: l.ea30
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return NewMainViewModel.m39955x(dotType, i, z, (xaj0) obj);
            }
        };
        if (tabName == TabName.Msg && ((Boolean) w9jVar.call(this.f24459H.get(tabName))).booleanValue()) {
            this.f24459H.put(tabName, xaj0.m207578a(dotType, Boolean.valueOf(z), Integer.valueOf(i)));
            e30Var.call("e_red_dot_messages_change");
        }
    }

    /* JADX INFO: renamed from: I */
    public void m39970I() {
        if (NullChecker.m81303a(this.f24457F)) {
            xdl0.m208344M(this.f24457F, false);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public void m39971I0() {
        this.f24468h.m30003L(getAct());
    }

    /* JADX INFO: renamed from: J */
    public void m39972J(boolean z) {
        VBottomBar vBottomBar = this.f24467g;
        if (z) {
            Animator duration = bt0.m103744q(vBottomBar, "translationY", v930.f180607f).setDuration(ExpandedCardStyleHelper.f22407h);
            VBottomBar vBottomBar2 = this.f24467g;
            bt0.m103753z(duration, bt0.m103744q(vBottomBar2, "alpha", vBottomBar2.getAlpha(), 0.0f).setDuration(ExpandedCardStyleHelper.f22407h)).start();
        } else {
            Animator duration2 = bt0.m103744q(vBottomBar, "translationY", vBottomBar.getTranslationY(), 0.0f).setDuration(ExpandedCardStyleHelper.f22407h);
            VBottomBar vBottomBar3 = this.f24467g;
            bt0.m103753z(duration2, bt0.m103744q(vBottomBar3, "alpha", vBottomBar3.getAlpha(), 1.0f).setDuration(ExpandedCardStyleHelper.f22407h)).start();
        }
    }

    /* JADX INFO: renamed from: J0 */
    public void m39973J0(boolean z) {
        this.f24456E.m39643K(z);
    }

    /* JADX INFO: renamed from: K */
    public void m39974K() {
        if (NullChecker.m81303a(this.f24456E)) {
            this.f24456E.m39660y();
        }
    }

    /* JADX INFO: renamed from: K0 */
    public void m39975K0(Integer num) {
        xdl0.m208357U(this.f24465e, num.intValue());
        xdl0.m208357U(this.f24474n, num.intValue());
    }

    /* JADX INFO: renamed from: L */
    public View m39976L(TabName tabName) {
        return this.f24456E.m39649n(tabName);
    }

    /* JADX INFO: renamed from: L0 */
    public void m39977L0(String str) {
        m39979M0(str, false);
    }

    /* JADX INFO: renamed from: M */
    public void m39978M(TabName tabName, IconDotType iconDotType, boolean z) {
        IconDotType iconDotType2;
        if (z || (iconDotType2 = this.f24460I) == null || iconDotType == iconDotType2) {
            this.f24456E.m39650o(tabName);
            this.f24460I = null;
        }
    }

    /* JADX INFO: renamed from: M0 */
    public void m39979M0(String str, boolean z) {
        this.f24456E.m39644L(str, z);
    }

    /* JADX INFO: renamed from: N */
    public void m39980N() {
        this.f24484x.alwaysHideInput();
    }

    /* JADX INFO: renamed from: N0 */
    public void m39981N0(boolean z) {
        this.f24456E.m39646N(z);
    }

    /* JADX INFO: renamed from: O */
    public void m39982O() {
        VLinear vLinear = this.f24470j;
        if (vLinear == null || !xdl0.m208349O0(vLinear)) {
            return;
        }
        xdl0.m208344M(this.f24470j, false);
    }

    /* JADX INFO: renamed from: O0 */
    public void m39983O0() {
        getAct().setStatusBarColor(getAct().getResources().getColor(w0c0.f183811U1));
        int systemUiVisibility = getAct().getWindow().getDecorView().getSystemUiVisibility();
        int i = systemUiVisibility & (-8193);
        if (Build.VERSION.SDK_INT >= 26) {
            i = systemUiVisibility & (-8209);
        }
        getAct().getWindow().getDecorView().setSystemUiVisibility(i);
        if (NullChecker.m81303a(getAct()) && (getAct() instanceof NewMainAct)) {
            ((NewMainAct) getAct()).m39801Z5().m39966G(getAct().getResources().getColor(w0c0.f183788N));
            ((NewMainAct) getAct()).m39801Z5().m39968H(1.0f);
            getAct().setNavigationBarColor(getAct().color(w0c0.f183834b2));
        }
    }

    /* JADX INFO: renamed from: P */
    public void m39984P() {
        ptk.m171332h().m171334g("SURPRISE_BOX_BUBBLE");
    }

    /* JADX INFO: renamed from: P0 */
    public void m39985P0() {
        this.f24478r.setTypeface(eqh0.m117752c(3), 1);
        this.f24482v.setTypeface(eqh0.m117752c(3), 1);
        boolean zEquals = TextUtils.equals(CoreModule.f17545c.f19639e0.f149321Z3.get(), UserHomeMode.marryMode);
        VImage vImage = this.f24479s;
        if (zEquals) {
            vImage.setImageResource(x2c0.f190469pq);
            this.f24483w.setImageResource(x2c0.f190437oq);
        } else {
            vImage.setImageResource(x2c0.f190437oq);
            this.f24483w.setImageResource(x2c0.f190469pq);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m39986R() {
        this.f24457F = new ExpandedSplashLayout(getAct());
        ((ViewGroup) getAct().getWindow().getDecorView()).addView(this.f24457F, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX INFO: renamed from: S */
    public void m39987S() {
        xdl0.m208329E0(this.f24476p, new ViewOnClickListenerC8092a());
        xdl0.m208329E0(this.f24480t, new ViewOnClickListenerC8093b());
        this.f24461a.m2412a(new C8094c());
    }

    /* JADX INFO: renamed from: T */
    public View m39988T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflateView = inflateView(layoutInflater, viewGroup);
        this.f24456E = new BottomBarManager(this.f24484x, this.f24467g);
        viewInflateView.setBackgroundResource(w0c0.f183907z1);
        this.f24467g.setBackgroundResource(w0c0.f183788N);
        this.f24467g.setTabClickListener(this);
        if (this.f24456E.m39653r()) {
            this.f24470j.setBackground(getAct().drawable(x2c0.f189204Bi));
        }
        xdl0.m208325C0(this.f24467g, v930.f180607f);
        boolean zM194675N3 = upa.m194675N3();
        FrameLayout frameLayout = this.f24465e;
        if (zM194675N3) {
            xdl0.m208357U(frameLayout, NavigationBarAdmobHelper.INSTANCE.m36150k());
        } else {
            xdl0.m208357U(frameLayout, v930.f180607f + NavigationBarAdmobHelper.INSTANCE.m36150k());
        }
        m39962D0(NavigationBarAdmobHelper.INSTANCE.m36150k());
        this.f24470j.setOnClickListener(new View.OnClickListener() { // from class: l.fa30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f96558a.m39941Y(view);
            }
        });
        if (bne0.m102781j()) {
            final DialogInterfaceC0074a dialogInterfaceC0074aCreate = new DialogInterfaceC0074a.a(getAct()).setView(new View(getAct())).setCancelable(true).create();
            dialogInterfaceC0074aCreate.setCanceledOnTouchOutside(true);
            Window window = dialogInterfaceC0074aCreate.getWindow();
            if (NullChecker.m81303a(window)) {
                window.setLayout(1, 1);
            }
            dialogInterfaceC0074aCreate.show();
            getAct().post(new Runnable() { // from class: l.ga30
                @Override // java.lang.Runnable
                public final void run() {
                    dialogInterfaceC0074aCreate.dismiss();
                }
            });
        }
        if (upa.m194745e2()) {
            m39987S();
        }
        m39940Q();
        if (((NewMainAct) getAct()).m39927i4()) {
            m39986R();
            e51.m114741F(getAct(), new Runnable() { // from class: l.ha30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f106708a.m39942Z();
                }
            });
        }
        return viewInflateView;
    }

    /* JADX INFO: renamed from: U */
    public boolean m39989U() {
        return NullChecker.m81303a(this.f24467g) && xdl0.m208349O0(this.f24467g) && Math.abs(this.f24467g.getTranslationY()) < 1.0f;
    }

    /* JADX INFO: renamed from: V */
    public boolean m39990V() {
        return NullChecker.m81303a(this.f24486z) && this.f24486z.isRunning();
    }

    /* JADX INFO: renamed from: W */
    public boolean m39991W(TabName tabName, BottomBarManager.DotType dotType) {
        return this.f24456E.m39654s(tabName, dotType);
    }

    /* JADX INFO: renamed from: X */
    public boolean m39992X(TabName tabName) {
        return this.f24456E.m39655t(tabName);
    }

    @Override // p147v.bottombar.VBottomBar.InterfaceC22587a
    /* JADX INFO: renamed from: a */
    public void mo39993a(VBottomBar.InterfaceC22588b interfaceC22588b) {
        TabName tabNameTransform = TabName.transform(interfaceC22588b.getTabName());
        if (tabNameTransform != null) {
            m39967G0(tabNameTransform);
        }
        this.f24485y.m40380g9();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m39994a0(String str) {
        zvf0.m220368A("e_see_floating_bubble", "p_suggest_users_home_view", vwb.m200311Y("alertType", str), vwb.m200311Y("alertTextType", this.f24455D), vwb.m200311Y("tooltips_trigger_mode", "passive"), vwb.m200311Y("tooltips_type", "bubble"), vwb.m200311Y("tooltips_type_ui", "bubble_basic_with_icon"), vwb.m200311Y("tooltips_trigger_module", SeeSwitchName.message_tab), vwb.m200311Y("tooltips_trigger_page", "swipe_page"), vwb.m200311Y("tooltips_trigger_reason", "guide"));
    }

    @Override // p147v.bottombar.VBottomBar.InterfaceC22587a
    /* JADX INFO: renamed from: b */
    public boolean mo39995b(VBottomBar.InterfaceC22588b interfaceC22588b) {
        return !TextUtils.equals(TabName.Msg.toString(), interfaceC22588b.getTabName());
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m39996b0() {
        xdl0.m208345M0(this.f24469i, false);
        xdl0.m208345M0(this.f24470j, false);
        if (NullChecker.m81303a(this.f24452A)) {
            this.f24452A.call();
        }
    }

    @Override // p147v.bottombar.VBottomBar.InterfaceC22587a
    /* JADX INFO: renamed from: c */
    public void mo39997c(VBottomBar.InterfaceC22588b interfaceC22588b) {
        wb3 wb3VarMo67250Ys;
        TabName tabNameTransform = TabName.transform(interfaceC22588b.getTabName());
        if (tabNameTransform == null) {
            return;
        }
        m39967G0(tabNameTransform);
        if (!this.f24485y.m212083b1().equals(tabNameTransform)) {
            ((PutongAct) this.f24484x).hideDeepLinkFloatButton(true);
        }
        if (TabName.Post.equals(tabNameTransform)) {
            if (CoreModule.m29934N().isPostingMoment()) {
                return;
            }
            ((PutongAct) this.f24484x).pickMediasWithInstaPicker();
            return;
        }
        boolean zEquals = TabName.Card.equals(tabNameTransform);
        View view = this.f24474n;
        if (zEquals) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
        }
        if (TabName.Me == tabNameTransform) {
            uld0.m194220e().m194235s();
            uld0.m194220e().m194231o();
        }
        if (tabNameTransform == TabName.Live) {
            CoreModule.m29936Q().mo67242Sf();
            if (this.f24485y.m40277H7() && (wb3VarMo67250Ys = CoreModule.m29936Q().mo67250Ys()) != null) {
                sdt.m183552b(((NewMainAct) this.f24484x).m39799Y5().f116564a, wb3VarMo67250Ys.m202503a(), wb3VarMo67250Ys.f185547b, wb3VarMo67250Ys.f185548c, wb3VarMo67250Ys.f185549d);
            }
        }
        this.f24485y.mo40352a1(tabNameTransform, true);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m39998c0(int[] iArr) {
        int iM208412y0;
        xdl0.C21104g c21104gM208382j0 = xdl0.m208382j0(this.f24456E.m39649n(TabName.Msg).getIconView(), this.f24462b);
        xdl0.C21104g c21104gM208382j1 = xdl0.m208382j0(this.f24470j, this.f24462b);
        int iM186890d = t100.m186890d(40.0f);
        if (this.f24456E.m39653r()) {
            iM186890d = (c21104gM208382j1.f192420c / 2) - t100.m186890d(6.0f);
        }
        int iM186890d2 = ((c21104gM208382j0.f192418a + (c21104gM208382j0.f192420c / 2)) - c21104gM208382j1.f192418a) - iM186890d;
        if (c21104gM208382j1.f192420c + iM186890d2 > xdl0.m208412y0()) {
            iM208412y0 = xdl0.m208412y0() - iM186890d2;
            iM186890d2 = ((c21104gM208382j0.f192418a + (c21104gM208382j0.f192420c / 2)) - c21104gM208382j1.f192418a) - ((iM208412y0 / 2) - t100.m186890d(6.0f));
        } else {
            iM208412y0 = 0;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24470j.getLayoutParams();
        layoutParams.leftMargin += iM186890d2;
        this.f24470j.setLayoutParams(layoutParams);
        xdl0.m208388m0(this.f24470j, iM186890d2, 0);
        if (iM208412y0 != 0) {
            this.f24473m.setWidth(iM208412y0);
        }
    }

    @Override // p147v.bottombar.VBottomBar.InterfaceC22587a
    /* JADX INFO: renamed from: d */
    public void mo39999d(VBottomBar.InterfaceC22588b interfaceC22588b) {
        TabName tabNameTransform = TabName.transform(interfaceC22588b.getTabName());
        if (tabNameTransform != null) {
            m39967G0(tabNameTransform);
        }
        this.f24485y.m40401l9();
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m40000d0() {
        xdl0.m208353Q0(this.f24470j, new e30() { // from class: l.ca30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f79998a.m39998c0((int[]) obj);
            }
        });
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p147v.bottombar.VBottomBar.InterfaceC22587a
    /* JADX INFO: renamed from: e */
    public boolean mo40001e(VBottomBar.InterfaceC22588b interfaceC22588b) {
        return upa.m194675N3() && ExpandedCardStyleHelper.m38090o().m38103s();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m40002e0(int[] iArr) {
        xdl0.C21104g c21104gM208382j0 = xdl0.m208382j0(this.f24456E.m39649n(TabName.Msg).getIconView(), this.f24462b);
        xdl0.C21104g c21104gM208382j1 = xdl0.m208382j0(this.f24469i, this.f24462b);
        int i = (c21104gM208382j0.f192418a - c21104gM208382j1.f192418a) + ((c21104gM208382j0.f192420c - c21104gM208382j1.f192420c) / 2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f24469i.getLayoutParams();
        layoutParams.leftMargin += i;
        this.f24469i.setLayoutParams(layoutParams);
        xdl0.m208388m0(this.f24469i, i, 0);
    }

    @Override // p147v.bottombar.VBottomBar.InterfaceC22587a
    /* JADX INFO: renamed from: f */
    public boolean mo40003f(VBottomBar.InterfaceC22588b interfaceC22588b) {
        return CoreModule.m29936Q().mo67230M7() && !TabName.Live.name().equals(interfaceC22588b.getTabName());
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m40004f0() {
        xdl0.m208353Q0(this.f24469i, new e30() { // from class: l.ba30
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f74647a.m40002e0((int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m40005g0() {
        xdl0.m208345M0(this.f24470j, true);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m40006h0() {
        xdl0.m208345M0(this.f24470j, true);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m40007i0() {
        this.f24470j.setScaleX(0.0f);
        this.f24470j.setScaleY(0.0f);
        xdl0.m208345M0(this.f24470j, true);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m39959B(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m40008j0() {
        xdl0.m208345M0(this.f24469i, true);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m40009k0(BottomBarManager.DotType dotType, boolean z, int i, String str) {
        o660 o660VarM167645d = p660.m167645d();
        o6j0.m162870n(str, o660VarM167645d == null ? "" : o660VarM167645d.m162820c(), o6j0.C18854a.m162878h("red_dot_type", this.f24458G.call(dotType)), o6j0.C18854a.m162876f("red_dot_status", z ? 1 : 0), o6j0.C18854a.m162876f("numbers_on_bubble", i));
    }

    /* JADX INFO: renamed from: l0 */
    public void m40010l0() {
        if (NullChecker.m81303a(this.f24485y)) {
            m40012n0();
            pcl0 pcl0VarM40422r6 = this.f24485y.m40422r6(TabName.Card);
            if (pcl0VarM40422r6 instanceof psl) {
                pcl0VarM40422r6 = ((psl) pcl0VarM40422r6).mo38560Y();
            }
            if (pcl0VarM40422r6 instanceof NewNewHomeFrag) {
                ((NewNewHomeFrag) pcl0VarM40422r6).f21678C.m37374w5();
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m40011m0(TabName tabName) {
        if (upa.m194847z()) {
            this.f24462b.setBackgroundColor(-1);
            xdl0.m208344M(this.f24463c, true);
            if (tabName == TabName.Card) {
                this.f24463c.setImageResource(x2c0.f189313F);
                return;
            }
            if (tabName == TabName.FEATURED) {
                this.f24463c.setImageResource(x2c0.f189345G);
                return;
            }
            if (tabName == TabName.Msg) {
                this.f24463c.setImageResource(x2c0.f189469K);
                return;
            }
            if (tabName == TabName.Moment) {
                this.f24463c.setImageResource(x2c0.f189438J);
            } else if (tabName == TabName.Me) {
                this.f24463c.setImageResource(x2c0.f189407I);
            } else if (tabName == TabName.Live) {
                this.f24463c.setImageResource(x2c0.f189376H);
            }
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m40012n0() {
        if (this.f24468h == null) {
            return;
        }
        boolean zM36163x = NavigationBarAdmobHelper.INSTANCE.m36163x();
        NavigationBarAdView navigationBarAdView = this.f24468h;
        if (zM36163x) {
            navigationBarAdView.m29999E();
        } else {
            navigationBarAdView.m30001G();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m40013o0(j760<TabName, Boolean> j760Var) {
        this.f24456E.m39634B(j760Var);
    }

    /* JADX INFO: renamed from: p0 */
    public void m40014p0(TabName tabName, boolean z) {
        m39969H0(tabName, BottomBarManager.DotType.Dot, z, 0);
        this.f24456E.m39635C(tabName, z);
    }

    /* JADX INFO: renamed from: q0 */
    public void m40015q0(boolean z) {
        this.f24456E.m39636D(z);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0060  */
    /* JADX WARN: Code duplicated, block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: r0 */
    public void m40016r0(TabName tabName, IconDotType iconDotType) {
        int i;
        VImage vImage = this.f24456E.m39649n(tabName).f209532e;
        xdl0.m208358V(vImage, t100.m186890d(17.0f));
        int i2 = C8095d.f24490a[iconDotType.ordinal()];
        int i3 = 0;
        if (i2 == 1) {
            i = x2c0.f189611Oh;
            xdl0.m208327D0(t100.m186890d(29.0f), vImage);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    i = x2c0.f190474q;
                    xdl0.m208327D0(t100.m186890d(20.0f), vImage);
                }
                if (i3 > 0) {
                    this.f24456E.m39637E(tabName, i3);
                    this.f24460I = iconDotType;
                }
            }
            i = x2c0.f189538M6;
            xdl0.m208327D0(t100.m186890d(42.0f), vImage);
            xdl0.m208358V(vImage, t100.m186890d(12.0f));
        }
        i3 = i;
        if (i3 > 0) {
            this.f24456E.m39637E(tabName, i3);
            this.f24460I = iconDotType;
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m40017s0(boolean z) {
        xdl0.m208344M(this.f24467g, z);
        NavigationBarAdView navigationBarAdView = this.f24468h;
        if (z) {
            navigationBarAdView.m30001G();
        } else {
            navigationBarAdView.m29999E();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m40018t0(boolean z, String str) {
        m40017s0(z);
        if (ConversationsTabFrag.f25191H0.equals(str)) {
            if (upa.m194675N3() && TabName.Card.equals(this.f24485y.m212083b1())) {
                z = false;
            }
            xdl0.m208344M(this.f24474n, z);
            View view = this.f24474n;
            int i = v930.f180607f;
            NavigationBarAdmobHelper navigationBarAdmobHelper = NavigationBarAdmobHelper.INSTANCE;
            xdl0.m208357U(view, i + navigationBarAdmobHelper.m36150k());
            xdl0.m208357U(this.f24465e, (z ? v930.f180607f : 0) + navigationBarAdmobHelper.m36150k());
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m40019u0(boolean z) {
        xdl0.m208344M(this.f24484x.toolbar(), z);
    }

    /* JADX INFO: renamed from: v0 */
    public void m40020v0(TabName tabName, int i) {
        m40021w0(tabName, i, -1);
    }

    /* JADX INFO: renamed from: w0 */
    public void m40021w0(TabName tabName, int i, @DrawableRes int i2) {
        m39969H0(tabName, BottomBarManager.DotType.Num, i > 0, i);
        this.f24456E.m39640H(tabName, i, i2);
    }

    /* JADX INFO: renamed from: x0 */
    public void m40022x0(TabName tabName, @DrawableRes int i) {
        this.f24456E.m39641I(tabName, i);
    }

    /* JADX INFO: renamed from: y0 */
    public void m40023y0(CharSequence charSequence, String str, Figure figure, final String str2, double d, d30 d30Var) {
        this.f24454C = str2;
        this.f24452A = d30Var;
        m39962D0(NavigationBarAdmobHelper.INSTANCE.m36150k());
        boolean zM110322a = d8e0.m110322a(CoreModule.f17545c.f19639e0.m169527p9());
        if (zM110322a) {
            if (NullChecker.m81303a(figure) && TEnum.equals(figure.type, "distance") && figure.total > 0) {
                this.f24473m.setText(charSequence);
                this.f24455D = figure.type.toString();
            } else if (!NullChecker.m81303a(figure) || TEnum.equals(figure.type, "number") || !NullChecker.m81303a(figure.message) || TextUtils.isEmpty(figure.message.template)) {
                this.f24473m.setText(rza.m181735O0(charSequence.toString(), Color.parseColor("#ff3200"), Typeface.create("sans-serif", 3)));
                this.f24455D = "number";
            } else {
                this.f24473m.setText(rza.m181723C0(figure));
                this.f24455D = figure.type.toString();
            }
            xdl0.m208345M0(this.f24472l, mqi0.m155936K(d));
        } else {
            this.f24473m.setText(charSequence);
            this.f24455D = "number";
        }
        if (!TextUtils.isEmpty(str)) {
            if (zM110322a && n3b0.m157742q()) {
                qib0.f154691G.m102336O(this.f24471k, str, 2, 100);
            } else {
                qib0.f154691G.m102331L0(this.f24471k, str);
            }
        }
        if (NullChecker.m81303a(this.f24486z)) {
            if (this.f24486z.isRunning()) {
                return;
            }
            xdl0.m208345M0(this.f24469i, false);
            xdl0.m208345M0(this.f24470j, false);
            this.f24486z.setStartDelay(0L);
            this.f24486z.start();
            return;
        }
        e51.m114742G(new Runnable() { // from class: l.ia30
            @Override // java.lang.Runnable
            public final void run() {
                this.f112277a.m40000d0();
            }
        });
        e51.m114742G(new Runnable() { // from class: l.ja30
            @Override // java.lang.Runnable
            public final void run() {
                this.f116998a.m40004f0();
            }
        });
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        Animator animatorM103746s = bt0.m103746s(bt0.m103743p(this.f24469i, "alpha", 0L, 200L, linearInterpolator, 0.0f, 1.0f), bt0.m103737j(1100), bt0.m103743p(this.f24469i, "alpha", 0L, 200L, linearInterpolator, 1.0f, 0.0f));
        Animator animatorM103746s2 = bt0.m103746s(bt0.m103743p(this.f24469i, "translationY", 0L, 500L, linearInterpolator, 0.0f, -this.f24453B), bt0.m103737j(200), bt0.m103743p(this.f24469i, "translationY", 0L, 800L, linearInterpolator, -this.f24453B, 0.0f));
        Animator animatorM103746s3 = bt0.m103746s(bt0.m103739l(this.f24469i, bt0.f77162i, 0L, 500L, linearInterpolator, 1.0f, 2.4f), bt0.m103737j(200), bt0.m103739l(this.f24469i, bt0.f77162i, 0L, 800L, linearInterpolator, 2.4f, 1.0f));
        Animator animatorM103743p = bt0.m103743p(this.f24469i, BLiveGiftItem.TYPE_ROTATION, 0L, 1500L, linearInterpolator, 0.0f, 720.0f);
        if (!zM110322a) {
            this.f24470j.setPivotX(t100.m186890d(20.0f));
            this.f24470j.setPivotY(t100.m186890d(40.0f));
        }
        Animator animatorM103743p2 = bt0.m103743p(this.f24470j, "alpha", 1500L, 400L, linearInterpolator, 0.0f, 1.0f);
        VLinear vLinear = this.f24470j;
        Animator animatorM103743p3 = zM110322a ? bt0.m103743p(vLinear, "translationY", 0L, 4600L, linearInterpolator, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 0.0f) : bt0.m103743p(vLinear, "translationY", 0L, 2000L, linearInterpolator, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 0.0f);
        Animator animatorM103743p4 = bt0.m103743p(this.f24470j, "alpha", 0L, 500L, linearInterpolator, 1.0f, 0.0f);
        Animator animatorM103739l = bt0.m103739l(this.f24470j, bt0.f77162i, 1500L, 400L, linearInterpolator, 0.0f, 1.0f);
        Animator animatorM103743p5 = bt0.m103743p(this.f24470j, "translationY", 1500L, 400L, linearInterpolator, t100.m186890d(24.0f), 0.0f);
        Animator animatorM103746s4 = bt0.m103746s(animatorM103743p2, animatorM103743p3, animatorM103743p4);
        this.f24486z = bt0.m103753z(animatorM103746s, animatorM103746s2, animatorM103746s3, animatorM103743p, bt0.m103753z(animatorM103746s4, animatorM103739l, animatorM103743p5));
        bt0.m103749v(animatorM103743p5, new Runnable() { // from class: l.ka30
            @Override // java.lang.Runnable
            public final void run() {
                this.f122093a.m40005g0();
            }
        });
        bt0.m103733f(animatorM103746s4, new Runnable() { // from class: l.la30
            @Override // java.lang.Runnable
            public final void run() {
                this.f127164a.m40006h0();
            }
        });
        bt0.m103733f(animatorM103743p, new Runnable() { // from class: l.x930
            @Override // java.lang.Runnable
            public final void run() {
                this.f191572a.m40007i0();
            }
        });
        bt0.m103749v(animatorM103743p, new Runnable() { // from class: l.y930
            @Override // java.lang.Runnable
            public final void run() {
                this.f196930a.m40008j0();
            }
        });
        bt0.m103750w(this.f24486z, new Runnable() { // from class: l.z930
            @Override // java.lang.Runnable
            public final void run() {
                this.f202264a.m39994a0(str2);
            }
        }, new Runnable() { // from class: l.aa30
            @Override // java.lang.Runnable
            public final void run() {
                this.f68269a.m39996b0();
            }
        });
        if (ShareConstants.OLD_VERSION.equals(str2)) {
            this.f24486z.setStartDelay(1000L);
        }
        this.f24486z.start();
    }

    /* JADX INFO: renamed from: z0 */
    public void m40024z0(PopGuide popGuide) {
        x4i.m206979f(getAct(), this.f24462b, this.f24456E.m39649n(TabName.Moment).getIconView(), popGuide);
    }
}
