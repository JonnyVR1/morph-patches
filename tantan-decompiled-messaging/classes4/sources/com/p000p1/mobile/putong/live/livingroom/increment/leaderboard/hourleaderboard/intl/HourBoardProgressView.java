package com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourBoardProgressView;
import java.util.concurrent.TimeUnit;
import l.c4g0;
import l.e30;
import l.ffw;
import l.jo0;
import l.t100;
import l.w9j;
import p002l.p9c0;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class HourBoardProgressView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f6609a;

    /* JADX INFO: renamed from: b */
    public int[] f6610b;

    /* JADX INFO: renamed from: c */
    public int f6611c;

    /* JADX INFO: renamed from: d */
    public int f6612d;

    /* JADX INFO: renamed from: e */
    public float f6613e;

    /* JADX INFO: renamed from: f */
    public c4g0 f6614f;

    /* JADX INFO: renamed from: g */
    public Bitmap f6615g;

    /* JADX INFO: renamed from: h */
    public Canvas f6616h;

    /* JADX INFO: renamed from: i */
    public BitmapShader f6617i;

    /* JADX INFO: renamed from: j */
    public RectF f6618j;

    /* JADX INFO: renamed from: k */
    public int f6619k;

    /* JADX INFO: renamed from: l */
    public final float f6620l;

    public HourBoardProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f6609a = new Paint(1);
        this.f6610b = new int[]{16733084, 16733084};
        this.f6613e = 0.0f;
        this.f6620l = 20.0f;
        m8380g(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m8374a(Long l2) {
    }

    /* JADX INFO: renamed from: e */
    public final void m8378e(Canvas canvas) {
        if (this.f6616h == null) {
            return;
        }
        float measuredWidth = this.f6613e * getMeasuredWidth();
        this.f6616h.save();
        this.f6616h.clipRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight());
        this.f6616h.drawColor(this.f6610b[0]);
        this.f6616h.restore();
        if (this.f6617i == null) {
            Bitmap bitmap = this.f6615g;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.f6617i = bitmapShader;
            this.f6609a.setShader(bitmapShader);
        }
        RectF rectF = this.f6618j;
        int i = this.f6619k;
        canvas.drawRoundRect(rectF, i, i, this.f6609a);
    }

    /* JADX INFO: renamed from: f */
    public final void m8379f() {
        this.f6609a.setStyle(Paint.Style.FILL);
        this.f6615g = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        this.f6618j = new RectF(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        this.f6616h = new Canvas(this.f6615g);
    }

    /* JADX INFO: renamed from: g */
    public final void m8380g(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p9c0.f17089B);
        try {
            this.f6619k = (int) typedArrayObtainStyledAttributes.getDimension(p9c0.f17090C, t100.d(9.0f));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Boolean m8381h(float f, Long l2) {
        return Boolean.valueOf(this.f6613e >= f);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Long m8382i(int i, float f, Long l2) {
        if (i > 0) {
            this.f6613e += f / (i / 20.0f);
        } else {
            this.f6613e = f;
        }
        if (this.f6613e >= f) {
            this.f6613e = f;
        }
        return Long.valueOf((long) (this.f6613e * 100.0f));
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m8383j(Long l2) {
        invalidate();
    }

    /* JADX INFO: renamed from: k */
    public void m8384k(final float f, final int i, int i2) {
        if (f == 0.0f) {
            invalidate();
            return;
        }
        this.f6613e = 0.0f;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f6614f = c.interval(20L, timeUnit).takeUntil(new w9j() { // from class: l.fhl
            public final Object call(Object obj) {
                return this.f10356a.m8381h(f, (Long) obj);
            }
        }).delay(i2, timeUnit).map(new w9j() { // from class: l.ghl
            public final Object call(Object obj) {
                return this.f11443a.m8382i(i, f, (Long) obj);
            }
        }).observeOn(jo0.a()).doOnNext(new e30() { // from class: l.hhl
            public final void call(Object obj) {
                this.f12039a.m8383j((Long) obj);
            }
        }).cacheWithInitialCapacity(1).subscribe(ffw.h(new e30() { // from class: l.ihl
            public final void call(Object obj) {
                HourBoardProgressView.m8374a((Long) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m8378e(canvas);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        this.f6611c = View.MeasureSpec.getSize(i);
        this.f6612d = View.MeasureSpec.getSize(i2);
        super.onMeasure(i, i2);
        setMeasuredDimension(this.f6611c, this.f6612d);
        if (this.f6615g != null || getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0) {
            return;
        }
        m8379f();
    }

    public void setColors(int[] iArr) {
        this.f6610b = iArr;
    }

    public HourBoardProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HourBoardProgressView(Context context) {
        this(context, null, 0);
    }
}
