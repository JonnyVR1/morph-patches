package p003l;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import l.gbl0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class jdm extends Drawable {

    /* JADX INFO: renamed from: a */
    public final Paint f5298a;

    /* JADX INFO: renamed from: b */
    public final Paint f5299b;

    /* JADX INFO: renamed from: c */
    public final int f5300c;

    /* JADX INFO: renamed from: d */
    public final int f5301d;

    /* JADX INFO: renamed from: e */
    public final int f5302e;

    /* JADX INFO: renamed from: f */
    public final int f5303f;

    /* JADX INFO: renamed from: g */
    public final int f5304g;

    /* JADX INFO: renamed from: h */
    public final int[] f5305h;

    /* JADX INFO: renamed from: i */
    public RectF f5306i;

    /* JADX INFO: renamed from: j */
    public LinearGradient f5307j;

    /* JADX INFO: renamed from: l.jdm$a */
    public static class C3354a {

        /* JADX INFO: renamed from: a */
        public int f5308a = 1;

        /* JADX INFO: renamed from: b */
        public int f5309b = 12;

        /* JADX INFO: renamed from: c */
        public int f5310c = Color.parseColor("#4d000000");

        /* JADX INFO: renamed from: d */
        public int f5311d = 18;

        /* JADX INFO: renamed from: e */
        public int f5312e = 0;

        /* JADX INFO: renamed from: f */
        public int f5313f = 0;

        /* JADX INFO: renamed from: g */
        public int[] f5314g = {0};

        /* JADX INFO: renamed from: a */
        public jdm m7400a() {
            return new jdm(this.f5308a, this.f5314g, this.f5309b, this.f5310c, this.f5311d, this.f5312e, this.f5313f);
        }

        /* JADX INFO: renamed from: b */
        public C3354a m7401b(int i) {
            this.f5314g[0] = i;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C3354a m7402c(int i) {
            this.f5312e = i;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C3354a m7403d(int i) {
            this.f5313f = i;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C3354a m7404e(int i) {
            this.f5310c = i;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C3354a m7405f(int i) {
            this.f5311d = i;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C3354a m7406g(int i) {
            this.f5309b = i;
            return this;
        }
    }

    public jdm(int i, int[] iArr, int i2, int i3, int i4, int i5, int i6) {
        this.f5301d = i;
        this.f5305h = iArr;
        this.f5302e = i2;
        this.f5300c = i4;
        this.f5303f = i5;
        this.f5304g = i6;
        Paint paint = new Paint();
        this.f5298a = paint;
        paint.setColor(0);
        paint.setAntiAlias(true);
        paint.setShadowLayer(i4, i5, i6, i3);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        Paint paint2 = new Paint();
        this.f5299b = paint2;
        paint2.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: a */
    public static void m7398a(View view, int i, int i2) {
        int paddingBottom = view.getPaddingBottom();
        int paddingTop = view.getPaddingTop();
        gbl0.z0(view, view.getPaddingLeft() - i, paddingTop - i2, view.getPaddingRight() + i, paddingBottom + i2);
    }

    /* JADX INFO: renamed from: b */
    public static void m7399b(View view, int i, int i2, int i3, int i4, int i5, int i6) {
        jdm jdmVarM7400a = new C3354a().m7401b(i).m7406g(i2).m7404e(i3).m7405f(i4).m7402c(i5).m7403d(i6).m7400a();
        view.setLayerType(1, null);
        m7398a(view, i5, i6);
        gbl0.m0(view, jdmVarM7400a);
        view.setLayerType(2, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        int[] iArr = this.f5305h;
        if (iArr != null) {
            if (iArr.length == 1) {
                this.f5299b.setColor(iArr[0]);
            } else {
                LinearGradient linearGradient = this.f5307j;
                if (linearGradient != null) {
                    this.f5299b.setShader(linearGradient);
                }
            }
        }
        int i = this.f5301d;
        RectF rectF = this.f5306i;
        if (i != 1) {
            canvas.drawCircle(rectF.centerX(), this.f5306i.centerY(), Math.min(this.f5306i.width(), this.f5306i.height()) / 2.0f, this.f5298a);
            canvas.drawCircle(this.f5306i.centerX(), this.f5306i.centerY(), Math.min(this.f5306i.width(), this.f5306i.height()) / 2.0f, this.f5299b);
            return;
        }
        int i2 = this.f5302e;
        canvas.drawRoundRect(rectF, i2, i2, this.f5298a);
        RectF rectF2 = this.f5306i;
        int i3 = this.f5302e;
        canvas.drawRoundRect(rectF2, i3, i3, this.f5299b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f5298a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = this.f5300c;
        int i6 = this.f5303f;
        int i7 = this.f5304g;
        this.f5306i = new RectF((i + i5) - i6, (i2 + i5) - i7, (i3 - i5) - i6, (i4 - i5) - i7);
        int[] iArr = this.f5305h;
        if (iArr == null || iArr.length <= 1) {
            return;
        }
        RectF rectF = this.f5306i;
        float f = rectF.left;
        float fHeight = rectF.height() / 2.0f;
        RectF rectF2 = this.f5306i;
        this.f5307j = new LinearGradient(f, fHeight, rectF2.right, rectF2.height() / 2.0f, this.f5305h, (float[]) null, Shader.TileMode.CLAMP);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f5298a.setColorFilter(colorFilter);
    }
}
