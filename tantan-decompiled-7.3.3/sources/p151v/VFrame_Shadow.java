package p151v;

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
import p153l.bac0;
import p153l.hhc0;
import p153l.z8c0;

/* JADX INFO: loaded from: classes3.dex */
public class VFrame_Shadow extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public int f210039a;

    /* JADX INFO: renamed from: b */
    public float f210040b;

    /* JADX INFO: renamed from: c */
    public float f210041c;

    /* JADX INFO: renamed from: d */
    public float f210042d;

    /* JADX INFO: renamed from: e */
    public float f210043e;

    /* JADX INFO: renamed from: f */
    public InterfaceC22657a f210044f;

    /* JADX INFO: renamed from: g */
    public boolean f210045g;

    /* JADX INFO: renamed from: v.VFrame_Shadow$a */
    public interface InterfaceC22657a {
        /* JADX INFO: renamed from: a */
        void mo53564a();

        /* JADX INFO: renamed from: b */
        void mo53565b();
    }

    public VFrame_Shadow(Context context) {
        super(context);
        m224300e(context, null);
    }

    /* JADX INFO: renamed from: b */
    public final Bitmap m224297b(int i, int i2, float f, float f2, float f3, float f4, int i3, int i4) {
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
    public final TypedArray m224298c(Context context, AttributeSet attributeSet, int[] iArr) {
        return context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX INFO: renamed from: d */
    public final void m224299d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayM224298c = m224298c(context, attributeSet, hhc0.f109567F3);
        if (typedArrayM224298c == null) {
            return;
        }
        try {
            this.f210041c = typedArrayM224298c.getDimension(hhc0.f109574G3, getResources().getDimension(bac0.f75673l));
            this.f210040b = typedArrayM224298c.getDimension(hhc0.f109602K3, getResources().getDimension(bac0.f75674m));
            this.f210042d = typedArrayM224298c.getDimension(hhc0.f109581H3, 0.0f);
            this.f210043e = typedArrayM224298c.getDimension(hhc0.f109588I3, 0.0f);
            this.f210039a = typedArrayM224298c.getColor(hhc0.f109595J3, getResources().getColor(z8c0.f203336C));
        } finally {
            typedArrayM224298c.recycle();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m224300e(Context context, AttributeSet attributeSet) {
        m224299d(context, attributeSet);
        int iAbs = (int) (this.f210040b + Math.abs(this.f210042d));
        int iAbs2 = (int) (this.f210040b + Math.abs(this.f210043e));
        setPadding(iAbs, iAbs2, iAbs, iAbs2);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean m224301f(View view) {
        this.f210045g = true;
        InterfaceC22657a interfaceC22657a = this.f210044f;
        if (interfaceC22657a != null) {
            interfaceC22657a.mo53564a();
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m224302g(int i, int i2) {
        setBackground(new BitmapDrawable(getResources(), m224297b(i, i2, this.f210041c, this.f210040b, this.f210042d, this.f210043e, this.f210039a, 0)));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        m224302g(i, i2);
    }

    public void setOnLongPressListener(InterfaceC22657a interfaceC22657a) {
        this.f210044f = interfaceC22657a;
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.yxk0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f201987a.m224301f(view);
            }
        });
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC22657a interfaceC22657a;
        super.setPressed(z);
        if (z) {
            return;
        }
        if (this.f210045g && (interfaceC22657a = this.f210044f) != null) {
            interfaceC22657a.mo53565b();
        }
        this.f210045g = false;
    }

    public VFrame_Shadow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m224300e(context, attributeSet);
    }

    public VFrame_Shadow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m224300e(context, attributeSet);
    }
}
