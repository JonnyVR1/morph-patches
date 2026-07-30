package com.p051p1.mobile.putong.core.p058ui.gift.layer;

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
import com.p051p1.mobile.putong.core.data.CoreGiftInfo;
import com.p051p1.mobile.putong.core.p058ui.gift.layer.CoreGiftLayer;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.video.IVdieoEffect;
import com.tantanapp.media.ttmediaeffect.video.VideoEffectConfig;
import com.tantanapp.media.ttmediaeffect.video.VideoEffectModel;
import com.tantanapp.media.ttmediaeffect.video.VideoEffectPlayer;
import p151v.VImage;
import p151v.VText;
import p153l.ahe;
import p153l.bnl0;
import p153l.dfl0;
import p153l.f4d0;
import p153l.kcg0;
import p153l.l51;
import p153l.psd0;
import p153l.uu8;
import p153l.x20;
import p153l.y4m;

/* JADX INFO: loaded from: classes3.dex */
public class CoreGiftLayer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public CoreGiftLayer f30040a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f30041b;

    /* JADX INFO: renamed from: c */
    public VideoEffectPlayer f30042c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f30043d;

    /* JADX INFO: renamed from: e */
    public VText f30044e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f30045f;

    /* JADX INFO: renamed from: g */
    public VImage f30046g;

    /* JADX INFO: renamed from: h */
    public boolean f30047h;

    /* JADX INFO: renamed from: i */
    public boolean f30048i;

    /* JADX INFO: renamed from: j */
    public kcg0 f30049j;

    /* JADX INFO: renamed from: k */
    public int f30050k;

    /* JADX INFO: renamed from: l */
    public boolean f30051l;

    /* JADX INFO: renamed from: m */
    public TextureView.SurfaceTextureListener f30052m;

    /* JADX INFO: renamed from: n */
    public boolean f30053n;

    /* JADX INFO: renamed from: o */
    public Runnable f30054o;

    /* JADX INFO: renamed from: p */
    public boolean f30055p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gift.layer.CoreGiftLayer$a */
    public class RunnableC8499a implements Runnable {
        public RunnableC8499a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            bnl0.m105524M(CoreGiftLayer.this.f30043d, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gift.layer.CoreGiftLayer$b */
    public class C8500b extends f4d0 {
        public C8500b() {
        }

        @Override // p153l.y4m.InterfaceC21517a
        /* JADX INFO: renamed from: d */
        public void mo46642d(String str, String str2) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gift.layer.CoreGiftLayer$c */
    public class C8501c extends f4d0 {
        public C8501c() {
        }

        @Override // p153l.y4m.InterfaceC21517a
        /* JADX INFO: renamed from: d */
        public void mo46642d(String str, String str2) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gift.layer.CoreGiftLayer$d */
    public class C8502d extends TextureViewSurfaceTextureListenerC8504f {
        public C8502d(TextureView.SurfaceTextureListener surfaceTextureListener) {
            super(surfaceTextureListener);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(@NonNull SurfaceTexture surfaceTexture) {
            CoreGiftLayer.this.f30050k++;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gift.layer.CoreGiftLayer$e */
    public class C8503e extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ x20 f30060a;

        public C8503e(x20 x20Var) {
            this.f30060a = x20Var;
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onFinished() {
            CoreGiftLayer.this.m46622B();
            CoreGiftLayer.this.f30055p = false;
            bnl0.m105524M(CoreGiftLayer.this.f30041b, false);
            if (NullChecker.m82486a(this.f30060a)) {
                this.f30060a.call();
            }
        }

        @Override // com.tantan.library.svga.AnimListener
        public void onStart() {
            CoreGiftLayer.this.f30055p = true;
            bnl0.m105524M(CoreGiftLayer.this.f30041b, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gift.layer.CoreGiftLayer$f */
    public static class TextureViewSurfaceTextureListenerC8504f implements TextureView.SurfaceTextureListener {

        /* JADX INFO: renamed from: a */
        public TextureView.SurfaceTextureListener f30062a;

        public TextureViewSurfaceTextureListenerC8504f(TextureView.SurfaceTextureListener surfaceTextureListener) {
            this.f30062a = surfaceTextureListener;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(@NonNull SurfaceTexture surfaceTexture, int i, int i2) {
            if (NullChecker.m82486a(this.f30062a)) {
                this.f30062a.onSurfaceTextureAvailable(surfaceTexture, i, i2);
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
        this.f30047h = false;
        this.f30048i = false;
        this.f30050k = 0;
        this.f30053n = false;
        this.f30054o = new RunnableC8499a();
        this.f30055p = false;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m46609a(View view) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m46610b(View view) {
    }

    /* JADX INFO: renamed from: A */
    public void m46621A(boolean z) {
        ViewGroup.LayoutParams layoutParams = this.f30042c.getLayoutParams();
        VideoEffectPlayer videoEffectPlayer = new VideoEffectPlayer(getContext());
        bnl0.m105524M(videoEffectPlayer, z);
        removeView(this.f30042c);
        videoEffectPlayer.setRenderMode(VideoEffectPlayer.RenderMode.TEXTURE_VIEW);
        this.f30042c = videoEffectPlayer;
        addView(videoEffectPlayer, 1, layoutParams);
    }

    /* JADX INFO: renamed from: B */
    public final void m46622B() {
        if (this.f30047h) {
            setOnClickListener(null);
            setClickable(false);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m46623C(boolean z) {
        this.f30048i = z;
    }

    /* JADX INFO: renamed from: D */
    public void m46624D(boolean z) {
        bnl0.m105524M(this.f30045f, z);
    }

    /* JADX INFO: renamed from: E */
    public void m46625E() {
        psd0.m173633z(this.f30049j);
        m46626F();
    }

    /* JADX INFO: renamed from: F */
    public void m46626F() {
        VideoEffectPlayer videoEffectPlayer = this.f30042c;
        if (videoEffectPlayer != null) {
            videoEffectPlayer.stop();
            l51.m152890J(this.f30054o);
            bnl0.m105524M(this.f30042c, false);
            bnl0.m105524M(this.f30043d, false);
            setOnClickListener(null);
            setClickable(false);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m46627G(String str) {
        bnl0.m105524M(this.f30044e, true);
        this.f30044e.setText(str);
    }

    /* JADX INFO: renamed from: m */
    public final void m46628m(View view) {
        uu8.m198174a(this, view);
    }

    /* JADX INFO: renamed from: n */
    public void m46629n() {
        bnl0.m105524M(this.f30044e, false);
    }

    /* JADX INFO: renamed from: o */
    public boolean m46630o() {
        return this.f30042c.isPlaying() || this.f30055p;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        psd0.m173633z(this.f30049j);
        VideoEffectPlayer videoEffectPlayer = this.f30042c;
        if (videoEffectPlayer != null) {
            bnl0.m105524M(videoEffectPlayer, false);
            this.f30042c.stop();
        }
        SVGAnimationView sVGAnimationView = this.f30041b;
        if (sVGAnimationView != null) {
            bnl0.m105524M(sVGAnimationView, false);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m46628m(this);
        this.f30042c.setRenderMode(VideoEffectPlayer.RenderMode.TEXTURE_VIEW);
        bnl0.m105509E0(this.f30046g, new View.OnClickListener() { // from class: l.mu8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f138752a.m46632q(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public boolean m46631p(CoreGiftInfo coreGiftInfo, y4m.InterfaceC21517a interfaceC21517a) {
        if (coreGiftInfo == null) {
            return false;
        }
        return ahe.m97794b("video").mo115525c(coreGiftInfo.f56859id, true, interfaceC21517a);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m46632q(View view) {
        m46626F();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m46633r(x20 x20Var) {
        if (this.f30050k >= 5 || x20Var == null) {
            return;
        }
        x20Var.call();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m46634s(x20 x20Var, TextureView textureView) {
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        bnl0.m105524M(this.f30042c, false);
        bnl0.m105524M(this.f30043d, false);
        m46626F();
        if (this.f30053n && this.f30050k < 10 && NullChecker.m82486a(textureView)) {
            if (textureView instanceof EffectTextureView) {
                ((EffectTextureView) textureView).mo20522c();
            }
            m46621A(false);
        }
        this.f30050k = 0;
    }

    public void setEnableFrameCheck(boolean z) {
        this.f30053n = z;
    }

    public void setErrorWhenFrameJank(boolean z) {
        this.f30051l = z;
    }

    public void setThxTipClickListener(final View.OnClickListener onClickListener) {
        bnl0.m105509E0(this.f30045f, new View.OnClickListener() { // from class: l.nu8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f143683a.m46637v(onClickListener, view);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ boolean m46635t(x20 x20Var, int i, int i2) {
        if (x20Var != null) {
            x20Var.call();
        }
        m46626F();
        return false;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m46636u(final x20 x20Var, final x20 x20Var2, VideoEffectModel videoEffectModel) {
        if (videoEffectModel == null || this.f30042c == null || TextUtils.isEmpty(videoEffectModel.getVideoFolder())) {
            if (x20Var != null) {
                x20Var.call();
                return;
            }
            return;
        }
        if (this.f30042c.isPlaying()) {
            m46621A(true);
        } else {
            bnl0.m105524M(this.f30042c, true);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.qu8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreGiftLayer.m46609a(view);
            }
        });
        setClickable(true);
        final TextureView textureView = null;
        this.f30042c.setVideoEffectConfig(new VideoEffectConfig.Builder().setEffectModel(videoEffectModel).setEffectType(VideoEffectConfig.MERGE_ALPHA).setEffectMatchInfo(null).build());
        if ((this.f30053n || this.f30051l) && (this.f30042c.getChildAt(0) instanceof TextureView)) {
            textureView = (TextureView) this.f30042c.getChildAt(0);
            TextureView.SurfaceTextureListener surfaceTextureListener = textureView.getSurfaceTextureListener();
            TextureView.SurfaceTextureListener surfaceTextureListener2 = this.f30052m;
            if (surfaceTextureListener2 == null || !surfaceTextureListener2.equals(surfaceTextureListener)) {
                C8502d c8502d = new C8502d(surfaceTextureListener);
                this.f30052m = c8502d;
                textureView.setSurfaceTextureListener(c8502d);
            }
        }
        this.f30042c.prepare();
        if (this.f30048i) {
            this.f30048i = false;
            l51.m152888H(getContext(), this.f30054o, 200L);
        }
        if (this.f30051l) {
            l51.m152888H(getContext(), new Runnable() { // from class: l.ru8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f164905a.m46633r(x20Var);
                }
            }, 1000L);
        }
        this.f30042c.start();
        this.f30042c.setCompletionListener(new IVdieoEffect.OnCompletionListener() { // from class: l.su8
            @Override // com.tantanapp.media.ttmediaeffect.video.IVdieoEffect.OnCompletionListener
            public final void onCompletion() {
                this.f170655a.m46634s(x20Var2, textureView);
            }
        });
        this.f30042c.setOnErrorListener(new IVdieoEffect.OnErrorListener() { // from class: l.tu8
            @Override // com.tantanapp.media.ttmediaeffect.video.IVdieoEffect.OnErrorListener
            public final boolean onError(int i, int i2) {
                return this.f176172a.m46635t(x20Var, i, i2);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m46637v(View.OnClickListener onClickListener, View view) {
        if (NullChecker.m82486a(view)) {
            bnl0.m105524M(this.f30045f, false);
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m46638w(CoreGiftInfo coreGiftInfo, x20 x20Var) {
        if (m46631p(coreGiftInfo, new C8501c())) {
            m46640y(coreGiftInfo, x20Var, null);
        } else {
            m46639x(coreGiftInfo, x20Var);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m46639x(CoreGiftInfo coreGiftInfo, x20 x20Var) {
        this.f30041b.clearDynamicData();
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        sVGADynamicEntity.setDynamicImage(coreGiftInfo.url, "HeadisHere");
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/719775d5-33be-45b7-9d72-3eb7f6dffe9610.so").repeatCount(1).dynamic(sVGADynamicEntity).animListener(new C8503e(x20Var)).into(this.f30041b);
        if (this.f30047h) {
            setClickable(true);
            setOnClickListener(new View.OnClickListener() { // from class: l.ou8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CoreGiftLayer.m46610b(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m46640y(CoreGiftInfo coreGiftInfo, final x20 x20Var, final x20 x20Var2) {
        this.f30050k = 0;
        this.f30042c.stop();
        this.f30049j = ((dfl0) ahe.m97794b("video")).m115526e(coreGiftInfo.f56859id, coreGiftInfo.dynamicURL, coreGiftInfo.dynamicMD5, new dfl0.InterfaceC16516a() { // from class: l.pu8
            @Override // p153l.dfl0.InterfaceC16516a
            /* JADX INFO: renamed from: a */
            public final void mo115527a(VideoEffectModel videoEffectModel) {
                this.f154156a.m46636u(x20Var2, x20Var, videoEffectModel);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public void m46641z(CoreGiftInfo coreGiftInfo, x20 x20Var, x20 x20Var2, x20 x20Var3) {
        if (m46631p(coreGiftInfo, new C8500b())) {
            m46640y(coreGiftInfo, x20Var, x20Var2);
        } else if (x20Var3 != null) {
            x20Var3.call();
        }
    }

    public CoreGiftLayer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30047h = false;
        this.f30048i = false;
        this.f30050k = 0;
        this.f30053n = false;
        this.f30054o = new RunnableC8499a();
        this.f30055p = false;
    }

    public CoreGiftLayer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f30047h = false;
        this.f30048i = false;
        this.f30050k = 0;
        this.f30053n = false;
        this.f30054o = new RunnableC8499a();
        this.f30055p = false;
    }
}
