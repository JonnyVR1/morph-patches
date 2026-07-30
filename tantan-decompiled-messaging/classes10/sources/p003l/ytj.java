package p003l;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import androidx.viewpager.widget.ViewPager;
import com.p000p1.mobile.putong.core.data.CoreGiftInfo;
import com.p000p1.mobile.putong.core.p001ui.gift.layer.CoreGiftLayer;
import com.p000p1.mobile.putong.core.p001ui.gift.opt.view.GiftPanelTopBar;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.businessdata.NewGiftInfoPanelWrapper;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.List;
import l.d30;
import l.e30;
import l.e51;
import l.j760;
import l.s7m;
import l.t100;
import l.vwb;
import l.xdl0;
import l.zvf0;
import v.VPager;
import v.VProgressBar;
import v.VRelative;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class ytj implements s7m<ltj> {

    /* JADX INFO: renamed from: a */
    public VRelative f9122a;

    /* JADX INFO: renamed from: b */
    public FrameLayout f9123b;

    /* JADX INFO: renamed from: c */
    public CoreGiftLayer f9124c;

    /* JADX INFO: renamed from: d */
    public VText f9125d;

    /* JADX INFO: renamed from: e */
    public FrameLayout f9126e;

    /* JADX INFO: renamed from: f */
    public View f9127f;

    /* JADX INFO: renamed from: g */
    public VProgressBar f9128g;

    /* JADX INFO: renamed from: h */
    public GiftPanelTopBar f9129h;

    /* JADX INFO: renamed from: i */
    public VPager f9130i;

    /* JADX INFO: renamed from: j */
    public ltj f9131j;

    /* JADX INFO: renamed from: k */
    public final Act f9132k;

    /* JADX INFO: renamed from: l */
    public Runnable f9133l;

    /* JADX INFO: renamed from: m */
    public Runnable f9134m;

    /* JADX INFO: renamed from: n */
    public int f9135n = -1;

    /* JADX INFO: renamed from: o */
    public boolean f9136o = false;

    /* JADX INFO: renamed from: l.ytj$b */
    public class ViewTreeObserverOnGlobalLayoutListenerC3495b implements ViewTreeObserver.OnGlobalLayoutListener {
        public ViewTreeObserverOnGlobalLayoutListenerC3495b() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            ytj.this.m11294k();
            ytj.this.f9122a.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public ytj(Act act) {
        this.f9132k = act;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public /* synthetic */ void m11290n(View view) {
        if (!this.f9124c.m2777o()) {
            this.f9131j.m7914t().cancel();
        } else {
            this.f9124c.m2773F();
            m11304x(false);
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m11291C0() {
        return this.f9132k;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m11293j(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: j */
    public View m11293j(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return ztj.m11456b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public final void m11294k() {
        if (this.f9135n != this.f9122a.getHeight()) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f9124c.getLayoutParams();
            marginLayoutParams.height = this.f9131j.m7914t().f2886t;
            marginLayoutParams.topMargin = -((this.f9131j.m7914t().f2886t + marginLayoutParams.bottomMargin) - this.f9122a.getHeight());
            this.f9124c.setLayoutParams(marginLayoutParams);
        }
        this.f9135n = this.f9122a.getHeight();
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m11292i1(ltj ltjVar) {
        this.f9131j = ltjVar;
    }

    /* JADX INFO: renamed from: m */
    public final int m11296m(List<NewGiftInfoPanelWrapper> list) {
        if (vwb.J(list)) {
            return 1;
        }
        for (NewGiftInfoPanelWrapper newGiftInfoPanelWrapper : list) {
            if (NullChecker.a(newGiftInfoPanelWrapper.giftInfos) && newGiftInfoPanelWrapper.giftInfos.size() > 4) {
                return 2;
            }
        }
        return 1;
    }

    /* JADX INFO: renamed from: p */
    public final /* synthetic */ void m11297p() {
        m11304x(false);
        this.f9133l = null;
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m11298q(CoreGiftInfo coreGiftInfo) {
        dtj.m6204a("BUBBLE_BUSINESS_GIFT_USE_GUIDE");
        m11294k();
        m11304x(true);
        this.f9124c.m2785w(coreGiftInfo, new d30() { // from class: l.vtj
            public final void call() {
                this.f8041a.m11297p();
            }
        });
        boolean zIsEmpty = TextUtils.isEmpty(coreGiftInfo.extra.shopGuide);
        VText vText = this.f9125d;
        if (zIsEmpty) {
            vText.setText("这个礼物很受欢迎哦");
        } else {
            vText.setText(coreGiftInfo.extra.shopGuide);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m11299r() {
        xdl0.M0(this.f9128g, true);
        this.f9124c.setEnableFrameCheck(true);
        this.f9130i.setAdapter(this.f9131j.m7914t().m5632H());
        this.f9130i.d(new C3494a());
        this.f9130i.setScrollble(false);
        xdl0.E0(this.f9123b, new View.OnClickListener() { // from class: l.wtj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f8235a.m11290n(view);
            }
        });
        this.f9130i.setOffscreenPageLimit(10);
        this.f9122a.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC3495b());
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m11300s(List list, Integer num) {
        zvf0.u("e_chat_gift_bar_tab", this.f9131j.m7914t().m5635L(), new j760[]{vwb.Y("gift_tab_type", ((NewGiftInfoPanelWrapper) list.get(num.intValue())).panel.name)});
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m11301u() {
        m11304x(false);
    }

    /* JADX INFO: renamed from: v */
    public void m11302v(final CoreGiftInfo coreGiftInfo) {
        if (CoreModule.P().i().f() && TextUtils.equals(((DbObject) coreGiftInfo).id, "o_diamond_gift_id")) {
            return;
        }
        if (NullChecker.a(this.f9134m)) {
            e51.J(this.f9134m);
            this.f9134m = null;
        }
        if (NullChecker.a(this.f9133l)) {
            e51.J(this.f9133l);
        }
        Act act = this.f9132k;
        Runnable runnable = new Runnable() { // from class: l.ttj
            @Override // java.lang.Runnable
            public final void run() {
                this.f7624a.m11298q(coreGiftInfo);
            }
        };
        this.f9133l = runnable;
        e51.H(act, runnable, 150L);
    }

    /* JADX INFO: renamed from: w */
    public void m11303w(final List<NewGiftInfoPanelWrapper> list, String str) {
        xdl0.M0(this.f9128g, false);
        int iM11296m = m11296m(list);
        xdl0.C0(this.f9130i, t100.d((iM11296m * 111) + 50));
        this.f9136o = true;
        this.f9131j.m7914t().m5632H().m11279q(list, iM11296m);
        this.f9129h.m2856G(this.f9131j);
        boolean zM7909m = this.f9131j.m7909m();
        GiftPanelTopBar giftPanelTopBar = this.f9129h;
        if (zM7909m) {
            giftPanelTopBar.setTips("送个小礼物表达诚意吧");
        } else {
            giftPanelTopBar.m2853C(this.f9130i, new e30() { // from class: l.utj
                public final void call(Object obj) {
                    this.f7820a.m11300s(list, (Integer) obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m11304x(boolean z) {
        xdl0.M(this.f9124c, z);
        xdl0.M(this.f9125d, z);
    }

    /* JADX INFO: renamed from: y */
    public void m11305y(String str) {
        xdl0.M(this.f9125d, true);
        this.f9125d.setText(str);
        if (NullChecker.a(this.f9134m)) {
            e51.J(this.f9134m);
        }
        Act act = this.f9132k;
        Runnable runnable = new Runnable() { // from class: l.xtj
            @Override // java.lang.Runnable
            public final void run() {
                this.f8569a.m11301u();
            }
        };
        this.f9134m = runnable;
        e51.H(act, runnable, 1500L);
    }

    /* JADX INFO: renamed from: z */
    public void m11306z() {
        this.f9124c.m2772E();
        m11304x(false);
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.ytj$a */
    public class C3494a implements ViewPager.j {
        public C3494a() {
        }

        public void onPageSelected(int i) {
            int i2 = i + 1;
            zvf0.A("e_gift_bar", ytj.this.f9131j.m7914t().m5635L(), new j760[]{vwb.Y("giftBarPageId", Integer.valueOf(i2)), vwb.Y("gift_bar_tab", "default")});
            zvf0.w("e_gift_bar", ytj.this.f9131j.m7914t().m5635L(), new j760[]{vwb.Y("giftBarPageId", Integer.valueOf(i2)), vwb.Y("gift_bar_tab", "default")});
        }

        public void onPageScrollStateChanged(int i) {
        }

        public void onPageScrolled(int i, float f, int i2) {
        }
    }
}
