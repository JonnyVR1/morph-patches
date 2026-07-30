package com.p046p1.mobile.putong.core.newui.home.livewindow;

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
import p147v.VDraweeView;
import p149l.c2t;
import p149l.f6c0;
import p149l.fdv;
import p149l.o7r;
import p149l.qib0;
import p149l.u4c0;
import p149l.wph0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class LiveMediaView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public float[] f23237a;

    /* JADX INFO: renamed from: b */
    public Path f23238b;

    /* JADX INFO: renamed from: c */
    public RectF f23239c;

    /* JADX INFO: renamed from: d */
    public c2t f23240d;

    /* JADX INFO: renamed from: e */
    public float f23241e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f23242f;

    /* JADX INFO: renamed from: g */
    public TextureView f23243g;

    /* JADX INFO: renamed from: h */
    public wph0 f23244h;

    /* JADX INFO: renamed from: i */
    public Surface f23245i;

    /* JADX INFO: renamed from: j */
    public boolean f23246j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public Runnable f23247k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.livewindow.LiveMediaView$a */
    public class TextureViewSurfaceTextureListenerC8026a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC8026a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            LiveMediaView.this.f23245i = new Surface(surfaceTexture);
            if (LiveMediaView.this.f23247k != null) {
                LiveMediaView.this.f23247k.run();
                LiveMediaView.this.f23247k = null;
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            LiveMediaView.this.f23245i = null;
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
        this.f23237a = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f23238b = new Path();
        this.f23239c = new RectF();
        this.f23246j = true;
        m38749j(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.clipPath(this.f23238b);
        super.dispatchDraw(canvas);
    }

    public SimpleDraweeView getSimpleDraweeView() {
        return this.f23242f;
    }

    public TextureView getTextureView() {
        return this.f23243g;
    }

    /* JADX INFO: renamed from: h */
    public final void m38747h(int i, int i2, int i3, int i4) {
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
        this.f23243g.setTransform(matrix);
        this.f23243g.postInvalidate();
    }

    /* JADX INFO: renamed from: i */
    public final void m38748i() {
        xdl0.m208345M0(this.f23242f, false);
        xdl0.m208384k0(this);
    }

    /* JADX INFO: renamed from: j */
    public final void m38749j(Context context) {
        View viewInflate = o7r.m163037a(context).inflate(f6c0.f95408Id, (ViewGroup) this, true);
        this.f23242f = (VDraweeView) viewInflate.findViewById(u4c0.f174171b2);
        TextureView textureView = (TextureView) viewInflate.findViewById(u4c0.f174101Wd);
        this.f23243g = textureView;
        textureView.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC8026a());
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean m38751l(IMediaPlayer iMediaPlayer, int i, int i2) {
        if (i != 3) {
            return false;
        }
        m38748i();
        c2t c2tVar = this.f23240d;
        if (c2tVar == null) {
            return true;
        }
        c2tVar.onStart();
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m38752m(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
        TextureView textureView = this.f23243g;
        if (textureView != null) {
            float f = (i * 1.0f) / i2;
            if (this.f23241e != f) {
                m38747h(textureView.getWidth(), this.f23243g.getHeight(), i, i2);
                this.f23241e = f;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean m38753n(IMediaPlayer iMediaPlayer, int i, int i2) {
        wph0 wph0Var = this.f23244h;
        if (wph0Var == null) {
            return true;
        }
        wph0Var.stop();
        this.f23244h = null;
        return true;
    }

    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void m38750k(final wph0 wph0Var, final String str) {
        if (this.f23245i == null) {
            this.f23247k = new Runnable() { // from class: l.d2t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f83428a.m38750k(wph0Var, str);
                }
            };
            return;
        }
        wph0 wph0Var2 = this.f23244h;
        if (wph0Var2 != null) {
            wph0Var2.stop();
            this.f23244h = null;
        }
        this.f23244h = wph0Var;
        try {
            wph0Var.setDataSource(str);
            this.f23244h.prepareAsync();
            this.f23244h.setOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: l.e2t
                @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnInfoListener
                public final boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
                    return this.f88941a.m38751l(iMediaPlayer, i, i2);
                }
            });
            this.f23244h.setOnVideoSizeChangedListener(new IMediaPlayer.OnVideoSizeChangedListener() { // from class: l.f2t
                @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnVideoSizeChangedListener
                public final void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
                    this.f94234a.m38752m(iMediaPlayer, i, i2, i3, i4);
                }
            });
            this.f23244h.setSurface(this.f23245i);
            if (fdv.m121007a().m121008b()) {
                setVolume(true);
            } else {
                setVolume(false);
            }
            this.f23244h.setOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: l.g2t
                @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnErrorListener
                public final boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                    return this.f100286a.m38753n(iMediaPlayer, i, i2);
                }
            });
            this.f23244h.setLooping(this.f23246j);
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            m38756q();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f23238b.reset();
        this.f23239c.set(0.0f, 0.0f, getWidth(), getHeight());
        this.f23238b.addRoundRect(this.f23239c, this.f23237a, Path.Direction.CW);
        this.f23239c.toString();
    }

    /* JADX INFO: renamed from: p */
    public void m38755p(@Nullable String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z) {
            qib0.f154691G.m102336O(this.f23242f, str, 2, 30);
        } else {
            qib0.f154691G.m102331L0(this.f23242f, str);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m38756q() {
        xdl0.m208345M0(this.f23242f, true);
        xdl0.m208384k0(this);
    }

    public void setLiveMediaListener(c2t c2tVar) {
        this.f23240d = c2tVar;
    }

    public void setVolume(boolean z) {
        if (this.f23244h != null) {
            if (z) {
                fdv.m121007a().m121009c(true);
                this.f23244h.setVolume(1.0f, 1.0f);
            } else {
                fdv.m121007a().m121009c(false);
                this.f23244h.setVolume(0.0f, 0.0f);
            }
        }
    }

    public LiveMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f23237a = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f23238b = new Path();
        this.f23239c = new RectF();
        this.f23246j = true;
        m38749j(context);
    }

    public LiveMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f23237a = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f23238b = new Path();
        this.f23239c = new RectF();
        this.f23246j = true;
        m38749j(context);
    }
}
