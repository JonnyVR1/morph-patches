package com.p000p1.mobile.putong.live.livingroom.increment.supergod.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.p000p1.mobile.putong.live.livingroom.increment.supergod.view.SuperGodEffectContainer;
import com.p1.mobile.putong.live.base.data.BLiveEffect;
import com.p1.mobile.putong.live.base.data.BLiveSuperGodReward;
import com.p1.mobile.putong.live.base.mmsdk.AnimEffectPlayer;
import com.p1.mobile.putong.live.base.mmsdk.effect.video.VideoEffectPlayer;
import com.p1.mobile.putong.live.base.view.XEGiftView;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.d;
import l.ap0;
import l.d30;
import l.gkh0;
import l.hjw;
import l.i7m;
import l.j7m;
import l.o4l0;
import l.q4l0;
import l.uvr;
import l.xdl0;
import l.xi5;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p002l.AbstractC0675m4;
import p002l.aqe;
import p002l.dqe;
import p002l.f6l0;
import p002l.fge;
import p002l.h7e;
import p002l.pvg0;
import p002l.spe;
import p002l.yvg0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u001d\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\fJ\r\u0010\u0014\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\fJ\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u0006¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\n2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\n2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#R\"\u0010+\u001a\u00020$8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\"\u00103\u001a\u00020,8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u0010;\u001a\u0002048\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b5\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u0018\u0010>\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010=R\u0018\u0010@\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010?R\u0014\u0010C\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010E\u001a\u00020\u00068\u0002X\u0082D¢\u0006\u0006\n\u0004\bD\u0010B¨\u0006F"}, d2 = {"Lcom/p1/mobile/putong/live/livingroom/increment/supergod/view/SuperGodEffectContainer;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onFinishInflate", "()V", "Ll/pvg0;", "dialog", "Lcom/p1/mobile/putong/live/base/data/BLiveSuperGodReward;", "info", "p", "(Ll/pvg0;Lcom/p1/mobile/putong/live/base/data/BLiveSuperGodReward;)V", "k", "j", "type", "q", "(I)V", "Landroid/view/View;", "view", "e", "(Landroid/view/View;)V", "", "url", "l", "(Ljava/lang/String;)V", "Lcom/p1/mobile/putong/live/base/data/BLiveEffect;", "videoEffect", "m", "(Lcom/p1/mobile/putong/live/base/data/BLiveEffect;)V", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "a", "Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "get_svga_img", "()Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;", "set_svga_img", "(Lcom/p1/mobile/putong/live/base/mmsdk/AnimEffectPlayer;)V", "_svga_img", "Lcom/p1/mobile/putong/live/base/mmsdk/effect/video/VideoEffectPlayer;", "b", "Lcom/p1/mobile/putong/live/base/mmsdk/effect/video/VideoEffectPlayer;", "get_video_player", "()Lcom/p1/mobile/putong/live/base/mmsdk/effect/video/VideoEffectPlayer;", "set_video_player", "(Lcom/p1/mobile/putong/live/base/mmsdk/effect/video/VideoEffectPlayer;)V", "_video_player", "Lcom/p1/mobile/putong/live/base/view/XEGiftView;", "c", "Lcom/p1/mobile/putong/live/base/view/XEGiftView;", "get_gift_view", "()Lcom/p1/mobile/putong/live/base/view/XEGiftView;", "set_gift_view", "(Lcom/p1/mobile/putong/live/base/view/XEGiftView;)V", "_gift_view", "d", "Lcom/p1/mobile/putong/live/base/data/BLiveSuperGodReward;", "effectInfo", "Ll/pvg0;", "parent", "f", "I", "SVGA_TYPE", "g", "VIDEO_TYPE", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
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
    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"com/p1/mobile/putong/live/livingroom/increment/supergod/view/SuperGodEffectContainer$a", "Ll/h7e;", "Ljava/io/File;", "file", "", "a", "(Ljava/io/File;)V", "", "errMsg", "onFailed", "(Ljava/lang/String;)V", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0457a implements h7e {
        public C0457a() {
        }

        @Override // p002l.h7e
        /* JADX INFO: renamed from: a */
        public void mo7819a(File file) {
            file.getClass();
            aqe aqeVarM10039i = aqe.m10039i();
            BLiveSuperGodReward bLiveSuperGodReward = SuperGodEffectContainer.this.effectInfo;
            BLiveEffect bLiveEffectM10044h = aqeVarM10039i.m10044h(bLiveSuperGodReward != null ? bLiveSuperGodReward.resourceId : null);
            SuperGodEffectContainer superGodEffectContainer = SuperGodEffectContainer.this;
            bLiveEffectM10044h.getClass();
            superGodEffectContainer.m8830m(bLiveEffectM10044h);
        }

        @Override // p002l.h7e
        /* JADX INFO: renamed from: b */
        public /* bridge */ void mo8833b(int i) {
            super.mo8833b(i);
        }

        @Override // p002l.h7e
        /* JADX INFO: renamed from: c */
        public /* bridge */ void mo7820c(boolean z) {
            super.mo7820c(z);
        }

        @Override // p002l.h7e
        /* JADX INFO: renamed from: d */
        public /* bridge */ void mo8834d(String str) {
            super.mo8834d(str);
        }

        @Override // p002l.h7e
        public /* bridge */ void onCancel() {
            super.onCancel();
        }

        @Override // p002l.h7e
        public void onFailed(String errMsg) {
            errMsg.getClass();
            super.onFailed(errMsg);
            gkh0.j("[live][gift]resource", "封神庆资源下载失败:" + errMsg);
        }

        @Override // p002l.h7e
        public /* bridge */ void onStart() {
            super.onStart();
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.increment.supergod.view.SuperGodEffectContainer$b */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0004¨\u0006\u0006"}, d2 = {"com/p1/mobile/putong/live/livingroom/increment/supergod/view/SuperGodEffectContainer$b", "Ll/ap0;", "", "b", "()V", "g", "livingroom_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class C0458b extends ap0 {
        public C0458b() {
        }

        /* JADX INFO: renamed from: b */
        public void m8835b() {
            super.b();
            SuperGodEffectContainer.this.m8832q(-1);
            pvg0 pvg0Var = SuperGodEffectContainer.this.parent;
            if (pvg0Var != null) {
                pvg0Var.m20715d0();
            }
        }

        /* JADX INFO: renamed from: g */
        public void m8836g() {
            SuperGodEffectContainer superGodEffectContainer = SuperGodEffectContainer.this;
            superGodEffectContainer.m8832q(superGodEffectContainer.SVGA_TYPE);
        }
    }

    public /* synthetic */ SuperGodEffectContainer(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: b */
    public static void m8817b(final SuperGodEffectContainer superGodEffectContainer, q4l0 q4l0Var) {
        if (q4l0Var == null) {
            return;
        }
        superGodEffectContainer.m8832q(superGodEffectContainer.VIDEO_TYPE);
        superGodEffectContainer.get_video_player().setVideoEffectConfig(new o4l0.a().c(q4l0Var).d(o4l0.j).e(new hjw()).b((List) null).a());
        superGodEffectContainer.get_video_player().prepare();
        superGodEffectContainer.get_video_player().start();
        superGodEffectContainer.get_video_player().setCompletionListener(new i7m() { // from class: l.wvg0
            public final void onCompletion() {
                SuperGodEffectContainer.m8824n(this.f22001a);
            }
        });
        superGodEffectContainer.get_video_player().setOnErrorListener(new j7m() { // from class: l.xvg0
            public final boolean onError(int i, String str) {
                return SuperGodEffectContainer.m8825o(this.f22482a, i, str);
            }
        });
    }

    /* JADX INFO: renamed from: d */
    public static void m8819d(SuperGodEffectContainer superGodEffectContainer) {
        pvg0 pvg0Var = superGodEffectContainer.parent;
        if (pvg0Var != null) {
            pvg0Var.m20715d0();
        }
    }

    /* JADX INFO: renamed from: n */
    public static final void m8824n(SuperGodEffectContainer superGodEffectContainer) {
        superGodEffectContainer.get_video_player().stop();
        pvg0 pvg0Var = superGodEffectContainer.parent;
        if (pvg0Var != null) {
            pvg0Var.m20715d0();
        }
        superGodEffectContainer.m8832q(-1);
    }

    /* JADX INFO: renamed from: o */
    public static final boolean m8825o(SuperGodEffectContainer superGodEffectContainer, int i, String str) {
        str.getClass();
        superGodEffectContainer.get_video_player().stop();
        superGodEffectContainer.m8832q(-1);
        return false;
    }

    /* JADX INFO: renamed from: e */
    public final void m8826e(View view) {
        yvg0.m26942a(this, view);
    }

    @NotNull
    public final XEGiftView get_gift_view() {
        XEGiftView xEGiftView = this._gift_view;
        if (xEGiftView != null) {
            return xEGiftView;
        }
        Intrinsics.r("_gift_view");
        return null;
    }

    @NotNull
    public final AnimEffectPlayer get_svga_img() {
        AnimEffectPlayer animEffectPlayer = this._svga_img;
        if (animEffectPlayer != null) {
            return animEffectPlayer;
        }
        Intrinsics.r("_svga_img");
        return null;
    }

    @NotNull
    public final VideoEffectPlayer get_video_player() {
        VideoEffectPlayer videoEffectPlayer = this._video_player;
        if (videoEffectPlayer != null) {
            return videoEffectPlayer;
        }
        Intrinsics.r("_video_player");
        return null;
    }

    /* JADX INFO: renamed from: j */
    public final void m8827j() {
        m8832q(-1);
        get_svga_img().o();
        get_video_player().stop();
    }

    /* JADX INFO: renamed from: k */
    public final void m8828k() {
        boolean zE1 = uvr.d().E1();
        BLiveSuperGodReward bLiveSuperGodReward = this.effectInfo;
        if (zE1) {
            fge.m13166r(get_gift_view(), new dqe(bLiveSuperGodReward != null ? bLiveSuperGodReward.resourceId : null).m11987i(new d30() { // from class: l.uvg0
                public final void call() {
                    SuperGodEffectContainer.m8819d(this.f20846a);
                }
            }));
            return;
        }
        if (!d.y(bLiveSuperGodReward != null ? bLiveSuperGodReward.resourceType : null, "mp4", false, 2, (Object) null)) {
            BLiveSuperGodReward bLiveSuperGodReward2 = this.effectInfo;
            if (d.y(bLiveSuperGodReward2 != null ? bLiveSuperGodReward2.resourceType : null, "svga", false, 2, (Object) null)) {
                BLiveSuperGodReward bLiveSuperGodReward3 = this.effectInfo;
                m8829l(bLiveSuperGodReward3 != null ? bLiveSuperGodReward3.resourceUrl : null);
                return;
            }
            return;
        }
        aqe aqeVarM10039i = aqe.m10039i();
        BLiveSuperGodReward bLiveSuperGodReward4 = this.effectInfo;
        BLiveEffect bLiveEffectM10044h = aqeVarM10039i.m10044h(bLiveSuperGodReward4 != null ? bLiveSuperGodReward4.resourceId : null);
        if (xi5.a(bLiveEffectM10044h)) {
            aqe aqeVarM10039i2 = aqe.m10039i();
            BLiveSuperGodReward bLiveSuperGodReward5 = this.effectInfo;
            aqeVarM10039i2.m10059x(bLiveSuperGodReward5 != null ? bLiveSuperGodReward5.resourceId : null, null, new C0457a());
        } else if (bLiveEffectM10044h != null) {
            m8830m(bLiveEffectM10044h);
        }
    }

    /* JADX INFO: renamed from: l */
    public final void m8829l(String url) {
        if (TextUtils.isEmpty(url)) {
            return;
        }
        get_svga_img().l(url, 1, new C0458b());
    }

    /* JADX INFO: renamed from: m */
    public final void m8830m(BLiveEffect videoEffect) {
        get_video_player().stop();
        AbstractC0675m4 abstractC0675m4M22604d = spe.m22604d("video");
        abstractC0675m4M22604d.getClass();
        ((f6l0) abstractC0675m4M22604d).m12965m(videoEffect.id, videoEffect.hdType, videoEffect.zip, videoEffect.md5, new f6l0.InterfaceC0557a() { // from class: l.vvg0
            @Override // p002l.f6l0.InterfaceC0557a
            /* JADX INFO: renamed from: a */
            public final void mo10170a(q4l0 q4l0Var) {
                SuperGodEffectContainer.m8817b(this.f21342a, q4l0Var);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m8826e(this);
        get_video_player().setRenderMode(2);
    }

    /* JADX INFO: renamed from: p */
    public final void m8831p(@NotNull pvg0 dialog, @NotNull BLiveSuperGodReward info) {
        dialog.getClass();
        info.getClass();
        this.effectInfo = info;
        this.parent = dialog;
    }

    /* JADX INFO: renamed from: q */
    public final void m8832q(int type) {
        xdl0.M(get_svga_img(), type == this.SVGA_TYPE);
        xdl0.M(get_video_player(), type == this.VIDEO_TYPE);
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
