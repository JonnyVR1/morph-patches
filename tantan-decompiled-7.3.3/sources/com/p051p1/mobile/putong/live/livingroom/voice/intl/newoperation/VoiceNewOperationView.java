package com.p051p1.mobile.putong.live.livingroom.voice.intl.newoperation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.ViewPager;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCampaign;
import com.p051p1.mobile.putong.live.livingroom.view.LiveScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p151v.VPager;
import p153l.bnl0;
import p153l.dkt;
import p153l.hdo0;
import p153l.iam;
import p153l.jyb;
import p153l.obc0;
import p153l.qa00;
import p153l.qdo0;
import p153l.qnp0;
import p153l.tdo0;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceNewOperationView extends ConstraintLayout implements iam<qdo0> {

    /* JADX INFO: renamed from: d */
    public VPager f54140d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f54141e;

    /* JADX INFO: renamed from: f */
    public qdo0 f54142f;

    /* JADX INFO: renamed from: g */
    public final List<BLiveVoiceCampaign> f54143g;

    /* JADX INFO: renamed from: h */
    public hdo0 f54144h;

    /* JADX INFO: renamed from: i */
    public View[] f54145i;

    /* JADX INFO: renamed from: j */
    public int f54146j;

    /* JADX INFO: renamed from: k */
    public final Runnable f54147k;

    /* JADX INFO: renamed from: l */
    public final Handler f54148l;

    /* JADX INFO: renamed from: m */
    public float f54149m;

    /* JADX INFO: renamed from: n */
    public float f54150n;

    /* JADX INFO: renamed from: o */
    public boolean f54151o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.newoperation.VoiceNewOperationView$a */
    public class C13193a implements ViewPager.InterfaceC0718j {
        public C13193a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrollStateChanged(int i) {
            if (i != 0) {
                return;
            }
            int i2 = VoiceNewOperationView.this.f54146j;
            VoiceNewOperationView voiceNewOperationView = VoiceNewOperationView.this;
            if (i2 == 0) {
                voiceNewOperationView.f54140d.m4178T(voiceNewOperationView.f54143g.size() - 2, false);
            } else if (voiceNewOperationView.f54146j == VoiceNewOperationView.this.f54143g.size() - 1) {
                VoiceNewOperationView.this.f54140d.m4178T(1, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0718j
        public void onPageSelected(int i) {
            if (VoiceNewOperationView.this.f54143g.size() <= 1) {
                return;
            }
            VoiceNewOperationView.this.f54146j = i;
            for (View view : VoiceNewOperationView.this.f54145i) {
                view.setSelected(false);
            }
            int length = VoiceNewOperationView.this.f54145i.length;
            if (VoiceNewOperationView.this.f54146j > length || VoiceNewOperationView.this.f54146j <= 0) {
                int i2 = VoiceNewOperationView.this.f54146j;
                VoiceNewOperationView voiceNewOperationView = VoiceNewOperationView.this;
                if (i2 == 0) {
                    voiceNewOperationView.f54145i[length - 1].setSelected(true);
                } else {
                    voiceNewOperationView.f54145i[0].setSelected(true);
                }
            } else {
                VoiceNewOperationView.this.f54145i[VoiceNewOperationView.this.f54146j - 1].setSelected(true);
            }
            VoiceNewOperationView.this.m79486t0();
        }
    }

    public VoiceNewOperationView(Context context) {
        super(context);
        this.f54143g = new ArrayList();
        this.f54147k = new Runnable() { // from class: l.rdo0
            @Override // java.lang.Runnable
            public final void run() {
                this.f162348a.m79485r0();
            }
        };
        this.f54148l = new Handler();
        this.f54151o = false;
    }

    private Pair<Integer, Integer> getValidMaxRatio() {
        Iterator<BLiveVoiceCampaign> it = this.f54143g.iterator();
        int iIntValue = 0;
        int iIntValue2 = 0;
        while (it.hasNext()) {
            List<Integer> list = it.next().entranceSize;
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m79485r0() {
        VPager vPager = this.f54140d;
        vPager.setCurrentItem(vPager.getCurrentItem() + 1);
    }

    private void setIndicator(int i) {
        if (this.f54145i != null) {
            this.f54141e.removeAllViews();
        }
        this.f54145i = new View[i];
        int i2 = 0;
        while (i2 < i) {
            View view = new View(getContext());
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(qa00.m175859d(4.0f), qa00.m175859d(4.0f));
            marginLayoutParams.setMargins(qa00.m175859d(3.0f), 0, qa00.m175859d(3.0f), 0);
            view.setLayoutParams(marginLayoutParams);
            view.setBackground(getResources().getDrawable(obc0.f146228W6));
            view.setSelected(i2 == 0);
            this.f54145i[i2] = view;
            this.f54141e.addView(view);
            i2++;
        }
    }

    private void setViewPager(List<BLiveVoiceCampaign> list) {
        if (this.f54144h == null) {
            hdo0 hdo0Var = new hdo0(this.f54142f);
            this.f54144h = hdo0Var;
            this.f54140d.setAdapter(hdo0Var);
        }
        if (list.size() > 1) {
            m79487v0();
            this.f54143g.clear();
            this.f54143g.add(list.get(list.size() - 1));
            this.f54143g.addAll(list);
            this.f54143g.add(list.get(0));
            setIndicator(list.size());
        } else {
            this.f54148l.removeCallbacks(this.f54147k);
            this.f54140d.m4191i();
            this.f54140d.setOnTouchListener(null);
            this.f54143g.clear();
            this.f54143g.addAll(list);
        }
        this.f54140d.setOffscreenPageLimit(1);
        this.f54144h.m134612q(this.f54143g);
        bnl0.m105524M(this.f54141e, this.f54143g.size() > 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public void m79486t0() {
        if (jyb.m147479J(this.f54143g) || this.f54143g.size() <= this.f54140d.getCurrentItem()) {
            return;
        }
        int i = this.f54143g.get(this.f54140d.getCurrentItem()).carouselSeconds * 1000;
        this.f54148l.removeCallbacks(this.f54147k);
        this.f54148l.postDelayed(this.f54147k, i);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: v0 */
    private void m79487v0() {
        this.f54140d.m4187d(new C13193a());
        this.f54140d.setOnTouchListener(new View.OnTouchListener() { // from class: l.sdo0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f167450a.m79492s0(view, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    private void m79488w0() {
        Pair<Integer, Integer> validMaxRatio = getValidMaxRatio();
        int iIntValue = ((Integer) validMaxRatio.first).intValue();
        int iIntValue2 = ((Integer) validMaxRatio.second).intValue();
        if (iIntValue == 0 || iIntValue > 73) {
            iIntValue = 73;
        }
        if (iIntValue2 == 0 || iIntValue2 > 73) {
            iIntValue2 = 73;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = qa00.m175859d(iIntValue);
        layoutParams.height = qa00.m175859d(iIntValue2);
        setLayoutParams(layoutParams);
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p153l.iam
    public void destroy() {
        bnl0.m105524M(this, false);
        bnl0.m105524M(this.f54141e, false);
        this.f54148l.removeCallbacks(this.f54147k);
        this.f54140d.setOnTouchListener(null);
        this.f54140d.m4191i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        qdo0 qdo0Var = this.f54142f;
        if (qdo0Var == null || qdo0Var.m213815L2()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        LiveScrollView liveScrollViewM116675a = dkt.m116675a(this.f54142f);
        if (liveScrollViewM116675a == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            liveScrollViewM116675a.requestDisallowInterceptTouchEvent(true);
            this.f54149m = motionEvent.getRawX();
            this.f54150n = motionEvent.getRawY();
        } else if (action == 1) {
            this.f54151o = false;
        } else {
            if (action == 2) {
                float fAbs = Math.abs(this.f54150n - motionEvent.getRawY()) / Math.abs(this.f54149m - motionEvent.getRawX());
                float fAbs2 = Math.abs(this.f54149m - motionEvent.getRawX()) / Math.abs(this.f54150n - motionEvent.getRawY());
                if (fAbs > 2.0f && !this.f54151o) {
                    liveScrollViewM116675a.requestDisallowInterceptTouchEvent(false);
                } else if (fAbs2 > 2.0f) {
                    this.f54151o = true;
                    liveScrollViewM116675a.requestDisallowInterceptTouchEvent(true);
                }
            } else if (action == 3) {
            }
            this.f54151o = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m79489o0(View view) {
        tdo0.m190634a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79489o0(this);
        qnp0.m177260c1(this, 0, 0, 0, 0, qa00.m175859d(12.0f));
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(qdo0 qdo0Var) {
        this.f54142f = qdo0Var;
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m79491q0() {
        return this.f54142f.m176196T3() && !jyb.m147479J(this.f54143g);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ boolean m79492s0(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                }
            }
            m79486t0();
            return false;
        }
        this.f54148l.removeCallbacks(this.f54147k);
        return false;
    }

    /* JADX INFO: renamed from: u0 */
    public void m79493u0(List<BLiveVoiceCampaign> list) {
        if (jyb.m147479J(list)) {
            bnl0.m105524M(this, false);
            this.f54148l.removeCallbacks(this.f54147k);
            List<BLiveVoiceCampaign> list2 = this.f54143g;
            if (list2 != null) {
                list2.clear();
                return;
            }
            return;
        }
        setViewPager(list);
        m79488w0();
        bnl0.m105524M(this, m79491q0());
        int size = this.f54143g.size();
        VPager vPager = this.f54140d;
        if (size <= 1) {
            vPager.setCurrentItem(0);
        } else {
            vPager.setCurrentItem(1);
            this.f54145i[0].setSelected(true);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m79494y0() {
        bnl0.m105524M(this, m79491q0());
    }

    public VoiceNewOperationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54143g = new ArrayList();
        this.f54147k = new Runnable() { // from class: l.rdo0
            @Override // java.lang.Runnable
            public final void run() {
                this.f162348a.m79485r0();
            }
        };
        this.f54148l = new Handler();
        this.f54151o = false;
    }

    public VoiceNewOperationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54143g = new ArrayList();
        this.f54147k = new Runnable() { // from class: l.rdo0
            @Override // java.lang.Runnable
            public final void run() {
                this.f162348a.m79485r0();
            }
        };
        this.f54148l = new Handler();
        this.f54151o = false;
    }
}
