package com.p051p1.mobile.putong.core.newui.home.card.expanded.view;

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
import p153l.gra;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedOpAnimView extends SVGAnimationView {

    /* JADX INFO: renamed from: a */
    public boolean f23367a;

    /* JADX INFO: renamed from: b */
    public Paint f23368b;

    /* JADX INFO: renamed from: c */
    public Path f23369c;

    /* JADX INFO: renamed from: d */
    public PaintFlagsDrawFilter f23370d;

    /* JADX INFO: renamed from: e */
    public final Xfermode f23371e;

    public ExpandedOpAnimView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23367a = false;
        this.f23371e = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        m39342e();
    }

    /* JADX INFO: renamed from: e */
    public final void m39342e() {
        Paint paint = new Paint();
        this.f23368b = paint;
        paint.setAntiAlias(true);
        this.f23369c = new Path();
        this.f23370d = new PaintFlagsDrawFilter(0, 3);
    }

    /* JADX INFO: renamed from: f */
    public boolean m39343f() {
        return this.f23367a;
    }

    /* JADX INFO: renamed from: g */
    public void m39344g(String str) {
        m39345h(str, 0);
    }

    /* JADX INFO: renamed from: h */
    public void m39345h(String str, int i) {
        SVGALoader.with(getContext()).from(str).autoPlay(false).repeatCount(i).into(this);
    }

    /* JADX INFO: renamed from: i */
    public void m39346i() {
        if (this.f23367a) {
            return;
        }
        this.f23367a = true;
        startAnimation();
    }

    /* JADX INFO: renamed from: j */
    public void m39347j() {
        this.f23367a = false;
        stopAnimation(false);
        stepToFrame(0.0f, false);
    }

    @Override // com.tantan.library.svga.SVGAnimationView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (gra.m131746s2()) {
            this.f23367a = false;
            stopAnimation(false);
            clearAnimation();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        canvas.setDrawFilter(this.f23370d);
        super.onDraw(canvas);
        this.f23369c.reset();
        this.f23369c.setFillType(Path.FillType.EVEN_ODD);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Path.Direction direction = Path.Direction.CW;
        this.f23369c.addRect(-1.0f, -1.0f, measuredWidth + 1, measuredHeight + 1, direction);
        int i = qa00.f156328o;
        this.f23369c.addRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, i, i, direction);
        this.f23369c.close();
        this.f23368b.setXfermode(this.f23371e);
        canvas.drawPath(this.f23369c, this.f23368b);
        this.f23368b.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    public ExpandedOpAnimView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23367a = false;
        this.f23371e = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        m39342e();
    }

    public ExpandedOpAnimView(@NonNull Context context) {
        super(context);
        this.f23367a = false;
        this.f23371e = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        m39342e();
    }
}
