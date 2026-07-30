package com.p046p1.mobile.putong.core.p053ui.messages.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.base.MedialItemType;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p149l.a1c0;
import p149l.c4g0;
import p149l.e30;
import p149l.hkx;
import p149l.j760;
import p149l.mkd0;
import p149l.t100;
import p149l.w9j;

/* JADX INFO: loaded from: classes4.dex */
public class MessageMediaItemImage extends VImage {

    /* JADX INFO: renamed from: d */
    public int f32444d;

    /* JADX INFO: renamed from: e */
    public int f32445e;

    /* JADX INFO: renamed from: f */
    public boolean f32446f;

    /* JADX INFO: renamed from: g */
    public Paint f32447g;

    /* JADX INFO: renamed from: h */
    public c4g0 f32448h;

    public MessageMediaItemImage(Context context) {
        super(context);
        this.f32446f = false;
        m49956j();
    }

    /* JADX INFO: renamed from: j */
    private void m49956j() {
        Paint paint = new Paint();
        this.f32447g = paint;
        paint.setAntiAlias(true);
        this.f32447g.setColor(getResources().getColor(a1c0.f67162p));
        this.f32445e = t100.m186890d(4.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m49957k(j760 j760Var) {
        this.f32446f = ((Boolean) j760Var.f116565b).booleanValue();
        invalidate();
    }

    /* JADX INFO: renamed from: l */
    public void m49958l(boolean z, final MedialItemType medialItemType) {
        this.f32446f = z;
        invalidate();
        if (z && (getContext() instanceof MessagesAct)) {
            hkx hkxVarMo134703b = ((MessagesAct) getContext()).f31640f.m156455e0().mo48971c0().m156457g0().mo134703b();
            if (NullChecker.m81303a(hkxVarMo134703b)) {
                this.f32448h = ((MessagesAct) getContext()).duringCreated(hkxVarMo134703b.m131604e().filter(new w9j() { // from class: l.brz
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((j760) obj).f116564a == medialItemType);
                    }
                })).subscribe(mkd0.m154955G(new e30() { // from class: l.crz
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f82312a.m49957k((j760) obj);
                    }
                }));
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.m154992z(this.f32448h);
    }

    @Override // p147v.VImage, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.f32444d;
        if (i <= 0 || !this.f32446f) {
            return;
        }
        int i2 = this.f32445e;
        canvas.drawCircle(i - i2, i2, i2, this.f32447g);
    }

    @Override // android.widget.ImageView, android.view.View
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f32444d = getMeasuredWidth();
    }

    public MessageMediaItemImage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f32446f = false;
        m49956j();
    }

    public MessageMediaItemImage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f32446f = false;
        m49956j();
    }
}
