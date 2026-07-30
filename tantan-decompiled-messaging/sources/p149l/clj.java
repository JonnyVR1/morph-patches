package p149l;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.gif.GifImageView;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.clevertap.android.sdk.inapp.pipsdk.C1265a;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m87231d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0013\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001eR\u0018\u0010#\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010'R\u0016\u0010+\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010*R*\u00101\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010,8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010-\u001a\u0004\b.\u0010/\"\u0004\b!\u00100R*\u00104\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010,8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b2\u0010-\u001a\u0004\b3\u0010/\"\u0004\b$\u00100R\u0016\u00108\u001a\u0002058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u001a\u0010;\u001a\u0002058\u0016X\u0096D¢\u0006\f\n\u0004\b9\u00107\u001a\u0004\b\u001b\u0010:R\u001a\u0010=\u001a\u0002058\u0016X\u0096D¢\u0006\f\n\u0004\b<\u00107\u001a\u0004\b=\u0010:¨\u0006>"}, m87232d2 = {"Ll/clj;", "Ll/lux;", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "resourceProvider", "Ljava/util/concurrent/ExecutorService;", "mediaExecutor", "<init>", "(Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;Ljava/util/concurrent/ExecutorService;)V", "Landroid/view/ViewGroup;", "container", "Lcom/clevertap/android/sdk/inapp/pipsdk/a;", Constants.KEY_CONFIG, "", "q", "(Landroid/view/ViewGroup;Lcom/clevertap/android/sdk/inapp/pipsdk/a;)V", "Ll/y360;", "session", "g", "(Landroid/view/ViewGroup;Lcom/clevertap/android/sdk/inapp/pipsdk/a;Ll/y360;)V", "a", "(Landroid/view/ViewGroup;Ll/y360;)V", "h", "()V", "release", "f", "c", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "b", "Ljava/util/concurrent/ExecutorService;", "Lcom/clevertap/android/sdk/gif/GifImageView;", "Lcom/clevertap/android/sdk/gif/GifImageView;", "gifView", "Landroid/widget/ImageView;", Constants.INAPP_DATA_TAG, "Landroid/widget/ImageView;", "fallbackImageView", "e", "Lcom/clevertap/android/sdk/inapp/pipsdk/a;", "", "[B", "gifBytes", "Landroid/widget/ImageView$ScaleType;", "Landroid/widget/ImageView$ScaleType;", "currentScaleType", "Lkotlin/Function0;", "Lkotlin/jvm/functions/Function0;", "p", "()Lkotlin/jvm/functions/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "onMediaReady", RXScreenCaptureService.KEY_INDEX, "o", "onAllMediaFailed", "", "j", "Z", "released", "k", "()Z", "isMuted", BLiveStormDanmakuGiftResourceType.f44444l, "isPlaying", "clevertap-core_release"}, m87233k = 1, m87234mv = {2, 0, 0}, m87236xi = 48)
@SourceDebugExtension
public final class clj implements lux {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    private final FileResourceProvider resourceProvider;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    private final ExecutorService mediaExecutor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    private GifImageView gifView;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    private ImageView fallbackImageView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    private C1265a config;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    private byte[] gifBytes;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    private ImageView.ScaleType currentScaleType;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> onMediaReady;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @Nullable
    private Function0<Unit> onAllMediaFailed;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private volatile boolean released;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final boolean isMuted;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final boolean isPlaying;

    public clj(@NotNull FileResourceProvider fileResourceProvider, @NotNull ExecutorService executorService) {
        fileResourceProvider.getClass();
        executorService.getClass();
        this.resourceProvider = fileResourceProvider;
        this.mediaExecutor = executorService;
        this.currentScaleType = ImageView.ScaleType.FIT_CENTER;
    }

