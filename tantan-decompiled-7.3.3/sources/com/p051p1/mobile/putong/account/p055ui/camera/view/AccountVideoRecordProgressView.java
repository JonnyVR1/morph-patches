package com.p051p1.mobile.putong.account.p055ui.camera.view;

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
import p153l.ihc0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes9.dex */
public class AccountVideoRecordProgressView extends View {

    /* JADX INFO: renamed from: a */
    public int f17668a;

    /* JADX INFO: renamed from: b */
    public int f17669b;

    /* JADX INFO: renamed from: c */
    public int f17670c;

    /* JADX INFO: renamed from: d */
    public int f17671d;

    /* JADX INFO: renamed from: e */
    public long f17672e;

    /* JADX INFO: renamed from: f */
    public int f17673f;

    /* JADX INFO: renamed from: g */
    public Paint f17674g;

    /* JADX INFO: renamed from: h */
    public ArrayList<C4819c> f17675h;

    /* JADX INFO: renamed from: i */
    public RectF f17676i;

    /* JADX INFO: renamed from: j */
    public InterfaceC4820d f17677j;

    /* JADX INFO: renamed from: k */
    public boolean f17678k;

    /* JADX INFO: renamed from: l */
    public int f17679l;

    /* JADX INFO: renamed from: m */
    public ValueAnimator f17680m;

    /* JADX INFO: renamed from: n */
    public ValueAnimator f17681n;

    /* JADX INFO: renamed from: o */
    public C4819c f17682o;

    /* JADX INFO: renamed from: p */
    public Animator.AnimatorListener f17683p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountVideoRecordProgressView$a */
    public class C4817a implements Animator.AnimatorListener {
        public C4817a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AccountVideoRecordProgressView.this.f17678k = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            AccountVideoRecordProgressView.this.f17678k = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountVideoRecordProgressView$b */
    public class C4818b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public boolean f17685a = false;

        public C4818b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f17685a = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f17685a) {
                return;
            }
            AccountVideoRecordProgressView accountVideoRecordProgressView = AccountVideoRecordProgressView.this;
            accountVideoRecordProgressView.m30133f(accountVideoRecordProgressView.f17672e);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f17685a = false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountVideoRecordProgressView$c */
    public class C4819c {

        /* JADX INFO: renamed from: a */
        public boolean f17687a;

        /* JADX INFO: renamed from: b */
        public boolean f17688b;

        /* JADX INFO: renamed from: c */
        public long f17689c;

        /* JADX INFO: renamed from: d */
        public long f17690d;

        /* JADX INFO: renamed from: e */
        public float f17691e;

        /* JADX INFO: renamed from: f */
        public float f17692f;

        public C4819c() {
            this.f17687a = false;
            this.f17688b = false;
            this.f17689c = 0L;
            this.f17690d = 0L;
            this.f17691e = 0.0f;
            this.f17692f = 1.0f;
        }

        /* JADX INFO: renamed from: d */
        public long m30151d() {
            return this.f17690d - this.f17689c;
        }

        /* JADX INFO: renamed from: e */
        public float m30152e() {
            return m30151d() * this.f17692f;
        }

        /* JADX INFO: renamed from: f */
        public boolean m30153f() {
            return this.f17687a;
        }

        /* JADX INFO: renamed from: g */
        public boolean m30154g() {
            return this.f17688b;
        }

        /* JADX INFO: renamed from: h */
        public void m30155h(boolean z) {
            this.f17687a = z;
        }

        /* JADX INFO: renamed from: i */
        public void m30156i(long j) {
            this.f17690d = j;
        }

        /* JADX INFO: renamed from: j */
        public void m30157j(boolean z) {
            this.f17688b = z;
        }

        /* JADX INFO: renamed from: k */
        public void m30158k(float f) {
            this.f17692f = f;
        }

        /* JADX INFO: renamed from: l */
        public void m30159l(long j) {
            this.f17689c = j;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.account.ui.camera.view.AccountVideoRecordProgressView$d */
    public interface InterfaceC4820d {
        void onProgress(long j);
    }

    public AccountVideoRecordProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17668a = 1291845631;
        this.f17669b = -207043;
        this.f17670c = -65536;
        this.f17671d = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f17672e = 0L;
        this.f17673f = 1;
        this.f17674g = null;
        this.f17675h = null;
        this.f17679l = 0;
        this.f17680m = null;
        this.f17681n = null;
        this.f17682o = null;
        this.f17683p = new C4818b();
        m30137j(context, attributeSet, i, 0);
    }

