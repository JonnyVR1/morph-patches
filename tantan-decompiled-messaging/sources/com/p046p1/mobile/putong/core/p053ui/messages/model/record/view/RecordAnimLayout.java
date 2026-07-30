package com.p046p1.mobile.putong.core.p053ui.messages.model.record.view;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p149l.gic0;
import p149l.hic0;
import p149l.nic0;
import p149l.oic0;
import p149l.p1m;
import p149l.q1m;
import p149l.t100;
import p149l.u1m;
import p149l.v7m;

/* JADX INFO: loaded from: classes3.dex */
public class RecordAnimLayout extends View implements q1m, Choreographer.FrameCallback, u1m {

    /* JADX INFO: renamed from: a */
    public hic0 f32063a;

    /* JADX INFO: renamed from: b */
    public nic0 f32064b;

    /* JADX INFO: renamed from: c */
    public gic0 f32065c;

    /* JADX INFO: renamed from: d */
    public List<v7m> f32066d;

    /* JADX INFO: renamed from: e */
    public int f32067e;

    /* JADX INFO: renamed from: f */
    public int f32068f;

    /* JADX INFO: renamed from: g */
    public int f32069g;

    /* JADX INFO: renamed from: h */
    public int f32070h;

    /* JADX INFO: renamed from: i */
    public int f32071i;

    /* JADX INFO: renamed from: j */
    public int f32072j;

    /* JADX INFO: renamed from: k */
    public Paint f32073k;

    /* JADX INFO: renamed from: l */
    public float f32074l;

    /* JADX INFO: renamed from: m */
    public float f32075m;

    /* JADX INFO: renamed from: n */
    public RectF f32076n;

    /* JADX INFO: renamed from: o */
    public int[] f32077o;

    /* JADX INFO: renamed from: p */
    public int f32078p;

    /* JADX INFO: renamed from: q */
    public long f32079q;

    /* JADX INFO: renamed from: r */
    public p1m f32080r;

    /* JADX INFO: renamed from: s */
    public View f32081s;

    /* JADX INFO: renamed from: t */
    public float f32082t;

    /* JADX INFO: renamed from: u */
    public float f32083u;

    /* JADX INFO: renamed from: v */
    public ValueAnimator f32084v;

    /* JADX INFO: renamed from: w */
    public boolean f32085w;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.record.view.RecordAnimLayout$a */
    public class C8569a implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f32086a;

