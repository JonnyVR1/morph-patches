package p153l;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import androidx.annotation.IntRange;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.p051p1.mobile.putong.live.base.data.BLiveResOperation;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 n2\u00020\u00012\u00020\u0002:\u00011BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u0017J\u000f\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u0017J\u000f\u0010\u001d\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u0017J\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017J'\u0010#\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020&2\b\b\u0001\u0010%\u001a\u00020\u0015H\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010+\u001a\u00020&2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J\u0019\u0010/\u001a\u00020&2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0015H\u0016¢\u0006\u0004\b1\u0010\u0017J\u000f\u00102\u001a\u00020\u0015H\u0016¢\u0006\u0004\b2\u0010\u0017J\u000f\u00103\u001a\u00020&H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020&H\u0016¢\u0006\u0004\b5\u00104J\u0019\u00108\u001a\u00020&2\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109J'\u0010;\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\u0015H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020&H\u0002¢\u0006\u0004\b=\u00104J'\u0010A\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00152\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010>H\u0002¢\u0006\u0004\bA\u0010BJ/\u0010G\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010C\u001a\u00020?2\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020DH\u0002¢\u0006\u0004\bG\u0010HJ'\u0010I\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010C\u001a\u00020?2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\bI\u0010JJ7\u0010L\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00152\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010>2\u0006\u0010\"\u001a\u00020!2\u0006\u0010:\u001a\u00020\u0015H\u0002¢\u0006\u0004\bL\u0010MR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010NR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010OR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010PR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010QR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010RR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010SR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010TR\u0019\u0010Y\u001a\u0004\u0018\u00010U8\u0006¢\u0006\f\n\u0004\b'\u0010V\u001a\u0004\bW\u0010XR\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010[R\u0014\u0010_\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010^R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010`R\u0016\u0010b\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010aR\u0016\u0010c\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010aR\u0014\u0010f\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010eR\u0014\u0010i\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010hR\u0016\u0010j\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010aR\u0018\u0010m\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010l¨\u0006o"}, m88121d2 = {"Ll/j13;", "Ll/yq0;", "Ll/ar0$b;", "Ll/xc80;", "platformBitmapFactory", "Ll/c23;", "bitmapFrameCache", "Ll/kr0;", "animationInformation", "Ll/f23;", "bitmapFrameRenderer", "", "isNewRenderImplementation", "Ll/d23;", "bitmapFramePreparationStrategy", "Ll/e23;", "bitmapFramePreparer", "Ll/lnd0;", "roundingOptions", "<init>", "(Ll/xc80;Ll/c23;Ll/kr0;Ll/f23;ZLl/d23;Ll/e23;Ll/lnd0;)V", "", "getFrameCount", "()I", "frameNumber", "g", "(I)I", "width", "height", "f", "getLoopCount", "Landroid/graphics/drawable/Drawable;", "parent", "Landroid/graphics/Canvas;", "canvas", RXScreenCaptureService.KEY_INDEX, "(Landroid/graphics/drawable/Drawable;Landroid/graphics/Canvas;I)Z", "alpha", "", "h", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", Constants.INAPP_DATA_TAG, "(Landroid/graphics/ColorFilter;)V", "Landroid/graphics/Rect;", "bounds", "c", "(Landroid/graphics/Rect;)V", "a", "b", BLiveResOperation.clear, "()V", "j", "Ll/yq0$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "e", "(Ll/yq0$a;)V", "frameType", "m", "(Landroid/graphics/Canvas;II)Z", "o", "Ll/fb5;", "Landroid/graphics/Bitmap;", "targetBitmap", "n", "(ILl/fb5;)Z", "bitmap", "", "currentBoundsWidth", "currentBoundsHeight", "p", "(ILandroid/graphics/Bitmap;FF)Z", "k", "(ILandroid/graphics/Bitmap;Landroid/graphics/Canvas;)V", "bitmapReference", BLiveStormDanmakuGiftResourceType.f45292l, "(ILl/fb5;Landroid/graphics/Canvas;I)Z", "Ll/xc80;", "Ll/c23;", "Ll/kr0;", "Ll/f23;", "Z", "Ll/d23;", "Ll/e23;", "", "[F", "getCornerRadii", "()[F", "cornerRadii", "Landroid/graphics/Bitmap$Config;", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Rect;", "I", "bitmapWidth", "bitmapHeight", "Landroid/graphics/Path;", "Landroid/graphics/Path;", "path", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "matrix", "pathFrameNumber", "q", "Ll/yq0$a;", "animationListener", "Companion", "animated-drawable_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class j13 implements yq0, ar0.InterfaceC15804b {

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final Class<j13> f117913r = j13.class;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final xc80 platformBitmapFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final c23 bitmapFrameCache;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final kr0 animationInformation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final f23 bitmapFrameRenderer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean isNewRenderImplementation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final d23 bitmapFramePreparationStrategy;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final e23 bitmapFramePreparer;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public final float[] cornerRadii;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Bitmap.Config bitmapConfig;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    @NotNull
    public final Paint paint;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public Rect bounds;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    public int bitmapWidth;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public int bitmapHeight;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    @NotNull
    public final Path path;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final Matrix matrix;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    public int pathFrameNumber;

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @Nullable
    public yq0.InterfaceC21665a animationListener;

    public j13(@NotNull xc80 xc80Var, @NotNull c23 c23Var, @NotNull kr0 kr0Var, @NotNull f23 f23Var, boolean z, @Nullable d23 d23Var, @Nullable e23 e23Var, @Nullable lnd0 lnd0Var) {
        float[] cornerRadii;
        xc80Var.getClass();
        c23Var.getClass();
        kr0Var.getClass();
        f23Var.getClass();
        this.platformBitmapFactory = xc80Var;
        this.bitmapFrameCache = c23Var;
        this.animationInformation = kr0Var;
        this.bitmapFrameRenderer = f23Var;
        this.isNewRenderImplementation = z;
        this.bitmapFramePreparationStrategy = d23Var;
        this.bitmapFramePreparer = e23Var;
        if (lnd0Var == null) {
            cornerRadii = null;
        } else if (lnd0Var.getCornerRadius() == 0.0f) {
            cornerRadii = lnd0Var.getCornerRadii();
        } else {
            float[] fArr = new float[8];
            ArraysKt.fill$default(fArr, lnd0Var.getCornerRadius(), 0, 0, 6, (Object) null);
            cornerRadii = fArr;
        }
        this.cornerRadii = cornerRadii;
        this.bitmapConfig = Bitmap.Config.ARGB_8888;
        this.paint = new Paint(6);
        this.path = new Path();
        this.matrix = new Matrix();
        this.pathFrameNumber = -1;
        m143079o();
    }

    @Override // p153l.yq0
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getBitmapWidth() {
        return this.bitmapWidth;
    }

    @Override // p153l.yq0
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getBitmapHeight() {
        return this.bitmapHeight;
    }

    @Override // p153l.yq0
    /* JADX INFO: renamed from: c */
    public void mo143069c(@Nullable Rect bounds) {
        this.bounds = bounds;
        this.bitmapFrameRenderer.mo123595c(bounds);
        m143079o();
    }

    @Override // p153l.yq0
    public void clear() {
        if (!this.isNewRenderImplementation) {
            this.bitmapFrameCache.clear();
            return;
        }
        d23 d23Var = this.bitmapFramePreparationStrategy;
        if (d23Var != null) {
            d23Var.mo113660b();
        }
    }

    @Override // p153l.yq0
    /* JADX INFO: renamed from: d */
    public void mo143070d(@Nullable ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    @Override // p153l.yq0
    /* JADX INFO: renamed from: e */
    public void mo143071e(@Nullable yq0.InterfaceC21665a listener) {
        this.animationListener = listener;
    }

    @Override // p153l.kr0
    /* JADX INFO: renamed from: f */
    public int mo143072f() {
        return this.animationInformation.mo143072f();
    }

    @Override // p153l.kr0
    /* JADX INFO: renamed from: g */
    public int mo143073g(int frameNumber) {
        return this.animationInformation.mo143073g(frameNumber);
    }

    @Override // p153l.kr0
    public int getFrameCount() {
        return this.animationInformation.getFrameCount();
    }

    @Override // p153l.kr0
    public int getLoopCount() {
        return this.animationInformation.getLoopCount();
    }

    @Override // p153l.yq0
    /* JADX INFO: renamed from: h */
    public void mo143074h(@IntRange(from = 0, to = 255) int alpha) {
        this.paint.setAlpha(alpha);
    }

    @Override // p153l.kr0
    public int height() {
        return this.animationInformation.height();
    }

    @Override // p153l.yq0
    /* JADX INFO: renamed from: i */
    public boolean mo99580i(@NotNull Drawable parent, @NotNull Canvas canvas, int frameNumber) throws Throwable {
        e23 e23Var;
        d23 d23Var;
        parent.getClass();
        canvas.getClass();
        boolean zM143077m = m143077m(canvas, frameNumber, 0);
        if (!this.isNewRenderImplementation && (e23Var = this.bitmapFramePreparer) != null && (d23Var = this.bitmapFramePreparationStrategy) != null) {
            d23.C16423a.m113669f(d23Var, e23Var, this.bitmapFrameCache, this, frameNumber, null, 16, null);
        }
        return zM143077m;
    }

    @Override // p153l.ar0.InterfaceC15804b
    /* JADX INFO: renamed from: j */
    public void mo99583j() {
        if (!this.isNewRenderImplementation) {
            clear();
            return;
        }
        d23 d23Var = this.bitmapFramePreparationStrategy;
        if (d23Var != null) {
            d23Var.mo113662d();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m143075k(int frameNumber, Bitmap bitmap, Canvas canvas) {
        Rect rect = this.bounds;
        if (rect == null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.paint);
        } else if (m143080p(frameNumber, bitmap, rect.width(), rect.height())) {
            canvas.drawPath(this.path, this.paint);
        } else {
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.paint);
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m143076l(int frameNumber, fb5<Bitmap> bitmapReference, Canvas canvas, int frameType) {
        if (bitmapReference == null || !fb5.m124864Q(bitmapReference)) {
            return false;
        }
        Bitmap bitmapM124875B = bitmapReference.m124875B();
        bitmapM124875B.getClass();
        m143075k(frameNumber, bitmapM124875B, canvas);
        if (frameType == 3 || this.isNewRenderImplementation) {
            return true;
        }
        this.bitmapFrameCache.mo107668b(frameNumber, bitmapReference, frameType);
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m143077m(Canvas canvas, int frameNumber, int frameType) throws Throwable {
        fb5<Bitmap> fb5VarMo107670d;
        boolean zM143076l;
        fb5<Bitmap> fb5Var = null;
        try {
            boolean z = false;
            int i = 1;
            if (this.isNewRenderImplementation) {
                d23 d23Var = this.bitmapFramePreparationStrategy;
                fb5<Bitmap> fb5VarMo113659a = d23Var != null ? d23Var.mo113659a(frameNumber, canvas.getWidth(), canvas.getHeight()) : null;
                if (fb5VarMo113659a != null) {
                    try {
                        if (fb5VarMo113659a.mo124877N()) {
                            Bitmap bitmapM124875B = fb5VarMo113659a.m124875B();
                            bitmapM124875B.getClass();
                            m143075k(frameNumber, bitmapM124875B, canvas);
                            fb5.m124874v(fb5VarMo113659a);
                            return true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        fb5Var = fb5VarMo113659a;
                        fb5.m124874v(fb5Var);
                        throw th;
                    }
                }
                d23 d23Var2 = this.bitmapFramePreparationStrategy;
                if (d23Var2 != null) {
                    d23Var2.mo113663e(canvas.getWidth(), canvas.getHeight(), null);
                }
                fb5.m124874v(fb5VarMo113659a);
                return false;
            }
            if (frameType == 0) {
                fb5VarMo107670d = this.bitmapFrameCache.mo107670d(frameNumber);
                zM143076l = m143076l(frameNumber, fb5VarMo107670d, canvas, 0);
            } else if (frameType == 1) {
                fb5VarMo107670d = this.bitmapFrameCache.mo107672f(frameNumber, this.bitmapWidth, this.bitmapHeight);
                if (m143078n(frameNumber, fb5VarMo107670d) && m143076l(frameNumber, fb5VarMo107670d, canvas, 1)) {
                    z = true;
                }
                zM143076l = z;
                i = 2;
            } else if (frameType == 2) {
                try {
                    fb5VarMo107670d = this.platformBitmapFactory.m210133b(this.bitmapWidth, this.bitmapHeight, this.bitmapConfig);
                    if (m143078n(frameNumber, fb5VarMo107670d) && m143076l(frameNumber, fb5VarMo107670d, canvas, 2)) {
                        z = true;
                    }
                    zM143076l = z;
                    i = 3;
                } catch (RuntimeException e) {
                    huf.m137194v(f117913r, "Failed to create frame bitmap", e);
                    fb5.m124874v(null);
                    return false;
                }
            } else {
                if (frameType != 3) {
                    fb5.m124874v(null);
                    return false;
                }
                fb5VarMo107670d = this.bitmapFrameCache.mo107667a(frameNumber);
                zM143076l = m143076l(frameNumber, fb5VarMo107670d, canvas, 3);
                i = -1;
            }
            fb5.m124874v(fb5VarMo107670d);
            return (zM143076l || i == -1) ? zM143076l : m143077m(canvas, frameNumber, i);
        } catch (Throwable th2) {
            th = th2;
            fb5.m124874v(fb5Var);
            throw th;
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m143078n(int frameNumber, fb5<Bitmap> targetBitmap) {
        if (targetBitmap == null || !targetBitmap.mo124877N()) {
            return false;
        }
        f23 f23Var = this.bitmapFrameRenderer;
        Bitmap bitmapM124875B = targetBitmap.m124875B();
        bitmapM124875B.getClass();
        boolean zMo123596d = f23Var.mo123596d(frameNumber, bitmapM124875B);
        if (!zMo123596d) {
            fb5.m124874v(targetBitmap);
        }
        return zMo123596d;
    }

    /* JADX INFO: renamed from: o */
    public final void m143079o() {
        int iMo123593a = this.bitmapFrameRenderer.mo123593a();
        this.bitmapWidth = iMo123593a;
        if (iMo123593a == -1) {
            Rect rect = this.bounds;
            this.bitmapWidth = rect != null ? rect.width() : -1;
        }
        int iMo123594b = this.bitmapFrameRenderer.mo123594b();
        this.bitmapHeight = iMo123594b;
        if (iMo123594b == -1) {
            Rect rect2 = this.bounds;
            this.bitmapHeight = rect2 != null ? rect2.height() : -1;
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m143080p(int frameNumber, Bitmap bitmap, float currentBoundsWidth, float currentBoundsHeight) {
        if (this.cornerRadii == null) {
            return false;
        }
        if (frameNumber == this.pathFrameNumber) {
            return true;
        }
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        this.matrix.setRectToRect(new RectF(0.0f, 0.0f, this.bitmapWidth, this.bitmapHeight), new RectF(0.0f, 0.0f, currentBoundsWidth, currentBoundsHeight), Matrix.ScaleToFit.FILL);
        bitmapShader.setLocalMatrix(this.matrix);
        this.paint.setShader(bitmapShader);
        this.path.addRoundRect(new RectF(0.0f, 0.0f, currentBoundsWidth, currentBoundsHeight), this.cornerRadii, Path.Direction.CW);
        this.pathFrameNumber = frameNumber;
        return true;
    }

    @Override // p153l.kr0
    public int width() {
        return this.animationInformation.width();
    }
}
