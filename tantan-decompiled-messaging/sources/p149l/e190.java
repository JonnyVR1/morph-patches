package p149l;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.live.base.data.BLiveOpenStatus;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\nJ\u0017\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0018\u0010\nJ\u0017\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\nJ\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\nJ\u0017\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001b\u0010\nJ\u0017\u0010\u001d\u001a\u00020\b2\u0006\u0010\u001c\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0016\u0010#\u001a\u0004\u0018\u00010!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\"R\u0014\u0010&\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010%R\u0014\u0010(\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010'R\u0014\u0010)\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010'R\u0014\u0010*\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010'R\u0014\u0010+\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010'R\u0014\u0010-\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010%R\u0014\u00101\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00105\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010=\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020$8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010%R\u001e\u0010D\u001a\n A*\u0004\u0018\u00010@0@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u001c\u0010J\u001a\n A*\u0004\u0018\u00010@0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010CR\u0014\u0010L\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010GR\u001e\u0010N\u001a\n A*\u0004\u0018\u00010@0@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010CR\u0014\u0010P\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010GR\u0016\u0010R\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010'R\u0016\u0010T\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010'¨\u0006U"}, m87232d2 = {"Ll/e190;", "Landroid/graphics/drawable/Drawable;", "", "tallMode", "<init>", "(Z)V", "Landroid/graphics/Canvas;", "canvas", "", BLiveOpenStatus.draw, "(Landroid/graphics/Canvas;)V", "", "alpha", "setAlpha", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", "setColorFilter", "(Landroid/graphics/ColorFilter;)V", "getOpacity", "()I", "f", "()V", "g", "b", "c", "e", Constants.INAPP_DATA_TAG, "thinTall", "a", "Z", "getTallMode", "()Z", "", "Ljava/lang/String;", "TAG", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "backgroundPaint", "I", "backgroundRadius", "decorationBorderArcRadius", "decorationBorderNarrowMargin", "decorationBorderWidthMargin", "h", "decorationBorderPaint", "Landroid/graphics/Path;", RXScreenCaptureService.KEY_INDEX, "Landroid/graphics/Path;", "decorationBorderPath", "", "j", "F", "decorationBorderWidth", "Landroid/graphics/Shader;", "k", "Landroid/graphics/Shader;", "decorationShader", "", BLiveStormDanmakuGiftResourceType.f44444l, "[I", "mColors", "m", "textureBitmapPaint", "Landroid/graphics/Bitmap;", "kotlin.jvm.PlatformType", "n", "Landroid/graphics/Bitmap;", "leftTextureBitmap", "Landroid/graphics/RectF;", "o", "Landroid/graphics/RectF;", "leftTextureRectF", "p", "rightTextureBitmap", "q", "rightTextureRectF", "r", "backgroundDecorationBitmap", BLiveStormDanmakuGiftResourceType.f44446s, "backgroundDecorationRectF", Constants.KEY_T, "viewWidth", "u", "viewHeight", "pay_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class e190 extends Drawable {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final boolean tallMode;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public Shader decorationShader;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public Bitmap leftTextureBitmap;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final RectF leftTextureRectF;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public final Bitmap rightTextureBitmap;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final RectF rightTextureRectF;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    public Bitmap backgroundDecorationBitmap;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @NotNull
    public final RectF backgroundDecorationRectF;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public int viewWidth;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public int viewHeight;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public final String TAG = Reflection.m87507b(e190.class).mo87471s();

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final Paint backgroundPaint = new Paint(1);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final int backgroundRadius = t100.m186890d(10.0f);

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final int decorationBorderArcRadius = t100.m186890d(7.0f);

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int decorationBorderNarrowMargin = t100.m186890d(3.0f);

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int decorationBorderWidthMargin = t100.m186890d(5.0f);

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Paint decorationBorderPaint = new Paint(1);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Path decorationBorderPath = new Path();

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public final float decorationBorderWidth = t100.m186889c().density * 0.6f;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final int[] mColors = {Color.parseColor("#F0AB2F"), Color.parseColor("#FFDFA6"), Color.parseColor("#FFF1D6"), Color.parseColor("#FFD485"), Color.parseColor("#DDAE58"), Color.parseColor("#FFF8EC"), Color.parseColor("#FFCF77"), Color.parseColor("#FFAF38")};

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final Paint textureBitmapPaint = new Paint(1);

    public e190(boolean z) {
        this.tallMode = z;
        this.leftTextureBitmap = BitmapFactory.decodeResource(App.f15369e.getResources(), z ? d3c0.f84169x5 : d3c0.f84155w5);
        this.leftTextureRectF = new RectF();
        this.rightTextureBitmap = BitmapFactory.decodeResource(App.f15369e.getResources(), z ? d3c0.f84197z5 : d3c0.f84183y5);
        this.rightTextureRectF = new RectF();
        this.backgroundDecorationBitmap = BitmapFactory.decodeResource(App.f15369e.getResources(), z ? d3c0.f84085r5 : d3c0.f84099s5);
        this.backgroundDecorationRectF = new RectF();
        m114401f();
    }

    /* JADX INFO: renamed from: a */
    public final void m114396a(boolean thinTall) {
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
    public final void m114397b(Canvas canvas) {
        float f = this.viewWidth;
        float f2 = this.viewHeight;
        int i = this.backgroundRadius;
        canvas.drawRoundRect(0.0f, 0.0f, f, f2, i, i, this.backgroundPaint);
    }

    /* JADX INFO: renamed from: c */
    public final void m114398c(Canvas canvas) {
        Bitmap bitmap = this.backgroundDecorationBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.backgroundDecorationRectF, this.textureBitmapPaint);
        }
    }

    /* JADX INFO: renamed from: d */
    public final void m114399d(Canvas canvas) {
        m114396a(true);
        canvas.drawPath(this.decorationBorderPath, this.decorationBorderPaint);
        m114396a(false);
        canvas.drawPath(this.decorationBorderPath, this.decorationBorderPaint);
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(@NotNull Canvas canvas) {
        canvas.getClass();
        m114402g(canvas);
        m114397b(canvas);
        m114398c(canvas);
        m114400e(canvas);
        m114399d(canvas);
    }

    /* JADX INFO: renamed from: e */
    public final void m114400e(Canvas canvas) {
        Bitmap bitmap = this.leftTextureBitmap;
        if (bitmap != null) {
            canvas.drawBitmap(bitmap, (Rect) null, this.leftTextureRectF, this.textureBitmapPaint);
        }
        Bitmap bitmap2 = this.rightTextureBitmap;
        if (bitmap2 != null) {
            canvas.drawBitmap(bitmap2, (Rect) null, this.rightTextureRectF, this.textureBitmapPaint);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m114401f() {
        Paint paint = this.backgroundPaint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.backgroundPaint.setColor(Color.parseColor("#180401"));
        this.textureBitmapPaint.setStyle(style);
        this.decorationBorderPaint.setStyle(Paint.Style.STROKE);
        this.decorationBorderPaint.setStrokeWidth(this.decorationBorderWidth);
    }

    /* JADX INFO: renamed from: g */
    public final void m114402g(Canvas canvas) {
        if (this.viewWidth <= 0 || this.viewHeight <= 0) {
            this.viewWidth = canvas.getWidth();
            this.viewHeight = canvas.getHeight();
        }
        if (this.decorationShader == null) {
            this.decorationShader = new LinearGradient(0.0f, 0.0f, this.viewWidth, 0.0f, this.mColors, (float[]) null, Shader.TileMode.CLAMP);
        }
        if (this.leftTextureRectF.isEmpty()) {
            this.leftTextureRectF.set(0.0f, this.viewHeight - (this.tallMode ? t100.f167234I : t100.f167236K), t100.m186890d(130.0f), this.viewHeight);
        }
        if (this.rightTextureRectF.isEmpty()) {
            int iM186890d = t100.m186890d(this.tallMode ? 180.0f : 190.0f);
            int iM186890d2 = this.tallMode ? t100.m186890d(110.0f) : t100.f167236K;
            int i = this.viewWidth;
            this.rightTextureRectF.set(i - iM186890d, 0.0f, i, iM186890d2);
        }
        if (this.backgroundDecorationRectF.isEmpty()) {
            this.backgroundDecorationRectF.set(0.0f, 0.0f, t100.m186890d(351.0f), this.tallMode ? t100.m186890d(133.0f) : t100.f167236K);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
        this.backgroundPaint.setAlpha(alpha);
        this.textureBitmapPaint.setAlpha(alpha);
        this.decorationBorderPaint.setAlpha(alpha);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(@Nullable ColorFilter colorFilter) {
        this.backgroundPaint.setColorFilter(colorFilter);
        this.textureBitmapPaint.setColorFilter(colorFilter);
        this.decorationBorderPaint.setColorFilter(colorFilter);
    }
}
