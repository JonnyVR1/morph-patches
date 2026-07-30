package com.p051p1.mobile.putong.live.livingroom.virtual.background;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.ijk.media.player.IMediaPlayer;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import java.io.IOException;
import p153l.bnl0;
import p153l.dyh0;
import p153l.fyh0;
import p153l.jyb;
import p153l.mdc0;
import p153l.nsh0;
import p153l.qcj;
import p153l.yec0;

/* JADX INFO: loaded from: classes5.dex */
public class LiveMediaBgView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextureView f53021a;

    /* JADX INFO: renamed from: b */
    public dyh0 f53022b;

    /* JADX INFO: renamed from: c */
    public Surface f53023c;

    /* JADX INFO: renamed from: d */
    public boolean f53024d;

    /* JADX INFO: renamed from: e */
    public boolean f53025e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Runnable f53026f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.background.LiveMediaBgView$a */
    public class TextureViewSurfaceTextureListenerC13110a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC13110a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            LiveMediaBgView.this.f53023c = new Surface(surfaceTexture);
            if (LiveMediaBgView.this.f53026f != null) {
                LiveMediaBgView.this.f53026f.run();
                LiveMediaBgView.this.f53026f = null;
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            LiveMediaBgView.this.f53023c = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public LiveMediaBgView(@NonNull Context context) {
        super(context);
        this.f53024d = true;
        this.f53025e = true;
        m77996i(context);
    }

    /* JADX INFO: renamed from: h */
    public final void m77995h(IjkMediaMeta.IjkStreamMeta ijkStreamMeta) {
        int i;
        int i2;
        if (!NullChecker.m82486a(ijkStreamMeta) || (i = ijkStreamMeta.mHeight) <= 0 || (i2 = ijkStreamMeta.mWidth) <= 0) {
            return;
        }
        float f = i / i2;
        int iM105592y0 = bnl0.m105592y0();
        int i3 = (int) (iM105592y0 * f);
        bnl0.m105505C0(this.f53021a, i3);
        bnl0.m105507D0(iM105592y0, this.f53021a);
        nsh0.m164608j("live_Media_Bg_View", "ratio:" + f + " streamWH:" + ijkStreamMeta.mWidth + ":" + ijkStreamMeta.mHeight + " viewWH:" + iM105592y0 + ":" + i3);
    }

    /* JADX INFO: renamed from: i */
    public final void m77996i(Context context) {
        LayoutInflater.from(context).inflate(yec0.f198827L3, (ViewGroup) this, true);
        TextureView textureView = (TextureView) findViewById(mdc0.f135971J6);
        this.f53021a = textureView;
        textureView.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC13110a());
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean m77998k(IMediaPlayer iMediaPlayer, int i, int i2) {
        if (i != 3) {
            return false;
        }
        if (!this.f53025e) {
            return true;
        }
        m77995h((IjkMediaMeta.IjkStreamMeta) jyb.m147529r(iMediaPlayer.getMediaInfo().mMeta.mStreams, new qcj() { // from class: l.c4t
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((IjkMediaMeta.IjkStreamMeta) obj).mType, "video"));
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean m77999l(IMediaPlayer iMediaPlayer, int i, int i2) {
        nsh0.m164608j("live_Media_Bg_View", "player onError what: " + i + " extra: " + i2);
        dyh0 dyh0Var = this.f53022b;
        if (dyh0Var == null) {
            return true;
        }
        dyh0Var.stop();
        this.f53022b = null;
        return true;
    }

    /* JADX INFO: renamed from: m */
    public void m78000m(String str) {
        m77997j(str, true);
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void m77997j(final String str, final boolean z) {
        dyh0 dyh0Var = this.f53022b;
        if (dyh0Var != null) {
            dyh0Var.stop();
            this.f53022b = null;
        }
        dyh0 dyh0VarM128092e = fyh0.m128089d().m128092e();
        this.f53022b = dyh0VarM128092e;
        if (this.f53023c == null) {
            this.f53026f = new Runnable() { // from class: l.z3t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f202859a.m77997j(str, z);
                }
            };
            return;
        }
        try {
            dyh0VarM128092e.setDataSource(str);
            this.f53022b.prepareAsync();
            this.f53022b.setOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: l.a4t
                @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnInfoListener
                public final boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
                    return this.f68444a.m77998k(iMediaPlayer, i, i2);
                }
            });
            this.f53022b.setSurface(this.f53023c);
            setMute(z);
            this.f53022b.setOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: l.b4t
                @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnErrorListener
                public final boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                    return this.f74986a.m77999l(iMediaPlayer, i, i2);
                }
            });
            this.f53022b.setLooping(this.f53024d);
        } catch (IOException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m78002o() {
        this.f53026f = null;
        try {
            dyh0 dyh0Var = this.f53022b;
            if (dyh0Var != null) {
                dyh0Var.stop();
            }
        } catch (IllegalStateException e) {
            CrashHelper.m82479c(e);
        } finally {
            this.f53022b = null;
        }
    }

    public void setMute(boolean z) {
        dyh0 dyh0Var = this.f53022b;
        if (dyh0Var != null) {
            if (z) {
                dyh0Var.setVolume(0.0f, 0.0f);
            } else {
                dyh0Var.setVolume(1.0f, 1.0f);
            }
        }
    }

    public LiveMediaBgView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53024d = true;
        this.f53025e = true;
        m77996i(context);
    }

    public LiveMediaBgView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53024d = true;
        this.f53025e = true;
        m77996i(context);
    }
}
