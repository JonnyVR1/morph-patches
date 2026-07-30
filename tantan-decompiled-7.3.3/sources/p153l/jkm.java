package p153l;

import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.inapp.images.FileResourceProvider;
import com.clevertap.android.sdk.inapp.pipsdk.C1288a;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m88120d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001a\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0018\u0010\u001f\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001eR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!R*\u0010(\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\"8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b \u0010'R*\u0010*\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\"8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010$\u001a\u0004\b)\u0010&\"\u0004\b#\u0010'R\u0016\u0010-\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010,R\u001a\u00100\u001a\u00020+8\u0016X\u0096D¢\u0006\f\n\u0004\b.\u0010,\u001a\u0004\b\u001c\u0010/R\u001a\u00102\u001a\u00020+8\u0016X\u0096D¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\b2\u0010/¨\u00063"}, m88121d2 = {"Ll/jkm;", "Ll/i3y;", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "resourceProvider", "Ljava/util/concurrent/ExecutorService;", "mediaExecutor", "<init>", "(Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;Ljava/util/concurrent/ExecutorService;)V", "Landroid/widget/ImageView;", "iv", "Lcom/clevertap/android/sdk/inapp/pipsdk/a;", Constants.KEY_CONFIG, "", "q", "(Landroid/widget/ImageView;Lcom/clevertap/android/sdk/inapp/pipsdk/a;)V", "Landroid/view/ViewGroup;", "container", "Ll/dc60;", "session", "g", "(Landroid/view/ViewGroup;Lcom/clevertap/android/sdk/inapp/pipsdk/a;Ll/dc60;)V", "a", "(Landroid/view/ViewGroup;Ll/dc60;)V", "release", "()V", "f", "c", "Lcom/clevertap/android/sdk/inapp/images/FileResourceProvider;", "b", "Ljava/util/concurrent/ExecutorService;", "Landroid/widget/ImageView;", "imageView", Constants.INAPP_DATA_TAG, "Lcom/clevertap/android/sdk/inapp/pipsdk/a;", "Lkotlin/Function0;", "e", "Lkotlin/jvm/functions/Function0;", "p", "()Lkotlin/jvm/functions/Function0;", "(Lkotlin/jvm/functions/Function0;)V", "onMediaReady", "o", "onAllMediaFailed", "", "Z", "released", "h", "()Z", "isMuted", RXScreenCaptureService.KEY_INDEX, "isPlaying", "clevertap-core_release"}, m88122k = 1, m88123mv = {2, 0, 0}, m88125xi = 48)
public final class jkm implements i3y {

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
    private C1288a config;

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

    public jkm(@NotNull FileResourceProvider fileResourceProvider, @NotNull ExecutorService executorService) {
        fileResourceProvider.getClass();
        executorService.getClass();
        this.resourceProvider = fileResourceProvider;
        this.mediaExecutor = executorService;
    }

    /* JADX INFO: renamed from: i */
    public static boolean m145860i(ImageView imageView, Bitmap bitmap) {
        imageView.getClass();
        bitmap.getClass();
        imageView.setImageBitmap(bitmap);
        return true;
    }

    /* JADX INFO: renamed from: j */
    public static boolean m145861j(jkm jkmVar) {
        jkmVar.getClass();
        return jkmVar.released;
    }

    /* JADX INFO: renamed from: k */
    public static void m145862k(jkm jkmVar, Bitmap bitmap, ImageView imageView, C1288a c1288a) {
        jkmVar.getClass();
        imageView.getClass();
        c1288a.getClass();
        if (jkmVar.released) {
            return;
        }
        if (bitmap == null) {
            jkmVar.m145866q(imageView, c1288a);
            return;
        }
        imageView.setImageBitmap(bitmap);
        Function0<Unit> function0M145868p = jkmVar.m145868p();
        if (function0M145868p != null) {
            function0M145868p.invoke();
        }
    }

