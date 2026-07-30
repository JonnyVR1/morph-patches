package p153l;

import android.graphics.Bitmap;
import androidx.annotation.UiThread;
import com.clevertap.android.sdk.Constants;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.C1624a;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.C1627d;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.FrameResult;
import com.facebook.fresco.animation.bitmap.preparation.ondemandanimation.InterfaceC1626c;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.C15274a;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000_\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\b\u0004*\u00019\u0018\u00002\u00020\u0001B1\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u000e\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J/\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0013\u0010!\u001a\u00020\u000e*\u00020\u0004H\u0002¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010$R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010'R\u0014\u0010)\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010(R\u0014\u0010,\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010.\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u001e\u00104\u001a\u0004\u0018\u00010/8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0014\u00106\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u0010+R\u0016\u00108\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010+R\u0014\u0010;\u001a\u0002098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010:¨\u0006<"}, m88121d2 = {"Ll/d7j;", "Ll/d23;", "", "source", "Ll/kr0;", "animationInformation", "Ll/f23;", "bitmapFrameRenderer", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/d;", "frameLoaderFactory", "", "downscaleFrameToDrawableDimensions", "<init>", "(Ljava/lang/String;Ll/kr0;Ll/f23;Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/d;Z)V", "", "canvasWidth", "canvasHeight", "Lkotlin/Function0;", "", "onAnimationLoaded", "e", "(IILkotlin/jvm/functions/Function0;)V", "frameNumber", "Ll/fb5;", "Landroid/graphics/Bitmap;", "a", "(III)Ll/fb5;", Constants.INAPP_DATA_TAG, "()V", "b", "Ll/w7j;", "k", "(II)Ll/w7j;", BLiveStormDanmakuGiftResourceType.f45292l, "(Ll/kr0;)I", "Ll/kr0;", "Ll/f23;", "c", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/d;", "Z", "Ljava/lang/String;", "cacheKey", "f", "I", "animationWidth", "g", "animationHeight", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/c;", "h", "Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/c;", "m", "()Lcom/facebook/fresco/animation/bitmap/preparation/ondemandanimation/c;", "frameLoader", RXScreenCaptureService.KEY_INDEX, "maxAnimationFps", "j", "currentFps", "l/d7j$a", "Ll/d7j$a;", "dynamicFpsRender", "animated-drawable_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
@SourceDebugExtension
public final class d7j implements d23 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final kr0 animationInformation;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final f23 bitmapFrameRenderer;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @NotNull
    public final C1627d frameLoaderFactory;

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
    public InterfaceC1626c frameLoader;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public final int maxAnimationFps;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public int currentFps;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final C16475a dynamicFpsRender;

    /* JADX INFO: renamed from: l.d7j$a */
    @Metadata(m88120d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\n\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0007\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\t¨\u0006\f"}, m88121d2 = {"l/d7j$a", "Ll/wie;", "", "renderingFps", "", "a", "(I)V", "I", "c", "()I", "animationFps", "b", "animated-drawable_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
    public static final class C16475a implements wie {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata */
        public final int animationFps;

        public C16475a() {
            this.animationFps = d7j.this.maxAnimationFps;
        }

        @Override // p153l.wie
        /* JADX INFO: renamed from: a */
        public void mo114746a(int renderingFps) {
            if (renderingFps != d7j.this.currentFps) {
                d7j d7jVar = d7j.this;
                d7jVar.currentFps = C15274a.m88492h(renderingFps, 1, d7jVar.maxAnimationFps);
                InterfaceC1626c interfaceC1626cM114745m = d7j.this.m114745m();
                if (interfaceC1626cM114745m != null) {
                    interfaceC1626cM114745m.mo8399f(d7j.this.currentFps);
                }
            }
        }

        @Override // p153l.wie
        /* JADX INFO: renamed from: b */
        public int mo114747b() {
            return d7j.this.currentFps;
        }

        @Override // p153l.wie
        /* JADX INFO: renamed from: c, reason: from getter */
        public int getAnimationFps() {
            return this.animationFps;
        }
    }

    public d7j(@Nullable String str, @NotNull kr0 kr0Var, @NotNull f23 f23Var, @NotNull C1627d c1627d, boolean z) {
        kr0Var.getClass();
        f23Var.getClass();
        c1627d.getClass();
        this.animationInformation = kr0Var;
        this.bitmapFrameRenderer = f23Var;
        this.frameLoaderFactory = c1627d;
        this.downscaleFrameToDrawableDimensions = z;
        this.cacheKey = str == null ? String.valueOf(hashCode()) : str;
        this.animationWidth = kr0Var.width();
        this.animationHeight = kr0Var.height();
        int iM114744l = m114744l(kr0Var);
        this.maxAnimationFps = iM114744l;
        this.currentFps = iM114744l;
        this.dynamicFpsRender = new C16475a();
    }

    /* JADX INFO: renamed from: f */
    public static Unit m114738f() {
        return Unit.INSTANCE;
    }

    @Override // p153l.d23
    @UiThread
    @Nullable
    /* JADX INFO: renamed from: a */
    public fb5<Bitmap> mo113659a(int frameNumber, int canvasWidth, int canvasHeight) {
        w7j w7jVarM114743k = m114743k(canvasWidth, canvasHeight);
        InterfaceC1626c interfaceC1626cM114745m = m114745m();
        FrameResult frameResultMo8400g = interfaceC1626cM114745m != null ? interfaceC1626cM114745m.mo8400g(frameNumber, w7jVarM114743k.getWidth(), w7jVarM114743k.getHeight()) : null;
        if (frameResultMo8400g != null) {
            C1624a.INSTANCE.m8389e(this.dynamicFpsRender, frameResultMo8400g);
        }
        if (frameResultMo8400g != null) {
            return frameResultMo8400g.m8383a();
        }
        return null;
    }

    @Override // p153l.d23
    /* JADX INFO: renamed from: b */
    public void mo113660b() {
        InterfaceC1626c interfaceC1626cM114745m = m114745m();
        if (interfaceC1626cM114745m != null) {
            C1627d.INSTANCE.m8416b(this.cacheKey, interfaceC1626cM114745m);
        }
        this.frameLoader = null;
    }

    @Override // p153l.d23
    /* JADX INFO: renamed from: c */
    public void mo113661c(@NotNull e23 e23Var, @NotNull c23 c23Var, @NotNull yq0 yq0Var, int i, @Nullable Function0<Unit> function0) {
        d23.C16423a.m113668e(this, e23Var, c23Var, yq0Var, i, function0);
    }

    @Override // p153l.d23
    /* JADX INFO: renamed from: d */
    public void mo113662d() {
        InterfaceC1626c interfaceC1626cM114745m = m114745m();
        if (interfaceC1626cM114745m != null) {
            interfaceC1626cM114745m.mo8397d();
        }
        mo113660b();
    }

    @Override // p153l.d23
    @UiThread
    /* JADX INFO: renamed from: e */
    public void mo113663e(int canvasWidth, int canvasHeight, @Nullable Function0<Unit> onAnimationLoaded) {
        if (canvasWidth <= 0 || canvasHeight <= 0 || this.animationWidth <= 0 || this.animationHeight <= 0) {
            return;
        }
        w7j w7jVarM114743k = m114743k(canvasWidth, canvasHeight);
        InterfaceC1626c interfaceC1626cM114745m = m114745m();
        if (interfaceC1626cM114745m != null) {
            int width = w7jVarM114743k.getWidth();
            int width2 = w7jVarM114743k.getWidth();
            if (onAnimationLoaded == null) {
                onAnimationLoaded = new Function0() { // from class: l.c7j
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d7j.m114738f();
                    }
                };
            }
            interfaceC1626cM114745m.mo8398e(width, width2, onAnimationLoaded);
        }
    }

    /* JADX INFO: renamed from: k */
    public final w7j m114743k(int canvasWidth, int canvasHeight) {
        boolean z = this.downscaleFrameToDrawableDimensions;
        int iM88489e = this.animationWidth;
        if (!z) {
            return new w7j(iM88489e, this.animationHeight);
        }
        int iM88489e2 = this.animationHeight;
        if (canvasWidth < iM88489e || canvasHeight < iM88489e2) {
            double d = ((double) iM88489e) / ((double) iM88489e2);
            if (canvasHeight > canvasWidth) {
                iM88489e2 = C15274a.m88489e(canvasHeight, iM88489e2);
                iM88489e = (int) (((double) iM88489e2) * d);
            } else {
                iM88489e = C15274a.m88489e(canvasWidth, iM88489e);
                iM88489e2 = (int) (((double) iM88489e) / d);
            }
        }
        return new w7j(iM88489e, iM88489e2);
    }

    /* JADX INFO: renamed from: l */
    public final int m114744l(kr0 kr0Var) {
        return (int) C15274a.m88487c(1000 / ((long) (kr0Var.mo143072f() / kr0Var.getFrameCount())), 1L);
    }

    /* JADX INFO: renamed from: m */
    public final InterfaceC1626c m114745m() {
        if (this.frameLoader == null) {
            this.frameLoader = this.frameLoaderFactory.m8414b(this.cacheKey, this.bitmapFrameRenderer, this.animationInformation);
        }
        return this.frameLoader;
    }
}
