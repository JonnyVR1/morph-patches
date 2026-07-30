package p149l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.businessdata.NewGiftInfoPanelWrapper;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.p053ui.gift.layer.CoreGiftLayer;
import com.p046p1.mobile.putong.core.p053ui.gift.opt.view.GiftPanelTopBar;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p147v.VPager;
import p147v.VProgressBar;
import p147v.VRelative;
import p147v.VText;

/* JADX INFO: loaded from: classes10.dex */
public class ytj implements s7m<ltj> {

    /* JADX INFO: renamed from: a */
    public VRelative f199951a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f199952b;

    /* JADX INFO: renamed from: c */
    public CoreGiftLayer f199953c;

    /* JADX INFO: renamed from: d */
    public VText f199954d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f199955e;

    /* JADX INFO: renamed from: f */
    public View f199956f;

    /* JADX INFO: renamed from: g */
    public VProgressBar f199957g;

    /* JADX INFO: renamed from: h */
    public GiftPanelTopBar f199958h;

    /* JADX INFO: renamed from: i */
    public VPager f199959i;

    /* JADX INFO: renamed from: j */
    public ltj f199960j;

    /* JADX INFO: renamed from: k */
    public final Act f199961k;

    /* JADX INFO: renamed from: l */
    public Runnable f199962l;

    /* JADX INFO: renamed from: m */
    public Runnable f199963m;

    /* JADX INFO: renamed from: n */
    public int f199964n = -1;

    /* JADX INFO: renamed from: o */
    public boolean f199965o = false;

