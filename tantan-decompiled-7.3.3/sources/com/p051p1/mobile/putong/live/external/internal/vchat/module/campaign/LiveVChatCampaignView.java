package com.p051p1.mobile.putong.live.external.internal.vchat.module.campaign;

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
import com.p051p1.mobile.longlink.msg.gift.LongLinkGiftMessage;
import com.p051p1.mobile.putong.live.base.data.BLiveCampaign;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.campaign.view.LiveVChatCampaignItemView;
import com.p051p1.mobile.putong.live.external.internal.vchat.module.campaign.view.LiveVChatCampaignSnapShotItemView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VPager;
import p153l.bnl0;
import p153l.ef60;
import p153l.iam;
import p153l.jyb;
import p153l.l51;
import p153l.liu;
import p153l.mdc0;
import p153l.obc0;
import p153l.pd4;
import p153l.qa00;
import p153l.qcj;
import p153l.viu;
import p153l.y20;
import p153l.yhu;
import p153l.ze4;

/* JADX INFO: loaded from: classes9.dex */
public class LiveVChatCampaignView extends FrameLayout implements iam<liu> {

    /* JADX INFO: renamed from: a */
    public LiveVChatCampaignView f45965a;

    /* JADX INFO: renamed from: b */
    public VPager f45966b;

    /* JADX INFO: renamed from: c */
    public VLinear f45967c;

    /* JADX INFO: renamed from: d */
    public liu f45968d;

    /* JADX INFO: renamed from: e */
    public yhu f45969e;

    /* JADX INFO: renamed from: f */
    public final List<pd4> f45970f;

    /* JADX INFO: renamed from: g */
    public final Handler f45971g;

    /* JADX INFO: renamed from: h */
    public int f45972h;

    /* JADX INFO: renamed from: i */
    public View[] f45973i;

    /* JADX INFO: renamed from: j */
    public boolean f45974j;

    /* JADX INFO: renamed from: k */
    public final Runnable f45975k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.external.internal.vchat.module.campaign.LiveVChatCampaignView$a */
    public class C12676a extends ef60 {
        public C12676a() {
        }

        @Override // p153l.ef60, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
            LiveVChatCampaignView.this.m70495E();
            if (i != 0) {
                return;
            }
            int i2 = LiveVChatCampaignView.this.f45972h;
            LiveVChatCampaignView liveVChatCampaignView = LiveVChatCampaignView.this;
            if (i2 == 0) {
                liveVChatCampaignView.f45966b.m4178T(liveVChatCampaignView.f45970f.size() - 2, false);
            } else if (liveVChatCampaignView.f45972h == LiveVChatCampaignView.this.f45970f.size() - 1) {
                LiveVChatCampaignView.this.f45966b.m4178T(1, false);
            }
        }

