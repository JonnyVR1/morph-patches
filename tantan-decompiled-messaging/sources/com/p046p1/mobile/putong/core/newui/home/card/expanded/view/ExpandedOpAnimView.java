package com.p046p1.mobile.putong.core.newui.home.card.expanded.view;

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
import p149l.t100;
import p149l.upa;

/* JADX INFO: loaded from: classes11.dex */
public class ExpandedOpAnimView extends SVGAnimationView {

    /* JADX INFO: renamed from: a */
    public boolean f22625a;

    /* JADX INFO: renamed from: b */
    public Paint f22626b;

    /* JADX INFO: renamed from: c */
    public Path f22627c;

    /* JADX INFO: renamed from: d */
    public PaintFlagsDrawFilter f22628d;

    /* JADX INFO: renamed from: e */
    public final Xfermode f22629e;

    public ExpandedOpAnimView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f22625a = false;
        this.f22629e = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        m38339e();
    }

    /* JADX INFO: renamed from: e */
    public final void m38339e() {
        Paint paint = new Paint();
        this.f22626b = paint;
        paint.setAntiAlias(true);
        this.f22627c = new Path();
        this.f22628d = new PaintFlagsDrawFilter(0, 3);
    }

    /* JADX INFO: renamed from: f */
    public boolean m38340f() {
        return this.f22625a;
    }

    /* JADX INFO: renamed from: g */
    public void m38341g(String str) {
        m38342h(str, 0);
    }

    /* JADX INFO: renamed from: h */
    public void m38342h(String str, int i) {
        SVGALoader.with(getContext()).from(str).autoPlay(false).repeatCount(i).into(this);
    }

    /* JADX INFO: renamed from: i */
    public void m38343i() {
        if (this.f22625a) {
            return;
        }
        this.f22625a = true;
        startAnimation();
    }

    /* JADX INFO: renamed from: j */
    public void m38344j() {
        this.f22625a = false;
        stopAnimation(false);
        stepToFrame(0.0f, false);
    }

    @Override // com.tantan.library.svga.SVGAnimationView, android.widget.ImageView, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (upa.m194815s2()) {
            this.f22625a = false;
            stopAnimation(false);
            clearAnimation();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        canvas.setDrawFilter(this.f22628d);
        super.onDraw(canvas);
        this.f22627c.reset();
        this.f22627c.setFillType(Path.FillType.EVEN_ODD);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        Path.Direction direction = Path.Direction.CW;
        this.f22627c.addRect(-1.0f, -1.0f, measuredWidth + 1, measuredHeight + 1, direction);
        int i = t100.f167266o;
        this.f22627c.addRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, i, i, direction);
        this.f22627c.close();
        this.f22626b.setXfermode(this.f22629e);
        canvas.drawPath(this.f22627c, this.f22626b);
        this.f22626b.setXfermode(null);
        canvas.restoreToCount(iSaveLayer);
    }

    public ExpandedOpAnimView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22625a = false;
        this.f22629e = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        m38339e();
    }

    public ExpandedOpAnimView(@NonNull Context context) {
        super(context);
        this.f22625a = false;
        this.f22629e = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        m38339e();
    }
}
