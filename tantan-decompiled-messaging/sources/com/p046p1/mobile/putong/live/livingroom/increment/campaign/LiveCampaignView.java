package com.p046p1.mobile.putong.live.livingroom.increment.campaign;

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
import com.p046p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p046p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p046p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView;
import com.p046p1.mobile.putong.live.livingroom.increment.campaign.view.CampaignItemView;
import com.p046p1.mobile.putong.live.livingroom.increment.campaign.view.CampaignSnapShotItemView;
import com.p046p1.mobile.putong.live.livingroom.view.LiveScrollView;
import immomo.com.mklibrary.core.base.p115ui.MKWebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VPager;
import p149l.ad4;
import p149l.cit;
import p149l.e30;
import p149l.e51;
import p149l.fe4;
import p149l.g5c0;
import p149l.i3c0;
import p149l.oc4;
import p149l.pc4;
import p149l.s7m;
import p149l.t100;
import p149l.vd4;
import p149l.vdt;
import p149l.vwb;
import p149l.w1s;
import p149l.w9j;
import p149l.xdl0;
import p149l.y660;
import p149l.zd4;

/* JADX INFO: loaded from: classes4.dex */
public class LiveCampaignView extends FrameLayout implements s7m<vd4> {

    /* JADX INFO: renamed from: a */
    public LiveCampaignView f49471a;

    /* JADX INFO: renamed from: b */
    public VPager f49472b;

    /* JADX INFO: renamed from: c */
    public VLinear f49473c;

    /* JADX INFO: renamed from: d */
    public vd4 f49474d;

    /* JADX INFO: renamed from: e */
    public ad4 f49475e;

    /* JADX INFO: renamed from: f */
    public final List<pc4> f49476f;

    /* JADX INFO: renamed from: g */
    public float f49477g;

    /* JADX INFO: renamed from: h */
    public float f49478h;

    /* JADX INFO: renamed from: i */
    public boolean f49479i;

    /* JADX INFO: renamed from: j */
    public final Handler f49480j;

    /* JADX INFO: renamed from: k */
    public int f49481k;

    /* JADX INFO: renamed from: l */
    public View[] f49482l;

    /* JADX INFO: renamed from: m */
    public boolean f49483m;

    /* JADX INFO: renamed from: n */
    public boolean f49484n;

    /* JADX INFO: renamed from: o */
    public final Runnable f49485o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView$a */
    public class C12791a extends y660 {
        public C12791a() {
        }

        @Override // p149l.y660, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
            LiveCampaignView.this.m73385I();
            if (i != 0) {
                return;
            }
            int i2 = LiveCampaignView.this.f49481k;
            LiveCampaignView liveCampaignView = LiveCampaignView.this;
            if (i2 == 0) {
                liveCampaignView.f49472b.m4176T(liveCampaignView.f49476f.size() - 2, false);
            } else if (liveCampaignView.f49481k == LiveCampaignView.this.f49476f.size() - 1) {
                LiveCampaignView.this.f49472b.m4176T(1, false);
            }
        }

