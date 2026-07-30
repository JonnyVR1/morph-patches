package com.p046p1.mobile.putong.live.livingroom.virtual.background;

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
import p149l.g5c0;
import p149l.gkh0;
import p149l.t6c0;
import p149l.vwb;
import p149l.w9j;
import p149l.wph0;
import p149l.xdl0;
import p149l.yph0;

/* JADX INFO: loaded from: classes5.dex */
public class LiveMediaBgView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public TextureView f52173a;

    /* JADX INFO: renamed from: b */
    public wph0 f52174b;

    /* JADX INFO: renamed from: c */
    public Surface f52175c;

    /* JADX INFO: renamed from: d */
    public boolean f52176d;

    /* JADX INFO: renamed from: e */
    public boolean f52177e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Runnable f52178f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.background.LiveMediaBgView$a */
    public class TextureViewSurfaceTextureListenerC12947a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC12947a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            LiveMediaBgView.this.f52175c = new Surface(surfaceTexture);
            if (LiveMediaBgView.this.f52178f != null) {
                LiveMediaBgView.this.f52178f.run();
                LiveMediaBgView.this.f52178f = null;
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            LiveMediaBgView.this.f52175c = null;
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
        this.f52176d = true;
        this.f52177e = true;
        m76813i(context);
    }

    /* JADX INFO: renamed from: h */
    public final void m76812h(IjkMediaMeta.IjkStreamMeta ijkStreamMeta) {
        int i;
        int i2;
        if (!NullChecker.m81303a(ijkStreamMeta) || (i = ijkStreamMeta.mHeight) <= 0 || (i2 = ijkStreamMeta.mWidth) <= 0) {
            return;
        }
        float f = i / i2;
        int iM208412y0 = xdl0.m208412y0();
        int i3 = (int) (iM208412y0 * f);
        xdl0.m208325C0(this.f52173a, i3);
        xdl0.m208327D0(iM208412y0, this.f52173a);
        gkh0.m126627j("live_Media_Bg_View", "ratio:" + f + " streamWH:" + ijkStreamMeta.mWidth + ":" + ijkStreamMeta.mHeight + " viewWH:" + iM208412y0 + ":" + i3);
    }

    /* JADX INFO: renamed from: i */
    public final void m76813i(Context context) {
        LayoutInflater.from(context).inflate(t6c0.f168095L3, (ViewGroup) this, true);
        TextureView textureView = (TextureView) findViewById(g5c0.f100726J6);
        this.f52173a = textureView;
        textureView.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC12947a());
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean m76815k(IMediaPlayer iMediaPlayer, int i, int i2) {
        if (i != 3) {
            return false;
        }
        if (!this.f52177e) {
            return true;
        }
        m76812h((IjkMediaMeta.IjkStreamMeta) vwb.m200346r(iMediaPlayer.getMediaInfo().mMeta.mStreams, new w9j() { // from class: l.b2t
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((IjkMediaMeta.IjkStreamMeta) obj).mType, "video"));
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean m76816l(IMediaPlayer iMediaPlayer, int i, int i2) {
        gkh0.m126627j("live_Media_Bg_View", "player onError what: " + i + " extra: " + i2);
        wph0 wph0Var = this.f52174b;
        if (wph0Var == null) {
            return true;
        }
        wph0Var.stop();
        this.f52174b = null;
        return true;
    }

    /* JADX INFO: renamed from: m */
    public void m76817m(String str) {
        m76814j(str, true);
    }

    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void m76814j(final String str, final boolean z) {
        wph0 wph0Var = this.f52174b;
        if (wph0Var != null) {
            wph0Var.stop();
            this.f52174b = null;
        }
        wph0 wph0VarM215630e = yph0.m215627d().m215630e();
        this.f52174b = wph0VarM215630e;
        if (this.f52175c == null) {
            this.f52178f = new Runnable() { // from class: l.y1t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f195444a.m76814j(str, z);
                }
            };
            return;
        }
        try {
            wph0VarM215630e.setDataSource(str);
            this.f52174b.prepareAsync();
            this.f52174b.setOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: l.z1t
                @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnInfoListener
                public final boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
                    return this.f201094a.m76815k(iMediaPlayer, i, i2);
                }
            });
            this.f52174b.setSurface(this.f52175c);
            setMute(z);
            this.f52174b.setOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: l.a2t
                @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnErrorListener
                public final boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                    return this.f67290a.m76816l(iMediaPlayer, i, i2);
                }
            });
            this.f52174b.setLooping(this.f52176d);
        } catch (IOException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: o */
    public void m76819o() {
        this.f52178f = null;
        try {
            wph0 wph0Var = this.f52174b;
            if (wph0Var != null) {
                wph0Var.stop();
            }
        } catch (IllegalStateException e) {
            CrashHelper.m81296c(e);
        } finally {
            this.f52174b = null;
        }
    }

    public void setMute(boolean z) {
        wph0 wph0Var = this.f52174b;
        if (wph0Var != null) {
            if (z) {
                wph0Var.setVolume(0.0f, 0.0f);
            } else {
                wph0Var.setVolume(1.0f, 1.0f);
            }
        }
    }

    public LiveMediaBgView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f52176d = true;
        this.f52177e = true;
        m76813i(context);
    }

    public LiveMediaBgView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f52176d = true;
        this.f52177e = true;
        m76813i(context);
    }
}
