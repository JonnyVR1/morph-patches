package p149l;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.businessdata.NewGiftInfoPanelWrapper;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.p053ui.gift.layer.CoreGiftLayer;
import com.p046p1.mobile.putong.data.CoreGiftPanelName;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VDraweeView;
import p147v.VFrame;
import p147v.VPager;
import p147v.VProgressBar;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class bs20 implements s7m<rr20> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f76974a;

    /* JADX INFO: renamed from: b */
    public CoreGiftLayer f76975b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f76976c;

    /* JADX INFO: renamed from: d */
    public VText f76977d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f76978e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f76979f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f76980g;

    /* JADX INFO: renamed from: h */
    public TextView f76981h;

    /* JADX INFO: renamed from: i */
    public VFrame f76982i;

    /* JADX INFO: renamed from: j */
    public VText f76983j;

    /* JADX INFO: renamed from: k */
    public TabLayout f76984k;

    /* JADX INFO: renamed from: l */
    public VPager f76985l;

    /* JADX INFO: renamed from: m */
    public rr20 f76986m;

    /* JADX INFO: renamed from: n */
    public Act f76987n;

    /* JADX INFO: renamed from: o */
    public List<NewGiftInfoPanelWrapper> f76988o;

    /* JADX INFO: renamed from: p */
    public Runnable f76989p;

    /* JADX INFO: renamed from: q */
    public Runnable f76990q;

    /* JADX INFO: renamed from: r */
    public int f76991r = -1;

    /* JADX INFO: renamed from: s */
    public ir20 f76992s;

    /* JADX INFO: renamed from: l.bs20$c */
    public class ViewTreeObserverOnGlobalLayoutListenerC15952c implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC15952c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            bs20.this.m103636l();
            bs20.this.f76974a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public bs20(Act act) {
        this.f76987n = act;
    }

    /* JADX INFO: renamed from: A */
    private void m103627A(boolean z) {
        xdl0.m208344M(this.f76975b, z);
        xdl0.m208344M(this.f76977d, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m103636l() {
        if (this.f76991r != this.f76974a.getHeight()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f76975b.getLayoutParams();
            marginLayoutParams.height = this.f76986m.m180538v().f98888t;
            marginLayoutParams.topMargin = -((this.f76986m.m180538v().f98888t + marginLayoutParams.bottomMargin) - this.f76974a.getHeight());
            this.f76975b.setLayoutParams(marginLayoutParams);
        }
        this.f76991r = this.f76974a.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m103637n(View view) {
        zvf0.m220396r("e_chat_gift_bar_recharge", this.f76986m.m180538v().m122799L());
        if (this.f76986m.m180538v().m122795G() != CoreGiftPanelName.get("note")) {
            CoreModule.m29935P().m94658i().mo158416n4(this.f76987n, ftj.m123057b(this.f76986m.m180538v().m122799L(), "e_recharge"));
            return;
        }
        if (TextUtils.equals(this.f76986m.m180538v().m122794F(), "from_meet_picks")) {
            CoreModule.m29935P().m94658i().mo158416n4(this.f76987n, "p_meet_view,e_meet_gift_bar_picks,click");
        } else if (TextUtils.equals(this.f76986m.m180538v().m122794F(), "from_meet_liked")) {
            CoreModule.m29935P().m94658i().mo158416n4(this.f76987n, "p_meet_view,e_meet_gift_bar_ilike,click");
        } else {
            CoreModule.m29935P().m94658i().mo158416n4(this.f76987n, "p_meet_view,e_meet_gift_bar,click");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m103638p(View view) {
        if (!this.f76975b.m45447o()) {
            this.f76986m.m180538v().cancel();
        } else {
            this.f76975b.m45443F();
            m103627A(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m103639q() {
        m103627A(false);
        this.f76989p = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m103640s(CoreGiftInfo coreGiftInfo) {
        m103636l();
        m103627A(true);
        this.f76975b.m45455w(coreGiftInfo, new d30() { // from class: l.xr20
            @Override // p149l.d30
            public final void call() {
                this.f194081a.m103639q();
            }
        });
        boolean zIsEmpty = TextUtils.isEmpty(coreGiftInfo.extra.shopGuide);
        VText vText = this.f76977d;
        if (zIsEmpty) {
            vText.setText("这个礼物很受欢迎哦");
        } else {
            vText.setText(coreGiftInfo.extra.shopGuide);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m103641u() {
        m103627A(false);
    }

    /* JADX INFO: renamed from: B */
    public void m103642B(String str) {
        xdl0.m208344M(this.f76977d, true);
        this.f76977d.setText(str);
        if (NullChecker.m81303a(this.f76990q)) {
            e51.m114745J(this.f76990q);
        }
        Act act = this.f76987n;
        Runnable runnable = new Runnable() { // from class: l.as20
            @Override // java.lang.Runnable
            public final void run() {
                this.f71380a.m103641u();
            }
        };
        this.f76990q = runnable;
        e51.m114743H(act, runnable, 1500L);
    }

    /* JADX INFO: renamed from: C */
    public void m103643C() {
        this.f76975b.m45442E();
        m103627A(false);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f76987n;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m103644k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m103644k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return cs20.m108476b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(rr20 rr20Var) {
        this.f76986m = rr20Var;
    }

    /* JADX INFO: renamed from: r */
    public void m103646r() {
        xdl0.m208345M0(this.f76979f, true);
        this.f76975b.setEnableFrameCheck(true);
        VPager vPager = this.f76985l;
        ir20 ir20VarM122796H = this.f76986m.m180538v().m122796H();
        this.f76992s = ir20VarM122796H;
        vPager.setAdapter(ir20VarM122796H);
        this.f76985l.m4185d(new C15950a());
        this.f76982i.setOnClickListener(new View.OnClickListener() { // from class: l.yr20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f199625a.m103637n(view);
            }
        });
        if (this.f76986m.m180538v().m122795G() == CoreGiftPanelName.get("note")) {
            xdl0.m208344M(this.f76984k, false);
            xdl0.m208344M(this.f76983j, true);
            String str = zz6.m221004u0() ? "他" : "她";
            this.f76981h.setText(String.format("%s今天收到太多招呼了", str));
            this.f76981h.setTypeface(Typeface.DEFAULT_BOLD);
            xdl0.m208358V(this.f76981h, t100.m186890d(12.0f));
            xdl0.m208358V(this.f76983j, t100.m186890d(20.0f));
            this.f76983j.setText(String.format("先关注%s或送个小礼物让%s注意到你吧", str, str));
        } else {
            CoreGiftPanelName coreGiftPanelNameM122795G = this.f76986m.m180538v().m122795G();
            CoreGiftPanelName coreGiftPanelName = CoreGiftPanelName.get("greet");
            TabLayout tabLayout = this.f76984k;
            if (coreGiftPanelNameM122795G == coreGiftPanelName) {
                xdl0.m208344M(tabLayout, false);
                xdl0.m208344M(this.f76983j, true);
                User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(this.f76986m.m180538v().m122800N());
                boolean zIsFemale = NullChecker.m81303a(userM169430Pa) ? true ^ userM169430Pa.isFemale() : true;
                this.f76981h.setText(qdm.m174046b(zIsFemale));
                this.f76983j.setText(qdm.m174045a(zIsFemale));
                this.f76981h.setTypeface(Typeface.DEFAULT_BOLD);
                xdl0.m208358V(this.f76981h, t100.m186890d(12.0f));
                xdl0.m208358V(this.f76983j, t100.m186890d(20.0f));
            } else {
                xdl0.m208344M(tabLayout, true);
                xdl0.m208344M(this.f76983j, false);
                this.f76984k.setTabMode(0);
                this.f76984k.setSelectedTabIndicator(c3c0.f78711c0);
                this.f76984k.setSelectedTabIndicatorColor(this.f76987n.getResources().getColor(a1c0.f67161o));
                this.f76984k.setTabIndicatorFullWidth(false);
                this.f76984k.setTabRippleColorResource(a1c0.f67143Y);
                this.f76984k.setSelectedTabIndicatorHeight(t100.m186890d(12.0f));
                this.f76984k.setTabGravity(0);
                this.f76984k.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C15951b());
                this.f76984k.setupWithViewPager(this.f76985l);
            }
        }
        this.f76985l.setScrollble(false);
        xdl0.m208329E0(this.f76976c, new View.OnClickListener() { // from class: l.zr20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f204452a.m103638p(view);
            }
        });
        this.f76985l.setOffscreenPageLimit(10);
        this.f76974a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC15952c());
    }

    /* JADX INFO: renamed from: v */
    public void m103647v() {
        CoreGiftPanelName coreGiftPanelNameM122795G = this.f76986m.m180538v().m122795G();
        CoreGiftPanelName coreGiftPanelName = CoreGiftPanelName.get("note");
        VDraweeView vDraweeView = this.f76980g;
        if (coreGiftPanelNameM122795G == coreGiftPanelName) {
            xdl0.m208344M(vDraweeView, false);
            return;
        }
        xdl0.m208344M(vDraweeView, false);
        this.f76980g.setController(l6j.m148750g().mo121501a(Uri.parse("asset:///core_giftpanel_ic_gif.gif")).mo8210b(this.f76980g.getController()).m8233z(true).m8204B(new C15953d()).build());
    }

    /* JADX INFO: renamed from: w */
    public void m103648w(final CoreGiftInfo coreGiftInfo) {
        if (NullChecker.m81303a(this.f76990q)) {
            e51.m114745J(this.f76990q);
            this.f76990q = null;
        }
        if (NullChecker.m81303a(this.f76989p)) {
            e51.m114745J(this.f76989p);
        }
        Act act = this.f76987n;
        Runnable runnable = new Runnable() { // from class: l.wr20
            @Override // java.lang.Runnable
            public final void run() {
                this.f187754a.m103640s(coreGiftInfo);
            }
        };
        this.f76989p = runnable;
        e51.m114743H(act, runnable, 150L);
    }

    /* JADX INFO: renamed from: x */
    public void m103649x(List<NewGiftInfoPanelWrapper> list) {
        this.f76988o = list;
        xdl0.m208345M0(this.f76979f, false);
        this.f76986m.m180538v().m122796H().m137819q(list);
    }

    /* JADX INFO: renamed from: y */
    public void m103650y(String str, String str2) {
        this.f76981h.setText(str);
        this.f76983j.setText(str2);
    }

    /* JADX INFO: renamed from: z */
    public void m103651z(TabLayout.Tab tab) {
        if (tab.getCustomView() == null) {
            TextView textView = new TextView(this.f76987n);
            textView.setText(tab.getText());
            textView.getPaint().setFakeBoldText(false);
            textView.setGravity(17);
            textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            tab.setCustomView(textView);
        }
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.bs20$a */
    public class C15950a implements ViewPager.InterfaceC0716j {
        public C15950a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            int i2 = i + 1;
            zvf0.m220368A("e_gift_bar", bs20.this.f76986m.m180538v().m122799L(), vwb.m200311Y("giftBarPageId", Integer.valueOf(i2)), vwb.m200311Y("gift_bar_tab", "default"));
            zvf0.m220401w("e_gift_bar", bs20.this.f76986m.m180538v().m122799L(), vwb.m200311Y("giftBarPageId", Integer.valueOf(i2)), vwb.m200311Y("gift_bar_tab", "default"));
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    /* JADX INFO: renamed from: l.bs20$b */
    public class C15951b implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a */
        public boolean f76994a = false;

        public C15951b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            int selectedTabPosition = bs20.this.f76984k.getSelectedTabPosition();
            bs20.this.m103651z(tab);
            TextView textView = (TextView) tab.getCustomView();
            mji0.m154821o(textView, x7c0.f191344m);
            textView.setTypeface(eqh0.m117752c(3));
            if (this.f76994a) {
                zvf0.m220399u("e_chat_gift_bar_tab", bs20.this.f76986m.m180538v().m122799L(), vwb.m200311Y("gift_tab_type", ((NewGiftInfoPanelWrapper) bs20.this.f76988o.get(selectedTabPosition)).panel.name));
            }
            this.f76994a = true;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            bs20.this.m103651z(tab);
            ((TextView) tab.getCustomView()).setTypeface(Typeface.DEFAULT);
            mji0.m154821o((TextView) tab.getCustomView(), x7c0.f191345n);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: renamed from: l.bs20$d */
    public class C15953d extends ei2<ngm> {

        /* JADX INFO: renamed from: l.bs20$d$a */
        public class a extends qe2 {

            /* JADX INFO: renamed from: a */
            public int f76998a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f76999b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ aq0 f77000c;

            public a(int i, aq0 aq0Var) {
                this.f76999b = i;
                this.f77000c = aq0Var;
            }

            @Override // p149l.qe2, p149l.hr0
            /* JADX INFO: renamed from: a */
            public void mo76385a(@NonNull Drawable drawable, int i) {
                int i2 = this.f76998a;
                if ((i2 != 0 || this.f76999b > 1) && i2 <= i) {
                    this.f76998a = i;
                } else {
                    this.f77000c.stop();
                }
            }

            @Override // p149l.qe2, p149l.hr0
            public void onAnimationStart(@NonNull Drawable drawable) {
                this.f76998a = -1;
            }
        }

        public C15953d() {
        }

        @Override // p149l.ei2, p149l.q26
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo8234e(String str, ngm ngmVar, Animatable animatable) {
            if (animatable == null || !aq0.class.isInstance(animatable)) {
                return;
            }
            aq0 aq0Var = (aq0) animatable;
            aq0Var.m98214j(new a(aq0Var.m98209e(), aq0Var));
        }

        @Override // p149l.ei2, p149l.q26
        /* JADX INFO: renamed from: d */
        public void mo48281d(String str, Throwable th) {
        }
    }
}
