package com.p000p1.mobile.putong.live.livingroom.voice.intl.newoperation;

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
import com.p1.mobile.putong.live.base.data.BLiveVoiceCampaign;
import com.p1.mobile.putong.live.livingroom.view.LiveScrollView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.cit;
import l.i3c0;
import l.mep0;
import l.p4o0;
import l.s7m;
import l.t100;
import l.vwb;
import l.xdl0;
import p009l.d4o0;
import p009l.m4o0;
import v.VPager;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceNewOperationView extends ConstraintLayout implements s7m<m4o0> {

    /* JADX INFO: renamed from: d */
    public VPager f6898d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f6899e;

    /* JADX INFO: renamed from: f */
    public m4o0 f6900f;

    /* JADX INFO: renamed from: g */
    public final List<BLiveVoiceCampaign> f6901g;

    /* JADX INFO: renamed from: h */
    public d4o0 f6902h;

    /* JADX INFO: renamed from: i */
    public View[] f6903i;

    /* JADX INFO: renamed from: j */
    public int f6904j;

    /* JADX INFO: renamed from: k */
    public final Runnable f6905k;

    /* JADX INFO: renamed from: l */
    public final Handler f6906l;

    /* JADX INFO: renamed from: m */
    public float f6907m;

    /* JADX INFO: renamed from: n */
    public float f6908n;

    /* JADX INFO: renamed from: o */
    public boolean f6909o;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.newoperation.VoiceNewOperationView$a */
    public class C0432a implements ViewPager.j {
        public C0432a() {
        }

        public void onPageScrollStateChanged(int i) {
            if (i != 0) {
                return;
            }
            int i2 = VoiceNewOperationView.this.f6904j;
            VoiceNewOperationView voiceNewOperationView = VoiceNewOperationView.this;
            if (i2 == 0) {
                voiceNewOperationView.f6898d.T(voiceNewOperationView.f6901g.size() - 2, false);
            } else if (voiceNewOperationView.f6904j == VoiceNewOperationView.this.f6901g.size() - 1) {
                VoiceNewOperationView.this.f6898d.T(1, false);
            }
        }

        public void onPageScrolled(int i, float f, int i2) {
        }

        public void onPageSelected(int i) {
            if (VoiceNewOperationView.this.f6901g.size() <= 1) {
                return;
            }
            VoiceNewOperationView.this.f6904j = i;
            for (View view : VoiceNewOperationView.this.f6903i) {
                view.setSelected(false);
            }
            int length = VoiceNewOperationView.this.f6903i.length;
            if (VoiceNewOperationView.this.f6904j > length || VoiceNewOperationView.this.f6904j <= 0) {
                int i2 = VoiceNewOperationView.this.f6904j;
                VoiceNewOperationView voiceNewOperationView = VoiceNewOperationView.this;
                if (i2 == 0) {
                    voiceNewOperationView.f6903i[length - 1].setSelected(true);
                } else {
                    voiceNewOperationView.f6903i[0].setSelected(true);
                }
            } else {
                VoiceNewOperationView.this.f6903i[VoiceNewOperationView.this.f6904j - 1].setSelected(true);
            }
            VoiceNewOperationView.this.m8494t0();
        }
    }

    public VoiceNewOperationView(Context context) {
        super(context);
        this.f6901g = new ArrayList();
        this.f6905k = new Runnable() { // from class: l.n4o0
            @Override // java.lang.Runnable
            public final void run() {
                this.f17224a.m8493r0();
            }
        };
        this.f6906l = new Handler();
        this.f6909o = false;
    }

    private Pair<Integer, Integer> getValidMaxRatio() {
        Iterator<BLiveVoiceCampaign> it = this.f6901g.iterator();
        int iIntValue = 0;
        int iIntValue2 = 0;
        while (it.hasNext()) {
            List list = it.next().entranceSize;
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r0 */
    public /* synthetic */ void m8493r0() {
        VPager vPager = this.f6898d;
        vPager.setCurrentItem(vPager.getCurrentItem() + 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void setIndicator(int i) {
        if (this.f6903i != null) {
            this.f6899e.removeAllViews();
        }
        this.f6903i = new View[i];
        int i2 = 0;
        while (i2 < i) {
            View view = new View(getContext());
            ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(t100.d(4.0f), t100.d(4.0f));
            marginLayoutParams.setMargins(t100.d(3.0f), 0, t100.d(3.0f), 0);
            view.setLayoutParams(marginLayoutParams);
            view.setBackground(getResources().getDrawable(i3c0.W6));
            view.setSelected(i2 == 0);
            this.f6903i[i2] = view;
            this.f6899e.addView(view);
            i2++;
        }
    }

    private void setViewPager(List<BLiveVoiceCampaign> list) {
        if (this.f6902h == null) {
            d4o0 d4o0Var = new d4o0(this.f6900f);
            this.f6902h = d4o0Var;
            this.f6898d.setAdapter(d4o0Var);
        }
        if (list.size() > 1) {
            m8495v0();
            this.f6901g.clear();
            this.f6901g.add(list.get(list.size() - 1));
            this.f6901g.addAll(list);
            this.f6901g.add(list.get(0));
            setIndicator(list.size());
        } else {
            this.f6906l.removeCallbacks(this.f6905k);
            this.f6898d.i();
            this.f6898d.setOnTouchListener(null);
            this.f6901g.clear();
            this.f6901g.addAll(list);
        }
        this.f6898d.setOffscreenPageLimit(1);
        this.f6902h.m13008q(this.f6901g);
        xdl0.M(this.f6899e, this.f6901g.size() > 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t0 */
    public void m8494t0() {
        if (vwb.J(this.f6901g) || this.f6901g.size() <= this.f6898d.getCurrentItem()) {
            return;
        }
        int i = this.f6901g.get(this.f6898d.getCurrentItem()).carouselSeconds * 1000;
        this.f6906l.removeCallbacks(this.f6905k);
        this.f6906l.postDelayed(this.f6905k, i);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    /* JADX INFO: renamed from: v0 */
    private void m8495v0() {
        this.f6898d.d(new C0432a());
        this.f6898d.setOnTouchListener(new View.OnTouchListener() { // from class: l.o4o0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return this.f17831a.m8502s0(view, motionEvent);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: w0 */
    private void m8496w0() {
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
        layoutParams.width = t100.d(iIntValue);
        layoutParams.height = t100.d(iIntValue2);
        setLayoutParams(layoutParams);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m8497C0() {
        return getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void destroy() {
        xdl0.M(this, false);
        xdl0.M(this.f6899e, false);
        this.f6906l.removeCallbacks(this.f6905k);
        this.f6898d.setOnTouchListener(null);
        this.f6898d.i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        m4o0 m4o0Var = this.f6900f;
        if (m4o0Var == null || m4o0Var.L2()) {
            return super/*android.view.View*/.dispatchTouchEvent(motionEvent);
        }
        LiveScrollView liveScrollViewA = cit.a(this.f6900f);
        if (liveScrollViewA == null) {
            return super/*android.view.View*/.dispatchTouchEvent(motionEvent);
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            liveScrollViewA.requestDisallowInterceptTouchEvent(true);
            this.f6907m = motionEvent.getRawX();
            this.f6908n = motionEvent.getRawY();
        } else if (action == 1) {
            this.f6909o = false;
        } else {
            if (action == 2) {
                float fAbs = Math.abs(this.f6908n - motionEvent.getRawY()) / Math.abs(this.f6907m - motionEvent.getRawX());
                float fAbs2 = Math.abs(this.f6907m - motionEvent.getRawX()) / Math.abs(this.f6908n - motionEvent.getRawY());
                if (fAbs > 2.0f && !this.f6909o) {
                    liveScrollViewA.requestDisallowInterceptTouchEvent(false);
                } else if (fAbs2 > 2.0f) {
                    this.f6909o = true;
                    liveScrollViewA.requestDisallowInterceptTouchEvent(true);
                }
            } else if (action == 3) {
            }
            this.f6909o = false;
        }
        return super/*android.view.View*/.dispatchTouchEvent(motionEvent);
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    /* JADX INFO: renamed from: o0 */
    public final void m8499o0(View view) {
        p4o0.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m8499o0(this);
        mep0.c1(this, 0, 0, 0, 0, t100.d(12.0f));
    }

    /* JADX INFO: renamed from: p0, reason: merged with bridge method [inline-methods] */
    public void m8498i1(m4o0 m4o0Var) {
        this.f6900f = m4o0Var;
    }

    /* JADX INFO: renamed from: q0 */
    public boolean m8501q0() {
        return this.f6900f.m18236T3() && !vwb.J(this.f6901g);
    }

    /* JADX INFO: renamed from: s0 */
    public final /* synthetic */ boolean m8502s0(View view, MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1) {
                if (action != 2) {
                    if (action != 3) {
                        return false;
                    }
                }
            }
            m8494t0();
            return false;
        }
        this.f6906l.removeCallbacks(this.f6905k);
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u0 */
    public void m8503u0(List<BLiveVoiceCampaign> list) {
        if (vwb.J(list)) {
            xdl0.M(this, false);
            this.f6906l.removeCallbacks(this.f6905k);
            List<BLiveVoiceCampaign> list2 = this.f6901g;
            if (list2 != null) {
                list2.clear();
                return;
            }
            return;
        }
        setViewPager(list);
        m8496w0();
        xdl0.M(this, m8501q0());
        int size = this.f6901g.size();
        VPager vPager = this.f6898d;
        if (size <= 1) {
            vPager.setCurrentItem(0);
        } else {
            vPager.setCurrentItem(1);
            this.f6903i[0].setSelected(true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y0 */
    public void m8504y0() {
        xdl0.M(this, m8501q0());
    }

    public VoiceNewOperationView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f6901g = new ArrayList();
        this.f6905k = new Runnable() { // from class: l.n4o0
            @Override // java.lang.Runnable
            public final void run() {
                this.f17224a.m8493r0();
            }
        };
        this.f6906l = new Handler();
        this.f6909o = false;
    }

    public VoiceNewOperationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6901g = new ArrayList();
        this.f6905k = new Runnable() { // from class: l.n4o0
            @Override // java.lang.Runnable
            public final void run() {
                this.f17224a.m8493r0();
            }
        };
        this.f6906l = new Handler();
        this.f6909o = false;
    }
}
