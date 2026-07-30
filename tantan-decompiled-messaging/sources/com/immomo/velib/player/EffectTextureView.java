package com.immomo.velib.player;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;

/* JADX INFO: loaded from: classes7.dex */
public class EffectTextureView extends TextureView implements InterfaceC3989e {

    /* JADX INFO: renamed from: a */
    InterfaceC3988d f14151a;

    /* JADX INFO: renamed from: b */
    boolean f14152b;

    /* JADX INFO: renamed from: com.immomo.velib.player.EffectTextureView$a */
    public class TextureViewSurfaceTextureListenerC3978a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC3978a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            EffectTextureView effectTextureView = EffectTextureView.this;
            InterfaceC3988d interfaceC3988d = effectTextureView.f14151a;
            if (interfaceC3988d != null && effectTextureView.f14152b) {
                interfaceC3988d.mo19574d(surfaceTexture);
                EffectTextureView.this.f14152b = false;
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return false;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public EffectTextureView(Context context) {
        super(context);
        this.f14152b = false;
        m19525e();
    }

    /* JADX INFO: renamed from: e */
    private void m19525e() {
        setOpaque(false);
        setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC3978a());
    }

    @Override // com.immomo.velib.player.InterfaceC3989e
    /* JADX INFO: renamed from: a */
    public void mo19521a(int i, int i2) {
        SurfaceTexture surfaceTexture;
        if (!isAvailable() || this.f14151a == null || (surfaceTexture = getSurfaceTexture()) == null || i <= 0 || i2 <= 0) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(i, i2);
    }

    @Override // com.immomo.velib.player.InterfaceC3989e
    /* JADX INFO: renamed from: b */
    public void mo19522b() {
        setOpaque(false);
        if (this.f14151a != null) {
            if (getSurfaceTexture() != null) {
                this.f14151a.mo19574d(getSurfaceTexture());
            } else {
                this.f14152b = true;
            }
        }
    }

    @Override // com.immomo.velib.player.InterfaceC3989e
    /* JADX INFO: renamed from: c */
    public void mo19523c() {
        this.f14151a = null;
    }

    @Override // com.immomo.velib.player.InterfaceC3989e
    /* JADX INFO: renamed from: d */
    public void mo19524d(InterfaceC3988d interfaceC3988d) {
        this.f14151a = interfaceC3988d;
    }

    @Override // com.immomo.velib.player.InterfaceC3989e
    public void setOnBackgroundListener(InterfaceC3988d.a aVar) {
    }

    public EffectTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14152b = false;
        m19525e();
    }

    public EffectTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14152b = false;
        m19525e();
    }
}