        @Override // p153l.ef60, androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            if (LiveVChatCampaignView.this.f45970f.size() <= 1) {
                return;
            }
            LiveVChatCampaignView.this.f45972h = i;
            for (View view : LiveVChatCampaignView.this.f45973i) {
                view.setSelected(false);
            }
            int length = LiveVChatCampaignView.this.f45973i.length;
            if (LiveVChatCampaignView.this.f45972h > length || LiveVChatCampaignView.this.f45972h <= 0) {
                int i2 = LiveVChatCampaignView.this.f45972h;
                LiveVChatCampaignView liveVChatCampaignView = LiveVChatCampaignView.this;
                if (i2 == 0) {
                    liveVChatCampaignView.f45973i[length - 1].setSelected(true);
                } else {
                    liveVChatCampaignView.f45973i[0].setSelected(true);
                }
            } else {
                LiveVChatCampaignView.this.f45973i[LiveVChatCampaignView.this.f45972h - 1].setSelected(true);
            }
            LiveVChatCampaignView.this.m70505y();
        }
    }

    public LiveVChatCampaignView(Context context) {
        super(context);
        this.f45970f = new ArrayList();
        this.f45971g = new Handler();
        this.f45974j = true;
        this.f45975k = new Runnable() { // from class: l.oiu
            @Override // java.lang.Runnable
            public final void run() {
                this.f147582a.m70491u();
            }
        };
    }

    private Pair<Integer, Integer> getValidMaxRatio() {
        Iterator it = jyb.m147486Q(this.f45970f, new qcj() { // from class: l.piu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((pd4) obj).getCom.immomo.momomediaext.sei.BaseSei.INFO java.lang.String();
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
        if (this.f45973i != null) {
            this.f45967c.removeAllViews();
        }
        this.f45973i = new View[i];
        int i2 = 0;
        while (i2 < i) {
            View view = new View(getContext());
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(qa00.m175859d(6.0f), qa00.m175859d(6.0f));
            marginLayoutParams.setMargins(qa00.m175859d(5.0f), 0, qa00.m175859d(5.0f), 0);
            view.setLayoutParams(marginLayoutParams);
            view.setBackground(getResources().getDrawable(obc0.f146228W6));
            view.setSelected(i2 == 0);
            this.f45973i[i2] = view;
            this.f45967c.addView(view);
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public /* synthetic */ void m70491u() {
        VPager vPager = this.f45966b;
        vPager.setCurrentItem(vPager.getCurrentItem() + 1);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: A */
    public final void m70492A(List<BLiveCampaign> list) {
        ArrayList arrayListM147486Q = jyb.m147486Q(list, new qcj() { // from class: l.tiu
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return new ff4((BLiveCampaign) obj);
            }
        });
        if (list.size() > 1) {
            m70493B();
            this.f45970f.clear();
            this.f45970f.add(new ze4(list.get(list.size() - 1)));
            this.f45970f.addAll(arrayListM147486Q);
            this.f45970f.add(new ze4(list.get(0)));
            setIndicator(list.size());
            return;
        }
        this.f45971g.removeCallbacks(this.f45975k);
        this.f45966b.m4191i();
        this.f45966b.setOnTouchListener(null);
        this.f45970f.clear();
        this.f45970f.addAll(arrayListM147486Q);
        this.f45966b.setCurrentItem(0);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: B */
    public final void m70493B() {
        this.f45966b.m4187d(new C12676a());
        this.f45966b.setOnTouchListener(new View.OnTouchListener() { // from class: l.uiu
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f179148a.m70503w(view, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: C */
    public final void m70494C() {
        Pair<Integer, Integer> validMaxRatio = getValidMaxRatio();
        int iIntValue = ((Integer) validMaxRatio.first).intValue();
        int iIntValue2 = ((Integer) validMaxRatio.second).intValue();
        if (iIntValue == 0 || iIntValue > 110) {
            iIntValue = 110;
        }
        if (iIntValue2 == 0 || iIntValue2 > 34) {
            iIntValue2 = 34;
        }
        ViewGroup.LayoutParams layoutParams = this.f45966b.getLayoutParams();
        layoutParams.width = qa00.m175859d(iIntValue);
        layoutParams.height = qa00.m175859d(iIntValue2);
        this.f45966b.setLayoutParams(layoutParams);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    /* JADX INFO: renamed from: E */
    public final void m70495E() {
        Bitmap drawingCache;
        View viewM70499p = m70499p(0);
        View viewM70499p2 = m70499p(this.f45970f.size() - 2);
        Bitmap drawingCache2 = null;
        if (viewM70499p != null && viewM70499p2 != null) {
            if (viewM70499p2 instanceof LiveVChatCampaignItemView) {
                drawingCache = ((LiveVChatCampaignItemView) viewM70499p2).getViewBitmap();
            } else {
                drawingCache = viewM70499p2 instanceof VDraweeView ? viewM70499p2.getDrawingCache() : null;
            }
            if (drawingCache != null) {
                ((LiveVChatCampaignSnapShotItemView) viewM70499p).setBg(drawingCache);
            }
        }
        View viewM70499p3 = m70499p(this.f45970f.size() - 1);
        View viewM70499p4 = m70499p(1);
        if (viewM70499p3 == null || viewM70499p4 == null) {
            return;
        }
        if (viewM70499p2 instanceof LiveVChatCampaignItemView) {
            drawingCache2 = ((LiveVChatCampaignItemView) viewM70499p2).getViewBitmap();
        } else if (viewM70499p2 instanceof VDraweeView) {
            drawingCache2 = viewM70499p2.getDrawingCache();
        }
        if (drawingCache2 != null) {
            ((LiveVChatCampaignSnapShotItemView) viewM70499p3).setBg(drawingCache2);
        }
    }

    @Override // p153l.iam
    @SuppressLint({"ClickableViewAccessibility"})
    public void destroy() {
        bnl0.m105524M(this, false);
        bnl0.m105524M(this.f45967c, false);
        this.f45971g.removeCallbacks(this.f45975k);
        this.f45966b.setOnTouchListener(null);
        this.f45966b.m4191i();
        m70500q(new y20() { // from class: l.riu
            @Override // p153l.y20
            public final void call(Object obj) {
                ((LiveVChatCampaignItemView) obj).m70515i();
            }
        });
        yhu yhuVar = this.f45969e;
        if (yhuVar != null) {
            yhuVar.m215995r();
        }
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: l */
    public final void m70496l(View view) {
        viu.m201425a(this, view);
    }

    /* JADX INFO: renamed from: m */
    public void m70497m() {
        m70500q(new y20() { // from class: l.qiu
            @Override // p153l.y20
            public final void call(Object obj) {
                ((LiveVChatCampaignItemView) obj).m70514h();
            }
        });
        yhu yhuVar = this.f45969e;
        if (yhuVar != null) {
            yhuVar.m215994q();
        }
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(liu liuVar) {
        this.f45968d = liuVar;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m70496l(this);
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public final View m70499p(int i) {
        int childCount = this.f45966b.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = this.f45966b.getChildAt(i2);
            Object tag = childAt.getTag(mdc0.f136321v3);
            if ((tag instanceof Integer) && ((Integer) tag).intValue() == i) {
                return childAt;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: q */
    public final void m70500q(y20<LiveVChatCampaignItemView> y20Var) {
        VPager vPager = this.f45966b;
        if (vPager == null || vPager.getChildCount() <= 0) {
            return;
        }
        for (int i = 0; i < this.f45966b.getChildCount(); i++) {
            View childAt = this.f45966b.getChildAt(i);
            if (childAt instanceof LiveVChatCampaignItemView) {
                y20Var.call((LiveVChatCampaignItemView) childAt);
            }
        }
    }

    /* JADX INFO: renamed from: s */
    public boolean m70501s() {
        return !jyb.m147479J(this.f45970f);
    }

    public void setAutoplay(boolean z) {
        this.f45974j = z;
        if (z) {
            m70505y();
        } else {
            this.f45971g.removeCallbacks(this.f45975k);
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m70502v() {
        bnl0.m105524M(this.f45965a, m70501s());
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ boolean m70503w(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                }
            }
            m70505y();
            return false;
        }
        this.f45971g.removeCallbacks(this.f45975k);
        return false;
    }

    /* JADX INFO: renamed from: x */
    public void m70504x(List<LongLinkGiftMessage.LiveCampaignInfo> list) {
        int childCount = this.f45966b.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = this.f45966b.getChildAt(i);
            if (childAt instanceof LiveVChatCampaignItemView) {
                ((LiveVChatCampaignItemView) childAt).m70524r(list);
            }
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m70505y() {
        if (this.f45974j && !jyb.m147479J(this.f45970f) && this.f45970f.size() > this.f45966b.getCurrentItem()) {
            int i = this.f45970f.get(this.f45966b.getCurrentItem()).getCom.immomo.momomediaext.sei.BaseSei.INFO java.lang.String().carouselSeconds * 1000;
            this.f45971g.removeCallbacks(this.f45975k);
            this.f45971g.postDelayed(this.f45975k, i);
        }
    }

    /* JADX INFO: renamed from: z */
    public void m70506z(List<BLiveCampaign> list) {
        if (jyb.m147479J(list)) {
            bnl0.m105524M(this.f45965a, false);
            this.f45970f.clear();
            return;
        }
        if (this.f45969e == null) {
            yhu yhuVar = new yhu(this.f45968d);
            this.f45969e = yhuVar;
            this.f45966b.setAdapter(yhuVar);
        }
        m70492A(list);
        m70494C();
        this.f45966b.setOffscreenPageLimit(this.f45970f.size());
        this.f45969e.m215996s(this.f45970f);
        if (this.f45970f.size() > 1) {
            this.f45966b.setCurrentItem(1);
            this.f45973i[0].setSelected(true);
        }
        l51.m152887G(new Runnable() { // from class: l.siu
            @Override // java.lang.Runnable
            public final void run() {
                this.f168870a.m70502v();
            }
        });
    }

    public LiveVChatCampaignView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45970f = new ArrayList();
        this.f45971g = new Handler();
        this.f45974j = true;
        this.f45975k = new Runnable() { // from class: l.oiu
            @Override // java.lang.Runnable
            public final void run() {
                this.f147582a.m70491u();
            }
        };
    }

    public LiveVChatCampaignView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45970f = new ArrayList();
        this.f45971g = new Handler();
        this.f45974j = true;
        this.f45975k = new Runnable() { // from class: l.oiu
            @Override // java.lang.Runnable
            public final void run() {
                this.f147582a.m70491u();
            }
        };
    }
}
