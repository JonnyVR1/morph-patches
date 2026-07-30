package com.p000p1.mobile.putong.core.newui.voicecall;

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
import com.p1.mobile.putong.core.message.R;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.c3c0;
import l.c4g0;
import l.d30;
import l.e30;
import l.jo0;
import l.l6c0;
import l.mkd0;
import l.w9j;
import l.xdl0;
import l.xhx;
import l.y4c0;
import p009l.ssm0;
import p009l.tqm0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceCallView extends FrameLayout {

    /* JADX INFO: renamed from: m */
    public static int f5825m = 300;

    /* JADX INFO: renamed from: n */
    public static int f5826n;

    /* JADX INFO: renamed from: o */
    public static int f5827o;

    /* JADX INFO: renamed from: p */
    public static int f5828p;

    /* JADX INFO: renamed from: q */
    public static int f5829q;

    /* JADX INFO: renamed from: r */
    public static List<d30> f5830r = new ArrayList();

    /* JADX INFO: renamed from: a */
    public boolean f5831a;

    /* JADX INFO: renamed from: b */
    public int f5832b;

    /* JADX INFO: renamed from: c */
    public int f5833c;

    /* JADX INFO: renamed from: d */
    public int f5834d;

    /* JADX INFO: renamed from: e */
    public int f5835e;

    /* JADX INFO: renamed from: f */
    public ValueAnimator f5836f;

    /* JADX INFO: renamed from: g */
    public c4g0 f5837g;

    /* JADX INFO: renamed from: h */
    public TextView f5838h;

    /* JADX INFO: renamed from: i */
    public ImageView f5839i;

    /* JADX INFO: renamed from: j */
    public c4g0 f5840j;

    /* JADX INFO: renamed from: k */
    public d30 f5841k;

    /* JADX INFO: renamed from: l */
    public GestureDetector f5842l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.voicecall.VoiceCallView$a */
    public class C0421a extends GestureDetector.SimpleOnGestureListener {
        public C0421a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public boolean onSingleTapUp(MotionEvent motionEvent) {
            if (VoiceCallView.this.f5831a) {
                return true;
            }
            VoiceCallView.this.performClick();
            return true;
        }
    }

    public VoiceCallView(Context context) {
        super(context);
        this.f5841k = new d30() { // from class: l.tsm0
            public final void call() {
                this.f20855a.m8106n();
            }
        };
        this.f5842l = new GestureDetector(getContext(), new C0421a());
        m8102j();
    }

    /* JADX INFO: renamed from: h */
    public final void m8100h() {
        this.f5837g = tqm0.m22637p().m22643i().observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.usm0
            public final void call(Object obj) {
                this.f21324a.m8104l((Integer) obj);
            }
        }));
        this.f5840j = xhx.C().l.filter(new w9j() { // from class: l.vsm0
            public final Object call(Object obj) {
                return Boolean.valueOf(((Long) obj).longValue() > 0);
            }
        }).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.wsm0
            public final void call(Object obj) {
                this.f22302a.m8105m((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public void m8106n() {
        if (f5828p == 0 && f5829q == 0) {
            return;
        }
        if (getLeft() == f5828p && getTop() == f5829q) {
            return;
        }
        if (NullChecker.a(getLayoutParams()) && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = f5828p;
            marginLayoutParams.topMargin = f5829q;
        }
        int i = f5828p;
        layout(i, f5829q, getWidth() + i, f5829q + getHeight());
        m8108p();
    }

    /* JADX INFO: renamed from: j */
    public final void m8102j() {
        View.inflate(getContext(), l6c0.B4, this);
        this.f5838h = (TextView) findViewById(y4c0.O4);
        this.f5839i = (ImageView) findViewById(y4c0.k1);
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m8103k() {
        if (NullChecker.a(getParent())) {
            ((ViewGroup) getParent()).removeView(this);
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m8104l(Integer num) {
        int iIntValue = num.intValue();
        if (iIntValue == 0) {
            this.f5838h.setText(R.string.K6);
            this.f5838h.setEnabled(false);
            this.f5839i.setImageResource(c3c0.K0);
            postDelayed(new Runnable() { // from class: l.ysm0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f23222a.m8103k();
                }
            }, 1000L);
            return;
        }
        if (iIntValue == 1 || iIntValue == 2) {
            this.f5838h.setText(R.string.L6);
            this.f5839i.setImageResource(c3c0.J0);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m8105m(Long l2) {
        if (tqm0.m22637p().m22646l() == 3) {
            this.f5838h.setText(ssm0.m22366b(l2.longValue()));
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m8107o(ValueAnimator valueAnimator) {
        int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        f5828p = iIntValue;
        layout(iIntValue, getTop(), this.f5832b + iIntValue, getBottom());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        f5830r.add(this.f5841k);
        m8100h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        f5830r.remove(this.f5841k);
        mkd0.z(this.f5837g);
        mkd0.z(this.f5840j);
        if (NullChecker.a(this.f5836f)) {
            this.f5836f.cancel();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        m8106n();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f5832b = i;
        this.f5833c = i2;
        this.f5834d = xdl0.y0();
        this.f5835e = xdl0.w0();
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007b  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        this.f5842l.onTouchEvent(motionEvent);
        int i = 0;
        if (!isEnabled()) {
            return false;
        }
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f5831a = false;
            f5826n = (int) motionEvent.getX();
            f5827o = (int) motionEvent.getY();
        } else if (action == 1) {
            setPressed(false);
            m8109q();
            this.f5831a = false;
        } else if (action == 2) {
            float x = motionEvent.getX() - f5826n;
            float y = motionEvent.getY() - f5827o;
            if (Math.abs(x) > 10.0f || Math.abs(y) > 10.0f) {
                this.f5831a = true;
                int left = (int) (getLeft() + x);
                int i2 = this.f5832b + left;
                int top = (int) (getTop() + y);
                int i3 = this.f5833c;
                int i4 = top + i3;
                if (left < 0) {
                    i2 = this.f5832b;
                    left = 0;
                } else {
                    int i5 = this.f5834d;
                    if (i2 > i5) {
                        left = i5 - this.f5832b;
                        i2 = i5;
                    }
                }
                if (top >= 0) {
                    int i6 = this.f5835e;
                    if (i4 > i6) {
                        int i7 = i6 - i3;
                        i3 = i6;
                        i = i7;
                    } else {
                        i = top;
                        i3 = i4;
                    }
                }
                f5828p = left;
                f5829q = i;
                layout(left, i, i2, i3);
            }
        } else if (action == 3) {
            setPressed(false);
            m8109q();
            this.f5831a = false;
        }
        return true;
    }

    /* JADX INFO: renamed from: p */
    public final void m8108p() {
        if (f5830r.isEmpty()) {
            return;
        }
        Iterator<d30> it = f5830r.iterator();
        while (it.hasNext()) {
            it.next().call();
        }
    }

    /* JADX INFO: renamed from: q */
    public final void m8109q() {
        if (getLeft() == 0 || getLeft() == this.f5834d - getWidth()) {
            return;
        }
        if (getLeft() + (getWidth() / 2) < this.f5834d / 2) {
            this.f5836f = ValueAnimator.ofInt(getLeft(), 0);
        } else {
            this.f5836f = ValueAnimator.ofInt(getLeft(), this.f5834d - this.f5832b);
        }
        this.f5836f.setDuration(f5825m);
        this.f5836f.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.xsm0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f22708a.m8107o(valueAnimator);
            }
        });
        this.f5836f.start();
    }

    public VoiceCallView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5841k = new d30() { // from class: l.tsm0
            public final void call() {
                this.f20855a.m8106n();
            }
        };
        this.f5842l = new GestureDetector(getContext(), new C0421a());
        m8102j();
    }

    public VoiceCallView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5841k = new d30() { // from class: l.tsm0
            public final void call() {
                this.f20855a.m8106n();
            }
        };
        this.f5842l = new GestureDetector(getContext(), new C0421a());
        m8102j();
    }
}
