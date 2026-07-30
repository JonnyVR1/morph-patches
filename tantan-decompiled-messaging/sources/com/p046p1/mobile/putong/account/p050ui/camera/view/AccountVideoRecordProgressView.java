package com.p046p1.mobile.putong.account.p050ui.camera.view;

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
import com.clevertap.android.sdk.Constants;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import p149l.c9c0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes9.dex */
public class AccountVideoRecordProgressView extends View {

    /* JADX INFO: renamed from: a */
    public int f16949a;

    /* JADX INFO: renamed from: b */
    public int f16950b;

    /* JADX INFO: renamed from: c */
    public int f16951c;

    /* JADX INFO: renamed from: d */
    public int f16952d;

    /* JADX INFO: renamed from: e */
    public long f16953e;

    /* JADX INFO: renamed from: f */
    public int f16954f;

    /* JADX INFO: renamed from: g */
    public Paint f16955g;

    /* JADX INFO: renamed from: h */
    public ArrayList<C4668c> f16956h;

    /* JADX INFO: renamed from: i */
    public RectF f16957i;

    /* JADX INFO: renamed from: j */
    public InterfaceC4669d f16958j;

    /* JADX INFO: renamed from: k */
    public boolean f16959k;

    /* JADX INFO: renamed from: l */
    public int f16960l;

    /* JADX INFO: renamed from: m */
    public ValueAnimator f16961m;

    /* JADX INFO: renamed from: n */
    public ValueAnimator f16962n;

    /* JADX INFO: renamed from: o */
    public C4668c f16963o;

    /* JADX INFO: renamed from: p */
    public Animator.AnimatorListener f16964p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountVideoRecordProgressView$a */
    public class C4666a implements Animator.AnimatorListener {
        public C4666a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AccountVideoRecordProgressView.this.f16959k = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AccountVideoRecordProgressView.this.f16959k = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountVideoRecordProgressView$b */
    public class C4667b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public boolean f16966a = false;

        public C4667b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f16966a = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f16966a) {
                return;
            }
            AccountVideoRecordProgressView accountVideoRecordProgressView = AccountVideoRecordProgressView.this;
            accountVideoRecordProgressView.m29134f(accountVideoRecordProgressView.f16953e);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f16966a = false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountVideoRecordProgressView$c */
    public class C4668c {

        /* JADX INFO: renamed from: a */
        public boolean f16968a;

        /* JADX INFO: renamed from: b */
        public boolean f16969b;

        /* JADX INFO: renamed from: c */
        public long f16970c;

        /* JADX INFO: renamed from: d */
        public long f16971d;

        /* JADX INFO: renamed from: e */
        public float f16972e;

        /* JADX INFO: renamed from: f */
        public float f16973f;

        public C4668c() {
            this.f16968a = false;
            this.f16969b = false;
            this.f16970c = 0L;
            this.f16971d = 0L;
            this.f16972e = 0.0f;
            this.f16973f = 1.0f;
        }

        /* JADX INFO: renamed from: d */
        public long m29152d() {
            return this.f16971d - this.f16970c;
        }

        /* JADX INFO: renamed from: e */
        public float m29153e() {
            return m29152d() * this.f16973f;
        }

        /* JADX INFO: renamed from: f */
        public boolean m29154f() {
            return this.f16968a;
        }

        /* JADX INFO: renamed from: g */
        public boolean m29155g() {
            return this.f16969b;
        }

        /* JADX INFO: renamed from: h */
        public void m29156h(boolean z) {
            this.f16968a = z;
        }

        /* JADX INFO: renamed from: i */
        public void m29157i(long j) {
            this.f16971d = j;
        }

        /* JADX INFO: renamed from: j */
        public void m29158j(boolean z) {
            this.f16969b = z;
        }

        /* JADX INFO: renamed from: k */
        public void m29159k(float f) {
            this.f16973f = f;
        }

