package com.p046p1.mobile.putong.live.external.internal.vchat.module.campaign;

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
import com.p046p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.campaign.view.LiveVChatCampaignItemView;
import com.p046p1.mobile.putong.live.external.internal.vchat.module.campaign.view.LiveVChatCampaignSnapShotItemView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VPager;
import p149l.ae4;
import p149l.e30;
import p149l.e51;
import p149l.g5c0;
import p149l.i3c0;
import p149l.kgu;
import p149l.qc4;
import p149l.s7m;
import p149l.t100;
import p149l.ugu;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;
import p149l.xfu;
import p149l.y660;

/* JADX INFO: loaded from: classes13.dex */
public class LiveVChatCampaignView extends FrameLayout implements s7m<kgu> {

    /* JADX INFO: renamed from: a */
    public LiveVChatCampaignView f45117a;

    /* JADX INFO: renamed from: b */
    public VPager f45118b;

    /* JADX INFO: renamed from: c */
    public VLinear f45119c;

    /* JADX INFO: renamed from: d */
    public kgu f45120d;

    /* JADX INFO: renamed from: e */
    public xfu f45121e;

    /* JADX INFO: renamed from: f */
    public final List<qc4> f45122f;

    /* JADX INFO: renamed from: g */
    public final Handler f45123g;

    /* JADX INFO: renamed from: h */
    public int f45124h;

    /* JADX INFO: renamed from: i */
    public View[] f45125i;

    /* JADX INFO: renamed from: j */
    public boolean f45126j;

    /* JADX INFO: renamed from: k */
    public final Runnable f45127k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.campaign.LiveVChatCampaignView$a */
    public class C12513a extends y660 {
        public C12513a() {
        }

        @Override // p149l.y660, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
            LiveVChatCampaignView.this.m69312E();
            if (i != 0) {
                return;
            }
            int i2 = LiveVChatCampaignView.this.f45124h;
            LiveVChatCampaignView liveVChatCampaignView = LiveVChatCampaignView.this;
            if (i2 == 0) {
                liveVChatCampaignView.f45118b.m4176T(liveVChatCampaignView.f45122f.size() - 2, false);
            } else if (liveVChatCampaignView.f45124h == LiveVChatCampaignView.this.f45122f.size() - 1) {
                LiveVChatCampaignView.this.f45118b.m4176T(1, false);
            }
        }

