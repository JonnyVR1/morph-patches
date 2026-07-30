package com.p046p1.mobile.putong.feed.newui.camera.widget;

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
import p149l.m9c0;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes12.dex */
public class VideoRecordProgressView extends View {

    /* JADX INFO: renamed from: a */
    public int f39818a;

    /* JADX INFO: renamed from: b */
    public int f39819b;

    /* JADX INFO: renamed from: c */
    public int f39820c;

    /* JADX INFO: renamed from: d */
    public int f39821d;

    /* JADX INFO: renamed from: e */
    public long f39822e;

    /* JADX INFO: renamed from: f */
    public int f39823f;

    /* JADX INFO: renamed from: g */
    public Paint f39824g;

    /* JADX INFO: renamed from: h */
    public ArrayList<C11182c> f39825h;

    /* JADX INFO: renamed from: i */
    public RectF f39826i;

    /* JADX INFO: renamed from: j */
    public InterfaceC11183d f39827j;

    /* JADX INFO: renamed from: k */
    public boolean f39828k;

    /* JADX INFO: renamed from: l */
    public int f39829l;

    /* JADX INFO: renamed from: m */
    public ValueAnimator f39830m;

    /* JADX INFO: renamed from: n */
    public ValueAnimator f39831n;

    /* JADX INFO: renamed from: o */
    public C11182c f39832o;

    /* JADX INFO: renamed from: p */
    public Animator.AnimatorListener f39833p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.VideoRecordProgressView$a */
    public class C11180a implements Animator.AnimatorListener {
        public C11180a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VideoRecordProgressView.this.f39828k = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            VideoRecordProgressView.this.f39828k = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.VideoRecordProgressView$b */
    public class C11181b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public boolean f39835a = false;

        public C11181b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f39835a = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f39835a) {
                return;
            }
            VideoRecordProgressView videoRecordProgressView = VideoRecordProgressView.this;
            videoRecordProgressView.m61712f(videoRecordProgressView.f39822e);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f39835a = false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.VideoRecordProgressView$c */
    public class C11182c {

        /* JADX INFO: renamed from: a */
        public boolean f39837a;

        /* JADX INFO: renamed from: b */
        public boolean f39838b;

        /* JADX INFO: renamed from: c */
        public long f39839c;

        /* JADX INFO: renamed from: d */
        public long f39840d;

        /* JADX INFO: renamed from: e */
        public float f39841e;

        /* JADX INFO: renamed from: f */
        public float f39842f;

        public C11182c() {
            this.f39837a = false;
            this.f39838b = false;
            this.f39839c = 0L;
            this.f39840d = 0L;
            this.f39841e = 0.0f;
            this.f39842f = 1.0f;
        }

        /* JADX INFO: renamed from: d */
        public long m61730d() {
            return this.f39840d - this.f39839c;
        }

        /* JADX INFO: renamed from: e */
        public float m61731e() {
            return m61730d() * this.f39842f;
        }

        /* JADX INFO: renamed from: f */
        public boolean m61732f() {
            return this.f39837a;
        }

        /* JADX INFO: renamed from: g */
        public boolean m61733g() {
            return this.f39838b;
        }

        /* JADX INFO: renamed from: h */
        public void m61734h(boolean z) {
            this.f39837a = z;
        }

        /* JADX INFO: renamed from: i */
        public void m61735i(long j) {
            this.f39840d = j;
        }

        /* JADX INFO: renamed from: j */
        public void m61736j(boolean z) {
            this.f39838b = z;
        }

        /* JADX INFO: renamed from: k */
        public void m61737k(float f) {
            this.f39842f = f;
        }

        /* JADX INFO: renamed from: l */
        public void m61738l(long j) {
            this.f39839c = j;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.VideoRecordProgressView$d */
    public interface InterfaceC11183d {
        /* JADX INFO: renamed from: a */
        void mo61739a(long j);
    }

    public VideoRecordProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f39818a = 1291845631;
        this.f39819b = -207043;
        this.f39820c = -65536;
        this.f39821d = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f39822e = 0L;
        this.f39823f = 1;
        this.f39824g = null;
        this.f39825h = null;
        this.f39829l = 0;
        this.f39830m = null;
        this.f39831n = null;
        this.f39832o = null;
        this.f39833p = new C11181b();
        m61716j(context, attributeSet, i, 0);
    }

