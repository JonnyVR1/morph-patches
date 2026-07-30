package com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl;

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
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourBoardProgressViewNew;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.e30;
import l.ffw;
import l.jo0;
import l.kvc0;
import l.mkd0;
import l.t100;
import l.w9j;
import p002l.h1c0;
import p002l.i3c0;
import p002l.p9c0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class HourBoardProgressViewNew extends View {

    /* JADX INFO: renamed from: a */
    public Paint f6621a;

    /* JADX INFO: renamed from: b */
    public int[] f6622b;

    /* JADX INFO: renamed from: c */
    public int f6623c;

    /* JADX INFO: renamed from: d */
    public int f6624d;

    /* JADX INFO: renamed from: e */
    public float f6625e;

    /* JADX INFO: renamed from: f */
    public c4g0 f6626f;

    /* JADX INFO: renamed from: g */
    public c4g0 f6627g;

    /* JADX INFO: renamed from: h */
    public Bitmap f6628h;

    /* JADX INFO: renamed from: i */
    public RectF f6629i;

    /* JADX INFO: renamed from: j */
    public int f6630j;

    /* JADX INFO: renamed from: k */
    public final float f6631k;

    /* JADX INFO: renamed from: l */
    public Path f6632l;

    /* JADX INFO: renamed from: m */
    public Rect f6633m;

    /* JADX INFO: renamed from: n */
    public Paint f6634n;

    /* JADX INFO: renamed from: o */
    public long f6635o;

    public HourBoardProgressViewNew(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6621a = new Paint(1);
        this.f6622b = new int[]{16733084, 16733084};
        this.f6625e = 0.0f;
        this.f6629i = new RectF();
        this.f6631k = 20.0f;
        this.f6632l = new Path();
        this.f6633m = new Rect();
        this.f6634n = new Paint();
        this.f6635o = -1L;
        m8392h(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8385a(Long l2) {
    }

    private int getNowAlp() {
        if (this.f6635o <= 0) {
            this.f6635o = System.currentTimeMillis();
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.f6635o) % 1600;
        return jCurrentTimeMillis < 800 ? (int) ((((1.0f - (jCurrentTimeMillis / 800.0f)) * 0.7f) + 0.3f) * 255.0f) : (int) (((((jCurrentTimeMillis - 800.0f) / 800.0f) * 0.7f) + 0.3f) * 255.0f);
    }

    /* JADX INFO: renamed from: f */
    public final void m8390f(Canvas canvas) {
        this.f6629i.set(0.0f, 0.0f, this.f6625e * getMeasuredWidth(), getMeasuredHeight());
        this.f6632l.reset();
        Path path = this.f6632l;
        RectF rectF = this.f6629i;
        int i = this.f6630j;
        path.addRoundRect(rectF, i, i, Path.Direction.CW);
        canvas.clipPath(this.f6632l);
        this.f6634n.setAlpha(getNowAlp());
        canvas.drawRect(this.f6629i, this.f6621a);
        canvas.drawBitmap(this.f6628h, this.f6633m, this.f6629i, this.f6634n);
    }

    /* JADX INFO: renamed from: g */
    public final void m8391g() {
        this.f6621a.setStyle(Paint.Style.FILL);
        this.f6621a.setColor(kvc0.a(h1c0.f11725E0));
        this.f6621a.setAntiAlias(true);
        this.f6621a.setStrokeCap(Paint.Cap.BUTT);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), i3c0.f12637S2);
        this.f6628h = bitmapDecodeResource;
        this.f6633m.set(0, 0, bitmapDecodeResource.getWidth(), this.f6628h.getHeight());
        this.f6629i.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        this.f6634n.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: h */
    public final void m8392h(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p9c0.f17089B);
        try {
            this.f6630j = (int) typedArrayObtainStyledAttributes.getDimension(p9c0.f17090C, t100.d(8.0f));
            typedArrayObtainStyledAttributes.recycle();
            m8391g();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Boolean m8393i(float f, Long l2) {
        return Boolean.valueOf(this.f6625e >= f);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Long m8394j(int i, float f, Long l2) {
        if (i > 0) {
            this.f6625e += f / (i / 20.0f);
        } else {
            this.f6625e = f;
        }
        if (this.f6625e >= f) {
            this.f6625e = f;
        }
        return Long.valueOf((long) (this.f6625e * 100.0f));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m8395k(Long l2) {
        invalidate();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m8396l(Long l2) {
        invalidate();
    }

    /* JADX INFO: renamed from: m */
    public void m8397m() {
        mkd0.z(this.f6626f);
        mkd0.z(this.f6627g);
    }

    /* JADX INFO: renamed from: n */
    public void m8398n(final float f, final int i, int i2) {
        if (f == 0.0f) {
            invalidate();
            return;
        }
        this.f6625e = 0.0f;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f6626f = c.interval(20L, timeUnit).takeUntil(new w9j() { // from class: l.khl
            public final Object call(Object obj) {
                return this.f14332a.m8393i(f, (Long) obj);
            }
        }).delay(i2, timeUnit).map(new w9j() { // from class: l.lhl
            public final Object call(Object obj) {
                return this.f14876a.m8394j(i, f, (Long) obj);
            }
        }).observeOn(jo0.a()).doOnNext(new e30() { // from class: l.mhl
            public final void call(Object obj) {
                this.f15388a.m8395k((Long) obj);
            }
        }).cacheWithInitialCapacity(1).subscribe(ffw.h(new e30() { // from class: l.nhl
            public final void call(Object obj) {
                HourBoardProgressViewNew.m8385a((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public void m8399o() {
        mkd0.z(this.f6627g);
        this.f6627g = c.interval(20L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(jo0.a()).subscribe(ffw.h(new e30() { // from class: l.jhl
            public final void call(Object obj) {
                this.f13776a.m8396l((Long) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m8390f(canvas);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        this.f6623c = View.MeasureSpec.getSize(i);
        this.f6624d = View.MeasureSpec.getSize(i2);
        super.onMeasure(i, i2);
        setMeasuredDimension(this.f6623c, this.f6624d);
    }

    public void setColors(int[] iArr) {
        this.f6622b = iArr;
    }

    public HourBoardProgressViewNew(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HourBoardProgressViewNew(Context context) {
        this(context, null, 0);
    }
}
