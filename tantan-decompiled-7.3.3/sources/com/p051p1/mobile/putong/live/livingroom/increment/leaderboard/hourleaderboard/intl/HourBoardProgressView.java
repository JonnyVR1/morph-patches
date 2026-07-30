package com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl;

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
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourBoardProgressView;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p153l.dhw;
import p153l.fo0;
import p153l.kcg0;
import p153l.qa00;
import p153l.qcj;
import p153l.vhc0;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class HourBoardProgressView extends View {

    /* JADX INFO: renamed from: a */
    public Paint f51415a;

    /* JADX INFO: renamed from: b */
    public int[] f51416b;

    /* JADX INFO: renamed from: c */
    public int f51417c;

    /* JADX INFO: renamed from: d */
    public int f51418d;

    /* JADX INFO: renamed from: e */
    public float f51419e;

    /* JADX INFO: renamed from: f */
    public kcg0 f51420f;

    /* JADX INFO: renamed from: g */
    public Bitmap f51421g;

    /* JADX INFO: renamed from: h */
    public Canvas f51422h;

    /* JADX INFO: renamed from: i */
    public BitmapShader f51423i;

    /* JADX INFO: renamed from: j */
    public RectF f51424j;

    /* JADX INFO: renamed from: k */
    public int f51425k;

    /* JADX INFO: renamed from: l */
    public final float f51426l;

    public HourBoardProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51415a = new Paint(1);
        this.f51416b = new int[]{16733084, 16733084};
        this.f51419e = 0.0f;
        this.f51426l = 20.0f;
        m75965g(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m75959a(Long l2) {
    }

    /* JADX INFO: renamed from: e */
    public final void m75963e(Canvas canvas) {
        if (this.f51422h == null) {
            return;
        }
        float measuredWidth = this.f51419e * getMeasuredWidth();
        this.f51422h.save();
        this.f51422h.clipRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight());
        this.f51422h.drawColor(this.f51416b[0]);
        this.f51422h.restore();
        if (this.f51423i == null) {
            Bitmap bitmap = this.f51421g;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
            this.f51423i = bitmapShader;
            this.f51415a.setShader(bitmapShader);
        }
        RectF rectF = this.f51424j;
        int i = this.f51425k;
        canvas.drawRoundRect(rectF, i, i, this.f51415a);
    }

    /* JADX INFO: renamed from: f */
    public final void m75964f() {
        this.f51415a.setStyle(Paint.Style.FILL);
        this.f51421g = Bitmap.createBitmap(getMeasuredWidth(), getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        this.f51424j = new RectF(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        this.f51422h = new Canvas(this.f51421g);
    }

    /* JADX INFO: renamed from: g */
    public final void m75965g(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vhc0.f184091B);
        try {
            this.f51425k = (int) typedArrayObtainStyledAttributes.getDimension(vhc0.f184092C, qa00.m175859d(9.0f));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ Boolean m75966h(float f, Long l2) {
        return Boolean.valueOf(this.f51419e >= f);
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Long m75967i(int i, float f, Long l2) {
        if (i > 0) {
            this.f51419e += f / (i / 20.0f);
        } else {
            this.f51419e = f;
        }
        if (this.f51419e >= f) {
            this.f51419e = f;
        }
        return Long.valueOf((long) (this.f51419e * 100.0f));
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m75968j(Long l2) {
        invalidate();
    }

    /* JADX INFO: renamed from: k */
    public void m75969k(final float f, final int i, int i2) {
        if (f == 0.0f) {
            invalidate();
            return;
        }
        this.f51419e = 0.0f;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f51420f = C22421c.interval(20L, timeUnit).takeUntil(new qcj() { // from class: l.wjl
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f189468a.m75966h(f, (Long) obj);
            }
        }).delay(i2, timeUnit).map(new qcj() { // from class: l.xjl
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f194586a.m75967i(i, f, (Long) obj);
            }
        }).observeOn(fo0.m126432a()).doOnNext(new y20() { // from class: l.yjl
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f200307a.m75968j((Long) obj);
            }
        }).cacheWithInitialCapacity(1).subscribe(dhw.m115829h(new y20() { // from class: l.zjl
            @Override // p153l.y20
            public final void call(Object obj) {
                HourBoardProgressView.m75959a((Long) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m75963e(canvas);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        this.f51417c = View.MeasureSpec.getSize(i);
        this.f51418d = View.MeasureSpec.getSize(i2);
        super.onMeasure(i, i2);
        setMeasuredDimension(this.f51417c, this.f51418d);
        if (this.f51421g != null || getMeasuredWidth() <= 0 || getMeasuredHeight() <= 0) {
            return;
        }
        m75964f();
    }

    public void setColors(int[] iArr) {
        this.f51416b = iArr;
    }

    public HourBoardProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HourBoardProgressView(Context context) {
        this(context, null, 0);
    }
}