    /* JADX INFO: renamed from: l */
    public static Unit m145863l(jkm jkmVar) {
        jkmVar.getClass();
        Function0<Unit> function0M145868p = jkmVar.m145868p();
        if (function0M145868p != null) {
            function0M145868p.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: m */
    public static Unit m145864m(jkm jkmVar) {
        jkmVar.getClass();
        Function0<Unit> function0M145867o = jkmVar.m145867o();
        if (function0M145867o != null) {
            function0M145867o.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: n */
    public static void m145865n(final jkm jkmVar, final C1288a c1288a, final ImageView imageView) {
        jkmVar.getClass();
        c1288a.getClass();
        imageView.getClass();
        final Bitmap bitmapM6554p = jkmVar.resourceProvider.m6554p(c1288a.getMediaUrl());
        imageView.post(new Runnable() { // from class: l.ekm
            @Override // java.lang.Runnable
            public final void run() {
                jkm.m145862k(this.f94409a, bitmapM6554p, imageView, c1288a);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    private final void m145866q(final ImageView iv, C1288a config) {
        ViewParent parent = iv.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return;
        }
        k5g.INSTANCE.m148362d(new l5g(viewGroup, config.getFallbackUrl(), config.getMediaUrl(), this.resourceProvider, this.mediaExecutor, new Function0() { // from class: l.fkm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Boolean.valueOf(jkm.m145861j(this.f99531a));
            }
        }, config.getCallbacks(), "Image load failed", new Function1() { // from class: l.gkm
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(jkm.m145860i(iv, (Bitmap) obj));
            }
        }, new Function0() { // from class: l.hkm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return jkm.m145863l(this.f110440a);
            }
        }, new Function0() { // from class: l.ikm
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return jkm.m145864m(this.f115435a);
            }
        }));
    }

    @Override // p153l.i3y
    /* JADX INFO: renamed from: a */
    public void mo138352a(@NotNull ViewGroup container, @NotNull dc60 session) {
        container.getClass();
        session.getClass();
        C1288a c1288a = this.config;
        if (c1288a == null) {
            c1288a = session.getCom.clevertap.android.sdk.Constants.KEY_CONFIG java.lang.String();
        }
        mo138358g(container, c1288a, session);
    }

    @Override // p153l.i3y
    /* JADX INFO: renamed from: b, reason: from getter */
    public boolean getIsMuted() {
        return this.isMuted;
    }

    @Override // p153l.i3y
    /* JADX INFO: renamed from: d */
    public void mo138355d(@Nullable Function0<Unit> function0) {
        this.onMediaReady = function0;
    }

    @Override // p153l.i3y
    /* JADX INFO: renamed from: e */
    public void mo138356e(@Nullable Function0<Unit> function0) {
        this.onAllMediaFailed = function0;
    }

    @Override // p153l.i3y
    /* JADX INFO: renamed from: g */
    public void mo138358g(@NotNull ViewGroup container, @NotNull final C1288a config, @NotNull dc60 session) {
        container.getClass();
        config.getClass();
        session.getClass();
        this.released = false;
        this.config = config;
        final ImageView imageView = new ImageView(container.getContext());
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        if (!StringsKt.m94329e0(config.getMediaContentDescription())) {
            imageView.setContentDescription(config.getMediaContentDescription());
        }
        this.imageView = imageView;
        container.addView(imageView, new ViewGroup.LayoutParams(-1, -1));
        Bitmap bitmapM6550i = this.resourceProvider.m6550i(config.getMediaUrl());
        if (bitmapM6550i == null) {
            this.mediaExecutor.execute(new Runnable() { // from class: l.dkm
                @Override // java.lang.Runnable
                public final void run() {
                    jkm.m145865n(this.f89417a, config, imageView);
                }
            });
            return;
        }
        imageView.setImageBitmap(bitmapM6550i);
        Function0<Unit> function0M145868p = m145868p();
        if (function0M145868p != null) {
            function0M145868p.invoke();
        }
    }

    @Override // p153l.i3y
    /* JADX INFO: renamed from: h */
    public void mo138359h() {
        i3y.C17632a.m138360a(this);
    }

    @Override // p153l.i3y
    /* JADX INFO: renamed from: isPlaying, reason: from getter */
    public boolean getIsPlaying() {
        return this.isPlaying;
    }

    @Nullable
    /* JADX INFO: renamed from: o */
    public Function0<Unit> m145867o() {
        return this.onAllMediaFailed;
    }

    @Nullable
    /* JADX INFO: renamed from: p */
    public Function0<Unit> m145868p() {
        return this.onMediaReady;
    }

    @Override // p153l.i3y
    public void release() {
        this.released = true;
        ImageView imageView = this.imageView;
        if (imageView != null) {
            imageView.setImageBitmap(null);
        }
        this.imageView = null;
        this.config = null;
    }

    @Override // p153l.i3y
    /* JADX INFO: renamed from: c */
    public void mo138354c() {
    }

    @Override // p153l.i3y
    /* JADX INFO: renamed from: f */
    public void mo138357f() {
    }
}
