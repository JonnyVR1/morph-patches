package p149l;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.clevertap.android.sdk.inapp.pipsdk.C1265a;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R*\u0010(\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\"8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b \u0010'R*\u0010*\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\"8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010$\u001a\u0004\b)\u0010&\"\u0004\b#\u0010'R\u0016\u0010-\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010,R\u001a\u00100\u001a\u00020+8\u0016X\u0096D¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b\u001c\u0010/R\u001a\u00102\u001a\u00020+8\u0016X\u0096D¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u0010/¨\u00063"}, m87232d2 = {"Ll/gim;", "Ll/lux;", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "resourceProvider", "Ljava/util/concurrent/ExecutorService;", "mediaExecutor", "<init>", "(Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;Ljava/util/concurrent/ExecutorService;)V", "Landroid/widget/ImageView;", "iv", "Lcom/clevertap/android/sdk/inapp/pipsdk/a;", Constants.KEY_CONFIG, "", "q", "(Landroid/widget/ImageView;Lcom/clevertap/android/sdk/inapp/pipsdk/a;)V", "Landroid/view/ViewGroup;", "container", "Ll/y360;", "session", "g", "(Landroid/view/ViewGroup;Lcom/clevertap/android/sdk/inapp/pipsdk/a;Ll/y360;)V", "a", "(Landroid/view/ViewGroup;Ll/y360;)V", "release", "()V", "f", "c", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "b", "Ljava/util/concurrent/ExecutorService;", "Landroid/widget/ImageView;", "imageView", Constants.INAPP_DATA_TAG, "Lcom/clevertap/android/sdk/inapp/pipsdk/a;", "Lkotlin/Function0;", "e", "Lkotlin/jvm/functions/Function0;", "p", "()Lkotlin/jvm/functions/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "onMediaReady", "o", "onAllMediaFailed", "", "Z", "released", "h", "()Z", "isMuted", RXScreenCaptureService.KEY_INDEX, "isPlaying", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
public final class gim implements lux {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final FileResourceProvider resourceProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ExecutorService mediaExecutor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private ImageView imageView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private C1265a config;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> onMediaReady;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> onAllMediaFailed;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private volatile boolean released;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final boolean isMuted;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final boolean isPlaying;

    public gim(@NotNull FileResourceProvider fileResourceProvider, @NotNull ExecutorService executorService) {
        fileResourceProvider.getClass();
        executorService.getClass();
        this.resourceProvider = fileResourceProvider;
        this.mediaExecutor = executorService;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m126363i(ImageView imageView, Bitmap bitmap) {
        imageView.getClass();
        bitmap.getClass();
        imageView.setImageBitmap(bitmap);
        return true;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m126364j(gim gimVar) {
        gimVar.getClass();
        return gimVar.released;
    }

    /* JADX INFO: renamed from: k */
    public static void m126365k(gim gimVar, Bitmap bitmap, ImageView imageView, C1265a c1265a) {
        gimVar.getClass();
        imageView.getClass();
        c1265a.getClass();
        if (gimVar.released) {
            return;
        }
        if (bitmap == null) {
            gimVar.m126369q(imageView, c1265a);
            return;
        }
        imageView.setImageBitmap(bitmap);
        Function0<Unit> function0M126371p = gimVar.m126371p();
        if (function0M126371p != null) {
            function0M126371p.invoke();
        }
    }

    /* JADX INFO: renamed from: l */
    public static Unit m126366l(gim gimVar) {
        gimVar.getClass();
        Function0<Unit> function0M126371p = gimVar.m126371p();
        if (function0M126371p != null) {
            function0M126371p.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static Unit m126367m(gim gimVar) {
        gimVar.getClass();
        Function0<Unit> function0M126370o = gimVar.m126370o();
        if (function0M126370o != null) {
            function0M126370o.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static void m126368n(final gim gimVar, final C1265a c1265a, final ImageView imageView) {
        gimVar.getClass();
        c1265a.getClass();
        imageView.getClass();
        final Bitmap bitmapM6500p = gimVar.resourceProvider.m6500p(c1265a.getMediaUrl());
        imageView.post(new Runnable() { // from class: l.bim
            @Override // java.lang.Runnable
            public final void run() {
                gim.m126365k(this.f75775a, bitmapM6500p, imageView, c1265a);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    private final void m126369q(final ImageView iv, C1265a config) {
        ViewParent parent = iv.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        w3g.INSTANCE.m201315d(new x3g(viewGroup, config.getFallbackUrl(), config.getMediaUrl(), this.resourceProvider, this.mediaExecutor, new Function0() { // from class: l.cim
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(gim.m126364j(this.f81100a));
            }
        }, config.getCallbacks(), "Image load failed", new Function1() { // from class: l.dim
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(gim.m126363i(iv, (Bitmap) obj));
            }
        }, new Function0() { // from class: l.eim
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return gim.m126366l(this.f91617a);
            }
        }, new Function0() { // from class: l.fim
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return gim.m126367m(this.f97696a);
            }
        }));
    }

    @Override // p149l.lux
    /* JADX INFO: renamed from: a */
    public void mo107483a(@NotNull ViewGroup container, @NotNull y360 session) {
        container.getClass();
        session.getClass();
        C1265a c1265a = this.config;
        if (c1265a == null) {
            c1265a = session.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String();
        }
        mo107489g(container, c1265a, session);
    }

    @Override // p149l.lux
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getIsMuted() {
        return this.isMuted;
    }

    @Override // p149l.lux
    /* JADX INFO: renamed from: d */
    public void mo107486d(@Nullable Function0<Unit> function0) {
        this.onMediaReady = function0;
    }

    @Override // p149l.lux
    /* JADX INFO: renamed from: e */
    public void mo107487e(@Nullable Function0<Unit> function0) {
        this.onAllMediaFailed = function0;
    }

    @Override // p149l.lux
    /* JADX INFO: renamed from: g */
    public void mo107489g(@NotNull ViewGroup container, @NotNull final C1265a config, @NotNull y360 session) {
        container.getClass();
        config.getClass();
        session.getClass();
        this.released = false;
        this.config = config;
        final ImageView imageView = new ImageView(container.getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        if (!StringsKt.m93438e0(config.getMediaContentDescription())) {
            imageView.setContentDescription(config.getMediaContentDescription());
        }
        this.imageView = imageView;
        container.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
        Bitmap bitmapM6496i = this.resourceProvider.m6496i(config.getMediaUrl());
        if (bitmapM6496i == null) {
            this.mediaExecutor.execute(new Runnable() { // from class: l.aim
                @Override // java.lang.Runnable
                public final void run() {
                    gim.m126368n(this.f70010a, config, imageView);
                }
            });
            return;
        }
        imageView.setImageBitmap(bitmapM6496i);
        Function0<Unit> function0M126371p = m126371p();
        if (function0M126371p != null) {
            function0M126371p.invoke();
        }
    }

    @Override // p149l.lux
    /* JADX INFO: renamed from: h */
    public void mo107490h() {
        lux.C18319a.m151826a(this);
    }

    @Override // p149l.lux
    /* JADX INFO: renamed from: isPlaying, reason: from getter */
    public boolean getIsPlaying() {
        return this.isPlaying;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public Function0<Unit> m126370o() {
        return this.onAllMediaFailed;
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public Function0<Unit> m126371p() {
        return this.onMediaReady;
    }

    @Override // p149l.lux
    public void release() {
        this.released = true;
        ImageView imageView = this.imageView;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        this.imageView = null;
        this.config = null;
    }

    @Override // p149l.lux
    /* JADX INFO: renamed from: c */
    public void mo107485c() {
    }

    @Override // p149l.lux
    /* JADX INFO: renamed from: f */
    public void mo107488f() {
    }
}
