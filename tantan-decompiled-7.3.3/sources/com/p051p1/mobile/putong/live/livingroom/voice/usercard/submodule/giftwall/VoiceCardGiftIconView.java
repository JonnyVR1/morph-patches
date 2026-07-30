package com.p051p1.mobile.putong.live.livingroom.voice.usercard.submodule.giftwall;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.util.AttributeSet;
import p151v.VDraweeView;
import p153l.qa00;
import p153l.wlj;

/* JADX INFO: loaded from: classes10.dex */
public class VoiceCardGiftIconView extends VDraweeView {

    /* JADX INFO: renamed from: o */
    public int f54662o;

    /* JADX INFO: renamed from: p */
    public Paint f54663p;

    /* JADX INFO: renamed from: q */
    public int f54664q;

    /* JADX INFO: renamed from: r */
    public boolean f54665r;

    public VoiceCardGiftIconView(Context context, wlj wljVar) {
        super(context, wljVar);
        this.f54662o = qa00.m175859d(11.0f);
        this.f54664q = 2;
        this.f54665r = true;
    }

    @Override // p151v.VDraweeView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        float width;
        float height;
        super.onDraw(canvas);
        if (getWidth() == 0 || getHeight() == 0 || !this.f54665r) {
            return;
        }
        int i = this.f54664q;
        if (i == 1) {
            int i2 = this.f54662o;
            width = i2;
            height = i2;
        } else {
            width = 0.0f;
            height = 0.0f;
        }
        if (i == 2) {
            int width2 = getWidth();
            int i3 = this.f54662o;
            width = width2 - i3;
            height = i3;
        }
        if (this.f54664q == 1) {
            width = this.f54662o;
            height = getHeight() - this.f54662o;
        }
        if (this.f54664q == 4) {
            width = getWidth() - this.f54662o;
            height = getHeight() - this.f54662o;
        }
        canvas.drawCircle(width, height, this.f54662o, this.f54663p);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        Paint paint = new Paint(1);
        this.f54663p = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        setLayerType(1, null);
    }

    public void setClear(boolean z) {
        this.f54665r = z;
        invalidate();
    }

    /* JADX INFO: renamed from: u */
    public void m79891u(int i, int i2) {
        this.f54664q = i;
        this.f54662o = i2;
        invalidate();
    }

    public VoiceCardGiftIconView(Context context) {
        super(context);
        this.f54662o = qa00.m175859d(11.0f);
        this.f54664q = 2;
        this.f54665r = true;
    }

    public VoiceCardGiftIconView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f54662o = qa00.m175859d(11.0f);
        this.f54664q = 2;
        this.f54665r = true;
    }

    public VoiceCardGiftIconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f54662o = qa00.m175859d(11.0f);
        this.f54664q = 2;
        this.f54665r = true;
    }

    public VoiceCardGiftIconView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.f54662o = qa00.m175859d(11.0f);
        this.f54664q = 2;
        this.f54665r = true;
    }
}
