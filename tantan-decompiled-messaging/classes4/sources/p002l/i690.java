package p002l;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import l.t100;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u0000 12\u00020\u0001:\u0001\u0019B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\nJ\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0016\u0010 \u001a\u0004\u0018\u00010\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010#\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0014\u0010%\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010$R\u0014\u0010&\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010$R\u0018\u0010*\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010,\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010\u001aR\u0016\u0010.\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010$R\u0016\u00100\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010$¨\u00062"}, d2 = {"Ll/i690;", "Landroid/graphics/drawable/Drawable;", "", "colors", "<init>", "([I)V", "Landroid/graphics/Canvas;", "canvas", "", "draw", "(Landroid/graphics/Canvas;)V", "", "alpha", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "d", "()V", "e", "c", "a", "[I", "getColors", "()[I", "", "b", "Ljava/lang/String;", "TAG", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "mBorderPaint", "I", "mBorderWidth", "mBorderRadius", "Landroid/graphics/Shader;", "f", "Landroid/graphics/Shader;", "mBorderShader", "g", "mColors", "h", "viewWidth", "i", "viewHeight", "Companion", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i690 extends Drawable {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: j */
    @NotNull
    public static final int[] f13067j = {Color.parseColor("#5c370f"), Color.parseColor("#5c370f"), Color.parseColor("#5c370f")};

    /* JADX INFO: renamed from: k */
    @NotNull
    public static final int[] f13068k = {Color.parseColor("#F7C46B"), Color.parseColor("#FFDEBC"), Color.parseColor("#A36E27")};

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final int[] colors;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String TAG;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Paint mBorderPaint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int mBorderWidth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int mBorderRadius;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public Shader mBorderShader;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public int[] mColors;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public int viewWidth;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public int viewHeight;

    public i690(@NotNull int[] iArr) {
        iArr.getClass();
        this.colors = iArr;
        this.TAG = Reflection.b(i690.class).s();
        this.mBorderPaint = new Paint(1);
        this.mBorderWidth = t100.d(3.0f);
        this.mBorderRadius = t100.d(10.0f);
        this.mColors = iArr;
        m15018d();
    }

    /* JADX INFO: renamed from: c */
    public final void m15017c(Canvas canvas) {
        float f = this.mBorderWidth / 2.0f;
        float f2 = f + 0.0f;
        float f3 = this.viewWidth - f;
        float f4 = this.viewHeight - f;
        int i = this.mBorderRadius;
        canvas.drawRoundRect(f2, f2, f3, f4, i, i, this.mBorderPaint);
    }

    /* JADX INFO: renamed from: d */
    public final void m15018d() {
        this.mBorderPaint.setStyle(Paint.Style.STROKE);
        this.mBorderPaint.setStrokeWidth(this.mBorderWidth);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        canvas.getClass();
        m15019e(canvas);
        m15017c(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m15019e(Canvas canvas) {
        if (this.viewWidth != canvas.getWidth() || this.viewHeight != canvas.getHeight()) {
            this.viewWidth = canvas.getWidth();
            this.viewHeight = canvas.getHeight();
        }
        if (this.mBorderShader == null) {
            this.mBorderShader = new LinearGradient(0.0f, 0.0f, this.viewWidth, 0.0f, this.mColors, (float[]) null, Shader.TileMode.CLAMP);
        }
        this.mBorderPaint.setShader(this.mBorderShader);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.mBorderPaint.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.mBorderPaint.setColorFilter(colorFilter);
    }

    /* JADX INFO: renamed from: l.i690$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"Ll/i690$a;", "", "<init>", "()V", "", "GRADIENT_TYPE_CUSTOM_SERVICE_DEFAULT", "[I", "a", "()[I", "GRADIENT_TYPE_CUSTOM_SERVICE_SELECTED", "b", "pay_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final int[] m15020a() {
            return i690.f13067j;
        }

        @NotNull
        /* JADX INFO: renamed from: b */
        public final int[] m15021b() {
            return i690.f13068k;
        }

        public Companion() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public i690() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public /* synthetic */ i690(int[] iArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? f13067j : iArr);
    }
}
