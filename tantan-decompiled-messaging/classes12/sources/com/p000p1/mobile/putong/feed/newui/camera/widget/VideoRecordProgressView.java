package com.p000p1.mobile.putong.feed.newui.camera.widget;

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
import p007l.m9c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class VideoRecordProgressView extends View {

    /* JADX INFO: renamed from: a */
    public int f1279a;

    /* JADX INFO: renamed from: b */
    public int f1280b;

    /* JADX INFO: renamed from: c */
    public int f1281c;

    /* JADX INFO: renamed from: d */
    public int f1282d;

    /* JADX INFO: renamed from: e */
    public long f1283e;

    /* JADX INFO: renamed from: f */
    public int f1284f;

    /* JADX INFO: renamed from: g */
    public Paint f1285g;

    /* JADX INFO: renamed from: h */
    public ArrayList<C2026c> f1286h;

    /* JADX INFO: renamed from: i */
    public RectF f1287i;

    /* JADX INFO: renamed from: j */
    public InterfaceC2027d f1288j;

    /* JADX INFO: renamed from: k */
    public boolean f1289k;

    /* JADX INFO: renamed from: l */
    public int f1290l;

    /* JADX INFO: renamed from: m */
    public ValueAnimator f1291m;

    /* JADX INFO: renamed from: n */
    public ValueAnimator f1292n;

    /* JADX INFO: renamed from: o */
    public C2026c f1293o;

    /* JADX INFO: renamed from: p */
    public Animator.AnimatorListener f1294p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.VideoRecordProgressView$a */
    public class C2024a implements Animator.AnimatorListener {
        public C2024a() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            VideoRecordProgressView.this.f1289k = false;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            VideoRecordProgressView.this.f1289k = true;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.VideoRecordProgressView$b */
    public class C2025b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a */
        public boolean f1296a = false;

        public C2025b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f1296a = true;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f1296a) {
                return;
            }
            VideoRecordProgressView videoRecordProgressView = VideoRecordProgressView.this;
            videoRecordProgressView.m2664f(videoRecordProgressView.f1283e);
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f1296a = false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.VideoRecordProgressView$c */
    public class C2026c {

        /* JADX INFO: renamed from: a */
        public boolean f1298a;

        /* JADX INFO: renamed from: b */
        public boolean f1299b;

        /* JADX INFO: renamed from: c */
        public long f1300c;

        /* JADX INFO: renamed from: d */
        public long f1301d;

        /* JADX INFO: renamed from: e */
        public float f1302e;

        /* JADX INFO: renamed from: f */
        public float f1303f;

        public C2026c() {
            this.f1298a = false;
            this.f1299b = false;
            this.f1300c = 0L;
            this.f1301d = 0L;
            this.f1302e = 0.0f;
            this.f1303f = 1.0f;
        }

        /* JADX INFO: renamed from: d */
        public long m2682d() {
            return this.f1301d - this.f1300c;
        }

        /* JADX INFO: renamed from: e */
        public float m2683e() {
            return m2682d() * this.f1303f;
        }

        /* JADX INFO: renamed from: f */
        public boolean m2684f() {
            return this.f1298a;
        }

        /* JADX INFO: renamed from: g */
        public boolean m2685g() {
            return this.f1299b;
        }

        /* JADX INFO: renamed from: h */
        public void m2686h(boolean z) {
            this.f1298a = z;
        }

        /* JADX INFO: renamed from: i */
        public void m2687i(long j) {
            this.f1301d = j;
        }

        /* JADX INFO: renamed from: j */
        public void m2688j(boolean z) {
            this.f1299b = z;
        }

        /* JADX INFO: renamed from: k */
        public void m2689k(float f) {
            this.f1303f = f;
        }

        /* JADX INFO: renamed from: l */
        public void m2690l(long j) {
            this.f1300c = j;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.feed.newui.camera.widget.VideoRecordProgressView$d */
    public interface InterfaceC2027d {
        /* JADX INFO: renamed from: a */
        void mo2691a(long j);
    }

    public VideoRecordProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1279a = 1291845631;
        this.f1280b = -207043;
        this.f1281c = -65536;
        this.f1282d = -16777216;
        this.f1283e = 0L;
        this.f1284f = 1;
        this.f1285g = null;
        this.f1286h = null;
        this.f1290l = 0;
        this.f1291m = null;
        this.f1292n = null;
        this.f1293o = null;
        this.f1294p = new C2025b();
        m2668j(context, attributeSet, i, 0);
    }

    /* JADX INFO: renamed from: f */
    public final void m2664f(long j) {
        if (NullChecker.a(this.f1288j) && NullChecker.a(this.f1286h)) {
            long jM2683e = 0;
            if (j > 0) {
                this.f1288j.mo2691a(j);
                return;
            }
            for (C2026c c2026c : this.f1286h) {
                if (NullChecker.b(c2026c)) {
                    jM2683e = (long) (jM2683e + c2026c.m2683e());
                }
            }
            this.f1288j.mo2691a(jM2683e);
        }
    }

    /* JADX INFO: renamed from: g */
    public void m2665g() {
        if (NullChecker.a(this.f1286h)) {
            this.f1286h.clear();
            invalidate();
        }
    }

    public int getCount() {
        ArrayList<C2026c> arrayList = this.f1286h;
        if (arrayList != null) {
            return arrayList.size();
        }
        return 0;
    }

    public long getLastSliceDuration() {
        ArrayList<C2026c> arrayList = this.f1286h;
        if (arrayList != null && !arrayList.isEmpty()) {
            ArrayList<C2026c> arrayList2 = this.f1286h;
            C2026c c2026c = arrayList2.get(arrayList2.size() - 1);
            if (c2026c != null) {
                return c2026c.m2682d();
            }
        }
        return 0L;
    }

    public long getRecordDuration() {
        ArrayList<C2026c> arrayList = this.f1286h;
        if (arrayList == null || arrayList.isEmpty()) {
            return 0L;
        }
        long jM2683e = 0;
        for (C2026c c2026c : this.f1286h) {
            if (c2026c != null && c2026c.m2682d() > 0) {
                jM2683e = (long) (jM2683e + c2026c.m2683e());
            }
        }
        return jM2683e;
    }

    /* JADX INFO: renamed from: h */
    public final void m2666h(Canvas canvas) {
        Canvas canvas2;
        this.f1285g.setColor(this.f1282d);
        this.f1285g.setStyle(Paint.Style.STROKE);
        this.f1285g.setStrokeWidth(this.f1284f);
        int height = getHeight();
        int size = this.f1286h.size();
        int i = 0;
        while (i < size) {
            C2026c c2026c = this.f1286h.get(i);
            if (c2026c == null || c2026c.m2682d() <= 0 || c2026c.m2685g() || i == size - 1) {
                canvas2 = canvas;
            } else {
                canvas2 = canvas;
                canvas2.drawLine(c2026c.f1302e, 0.0f, c2026c.f1302e, height, this.f1285g);
            }
            i++;
            canvas = canvas2;
        }
    }

    /* JADX INFO: renamed from: i */
    public final int m2667i(C2026c c2026c) {
        return (int) ((getWidth() * c2026c.m2683e()) / this.f1283e);
    }

    /* JADX INFO: renamed from: j */
    public final void m2668j(Context context, AttributeSet attributeSet, int i, int i2) {
        if (context == null || attributeSet == null) {
            return;
        }
        m2669k(context.getTheme().obtainStyledAttributes(attributeSet, m9c0.f10354w0, i, i2));
    }

    /* JADX INFO: renamed from: k */
    public final void m2669k(TypedArray typedArray) {
        if (NullChecker.a(typedArray)) {
            this.f1279a = typedArray.getColor(m9c0.f10360z0, this.f1279a);
            this.f1280b = typedArray.getColor(m9c0.f10282A0, this.f1280b);
            this.f1281c = typedArray.getColor(m9c0.f10356x0, this.f1281c);
            this.f1282d = typedArray.getColor(m9c0.f10358y0, this.f1282d);
            this.f1284f = typedArray.getDimensionPixelOffset(m9c0.f10284B0, this.f1284f);
            typedArray.recycle();
        }
    }

    /* JADX INFO: renamed from: l */
    public boolean m2670l() {
        ArrayList<C2026c> arrayList = this.f1286h;
        if (arrayList != null && !arrayList.isEmpty()) {
            Iterator<C2026c> it = this.f1286h.iterator();
            while (it.hasNext()) {
                if (it.next().f1303f != 1.0f) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m2671m(ValueAnimator valueAnimator) {
        this.f1290l = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m2672n(ValueAnimator valueAnimator) {
        this.f1293o.m2687i(SystemClock.uptimeMillis());
        invalidate();
        m2664f(-1L);
    }

    /* JADX INFO: renamed from: o */
    public void m2673o() {
        ArrayList<C2026c> arrayList = this.f1286h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<C2026c> arrayList2 = this.f1286h;
        arrayList2.get(arrayList2.size() - 1).m2686h(true);
        invalidate();
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0197  */
    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        ArrayList<C2026c> arrayList;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        if (this.f1285g == null) {
            this.f1285g = new Paint(1);
        }
        if (this.f1287i == null) {
            this.f1287i = new RectF();
        }
        this.f1285g.setStyle(Paint.Style.FILL);
        RectF rectF = this.f1287i;
        rectF.left = 0.0f;
        rectF.top = 0.0f;
        rectF.right = getWidth();
        this.f1287i.bottom = getHeight();
        this.f1285g.setColor(this.f1279a);
        canvas2.drawRoundRect(this.f1287i, getHeight() / 2, getHeight() / 2, this.f1285g);
        if (this.f1283e <= 0 || (arrayList = this.f1286h) == null || arrayList.isEmpty()) {
            if (this.f1289k) {
                RectF rectF2 = this.f1287i;
                rectF2.left = 0.0f;
                rectF2.right = this.f1290l;
                this.f1285g.setColor(this.f1280b);
                canvas2.drawRoundRect(this.f1287i, getHeight() / 2, getHeight() / 2, this.f1285g);
                return;
            }
            return;
        }
        int height = getHeight();
        int i = 0;
        int i2 = 0;
        while (i < this.f1286h.size()) {
            C2026c c2026c = this.f1286h.get(i);
            if (c2026c != null && c2026c.m2682d() > 0) {
                boolean zM2684f = c2026c.m2684f();
                Paint paint = this.f1285g;
                if (zM2684f) {
                    paint.setColor(this.f1281c);
                } else {
                    paint.setColor(this.f1280b);
                }
                int iM2667i = m2667i(c2026c);
                int width = i2 + iM2667i;
                if (width > getWidth()) {
                    width = getWidth();
                }
                int i3 = width;
                float f = i3;
                c2026c.f1302e = f;
                if (i == 0 && i == this.f1286h.size() - 1) {
                    RectF rectF3 = this.f1287i;
                    rectF3.left = i2;
                    rectF3.right = f;
                    float f2 = height / 2;
                    canvas2.drawRoundRect(rectF3, f2, f2, this.f1285g);
                } else if (i == 0) {
                    RectF rectF4 = this.f1287i;
                    rectF4.left = i2;
                    rectF4.right = i2 + height;
                    canvas2.drawArc(rectF4, 90.0f, 180.0f, false, this.f1285g);
                    int i4 = height / 2;
                    if (iM2667i > i4) {
                        canvas.drawRect(i2 + i4, 0.0f, f, height, this.f1285g);
                    }
                } else if (i == this.f1286h.size() - 1 || i3 > getWidth() - (height / 2)) {
                    RectF rectF5 = this.f1287i;
                    rectF5.left = i3 - height;
                    rectF5.right = f;
                    canvas.drawArc(rectF5, -90.0f, 180.0f, false, this.f1285g);
                    int i5 = height / 2;
                    if (iM2667i > i5) {
                        canvas.drawRect(i2, 0.0f, i3 - i5, height, this.f1285g);
                    }
                } else {
                    canvas.drawRect(i2, 0.0f, f, height, this.f1285g);
                }
                i2 = i3;
            }
            i++;
            canvas2 = canvas;
        }
        if (this.f1289k) {
            ArrayList<C2026c> arrayList2 = this.f1286h;
            int i6 = (int) arrayList2.get(arrayList2.size() - 1).f1302e;
            float f3 = i6;
            float f4 = height;
            canvas.drawRect(i2, 0.0f, f3, f4, this.f1285g);
            RectF rectF6 = this.f1287i;
            int i7 = this.f1290l;
            rectF6.left = (i6 + i7) - height;
            rectF6.right = i7 + i6;
            canvas.drawArc(rectF6, -90.0f, 180.0f, false, this.f1285g);
            int i8 = this.f1290l;
            int i9 = height / 2;
            if (i8 > i9) {
                canvas.drawRect(f3, 0.0f, (i6 + i8) - i9, f4, this.f1285g);
            }
        }
        m2666h(canvas);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (isInEditMode()) {
            this.f1283e = 60000L;
            this.f1286h = new ArrayList<>();
            C2026c c2026c = new C2026c();
            c2026c.m2690l(0L);
            c2026c.m2687i(10000L);
            this.f1286h.add(c2026c);
            C2026c c2026c2 = new C2026c();
            c2026c2.m2690l(0L);
            c2026c2.m2687i(10000L);
            this.f1286h.add(c2026c2);
            C2026c c2026c3 = new C2026c();
            c2026c3.m2690l(0L);
            c2026c3.m2687i(10000L);
            c2026c3.m2686h(true);
            this.f1286h.add(c2026c3);
        }
    }

    /* JADX INFO: renamed from: p */
    public final void m2674p() {
        ArrayList<C2026c> arrayList = this.f1286h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<C2026c> arrayList2 = this.f1286h;
        C2026c c2026c = arrayList2.get(arrayList2.size() - 1);
        if (c2026c.m2684f()) {
            c2026c.m2686h(false);
            invalidate();
        }
    }

    /* JADX INFO: renamed from: q */
    public void m2675q() {
        this.f1288j = null;
        if (NullChecker.a(this.f1291m)) {
            if (this.f1291m.isRunning()) {
                this.f1291m.cancel();
            }
            this.f1291m.removeAllUpdateListeners();
            this.f1291m.removeAllListeners();
        }
        if (NullChecker.a(this.f1286h)) {
            this.f1286h.clear();
        }
    }

    /* JADX INFO: renamed from: r */
    public void m2676r() {
        ArrayList<C2026c> arrayList = this.f1286h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<C2026c> arrayList2 = this.f1286h;
        C2026c c2026c = arrayList2.get(arrayList2.size() - 1);
        ArrayList<C2026c> arrayList3 = this.f1286h;
        arrayList3.remove(arrayList3.size() - 1);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(m2667i(c2026c), 0);
        this.f1292n = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration(200L);
        this.f1292n.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.v7l0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f14088a.m2671m(valueAnimator);
            }
        });
        this.f1292n.addListener(new C2024a());
        this.f1292n.start();
    }

    /* JADX INFO: renamed from: s */
    public void m2677s(float f) {
        long recordDuration = getRecordDuration();
        if (recordDuration >= this.f1283e) {
            return;
        }
        if (NullChecker.a(this.f1291m) && this.f1291m.isRunning()) {
            return;
        }
        m2674p();
        C2026c c2026c = new C2026c();
        c2026c.m2690l(SystemClock.uptimeMillis());
        c2026c.m2688j(true);
        c2026c.m2689k(f);
        this.f1293o = c2026c;
        if (this.f1286h == null) {
            this.f1286h = new ArrayList<>();
        }
        this.f1286h.add(c2026c);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt((int) recordDuration, (int) this.f1283e);
        this.f1291m = valueAnimatorOfInt;
        valueAnimatorOfInt.setDuration((long) ((this.f1283e - recordDuration) / f));
        this.f1291m.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.u7l0
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f13582a.m2672n(valueAnimator);
            }
        });
        this.f1291m.addListener(this.f1294p);
        this.f1291m.start();
    }

    public void setListener(InterfaceC2027d interfaceC2027d) {
        this.f1288j = interfaceC2027d;
    }

    public void setMaxDuration(long j) {
        this.f1283e = j;
    }

    /* JADX INFO: renamed from: t */
    public void m2678t() {
        ArrayList<C2026c> arrayList = this.f1286h;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        ArrayList<C2026c> arrayList2 = this.f1286h;
        C2026c c2026c = arrayList2.get(arrayList2.size() - 1);
        if (c2026c.m2685g()) {
            c2026c.m2687i(SystemClock.uptimeMillis());
            c2026c.m2688j(false);
            invalidate();
        }
        if (NullChecker.a(this.f1291m) && this.f1291m.isRunning()) {
            this.f1291m.cancel();
        }
        this.f1293o = null;
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
        this.f1279a = 1291845631;
        this.f1280b = -207043;
        this.f1281c = -65536;
        this.f1282d = -16777216;
        this.f1283e = 0L;
        this.f1284f = 1;
        this.f1285g = null;
        this.f1286h = null;
        this.f1290l = 0;
        this.f1291m = null;
        this.f1292n = null;
        this.f1293o = null;
        this.f1294p = new C2025b();
        m2668j(context, attributeSet, i, i2);
    }
}
