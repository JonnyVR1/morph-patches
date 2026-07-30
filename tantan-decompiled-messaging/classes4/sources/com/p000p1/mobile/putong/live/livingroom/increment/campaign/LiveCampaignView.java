package com.p000p1.mobile.putong.live.livingroom.increment.campaign;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView;
import com.p000p1.mobile.putong.live.livingroom.increment.campaign.view.CampaignItemView;
import com.p000p1.mobile.putong.live.livingroom.increment.campaign.view.CampaignSnapShotItemView;
import com.p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p1.mobile.putong.live.livingroom.view.LiveScrollView;
import immomo.com.mklibrary.core.base.ui.MKWebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.cit;
import l.e30;
import l.e51;
import l.s7m;
import l.t100;
import l.vdt;
import l.vwb;
import l.w9j;
import l.xdl0;
import p002l.ad4;
import p002l.fe4;
import p002l.g5c0;
import p002l.i3c0;
import p002l.oc4;
import p002l.pc4;
import p002l.vd4;
import p002l.w1s;
import p002l.y660;
import p002l.zd4;
import v.VDraweeView;
import v.VLinear;
import v.VPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class LiveCampaignView extends FrameLayout implements s7m<vd4> {

    /* JADX INFO: renamed from: a */
    public LiveCampaignView f5513a;

    /* JADX INFO: renamed from: b */
    public VPager f5514b;

    /* JADX INFO: renamed from: c */
    public VLinear f5515c;

    /* JADX INFO: renamed from: d */
    public vd4 f5516d;

    /* JADX INFO: renamed from: e */
    public ad4 f5517e;

    /* JADX INFO: renamed from: f */
    public final List<pc4> f5518f;

    /* JADX INFO: renamed from: g */
    public float f5519g;

    /* JADX INFO: renamed from: h */
    public float f5520h;

    /* JADX INFO: renamed from: i */
    public boolean f5521i;

    /* JADX INFO: renamed from: j */
    public final Handler f5522j;

    /* JADX INFO: renamed from: k */
    public int f5523k;

    /* JADX INFO: renamed from: l */
    public View[] f5524l;

    /* JADX INFO: renamed from: m */
    public boolean f5525m;

    /* JADX INFO: renamed from: n */
    public boolean f5526n;

    /* JADX INFO: renamed from: o */
    public final Runnable f5527o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView$a */
    public class C0380a extends y660 {
        public C0380a() {
        }

        @Override // p002l.y660
        public void onPageScrollStateChanged(int i) {
            LiveCampaignView.this.m6923I();
            if (i != 0) {
                return;
            }
            int i2 = LiveCampaignView.this.f5523k;
            LiveCampaignView liveCampaignView = LiveCampaignView.this;
            if (i2 == 0) {
                liveCampaignView.f5514b.T(liveCampaignView.f5518f.size() - 2, false);
            } else if (liveCampaignView.f5523k == LiveCampaignView.this.f5518f.size() - 1) {
                LiveCampaignView.this.f5514b.T(1, false);
            }
        }

        @Override // p002l.y660
        public void onPageSelected(int i) {
            if (LiveCampaignView.this.f5518f.size() <= 1) {
                return;
            }
            LiveCampaignView.this.f5523k = i;
            for (View view : LiveCampaignView.this.f5524l) {
                view.setSelected(false);
            }
            int length = LiveCampaignView.this.f5524l.length;
            if (LiveCampaignView.this.f5523k > length || LiveCampaignView.this.f5523k <= 0) {
                int i2 = LiveCampaignView.this.f5523k;
                LiveCampaignView liveCampaignView = LiveCampaignView.this;
                if (i2 == 0) {
                    liveCampaignView.f5524l[length - 1].setSelected(true);
                } else {
                    liveCampaignView.f5524l[0].setSelected(true);
                }
            } else {
                LiveCampaignView.this.f5524l[LiveCampaignView.this.f5523k - 1].setSelected(true);
            }
            LiveCampaignView.this.m6919B();
        }
    }

    public LiveCampaignView(Context context) {
        super(context);
        this.f5518f = new ArrayList();
        this.f5521i = false;
        this.f5522j = new Handler();
        this.f5526n = true;
        this.f5527o = new Runnable() { // from class: l.o1s
            @Override // java.lang.Runnable
            public final void run() {
                this.f16335a.m6937w();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public void m6919B() {
        if (this.f5526n && !vwb.J(this.f5518f) && this.f5518f.size() > this.f5514b.getCurrentItem()) {
            int i = this.f5518f.get(this.f5514b.getCurrentItem()).getInfo().carouselSeconds * 1000;
            this.f5522j.removeCallbacks(this.f5527o);
            this.f5522j.postDelayed(this.f5527o, i);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: E */
    private void m6920E(List<BLiveCampaign> list) {
        ArrayList arrayListQ = vwb.Q(list, new w9j() { // from class: l.u1s
            public final Object call(Object obj) {
                return LiveCampaignView.m6925b((BLiveCampaign) obj);
            }
        });
        if (list.size() > 1) {
            m6921F();
            this.f5518f.clear();
            this.f5518f.add(new zd4(list.get(list.size() - 1)));
            this.f5518f.addAll(arrayListQ);
            this.f5518f.add(new zd4(list.get(0)));
            setIndicator(list.size());
            return;
        }
        this.f5522j.removeCallbacks(this.f5527o);
        this.f5514b.i();
        this.f5514b.setOnTouchListener(null);
        this.f5518f.clear();
        this.f5518f.addAll(arrayListQ);
        this.f5514b.setCurrentItem(0);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: F */
    private void m6921F() {
        this.f5514b.d(new C0380a());
        this.f5514b.setOnTouchListener(new View.OnTouchListener() { // from class: l.v1s
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f20927a.m6950z(view, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    private void m6922G() {
        int maxWidth = getMaxWidth();
        int maxHeight = getMaxHeight();
        Pair<Integer, Integer> validMaxRatio = getValidMaxRatio();
        int iIntValue = ((Integer) validMaxRatio.first).intValue();
        int iIntValue2 = ((Integer) validMaxRatio.second).intValue();
        if (iIntValue != 0 && iIntValue <= maxWidth) {
            maxWidth = iIntValue;
        }
        if (iIntValue2 != 0 && iIntValue2 <= maxHeight) {
            maxHeight = iIntValue2;
        }
        ViewGroup.LayoutParams layoutParams = this.f5514b.getLayoutParams();
        layoutParams.width = t100.d(maxWidth);
        layoutParams.height = t100.d(maxHeight);
        this.f5514b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public void m6923I() {
        Bitmap drawingCache;
        Object objM6935s = m6935s(0);
        View viewM6935s = m6935s(this.f5518f.size() - 2);
        Bitmap drawingCache2 = null;
        if (objM6935s != null && viewM6935s != null) {
            if (viewM6935s instanceof CampaignItemView) {
                drawingCache = ((CampaignItemView) viewM6935s).getViewBitmap();
            } else {
                drawingCache = viewM6935s instanceof VDraweeView ? viewM6935s.getDrawingCache() : null;
            }
            if (drawingCache != null) {
                ((CampaignSnapShotItemView) objM6935s).setBg(drawingCache);
            }
        }
        Object objM6935s2 = m6935s(this.f5518f.size() - 1);
        View viewM6935s2 = m6935s(1);
        if (objM6935s2 == null || viewM6935s2 == null) {
            return;
        }
        if (viewM6935s instanceof CampaignItemView) {
            drawingCache2 = ((CampaignItemView) viewM6935s).getViewBitmap();
        } else if (viewM6935s instanceof VDraweeView) {
            drawingCache2 = viewM6935s.getDrawingCache();
        }
        if (drawingCache2 != null) {
            ((CampaignSnapShotItemView) objM6935s2).setBg(drawingCache2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ pc4 m6925b(BLiveCampaign bLiveCampaign) {
        return (vdt.b(2) || !bLiveCampaign.isImageType()) ? new fe4(bLiveCampaign) : new oc4(bLiveCampaign);
    }

    private int getMaxHeight() {
        boolean zB = vdt.b(2);
        boolean z = this.f5525m;
        if (zB) {
            return z ? 96 : 144;
        }
        return z ? 107 : 126;
    }

    private int getMaxWidth() {
        boolean zB = vdt.b(2);
        boolean z = this.f5525m;
        if (zB) {
            return z ? 73 : 110;
        }
        return z ? 81 : 95;
    }

    private Pair<Integer, Integer> getValidMaxRatio() {
        Iterator it = vwb.Q(this.f5518f, new w9j() { // from class: l.p1s
            public final Object call(Object obj) {
                return ((pc4) obj).getInfo();
            }
        }).iterator();
        int iIntValue = 0;
        int iIntValue2 = 0;
        while (it.hasNext()) {
            List list = ((BLiveCampaign) it.next()).entranceSize;
            if (list.size() == 2) {
                if (iIntValue < ((Integer) list.get(0)).intValue()) {
                    iIntValue = ((Integer) list.get(0)).intValue();
                }
                if (iIntValue2 < ((Integer) list.get(1)).intValue()) {
                    iIntValue2 = ((Integer) list.get(1)).intValue();
                }
            }
        }
        return new Pair<>(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    private View m6935s(int i) {
        int childCount = this.f5514b.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f5514b.getChildAt(i2);
            Object tag = childAt.getTag(g5c0.f11226v3);
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == i) {
                return childAt;
            }
        }
        return null;
    }

    private void setIndicator(int i) {
        if (this.f5524l != null) {
            this.f5515c.removeAllViews();
        }
        this.f5524l = new View[i];
        int i2 = 0;
        while (i2 < i) {
            View view = new View(getContext());
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(t100.d(6.0f), t100.d(6.0f));
            marginLayoutParams.setMargins(t100.d(5.0f), 0, t100.d(5.0f), 0);
            view.setLayoutParams(marginLayoutParams);
            view.setBackground(getResources().getDrawable(i3c0.f12685W6));
            view.setSelected(i2 == 0);
            this.f5524l[i2] = view;
            this.f5515c.addView(view);
            i2++;
        }
    }

    /* JADX INFO: renamed from: u */
    private void m6936u(e30<CampaignItemView> e30Var) {
        VPager vPager = this.f5514b;
        if (vPager == null || vPager.getChildCount() <= 0) {
            return;
        }
        for (int i = 0; i < this.f5514b.getChildCount(); i++) {
            View childAt = this.f5514b.getChildAt(i);
            if (childAt instanceof CampaignItemView) {
                e30Var.call((CampaignItemView) childAt);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m6937w() {
        VPager vPager = this.f5514b;
        vPager.setCurrentItem(vPager.getCurrentItem() + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m6938x() {
        xdl0.M(this.f5513a, m6948v());
    }

    /* JADX INFO: renamed from: A */
    public void m6939A(List<LongLinkGiftMessage.LiveCampaignInfo> list) {
        int childCount = this.f5514b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f5514b.getChildAt(i);
            if (childAt instanceof CampaignItemView) {
                ((CampaignItemView) childAt).m6968r(list);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: C */
    public void m6940C(List<BLiveCampaign> list) {
        this.f5525m = this.f5516d.m25547E2().mo14489A0().equals("voice-live");
        if (vwb.J(list)) {
            xdl0.M(this.f5513a, false);
            this.f5516d.m23839A4(false);
            List<pc4> list2 = this.f5518f;
            if (list2 != null) {
                list2.clear();
                return;
            }
            return;
        }
        if (this.f5517e == null) {
            ad4 ad4Var = new ad4(this.f5516d);
            this.f5517e = ad4Var;
            this.f5514b.setAdapter(ad4Var);
        }
        m6920E(list);
        m6922G();
        this.f5514b.setOffscreenPageLimit(this.f5518f.size());
        this.f5517e.m9510u(this.f5518f);
        this.f5516d.m23839A4(m6948v());
        if (this.f5518f.size() > 1) {
            this.f5514b.setCurrentItem(1);
            this.f5524l[0].setSelected(true);
        }
        e51.G(new Runnable() { // from class: l.s1s
            @Override // java.lang.Runnable
            public final void run() {
                this.f18760a.m6938x();
            }
        });
    }

    /* JADX INFO: renamed from: C0 */
    public Context m6941C0() {
        return getContext();
    }

    /* JADX INFO: renamed from: H */
    public void m6942H(boolean z) {
        VLinear vLinear = this.f5515c;
        if (z) {
            xdl0.M(vLinear, this.f5514b.getChildCount() > 1);
        } else {
            xdl0.M(vLinear, false);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m6943J() {
        xdl0.M(this, m6948v());
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public void destroy() {
        xdl0.M(this, false);
        xdl0.M(this.f5515c, false);
        this.f5522j.removeCallbacks(this.f5527o);
        this.f5514b.setOnTouchListener(null);
        this.f5514b.i();
        m6936u(new e30() { // from class: l.t1s
            public final void call(Object obj) {
                ((CampaignItemView) obj).m6959i();
            }
        });
        ad4 ad4Var = this.f5517e;
        if (ad4Var != null) {
            ad4Var.m9509t();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        vd4 vd4Var = this.f5516d;
        if (vd4Var == null || vd4Var.m25552L2()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        LiveScrollView liveScrollViewA = cit.a(this.f5516d);
        if (liveScrollViewA == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            liveScrollViewA.requestDisallowInterceptTouchEvent(true);
            this.f5519g = motionEvent.getRawX();
            this.f5520h = motionEvent.getRawY();
        } else if (action == 1) {
            this.f5521i = false;
        } else {
            if (action == 2) {
                float fAbs = Math.abs(this.f5520h - motionEvent.getRawY()) / Math.abs(this.f5519g - motionEvent.getRawX());
                float fAbs2 = Math.abs(this.f5519g - motionEvent.getRawX()) / Math.abs(this.f5520h - motionEvent.getRawY());
                if (fAbs > 2.0f && !this.f5521i) {
                    liveScrollViewA.requestDisallowInterceptTouchEvent(false);
                } else if (fAbs2 > 2.0f) {
                    this.f5521i = true;
                    liveScrollViewA.requestDisallowInterceptTouchEvent(true);
                }
            } else if (action == 3) {
            }
            this.f5521i = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public List<MKWebView> getMKWebViewList() {
        ArrayList arrayList = new ArrayList();
        int childCount = this.f5514b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f5514b.getChildAt(i);
            if (childAt instanceof CampaignItemView) {
                arrayList.add(((CampaignItemView) childAt).f5531c);
            }
        }
        return arrayList;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final void m6945n(View view) {
        w1s.m24258a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6945n(this);
    }

    /* JADX INFO: renamed from: p */
    public void m6946p() {
        m6936u(new e30() { // from class: l.r1s
            public final void call(Object obj) {
                ((CampaignItemView) obj).m6958h();
            }
        });
        ad4 ad4Var = this.f5517e;
        if (ad4Var != null) {
            ad4Var.m9508r();
        }
    }

    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void m6944i1(vd4 vd4Var) {
        this.f5516d = vd4Var;
    }

    public void setAutoplay(boolean z) {
        this.f5526n = z;
        if (z) {
            m6919B();
        } else {
            this.f5522j.removeCallbacks(this.f5527o);
        }
    }

    public void setLiveCampaignLocation(final boolean z) {
        post(new Runnable() { // from class: l.q1s
            @Override // java.lang.Runnable
            public final void run() {
                this.f17758a.m6949y(z);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public boolean m6948v() {
        return this.f5516d.m23860f4() && !vwb.J(this.f5518f);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m6949y(boolean z) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = z ? this.f5516d.m23863i4() : t100.d(70.0f);
            setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean m6950z(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                }
            }
            m6919B();
            return false;
        }
        this.f5522j.removeCallbacks(this.f5527o);
        return false;
    }

    public LiveCampaignView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5518f = new ArrayList();
        this.f5521i = false;
        this.f5522j = new Handler();
        this.f5526n = true;
        this.f5527o = new Runnable() { // from class: l.o1s
            @Override // java.lang.Runnable
            public final void run() {
                this.f16335a.m6937w();
            }
        };
    }

    public LiveCampaignView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5518f = new ArrayList();
        this.f5521i = false;
        this.f5522j = new Handler();
        this.f5526n = true;
        this.f5527o = new Runnable() { // from class: l.o1s
            @Override // java.lang.Runnable
            public final void run() {
                this.f16335a.m6937w();
            }
        };
    }
}
