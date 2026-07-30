package com.p000p1.mobile.putong.core.newui.profile.expandprofilelike.view;

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
import l.t100;
import l.upa;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ProfileLikeContentRootLayout extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public boolean f5311a;

    /* JADX INFO: renamed from: b */
    public float f5312b;

    /* JADX INFO: renamed from: c */
    public int f5313c;

    /* JADX INFO: renamed from: d */
    public Bitmap f5314d;

    /* JADX INFO: renamed from: e */
    public Paint f5315e;

    /* JADX INFO: renamed from: f */
    public Path f5316f;

    /* JADX INFO: renamed from: g */
    public PorterDuffXfermode f5317g;

    /* JADX INFO: renamed from: h */
    public float f5318h;

    /* JADX INFO: renamed from: i */
    public ArgbEvaluator f5319i;

    /* JADX INFO: renamed from: j */
    public Rect f5320j;

    /* JADX INFO: renamed from: k */
    public RectF f5321k;

    public ProfileLikeContentRootLayout(@NonNull Context context) {
        super(context);
        this.f5311a = upa.z();
        this.f5312b = 0.0f;
        this.f5313c = -1;
        this.f5317g = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f5318h = t100.o;
        m7476a();
    }

    /* JADX INFO: renamed from: a */
    public final void m7476a() {
        Paint paint = new Paint();
        this.f5315e = paint;
        paint.setAntiAlias(true);
        this.f5319i = new ArgbEvaluator();
        setWillNotDraw(false);
        this.f5316f = new Path();
        this.f5320j = new Rect(0, 0, 0, 0);
        this.f5321k = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
    }

    /* JADX INFO: renamed from: b */
    public void m7477b(int i, int i2) {
        this.f5313c = i2;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getResources(), i);
        this.f5314d = bitmapDecodeResource;
        this.f5320j.set(0, 0, bitmapDecodeResource.getWidth(), this.f5314d.getHeight());
    }

    @Override // android.view.View
    public void onDraw(@NonNull Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f5311a) {
            this.f5315e.setColor(((Integer) this.f5319i.evaluate(this.f5312b, -1, Integer.valueOf(this.f5313c))).intValue());
            float measuredWidth = getMeasuredWidth();
            float measuredHeight = getMeasuredHeight();
            float f = this.f5318h;
            canvas.drawRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, f, f, this.f5315e);
            return;
        }
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        this.f5315e.setXfermode(null);
        float measuredWidth2 = getMeasuredWidth();
        float measuredHeight2 = getMeasuredHeight();
        float f2 = this.f5318h;
        canvas.drawRoundRect(0.0f, 0.0f, measuredWidth2, measuredHeight2, f2, f2, this.f5315e);
        float fMax = Math.max(getMeasuredWidth() / this.f5314d.getWidth(), getMeasuredHeight() / this.f5314d.getHeight());
        this.f5321k.set((getMeasuredWidth() / 2.0f) - ((this.f5314d.getWidth() * fMax) / 2.0f), (getMeasuredHeight() / 2.0f) - ((this.f5314d.getHeight() * fMax) / 2.0f), (getMeasuredWidth() / 2.0f) + ((this.f5314d.getWidth() * fMax) / 2.0f), (getMeasuredHeight() / 2.0f) + ((fMax * this.f5314d.getHeight()) / 2.0f));
        canvas.drawBitmap(this.f5314d, this.f5320j, this.f5321k, this.f5315e);
        this.f5315e.setColor(-1);
        this.f5316f.reset();
        this.f5316f.setFillType(Path.FillType.EVEN_ODD);
        Path path = this.f5316f;
        float measuredWidth3 = getMeasuredWidth() + 1;
        float measuredHeight3 = getMeasuredHeight() + 1;
        Path.Direction direction = Path.Direction.CW;
        path.addRect(-1.0f, -1.0f, measuredWidth3, measuredHeight3, direction);
        Path path2 = this.f5316f;
        float measuredWidth4 = getMeasuredWidth();
        float measuredHeight4 = getMeasuredHeight();
        float f3 = this.f5318h;
        path2.addRoundRect(0.0f, 0.0f, measuredWidth4, measuredHeight4, f3, f3, direction);
        this.f5315e.setXfermode(this.f5317g);
        this.f5316f.close();
        canvas.drawPath(this.f5316f, this.f5315e);
        canvas.restoreToCount(iSaveLayer);
    }

    public ProfileLikeContentRootLayout(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5311a = upa.z();
        this.f5312b = 0.0f;
        this.f5313c = -1;
        this.f5317g = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f5318h = t100.o;
        m7476a();
    }

    public ProfileLikeContentRootLayout(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5311a = upa.z();
        this.f5312b = 0.0f;
        this.f5313c = -1;
        this.f5317g = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f5318h = t100.o;
        m7476a();
    }
}
