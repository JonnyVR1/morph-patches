package p153l;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.businessdata.NewGiftInfoPanelWrapper;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.p058ui.gift.layer.CoreGiftLayer;
import com.p051p1.mobile.putong.data.CoreGiftPanelName;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VDraweeView;
import p151v.VFrame;
import p151v.VPager;
import p151v.VProgressBar;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class l030 implements iam<b030> {

    /* JADX INFO: renamed from: a */
    public FrameLayout f129488a;

    /* JADX INFO: renamed from: b */
    public CoreGiftLayer f129489b;

    /* JADX INFO: renamed from: c */
    public FrameLayout f129490c;

    /* JADX INFO: renamed from: d */
    public VText f129491d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f129492e;

    /* JADX INFO: renamed from: f */
    public VProgressBar f129493f;

    /* JADX INFO: renamed from: g */
    public VDraweeView f129494g;

    /* JADX INFO: renamed from: h */
    public TextView f129495h;

    /* JADX INFO: renamed from: i */
    public VFrame f129496i;

    /* JADX INFO: renamed from: j */
    public VText f129497j;

    /* JADX INFO: renamed from: k */
    public TabLayout f129498k;

    /* JADX INFO: renamed from: l */
    public VPager f129499l;

    /* JADX INFO: renamed from: m */
    public b030 f129500m;

    /* JADX INFO: renamed from: n */
    public Act f129501n;

    /* JADX INFO: renamed from: o */
    public List<NewGiftInfoPanelWrapper> f129502o;

    /* JADX INFO: renamed from: p */
    public Runnable f129503p;

    /* JADX INFO: renamed from: q */
    public Runnable f129504q;

    /* JADX INFO: renamed from: r */
    public int f129505r = -1;

    /* JADX INFO: renamed from: s */
    public sz20 f129506s;

    /* JADX INFO: renamed from: l.l030$c */
    public class ViewTreeObserverOnGlobalLayoutListenerC18322c implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC18322c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            l030.this.m152263l();
            l030.this.f129488a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public l030(Act act) {
        this.f129501n = act;
    }

    /* JADX INFO: renamed from: A */
    private void m152254A(boolean z) {
        bnl0.m105524M(this.f129489b, z);
        bnl0.m105524M(this.f129491d, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public void m152263l() {
        if (this.f129505r != this.f129488a.getHeight()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f129489b.getLayoutParams();
            marginLayoutParams.height = this.f129500m.m101257v().f154716t;
            marginLayoutParams.topMargin = -((this.f129500m.m101257v().f154716t + marginLayoutParams.bottomMargin) - this.f129488a.getHeight());
            this.f129489b.setLayoutParams(marginLayoutParams);
        }
        this.f129505r = this.f129488a.getHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m152264n(View view) {
        i4g0.m138520r("e_chat_gift_bar_recharge", this.f129500m.m101257v().m174335L());
        if (this.f129500m.m101257v().m174331G() != CoreGiftPanelName.get("note")) {
            CoreModule.m30933P().m143412i().mo180508n4(this.f129501n, vvj.m203014b(this.f129500m.m101257v().m174335L(), "e_recharge"));
            return;
        }
        if (TextUtils.equals(this.f129500m.m101257v().m174330F(), "from_meet_picks")) {
            CoreModule.m30933P().m143412i().mo180508n4(this.f129501n, "p_meet_view,e_meet_gift_bar_picks,click");
        } else if (TextUtils.equals(this.f129500m.m101257v().m174330F(), "from_meet_liked")) {
            CoreModule.m30933P().m143412i().mo180508n4(this.f129501n, "p_meet_view,e_meet_gift_bar_ilike,click");
        } else {
            CoreModule.m30933P().m143412i().mo180508n4(this.f129501n, "p_meet_view,e_meet_gift_bar,click");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public /* synthetic */ void m152265p(View view) {
        if (!this.f129489b.m46630o()) {
            this.f129500m.m101257v().cancel();
        } else {
            this.f129489b.m46626F();
            m152254A(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m152266q() {
        m152254A(false);
        this.f129503p = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: s */
    public /* synthetic */ void m152267s(CoreGiftInfo coreGiftInfo) {
        m152263l();
        m152254A(true);
        this.f129489b.m46638w(coreGiftInfo, new x20() { // from class: l.h030
            @Override // p153l.x20
            public final void call() {
                this.f107267a.m152266q();
            }
        });
        boolean zIsEmpty = TextUtils.isEmpty(coreGiftInfo.extra.shopGuide);
        VText vText = this.f129491d;
        if (zIsEmpty) {
            vText.setText("这个礼物很受欢迎哦");
        } else {
            vText.setText(coreGiftInfo.extra.shopGuide);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m152268u() {
        m152254A(false);
    }

    /* JADX INFO: renamed from: B */
    public void m152269B(String str) {
        bnl0.m105524M(this.f129491d, true);
        this.f129491d.setText(str);
        if (NullChecker.m82486a(this.f129504q)) {
            l51.m152890J(this.f129504q);
        }
        Act act = this.f129501n;
        Runnable runnable = new Runnable() { // from class: l.k030
            @Override // java.lang.Runnable
            public final void run() {
                this.f123354a.m152268u();
            }
        };
        this.f129504q = runnable;
        l51.m152888H(act, runnable, 1500L);
    }

    /* JADX INFO: renamed from: C */
    public void m152270C() {
        this.f129489b.m46625E();
        m152254A(false);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f129501n;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m152271k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m152271k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m030.m156508b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(b030 b030Var) {
        this.f129500m = b030Var;
    }

    /* JADX INFO: renamed from: r */
    public void m152273r() {
        bnl0.m105525M0(this.f129493f, true);
        this.f129489b.setEnableFrameCheck(true);
        VPager vPager = this.f129499l;
        sz20 sz20VarM174332H = this.f129500m.m101257v().m174332H();
        this.f129506s = sz20VarM174332H;
        vPager.setAdapter(sz20VarM174332H);
        this.f129499l.m4187d(new C18320a());
        this.f129496i.setOnClickListener(new View.OnClickListener() { // from class: l.i030
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f112327a.m152264n(view);
            }
        });
        if (this.f129500m.m101257v().m174331G() == CoreGiftPanelName.get("note")) {
            bnl0.m105524M(this.f129498k, false);
            bnl0.m105524M(this.f129497j, true);
            String str = c17.m107528u0() ? "他" : "她";
            this.f129495h.setText(String.format("%s今天收到太多招呼了", str));
            this.f129495h.setTypeface(Typeface.DEFAULT_BOLD);
            bnl0.m105538V(this.f129495h, qa00.m175859d(12.0f));
            bnl0.m105538V(this.f129497j, qa00.m175859d(20.0f));
            this.f129497j.setText(String.format("先关注%s或送个小礼物让%s注意到你吧", str, str));
        } else {
            CoreGiftPanelName coreGiftPanelNameM174331G = this.f129500m.m101257v().m174331G();
            CoreGiftPanelName coreGiftPanelName = CoreGiftPanelName.get("greet");
            TabLayout tabLayout = this.f129498k;
            if (coreGiftPanelNameM174331G == coreGiftPanelName) {
                bnl0.m105524M(tabLayout, false);
                bnl0.m105524M(this.f129497j, true);
                User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(this.f129500m.m101257v().m174336N());
                boolean zIsFemale = NullChecker.m82486a(userM116503Pa) ? true ^ userM116503Pa.isFemale() : true;
                this.f129495h.setText(ggm.m130166b(zIsFemale));
                this.f129497j.setText(ggm.m130165a(zIsFemale));
                this.f129495h.setTypeface(Typeface.DEFAULT_BOLD);
                bnl0.m105538V(this.f129495h, qa00.m175859d(12.0f));
                bnl0.m105538V(this.f129497j, qa00.m175859d(20.0f));
            } else {
                bnl0.m105524M(tabLayout, true);
                bnl0.m105524M(this.f129497j, false);
                this.f129498k.setTabMode(0);
                this.f129498k.setSelectedTabIndicator(ibc0.f113986c0);
                this.f129498k.setSelectedTabIndicatorColor(this.f129501n.getResources().getColor(g9c0.f102825o));
                this.f129498k.setTabIndicatorFullWidth(false);
                this.f129498k.setTabRippleColorResource(g9c0.f102807Y);
                this.f129498k.setSelectedTabIndicatorHeight(qa00.m175859d(12.0f));
                this.f129498k.setTabGravity(0);
                this.f129498k.addOnTabSelectedListener((TabLayout.OnTabSelectedListener) new C18321b());
                this.f129498k.setupWithViewPager(this.f129499l);
            }
        }
        this.f129499l.setScrollble(false);
        bnl0.m105509E0(this.f129490c, new View.OnClickListener() { // from class: l.j030
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117776a.m152265p(view);
            }
        });
        this.f129499l.setOffscreenPageLimit(10);
        this.f129488a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC18322c());
    }

    /* JADX INFO: renamed from: v */
    public void m152274v() {
        CoreGiftPanelName coreGiftPanelNameM174331G = this.f129500m.m101257v().m174331G();
        CoreGiftPanelName coreGiftPanelName = CoreGiftPanelName.get("note");
        VDraweeView vDraweeView = this.f129494g;
        if (coreGiftPanelNameM174331G == coreGiftPanelName) {
            bnl0.m105524M(vDraweeView, false);
            return;
        }
        bnl0.m105524M(vDraweeView, false);
        this.f129494g.setController(f9j.m124665g().mo155332a(Uri.parse("asset:///core_giftpanel_ic_gif.gif")).mo8264b(this.f129494g.getController()).m8287z(true).m8258B(new C18323d()).build());
    }

    /* JADX INFO: renamed from: w */
    public void m152275w(final CoreGiftInfo coreGiftInfo) {
        if (NullChecker.m82486a(this.f129504q)) {
            l51.m152890J(this.f129504q);
            this.f129504q = null;
        }
        if (NullChecker.m82486a(this.f129503p)) {
            l51.m152890J(this.f129503p);
        }
        Act act = this.f129501n;
        Runnable runnable = new Runnable() { // from class: l.g030
            @Override // java.lang.Runnable
            public final void run() {
                this.f101597a.m152267s(coreGiftInfo);
            }
        };
        this.f129503p = runnable;
        l51.m152888H(act, runnable, 150L);
    }

    /* JADX INFO: renamed from: x */
    public void m152276x(List<NewGiftInfoPanelWrapper> list) {
        this.f129502o = list;
        bnl0.m105525M0(this.f129493f, false);
        this.f129500m.m101257v().m174332H().m188619q(list);
    }

    /* JADX INFO: renamed from: y */
    public void m152277y(String str, String str2) {
        this.f129495h.setText(str);
        this.f129497j.setText(str2);
    }

    /* JADX INFO: renamed from: z */
    public void m152278z(TabLayout.Tab tab) {
        if (tab.getCustomView() == null) {
            TextView textView = new TextView(this.f129501n);
            textView.setText(tab.getText());
            textView.getPaint().setFakeBoldText(false);
            textView.setGravity(17);
            textView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            tab.setCustomView(textView);
        }
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.l030$a */
    public class C18320a implements ViewPager.InterfaceC0718j {
        public C18320a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            int i2 = i + 1;
            i4g0.m138492A("e_gift_bar", l030.this.f129500m.m101257v().m174335L(), jyb.m147494Y("giftBarPageId", Integer.valueOf(i2)), jyb.m147494Y("gift_bar_tab", "default"));
            i4g0.m138525w("e_gift_bar", l030.this.f129500m.m101257v().m174335L(), jyb.m147494Y("giftBarPageId", Integer.valueOf(i2)), jyb.m147494Y("gift_bar_tab", "default"));
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }

    /* JADX INFO: renamed from: l.l030$b */
    public class C18321b implements TabLayout.OnTabSelectedListener {

        /* JADX INFO: renamed from: a */
        public boolean f129508a = false;

        public C18321b() {
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabSelected(TabLayout.Tab tab) {
            int selectedTabPosition = l030.this.f129498k.getSelectedTabPosition();
            l030.this.m152278z(tab);
            TextView textView = (TextView) tab.getCustomView();
            msi0.m159817o(textView, cgc0.f81657m);
            textView.setTypeface(lyh0.m156283c(3));
            if (this.f129508a) {
                i4g0.m138523u("e_chat_gift_bar_tab", l030.this.f129500m.m101257v().m174335L(), jyb.m147494Y("gift_tab_type", ((NewGiftInfoPanelWrapper) l030.this.f129502o.get(selectedTabPosition)).panel.name));
            }
            this.f129508a = true;
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabUnselected(TabLayout.Tab tab) {
            l030.this.m152278z(tab);
            ((TextView) tab.getCustomView()).setTypeface(Typeface.DEFAULT);
            msi0.m159817o((TextView) tab.getCustomView(), cgc0.f81658n);
        }

        @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
        public void onTabReselected(TabLayout.Tab tab) {
        }
    }

    /* JADX INFO: renamed from: l.l030$d */
    public class C18323d extends li2<qim> {

        /* JADX INFO: renamed from: l.l030$d$a */
        public class a extends ye2 {

            /* JADX INFO: renamed from: a */
            public int f129512a;

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ int f129513b;

            /* JADX INFO: renamed from: c */
            public final /* synthetic */ wp0 f129514c;

            public a(int i, wp0 wp0Var) {
                this.f129513b = i;
                this.f129514c = wp0Var;
            }

            @Override // p153l.ye2, p153l.lr0
            /* JADX INFO: renamed from: a */
            public void mo77568a(@NonNull Drawable drawable, int i) {
                int i2 = this.f129512a;
                if ((i2 != 0 || this.f129513b > 1) && i2 <= i) {
                    this.f129512a = i;
                } else {
                    this.f129514c.stop();
                }
            }

            @Override // p153l.ye2, p153l.lr0
            public void onAnimationStart(@NonNull Drawable drawable) {
                this.f129512a = -1;
            }
        }

        public C18323d() {
        }

        @Override // p153l.li2, p153l.v36
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public void mo8288e(String str, qim qimVar, Animatable animatable) {
            if (animatable == null || !wp0.class.isInstance(animatable)) {
                return;
            }
            wp0 wp0Var = (wp0) animatable;
            wp0Var.m207396j(new a(wp0Var.m207391e(), wp0Var));
        }

        @Override // p153l.li2, p153l.v36
        /* JADX INFO: renamed from: d */
        public void mo49464d(String str, Throwable th) {
        }
    }
}
