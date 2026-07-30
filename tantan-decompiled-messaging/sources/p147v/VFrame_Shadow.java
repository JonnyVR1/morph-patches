package p147v;

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
import p149l.b9c0;
import p149l.t0c0;
import p149l.u1c0;

/* JADX INFO: loaded from: classes3.dex */
public class VFrame_Shadow extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public int f209117a;

    /* JADX INFO: renamed from: b */
    public float f209118b;

    /* JADX INFO: renamed from: c */
    public float f209119c;

    /* JADX INFO: renamed from: d */
    public float f209120d;

    /* JADX INFO: renamed from: e */
    public float f209121e;

    /* JADX INFO: renamed from: f */
    public InterfaceC22542a f209122f;

    /* JADX INFO: renamed from: g */
    public boolean f209123g;

    /* JADX INFO: renamed from: v.VFrame_Shadow$a */
    public interface InterfaceC22542a {
        /* JADX INFO: renamed from: a */
        void mo52381a();

        /* JADX INFO: renamed from: b */
        void mo52382b();
    }

    public VFrame_Shadow(Context context) {
        super(context);
        m223054e(context, null);
    }

    /* JADX INFO: renamed from: b */
    public final Bitmap m223051b(int i, int i2, float f, float f2, float f3, float f4, int i3, int i4) {
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
    public final TypedArray m223052c(Context context, AttributeSet attributeSet, int[] iArr) {
        return context.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    /* JADX INFO: renamed from: d */
    public final void m223053d(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayM223052c = m223052c(context, attributeSet, b9c0.f74258F3);
        if (typedArrayM223052c == null) {
            return;
        }
        try {
            this.f209119c = typedArrayM223052c.getDimension(b9c0.f74265G3, getResources().getDimension(u1c0.f172998l));
            this.f209118b = typedArrayM223052c.getDimension(b9c0.f74293K3, getResources().getDimension(u1c0.f172999m));
            this.f209120d = typedArrayM223052c.getDimension(b9c0.f74272H3, 0.0f);
            this.f209121e = typedArrayM223052c.getDimension(b9c0.f74279I3, 0.0f);
            this.f209117a = typedArrayM223052c.getColor(b9c0.f74286J3, getResources().getColor(t0c0.f167145C));
        } finally {
            typedArrayM223052c.recycle();
        }
    }

    /* JADX INFO: renamed from: e */
    public final void m223054e(Context context, AttributeSet attributeSet) {
        m223053d(context, attributeSet);
        int iAbs = (int) (this.f209118b + Math.abs(this.f209120d));
        int iAbs2 = (int) (this.f209118b + Math.abs(this.f209121e));
        setPadding(iAbs, iAbs2, iAbs, iAbs2);
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ boolean m223055f(View view) {
        this.f209123g = true;
        InterfaceC22542a interfaceC22542a = this.f209122f;
        if (interfaceC22542a != null) {
            interfaceC22542a.mo52381a();
        }
        return true;
    }

    /* JADX INFO: renamed from: g */
    public final void m223056g(int i, int i2) {
        setBackground(new BitmapDrawable(getResources(), m223051b(i, i2, this.f209119c, this.f209118b, this.f209120d, this.f209121e, this.f209117a, 0)));
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (i <= 0 || i2 <= 0) {
            return;
        }
        m223056g(i, i2);
    }

    public void setOnLongPressListener(InterfaceC22542a interfaceC22542a) {
        this.f209122f = interfaceC22542a;
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.sok0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f165702a.m223055f(view);
            }
        });
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        InterfaceC22542a interfaceC22542a;
        super.setPressed(z);
        if (z) {
            return;
        }
        if (this.f209123g && (interfaceC22542a = this.f209122f) != null) {
            interfaceC22542a.mo52382b();
        }
        this.f209123g = false;
    }

    public VFrame_Shadow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m223054e(context, attributeSet);
    }

    public VFrame_Shadow(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m223054e(context, attributeSet);
    }
}
