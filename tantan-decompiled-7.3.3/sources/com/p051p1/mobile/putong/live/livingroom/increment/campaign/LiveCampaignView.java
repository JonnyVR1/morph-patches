package com.p051p1.mobile.putong.live.livingroom.increment.campaign;

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
import com.hellogroup.p036mk.business.base.p037ui.MKWebView;
import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;
import com.p051p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p051p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView;
import com.p051p1.mobile.putong.live.livingroom.increment.campaign.view.CampaignItemView;
import com.p051p1.mobile.putong.live.livingroom.increment.campaign.view.CampaignSnapShotItemView;
import com.p051p1.mobile.putong.live.livingroom.view.LiveScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VPager;
import p153l.bnl0;
import p153l.dkt;
import p153l.ef4;
import p153l.ef60;
import p153l.iam;
import p153l.jyb;
import p153l.l51;
import p153l.mdc0;
import p153l.nd4;
import p153l.obc0;
import p153l.od4;
import p153l.qa00;
import p153l.qcj;
import p153l.ue4;
import p153l.wft;
import p153l.x3s;
import p153l.y20;
import p153l.ye4;
import p153l.zd4;

/* JADX INFO: loaded from: classes4.dex */
public class LiveCampaignView extends FrameLayout implements iam<ue4> {

    /* JADX INFO: renamed from: a */
    public LiveCampaignView f50319a;

    /* JADX INFO: renamed from: b */
    public VPager f50320b;

    /* JADX INFO: renamed from: c */
    public VLinear f50321c;

    /* JADX INFO: renamed from: d */
    public ue4 f50322d;

    /* JADX INFO: renamed from: e */
    public zd4 f50323e;

    /* JADX INFO: renamed from: f */
    public final List<od4> f50324f;

    /* JADX INFO: renamed from: g */
    public float f50325g;

    /* JADX INFO: renamed from: h */
    public float f50326h;

    /* JADX INFO: renamed from: i */
    public boolean f50327i;

    /* JADX INFO: renamed from: j */
    public final Handler f50328j;

    /* JADX INFO: renamed from: k */
    public int f50329k;

    /* JADX INFO: renamed from: l */
    public View[] f50330l;

    /* JADX INFO: renamed from: m */
    public boolean f50331m;

    /* JADX INFO: renamed from: n */
    public boolean f50332n;

    /* JADX INFO: renamed from: o */
    public final Runnable f50333o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.campaign.LiveCampaignView$a */
    public class C12954a extends ef60 {
        public C12954a() {
        }

        @Override // p153l.ef60, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
            LiveCampaignView.this.m74568I();
            if (i != 0) {
                return;
            }
            int i2 = LiveCampaignView.this.f50329k;
            LiveCampaignView liveCampaignView = LiveCampaignView.this;
            if (i2 == 0) {
                liveCampaignView.f50320b.m4178T(liveCampaignView.f50324f.size() - 2, false);
            } else if (liveCampaignView.f50329k == LiveCampaignView.this.f50324f.size() - 1) {
                LiveCampaignView.this.f50320b.m4178T(1, false);
            }
        }

