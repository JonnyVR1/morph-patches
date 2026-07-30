package com.p046p1.mobile.putong.live.livingroom.voice.intl.newoperation;

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
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCampaign;
import com.p046p1.mobile.putong.live.livingroom.view.LiveScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p147v.VPager;
import p149l.cit;
import p149l.d4o0;
import p149l.i3c0;
import p149l.m4o0;
import p149l.mep0;
import p149l.p4o0;
import p149l.s7m;
import p149l.t100;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceNewOperationView extends ConstraintLayout implements s7m<m4o0> {

    /* JADX INFO: renamed from: d */
    public VPager f53292d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f53293e;

    /* JADX INFO: renamed from: f */
    public m4o0 f53294f;

    /* JADX INFO: renamed from: g */
    public final List<BLiveVoiceCampaign> f53295g;

    /* JADX INFO: renamed from: h */
    public d4o0 f53296h;

    /* JADX INFO: renamed from: i */
    public View[] f53297i;

    /* JADX INFO: renamed from: j */
    public int f53298j;

    /* JADX INFO: renamed from: k */
    public final Runnable f53299k;

    /* JADX INFO: renamed from: l */
    public final Handler f53300l;

    /* JADX INFO: renamed from: m */
    public float f53301m;

    /* JADX INFO: renamed from: n */
    public float f53302n;

    /* JADX INFO: renamed from: o */
    public boolean f53303o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.newoperation.VoiceNewOperationView$a */
    public class C13030a implements ViewPager.InterfaceC0716j {
        public C13030a() {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrollStateChanged(int i) {
            if (i != 0) {
                return;
            }
            int i2 = VoiceNewOperationView.this.f53298j;
            VoiceNewOperationView voiceNewOperationView = VoiceNewOperationView.this;
            if (i2 == 0) {
                voiceNewOperationView.f53292d.m4176T(voiceNewOperationView.f53295g.size() - 2, false);
            } else if (voiceNewOperationView.f53298j == VoiceNewOperationView.this.f53295g.size() - 1) {
                VoiceNewOperationView.this.f53292d.m4176T(1, false);
            }
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageScrolled(int i, float f, int i2) {
        }

        @Override // androidx.viewpager.widget.ViewPager.InterfaceC0716j
        public void onPageSelected(int i) {
            if (VoiceNewOperationView.this.f53295g.size() <= 1) {
                return;
            }
            VoiceNewOperationView.this.f53298j = i;
            for (View view : VoiceNewOperationView.this.f53297i) {
                view.setSelected(false);
            }
            int length = VoiceNewOperationView.this.f53297i.length;
            if (VoiceNewOperationView.this.f53298j > length || VoiceNewOperationView.this.f53298j <= 0) {
                int i2 = VoiceNewOperationView.this.f53298j;
                VoiceNewOperationView voiceNewOperationView = VoiceNewOperationView.this;
                if (i2 == 0) {
                    voiceNewOperationView.f53297i[length - 1].setSelected(true);
                } else {
                    voiceNewOperationView.f53297i[0].setSelected(true);
                }
            } else {
                VoiceNewOperationView.this.f53297i[VoiceNewOperationView.this.f53298j - 1].setSelected(true);
            }
            VoiceNewOperationView.this.m78303t0();
        }
    }

    public VoiceNewOperationView(Context context) {
        super(context);
        this.f53295g = new ArrayList();
        this.f53299k = new Runnable() { // from class: l.n4o0
            @Override // java.lang.Runnable
            public final void run() {
                this.f137117a.m78302r0();
            }
        };
        this.f53300l = new Handler();
        this.f53303o = false;
    }

    private Pair<Integer, Integer> getValidMaxRatio() {
        Iterator<BLiveVoiceCampaign> it = this.f53295g.iterator();
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
    public /* synthetic */ void m78302r0() {
        VPager vPager = this.f53292d;
        vPager.setCurrentItem(vPager.getCurrentItem() + 1);
    }

    private void setIndicator(int i) {
        if (this.f53297i != null) {
            this.f53293e.removeAllViews();
        }
        this.f53297i = new View[i];
        int i2 = 0;
        while (i2 < i) {
            View view = new View(getContext());
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(t100.m186890d(4.0f), t100.m186890d(4.0f));
            marginLayoutParams.setMargins(t100.m186890d(3.0f), 0, t100.m186890d(3.0f), 0);
            view.setLayoutParams(marginLayoutParams);
            view.setBackground(getResources().getDrawable(i3c0.f110900W6));
            view.setSelected(i2 == 0);
            this.f53297i[i2] = view;
            this.f53293e.addView(view);
            i2++;
        }
    }

    private void setViewPager(List<BLiveVoiceCampaign> list) {
        if (this.f53296h == null) {
            d4o0 d4o0Var = new d4o0(this.f53294f);
            this.f53296h = d4o0Var;
            this.f53292d.setAdapter(d4o0Var);
        }
        if (list.size() > 1) {
            m78304v0();
            this.f53295g.clear();
            this.f53295g.add(list.get(list.size() - 1));
            this.f53295g.addAll(list);
            this.f53295g.add(list.get(0));
            setIndicator(list.size());
        } else {
            this.f53300l.removeCallbacks(this.f53299k);
            this.f53292d.m4189i();
            this.f53292d.setOnTouchListener(null);
            this.f53295g.clear();
            this.f53295g.addAll(list);
        }
        this.f53292d.setOffscreenPageLimit(1);
        this.f53296h.m109995q(this.f53295g);
        xdl0.m208344M(this.f53293e, this.f53295g.size() > 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public void m78303t0() {
        if (vwb.m200296J(this.f53295g) || this.f53295g.size() <= this.f53292d.getCurrentItem()) {
            return;
        }
        int i = this.f53295g.get(this.f53292d.getCurrentItem()).carouselSeconds * 1000;
        this.f53300l.removeCallbacks(this.f53299k);
        this.f53300l.postDelayed(this.f53299k, i);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: v0 */
    private void m78304v0() {
        this.f53292d.m4185d(new C13030a());
        this.f53292d.setOnTouchListener(new View.OnTouchListener() { // from class: l.o4o0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f141805a.m78309s0(view, motionEvent);
            }
        });
    }

    /* JADX INFO: renamed from: w0 */
    private void m78305w0() {
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
        layoutParams.width = t100.m186890d(iIntValue);
        layoutParams.height = t100.m186890d(iIntValue2);
        setLayoutParams(layoutParams);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return getContext();
    }

    @Override // p149l.s7m
    public void destroy() {
        xdl0.m208344M(this, false);
        xdl0.m208344M(this.f53293e, false);
        this.f53300l.removeCallbacks(this.f53299k);
        this.f53292d.setOnTouchListener(null);
        this.f53292d.m4189i();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m4o0 m4o0Var = this.f53294f;
        if (m4o0Var == null || m4o0Var.m206032L2()) {
            return super.dispatchTouchEvent(motionEvent);
        }
        LiveScrollView liveScrollViewM107098a = cit.m107098a(this.f53294f);
        if (liveScrollViewM107098a == null) {
            return super.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            liveScrollViewM107098a.requestDisallowInterceptTouchEvent(true);
            this.f53301m = motionEvent.getRawX();
            this.f53302n = motionEvent.getRawY();
        } else if (action == 1) {
            this.f53303o = false;
        } else {
            if (action == 2) {
                float fAbs = Math.abs(this.f53302n - motionEvent.getRawY()) / Math.abs(this.f53301m - motionEvent.getRawX());
                float fAbs2 = Math.abs(this.f53301m - motionEvent.getRawX()) / Math.abs(this.f53302n - motionEvent.getRawY());
                if (fAbs > 2.0f && !this.f53303o) {
                    liveScrollViewM107098a.requestDisallowInterceptTouchEvent(false);
                } else if (fAbs2 > 2.0f) {
                    this.f53303o = true;
                    liveScrollViewM107098a.requestDisallowInterceptTouchEvent(true);
                }
            } else if (action == 3) {
            }
            this.f53303o = false;
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m78306o0(View view) {
        p4o0.m167398a(this, view);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78306o0(this);
        mep0.m154301c1(this, 0, 0, 0, 0, t100.m186890d(12.0f));
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(m4o0 m4o0Var) {
        this.f53294f = m4o0Var;
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m78308q0() {
        return this.f53294f.m153069T3() && !vwb.m200296J(this.f53295g);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ boolean m78309s0(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                }
            }
            m78303t0();
            return false;
        }
        this.f53300l.removeCallbacks(this.f53299k);
        return false;
    }

    /* JADX INFO: renamed from: u0 */
    public void m78310u0(List<BLiveVoiceCampaign> list) {
        if (vwb.m200296J(list)) {
            xdl0.m208344M(this, false);
            this.f53300l.removeCallbacks(this.f53299k);
            List<BLiveVoiceCampaign> list2 = this.f53295g;
            if (list2 != null) {
                list2.clear();
                return;
            }
            return;
        }
        setViewPager(list);
        m78305w0();
        xdl0.m208344M(this, m78308q0());
        int size = this.f53295g.size();
        VPager vPager = this.f53292d;
        if (size <= 1) {
            vPager.setCurrentItem(0);
        } else {
            vPager.setCurrentItem(1);
            this.f53297i[0].setSelected(true);
        }
    }

    /* JADX INFO: renamed from: y0 */
    public void m78311y0() {
        xdl0.m208344M(this, m78308q0());
    }

    public VoiceNewOperationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53295g = new ArrayList();
        this.f53299k = new Runnable() { // from class: l.n4o0
            @Override // java.lang.Runnable
            public final void run() {
                this.f137117a.m78302r0();
            }
        };
        this.f53300l = new Handler();
        this.f53303o = false;
    }

    public VoiceNewOperationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53295g = new ArrayList();
        this.f53299k = new Runnable() { // from class: l.n4o0
            @Override // java.lang.Runnable
            public final void run() {
                this.f137117a.m78302r0();
            }
        };
        this.f53300l = new Handler();
        this.f53303o = false;
    }
}