        public C8569a(int i) {
            this.f32086a = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            RecordAnimLayout.this.m49468k(this.f32086a, ((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.messages.model.record.view.RecordAnimLayout$b */
    public class C8570b extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ int f32088a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ boolean f32089b;

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ int f32090c;

        public C8570b(int i, boolean z, int i2) {
            this.f32088a = i;
            this.f32089b = z;
            this.f32090c = i2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            super.onAnimationEnd(animator);
            if (RecordAnimLayout.this.f32085w) {
                return;
            }
            if (this.f32088a == 2) {
                RecordAnimLayout.this.setVisibility(8);
                RecordAnimLayout.this.f32069g = 0;
            } else if (this.f32089b) {
                RecordAnimLayout.this.f32069g = this.f32090c;
                RecordAnimLayout recordAnimLayout = RecordAnimLayout.this;
                recordAnimLayout.m49468k(recordAnimLayout.f32069g, 100);
            }
        }
    }

    public RecordAnimLayout(Context context) {
        super(context);
        this.f32069g = 0;
        this.f32070h = 0;
        this.f32071i = 0;
        this.f32072j = 0;
        this.f32077o = new int[]{0, 0, 0, 0};
        this.f32078p = 0;
        this.f32079q = -1L;
        this.f32080r = null;
        this.f32082t = -1.0f;
        this.f32083u = -1.0f;
        this.f32085w = false;
        m49466i();
    }

    private void setInputAlpha(int i) {
        if (NullChecker.m81303a(this.f32081s)) {
            this.f32081s.setAlpha(Math.max(0, Math.min(255, i)) / 255.0f);
        }
    }

    @Override // p149l.q1m
    /* JADX INFO: renamed from: a */
    public void mo49461a(MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (this.f32082t == -1.0f || this.f32083u == -1.0f) {
            this.f32082t = x;
            this.f32083u = y;
        }
        int action = motionEvent.getAction();
        if (action != 1) {
            if (action == 2) {
                int i = this.f32069g;
                if (i == 0) {
                    if (x < this.f32074l) {
                        m49471n(1);
                        m49474q();
                        return;
                    }
                    return;
                }
                if (i != 1 || x <= this.f32075m) {
                    return;
                }
                m49472o(1, 0, true);
                return;
            }
            if (action != 3) {
                return;
            }
        }
        if (this.f32069g == 1) {
            m49471n(2);
            if (NullChecker.m81303a(this.f32080r)) {
                this.f32080r.mo152029b();
                return;
            }
            return;
        }
        m49471n(2);
        if (NullChecker.m81303a(this.f32080r)) {
            this.f32080r.mo152028a();
        }
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j) {
        Choreographer.getInstance().postFrameCallback(this);
        invalidate();
    }

    /* JADX INFO: renamed from: e */
    public void m49462e() {
        m49471n(2);
        if (NullChecker.m81303a(this.f32080r)) {
            this.f32080r.mo152028a();
        }
    }

    /* JADX INFO: renamed from: f */
    public int m49463f(int i) {
        return (int) ((getContext().getResources().getDisplayMetrics().density * i) + 0.5f);
    }

    /* JADX INFO: renamed from: g */
    public final void m49464g(Canvas canvas) {
        for (int i = 0; i < this.f32066d.size(); i++) {
            this.f32066d.get(i).mo116669g(canvas, this.f32069g, this.f32071i);
        }
    }

    @Override // p149l.u1m
    public long getRecordStartTime() {
        return this.f32079q;
    }

    @Override // p149l.u1m
    public int getSoundLevel() {
        int i = 0;
        if (this.f32078p == 0) {
            return 0;
        }
        int i2 = 0;
        while (true) {
            int[] iArr = this.f32077o;
            if (i >= iArr.length) {
                return i2 / iArr.length;
            }
            i2 += iArr[i];
            i++;
        }
    }

    /* JADX INFO: renamed from: h */
    public void m49465h() {
        this.f32082t = -1.0f;
        this.f32083u = -1.0f;
    }

    /* JADX INFO: renamed from: i */
    public final void m49466i() {
        this.f32063a = new hic0(getContext());
        this.f32064b = new nic0(getContext());
        this.f32065c = new gic0(getContext());
        ArrayList arrayList = new ArrayList();
        this.f32066d = arrayList;
        arrayList.add(this.f32064b);
        this.f32066d.add(this.f32063a);
        this.f32066d.add(this.f32065c);
        Choreographer.getInstance().postFrameCallback(this);
        Iterator<v7m> it = this.f32066d.iterator();
        while (it.hasNext()) {
            it.next().mo126279k(this);
        }
        Paint paint = new Paint();
        this.f32073k = paint;
        paint.setColor(-1);
        this.f32073k.setAntiAlias(true);
        this.f32074l = m49463f(75);
        this.f32075m = m49463f(95);
    }

    /* JADX INFO: renamed from: j */
    public final void m49467j(int i, int i2) {
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        if (size == this.f32067e && size2 == this.f32068f) {
            return;
        }
        this.f32067e = size;
        this.f32068f = size2;
        if (this.f32066d != null) {
            for (int i3 = 0; i3 < this.f32066d.size(); i3++) {
                this.f32066d.get(i3).mo116670h(size, size2);
            }
        }
    }

    /* JADX INFO: renamed from: k */
    public void m49468k(int i, int i2) {
        if (i == 0) {
            int i3 = (i2 * 255) / 100;
            this.f32072j = i3;
            setInputAlpha(255 - (i3 * 2));
        } else if (i == 1) {
            this.f32072j = 255;
            setInputAlpha(0);
        } else if (i == 2) {
            int i4 = 255 - ((i2 * 255) / 100);
            this.f32072j = i4;
            if (i4 > 127) {
                setInputAlpha(0);
            } else {
                setInputAlpha(255 - (i4 * 2));
            }
        }
        for (int i5 = 0; i5 < this.f32066d.size(); i5++) {
            this.f32066d.get(i5).mo116668f(i, i2);
        }
        invalidate();
    }

    /* JADX INFO: renamed from: l */
    public final void m49469l() {
        oic0.m164506c();
        Choreographer.getInstance().removeFrameCallback(this);
        this.f32079q = -1L;
    }

    /* JADX INFO: renamed from: m */
    public void m49470m() {
        m49471n(2);
    }

    /* JADX INFO: renamed from: n */
    public void m49471n(int i) {
        m49472o(i, i, false);
    }

    /* JADX INFO: renamed from: o */
    public final void m49472o(int i, int i2, boolean z) {
        if (this.f32069g == 2 && i == 2) {
            return;
        }
        this.f32069g = i;
        int iIntValue = z ? 100 : 0;
        int i3 = z ? 0 : 100;
        ValueAnimator valueAnimator = this.f32084v;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            iIntValue = ((Integer) this.f32084v.getAnimatedValue()).intValue();
            if (i == 0 && this.f32070h == 2) {
                this.f32085w = true;
            }
            this.f32084v.cancel();
        }
        this.f32070h = i;
        ValueAnimator duration = ValueAnimator.ofInt(iIntValue, i3).setDuration(300L);
        this.f32084v = duration;
        duration.addUpdateListener(new C8569a(i));
        this.f32084v.addListener(new C8570b(i, z, i2));
        this.f32085w = false;
        this.f32084v.start();
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Choreographer.getInstance().removeFrameCallback(this);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.f32067e < 0 || this.f32068f <= 0) {
            return;
        }
        m49464g(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(Math.max(t100.m186890d(132.0f), View.MeasureSpec.getSize(i2)), Integer.MIN_VALUE);
        super.onMeasure(i, iMakeMeasureSpec);
        m49467j(i, iMakeMeasureSpec);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    /* JADX INFO: renamed from: p */
    public void m49473p() {
        List<v7m> list = this.f32066d;
        if (list != null) {
            Iterator<v7m> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo126277i();
            }
        }
        m49471n(0);
    }

    /* JADX INFO: renamed from: q */
    public final void m49474q() {
        ((Vibrator) CoreModule.f17544b.getSystemService("vibrator")).vibrate(100L);
    }

    public void setInputRect(RectF rectF) {
        this.f32076n = rectF;
        List<v7m> list = this.f32066d;
        if (list != null) {
            Iterator<v7m> it = list.iterator();
            while (it.hasNext()) {
                it.next().mo126278j(rectF);
            }
        }
    }

    public void setInputRootLayout(View view) {
        this.f32081s = view;
    }

    public void setRecordActionCallback(p1m p1mVar) {
        this.f32080r = p1mVar;
    }

    public void setRecordStartTime(long j) {
        this.f32079q = j;
    }

    public void setSoundLevel(int i) {
        int[] iArr = this.f32077o;
        int i2 = this.f32078p;
        iArr[i2 % iArr.length] = i;
        this.f32078p = i2 + 1;
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8 || i == 4) {
            m49469l();
        }
    }

    public RecordAnimLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32069g = 0;
        this.f32070h = 0;
        this.f32071i = 0;
        this.f32072j = 0;
        this.f32077o = new int[]{0, 0, 0, 0};
        this.f32078p = 0;
        this.f32079q = -1L;
        this.f32080r = null;
        this.f32082t = -1.0f;
        this.f32083u = -1.0f;
        this.f32085w = false;
        m49466i();
    }

    public RecordAnimLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32069g = 0;
        this.f32070h = 0;
        this.f32071i = 0;
        this.f32072j = 0;
        this.f32077o = new int[]{0, 0, 0, 0};
        this.f32078p = 0;
        this.f32079q = -1L;
        this.f32080r = null;
        this.f32082t = -1.0f;
        this.f32083u = -1.0f;
        this.f32085w = false;
        m49466i();
    }
}
