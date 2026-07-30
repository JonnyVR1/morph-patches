package p149l;

import android.graphics.Bitmap;
import androidx.annotation.UiThread;
import com.clevertap.android.sdk.Constants;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.C1601a;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.C1604d;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.FrameResult;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.InterfaceC1603c;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15167a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\b\u0004*\u00019\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\u000e*\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010'R\u0014\u0010)\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010(R\u0014\u0010,\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u001e\u00104\u001a\u0004\u0018\u00010/8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010+R\u0016\u00108\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010+R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010:¨\u0006<"}, m87232d2 = {"Ll/i4j;", "Ll/o13;", "", "source", "Ll/gr0;", "animationInformation", "Ll/q13;", "bitmapFrameRenderer", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/d;", "frameLoaderFactory", "", "downscaleFrameToDrawableDimensions", "<init>", "(Ljava/lang/String;Ll/gr0;Ll/q13;Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/d;Z)V", "", "canvasWidth", "canvasHeight", "Lkotlin/Function0;", "", "onAnimationLoaded", "e", "(IILkotlin/jvm/functions/Function0;)V", "frameNumber", "Ll/fa5;", "Landroid/graphics/Bitmap;", "a", "(III)Ll/fa5;", Constants.INAPP_DATA_TAG, "()V", "b", "Ll/b5j;", "k", "(II)Ll/b5j;", BLiveStormDanmakuGiftResourceType.f44444l, "(Ll/gr0;)I", "Ll/gr0;", "Ll/q13;", "c", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/d;", "Z", "Ljava/lang/String;", "cacheKey", "f", "I", "animationWidth", "g", "animationHeight", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/c;", "h", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/c;", "m", "()Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/c;", "frameLoader", RXScreenCaptureService.KEY_INDEX, "maxAnimationFps", "j", "currentFps", "l/i4j$a", "Ll/i4j$a;", "dynamicFpsRender", "animated-drawable_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class i4j implements o13 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final gr0 animationInformation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final q13 bitmapFrameRenderer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C1604d frameLoaderFactory;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public final boolean downscaleFrameToDrawableDimensions;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final String cacheKey;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int animationWidth;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int animationHeight;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    public InterfaceC1603c frameLoader;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int maxAnimationFps;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public int currentFps;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final C17481a dynamicFpsRender;

    /* JADX INFO: renamed from: l.i4j$a */
    @Metadata(m87231d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, m87232d2 = {"l/i4j$a", "Ll/she;", "", "renderingFps", "", "a", "(I)V", "I", "c", "()I", "animationFps", "b", "animated-drawable_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
    public static final class C17481a implements she {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int animationFps;

        public C17481a() {
            this.animationFps = i4j.this.maxAnimationFps;
        }

        @Override // p149l.she
        /* JADX INFO: renamed from: a */
        public void mo134362a(int renderingFps) {
            if (renderingFps != i4j.this.currentFps) {
                i4j i4jVar = i4j.this;
                i4jVar.currentFps = C15167a.m87601g(renderingFps, 1, i4jVar.maxAnimationFps);
                InterfaceC1603c interfaceC1603cM134361m = i4j.this.m134361m();
                if (interfaceC1603cM134361m != null) {
                    interfaceC1603cM134361m.mo8345f(i4j.this.currentFps);
                }
            }
        }

        @Override // p149l.she
        /* JADX INFO: renamed from: b */
        public int mo134363b() {
            return i4j.this.currentFps;
        }

        @Override // p149l.she
        /* JADX INFO: renamed from: c, reason: from getter */
        public int getAnimationFps() {
            return this.animationFps;
        }
    }

    public i4j(@Nullable String str, @NotNull gr0 gr0Var, @NotNull q13 q13Var, @NotNull C1604d c1604d, boolean z) {
        gr0Var.getClass();
        q13Var.getClass();
        c1604d.getClass();
        this.animationInformation = gr0Var;
        this.bitmapFrameRenderer = q13Var;
        this.frameLoaderFactory = c1604d;
        this.downscaleFrameToDrawableDimensions = z;
        this.cacheKey = str == null ? String.valueOf(hashCode()) : str;
        this.animationWidth = gr0Var.width();
        this.animationHeight = gr0Var.height();
        int iM134360l = m134360l(gr0Var);
        this.maxAnimationFps = iM134360l;
        this.currentFps = iM134360l;
        this.dynamicFpsRender = new C17481a();
    }

    /* JADX INFO: renamed from: f */
    public static Unit m134349f() {
        return Unit.INSTANCE;
    }

    @Override // p149l.o13
    @UiThread
    @Nullable
    /* JADX INFO: renamed from: a */
    public fa5<Bitmap> mo134354a(int frameNumber, int canvasWidth, int canvasHeight) {
        b5j b5jVarM134359k = m134359k(canvasWidth, canvasHeight);
        InterfaceC1603c interfaceC1603cM134361m = m134361m();
        FrameResult frameResultMo8346g = interfaceC1603cM134361m != null ? interfaceC1603cM134361m.mo8346g(frameNumber, b5jVarM134359k.getWidth(), b5jVarM134359k.getHeight()) : null;
        if (frameResultMo8346g != null) {
            C1601a.INSTANCE.m8335e(this.dynamicFpsRender, frameResultMo8346g);
        }
        if (frameResultMo8346g != null) {
            return frameResultMo8346g.m8329a();
        }
        return null;
    }

    @Override // p149l.o13
    /* JADX INFO: renamed from: b */
    public void mo134355b() {
        InterfaceC1603c interfaceC1603cM134361m = m134361m();
        if (interfaceC1603cM134361m != null) {
            C1604d.INSTANCE.m8362b(this.cacheKey, interfaceC1603cM134361m);
        }
        this.frameLoader = null;
    }

    @Override // p149l.o13
    /* JADX INFO: renamed from: c */
    public void mo134356c(@NotNull p13 p13Var, @NotNull n13 n13Var, @NotNull uq0 uq0Var, int i, @Nullable Function0<Unit> function0) {
        o13.C18814a.m162234e(this, p13Var, n13Var, uq0Var, i, function0);
    }

    @Override // p149l.o13
    /* JADX INFO: renamed from: d */
    public void mo134357d() {
        InterfaceC1603c interfaceC1603cM134361m = m134361m();
        if (interfaceC1603cM134361m != null) {
            interfaceC1603cM134361m.mo8343d();
        }
        mo134355b();
    }

    @Override // p149l.o13
    @UiThread
    /* JADX INFO: renamed from: e */
    public void mo134358e(int canvasWidth, int canvasHeight, @Nullable Function0<Unit> onAnimationLoaded) {
        if (canvasWidth <= 0 || canvasHeight <= 0 || this.animationWidth <= 0 || this.animationHeight <= 0) {
            return;
        }
        b5j b5jVarM134359k = m134359k(canvasWidth, canvasHeight);
        InterfaceC1603c interfaceC1603cM134361m = m134361m();
        if (interfaceC1603cM134361m != null) {
            int width = b5jVarM134359k.getWidth();
            int width2 = b5jVarM134359k.getWidth();
            if (onAnimationLoaded == null) {
                onAnimationLoaded = new Function0() { // from class: l.h4j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return i4j.m134349f();
                    }
                };
            }
            interfaceC1603cM134361m.mo8344e(width, width2, onAnimationLoaded);
        }
    }

    /* JADX INFO: renamed from: k */
    public final b5j m134359k(int canvasWidth, int canvasHeight) {
        boolean z = this.downscaleFrameToDrawableDimensions;
        int iM87599e = this.animationWidth;
        if (!z) {
            return new b5j(iM87599e, this.animationHeight);
        }
        int iM87599e2 = this.animationHeight;
        if (canvasWidth < iM87599e || canvasHeight < iM87599e2) {
            double d = ((double) iM87599e) / ((double) iM87599e2);
            if (canvasHeight > canvasWidth) {
                iM87599e2 = C15167a.m87599e(canvasHeight, iM87599e2);
                iM87599e = (int) (((double) iM87599e2) * d);
            } else {
                iM87599e = C15167a.m87599e(canvasWidth, iM87599e);
                iM87599e2 = (int) (((double) iM87599e) / d);
            }
        }
        return new b5j(iM87599e, iM87599e2);
    }

    /* JADX INFO: renamed from: l */
    public final int m134360l(gr0 gr0Var) {
        return (int) C15167a.m87597c(1000 / ((long) (gr0Var.mo108210f() / gr0Var.getFrameCount())), 1L);
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC1603c m134361m() {
        if (this.frameLoader == null) {
            this.frameLoader = this.frameLoaderFactory.m8360b(this.cacheKey, this.bitmapFrameRenderer, this.animationInformation);
        }
        return this.frameLoader;
    }
}
