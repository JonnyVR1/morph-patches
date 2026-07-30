package com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl;

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
import com.p051p1.mobile.putong.live.livingroom.increment.leaderboard.hourleaderboard.intl.HourBoardProgressViewNew;
import java.util.concurrent.TimeUnit;
import p137rx.C22421c;
import p153l.dhw;
import p153l.fo0;
import p153l.kcg0;
import p153l.n3d0;
import p153l.n9c0;
import p153l.obc0;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.vhc0;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class HourBoardProgressViewNew extends View {

    /* JADX INFO: renamed from: a */
    public Paint f51427a;

    /* JADX INFO: renamed from: b */
    public int[] f51428b;

    /* JADX INFO: renamed from: c */
    public int f51429c;

    /* JADX INFO: renamed from: d */
    public int f51430d;

    /* JADX INFO: renamed from: e */
    public float f51431e;

    /* JADX INFO: renamed from: f */
    public kcg0 f51432f;

    /* JADX INFO: renamed from: g */
    public kcg0 f51433g;

    /* JADX INFO: renamed from: h */
    public Bitmap f51434h;

    /* JADX INFO: renamed from: i */
    public RectF f51435i;

    /* JADX INFO: renamed from: j */
    public int f51436j;

    /* JADX INFO: renamed from: k */
    public final float f51437k;

    /* JADX INFO: renamed from: l */
    public Path f51438l;

    /* JADX INFO: renamed from: m */
    public Rect f51439m;

    /* JADX INFO: renamed from: n */
    public Paint f51440n;

    /* JADX INFO: renamed from: o */
    public long f51441o;

    public HourBoardProgressViewNew(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f51427a = new Paint(1);
        this.f51428b = new int[]{16733084, 16733084};
        this.f51431e = 0.0f;
        this.f51435i = new RectF();
        this.f51437k = 20.0f;
        this.f51438l = new Path();
        this.f51439m = new Rect();
        this.f51440n = new Paint();
        this.f51441o = -1L;
        m75977h(context, attributeSet);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m75970a(Long l2) {
    }

    private int getNowAlp() {
        if (this.f51441o <= 0) {
            this.f51441o = System.currentTimeMillis();
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() - this.f51441o) % 1600;
        return jCurrentTimeMillis < 800 ? (int) ((((1.0f - (jCurrentTimeMillis / 800.0f)) * 0.7f) + 0.3f) * 255.0f) : (int) (((((jCurrentTimeMillis - 800.0f) / 800.0f) * 0.7f) + 0.3f) * 255.0f);
    }

    /* JADX INFO: renamed from: f */
    public final void m75975f(Canvas canvas) {
        this.f51435i.set(0.0f, 0.0f, this.f51431e * getMeasuredWidth(), getMeasuredHeight());
        this.f51438l.reset();
        Path path = this.f51438l;
        RectF rectF = this.f51435i;
        int i = this.f51436j;
        path.addRoundRect(rectF, i, i, Path.Direction.CW);
        canvas.clipPath(this.f51438l);
        this.f51440n.setAlpha(getNowAlp());
        canvas.drawRect(this.f51435i, this.f51427a);
        canvas.drawBitmap(this.f51434h, this.f51439m, this.f51435i, this.f51440n);
    }

    /* JADX INFO: renamed from: g */
    public final void m75976g() {
        this.f51427a.setStyle(Paint.Style.FILL);
        this.f51427a.setColor(n3d0.m161277a(n9c0.f140766E0));
        this.f51427a.setAntiAlias(true);
        this.f51427a.setStrokeCap(Paint.Cap.BUTT);
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), obc0.f146180S2);
        this.f51434h = bitmapDecodeResource;
        this.f51439m.set(0, 0, bitmapDecodeResource.getWidth(), this.f51434h.getHeight());
        this.f51435i.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        this.f51440n.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: h */
    public final void m75977h(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, vhc0.f184091B);
        try {
            this.f51436j = (int) typedArrayObtainStyledAttributes.getDimension(vhc0.f184092C, qa00.m175859d(8.0f));
            typedArrayObtainStyledAttributes.recycle();
            m75976g();
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ Boolean m75978i(float f, Long l2) {
        return Boolean.valueOf(this.f51431e >= f);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ Long m75979j(int i, float f, Long l2) {
        if (i > 0) {
            this.f51431e += f / (i / 20.0f);
        } else {
            this.f51431e = f;
        }
        if (this.f51431e >= f) {
            this.f51431e = f;
        }
        return Long.valueOf((long) (this.f51431e * 100.0f));
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m75980k(Long l2) {
        invalidate();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m75981l(Long l2) {
        invalidate();
    }

    /* JADX INFO: renamed from: m */
    public void m75982m() {
        psd0.m173633z(this.f51432f);
        psd0.m173633z(this.f51433g);
    }

    /* JADX INFO: renamed from: n */
    public void m75983n(final float f, final int i, int i2) {
        if (f == 0.0f) {
            invalidate();
            return;
        }
        this.f51431e = 0.0f;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.f51432f = C22421c.interval(20L, timeUnit).takeUntil(new qcj() { // from class: l.bkl
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f77085a.m75978i(f, (Long) obj);
            }
        }).delay(i2, timeUnit).map(new qcj() { // from class: l.ckl
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f82295a.m75979j(i, f, (Long) obj);
            }
        }).observeOn(fo0.m126432a()).doOnNext(new y20() { // from class: l.dkl
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f89410a.m75980k((Long) obj);
            }
        }).cacheWithInitialCapacity(1).subscribe(dhw.m115829h(new y20() { // from class: l.ekl
            @Override // p153l.y20
            public final void call(Object obj) {
                HourBoardProgressViewNew.m75970a((Long) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: o */
    public void m75984o() {
        psd0.m173633z(this.f51433g);
        this.f51433g = C22421c.interval(20L, TimeUnit.MILLISECONDS).onBackpressureLatest().observeOn(fo0.m126432a()).subscribe(dhw.m115829h(new y20() { // from class: l.akl
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f72018a.m75981l((Long) obj);
            }
        }));
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        m75975f(canvas);
        super.onDraw(canvas);
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        this.f51429c = View.MeasureSpec.getSize(i);
        this.f51430d = View.MeasureSpec.getSize(i2);
        super.onMeasure(i, i2);
        setMeasuredDimension(this.f51429c, this.f51430d);
    }

    public void setColors(int[] iArr) {
        this.f51428b = iArr;
    }

    public HourBoardProgressViewNew(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HourBoardProgressViewNew(Context context) {
        this(context, null, 0);
    }
}
