package com.p051p1.mobile.putong.core.newui.home.livewindow;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.ijk.media.player.IMediaPlayer;
import p151v.VDraweeView;
import p153l.adc0;
import p153l.bnl0;
import p153l.d4t;
import p153l.dyh0;
import p153l.gfv;
import p153l.kec0;
import p153l.p9r;
import p153l.uqb0;

/* JADX INFO: loaded from: classes11.dex */
public class LiveMediaView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public float[] f23979a;

    /* JADX INFO: renamed from: b */
    public Path f23980b;

    /* JADX INFO: renamed from: c */
    public RectF f23981c;

    /* JADX INFO: renamed from: d */
    public d4t f23982d;

    /* JADX INFO: renamed from: e */
    public float f23983e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f23984f;

    /* JADX INFO: renamed from: g */
    public TextureView f23985g;

    /* JADX INFO: renamed from: h */
    public dyh0 f23986h;

    /* JADX INFO: renamed from: i */
    public Surface f23987i;

    /* JADX INFO: renamed from: j */
    public boolean f23988j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public Runnable f23989k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.livewindow.LiveMediaView$a */
    public class TextureViewSurfaceTextureListenerC8177a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC8177a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            LiveMediaView.this.f23987i = new Surface(surfaceTexture);
            if (LiveMediaView.this.f23989k != null) {
                LiveMediaView.this.f23989k.run();
                LiveMediaView.this.f23989k = null;
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            LiveMediaView.this.f23987i = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public LiveMediaView(@NonNull Context context) {
        super(context);
        this.f23979a = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f23980b = new Path();
        this.f23981c = new RectF();
        this.f23988j = true;
        m39752j(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.clipPath(this.f23980b);
        super.dispatchDraw(canvas);
    }

    public SimpleDraweeView getSimpleDraweeView() {
        return this.f23984f;
    }

    public TextureView getTextureView() {
        return this.f23985g;
    }

    /* JADX INFO: renamed from: h */
    public final void m39750h(int i, int i2, int i3, int i4) {
        Matrix matrix = new Matrix();
        float f = i3;
        float f2 = i;
        float f3 = (f * 1.0f) / f2;
        float f4 = i4;
        float f5 = i2;
        float f6 = (f4 * 1.0f) / f5;
        float f7 = (f2 * 1.0f) / f;
        float f8 = (f5 * 1.0f) / f4;
        matrix.reset();
        if (f7 >= f8) {
            float f9 = f7 * f6;
            matrix.postTranslate(0.0f, -((f5 * (f9 - 1.0f)) / 2.0f));
            matrix.postScale(1.0f, f9);
        } else {
            matrix.postScale(f8 * f3, 1.0f, f2 / 2.0f, f5 / 2.0f);
        }
        this.f23985g.setTransform(matrix);
        this.f23985g.postInvalidate();
    }

    /* JADX INFO: renamed from: i */
    public final void m39751i() {
        bnl0.m105525M0(this.f23984f, false);
        bnl0.m105564k0(this);
    }

    /* JADX INFO: renamed from: j */
    public final void m39752j(Context context) {
        View viewInflate = p9r.m171370a(context).inflate(kec0.f125574Pd, (ViewGroup) this, true);
        this.f23984f = (VDraweeView) viewInflate.findViewById(adc0.f70296d2);
        TextureView textureView = (TextureView) viewInflate.findViewById(adc0.f70240Zd);
        this.f23985g = textureView;
        textureView.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC8177a());
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean m39754l(IMediaPlayer iMediaPlayer, int i, int i2) {
        if (i != 3) {
            return false;
        }
        m39751i();
        d4t d4tVar = this.f23982d;
        if (d4tVar == null) {
            return true;
        }
        d4tVar.onStart();
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m39755m(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
        TextureView textureView = this.f23985g;
        if (textureView != null) {
            float f = (i * 1.0f) / i2;
            if (this.f23983e != f) {
                m39750h(textureView.getWidth(), this.f23985g.getHeight(), i, i2);
                this.f23983e = f;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean m39756n(IMediaPlayer iMediaPlayer, int i, int i2) {
        dyh0 dyh0Var = this.f23986h;
        if (dyh0Var == null) {
            return true;
        }
        dyh0Var.stop();
        this.f23986h = null;
        return true;
    }

    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void m39753k(final dyh0 dyh0Var, final String str) {
        if (this.f23987i == null) {
            this.f23989k = new Runnable() { // from class: l.e4t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f92145a.m39753k(dyh0Var, str);
                }
            };
            return;
        }
        dyh0 dyh0Var2 = this.f23986h;
        if (dyh0Var2 != null) {
            dyh0Var2.stop();
            this.f23986h = null;
        }
        this.f23986h = dyh0Var;
        try {
            dyh0Var.setDataSource(str);
            this.f23986h.prepareAsync();
            this.f23986h.setOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: l.f4t
                @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnInfoListener
                public final boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
                    return this.f97140a.m39754l(iMediaPlayer, i, i2);
                }
            });
            this.f23986h.setOnVideoSizeChangedListener(new IMediaPlayer.OnVideoSizeChangedListener() { // from class: l.g4t
                @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
                public final void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
                    this.f102194a.m39755m(iMediaPlayer, i, i2, i3, i4);
                }
            });
            this.f23986h.setSurface(this.f23987i);
            if (gfv.m130121a().m130122b()) {
                setVolume(true);
            } else {
                setVolume(false);
            }
            this.f23986h.setOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: l.h4t
                @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnErrorListener
                public final boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                    return this.f107827a.m39756n(iMediaPlayer, i, i2);
                }
            });
            this.f23986h.setLooping(this.f23988j);
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            m39759q();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f23980b.reset();
        this.f23981c.set(0.0f, 0.0f, getWidth(), getHeight());
        this.f23980b.addRoundRect(this.f23981c, this.f23979a, Path.Direction.CW);
        this.f23981c.toString();
    }

    /* JADX INFO: renamed from: p */
    public void m39758p(@Nullable String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z) {
            uqb0.f180374G.m127120O(this.f23984f, str, 2, 30);
        } else {
            uqb0.f180374G.m127115L0(this.f23984f, str);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m39759q() {
        bnl0.m105525M0(this.f23984f, true);
        bnl0.m105564k0(this);
    }

    public void setLiveMediaListener(d4t d4tVar) {
        this.f23982d = d4tVar;
    }

    public void setVolume(boolean z) {
        if (this.f23986h != null) {
            if (z) {
                gfv.m130121a().m130123c(true);
                this.f23986h.setVolume(1.0f, 1.0f);
            } else {
                gfv.m130121a().m130123c(false);
                this.f23986h.setVolume(0.0f, 0.0f);
            }
        }
    }

    public LiveMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23979a = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f23980b = new Path();
        this.f23981c = new RectF();
        this.f23988j = true;
        m39752j(context);
    }

    public LiveMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23979a = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f23980b = new Path();
        this.f23981c = new RectF();
        this.f23988j = true;
        m39752j(context);
    }
}
