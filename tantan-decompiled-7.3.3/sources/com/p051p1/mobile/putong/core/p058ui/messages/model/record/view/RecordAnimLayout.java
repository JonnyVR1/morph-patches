package com.p051p1.mobile.putong.core.p058ui.messages.model.record.view;

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
import com.p051p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p153l.i4m;
import p153l.j4m;
import p153l.lam;
import p153l.n4m;
import p153l.nqc0;
import p153l.oqc0;
import p153l.qa00;
import p153l.uqc0;
import p153l.vqc0;

/* JADX INFO: loaded from: classes4.dex */
public class RecordAnimLayout extends View implements j4m, Choreographer.FrameCallback, n4m {

    /* JADX INFO: renamed from: a */
    public oqc0 f32911a;

    /* JADX INFO: renamed from: b */
    public uqc0 f32912b;

    /* JADX INFO: renamed from: c */
    public nqc0 f32913c;

    /* JADX INFO: renamed from: d */
    public List<lam> f32914d;

    /* JADX INFO: renamed from: e */
    public int f32915e;

    /* JADX INFO: renamed from: f */
    public int f32916f;

    /* JADX INFO: renamed from: g */
    public int f32917g;

    /* JADX INFO: renamed from: h */
    public int f32918h;

    /* JADX INFO: renamed from: i */
    public int f32919i;

    /* JADX INFO: renamed from: j */
    public int f32920j;

    /* JADX INFO: renamed from: k */
    public Paint f32921k;

    /* JADX INFO: renamed from: l */
    public float f32922l;

    /* JADX INFO: renamed from: m */
    public float f32923m;

    /* JADX INFO: renamed from: n */
    public RectF f32924n;

    /* JADX INFO: renamed from: o */
    public int[] f32925o;

    /* JADX INFO: renamed from: p */
    public int f32926p;

    /* JADX INFO: renamed from: q */
    public long f32927q;

    /* JADX INFO: renamed from: r */
    public i4m f32928r;

    /* JADX INFO: renamed from: s */
    public View f32929s;

    /* JADX INFO: renamed from: t */
    public float f32930t;

    /* JADX INFO: renamed from: u */
    public float f32931u;

    /* JADX INFO: renamed from: v */
    public ValueAnimator f32932v;

    /* JADX INFO: renamed from: w */
    public boolean f32933w;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.record.view.RecordAnimLayout$a */
    public class C8732a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f32934a;

