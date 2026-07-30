package com.p051p1.mobile.putong.live.base.vap;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.core.data.GameIdentity;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.vap.AnimView;
import com.p051p1.mobile.putong.live.base.vap.mix.C12631a;
import com.p051p1.mobile.putong.live.base.vap.textureview.InnerTextureView;
import com.p051p1.mobile.putong.live.base.vap.util.ScaleType;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import java.io.File;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt__LazyJVMKt;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.C21726z0;
import p153l.ap0;
import p153l.d1e0;
import p153l.jo0;
import p153l.k5m;
import p153l.ln50;
import p153l.oii;
import p153l.vol;
import p153l.vtl;
import p153l.wtl;
import p153l.xol;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m88120d1 = {"\u0000³\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001o\b\u0016\u0018\u0000 |2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0013B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\u001bJ/\u0010&\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bH\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\fH\u0014¢\u0006\u0004\b(\u0010\u000eJ\u000f\u0010)\u001a\u00020\fH\u0014¢\u0006\u0004\b)\u0010\u000eJ\u0019\u0010,\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u00100\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b0\u00101J\u0019\u00104\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\f2\u0006\u00106\u001a\u00020\u001eH\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\f2\u0006\u00109\u001a\u00020\bH\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\f2\u0006\u00106\u001a\u00020\u001eH\u0007¢\u0006\u0004\b<\u00108J\u0017\u0010>\u001a\u00020\f2\u0006\u0010=\u001a\u00020\bH\u0007¢\u0006\u0004\b>\u0010;J\u0017\u0010@\u001a\u00020\f2\u0006\u0010?\u001a\u00020\bH\u0016¢\u0006\u0004\b@\u0010;J\u0017\u0010C\u001a\u00020\f2\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010C\u001a\u00020\f2\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bC\u0010GJ\u0017\u0010I\u001a\u00020\f2\u0006\u0010H\u001a\u00020\u001eH\u0016¢\u0006\u0004\bI\u00108J\u0017\u0010L\u001a\u00020\f2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\f2\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\fH\u0016¢\u0006\u0004\bR\u0010\u000eJ\u000f\u0010S\u001a\u00020\u001eH\u0016¢\u0006\u0004\bS\u0010TJ\u001b\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0UH\u0016¢\u0006\u0004\bV\u0010WR\u0016\u0010Z\u001a\u00020X8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010YR\u001b\u0010`\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010h\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010j\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010iR\u0014\u0010n\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u001b\u0010r\u001a\u00020o8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010]\u001a\u0004\bp\u0010qR\u0016\u0010u\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010w\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010tR\u0014\u0010{\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010z¨\u0006}"}, m88121d2 = {"Lcom/p1/mobile/putong/live/base/vap/AnimView;", "Ll/xol;", "Landroid/widget/FrameLayout;", "Landroid/view/TextureView$SurfaceTextureListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "n", "()V", "Lkotlin/Function0;", "f", BLiveStormDanmakuGiftResourceType.f45294s, "(Lkotlin/jvm/functions/Function0;)V", "a", "Landroid/graphics/SurfaceTexture;", "getSurfaceTexture", "()Landroid/graphics/SurfaceTexture;", "surface", "width", "height", "onSurfaceTextureSizeChanged", "(Landroid/graphics/SurfaceTexture;II)V", "onSurfaceTextureUpdated", "(Landroid/graphics/SurfaceTexture;)V", "", "onSurfaceTextureDestroyed", "(Landroid/graphics/SurfaceTexture;)Z", "onSurfaceTextureAvailable", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "onAttachedToWindow", "onDetachedFromWindow", "Ll/vol;", "animListener", "setAnimListener", "(Ll/vol;)V", "Ll/vtl;", "fetchResource", "setFetchResource", "(Ll/vtl;)V", "Ll/ln50;", "resourceClickListener", "setOnResourceClickListener", "(Ll/ln50;)V", "enable", BLiveStormDanmakuGiftResourceType.f45292l, "(Z)V", "playLoop", "setLoop", "(I)V", "m", "mode", "setVideoMode", "fps", "setFps", "Lcom/p1/mobile/putong/live/base/vap/util/ScaleType;", "type", "setScaleType", "(Lcom/p1/mobile/putong/live/base/vap/util/ScaleType;)V", "Ll/k5m;", "scaleType", "(Ll/k5m;)V", "isMute", "setMute", "Ljava/io/File;", "file", "p", "(Ljava/io/File;)V", "Ll/wtl;", "fileContainer", "q", "(Ll/wtl;)V", "r", "o", "()Z", "Lkotlin/Pair;", "getRealSize", "()Lkotlin/Pair;", "Ll/ap0;", "Ll/ap0;", GameIdentity.player, "Landroid/os/Handler;", "b", "Lkotlin/Lazy;", "getUiHandler", "()Landroid/os/Handler;", "uiHandler", "c", "Landroid/graphics/SurfaceTexture;", Constants.INAPP_DATA_TAG, "Ll/vol;", "Lcom/p1/mobile/putong/live/base/vap/textureview/InnerTextureView;", "e", "Lcom/p1/mobile/putong/live/base/vap/textureview/InnerTextureView;", "innerTextureView", "Ll/wtl;", "lastFile", "Ll/d1e0;", "g", "Ll/d1e0;", "scaleTypeUtil", "com/p1/mobile/putong/live/base/vap/AnimView$b", "getAnimProxyListener", "()Lcom/p1/mobile/putong/live/base/vap/AnimView$b;", "animProxyListener", RXScreenCaptureService.KEY_INDEX, "Z", "onSizeChangedCalled", "j", "needPrepareTextureView", "Ljava/lang/Runnable;", "k", "Ljava/lang/Runnable;", "prepareTextureViewRunnable", "Companion", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
@SourceDebugExtension
public class AnimView extends FrameLayout implements xol, TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public ap0 player;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy uiHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public SurfaceTexture surface;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public vol animListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public InnerTextureView innerTextureView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public wtl lastFile;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final d1e0 scaleTypeUtil;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    @NotNull
    public final Lazy animProxyListener;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public boolean onSizeChangedCalled;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public boolean needPrepareTextureView;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Runnable prepareTextureViewRunnable;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.vap.AnimView$b */
    @Metadata(m88120d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\tJ!\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m88121d2 = {"com/p1/mobile/putong/live/base/vap/AnimView$b", "Ll/vol;", "Ll/jo0;", Constants.KEY_CONFIG, "", "e", "(Ll/jo0;)Z", "", "c", "()V", "", "frameIndex", Constants.INAPP_DATA_TAG, "(ILl/jo0;)V", "f", "b", "errorType", "", "errorMsg", "a", "(ILjava/lang/String;)V", "base_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C12629b implements vol {
        public C12629b() {
        }

        @Override // p153l.vol
        /* JADX INFO: renamed from: a */
        public void mo69826a(int errorType, String errorMsg) {
            vol volVar = AnimView.this.animListener;
            if (volVar != null) {
                volVar.mo69826a(errorType, errorMsg);
            }
        }

        @Override // p153l.vol
        /* JADX INFO: renamed from: b */
        public void mo69827b() {
            AnimView.this.m69820n();
            vol volVar = AnimView.this.animListener;
            if (volVar != null) {
                volVar.mo69827b();
            }
        }

        @Override // p153l.vol
        /* JADX INFO: renamed from: c */
        public void mo69828c() {
            vol volVar = AnimView.this.animListener;
            if (volVar != null) {
                volVar.mo69828c();
            }
        }

        @Override // p153l.vol
        /* JADX INFO: renamed from: d */
        public void mo69829d(int frameIndex, jo0 config) {
            vol volVar = AnimView.this.animListener;
            if (volVar != null) {
                volVar.mo69829d(frameIndex, config);
            }
        }

        @Override // p153l.vol
        /* JADX INFO: renamed from: e */
        public boolean mo69830e(jo0 config) {
            config.getClass();
            AnimView.this.scaleTypeUtil.m113571n(config.getWidth(), config.getHeight());
            vol volVar = AnimView.this.animListener;
            return volVar != null ? volVar.mo69830e(config) : super.mo69830e(config);
        }

        @Override // p153l.vol
        /* JADX INFO: renamed from: f */
        public void mo69831f() {
            AnimView.this.m69820n();
            vol volVar = AnimView.this.animListener;
            if (volVar != null) {
                volVar.mo69831f();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AnimView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.uiHandler = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.lp0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnimView.m69807b();
            }
        });
        this.scaleTypeUtil = new d1e0();
        this.animProxyListener = LazyKt__LazyJVMKt.m88118b(new Function0() { // from class: l.mp0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnimView.m69811f(this.f137862a);
            }
        });
        this.prepareTextureViewRunnable = new Runnable() { // from class: l.np0
            @Override // java.lang.Runnable
            public final void run() {
                AnimView.m69808c(this.f143062a, context);
            }
        };
        m69820n();
        ap0 ap0Var = new ap0(this);
        this.player = ap0Var;
        ap0Var.m99258t(getAnimProxyListener());
    }

    /* JADX INFO: renamed from: b */
    public static Handler m69807b() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: c */
    public static void m69808c(AnimView animView, Context context) {
        animView.removeAllViews();
        InnerTextureView innerTextureView = new InnerTextureView(context, null, 0, 6, null);
        ap0 ap0Var = animView.player;
        if (ap0Var == null) {
            Intrinsics.m88391r(GameIdentity.player);
            ap0Var = null;
        }
        innerTextureView.setPlayer(ap0Var);
        innerTextureView.setOpaque(false);
        innerTextureView.setSurfaceTextureListener(animView);
        innerTextureView.setLayoutParams(animView.scaleTypeUtil.m113563f(innerTextureView));
        animView.innerTextureView = innerTextureView;
        animView.addView(innerTextureView);
    }

    /* JADX INFO: renamed from: d */
    public static Unit m69809d(AnimView animView) {
        animView.removeAllViews();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static void m69810e(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: f */
    public static C12629b m69811f(AnimView animView) {
        return animView.new C12629b();
    }

    /* JADX INFO: renamed from: g */
    public static Unit m69812g(AnimView animView, wtl wtlVar) {
        if (animView.getVisibility() != 0) {
            C21726z0.INSTANCE.m218093b("AnimPlayer.AnimView", "AnimView is GONE, can't play");
            return Unit.INSTANCE;
        }
        ap0 ap0Var = animView.player;
        ap0 ap0Var2 = null;
        if (ap0Var == null) {
            Intrinsics.m88391r(GameIdentity.player);
            ap0Var = null;
        }
        if (ap0Var.m99253o()) {
            C21726z0.INSTANCE.m218093b("AnimPlayer.AnimView", "is running can not start");
        } else {
            animView.lastFile = wtlVar;
            ap0 ap0Var3 = animView.player;
            if (ap0Var3 == null) {
                Intrinsics.m88391r(GameIdentity.player);
            } else {
                ap0Var2 = ap0Var3;
            }
            ap0Var2.m99240B(wtlVar);
        }
        return Unit.INSTANCE;
    }

    private final C12629b getAnimProxyListener() {
        return (C12629b) this.animProxyListener.getValue();
    }

    private final Handler getUiHandler() {
        return (Handler) this.uiHandler.getValue();
    }

    /* JADX INFO: renamed from: h */
    public static void m69813h(AnimView animView) {
        InnerTextureView innerTextureView = animView.innerTextureView;
        if (innerTextureView != null) {
            innerTextureView.setSurfaceTextureListener(null);
        }
        animView.innerTextureView = null;
        animView.removeAllViews();
    }

    @Override // p153l.xol
    /* JADX INFO: renamed from: a */
    public void mo69817a() {
        if (this.onSizeChangedCalled) {
            getUiHandler().post(this.prepareTextureViewRunnable);
        } else {
            C21726z0.INSTANCE.m218093b("AnimPlayer.AnimView", "onSizeChanged not called");
            this.needPrepareTextureView = true;
        }
    }

    @Override // p153l.xol
    @NotNull
    public Pair<Integer, Integer> getRealSize() {
        return this.scaleTypeUtil.m113564g();
    }

    @Override // p153l.xol
    @Nullable
    public SurfaceTexture getSurfaceTexture() {
        SurfaceTexture surfaceTexture;
        InnerTextureView innerTextureView = this.innerTextureView;
        return (innerTextureView == null || (surfaceTexture = innerTextureView.getSurfaceTexture()) == null) ? this.surface : surfaceTexture;
    }

    /* JADX INFO: renamed from: l */
    public void m69818l(boolean enable) {
        ap0 ap0Var = this.player;
        if (ap0Var == null) {
            Intrinsics.m88391r(GameIdentity.player);
            ap0Var = null;
        }
        C12631a mixAnimPlugin = ap0Var.getPluginManager().getMixAnimPlugin();
        if (mixAnimPlugin != null) {
            mixAnimPlugin.m69858A(enable);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: m */
    public final void m69819m(boolean enable) {
        ap0 ap0Var = this.player;
        if (ap0Var == null) {
            Intrinsics.m88391r(GameIdentity.player);
            ap0Var = null;
        }
        ap0Var.m99261w(enable);
    }

    /* JADX INFO: renamed from: n */
    public final void m69820n() {
        wtl wtlVar = this.lastFile;
        if (wtlVar != null) {
            wtlVar.close();
        }
        m69825s(new Function0() { // from class: l.pp0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnimView.m69809d(this.f153444a);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public boolean mo69821o() {
        ap0 ap0Var = this.player;
        if (ap0Var == null) {
            Intrinsics.m88391r(GameIdentity.player);
            ap0Var = null;
        }
        return ap0Var.m99253o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        wtl wtlVar;
        C21726z0.INSTANCE.m218095d("AnimPlayer.AnimView", "onAttachedToWindow");
        super.onAttachedToWindow();
        ap0 ap0Var = this.player;
        ap0 ap0Var2 = null;
        if (ap0Var == null) {
            Intrinsics.m88391r(GameIdentity.player);
            ap0Var = null;
        }
        ap0Var.m99260v(false);
        ap0 ap0Var3 = this.player;
        if (ap0Var3 == null) {
            Intrinsics.m88391r(GameIdentity.player);
        } else {
            ap0Var2 = ap0Var3;
        }
        if (ap0Var2.getPlayLoop() <= 0 || (wtlVar = this.lastFile) == null) {
            return;
        }
        mo69823q(wtlVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        C21726z0.INSTANCE.m218095d("AnimPlayer.AnimView", "onDetachedFromWindow");
        super.onDetachedFromWindow();
        ap0 ap0Var = this.player;
        ap0 ap0Var2 = null;
        if (ap0Var == null) {
            Intrinsics.m88391r(GameIdentity.player);
            ap0Var = null;
        }
        ap0Var.m99260v(true);
        ap0 ap0Var3 = this.player;
        if (ap0Var3 == null) {
            Intrinsics.m88391r(GameIdentity.player);
        } else {
            ap0Var2 = ap0Var3;
        }
        ap0Var2.m99255q();
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        C21726z0.INSTANCE.m218095d("AnimPlayer.AnimView", "onSizeChanged w=" + w + ", h=" + h);
        this.scaleTypeUtil.m113569l(w, h);
        this.onSizeChangedCalled = true;
        if (this.needPrepareTextureView) {
            this.needPrepareTextureView = false;
            mo69817a();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(@NotNull SurfaceTexture surface, int width, int height) {
        surface.getClass();
        C21726z0.INSTANCE.m218095d("AnimPlayer.AnimView", "onSurfaceTextureAvailable width=" + width + " height=" + height);
        this.surface = surface;
        ap0 ap0Var = this.player;
        if (ap0Var == null) {
            Intrinsics.m88391r(GameIdentity.player);
            ap0Var = null;
        }
        ap0Var.m99254p(width, height);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(@NotNull SurfaceTexture surface) {
        surface.getClass();
        C21726z0.INSTANCE.m218095d("AnimPlayer.AnimView", "onSurfaceTextureDestroyed");
        ap0 ap0Var = null;
        this.surface = null;
        ap0 ap0Var2 = this.player;
        if (ap0Var2 == null) {
            Intrinsics.m88391r(GameIdentity.player);
        } else {
            ap0Var = ap0Var2;
        }
        ap0Var.m99255q();
        getUiHandler().post(new Runnable() { // from class: l.jp0
            @Override // java.lang.Runnable
            public final void run() {
                AnimView.m69813h(this.f122065a);
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(@NotNull SurfaceTexture surface, int width, int height) {
        surface.getClass();
        C21726z0.INSTANCE.m218095d("AnimPlayer.AnimView", "onSurfaceTextureSizeChanged " + width + " x " + height);
        ap0 ap0Var = this.player;
        if (ap0Var == null) {
            Intrinsics.m88391r(GameIdentity.player);
            ap0Var = null;
        }
        ap0Var.m99256r(width, height);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(@NotNull SurfaceTexture surface) {
        surface.getClass();
    }

    /* JADX INFO: renamed from: p */
    public void mo69822p(@NotNull File file) {
        file.getClass();
        try {
            mo69823q(new oii(file));
        } catch (Throwable unused) {
            getAnimProxyListener().mo69826a(10007, "0x7 file can't read");
            getAnimProxyListener().mo69831f();
        }
    }

    /* JADX INFO: renamed from: q */
    public void mo69823q(@NotNull final wtl fileContainer) {
        fileContainer.getClass();
        m69825s(new Function0() { // from class: l.kp0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnimView.m69812g(this.f127820a, fileContainer);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public void mo69824r() {
        ap0 ap0Var = this.player;
        if (ap0Var == null) {
            Intrinsics.m88391r(GameIdentity.player);
            ap0Var = null;
        }
        ap0Var.m99241C();
    }

    /* JADX INFO: renamed from: s */
    public final void m69825s(final Function0<Unit> f) {
        if (Intrinsics.m88377d(Looper.myLooper(), Looper.getMainLooper())) {
            f.invoke();
        } else {
            getUiHandler().post(new Runnable() { // from class: l.op0
                @Override // java.lang.Runnable
                public final void run() {
                    AnimView.m69810e(f);
                }
            });
        }
    }

    public void setAnimListener(@Nullable vol animListener) {
        this.animListener = animListener;
    }

    public void setFetchResource(@Nullable vtl fetchResource) {
        ap0 ap0Var = this.player;
        if (ap0Var == null) {
            Intrinsics.m88391r(GameIdentity.player);
            ap0Var = null;
        }
        C12631a mixAnimPlugin = ap0Var.getPluginManager().getMixAnimPlugin();
        if (mixAnimPlugin != null) {
            mixAnimPlugin.m69860C(fetchResource);
        }
    }

    public void setFps(int fps) {
        C21726z0.INSTANCE.m218095d("AnimPlayer.AnimView", "setFps=" + fps);
        ap0 ap0Var = this.player;
        if (ap0Var == null) {
            Intrinsics.m88391r(GameIdentity.player);
            ap0Var = null;
        }
        ap0Var.m99259u(fps);
    }

    public void setLoop(int playLoop) {
        ap0 ap0Var = this.player;
        if (ap0Var == null) {
            Intrinsics.m88391r(GameIdentity.player);
            ap0Var = null;
        }
        ap0Var.m99264z(playLoop);
    }

    public void setMute(boolean isMute) {
        C21726z0.INSTANCE.m218093b("AnimPlayer.AnimView", "set mute=" + isMute);
        ap0 ap0Var = this.player;
        if (ap0Var == null) {
            Intrinsics.m88391r(GameIdentity.player);
            ap0Var = null;
        }
        ap0Var.m99263y(isMute);
    }

    public void setOnResourceClickListener(@Nullable ln50 resourceClickListener) {
        ap0 ap0Var = this.player;
        if (ap0Var == null) {
            Intrinsics.m88391r(GameIdentity.player);
            ap0Var = null;
        }
        C12631a mixAnimPlugin = ap0Var.getPluginManager().getMixAnimPlugin();
        if (mixAnimPlugin != null) {
            mixAnimPlugin.m69859B(resourceClickListener);
        }
    }

    public void setScaleType(@NotNull ScaleType type) {
        type.getClass();
        this.scaleTypeUtil.m113568k(type);
    }

    @Deprecated
    public final void setVideoMode(int mode) {
        ap0 ap0Var = this.player;
        if (ap0Var == null) {
            Intrinsics.m88391r(GameIdentity.player);
            ap0Var = null;
        }
        ap0Var.m99239A(mode);
    }

    public void setScaleType(@NotNull k5m scaleType) {
        scaleType.getClass();
        this.scaleTypeUtil.m113570m(scaleType);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AnimView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AnimView(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }

    public /* synthetic */ AnimView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
