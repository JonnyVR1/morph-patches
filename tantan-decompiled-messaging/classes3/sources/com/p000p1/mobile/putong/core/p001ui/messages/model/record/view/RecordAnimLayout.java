package com.p000p1.mobile.putong.core.p001ui.messages.model.record.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.Choreographer;
import android.view.MotionEvent;
import android.view.View;
import com.p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l.t100;
import org.spongycastle.asn1.cmp.PKIFailureInfo;
import p003l.gic0;
import p003l.hic0;
import p003l.nic0;
import p003l.oic0;
import p003l.p1m;
import p003l.q1m;
import p003l.u1m;
import p003l.v7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class RecordAnimLayout extends View implements q1m, Choreographer.FrameCallback, u1m {

    /* JADX INFO: renamed from: a */
    public hic0 f1954a;

    /* JADX INFO: renamed from: b */
    public nic0 f1955b;

    /* JADX INFO: renamed from: c */
    public gic0 f1956c;

    /* JADX INFO: renamed from: d */
    public List<v7m> f1957d;

    /* JADX INFO: renamed from: e */
    public int f1958e;

    /* JADX INFO: renamed from: f */
    public int f1959f;

    /* JADX INFO: renamed from: g */
    public int f1960g;

    /* JADX INFO: renamed from: h */
    public int f1961h;

    /* JADX INFO: renamed from: i */
    public int f1962i;

    /* JADX INFO: renamed from: j */
    public int f1963j;

    /* JADX INFO: renamed from: k */
    public Paint f1964k;

    /* JADX INFO: renamed from: l */
    public float f1965l;

    /* JADX INFO: renamed from: m */
    public float f1966m;

    /* JADX INFO: renamed from: n */
    public RectF f1967n;

    /* JADX INFO: renamed from: o */
    public int[] f1968o;

    /* JADX INFO: renamed from: p */
    public int f1969p;

    /* JADX INFO: renamed from: q */
    public long f1970q;

    /* JADX INFO: renamed from: r */
    public p1m f1971r;

    /* JADX INFO: renamed from: s */
    public View f1972s;

    /* JADX INFO: renamed from: t */
    public float f1973t;

    /* JADX INFO: renamed from: u */
    public float f1974u;

    /* JADX INFO: renamed from: v */
    public ValueAnimator f1975v;

    /* JADX INFO: renamed from: w */
    public boolean f1976w;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.record.view.RecordAnimLayout$a */
    public class C0152a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f1977a;

        public C0152a(int i) {
            this.f1977a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            RecordAnimLayout.this.m2615k(this.f1977a, ((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.record.view.RecordAnimLayout$b */
    public class C0153b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f1979a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f1980b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f1981c;

        public C0153b(int i, boolean z, int i2) {
            this.f1979a = i;
            this.f1980b = z;
            this.f1981c = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (RecordAnimLayout.this.f1976w) {
                return;
            }
            if (this.f1979a == 2) {
                RecordAnimLayout.this.setVisibility(8);
                RecordAnimLayout.this.f1960g = 0;
            } else if (this.f1980b) {
                RecordAnimLayout.this.f1960g = this.f1981c;
                RecordAnimLayout recordAnimLayout = RecordAnimLayout.this;
                recordAnimLayout.m2615k(recordAnimLayout.f1960g, 100);
            }
        }
    }

    public RecordAnimLayout(Context context) {
        super(context);
        this.f1960g = 0;
        this.f1961h = 0;
        this.f1962i = 0;
        this.f1963j = 0;
        this.f1968o = new int[]{0, 0, 0, 0};
        this.f1969p = 0;
        this.f1970q = -1L;
        this.f1971r = null;
        this.f1973t = -1.0f;
        this.f1974u = -1.0f;
        this.f1976w = false;
        m2613i();
    }

    private void setInputAlpha(int i) {
        if (NullChecker.a(this.f1972s)) {
            this.f1972s.setAlpha(Math.max(0, Math.min(255, i)) / 255.0f);
        }
    }

    @Override // p003l.q1m
    /* JADX INFO: renamed from: a */
    public void mo2608a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (this.f1973t == -1.0f || this.f1974u == -1.0f) {
            this.f1973t = x;
            this.f1974u = y;
        }
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                int i = this.f1960g;
                if (i == 0) {
                    if (x < this.f1965l) {
                        m2618n(1);
                        m2621q();
                        return;
                    }
                    return;
                }
                if (i != 1 || x <= this.f1966m) {
                    return;
                }
                m2619o(1, 0, true);
                return;
            }
            if (action != 3) {
                return;
            }
        }
        if (this.f1960g == 1) {
            m2618n(2);
            if (NullChecker.a(this.f1971r)) {
                this.f1971r.mo6174b();
                return;
            }
            return;
        }
        m2618n(2);
        if (NullChecker.a(this.f1971r)) {
            this.f1971r.mo6173a();
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        Choreographer.getInstance().postFrameCallback(this);
        invalidate();
    }

    /* JADX INFO: renamed from: e */
    public void m2609e() {
        m2618n(2);
        if (NullChecker.a(this.f1971r)) {
            this.f1971r.mo6173a();
        }
    }

    /* JADX INFO: renamed from: f */
    public int m2610f(int i) {
        return (int) ((getContext().getResources().getDisplayMetrics().density * i) + 0.5f);
    }

    /* JADX INFO: renamed from: g */
    public final void m2611g(Canvas canvas) {
        for (int i = 0; i < this.f1957d.size(); i++) {
            this.f1957d.get(i).mo3837g(canvas, this.f1960g, this.f1962i);
        }
    }

    @Override // p003l.u1m
    public long getRecordStartTime() {
        return this.f1970q;
    }

    @Override // p003l.u1m
    public int getSoundLevel() {
        int i = 0;
        if (this.f1969p == 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            int[] iArr = this.f1968o;
            if (i >= iArr.length) {
                return i2 / iArr.length;
            }
            i2 += iArr[i];
            i++;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m2612h() {
        this.f1973t = -1.0f;
        this.f1974u = -1.0f;
    }

    /* JADX INFO: renamed from: i */
    public final void m2613i() {
        this.f1954a = new hic0(getContext());
        this.f1955b = new nic0(getContext());
        this.f1956c = new gic0(getContext());
        ArrayList arrayList = new ArrayList();
        this.f1957d = arrayList;
        arrayList.add(this.f1955b);
        this.f1957d.add(this.f1954a);
        this.f1957d.add(this.f1956c);
        Choreographer.getInstance().postFrameCallback(this);
        Iterator<v7m> it = this.f1957d.iterator();
        while (it.hasNext()) {
            it.next().mo4547k(this);
        }
        Paint paint = new Paint();
        this.f1964k = paint;
        paint.setColor(-1);
        this.f1964k.setAntiAlias(true);
        this.f1965l = m2610f(75);
        this.f1966m = m2610f(95);
    }

    /* JADX INFO: renamed from: j */
    public final void m2614j(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size == this.f1958e && size2 == this.f1959f) {
            return;
        }
        this.f1958e = size;
        this.f1959f = size2;
        if (this.f1957d != null) {
            for (int i3 = 0; i3 < this.f1957d.size(); i3++) {
                this.f1957d.get(i3).mo3838h(size, size2);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m2615k(int i, int i2) {
        if (i == 0) {
            int i3 = (i2 * 255) / 100;
            this.f1963j = i3;
            setInputAlpha(255 - (i3 * 2));
        } else if (i == 1) {
            this.f1963j = 255;
            setInputAlpha(0);
        } else if (i == 2) {
            int i4 = 255 - ((i2 * 255) / 100);
            this.f1963j = i4;
            if (i4 > 127) {
                setInputAlpha(0);
            } else {
                setInputAlpha(255 - (i4 * 2));
            }
        }
        for (int i5 = 0; i5 < this.f1957d.size(); i5++) {
            this.f1957d.get(i5).mo3836f(i, i2);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: l */
    public final void m2616l() {
        oic0.m6712c();
        Choreographer.getInstance().removeFrameCallback(this);
        this.f1970q = -1L;
    }

    /* JADX INFO: renamed from: m */
    public void m2617m() {
        m2618n(2);
    }

    /* JADX INFO: renamed from: n */
    public void m2618n(int i) {
        m2619o(i, i, false);
    }

    /* JADX INFO: renamed from: o */
    public final void m2619o(int i, int i2, boolean z) {
        if (this.f1960g == 2 && i == 2) {
            return;
        }
        this.f1960g = i;
        int iIntValue = z ? 100 : 0;
        int i3 = z ? 0 : 100;
        ValueAnimator valueAnimator = this.f1975v;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            iIntValue = ((Integer) this.f1975v.getAnimatedValue()).intValue();
            if (i == 0 && this.f1961h == 2) {
                this.f1976w = true;
            }
            this.f1975v.cancel();
        }
        this.f1961h = i;
        ValueAnimator duration = ValueAnimator.ofInt(iIntValue, i3).setDuration(300L);
        this.f1975v = duration;
        duration.addUpdateListener(new C0152a(i));
        this.f1975v.addListener(new C0153b(i, z, i2));
        this.f1976w = false;
        this.f1975v.start();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Choreographer.getInstance().removeFrameCallback(this);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f1958e < 0 || this.f1959f <= 0) {
            return;
        }
        m2611g(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(t100.d(132.0f), View.MeasureSpec.getSize(i2)), PKIFailureInfo.systemUnavail);
        super.onMeasure(i, iMakeMeasureSpec);
        m2614j(i, iMakeMeasureSpec);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m2620p() {
        List<v7m> list = this.f1957d;
        if (list != null) {
            Iterator<v7m> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo4545i();
            }
        }
        m2618n(0);
    }

    /* JADX INFO: renamed from: q */
    public final void m2621q() {
        ((Vibrator) CoreModule.b.getSystemService("vibrator")).vibrate(100L);
    }

    public void setInputRect(RectF rectF) {
        this.f1967n = rectF;
        List<v7m> list = this.f1957d;
        if (list != null) {
            Iterator<v7m> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo4546j(rectF);
            }
        }
    }

    public void setInputRootLayout(View view) {
        this.f1972s = view;
    }

    public void setRecordActionCallback(p1m p1mVar) {
        this.f1971r = p1mVar;
    }

    public void setRecordStartTime(long j) {
        this.f1970q = j;
    }

    public void setSoundLevel(int i) {
        int[] iArr = this.f1968o;
        int i2 = this.f1969p;
        iArr[i2 % iArr.length] = i;
        this.f1969p = i2 + 1;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8 || i == 4) {
            m2616l();
        }
    }

    public RecordAnimLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1960g = 0;
        this.f1961h = 0;
        this.f1962i = 0;
        this.f1963j = 0;
        this.f1968o = new int[]{0, 0, 0, 0};
        this.f1969p = 0;
        this.f1970q = -1L;
        this.f1971r = null;
        this.f1973t = -1.0f;
        this.f1974u = -1.0f;
        this.f1976w = false;
        m2613i();
    }

    public RecordAnimLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1960g = 0;
        this.f1961h = 0;
        this.f1962i = 0;
        this.f1963j = 0;
        this.f1968o = new int[]{0, 0, 0, 0};
        this.f1969p = 0;
        this.f1970q = -1L;
        this.f1971r = null;
        this.f1973t = -1.0f;
        this.f1974u = -1.0f;
        this.f1976w = false;
        m2613i();
    }
}