        /* JADX INFO: renamed from: l */
        public void m29160l(long j) {
            this.f16970c = j;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountVideoRecordProgressView$d */
    public interface InterfaceC4669d {
        /* JADX INFO: renamed from: a */
        void mo29161a(long j);
    }

    public AccountVideoRecordProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f16949a = 1291845631;
        this.f16950b = -207043;
        this.f16951c = -65536;
        this.f16952d = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f16953e = 0L;
        this.f16954f = 1;
        this.f16955g = null;
        this.f16956h = null;
        this.f16960l = 0;
        this.f16961m = null;
        this.f16962n = null;
        this.f16963o = null;
        this.f16964p = new C4667b();
        m29138j(context, attributeSet, i, 0);
    }

    /* JADX INFO: renamed from: f */
    public final void m29134f(long j) {
        if (NullChecker.m81303a(this.f16958j) && NullChecker.m81303a(this.f16956h)) {
            long jM29153e = 0;
            if (j > 0) {
                this.f16958j.mo29161a(j);
                return;
            }
            for (C4668c c4668c : this.f16956h) {
                if (NullChecker.m81304b(c4668c)) {
                    jM29153e = (long) (jM29153e + c4668c.m29153e());
                }
            }
            this.f16958j.mo29161a(jM29153e);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m29135g() {
        if (NullChecker.m81303a(this.f16956h)) {
            this.f16956h.clear();
            invalidate();
        }
    }

    public int getCount() {
        ArrayList<C4668c> arrayList = this.f16956h;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public long getLastSliceDuration() {
        ArrayList<C4668c> arrayList = this.f16956h;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList<C4668c> arrayList2 = this.f16956h;
            C4668c c4668c = arrayList2.get(arrayList2.size() - 1);
            if (c4668c != null) {
                return c4668c.m29152d();
            }
        }
        return 0L;
    }

    public long getRecordDuration() {
        ArrayList<C4668c> arrayList = this.f16956h;
        if (arrayList == null || arrayList.isEmpty()) {
            return 0L;
        }
        long jM29153e = 0;
        for (C4668c c4668c : this.f16956h) {
            if (c4668c != null && c4668c.m29152d() > 0) {
                jM29153e = (long) (jM29153e + c4668c.m29153e());
            }
        }
        return jM29153e;
    }

    /* JADX INFO: renamed from: h */
    public final void m29136h(Canvas canvas) {
        Canvas canvas2;
        this.f16955g.setColor(this.f16952d);
        this.f16955g.setStyle(Paint.Style.STROKE);
        this.f16955g.setStrokeWidth(this.f16954f);
        int height = getHeight();
        int size = this.f16956h.size();
        int i = 0;
        while (i < size) {
            C4668c c4668c = this.f16956h.get(i);
            if (c4668c == null || c4668c.m29152d() <= 0 || c4668c.m29155g() || i == size - 1) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(c4668c.f16972e, 0.0f, c4668c.f16972e, height, this.f16955g);
            }
            i++;
            canvas = canvas2;
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m29137i(C4668c c4668c) {
        return (int) ((getWidth() * c4668c.m29153e()) / this.f16953e);
    }

    /* JADX INFO: renamed from: j */
    public final void m29138j(Context context, AttributeSet attributeSet, int i, int i2) {
        if (context == null || attributeSet == null) {
            return;
        }
        m29139k(context.getTheme().obtainStyledAttributes(attributeSet, c9c0.f79893M, i, i2));
    }

    /* JADX INFO: renamed from: k */
    public final void m29139k(TypedArray typedArray) {
        if (NullChecker.m81303a(typedArray)) {
            this.f16949a = typedArray.getColor(c9c0.f79896P, this.f16949a);
            this.f16950b = typedArray.getColor(c9c0.f79897Q, this.f16950b);
            this.f16951c = typedArray.getColor(c9c0.f79894N, this.f16951c);
            this.f16952d = typedArray.getColor(c9c0.f79895O, this.f16952d);
            this.f16954f = typedArray.getDimensionPixelOffset(c9c0.f79898R, this.f16954f);
            typedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m29140l() {
        ArrayList<C4668c> arrayList = this.f16956h;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<C4668c> it = this.f16956h.iterator();
            while (it.hasNext()) {
                if (it.next().f16973f != 1.0f) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m29141m(ValueAnimator valueAnimator) {
        this.f16960l = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m29142n(ValueAnimator valueAnimator) {
        this.f16963o.m29157i(SystemClock.uptimeMillis());
        invalidate();
        m29134f(-1L);
    }

    /* JADX INFO: renamed from: o */
    public void m29143o() {
        ArrayList<C4668c> arrayList = this.f16956h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<C4668c> arrayList2 = this.f16956h;
        arrayList2.get(arrayList2.size() - 1).m29156h(true);
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0197  */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        ArrayList<C4668c> arrayList;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        if (this.f16955g == null) {
            this.f16955g = new Paint(1);
        }
        if (this.f16957i == null) {
            this.f16957i = new RectF();
        }
        this.f16955g.setStyle(Paint.Style.FILL);
        RectF rectF = this.f16957i;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = getWidth();
        this.f16957i.bottom = getHeight();
        this.f16955g.setColor(this.f16949a);
        canvas2.drawRoundRect(this.f16957i, getHeight() / 2, getHeight() / 2, this.f16955g);
        if (this.f16953e <= 0 || (arrayList = this.f16956h) == null || arrayList.isEmpty()) {
            if (this.f16959k) {
                RectF rectF2 = this.f16957i;
                rectF2.left = 0.0f;
                rectF2.right = this.f16960l;
                this.f16955g.setColor(this.f16950b);
                canvas2.drawRoundRect(this.f16957i, getHeight() / 2, getHeight() / 2, this.f16955g);
                return;
            }
            return;
        }
        int height = getHeight();
        int i = 0;
        int i2 = 0;
        while (i < this.f16956h.size()) {
            C4668c c4668c = this.f16956h.get(i);
            if (c4668c != null && c4668c.m29152d() > 0) {
                boolean zM29154f = c4668c.m29154f();
                Paint paint = this.f16955g;
                if (zM29154f) {
                    paint.setColor(this.f16951c);
                } else {
                    paint.setColor(this.f16950b);
                }
                int iM29137i = m29137i(c4668c);
                int width = i2 + iM29137i;
                if (width > getWidth()) {
                    width = getWidth();
                }
                int i3 = width;
                float f = i3;
                c4668c.f16972e = f;
                if (i == 0 && i == this.f16956h.size() - 1) {
                    RectF rectF3 = this.f16957i;
                    rectF3.left = i2;
                    rectF3.right = f;
                    float f2 = height / 2;
                    canvas2.drawRoundRect(rectF3, f2, f2, this.f16955g);
                } else if (i == 0) {
                    RectF rectF4 = this.f16957i;
                    rectF4.left = i2;
                    rectF4.right = i2 + height;
                    canvas2.drawArc(rectF4, 90.0f, 180.0f, false, this.f16955g);
                    int i4 = height / 2;
                    if (iM29137i > i4) {
                        canvas.drawRect(i2 + i4, 0.0f, f, height, this.f16955g);
                    }
                } else if (i == this.f16956h.size() - 1 || i3 > getWidth() - (height / 2)) {
                    RectF rectF5 = this.f16957i;
                    rectF5.left = i3 - height;
                    rectF5.right = f;
                    canvas.drawArc(rectF5, -90.0f, 180.0f, false, this.f16955g);
                    int i5 = height / 2;
                    if (iM29137i > i5) {
                        canvas.drawRect(i2, 0.0f, i3 - i5, height, this.f16955g);
                    }
                } else {
                    canvas.drawRect(i2, 0.0f, f, height, this.f16955g);
                }
                i2 = i3;
            }
            i++;
            canvas2 = canvas;
        }
        if (this.f16959k) {
            ArrayList<C4668c> arrayList2 = this.f16956h;
            int i6 = (int) arrayList2.get(arrayList2.size() - 1).f16972e;
            float f3 = i6;
            float f4 = height;
            canvas.drawRect(i2, 0.0f, f3, f4, this.f16955g);
            RectF rectF6 = this.f16957i;
            int i7 = this.f16960l;
            rectF6.left = (i6 + i7) - height;
            rectF6.right = i7 + i6;
            canvas.drawArc(rectF6, -90.0f, 180.0f, false, this.f16955g);
            int i8 = this.f16960l;
            int i9 = height / 2;
            if (i8 > i9) {
                canvas.drawRect(f3, 0.0f, (i6 + i8) - i9, f4, this.f16955g);
            }
        }
        m29136h(canvas);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (isInEditMode()) {
            this.f16953e = Constants.ONE_MIN_IN_MILLIS;
            this.f16956h = new ArrayList<>();
            C4668c c4668c = new C4668c();
            c4668c.m29160l(0L);
            c4668c.m29157i(10000L);
            this.f16956h.add(c4668c);
            C4668c c4668c2 = new C4668c();
            c4668c2.m29160l(0L);
            c4668c2.m29157i(10000L);
            this.f16956h.add(c4668c2);
            C4668c c4668c3 = new C4668c();
            c4668c3.m29160l(0L);
            c4668c3.m29157i(10000L);
            c4668c3.m29156h(true);
            this.f16956h.add(c4668c3);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m29144p() {
        ArrayList<C4668c> arrayList = this.f16956h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<C4668c> arrayList2 = this.f16956h;
        C4668c c4668c = arrayList2.get(arrayList2.size() - 1);
        if (c4668c.m29154f()) {
            c4668c.m29156h(false);
            invalidate();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m29145q() {
        this.f16958j = null;
        if (NullChecker.m81303a(this.f16961m)) {
            if (this.f16961m.isRunning()) {
                this.f16961m.cancel();
            }
            this.f16961m.removeAllUpdateListeners();
            this.f16961m.removeAllListeners();
        }
        if (NullChecker.m81303a(this.f16956h)) {
            this.f16956h.clear();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m29146r() {
        ArrayList<C4668c> arrayList = this.f16956h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<C4668c> arrayList2 = this.f16956h;
        C4668c c4668c = arrayList2.get(arrayList2.size() - 1);
        ArrayList<C4668c> arrayList3 = this.f16956h;
        arrayList3.remove(arrayList3.size() - 1);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m29137i(c4668c), 0);
        this.f16962n = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(200L);
        this.f16962n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.cz
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f83051a.m29141m(valueAnimator);
            }
        });
        this.f16962n.addListener(new C4666a());
        this.f16962n.start();
    }

    /* JADX INFO: renamed from: s */
    public void m29147s(float f) {
        long recordDuration = getRecordDuration();
        if (recordDuration >= this.f16953e) {
            return;
        }
        if (NullChecker.m81303a(this.f16961m) && this.f16961m.isRunning()) {
            return;
        }
        m29144p();
        C4668c c4668c = new C4668c();
        c4668c.m29160l(SystemClock.uptimeMillis());
        c4668c.m29158j(true);
        c4668c.m29159k(f);
        this.f16963o = c4668c;
        if (this.f16956h == null) {
            this.f16956h = new ArrayList<>();
        }
        this.f16956h.add(c4668c);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt((int) recordDuration, (int) this.f16953e);
        this.f16961m = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration((long) ((this.f16953e - recordDuration) / f));
        this.f16961m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.bz
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f77996a.m29142n(valueAnimator);
            }
        });
        this.f16961m.addListener(this.f16964p);
        this.f16961m.start();
    }

    public void setListener(InterfaceC4669d interfaceC4669d) {
        this.f16958j = interfaceC4669d;
    }

    public void setMaxDuration(long j) {
        this.f16953e = j;
    }

    /* JADX INFO: renamed from: t */
    public void m29148t() {
        ArrayList<C4668c> arrayList = this.f16956h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<C4668c> arrayList2 = this.f16956h;
        C4668c c4668c = arrayList2.get(arrayList2.size() - 1);
        if (c4668c.m29155g()) {
            c4668c.m29157i(SystemClock.uptimeMillis());
            c4668c.m29158j(false);
            invalidate();
        }
        if (NullChecker.m81303a(this.f16961m) && this.f16961m.isRunning()) {
            this.f16961m.cancel();
        }
        this.f16963o = null;
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
        this.f16949a = 1291845631;
        this.f16950b = -207043;
        this.f16951c = -65536;
        this.f16952d = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f16953e = 0L;
        this.f16954f = 1;
        this.f16955g = null;
        this.f16956h = null;
        this.f16960l = 0;
        this.f16961m = null;
        this.f16962n = null;
        this.f16963o = null;
        this.f16964p = new C4667b();
        m29138j(context, attributeSet, i, i2);
    }
}
