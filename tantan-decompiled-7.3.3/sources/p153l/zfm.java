package p153l;

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

/* JADX INFO: loaded from: classes12.dex */
public class zfm extends Drawable {

    /* JADX INFO: renamed from: a */
    public final Paint f204155a;

    /* JADX INFO: renamed from: b */
    public final Paint f204156b;

    /* JADX INFO: renamed from: c */
    public final int f204157c;

    /* JADX INFO: renamed from: d */
    public final int f204158d;

    /* JADX INFO: renamed from: e */
    public final int f204159e;

    /* JADX INFO: renamed from: f */
    public final int f204160f;

    /* JADX INFO: renamed from: g */
    public final int f204161g;

    /* JADX INFO: renamed from: h */
    public final int[] f204162h;

    /* JADX INFO: renamed from: i */
    public RectF f204163i;

    /* JADX INFO: renamed from: j */
    public LinearGradient f204164j;

    /* JADX INFO: renamed from: l.zfm$a */
    public static class C21801a {

        /* JADX INFO: renamed from: a */
        public int f204165a = 1;

        /* JADX INFO: renamed from: b */
        public int f204166b = 12;

        /* JADX INFO: renamed from: c */
        public int f204167c = Color.parseColor("#4d000000");

        /* JADX INFO: renamed from: d */
        public int f204168d = 18;

        /* JADX INFO: renamed from: e */
        public int f204169e = 0;

        /* JADX INFO: renamed from: f */
        public int f204170f = 0;

        /* JADX INFO: renamed from: g */
        public int[] f204171g = {0};

        /* JADX INFO: renamed from: a */
        public zfm m219547a() {
            return new zfm(this.f204165a, this.f204171g, this.f204166b, this.f204167c, this.f204168d, this.f204169e, this.f204170f);
        }

        /* JADX INFO: renamed from: b */
        public C21801a m219548b(int i) {
            this.f204171g[0] = i;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C21801a m219549c(int i) {
            this.f204169e = i;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C21801a m219550d(int i) {
            this.f204170f = i;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C21801a m219551e(int i) {
            this.f204167c = i;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C21801a m219552f(int i) {
            this.f204168d = i;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C21801a m219553g(int i) {
            this.f204166b = i;
            return this;
        }
    }

    public zfm(int i, int[] iArr, int i2, int i3, int i4, int i5, int i6) {
        this.f204158d = i;
        this.f204162h = iArr;
        this.f204159e = i2;
        this.f204157c = i4;
        this.f204160f = i5;
        this.f204161g = i6;
        Paint paint = new Paint();
        this.f204155a = paint;
        paint.setColor(0);
        paint.setAntiAlias(true);
        paint.setShadowLayer(i4, i5, i6, i3);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        Paint paint2 = new Paint();
        this.f204156b = paint2;
        paint2.setAntiAlias(true);
    }

    /* JADX INFO: renamed from: a */
    public static void m219545a(View view, int i, int i2) {
        int paddingBottom = view.getPaddingBottom();
        int paddingTop = view.getPaddingTop();
        kkl0.m150196z0(view, view.getPaddingLeft() - i, paddingTop - i2, view.getPaddingRight() + i, paddingBottom + i2);
    }

    /* JADX INFO: renamed from: b */
    public static void m219546b(View view, int i, int i2, int i3, int i4, int i5, int i6) {
        zfm zfmVarM219547a = new C21801a().m219548b(i).m219553g(i2).m219551e(i3).m219552f(i4).m219549c(i5).m219550d(i6).m219547a();
        view.setLayerType(1, null);
        m219545a(view, i5, i6);
        kkl0.m150170m0(view, zfmVarM219547a);
        view.setLayerType(2, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        int[] iArr = this.f204162h;
        if (iArr != null) {
            if (iArr.length == 1) {
                this.f204156b.setColor(iArr[0]);
            } else {
                LinearGradient linearGradient = this.f204164j;
                if (linearGradient != null) {
                    this.f204156b.setShader(linearGradient);
                }
            }
        }
        int i = this.f204158d;
        RectF rectF = this.f204163i;
        if (i != 1) {
            canvas.drawCircle(rectF.centerX(), this.f204163i.centerY(), Math.min(this.f204163i.width(), this.f204163i.height()) / 2.0f, this.f204155a);
            canvas.drawCircle(this.f204163i.centerX(), this.f204163i.centerY(), Math.min(this.f204163i.width(), this.f204163i.height()) / 2.0f, this.f204156b);
            return;
        }
        int i2 = this.f204159e;
        canvas.drawRoundRect(rectF, i2, i2, this.f204155a);
        RectF rectF2 = this.f204163i;
        int i3 = this.f204159e;
        canvas.drawRoundRect(rectF2, i3, i3, this.f204156b);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f204155a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = this.f204157c;
        int i6 = this.f204160f;
        int i7 = this.f204161g;
        this.f204163i = new RectF((i + i5) - i6, (i2 + i5) - i7, (i3 - i5) - i6, (i4 - i5) - i7);
        int[] iArr = this.f204162h;
        if (iArr == null || iArr.length <= 1) {
            return;
        }
        RectF rectF = this.f204163i;
        float f = rectF.left;
        float fHeight = rectF.height() / 2.0f;
        RectF rectF2 = this.f204163i;
        this.f204164j = new LinearGradient(f, fHeight, rectF2.right, rectF2.height() / 2.0f, this.f204162h, (float[]) null, Shader.TileMode.CLAMP);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f204155a.setColorFilter(colorFilter);
    }
}
