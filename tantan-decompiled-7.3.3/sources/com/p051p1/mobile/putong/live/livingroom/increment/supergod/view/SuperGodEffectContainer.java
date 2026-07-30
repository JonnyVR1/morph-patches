package com.p051p1.mobile.putong.live.livingroom.increment.supergod.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.OMSTemplateType;
import com.p051p1.mobile.putong.live.base.data.BLiveEffect;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveSuperGodReward;
import com.p051p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p051p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p051p1.mobile.putong.live.base.view.XEGiftView;
import com.p051p1.mobile.putong.live.livingroom.increment.supergod.view.SuperGodEffectContainer;
import java.io.File;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.C15493d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.AbstractC18340l4;
import p153l.bnl0;
import p153l.ere;
import p153l.g4h0;
import p153l.gmw;
import p153l.hre;
import p153l.jfl0;
import p153l.jhe;
import p153l.nsh0;
import p153l.sdl0;
import p153l.udl0;
import p153l.vxr;
import p153l.w8e;
import p153l.wo0;
import p153l.wqe;
import p153l.x20;
import p153l.x3h0;
import p153l.y9m;
import p153l.yj5;
import p153l.z9m;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(m88120d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\fJ\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\fJ\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010@\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010?R\u0014\u0010C\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\bD\u0010B¨\u0006F"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/supergod/view/SuperGodEffectContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Ll/x3h0;", OMSTemplateType.dialog, "Lcom/p1/mobile/putong/live/base/data/BLiveSuperGodReward;", BaseSei.INFO, "p", "(Ll/x3h0;Lcom/p1/mobile/putong/live/base/data/BLiveSuperGodReward;)V", "k", "j", "type", "q", "(I)V", "Landroid/view/View;", OMSTemplateModeType.view, "e", "(Landroid/view/View;)V", "", "url", BLiveStormDanmakuGiftResourceType.f45292l, "(Ljava/lang/String;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveEffect;", "videoEffect", "m", "(Lcom/p1/mobile/putong/live/base/data/BLiveEffect;)V", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "a", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "get_svga_img", "()Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "set_svga_img", "(Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;)V", "_svga_img", "Lcom/p1/mobile/putong/live/base/mmsdk/effect/video/VideoEffectPlayer;", "b", "Lcom/p1/mobile/putong/live/base/mmsdk/effect/video/VideoEffectPlayer;", "get_video_player", "()Lcom/p1/mobile/putong/live/base/mmsdk/effect/video/VideoEffectPlayer;", "set_video_player", "(Lcom/p1/mobile/putong/live/base/mmsdk/effect/video/VideoEffectPlayer;)V", "_video_player", "Lcom/p1/mobile/putong/live/base/view/XEGiftView;", "c", "Lcom/p1/mobile/putong/live/base/view/XEGiftView;", "get_gift_view", "()Lcom/p1/mobile/putong/live/base/view/XEGiftView;", "set_gift_view", "(Lcom/p1/mobile/putong/live/base/view/XEGiftView;)V", "_gift_view", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/live/base/data/BLiveSuperGodReward;", "effectInfo", "Ll/x3h0;", "parent", "f", "I", "SVGA_TYPE", "g", "VIDEO_TYPE", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
    public x3h0 parent;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public final int SVGA_TYPE;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public final int VIDEO_TYPE;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.supergod.view.SuperGodEffectContainer$a */
    @Metadata(m88120d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m88121d2 = {"com/p1/mobile/putong/live/livingroom/increment/supergod/view/SuperGodEffectContainer$a", "Ll/w8e;", "Ljava/io/File;", "file", "", "a", "(Ljava/io/File;)V", "", "errMsg", "onFailed", "(Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C13031a implements w8e {
        public C13031a() {
        }

        @Override // p153l.w8e
        /* JADX INFO: renamed from: a */
        public void mo75431a(File file) {
            file.getClass();
            ere ereVarM122146i = ere.m122146i();
            BLiveSuperGodReward bLiveSuperGodReward = SuperGodEffectContainer.this.effectInfo;
            BLiveEffect bLiveEffectM122151h = ereVarM122146i.m122151h(bLiveSuperGodReward != null ? bLiveSuperGodReward.resourceId : null);
            SuperGodEffectContainer superGodEffectContainer = SuperGodEffectContainer.this;
            bLiveEffectM122151h.getClass();
            superGodEffectContainer.m76397m(bLiveEffectM122151h);
        }

        @Override // p153l.w8e
        /* JADX INFO: renamed from: b */
        public /* bridge */ void mo76400b(int i) {
            super.mo76400b(i);
        }

        @Override // p153l.w8e
        /* JADX INFO: renamed from: c */
        public /* bridge */ void mo75432c(boolean z) {
            super.mo75432c(z);
        }

        @Override // p153l.w8e
        /* JADX INFO: renamed from: d */
        public /* bridge */ void mo76401d(String str) {
            super.mo76401d(str);
        }

        @Override // p153l.w8e
        public /* bridge */ void onCancel() {
            super.onCancel();
        }

        @Override // p153l.w8e
        public void onFailed(String errMsg) {
            errMsg.getClass();
            super.onFailed(errMsg);
            nsh0.m164608j("[live][gift]resource", "封神庆资源下载失败:" + errMsg);
        }

        @Override // p153l.w8e
        public /* bridge */ void onStart() {
            super.onStart();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.supergod.view.SuperGodEffectContainer$b */
    @Metadata(m88120d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, m88121d2 = {"com/p1/mobile/putong/live/livingroom/increment/supergod/view/SuperGodEffectContainer$b", "Ll/wo0;", "", "b", "()V", "g", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C13032b extends wo0 {
        public C13032b() {
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: b */
        public void mo70745b() {
            super.mo70745b();
            SuperGodEffectContainer.this.m76399q(-1);
            x3h0 x3h0Var = SuperGodEffectContainer.this.parent;
            if (x3h0Var != null) {
                x3h0Var.m209240d0();
            }
        }

        @Override // p153l.wo0
        /* JADX INFO: renamed from: g */
        public void mo70786g() {
            SuperGodEffectContainer superGodEffectContainer = SuperGodEffectContainer.this;
            superGodEffectContainer.m76399q(superGodEffectContainer.SVGA_TYPE);
        }
    }

    public /* synthetic */ SuperGodEffectContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: b */
    public static void m76384b(final SuperGodEffectContainer superGodEffectContainer, udl0 udl0Var) {
        if (udl0Var == null) {
            return;
        }
        superGodEffectContainer.m76399q(superGodEffectContainer.VIDEO_TYPE);
        superGodEffectContainer.get_video_player().setVideoEffectConfig(new sdl0.C20024a().m185480c(udl0Var).m185481d(sdl0.f167422j).m185482e(new gmw()).m185479b(null).m185478a());
        superGodEffectContainer.get_video_player().prepare();
        superGodEffectContainer.get_video_player().start();
        superGodEffectContainer.get_video_player().setCompletionListener(new y9m() { // from class: l.e4h0
            @Override // p153l.y9m
            public final void onCompletion() {
                SuperGodEffectContainer.m76391n(this.f92100a);
            }
        });
        superGodEffectContainer.get_video_player().setOnErrorListener(new z9m() { // from class: l.f4h0
            @Override // p153l.z9m
            public final boolean onError(int i, String str) {
                return SuperGodEffectContainer.m76392o(this.f97098a, i, str);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static void m76386d(SuperGodEffectContainer superGodEffectContainer) {
        x3h0 x3h0Var = superGodEffectContainer.parent;
        if (x3h0Var != null) {
            x3h0Var.m209240d0();
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m76391n(SuperGodEffectContainer superGodEffectContainer) {
        superGodEffectContainer.get_video_player().stop();
        x3h0 x3h0Var = superGodEffectContainer.parent;
        if (x3h0Var != null) {
            x3h0Var.m209240d0();
        }
        superGodEffectContainer.m76399q(-1);
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m76392o(SuperGodEffectContainer superGodEffectContainer, int i, String str) {
        str.getClass();
        superGodEffectContainer.get_video_player().stop();
        superGodEffectContainer.m76399q(-1);
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m76393e(View view) {
        g4h0.m128881a(this, view);
    }

    @NotNull
    public final XEGiftView get_gift_view() {
        XEGiftView xEGiftView = this._gift_view;
        if (xEGiftView != null) {
            return xEGiftView;
        }
        Intrinsics.m88391r("_gift_view");
        return null;
    }

    @NotNull
    public final AnimEffectPlayer get_svga_img() {
        AnimEffectPlayer animEffectPlayer = this._svga_img;
        if (animEffectPlayer != null) {
            return animEffectPlayer;
        }
        Intrinsics.m88391r("_svga_img");
        return null;
    }

    @NotNull
    public final VideoEffectPlayer get_video_player() {
        VideoEffectPlayer videoEffectPlayer = this._video_player;
        if (videoEffectPlayer != null) {
            return videoEffectPlayer;
        }
        Intrinsics.m88391r("_video_player");
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m76394j() {
        m76399q(-1);
        get_svga_img().m69688o();
        get_video_player().stop();
    }

    /* JADX INFO: renamed from: k */
    public final void m76395k() {
        boolean zM170973E1 = vxr.m203876d().m170973E1();
        BLiveSuperGodReward bLiveSuperGodReward = this.effectInfo;
        if (zM170973E1) {
            jhe.m144897r(get_gift_view(), new hre(bLiveSuperGodReward != null ? bLiveSuperGodReward.resourceId : null).m136826i(new x20() { // from class: l.c4h0
                @Override // p153l.x20
                public final void call() {
                    SuperGodEffectContainer.m76386d(this.f79704a);
                }
            }));
            return;
        }
        if (!C15493d.m94382y(bLiveSuperGodReward != null ? bLiveSuperGodReward.resourceType : null, "mp4", false, 2, null)) {
            BLiveSuperGodReward bLiveSuperGodReward2 = this.effectInfo;
            if (C15493d.m94382y(bLiveSuperGodReward2 != null ? bLiveSuperGodReward2.resourceType : null, "svga", false, 2, null)) {
                BLiveSuperGodReward bLiveSuperGodReward3 = this.effectInfo;
                m76396l(bLiveSuperGodReward3 != null ? bLiveSuperGodReward3.resourceUrl : null);
                return;
            }
            return;
        }
        ere ereVarM122146i = ere.m122146i();
        BLiveSuperGodReward bLiveSuperGodReward4 = this.effectInfo;
        BLiveEffect bLiveEffectM122151h = ereVarM122146i.m122151h(bLiveSuperGodReward4 != null ? bLiveSuperGodReward4.resourceId : null);
        if (yj5.m216388a(bLiveEffectM122151h)) {
            ere ereVarM122146i2 = ere.m122146i();
            BLiveSuperGodReward bLiveSuperGodReward5 = this.effectInfo;
            ereVarM122146i2.m122166x(bLiveSuperGodReward5 != null ? bLiveSuperGodReward5.resourceId : null, null, new C13031a());
        } else if (bLiveEffectM122151h != null) {
            m76397m(bLiveEffectM122151h);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m76396l(String url) {
        if (TextUtils.isEmpty(url)) {
            return;
        }
        get_svga_img().mo69685l(url, 1, new C13032b());
    }

    /* JADX INFO: renamed from: m */
    public final void m76397m(BLiveEffect videoEffect) {
        get_video_player().stop();
        AbstractC18340l4 abstractC18340l4M207509d = wqe.m207509d("video");
        abstractC18340l4M207509d.getClass();
        ((jfl0) abstractC18340l4M207509d).m144689m(videoEffect.f45207id, videoEffect.hdType, videoEffect.zip, videoEffect.md5, new jfl0.InterfaceC17940a() { // from class: l.d4h0
            @Override // p153l.jfl0.InterfaceC17940a
            /* JADX INFO: renamed from: a */
            public final void mo95516a(udl0 udl0Var) {
                SuperGodEffectContainer.m76384b(this.f85049a, udl0Var);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76393e(this);
        get_video_player().setRenderMode(2);
    }

    /* JADX INFO: renamed from: p */
    public final void m76398p(@NotNull x3h0 dialog, @NotNull BLiveSuperGodReward info) {
        dialog.getClass();
        info.getClass();
        this.effectInfo = info;
        this.parent = dialog;
    }

    /* JADX INFO: renamed from: q */
    public final void m76399q(int type) {
        bnl0.m105524M(get_svga_img(), type == this.SVGA_TYPE);
        bnl0.m105524M(get_video_player(), type == this.VIDEO_TYPE);
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