        public C8732a(int i) {
            this.f32934a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            RecordAnimLayout.this.m50651k(this.f32934a, ((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.record.view.RecordAnimLayout$b */
    public class C8733b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f32936a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f32937b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f32938c;

        public C8733b(int i, boolean z, int i2) {
            this.f32936a = i;
            this.f32937b = z;
            this.f32938c = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (RecordAnimLayout.this.f32933w) {
                return;
            }
            if (this.f32936a == 2) {
                RecordAnimLayout.this.setVisibility(8);
                RecordAnimLayout.this.f32917g = 0;
            } else if (this.f32937b) {
                RecordAnimLayout.this.f32917g = this.f32938c;
                RecordAnimLayout recordAnimLayout = RecordAnimLayout.this;
                recordAnimLayout.m50651k(recordAnimLayout.f32917g, 100);
            }
        }
    }

    public RecordAnimLayout(Context context) {
        super(context);
        this.f32917g = 0;
        this.f32918h = 0;
        this.f32919i = 0;
        this.f32920j = 0;
        this.f32925o = new int[]{0, 0, 0, 0};
        this.f32926p = 0;
        this.f32927q = -1L;
        this.f32928r = null;
        this.f32930t = -1.0f;
        this.f32931u = -1.0f;
        this.f32933w = false;
        m50649i();
    }

    private void setInputAlpha(int i) {
        if (NullChecker.m82486a(this.f32929s)) {
            this.f32929s.setAlpha(Math.max(0, Math.min(255, i)) / 255.0f);
        }
    }

    @Override // p153l.j4m
    /* JADX INFO: renamed from: a */
    public void mo50644a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (this.f32930t == -1.0f || this.f32931u == -1.0f) {
            this.f32930t = x;
            this.f32931u = y;
        }
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                int i = this.f32917g;
                if (i == 0) {
                    if (x < this.f32922l) {
                        m50654n(1);
                        m50657q();
                        return;
                    }
                    return;
                }
                if (i != 1 || x <= this.f32923m) {
                    return;
                }
                m50655o(1, 0, true);
                return;
            }
            if (action != 3) {
                return;
            }
        }
        if (this.f32917g == 1) {
            m50654n(2);
            if (NullChecker.m82486a(this.f32928r)) {
                this.f32928r.mo138570b();
                return;
            }
            return;
        }
        m50654n(2);
        if (NullChecker.m82486a(this.f32928r)) {
            this.f32928r.mo138569a();
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        Choreographer.getInstance().postFrameCallback(this);
        invalidate();
    }

    /* JADX INFO: renamed from: e */
    public void m50645e() {
        m50654n(2);
        if (NullChecker.m82486a(this.f32928r)) {
            this.f32928r.mo138569a();
        }
    }

    /* JADX INFO: renamed from: f */
    public int m50646f(int i) {
        return (int) ((getContext().getResources().getDisplayMetrics().density * i) + 0.5f);
    }

    /* JADX INFO: renamed from: g */
    public final void m50647g(Canvas canvas) {
        for (int i = 0; i < this.f32914d.size(); i++) {
            this.f32914d.get(i).mo153512g(canvas, this.f32917g, this.f32919i);
        }
    }

    @Override // p153l.n4m
    public long getRecordStartTime() {
        return this.f32927q;
    }

    @Override // p153l.n4m
    public int getSoundLevel() {
        int i = 0;
        if (this.f32926p == 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            int[] iArr = this.f32925o;
            if (i >= iArr.length) {
                return i2 / iArr.length;
            }
            i2 += iArr[i];
            i++;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m50648h() {
        this.f32930t = -1.0f;
        this.f32931u = -1.0f;
    }

    /* JADX INFO: renamed from: i */
    public final void m50649i() {
        this.f32911a = new oqc0(getContext());
        this.f32912b = new uqc0(getContext());
        this.f32913c = new nqc0(getContext());
        ArrayList arrayList = new ArrayList();
        this.f32914d = arrayList;
        arrayList.add(this.f32912b);
        this.f32914d.add(this.f32911a);
        this.f32914d.add(this.f32913c);
        Choreographer.getInstance().postFrameCallback(this);
        Iterator<lam> it = this.f32914d.iterator();
        while (it.hasNext()) {
            it.next().mo153516k(this);
        }
        Paint paint = new Paint();
        this.f32921k = paint;
        paint.setColor(-1);
        this.f32921k.setAntiAlias(true);
        this.f32922l = m50646f(75);
        this.f32923m = m50646f(95);
    }

    /* JADX INFO: renamed from: j */
    public final void m50650j(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size == this.f32915e && size2 == this.f32916f) {
            return;
        }
        this.f32915e = size;
        this.f32916f = size2;
        if (this.f32914d != null) {
            for (int i3 = 0; i3 < this.f32914d.size(); i3++) {
                this.f32914d.get(i3).mo153513h(size, size2);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m50651k(int i, int i2) {
        if (i == 0) {
            int i3 = (i2 * 255) / 100;
            this.f32920j = i3;
            setInputAlpha(255 - (i3 * 2));
        } else if (i == 1) {
            this.f32920j = 255;
            setInputAlpha(0);
        } else if (i == 2) {
            int i4 = 255 - ((i2 * 255) / 100);
            this.f32920j = i4;
            if (i4 > 127) {
                setInputAlpha(0);
            } else {
                setInputAlpha(255 - (i4 * 2));
            }
        }
        for (int i5 = 0; i5 < this.f32914d.size(); i5++) {
            this.f32914d.get(i5).mo153511f(i, i2);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: l */
    public final void m50652l() {
        vqc0.m202374c();
        Choreographer.getInstance().removeFrameCallback(this);
        this.f32927q = -1L;
    }

    /* JADX INFO: renamed from: m */
    public void m50653m() {
        m50654n(2);
    }

    /* JADX INFO: renamed from: n */
    public void m50654n(int i) {
        m50655o(i, i, false);
    }

    /* JADX INFO: renamed from: o */
    public final void m50655o(int i, int i2, boolean z) {
        if (this.f32917g == 2 && i == 2) {
            return;
        }
        this.f32917g = i;
        int iIntValue = z ? 100 : 0;
        int i3 = z ? 0 : 100;
        ValueAnimator valueAnimator = this.f32932v;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            iIntValue = ((Integer) this.f32932v.getAnimatedValue()).intValue();
            if (i == 0 && this.f32918h == 2) {
                this.f32933w = true;
            }
            this.f32932v.cancel();
        }
        this.f32918h = i;
        ValueAnimator duration = ValueAnimator.ofInt(iIntValue, i3).setDuration(300L);
        this.f32932v = duration;
        duration.addUpdateListener(new C8732a(i));
        this.f32932v.addListener(new C8733b(i, z, i2));
        this.f32933w = false;
        this.f32932v.start();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Choreographer.getInstance().removeFrameCallback(this);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f32915e < 0 || this.f32916f <= 0) {
            return;
        }
        m50647g(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(qa00.m175859d(132.0f), View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        super.onMeasure(i, iMakeMeasureSpec);
        m50650j(i, iMakeMeasureSpec);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m50656p() {
        List<lam> list = this.f32914d;
        if (list != null) {
            Iterator<lam> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo153514i();
            }
        }
        m50654n(0);
    }

    /* JADX INFO: renamed from: q */
    public final void m50657q() {
        ((Vibrator) CoreModule.f18263b.getSystemService("vibrator")).vibrate(100L);
    }

    public void setInputRect(RectF rectF) {
        this.f32924n = rectF;
        List<lam> list = this.f32914d;
        if (list != null) {
            Iterator<lam> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo153515j(rectF);
            }
        }
    }

    public void setInputRootLayout(View view) {
        this.f32929s = view;
    }

    public void setRecordActionCallback(i4m i4mVar) {
        this.f32928r = i4mVar;
    }

    public void setRecordStartTime(long j) {
        this.f32927q = j;
    }

    public void setSoundLevel(int i) {
        int[] iArr = this.f32925o;
        int i2 = this.f32926p;
        iArr[i2 % iArr.length] = i;
        this.f32926p = i2 + 1;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8 || i == 4) {
            m50652l();
        }
    }

    public RecordAnimLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32917g = 0;
        this.f32918h = 0;
        this.f32919i = 0;
        this.f32920j = 0;
        this.f32925o = new int[]{0, 0, 0, 0};
        this.f32926p = 0;
        this.f32927q = -1L;
        this.f32928r = null;
        this.f32930t = -1.0f;
        this.f32931u = -1.0f;
        this.f32933w = false;
        m50649i();
    }

    public RecordAnimLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32917g = 0;
        this.f32918h = 0;
        this.f32919i = 0;
        this.f32920j = 0;
        this.f32925o = new int[]{0, 0, 0, 0};
        this.f32926p = 0;
        this.f32927q = -1L;
        this.f32928r = null;
        this.f32930t = -1.0f;
        this.f32931u = -1.0f;
        this.f32933w = false;
        m50649i();
    }
}
