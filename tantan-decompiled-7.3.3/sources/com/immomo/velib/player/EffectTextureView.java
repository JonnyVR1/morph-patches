package com.immomo.velib.player;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;

/* JADX INFO: loaded from: classes7.dex */
public class EffectTextureView extends TextureView implements InterfaceC4140e {

    /* JADX INFO: renamed from: a */
    InterfaceC4139d f14870a;

    /* JADX INFO: renamed from: b */
    boolean f14871b;

    /* JADX INFO: renamed from: com.immomo.velib.player.EffectTextureView$a */
    public class TextureViewSurfaceTextureListenerC4129a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC4129a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            EffectTextureView effectTextureView = EffectTextureView.this;
            InterfaceC4139d interfaceC4139d = effectTextureView.f14870a;
            if (interfaceC4139d != null && effectTextureView.f14871b) {
                interfaceC4139d.mo20573d(surfaceTexture);
                EffectTextureView.this.f14871b = false;
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
        this.f14871b = false;
        m20524e();
    }

    /* JADX INFO: renamed from: e */
    private void m20524e() {
        setOpaque(false);
        setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC4129a());
    }

    @Override // com.immomo.velib.player.InterfaceC4140e
    /* JADX INFO: renamed from: a */
    public void mo20520a(int i, int i2) {
        SurfaceTexture surfaceTexture;
        if (!isAvailable() || this.f14870a == null || (surfaceTexture = getSurfaceTexture()) == null || i <= 0 || i2 <= 0) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(i, i2);
    }

    @Override // com.immomo.velib.player.InterfaceC4140e
    /* JADX INFO: renamed from: b */
    public void mo20521b() {
        setOpaque(false);
        if (this.f14870a != null) {
            if (getSurfaceTexture() != null) {
                this.f14870a.mo20573d(getSurfaceTexture());
            } else {
                this.f14871b = true;
            }
        }
    }

    @Override // com.immomo.velib.player.InterfaceC4140e
    /* JADX INFO: renamed from: c */
    public void mo20522c() {
        this.f14870a = null;
    }

    @Override // com.immomo.velib.player.InterfaceC4140e
    /* JADX INFO: renamed from: d */
    public void mo20523d(InterfaceC4139d interfaceC4139d) {
        this.f14870a = interfaceC4139d;
    }

    @Override // com.immomo.velib.player.InterfaceC4140e
    public void setOnBackgroundListener(InterfaceC4139d.a aVar) {
    }

    public EffectTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f14871b = false;
        m20524e();
    }

    public EffectTextureView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f14871b = false;
        m20524e();
    }
}
