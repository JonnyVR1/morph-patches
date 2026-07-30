package com.p046p1.mobile.putong.live.livingroom.increment.gift.drawgift;

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
import com.p046p1.mobile.putong.live.base.data.BLiveGiftExtraDrawInfo;
import com.p046p1.mobile.putong.live.base.data.BLivePosition;
import com.p046p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import p149l.bt0;
import p149l.e30;
import p149l.ffw;
import p149l.hxs;
import p149l.i3c0;
import p149l.jo0;
import p149l.t100;
import p149l.vwb;

/* JADX INFO: loaded from: classes4.dex */
public class PlayPanelView extends View {

    /* JADX INFO: renamed from: o */
    public static final int f49608o = t100.m186890d(12.0f);

    /* JADX INFO: renamed from: a */
    public Paint f49609a;

    /* JADX INFO: renamed from: b */
    public Bitmap f49610b;

    /* JADX INFO: renamed from: c */
    public BLiveGiftExtraDrawInfo f49611c;

    /* JADX INFO: renamed from: d */
    public float f49612d;

    /* JADX INFO: renamed from: e */
    public Rect f49613e;

    /* JADX INFO: renamed from: f */
    public RectF f49614f;

    /* JADX INFO: renamed from: g */
    public ValueAnimator f49615g;

    /* JADX INFO: renamed from: h */
    public int f49616h;

    /* JADX INFO: renamed from: i */
    public int f49617i;

    /* JADX INFO: renamed from: j */
    public int f49618j;

    /* JADX INFO: renamed from: k */
    public int f49619k;

    /* JADX INFO: renamed from: l */
    public int f49620l;

    /* JADX INFO: renamed from: m */
    public int f49621m;

    /* JADX INFO: renamed from: n */
    public int f49622n;

    public PlayPanelView(Context context) {
        super(context);
        this.f49612d = t100.m186890d(30.0f);
        m73559h();
    }

    /* JADX INFO: renamed from: d */
    public void m73555d() {
        ValueAnimator valueAnimator = this.f49615g;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.f49615g.cancel();
    }

    /* JADX INFO: renamed from: e */
    public final void m73556e(Canvas canvas, BLivePosition bLivePosition, float f, float f2, float f3) {
        int i = (int) (bLivePosition.f44430x * f2);
        float f4 = i;
        float f5 = (int) (bLivePosition.f44431y * f3);
        this.f49614f.set(f4 - f, f5 - f, f4 + f, f5 + f);
        canvas.drawBitmap(this.f49610b, this.f49613e, this.f49614f, this.f49609a);
    }

