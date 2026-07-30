package com.p051p1.mobile.putong.core.newui.voicecall;

import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.message.R$string;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p153l.bnl0;
import p153l.edc0;
import p153l.fo0;
import p153l.ibc0;
import p153l.kcg0;
import p153l.psd0;
import p153l.qcj;
import p153l.qec0;
import p153l.uqx;
import p153l.w1n0;
import p153l.x20;
import p153l.xzm0;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceCallView extends FrameLayout {

    /* JADX INFO: renamed from: m */
    public static int f27895m = 300;

    /* JADX INFO: renamed from: n */
    public static int f27896n;

    /* JADX INFO: renamed from: o */
    public static int f27897o;

    /* JADX INFO: renamed from: p */
    public static int f27898p;

    /* JADX INFO: renamed from: q */
    public static int f27899q;

    /* JADX INFO: renamed from: r */
    public static List<x20> f27900r = new ArrayList();

    /* JADX INFO: renamed from: a */
    public boolean f27901a;

    /* JADX INFO: renamed from: b */
    public int f27902b;

    /* JADX INFO: renamed from: c */
    public int f27903c;

    /* JADX INFO: renamed from: d */
    public int f27904d;

    /* JADX INFO: renamed from: e */
    public int f27905e;

    /* JADX INFO: renamed from: f */
    public ValueAnimator f27906f;

    /* JADX INFO: renamed from: g */
    public kcg0 f27907g;

    /* JADX INFO: renamed from: h */
    public TextView f27908h;

    /* JADX INFO: renamed from: i */
    public ImageView f27909i;

    /* JADX INFO: renamed from: j */
    public kcg0 f27910j;

    /* JADX INFO: renamed from: k */
    public x20 f27911k;

    /* JADX INFO: renamed from: l */
    public GestureDetector f27912l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.voicecall.VoiceCallView$a */
    public class C8420a extends GestureDetector.SimpleOnGestureListener {
        public C8420a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (VoiceCallView.this.f27901a) {
                return true;
            }
            VoiceCallView.this.performClick();
            return true;
        }
    }

    public VoiceCallView(Context context) {
        super(context);
        this.f27911k = new x20() { // from class: l.x1n0
            @Override // p153l.x20
            public final void call() {
                this.f192085a.m45026n();
            }
        };
        this.f27912l = new GestureDetector(getContext(), new C8420a());
        m45022j();
    }

    /* JADX INFO: renamed from: h */
    public final void m45020h() {
        this.f27907g = xzm0.m213760p().m213766i().observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.y1n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197117a.m45024l((Integer) obj);
            }
        }));
        this.f27910j = uqx.m197379C().f180530l.filter(new qcj() { // from class: l.z1n0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() > 0);
            }
        }).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.a2n0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f68013a.m45025m((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m45026n() {
        if (f27898p == 0 && f27899q == 0) {
            return;
        }
        if (getLeft() == f27898p && getTop() == f27899q) {
            return;
        }
        if (NullChecker.m82486a(getLayoutParams()) && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = f27898p;
            marginLayoutParams.topMargin = f27899q;
        }
        int i = f27898p;
        layout(i, f27899q, getWidth() + i, f27899q + getHeight());
        m45028p();
    }

    /* JADX INFO: renamed from: j */
    public final void m45022j() {
        View.inflate(getContext(), qec0.f156823B4, this);
        this.f27908h = (TextView) findViewById(edc0.f93255O4);
        this.f27909i = (ImageView) findViewById(edc0.f93394k1);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m45023k() {
        if (NullChecker.m82486a(getParent())) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m45024l(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            this.f27908h.setText(R$string.f21537K6);
            this.f27908h.setEnabled(false);
            this.f27909i.setImageResource(ibc0.f113833K0);
            postDelayed(new Runnable() { // from class: l.c2n0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f79505a.m45023k();
                }
            }, 1000L);
            return;
        }
        if (iIntValue == 1 || iIntValue == 2) {
            this.f27908h.setText(R$string.f21545L6);
            this.f27909i.setImageResource(ibc0.f113824J0);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m45025m(Long l2) {
        if (xzm0.m213760p().m213769l() == 3) {
            this.f27908h.setText(w1n0.m204455b(l2.longValue()));
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m45027o(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        f27898p = iIntValue;
        layout(iIntValue, getTop(), this.f27902b + iIntValue, getBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        f27900r.add(this.f27911k);
        m45020h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f27900r.remove(this.f27911k);
        psd0.m173633z(this.f27907g);
        psd0.m173633z(this.f27910j);
        if (NullChecker.m82486a(this.f27906f)) {
            this.f27906f.cancel();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m45026n();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f27902b = i;
        this.f27903c = i2;
        this.f27904d = bnl0.m105592y0();
        this.f27905e = bnl0.m105588w0();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f27912l.onTouchEvent(motionEvent);
        int i = 0;
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f27901a = false;
            f27896n = (int) motionEvent.getX();
            f27897o = (int) motionEvent.getY();
        } else if (action == 1) {
            setPressed(false);
            m45029q();
            this.f27901a = false;
        } else if (action == 2) {
            float x = motionEvent.getX() - f27896n;
            float y = motionEvent.getY() - f27897o;
            if (Math.abs(x) > 10.0f || Math.abs(y) > 10.0f) {
                this.f27901a = true;
                int left = (int) (getLeft() + x);
                int i2 = this.f27902b + left;
                int top = (int) (getTop() + y);
                int i3 = this.f27903c;
                int i4 = top + i3;
                if (left < 0) {
                    i2 = this.f27902b;
                    left = 0;
                } else {
                    int i5 = this.f27904d;
                    if (i2 > i5) {
                        left = i5 - this.f27902b;
                        i2 = i5;
                    }
                }
                if (top >= 0) {
                    int i6 = this.f27905e;
                    if (i4 > i6) {
                        int i7 = i6 - i3;
                        i3 = i6;
                        i = i7;
                    } else {
                        i = top;
                        i3 = i4;
                    }
                }
                f27898p = left;
                f27899q = i;
                layout(left, i, i2, i3);
            }
        } else if (action == 3) {
            setPressed(false);
            m45029q();
            this.f27901a = false;
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m45028p() {
        if (f27900r.isEmpty()) {
            return;
        }
        Iterator<x20> it = f27900r.iterator();
        while (it.hasNext()) {
            it.next().call();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m45029q() {
        if (getLeft() == 0 || getLeft() == this.f27904d - getWidth()) {
            return;
        }
        if (getLeft() + (getWidth() / 2) < this.f27904d / 2) {
            this.f27906f = ValueAnimator.ofInt(getLeft(), 0);
        } else {
            this.f27906f = ValueAnimator.ofInt(getLeft(), this.f27904d - this.f27902b);
        }
        this.f27906f.setDuration(f27895m);
        this.f27906f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.b2n0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f74641a.m45027o(valueAnimator);
            }
        });
        this.f27906f.start();
    }

    public VoiceCallView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27911k = new x20() { // from class: l.x1n0
            @Override // p153l.x20
            public final void call() {
                this.f192085a.m45026n();
            }
        };
        this.f27912l = new GestureDetector(getContext(), new C8420a());
        m45022j();
    }

    public VoiceCallView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27911k = new x20() { // from class: l.x1n0
            @Override // p153l.x20
            public final void call() {
                this.f192085a.m45026n();
            }
        };
        this.f27912l = new GestureDetector(getContext(), new C8420a());
        m45022j();
    }
}