    /* JADX INFO: renamed from: l.ytj$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC21508b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC21508b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ytj.this.m216042k();
            ytj.this.f199951a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public ytj(Act act) {
        this.f199961k = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m216040n(View view) {
        if (!this.f199953c.m45447o()) {
            this.f199960j.m151705t().cancel();
        } else {
            this.f199953c.m45443F();
            m216052x(false);
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f199961k;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m216041j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m216041j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ztj.m220128b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public final void m216042k() {
        if (this.f199964n != this.f199951a.getHeight()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f199953c.getLayoutParams();
            marginLayoutParams.height = this.f199960j.m151705t().f71626t;
            marginLayoutParams.topMargin = -((this.f199960j.m151705t().f71626t + marginLayoutParams.bottomMargin) - this.f199951a.getHeight());
            this.f199953c.setLayoutParams(marginLayoutParams);
        }
        this.f199964n = this.f199951a.getHeight();
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ltj ltjVar) {
        this.f199960j = ltjVar;
    }

    /* JADX INFO: renamed from: m */
    public final int m216044m(List<NewGiftInfoPanelWrapper> list) {
        if (vwb.m200296J(list)) {
            return 1;
        }
        for (NewGiftInfoPanelWrapper newGiftInfoPanelWrapper : list) {
            if (NullChecker.m81303a(newGiftInfoPanelWrapper.giftInfos) && newGiftInfoPanelWrapper.giftInfos.size() > 4) {
                return 2;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m216045p() {
        m216052x(false);
        this.f199962l = null;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m216046q(CoreGiftInfo coreGiftInfo) {
        dtj.m113571a("BUBBLE_BUSINESS_GIFT_USE_GUIDE");
        m216042k();
        m216052x(true);
        this.f199953c.m45455w(coreGiftInfo, new d30() { // from class: l.vtj
            @Override // p149l.d30
            public final void call() {
                this.f182969a.m216045p();
            }
        });
        boolean zIsEmpty = TextUtils.isEmpty(coreGiftInfo.extra.shopGuide);
        VText vText = this.f199954d;
        if (zIsEmpty) {
            vText.setText("这个礼物很受欢迎哦");
        } else {
            vText.setText(coreGiftInfo.extra.shopGuide);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m216047r() {
        xdl0.m208345M0(this.f199957g, true);
        this.f199953c.setEnableFrameCheck(true);
        this.f199959i.setAdapter(this.f199960j.m151705t().m98807H());
        this.f199959i.m4185d(new C21507a());
        this.f199959i.setScrollble(false);
        xdl0.m208329E0(this.f199952b, new View.OnClickListener() { // from class: l.wtj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f188025a.m216040n(view);
            }
        });
        this.f199959i.setOffscreenPageLimit(10);
        this.f199951a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC21508b());
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m216048s(List list, Integer num) {
        zvf0.m220399u("e_chat_gift_bar_tab", this.f199960j.m151705t().m98810L(), vwb.m200311Y("gift_tab_type", ((NewGiftInfoPanelWrapper) list.get(num.intValue())).panel.name));
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m216049u() {
        m216052x(false);
    }

    /* JADX INFO: renamed from: v */
    public void m216050v(final CoreGiftInfo coreGiftInfo) {
        if (CoreModule.m29935P().m94658i().mo158371f() && TextUtils.equals(coreGiftInfo.f56011id, "o_diamond_gift_id")) {
            return;
        }
        if (NullChecker.m81303a(this.f199963m)) {
            e51.m114745J(this.f199963m);
            this.f199963m = null;
        }
        if (NullChecker.m81303a(this.f199962l)) {
            e51.m114745J(this.f199962l);
        }
        Act act = this.f199961k;
        Runnable runnable = new Runnable() { // from class: l.ttj
            @Override // java.lang.Runnable
            public final void run() {
                this.f172031a.m216046q(coreGiftInfo);
            }
        };
        this.f199962l = runnable;
        e51.m114743H(act, runnable, 150L);
    }

    /* JADX INFO: renamed from: w */
    public void m216051w(final List<NewGiftInfoPanelWrapper> list, String str) {
        xdl0.m208345M0(this.f199957g, false);
        int iM216044m = m216044m(list);
        xdl0.m208325C0(this.f199959i, t100.m186890d((iM216044m * 111) + 50));
        this.f199965o = true;
        this.f199960j.m151705t().m98807H().m215912q(list, iM216044m);
        this.f199958h.m45520G(this.f199960j);
        boolean zM151700m = this.f199960j.m151700m();
        GiftPanelTopBar giftPanelTopBar = this.f199958h;
        if (zM151700m) {
            giftPanelTopBar.setTips("送个小礼物表达诚意吧");
        } else {
            giftPanelTopBar.m45517C(this.f199959i, new e30() { // from class: l.utj
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f178272a.m216048s(list, (Integer) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m216052x(boolean z) {
        xdl0.m208344M(this.f199953c, z);
        xdl0.m208344M(this.f199954d, z);
    }

    /* JADX INFO: renamed from: y */
    public void m216053y(String str) {
        xdl0.m208344M(this.f199954d, true);
        this.f199954d.setText(str);
        if (NullChecker.m81303a(this.f199963m)) {
            e51.m114745J(this.f199963m);
        }
        Act act = this.f199961k;
        Runnable runnable = new Runnable() { // from class: l.xtj
            @Override // java.lang.Runnable
            public final void run() {
                this.f194393a.m216049u();
            }
        };
        this.f199963m = runnable;
        e51.m114743H(act, runnable, 1500L);
    }

    /* JADX INFO: renamed from: z */
    public void m216054z() {
        this.f199953c.m45442E();
        m216052x(false);
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.ytj$a */
    public class C21507a implements ViewPager.InterfaceC0716j {
        public C21507a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            int i2 = i + 1;
            zvf0.m220368A("e_gift_bar", ytj.this.f199960j.m151705t().m98810L(), vwb.m200311Y("giftBarPageId", Integer.valueOf(i2)), vwb.m200311Y("gift_bar_tab", "default"));
            zvf0.m220401w("e_gift_bar", ytj.this.f199960j.m151705t().m98810L(), vwb.m200311Y("giftBarPageId", Integer.valueOf(i2)), vwb.m200311Y("gift_bar_tab", "default"));
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }
}
