package com.p000p1.mobile.putong.core.newui.home.card.expanded.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PaintFlagsDrawFilter;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Xfermode;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import l.t100;
import l.upa;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ExpandedOpAnimView extends SVGAnimationView {

    /* JADX INFO: renamed from: a */
    public boolean f1403a;

    /* JADX INFO: renamed from: b */
    public Paint f1404b;

    /* JADX INFO: renamed from: c */
    public Path f1405c;

    /* JADX INFO: renamed from: d */
    public PaintFlagsDrawFilter f1406d;

    /* JADX INFO: renamed from: e */
    public final Xfermode f1407e;

    public ExpandedOpAnimView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1403a = false;
        this.f1407e = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        m2317e();
    }

    /* JADX INFO: renamed from: e */
    public final void m2317e() {
        Paint paint = new Paint();
        this.f1404b = paint;
        paint.setAntiAlias(true);
        this.f1405c = new Path();
        this.f1406d = new PaintFlagsDrawFilter(0, 3);
    }

    /* JADX INFO: renamed from: f */
    public boolean m2318f() {
        return this.f1403a;
    }

    /* JADX INFO: renamed from: g */
    public void m2319g(String str) {
        m2320h(str, 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h */
    public void m2320h(String str, int i) {
        SVGALoader.with(getContext()).from(str).autoPlay(false).repeatCount(i).into(this);
    }

    /* JADX INFO: renamed from: i */
    public void m2321i() {
        if (this.f1403a) {
            return;
        }
        this.f1403a = true;
        startAnimation();
    }

    /* JADX INFO: renamed from: j */
    public void m2322j() {
        this.f1403a = false;
        stopAnimation(false);
        stepToFrame(0.0f, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (upa.s2()) {
            this.f1403a = false;
            stopAnimation(false);
            clearAnimation();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onDraw(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        canvas.setDrawFilter(this.f1406d);
        super/*android.view.View*/.onDraw(canvas);
        this.f1405c.reset();
        this.f1405c.setFillType(Path.FillType.EVEN_ODD);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Path.Direction direction = Path.Direction.CW;
        this.f1405c.addRect(-1.0f, -1.0f, measuredWidth + 1, measuredHeight + 1, direction);
        int i = t100.o;
        this.f1405c.addRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, i, i, direction);
        this.f1405c.close();
        this.f1404b.setXfermode(this.f1407e);
        canvas.drawPath(this.f1405c, this.f1404b);
        this.f1404b.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    public ExpandedOpAnimView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1403a = false;
        this.f1407e = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        m2317e();
    }

    public ExpandedOpAnimView(@NonNull Context context) {
        super(context);
        this.f1403a = false;
        this.f1407e = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        m2317e();
    }
}
