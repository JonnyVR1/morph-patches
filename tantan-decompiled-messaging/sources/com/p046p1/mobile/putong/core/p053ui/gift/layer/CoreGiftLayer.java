package com.p046p1.mobile.putong.core.p053ui.gift.layer;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.immomo.velib.player.EffectTextureView;
import com.p046p1.mobile.putong.core.data.CoreGiftInfo;
import com.p046p1.mobile.putong.core.p053ui.gift.layer.CoreGiftLayer;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.video.IVdieoEffect;
import com.tantanapp.media.ttmediaeffect.video.VideoEffectConfig;
import com.tantanapp.media.ttmediaeffect.video.VideoEffectModel;
import com.tantanapp.media.ttmediaeffect.video.VideoEffectPlayer;
import p147v.VImage;
import p147v.VText;
import p149l.c4g0;
import p149l.cwc0;
import p149l.d30;
import p149l.e51;
import p149l.f2m;
import p149l.mkd0;
import p149l.nt8;
import p149l.wfe;
import p149l.xdl0;
import p149l.z5l0;

/* JADX INFO: loaded from: classes10.dex */
public class CoreGiftLayer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public CoreGiftLayer f29192a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f29193b;

    /* JADX INFO: renamed from: c */
    public VideoEffectPlayer f29194c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f29195d;

    /* JADX INFO: renamed from: e */
    public VText f29196e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f29197f;

    /* JADX INFO: renamed from: g */
    public VImage f29198g;

    /* JADX INFO: renamed from: h */
    public boolean f29199h;

    /* JADX INFO: renamed from: i */
    public boolean f29200i;

    /* JADX INFO: renamed from: j */
    public c4g0 f29201j;

    /* JADX INFO: renamed from: k */
    public int f29202k;

    /* JADX INFO: renamed from: l */
    public boolean f29203l;

    /* JADX INFO: renamed from: m */
    public TextureView.SurfaceTextureListener f29204m;

    /* JADX INFO: renamed from: n */
    public boolean f29205n;

    /* JADX INFO: renamed from: o */
    public Runnable f29206o;

    /* JADX INFO: renamed from: p */
    public boolean f29207p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gift.layer.CoreGiftLayer$a */
    public class RunnableC8336a implements Runnable {
        public RunnableC8336a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            xdl0.m208344M(CoreGiftLayer.this.f29195d, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gift.layer.CoreGiftLayer$b */
    public class C8337b extends cwc0 {
        public C8337b() {
        }

        @Override // p149l.f2m.InterfaceC16743a
        /* JADX INFO: renamed from: d */
        public void mo45459d(String str, String str2) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gift.layer.CoreGiftLayer$c */
    public class C8338c extends cwc0 {
        public C8338c() {
        }

        @Override // p149l.f2m.InterfaceC16743a
        /* JADX INFO: renamed from: d */
        public void mo45459d(String str, String str2) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gift.layer.CoreGiftLayer$d */
    public class C8339d extends TextureViewSurfaceTextureListenerC8341f {
        public C8339d(TextureView.SurfaceTextureListener surfaceTextureListener) {
            super(surfaceTextureListener);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(@NonNull SurfaceTexture surfaceTexture) {
            CoreGiftLayer.this.f29202k++;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gift.layer.CoreGiftLayer$e */
    public class C8340e extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f29212a;

        public C8340e(d30 d30Var) {
            this.f29212a = d30Var;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            CoreGiftLayer.this.m45439B();
            CoreGiftLayer.this.f29207p = false;
            xdl0.m208344M(CoreGiftLayer.this.f29193b, false);
            if (NullChecker.m81303a(this.f29212a)) {
                this.f29212a.call();
            }
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            CoreGiftLayer.this.f29207p = true;
            xdl0.m208344M(CoreGiftLayer.this.f29193b, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gift.layer.CoreGiftLayer$f */
    public static class TextureViewSurfaceTextureListenerC8341f implements TextureView.SurfaceTextureListener {

        /* JADX INFO: renamed from: a */
        public TextureView.SurfaceTextureListener f29214a;

        public TextureViewSurfaceTextureListenerC8341f(TextureView.SurfaceTextureListener surfaceTextureListener) {
            this.f29214a = surfaceTextureListener;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(@NonNull SurfaceTexture surfaceTexture, int i, int i2) {
            if (NullChecker.m81303a(this.f29214a)) {
                this.f29214a.onSurfaceTextureAvailable(surfaceTexture, i, i2);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(@NonNull SurfaceTexture surfaceTexture) {
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(@NonNull SurfaceTexture surfaceTexture, int i, int i2) {
        }
    }

    public CoreGiftLayer(@NonNull Context context) {
        super(context);
        this.f29199h = false;
        this.f29200i = false;
        this.f29202k = 0;
        this.f29205n = false;
        this.f29206o = new RunnableC8336a();
        this.f29207p = false;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m45426a(View view) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m45427b(View view) {
    }

    /* JADX INFO: renamed from: A */
    public void m45438A(boolean z) {
        ViewGroup.LayoutParams layoutParams = this.f29194c.getLayoutParams();
        VideoEffectPlayer videoEffectPlayer = new VideoEffectPlayer(getContext());
        xdl0.m208344M(videoEffectPlayer, z);
        removeView(this.f29194c);
        videoEffectPlayer.setRenderMode(VideoEffectPlayer.RenderMode.TEXTURE_VIEW);
        this.f29194c = videoEffectPlayer;
        addView(videoEffectPlayer, 1, layoutParams);
    }

    /* JADX INFO: renamed from: B */
    public final void m45439B() {
        if (this.f29199h) {
            setOnClickListener(null);
            setClickable(false);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m45440C(boolean z) {
        this.f29200i = z;
    }

    /* JADX INFO: renamed from: D */
    public void m45441D(boolean z) {
        xdl0.m208344M(this.f29197f, z);
    }

    /* JADX INFO: renamed from: E */
    public void m45442E() {
        mkd0.m154992z(this.f29201j);
        m45443F();
    }

    /* JADX INFO: renamed from: F */
    public void m45443F() {
        VideoEffectPlayer videoEffectPlayer = this.f29194c;
        if (videoEffectPlayer != null) {
            videoEffectPlayer.stop();
            e51.m114745J(this.f29206o);
            xdl0.m208344M(this.f29194c, false);
            xdl0.m208344M(this.f29195d, false);
            setOnClickListener(null);
            setClickable(false);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m45444G(String str) {
        xdl0.m208344M(this.f29196e, true);
        this.f29196e.setText(str);
    }

    /* JADX INFO: renamed from: m */
    public final void m45445m(View view) {
        nt8.m161359a(this, view);
    }

    /* JADX INFO: renamed from: n */
    public void m45446n() {
        xdl0.m208344M(this.f29196e, false);
    }

    /* JADX INFO: renamed from: o */
    public boolean m45447o() {
        return this.f29194c.isPlaying() || this.f29207p;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.m154992z(this.f29201j);
        VideoEffectPlayer videoEffectPlayer = this.f29194c;
        if (videoEffectPlayer != null) {
            xdl0.m208344M(videoEffectPlayer, false);
            this.f29194c.stop();
        }
        SVGAnimationView sVGAnimationView = this.f29193b;
        if (sVGAnimationView != null) {
            xdl0.m208344M(sVGAnimationView, false);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m45445m(this);
        this.f29194c.setRenderMode(VideoEffectPlayer.RenderMode.TEXTURE_VIEW);
        xdl0.m208329E0(this.f29198g, new View.OnClickListener() { // from class: l.ft8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99156a.m45449q(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public boolean m45448p(CoreGiftInfo coreGiftInfo, f2m.InterfaceC16743a interfaceC16743a) {
        if (coreGiftInfo == null) {
            return false;
        }
        return wfe.m202983b("video").mo102510c(coreGiftInfo.f56011id, true, interfaceC16743a);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m45449q(View view) {
        m45443F();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m45450r(d30 d30Var) {
        if (this.f29202k >= 5 || d30Var == null) {
            return;
        }
        d30Var.call();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m45451s(d30 d30Var, TextureView textureView) {
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        xdl0.m208344M(this.f29194c, false);
        xdl0.m208344M(this.f29195d, false);
        m45443F();
        if (this.f29205n && this.f29202k < 10 && NullChecker.m81303a(textureView)) {
            if (textureView instanceof EffectTextureView) {
                ((EffectTextureView) textureView).mo19523c();
            }
            m45438A(false);
        }
        this.f29202k = 0;
    }

    public void setEnableFrameCheck(boolean z) {
        this.f29205n = z;
    }

    public void setErrorWhenFrameJank(boolean z) {
        this.f29203l = z;
    }

    public void setThxTipClickListener(final View.OnClickListener onClickListener) {
        xdl0.m208329E0(this.f29197f, new View.OnClickListener() { // from class: l.gt8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104253a.m45454v(onClickListener, view);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ boolean m45452t(d30 d30Var, int i, int i2) {
        if (d30Var != null) {
            d30Var.call();
        }
        m45443F();
        return false;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m45453u(final d30 d30Var, final d30 d30Var2, VideoEffectModel videoEffectModel) {
        if (videoEffectModel == null || this.f29194c == null || TextUtils.isEmpty(videoEffectModel.getVideoFolder())) {
            if (d30Var != null) {
                d30Var.call();
                return;
            }
            return;
        }
        if (this.f29194c.isPlaying()) {
            m45438A(true);
        } else {
            xdl0.m208344M(this.f29194c, true);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.jt8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreGiftLayer.m45426a(view);
            }
        });
        setClickable(true);
        final TextureView textureView = null;
        this.f29194c.setVideoEffectConfig(new VideoEffectConfig.Builder().setEffectModel(videoEffectModel).setEffectType(VideoEffectConfig.MERGE_ALPHA).setEffectMatchInfo(null).build());
        if ((this.f29205n || this.f29203l) && (this.f29194c.getChildAt(0) instanceof TextureView)) {
            textureView = (TextureView) this.f29194c.getChildAt(0);
            TextureView.SurfaceTextureListener surfaceTextureListener = textureView.getSurfaceTextureListener();
            TextureView.SurfaceTextureListener surfaceTextureListener2 = this.f29204m;
            if (surfaceTextureListener2 == null || !surfaceTextureListener2.equals(surfaceTextureListener)) {
                C8339d c8339d = new C8339d(surfaceTextureListener);
                this.f29204m = c8339d;
                textureView.setSurfaceTextureListener(c8339d);
            }
        }
        this.f29194c.prepare();
        if (this.f29200i) {
            this.f29200i = false;
            e51.m114743H(getContext(), this.f29206o, 200L);
        }
        if (this.f29203l) {
            e51.m114743H(getContext(), new Runnable() { // from class: l.kt8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f124568a.m45450r(d30Var);
                }
            }, 1000L);
        }
        this.f29194c.start();
        this.f29194c.setCompletionListener(new IVdieoEffect.OnCompletionListener() { // from class: l.lt8
            @Override // com.tantanapp.media.ttmediaeffect.video.IVdieoEffect.OnCompletionListener
            public final void onCompletion() {
                this.f129944a.m45451s(d30Var2, textureView);
            }
        });
        this.f29194c.setOnErrorListener(new IVdieoEffect.OnErrorListener() { // from class: l.mt8
            @Override // com.tantanapp.media.ttmediaeffect.video.IVdieoEffect.OnErrorListener
            public final boolean onError(int i, int i2) {
                return this.f135557a.m45452t(d30Var, i, i2);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m45454v(View.OnClickListener onClickListener, View view) {
        if (NullChecker.m81303a(view)) {
            xdl0.m208344M(this.f29197f, false);
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m45455w(CoreGiftInfo coreGiftInfo, d30 d30Var) {
        if (m45448p(coreGiftInfo, new C8338c())) {
            m45457y(coreGiftInfo, d30Var, null);
        } else {
            m45456x(coreGiftInfo, d30Var);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m45456x(CoreGiftInfo coreGiftInfo, d30 d30Var) {
        this.f29193b.clearDynamicData();
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        sVGADynamicEntity.setDynamicImage(coreGiftInfo.url, "HeadisHere");
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/719775d5-33be-45b7-9d72-3eb7f6dffe9610.so").repeatCount(1).dynamic(sVGADynamicEntity).animListener(new C8340e(d30Var)).into(this.f29193b);
        if (this.f29199h) {
            setClickable(true);
            setOnClickListener(new View.OnClickListener() { // from class: l.ht8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CoreGiftLayer.m45427b(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m45457y(CoreGiftInfo coreGiftInfo, final d30 d30Var, final d30 d30Var2) {
        this.f29202k = 0;
        this.f29194c.stop();
        this.f29201j = ((z5l0) wfe.m202983b("video")).m217365e(coreGiftInfo.f56011id, coreGiftInfo.dynamicURL, coreGiftInfo.dynamicMD5, new z5l0.InterfaceC21641a() { // from class: l.it8
            @Override // p149l.z5l0.InterfaceC21641a
            /* JADX INFO: renamed from: a */
            public final void mo138184a(VideoEffectModel videoEffectModel) {
                this.f114863a.m45453u(d30Var2, d30Var, videoEffectModel);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public void m45458z(CoreGiftInfo coreGiftInfo, d30 d30Var, d30 d30Var2, d30 d30Var3) {
        if (m45448p(coreGiftInfo, new C8337b())) {
            m45457y(coreGiftInfo, d30Var, d30Var2);
        } else if (d30Var3 != null) {
            d30Var3.call();
        }
    }

    public CoreGiftLayer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f29199h = false;
        this.f29200i = false;
        this.f29202k = 0;
        this.f29205n = false;
        this.f29206o = new RunnableC8336a();
        this.f29207p = false;
    }

    public CoreGiftLayer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f29199h = false;
        this.f29200i = false;
        this.f29202k = 0;
        this.f29205n = false;
        this.f29206o = new RunnableC8336a();
        this.f29207p = false;
    }
}
