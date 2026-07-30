package com.p051p1.mobile.putong.core.p058ui.messages.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.base.MedialItemType;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p153l.etx;
import p153l.g9c0;
import p153l.kcg0;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.y20;

/* JADX INFO: loaded from: classes4.dex */
public class MessageMediaItemImage extends VImage {

    /* JADX INFO: renamed from: d */
    public int f33292d;

    /* JADX INFO: renamed from: e */
    public int f33293e;

    /* JADX INFO: renamed from: f */
    public boolean f33294f;

    /* JADX INFO: renamed from: g */
    public Paint f33295g;

    /* JADX INFO: renamed from: h */
    public kcg0 f33296h;

    public MessageMediaItemImage(Context context) {
        super(context);
        this.f33294f = false;
        m51139j();
    }

    /* JADX INFO: renamed from: j */
    private void m51139j() {
        Paint paint = new Paint();
        this.f33295g = paint;
        paint.setAntiAlias(true);
        this.f33295g.setColor(getResources().getColor(g9c0.f102826p));
        this.f33293e = qa00.m175859d(4.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m51140k(pf60 pf60Var) {
        this.f33294f = ((Boolean) pf60Var.f152157b).booleanValue();
        invalidate();
    }

    /* JADX INFO: renamed from: l */
    public void m51141l(boolean z, final MedialItemType medialItemType) {
        this.f33294f = z;
        invalidate();
        if (z && (getContext() instanceof MessagesAct)) {
            etx etxVarMo125458b = ((MessagesAct) getContext()).f32488f.m143372e0().mo50155d0().m143374g0().mo125458b();
            if (NullChecker.m82486a(etxVarMo125458b)) {
                this.f33296h = ((MessagesAct) getContext()).duringCreated(etxVarMo125458b.m122507e().filter(new qcj() { // from class: l.yzz
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((pf60) obj).f152156a == medialItemType);
                    }
                })).subscribe(psd0.m173596G(new y20() { // from class: l.zzz
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f206762a.m51140k((pf60) obj);
                    }
                }));
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        psd0.m173633z(this.f33296h);
    }

    @Override // p151v.VImage, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.f33292d;
        if (i <= 0 || !this.f33294f) {
            return;
        }
        int i2 = this.f33293e;
        canvas.drawCircle(i - i2, i2, i2, this.f33295g);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f33292d = getMeasuredWidth();
    }

    public MessageMediaItemImage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f33294f = false;
        m51139j();
    }

    public MessageMediaItemImage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f33294f = false;
        m51139j();
    }
}
