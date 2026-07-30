package p153l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.businessdata.NewGiftInfoPanelWrapper;
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.p058ui.gift.layer.CoreGiftLayer;
import com.p051p1.mobile.putong.core.p058ui.gift.opt.view.GiftPanelTopBar;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import p151v.VPager;
import p151v.VProgressBar;
import p151v.VRelative;
import p151v.VText;

/* JADX INFO: loaded from: classes3.dex */
public class owj implements iam<bwj> {

    /* JADX INFO: renamed from: a */
    public VRelative f149498a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f149499b;

    /* JADX INFO: renamed from: c */
    public CoreGiftLayer f149500c;

    /* JADX INFO: renamed from: d */
    public VText f149501d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f149502e;

    /* JADX INFO: renamed from: f */
    public View f149503f;

    /* JADX INFO: renamed from: g */
    public VProgressBar f149504g;

    /* JADX INFO: renamed from: h */
    public GiftPanelTopBar f149505h;

    /* JADX INFO: renamed from: i */
    public VPager f149506i;

    /* JADX INFO: renamed from: j */
    public bwj f149507j;

    /* JADX INFO: renamed from: k */
    public final Act f149508k;

    /* JADX INFO: renamed from: l */
    public Runnable f149509l;

    /* JADX INFO: renamed from: m */
    public Runnable f149510m;

    /* JADX INFO: renamed from: n */
    public int f149511n = -1;

    /* JADX INFO: renamed from: o */
    public boolean f149512o = false;

