package com.p051p1.mobile.putong.camera.widget;

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
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.dyh0;
import p153l.fyh0;
import p153l.iec0;
import p153l.irq;
import p153l.qnp0;
import p153l.uqb0;
import p153l.xcc0;

/* JADX INFO: loaded from: classes9.dex */
public class TTCameraMediaView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f18003a;

    /* JADX INFO: renamed from: b */
    public TextureView f18004b;

    /* JADX INFO: renamed from: c */
    public dyh0 f18005c;

    /* JADX INFO: renamed from: d */
    public Surface f18006d;

    /* JADX INFO: renamed from: e */
    public boolean f18007e;

    /* JADX INFO: renamed from: f */
    @Nullable
    public Runnable f18008f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.camera.widget.TTCameraMediaView$a */
    public class TextureViewSurfaceTextureListenerC4862a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC4862a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            TTCameraMediaView.this.f18006d = new Surface(surfaceTexture);
            if (TTCameraMediaView.this.f18008f != null) {
                TTCameraMediaView.this.f18008f.run();
                TTCameraMediaView.this.f18008f = null;
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            TTCameraMediaView.this.f18006d = null;
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
        this.f18007e = true;
        m30869h(context);
    }

    /* JADX INFO: renamed from: g */
    public final void m30868g() {
        bnl0.m105525M0(this.f18003a, false);
    }

    /* JADX INFO: renamed from: h */
    public final void m30869h(Context context) {
        LayoutInflater.from(context).inflate(iec0.f114571d, (ViewGroup) this, true);
        this.f18003a = (VDraweeView) findViewById(xcc0.f193297j);
        TextureView textureView = (TextureView) findViewById(xcc0.f193305r);
        this.f18004b = textureView;
        textureView.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC4862a());
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ boolean m30871j(IMediaPlayer iMediaPlayer, int i, int i2) {
        if (i != 3) {
            return false;
        }
        m30868g();
        return true;
    }

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ boolean m30872k(IMediaPlayer iMediaPlayer, int i, int i2) {
        if (this.f18005c == null) {
            return true;
        }
        m30874m();
        return true;
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m30870i(final String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        dyh0 dyh0Var = this.f18005c;
        if (dyh0Var == null || !dyh0Var.isPlaying()) {
            m30874m();
            if (this.f18006d == null) {
                this.f18008f = new Runnable() { // from class: l.yth0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f201509a.m30870i(str);
                    }
                };
                return;
            }
            this.f18005c = fyh0.m128089d().m128092e();
            HashMap map = new HashMap();
            map.put("Authorization", irq.m141843d(str, ""));
            try {
                this.f18005c.setDataSource(getContext().getApplicationContext(), Uri.parse(str), map);
                this.f18005c.prepareAsync();
                this.f18005c.setOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: l.zth0
                    @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnInfoListener
                    public final boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
                        return this.f206009a.m30871j(iMediaPlayer, i, i2);
                    }
                });
                this.f18005c.setSurface(this.f18006d);
                this.f18005c.setOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: l.auh0
                    @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnErrorListener
                    public final boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                        return this.f73518a.m30872k(iMediaPlayer, i, i2);
                    }
                });
                this.f18005c.setLooping(this.f18007e);
            } catch (IOException e) {
                CrashHelper.m82479c(e);
            }
        }
    }

    /* JADX INFO: renamed from: m */
    public final void m30874m() {
        this.f18008f = null;
        m30875n();
        dyh0 dyh0Var = this.f18005c;
        if (dyh0Var != null) {
            dyh0Var.stop();
            this.f18005c = null;
        }
    }

    /* JADX INFO: renamed from: n */
    public void m30875n() {
        bnl0.m105525M0(this.f18003a, true);
    }

    /* JADX INFO: renamed from: o */
    public void m30876o() {
        m30874m();
    }

    public void setCoverUrl(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        uqb0.f180374G.m127115L0(this.f18003a, str);
    }

    public void setRadius(int i) {
        qnp0.m177261d1(this.f18003a, i);
        qnp0.m177261d1(this.f18004b, i);
    }

    public TTCameraMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f18007e = true;
        m30869h(context);
    }

    public TTCameraMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f18007e = true;
        m30869h(context);
    }
}
