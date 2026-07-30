package com.p046p1.mobile.putong.live.base.view;

import android.content.Context;
import android.graphics.Outline;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.view.SimpleDraweeView;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import com.tantanapp.ijk.media.player.IMediaPlayer;
import com.tantanapp.ijk.media.player.IjkMediaMeta;
import java.io.IOException;
import p147v.VDraweeView;
import p149l.d5c0;
import p149l.hxs;
import p149l.q6c0;
import p149l.vwb;
import p149l.w9j;
import p149l.wph0;
import p149l.xdl0;
import p149l.yph0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveSquareMediaView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f44715a;

    /* JADX INFO: renamed from: b */
    public TextureView f44716b;

    /* JADX INFO: renamed from: c */
    public wph0 f44717c;

    /* JADX INFO: renamed from: d */
    public Surface f44718d;

    /* JADX INFO: renamed from: e */
    public boolean f44719e;

    /* JADX INFO: renamed from: f */
    public boolean f44720f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public Runnable f44721g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.view.LiveSquareMediaView$a */
    public class TextureViewSurfaceTextureListenerC12474a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC12474a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            LiveSquareMediaView.this.f44718d = new Surface(surfaceTexture);
            if (LiveSquareMediaView.this.f44721g != null) {
                LiveSquareMediaView.this.f44721g.run();
                LiveSquareMediaView.this.f44721g = null;
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            LiveSquareMediaView.this.f44718d = null;
            LiveSquareMediaView.this.m68774p();
            return true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.view.LiveSquareMediaView$b */
    public class C12475b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f44723a;

        public C12475b(float f) {
            this.f44723a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), this.f44723a);
        }
    }

    public LiveSquareMediaView(@NonNull Context context) {
        super(context);
        this.f44719e = true;
        this.f44720f = false;
        m68768j(context);
    }

    public SimpleDraweeView getSimpleDraweeView() {
        return this.f44715a;
    }

    public TextureView getTextureView() {
        return this.f44716b;
    }

    /* JADX INFO: renamed from: h */
    public final void m68766h(IjkMediaMeta.IjkStreamMeta ijkStreamMeta) {
        int i;
        int i2;
        if (!NullChecker.m81303a(ijkStreamMeta) || (i = ijkStreamMeta.mHeight) <= 0 || (i2 = ijkStreamMeta.mWidth) <= 0) {
            return;
        }
        float f = i / i2;
        int iM208412y0 = xdl0.m208412y0();
        int i3 = (int) (iM208412y0 * f);
        xdl0.m208325C0(this.f44716b, i3);
        xdl0.m208327D0(iM208412y0, this.f44716b);
        xdl0.m208325C0(this.f44715a, i3);
        xdl0.m208327D0(iM208412y0, this.f44715a);
    }

    /* JADX INFO: renamed from: i */
    public final void m68767i() {
        xdl0.m208345M0(this.f44715a, false);
    }

    /* JADX INFO: renamed from: j */
    public final void m68768j(Context context) {
        LayoutInflater.from(context).inflate(q6c0.f152873L, (ViewGroup) this, true);
        this.f44715a = (VDraweeView) findViewById(d5c0.f84420H);
        TextureView textureView = (TextureView) findViewById(d5c0.f84451W0);
        this.f44716b = textureView;
        textureView.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC12474a());
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean m68770l(IMediaPlayer iMediaPlayer, int i, int i2) {
        if (i != 3) {
            return false;
        }
        m68767i();
        if (!this.f44720f) {
            return true;
        }
        m68766h((IjkMediaMeta.IjkStreamMeta) vwb.m200346r(iMediaPlayer.getMediaInfo().mMeta.mStreams, new w9j() { // from class: l.d2u
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((IjkMediaMeta.IjkStreamMeta) obj).mType, "video"));
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean m68771m(IMediaPlayer iMediaPlayer, int i, int i2) {
        wph0 wph0Var = this.f44717c;
        if (wph0Var == null) {
            return true;
        }
        wph0Var.stop();
        this.f44717c = null;
        return true;
    }

    /* JADX INFO: renamed from: n */
    public void m68772n(String str) {
        m68769k(str, true);
    }

    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void m68769k(final String str, final boolean z) {
        wph0 wph0Var = this.f44717c;
        if (wph0Var != null) {
            wph0Var.stop();
            this.f44717c = null;
        }
        wph0 wph0VarM215630e = yph0.m215627d().m215630e();
        this.f44717c = wph0VarM215630e;
        if (this.f44718d == null) {
            this.f44721g = new Runnable() { // from class: l.a2u
                @Override // java.lang.Runnable
                public final void run() {
                    this.f67293a.m68769k(str, z);
                }
            };
            return;
        }
        try {
            wph0VarM215630e.setDataSource(str);
            this.f44717c.prepareAsync();
            this.f44717c.setOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: l.b2u
                @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnInfoListener
                public final boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
                    return this.f72750a.m68770l(iMediaPlayer, i, i2);
                }
            });
            this.f44717c.setSurface(this.f44718d);
            setMute(z);
            this.f44717c.setOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: l.c2u
                @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnErrorListener
                public final boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                    return this.f78392a.m68771m(iMediaPlayer, i, i2);
                }
            });
            this.f44717c.setLooping(this.f44719e);
        } catch (IOException e) {
            CrashHelper.m81296c(e);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m68774p() {
        xdl0.m208345M0(this.f44715a, true);
    }

    /* JADX INFO: renamed from: q */
    public void m68775q() {
        this.f44721g = null;
        m68774p();
        try {
            wph0 wph0Var = this.f44717c;
            if (wph0Var != null) {
                wph0Var.stop();
            }
        } catch (IllegalStateException e) {
            CrashHelper.m81296c(e);
        } finally {
            this.f44717c = null;
        }
    }

    public void setCoverUrl(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        hxs.m133406s("context_square", this.f44715a, str);
    }

    public void setMute(boolean z) {
        wph0 wph0Var = this.f44717c;
        if (wph0Var != null) {
            if (z) {
                wph0Var.setVolume(0.0f, 0.0f);
            } else {
                wph0Var.setVolume(1.0f, 1.0f);
            }
        }
    }

    public void setNeedAdjustUI(boolean z) {
        this.f44720f = z;
    }

    public void setRadius(float f) {
        C12475b c12475b = new C12475b(f);
        this.f44716b.setOutlineProvider(c12475b);
        this.f44716b.setClipToOutline(true);
        this.f44715a.setOutlineProvider(c12475b);
        this.f44715a.setClipToOutline(true);
    }

    public LiveSquareMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f44719e = true;
        this.f44720f = false;
        m68768j(context);
    }

    public LiveSquareMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f44719e = true;
        this.f44720f = false;
        m68768j(context);
    }
}
