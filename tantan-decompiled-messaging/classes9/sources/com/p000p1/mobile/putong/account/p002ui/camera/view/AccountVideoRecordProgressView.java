package com.p000p1.mobile.putong.account.p002ui.camera.view;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import p006l.c9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class AccountVideoRecordProgressView extends View {

    /* JADX INFO: renamed from: a */
    public int f938a;

    /* JADX INFO: renamed from: b */
    public int f939b;

    /* JADX INFO: renamed from: c */
    public int f940c;

    /* JADX INFO: renamed from: d */
    public int f941d;

    /* JADX INFO: renamed from: e */
    public long f942e;

    /* JADX INFO: renamed from: f */
    public int f943f;

    /* JADX INFO: renamed from: g */
    public Paint f944g;

    /* JADX INFO: renamed from: h */
    public ArrayList<C0094c> f945h;

    /* JADX INFO: renamed from: i */
    public RectF f946i;

    /* JADX INFO: renamed from: j */
    public InterfaceC0095d f947j;

    /* JADX INFO: renamed from: k */
    public boolean f948k;

    /* JADX INFO: renamed from: l */
    public int f949l;

    /* JADX INFO: renamed from: m */
    public ValueAnimator f950m;

    /* JADX INFO: renamed from: n */
    public ValueAnimator f951n;

    /* JADX INFO: renamed from: o */
    public C0094c f952o;

    /* JADX INFO: renamed from: p */
    public Animator.AnimatorListener f953p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountVideoRecordProgressView$a */
    public class C0092a implements Animator.AnimatorListener {
        public C0092a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AccountVideoRecordProgressView.this.f948k = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AccountVideoRecordProgressView.this.f948k = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountVideoRecordProgressView$b */
    public class C0093b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public boolean f955a = false;

        public C0093b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f955a = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f955a) {
                return;
            }
            AccountVideoRecordProgressView accountVideoRecordProgressView = AccountVideoRecordProgressView.this;
            accountVideoRecordProgressView.m1040f(accountVideoRecordProgressView.f942e);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f955a = false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountVideoRecordProgressView$c */
    public class C0094c {

        /* JADX INFO: renamed from: a */
        public boolean f957a;

        /* JADX INFO: renamed from: b */
        public boolean f958b;

        /* JADX INFO: renamed from: c */
        public long f959c;

        /* JADX INFO: renamed from: d */
        public long f960d;

        /* JADX INFO: renamed from: e */
        public float f961e;

        /* JADX INFO: renamed from: f */
        public float f962f;

        public C0094c() {
            this.f957a = false;
            this.f958b = false;
            this.f959c = 0L;
            this.f960d = 0L;
            this.f961e = 0.0f;
            this.f962f = 1.0f;
        }

        /* JADX INFO: renamed from: d */
        public long m1058d() {
            return this.f960d - this.f959c;
        }

        /* JADX INFO: renamed from: e */
        public float m1059e() {
            return m1058d() * this.f962f;
        }

        /* JADX INFO: renamed from: f */
        public boolean m1060f() {
            return this.f957a;
        }

        /* JADX INFO: renamed from: g */
        public boolean m1061g() {
            return this.f958b;
        }

        /* JADX INFO: renamed from: h */
        public void m1062h(boolean z) {
            this.f957a = z;
        }

        /* JADX INFO: renamed from: i */
        public void m1063i(long j) {
            this.f960d = j;
        }

        /* JADX INFO: renamed from: j */
        public void m1064j(boolean z) {
            this.f958b = z;
        }

        /* JADX INFO: renamed from: k */
        public void m1065k(float f) {
            this.f962f = f;
        }

        /* JADX INFO: renamed from: l */
        public void m1066l(long j) {
            this.f959c = j;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountVideoRecordProgressView$d */
    public interface InterfaceC0095d {
        /* JADX INFO: renamed from: a */
        void mo1067a(long j);
    }

    public AccountVideoRecordProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f938a = 1291845631;
        this.f939b = -207043;
        this.f940c = -65536;
        this.f941d = -16777216;
        this.f942e = 0L;
        this.f943f = 1;
        this.f944g = null;
        this.f945h = null;
        this.f949l = 0;
        this.f950m = null;
        this.f951n = null;
        this.f952o = null;
        this.f953p = new C0093b();
        m1044j(context, attributeSet, i, 0);
    }

    /* JADX INFO: renamed from: f */
    public final void m1040f(long j) {
        if (NullChecker.a(this.f947j) && NullChecker.a(this.f945h)) {
            long jM1059e = 0;
            if (j > 0) {
                this.f947j.mo1067a(j);
                return;
            }
            for (C0094c c0094c : this.f945h) {
                if (NullChecker.b(c0094c)) {
                    jM1059e = (long) (jM1059e + c0094c.m1059e());
                }
            }
            this.f947j.mo1067a(jM1059e);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m1041g() {
        if (NullChecker.a(this.f945h)) {
            this.f945h.clear();
            invalidate();
        }
    }

    public int getCount() {
        ArrayList<C0094c> arrayList = this.f945h;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public long getLastSliceDuration() {
        ArrayList<C0094c> arrayList = this.f945h;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList<C0094c> arrayList2 = this.f945h;
            C0094c c0094c = arrayList2.get(arrayList2.size() - 1);
            if (c0094c != null) {
                return c0094c.m1058d();
            }
        }
        return 0L;
    }

    public long getRecordDuration() {
        ArrayList<C0094c> arrayList = this.f945h;
        if (arrayList == null || arrayList.isEmpty()) {
            return 0L;
        }
        long jM1059e = 0;
        for (C0094c c0094c : this.f945h) {
            if (c0094c != null && c0094c.m1058d() > 0) {
                jM1059e = (long) (jM1059e + c0094c.m1059e());
            }
        }
        return jM1059e;
    }

    /* JADX INFO: renamed from: h */
    public final void m1042h(Canvas canvas) {
        Canvas canvas2;
        this.f944g.setColor(this.f941d);
        this.f944g.setStyle(Paint.Style.STROKE);
        this.f944g.setStrokeWidth(this.f943f);
        int height = getHeight();
        int size = this.f945h.size();
        int i = 0;
        while (i < size) {
            C0094c c0094c = this.f945h.get(i);
            if (c0094c == null || c0094c.m1058d() <= 0 || c0094c.m1061g() || i == size - 1) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(c0094c.f961e, 0.0f, c0094c.f961e, height, this.f944g);
            }
            i++;
            canvas = canvas2;
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m1043i(C0094c c0094c) {
        return (int) ((getWidth() * c0094c.m1059e()) / this.f942e);
    }

    /* JADX INFO: renamed from: j */
    public final void m1044j(Context context, AttributeSet attributeSet, int i, int i2) {
        if (context == null || attributeSet == null) {
            return;
        }
        m1045k(context.getTheme().obtainStyledAttributes(attributeSet, c9c0.f9516M, i, i2));
    }

    /* JADX INFO: renamed from: k */
    public final void m1045k(TypedArray typedArray) {
        if (NullChecker.a(typedArray)) {
            this.f938a = typedArray.getColor(c9c0.f9519P, this.f938a);
            this.f939b = typedArray.getColor(c9c0.f9520Q, this.f939b);
            this.f940c = typedArray.getColor(c9c0.f9517N, this.f940c);
            this.f941d = typedArray.getColor(c9c0.f9518O, this.f941d);
            this.f943f = typedArray.getDimensionPixelOffset(c9c0.f9521R, this.f943f);
            typedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m1046l() {
        ArrayList<C0094c> arrayList = this.f945h;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<C0094c> it = this.f945h.iterator();
            while (it.hasNext()) {
                if (it.next().f962f != 1.0f) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m1047m(ValueAnimator valueAnimator) {
        this.f949l = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m1048n(ValueAnimator valueAnimator) {
        this.f952o.m1063i(SystemClock.uptimeMillis());
        invalidate();
        m1040f(-1L);
    }

    /* JADX INFO: renamed from: o */
    public void m1049o() {
        ArrayList<C0094c> arrayList = this.f945h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<C0094c> arrayList2 = this.f945h;
        arrayList2.get(arrayList2.size() - 1).m1062h(true);
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0197  */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        ArrayList<C0094c> arrayList;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        if (this.f944g == null) {
            this.f944g = new Paint(1);
        }
        if (this.f946i == null) {
            this.f946i = new RectF();
        }
        this.f944g.setStyle(Paint.Style.FILL);
        RectF rectF = this.f946i;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = getWidth();
        this.f946i.bottom = getHeight();
        this.f944g.setColor(this.f938a);
        canvas2.drawRoundRect(this.f946i, getHeight() / 2, getHeight() / 2, this.f944g);
        if (this.f942e <= 0 || (arrayList = this.f945h) == null || arrayList.isEmpty()) {
            if (this.f948k) {
                RectF rectF2 = this.f946i;
                rectF2.left = 0.0f;
                rectF2.right = this.f949l;
                this.f944g.setColor(this.f939b);
                canvas2.drawRoundRect(this.f946i, getHeight() / 2, getHeight() / 2, this.f944g);
                return;
            }
            return;
        }
        int height = getHeight();
        int i = 0;
        int i2 = 0;
        while (i < this.f945h.size()) {
            C0094c c0094c = this.f945h.get(i);
            if (c0094c != null && c0094c.m1058d() > 0) {
                boolean zM1060f = c0094c.m1060f();
                Paint paint = this.f944g;
                if (zM1060f) {
                    paint.setColor(this.f940c);
                } else {
                    paint.setColor(this.f939b);
                }
                int iM1043i = m1043i(c0094c);
                int width = i2 + iM1043i;
                if (width > getWidth()) {
                    width = getWidth();
                }
                int i3 = width;
                float f = i3;
                c0094c.f961e = f;
                if (i == 0 && i == this.f945h.size() - 1) {
                    RectF rectF3 = this.f946i;
                    rectF3.left = i2;
                    rectF3.right = f;
                    float f2 = height / 2;
                    canvas2.drawRoundRect(rectF3, f2, f2, this.f944g);
                } else if (i == 0) {
                    RectF rectF4 = this.f946i;
                    rectF4.left = i2;
                    rectF4.right = i2 + height;
                    canvas2.drawArc(rectF4, 90.0f, 180.0f, false, this.f944g);
                    int i4 = height / 2;
                    if (iM1043i > i4) {
                        canvas.drawRect(i2 + i4, 0.0f, f, height, this.f944g);
                    }
                } else if (i == this.f945h.size() - 1 || i3 > getWidth() - (height / 2)) {
                    RectF rectF5 = this.f946i;
                    rectF5.left = i3 - height;
                    rectF5.right = f;
                    canvas.drawArc(rectF5, -90.0f, 180.0f, false, this.f944g);
                    int i5 = height / 2;
                    if (iM1043i > i5) {
                        canvas.drawRect(i2, 0.0f, i3 - i5, height, this.f944g);
                    }
                } else {
                    canvas.drawRect(i2, 0.0f, f, height, this.f944g);
                }
                i2 = i3;
            }
            i++;
            canvas2 = canvas;
        }
        if (this.f948k) {
            ArrayList<C0094c> arrayList2 = this.f945h;
            int i6 = (int) arrayList2.get(arrayList2.size() - 1).f961e;
            float f3 = i6;
            float f4 = height;
            canvas.drawRect(i2, 0.0f, f3, f4, this.f944g);
            RectF rectF6 = this.f946i;
            int i7 = this.f949l;
            rectF6.left = (i6 + i7) - height;
            rectF6.right = i7 + i6;
            canvas.drawArc(rectF6, -90.0f, 180.0f, false, this.f944g);
            int i8 = this.f949l;
            int i9 = height / 2;
            if (i8 > i9) {
                canvas.drawRect(f3, 0.0f, (i6 + i8) - i9, f4, this.f944g);
            }
        }
        m1042h(canvas);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (isInEditMode()) {
            this.f942e = 60000L;
            this.f945h = new ArrayList<>();
            C0094c c0094c = new C0094c();
            c0094c.m1066l(0L);
            c0094c.m1063i(10000L);
            this.f945h.add(c0094c);
            C0094c c0094c2 = new C0094c();
            c0094c2.m1066l(0L);
            c0094c2.m1063i(10000L);
            this.f945h.add(c0094c2);
            C0094c c0094c3 = new C0094c();
            c0094c3.m1066l(0L);
            c0094c3.m1063i(10000L);
            c0094c3.m1062h(true);
            this.f945h.add(c0094c3);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m1050p() {
        ArrayList<C0094c> arrayList = this.f945h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<C0094c> arrayList2 = this.f945h;
        C0094c c0094c = arrayList2.get(arrayList2.size() - 1);
        if (c0094c.m1060f()) {
            c0094c.m1062h(false);
            invalidate();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m1051q() {
        this.f947j = null;
        if (NullChecker.a(this.f950m)) {
            if (this.f950m.isRunning()) {
                this.f950m.cancel();
            }
            this.f950m.removeAllUpdateListeners();
            this.f950m.removeAllListeners();
        }
        if (NullChecker.a(this.f945h)) {
            this.f945h.clear();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m1052r() {
        ArrayList<C0094c> arrayList = this.f945h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<C0094c> arrayList2 = this.f945h;
        C0094c c0094c = arrayList2.get(arrayList2.size() - 1);
        ArrayList<C0094c> arrayList3 = this.f945h;
        arrayList3.remove(arrayList3.size() - 1);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m1043i(c0094c), 0);
        this.f951n = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(200L);
        this.f951n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.cz
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f9936a.m1047m(valueAnimator);
            }
        });
        this.f951n.addListener(new C0092a());
        this.f951n.start();
    }

    /* JADX INFO: renamed from: s */
    public void m1053s(float f) {
        long recordDuration = getRecordDuration();
        if (recordDuration >= this.f942e) {
            return;
        }
        if (NullChecker.a(this.f950m) && this.f950m.isRunning()) {
            return;
        }
        m1050p();
        C0094c c0094c = new C0094c();
        c0094c.m1066l(SystemClock.uptimeMillis());
        c0094c.m1064j(true);
        c0094c.m1065k(f);
        this.f952o = c0094c;
        if (this.f945h == null) {
            this.f945h = new ArrayList<>();
        }
        this.f945h.add(c0094c);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt((int) recordDuration, (int) this.f942e);
        this.f950m = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration((long) ((this.f942e - recordDuration) / f));
        this.f950m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.bz
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f9232a.m1048n(valueAnimator);
            }
        });
        this.f950m.addListener(this.f953p);
        this.f950m.start();
    }

    public void setListener(InterfaceC0095d interfaceC0095d) {
        this.f947j = interfaceC0095d;
    }

    public void setMaxDuration(long j) {
        this.f942e = j;
    }

    /* JADX INFO: renamed from: t */
    public void m1054t() {
        ArrayList<C0094c> arrayList = this.f945h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<C0094c> arrayList2 = this.f945h;
        C0094c c0094c = arrayList2.get(arrayList2.size() - 1);
        if (c0094c.m1061g()) {
            c0094c.m1063i(SystemClock.uptimeMillis());
            c0094c.m1064j(false);
            invalidate();
        }
        if (NullChecker.a(this.f950m) && this.f950m.isRunning()) {
            this.f950m.cancel();
        }
        this.f952o = null;
    }

    public AccountVideoRecordProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AccountVideoRecordProgressView(Context context) {
        this(context, null);
    }

    @TargetApi(21)
    public AccountVideoRecordProgressView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f938a = 1291845631;
        this.f939b = -207043;
        this.f940c = -65536;
        this.f941d = -16777216;
        this.f942e = 0L;
        this.f943f = 1;
        this.f944g = null;
        this.f945h = null;
        this.f949l = 0;
        this.f950m = null;
        this.f951n = null;
        this.f952o = null;
        this.f953p = new C0093b();
        m1044j(context, attributeSet, i, i2);
    }
}
