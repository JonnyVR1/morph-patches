package com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourBoardProgressViewNew;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p149l.c4g0;
import p149l.e30;
import p149l.ffw;
import p149l.h1c0;
import p149l.i3c0;
import p149l.jo0;
import p149l.kvc0;
import p149l.mkd0;
import p149l.p9c0;
import p149l.t100;
import p149l.w9j;

/* JADX INFO: loaded from: classes4.dex */
public class HourBoardProgressViewNew extends View {

    /* JADX INFO: renamed from: a */
    public Paint f50579a;

    /* JADX INFO: renamed from: b */
    public int[] f50580b;

    /* JADX INFO: renamed from: c */
    public int f50581c;

    /* JADX INFO: renamed from: d */
    public int f50582d;

    /* JADX INFO: renamed from: e */
    public float f50583e;

    /* JADX INFO: renamed from: f */
    public c4g0 f50584f;

    /* JADX INFO: renamed from: g */
    public c4g0 f50585g;

    /* JADX INFO: renamed from: h */
    public Bitmap f50586h;

    /* JADX INFO: renamed from: i */
    public RectF f50587i;

    /* JADX INFO: renamed from: j */
    public int f50588j;

    /* JADX INFO: renamed from: k */
    public final float f50589k;

    /* JADX INFO: renamed from: l */
    public Path f50590l;

    /* JADX INFO: renamed from: m */
    public Rect f50591m;

    /* JADX INFO: renamed from: n */
    public Paint f50592n;

    /* JADX INFO: renamed from: o */
    public long f50593o;

    public HourBoardProgressViewNew(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50579a = new Paint(1);
        this.f50580b = new int[]{16733084, 16733084};
        this.f50583e = 0.0f;
        this.f50587i = new RectF();
        this.f50589k = 20.0f;
        this.f50590l = new Path();
        this.f50591m = new Rect();
        this.f50592n = new Paint();
        this.f50593o = -1L;
        m74794h(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m74787a(Long l2) {
    }

    private int getNowAlp() {
        if (this.f50593o <= 0) {
            this.f50593o = System.currentTimeMillis();
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.f50593o) % 1600;
        return jCurrentTimeMillis < 800 ? (int) ((((1.0f - (jCurrentTimeMillis / 800.0f)) * 0.7f) + 0.3f) * 255.0f) : (int) (((((jCurrentTimeMillis - 800.0f) / 800.0f) * 0.7f) + 0.3f) * 255.0f);
    }

    /* JADX INFO: renamed from: f */
    public final void m74792f(Canvas canvas) {
        this.f50587i.set(0.0f, 0.0f, this.f50583e * getMeasuredWidth(), getMeasuredHeight());
        this.f50590l.reset();
        Path path = this.f50590l;
        RectF rectF = this.f50587i;
        int i = this.f50588j;
        path.addRoundRect(rectF, i, i, Path.Direction.CW);
        canvas.clipPath(this.f50590l);
        this.f50592n.setAlpha(getNowAlp());
        canvas.drawRect(this.f50587i, this.f50579a);
        canvas.drawBitmap(this.f50586h, this.f50591m, this.f50587i, this.f50592n);
    }

    /* JADX INFO: renamed from: g */
    public final void m74793g() {
        this.f50579a.setStyle(Paint.Style.FILL);
        this.f50579a.setColor(kvc0.m147352a(h1c0.f105305E0));
        this.f50579a.setAntiAlias(true);
        this.f50579a.setStrokeCap(Paint.Cap.BUTT);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), i3c0.f110852S2);
        this.f50586h = bitmapDecodeResource;
        this.f50591m.set(0, 0, bitmapDecodeResource.getWidth(), this.f50586h.getHeight());
        this.f50587i.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        this.f50592n.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: h */
    public final void m74794h(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p9c0.f147692B);
        try {
            this.f50588j = (int) typedArrayObtainStyledAttributes.getDimension(p9c0.f147693C, t100.m186890d(8.0f));
            typedArrayObtainStyledAttributes.recycle();
            m74793g();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Boolean m74795i(float f, Long l2) {
        return Boolean.valueOf(this.f50583e >= f);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Long m74796j(int i, float f, Long l2) {
        if (i > 0) {
            this.f50583e += f / (i / 20.0f);
        } else {
            this.f50583e = f;
        }
        if (this.f50583e >= f) {
            this.f50583e = f;
        }
        return Long.valueOf((long) (this.f50583e * 100.0f));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m74797k(Long l2) {
        invalidate();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m74798l(Long l2) {
        invalidate();
    }

    /* JADX INFO: renamed from: m */
    public void m74799m() {
        mkd0.m154992z(this.f50584f);
        mkd0.m154992z(this.f50585g);
    }

    /* JADX INFO: renamed from: n */
    public void m74800n(final float f, final int i, int i2) {
        if (f == 0.0f) {
            invalidate();
            return;
        }
        this.f50583e = 0.0f;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f50584f = C22306c.interval(20L, timeUnit).takeUntil(new w9j() { // from class: l.khl
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f123175a.m74795i(f, (Long) obj);
            }
        }).delay(i2, timeUnit).map(new w9j() { // from class: l.lhl
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f128117a.m74796j(i, f, (Long) obj);
            }
        }).observeOn(jo0.m142408a()).doOnNext(new e30() { // from class: l.mhl
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f133828a.m74797k((Long) obj);
            }
        }).cacheWithInitialCapacity(1).subscribe(ffw.m121197h(new e30() { // from class: l.nhl
            @Override // p149l.e30
            public final void call(Object obj) {
                HourBoardProgressViewNew.m74787a((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public void m74801o() {
        mkd0.m154992z(this.f50585g);
        this.f50585g = C22306c.interval(20L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.m142408a()).subscribe(ffw.m121197h(new e30() { // from class: l.jhl
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117955a.m74798l((Long) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m74792f(canvas);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        this.f50581c = View.MeasureSpec.getSize(i);
        this.f50582d = View.MeasureSpec.getSize(i2);
        super.onMeasure(i, i2);
        setMeasuredDimension(this.f50581c, this.f50582d);
    }

    public void setColors(int[] iArr) {
        this.f50580b = iArr;
    }

    public HourBoardProgressViewNew(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HourBoardProgressViewNew(Context context) {
        this(context, null, 0);
    }
}
