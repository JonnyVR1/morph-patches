package com.p051p1.mobile.putong.feed.newui.camera.widget;

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
import p153l.shc0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes13.dex */
public class VideoRecordProgressView extends View {

    /* JADX INFO: renamed from: a */
    public int f40666a;

    /* JADX INFO: renamed from: b */
    public int f40667b;

    /* JADX INFO: renamed from: c */
    public int f40668c;

    /* JADX INFO: renamed from: d */
    public int f40669d;

    /* JADX INFO: renamed from: e */
    public long f40670e;

    /* JADX INFO: renamed from: f */
    public int f40671f;

    /* JADX INFO: renamed from: g */
    public Paint f40672g;

    /* JADX INFO: renamed from: h */
    public ArrayList<C11345c> f40673h;

    /* JADX INFO: renamed from: i */
    public RectF f40674i;

    /* JADX INFO: renamed from: j */
    public InterfaceC11346d f40675j;

    /* JADX INFO: renamed from: k */
    public boolean f40676k;

    /* JADX INFO: renamed from: l */
    public int f40677l;

    /* JADX INFO: renamed from: m */
    public ValueAnimator f40678m;

    /* JADX INFO: renamed from: n */
    public ValueAnimator f40679n;

    /* JADX INFO: renamed from: o */
    public C11345c f40680o;

    /* JADX INFO: renamed from: p */
    public Animator.AnimatorListener f40681p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.VideoRecordProgressView$a */
    public class C11343a implements Animator.AnimatorListener {
        public C11343a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VideoRecordProgressView.this.f40676k = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            VideoRecordProgressView.this.f40676k = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.VideoRecordProgressView$b */
    public class C11344b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public boolean f40683a = false;

        public C11344b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f40683a = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f40683a) {
                return;
            }
            VideoRecordProgressView videoRecordProgressView = VideoRecordProgressView.this;
            videoRecordProgressView.m62896f(videoRecordProgressView.f40670e);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f40683a = false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.VideoRecordProgressView$c */
    public class C11345c {

        /* JADX INFO: renamed from: a */
        public boolean f40685a;

        /* JADX INFO: renamed from: b */
        public boolean f40686b;

        /* JADX INFO: renamed from: c */
        public long f40687c;

        /* JADX INFO: renamed from: d */
        public long f40688d;

        /* JADX INFO: renamed from: e */
        public float f40689e;

        /* JADX INFO: renamed from: f */
        public float f40690f;

        public C11345c() {
            this.f40685a = false;
            this.f40686b = false;
            this.f40687c = 0L;
            this.f40688d = 0L;
            this.f40689e = 0.0f;
            this.f40690f = 1.0f;
        }

        /* JADX INFO: renamed from: d */
        public long m62914d() {
            return this.f40688d - this.f40687c;
        }

        /* JADX INFO: renamed from: e */
        public float m62915e() {
            return m62914d() * this.f40690f;
        }

        /* JADX INFO: renamed from: f */
        public boolean m62916f() {
            return this.f40685a;
        }

        /* JADX INFO: renamed from: g */
        public boolean m62917g() {
            return this.f40686b;
        }

        /* JADX INFO: renamed from: h */
        public void m62918h(boolean z) {
            this.f40685a = z;
        }

        /* JADX INFO: renamed from: i */
        public void m62919i(long j) {
            this.f40688d = j;
        }

        /* JADX INFO: renamed from: j */
        public void m62920j(boolean z) {
            this.f40686b = z;
        }

        /* JADX INFO: renamed from: k */
        public void m62921k(float f) {
            this.f40690f = f;
        }

        /* JADX INFO: renamed from: l */
        public void m62922l(long j) {
            this.f40687c = j;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.VideoRecordProgressView$d */
    public interface InterfaceC11346d {
        void onProgress(long j);
    }

    public VideoRecordProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f40666a = 1291845631;
        this.f40667b = -207043;
        this.f40668c = -65536;
        this.f40669d = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f40670e = 0L;
        this.f40671f = 1;
        this.f40672g = null;
        this.f40673h = null;
        this.f40677l = 0;
        this.f40678m = null;
        this.f40679n = null;
        this.f40680o = null;
        this.f40681p = new C11344b();
        m62900j(context, attributeSet, i, 0);
    }

