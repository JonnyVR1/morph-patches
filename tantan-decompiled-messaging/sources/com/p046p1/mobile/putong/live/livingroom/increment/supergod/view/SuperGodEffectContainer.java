package com.p046p1.mobile.putong.live.livingroom.increment.supergod.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.OMSTemplateType;
import com.p046p1.mobile.putong.live.base.data.BLiveEffect;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveSuperGodReward;
import com.p046p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p046p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p046p1.mobile.putong.live.base.view.XEGiftView;
import com.p046p1.mobile.putong.live.livingroom.increment.supergod.view.SuperGodEffectContainer;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15386d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.AbstractC18387m4;
import p149l.ap0;
import p149l.aqe;
import p149l.d30;
import p149l.dqe;
import p149l.f6l0;
import p149l.fge;
import p149l.gkh0;
import p149l.h7e;
import p149l.hjw;
import p149l.i7m;
import p149l.j7m;
import p149l.o4l0;
import p149l.pvg0;
import p149l.q4l0;
import p149l.spe;
import p149l.uvr;
import p149l.xdl0;
import p149l.xi5;
import p149l.yvg0;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m87231d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\fJ\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\fJ\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010@\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010?R\u0014\u0010C\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\bD\u0010B¨\u0006F"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/supergod/view/SuperGodEffectContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Ll/pvg0;", OMSTemplateType.dialog, "Lcom/p1/mobile/putong/live/base/data/BLiveSuperGodReward;", BaseSei.INFO, "p", "(Ll/pvg0;Lcom/p1/mobile/putong/live/base/data/BLiveSuperGodReward;)V", "k", "j", "type", "q", "(I)V", "Landroid/view/View;", OMSTemplateModeType.view, "e", "(Landroid/view/View;)V", "", "url", BLiveStormDanmakuGiftResourceType.f44444l, "(Ljava/lang/String;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveEffect;", "videoEffect", "m", "(Lcom/p1/mobile/putong/live/base/data/BLiveEffect;)V", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "a", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "get_svga_img", "()Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "set_svga_img", "(Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;)V", "_svga_img", "Lcom/p1/mobile/putong/live/base/mmsdk/effect/video/VideoEffectPlayer;", "b", "Lcom/p1/mobile/putong/live/base/mmsdk/effect/video/VideoEffectPlayer;", "get_video_player", "()Lcom/p1/mobile/putong/live/base/mmsdk/effect/video/VideoEffectPlayer;", "set_video_player", "(Lcom/p1/mobile/putong/live/base/mmsdk/effect/video/VideoEffectPlayer;)V", "_video_player", "Lcom/p1/mobile/putong/live/base/view/XEGiftView;", "c", "Lcom/p1/mobile/putong/live/base/view/XEGiftView;", "get_gift_view", "()Lcom/p1/mobile/putong/live/base/view/XEGiftView;", "set_gift_view", "(Lcom/p1/mobile/putong/live/base/view/XEGiftView;)V", "_gift_view", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/live/base/data/BLiveSuperGodReward;", "effectInfo", "Ll/pvg0;", "parent", "f", "I", "SVGA_TYPE", "g", "VIDEO_TYPE", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
@SourceDebugExtension
public final class SuperGodEffectContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public AnimEffectPlayer _svga_img;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VideoEffectPlayer _video_player;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public XEGiftView _gift_view;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public BLiveSuperGodReward effectInfo;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @Nullable
    public pvg0 parent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int SVGA_TYPE;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int VIDEO_TYPE;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.supergod.view.SuperGodEffectContainer$a */
    @Metadata(m87231d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/increment/supergod/view/SuperGodEffectContainer$a", "Ll/h7e;", "Ljava/io/File;", "file", "", "a", "(Ljava/io/File;)V", "", "errMsg", "onFailed", "(Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12868a implements h7e {
        public C12868a() {
        }

        @Override // p149l.h7e
        /* JADX INFO: renamed from: a */
        public void mo74248a(File file) {
            file.getClass();
            aqe aqeVarM98261i = aqe.m98261i();
            BLiveSuperGodReward bLiveSuperGodReward = SuperGodEffectContainer.this.effectInfo;
            BLiveEffect bLiveEffectM98266h = aqeVarM98261i.m98266h(bLiveSuperGodReward != null ? bLiveSuperGodReward.resourceId : null);
            SuperGodEffectContainer superGodEffectContainer = SuperGodEffectContainer.this;
            bLiveEffectM98266h.getClass();
            superGodEffectContainer.m75214m(bLiveEffectM98266h);
        }

        @Override // p149l.h7e
        /* JADX INFO: renamed from: b */
        public /* bridge */ void mo75217b(int i) {
            super.mo75217b(i);
        }

        @Override // p149l.h7e
        /* JADX INFO: renamed from: c */
        public /* bridge */ void mo74249c(boolean z) {
            super.mo74249c(z);
        }

        @Override // p149l.h7e
        /* JADX INFO: renamed from: d */
        public /* bridge */ void mo75218d(String str) {
            super.mo75218d(str);
        }

        @Override // p149l.h7e
        public /* bridge */ void onCancel() {
            super.onCancel();
        }

        @Override // p149l.h7e
        public void onFailed(String errMsg) {
            errMsg.getClass();
            super.onFailed(errMsg);
            gkh0.m126627j("[live][gift]resource", "封神庆资源下载失败:" + errMsg);
        }

        @Override // p149l.h7e
        public /* bridge */ void onStart() {
            super.onStart();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.supergod.view.SuperGodEffectContainer$b */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/increment/supergod/view/SuperGodEffectContainer$b", "Ll/ap0;", "", "b", "()V", "g", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C12869b extends ap0 {
        public C12869b() {
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: b */
        public void mo69562b() {
            super.mo69562b();
            SuperGodEffectContainer.this.m75216q(-1);
            pvg0 pvg0Var = SuperGodEffectContainer.this.parent;
            if (pvg0Var != null) {
                pvg0Var.m171648d0();
            }
        }

        @Override // p149l.ap0
        /* JADX INFO: renamed from: g */
        public void mo69603g() {
            SuperGodEffectContainer superGodEffectContainer = SuperGodEffectContainer.this;
            superGodEffectContainer.m75216q(superGodEffectContainer.SVGA_TYPE);
        }
    }

    public /* synthetic */ SuperGodEffectContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: b */
    public static void m75201b(final SuperGodEffectContainer superGodEffectContainer, q4l0 q4l0Var) {
        if (q4l0Var == null) {
            return;
        }
        superGodEffectContainer.m75216q(superGodEffectContainer.VIDEO_TYPE);
        superGodEffectContainer.get_video_player().setVideoEffectConfig(new o4l0.C18841a().m162604c(q4l0Var).m162605d(o4l0.f141782j).m162606e(new hjw()).m162603b(null).m162602a());
        superGodEffectContainer.get_video_player().prepare();
        superGodEffectContainer.get_video_player().start();
        superGodEffectContainer.get_video_player().setCompletionListener(new i7m() { // from class: l.wvg0
            @Override // p149l.i7m
            public final void onCompletion() {
                SuperGodEffectContainer.m75208n(this.f188252a);
            }
        });
        superGodEffectContainer.get_video_player().setOnErrorListener(new j7m() { // from class: l.xvg0
            @Override // p149l.j7m
            public final boolean onError(int i, String str) {
                return SuperGodEffectContainer.m75209o(this.f194639a, i, str);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static void m75203d(SuperGodEffectContainer superGodEffectContainer) {
        pvg0 pvg0Var = superGodEffectContainer.parent;
        if (pvg0Var != null) {
            pvg0Var.m171648d0();
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m75208n(SuperGodEffectContainer superGodEffectContainer) {
        superGodEffectContainer.get_video_player().stop();
        pvg0 pvg0Var = superGodEffectContainer.parent;
        if (pvg0Var != null) {
            pvg0Var.m171648d0();
        }
        superGodEffectContainer.m75216q(-1);
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m75209o(SuperGodEffectContainer superGodEffectContainer, int i, String str) {
        str.getClass();
        superGodEffectContainer.get_video_player().stop();
        superGodEffectContainer.m75216q(-1);
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m75210e(View view) {
        yvg0.m216216a(this, view);
    }

    @NotNull
    public final XEGiftView get_gift_view() {
        XEGiftView xEGiftView = this._gift_view;
        if (xEGiftView != null) {
            return xEGiftView;
        }
        Intrinsics.m87502r("_gift_view");
        return null;
    }

    @NotNull
    public final AnimEffectPlayer get_svga_img() {
        AnimEffectPlayer animEffectPlayer = this._svga_img;
        if (animEffectPlayer != null) {
            return animEffectPlayer;
        }
        Intrinsics.m87502r("_svga_img");
        return null;
    }

    @NotNull
    public final VideoEffectPlayer get_video_player() {
        VideoEffectPlayer videoEffectPlayer = this._video_player;
        if (videoEffectPlayer != null) {
            return videoEffectPlayer;
        }
        Intrinsics.m87502r("_video_player");
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m75211j() {
        m75216q(-1);
        get_svga_img().m68505o();
        get_video_player().stop();
    }

    /* JADX INFO: renamed from: k */
    public final void m75212k() {
        boolean zM162666E1 = uvr.m196087d().m162666E1();
        BLiveSuperGodReward bLiveSuperGodReward = this.effectInfo;
        if (zM162666E1) {
            fge.m121214r(get_gift_view(), new dqe(bLiveSuperGodReward != null ? bLiveSuperGodReward.resourceId : null).m113015i(new d30() { // from class: l.uvg0
                @Override // p149l.d30
                public final void call() {
                    SuperGodEffectContainer.m75203d(this.f178531a);
                }
            }));
            return;
        }
        if (!C15386d.m93491y(bLiveSuperGodReward != null ? bLiveSuperGodReward.resourceType : null, "mp4", false, 2, null)) {
            BLiveSuperGodReward bLiveSuperGodReward2 = this.effectInfo;
            if (C15386d.m93491y(bLiveSuperGodReward2 != null ? bLiveSuperGodReward2.resourceType : null, "svga", false, 2, null)) {
                BLiveSuperGodReward bLiveSuperGodReward3 = this.effectInfo;
                m75213l(bLiveSuperGodReward3 != null ? bLiveSuperGodReward3.resourceUrl : null);
                return;
            }
            return;
        }
        aqe aqeVarM98261i = aqe.m98261i();
        BLiveSuperGodReward bLiveSuperGodReward4 = this.effectInfo;
        BLiveEffect bLiveEffectM98266h = aqeVarM98261i.m98266h(bLiveSuperGodReward4 != null ? bLiveSuperGodReward4.resourceId : null);
        if (xi5.m208914a(bLiveEffectM98266h)) {
            aqe aqeVarM98261i2 = aqe.m98261i();
            BLiveSuperGodReward bLiveSuperGodReward5 = this.effectInfo;
            aqeVarM98261i2.m98281x(bLiveSuperGodReward5 != null ? bLiveSuperGodReward5.resourceId : null, null, new C12868a());
        } else if (bLiveEffectM98266h != null) {
            m75214m(bLiveEffectM98266h);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m75213l(String url) {
        if (TextUtils.isEmpty(url)) {
            return;
        }
        get_svga_img().mo68502l(url, 1, new C12869b());
    }

    /* JADX INFO: renamed from: m */
    public final void m75214m(BLiveEffect videoEffect) {
        get_video_player().stop();
        AbstractC18387m4 abstractC18387m4M185365d = spe.m185365d("video");
        abstractC18387m4M185365d.getClass();
        ((f6l0) abstractC18387m4M185365d).m119628m(videoEffect.f44359id, videoEffect.hdType, videoEffect.zip, videoEffect.md5, new f6l0.InterfaceC16768a() { // from class: l.vvg0
            @Override // p149l.f6l0.InterfaceC16768a
            /* JADX INFO: renamed from: a */
            public final void mo100430a(q4l0 q4l0Var) {
                SuperGodEffectContainer.m75201b(this.f183228a, q4l0Var);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m75210e(this);
        get_video_player().setRenderMode(2);
    }

    /* JADX INFO: renamed from: p */
    public final void m75215p(@NotNull pvg0 dialog, @NotNull BLiveSuperGodReward info) {
        dialog.getClass();
        info.getClass();
        this.effectInfo = info;
        this.parent = dialog;
    }

    /* JADX INFO: renamed from: q */
    public final void m75216q(int type) {
        xdl0.m208344M(get_svga_img(), type == this.SVGA_TYPE);
        xdl0.m208344M(get_video_player(), type == this.VIDEO_TYPE);
    }

    public final void set_gift_view(@NotNull XEGiftView xEGiftView) {
        xEGiftView.getClass();
        this._gift_view = xEGiftView;
    }

    public final void set_svga_img(@NotNull AnimEffectPlayer animEffectPlayer) {
        animEffectPlayer.getClass();
        this._svga_img = animEffectPlayer;
    }

    public final void set_video_player(@NotNull VideoEffectPlayer videoEffectPlayer) {
        videoEffectPlayer.getClass();
        this._video_player = videoEffectPlayer;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SuperGodEffectContainer(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        context.getClass();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SuperGodEffectContainer(@NotNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        context.getClass();
        this.SVGA_TYPE = 1;
        this.VIDEO_TYPE = 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public SuperGodEffectContainer(@NotNull Context context) {
        this(context, null, 0, 6, null);
        context.getClass();
    }
}
