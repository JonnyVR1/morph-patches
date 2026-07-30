package p149l;

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
import com.p046p1.mobile.putong.live.base.data.BLiveResOperation;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0010\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 n2\u00020\u00012\u00020\u0002:\u00011BO\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001b\u0010\u0017J\u000f\u0010\u001c\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001c\u0010\u0017J\u000f\u0010\u001d\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001d\u0010\u0017J\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u0017J'\u0010#\u001a\u00020\u000b2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u0015H\u0016¢\u0006\u0004\b#\u0010$J\u0019\u0010'\u001a\u00020&2\b\b\u0001\u0010%\u001a\u00020\u0015H\u0016¢\u0006\u0004\b'\u0010(J\u0019\u0010+\u001a\u00020&2\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b+\u0010,J\u0019\u0010/\u001a\u00020&2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0015H\u0016¢\u0006\u0004\b1\u0010\u0017J\u000f\u00102\u001a\u00020\u0015H\u0016¢\u0006\u0004\b2\u0010\u0017J\u000f\u00103\u001a\u00020&H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020&H\u0016¢\u0006\u0004\b5\u00104J\u0019\u00108\u001a\u00020&2\b\u00107\u001a\u0004\u0018\u000106H\u0016¢\u0006\u0004\b8\u00109J'\u0010;\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010:\u001a\u00020\u0015H\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020&H\u0002¢\u0006\u0004\b=\u00104J'\u0010A\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00152\u000e\u0010@\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010>H\u0002¢\u0006\u0004\bA\u0010BJ/\u0010G\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010C\u001a\u00020?2\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020DH\u0002¢\u0006\u0004\bG\u0010HJ'\u0010I\u001a\u00020&2\u0006\u0010\u0018\u001a\u00020\u00152\u0006\u0010C\u001a\u00020?2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\bI\u0010JJ7\u0010L\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00152\u000e\u0010K\u001a\n\u0012\u0004\u0012\u00020?\u0018\u00010>2\u0006\u0010\"\u001a\u00020!2\u0006\u0010:\u001a\u00020\u0015H\u0002¢\u0006\u0004\bL\u0010MR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010NR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010OR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010PR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010QR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010RR\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010SR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010TR\u0019\u0010Y\u001a\u0004\u0018\u00010U8\u0006¢\u0006\f\n\u0004\b'\u0010V\u001a\u0004\bW\u0010XR\u0014\u0010\\\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010[R\u0014\u0010_\u001a\u00020]8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010^R\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bI\u0010`R\u0016\u0010b\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bL\u0010aR\u0016\u0010c\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010aR\u0014\u0010f\u001a\u00020d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010eR\u0014\u0010i\u001a\u00020g8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010hR\u0016\u0010j\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010aR\u0018\u0010m\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010l¨\u0006o"}, m87232d2 = {"Ll/u03;", "Ll/uq0;", "Ll/wq0$b;", "Ll/r480;", "platformBitmapFactory", "Ll/n13;", "bitmapFrameCache", "Ll/gr0;", "animationInformation", "Ll/q13;", "bitmapFrameRenderer", "", "isNewRenderImplementation", "Ll/o13;", "bitmapFramePreparationStrategy", "Ll/p13;", "bitmapFramePreparer", "Ll/ifd0;", "roundingOptions", "<init>", "(Ll/r480;Ll/n13;Ll/gr0;Ll/q13;ZLl/o13;Ll/p13;Ll/ifd0;)V", "", "getFrameCount", "()I", "frameNumber", "g", "(I)I", "width", "height", "f", "getLoopCount", "Landroid/graphics/drawable/Drawable;", "parent", "Landroid/graphics/Canvas;", "canvas", RXScreenCaptureService.KEY_INDEX, "(Landroid/graphics/drawable/Drawable;Landroid/graphics/Canvas;I)Z", "alpha", "", "h", "(I)V", "Landroid/graphics/ColorFilter;", "colorFilter", Constants.INAPP_DATA_TAG, "(Landroid/graphics/ColorFilter;)V", "Landroid/graphics/Rect;", "bounds", "c", "(Landroid/graphics/Rect;)V", "a", "b", BLiveResOperation.clear, "()V", "j", "Ll/uq0$a;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "e", "(Ll/uq0$a;)V", "frameType", "m", "(Landroid/graphics/Canvas;II)Z", "o", "Ll/fa5;", "Landroid/graphics/Bitmap;", "targetBitmap", "n", "(ILl/fa5;)Z", "bitmap", "", "currentBoundsWidth", "currentBoundsHeight", "p", "(ILandroid/graphics/Bitmap;FF)Z", "k", "(ILandroid/graphics/Bitmap;Landroid/graphics/Canvas;)V", "bitmapReference", BLiveStormDanmakuGiftResourceType.f44444l, "(ILl/fa5;Landroid/graphics/Canvas;I)Z", "Ll/r480;", "Ll/n13;", "Ll/gr0;", "Ll/q13;", "Z", "Ll/o13;", "Ll/p13;", "", "[F", "getCornerRadii", "()[F", "cornerRadii", "Landroid/graphics/Bitmap$Config;", "Landroid/graphics/Bitmap$Config;", "bitmapConfig", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Rect;", "I", "bitmapWidth", "bitmapHeight", "Landroid/graphics/Path;", "Landroid/graphics/Path;", "path", "Landroid/graphics/Matrix;", "Landroid/graphics/Matrix;", "matrix", "pathFrameNumber", "q", "Ll/uq0$a;", "animationListener", "Companion", "animated-drawable_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class u03 implements uq0, wq0.InterfaceC20939b {

    /* JADX INFO: renamed from: r */
    @NotNull
    public static final Class<u03> f172824r = u03.class;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final r480 platformBitmapFactory;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final n13 bitmapFrameCache;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final gr0 animationInformation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public final q13 bitmapFrameRenderer;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public final boolean isNewRenderImplementation;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public final o13 bitmapFramePreparationStrategy;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public final p13 bitmapFramePreparer;

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
    public uq0.InterfaceC20483a animationListener;

    public u03(@NotNull r480 r480Var, @NotNull n13 n13Var, @NotNull gr0 gr0Var, @NotNull q13 q13Var, boolean z, @Nullable o13 o13Var, @Nullable p13 p13Var, @Nullable ifd0 ifd0Var) {
        float[] cornerRadii;
        r480Var.getClass();
        n13Var.getClass();
        gr0Var.getClass();
        q13Var.getClass();
        this.platformBitmapFactory = r480Var;
        this.bitmapFrameCache = n13Var;
        this.animationInformation = gr0Var;
        this.bitmapFrameRenderer = q13Var;
        this.isNewRenderImplementation = z;
        this.bitmapFramePreparationStrategy = o13Var;
        this.bitmapFramePreparer = p13Var;
        if (ifd0Var == null) {
            cornerRadii = null;
        } else if (ifd0Var.getCornerRadius() == 0.0f) {
            cornerRadii = ifd0Var.getCornerRadii();
        } else {
            float[] fArr = new float[8];
            ArraysKt.fill$default(fArr, ifd0Var.getCornerRadius(), 0, 0, 6, (Object) null);
            cornerRadii = fArr;
        }
        this.cornerRadii = cornerRadii;
        this.bitmapConfig = Bitmap.Config.ARGB_8888;
        this.paint = new Paint(6);
        this.path = new Path();
        this.matrix = new Matrix();
        this.pathFrameNumber = -1;
        m191281o();
    }

    @Override // p149l.uq0
    /* JADX INFO: renamed from: a, reason: from getter */
    public int getBitmapWidth() {
        return this.bitmapWidth;
    }

    @Override // p149l.uq0
    /* JADX INFO: renamed from: b, reason: from getter */
    public int getBitmapHeight() {
        return this.bitmapHeight;
    }

    @Override // p149l.uq0
    /* JADX INFO: renamed from: c */
    public void mo191271c(@Nullable Rect bounds) {
        this.bounds = bounds;
        this.bitmapFrameRenderer.mo112973c(bounds);
        m191281o();
    }

    @Override // p149l.uq0
    public void clear() {
        if (!this.isNewRenderImplementation) {
            this.bitmapFrameCache.clear();
            return;
        }
        o13 o13Var = this.bitmapFramePreparationStrategy;
        if (o13Var != null) {
            o13Var.mo134355b();
        }
    }

    @Override // p149l.uq0
    /* JADX INFO: renamed from: d */
    public void mo191272d(@Nullable ColorFilter colorFilter) {
        this.paint.setColorFilter(colorFilter);
    }

    @Override // p149l.uq0
    /* JADX INFO: renamed from: e */
    public void mo191273e(@Nullable uq0.InterfaceC20483a listener) {
        this.animationListener = listener;
    }

    @Override // p149l.gr0
    /* JADX INFO: renamed from: f */
    public int mo108210f() {
        return this.animationInformation.mo108210f();
    }

    @Override // p149l.gr0
    /* JADX INFO: renamed from: g */
    public int mo108211g(int frameNumber) {
        return this.animationInformation.mo108211g(frameNumber);
    }

    @Override // p149l.gr0
    public int getFrameCount() {
        return this.animationInformation.getFrameCount();
    }

    @Override // p149l.gr0
    public int getLoopCount() {
        return this.animationInformation.getLoopCount();
    }

    @Override // p149l.uq0
    /* JADX INFO: renamed from: h */
    public void mo191274h(@IntRange(from = 0, to = 255) int alpha) {
        this.paint.setAlpha(alpha);
    }

    @Override // p149l.gr0
    public int height() {
        return this.animationInformation.height();
    }

    @Override // p149l.uq0
    /* JADX INFO: renamed from: i */
    public boolean mo191275i(@NotNull Drawable parent, @NotNull Canvas canvas, int frameNumber) throws Throwable {
        p13 p13Var;
        o13 o13Var;
        parent.getClass();
        canvas.getClass();
        boolean zM191279m = m191279m(canvas, frameNumber, 0);
        if (!this.isNewRenderImplementation && (p13Var = this.bitmapFramePreparer) != null && (o13Var = this.bitmapFramePreparationStrategy) != null) {
            o13.C18814a.m162235f(o13Var, p13Var, this.bitmapFrameCache, this, frameNumber, null, 16, null);
        }
        return zM191279m;
    }

    @Override // p149l.wq0.InterfaceC20939b
    /* JADX INFO: renamed from: j */
    public void mo191276j() {
        if (!this.isNewRenderImplementation) {
            clear();
            return;
        }
        o13 o13Var = this.bitmapFramePreparationStrategy;
        if (o13Var != null) {
            o13Var.mo134357d();
        }
    }

    /* JADX INFO: renamed from: k */
    public final void m191277k(int frameNumber, Bitmap bitmap, Canvas canvas) {
        Rect rect = this.bounds;
        if (rect == null) {
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, this.paint);
        } else if (m191282p(frameNumber, bitmap, rect.width(), rect.height())) {
            canvas.drawPath(this.path, this.paint);
        } else {
            canvas.drawBitmap(bitmap, (Rect) null, rect, this.paint);
        }
    }

    /* JADX INFO: renamed from: l */
    public final boolean m191278l(int frameNumber, fa5<Bitmap> bitmapReference, Canvas canvas, int frameType) {
        if (bitmapReference == null || !fa5.m120144Q(bitmapReference)) {
            return false;
        }
        Bitmap bitmapM120155B = bitmapReference.m120155B();
        bitmapM120155B.getClass();
        m191277k(frameNumber, bitmapM120155B, canvas);
        if (frameType == 3 || this.isNewRenderImplementation) {
            return true;
        }
        this.bitmapFrameCache.mo141820b(frameNumber, bitmapReference, frameType);
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final boolean m191279m(Canvas canvas, int frameNumber, int frameType) throws Throwable {
        fa5<Bitmap> fa5VarMo141822d;
        boolean zM191278l;
        fa5<Bitmap> fa5Var = null;
        try {
            boolean z = false;
            int i = 1;
            if (this.isNewRenderImplementation) {
                o13 o13Var = this.bitmapFramePreparationStrategy;
                fa5<Bitmap> fa5VarMo134354a = o13Var != null ? o13Var.mo134354a(frameNumber, canvas.getWidth(), canvas.getHeight()) : null;
                if (fa5VarMo134354a != null) {
                    try {
                        if (fa5VarMo134354a.mo120157N()) {
                            Bitmap bitmapM120155B = fa5VarMo134354a.m120155B();
                            bitmapM120155B.getClass();
                            m191277k(frameNumber, bitmapM120155B, canvas);
                            fa5.m120154v(fa5VarMo134354a);
                            return true;
                        }
                    } catch (Throwable th) {
                        th = th;
                        fa5Var = fa5VarMo134354a;
                        fa5.m120154v(fa5Var);
                        throw th;
                    }
                }
                o13 o13Var2 = this.bitmapFramePreparationStrategy;
                if (o13Var2 != null) {
                    o13Var2.mo134358e(canvas.getWidth(), canvas.getHeight(), null);
                }
                fa5.m120154v(fa5VarMo134354a);
                return false;
            }
            if (frameType == 0) {
                fa5VarMo141822d = this.bitmapFrameCache.mo141822d(frameNumber);
                zM191278l = m191278l(frameNumber, fa5VarMo141822d, canvas, 0);
            } else if (frameType == 1) {
                fa5VarMo141822d = this.bitmapFrameCache.mo141824f(frameNumber, this.bitmapWidth, this.bitmapHeight);
                if (m191280n(frameNumber, fa5VarMo141822d) && m191278l(frameNumber, fa5VarMo141822d, canvas, 1)) {
                    z = true;
                }
                zM191278l = z;
                i = 2;
            } else if (frameType == 2) {
                try {
                    fa5VarMo141822d = this.platformBitmapFactory.m177781b(this.bitmapWidth, this.bitmapHeight, this.bitmapConfig);
                    if (m191280n(frameNumber, fa5VarMo141822d) && m191278l(frameNumber, fa5VarMo141822d, canvas, 2)) {
                        z = true;
                    }
                    zM191278l = z;
                    i = 3;
                } catch (RuntimeException e) {
                    tsf.m190556v(f172824r, "Failed to create frame bitmap", e);
                    fa5.m120154v(null);
                    return false;
                }
            } else {
                if (frameType != 3) {
                    fa5.m120154v(null);
                    return false;
                }
                fa5VarMo141822d = this.bitmapFrameCache.mo141819a(frameNumber);
                zM191278l = m191278l(frameNumber, fa5VarMo141822d, canvas, 3);
                i = -1;
            }
            fa5.m120154v(fa5VarMo141822d);
            return (zM191278l || i == -1) ? zM191278l : m191279m(canvas, frameNumber, i);
        } catch (Throwable th2) {
            th = th2;
            fa5.m120154v(fa5Var);
            throw th;
        }
    }

    /* JADX INFO: renamed from: n */
    public final boolean m191280n(int frameNumber, fa5<Bitmap> targetBitmap) {
        if (targetBitmap == null || !targetBitmap.mo120157N()) {
            return false;
        }
        q13 q13Var = this.bitmapFrameRenderer;
        Bitmap bitmapM120155B = targetBitmap.m120155B();
        bitmapM120155B.getClass();
        boolean zMo112974d = q13Var.mo112974d(frameNumber, bitmapM120155B);
        if (!zMo112974d) {
            fa5.m120154v(targetBitmap);
        }
        return zMo112974d;
    }

    /* JADX INFO: renamed from: o */
    public final void m191281o() {
        int iMo112971a = this.bitmapFrameRenderer.mo112971a();
        this.bitmapWidth = iMo112971a;
        if (iMo112971a == -1) {
            Rect rect = this.bounds;
            this.bitmapWidth = rect != null ? rect.width() : -1;
        }
        int iMo112972b = this.bitmapFrameRenderer.mo112972b();
        this.bitmapHeight = iMo112972b;
        if (iMo112972b == -1) {
            Rect rect2 = this.bounds;
            this.bitmapHeight = rect2 != null ? rect2.height() : -1;
        }
    }

    /* JADX INFO: renamed from: p */
    public final boolean m191282p(int frameNumber, Bitmap bitmap, float currentBoundsWidth, float currentBoundsHeight) {
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

    @Override // p149l.gr0
    public int width() {
        return this.animationInformation.width();
    }
}
