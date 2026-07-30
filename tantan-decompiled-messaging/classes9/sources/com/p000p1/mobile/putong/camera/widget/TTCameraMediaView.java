package com.p000p1.mobile.putong.camera.widget;

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
import com.p000p1.mobile.putong.api.api.Network;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.ijk.media.player.IMediaPlayer;
import java.io.IOException;
import java.util.HashMap;
import l.ipq;
import l.mep0;
import l.wph0;
import l.xdl0;
import l.yph0;
import p006l.d6c0;
import p006l.qib0;
import p006l.r4c0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TTCameraMediaView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f1273a;

    /* JADX INFO: renamed from: b */
    public TextureView f1274b;

    /* JADX INFO: renamed from: c */
    public wph0 f1275c;

    /* JADX INFO: renamed from: d */
    public Surface f1276d;

    /* JADX INFO: renamed from: e */
    public boolean f1277e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Runnable f1278f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.camera.widget.TTCameraMediaView$a */
    public class TextureViewSurfaceTextureListenerC0137a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC0137a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            TTCameraMediaView.this.f1276d = new Surface(surfaceTexture);
            if (TTCameraMediaView.this.f1278f != null) {
                TTCameraMediaView.this.f1278f.run();
                TTCameraMediaView.this.f1278f = null;
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            TTCameraMediaView.this.f1276d = null;
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
        this.f1277e = true;
        m1783h(context);
    }

    /* JADX INFO: renamed from: g */
    public final void m1782g() {
        xdl0.M0(this.f1273a, false);
    }

    /* JADX INFO: renamed from: h */
    public final void m1783h(Context context) {
        LayoutInflater.from(context).inflate(d6c0.f10030d, (ViewGroup) this, true);
        this.f1273a = findViewById(r4c0.f20300j);
        TextureView textureView = (TextureView) findViewById(r4c0.f20308r);
        this.f1274b = textureView;
        textureView.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC0137a());
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean m1785j(IMediaPlayer iMediaPlayer, int i, int i2) {
        if (i != 3) {
            return false;
        }
        m1782g();
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean m1786k(IMediaPlayer iMediaPlayer, int i, int i2) {
        if (this.f1275c == null) {
            return true;
        }
        m1788m();
        return true;
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m1784i(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        wph0 wph0Var = this.f1275c;
        if (wph0Var == null || !wph0Var.isPlaying()) {
            m1788m();
            if (this.f1276d == null) {
                this.f1278f = new Runnable() { // from class: l.rlh0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f20620a.m1784i(str);
                    }
                };
                return;
            }
            this.f1275c = yph0.d().e();
            HashMap map = new HashMap();
            map.put(Network.AUTH, ipq.d(str, ""));
            try {
                this.f1275c.setDataSource(getContext().getApplicationContext(), Uri.parse(str), map);
                this.f1275c.prepareAsync();
                this.f1275c.setOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: l.slh0
                    public final boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
                        return this.f21422a.m1785j(iMediaPlayer, i, i2);
                    }
                });
                this.f1275c.setSurface(this.f1276d);
                this.f1275c.setOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: l.tlh0
                    public final boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                        return this.f22178a.m1786k(iMediaPlayer, i, i2);
                    }
                });
                this.f1275c.setLooping(this.f1277e);
            } catch (IOException e) {
                CrashHelper.c(e);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m1788m() {
        this.f1278f = null;
        m1789n();
        wph0 wph0Var = this.f1275c;
        if (wph0Var != null) {
            wph0Var.stop();
            this.f1275c = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m1789n() {
        xdl0.M0(this.f1273a, true);
    }

    /* JADX INFO: renamed from: o */
    public void m1790o() {
        m1788m();
    }

    public void setCoverUrl(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        qib0.f19782G.m12744L0(this.f1273a, str);
    }

    public void setRadius(int i) {
        mep0.d1(this.f1273a, i);
        mep0.d1(this.f1274b, i);
    }

    public TTCameraMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1277e = true;
        m1783h(context);
    }

    public TTCameraMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1277e = true;
        m1783h(context);
    }
}
