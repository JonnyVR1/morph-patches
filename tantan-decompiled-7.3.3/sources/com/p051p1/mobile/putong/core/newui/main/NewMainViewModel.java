package com.p051p1.mobile.putong.core.newui.main;

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
import androidx.appcompat.app.DialogInterfaceC0075a;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.drawerlayout.widget.DrawerLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.p053ui.bubble.C4496a;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.admob.NavigationBarAdView;
import com.p051p1.mobile.putong.core.data.Figure;
import com.p051p1.mobile.putong.core.data.PopGuide;
import com.p051p1.mobile.putong.core.data.SeeSwitchName;
import com.p051p1.mobile.putong.core.data.UserHomeMode;
import com.p051p1.mobile.putong.core.newui.admob.NavigationBarAdmobHelper;
import com.p051p1.mobile.putong.core.newui.home.NewNewHomeFrag;
import com.p051p1.mobile.putong.core.newui.home.card.expanded.helper.ExpandedCardStyleHelper;
import com.p051p1.mobile.putong.core.newui.main.BottomBarManager;
import com.p051p1.mobile.putong.core.newui.main.NewMainViewModel;
import com.p051p1.mobile.putong.core.newui.main.view.ExpandedSplashLayout;
import com.p051p1.mobile.putong.core.newui.messages.ConversationsTabFrag;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveGiftItem;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import p151v.AutoVDraweeView;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VText;
import p151v.bottombar.VBottomBar;
import p151v.bottombar.VBottomBarDefaultItem;
import p153l.aj30;
import p153l.al80;
import p153l.bkj0;
import p153l.bnl0;
import p153l.c9c0;
import p153l.cl80;
import p153l.cvl;
import p153l.dbc0;
import p153l.e1b;
import p153l.fbl;
import p153l.fwk;
import p153l.gra;
import p153l.gt0;
import p153l.i4g0;
import p153l.iam;
import p153l.ige0;
import p153l.ive0;
import p153l.ji30;
import p153l.jj40;
import p153l.jyb;
import p153l.l51;
import p153l.lc3;
import p153l.lyh0;
import p153l.m6i;
import p153l.ner;
import p153l.pf60;
import p153l.pzi0;
import p153l.qa00;
import p153l.qcj;
import p153l.rbb0;
import p153l.s7a;
import p153l.sfj0;
import p153l.tft;
import p153l.ue60;
import p153l.uqb0;
import p153l.ve60;
import p153l.wtd0;
import p153l.x20;
import p153l.x95;
import p153l.y20;
import p153l.zvk;

/* JADX INFO: loaded from: classes11.dex */
public class NewMainViewModel implements iam<C8247a>, VBottomBar.InterfaceC22702a {

    /* JADX INFO: renamed from: J */
    public static final int f25193J = qa00.m175859d(48.0f);

    /* JADX INFO: renamed from: A */
    public x20 f25194A;

    /* JADX INFO: renamed from: C */
    public String f25196C;

    /* JADX INFO: renamed from: E */
    public BottomBarManager f25198E;

    /* JADX INFO: renamed from: F */
    public ExpandedSplashLayout f25199F;

    /* JADX INFO: renamed from: I */
    public IconDotType f25202I;

    /* JADX INFO: renamed from: a */
    public DrawerLayout f25203a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f25204b;

    /* JADX INFO: renamed from: c */
    public AutoVDraweeView f25205c;

    /* JADX INFO: renamed from: d */
    public VFrame f25206d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f25207e;

    /* JADX INFO: renamed from: f */
    public VLinear f25208f;

    /* JADX INFO: renamed from: g */
    public VBottomBar f25209g;

    /* JADX INFO: renamed from: h */
    public NavigationBarAdView f25210h;

    /* JADX INFO: renamed from: i */
    public VImage f25211i;

    /* JADX INFO: renamed from: j */
    public VLinear f25212j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f25213k;

    /* JADX INFO: renamed from: l */
    public ImageView f25214l;

    /* JADX INFO: renamed from: m */
    public VText f25215m;

    /* JADX INFO: renamed from: n */
    public View f25216n;

    /* JADX INFO: renamed from: o */
    public LinearLayout f25217o;

    /* JADX INFO: renamed from: p */
    public ConstraintLayout f25218p;

    /* JADX INFO: renamed from: q */
    public VImage f25219q;

    /* JADX INFO: renamed from: r */
    public VText f25220r;

    /* JADX INFO: renamed from: s */
    public VImage f25221s;

    /* JADX INFO: renamed from: t */
    public ConstraintLayout f25222t;

    /* JADX INFO: renamed from: u */
    public VImage f25223u;

    /* JADX INFO: renamed from: v */
    public VText f25224v;

    /* JADX INFO: renamed from: w */
    public VImage f25225w;

    /* JADX INFO: renamed from: x */
    public Act f25226x;

    /* JADX INFO: renamed from: y */
    public C8247a f25227y;

    /* JADX INFO: renamed from: z */
    public Animator f25228z;

    /* JADX INFO: renamed from: B */
    public int f25195B = qa00.m175859d(200.0f);

    /* JADX INFO: renamed from: D */
    public String f25197D = "number";

    /* JADX INFO: renamed from: G */
    public final qcj<BottomBarManager.DotType, String> f25200G = new qcj() { // from class: l.ki30
        @Override // p153l.qcj
        public final Object call(Object obj) {
            return NewMainViewModel.m40950i((BottomBarManager.DotType) obj);
        }
    };

    /* JADX INFO: renamed from: H */
    public Map<TabName, bkj0<BottomBarManager.DotType, Boolean, Integer>> f25201H = new HashMap();