    /* JADX INFO: renamed from: f */
    public final void m61712f(long j) {
        if (NullChecker.m81303a(this.f39827j) && NullChecker.m81303a(this.f39825h)) {
            long jM61731e = 0;
            if (j > 0) {
                this.f39827j.mo61739a(j);
                return;
            }
            for (C11182c c11182c : this.f39825h) {
                if (NullChecker.m81304b(c11182c)) {
                    jM61731e = (long) (jM61731e + c11182c.m61731e());
                }
            }
            this.f39827j.mo61739a(jM61731e);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m61713g() {
        if (NullChecker.m81303a(this.f39825h)) {
            this.f39825h.clear();
            invalidate();
        }
    }

    public int getCount() {
        ArrayList<C11182c> arrayList = this.f39825h;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public long getLastSliceDuration() {
        ArrayList<C11182c> arrayList = this.f39825h;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList<C11182c> arrayList2 = this.f39825h;
            C11182c c11182c = arrayList2.get(arrayList2.size() - 1);
            if (c11182c != null) {
                return c11182c.m61730d();
            }
        }
        return 0L;
    }

    public long getRecordDuration() {
        ArrayList<C11182c> arrayList = this.f39825h;
        if (arrayList == null || arrayList.isEmpty()) {
            return 0L;
        }
        long jM61731e = 0;
        for (C11182c c11182c : this.f39825h) {
            if (c11182c != null && c11182c.m61730d() > 0) {
                jM61731e = (long) (jM61731e + c11182c.m61731e());
            }
        }
        return jM61731e;
    }

    /* JADX INFO: renamed from: h */
    public final void m61714h(Canvas canvas) {
        Canvas canvas2;
        this.f39824g.setColor(this.f39821d);
        this.f39824g.setStyle(Paint.Style.STROKE);
        this.f39824g.setStrokeWidth(this.f39823f);
        int height = getHeight();
        int size = this.f39825h.size();
        int i = 0;
        while (i < size) {
            C11182c c11182c = this.f39825h.get(i);
            if (c11182c == null || c11182c.m61730d() <= 0 || c11182c.m61733g() || i == size - 1) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(c11182c.f39841e, 0.0f, c11182c.f39841e, height, this.f39824g);
            }
            i++;
            canvas = canvas2;
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m61715i(C11182c c11182c) {
        return (int) ((getWidth() * c11182c.m61731e()) / this.f39822e);
    }

    /* JADX INFO: renamed from: j */
    public final void m61716j(Context context, AttributeSet attributeSet, int i, int i2) {
        if (context == null || attributeSet == null) {
            return;
        }
        m61717k(context.getTheme().obtainStyledAttributes(attributeSet, m9c0.f132763w0, i, i2));
    }

    /* JADX INFO: renamed from: k */
    public final void m61717k(TypedArray typedArray) {
        if (NullChecker.m81303a(typedArray)) {
            this.f39818a = typedArray.getColor(m9c0.f132769z0, this.f39818a);
            this.f39819b = typedArray.getColor(m9c0.f132691A0, this.f39819b);
            this.f39820c = typedArray.getColor(m9c0.f132765x0, this.f39820c);
            this.f39821d = typedArray.getColor(m9c0.f132767y0, this.f39821d);
            this.f39823f = typedArray.getDimensionPixelOffset(m9c0.f132693B0, this.f39823f);
            typedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m61718l() {
        ArrayList<C11182c> arrayList = this.f39825h;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<C11182c> it = this.f39825h.iterator();
            while (it.hasNext()) {
                if (it.next().f39842f != 1.0f) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m61719m(ValueAnimator valueAnimator) {
        this.f39829l = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m61720n(ValueAnimator valueAnimator) {
        this.f39832o.m61735i(SystemClock.uptimeMillis());
        invalidate();
        m61712f(-1L);
    }

    /* JADX INFO: renamed from: o */
    public void m61721o() {
        ArrayList<C11182c> arrayList = this.f39825h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<C11182c> arrayList2 = this.f39825h;
        arrayList2.get(arrayList2.size() - 1).m61734h(true);
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0197  */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        ArrayList<C11182c> arrayList;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        if (this.f39824g == null) {
            this.f39824g = new Paint(1);
        }
        if (this.f39826i == null) {
            this.f39826i = new RectF();
        }
        this.f39824g.setStyle(Paint.Style.FILL);
        RectF rectF = this.f39826i;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = getWidth();
        this.f39826i.bottom = getHeight();
        this.f39824g.setColor(this.f39818a);
        canvas2.drawRoundRect(this.f39826i, getHeight() / 2, getHeight() / 2, this.f39824g);
        if (this.f39822e <= 0 || (arrayList = this.f39825h) == null || arrayList.isEmpty()) {
            if (this.f39828k) {
                RectF rectF2 = this.f39826i;
                rectF2.left = 0.0f;
                rectF2.right = this.f39829l;
                this.f39824g.setColor(this.f39819b);
                canvas2.drawRoundRect(this.f39826i, getHeight() / 2, getHeight() / 2, this.f39824g);
                return;
            }
            return;
        }
        int height = getHeight();
        int i = 0;
        int i2 = 0;
        while (i < this.f39825h.size()) {
            C11182c c11182c = this.f39825h.get(i);
            if (c11182c != null && c11182c.m61730d() > 0) {
                boolean zM61732f = c11182c.m61732f();
                Paint paint = this.f39824g;
                if (zM61732f) {
                    paint.setColor(this.f39820c);
                } else {
                    paint.setColor(this.f39819b);
                }
                int iM61715i = m61715i(c11182c);
                int width = i2 + iM61715i;
                if (width > getWidth()) {
                    width = getWidth();
                }
                int i3 = width;
                float f = i3;
                c11182c.f39841e = f;
                if (i == 0 && i == this.f39825h.size() - 1) {
                    RectF rectF3 = this.f39826i;
                    rectF3.left = i2;
                    rectF3.right = f;
                    float f2 = height / 2;
                    canvas2.drawRoundRect(rectF3, f2, f2, this.f39824g);
                } else if (i == 0) {
                    RectF rectF4 = this.f39826i;
                    rectF4.left = i2;
                    rectF4.right = i2 + height;
                    canvas2.drawArc(rectF4, 90.0f, 180.0f, false, this.f39824g);
                    int i4 = height / 2;
                    if (iM61715i > i4) {
                        canvas.drawRect(i2 + i4, 0.0f, f, height, this.f39824g);
                    }
                } else if (i == this.f39825h.size() - 1 || i3 > getWidth() - (height / 2)) {
                    RectF rectF5 = this.f39826i;
                    rectF5.left = i3 - height;
                    rectF5.right = f;
                    canvas.drawArc(rectF5, -90.0f, 180.0f, false, this.f39824g);
                    int i5 = height / 2;
                    if (iM61715i > i5) {
                        canvas.drawRect(i2, 0.0f, i3 - i5, height, this.f39824g);
                    }
                } else {
                    canvas.drawRect(i2, 0.0f, f, height, this.f39824g);
                }
                i2 = i3;
            }
            i++;
            canvas2 = canvas;
        }
        if (this.f39828k) {
            ArrayList<C11182c> arrayList2 = this.f39825h;
            int i6 = (int) arrayList2.get(arrayList2.size() - 1).f39841e;
            float f3 = i6;
            float f4 = height;
            canvas.drawRect(i2, 0.0f, f3, f4, this.f39824g);
            RectF rectF6 = this.f39826i;
            int i7 = this.f39829l;
            rectF6.left = (i6 + i7) - height;
            rectF6.right = i7 + i6;
            canvas.drawArc(rectF6, -90.0f, 180.0f, false, this.f39824g);
            int i8 = this.f39829l;
            int i9 = height / 2;
            if (i8 > i9) {
                canvas.drawRect(f3, 0.0f, (i6 + i8) - i9, f4, this.f39824g);
            }
        }
        m61714h(canvas);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (isInEditMode()) {
            this.f39822e = Constants.ONE_MIN_IN_MILLIS;
            this.f39825h = new ArrayList<>();
            C11182c c11182c = new C11182c();
            c11182c.m61738l(0L);
            c11182c.m61735i(10000L);
            this.f39825h.add(c11182c);
            C11182c c11182c2 = new C11182c();
            c11182c2.m61738l(0L);
            c11182c2.m61735i(10000L);
            this.f39825h.add(c11182c2);
            C11182c c11182c3 = new C11182c();
            c11182c3.m61738l(0L);
            c11182c3.m61735i(10000L);
            c11182c3.m61734h(true);
            this.f39825h.add(c11182c3);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m61722p() {
        ArrayList<C11182c> arrayList = this.f39825h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<C11182c> arrayList2 = this.f39825h;
        C11182c c11182c = arrayList2.get(arrayList2.size() - 1);
        if (c11182c.m61732f()) {
            c11182c.m61734h(false);
            invalidate();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m61723q() {
        this.f39827j = null;
        if (NullChecker.m81303a(this.f39830m)) {
            if (this.f39830m.isRunning()) {
                this.f39830m.cancel();
            }
            this.f39830m.removeAllUpdateListeners();
            this.f39830m.removeAllListeners();
        }
        if (NullChecker.m81303a(this.f39825h)) {
            this.f39825h.clear();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m61724r() {
        ArrayList<C11182c> arrayList = this.f39825h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<C11182c> arrayList2 = this.f39825h;
        C11182c c11182c = arrayList2.get(arrayList2.size() - 1);
        ArrayList<C11182c> arrayList3 = this.f39825h;
        arrayList3.remove(arrayList3.size() - 1);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m61715i(c11182c), 0);
        this.f39831n = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(200L);
        this.f39831n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.v7l0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f180396a.m61719m(valueAnimator);
            }
        });
        this.f39831n.addListener(new C11180a());
        this.f39831n.start();
    }

    /* JADX INFO: renamed from: s */
    public void m61725s(float f) {
        long recordDuration = getRecordDuration();
        if (recordDuration >= this.f39822e) {
            return;
        }
        if (NullChecker.m81303a(this.f39830m) && this.f39830m.isRunning()) {
            return;
        }
        m61722p();
        C11182c c11182c = new C11182c();
        c11182c.m61738l(SystemClock.uptimeMillis());
        c11182c.m61736j(true);
        c11182c.m61737k(f);
        this.f39832o = c11182c;
        if (this.f39825h == null) {
            this.f39825h = new ArrayList<>();
        }
        this.f39825h.add(c11182c);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt((int) recordDuration, (int) this.f39822e);
        this.f39830m = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration((long) ((this.f39822e - recordDuration) / f));
        this.f39830m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.u7l0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f175023a.m61720n(valueAnimator);
            }
        });
        this.f39830m.addListener(this.f39833p);
        this.f39830m.start();
    }

    public void setListener(InterfaceC11183d interfaceC11183d) {
        this.f39827j = interfaceC11183d;
    }

    public void setMaxDuration(long j) {
        this.f39822e = j;
    }

    /* JADX INFO: renamed from: t */
    public void m61726t() {
        ArrayList<C11182c> arrayList = this.f39825h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<C11182c> arrayList2 = this.f39825h;
        C11182c c11182c = arrayList2.get(arrayList2.size() - 1);
        if (c11182c.m61733g()) {
            c11182c.m61735i(SystemClock.uptimeMillis());
            c11182c.m61736j(false);
            invalidate();
        }
        if (NullChecker.m81303a(this.f39830m) && this.f39830m.isRunning()) {
            this.f39830m.cancel();
        }
        this.f39832o = null;
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
        this.f39818a = 1291845631;
        this.f39819b = -207043;
        this.f39820c = -65536;
        this.f39821d = RoundedDrawable.DEFAULT_BORDER_COLOR;
        this.f39822e = 0L;
        this.f39823f = 1;
        this.f39824g = null;
        this.f39825h = null;
        this.f39829l = 0;
        this.f39830m = null;
        this.f39831n = null;
        this.f39832o = null;
        this.f39833p = new C11181b();
        m61716j(context, attributeSet, i, i2);
    }
}
