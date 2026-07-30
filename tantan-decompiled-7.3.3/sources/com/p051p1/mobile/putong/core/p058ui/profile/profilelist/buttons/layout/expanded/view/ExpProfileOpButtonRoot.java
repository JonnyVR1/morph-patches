package com.p051p1.mobile.putong.core.p058ui.profile.profilelist.buttons.layout.expanded.view;

import android.content.Context;
import android.content.res.TypedArray;
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
import p153l.dbc0;
import p153l.khc0;

/* JADX INFO: loaded from: classes4.dex */
public class ExpProfileOpButtonRoot extends FrameLayout {

    /* JADX INFO: renamed from: h */
    public static Bitmap f34728h;

    /* JADX INFO: renamed from: a */
    public Paint f34729a;

    /* JADX INFO: renamed from: b */
    public Path f34730b;

    /* JADX INFO: renamed from: c */
    public Rect f34731c;

    /* JADX INFO: renamed from: d */
    public RectF f34732d;

    /* JADX INFO: renamed from: e */
    public PorterDuffXfermode f34733e;

    /* JADX INFO: renamed from: f */
    public boolean f34734f;

    /* JADX INFO: renamed from: g */
    public int f34735g;

    public ExpProfileOpButtonRoot(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f34733e = new PorterDuffXfermode(PorterDuff.Mode.CLEAR);
        this.f34734f = true;
        this.f34735g = -36854;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, khc0.f126835r0, i, 0);
            this.f34734f = typedArrayObtainStyledAttributes.getBoolean(khc0.f126841t0, true);
            this.f34735g = typedArrayObtainStyledAttributes.getColor(khc0.f126838s0, -36854);
            typedArrayObtainStyledAttributes.recycle();
        }
        m53587b();
    }

    /* JADX INFO: renamed from: a */
    public final void m53586a() {
        if (f34728h == null) {
            f34728h = BitmapFactory.decodeResource(getResources(), dbc0.f87257nm);
        }
    }

    /* JADX INFO: renamed from: b */
    public final void m53587b() {
        setWillNotDraw(false);
        Paint paint = new Paint();
        this.f34729a = paint;
        paint.setAntiAlias(true);
        this.f34731c = new Rect(0, 0, 0, 0);
        this.f34732d = new RectF(0.0f, 0.0f, 0.0f, 0.0f);
        this.f34730b = new Path();
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.f34729a.setXfermode(null);
        this.f34729a.setColor(this.f34735g);
        this.f34729a.setShadowLayer(10.0f, 0.0f, 0.0f, -2040358);
        canvas.drawRoundRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), getMeasuredHeight() / 2.0f, getMeasuredHeight() / 2.0f, this.f34729a);
        if (this.f34734f) {
            return;
        }
        m53586a();
        int iSaveLayer = canvas.saveLayer(0.0f, 0.0f, getWidth(), getHeight(), null, 31);
        int iMin = Math.min(f34728h.getWidth(), (getMeasuredWidth() * f34728h.getHeight()) / getMeasuredHeight());
        this.f34731c.set(0, 0, iMin, f34728h.getHeight());
        this.f34732d.set(0.0f, 0.0f, (iMin * getMeasuredHeight()) / f34728h.getHeight(), getMeasuredHeight());
        canvas.drawBitmap(f34728h, this.f34731c, this.f34732d, this.f34729a);
        this.f34729a.setColor(-1);
        this.f34730b.reset();
        this.f34730b.setFillType(Path.FillType.EVEN_ODD);
        Path path = this.f34730b;
        float measuredWidth = getMeasuredWidth() + 1;
        float measuredHeight = getMeasuredHeight() + 1;
        Path.Direction direction = Path.Direction.CW;
        path.addRect(-1.0f, -1.0f, measuredWidth, measuredHeight, direction);
        this.f34730b.addRoundRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), getMeasuredHeight() / 2.0f, getMeasuredHeight() / 2.0f, direction);
        this.f34729a.setXfermode(this.f34733e);
        this.f34730b.close();
        canvas.drawPath(this.f34730b, this.f34729a);
        canvas.restoreToCount(iSaveLayer);
    }

    public ExpProfileOpButtonRoot(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ExpProfileOpButtonRoot(@NonNull Context context) {
        this(context, null);
    }
}