    /* JADX INFO: renamed from: f */
    public final void m62896f(long j) {
        if (NullChecker.m82486a(this.f40675j) && NullChecker.m82486a(this.f40673h)) {
            long jM62915e = 0;
            if (j > 0) {
                this.f40675j.onProgress(j);
                return;
            }
            for (C11345c c11345c : this.f40673h) {
                if (NullChecker.m82487b(c11345c)) {
                    jM62915e = (long) (jM62915e + c11345c.m62915e());
                }
            }
            this.f40675j.onProgress(jM62915e);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m62897g() {
        if (NullChecker.m82486a(this.f40673h)) {
            this.f40673h.clear();
            invalidate();
        }
    }

    public int getCount() {
        ArrayList<C11345c> arrayList = this.f40673h;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public long getLastSliceDuration() {
        ArrayList<C11345c> arrayList = this.f40673h;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList<C11345c> arrayList2 = this.f40673h;
            C11345c c11345c = arrayList2.get(arrayList2.size() - 1);
            if (c11345c != null) {
                return c11345c.m62914d();
            }
        }
        return 0L;
    }

    public long getRecordDuration() {
        ArrayList<C11345c> arrayList = this.f40673h;
        if (arrayList == null || arrayList.isEmpty()) {
            return 0L;
        }
        long jM62915e = 0;
        for (C11345c c11345c : this.f40673h) {
            if (c11345c != null && c11345c.m62914d() > 0) {
                jM62915e = (long) (jM62915e + c11345c.m62915e());
            }
        }
        return jM62915e;
    }

    /* JADX INFO: renamed from: h */
    public final void m62898h(Canvas canvas) {
        Canvas canvas2;
        this.f40672g.setColor(this.f40669d);
        this.f40672g.setStyle(Paint.Style.STROKE);
        this.f40672g.setStrokeWidth(this.f40671f);
        int height = getHeight();
        int size = this.f40673h.size();
        int i = 0;
        while (i < size) {
            C11345c c11345c = this.f40673h.get(i);
            if (c11345c == null || c11345c.m62914d() <= 0 || c11345c.m62917g() || i == size - 1) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(c11345c.f40689e, 0.0f, c11345c.f40689e, height, this.f40672g);
            }
            i++;
            canvas = canvas2;
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m62899i(C11345c c11345c) {
        return (int) ((getWidth() * c11345c.m62915e()) / this.f40670e);
    }

    /* JADX INFO: renamed from: j */
    public final void m62900j(Context context, AttributeSet attributeSet, int i, int i2) {
        if (context == null || attributeSet == null) {
            return;
        }
        m62901k(context.getTheme().obtainStyledAttributes(attributeSet, shc0.f168685w0, i, i2));
    }

    /* JADX INFO: renamed from: k */
    public final void m62901k(TypedArray typedArray) {
        if (NullChecker.m82486a(typedArray)) {
            this.f40666a = typedArray.getColor(shc0.f168691z0, this.f40666a);
            this.f40667b = typedArray.getColor(shc0.f168613A0, this.f40667b);
            this.f40668c = typedArray.getColor(shc0.f168687x0, this.f40668c);
            this.f40669d = typedArray.getColor(shc0.f168689y0, this.f40669d);
            this.f40671f = typedArray.getDimensionPixelOffset(shc0.f168615B0, this.f40671f);
            typedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m62902l() {
        ArrayList<C11345c> arrayList = this.f40673h;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<C11345c> it = this.f40673h.iterator();
            while (it.hasNext()) {
                if (it.next().f40690f != 1.0f) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m62903m(ValueAnimator valueAnimator) {
        this.f40677l = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m62904n(ValueAnimator valueAnimator) {
        this.f40680o.m62919i(SystemClock.uptimeMillis());
        invalidate();
        m62896f(-1L);
    }

    /* JADX INFO: renamed from: o */
    public void m62905o() {
        ArrayList<C11345c> arrayList = this.f40673h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<C11345c> arrayList2 = this.f40673h;
        arrayList2.get(arrayList2.size() - 1).m62918h(true);
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0197  */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        ArrayList<C11345c> arrayList;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        if (this.f40672g == null) {
            this.f40672g = new Paint(1);
        }
        if (this.f40674i == null) {
            this.f40674i = new RectF();
        }
        this.f40672g.setStyle(Paint.Style.FILL);
        RectF rectF = this.f40674i;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = getWidth();
        this.f40674i.bottom = getHeight();
        this.f40672g.setColor(this.f40666a);
        canvas2.drawRoundRect(this.f40674i, getHeight() / 2, getHeight() / 2, this.f40672g);
        if (this.f40670e <= 0 || (arrayList = this.f40673h) == null || arrayList.isEmpty()) {
            if (this.f40676k) {
                RectF rectF2 = this.f40674i;
                rectF2.left = 0.0f;
                rectF2.right = this.f40677l;
                this.f40672g.setColor(this.f40667b);
                canvas2.drawRoundRect(this.f40674i, getHeight() / 2, getHeight() / 2, this.f40672g);
                return;
            }
            return;
        }
        int height = getHeight();
        int i = 0;
        int i2 = 0;
        while (i < this.f40673h.size()) {
            C11345c c11345c = this.f40673h.get(i);
            if (c11345c != null && c11345c.m62914d() > 0) {
                boolean zM62916f = c11345c.m62916f();
                Paint paint = this.f40672g;
                if (zM62916f) {
                    paint.setColor(this.f40668c);
                } else {
                    paint.setColor(this.f40667b);
                }
                int iM62899i = m62899i(c11345c);
                int width = i2 + iM62899i;
                if (width > getWidth()) {
                    width = getWidth();
                }
                int i3 = width;
                float f = i3;
                c11345c.f40689e = f;
                if (i == 0 && i == this.f40673h.size() - 1) {
                    RectF rectF3 = this.f40674i;
                    rectF3.left = i2;
                    rectF3.right = f;
                    float f2 = height / 2;
                    canvas2.drawRoundRect(rectF3, f2, f2, this.f40672g);
                } else if (i == 0) {
                    RectF rectF4 = this.f40674i;
                    rectF4.left = i2;
                    rectF4.right = i2 + height;
                    canvas2.drawArc(rectF4, 90.0f, 180.0f, false, this.f40672g);
                    int i4 = height / 2;
                    if (iM62899i > i4) {
                        canvas.drawRect(i2 + i4, 0.0f, f, height, this.f40672g);
                    }
                } else if (i == this.f40673h.size() - 1 || i3 > getWidth() - (height / 2)) {
                    RectF rectF5 = this.f40674i;
                    rectF5.left = i3 - height;
                    rectF5.right = f;
                    canvas.drawArc(rectF5, -90.0f, 180.0f, false, this.f40672g);
                    int i5 = height / 2;
                    if (iM62899i > i5) {
                        canvas.drawRect(i2, 0.0f, i3 - i5, height, this.f40672g);
                    }
                } else {
                    canvas.drawRect(i2, 0.0f, f, height, this.f40672g);
                }
                i2 = i3;
            }
            i++;
            canvas2 = canvas;
        }
        if (this.f40676k) {
            ArrayList<C11345c> arrayList2 = this.f40673h;
            int i6 = (int) arrayList2.get(arrayList2.size() - 1).f40689e;
            float f3 = i6;
            float f4 = height;
            canvas.drawRect(i2, 0.0f, f3, f4, this.f40672g);
            RectF rectF6 = this.f40674i;
            int i7 = this.f40677l;
            rectF6.left = (i6 + i7) - height;
            rectF6.right = i7 + i6;
            canvas.drawArc(rectF6, -90.0f, 180.0f, false, this.f40672g);
            int i8 = this.f40677l;
            int i9 = height / 2;
            if (i8 > i9) {
                canvas.drawRect(f3, 0.0f, (i6 + i8) - i9, f4, this.f40672g);
            }
        }
        m62898h(canvas);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (isInEditMode()) {
            this.f40670e = Constants.ONE_MIN_IN_MILLIS;
            this.f40673h = new ArrayList<>();
            C11345c c11345c = new C11345c();
            c11345c.m62922l(0L);
            c11345c.m62919i(10000L);
            this.f40673h.add(c11345c);
            C11345c c11345c2 = new C11345c();
            c11345c2.m62922l(0L);
            c11345c2.m62919i(10000L);
            this.f40673h.add(c11345c2);
            C11345c c11345c3 = new C11345c();
            c11345c3.m62922l(0L);
            c11345c3.m62919i(10000L);
            c11345c3.m62918h(true);
            this.f40673h.add(c11345c3);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m62906p() {
        ArrayList<C11345c> arrayList = this.f40673h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<C11345c> arrayList2 = this.f40673h;
        C11345c c11345c = arrayList2.get(arrayList2.size() - 1);
        if (c11345c.m62916f()) {
            c11345c.m62918h(false);
            invalidate();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m62907q() {
        this.f40675j = null;
        if (NullChecker.m82486a(this.f40678m)) {
            if (this.f40678m.isRunning()) {
                this.f40678m.cancel();
            }
            this.f40678m.removeAllUpdateListeners();
            this.f40678m.removeAllListeners();
        }
        if (NullChecker.m82486a(this.f40673h)) {
            this.f40673h.clear();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m62908r() {
        ArrayList<C11345c> arrayList = this.f40673h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<C11345c> arrayList2 = this.f40673h;
        C11345c c11345c = arrayList2.get(arrayList2.size() - 1);
        ArrayList<C11345c> arrayList3 = this.f40673h;
        arrayList3.remove(arrayList3.size() - 1);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m62899i(c11345c), 0);
        this.f40679n = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(200L);
        this.f40679n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.zgl0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f204321a.m62903m(valueAnimator);
            }
        });
        this.f40679n.addListener(new C11343a());
        this.f40679n.start();
    }

    /* JADX INFO: renamed from: s */
    public void m62909s(float f) {
        long recordDuration = getRecordDuration();
        if (recordDuration >= this.f40670e) {
            return;
        }
        if (NullChecker.m82486a(this.f40678m) && this.f40678m.isRunning()) {
            return;
        }
        m62906p();
        C11345c c11345c = new C11345c();
        c11345c.m62922l(SystemClock.uptimeMillis());
        c11345c.m62920j(true);
        c11345c.m62921k(f);
        this.f40680o = c11345c;
        if (this.f40673h == null) {
            this.f40673h = new ArrayList<>();
        }
        this.f40673h.add(c11345c);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt((int) recordDuration, (int) this.f40670e);
        this.f40678m = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration((long) ((this.f40670e - recordDuration) / f));
        this.f40678m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.ygl0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f199845a.m62904n(valueAnimator);
            }
        });
        this.f40678m.addListener(this.f40681p);
        this.f40678m.start();
    }

    public void setListener(InterfaceC11346d interfaceC11346d) {
        this.f40675j = interfaceC11346d;
    }

    public void setMaxDuration(long j) {
        this.f40670e = j;
    }

    /* JADX INFO: renamed from: t */
    public void m62910t() {
        ArrayList<C11345c> arrayList = this.f40673h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<C11345c> arrayList2 = this.f40673h;
        C11345c c11345c = arrayList2.get(arrayList2.size() - 1);
        if (c11345c.m62917g()) {
            c11345c.m62919i(SystemClock.uptimeMillis());
            c11345c.m62920j(false);
            invalidate();
        }
        if (NullChecker.m82486a(this.f40678m) && this.f40678m.isRunning()) {
            this.f40678m.cancel();
        }
        this.f40680o = null;
    }

    public VideoRecordProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public VideoRecordProgressView(Context context) {
        this(context, null);
    }

    @TargetApi(21)
    public VideoRecordProgressView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f40666a = 1291845631;
        this.f40667b = -207043;
        this.f40668c = -65536;
        this.f40669d = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f40670e = 0L;
        this.f40671f = 1;
        this.f40672g = null;
        this.f40673h = null;
        this.f40677l = 0;
        this.f40678m = null;
        this.f40679n = null;
        this.f40680o = null;
        this.f40681p = new C11344b();
        m62900j(context, attributeSet, i, i2);
    }
}
