package com.p000p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import l.djj;
import l.t100;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class VoiceCardGiftIconView extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public int f7420o;

    /* JADX INFO: renamed from: p */
    public Paint f7421p;

    /* JADX INFO: renamed from: q */
    public int f7422q;

    /* JADX INFO: renamed from: r */
    public boolean f7423r;

    public VoiceCardGiftIconView(Context context, djj djjVar) {
        super(context, djjVar);
        this.f7420o = t100.d(11.0f);
        this.f7422q = 2;
        this.f7423r = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        float width;
        float height;
        super.onDraw(canvas);
        if (getWidth() == 0 || getHeight() == 0 || !this.f7423r) {
            return;
        }
        int i = this.f7422q;
        if (i == 1) {
            int i2 = this.f7420o;
            width = i2;
            height = i2;
        } else {
            width = 0.0f;
            height = 0.0f;
        }
        if (i == 2) {
            int width2 = getWidth();
            int i3 = this.f7420o;
            width = width2 - i3;
            height = i3;
        }
        if (this.f7422q == 1) {
            width = this.f7420o;
            height = getHeight() - this.f7420o;
        }
        if (this.f7422q == 4) {
            width = getWidth() - this.f7420o;
            height = getHeight() - this.f7420o;
        }
        canvas.drawCircle(width, height, this.f7420o, this.f7421p);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        Paint paint = new Paint(1);
        this.f7421p = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        setLayerType(1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setClear(boolean z) {
        this.f7423r = z;
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: u */
    public void m8924u(int i, int i2) {
        this.f7422q = i;
        this.f7420o = i2;
        invalidate();
    }

    public VoiceCardGiftIconView(Context context) {
        super(context);
        this.f7420o = t100.d(11.0f);
        this.f7422q = 2;
        this.f7423r = true;
    }

    public VoiceCardGiftIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f7420o = t100.d(11.0f);
        this.f7422q = 2;
        this.f7423r = true;
    }

    public VoiceCardGiftIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f7420o = t100.d(11.0f);
        this.f7422q = 2;
        this.f7423r = true;
    }

    public VoiceCardGiftIconView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f7420o = t100.d(11.0f);
        this.f7422q = 2;
        this.f7423r = true;
    }
}
