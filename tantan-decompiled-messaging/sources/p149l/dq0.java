package p149l;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.clevertap.android.sdk.Constants;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 $2\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010!R\u0014\u0010#\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010!¨\u0006%"}, m87232d2 = {"Ll/dq0;", "Ll/q13;", "Ll/n13;", "bitmapFrameCache", "Ll/bq0;", "animatedDrawableBackend", "", "isNewRenderImplementation", "<init>", "(Ll/n13;Ll/bq0;Z)V", "Landroid/graphics/Rect;", "bounds", "", "c", "(Landroid/graphics/Rect;)V", "", "frameNumber", "Landroid/graphics/Bitmap;", "targetBitmap", Constants.INAPP_DATA_TAG, "(ILandroid/graphics/Bitmap;)Z", "a", "Ll/n13;", "b", "Ll/bq0;", "Z", "Lcom/facebook/imagepipeline/animated/impl/AnimatedImageCompositor;", "Lcom/facebook/imagepipeline/animated/impl/AnimatedImageCompositor;", "animatedImageCompositor", "Lcom/facebook/imagepipeline/animated/impl/AnimatedImageCompositor$b;", "e", "Lcom/facebook/imagepipeline/animated/impl/AnimatedImageCompositor$b;", "callback", "()I", "intrinsicWidth", "intrinsicHeight", "Companion", "animated-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class dq0 implements q13 {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Class<?> f87370f = dq0.class;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final n13 bitmapFrameCache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public bq0 animatedDrawableBackend;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean isNewRenderImplementation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public AnimatedImageCompositor animatedImageCompositor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final AnimatedImageCompositor.InterfaceC1615b callback;

    /* JADX INFO: renamed from: l.dq0$b */
    @Metadata(m87231d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m87232d2 = {"l/dq0$b", "Lcom/facebook/imagepipeline/animated/impl/AnimatedImageCompositor$b;", "", "frameNumber", "Landroid/graphics/Bitmap;", "bitmap", "", "a", "(ILandroid/graphics/Bitmap;)V", "Ll/fa5;", "b", "(I)Ll/fa5;", "animated-base_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C16431b implements AnimatedImageCompositor.InterfaceC1615b {
        public C16431b() {
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.InterfaceC1615b
        /* JADX INFO: renamed from: a */
        public void mo8403a(int frameNumber, Bitmap bitmap) {
            bitmap.getClass();
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.InterfaceC1615b
        /* JADX INFO: renamed from: b */
        public fa5<Bitmap> mo8404b(int frameNumber) {
            return dq0.this.bitmapFrameCache.mo141822d(frameNumber);
        }
    }

    public dq0(@NotNull n13 n13Var, @NotNull bq0 bq0Var, boolean z) {
        n13Var.getClass();
        bq0Var.getClass();
        this.bitmapFrameCache = n13Var;
        this.animatedDrawableBackend = bq0Var;
        this.isNewRenderImplementation = z;
        C16431b c16431b = new C16431b();
        this.callback = c16431b;
        this.animatedImageCompositor = new AnimatedImageCompositor(this.animatedDrawableBackend, z, c16431b);
    }

    @Override // p149l.q13
    /* JADX INFO: renamed from: a */
    public int mo112971a() {
        return this.animatedDrawableBackend.getWidth();
    }

    @Override // p149l.q13
    /* JADX INFO: renamed from: b */
    public int mo112972b() {
        return this.animatedDrawableBackend.getHeight();
    }

    @Override // p149l.q13
    /* JADX INFO: renamed from: c */
    public void mo112973c(@Nullable Rect bounds) {
        bq0 bq0VarMo103309f = this.animatedDrawableBackend.mo103309f(bounds);
        bq0VarMo103309f.getClass();
        if (bq0VarMo103309f != this.animatedDrawableBackend) {
            this.animatedDrawableBackend = bq0VarMo103309f;
            this.animatedImageCompositor = new AnimatedImageCompositor(bq0VarMo103309f, this.isNewRenderImplementation, this.callback);
        }
    }

    @Override // p149l.q13
    /* JADX INFO: renamed from: d */
    public boolean mo112974d(int frameNumber, @NotNull Bitmap targetBitmap) {
        targetBitmap.getClass();
        try {
            this.animatedImageCompositor.m8402h(frameNumber, targetBitmap);
            return true;
        } catch (IllegalStateException e) {
            tsf.m190541g(f87370f, e, "Rendering of frame unsuccessful. Frame number: %d", Integer.valueOf(frameNumber));
            return false;
        }
    }
}
