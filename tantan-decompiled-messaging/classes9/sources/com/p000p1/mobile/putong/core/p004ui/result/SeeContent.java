package com.p000p1.mobile.putong.core.p004ui.result;

import android.animation.Animator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.animation.Interpolator;
import android.widget.ScrollView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.pay.R;
import l.bt0;
import l.d3c0;
import l.g8e0;
import l.hmb;
import l.t100;
import l.xdl0;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class SeeContent extends ScrollView {

    /* JADX INFO: renamed from: a */
    public VFrame f5405a;

    /* JADX INFO: renamed from: b */
    public VLinear f5406b;

    /* JADX INFO: renamed from: c */
    public VLinear f5407c;

    /* JADX INFO: renamed from: d */
    public VImage f5408d;

    /* JADX INFO: renamed from: e */
    public VText f5409e;

    /* JADX INFO: renamed from: f */
    public boolean f5410f;

    /* JADX INFO: renamed from: g */
    public Animator f5411g;

    /* JADX INFO: renamed from: h */
    public Animator f5412h;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.SeeContent$a */
    public class ViewTreeObserverOnGlobalLayoutListenerC0269a implements ViewTreeObserver.OnGlobalLayoutListener {

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.result.SeeContent$a$a */
        public class a extends bt0.j {
            public a() {
            }

            /* JADX INFO: renamed from: b */
            public final /* synthetic */ void m8125b() {
                xdl0.M0(SeeContent.this.f5407c, true);
                SeeContent.this.f5412h.start();
            }

            public void onAnimationEnd(Animator animator) {
            }

            public void onAnimationStart(Animator animator) {
                if (SeeContent.this.f5410f) {
                    SeeContent.this.f5407c.postDelayed(new Runnable() { // from class: l.f8e0
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f12554a.m8125b();
                        }
                    }, 100L);
                }
            }
        }

        public ViewTreeObserverOnGlobalLayoutListenerC0269a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            SeeContent seeContent = SeeContent.this;
            VLinear vLinear = seeContent.f5406b;
            Interpolator interpolator = bt0.c;
            seeContent.f5411g = bt0.p(vLinear, "translationY", 0L, 200L, interpolator, new float[]{vLinear.getHeight(), 0.0f});
            SeeContent seeContent2 = SeeContent.this;
            VLinear vLinear2 = seeContent2.f5407c;
            seeContent2.f5412h = bt0.p(vLinear2, "translationY", 0L, 200L, interpolator, new float[]{vLinear2.getHeight(), 0.0f});
            SeeContent.this.f5411g.addListener(new a());
            SeeContent.this.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }
    }

    public SeeContent(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: f */
    public final void m8121f(View view) {
        g8e0.a(this, view);
    }

    /* JADX INFO: renamed from: g */
    public final void m8122g() {
        if (xdl0.w0() <= 1280) {
            this.f5405a.getLayoutParams().height = t100.d(hmb.m1() * 260.0f);
            this.f5406b.getLayoutParams().width = t100.d(hmb.m1() * 199.0f);
            this.f5406b.getLayoutParams().height = t100.d(hmb.m1() * 246.0f);
            this.f5407c.getLayoutParams().width = t100.d(hmb.m1() * 238.0f);
            this.f5407c.getLayoutParams().height = t100.d(hmb.m1() * 182.0f);
        }
    }

    /* JADX INFO: renamed from: h */
    public final void m8123h() {
        this.f5409e.setText(String.format("%s\n%s", getContext().getString(R.string.R1), getContext().getString(R.string.R6)));
        m8122g();
        this.f5408d.setImageResource(CoreModule.f1534c.f3628e0.m21490p9().isFemale() ? d3c0.Mb : d3c0.Lb);
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserverOnGlobalLayoutListenerC0269a());
    }

    @Override // android.view.View
    public void onFinishInflate() {
        m8121f(this);
        super.onFinishInflate();
        m8123h();
        if (xdl0.w0() / getResources().getDisplayMetrics().density <= 700.0f) {
            this.f5405a.getLayoutParams().height = t100.d(245.0f);
            this.f5409e.setPadding(0, 0, 0, 0);
        }
    }

    public SeeContent(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public SeeContent(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
