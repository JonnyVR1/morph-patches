package p153l;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.clevertap.android.sdk.Constants;
import com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 $2\u00020\u0001:\u0001\u0015B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0005\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0019R\u0016\u0010\u001c\u001a\u00020\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR\u0014\u0010 \u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\"\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010!R\u0014\u0010#\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010!¨\u0006%"}, m88121d2 = {"Ll/zp0;", "Ll/f23;", "Ll/c23;", "bitmapFrameCache", "Ll/xp0;", "animatedDrawableBackend", "", "isNewRenderImplementation", "<init>", "(Ll/c23;Ll/xp0;Z)V", "Landroid/graphics/Rect;", "bounds", "", "c", "(Landroid/graphics/Rect;)V", "", "frameNumber", "Landroid/graphics/Bitmap;", "targetBitmap", Constants.INAPP_DATA_TAG, "(ILandroid/graphics/Bitmap;)Z", "a", "Ll/c23;", "b", "Ll/xp0;", "Z", "Lcom/facebook/imagepipeline/animated/impl/AnimatedImageCompositor;", "Lcom/facebook/imagepipeline/animated/impl/AnimatedImageCompositor;", "animatedImageCompositor", "Lcom/facebook/imagepipeline/animated/impl/AnimatedImageCompositor$b;", "e", "Lcom/facebook/imagepipeline/animated/impl/AnimatedImageCompositor$b;", "callback", "()I", "intrinsicWidth", "intrinsicHeight", "Companion", "animated-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class zp0 implements f23 {

    /* JADX INFO: renamed from: f */
    @NotNull
    public static final Class<?> f205409f = zp0.class;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final c23 bitmapFrameCache;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public xp0 animatedDrawableBackend;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public final boolean isNewRenderImplementation;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @NotNull
    public AnimatedImageCompositor animatedImageCompositor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final AnimatedImageCompositor.InterfaceC1638b callback;

    /* JADX INFO: renamed from: l.zp0$b */
    @Metadata(m88120d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m88121d2 = {"l/zp0$b", "Lcom/facebook/imagepipeline/animated/impl/AnimatedImageCompositor$b;", "", "frameNumber", "Landroid/graphics/Bitmap;", "bitmap", "", "a", "(ILandroid/graphics/Bitmap;)V", "Ll/fb5;", "b", "(I)Ll/fb5;", "animated-base_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C21848b implements AnimatedImageCompositor.InterfaceC1638b {
        public C21848b() {
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.InterfaceC1638b
        /* JADX INFO: renamed from: a */
        public void mo8457a(int frameNumber, Bitmap bitmap) {
            bitmap.getClass();
        }

        @Override // com.facebook.imagepipeline.animated.impl.AnimatedImageCompositor.InterfaceC1638b
        /* JADX INFO: renamed from: b */
        public fb5<Bitmap> mo8458b(int frameNumber) {
            return zp0.this.bitmapFrameCache.mo107670d(frameNumber);
        }
    }

    public zp0(@NotNull c23 c23Var, @NotNull xp0 xp0Var, boolean z) {
        c23Var.getClass();
        xp0Var.getClass();
        this.bitmapFrameCache = c23Var;
        this.animatedDrawableBackend = xp0Var;
        this.isNewRenderImplementation = z;
        C21848b c21848b = new C21848b();
        this.callback = c21848b;
        this.animatedImageCompositor = new AnimatedImageCompositor(this.animatedDrawableBackend, z, c21848b);
    }

    @Override // p153l.f23
    /* JADX INFO: renamed from: a */
    public int mo123593a() {
        return this.animatedDrawableBackend.getWidth();
    }

    @Override // p153l.f23
    /* JADX INFO: renamed from: b */
    public int mo123594b() {
        return this.animatedDrawableBackend.getHeight();
    }

    @Override // p153l.f23
    /* JADX INFO: renamed from: c */
    public void mo123595c(@Nullable Rect bounds) {
        xp0 xp0VarMo99395f = this.animatedDrawableBackend.mo99395f(bounds);
        xp0VarMo99395f.getClass();
        if (xp0VarMo99395f != this.animatedDrawableBackend) {
            this.animatedDrawableBackend = xp0VarMo99395f;
            this.animatedImageCompositor = new AnimatedImageCompositor(xp0VarMo99395f, this.isNewRenderImplementation, this.callback);
        }
    }

    @Override // p153l.f23
    /* JADX INFO: renamed from: d */
    public boolean mo123596d(int frameNumber, @NotNull Bitmap targetBitmap) {
        targetBitmap.getClass();
        try {
            this.animatedImageCompositor.m8456h(frameNumber, targetBitmap);
            return true;
        } catch (IllegalStateException e) {
            huf.m137179g(f205409f, e, "Rendering of frame unsuccessful. Frame number: %d", Integer.valueOf(frameNumber));
            return false;
        }
    }
}
