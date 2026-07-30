package p028v;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import l.b9c0;
import l.t0c0;
import l.u1c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class VFrame_Shadow extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public int f12742a;

    /* JADX INFO: renamed from: b */
    public float f12743b;

    /* JADX INFO: renamed from: c */
    public float f12744c;

    /* JADX INFO: renamed from: d */
    public float f12745d;

    /* JADX INFO: renamed from: e */
    public float f12746e;

    /* JADX INFO: renamed from: f */
    public InterfaceC1335a f12747f;

    /* JADX INFO: renamed from: g */
    public boolean f12748g;

    /* JADX INFO: renamed from: v.VFrame_Shadow$a */
    public interface InterfaceC1335a {
        /* JADX INFO: renamed from: a */
        void m11534a();

        /* JADX INFO: renamed from: b */
        void m11535b();
    }

    public VFrame_Shadow(Context context) {
        super(context);
        m11531e(context, null);
    }

    /* JADX INFO: renamed from: b */
    public final Bitmap m11528b(int i, int i2, float f, float f2, float f3, float f4, int i3, int i4) {
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ALPHA_8);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        RectF rectF = new RectF(f2, f2, i - f2, i2 - f2);
        if (f4 > 0.0f) {
            rectF.top += f4;
            rectF.bottom -= f4;
        } else if (f4 < 0.0f) {
            rectF.top += Math.abs(f4);
            rectF.bottom -= Math.abs(f4);
        }
        if (f3 > 0.0f) {
            rectF.left += f3;
            rectF.right -= f3;
        } else if (f3 < 0.0f) {
            rectF.left += Math.abs(f3);
            rectF.right -= Math.abs(f3);
        }
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setColor(i4);
        paint.setStyle(Paint.Style.FILL);
        if (!isInEditMode()) {
            paint.setShadowLayer(f2, f3, f4, i3);
        }
        canvas.drawRoundRect(rectF, f, f, paint);
        return bitmapCreateBitmap;
    }

    /* JADX INFO: renamed from: c */
    public final TypedArray m11529c(Context context, AttributeSet attributeSet, int[] iArr) {
        return context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX INFO: renamed from: d */
    public final void m11530d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayM11529c = m11529c(context, attributeSet, b9c0.F3);
        if (typedArrayM11529c == null) {
            return;
        }
        try {
            this.f12744c = typedArrayM11529c.getDimension(b9c0.G3, getResources().getDimension(u1c0.l));
            this.f12743b = typedArrayM11529c.getDimension(b9c0.K3, getResources().getDimension(u1c0.m));
            this.f12745d = typedArrayM11529c.getDimension(b9c0.H3, 0.0f);
            this.f12746e = typedArrayM11529c.getDimension(b9c0.I3, 0.0f);
            this.f12742a = typedArrayM11529c.getColor(b9c0.J3, getResources().getColor(t0c0.C));
        } finally {
            typedArrayM11529c.recycle();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m11531e(Context context, AttributeSet attributeSet) {
        m11530d(context, attributeSet);
        int iAbs = (int) (this.f12743b + Math.abs(this.f12745d));
        int iAbs2 = (int) (this.f12743b + Math.abs(this.f12746e));
        setPadding(iAbs, iAbs2, iAbs, iAbs2);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean m11532f(View view) {
        this.f12748g = true;
        InterfaceC1335a interfaceC1335a = this.f12747f;
        if (interfaceC1335a != null) {
            interfaceC1335a.m11534a();
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m11533g(int i, int i2) {
        setBackground(new BitmapDrawable(getResources(), m11528b(i, i2, this.f12744c, this.f12743b, this.f12745d, this.f12746e, this.f12742a, 0)));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        m11533g(i, i2);
    }

    public void setOnLongPressListener(InterfaceC1335a interfaceC1335a) {
        this.f12747f = interfaceC1335a;
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.sok0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f7279a.m11532f(view);
            }
        });
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC1335a interfaceC1335a;
        super.setPressed(z);
        if (z) {
            return;
        }
        if (this.f12748g && (interfaceC1335a = this.f12747f) != null) {
            interfaceC1335a.m11535b();
        }
        this.f12748g = false;
    }

    public VFrame_Shadow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m11531e(context, attributeSet);
    }

    public VFrame_Shadow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m11531e(context, attributeSet);
    }
}
