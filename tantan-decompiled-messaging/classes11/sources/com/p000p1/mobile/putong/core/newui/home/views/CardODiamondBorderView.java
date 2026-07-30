package com.p000p1.mobile.putong.core.newui.home.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RadialGradient;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Reflection;
import l.t100;
import l.x2c0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001c\u0010\u001aJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u001aJ\u000f\u0010\u001d\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001e\u0010\u0018J\u000f\u0010\u001f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001f\u0010\u001aJ\u0017\u0010 \u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b \u0010\u0018J\u0017\u0010!\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b!\u0010\u0018J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\"\u0010\u0018J\u0017\u0010#\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b#\u0010\u0018J\u0017\u0010&\u001a\u00020\f2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'R\u0016\u0010*\u001a\u0004\u0018\u00010(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010)R\u0016\u0010-\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010,R\u0016\u0010.\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010,R\u0014\u00101\u001a\u00020/8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\"\u00100R\u0014\u00102\u001a\u00020/8\u0002X\u0082D¢\u0006\u0006\n\u0004\b \u00100R\u0014\u00103\u001a\u00020/8\u0002X\u0082D¢\u0006\u0006\n\u0004\b!\u00100R\u0014\u00106\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00105R\u0014\u00107\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u00105R\u0014\u0010:\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00109R\u0014\u0010;\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00109R\u0014\u0010<\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u00109R\u0018\u0010?\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010>R\u0018\u0010A\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010>R\u0018\u0010C\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bB\u0010>R\u0018\u0010E\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bD\u0010>R\u0018\u0010G\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bF\u0010>R\u0018\u0010I\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010>R\u0018\u0010K\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bJ\u0010>R\u0018\u0010M\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010>R\u0014\u0010P\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010OR\u0014\u0010T\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010OR\u0014\u0010U\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010,R\u0014\u0010Y\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010[\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010OR\u0014\u0010]\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u00105R\u0014\u0010_\u001a\u0002088\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u00109R\u0018\u0010a\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010>R\u0018\u0010c\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010>R\u0014\u0010e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010OR\u0014\u0010i\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u0018\u0010j\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010>R\u0014\u0010l\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010,R\u0014\u0010n\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010OR\u0018\u0010q\u001a\u0004\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010pR\u0014\u0010s\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010hR\u0014\u0010u\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010OR\u001c\u0010x\u001a\n v*\u0004\u0018\u00010o0o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010pR\u0014\u0010z\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010hR\u0016\u0010|\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u00100R\u0016\u0010~\u001a\u00020/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u00100¨\u0006\u007f"}, d2 = {"Lcom/p1/mobile/putong/core/newui/home/views/CardODiamondBorderView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "i", "()V", "j", "k", "g", "c", "l", "e", "f", "d", "b", "", "thinTall", "a", "(Z)V", "", "Ljava/lang/String;", "TAG", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "shadowPaint", "shadowTopLinePaint", "", "F", "shadowWidth", "shadowTopWidth", "shadowTopOffsetY", "", "[I", "shadowColors", "shadowTopColors", "", "[F", "shadowPositions", "shadowHorizontalPositions", "shadowTopPositions", "Landroid/graphics/Shader;", "Landroid/graphics/Shader;", "shadowTopShader", "m", "shadowTopRightArcShader", "n", "shadowRightShader", "o", "shadowBottomRightArcShader", "p", "shadowBottomShader", "q", "shadowBottomLeftArcShader", "r", "shadowLeftShader", "s", "shadowTopLeftArcShader", "t", "I", "decorationBorderArcRadius", "u", "decorationBorderNarrowMargin", "v", "decorationBorderWidthMargin", "decorationBorderPaint", "Landroid/graphics/Path;", "x", "Landroid/graphics/Path;", "decorationBorderPath", "y", "decorationBorderWidth", "z", "decorationBorderColors", "A", "decorationBorderPositions", "B", "decorationThinTallBorderShader", "C", "decorationFatShortBorderShader", "D", "topRightArcRadius", "Landroid/graphics/RectF;", "E", "Landroid/graphics/RectF;", "decorationTopRightArcRectF", "decorationTopRightArcShader", "G", "bitmapPaint", "H", "topRightIconSize", "Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap;", "topRightIcon", "J", "topRightIconRectF", "K", "topRightDecorationLinesSize", "kotlin.jvm.PlatformType", "L", "topRightDecorationLines", "M", "topRightDecorationLinesRectF", "N", "viewWidth", "O", "viewHeight", "b_core_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class CardODiamondBorderView extends FrameLayout {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    @NotNull
    public final float[] decorationBorderPositions;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    @Nullable
    public Shader decorationThinTallBorderShader;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    @Nullable
    public Shader decorationFatShortBorderShader;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public final int topRightArcRadius;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    @NotNull
    public final RectF decorationTopRightArcRectF;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    @Nullable
    public Shader decorationTopRightArcShader;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    @NotNull
    public final Paint bitmapPaint;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public final int topRightIconSize;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    @Nullable
    public Bitmap topRightIcon;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    @NotNull
    public final RectF topRightIconRectF;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public final int topRightDecorationLinesSize;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public final Bitmap topRightDecorationLines;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    @NotNull
    public final RectF topRightDecorationLinesRectF;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public float viewWidth;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public float viewHeight;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public final String TAG;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public Paint shadowPaint;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public Paint shadowTopLinePaint;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final float shadowWidth;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final float shadowTopWidth;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final float shadowTopOffsetY;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final int[] shadowColors;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final int[] shadowTopColors;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final float[] shadowPositions;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final float[] shadowHorizontalPositions;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final float[] shadowTopPositions;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public Shader shadowTopShader;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public Shader shadowTopRightArcShader;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @Nullable
    public Shader shadowRightShader;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public Shader shadowBottomRightArcShader;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public Shader shadowBottomShader;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public Shader shadowBottomLeftArcShader;

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @Nullable
    public Shader shadowLeftShader;

    /* JADX INFO: renamed from: s, reason: from kotlin metadata */
    @Nullable
    public Shader shadowTopLeftArcShader;

    /* JADX INFO: renamed from: t, reason: from kotlin metadata */
    public final int decorationBorderArcRadius;

    /* JADX INFO: renamed from: u, reason: from kotlin metadata */
    public final int decorationBorderNarrowMargin;

    /* JADX INFO: renamed from: v, reason: from kotlin metadata */
    public final int decorationBorderWidthMargin;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    @NotNull
    public final Paint decorationBorderPaint;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    @NotNull
    public final Path decorationBorderPath;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    public final int decorationBorderWidth;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    @NotNull
    public final int[] decorationBorderColors;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardODiamondBorderView(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.TAG = Reflection.b(CardODiamondBorderView.class).s();
        this.shadowPaint = new Paint(1);
        this.shadowTopLinePaint = new Paint(1);
        this.shadowWidth = t100.o;
        this.shadowTopWidth = t100.S;
        this.shadowTopOffsetY = t100.e;
        this.shadowColors = new int[]{Color.parseColor("#00000000"), Color.parseColor("#FF000000"), Color.parseColor("#FF000000")};
        this.shadowTopColors = new int[]{Color.parseColor("#00000000"), Color.parseColor("#99000000"), Color.parseColor("#FF000000")};
        this.shadowPositions = new float[]{0.0f, 0.5f, 1.0f};
        this.shadowHorizontalPositions = new float[]{0.0f, 0.6f, 1.0f};
        this.shadowTopPositions = new float[]{0.0f, 0.6f, 1.0f};
        this.decorationBorderArcRadius = t100.d(12.0f);
        this.decorationBorderNarrowMargin = t100.d(3.0f);
        this.decorationBorderWidthMargin = t100.d(6.0f);
        this.decorationBorderPaint = new Paint(1);
        this.decorationBorderPath = new Path();
        this.decorationBorderWidth = t100.d(1.0f);
        this.decorationBorderColors = new int[]{Color.parseColor("#FFB434"), Color.parseColor("#FFEEAC"), Color.parseColor("#F4B254"), Color.parseColor("#D28641")};
        this.decorationBorderPositions = new float[]{0.0f, 0.33f, 0.66f, 1.0f};
        this.topRightArcRadius = t100.d(98.0f);
        this.decorationTopRightArcRectF = new RectF();
        this.bitmapPaint = new Paint(1);
        this.topRightIconSize = t100.d(46.0f);
        this.topRightIcon = BitmapFactory.decodeResource(getResources(), x2c0.Qh);
        this.topRightIconRectF = new RectF();
        this.topRightDecorationLinesSize = t100.d(120.0f);
        this.topRightDecorationLines = BitmapFactory.decodeResource(getResources(), x2c0.Rh);
        this.topRightDecorationLinesRectF = new RectF();
        m3061i();
        setWillNotDraw(false);
    }

    /* JADX INFO: renamed from: a */
    public final void m3053a(boolean thinTall) {
        float f = thinTall ? this.decorationBorderWidthMargin : this.decorationBorderNarrowMargin;
        float f2 = thinTall ? this.decorationBorderNarrowMargin : this.decorationBorderWidthMargin;
        int i = this.decorationBorderArcRadius * 2;
        this.decorationBorderPath.reset();
        this.decorationBorderPaint.setShader(thinTall ? this.decorationThinTallBorderShader : this.decorationFatShortBorderShader);
        this.decorationBorderPath.moveTo(this.decorationBorderArcRadius + f, f2);
        this.decorationBorderPath.lineTo((this.viewWidth - f) - this.decorationBorderArcRadius, f2);
        Path path = this.decorationBorderPath;
        float f3 = this.viewWidth;
        float f4 = f3 - f;
        float f5 = i;
        float f6 = f2 + f5;
        path.arcTo(f4 - f5, f2, f3 - f, f6, 270.0f, 90.0f, false);
        this.decorationBorderPath.lineTo(this.viewWidth - f, (this.viewHeight - f2) - this.decorationBorderArcRadius);
        Path path2 = this.decorationBorderPath;
        float f7 = this.viewWidth;
        float f8 = this.viewHeight;
        path2.arcTo((f7 - f) - f5, (f8 - f2) - f5, f7 - f, f8 - f2, 0.0f, 90.0f, false);
        this.decorationBorderPath.lineTo(this.decorationBorderArcRadius + f, this.viewHeight - f2);
        Path path3 = this.decorationBorderPath;
        float f9 = this.viewHeight;
        float f10 = (f9 - f2) - f5;
        float f11 = f5 + f;
        path3.arcTo(f, f10, f11, f9 - f2, 90.0f, 90.0f, false);
        this.decorationBorderPath.lineTo(f, f2 + this.decorationBorderArcRadius);
        this.decorationBorderPath.arcTo(f, f2, f11, f6, 180.0f, 90.0f, false);
        this.decorationBorderPath.close();
    }

    /* JADX INFO: renamed from: b */
    public final void m3054b(Canvas canvas) {
        m3053a(true);
        canvas.drawPath(this.decorationBorderPath, this.decorationBorderPaint);
        m3053a(false);
        canvas.drawPath(this.decorationBorderPath, this.decorationBorderPaint);
    }

    /* JADX INFO: renamed from: c */
    public final void m3055c(Canvas canvas) {
        float f = this.shadowWidth * 2.0f;
        float f2 = this.viewWidth;
        float f3 = f2 / 2.0f;
        float f4 = this.viewHeight / 2.0f;
        this.shadowTopLinePaint.setStrokeWidth(f2 - f);
        canvas.drawLine(f3, 0.0f, f3, this.shadowTopOffsetY, this.shadowTopLinePaint);
        this.shadowPaint.setShader(this.shadowTopShader);
        this.shadowPaint.setStrokeWidth(this.viewWidth - this.shadowWidth);
        canvas.drawLine(f3, this.shadowTopOffsetY, f3, this.shadowTopWidth, this.shadowPaint);
        this.shadowPaint.setShader(this.shadowTopRightArcShader);
        float f5 = this.viewWidth;
        canvas.drawArc(f5 - f, 0.0f, f5, f, 270.0f, 90.0f, true, this.shadowPaint);
        this.shadowPaint.setShader(this.shadowRightShader);
        this.shadowPaint.setStrokeWidth(this.viewHeight - f);
        float f6 = this.viewWidth;
        canvas.drawLine(f6, f4, f6 - this.shadowWidth, f4, this.shadowPaint);
        this.shadowPaint.setShader(this.shadowBottomRightArcShader);
        float f7 = this.viewWidth;
        float f8 = this.viewHeight;
        canvas.drawArc(f7 - f, f8 - f, f7, f8, 0.0f, 90.0f, true, this.shadowPaint);
        this.shadowPaint.setShader(this.shadowBottomShader);
        this.shadowPaint.setStrokeWidth(this.viewWidth - f);
        float f9 = this.viewHeight;
        canvas.drawLine(f3, f9 - this.shadowWidth, f3, f9, this.shadowPaint);
        this.shadowPaint.setShader(this.shadowBottomLeftArcShader);
        float f10 = this.viewHeight;
        canvas.drawArc(0.0f, f10 - f, f, f10, 90.0f, 90.0f, true, this.shadowPaint);
        this.shadowPaint.setShader(this.shadowLeftShader);
        this.shadowPaint.setStrokeWidth(this.viewHeight - f);
        canvas.drawLine(0.0f, f4, this.shadowWidth, f4, this.shadowPaint);
        this.shadowPaint.setShader(this.shadowTopLeftArcShader);
        canvas.drawArc(0.0f, 0.0f, f, f, 180.0f, 90.0f, true, this.shadowPaint);
    }

    /* JADX INFO: renamed from: d */
    public final void m3056d(Canvas canvas) {
        this.decorationBorderPaint.setShader(this.decorationTopRightArcShader);
        RectF rectF = this.decorationTopRightArcRectF;
        canvas.drawArc(rectF.left, rectF.top, rectF.right, rectF.bottom, 270.0f, 90.0f, false, this.decorationBorderPaint);
    }

    /* JADX INFO: renamed from: e */
    public final void m3057e(Canvas canvas) {
        Bitmap bitmap = this.topRightDecorationLines;
        if (bitmap != null) {
            m3064l();
            canvas.drawBitmap(bitmap, (Rect) null, this.topRightDecorationLinesRectF, this.bitmapPaint);
        }
    }

    /* JADX INFO: renamed from: f */
    public final void m3058f(Canvas canvas) {
        Bitmap bitmap = this.topRightIcon;
        if (bitmap != null) {
            m3064l();
            canvas.drawBitmap(bitmap, (Rect) null, this.topRightIconRectF, this.bitmapPaint);
        }
    }

    /* JADX INFO: renamed from: g */
    public final void m3059g() {
        float f = this.viewHeight;
        float f2 = this.viewWidth;
        int[] iArr = this.decorationBorderColors;
        float[] fArr = this.decorationBorderPositions;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.decorationThinTallBorderShader = new LinearGradient(0.0f, f, f2, 0.0f, iArr, fArr, tileMode);
        this.decorationFatShortBorderShader = new LinearGradient(0.0f, 0.0f, this.viewWidth, this.viewHeight, this.decorationBorderColors, this.decorationBorderPositions, tileMode);
    }

    /* JADX INFO: renamed from: h */
    public final void m3060h() {
        int i = this.topRightArcRadius * 2;
        RectF rectF = this.decorationTopRightArcRectF;
        float f = this.viewWidth;
        int i2 = this.decorationBorderWidthMargin;
        float f2 = i;
        rectF.set((f - i2) - f2, i2, f - i2, i2 + f2);
        RectF rectF2 = this.decorationTopRightArcRectF;
        this.decorationTopRightArcShader = new LinearGradient(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, this.decorationBorderColors, this.decorationBorderPositions, Shader.TileMode.CLAMP);
    }

    /* JADX INFO: renamed from: i */
    public final void m3061i() {
        Paint paint = this.shadowPaint;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        this.shadowTopLinePaint.setStyle(style);
        this.shadowTopLinePaint.setColor(Color.parseColor("#000000"));
        this.bitmapPaint.setStyle(style);
        this.decorationBorderPaint.setStyle(Paint.Style.STROKE);
        this.decorationBorderPaint.setStrokeWidth(this.decorationBorderWidth);
    }

    /* JADX INFO: renamed from: j */
    public final void m3062j() {
        this.topRightIconRectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        this.topRightDecorationLinesRectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        m3063k();
        m3060h();
        m3059g();
    }

    /* JADX INFO: renamed from: k */
    public final void m3063k() {
        float f = this.viewWidth / 2.0f;
        float f2 = this.viewHeight / 2.0f;
        float f3 = this.shadowTopWidth;
        float f4 = this.shadowTopOffsetY;
        int[] iArr = this.shadowTopColors;
        float[] fArr = this.shadowTopPositions;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        this.shadowTopShader = new LinearGradient(f, f3, f, f4, iArr, fArr, tileMode);
        float f5 = this.viewWidth;
        float f6 = this.shadowWidth;
        this.shadowTopRightArcShader = new RadialGradient(f5 - f6, f6, f6, this.shadowColors, this.shadowPositions, tileMode);
        float f7 = this.viewWidth;
        this.shadowRightShader = new LinearGradient(f7 - this.shadowWidth, f2, f7, f2, this.shadowColors, this.shadowHorizontalPositions, tileMode);
        float f8 = this.viewWidth;
        float f9 = this.shadowWidth;
        this.shadowBottomRightArcShader = new RadialGradient(f8 - f9, this.viewHeight - f9, f9, this.shadowColors, this.shadowPositions, tileMode);
        float f10 = this.viewHeight;
        this.shadowBottomShader = new LinearGradient(f, f10 - this.shadowWidth, f, f10, this.shadowColors, this.shadowPositions, tileMode);
        float f11 = this.shadowWidth;
        this.shadowBottomLeftArcShader = new RadialGradient(f11, this.viewHeight - f11, f11, this.shadowColors, this.shadowPositions, tileMode);
        this.shadowLeftShader = new LinearGradient(this.shadowWidth, f2, 0.0f, f2, this.shadowColors, this.shadowHorizontalPositions, tileMode);
        float f12 = this.shadowWidth;
        this.shadowTopLeftArcShader = new RadialGradient(f12, f12, f12, this.shadowColors, this.shadowPositions, tileMode);
    }

    /* JADX INFO: renamed from: l */
    public final void m3064l() {
        if (this.topRightDecorationLinesRectF.isEmpty()) {
            RectF rectF = this.topRightDecorationLinesRectF;
            float f = this.viewWidth;
            int i = this.topRightDecorationLinesSize;
            rectF.set(f - i, 0.0f, f, i);
        }
        if (this.topRightIconRectF.isEmpty()) {
            RectF rectF2 = this.topRightIconRectF;
            float f2 = this.viewWidth;
            int i2 = this.topRightIconSize;
            rectF2.set(f2 - i2, 0.0f, f2, i2);
        }
    }

    @Override // android.view.View
    public void onDraw(@NotNull Canvas canvas) {
        canvas.getClass();
        super.onDraw(canvas);
        m3055c(canvas);
        m3057e(canvas);
        m3056d(canvas);
        m3054b(canvas);
        m3058f(canvas);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.viewWidth = getMeasuredWidth();
        this.viewHeight = getMeasuredHeight();
        m3062j();
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.viewWidth = w;
        this.viewHeight = h;
        m3062j();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardODiamondBorderView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public CardODiamondBorderView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ CardODiamondBorderView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