        @Override // p153l.ef60, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            if (LiveCampaignView.this.f50324f.size() <= 1) {
                return;
            }
            LiveCampaignView.this.f50329k = i;
            for (View view : LiveCampaignView.this.f50330l) {
                view.setSelected(false);
            }
            int length = LiveCampaignView.this.f50330l.length;
            if (LiveCampaignView.this.f50329k > length || LiveCampaignView.this.f50329k <= 0) {
                int i2 = LiveCampaignView.this.f50329k;
                LiveCampaignView liveCampaignView = LiveCampaignView.this;
                if (i2 == 0) {
                    liveCampaignView.f50330l[length - 1].setSelected(true);
                } else {
                    liveCampaignView.f50330l[0].setSelected(true);
                }
            } else {
                LiveCampaignView.this.f50330l[LiveCampaignView.this.f50329k - 1].setSelected(true);
            }
            LiveCampaignView.this.m74564B();
        }
    }

    public LiveCampaignView(Context context) {
        super(context);
        this.f50324f = new ArrayList();
        this.f50327i = false;
        this.f50328j = new Handler();
        this.f50332n = true;
        this.f50333o = new Runnable() { // from class: l.p3s
            @Override // java.lang.Runnable
            public final void run() {
                this.f150464a.m74582w();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: B */
    public void m74564B() {
        if (this.f50332n && !jyb.m147479J(this.f50324f) && this.f50324f.size() > this.f50320b.getCurrentItem()) {
            int i = this.f50324f.get(this.f50320b.getCurrentItem()).getCom.immomo.momomediaext.sei.BaseSei.INFO java.lang.String().carouselSeconds * 1000;
            this.f50328j.removeCallbacks(this.f50333o);
            this.f50328j.postDelayed(this.f50333o, i);
        }
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: E */
    private void m74565E(List<BLiveCampaign> list) {
        ArrayList arrayListM147486Q = jyb.m147486Q(list, new qcj() { // from class: l.v3s
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return LiveCampaignView.m74570b((BLiveCampaign) obj);
            }
        });
        if (list.size() > 1) {
            m74566F();
            this.f50324f.clear();
            this.f50324f.add(new ye4(list.get(list.size() - 1)));
            this.f50324f.addAll(arrayListM147486Q);
            this.f50324f.add(new ye4(list.get(0)));
            setIndicator(list.size());
            return;
        }
        this.f50328j.removeCallbacks(this.f50333o);
        this.f50320b.m4191i();
        this.f50320b.setOnTouchListener(null);
        this.f50324f.clear();
        this.f50324f.addAll(arrayListM147486Q);
        this.f50320b.setCurrentItem(0);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: F */
    private void m74566F() {
        this.f50320b.m4187d(new C12954a());
        this.f50320b.setOnTouchListener(new View.OnTouchListener() { // from class: l.w3s
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f187166a.m74593z(view, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: G */
    private void m74567G() {
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
        ViewGroup.LayoutParams layoutParams = this.f50320b.getLayoutParams();
        layoutParams.width = qa00.m175859d(maxWidth);
        layoutParams.height = qa00.m175859d(maxHeight);
        this.f50320b.setLayoutParams(layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: I */
    public void m74568I() {
        Bitmap drawingCache;
        View viewM74580s = m74580s(0);
        View viewM74580s2 = m74580s(this.f50324f.size() - 2);
        Bitmap drawingCache2 = null;
        if (viewM74580s != null && viewM74580s2 != null) {
            if (viewM74580s2 instanceof CampaignItemView) {
                drawingCache = ((CampaignItemView) viewM74580s2).getViewBitmap();
            } else {
                drawingCache = viewM74580s2 instanceof VDraweeView ? viewM74580s2.getDrawingCache() : null;
            }
            if (drawingCache != null) {
                ((CampaignSnapShotItemView) viewM74580s).setBg(drawingCache);
            }
        }
        View viewM74580s3 = m74580s(this.f50324f.size() - 1);
        View viewM74580s4 = m74580s(1);
        if (viewM74580s3 == null || viewM74580s4 == null) {
            return;
        }
        if (viewM74580s2 instanceof CampaignItemView) {
            drawingCache2 = ((CampaignItemView) viewM74580s2).getViewBitmap();
        } else if (viewM74580s2 instanceof VDraweeView) {
            drawingCache2 = viewM74580s2.getDrawingCache();
        }
        if (drawingCache2 != null) {
            ((CampaignSnapShotItemView) viewM74580s3).setBg(drawingCache2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ od4 m74570b(BLiveCampaign bLiveCampaign) {
        return (wft.m206159b(2) || !bLiveCampaign.isImageType()) ? new ef4(bLiveCampaign) : new nd4(bLiveCampaign);
    }

    private int getMaxHeight() {
        boolean zM206159b = wft.m206159b(2);
        boolean z = this.f50331m;
        if (zM206159b) {
            return z ? 96 : 144;
        }
        return z ? 107 : 126;
    }

    private int getMaxWidth() {
        boolean zM206159b = wft.m206159b(2);
        boolean z = this.f50331m;
        if (zM206159b) {
            return z ? 73 : 110;
        }
        return z ? 81 : 95;
    }

    private Pair<Integer, Integer> getValidMaxRatio() {
        Iterator it = jyb.m147486Q(this.f50324f, new qcj() { // from class: l.q3s
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((od4) obj).getCom.immomo.momomediaext.sei.BaseSei.INFO java.lang.String();
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
    private View m74580s(int i) {
        int childCount = this.f50320b.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f50320b.getChildAt(i2);
            Object tag = childAt.getTag(mdc0.f136321v3);
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == i) {
                return childAt;
            }
        }
        return null;
    }

    private void setIndicator(int i) {
        if (this.f50330l != null) {
            this.f50321c.removeAllViews();
        }
        this.f50330l = new View[i];
        int i2 = 0;
        while (i2 < i) {
            View view = new View(getContext());
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(qa00.m175859d(6.0f), qa00.m175859d(6.0f));
            marginLayoutParams.setMargins(qa00.m175859d(5.0f), 0, qa00.m175859d(5.0f), 0);
            view.setLayoutParams(marginLayoutParams);
            view.setBackground(getResources().getDrawable(obc0.f146228W6));
            view.setSelected(i2 == 0);
            this.f50330l[i2] = view;
            this.f50321c.addView(view);
            i2++;
        }
    }

    /* JADX INFO: renamed from: u */
    private void m74581u(y20<CampaignItemView> y20Var) {
        VPager vPager = this.f50320b;
        if (vPager == null || vPager.getChildCount() <= 0) {
            return;
        }
        for (int i = 0; i < this.f50320b.getChildCount(); i++) {
            View childAt = this.f50320b.getChildAt(i);
            if (childAt instanceof CampaignItemView) {
                y20Var.call((CampaignItemView) childAt);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public /* synthetic */ void m74582w() {
        VPager vPager = this.f50320b;
        vPager.setCurrentItem(vPager.getCurrentItem() + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: x */
    public /* synthetic */ void m74583x() {
        bnl0.m105524M(this.f50319a, m74591v());
    }

    /* JADX INFO: renamed from: A */
    public void m74584A(List<LongLinkGiftMessage.LiveCampaignInfo> list) {
        int childCount = this.f50320b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f50320b.getChildAt(i);
            if (childAt instanceof CampaignItemView) {
                ((CampaignItemView) childAt).m74611r(list);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX INFO: renamed from: C */
    public void m74585C(List<BLiveCampaign> list) {
        this.f50331m = this.f50322d.m213810E2().mo118362A0().equals(BLiveAbsData.VOICE_LIVE);
        if (jyb.m147479J(list)) {
            bnl0.m105524M(this.f50319a, false);
            this.f50322d.m195619A4(false);
            List<od4> list2 = this.f50324f;
            if (list2 != null) {
                list2.clear();
                return;
            }
            return;
        }
        if (this.f50323e == null) {
            zd4 zd4Var = new zd4(this.f50322d);
            this.f50323e = zd4Var;
            this.f50320b.setAdapter(zd4Var);
        }
        m74565E(list);
        m74567G();
        this.f50320b.setOffscreenPageLimit(this.f50324f.size());
        this.f50323e.m219276u(this.f50324f);
        this.f50322d.m195619A4(m74591v());
        if (this.f50324f.size() > 1) {
            this.f50320b.setCurrentItem(1);
            this.f50330l[0].setSelected(true);
        }
        l51.m152887G(new Runnable() { // from class: l.t3s
            @Override // java.lang.Runnable
            public final void run() {
                this.f171950a.m74583x();
            }
        });
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: H */
    public void m74586H(boolean z) {
        VLinear vLinear = this.f50321c;
        if (z) {
            bnl0.m105524M(vLinear, this.f50320b.getChildCount() > 1);
        } else {
            bnl0.m105524M(vLinear, false);
        }
    }

    /* JADX INFO: renamed from: J */
    public void m74587J() {
        bnl0.m105524M(this, m74591v());
    }

    @Override // p153l.iam
    @SuppressLint({"ClickableViewAccessibility"})
    public void destroy() {
        bnl0.m105524M(this, false);
        bnl0.m105524M(this.f50321c, false);
        this.f50328j.removeCallbacks(this.f50333o);
        this.f50320b.setOnTouchListener(null);
        this.f50320b.m4191i();
        m74581u(new y20() { // from class: l.u3s
            @Override // p153l.y20
            public final void call(Object obj) {
                ((CampaignItemView) obj).m74602i();
            }
        });
        zd4 zd4Var = this.f50323e;
        if (zd4Var != null) {
            zd4Var.m219275t();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        ue4 ue4Var = this.f50322d;
        if (ue4Var == null || ue4Var.m213815L2()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        LiveScrollView liveScrollViewM116675a = dkt.m116675a(this.f50322d);
        if (liveScrollViewM116675a == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            liveScrollViewM116675a.requestDisallowInterceptTouchEvent(true);
            this.f50325g = motionEvent.getRawX();
            this.f50326h = motionEvent.getRawY();
        } else if (action == 1) {
            this.f50327i = false;
        } else {
            if (action == 2) {
                float fAbs = Math.abs(this.f50326h - motionEvent.getRawY()) / Math.abs(this.f50325g - motionEvent.getRawX());
                float fAbs2 = Math.abs(this.f50325g - motionEvent.getRawX()) / Math.abs(this.f50326h - motionEvent.getRawY());
                if (fAbs > 2.0f && !this.f50327i) {
                    liveScrollViewM116675a.requestDisallowInterceptTouchEvent(false);
                } else if (fAbs2 > 2.0f) {
                    this.f50327i = true;
                    liveScrollViewM116675a.requestDisallowInterceptTouchEvent(true);
                }
            } else if (action == 3) {
            }
            this.f50327i = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public List<MKWebView> getMKWebViewList() {
        ArrayList arrayList = new ArrayList();
        int childCount = this.f50320b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f50320b.getChildAt(i);
            if (childAt instanceof CampaignItemView) {
                arrayList.add(((CampaignItemView) childAt).f50337c);
            }
        }
        return arrayList;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: n */
    public final void m74588n(View view) {
        x3s.m209261a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m74588n(this);
    }

    /* JADX INFO: renamed from: p */
    public void m74589p() {
        m74581u(new y20() { // from class: l.s3s
            @Override // p153l.y20
            public final void call(Object obj) {
                ((CampaignItemView) obj).m74601h();
            }
        });
        zd4 zd4Var = this.f50323e;
        if (zd4Var != null) {
            zd4Var.m219274r();
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ue4 ue4Var) {
        this.f50322d = ue4Var;
    }

    public void setAutoplay(boolean z) {
        this.f50332n = z;
        if (z) {
            m74564B();
        } else {
            this.f50328j.removeCallbacks(this.f50333o);
        }
    }

    public void setLiveCampaignLocation(final boolean z) {
        post(new Runnable() { // from class: l.r3s
            @Override // java.lang.Runnable
            public final void run() {
                this.f161078a.m74592y(z);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public boolean m74591v() {
        return this.f50322d.m195636f4() && !jyb.m147479J(this.f50324f);
    }

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ void m74592y(boolean z) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin = z ? this.f50322d.m195639i4() : qa00.m175859d(70.0f);
            setLayoutParams(layoutParams);
        }
    }

    /* JADX INFO: renamed from: z */
    public final /* synthetic */ boolean m74593z(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                }
            }
            m74564B();
            return false;
        }
        this.f50328j.removeCallbacks(this.f50333o);
        return false;
    }

    public LiveCampaignView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50324f = new ArrayList();
        this.f50327i = false;
        this.f50328j = new Handler();
        this.f50332n = true;
        this.f50333o = new Runnable() { // from class: l.p3s
            @Override // java.lang.Runnable
            public final void run() {
                this.f150464a.m74582w();
            }
        };
    }

    public LiveCampaignView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50324f = new ArrayList();
        this.f50327i = false;
        this.f50328j = new Handler();
        this.f50332n = true;
        this.f50333o = new Runnable() { // from class: l.p3s
            @Override // java.lang.Runnable
            public final void run() {
                this.f150464a.m74582w();
            }
        };
    }
}