    /* JADX INFO: renamed from: f */
    public void m73557f(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo, Runnable runnable) {
        this.f49611c = bLiveGiftExtraDrawInfo;
        this.f49616h = 0;
        ValueAnimator duration = ValueAnimator.ofInt(0, GiftTrayData.m74152n(bLiveGiftExtraDrawInfo)).setDuration(GiftTrayData.m74152n(bLiveGiftExtraDrawInfo));
        this.f49615g = duration;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.l580
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f126095a.m73560i(valueAnimator);
            }
        });
        bt0.m103733f(this.f49615g, runnable);
        float f = bLiveGiftExtraDrawInfo.length / bLiveGiftExtraDrawInfo.width;
        int i = this.f49617i;
        int i2 = f49608o;
        this.f49619k = i - (i2 * 2);
        int i3 = (int) (i * f);
        this.f49620l = i3;
        this.f49621m = i2;
        this.f49622n = ((this.f49618j - i3) / 2) - i2;
        hxs.m133392e("context_livingAct", bLiveGiftExtraDrawInfo.imgUrl).observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.m580
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f131376a.m73561j((Bitmap) obj);
            }
        }, new e30() { // from class: l.n580
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f137197a.m73562k((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public final float m73558g(int i) {
        float f = this.f49612d / 2.0f;
        float f2 = i;
        if (f2 < 100.0f) {
            return (f2 / 200.0f) * 2.0f * 1.1f * f;
        }
        return f2 < 200.0f ? f * (1.1f - ((((f2 - 100.0f) * 0.100000024f) / 200.0f) * 2.0f)) : f;
    }

    /* JADX INFO: renamed from: h */
    public final void m73559h() {
        Paint paint = new Paint();
        this.f49609a = paint;
        paint.setAntiAlias(false);
        this.f49609a.setColor(Color.parseColor("#D81B60"));
        this.f49609a.setStyle(Paint.Style.STROKE);
        this.f49609a.setStrokeWidth(2.0f);
        this.f49614f = new RectF();
        m73565n();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m73560i(ValueAnimator valueAnimator) {
        this.f49616h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m73561j(Bitmap bitmap) {
        if (bitmap == null) {
            m73565n();
        } else {
            setGiftBitmap(bitmap);
        }
        this.f49615g.start();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m73562k(Throwable th) {
        m73565n();
        this.f49615g.start();
    }

    /* JADX INFO: renamed from: l */
    public final void m73563l(Canvas canvas) {
        float fM74146f = (this.f49616h - GiftTrayData.m74146f(this.f49611c)) / 400.0f;
        float f = (0.20000005f * fM74146f) + 1.0f;
        float f2 = this.f49619k;
        BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo = this.f49611c;
        float f3 = f2 / bLiveGiftExtraDrawInfo.width;
        float f4 = this.f49620l / bLiveGiftExtraDrawInfo.length;
        this.f49609a.setAlpha((int) (255.0f - (fM74146f * 255.0f)));
        canvas.scale(f, f, getWidth() / 2, getHeight() / 2);
        for (int i = 0; i < this.f49611c.getGiftNum(); i++) {
            m73556e(canvas, this.f49611c.getItem(i), this.f49612d / 2.0f, f3, f4);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m73564m(Canvas canvas) {
        PlayPanelView playPanelView;
        Canvas canvas2;
        this.f49609a.setAlpha(255);
        float f = this.f49619k;
        BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo = this.f49611c;
        float f2 = f / bLiveGiftExtraDrawInfo.width;
        float f3 = this.f49620l / bLiveGiftExtraDrawInfo.length;
        int i = 0;
        while (i < this.f49611c.getGiftNum()) {
            BLivePosition item = this.f49611c.getItem(i);
            int iM74151m = (int) (((long) this.f49616h) - (((long) i) * GiftTrayData.m74151m(this.f49611c)));
            if (iM74151m >= 0) {
                playPanelView = this;
                canvas2 = canvas;
                playPanelView.m73556e(canvas2, item, this.m73558g(iM74151m), f2, f3);
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
    public final void m73565n() {
        setGiftBitmap(BitmapFactory.decodeResource(getContext().getResources(), i3c0.f111024h2));
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        m73555d();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        ValueAnimator valueAnimator;
        super.onDraw(canvas);
        canvas.translate(this.f49621m, this.f49622n);
        BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo = this.f49611c;
        if (bLiveGiftExtraDrawInfo == null || vwb.m200296J(bLiveGiftExtraDrawInfo.coordinates) || (valueAnimator = this.f49615g) == null || !valueAnimator.isRunning()) {
            return;
        }
        if (this.f49616h < GiftTrayData.m74146f(this.f49611c)) {
            m73564m(canvas);
        } else {
            m73563l(canvas);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f49617i = i;
        this.f49618j = i2;
    }

    public void setGiftBitmap(Bitmap bitmap) {
        float f = this.f49612d;
        this.f49610b = Bitmap.createScaledBitmap(bitmap, (int) f, (int) f, false);
        this.f49613e = new Rect(0, 0, this.f49610b.getWidth(), this.f49610b.getHeight());
    }

    public PlayPanelView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f49612d = t100.m186890d(30.0f);
        m73559h();
    }

    public PlayPanelView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f49612d = t100.m186890d(30.0f);
        m73559h();
    }
}
