package com.p000p1.mobile.putong.live.livingroom.increment.gift.drawgift;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import com.p1.mobile.putong.live.base.data.BLiveGiftExtraDrawInfo;
import com.p1.mobile.putong.live.base.data.BLivePosition;
import l.bt0;
import l.e30;
import l.ffw;
import l.hxs;
import l.jo0;
import l.t100;
import l.vwb;
import p002l.i3c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class PlayPanelView extends View {

    /* JADX INFO: renamed from: o */
    public static final int f5650o = t100.d(12.0f);

    /* JADX INFO: renamed from: a */
    public Paint f5651a;

    /* JADX INFO: renamed from: b */
    public Bitmap f5652b;

    /* JADX INFO: renamed from: c */
    public BLiveGiftExtraDrawInfo f5653c;

    /* JADX INFO: renamed from: d */
    public float f5654d;

    /* JADX INFO: renamed from: e */
    public Rect f5655e;

    /* JADX INFO: renamed from: f */
    public RectF f5656f;

    /* JADX INFO: renamed from: g */
    public ValueAnimator f5657g;

    /* JADX INFO: renamed from: h */
    public int f5658h;

    /* JADX INFO: renamed from: i */
    public int f5659i;

    /* JADX INFO: renamed from: j */
    public int f5660j;

    /* JADX INFO: renamed from: k */
    public int f5661k;

    /* JADX INFO: renamed from: l */
    public int f5662l;

    /* JADX INFO: renamed from: m */
    public int f5663m;

    /* JADX INFO: renamed from: n */
    public int f5664n;

    public PlayPanelView(Context context) {
        super(context);
        this.f5654d = t100.d(30.0f);
        m7103h();
    }

    /* JADX INFO: renamed from: d */
    public void m7099d() {
        ValueAnimator valueAnimator = this.f5657g;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.f5657g.cancel();
    }

    /* JADX INFO: renamed from: e */
    public final void m7100e(Canvas canvas, BLivePosition bLivePosition, float f, float f2, float f3) {
        int i = (int) (bLivePosition.x * f2);
        float f4 = i;
        float f5 = (int) (bLivePosition.y * f3);
        this.f5656f.set(f4 - f, f5 - f, f4 + f, f5 + f);
        canvas.drawBitmap(this.f5652b, this.f5655e, this.f5656f, this.f5651a);
    }

    /* JADX INFO: renamed from: f */
    public void m7101f(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo, Runnable runnable) {
        this.f5653c = bLiveGiftExtraDrawInfo;
        this.f5658h = 0;
        ValueAnimator duration = ValueAnimator.ofInt(0, GiftTrayData.m7717n(bLiveGiftExtraDrawInfo)).setDuration(GiftTrayData.m7717n(bLiveGiftExtraDrawInfo));
        this.f5657g = duration;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.l580
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f14675a.m7104i(valueAnimator);
            }
        });
        bt0.f(this.f5657g, runnable);
        float f = bLiveGiftExtraDrawInfo.length / bLiveGiftExtraDrawInfo.width;
        int i = this.f5659i;
        int i2 = f5650o;
        this.f5661k = i - (i2 * 2);
        int i3 = (int) (i * f);
        this.f5662l = i3;
        this.f5663m = i2;
        this.f5664n = ((this.f5660j - i3) / 2) - i2;
        hxs.e("context_livingAct", bLiveGiftExtraDrawInfo.imgUrl).observeOn(jo0.a()).subscribe(ffw.e(new e30() { // from class: l.m580
            public final void call(Object obj) {
                this.f15240a.m7105j((Bitmap) obj);
            }
        }, new e30() { // from class: l.n580
            public final void call(Object obj) {
                this.f15828a.m7106k((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public final float m7102g(int i) {
        float f = this.f5654d / 2.0f;
        float f2 = i;
        if (f2 < 100.0f) {
            return (f2 / 200.0f) * 2.0f * 1.1f * f;
        }
        return f2 < 200.0f ? f * (1.1f - ((((f2 - 100.0f) * 0.100000024f) / 200.0f) * 2.0f)) : f;
    }

    /* JADX INFO: renamed from: h */
    public final void m7103h() {
        Paint paint = new Paint();
        this.f5651a = paint;
        paint.setAntiAlias(false);
        this.f5651a.setColor(Color.parseColor("#D81B60"));
        this.f5651a.setStyle(Paint.Style.STROKE);
        this.f5651a.setStrokeWidth(2.0f);
        this.f5656f = new RectF();
        m7109n();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m7104i(ValueAnimator valueAnimator) {
        this.f5658h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m7105j(Bitmap bitmap) {
        if (bitmap == null) {
            m7109n();
        } else {
            setGiftBitmap(bitmap);
        }
        this.f5657g.start();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m7106k(Throwable th) {
        m7109n();
        this.f5657g.start();
    }

    /* JADX INFO: renamed from: l */
    public final void m7107l(Canvas canvas) {
        float fM7711f = (this.f5658h - GiftTrayData.m7711f(this.f5653c)) / 400.0f;
        float f = (0.20000005f * fM7711f) + 1.0f;
        float f2 = this.f5661k;
        BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo = this.f5653c;
        float f3 = f2 / bLiveGiftExtraDrawInfo.width;
        float f4 = this.f5662l / bLiveGiftExtraDrawInfo.length;
        this.f5651a.setAlpha((int) (255.0f - (fM7711f * 255.0f)));
        canvas.scale(f, f, getWidth() / 2, getHeight() / 2);
        for (int i = 0; i < this.f5653c.getGiftNum(); i++) {
            m7100e(canvas, this.f5653c.getItem(i), this.f5654d / 2.0f, f3, f4);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m7108m(Canvas canvas) {
        PlayPanelView playPanelView;
        Canvas canvas2;
        this.f5651a.setAlpha(255);
        float f = this.f5661k;
        BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo = this.f5653c;
        float f2 = f / bLiveGiftExtraDrawInfo.width;
        float f3 = this.f5662l / bLiveGiftExtraDrawInfo.length;
        int i = 0;
        while (i < this.f5653c.getGiftNum()) {
            BLivePosition item = this.f5653c.getItem(i);
            int iM7716m = (int) (((long) this.f5658h) - (((long) i) * GiftTrayData.m7716m(this.f5653c)));
            if (iM7716m >= 0) {
                playPanelView = this;
                canvas2 = canvas;
                playPanelView.m7100e(canvas2, item, this.m7102g(iM7716m), f2, f3);
            } else {
                playPanelView = this;
                canvas2 = canvas;
            }
            i++;
            this = playPanelView;
            canvas = canvas2;
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m7109n() {
        setGiftBitmap(BitmapFactory.decodeResource(getContext().getResources(), i3c0.f12809h2));
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        m7099d();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        ValueAnimator valueAnimator;
        super.onDraw(canvas);
        canvas.translate(this.f5663m, this.f5664n);
        BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo = this.f5653c;
        if (bLiveGiftExtraDrawInfo == null || vwb.J(bLiveGiftExtraDrawInfo.coordinates) || (valueAnimator = this.f5657g) == null || !valueAnimator.isRunning()) {
            return;
        }
        if (this.f5658h < GiftTrayData.m7711f(this.f5653c)) {
            m7108m(canvas);
        } else {
            m7107l(canvas);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f5659i = i;
        this.f5660j = i2;
    }

    public void setGiftBitmap(Bitmap bitmap) {
        float f = this.f5654d;
        this.f5652b = Bitmap.createScaledBitmap(bitmap, (int) f, (int) f, false);
        this.f5655e = new Rect(0, 0, this.f5652b.getWidth(), this.f5652b.getHeight());
    }

    public PlayPanelView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5654d = t100.d(30.0f);
        m7103h();
    }

    public PlayPanelView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5654d = t100.d(30.0f);
        m7103h();
    }
}
