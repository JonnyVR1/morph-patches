package p003l;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.google.android.material.tabs.TabLayout;
import com.p000p1.mobile.putong.core.data.CoreGiftInfo;
import com.p000p1.mobile.putong.core.data.GiftSubBizType;
import com.p000p1.mobile.putong.core.p001ui.gift.layer.CoreGiftLayer;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.businessdata.NewGiftInfoPanelWrapper;
import com.p1.mobile.putong.data.CoreGiftPanelName;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.aq0;
import l.d30;
import l.e51;
import l.ei2;
import l.eqh0;
import l.j760;
import l.l6j;
import l.mji0;
import l.ngm;
import l.qe2;
import l.s7m;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import l.zz6;
import v.VDraweeView;
import v.VFrame;
import v.VPager;
import v.VProgressBar;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class bs20 implements s7m<rr20> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f3441a;

    /* JADX INFO: renamed from: b */
    public CoreGiftLayer f3442b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f3443c;

    /* JADX INFO: renamed from: d */
    public VText f3444d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f3445e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f3446f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f3447g;

    /* JADX INFO: renamed from: h */
    public TextView f3448h;

    /* JADX INFO: renamed from: i */
    public VFrame f3449i;

    /* JADX INFO: renamed from: j */
    public VText f3450j;

    /* JADX INFO: renamed from: k */
    public TabLayout f3451k;

    /* JADX INFO: renamed from: l */
    public VPager f3452l;

    /* JADX INFO: renamed from: m */
    public rr20 f3453m;

    /* JADX INFO: renamed from: n */
    public Act f3454n;

    /* JADX INFO: renamed from: o */
    public List<NewGiftInfoPanelWrapper> f3455o;

    /* JADX INFO: renamed from: p */
    public Runnable f3456p;

    /* JADX INFO: renamed from: q */
    public Runnable f3457q;

    /* JADX INFO: renamed from: r */
    public int f3458r = -1;

    /* JADX INFO: renamed from: s */
    public ir20 f3459s;

    /* JADX INFO: renamed from: l.bs20$c */
    public class ViewTreeObserverOnGlobalLayoutListenerC3307c implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC3307c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            bs20.this.m5795l();
            bs20.this.f3441a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public bs20(Act act) {
        this.f3454n = act;
    }

    /* JADX INFO: renamed from: A */
    private void m5786A(boolean z) {
        xdl0.M(this.f3442b, z);
        xdl0.M(this.f3444d, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m5795l() {
        if (this.f3458r != this.f3441a.getHeight()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f3442b.getLayoutParams();
            marginLayoutParams.height = this.f3453m.m9175v().f4499t;
            marginLayoutParams.topMargin = -((this.f3453m.m9175v().f4499t + marginLayoutParams.bottomMargin) - this.f3441a.getHeight());
            this.f3442b.setLayoutParams(marginLayoutParams);
        }
        this.f3458r = this.f3441a.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m5796n(View view) {
        zvf0.r("e_chat_gift_bar_recharge", this.f3453m.m9175v().m6500L());
        if (this.f3453m.m9175v().m6496G() != CoreGiftPanelName.get("note")) {
            CoreModule.P().i().n4(this.f3454n, ftj.m6508b(this.f3453m.m9175v().m6500L(), "e_recharge"));
            return;
        }
        if (TextUtils.equals(this.f3453m.m9175v().m6495F(), "from_meet_picks")) {
            CoreModule.P().i().n4(this.f3454n, "p_meet_view,e_meet_gift_bar_picks,click");
        } else if (TextUtils.equals(this.f3453m.m9175v().m6495F(), "from_meet_liked")) {
            CoreModule.P().i().n4(this.f3454n, "p_meet_view,e_meet_gift_bar_ilike,click");
        } else {
            CoreModule.P().i().n4(this.f3454n, "p_meet_view,e_meet_gift_bar,click");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m5797p(View view) {
        if (!this.f3442b.m2777o()) {
            this.f3453m.m9175v().cancel();
        } else {
            this.f3442b.m2773F();
            m5786A(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m5798q() {
        m5786A(false);
        this.f3456p = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m5799s(CoreGiftInfo coreGiftInfo) {
        m5795l();
        m5786A(true);
        this.f3442b.m2785w(coreGiftInfo, new d30() { // from class: l.xr20
            public final void call() {
                this.f8564a.m5798q();
            }
        });
        boolean zIsEmpty = TextUtils.isEmpty(coreGiftInfo.extra.shopGuide);
        VText vText = this.f3444d;
        if (zIsEmpty) {
            vText.setText("这个礼物很受欢迎哦");
        } else {
            vText.setText(coreGiftInfo.extra.shopGuide);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m5800u() {
        m5786A(false);
    }

    /* JADX INFO: renamed from: B */
    public void m5801B(String str) {
        xdl0.M(this.f3444d, true);
        this.f3444d.setText(str);
        if (NullChecker.a(this.f3457q)) {
            e51.J(this.f3457q);
        }
        Act act = this.f3454n;
        Runnable runnable = new Runnable() { // from class: l.as20
            @Override // java.lang.Runnable
            public final void run() {
                this.f2873a.m5800u();
            }
        };
        this.f3457q = runnable;
        e51.H(act, runnable, 1500L);
    }

    /* JADX INFO: renamed from: C */
    public void m5802C() {
        this.f3442b.m2772E();
        m5786A(false);
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m5803C0() {
        return this.f3454n;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m5805k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m5805k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cs20.m5996b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void m5804i1(rr20 rr20Var) {
        this.f3453m = rr20Var;
    }

    /* JADX INFO: renamed from: r */
    public void m5807r() {
        xdl0.M0(this.f3446f, true);
        this.f3442b.setEnableFrameCheck(true);
        VPager vPager = this.f3452l;
        ir20 ir20VarM6497H = this.f3453m.m9175v().m6497H();
        this.f3459s = ir20VarM6497H;
        vPager.setAdapter(ir20VarM6497H);
        this.f3452l.d(new C3305a());
        this.f3449i.setOnClickListener(new View.OnClickListener() { // from class: l.yr20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9114a.m5796n(view);
            }
        });
        if (this.f3453m.m9175v().m6496G() == CoreGiftPanelName.get("note")) {
            xdl0.M(this.f3451k, false);
            xdl0.M(this.f3450j, true);
            String str = zz6.u0() ? "他" : "她";
            this.f3448h.setText(String.format("%s今天收到太多招呼了", str));
            this.f3448h.setTypeface(Typeface.DEFAULT_BOLD);
            xdl0.V(this.f3448h, t100.d(12.0f));
            xdl0.V(this.f3450j, t100.d(20.0f));
            this.f3450j.setText(String.format("先关注%s或送个小礼物让%s注意到你吧", str, str));
        } else {
            CoreGiftPanelName coreGiftPanelNameM6496G = this.f3453m.m9175v().m6496G();
            CoreGiftPanelName coreGiftPanelName = CoreGiftPanelName.get(GiftSubBizType.greet);
            TabLayout tabLayout = this.f3451k;
            if (coreGiftPanelNameM6496G == coreGiftPanelName) {
                xdl0.M(tabLayout, false);
                xdl0.M(this.f3450j, true);
                User userPa = CoreModule.c.e0.Pa(this.f3453m.m9175v().m6501N());
                boolean zIsFemale = NullChecker.a(userPa) ? true ^ userPa.isFemale() : true;
                this.f3448h.setText(qdm.m8975b(zIsFemale));
                this.f3450j.setText(qdm.m8974a(zIsFemale));
                this.f3448h.setTypeface(Typeface.DEFAULT_BOLD);
                xdl0.V(this.f3448h, t100.d(12.0f));
                xdl0.V(this.f3450j, t100.d(20.0f));
            } else {
                xdl0.M(tabLayout, true);
                xdl0.M(this.f3450j, false);
                this.f3451k.setTabMode(0);
                this.f3451k.setSelectedTabIndicator(c3c0.f3748c0);
                this.f3451k.setSelectedTabIndicatorColor(this.f3454n.getResources().getColor(a1c0.f2707o));
                this.f3451k.setTabIndicatorFullWidth(false);
                this.f3451k.setTabRippleColorResource(a1c0.f2689Y);
                this.f3451k.setSelectedTabIndicatorHeight(t100.d(12.0f));
                this.f3451k.setTabGravity(0);
                this.f3451k.addOnTabSelectedListener(new C3306b());
                this.f3451k.setupWithViewPager(this.f3452l);
            }
        }
        this.f3452l.setScrollble(false);
        xdl0.E0(this.f3443c, new View.OnClickListener() { // from class: l.zr20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9319a.m5797p(view);
            }
        });
        this.f3452l.setOffscreenPageLimit(10);
        this.f3441a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC3307c());
    }

    /* JADX INFO: renamed from: v */
    public void m5808v() {
        CoreGiftPanelName coreGiftPanelNameM6496G = this.f3453m.m9175v().m6496G();
        CoreGiftPanelName coreGiftPanelName = CoreGiftPanelName.get("note");
        VDraweeView vDraweeView = this.f3447g;
        if (coreGiftPanelNameM6496G == coreGiftPanelName) {
            xdl0.M(vDraweeView, false);
            return;
        }
        xdl0.M(vDraweeView, false);
        this.f3447g.setController(l6j.g().N(Uri.parse("asset:///core_giftpanel_ic_gif.gif")).E(this.f3447g.getController()).z(true).B(new C3308d()).c());
    }

    /* JADX INFO: renamed from: w */
    public void m5809w(final CoreGiftInfo coreGiftInfo) {
        if (NullChecker.a(this.f3457q)) {
            e51.J(this.f3457q);
            this.f3457q = null;
        }
        if (NullChecker.a(this.f3456p)) {
            e51.J(this.f3456p);
        }
        Act act = this.f3454n;
        Runnable runnable = new Runnable() { // from class: l.wr20
            @Override // java.lang.Runnable
            public final void run() {
                this.f8230a.m5799s(coreGiftInfo);
            }
        };
        this.f3456p = runnable;
        e51.H(act, runnable, 150L);
    }

    /* JADX INFO: renamed from: x */
    public void m5810x(List<NewGiftInfoPanelWrapper> list) {
        this.f3455o = list;
        xdl0.M0(this.f3446f, false);
        this.f3453m.m9175v().m6497H().m7290q(list);
    }

    /* JADX INFO: renamed from: y */
    public void m5811y(String str, String str2) {
        this.f3448h.setText(str);
        this.f3450j.setText(str2);
    }

    /* JADX INFO: renamed from: z */
    public void m5812z(TabLayout.Tab tab) {
        if (tab.getCustomView() == null) {
            TextView textView = new TextView(this.f3454n);
            textView.setText(tab.getText());
            textView.getPaint().setFakeBoldText(false);
            textView.setGravity(17);
            textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            tab.setCustomView(textView);
        }
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.bs20$a */
    public class C3305a implements ViewPager.j {
        public C3305a() {
        }

        public void onPageSelected(int i) {
            int i2 = i + 1;
            zvf0.A("e_gift_bar", bs20.this.f3453m.m9175v().m6500L(), new j760[]{vwb.Y("giftBarPageId", Integer.valueOf(i2)), vwb.Y("gift_bar_tab", "default")});
            zvf0.w("e_gift_bar", bs20.this.f3453m.m9175v().m6500L(), new j760[]{vwb.Y("giftBarPageId", Integer.valueOf(i2)), vwb.Y("gift_bar_tab", "default")});
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    /* JADX INFO: renamed from: l.bs20$b */
    public class C3306b implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a */
        public boolean f3461a = false;

        public C3306b() {
        }

        public void onTabSelected(TabLayout.Tab tab) {
            int selectedTabPosition = bs20.this.f3451k.getSelectedTabPosition();
            bs20.this.m5812z(tab);
            TextView textView = (TextView) tab.getCustomView();
            mji0.o(textView, x7c0.f8386m);
            textView.setTypeface(eqh0.c(3));
            if (this.f3461a) {
                zvf0.u("e_chat_gift_bar_tab", bs20.this.f3453m.m9175v().m6500L(), new j760[]{vwb.Y("gift_tab_type", ((NewGiftInfoPanelWrapper) bs20.this.f3455o.get(selectedTabPosition)).panel.name)});
            }
            this.f3461a = true;
        }

        public void onTabUnselected(TabLayout.Tab tab) {
            bs20.this.m5812z(tab);
            ((TextView) tab.getCustomView()).setTypeface(Typeface.DEFAULT);
            mji0.o((TextView) tab.getCustomView(), x7c0.f8387n);
        }

        public void onTabReselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: renamed from: l.bs20$d */
    public class C3308d extends ei2<ngm> {

        /* JADX INFO: renamed from: l.bs20$d$a */
        public class a extends qe2 {

            /* JADX INFO: renamed from: a */
            public int f3465a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f3466b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ aq0 f3467c;

            public a(int i, aq0 aq0Var) {
                this.f3466b = i;
                this.f3467c = aq0Var;
            }

            /* JADX INFO: renamed from: a */
            public void m5816a(@NonNull Drawable drawable, int i) {
                int i2 = this.f3465a;
                if ((i2 != 0 || this.f3466b > 1) && i2 <= i) {
                    this.f3465a = i;
                } else {
                    this.f3467c.stop();
                }
            }

            public void onAnimationStart(@NonNull Drawable drawable) {
                this.f3465a = -1;
            }
        }

        public C3308d() {
        }

        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void m5814e(String str, ngm ngmVar, Animatable animatable) {
            if (animatable == null || !aq0.class.isInstance(animatable)) {
                return;
            }
            aq0 aq0Var = (aq0) animatable;
            aq0Var.j(new a(aq0Var.e(), aq0Var));
        }

        /* JADX INFO: renamed from: d */
        public void m5813d(String str, Throwable th) {
        }
    }
}
