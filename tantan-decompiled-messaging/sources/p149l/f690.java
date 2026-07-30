package p149l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.live.base.data.BLiveOpenStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0013\u0010\u0003J\u0017\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\bJ\u0017\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\bJ\u0017\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\bJ\u0017\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0017\u0010\bJ\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001dR\u0014\u0010!\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010 R\u0014\u0010#\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\"R\u0014\u0010$\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u0014\u0010%\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\"R\u0014\u0010&\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\"R\u0014\u0010(\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010 R\u0014\u0010,\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u00100\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0018\u00104\u001a\u0004\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00108\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010:\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010 R\u001c\u0010?\u001a\n <*\u0004\u0018\u00010;0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010C\u001a\u00020@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010/R\u0016\u0010G\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010\"R\u0016\u0010I\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010\"¨\u0006J"}, m87232d2 = {"Ll/f690;", "Landroid/graphics/drawable/Drawable;", "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", "", BLiveOpenStatus.draw, "(Landroid/graphics/Canvas;)V", "", "alpha", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "e", "f", "b", Constants.INAPP_DATA_TAG, "c", "", "thinTall", "a", "(Z)V", "", "Ljava/lang/String;", "TAG", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "backgroundPaint", "I", "backgroundRadius", "decorationBorderArcRadius", "decorationBorderNarrowMargin", "decorationBorderWidthMargin", "g", "decorationBorderPaint", "Landroid/graphics/Path;", "h", "Landroid/graphics/Path;", "decorationBorderPath", "", RXScreenCaptureService.KEY_INDEX, "F", "decorationBorderWidth", "Landroid/graphics/Shader;", "j", "Landroid/graphics/Shader;", "decorationShader", "", "k", "[I", "mColors", BLiveStormDanmakuGiftResourceType.f44444l, "heartIconBitmapPaint", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "m", "Landroid/graphics/Bitmap;", "heartIconBitmap", "Landroid/graphics/Matrix;", "n", "Landroid/graphics/Matrix;", "heartIconMatrix", "o", "heartIconMargin", "p", "viewWidth", "q", "viewHeight", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class f690 extends Drawable {

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @Nullable
    public Shader decorationShader;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int viewWidth;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    public int viewHeight;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final String TAG = Reflection.m87507b(f690.class).mo87471s();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Paint backgroundPaint = new Paint(1);

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final int backgroundRadius = t100.m186890d(10.0f);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int decorationBorderArcRadius = t100.m186890d(7.0f);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int decorationBorderNarrowMargin = t100.m186890d(3.0f);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int decorationBorderWidthMargin = t100.m186890d(6.0f);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final Paint decorationBorderPaint = new Paint(1);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Path decorationBorderPath = new Path();

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final float decorationBorderWidth = t100.m186889c().density * 0.8f;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final int[] mColors = {Color.parseColor("#F0AB2F"), Color.parseColor("#FFDFA6"), Color.parseColor("#FFF1D6"), Color.parseColor("#FFD485"), Color.parseColor("#DDAE58"), Color.parseColor("#FFF8EC"), Color.parseColor("#FFCF77"), Color.parseColor("#FFAF38")};

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Paint heartIconBitmapPaint = new Paint(1);

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public final Bitmap heartIconBitmap = BitmapFactory.decodeResource(App.f15369e.getResources(), d3c0.f83507B5);

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final Matrix heartIconMatrix = new Matrix();

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public final float heartIconMargin = t100.m186890d(9.0f);

    public f690() {
        m119588e();
    }

    /* JADX INFO: renamed from: a */
    public final void m119584a(boolean thinTall) {
        float f = thinTall ? this.decorationBorderWidthMargin : this.decorationBorderNarrowMargin;
        float f2 = thinTall ? this.decorationBorderNarrowMargin : this.decorationBorderWidthMargin;
        int i = this.decorationBorderArcRadius * 2;
        this.decorationBorderPath.reset();
        this.decorationBorderPaint.setShader(this.decorationShader);
        this.decorationBorderPath.moveTo(this.decorationBorderArcRadius + f, f2);
        this.decorationBorderPath.lineTo((this.viewWidth - f) - this.decorationBorderArcRadius, f2);
        Path path = this.decorationBorderPath;
        int i2 = this.viewWidth;
        float f3 = i2 - f;
        float f4 = i;
        float f5 = f2 + f4;
        path.arcTo(f3 - f4, f2, i2 - f, f5, 270.0f, 90.0f, false);
        this.decorationBorderPath.lineTo(this.viewWidth - f, (this.viewHeight - f2) - this.decorationBorderArcRadius);
        Path path2 = this.decorationBorderPath;
        int i3 = this.viewWidth;
        int i4 = this.viewHeight;
        path2.arcTo((i3 - f) - f4, (i4 - f2) - f4, i3 - f, i4 - f2, 0.0f, 90.0f, false);
        this.decorationBorderPath.lineTo(this.decorationBorderArcRadius + f, this.viewHeight - f2);
        Path path3 = this.decorationBorderPath;
        int i5 = this.viewHeight;
        float f6 = (i5 - f2) - f4;
        float f7 = f4 + f;
        path3.arcTo(f, f6, f7, i5 - f2, 90.0f, 90.0f, false);
        this.decorationBorderPath.lineTo(f, f2 + this.decorationBorderArcRadius);
        this.decorationBorderPath.arcTo(f, f2, f7, f5, 180.0f, 90.0f, false);
        this.decorationBorderPath.close();
    }

    /* JADX INFO: renamed from: b */
    public final void m119585b(Canvas canvas) {
        this.backgroundPaint.setColor(Color.parseColor("#301505"));
        float f = this.viewWidth;
        float f2 = this.viewHeight;
        int i = this.backgroundRadius;
        canvas.drawRoundRect(0.0f, 0.0f, f, f2, i, i, this.backgroundPaint);
        this.backgroundPaint.setColor(Color.parseColor(Constants.BLACK));
        int i2 = this.decorationBorderNarrowMargin;
        float f3 = i2 + 0.0f;
        float f4 = i2 + 0.0f;
        float f5 = this.viewWidth - i2;
        float f6 = this.viewHeight - i2;
        int i3 = this.backgroundRadius;
        canvas.drawRoundRect(f3, f4, f5, f6, i3, i3, this.backgroundPaint);
    }

    /* JADX INFO: renamed from: c */
    public final void m119586c(Canvas canvas) {
        m119584a(true);
        canvas.drawPath(this.decorationBorderPath, this.decorationBorderPaint);
        m119584a(false);
        canvas.drawPath(this.decorationBorderPath, this.decorationBorderPaint);
    }

    /* JADX INFO: renamed from: d */
    public final void m119587d(Canvas canvas) {
        Bitmap bitmap = this.heartIconBitmap;
        if (bitmap != null) {
            this.heartIconMatrix.reset();
            Matrix matrix = this.heartIconMatrix;
            float f = this.heartIconMargin;
            matrix.setTranslate(f, f);
            canvas.drawBitmap(bitmap, this.heartIconMatrix, this.heartIconBitmapPaint);
            this.heartIconMatrix.reset();
            this.heartIconMatrix.postRotate(90.0f);
            Matrix matrix2 = this.heartIconMatrix;
            float f2 = this.viewWidth;
            float f3 = this.heartIconMargin;
            matrix2.postTranslate(f2 - f3, f3);
            canvas.drawBitmap(bitmap, this.heartIconMatrix, this.heartIconBitmapPaint);
            this.heartIconMatrix.reset();
            this.heartIconMatrix.postRotate(180.0f);
            Matrix matrix3 = this.heartIconMatrix;
            float f4 = this.viewWidth;
            float f5 = this.heartIconMargin;
            matrix3.postTranslate(f4 - f5, this.viewHeight - f5);
            canvas.drawBitmap(bitmap, this.heartIconMatrix, this.heartIconBitmapPaint);
            this.heartIconMatrix.reset();
            this.heartIconMatrix.postRotate(270.0f);
            Matrix matrix4 = this.heartIconMatrix;
            float f6 = this.heartIconMargin;
            matrix4.postTranslate(f6, this.viewHeight - f6);
            canvas.drawBitmap(bitmap, this.heartIconMatrix, this.heartIconBitmapPaint);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        canvas.getClass();
        m119589f(canvas);
        m119585b(canvas);
        m119587d(canvas);
        m119586c(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m119588e() {
        Paint paint = this.backgroundPaint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.backgroundPaint.setColor(Color.parseColor("#301505"));
        this.heartIconBitmapPaint.setStyle(style);
        this.decorationBorderPaint.setStyle(Paint.Style.STROKE);
        this.decorationBorderPaint.setStrokeWidth(this.decorationBorderWidth);
    }

    /* JADX INFO: renamed from: f */
    public final void m119589f(Canvas canvas) {
        if (this.viewWidth <= 0 || this.viewHeight <= 0) {
            this.viewWidth = canvas.getWidth();
            this.viewHeight = canvas.getHeight();
        }
        if (this.decorationShader == null) {
            this.decorationShader = new LinearGradient(0.0f, 0.0f, this.viewWidth, 0.0f, this.mColors, (float[]) null, Shader.TileMode.CLAMP);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.backgroundPaint.setAlpha(alpha);
        this.heartIconBitmapPaint.setAlpha(alpha);
        this.decorationBorderPaint.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.backgroundPaint.setColorFilter(colorFilter);
        this.heartIconBitmapPaint.setColorFilter(colorFilter);
        this.decorationBorderPaint.setColorFilter(colorFilter);
    }
}