    public enum IconDotType {
        diamond,
        edit_profile,
        warning
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.NewMainViewModel$a */
    public class ViewOnClickListenerC8243a implements View.OnClickListener {
        public ViewOnClickListenerC8243a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i4g0.m138523u("e_mode_sidebar", "p_suggest_users_home_view", new pf60("mode_select", "love"));
            NewMainViewModel newMainViewModel = NewMainViewModel.this;
            newMainViewModel.f25203a.m2418f(newMainViewModel.f25217o);
            NewMainViewModel.this.f25227y.m41319P9(false);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.NewMainViewModel$b */
    public class ViewOnClickListenerC8244b implements View.OnClickListener {
        public ViewOnClickListenerC8244b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            i4g0.m138523u("e_mode_sidebar", "p_suggest_users_home_view", new pf60("mode_select", "marry"));
            NewMainViewModel newMainViewModel = NewMainViewModel.this;
            newMainViewModel.f25203a.m2418f(newMainViewModel.f25217o);
            NewMainViewModel.this.f25227y.m41319P9(true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.NewMainViewModel$c */
    public class C8245c implements DrawerLayout.InterfaceC0363d {
        public C8245c() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0363d
        /* JADX INFO: renamed from: a */
        public void mo2442a(@NonNull View view) {
            NewMainViewModel.this.m40992P0();
            CoreModule.f18264c.f20381e0.f89194b4.put(Boolean.TRUE);
            i4g0.m138492A("e_mode_sidebar", "p_suggest_users_home_view", jyb.m147494Y("mode_select", CoreModule.f18264c.f20381e0.m116541a8() ? "marry" : "love"));
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0363d
        /* JADX INFO: renamed from: b */
        public void mo2443b(@NonNull View view) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0363d
        /* JADX INFO: renamed from: c */
        public void mo2444c(int i) {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.InterfaceC0363d
        /* JADX INFO: renamed from: d */
        public void mo2445d(@NonNull View view, float f) {
            if (f >= 0.02d) {
                NewMainViewModel.this.m40990O0();
            } else {
                fbl.m124897a(NewMainViewModel.this.getAct(), jj40.m145002e());
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.main.NewMainViewModel$d */
    public static /* synthetic */ class C8246d {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f25232a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f25233b;

        static {
            int[] iArr = new int[BottomBarManager.DotType.values().length];
            f25233b = iArr;
            try {
                iArr[BottomBarManager.DotType.Num.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f25233b[BottomBarManager.DotType.Dot.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f25233b[BottomBarManager.DotType.TextDot.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[IconDotType.values().length];
            f25232a = iArr2;
            try {
                iArr2[IconDotType.diamond.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f25232a[IconDotType.edit_profile.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f25232a[IconDotType.warning.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    public NewMainViewModel(Act act) {
        this.f25226x = act;
    }

    /* JADX INFO: renamed from: Q */
    private void m40947Q() {
        if (s7a.m184994w()) {
            this.f25206d.bringChildToFront(this.f25207e);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Y */
    public /* synthetic */ void m40948Y(View view) {
        m40972F();
        bnl0.m105524M(this.f25212j, false);
        i4g0.m138523u("e_see_floating_bubble", "p_suggest_users_home_view", jyb.m147494Y("alertType", this.f25196C), jyb.m147494Y("alertTextType", this.f25197D));
        if (rbb0.m180744q()) {
            CoreModule.m30933P().m143405a().mo34537l1(this.f25226x, "NA,NA,seeFloat");
        } else {
            this.f25226x.startActivity(new Intent(this.f25226x, (Class<?>) LikersAct.class));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Z */
    public /* synthetic */ void m40949Z() {
        bnl0.m105548c0(this.f25204b, ((NewMainAct) getAct()).m40800X5());
    }

    /* JADX INFO: renamed from: i */
    public static /* synthetic */ String m40950i(BottomBarManager.DotType dotType) {
        int i = C8246d.f25233b[dotType.ordinal()];
        if (i != 1) {
            return i != 2 ? "other" : "red_dot";
        }
        return "bubble";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: x */
    public static /* synthetic */ Boolean m40962x(BottomBarManager.DotType dotType, int i, boolean z, bkj0 bkj0Var) {
        if (bkj0Var == null) {
            return Boolean.TRUE;
        }
        int i2 = C8246d.f25233b[dotType.ordinal()];
        if (i2 == 1) {
            return (bkj0Var.f77081a == dotType && ((Integer) bkj0Var.f77083c).intValue() == i) ? Boolean.FALSE : Boolean.TRUE;
        }
        if (i2 == 2 || i2 == 3) {
            return (bkj0Var.f77081a == dotType && ((Boolean) bkj0Var.f77082b).booleanValue() == z) ? Boolean.FALSE : Boolean.TRUE;
        }
        return Boolean.TRUE;
    }

    /* JADX INFO: renamed from: A0 */
    public void m40965A0(int i, C4496a.c cVar) {
        C4496a c4496a = new C4496a(getAct());
        c4496a.m21848D(i > 0 ? String.format(App.f16088e.getString(R$string.f18937Va), Integer.valueOf(i)) : App.f16088e.getString(R$string.f18787Qa)).m21869k(Color.parseColor("#FF3865")).m21870l(qa00.m175859d(7.0f)).m21854J(13.0f).m21873p(75).m21881x(qa00.f156318e).m21882y(false).m21868j(cVar).m21860b(4000L).m21874q(C4496a.f16402Q);
        VBottomBarDefaultItem vBottomBarDefaultItemM40652n = this.f25198E.m40652n(TabName.Meet);
        if (NullChecker.m82486a(vBottomBarDefaultItemM40652n)) {
            cl80.m110426e().m110439q(al80.m98641a(c4496a).m98653r(new WeakReference<>(vBottomBarDefaultItemM40652n)).m98649n("key_intl_tribe_pop").m98651p(3));
            i4g0.m138492A("e_intl_tribe_guided_bubble", "p_suggest_users_home_view", pf60.m172085a("tribe_bubble_type", "guide"));
            CoreModule.f18264c.f20381e0.f89080M6.put(Boolean.TRUE);
            CoreModule.f18264c.f20381e0.f89087N6.put(Long.valueOf(pzi0.m174454o()));
        }
    }

    /* JADX INFO: renamed from: B */
    public View m40966B(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return aj30.m98350b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: B0 */
    public void m40967B0() {
        C4499d.m21895l().m21908u(new C4496a(getAct()).m21848D("惊喜礼盒可在侧边栏查看").m21875r("#ffffff").m21854J(13.0f).m21869k(getAct().getResources().getColor(gra.m131778z() ? c9c0.f80318A : c9c0.f80342I)).m21877t(true).m21863e(true).m21860b(Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS).m21852H(qa00.m175859d(10.0f), qa00.m175859d(10.0f), qa00.m175859d(10.0f), qa00.m175859d(10.0f)).m21880w(8).m21882y(true).m21883z(qa00.m175859d(10.0f)).m21874q(zvk.f206227D | zvk.f206228E), this.f25198E.m40652n(TabName.Me), "surprise_box_bubble");
    }

    /* JADX INFO: renamed from: C */
    public void m40968C(boolean z) {
        NavigationBarAdmobHelper.INSTANCE.m37165w(z);
        m41019n0();
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f25226x;
    }

    /* JADX INFO: renamed from: D0 */
    public void m40969D0(int i) {
        VLinear vLinear = this.f25212j;
        if (vLinear == null || this.f25211i == null) {
            return;
        }
        bnl0.m105537U(vLinear, f25193J + i);
        bnl0.m105537U(this.f25211i, i);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(C8247a c8247a) {
        this.f25227y = c8247a;
    }

    /* JADX INFO: renamed from: E0 */
    public void m40971E0(TabName tabName, boolean z) {
        this.f25198E.m40636A(tabName, z);
        HashMap map = new HashMap();
        if (TextUtils.equals(tabName.toString(), TabName.Msg.toString())) {
            map.put("Page Name", "Message");
            x95.INSTANCE.m209793m("View Page", map);
            return;
        }
        if (TextUtils.equals(tabName.toString(), TabName.Card.toString())) {
            map.put("Page Name", "Swipe Page");
            x95.INSTANCE.m209793m("View Page", map);
            return;
        }
        if (TextUtils.equals(tabName.toString(), TabName.Me.toString())) {
            map.put("Page Name", "Me");
            x95.INSTANCE.m209793m("View Page", map);
        } else if (TextUtils.equals(tabName.toString(), TabName.Meet.toString())) {
            map.put("Page Name", "Discover");
            x95.INSTANCE.m209793m("View Page", map);
        } else if (TextUtils.equals(tabName.toString(), TabName.Live.toString())) {
            map.put("Page Name", "Livestream");
            x95.INSTANCE.m209793m("View Page", map);
        }
    }

    /* JADX INFO: renamed from: F */
    public void m40972F() {
        if (NullChecker.m82486a(this.f25228z)) {
            this.f25194A = null;
            if (this.f25228z.isRunning()) {
                this.f25228z.cancel();
            }
            this.f25228z = null;
        }
    }

    /* JADX INFO: renamed from: G */
    public void m40973G(@ColorInt int i) {
        this.f25209g.setBackgroundColor(i);
    }

    /* JADX INFO: renamed from: G0 */
    public final void m40974G0(TabName tabName) {
        ue60 ue60VarM201037d = ve60.m201037d();
        String strM195739c = ue60VarM201037d == null ? "" : ue60VarM201037d.m195739c();
        bkj0<BottomBarManager.DotType, Boolean, Integer> bkj0Var = this.f25201H.get(tabName);
        if (tabName == TabName.Msg && bkj0Var != null && bkj0Var.f77082b.booleanValue()) {
            sfj0.m185596c("e_red_dot_messages", strM195739c, sfj0.C20032a.m185613f("numbers_on_bubble", bkj0Var.f77083c.intValue()), sfj0.C20032a.m185615h("red_dot_type", this.f25200G.call(bkj0Var.f77081a)));
        }
    }

    /* JADX INFO: renamed from: H */
    public void m40975H(float f) {
    }

    /* JADX INFO: renamed from: H0 */
    public final void m40976H0(TabName tabName, final BottomBarManager.DotType dotType, final boolean z, final int i) {
        y20 y20Var = new y20() { // from class: l.ri30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f163334a.m41016k0(dotType, z, i, (String) obj);
            }
        };
        qcj qcjVar = new qcj() { // from class: l.si30
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return NewMainViewModel.m40962x(dotType, i, z, (bkj0) obj);
            }
        };
        if (tabName == TabName.Msg && ((Boolean) qcjVar.call(this.f25201H.get(tabName))).booleanValue()) {
            this.f25201H.put(tabName, bkj0.m104818a(dotType, Boolean.valueOf(z), Integer.valueOf(i)));
            y20Var.call("e_red_dot_messages_change");
        }
    }

    /* JADX INFO: renamed from: I */
    public void m40977I() {
        if (NullChecker.m82486a(this.f25199F)) {
            bnl0.m105524M(this.f25199F, false);
        }
    }

    /* JADX INFO: renamed from: I0 */
    public void m40978I0() {
        this.f25210h.m31001L(getAct());
    }

    /* JADX INFO: renamed from: J */
    public void m40979J(boolean z) {
        VBottomBar vBottomBar = this.f25209g;
        if (z) {
            Animator duration = gt0.m132171q(vBottomBar, "translationY", ji30.f121041f).setDuration(ExpandedCardStyleHelper.f23149h);
            VBottomBar vBottomBar2 = this.f25209g;
            gt0.m132180z(duration, gt0.m132171q(vBottomBar2, "alpha", vBottomBar2.getAlpha(), 0.0f).setDuration(ExpandedCardStyleHelper.f23149h)).start();
        } else {
            Animator duration2 = gt0.m132171q(vBottomBar, "translationY", vBottomBar.getTranslationY(), 0.0f).setDuration(ExpandedCardStyleHelper.f23149h);
            VBottomBar vBottomBar3 = this.f25209g;
            gt0.m132180z(duration2, gt0.m132171q(vBottomBar3, "alpha", vBottomBar3.getAlpha(), 1.0f).setDuration(ExpandedCardStyleHelper.f23149h)).start();
        }
    }

    /* JADX INFO: renamed from: J0 */
    public void m40980J0(boolean z) {
        this.f25198E.m40646K(z);
    }

    /* JADX INFO: renamed from: K */
    public void m40981K() {
        if (NullChecker.m82486a(this.f25198E)) {
            this.f25198E.m40663y();
        }
    }

    /* JADX INFO: renamed from: K0 */
    public void m40982K0(Integer num) {
        bnl0.m105537U(this.f25207e, num.intValue());
        bnl0.m105537U(this.f25216n, num.intValue());
    }

    /* JADX INFO: renamed from: L */
    public View m40983L(TabName tabName) {
        return this.f25198E.m40652n(tabName);
    }

    /* JADX INFO: renamed from: L0 */
    public void m40984L0(String str) {
        m40986M0(str, false);
    }

    /* JADX INFO: renamed from: M */
    public void m40985M(TabName tabName, IconDotType iconDotType, boolean z) {
        IconDotType iconDotType2;
        if (z || (iconDotType2 = this.f25202I) == null || iconDotType == iconDotType2) {
            this.f25198E.m40653o(tabName);
            this.f25202I = null;
        }
    }

    /* JADX INFO: renamed from: M0 */
    public void m40986M0(String str, boolean z) {
        this.f25198E.m40647L(str, z);
    }

    /* JADX INFO: renamed from: N */
    public void m40987N() {
        this.f25226x.alwaysHideInput();
    }

    /* JADX INFO: renamed from: N0 */
    public void m40988N0(boolean z) {
        this.f25198E.m40649N(z);
    }

    /* JADX INFO: renamed from: O */
    public void m40989O() {
        VLinear vLinear = this.f25212j;
        if (vLinear == null || !bnl0.m105529O0(vLinear)) {
            return;
        }
        bnl0.m105524M(this.f25212j, false);
    }

    /* JADX INFO: renamed from: O0 */
    public void m40990O0() {
        getAct().setStatusBarColor(getAct().getResources().getColor(c9c0.f80383V1));
        int systemUiVisibility = getAct().getWindow().getDecorView().getSystemUiVisibility();
        int i = systemUiVisibility & (-8193);
        if (Build.VERSION.SDK_INT >= 26) {
            i = systemUiVisibility & (-8209);
        }
        getAct().getWindow().getDecorView().setSystemUiVisibility(i);
        if (NullChecker.m82486a(getAct()) && (getAct() instanceof NewMainAct)) {
            ((NewMainAct) getAct()).m40810d6().m40973G(getAct().getResources().getColor(c9c0.f80357N));
            ((NewMainAct) getAct()).m40810d6().m40975H(1.0f);
            getAct().setNavigationBarColor(getAct().color(c9c0.f80407c2));
        }
    }

    /* JADX INFO: renamed from: P */
    public void m40991P() {
        fwk.m127777h().m127779g("SURPRISE_BOX_BUBBLE");
    }

    /* JADX INFO: renamed from: P0 */
    public void m40992P0() {
        this.f25220r.setTypeface(lyh0.m156283c(3), 1);
        this.f25224v.setTypeface(lyh0.m156283c(3), 1);
        boolean zEquals = TextUtils.equals(CoreModule.f18264c.f20381e0.f89178Z3.get(), UserHomeMode.marryMode);
        VImage vImage = this.f25221s;
        if (zEquals) {
            vImage.setImageResource(dbc0.f86934dr);
            this.f25225w.setImageResource(dbc0.f86902cr);
        } else {
            vImage.setImageResource(dbc0.f86902cr);
            this.f25225w.setImageResource(dbc0.f86934dr);
        }
    }

    /* JADX INFO: renamed from: R */
    public final void m40993R() {
        this.f25199F = new ExpandedSplashLayout(getAct());
        ((ViewGroup) getAct().getWindow().getDecorView()).addView(this.f25199F, new ViewGroup.LayoutParams(-1, -1));
    }

    /* JADX INFO: renamed from: S */
    public void m40994S() {
        bnl0.m105509E0(this.f25218p, new ViewOnClickListenerC8243a());
        bnl0.m105509E0(this.f25222t, new ViewOnClickListenerC8244b());
        this.f25203a.m2413a(new C8245c());
    }

    /* JADX INFO: renamed from: T */
    public View m40995T(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflateView = inflateView(layoutInflater, viewGroup);
        this.f25198E = new BottomBarManager(this.f25226x, this.f25209g);
        viewInflateView.setBackgroundResource(c9c0.f80320A1);
        this.f25209g.setBackgroundResource(c9c0.f80357N);
        this.f25209g.setTabClickListener(this);
        if (this.f25198E.m40656r()) {
            this.f25212j.setBackground(getAct().drawable(dbc0.f87320pj));
        }
        bnl0.m105505C0(this.f25209g, ji30.f121041f);
        boolean zM131606N3 = gra.m131606N3();
        FrameLayout frameLayout = this.f25207e;
        if (zM131606N3) {
            bnl0.m105537U(frameLayout, NavigationBarAdmobHelper.INSTANCE.m37153k());
        } else {
            bnl0.m105537U(frameLayout, ji30.f121041f + NavigationBarAdmobHelper.INSTANCE.m37153k());
        }
        m40969D0(NavigationBarAdmobHelper.INSTANCE.m37153k());
        this.f25212j.setOnClickListener(new View.OnClickListener() { // from class: l.ti30
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f174442a.m40948Y(view);
            }
        });
        if (ive0.m142296j()) {
            final DialogInterfaceC0075a dialogInterfaceC0075aCreate = new DialogInterfaceC0075a.a(getAct()).setView(new View(getAct())).setCancelable(true).create();
            dialogInterfaceC0075aCreate.setCanceledOnTouchOutside(true);
            Window window = dialogInterfaceC0075aCreate.getWindow();
            if (NullChecker.m82486a(window)) {
                window.setLayout(1, 1);
            }
            dialogInterfaceC0075aCreate.show();
            getAct().post(new Runnable() { // from class: l.ui30
                @Override // java.lang.Runnable
                public final void run() {
                    dialogInterfaceC0075aCreate.dismiss();
                }
            });
        }
        if (gra.m131676e2()) {
            m40994S();
        }
        m40947Q();
        if (((NewMainAct) getAct()).m40935k4()) {
            m40993R();
            l51.m152886F(getAct(), new Runnable() { // from class: l.vi30
                @Override // java.lang.Runnable
                public final void run() {
                    this.f184215a.m40949Z();
                }
            });
        }
        return viewInflateView;
    }

    /* JADX INFO: renamed from: U */
    public boolean m40996U() {
        return NullChecker.m82486a(this.f25209g) && bnl0.m105529O0(this.f25209g) && Math.abs(this.f25209g.getTranslationY()) < 1.0f;
    }

    /* JADX INFO: renamed from: V */
    public boolean m40997V() {
        return NullChecker.m82486a(this.f25228z) && this.f25228z.isRunning();
    }

    /* JADX INFO: renamed from: W */
    public boolean m40998W(TabName tabName, BottomBarManager.DotType dotType) {
        return this.f25198E.m40657s(tabName, dotType);
    }

    /* JADX INFO: renamed from: X */
    public boolean m40999X(TabName tabName) {
        return this.f25198E.m40658t(tabName);
    }

    @Override // p151v.bottombar.VBottomBar.InterfaceC22702a
    /* JADX INFO: renamed from: a */
    public void mo41000a(VBottomBar.InterfaceC22703b interfaceC22703b) {
        TabName tabNameTransform = TabName.transform(interfaceC22703b.getTabName());
        if (tabNameTransform != null) {
            m40974G0(tabNameTransform);
        }
        this.f25227y.m41403j9();
    }

    /* JADX INFO: renamed from: a0 */
    public final /* synthetic */ void m41001a0(String str) {
        i4g0.m138492A("e_see_floating_bubble", "p_suggest_users_home_view", jyb.m147494Y("alertType", str), jyb.m147494Y("alertTextType", this.f25197D), jyb.m147494Y("tooltips_trigger_mode", "passive"), jyb.m147494Y("tooltips_type", "bubble"), jyb.m147494Y("tooltips_type_ui", "bubble_basic_with_icon"), jyb.m147494Y("tooltips_trigger_module", SeeSwitchName.message_tab), jyb.m147494Y("tooltips_trigger_page", "swipe_page"), jyb.m147494Y("tooltips_trigger_reason", "guide"));
    }

    @Override // p151v.bottombar.VBottomBar.InterfaceC22702a
    /* JADX INFO: renamed from: b */
    public boolean mo41002b(VBottomBar.InterfaceC22703b interfaceC22703b) {
        return !TextUtils.equals(TabName.Msg.toString(), interfaceC22703b.getTabName());
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m41003b0() {
        bnl0.m105525M0(this.f25211i, false);
        bnl0.m105525M0(this.f25212j, false);
        if (NullChecker.m82486a(this.f25194A)) {
            this.f25194A.call();
        }
    }

    @Override // p151v.bottombar.VBottomBar.InterfaceC22702a
    /* JADX INFO: renamed from: c */
    public void mo41004c(VBottomBar.InterfaceC22703b interfaceC22703b) {
        lc3 lc3VarMo68433Ys;
        TabName tabNameTransform = TabName.transform(interfaceC22703b.getTabName());
        if (tabNameTransform == null) {
            return;
        }
        m40974G0(tabNameTransform);
        if (!this.f25227y.m148843b1().equals(tabNameTransform)) {
            ((PutongAct) this.f25226x).hideDeepLinkFloatButton(true);
        }
        if (TabName.Post.equals(tabNameTransform)) {
            if (CoreModule.m30932N().isPostingMoment()) {
                return;
            }
            ((PutongAct) this.f25226x).pickMediasWithInstaPicker();
            return;
        }
        boolean zEquals = TabName.Card.equals(tabNameTransform);
        View view = this.f25216n;
        if (zEquals) {
            view.setVisibility(8);
        } else {
            view.setVisibility(0);
        }
        if (TabName.Me == tabNameTransform) {
            wtd0.m207833e().m207848s();
            wtd0.m207833e().m207844o();
        }
        if (tabNameTransform == TabName.Live) {
            CoreModule.m30934Q().mo68425Sf();
            if (this.f25227y.m41293J7() && (lc3VarMo68433Ys = CoreModule.m30934Q().mo68433Ys()) != null) {
                tft.m190984b(((NewMainAct) this.f25226x).m40808c6().f152156a, lc3VarMo68433Ys.m153619a(), lc3VarMo68433Ys.f131268b, lc3VarMo68433Ys.f131269c, lc3VarMo68433Ys.f131270d);
            }
        }
        this.f25227y.mo41360a1(tabNameTransform, true);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m41005c0(int[] iArr) {
        int iM105592y0;
        bnl0.C16067g c16067gM105562j0 = bnl0.m105562j0(this.f25198E.m40652n(TabName.Msg).getIconView(), this.f25204b);
        bnl0.C16067g c16067gM105562j1 = bnl0.m105562j0(this.f25212j, this.f25204b);
        int iM175859d = qa00.m175859d(40.0f);
        if (this.f25198E.m40656r()) {
            iM175859d = (c16067gM105562j1.f77561c / 2) - qa00.m175859d(6.0f);
        }
        int iM175859d2 = ((c16067gM105562j0.f77559a + (c16067gM105562j0.f77561c / 2)) - c16067gM105562j1.f77559a) - iM175859d;
        if (c16067gM105562j1.f77561c + iM175859d2 > bnl0.m105592y0()) {
            iM105592y0 = bnl0.m105592y0() - iM175859d2;
            iM175859d2 = ((c16067gM105562j0.f77559a + (c16067gM105562j0.f77561c / 2)) - c16067gM105562j1.f77559a) - ((iM105592y0 / 2) - qa00.m175859d(6.0f));
        } else {
            iM105592y0 = 0;
        }
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f25212j.getLayoutParams();
        layoutParams.leftMargin += iM175859d2;
        this.f25212j.setLayoutParams(layoutParams);
        bnl0.m105568m0(this.f25212j, iM175859d2, 0);
        if (iM105592y0 != 0) {
            this.f25215m.setWidth(iM105592y0);
        }
    }

    @Override // p151v.bottombar.VBottomBar.InterfaceC22702a
    /* JADX INFO: renamed from: d */
    public void mo41006d(VBottomBar.InterfaceC22703b interfaceC22703b) {
        TabName tabNameTransform = TabName.transform(interfaceC22703b.getTabName());
        if (tabNameTransform != null) {
            m40974G0(tabNameTransform);
        }
        this.f25227y.m41423o9();
    }

    /* JADX INFO: renamed from: d0 */
    public final /* synthetic */ void m41007d0() {
        bnl0.m105533Q0(this.f25212j, new y20() { // from class: l.qi30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f157796a.m41005c0((int[]) obj);
            }
        });
    }

    @Override // p153l.iam
    public void destroy() {
    }

    @Override // p151v.bottombar.VBottomBar.InterfaceC22702a
    /* JADX INFO: renamed from: e */
    public boolean mo41008e(VBottomBar.InterfaceC22703b interfaceC22703b) {
        return gra.m131606N3() && ExpandedCardStyleHelper.m39093o().m39106s();
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ void m41009e0(int[] iArr) {
        bnl0.C16067g c16067gM105562j0 = bnl0.m105562j0(this.f25198E.m40652n(TabName.Msg).getIconView(), this.f25204b);
        bnl0.C16067g c16067gM105562j1 = bnl0.m105562j0(this.f25211i, this.f25204b);
        int i = (c16067gM105562j0.f77559a - c16067gM105562j1.f77559a) + ((c16067gM105562j0.f77561c - c16067gM105562j1.f77561c) / 2);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f25211i.getLayoutParams();
        layoutParams.leftMargin += i;
        this.f25211i.setLayoutParams(layoutParams);
        bnl0.m105568m0(this.f25211i, i, 0);
    }

    @Override // p151v.bottombar.VBottomBar.InterfaceC22702a
    /* JADX INFO: renamed from: f */
    public boolean mo41010f(VBottomBar.InterfaceC22703b interfaceC22703b) {
        return CoreModule.m30934Q().mo68413M7() && !TabName.Live.name().equals(interfaceC22703b.getTabName());
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ void m41011f0() {
        bnl0.m105533Q0(this.f25211i, new y20() { // from class: l.pi30
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f152512a.m41009e0((int[]) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m41012g0() {
        bnl0.m105525M0(this.f25212j, true);
    }

    /* JADX INFO: renamed from: h0 */
    public final /* synthetic */ void m41013h0() {
        bnl0.m105525M0(this.f25212j, true);
    }

    /* JADX INFO: renamed from: i0 */
    public final /* synthetic */ void m41014i0() {
        this.f25212j.setScaleX(0.0f);
        this.f25212j.setScaleY(0.0f);
        bnl0.m105525M0(this.f25212j, true);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m40966B(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j0 */
    public final /* synthetic */ void m41015j0() {
        bnl0.m105525M0(this.f25211i, true);
    }

    /* JADX INFO: renamed from: k0 */
    public final /* synthetic */ void m41016k0(BottomBarManager.DotType dotType, boolean z, int i, String str) {
        ue60 ue60VarM201037d = ve60.m201037d();
        sfj0.m185607n(str, ue60VarM201037d == null ? "" : ue60VarM201037d.m195739c(), sfj0.C20032a.m185615h("red_dot_type", this.f25200G.call(dotType)), sfj0.C20032a.m185613f("red_dot_status", z ? 1 : 0), sfj0.C20032a.m185613f("numbers_on_bubble", i));
    }

    /* JADX INFO: renamed from: l0 */
    public void m41017l0() {
        if (NullChecker.m82486a(this.f25227y)) {
            m41019n0();
            ner nerVarM41440t6 = this.f25227y.m41440t6(TabName.Card);
            if (nerVarM41440t6 instanceof cvl) {
                nerVarM41440t6 = ((cvl) nerVarM41440t6).mo39563Y();
            }
            if (nerVarM41440t6 instanceof NewNewHomeFrag) {
                ((NewNewHomeFrag) nerVarM41440t6).f22420C.m38377w5();
            }
        }
    }

    /* JADX INFO: renamed from: m0 */
    public void m41018m0(TabName tabName) {
        if (gra.m131778z()) {
            this.f25204b.setBackgroundColor(-1);
            bnl0.m105524M(this.f25205c, true);
            if (tabName == TabName.Card) {
                this.f25205c.setImageResource(dbc0.f86168G);
                return;
            }
            if (tabName == TabName.FEATURED) {
                this.f25205c.setImageResource(dbc0.f86200H);
                return;
            }
            if (tabName == TabName.Msg) {
                this.f25205c.setImageResource(dbc0.f86328L);
                return;
            }
            if (tabName == TabName.Moment) {
                this.f25205c.setImageResource(dbc0.f86296K);
            } else if (tabName == TabName.Me) {
                this.f25205c.setImageResource(dbc0.f86264J);
            } else if (tabName == TabName.Live) {
                this.f25205c.setImageResource(dbc0.f86232I);
            }
        }
    }

    /* JADX INFO: renamed from: n0 */
    public void m41019n0() {
        if (this.f25210h == null) {
            return;
        }
        boolean zM37166x = NavigationBarAdmobHelper.INSTANCE.m37166x();
        NavigationBarAdView navigationBarAdView = this.f25210h;
        if (zM37166x) {
            navigationBarAdView.m30997E();
        } else {
            navigationBarAdView.m30999G();
        }
    }

    /* JADX INFO: renamed from: o0 */
    public void m41020o0(pf60<TabName, Boolean> pf60Var) {
        this.f25198E.m40637B(pf60Var);
    }

    /* JADX INFO: renamed from: p0 */
    public void m41021p0(TabName tabName, boolean z) {
        m40976H0(tabName, BottomBarManager.DotType.Dot, z, 0);
        this.f25198E.m40638C(tabName, z);
    }

    /* JADX INFO: renamed from: q0 */
    public void m41022q0(boolean z) {
        this.f25198E.m40639D(z);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0060  */
    /* JADX WARN: Code duplicated, block: B:16:? A[RETURN, SYNTHETIC] */
    /* JADX INFO: renamed from: r0 */
    public void m41023r0(TabName tabName, IconDotType iconDotType) {
        int i;
        VImage vImage = this.f25198E.m40652n(tabName).f210454e;
        bnl0.m105538V(vImage, qa00.m175859d(17.0f));
        int i2 = C8246d.f25232a[iconDotType.ordinal()];
        int i3 = 0;
        if (i2 == 1) {
            i = dbc0.f86059Ci;
            bnl0.m105507D0(qa00.m175859d(29.0f), vImage);
        } else {
            if (i2 != 2) {
                if (i2 == 3) {
                    i = dbc0.f87366r;
                    bnl0.m105507D0(qa00.m175859d(20.0f), vImage);
                }
                if (i3 > 0) {
                    this.f25198E.m40640E(tabName, i3);
                    this.f25202I = iconDotType;
                }
            }
            i = dbc0.f86399N6;
            bnl0.m105507D0(qa00.m175859d(42.0f), vImage);
            bnl0.m105538V(vImage, qa00.m175859d(12.0f));
        }
        i3 = i;
        if (i3 > 0) {
            this.f25198E.m40640E(tabName, i3);
            this.f25202I = iconDotType;
        }
    }

    /* JADX INFO: renamed from: s0 */
    public void m41024s0(boolean z) {
        bnl0.m105524M(this.f25209g, z);
        NavigationBarAdView navigationBarAdView = this.f25210h;
        if (z) {
            navigationBarAdView.m30999G();
        } else {
            navigationBarAdView.m30997E();
        }
    }

    /* JADX INFO: renamed from: t0 */
    public void m41025t0(boolean z, String str) {
        m41024s0(z);
        if (ConversationsTabFrag.f25933H0.equals(str)) {
            if (gra.m131606N3() && TabName.Card.equals(this.f25227y.m148843b1())) {
                z = false;
            }
            bnl0.m105524M(this.f25216n, z);
            View view = this.f25216n;
            int i = ji30.f121041f;
            NavigationBarAdmobHelper navigationBarAdmobHelper = NavigationBarAdmobHelper.INSTANCE;
            bnl0.m105537U(view, i + navigationBarAdmobHelper.m37153k());
            bnl0.m105537U(this.f25207e, (z ? ji30.f121041f : 0) + navigationBarAdmobHelper.m37153k());
        }
    }

    /* JADX INFO: renamed from: u0 */
    public void m41026u0(boolean z) {
        bnl0.m105524M(this.f25226x.toolbar(), z);
    }

    /* JADX INFO: renamed from: v0 */
    public void m41027v0(TabName tabName, int i) {
        m41028w0(tabName, i, -1);
    }

    /* JADX INFO: renamed from: w0 */
    public void m41028w0(TabName tabName, int i, @DrawableRes int i2) {
        m40976H0(tabName, BottomBarManager.DotType.Num, i > 0, i);
        this.f25198E.m40643H(tabName, i, i2);
    }

    /* JADX INFO: renamed from: x0 */
    public void m41029x0(TabName tabName, @DrawableRes int i) {
        this.f25198E.m40644I(tabName, i);
    }

    /* JADX INFO: renamed from: y0 */
    public void m41030y0(CharSequence charSequence, String str, Figure figure, final String str2, double d, x20 x20Var) {
        this.f25196C = str2;
        this.f25194A = x20Var;
        m40969D0(NavigationBarAdmobHelper.INSTANCE.m37153k());
        boolean zM139914a = ige0.m139914a(CoreModule.f18264c.f20381e0.m116600p9());
        if (zM139914a) {
            if (NullChecker.m82486a(figure) && TEnum.equals(figure.type, "distance") && figure.total > 0) {
                this.f25215m.setText(charSequence);
                this.f25197D = figure.type.toString();
            } else if (!NullChecker.m82486a(figure) || TEnum.equals(figure.type, "number") || !NullChecker.m82486a(figure.message) || TextUtils.isEmpty(figure.message.template)) {
                this.f25215m.setText(e1b.m118957O0(charSequence.toString(), Color.parseColor("#ff3200"), Typeface.create("sans-serif", 3)));
                this.f25197D = "number";
            } else {
                this.f25215m.setText(e1b.m118945C0(figure));
                this.f25197D = figure.type.toString();
            }
            bnl0.m105525M0(this.f25214l, pzi0.m174446K(d));
        } else {
            this.f25215m.setText(charSequence);
            this.f25197D = "number";
        }
        if (!TextUtils.isEmpty(str)) {
            if (zM139914a && rbb0.m180744q()) {
                uqb0.f180374G.m127120O(this.f25213k, str, 2, 100);
            } else {
                uqb0.f180374G.m127115L0(this.f25213k, str);
            }
        }
        if (NullChecker.m82486a(this.f25228z)) {
            if (this.f25228z.isRunning()) {
                return;
            }
            bnl0.m105525M0(this.f25211i, false);
            bnl0.m105525M0(this.f25212j, false);
            this.f25228z.setStartDelay(0L);
            this.f25228z.start();
            return;
        }
        l51.m152887G(new Runnable() { // from class: l.wi30
            @Override // java.lang.Runnable
            public final void run() {
                this.f189334a.m41007d0();
            }
        });
        l51.m152887G(new Runnable() { // from class: l.xi30
            @Override // java.lang.Runnable
            public final void run() {
                this.f194431a.m41011f0();
            }
        });
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        Animator animatorM132173s = gt0.m132173s(gt0.m132170p(this.f25211i, "alpha", 0L, 200L, linearInterpolator, 0.0f, 1.0f), gt0.m132164j(1100), gt0.m132170p(this.f25211i, "alpha", 0L, 200L, linearInterpolator, 1.0f, 0.0f));
        Animator animatorM132173s2 = gt0.m132173s(gt0.m132170p(this.f25211i, "translationY", 0L, 500L, linearInterpolator, 0.0f, -this.f25195B), gt0.m132164j(200), gt0.m132170p(this.f25211i, "translationY", 0L, 800L, linearInterpolator, -this.f25195B, 0.0f));
        Animator animatorM132173s3 = gt0.m132173s(gt0.m132166l(this.f25211i, gt0.f106354i, 0L, 500L, linearInterpolator, 1.0f, 2.4f), gt0.m132164j(200), gt0.m132166l(this.f25211i, gt0.f106354i, 0L, 800L, linearInterpolator, 2.4f, 1.0f));
        Animator animatorM132170p = gt0.m132170p(this.f25211i, BLiveGiftItem.TYPE_ROTATION, 0L, 1500L, linearInterpolator, 0.0f, 720.0f);
        if (!zM139914a) {
            this.f25212j.setPivotX(qa00.m175859d(20.0f));
            this.f25212j.setPivotY(qa00.m175859d(40.0f));
        }
        Animator animatorM132170p2 = gt0.m132170p(this.f25212j, "alpha", 1500L, 400L, linearInterpolator, 0.0f, 1.0f);
        VLinear vLinear = this.f25212j;
        Animator animatorM132170p3 = zM139914a ? gt0.m132170p(vLinear, "translationY", 0L, 4600L, linearInterpolator, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 0.0f) : gt0.m132170p(vLinear, "translationY", 0L, 2000L, linearInterpolator, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 1.0f, -1.0f, 0.0f);
        Animator animatorM132170p4 = gt0.m132170p(this.f25212j, "alpha", 0L, 500L, linearInterpolator, 1.0f, 0.0f);
        Animator animatorM132166l = gt0.m132166l(this.f25212j, gt0.f106354i, 1500L, 400L, linearInterpolator, 0.0f, 1.0f);
        Animator animatorM132170p5 = gt0.m132170p(this.f25212j, "translationY", 1500L, 400L, linearInterpolator, qa00.m175859d(24.0f), 0.0f);
        Animator animatorM132173s4 = gt0.m132173s(animatorM132170p2, animatorM132170p3, animatorM132170p4);
        this.f25228z = gt0.m132180z(animatorM132173s, animatorM132173s2, animatorM132173s3, animatorM132170p, gt0.m132180z(animatorM132173s4, animatorM132166l, animatorM132170p5));
        gt0.m132176v(animatorM132170p5, new Runnable() { // from class: l.yi30
            @Override // java.lang.Runnable
            public final void run() {
                this.f200012a.m41012g0();
            }
        });
        gt0.m132160f(animatorM132173s4, new Runnable() { // from class: l.zi30
            @Override // java.lang.Runnable
            public final void run() {
                this.f204493a.m41013h0();
            }
        });
        gt0.m132160f(animatorM132170p, new Runnable() { // from class: l.li30
            @Override // java.lang.Runnable
            public final void run() {
                this.f132176a.m41014i0();
            }
        });
        gt0.m132176v(animatorM132170p, new Runnable() { // from class: l.mi30
            @Override // java.lang.Runnable
            public final void run() {
                this.f136926a.m41015j0();
            }
        });
        gt0.m132177w(this.f25228z, new Runnable() { // from class: l.ni30
            @Override // java.lang.Runnable
            public final void run() {
                this.f142086a.m41001a0(str2);
            }
        }, new Runnable() { // from class: l.oi30
            @Override // java.lang.Runnable
            public final void run() {
                this.f147508a.m41003b0();
            }
        });
        if (ShareConstants.OLD_VERSION.equals(str2)) {
            this.f25228z.setStartDelay(1000L);
        }
        this.f25228z.start();
    }

    /* JADX INFO: renamed from: z0 */
    public void m41031z0(PopGuide popGuide) {
        m6i.m157231f(getAct(), this.f25204b, this.f25198E.m40652n(TabName.Moment).getIconView(), popGuide);
    }
}