        @Override // p149l.y660, androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            if (LiveVChatCampaignView.this.f45122f.size() <= 1) {
                return;
            }
            LiveVChatCampaignView.this.f45124h = i;
            for (View view : LiveVChatCampaignView.this.f45125i) {
                view.setSelected(false);
            }
            int length = LiveVChatCampaignView.this.f45125i.length;
            if (LiveVChatCampaignView.this.f45124h > length || LiveVChatCampaignView.this.f45124h <= 0) {
                int i2 = LiveVChatCampaignView.this.f45124h;
                LiveVChatCampaignView liveVChatCampaignView = LiveVChatCampaignView.this;
                if (i2 == 0) {
                    liveVChatCampaignView.f45125i[length - 1].setSelected(true);
                } else {
                    liveVChatCampaignView.f45125i[0].setSelected(true);
                }
            } else {
                LiveVChatCampaignView.this.f45125i[LiveVChatCampaignView.this.f45124h - 1].setSelected(true);
            }
            LiveVChatCampaignView.this.m69322y();
        }
    }

    public LiveVChatCampaignView(Context context) {
        super(context);
        this.f45122f = new ArrayList();
        this.f45123g = new Handler();
        this.f45126j = true;
        this.f45127k = new Runnable() { // from class: l.ngu
            @Override // java.lang.Runnable
            public final void run() {
                this.f138906a.m69308u();
            }
        };
    }

    private Pair<Integer, Integer> getValidMaxRatio() {
        Iterator it = vwb.m200303Q(this.f45122f, new w9j() { // from class: l.ogu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((qc4) obj).getCom.immomo.momomediaext.sei.BaseSei.INFO java.lang.String();
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

    private void setIndicator(int i) {
        if (this.f45125i != null) {
            this.f45119c.removeAllViews();
        }
        this.f45125i = new View[i];
        int i2 = 0;
        while (i2 < i) {
            View view = new View(getContext());
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(t100.m186890d(6.0f), t100.m186890d(6.0f));
            marginLayoutParams.setMargins(t100.m186890d(5.0f), 0, t100.m186890d(5.0f), 0);
            view.setLayoutParams(marginLayoutParams);
            view.setBackground(getResources().getDrawable(i3c0.f110900W6));
            view.setSelected(i2 == 0);
            this.f45125i[i2] = view;
            this.f45119c.addView(view);
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m69308u() {
        VPager vPager = this.f45118b;
        vPager.setCurrentItem(vPager.getCurrentItem() + 1);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: A */
    public final void m69309A(List<BLiveCampaign> list) {
        ArrayList arrayListM200303Q = vwb.m200303Q(list, new w9j() { // from class: l.sgu
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return new ge4((BLiveCampaign) obj);
            }
        });
        if (list.size() > 1) {
            m69310B();
            this.f45122f.clear();
            this.f45122f.add(new ae4(list.get(list.size() - 1)));
            this.f45122f.addAll(arrayListM200303Q);
            this.f45122f.add(new ae4(list.get(0)));
            setIndicator(list.size());
            return;
        }
        this.f45123g.removeCallbacks(this.f45127k);
        this.f45118b.m4189i();
        this.f45118b.setOnTouchListener(null);
        this.f45122f.clear();
        this.f45122f.addAll(arrayListM200303Q);
        this.f45118b.setCurrentItem(0);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: B */
    public final void m69310B() {
        this.f45118b.m4185d(new C12513a());
        this.f45118b.setOnTouchListener(new View.OnTouchListener() { // from class: l.tgu
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f170131a.m69320w(view, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public final void m69311C() {
        Pair<Integer, Integer> validMaxRatio = getValidMaxRatio();
        int iIntValue = ((Integer) validMaxRatio.first).intValue();
        int iIntValue2 = ((Integer) validMaxRatio.second).intValue();
        if (iIntValue == 0 || iIntValue > 110) {
            iIntValue = 110;
        }
        if (iIntValue2 == 0 || iIntValue2 > 34) {
            iIntValue2 = 34;
        }
        ViewGroup.LayoutParams layoutParams = this.f45118b.getLayoutParams();
        layoutParams.width = t100.m186890d(iIntValue);
        layoutParams.height = t100.m186890d(iIntValue2);
        this.f45118b.setLayoutParams(layoutParams);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: E */
    public final void m69312E() {
        Bitmap drawingCache;
        View viewM69316p = m69316p(0);
        View viewM69316p2 = m69316p(this.f45122f.size() - 2);
        Bitmap drawingCache2 = null;
        if (viewM69316p != null && viewM69316p2 != null) {
            if (viewM69316p2 instanceof LiveVChatCampaignItemView) {
                drawingCache = ((LiveVChatCampaignItemView) viewM69316p2).getViewBitmap();
            } else {
                drawingCache = viewM69316p2 instanceof VDraweeView ? viewM69316p2.getDrawingCache() : null;
            }
            if (drawingCache != null) {
                ((LiveVChatCampaignSnapShotItemView) viewM69316p).setBg(drawingCache);
            }
        }
        View viewM69316p3 = m69316p(this.f45122f.size() - 1);
        View viewM69316p4 = m69316p(1);
        if (viewM69316p3 == null || viewM69316p4 == null) {
            return;
        }
        if (viewM69316p2 instanceof LiveVChatCampaignItemView) {
            drawingCache2 = ((LiveVChatCampaignItemView) viewM69316p2).getViewBitmap();
        } else if (viewM69316p2 instanceof VDraweeView) {
            drawingCache2 = viewM69316p2.getDrawingCache();
        }
        if (drawingCache2 != null) {
            ((LiveVChatCampaignSnapShotItemView) viewM69316p3).setBg(drawingCache2);
        }
    }

    @Override // p149l.s7m
    @SuppressLint({"ClickableViewAccessibility"})
    public void destroy() {
        xdl0.m208344M(this, false);
        xdl0.m208344M(this.f45119c, false);
        this.f45123g.removeCallbacks(this.f45127k);
        this.f45118b.setOnTouchListener(null);
        this.f45118b.m4189i();
        m69317q(new e30() { // from class: l.qgu
            @Override // p149l.e30
            public final void call(Object obj) {
                ((LiveVChatCampaignItemView) obj).m69332i();
            }
        });
        xfu xfuVar = this.f45121e;
        if (xfuVar != null) {
            xfuVar.m208612r();
        }
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final void m69313l(View view) {
        ugu.m193585a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public void m69314m() {
        m69317q(new e30() { // from class: l.pgu
            @Override // p149l.e30
            public final void call(Object obj) {
                ((LiveVChatCampaignItemView) obj).m69331h();
            }
        });
        xfu xfuVar = this.f45121e;
        if (xfuVar != null) {
            xfuVar.m208611q();
        }
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(kgu kguVar) {
        this.f45120d = kguVar;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m69313l(this);
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final View m69316p(int i) {
        int childCount = this.f45118b.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f45118b.getChildAt(i2);
            Object tag = childAt.getTag(g5c0.f101076v3);
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == i) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final void m69317q(e30<LiveVChatCampaignItemView> e30Var) {
        VPager vPager = this.f45118b;
        if (vPager == null || vPager.getChildCount() <= 0) {
            return;
        }
        for (int i = 0; i < this.f45118b.getChildCount(); i++) {
            View childAt = this.f45118b.getChildAt(i);
            if (childAt instanceof LiveVChatCampaignItemView) {
                e30Var.call((LiveVChatCampaignItemView) childAt);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m69318s() {
        return !vwb.m200296J(this.f45122f);
    }

    public void setAutoplay(boolean z) {
        this.f45126j = z;
        if (z) {
            m69322y();
        } else {
            this.f45123g.removeCallbacks(this.f45127k);
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m69319v() {
        xdl0.m208344M(this.f45117a, m69318s());
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean m69320w(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                }
            }
            m69322y();
            return false;
        }
        this.f45123g.removeCallbacks(this.f45127k);
        return false;
    }

    /* JADX INFO: renamed from: x */
    public void m69321x(List<LongLinkGiftMessage.LiveCampaignInfo> list) {
        int childCount = this.f45118b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f45118b.getChildAt(i);
            if (childAt instanceof LiveVChatCampaignItemView) {
                ((LiveVChatCampaignItemView) childAt).m69341r(list);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m69322y() {
        if (this.f45126j && !vwb.m200296J(this.f45122f) && this.f45122f.size() > this.f45118b.getCurrentItem()) {
            int i = this.f45122f.get(this.f45118b.getCurrentItem()).getCom.immomo.momomediaext.sei.BaseSei.INFO java.lang.String().carouselSeconds * 1000;
            this.f45123g.removeCallbacks(this.f45127k);
            this.f45123g.postDelayed(this.f45127k, i);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m69323z(List<BLiveCampaign> list) {
        if (vwb.m200296J(list)) {
            xdl0.m208344M(this.f45117a, false);
            this.f45122f.clear();
            return;
        }
        if (this.f45121e == null) {
            xfu xfuVar = new xfu(this.f45120d);
            this.f45121e = xfuVar;
            this.f45118b.setAdapter(xfuVar);
        }
        m69309A(list);
        m69311C();
        this.f45118b.setOffscreenPageLimit(this.f45122f.size());
        this.f45121e.m208613s(this.f45122f);
        if (this.f45122f.size() > 1) {
            this.f45118b.setCurrentItem(1);
            this.f45125i[0].setSelected(true);
        }
        e51.m114742G(new Runnable() { // from class: l.rgu
            @Override // java.lang.Runnable
            public final void run() {
                this.f159290a.m69319v();
            }
        });
    }

    public LiveVChatCampaignView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45122f = new ArrayList();
        this.f45123g = new Handler();
        this.f45126j = true;
        this.f45127k = new Runnable() { // from class: l.ngu
            @Override // java.lang.Runnable
            public final void run() {
                this.f138906a.m69308u();
            }
        };
    }

    public LiveVChatCampaignView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45122f = new ArrayList();
        this.f45123g = new Handler();
        this.f45126j = true;
        this.f45127k = new Runnable() { // from class: l.ngu
            @Override // java.lang.Runnable
            public final void run() {
                this.f138906a.m69308u();
            }
        };
    }
}
