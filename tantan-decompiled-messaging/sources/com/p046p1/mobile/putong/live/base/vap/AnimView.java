package com.p046p1.mobile.putong.live.base.vap;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.TextureView;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.core.data.GameIdentity;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.vap.AnimView;
import com.p046p1.mobile.putong.live.base.vap.mix.C12468a;
import com.p046p1.mobile.putong.live.base.vap.textureview.InnerTextureView;
import com.p046p1.mobile.putong.live.base.vap.util.ScaleType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
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
import p149l.C21588z0;
import p149l.btd0;
import p149l.ep0;
import p149l.ff50;
import p149l.hrl;
import p149l.irl;
import p149l.jml;
import p149l.lml;
import p149l.no0;
import p149l.r2m;
import p149l.rfi;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000³\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001o\b\u0016\u0018\u0000 |2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0013B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u00020\f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\f0\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0013\u0010\u000eJ\u0011\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010!\u001a\u00020\f2\u0006\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0019\u001a\u00020\bH\u0016¢\u0006\u0004\b!\u0010\u001bJ/\u0010&\u001a\u00020\f2\u0006\u0010\"\u001a\u00020\b2\u0006\u0010#\u001a\u00020\b2\u0006\u0010$\u001a\u00020\b2\u0006\u0010%\u001a\u00020\bH\u0014¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\fH\u0014¢\u0006\u0004\b(\u0010\u000eJ\u000f\u0010)\u001a\u00020\fH\u0014¢\u0006\u0004\b)\u0010\u000eJ\u0019\u0010,\u001a\u00020\f2\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J\u0019\u00100\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b0\u00101J\u0019\u00104\u001a\u00020\f2\b\u00103\u001a\u0004\u0018\u000102H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00107\u001a\u00020\f2\u0006\u00106\u001a\u00020\u001eH\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\f2\u0006\u00109\u001a\u00020\bH\u0016¢\u0006\u0004\b:\u0010;J\u0017\u0010<\u001a\u00020\f2\u0006\u00106\u001a\u00020\u001eH\u0007¢\u0006\u0004\b<\u00108J\u0017\u0010>\u001a\u00020\f2\u0006\u0010=\u001a\u00020\bH\u0007¢\u0006\u0004\b>\u0010;J\u0017\u0010@\u001a\u00020\f2\u0006\u0010?\u001a\u00020\bH\u0016¢\u0006\u0004\b@\u0010;J\u0017\u0010C\u001a\u00020\f2\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u0017\u0010C\u001a\u00020\f2\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bC\u0010GJ\u0017\u0010I\u001a\u00020\f2\u0006\u0010H\u001a\u00020\u001eH\u0016¢\u0006\u0004\bI\u00108J\u0017\u0010L\u001a\u00020\f2\u0006\u0010K\u001a\u00020JH\u0016¢\u0006\u0004\bL\u0010MJ\u0017\u0010P\u001a\u00020\f2\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\fH\u0016¢\u0006\u0004\bR\u0010\u000eJ\u000f\u0010S\u001a\u00020\u001eH\u0016¢\u0006\u0004\bS\u0010TJ\u001b\u0010V\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b0UH\u0016¢\u0006\u0004\bV\u0010WR\u0016\u0010Z\u001a\u00020X8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0013\u0010YR\u001b\u0010`\u001a\u00020[8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\ba\u0010bR\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0018\u0010h\u001a\u0004\u0018\u00010e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010j\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010iR\u0014\u0010n\u001a\u00020k8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u001b\u0010r\u001a\u00020o8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b#\u0010]\u001a\u0004\bp\u0010qR\u0016\u0010u\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR\u0016\u0010w\u001a\u00020\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010tR\u0014\u0010{\u001a\u00020x8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010z¨\u0006}"}, m87232d2 = {"Lcom/p1/mobile/putong/live/base/vap/AnimView;", "Ll/lml;", "Landroid/widget/FrameLayout;", "Landroid/view/TextureView$SurfaceTextureListener;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "n", "()V", "Lkotlin/Function0;", "f", BLiveStormDanmakuGiftResourceType.f44446s, "(Lkotlin/jvm/functions/Function0;)V", "a", "Landroid/graphics/SurfaceTexture;", "getSurfaceTexture", "()Landroid/graphics/SurfaceTexture;", "surface", "width", "height", "onSurfaceTextureSizeChanged", "(Landroid/graphics/SurfaceTexture;II)V", "onSurfaceTextureUpdated", "(Landroid/graphics/SurfaceTexture;)V", "", "onSurfaceTextureDestroyed", "(Landroid/graphics/SurfaceTexture;)Z", "onSurfaceTextureAvailable", "w", "h", "oldw", "oldh", "onSizeChanged", "(IIII)V", "onAttachedToWindow", "onDetachedFromWindow", "Ll/jml;", "animListener", "setAnimListener", "(Ll/jml;)V", "Ll/hrl;", "fetchResource", "setFetchResource", "(Ll/hrl;)V", "Ll/ff50;", "resourceClickListener", "setOnResourceClickListener", "(Ll/ff50;)V", "enable", BLiveStormDanmakuGiftResourceType.f44444l, "(Z)V", "playLoop", "setLoop", "(I)V", "m", "mode", "setVideoMode", "fps", "setFps", "Lcom/p1/mobile/putong/live/base/vap/util/ScaleType;", "type", "setScaleType", "(Lcom/p1/mobile/putong/live/base/vap/util/ScaleType;)V", "Ll/r2m;", "scaleType", "(Ll/r2m;)V", "isMute", "setMute", "Ljava/io/File;", "file", "p", "(Ljava/io/File;)V", "Ll/irl;", "fileContainer", "q", "(Ll/irl;)V", "r", "o", "()Z", "Lkotlin/Pair;", "getRealSize", "()Lkotlin/Pair;", "Ll/ep0;", "Ll/ep0;", GameIdentity.player, "Landroid/os/Handler;", "b", "Lkotlin/Lazy;", "getUiHandler", "()Landroid/os/Handler;", "uiHandler", "c", "Landroid/graphics/SurfaceTexture;", Constants.INAPP_DATA_TAG, "Ll/jml;", "Lcom/p1/mobile/putong/live/base/vap/textureview/InnerTextureView;", "e", "Lcom/p1/mobile/putong/live/base/vap/textureview/InnerTextureView;", "innerTextureView", "Ll/irl;", "lastFile", "Ll/btd0;", "g", "Ll/btd0;", "scaleTypeUtil", "com/p1/mobile/putong/live/base/vap/AnimView$b", "getAnimProxyListener", "()Lcom/p1/mobile/putong/live/base/vap/AnimView$b;", "animProxyListener", RXScreenCaptureService.KEY_INDEX, "Z", "onSizeChangedCalled", "j", "needPrepareTextureView", "Ljava/lang/Runnable;", "k", "Ljava/lang/Runnable;", "prepareTextureViewRunnable", "Companion", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public class AnimView extends FrameLayout implements lml, TextureView.SurfaceTextureListener {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public ep0 player;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public final Lazy uiHandler;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    @Nullable
    public SurfaceTexture surface;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public jml animListener;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public InnerTextureView innerTextureView;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public irl lastFile;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @NotNull
    public final btd0 scaleTypeUtil;

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
    @Metadata(m87231d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\tJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000f\u0010\tJ!\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m87232d2 = {"com/p1/mobile/putong/live/base/vap/AnimView$b", "Ll/jml;", "Ll/no0;", Constants.KEY_CONFIG, "", "e", "(Ll/no0;)Z", "", "c", "()V", "", "frameIndex", Constants.INAPP_DATA_TAG, "(ILl/no0;)V", "f", "b", "errorType", "", "errorMsg", "a", "(ILjava/lang/String;)V", "base_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12466b implements jml {
        public C12466b() {
        }

        @Override // p149l.jml
        /* JADX INFO: renamed from: a */
        public void mo68643a(int errorType, String errorMsg) {
            jml jmlVar = AnimView.this.animListener;
            if (jmlVar != null) {
                jmlVar.mo68643a(errorType, errorMsg);
            }
        }

        @Override // p149l.jml
        /* JADX INFO: renamed from: b */
        public void mo68644b() {
            AnimView.this.m68637n();
            jml jmlVar = AnimView.this.animListener;
            if (jmlVar != null) {
                jmlVar.mo68644b();
            }
        }

        @Override // p149l.jml
        /* JADX INFO: renamed from: c */
        public void mo68645c() {
            jml jmlVar = AnimView.this.animListener;
            if (jmlVar != null) {
                jmlVar.mo68645c();
            }
        }

        @Override // p149l.jml
        /* JADX INFO: renamed from: d */
        public void mo68646d(int frameIndex, no0 config) {
            jml jmlVar = AnimView.this.animListener;
            if (jmlVar != null) {
                jmlVar.mo68646d(frameIndex, config);
            }
        }

        @Override // p149l.jml
        /* JADX INFO: renamed from: e */
        public boolean mo68647e(no0 config) {
            config.getClass();
            AnimView.this.scaleTypeUtil.m103826n(config.getWidth(), config.getHeight());
            jml jmlVar = AnimView.this.animListener;
            return jmlVar != null ? jmlVar.mo68647e(config) : super.mo68647e(config);
        }

        @Override // p149l.jml
        /* JADX INFO: renamed from: f */
        public void mo68648f() {
            AnimView.this.m68637n();
            jml jmlVar = AnimView.this.animListener;
            if (jmlVar != null) {
                jmlVar.mo68648f();
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public AnimView(@NotNull final Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.uiHandler = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.pp0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnimView.m68624b();
            }
        });
        this.scaleTypeUtil = new btd0();
        this.animProxyListener = LazyKt__LazyJVMKt.m87229b(new Function0() { // from class: l.qp0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnimView.m68628f(this.f155656a);
            }
        });
        this.prepareTextureViewRunnable = new Runnable() { // from class: l.rp0
            @Override // java.lang.Runnable
            public final void run() {
                AnimView.m68625c(this.f160463a, context);
            }
        };
        m68637n();
        ep0 ep0Var = new ep0(this);
        this.player = ep0Var;
        ep0Var.m117547t(getAnimProxyListener());
    }

    /* JADX INFO: renamed from: b */
    public static Handler m68624b() {
        return new Handler(Looper.getMainLooper());
    }

    /* JADX INFO: renamed from: c */
    public static void m68625c(AnimView animView, Context context) {
        animView.removeAllViews();
        InnerTextureView innerTextureView = new InnerTextureView(context, null, 0, 6, null);
        ep0 ep0Var = animView.player;
        if (ep0Var == null) {
            Intrinsics.m87502r(GameIdentity.player);
            ep0Var = null;
        }
        innerTextureView.setPlayer(ep0Var);
        innerTextureView.setOpaque(false);
        innerTextureView.setSurfaceTextureListener(animView);
        innerTextureView.setLayoutParams(animView.scaleTypeUtil.m103818f(innerTextureView));
        animView.innerTextureView = innerTextureView;
        animView.addView(innerTextureView);
    }

    /* JADX INFO: renamed from: d */
    public static Unit m68626d(AnimView animView) {
        animView.removeAllViews();
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static void m68627e(Function0 function0) {
        function0.invoke();
    }

    /* JADX INFO: renamed from: f */
    public static C12466b m68628f(AnimView animView) {
        return animView.new C12466b();
    }

    /* JADX INFO: renamed from: g */
    public static Unit m68629g(AnimView animView, irl irlVar) {
        if (animView.getVisibility() != 0) {
            C21588z0.INSTANCE.m216707b("AnimPlayer.AnimView", "AnimView is GONE, can't play");
            return Unit.INSTANCE;
        }
        ep0 ep0Var = animView.player;
        ep0 ep0Var2 = null;
        if (ep0Var == null) {
            Intrinsics.m87502r(GameIdentity.player);
            ep0Var = null;
        }
        if (ep0Var.m117542o()) {
            C21588z0.INSTANCE.m216707b("AnimPlayer.AnimView", "is running can not start");
        } else {
            animView.lastFile = irlVar;
            ep0 ep0Var3 = animView.player;
            if (ep0Var3 == null) {
                Intrinsics.m87502r(GameIdentity.player);
            } else {
                ep0Var2 = ep0Var3;
            }
            ep0Var2.m117529B(irlVar);
        }
        return Unit.INSTANCE;
    }

    private final C12466b getAnimProxyListener() {
        return (C12466b) this.animProxyListener.getValue();
    }

    private final Handler getUiHandler() {
        return (Handler) this.uiHandler.getValue();
    }

    /* JADX INFO: renamed from: h */
    public static void m68630h(AnimView animView) {
        InnerTextureView innerTextureView = animView.innerTextureView;
        if (innerTextureView != null) {
            innerTextureView.setSurfaceTextureListener(null);
        }
        animView.innerTextureView = null;
        animView.removeAllViews();
    }

    @Override // p149l.lml
    /* JADX INFO: renamed from: a */
    public void mo68634a() {
        if (this.onSizeChangedCalled) {
            getUiHandler().post(this.prepareTextureViewRunnable);
        } else {
            C21588z0.INSTANCE.m216707b("AnimPlayer.AnimView", "onSizeChanged not called");
            this.needPrepareTextureView = true;
        }
    }

    @Override // p149l.lml
    @NotNull
    public Pair<Integer, Integer> getRealSize() {
        return this.scaleTypeUtil.m103819g();
    }

    @Override // p149l.lml
    @Nullable
    public SurfaceTexture getSurfaceTexture() {
        SurfaceTexture surfaceTexture;
        InnerTextureView innerTextureView = this.innerTextureView;
        return (innerTextureView == null || (surfaceTexture = innerTextureView.getSurfaceTexture()) == null) ? this.surface : surfaceTexture;
    }

    /* JADX INFO: renamed from: l */
    public void m68635l(boolean enable) {
        ep0 ep0Var = this.player;
        if (ep0Var == null) {
            Intrinsics.m87502r(GameIdentity.player);
            ep0Var = null;
        }
        C12468a mixAnimPlugin = ep0Var.getPluginManager().getMixAnimPlugin();
        if (mixAnimPlugin != null) {
            mixAnimPlugin.m68675A(enable);
        }
    }

    @Deprecated
    /* JADX INFO: renamed from: m */
    public final void m68636m(boolean enable) {
        ep0 ep0Var = this.player;
        if (ep0Var == null) {
            Intrinsics.m87502r(GameIdentity.player);
            ep0Var = null;
        }
        ep0Var.m117550w(enable);
    }

    /* JADX INFO: renamed from: n */
    public final void m68637n() {
        irl irlVar = this.lastFile;
        if (irlVar != null) {
            irlVar.close();
        }
        m68642s(new Function0() { // from class: l.tp0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnimView.m68626d(this.f171425a);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public boolean mo68638o() {
        ep0 ep0Var = this.player;
        if (ep0Var == null) {
            Intrinsics.m87502r(GameIdentity.player);
            ep0Var = null;
        }
        return ep0Var.m117542o();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        irl irlVar;
        C21588z0.INSTANCE.m216709d("AnimPlayer.AnimView", "onAttachedToWindow");
        super.onAttachedToWindow();
        ep0 ep0Var = this.player;
        ep0 ep0Var2 = null;
        if (ep0Var == null) {
            Intrinsics.m87502r(GameIdentity.player);
            ep0Var = null;
        }
        ep0Var.m117549v(false);
        ep0 ep0Var3 = this.player;
        if (ep0Var3 == null) {
            Intrinsics.m87502r(GameIdentity.player);
        } else {
            ep0Var2 = ep0Var3;
        }
        if (ep0Var2.getPlayLoop() <= 0 || (irlVar = this.lastFile) == null) {
            return;
        }
        mo68640q(irlVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        C21588z0.INSTANCE.m216709d("AnimPlayer.AnimView", "onDetachedFromWindow");
        super.onDetachedFromWindow();
        ep0 ep0Var = this.player;
        ep0 ep0Var2 = null;
        if (ep0Var == null) {
            Intrinsics.m87502r(GameIdentity.player);
            ep0Var = null;
        }
        ep0Var.m117549v(true);
        ep0 ep0Var3 = this.player;
        if (ep0Var3 == null) {
            Intrinsics.m87502r(GameIdentity.player);
        } else {
            ep0Var2 = ep0Var3;
        }
        ep0Var2.m117544q();
    }

    @Override // android.view.View
    public void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        C21588z0.INSTANCE.m216709d("AnimPlayer.AnimView", "onSizeChanged w=" + w + ", h=" + h);
        this.scaleTypeUtil.m103824l(w, h);
        this.onSizeChangedCalled = true;
        if (this.needPrepareTextureView) {
            this.needPrepareTextureView = false;
            mo68634a();
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(@NotNull SurfaceTexture surface, int width, int height) {
        surface.getClass();
        C21588z0.INSTANCE.m216709d("AnimPlayer.AnimView", "onSurfaceTextureAvailable width=" + width + " height=" + height);
        this.surface = surface;
        ep0 ep0Var = this.player;
        if (ep0Var == null) {
            Intrinsics.m87502r(GameIdentity.player);
            ep0Var = null;
        }
        ep0Var.m117543p(width, height);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(@NotNull SurfaceTexture surface) {
        surface.getClass();
        C21588z0.INSTANCE.m216709d("AnimPlayer.AnimView", "onSurfaceTextureDestroyed");
        ep0 ep0Var = null;
        this.surface = null;
        ep0 ep0Var2 = this.player;
        if (ep0Var2 == null) {
            Intrinsics.m87502r(GameIdentity.player);
        } else {
            ep0Var = ep0Var2;
        }
        ep0Var.m117544q();
        getUiHandler().post(new Runnable() { // from class: l.np0
            @Override // java.lang.Runnable
            public final void run() {
                AnimView.m68630h(this.f139900a);
            }
        });
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(@NotNull SurfaceTexture surface, int width, int height) {
        surface.getClass();
        C21588z0.INSTANCE.m216709d("AnimPlayer.AnimView", "onSurfaceTextureSizeChanged " + width + " x " + height);
        ep0 ep0Var = this.player;
        if (ep0Var == null) {
            Intrinsics.m87502r(GameIdentity.player);
            ep0Var = null;
        }
        ep0Var.m117545r(width, height);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(@NotNull SurfaceTexture surface) {
        surface.getClass();
    }

    /* JADX INFO: renamed from: p */
    public void mo68639p(@NotNull File file) {
        file.getClass();
        try {
            mo68640q(new rfi(file));
        } catch (Throwable unused) {
            getAnimProxyListener().mo68643a(10007, "0x7 file can't read");
            getAnimProxyListener().mo68648f();
        }
    }

    /* JADX INFO: renamed from: q */
    public void mo68640q(@NotNull final irl fileContainer) {
        fileContainer.getClass();
        m68642s(new Function0() { // from class: l.op0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AnimView.m68629g(this.f144935a, fileContainer);
            }
        });
    }

    /* JADX INFO: renamed from: r */
    public void mo68641r() {
        ep0 ep0Var = this.player;
        if (ep0Var == null) {
            Intrinsics.m87502r(GameIdentity.player);
            ep0Var = null;
        }
        ep0Var.m117530C();
    }

    /* JADX INFO: renamed from: s */
    public final void m68642s(final Function0<Unit> f) {
        if (Intrinsics.m87488d(Looper.myLooper(), Looper.getMainLooper())) {
            f.invoke();
        } else {
            getUiHandler().post(new Runnable() { // from class: l.sp0
                @Override // java.lang.Runnable
                public final void run() {
                    AnimView.m68627e(f);
                }
            });
        }
    }

    public void setAnimListener(@Nullable jml animListener) {
        this.animListener = animListener;
    }

    public void setFetchResource(@Nullable hrl fetchResource) {
        ep0 ep0Var = this.player;
        if (ep0Var == null) {
            Intrinsics.m87502r(GameIdentity.player);
            ep0Var = null;
        }
        C12468a mixAnimPlugin = ep0Var.getPluginManager().getMixAnimPlugin();
        if (mixAnimPlugin != null) {
            mixAnimPlugin.m68677C(fetchResource);
        }
    }

    public void setFps(int fps) {
        C21588z0.INSTANCE.m216709d("AnimPlayer.AnimView", "setFps=" + fps);
        ep0 ep0Var = this.player;
        if (ep0Var == null) {
            Intrinsics.m87502r(GameIdentity.player);
            ep0Var = null;
        }
        ep0Var.m117548u(fps);
    }

    public void setLoop(int playLoop) {
        ep0 ep0Var = this.player;
        if (ep0Var == null) {
            Intrinsics.m87502r(GameIdentity.player);
            ep0Var = null;
        }
        ep0Var.m117553z(playLoop);
    }

    public void setMute(boolean isMute) {
        C21588z0.INSTANCE.m216707b("AnimPlayer.AnimView", "set mute=" + isMute);
        ep0 ep0Var = this.player;
        if (ep0Var == null) {
            Intrinsics.m87502r(GameIdentity.player);
            ep0Var = null;
        }
        ep0Var.m117552y(isMute);
    }

    public void setOnResourceClickListener(@Nullable ff50 resourceClickListener) {
        ep0 ep0Var = this.player;
        if (ep0Var == null) {
            Intrinsics.m87502r(GameIdentity.player);
            ep0Var = null;
        }
        C12468a mixAnimPlugin = ep0Var.getPluginManager().getMixAnimPlugin();
        if (mixAnimPlugin != null) {
            mixAnimPlugin.m68676B(resourceClickListener);
        }
    }

    public void setScaleType(@NotNull ScaleType type) {
        type.getClass();
        this.scaleTypeUtil.m103823k(type);
    }

    @Deprecated
    public final void setVideoMode(int mode) {
        ep0 ep0Var = this.player;
        if (ep0Var == null) {
            Intrinsics.m87502r(GameIdentity.player);
            ep0Var = null;
        }
        ep0Var.m117528A(mode);
    }

    public void setScaleType(@NotNull r2m scaleType) {
        scaleType.getClass();
        this.scaleTypeUtil.m103825m(scaleType);
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