    /* JADX INFO: renamed from: f */
    public final void m30133f(long j) {
        if (NullChecker.m82486a(this.f17677j) && NullChecker.m82486a(this.f17675h)) {
            long jM30152e = 0;
            if (j > 0) {
                this.f17677j.onProgress(j);
                return;
            }
            for (C4819c c4819c : this.f17675h) {
                if (NullChecker.m82487b(c4819c)) {
                    jM30152e = (long) (jM30152e + c4819c.m30152e());
                }
            }
            this.f17677j.onProgress(jM30152e);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m30134g() {
        if (NullChecker.m82486a(this.f17675h)) {
            this.f17675h.clear();
            invalidate();
        }
    }

    public int getCount() {
        ArrayList<C4819c> arrayList = this.f17675h;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public long getLastSliceDuration() {
        ArrayList<C4819c> arrayList = this.f17675h;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList<C4819c> arrayList2 = this.f17675h;
            C4819c c4819c = arrayList2.get(arrayList2.size() - 1);
            if (c4819c != null) {
                return c4819c.m30151d();
            }
        }
        return 0L;
    }

    public long getRecordDuration() {
        ArrayList<C4819c> arrayList = this.f17675h;
        if (arrayList == null || arrayList.isEmpty()) {
            return 0L;
        }
        long jM30152e = 0;
        for (C4819c c4819c : this.f17675h) {
            if (c4819c != null && c4819c.m30151d() > 0) {
                jM30152e = (long) (jM30152e + c4819c.m30152e());
            }
        }
        return jM30152e;
    }

    /* JADX INFO: renamed from: h */
    public final void m30135h(Canvas canvas) {
        Canvas canvas2;
        this.f17674g.setColor(this.f17671d);
        this.f17674g.setStyle(Paint.Style.STROKE);
        this.f17674g.setStrokeWidth(this.f17673f);
        int height = getHeight();
        int size = this.f17675h.size();
        int i = 0;
        while (i < size) {
            C4819c c4819c = this.f17675h.get(i);
            if (c4819c == null || c4819c.m30151d() <= 0 || c4819c.m30154g() || i == size - 1) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(c4819c.f17691e, 0.0f, c4819c.f17691e, height, this.f17674g);
            }
            i++;
            canvas = canvas2;
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m30136i(C4819c c4819c) {
        return (int) ((getWidth() * c4819c.m30152e()) / this.f17672e);
    }

    /* JADX INFO: renamed from: j */
    public final void m30137j(Context context, AttributeSet attributeSet, int i, int i2) {
        if (context == null || attributeSet == null) {
            return;
        }
        m30138k(context.getTheme().obtainStyledAttributes(attributeSet, ihc0.f114898M, i, i2));
    }

    /* JADX INFO: renamed from: k */
    public final void m30138k(TypedArray typedArray) {
        if (NullChecker.m82486a(typedArray)) {
            this.f17668a = typedArray.getColor(ihc0.f114901P, this.f17668a);
            this.f17669b = typedArray.getColor(ihc0.f114902Q, this.f17669b);
            this.f17670c = typedArray.getColor(ihc0.f114899N, this.f17670c);
            this.f17671d = typedArray.getColor(ihc0.f114900O, this.f17671d);
            this.f17673f = typedArray.getDimensionPixelOffset(ihc0.f114903R, this.f17673f);
            typedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m30139l() {
        ArrayList<C4819c> arrayList = this.f17675h;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<C4819c> it = this.f17675h.iterator();
            while (it.hasNext()) {
                if (it.next().f17692f != 1.0f) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m30140m(ValueAnimator valueAnimator) {
        this.f17679l = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m30141n(ValueAnimator valueAnimator) {
        this.f17682o.m30156i(SystemClock.uptimeMillis());
        invalidate();
        m30133f(-1L);
    }

    /* JADX INFO: renamed from: o */
    public void m30142o() {
        ArrayList<C4819c> arrayList = this.f17675h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<C4819c> arrayList2 = this.f17675h;
        arrayList2.get(arrayList2.size() - 1).m30155h(true);
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0197  */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        ArrayList<C4819c> arrayList;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        if (this.f17674g == null) {
            this.f17674g = new Paint(1);
        }
        if (this.f17676i == null) {
            this.f17676i = new RectF();
        }
        this.f17674g.setStyle(Paint.Style.FILL);
        RectF rectF = this.f17676i;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = getWidth();
        this.f17676i.bottom = getHeight();
        this.f17674g.setColor(this.f17668a);
        canvas2.drawRoundRect(this.f17676i, getHeight() / 2, getHeight() / 2, this.f17674g);
        if (this.f17672e <= 0 || (arrayList = this.f17675h) == null || arrayList.isEmpty()) {
            if (this.f17678k) {
                RectF rectF2 = this.f17676i;
                rectF2.left = 0.0f;
                rectF2.right = this.f17679l;
                this.f17674g.setColor(this.f17669b);
                canvas2.drawRoundRect(this.f17676i, getHeight() / 2, getHeight() / 2, this.f17674g);
                return;
            }
            return;
        }
        int height = getHeight();
        int i = 0;
        int i2 = 0;
        while (i < this.f17675h.size()) {
            C4819c c4819c = this.f17675h.get(i);
            if (c4819c != null && c4819c.m30151d() > 0) {
                boolean zM30153f = c4819c.m30153f();
                Paint paint = this.f17674g;
                if (zM30153f) {
                    paint.setColor(this.f17670c);
                } else {
                    paint.setColor(this.f17669b);
                }
                int iM30136i = m30136i(c4819c);
                int width = i2 + iM30136i;
                if (width > getWidth()) {
                    width = getWidth();
                }
                int i3 = width;
                float f = i3;
                c4819c.f17691e = f;
                if (i == 0 && i == this.f17675h.size() - 1) {
                    RectF rectF3 = this.f17676i;
                    rectF3.left = i2;
                    rectF3.right = f;
                    float f2 = height / 2;
                    canvas2.drawRoundRect(rectF3, f2, f2, this.f17674g);
                } else if (i == 0) {
                    RectF rectF4 = this.f17676i;
                    rectF4.left = i2;
                    rectF4.right = i2 + height;
                    canvas2.drawArc(rectF4, 90.0f, 180.0f, false, this.f17674g);
                    int i4 = height / 2;
                    if (iM30136i > i4) {
                        canvas.drawRect(i2 + i4, 0.0f, f, height, this.f17674g);
                    }
                } else if (i == this.f17675h.size() - 1 || i3 > getWidth() - (height / 2)) {
                    RectF rectF5 = this.f17676i;
                    rectF5.left = i3 - height;
                    rectF5.right = f;
                    canvas.drawArc(rectF5, -90.0f, 180.0f, false, this.f17674g);
                    int i5 = height / 2;
                    if (iM30136i > i5) {
                        canvas.drawRect(i2, 0.0f, i3 - i5, height, this.f17674g);
                    }
                } else {
                    canvas.drawRect(i2, 0.0f, f, height, this.f17674g);
                }
                i2 = i3;
            }
            i++;
            canvas2 = canvas;
        }
        if (this.f17678k) {
            ArrayList<C4819c> arrayList2 = this.f17675h;
            int i6 = (int) arrayList2.get(arrayList2.size() - 1).f17691e;
            float f3 = i6;
            float f4 = height;
            canvas.drawRect(i2, 0.0f, f3, f4, this.f17674g);
            RectF rectF6 = this.f17676i;
            int i7 = this.f17679l;
            rectF6.left = (i6 + i7) - height;
            rectF6.right = i7 + i6;
            canvas.drawArc(rectF6, -90.0f, 180.0f, false, this.f17674g);
            int i8 = this.f17679l;
            int i9 = height / 2;
            if (i8 > i9) {
                canvas.drawRect(f3, 0.0f, (i6 + i8) - i9, f4, this.f17674g);
            }
        }
        m30135h(canvas);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (isInEditMode()) {
            this.f17672e = Constants.ONE_MIN_IN_MILLIS;
            this.f17675h = new ArrayList<>();
            C4819c c4819c = new C4819c();
            c4819c.m30159l(0L);
            c4819c.m30156i(10000L);
            this.f17675h.add(c4819c);
            C4819c c4819c2 = new C4819c();
            c4819c2.m30159l(0L);
            c4819c2.m30156i(10000L);
            this.f17675h.add(c4819c2);
            C4819c c4819c3 = new C4819c();
            c4819c3.m30159l(0L);
            c4819c3.m30156i(10000L);
            c4819c3.m30155h(true);
            this.f17675h.add(c4819c3);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m30143p() {
        ArrayList<C4819c> arrayList = this.f17675h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<C4819c> arrayList2 = this.f17675h;
        C4819c c4819c = arrayList2.get(arrayList2.size() - 1);
        if (c4819c.m30153f()) {
            c4819c.m30155h(false);
            invalidate();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m30144q() {
        this.f17677j = null;
        if (NullChecker.m82486a(this.f17680m)) {
            if (this.f17680m.isRunning()) {
                this.f17680m.cancel();
            }
            this.f17680m.removeAllUpdateListeners();
            this.f17680m.removeAllListeners();
        }
        if (NullChecker.m82486a(this.f17675h)) {
            this.f17675h.clear();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m30145r() {
        ArrayList<C4819c> arrayList = this.f17675h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<C4819c> arrayList2 = this.f17675h;
        C4819c c4819c = arrayList2.get(arrayList2.size() - 1);
        ArrayList<C4819c> arrayList3 = this.f17675h;
        arrayList3.remove(arrayList3.size() - 1);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m30136i(c4819c), 0);
        this.f17681n = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(200L);
        this.f17681n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.wy
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f191552a.m30140m(valueAnimator);
            }
        });
        this.f17681n.addListener(new C4817a());
        this.f17681n.start();
    }

    /* JADX INFO: renamed from: s */
    public void m30146s(float f) {
        long recordDuration = getRecordDuration();
        if (recordDuration >= this.f17672e) {
            return;
        }
        if (NullChecker.m82486a(this.f17680m) && this.f17680m.isRunning()) {
            return;
        }
        m30143p();
        C4819c c4819c = new C4819c();
        c4819c.m30159l(SystemClock.uptimeMillis());
        c4819c.m30157j(true);
        c4819c.m30158k(f);
        this.f17682o = c4819c;
        if (this.f17675h == null) {
            this.f17675h = new ArrayList<>();
        }
        this.f17675h.add(c4819c);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt((int) recordDuration, (int) this.f17672e);
        this.f17680m = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration((long) ((this.f17672e - recordDuration) / f));
        this.f17680m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.vy
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f186314a.m30141n(valueAnimator);
            }
        });
        this.f17680m.addListener(this.f17683p);
        this.f17680m.start();
    }

    public void setListener(InterfaceC4820d interfaceC4820d) {
        this.f17677j = interfaceC4820d;
    }

    public void setMaxDuration(long j) {
        this.f17672e = j;
    }

    /* JADX INFO: renamed from: t */
    public void m30147t() {
        ArrayList<C4819c> arrayList = this.f17675h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<C4819c> arrayList2 = this.f17675h;
        C4819c c4819c = arrayList2.get(arrayList2.size() - 1);
        if (c4819c.m30154g()) {
            c4819c.m30156i(SystemClock.uptimeMillis());
            c4819c.m30157j(false);
            invalidate();
        }
        if (NullChecker.m82486a(this.f17680m) && this.f17680m.isRunning()) {
            this.f17680m.cancel();
        }
        this.f17682o = null;
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
        this.f17668a = 1291845631;
        this.f17669b = -207043;
        this.f17670c = -65536;
        this.f17671d = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f17672e = 0L;
        this.f17673f = 1;
        this.f17674g = null;
        this.f17675h = null;
        this.f17679l = 0;
        this.f17680m = null;
        this.f17681n = null;
        this.f17682o = null;
        this.f17683p = new C4818b();
        m30137j(context, attributeSet, i, i2);
    }
}
