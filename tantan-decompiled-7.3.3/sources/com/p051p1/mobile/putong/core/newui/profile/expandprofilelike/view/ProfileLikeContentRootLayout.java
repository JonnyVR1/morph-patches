package com.p051p1.mobile.putong.core.newui.profile.expandprofilelike.view;

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
import p153l.gra;
import p153l.qa00;

/* JADX INFO: loaded from: classes11.dex */
public class ProfileLikeContentRootLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f27275a;

    /* JADX INFO: renamed from: b */
    public float f27276b;

    /* JADX INFO: renamed from: c */
    public int f27277c;

    /* JADX INFO: renamed from: d */
    public Bitmap f27278d;

    /* JADX INFO: renamed from: e */
    public Paint f27279e;

    /* JADX INFO: renamed from: f */
    public Path f27280f;

    /* JADX INFO: renamed from: g */
    public PorterDuffXfermode f27281g;

    /* JADX INFO: renamed from: h */
    public float f27282h;

    /* JADX INFO: renamed from: i */
    public ArgbEvaluator f27283i;

    /* JADX INFO: renamed from: j */
    public Rect f27284j;

    /* JADX INFO: renamed from: k */
    public RectF f27285k;

    public ProfileLikeContentRootLayout(@NonNull Context context) {
        super(context);
        this.f27275a = gra.m131778z();
        this.f27276b = 0.0f;
        this.f27277c = -1;
        this.f27281g = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f27282h = qa00.f156328o;
        m44266a();
    }

    /* JADX INFO: renamed from: a */
    public final void m44266a() {
        Paint paint = new Paint();
        this.f27279e = paint;
        paint.setAntiAlias(true);
        this.f27283i = new ArgbEvaluator();
        setWillNotDraw(false);
        this.f27280f = new Path();
        this.f27284j = new Rect(0, 0, 0, 0);
        this.f27285k = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: b */
    public void m44267b(int i, int i2) {
        this.f27277c = i2;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), i);
        this.f27278d = bitmapDecodeResource;
        this.f27284j.set(0, 0, bitmapDecodeResource.getWidth(), this.f27278d.getHeight());
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f27275a) {
            this.f27279e.setColor(((Integer) this.f27283i.evaluate(this.f27276b, -1, Integer.valueOf(this.f27277c))).intValue());
            float measuredWidth = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            float f = this.f27282h;
            canvas.drawRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, f, f, this.f27279e);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        this.f27279e.setXfermode(null);
        float measuredWidth2 = getMeasuredWidth();
        float measuredHeight2 = getMeasuredHeight();
        float f2 = this.f27282h;
        canvas.drawRoundRect(0.0f, 0.0f, measuredWidth2, measuredHeight2, f2, f2, this.f27279e);
        float fMax = Math.max(getMeasuredWidth() / this.f27278d.getWidth(), getMeasuredHeight() / this.f27278d.getHeight());
        this.f27285k.set((getMeasuredWidth() / 2.0f) - ((this.f27278d.getWidth() * fMax) / 2.0f), (getMeasuredHeight() / 2.0f) - ((this.f27278d.getHeight() * fMax) / 2.0f), (getMeasuredWidth() / 2.0f) + ((this.f27278d.getWidth() * fMax) / 2.0f), (getMeasuredHeight() / 2.0f) + ((fMax * this.f27278d.getHeight()) / 2.0f));
        canvas.drawBitmap(this.f27278d, this.f27284j, this.f27285k, this.f27279e);
        this.f27279e.setColor(-1);
        this.f27280f.reset();
        this.f27280f.setFillType(Path.FillType.EVEN_ODD);
        Path path = this.f27280f;
        float measuredWidth3 = getMeasuredWidth() + 1;
        float measuredHeight3 = getMeasuredHeight() + 1;
        Path.Direction direction = Path.Direction.CW;
        path.addRect(-1.0f, -1.0f, measuredWidth3, measuredHeight3, direction);
        Path path2 = this.f27280f;
        float measuredWidth4 = getMeasuredWidth();
        float measuredHeight4 = getMeasuredHeight();
        float f3 = this.f27282h;
        path2.addRoundRect(0.0f, 0.0f, measuredWidth4, measuredHeight4, f3, f3, direction);
        this.f27279e.setXfermode(this.f27281g);
        this.f27280f.close();
        canvas.drawPath(this.f27280f, this.f27279e);
        canvas.restoreToCount(iSaveLayer);
    }

    public ProfileLikeContentRootLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27275a = gra.m131778z();
        this.f27276b = 0.0f;
        this.f27277c = -1;
        this.f27281g = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f27282h = qa00.f156328o;
        m44266a();
    }

    public ProfileLikeContentRootLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27275a = gra.m131778z();
        this.f27276b = 0.0f;
        this.f27277c = -1;
        this.f27281g = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f27282h = qa00.f156328o;
        m44266a();
    }
}
