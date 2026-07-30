package com.p051p1.mobile.putong.live.livingroom.increment.gift.drawgift;

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
import com.p051p1.mobile.putong.live.base.data.BLiveGiftExtraDrawInfo;
import com.p051p1.mobile.putong.live.base.data.BLivePosition;
import com.p051p1.mobile.putong.live.livingroom.increment.gift.tray.GiftTrayData;
import p153l.dhw;
import p153l.fo0;
import p153l.gt0;
import p153l.izs;
import p153l.jyb;
import p153l.obc0;
import p153l.qa00;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class PlayPanelView extends View {

    /* JADX INFO: renamed from: o */
    public static final int f50456o = qa00.m175859d(12.0f);

    /* JADX INFO: renamed from: a */
    public Paint f50457a;

    /* JADX INFO: renamed from: b */
    public Bitmap f50458b;

    /* JADX INFO: renamed from: c */
    public BLiveGiftExtraDrawInfo f50459c;

    /* JADX INFO: renamed from: d */
    public float f50460d;

    /* JADX INFO: renamed from: e */
    public Rect f50461e;

    /* JADX INFO: renamed from: f */
    public RectF f50462f;

    /* JADX INFO: renamed from: g */
    public ValueAnimator f50463g;

    /* JADX INFO: renamed from: h */
    public int f50464h;

    /* JADX INFO: renamed from: i */
    public int f50465i;

    /* JADX INFO: renamed from: j */
    public int f50466j;

    /* JADX INFO: renamed from: k */
    public int f50467k;

    /* JADX INFO: renamed from: l */
    public int f50468l;

    /* JADX INFO: renamed from: m */
    public int f50469m;

    /* JADX INFO: renamed from: n */
    public int f50470n;

    public PlayPanelView(Context context) {
        super(context);
        this.f50460d = qa00.m175859d(30.0f);
        m74742h();
    }

    /* JADX INFO: renamed from: d */
    public void m74738d() {
        ValueAnimator valueAnimator = this.f50463g;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return;
        }
        this.f50463g.cancel();
    }

    /* JADX INFO: renamed from: e */
    public final void m74739e(Canvas canvas, BLivePosition bLivePosition, float f, float f2, float f3) {
        int i = (int) (bLivePosition.f45278x * f2);
        float f4 = i;
        float f5 = (int) (bLivePosition.f45279y * f3);
        this.f50462f.set(f4 - f, f5 - f, f4 + f, f5 + f);
        canvas.drawBitmap(this.f50458b, this.f50461e, this.f50462f, this.f50457a);
    }

    /* JADX INFO: renamed from: f */
    public void m74740f(BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo, Runnable runnable) {
        this.f50459c = bLiveGiftExtraDrawInfo;
        this.f50464h = 0;
        ValueAnimator duration = ValueAnimator.ofInt(0, GiftTrayData.m75335n(bLiveGiftExtraDrawInfo)).setDuration(GiftTrayData.m75335n(bLiveGiftExtraDrawInfo));
        this.f50463g = duration;
        duration.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: l.rd80
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                this.f162294a.m74743i(valueAnimator);
            }
        });
        gt0.m132160f(this.f50463g, runnable);
        float f = bLiveGiftExtraDrawInfo.length / bLiveGiftExtraDrawInfo.width;
        int i = this.f50465i;
        int i2 = f50456o;
        this.f50467k = i - (i2 * 2);
        int i3 = (int) (i * f);
        this.f50468l = i3;
        this.f50469m = i2;
        this.f50470n = ((this.f50466j - i3) / 2) - i2;
        izs.m142854e("context_livingAct", bLiveGiftExtraDrawInfo.imgUrl).observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.sd80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f167389a.m74744j((Bitmap) obj);
            }
        }, new y20() { // from class: l.td80
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f173316a.m74745k((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: g */
    public final float m74741g(int i) {
        float f = this.f50460d / 2.0f;
        float f2 = i;
        if (f2 < 100.0f) {
            return (f2 / 200.0f) * 2.0f * 1.1f * f;
        }
        return f2 < 200.0f ? f * (1.1f - ((((f2 - 100.0f) * 0.100000024f) / 200.0f) * 2.0f)) : f;
    }

    /* JADX INFO: renamed from: h */
    public final void m74742h() {
        Paint paint = new Paint();
        this.f50457a = paint;
        paint.setAntiAlias(false);
        this.f50457a.setColor(Color.parseColor("#D81B60"));
        this.f50457a.setStyle(Paint.Style.STROKE);
        this.f50457a.setStrokeWidth(2.0f);
        this.f50462f = new RectF();
        m74748n();
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m74743i(ValueAnimator valueAnimator) {
        this.f50464h = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        invalidate();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m74744j(Bitmap bitmap) {
        if (bitmap == null) {
            m74748n();
        } else {
            setGiftBitmap(bitmap);
        }
        this.f50463g.start();
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m74745k(Throwable th) {
        m74748n();
        this.f50463g.start();
    }

    /* JADX INFO: renamed from: l */
    public final void m74746l(Canvas canvas) {
        float fM75329f = (this.f50464h - GiftTrayData.m75329f(this.f50459c)) / 400.0f;
        float f = (0.20000005f * fM75329f) + 1.0f;
        float f2 = this.f50467k;
        BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo = this.f50459c;
        float f3 = f2 / bLiveGiftExtraDrawInfo.width;
        float f4 = this.f50468l / bLiveGiftExtraDrawInfo.length;
        this.f50457a.setAlpha((int) (255.0f - (fM75329f * 255.0f)));
        canvas.scale(f, f, getWidth() / 2, getHeight() / 2);
        for (int i = 0; i < this.f50459c.getGiftNum(); i++) {
            m74739e(canvas, this.f50459c.getItem(i), this.f50460d / 2.0f, f3, f4);
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m74747m(Canvas canvas) {
        PlayPanelView playPanelView;
        Canvas canvas2;
        this.f50457a.setAlpha(255);
        float f = this.f50467k;
        BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo = this.f50459c;
        float f2 = f / bLiveGiftExtraDrawInfo.width;
        float f3 = this.f50468l / bLiveGiftExtraDrawInfo.length;
        int i = 0;
        while (i < this.f50459c.getGiftNum()) {
            BLivePosition item = this.f50459c.getItem(i);
            int iM75334m = (int) (((long) this.f50464h) - (((long) i) * GiftTrayData.m75334m(this.f50459c)));
            if (iM75334m >= 0) {
                playPanelView = this;
                canvas2 = canvas;
                playPanelView.m74739e(canvas2, item, this.m74741g(iM75334m), f2, f3);
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
    public final void m74748n() {
        setGiftBitmap(BitmapFactory.decodeResource(getContext().getResources(), obc0.f146352h2));
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        m74738d();
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        ValueAnimator valueAnimator;
        super.onDraw(canvas);
        canvas.translate(this.f50469m, this.f50470n);
        BLiveGiftExtraDrawInfo bLiveGiftExtraDrawInfo = this.f50459c;
        if (bLiveGiftExtraDrawInfo == null || jyb.m147479J(bLiveGiftExtraDrawInfo.coordinates) || (valueAnimator = this.f50463g) == null || !valueAnimator.isRunning()) {
            return;
        }
        if (this.f50464h < GiftTrayData.m75329f(this.f50459c)) {
            m74747m(canvas);
        } else {
            m74746l(canvas);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        this.f50465i = i;
        this.f50466j = i2;
    }

    public void setGiftBitmap(Bitmap bitmap) {
        float f = this.f50460d;
        this.f50458b = Bitmap.createScaledBitmap(bitmap, (int) f, (int) f, false);
        this.f50461e = new Rect(0, 0, this.f50458b.getWidth(), this.f50458b.getHeight());
    }

    public PlayPanelView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f50460d = qa00.m175859d(30.0f);
        m74742h();
    }

    public PlayPanelView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f50460d = qa00.m175859d(30.0f);
        m74742h();
    }
}
