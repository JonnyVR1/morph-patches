package com.p000p1.mobile.putong.core.p001ui.messages.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.messages.base.MedialItemType;
import com.tantanapp.common.utils.NullChecker;
import l.a1c0;
import l.c4g0;
import l.e30;
import l.hkx;
import l.j760;
import l.mkd0;
import l.t100;
import l.w9j;
import v.VImage;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class MessageMediaItemImage extends VImage {

    /* JADX INFO: renamed from: d */
    public int f266d;

    /* JADX INFO: renamed from: e */
    public int f267e;

    /* JADX INFO: renamed from: f */
    public boolean f268f;

    /* JADX INFO: renamed from: g */
    public Paint f269g;

    /* JADX INFO: renamed from: h */
    public c4g0 f270h;

    public MessageMediaItemImage(Context context) {
        super(context);
        this.f268f = false;
        m378j();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    private void m378j() {
        Paint paint = new Paint();
        this.f269g = paint;
        paint.setAntiAlias(true);
        this.f269g.setColor(getResources().getColor(a1c0.p));
        this.f267e = t100.d(4.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k */
    public final /* synthetic */ void m379k(j760 j760Var) {
        this.f268f = ((Boolean) j760Var.b).booleanValue();
        invalidate();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public void m380l(boolean z, final MedialItemType medialItemType) {
        this.f268f = z;
        invalidate();
        if (z && (getContext() instanceof MessagesAct)) {
            hkx hkxVarB = getContext().f.e0().c0().g0().b();
            if (NullChecker.a(hkxVarB)) {
                this.f270h = getContext().duringCreated(hkxVarB.e().filter(new w9j() { // from class: l.brz
                    public final Object call(Object obj) {
                        return Boolean.valueOf(((j760) obj).a == medialItemType);
                    }
                })).subscribe(mkd0.G(new e30() { // from class: l.crz
                    public final void call(Object obj) {
                        this.f8924a.m379k((j760) obj);
                    }
                }));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super/*android.view.View*/.onDetachedFromWindow();
        mkd0.z(this.f270h);
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int i = this.f266d;
        if (i <= 0 || !this.f268f) {
            return;
        }
        int i2 = this.f267e;
        canvas.drawCircle(i - i2, i2, i2, this.f269g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onMeasure(int i, int i2) {
        super/*android.view.View*/.onMeasure(i, i2);
        this.f266d = getMeasuredWidth();
    }

    public MessageMediaItemImage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f268f = false;
        m378j();
    }

    public MessageMediaItemImage(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f268f = false;
        m378j();
    }
}
