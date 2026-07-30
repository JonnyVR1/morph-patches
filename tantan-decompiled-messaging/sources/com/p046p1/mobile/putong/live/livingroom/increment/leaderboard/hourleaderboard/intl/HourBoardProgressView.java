package com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl;

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
import com.p046p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourBoardProgressView;
import java.util.concurrent.TimeUnit;
import p133rx.C22306c;
import p149l.c4g0;
import p149l.e30;
import p149l.ffw;
import p149l.jo0;
import p149l.p9c0;
import p149l.t100;
import p149l.w9j;

/* JADX INFO: loaded from: classes4.dex */
public class HourBoardProgressView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f50567a;

    /* JADX INFO: renamed from: b */
    public int[] f50568b;

    /* JADX INFO: renamed from: c */
    public int f50569c;

    /* JADX INFO: renamed from: d */
    public int f50570d;

    /* JADX INFO: renamed from: e */
    public float f50571e;

    /* JADX INFO: renamed from: f */
    public c4g0 f50572f;

    /* JADX INFO: renamed from: g */
    public Bitmap f50573g;

    /* JADX INFO: renamed from: h */
    public Canvas f50574h;

    /* JADX INFO: renamed from: i */
    public BitmapShader f50575i;

    /* JADX INFO: renamed from: j */
    public RectF f50576j;

    /* JADX INFO: renamed from: k */
    public int f50577k;

    /* JADX INFO: renamed from: l */
    public final float f50578l;

    public HourBoardProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50567a = new Paint(1);
        this.f50568b = new int[]{16733084, 16733084};
        this.f50571e = 0.0f;
        this.f50578l = 20.0f;
        m74782g(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m74776a(Long l2) {
    }

    /* JADX INFO: renamed from: e */
    public final void m74780e(Canvas canvas) {
        if (this.f50574h == null) {
            return;
        }
        float measuredWidth = this.f50571e * getMeasuredWidth();
        this.f50574h.save();
        this.f50574h.clipRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight());
        this.f50574h.drawColor(this.f50568b[0]);
        this.f50574h.restore();
        if (this.f50575i == null) {
            Bitmap bitmap = this.f50573g;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.f50575i = bitmapShader;
            this.f50567a.setShader(bitmapShader);
        }
        RectF rectF = this.f50576j;
        int i = this.f50577k;
        canvas.drawRoundRect(rectF, i, i, this.f50567a);
    }

    /* JADX INFO: renamed from: f */
    public final void m74781f() {
        this.f50567a.setStyle(Paint.Style.FILL);
        this.f50573g = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        this.f50576j = new RectF(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        this.f50574h = new Canvas(this.f50573g);
    }

    /* JADX INFO: renamed from: g */
    public final void m74782g(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p9c0.f147692B);
        try {
            this.f50577k = (int) typedArrayObtainStyledAttributes.getDimension(p9c0.f147693C, t100.m186890d(9.0f));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Boolean m74783h(float f, Long l2) {
        return Boolean.valueOf(this.f50571e >= f);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Long m74784i(int i, float f, Long l2) {
        if (i > 0) {
            this.f50571e += f / (i / 20.0f);
        } else {
            this.f50571e = f;
        }
        if (this.f50571e >= f) {
            this.f50571e = f;
        }
        return Long.valueOf((long) (this.f50571e * 100.0f));
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m74785j(Long l2) {
        invalidate();
    }

    /* JADX INFO: renamed from: k */
    public void m74786k(final float f, final int i, int i2) {
        if (f == 0.0f) {
            invalidate();
            return;
        }
        this.f50571e = 0.0f;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f50572f = C22306c.interval(20L, timeUnit).takeUntil(new w9j() { // from class: l.fhl
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f97510a.m74783h(f, (Long) obj);
            }
        }).delay(i2, timeUnit).map(new w9j() { // from class: l.ghl
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f102666a.m74784i(i, f, (Long) obj);
            }
        }).observeOn(jo0.m142408a()).doOnNext(new e30() { // from class: l.hhl
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f107729a.m74785j((Long) obj);
            }
        }).cacheWithInitialCapacity(1).subscribe(ffw.m121197h(new e30() { // from class: l.ihl
            @Override // p149l.e30
            public final void call(Object obj) {
                HourBoardProgressView.m74776a((Long) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m74780e(canvas);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        this.f50569c = View.MeasureSpec.getSize(i);
        this.f50570d = View.MeasureSpec.getSize(i2);
        super.onMeasure(i, i2);
        setMeasuredDimension(this.f50569c, this.f50570d);
        if (this.f50573g != null || getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0) {
            return;
        }
        m74781f();
    }

    public void setColors(int[] iArr) {
        this.f50568b = iArr;
    }

    public HourBoardProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HourBoardProgressView(Context context) {
        this(context, null, 0);
    }
}
