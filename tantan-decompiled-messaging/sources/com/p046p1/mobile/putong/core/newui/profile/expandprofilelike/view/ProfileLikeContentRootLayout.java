package com.p046p1.mobile.putong.core.newui.profile.expandprofilelike.view;

import android.animation.ArgbEvaluator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import p149l.t100;
import p149l.upa;

/* JADX INFO: loaded from: classes11.dex */
public class ProfileLikeContentRootLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f26533a;

    /* JADX INFO: renamed from: b */
    public float f26534b;

    /* JADX INFO: renamed from: c */
    public int f26535c;

    /* JADX INFO: renamed from: d */
    public Bitmap f26536d;

    /* JADX INFO: renamed from: e */
    public Paint f26537e;

    /* JADX INFO: renamed from: f */
    public Path f26538f;

    /* JADX INFO: renamed from: g */
    public PorterDuffXfermode f26539g;

    /* JADX INFO: renamed from: h */
    public float f26540h;

    /* JADX INFO: renamed from: i */
    public ArgbEvaluator f26541i;

    /* JADX INFO: renamed from: j */
    public Rect f26542j;

    /* JADX INFO: renamed from: k */
    public RectF f26543k;

    public ProfileLikeContentRootLayout(@NonNull Context context) {
        super(context);
        this.f26533a = upa.m194847z();
        this.f26534b = 0.0f;
        this.f26535c = -1;
        this.f26539g = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f26540h = t100.f167266o;
        m43255a();
    }

    /* JADX INFO: renamed from: a */
    public final void m43255a() {
        Paint paint = new Paint();
        this.f26537e = paint;
        paint.setAntiAlias(true);
        this.f26541i = new ArgbEvaluator();
        setWillNotDraw(false);
        this.f26538f = new Path();
        this.f26542j = new Rect(0, 0, 0, 0);
        this.f26543k = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: b */
    public void m43256b(int i, int i2) {
        this.f26535c = i2;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), i);
        this.f26536d = bitmapDecodeResource;
        this.f26542j.set(0, 0, bitmapDecodeResource.getWidth(), this.f26536d.getHeight());
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f26533a) {
            this.f26537e.setColor(((Integer) this.f26541i.evaluate(this.f26534b, -1, Integer.valueOf(this.f26535c))).intValue());
            float measuredWidth = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            float f = this.f26540h;
            canvas.drawRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, f, f, this.f26537e);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        this.f26537e.setXfermode(null);
        float measuredWidth2 = getMeasuredWidth();
        float measuredHeight2 = getMeasuredHeight();
        float f2 = this.f26540h;
        canvas.drawRoundRect(0.0f, 0.0f, measuredWidth2, measuredHeight2, f2, f2, this.f26537e);
        float fMax = Math.max(getMeasuredWidth() / this.f26536d.getWidth(), getMeasuredHeight() / this.f26536d.getHeight());
        this.f26543k.set((getMeasuredWidth() / 2.0f) - ((this.f26536d.getWidth() * fMax) / 2.0f), (getMeasuredHeight() / 2.0f) - ((this.f26536d.getHeight() * fMax) / 2.0f), (getMeasuredWidth() / 2.0f) + ((this.f26536d.getWidth() * fMax) / 2.0f), (getMeasuredHeight() / 2.0f) + ((fMax * this.f26536d.getHeight()) / 2.0f));
        canvas.drawBitmap(this.f26536d, this.f26542j, this.f26543k, this.f26537e);
        this.f26537e.setColor(-1);
        this.f26538f.reset();
        this.f26538f.setFillType(Path.FillType.EVEN_ODD);
        Path path = this.f26538f;
        float measuredWidth3 = getMeasuredWidth() + 1;
        float measuredHeight3 = getMeasuredHeight() + 1;
        Path.Direction direction = Path.Direction.CW;
        path.addRect(-1.0f, -1.0f, measuredWidth3, measuredHeight3, direction);
        Path path2 = this.f26538f;
        float measuredWidth4 = getMeasuredWidth();
        float measuredHeight4 = getMeasuredHeight();
        float f3 = this.f26540h;
        path2.addRoundRect(0.0f, 0.0f, measuredWidth4, measuredHeight4, f3, f3, direction);
        this.f26537e.setXfermode(this.f26539g);
        this.f26538f.close();
        canvas.drawPath(this.f26538f, this.f26537e);
        canvas.restoreToCount(iSaveLayer);
    }

    public ProfileLikeContentRootLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26533a = upa.m194847z();
        this.f26534b = 0.0f;
        this.f26535c = -1;
        this.f26539g = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f26540h = t100.f167266o;
        m43255a();
    }

    public ProfileLikeContentRootLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26533a = upa.m194847z();
        this.f26534b = 0.0f;
        this.f26535c = -1;
        this.f26539g = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f26540h = t100.f167266o;
        m43255a();
    }
}