    /* JADX INFO: renamed from: l.owj$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC19235b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC19235b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            owj.this.m169577k();
            owj.this.f149498a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public owj(Act act) {
        this.f149508k = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m169575n(View view) {
        if (!this.f149500c.m46630o()) {
            this.f149507j.m106714t().cancel();
        } else {
            this.f149500c.m46626F();
            m169587x(false);
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f149508k;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m169576j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m169576j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pwj.m174058b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public final void m169577k() {
        if (this.f149511n != this.f149498a.getHeight()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f149500c.getLayoutParams();
            marginLayoutParams.height = this.f149507j.m106714t().f159772t;
            marginLayoutParams.topMargin = -((this.f149507j.m106714t().f159772t + marginLayoutParams.bottomMargin) - this.f149498a.getHeight());
            this.f149500c.setLayoutParams(marginLayoutParams);
        }
        this.f149511n = this.f149498a.getHeight();
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(bwj bwjVar) {
        this.f149507j = bwjVar;
    }

    /* JADX INFO: renamed from: m */
    public final int m169579m(List<NewGiftInfoPanelWrapper> list) {
        if (jyb.m147479J(list)) {
            return 1;
        }
        for (NewGiftInfoPanelWrapper newGiftInfoPanelWrapper : list) {
            if (NullChecker.m82486a(newGiftInfoPanelWrapper.giftInfos) && newGiftInfoPanelWrapper.giftInfos.size() > 4) {
                return 2;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m169580p() {
        m169587x(false);
        this.f149509l = null;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m169581q(CoreGiftInfo coreGiftInfo) {
        tvj.m192805a("BUBBLE_BUSINESS_GIFT_USE_GUIDE");
        m169577k();
        m169587x(true);
        this.f149500c.m46638w(coreGiftInfo, new x20() { // from class: l.lwj
            @Override // p153l.x20
            public final void call() {
                this.f133819a.m169580p();
            }
        });
        boolean zIsEmpty = TextUtils.isEmpty(coreGiftInfo.extra.shopGuide);
        VText vText = this.f149501d;
        if (zIsEmpty) {
            vText.setText("这个礼物很受欢迎哦");
        } else {
            vText.setText(coreGiftInfo.extra.shopGuide);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m169582r() {
        bnl0.m105525M0(this.f149504g, true);
        this.f149500c.setEnableFrameCheck(true);
        this.f149506i.setAdapter(this.f149507j.m106714t().m178295H());
        this.f149506i.m4187d(new C19234a());
        this.f149506i.setScrollble(false);
        bnl0.m105509E0(this.f149499b, new View.OnClickListener() { // from class: l.mwj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f139098a.m169575n(view);
            }
        });
        this.f149506i.setOffscreenPageLimit(10);
        this.f149498a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC19235b());
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m169583s(List list, Integer num) {
        i4g0.m138523u("e_chat_gift_bar_tab", this.f149507j.m106714t().m178298L(), jyb.m147494Y("gift_tab_type", ((NewGiftInfoPanelWrapper) list.get(num.intValue())).panel.name));
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m169584u() {
        m169587x(false);
    }

    /* JADX INFO: renamed from: v */
    public void m169585v(final CoreGiftInfo coreGiftInfo) {
        if (CoreModule.m30933P().m143412i().mo180463f() && TextUtils.equals(coreGiftInfo.f56859id, "o_diamond_gift_id")) {
            return;
        }
        if (NullChecker.m82486a(this.f149510m)) {
            l51.m152890J(this.f149510m);
            this.f149510m = null;
        }
        if (NullChecker.m82486a(this.f149509l)) {
            l51.m152890J(this.f149509l);
        }
        Act act = this.f149508k;
        Runnable runnable = new Runnable() { // from class: l.jwj
            @Override // java.lang.Runnable
            public final void run() {
                this.f122936a.m169581q(coreGiftInfo);
            }
        };
        this.f149509l = runnable;
        l51.m152888H(act, runnable, 150L);
    }

    /* JADX INFO: renamed from: w */
    public void m169586w(final List<NewGiftInfoPanelWrapper> list, String str) {
        bnl0.m105525M0(this.f149504g, false);
        int iM169579m = m169579m(list);
        bnl0.m105505C0(this.f149506i, qa00.m175859d((iM169579m * 111) + 50));
        this.f149512o = true;
        this.f149507j.m106714t().m178295H().m169452q(list, iM169579m);
        this.f149505h.m46703G(this.f149507j);
        boolean zM106709m = this.f149507j.m106709m();
        GiftPanelTopBar giftPanelTopBar = this.f149505h;
        if (zM106709m) {
            giftPanelTopBar.setTips("送个小礼物表达诚意吧");
        } else {
            giftPanelTopBar.m46700C(this.f149506i, new y20() { // from class: l.kwj
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f129071a.m169583s(list, (Integer) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m169587x(boolean z) {
        bnl0.m105524M(this.f149500c, z);
        bnl0.m105524M(this.f149501d, z);
    }

    /* JADX INFO: renamed from: y */
    public void m169588y(String str) {
        bnl0.m105524M(this.f149501d, true);
        this.f149501d.setText(str);
        if (NullChecker.m82486a(this.f149510m)) {
            l51.m152890J(this.f149510m);
        }
        Act act = this.f149508k;
        Runnable runnable = new Runnable() { // from class: l.nwj
            @Override // java.lang.Runnable
            public final void run() {
                this.f143961a.m169584u();
            }
        };
        this.f149510m = runnable;
        l51.m152888H(act, runnable, 1500L);
    }

    /* JADX INFO: renamed from: z */
    public void m169589z() {
        this.f149500c.m46625E();
        m169587x(false);
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.owj$a */
    public class C19234a implements ViewPager.InterfaceC0718j {
        public C19234a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            int i2 = i + 1;
            i4g0.m138492A("e_gift_bar", owj.this.f149507j.m106714t().m178298L(), jyb.m147494Y("giftBarPageId", Integer.valueOf(i2)), jyb.m147494Y("gift_bar_tab", "default"));
            i4g0.m138525w("e_gift_bar", owj.this.f149507j.m106714t().m178298L(), jyb.m147494Y("giftBarPageId", Integer.valueOf(i2)), jyb.m147494Y("gift_bar_tab", "default"));
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }
    }
}