        @Override // p149l.y660, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            if (LiveCampaignView.this.f49476f.size() <= 1) {
                return;
            }
            LiveCampaignView.this.f49481k = i;
            for (View view : LiveCampaignView.this.f49482l) {
                view.setSelected(false);
            }
            int length = LiveCampaignView.this.f49482l.length;
            if (LiveCampaignView.this.f49481k > length || LiveCampaignView.this.f49481k <= 0) {
                int i2 = LiveCampaignView.this.f49481k;
                LiveCampaignView liveCampaignView = LiveCampaignView.this;
                if (i2 == 0) {
                    liveCampaignView.f49482l[length - 1].setSelected(true);
                } else {
                    liveCampaignView.f49482l[0].setSelected(true);
                }
            } else {
                LiveCampaignView.this.f49482l[LiveCampaignView.this.f49481k - 1].setSelected(true);
            }
            LiveCampaignView.this.m73381B();
        }
    }

    public LiveCampaignView(Context context) {
        super(context);
        this.f49476f = new ArrayList();
        this.f49479i = false;
        this.f49480j = new Handler();
        this.f49484n = true;
        this.f49485o = new Runnable() { // from class: l.o1s
            @Override // java.lang.Runnable
            public final void run() {
                this.f141473a.m73399w();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public void m73381B() {
        if (this.f49484n && !vwb.m200296J(this.f49476f) && this.f49476f.size() > this.f49472b.getCurrentItem()) {
            int i = this.f49476f.get(this.f49472b.getCurrentItem()).getCom.immomo.momomediaext.sei.BaseSei.INFO java.lang.String().carouselSeconds * 1000;
            this.f49480j.removeCallbacks(this.f49485o);
            this.f49480j.postDelayed(this.f49485o, i);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: E */
    private void m73382E(List<BLiveCampaign> list) {
        ArrayList arrayListM200303Q = vwb.m200303Q(list, new w9j() { // from class: l.u1s
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return LiveCampaignView.m73387b((BLiveCampaign) obj);
            }
        });
        if (list.size() > 1) {
            m73383F();
            this.f49476f.clear();
            this.f49476f.add(new zd4(list.get(list.size() - 1)));
            this.f49476f.addAll(arrayListM200303Q);
            this.f49476f.add(new zd4(list.get(0)));
            setIndicator(list.size());
            return;
        }
        this.f49480j.removeCallbacks(this.f49485o);
        this.f49472b.m4189i();
        this.f49472b.setOnTouchListener(null);
        this.f49476f.clear();
        this.f49476f.addAll(arrayListM200303Q);
        this.f49472b.setCurrentItem(0);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: F */
    private void m73383F() {
        this.f49472b.m4185d(new C12791a());
        this.f49472b.setOnTouchListener(new View.OnTouchListener() { // from class: l.v1s
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f179271a.m73410z(view, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    private void m73384G() {
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
        ViewGroup.LayoutParams layoutParams = this.f49472b.getLayoutParams();
        layoutParams.width = t100.m186890d(maxWidth);
        layoutParams.height = t100.m186890d(maxHeight);
        this.f49472b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public void m73385I() {
        Bitmap drawingCache;
        View viewM73397s = m73397s(0);
        View viewM73397s2 = m73397s(this.f49476f.size() - 2);
        Bitmap drawingCache2 = null;
        if (viewM73397s != null && viewM73397s2 != null) {
            if (viewM73397s2 instanceof CampaignItemView) {
                drawingCache = ((CampaignItemView) viewM73397s2).getViewBitmap();
            } else {
                drawingCache = viewM73397s2 instanceof VDraweeView ? viewM73397s2.getDrawingCache() : null;
            }
            if (drawingCache != null) {
                ((CampaignSnapShotItemView) viewM73397s).setBg(drawingCache);
            }
        }
        View viewM73397s3 = m73397s(this.f49476f.size() - 1);
        View viewM73397s4 = m73397s(1);
        if (viewM73397s3 == null || viewM73397s4 == null) {
            return;
        }
        if (viewM73397s2 instanceof CampaignItemView) {
            drawingCache2 = ((CampaignItemView) viewM73397s2).getViewBitmap();
        } else if (viewM73397s2 instanceof VDraweeView) {
            drawingCache2 = viewM73397s2.getDrawingCache();
        }
        if (drawingCache2 != null) {
            ((CampaignSnapShotItemView) viewM73397s3).setBg(drawingCache2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ pc4 m73387b(BLiveCampaign bLiveCampaign) {
        return (vdt.m198092b(2) || !bLiveCampaign.isImageType()) ? new fe4(bLiveCampaign) : new oc4(bLiveCampaign);
    }

    private int getMaxHeight() {
        boolean zM198092b = vdt.m198092b(2);
        boolean z = this.f49483m;
        if (zM198092b) {
            return z ? 96 : 144;
        }
        return z ? 107 : 126;
    }

    private int getMaxWidth() {
        boolean zM198092b = vdt.m198092b(2);
        boolean z = this.f49483m;
        if (zM198092b) {
            return z ? 73 : 110;
        }
        return z ? 81 : 95;
    }

    private Pair<Integer, Integer> getValidMaxRatio() {
        Iterator it = vwb.m200303Q(this.f49476f, new w9j() { // from class: l.p1s
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((pc4) obj).getCom.immomo.momomediaext.sei.BaseSei.INFO java.lang.String();
            }
        }).iterator();
        int iIntValue = 0;
        int iIntValue2 = 0;
        while (it.hasNext()) {
            List<Integer> list = ((BLiveCampaign) it.next()).entranceSize;
            if (list.size() == 2) {
                if (iIntValue < list.get(0).intValue()) {
                    iIntValue = list.get(0).intValue();
                }
                if (iIntValue2 < list.get(1).intValue()) {
                    iIntValue2 = list.get(1).intValue();
                }
            }
        }
        return new Pair<>(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
    }

    @Nullable
    /* JADX INFO: renamed from: s */
    private View m73397s(int i) {
        int childCount = this.f49472b.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f49472b.getChildAt(i2);
            Object tag = childAt.getTag(g5c0.f101076v3);
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == i) {
                return childAt;
            }
        }
        return null;
    }

    private void setIndicator(int i) {
        if (this.f49482l != null) {
            this.f49473c.removeAllViews();
        }
        this.f49482l = new View[i];
        int i2 = 0;
        while (i2 < i) {
            View view = new View(getContext());
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(t100.m186890d(6.0f), t100.m186890d(6.0f));
            marginLayoutParams.setMargins(t100.m186890d(5.0f), 0, t100.m186890d(5.0f), 0);
            view.setLayoutParams(marginLayoutParams);
            view.setBackground(getResources().getDrawable(i3c0.f110900W6));
            view.setSelected(i2 == 0);
            this.f49482l[i2] = view;
            this.f49473c.addView(view);
            i2++;
        }
    }

    /* JADX INFO: renamed from: u */
    private void m73398u(e30<CampaignItemView> e30Var) {
        VPager vPager = this.f49472b;
        if (vPager == null || vPager.getChildCount() <= 0) {
            return;
        }
        for (int i = 0; i < this.f49472b.getChildCount(); i++) {
            View childAt = this.f49472b.getChildAt(i);
            if (childAt instanceof CampaignItemView) {
                e30Var.call((CampaignItemView) childAt);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m73399w() {
        VPager vPager = this.f49472b;
        vPager.setCurrentItem(vPager.getCurrentItem() + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m73400x() {
        xdl0.m208344M(this.f49471a, m73408v());
    }

    /* JADX INFO: renamed from: A */
    public void m73401A(List<LongLinkGiftMessage.LiveCampaignInfo> list) {
        int childCount = this.f49472b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f49472b.getChildAt(i);
            if (childAt instanceof CampaignItemView) {
                ((CampaignItemView) childAt).m73428r(list);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX INFO: renamed from: C */
    public void m73402C(List<BLiveCampaign> list) {
        this.f49483m = this.f49474d.m206027E2().mo132054A0().equals(BLiveAbsData.VOICE_LIVE);
        if (vwb.m200296J(list)) {
            xdl0.m208344M(this.f49471a, false);
            this.f49474d.m197938A4(false);
            List<pc4> list2 = this.f49476f;
            if (list2 != null) {
                list2.clear();
                return;
            }
            return;
        }
        if (this.f49475e == null) {
            ad4 ad4Var = new ad4(this.f49474d);
            this.f49475e = ad4Var;
            this.f49472b.setAdapter(ad4Var);
        }
        m73382E(list);
        m73384G();
        this.f49472b.setOffscreenPageLimit(this.f49476f.size());
        this.f49475e.m95861u(this.f49476f);
        this.f49474d.m197938A4(m73408v());
        if (this.f49476f.size() > 1) {
            this.f49472b.setCurrentItem(1);
            this.f49482l[0].setSelected(true);
        }
        e51.m114742G(new Runnable() { // from class: l.s1s
            @Override // java.lang.Runnable
            public final void run() {
                this.f161934a.m73400x();
            }
        });
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: H */
    public void m73403H(boolean z) {
        VLinear vLinear = this.f49473c;
        if (z) {
            xdl0.m208344M(vLinear, this.f49472b.getChildCount() > 1);
        } else {
            xdl0.m208344M(vLinear, false);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m73404J() {
        xdl0.m208344M(this, m73408v());
    }

    @Override // p149l.s7m
    @SuppressLint({"ClickableViewAccessibility"})
    public void destroy() {
        xdl0.m208344M(this, false);
        xdl0.m208344M(this.f49473c, false);
        this.f49480j.removeCallbacks(this.f49485o);
        this.f49472b.setOnTouchListener(null);
        this.f49472b.m4189i();
        m73398u(new e30() { // from class: l.t1s
            @Override // p149l.e30
            public final void call(Object obj) {
                ((CampaignItemView) obj).m73419i();
            }
        });
        ad4 ad4Var = this.f49475e;
        if (ad4Var != null) {
            ad4Var.m95860t();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        vd4 vd4Var = this.f49474d;
        if (vd4Var == null || vd4Var.m206032L2()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        LiveScrollView liveScrollViewM107098a = cit.m107098a(this.f49474d);
        if (liveScrollViewM107098a == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            liveScrollViewM107098a.requestDisallowInterceptTouchEvent(true);
            this.f49477g = motionEvent.getRawX();
            this.f49478h = motionEvent.getRawY();
        } else if (action == 1) {
            this.f49479i = false;
        } else {
            if (action == 2) {
                float fAbs = Math.abs(this.f49478h - motionEvent.getRawY()) / Math.abs(this.f49477g - motionEvent.getRawX());
                float fAbs2 = Math.abs(this.f49477g - motionEvent.getRawX()) / Math.abs(this.f49478h - motionEvent.getRawY());
                if (fAbs > 2.0f && !this.f49479i) {
                    liveScrollViewM107098a.requestDisallowInterceptTouchEvent(false);
                } else if (fAbs2 > 2.0f) {
                    this.f49479i = true;
                    liveScrollViewM107098a.requestDisallowInterceptTouchEvent(true);
                }
            } else if (action == 3) {
            }
            this.f49479i = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public List<MKWebView> getMKWebViewList() {
        ArrayList arrayList = new ArrayList();
        int childCount = this.f49472b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f49472b.getChildAt(i);
            if (childAt instanceof CampaignItemView) {
                arrayList.add(((CampaignItemView) childAt).f49489c);
            }
        }
        return arrayList;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final void m73405n(View view) {
        w1s.m200949a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m73405n(this);
    }

    /* JADX INFO: renamed from: p */
    public void m73406p() {
        m73398u(new e30() { // from class: l.r1s
            @Override // p149l.e30
            public final void call(Object obj) {
                ((CampaignItemView) obj).m73418h();
            }
        });
        ad4 ad4Var = this.f49475e;
        if (ad4Var != null) {
            ad4Var.m95859r();
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(vd4 vd4Var) {
        this.f49474d = vd4Var;
    }

    public void setAutoplay(boolean z) {
        this.f49484n = z;
        if (z) {
            m73381B();
        } else {
            this.f49480j.removeCallbacks(this.f49485o);
        }
    }

    public void setLiveCampaignLocation(final boolean z) {
        post(new Runnable() { // from class: l.q1s
            @Override // java.lang.Runnable
            public final void run() {
                this.f152163a.m73409y(z);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public boolean m73408v() {
        return this.f49474d.m197955f4() && !vwb.m200296J(this.f49476f);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m73409y(boolean z) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = z ? this.f49474d.m197958i4() : t100.m186890d(70.0f);
            setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean m73410z(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                }
            }
            m73381B();
            return false;
        }
        this.f49480j.removeCallbacks(this.f49485o);
        return false;
    }

    public LiveCampaignView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49476f = new ArrayList();
        this.f49479i = false;
        this.f49480j = new Handler();
        this.f49484n = true;
        this.f49485o = new Runnable() { // from class: l.o1s
            @Override // java.lang.Runnable
            public final void run() {
                this.f141473a.m73399w();
            }
        };
    }

    public LiveCampaignView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49476f = new ArrayList();
        this.f49479i = false;
        this.f49480j = new Handler();
        this.f49484n = true;
        this.f49485o = new Runnable() { // from class: l.o1s
            @Override // java.lang.Runnable
            public final void run() {
                this.f141473a.m73399w();
            }
        };
    }
}