    /* JADX INFO: renamed from: i */
    public static Unit m107476i(clj cljVar) {
        cljVar.getClass();
        Function0<Unit> function0M107491o = cljVar.m107491o();
        if (function0M107491o != null) {
            function0M107491o.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: j */
    public static Unit m107477j(clj cljVar) {
        cljVar.getClass();
        Function0<Unit> function0M107492p = cljVar.m107492p();
        if (function0M107492p != null) {
            function0M107492p.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: k */
    public static void m107478k(final clj cljVar, final C1265a c1265a, final GifImageView gifImageView, final ViewGroup viewGroup) {
        cljVar.getClass();
        c1265a.getClass();
        gifImageView.getClass();
        viewGroup.getClass();
        final byte[] bArrM6499o = cljVar.resourceProvider.m6499o(c1265a.getMediaUrl());
        gifImageView.post(new Runnable() { // from class: l.xkj
            @Override // java.lang.Runnable
            public final void run() {
                clj.m107481n(this.f193308a, bArrM6499o, gifImageView, viewGroup, c1265a);
            }
        });
    }

    /* JADX INFO: renamed from: l */
    public static boolean m107479l(clj cljVar, Bitmap bitmap) {
        cljVar.getClass();
        bitmap.getClass();
        GifImageView gifImageView = cljVar.gifView;
        if (gifImageView != null) {
            ViewParent parent = gifImageView.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(gifImageView);
            }
        }
        cljVar.gifView = null;
        return false;
    }

    /* JADX INFO: renamed from: m */
    public static boolean m107480m(clj cljVar) {
        cljVar.getClass();
        return cljVar.released;
    }

    /* JADX INFO: renamed from: n */
    public static void m107481n(clj cljVar, byte[] bArr, GifImageView gifImageView, ViewGroup viewGroup, C1265a c1265a) {
        cljVar.getClass();
        gifImageView.getClass();
        viewGroup.getClass();
        c1265a.getClass();
        if (cljVar.released) {
            return;
        }
        if (bArr == null) {
            cljVar.m107482q(viewGroup, c1265a);
            return;
        }
        cljVar.gifBytes = bArr;
        gifImageView.setBytes(bArr);
        gifImageView.m6050m();
        Function0<Unit> function0M107492p = cljVar.m107492p();
        if (function0M107492p != null) {
            function0M107492p.invoke();
        }
    }

    /* JADX INFO: renamed from: q */
    private final void m107482q(ViewGroup container, C1265a config) {
        w3g.INSTANCE.m201315d(new x3g(container, config.getFallbackUrl(), config.getMediaUrl(), this.resourceProvider, this.mediaExecutor, new Function0() { // from class: l.ykj
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(clj.m107480m(this.f198761a));
            }
        }, config.getCallbacks(), "GIF load failed", new Function1() { // from class: l.zkj
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(clj.m107479l(this.f203545a, (Bitmap) obj));
            }
        }, new Function0() { // from class: l.alj
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return clj.m107477j(this.f70440a);
            }
        }, new Function0() { // from class: l.blj
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return clj.m107476i(this.f76192a);
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
    public void mo107489g(@NotNull final ViewGroup container, @NotNull final C1265a config, @NotNull y360 session) {
        container.getClass();
        config.getClass();
        session.getClass();
        this.released = false;
        this.config = config;
        final GifImageView gifImageView = new GifImageView(container.getContext());
        gifImageView.setScaleType(this.currentScaleType);
        if (!StringsKt.m93438e0(config.getMediaContentDescription())) {
            gifImageView.setContentDescription(config.getMediaContentDescription());
        }
        this.gifView = gifImageView;
        container.addView(gifImageView, new ViewGroup.LayoutParams(-1, -1));
        byte[] bArrM6495h = this.resourceProvider.m6495h(config.getMediaUrl());
        if (bArrM6495h == null) {
            this.mediaExecutor.execute(new Runnable() { // from class: l.wkj
                @Override // java.lang.Runnable
                public final void run() {
                    clj.m107478k(this.f186777a, config, gifImageView, container);
                }
            });
            return;
        }
        this.gifBytes = bArrM6495h;
        gifImageView.setBytes(bArrM6495h);
        gifImageView.m6050m();
        Function0<Unit> function0M107492p = m107492p();
        if (function0M107492p != null) {
            function0M107492p.invoke();
        }
    }

    @Override // p149l.lux
    /* JADX INFO: renamed from: h */
    public void mo107490h() {
        byte[] bArr;
        GifImageView gifImageView = this.gifView;
        ViewParent parent = gifImageView != null ? gifImageView.getParent() : null;
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null || (bArr = this.gifBytes) == null) {
            return;
        }
        GifImageView gifImageView2 = this.gifView;
        if (gifImageView2 != null) {
            ViewParent parent2 = gifImageView2.getParent();
            ViewGroup viewGroup2 = parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null;
            if (viewGroup2 != null) {
                viewGroup2.removeView(gifImageView2);
            }
        }
        GifImageView gifImageView3 = new GifImageView(viewGroup.getContext());
        gifImageView3.setScaleType(this.currentScaleType);
        this.gifView = gifImageView3;
        viewGroup.addView(gifImageView3, new ViewGroup.LayoutParams(-1, -1));
        gifImageView3.setBytes(bArr);
        gifImageView3.m6050m();
    }

    @Override // p149l.lux
    /* JADX INFO: renamed from: isPlaying, reason: from getter */
    public boolean getIsPlaying() {
        return this.isPlaying;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public Function0<Unit> m107491o() {
        return this.onAllMediaFailed;
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public Function0<Unit> m107492p() {
        return this.onMediaReady;
    }

    @Override // p149l.lux
    public void release() {
        this.released = true;
        GifImageView gifImageView = this.gifView;
        if (gifImageView != null) {
            gifImageView.m6051p();
        }
        GifImageView gifImageView2 = this.gifView;
        if (gifImageView2 != null) {
            gifImageView2.m6048k();
        }
        this.gifView = null;
        this.gifBytes = null;
        this.fallbackImageView = null;
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
