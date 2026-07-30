package com.p046p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import p147v.VDraweeView;
import p149l.djj;
import p149l.t100;

/* JADX INFO: loaded from: classes11.dex */
public class VoiceCardGiftIconView extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public int f53814o;

    /* JADX INFO: renamed from: p */
    public Paint f53815p;

    /* JADX INFO: renamed from: q */
    public int f53816q;

    /* JADX INFO: renamed from: r */
    public boolean f53817r;

    public VoiceCardGiftIconView(Context context, djj djjVar) {
        super(context, djjVar);
        this.f53814o = t100.m186890d(11.0f);
        this.f53816q = 2;
        this.f53817r = true;
    }

    @Override // p147v.VDraweeView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        float width;
        float height;
        super.onDraw(canvas);
        if (getWidth() == 0 || getHeight() == 0 || !this.f53817r) {
            return;
        }
        int i = this.f53816q;
        if (i == 1) {
            int i2 = this.f53814o;
            width = i2;
            height = i2;
        } else {
            width = 0.0f;
            height = 0.0f;
        }
        if (i == 2) {
            int width2 = getWidth();
            int i3 = this.f53814o;
            width = width2 - i3;
            height = i3;
        }
        if (this.f53816q == 1) {
            width = this.f53814o;
            height = getHeight() - this.f53814o;
        }
        if (this.f53816q == 4) {
            width = getWidth() - this.f53814o;
            height = getHeight() - this.f53814o;
        }
        canvas.drawCircle(width, height, this.f53814o, this.f53815p);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        Paint paint = new Paint(1);
        this.f53815p = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        setLayerType(1, null);
    }

    public void setClear(boolean z) {
        this.f53817r = z;
        invalidate();
    }

    /* JADX INFO: renamed from: u */
    public void m78708u(int i, int i2) {
        this.f53816q = i;
        this.f53814o = i2;
        invalidate();
    }

    public VoiceCardGiftIconView(Context context) {
        super(context);
        this.f53814o = t100.m186890d(11.0f);
        this.f53816q = 2;
        this.f53817r = true;
    }

    public VoiceCardGiftIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53814o = t100.m186890d(11.0f);
        this.f53816q = 2;
        this.f53817r = true;
    }

    public VoiceCardGiftIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53814o = t100.m186890d(11.0f);
        this.f53816q = 2;
        this.f53817r = true;
    }

    public VoiceCardGiftIconView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f53814o = t100.m186890d(11.0f);
        this.f53816q = 2;
        this.f53817r = true;
    }
}
