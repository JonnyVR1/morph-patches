package p149l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.clevertap.android.sdk.Constants;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class z3g extends imf0 implements Animatable {

    /* JADX INFO: renamed from: q */
    public static final int[] f201344q = {Color.parseColor("#00ffffff"), Color.parseColor("#55ffffff"), Color.parseColor("#00ffffff")};

    /* JADX INFO: renamed from: r */
    public static final float[] f201345r = {0.0f, 0.5f, 1.0f};

    /* JADX INFO: renamed from: s */
    public static final int f201346s;

    /* JADX INFO: renamed from: t */
    public static final int f201347t;

    /* JADX INFO: renamed from: u */
    public static final int f201348u;

    /* JADX INFO: renamed from: a */
    public final Paint f201349a;

    /* JADX INFO: renamed from: b */
    public final RectF f201350b;

    /* JADX INFO: renamed from: c */
    public final Path f201351c;

    /* JADX INFO: renamed from: d */
    public final Path f201352d;

    /* JADX INFO: renamed from: e */
    public LinearGradient f201353e;

    /* JADX INFO: renamed from: f */
    public LinearGradient f201354f;

    /* JADX INFO: renamed from: g */
    public LinearGradient f201355g;

    /* JADX INFO: renamed from: h */
    public boolean f201356h;

    /* JADX INFO: renamed from: i */
    public ColorMatrix f201357i;

    /* JADX INFO: renamed from: j */
    public C21615a f201358j;

    /* JADX INFO: renamed from: k */
    public String f201359k;

    /* JADX INFO: renamed from: l */
    public float f201360l;

    /* JADX INFO: renamed from: m */
    public boolean f201361m;

    /* JADX INFO: renamed from: n */
    public Rect f201362n;

    /* JADX INFO: renamed from: o */
    public int f201363o;

    /* JADX INFO: renamed from: p */
    public Paint f201364p;

    static {
        int i = t100.f167266o;
        f201346s = i;
        f201347t = i / 3;
        f201348u = -t100.f167254c;
    }

    public z3g(nvp nvpVar, Bitmap bitmap) {
        this.f201349a = new Paint(7);
        this.f201350b = new RectF();
        this.f201351c = new Path();
        this.f201352d = new Path();
        this.f201358j = new C21615a(nvpVar, bitmap);
        ColorMatrix colorMatrix = new ColorMatrix();
        this.f201357i = colorMatrix;
        colorMatrix.setSaturation(TextUtils.equals(nvpVar.m161714h(), "gray") ? 0.0f : 1.0f);
        this.f201364p = m217032b(this.f201358j.f201369e.m161712f());
        this.f201358j.f201365a.setColorFilter(new ColorMatrixColorFilter(this.f201357i));
        this.f201358j.f201367c.setColorFilter(new ColorMatrixColorFilter(this.f201357i));
        this.f201358j.f201366b.setColorFilter(new ColorMatrixColorFilter(this.f201357i));
    }

    /* JADX INFO: renamed from: b */
    public static Paint m217032b(int i) {
        Paint paint = new Paint(7);
        paint.setColor(-1);
        paint.setLetterSpacing(0.05f);
        paint.setTextSize(i * 0.57f);
        return paint;
    }

    /* JADX INFO: renamed from: g */
    public static String m217033g(CharSequence charSequence) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; charSequence != null && i2 < charSequence.length(); i2++) {
            char cCharAt = charSequence.charAt(i2);
            i = t0g0.m186867h(cCharAt) ? i + 2 : i + 1;
            if (i > 24) {
                return sb.toString();
            }
            sb.append(cCharAt);
        }
        return charSequence != null ? charSequence.toString() : "";
    }

    /* JADX INFO: renamed from: h */
    public static int m217034h(Paint paint, String str, int i) {
        if (paint == null) {
            paint = m217032b(i);
        }
        return ((int) paint.measureText(str)) + ((int) (i * 1.5f));
    }

    @Override // p149l.imf0
    /* JADX INFO: renamed from: a */
    public int mo137069a() {
        int i = this.f201363o;
        return i == 0 ? getBounds().width() : i;
    }

    /* JADX INFO: renamed from: c */
    public final void m217035c(Canvas canvas, Rect rect) {
        float fM186890d = t100.m186890d(8.0f);
        int iM186890d = t100.m186890d(2.0f);
        float f = rect.left + iM186890d;
        float f2 = rect.top;
        int i = rect.bottom;
        canvas.drawRoundRect(f, f2 + (i * 0.0f), rect.right, i * 1.0f, fM186890d, fM186890d, this.f201358j.f201366b);
        this.f201352d.reset();
        Path path = this.f201352d;
        float f3 = rect.left + iM186890d;
        float f4 = rect.top;
        int i2 = rect.bottom;
        path.addRoundRect(f3, f4 + (i2 * 0.0f), rect.right, i2 * 1.0f, fM186890d, fM186890d, Path.Direction.CCW);
        if (this.f201358j.m217043b() == 0 || this.f201358j.m217042a() == 0) {
            return;
        }
        this.f201358j.f201367c.setStrokeWidth(rect.bottom / 20.0f);
        float f5 = rect.left + 2 + iM186890d;
        float f6 = rect.top;
        int i3 = rect.bottom;
        canvas.drawRoundRect(f5, f6 + (i3 * 0.0f) + 2.0f, rect.right - 2, (i3 * 1.0f) - 2.0f, fM186890d, fM186890d, this.f201358j.f201367c);
    }

    /* JADX INFO: renamed from: d */
    public final void m217036d(Canvas canvas, Rect rect) {
        this.f201350b.left = ((rect.width() * 10) * m217037e()) - rect.width();
        RectF rectF = this.f201350b;
        rectF.right = rectF.left + f201346s;
        rectF.top = 0.0f;
        rectF.bottom = rect.height();
        Objects.toString(this.f201350b);
        this.f201351c.reset();
        Path path = this.f201351c;
        RectF rectF2 = this.f201350b;
        path.moveTo(rectF2.left, rectF2.top);
        Path path2 = this.f201351c;
        RectF rectF3 = this.f201350b;
        path2.lineTo(rectF3.right, rectF3.top);
        Path path3 = this.f201351c;
        RectF rectF4 = this.f201350b;
        float f = rectF4.right;
        int i = f201347t;
        path3.lineTo(f - i, rectF4.bottom);
        Path path4 = this.f201351c;
        RectF rectF5 = this.f201350b;
        path4.lineTo(rectF5.left - i, rectF5.bottom);
        Path path5 = this.f201351c;
        RectF rectF6 = this.f201350b;
        path5.lineTo(rectF6.left, rectF6.top);
        this.f201351c.op(this.f201352d, Path.Op.INTERSECT);
        canvas.drawPath(this.f201351c, this.f201349a);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NonNull Canvas canvas) {
        Bitmap bitmap = this.f201358j.f201368d;
        Rect bounds = getBounds();
        if (bitmap == null) {
            return;
        }
        m217035c(canvas, bounds);
        if (this.f201362n == null) {
            this.f201362n = new Rect();
        }
        int iHeight = (int) (bounds.height() * 1.0f);
        this.f201362n.set(0, 0, (int) (((bitmap.getWidth() * 1.0f) / bitmap.getHeight()) * iHeight), iHeight);
        canvas.save();
        if (this.f201356h) {
            m217036d(canvas, bounds);
        }
        canvas.drawBitmap(bitmap, (Rect) null, this.f201362n, this.f201358j.f201365a);
        canvas.restore();
        canvas.drawText(this.f201359k, 0.0f + (this.f201362n.width() * 1.1f), this.f201360l, this.f201364p);
    }

    /* JADX INFO: renamed from: e */
    public float m217037e() {
        return ((System.currentTimeMillis() % Constants.PN_IMAGE_DOWNLOAD_TIMEOUT_IN_MILLIS) * 1.0f) / 5000.0f;
    }

    /* JADX INFO: renamed from: f */
    public boolean m217038f() {
        return this.f201356h;
    }

    @Override // android.graphics.drawable.Drawable
    @Nullable
    public Drawable.ConstantState getConstantState() {
        return this.f201358j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Bitmap bitmap = this.f201358j.f201368d;
        return (bitmap == null || bitmap.isRecycled() || bitmap.hasAlpha() || this.f201358j.f201365a.getAlpha() < 255) ? -3 : -1;
    }

    @Override // p149l.j3m
    public float getRatio() {
        return 3.5714285f;
    }

    /* JADX INFO: renamed from: i */
    public void m217039i(boolean z) {
        this.f201356h = z;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return false;
    }

    /* JADX INFO: renamed from: j */
    public void m217040j(String str) {
        this.f201359k = m217033g(str);
        Paint paintM217032b = m217032b(this.f201358j.f201369e.m161712f());
        this.f201364p = paintM217032b;
        int iM217034h = m217034h(paintM217032b, str, this.f201358j.f201369e.m161712f());
        this.f201363o = iM217034h;
        setBounds(0, 0, iM217034h, this.f201358j.f201369e.m161712f());
        invalidateSelf();
    }

    /* JADX INFO: renamed from: k */
    public void m217041k(int i) {
        nvp nvpVar;
        C21615a c21615a = this.f201358j;
        if (c21615a == null || (nvpVar = c21615a.f201369e) == null) {
            return;
        }
        nvpVar.m161721o(i);
    }

    @Override // android.graphics.drawable.Drawable
    @NonNull
    public Drawable mutate() {
        if (!this.f201361m && super.mutate() == this) {
            this.f201358j = new C21615a(this.f201358j);
            this.f201361m = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void onBoundsChange(Rect rect) {
        Paint.FontMetrics fontMetrics = this.f201364p.getFontMetrics();
        this.f201360l = ((this.f201358j.f201369e.m161712f() - ((-fontMetrics.top) + fontMetrics.bottom)) / 2.0f) - fontMetrics.top;
        int iM217034h = m217034h(this.f201364p, this.f201359k, this.f201358j.f201369e.m161712f());
        this.f201363o = iM217034h;
        setBounds(0, 0, iM217034h, this.f201358j.f201369e.m161712f());
        if (this.f201353e == null && rect.right > 0) {
            LinearGradient linearGradient = new LinearGradient(rect.left, 0.0f, rect.right, (f201346s * f201347t) / rect.bottom, f201344q, f201345r, Shader.TileMode.CLAMP);
            this.f201353e = linearGradient;
            this.f201349a.setShader(linearGradient);
        }
        if (this.f201354f == null && rect.bottom > 0) {
            LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 0.0f, rect.bottom, this.f201358j.m217045d(), this.f201358j.m217044c(), Shader.TileMode.CLAMP);
            this.f201354f = linearGradient2;
            this.f201358j.f201366b.setShader(linearGradient2);
        }
        if (this.f201355g != null || rect.right <= 0) {
            return;
        }
        LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.0f, rect.right, 0.0f, this.f201358j.m217043b(), this.f201358j.m217042a(), Shader.TileMode.CLAMP);
        this.f201355g = linearGradient3;
        this.f201358j.f201367c.setShader(linearGradient3);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        if (i != this.f201358j.f201365a.getAlpha()) {
            this.f201358j.f201365a.setAlpha(i);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.f201358j.f201365a.setColorFilter(colorFilter);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
    }

    /* JADX INFO: renamed from: l.z3g$a */
    public static final class C21615a extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a */
        public final Paint f201365a;

        /* JADX INFO: renamed from: b */
        public final Paint f201366b;

        /* JADX INFO: renamed from: c */
        public final Paint f201367c;

        /* JADX INFO: renamed from: d */
        public Bitmap f201368d;

        /* JADX INFO: renamed from: e */
        public nvp f201369e;

        public C21615a(nvp nvpVar, Bitmap bitmap) {
            this.f201369e = nvpVar;
            this.f201368d = bitmap;
            this.f201365a = new Paint(7);
            this.f201366b = new Paint(7);
            Paint paint = new Paint(7);
            this.f201367c = paint;
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeWidth(t100.m186890d(2.0f));
        }

        /* JADX INFO: renamed from: a */
        public int m217042a() {
            return kvc0.m147359h(this.f201369e.m161707a(), 0);
        }

        /* JADX INFO: renamed from: b */
        public int m217043b() {
            return kvc0.m147359h(this.f201369e.m161707a(), 0);
        }

        /* JADX INFO: renamed from: c */
        public int m217044c() {
            return kvc0.m147358g(this.f201369e.m161710d());
        }

        /* JADX INFO: renamed from: d */
        public int m217045d() {
            return kvc0.m147358g(this.f201369e.m161715i());
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        @NonNull
        public Drawable newDrawable() {
            return new z3g(this);
        }

        public C21615a(C21615a c21615a) {
            this.f201369e = c21615a.f201369e;
            this.f201368d = c21615a.f201368d;
            this.f201365a = new Paint(c21615a.f201365a);
            this.f201366b = new Paint(c21615a.f201366b);
            this.f201367c = new Paint(c21615a.f201367c);
        }
    }

    public z3g(C21615a c21615a) {
        this.f201349a = new Paint(7);
        this.f201350b = new RectF();
        this.f201351c = new Path();
        this.f201352d = new Path();
        this.f201358j = c21615a;
        ColorMatrix colorMatrix = new ColorMatrix();
        this.f201357i = colorMatrix;
        colorMatrix.setSaturation(TextUtils.equals(c21615a.f201369e.m161714h(), "gray") ? 0.0f : 1.0f);
        this.f201364p = m217032b(this.f201358j.f201369e.m161712f());
        this.f201358j.f201365a.setColorFilter(new ColorMatrixColorFilter(this.f201357i));
        this.f201358j.f201367c.setColorFilter(new ColorMatrixColorFilter(this.f201357i));
        this.f201358j.f201366b.setColorFilter(new ColorMatrixColorFilter(this.f201357i));
    }
}
