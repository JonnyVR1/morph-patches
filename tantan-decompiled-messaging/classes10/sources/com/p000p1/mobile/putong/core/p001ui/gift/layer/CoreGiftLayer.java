package com.p000p1.mobile.putong.core.p001ui.gift.layer;

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
import com.p000p1.mobile.putong.core.data.CoreGiftInfo;
import com.p000p1.mobile.putong.core.p001ui.gift.layer.CoreGiftLayer;
import com.tantan.library.svga.AnimListener;
import com.tantan.library.svga.SVGALoader;
import com.tantan.library.svga.SVGAnimationView;
import com.tantan.library.svga.compose.SVGADynamicEntity;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.media.ttmediaeffect.video.IVdieoEffect;
import com.tantanapp.media.ttmediaeffect.video.VideoEffectConfig;
import com.tantanapp.media.ttmediaeffect.video.VideoEffectModel;
import com.tantanapp.media.ttmediaeffect.video.VideoEffectPlayer;
import java.util.List;
import l.c4g0;
import l.d30;
import l.e51;
import l.mkd0;
import l.xdl0;
import p003l.cwc0;
import p003l.f2m;
import p003l.nt8;
import p003l.wfe;
import p003l.z5l0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class CoreGiftLayer extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public CoreGiftLayer f1586a;

    /* JADX INFO: renamed from: b */
    public SVGAnimationView f1587b;

    /* JADX INFO: renamed from: c */
    public VideoEffectPlayer f1588c;

    /* JADX INFO: renamed from: d */
    public LinearLayout f1589d;

    /* JADX INFO: renamed from: e */
    public VText f1590e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f1591f;

    /* JADX INFO: renamed from: g */
    public VImage f1592g;

    /* JADX INFO: renamed from: h */
    public boolean f1593h;

    /* JADX INFO: renamed from: i */
    public boolean f1594i;

    /* JADX INFO: renamed from: j */
    public c4g0 f1595j;

    /* JADX INFO: renamed from: k */
    public int f1596k;

    /* JADX INFO: renamed from: l */
    public boolean f1597l;

    /* JADX INFO: renamed from: m */
    public TextureView.SurfaceTextureListener f1598m;

    /* JADX INFO: renamed from: n */
    public boolean f1599n;

    /* JADX INFO: renamed from: o */
    public Runnable f1600o;

    /* JADX INFO: renamed from: p */
    public boolean f1601p;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gift.layer.CoreGiftLayer$a */
    public class RunnableC3111a implements Runnable {
        public RunnableC3111a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            xdl0.M(CoreGiftLayer.this.f1589d, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gift.layer.CoreGiftLayer$b */
    public class C3112b extends cwc0 {
        public C3112b() {
        }

        @Override // p003l.f2m.InterfaceC3325a
        /* JADX INFO: renamed from: d */
        public void mo2789d(String str, String str2) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gift.layer.CoreGiftLayer$c */
    public class C3113c extends cwc0 {
        public C3113c() {
        }

        @Override // p003l.f2m.InterfaceC3325a
        /* JADX INFO: renamed from: d */
        public void mo2789d(String str, String str2) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gift.layer.CoreGiftLayer$d */
    public class C3114d extends TextureViewSurfaceTextureListenerC3116f {
        public C3114d(TextureView.SurfaceTextureListener surfaceTextureListener) {
            super(surfaceTextureListener);
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(@NonNull SurfaceTexture surfaceTexture) {
            CoreGiftLayer.this.f1596k++;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gift.layer.CoreGiftLayer$e */
    public class C3115e extends AnimListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ d30 f1606a;

        public C3115e(d30 d30Var) {
            this.f1606a = d30Var;
        }

        public void onFinished() {
            CoreGiftLayer.this.m2769B();
            CoreGiftLayer.this.f1601p = false;
            xdl0.M(CoreGiftLayer.this.f1587b, false);
            if (NullChecker.a(this.f1606a)) {
                this.f1606a.call();
            }
        }

        public void onStart() {
            CoreGiftLayer.this.f1601p = true;
            xdl0.M(CoreGiftLayer.this.f1587b, true);
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.gift.layer.CoreGiftLayer$f */
    public static class TextureViewSurfaceTextureListenerC3116f implements TextureView.SurfaceTextureListener {

        /* JADX INFO: renamed from: a */
        public TextureView.SurfaceTextureListener f1608a;

        public TextureViewSurfaceTextureListenerC3116f(TextureView.SurfaceTextureListener surfaceTextureListener) {
            this.f1608a = surfaceTextureListener;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(@NonNull SurfaceTexture surfaceTexture, int i, int i2) {
            if (NullChecker.a(this.f1608a)) {
                this.f1608a.onSurfaceTextureAvailable(surfaceTexture, i, i2);
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
        this.f1593h = false;
        this.f1594i = false;
        this.f1596k = 0;
        this.f1599n = false;
        this.f1600o = new RunnableC3111a();
        this.f1601p = false;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m2756a(View view) {
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m2757b(View view) {
    }

    /* JADX INFO: renamed from: A */
    public void m2768A(boolean z) {
        ViewGroup.LayoutParams layoutParams = this.f1588c.getLayoutParams();
        VideoEffectPlayer videoEffectPlayer = new VideoEffectPlayer(getContext());
        xdl0.M(videoEffectPlayer, z);
        removeView(this.f1588c);
        videoEffectPlayer.setRenderMode(VideoEffectPlayer.RenderMode.TEXTURE_VIEW);
        this.f1588c = videoEffectPlayer;
        addView((View) videoEffectPlayer, 1, layoutParams);
    }

    /* JADX INFO: renamed from: B */
    public final void m2769B() {
        if (this.f1593h) {
            setOnClickListener(null);
            setClickable(false);
        }
    }

    /* JADX INFO: renamed from: C */
    public void m2770C(boolean z) {
        this.f1594i = z;
    }

    /* JADX INFO: renamed from: D */
    public void m2771D(boolean z) {
        xdl0.M(this.f1591f, z);
    }

    /* JADX INFO: renamed from: E */
    public void m2772E() {
        mkd0.z(this.f1595j);
        m2773F();
    }

    /* JADX INFO: renamed from: F */
    public void m2773F() {
        VideoEffectPlayer videoEffectPlayer = this.f1588c;
        if (videoEffectPlayer != null) {
            videoEffectPlayer.stop();
            e51.J(this.f1600o);
            xdl0.M(this.f1588c, false);
            xdl0.M(this.f1589d, false);
            setOnClickListener(null);
            setClickable(false);
        }
    }

    /* JADX INFO: renamed from: G */
    public void m2774G(String str) {
        xdl0.M(this.f1590e, true);
        this.f1590e.setText(str);
    }

    /* JADX INFO: renamed from: m */
    public final void m2775m(View view) {
        nt8.m8371a(this, view);
    }

    /* JADX INFO: renamed from: n */
    public void m2776n() {
        xdl0.M(this.f1590e, false);
    }

    /* JADX INFO: renamed from: o */
    public boolean m2777o() {
        return this.f1588c.isPlaying() || this.f1601p;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        mkd0.z(this.f1595j);
        VideoEffectPlayer videoEffectPlayer = this.f1588c;
        if (videoEffectPlayer != null) {
            xdl0.M(videoEffectPlayer, false);
            this.f1588c.stop();
        }
        SVGAnimationView sVGAnimationView = this.f1587b;
        if (sVGAnimationView != null) {
            xdl0.M(sVGAnimationView, false);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m2775m(this);
        this.f1588c.setRenderMode(VideoEffectPlayer.RenderMode.TEXTURE_VIEW);
        xdl0.E0(this.f1592g, new View.OnClickListener() { // from class: l.ft8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4510a.m2779q(view);
            }
        });
    }

    /* JADX INFO: renamed from: p */
    public boolean m2778p(CoreGiftInfo coreGiftInfo, f2m.InterfaceC3325a interfaceC3325a) {
        if (coreGiftInfo == null) {
            return false;
        }
        return wfe.m10496b("video").mo5737c(((DbObject) coreGiftInfo).id, true, interfaceC3325a);
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m2779q(View view) {
        m2773F();
    }

    /* JADX INFO: renamed from: r */
    public final /* synthetic */ void m2780r(d30 d30Var) {
        if (this.f1596k >= 5 || d30Var == null) {
            return;
        }
        d30Var.call();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m2781s(d30 d30Var, TextureView textureView) {
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        xdl0.M(this.f1588c, false);
        xdl0.M(this.f1589d, false);
        m2773F();
        if (this.f1599n && this.f1596k < 10 && NullChecker.a(textureView)) {
            if (textureView instanceof EffectTextureView) {
                ((EffectTextureView) textureView).c();
            }
            m2768A(false);
        }
        this.f1596k = 0;
    }

    public void setEnableFrameCheck(boolean z) {
        this.f1599n = z;
    }

    public void setErrorWhenFrameJank(boolean z) {
        this.f1597l = z;
    }

    public void setThxTipClickListener(final View.OnClickListener onClickListener) {
        xdl0.E0(this.f1591f, new View.OnClickListener() { // from class: l.gt8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f4720a.m2784v(onClickListener, view);
            }
        });
    }

    /* JADX INFO: renamed from: t */
    public final /* synthetic */ boolean m2782t(d30 d30Var, int i, int i2) {
        if (d30Var != null) {
            d30Var.call();
        }
        m2773F();
        return false;
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m2783u(final d30 d30Var, final d30 d30Var2, VideoEffectModel videoEffectModel) {
        if (videoEffectModel == null || this.f1588c == null || TextUtils.isEmpty(videoEffectModel.getVideoFolder())) {
            if (d30Var != null) {
                d30Var.call();
                return;
            }
            return;
        }
        if (this.f1588c.isPlaying()) {
            m2768A(true);
        } else {
            xdl0.M(this.f1588c, true);
        }
        setOnClickListener(new View.OnClickListener() { // from class: l.jt8
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CoreGiftLayer.m2756a(view);
            }
        });
        setClickable(true);
        final TextureView textureView = null;
        this.f1588c.setVideoEffectConfig(new VideoEffectConfig.Builder().setEffectModel(videoEffectModel).setEffectType(VideoEffectConfig.MERGE_ALPHA).setEffectMatchInfo((List) null).build());
        if ((this.f1599n || this.f1597l) && (this.f1588c.getChildAt(0) instanceof TextureView)) {
            textureView = (TextureView) this.f1588c.getChildAt(0);
            TextureView.SurfaceTextureListener surfaceTextureListener = textureView.getSurfaceTextureListener();
            TextureView.SurfaceTextureListener surfaceTextureListener2 = this.f1598m;
            if (surfaceTextureListener2 == null || !surfaceTextureListener2.equals(surfaceTextureListener)) {
                C3114d c3114d = new C3114d(surfaceTextureListener);
                this.f1598m = c3114d;
                textureView.setSurfaceTextureListener(c3114d);
            }
        }
        this.f1588c.prepare();
        if (this.f1594i) {
            this.f1594i = false;
            e51.H(getContext(), this.f1600o, 200L);
        }
        if (this.f1597l) {
            e51.H(getContext(), new Runnable() { // from class: l.kt8
                @Override // java.lang.Runnable
                public final void run() {
                    this.f5708a.m2780r(d30Var);
                }
            }, 1000L);
        }
        this.f1588c.start();
        this.f1588c.setCompletionListener(new IVdieoEffect.OnCompletionListener() { // from class: l.lt8
            public final void onCompletion() {
                this.f6216a.m2781s(d30Var2, textureView);
            }
        });
        this.f1588c.setOnErrorListener(new IVdieoEffect.OnErrorListener() { // from class: l.mt8
            public final boolean onError(int i, int i2) {
                return this.f6427a.m2782t(d30Var, i, i2);
            }
        });
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m2784v(View.OnClickListener onClickListener, View view) {
        if (NullChecker.a(view)) {
            xdl0.M(this.f1591f, false);
            onClickListener.onClick(view);
        }
    }

    /* JADX INFO: renamed from: w */
    public void m2785w(CoreGiftInfo coreGiftInfo, d30 d30Var) {
        if (m2778p(coreGiftInfo, new C3113c())) {
            m2787y(coreGiftInfo, d30Var, null);
        } else {
            m2786x(coreGiftInfo, d30Var);
        }
    }

    /* JADX INFO: renamed from: x */
    public final void m2786x(CoreGiftInfo coreGiftInfo, d30 d30Var) {
        this.f1587b.clearDynamicData();
        SVGADynamicEntity sVGADynamicEntity = new SVGADynamicEntity();
        sVGADynamicEntity.setDynamicImage(coreGiftInfo.url, "HeadisHere");
        SVGALoader.with(getContext()).from("https://auto.tancdn.com/v1/raw/719775d5-33be-45b7-9d72-3eb7f6dffe9610.so").repeatCount(1).dynamic(sVGADynamicEntity).animListener(new C3115e(d30Var)).into(this.f1587b);
        if (this.f1593h) {
            setClickable(true);
            setOnClickListener(new View.OnClickListener() { // from class: l.ht8
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    CoreGiftLayer.m2757b(view);
                }
            });
        }
    }

    /* JADX INFO: renamed from: y */
    public final void m2787y(CoreGiftInfo coreGiftInfo, final d30 d30Var, final d30 d30Var2) {
        this.f1596k = 0;
        this.f1588c.stop();
        this.f1595j = ((z5l0) wfe.m10496b("video")).m11348e(((DbObject) coreGiftInfo).id, coreGiftInfo.dynamicURL, coreGiftInfo.dynamicMD5, new z5l0.InterfaceC3497a() { // from class: l.it8
            @Override // p003l.z5l0.InterfaceC3497a
            /* JADX INFO: renamed from: a */
            public final void mo7294a(VideoEffectModel videoEffectModel) {
                this.f5211a.m2783u(d30Var2, d30Var, videoEffectModel);
            }
        });
    }

    /* JADX INFO: renamed from: z */
    public void m2788z(CoreGiftInfo coreGiftInfo, d30 d30Var, d30 d30Var2, d30 d30Var3) {
        if (m2778p(coreGiftInfo, new C3112b())) {
            m2787y(coreGiftInfo, d30Var, d30Var2);
        } else if (d30Var3 != null) {
            d30Var3.call();
        }
    }

    public CoreGiftLayer(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1593h = false;
        this.f1594i = false;
        this.f1596k = 0;
        this.f1599n = false;
        this.f1600o = new RunnableC3111a();
        this.f1601p = false;
    }

    public CoreGiftLayer(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1593h = false;
        this.f1594i = false;
        this.f1596k = 0;
        this.f1599n = false;
        this.f1600o = new RunnableC3111a();
        this.f1601p = false;
    }
}
