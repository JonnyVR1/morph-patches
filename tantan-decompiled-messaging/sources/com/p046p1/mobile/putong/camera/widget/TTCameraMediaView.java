package com.p046p1.mobile.putong.camera.widget;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
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
import com.tantanapp.ijk.media.player.IMediaPlayer;
import java.io.IOException;
import java.util.HashMap;
import p147v.VDraweeView;
import p149l.d6c0;
import p149l.ipq;
import p149l.mep0;
import p149l.qib0;
import p149l.r4c0;
import p149l.wph0;
import p149l.xdl0;
import p149l.yph0;

/* JADX INFO: loaded from: classes9.dex */
public class TTCameraMediaView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f17284a;

    /* JADX INFO: renamed from: b */
    public TextureView f17285b;

    /* JADX INFO: renamed from: c */
    public wph0 f17286c;

    /* JADX INFO: renamed from: d */
    public Surface f17287d;

    /* JADX INFO: renamed from: e */
    public boolean f17288e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Runnable f17289f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.camera.widget.TTCameraMediaView$a */
    public class TextureViewSurfaceTextureListenerC4711a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC4711a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            TTCameraMediaView.this.f17287d = new Surface(surfaceTexture);
            if (TTCameraMediaView.this.f17289f != null) {
                TTCameraMediaView.this.f17289f.run();
                TTCameraMediaView.this.f17289f = null;
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            TTCameraMediaView.this.f17287d = null;
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    public TTCameraMediaView(@NonNull Context context) {
        super(context);
        this.f17288e = true;
        m29871h(context);
    }

    /* JADX INFO: renamed from: g */
    public final void m29870g() {
        xdl0.m208345M0(this.f17284a, false);
    }

    /* JADX INFO: renamed from: h */
    public final void m29871h(Context context) {
        LayoutInflater.from(context).inflate(d6c0.f84615d, (ViewGroup) this, true);
        this.f17284a = (VDraweeView) findViewById(r4c0.f157655j);
        TextureView textureView = (TextureView) findViewById(r4c0.f157663r);
        this.f17285b = textureView;
        textureView.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC4711a());
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean m29873j(IMediaPlayer iMediaPlayer, int i, int i2) {
        if (i != 3) {
            return false;
        }
        m29870g();
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean m29874k(IMediaPlayer iMediaPlayer, int i, int i2) {
        if (this.f17286c == null) {
            return true;
        }
        m29876m();
        return true;
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m29872i(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        wph0 wph0Var = this.f17286c;
        if (wph0Var == null || !wph0Var.isPlaying()) {
            m29876m();
            if (this.f17287d == null) {
                this.f17289f = new Runnable() { // from class: l.rlh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f159963a.m29872i(str);
                    }
                };
                return;
            }
            this.f17286c = yph0.m215627d().m215630e();
            HashMap map = new HashMap();
            map.put("Authorization", ipq.m137568d(str, ""));
            try {
                this.f17286c.setDataSource(getContext().getApplicationContext(), Uri.parse(str), map);
                this.f17286c.prepareAsync();
                this.f17286c.setOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: l.slh0
                    @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnInfoListener
                    public final boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
                        return this.f165230a.m29873j(iMediaPlayer, i, i2);
                    }
                });
                this.f17286c.setSurface(this.f17287d);
                this.f17286c.setOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: l.tlh0
                    @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnErrorListener
                    public final boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                        return this.f171024a.m29874k(iMediaPlayer, i, i2);
                    }
                });
                this.f17286c.setLooping(this.f17288e);
            } catch (IOException e) {
                CrashHelper.m81296c(e);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m29876m() {
        this.f17289f = null;
        m29877n();
        wph0 wph0Var = this.f17286c;
        if (wph0Var != null) {
            wph0Var.stop();
            this.f17286c = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m29877n() {
        xdl0.m208345M0(this.f17284a, true);
    }

    /* JADX INFO: renamed from: o */
    public void m29878o() {
        m29876m();
    }

    public void setCoverUrl(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        qib0.f154691G.m102331L0(this.f17284a, str);
    }

    public void setRadius(int i) {
        mep0.m154302d1(this.f17284a, i);
        mep0.m154302d1(this.f17285b, i);
    }

    public TTCameraMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f17288e = true;
        m29871h(context);
    }

    public TTCameraMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f17288e = true;
        m29871h(context);
    }
}
