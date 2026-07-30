package p149l;

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

/* JADX INFO: loaded from: classes10.dex */
public class jdm extends Drawable {

    /* JADX INFO: renamed from: a */
    public final Paint f117403a;

    /* JADX INFO: renamed from: b */
    public final Paint f117404b;

    /* JADX INFO: renamed from: c */
    public final int f117405c;

    /* JADX INFO: renamed from: d */
    public final int f117406d;

    /* JADX INFO: renamed from: e */
    public final int f117407e;

    /* JADX INFO: renamed from: f */
    public final int f117408f;

    /* JADX INFO: renamed from: g */
    public final int f117409g;

    /* JADX INFO: renamed from: h */
    public final int[] f117410h;

    /* JADX INFO: renamed from: i */
    public RectF f117411i;

    /* JADX INFO: renamed from: j */
    public LinearGradient f117412j;

    /* JADX INFO: renamed from: l.jdm$a */
    public static class C17751a {

        /* JADX INFO: renamed from: a */
        public int f117413a = 1;

        /* JADX INFO: renamed from: b */
        public int f117414b = 12;

        /* JADX INFO: renamed from: c */
        public int f117415c = Color.parseColor("#4d000000");

        /* JADX INFO: renamed from: d */
        public int f117416d = 18;

        /* JADX INFO: renamed from: e */
        public int f117417e = 0;

        /* JADX INFO: renamed from: f */
        public int f117418f = 0;

        /* JADX INFO: renamed from: g */
        public int[] f117419g = {0};

        /* JADX INFO: renamed from: a */
        public jdm m141041a() {
            return new jdm(this.f117413a, this.f117419g, this.f117414b, this.f117415c, this.f117416d, this.f117417e, this.f117418f);
        }

        /* JADX INFO: renamed from: b */
        public C17751a m141042b(int i) {
            this.f117419g[0] = i;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C17751a m141043c(int i) {
            this.f117417e = i;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C17751a m141044d(int i) {
            this.f117418f = i;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C17751a m141045e(int i) {
            this.f117415c = i;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C17751a m141046f(int i) {
            this.f117416d = i;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C17751a m141047g(int i) {
            this.f117414b = i;
            return this;
        }
    }

    public jdm(int i, int[] iArr, int i2, int i3, int i4, int i5, int i6) {
        this.f117406d = i;
        this.f117410h = iArr;
        this.f117407e = i2;
        this.f117405c = i4;
        this.f117408f = i5;
        this.f117409g = i6;
        Paint paint = new Paint();
        this.f117403a = paint;
        paint.setColor(0);
        paint.setAntiAlias(true);
        paint.setShadowLayer(i4, i5, i6, i3);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        Paint paint2 = new Paint();
        this.f117404b = paint2;
        paint2.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: a */
    public static void m141039a(View view, int i, int i2) {
        int paddingBottom = view.getPaddingBottom();
        int paddingTop = view.getPaddingTop();
        gbl0.m125233z0(view, view.getPaddingLeft() - i, paddingTop - i2, view.getPaddingRight() + i, paddingBottom + i2);
    }

    /* JADX INFO: renamed from: b */
    public static void m141040b(View view, int i, int i2, int i3, int i4, int i5, int i6) {
        jdm jdmVarM141041a = new C17751a().m141042b(i).m141047g(i2).m141045e(i3).m141046f(i4).m141043c(i5).m141044d(i6).m141041a();
        view.setLayerType(1, null);
        m141039a(view, i5, i6);
        gbl0.m125207m0(view, jdmVarM141041a);
        view.setLayerType(2, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        int[] iArr = this.f117410h;
        if (iArr != null) {
            if (iArr.length == 1) {
                this.f117404b.setColor(iArr[0]);
            } else {
                LinearGradient linearGradient = this.f117412j;
                if (linearGradient != null) {
                    this.f117404b.setShader(linearGradient);
                }
            }
        }
        int i = this.f117406d;
        RectF rectF = this.f117411i;
        if (i != 1) {
            canvas.drawCircle(rectF.centerX(), this.f117411i.centerY(), Math.min(this.f117411i.width(), this.f117411i.height()) / 2.0f, this.f117403a);
            canvas.drawCircle(this.f117411i.centerX(), this.f117411i.centerY(), Math.min(this.f117411i.width(), this.f117411i.height()) / 2.0f, this.f117404b);
            return;
        }
        int i2 = this.f117407e;
        canvas.drawRoundRect(rectF, i2, i2, this.f117403a);
        RectF rectF2 = this.f117411i;
        int i3 = this.f117407e;
        canvas.drawRoundRect(rectF2, i3, i3, this.f117404b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f117403a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = this.f117405c;
        int i6 = this.f117408f;
        int i7 = this.f117409g;
        this.f117411i = new RectF((i + i5) - i6, (i2 + i5) - i7, (i3 - i5) - i6, (i4 - i5) - i7);
        int[] iArr = this.f117410h;
        if (iArr == null || iArr.length <= 1) {
            return;
        }
        RectF rectF = this.f117411i;
        float f = rectF.left;
        float fHeight = rectF.height() / 2.0f;
        RectF rectF2 = this.f117411i;
        this.f117412j = new LinearGradient(f, fHeight, rectF2.right, rectF2.height() / 2.0f, this.f117410h, (float[]) null, Shader.TileMode.CLAMP);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f117403a.setColorFilter(colorFilter);
    }
}
