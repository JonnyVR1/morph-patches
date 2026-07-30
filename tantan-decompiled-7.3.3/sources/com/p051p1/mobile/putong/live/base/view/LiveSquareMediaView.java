package com.p051p1.mobile.putong.live.base.view;

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
import p151v.VDraweeView;
import p153l.bnl0;
import p153l.dyh0;
import p153l.fyh0;
import p153l.izs;
import p153l.jdc0;
import p153l.jyb;
import p153l.qcj;
import p153l.vec0;

/* JADX INFO: loaded from: classes13.dex */
public class LiveSquareMediaView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public VDraweeView f45563a;

    /* JADX INFO: renamed from: b */
    public TextureView f45564b;

    /* JADX INFO: renamed from: c */
    public dyh0 f45565c;

    /* JADX INFO: renamed from: d */
    public Surface f45566d;

    /* JADX INFO: renamed from: e */
    public boolean f45567e;

    /* JADX INFO: renamed from: f */
    public boolean f45568f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public Runnable f45569g;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.base.view.LiveSquareMediaView$a */
    public class TextureViewSurfaceTextureListenerC12637a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC12637a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            LiveSquareMediaView.this.f45566d = new Surface(surfaceTexture);
            if (LiveSquareMediaView.this.f45569g != null) {
                LiveSquareMediaView.this.f45569g.run();
                LiveSquareMediaView.this.f45569g = null;
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            LiveSquareMediaView.this.f45566d = null;
            LiveSquareMediaView.this.m69957p();
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
    public class C12638b extends ViewOutlineProvider {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ float f45571a;

        public C12638b(float f) {
            this.f45571a = f;
        }

        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRoundRect(new Rect(0, 0, view.getRight() - view.getLeft(), view.getBottom() - view.getTop()), this.f45571a);
        }
    }

    public LiveSquareMediaView(@NonNull Context context) {
        super(context);
        this.f45567e = true;
        this.f45568f = false;
        m69951j(context);
    }

    public SimpleDraweeView getSimpleDraweeView() {
        return this.f45563a;
    }

    public TextureView getTextureView() {
        return this.f45564b;
    }

    /* JADX INFO: renamed from: h */
    public final void m69949h(IjkMediaMeta.IjkStreamMeta ijkStreamMeta) {
        int i;
        int i2;
        if (!NullChecker.m82486a(ijkStreamMeta) || (i = ijkStreamMeta.mHeight) <= 0 || (i2 = ijkStreamMeta.mWidth) <= 0) {
            return;
        }
        float f = i / i2;
        int iM105592y0 = bnl0.m105592y0();
        int i3 = (int) (iM105592y0 * f);
        bnl0.m105505C0(this.f45564b, i3);
        bnl0.m105507D0(iM105592y0, this.f45564b);
        bnl0.m105505C0(this.f45563a, i3);
        bnl0.m105507D0(iM105592y0, this.f45563a);
    }

    /* JADX INFO: renamed from: i */
    public final void m69950i() {
        bnl0.m105525M0(this.f45563a, false);
    }

    /* JADX INFO: renamed from: j */
    public final void m69951j(Context context) {
        LayoutInflater.from(context).inflate(vec0.f183730L, (ViewGroup) this, true);
        this.f45563a = (VDraweeView) findViewById(jdc0.f120138H);
        TextureView textureView = (TextureView) findViewById(jdc0.f120169W0);
        this.f45564b = textureView;
        textureView.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC12637a());
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean m69953l(IMediaPlayer iMediaPlayer, int i, int i2) {
        if (i != 3) {
            return false;
        }
        m69950i();
        if (!this.f45568f) {
            return true;
        }
        m69949h((IjkMediaMeta.IjkStreamMeta) jyb.m147529r(iMediaPlayer.getMediaInfo().mMeta.mStreams, new qcj() { // from class: l.e4u
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((IjkMediaMeta.IjkStreamMeta) obj).mType, "video"));
            }
        }));
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ boolean m69954m(IMediaPlayer iMediaPlayer, int i, int i2) {
        dyh0 dyh0Var = this.f45565c;
        if (dyh0Var == null) {
            return true;
        }
        dyh0Var.stop();
        this.f45565c = null;
        return true;
    }

    /* JADX INFO: renamed from: n */
    public void m69955n(String str) {
        m69952k(str, true);
    }

    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void m69952k(final String str, final boolean z) {
        dyh0 dyh0Var = this.f45565c;
        if (dyh0Var != null) {
            dyh0Var.stop();
            this.f45565c = null;
        }
        dyh0 dyh0VarM128092e = fyh0.m128089d().m128092e();
        this.f45565c = dyh0VarM128092e;
        if (this.f45566d == null) {
            this.f45569g = new Runnable() { // from class: l.b4u
                @Override // java.lang.Runnable
                public final void run() {
                    this.f74987a.m69952k(str, z);
                }
            };
            return;
        }
        try {
            dyh0VarM128092e.setDataSource(str);
            this.f45565c.prepareAsync();
            this.f45565c.setOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: l.c4u
                @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnInfoListener
                public final boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
                    return this.f79738a.m69953l(iMediaPlayer, i, i2);
                }
            });
            this.f45565c.setSurface(this.f45566d);
            setMute(z);
            this.f45565c.setOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: l.d4u
                @Override // com.tantanapp.ijk.media.player.IMediaPlayer.OnErrorListener
                public final boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                    return this.f85080a.m69954m(iMediaPlayer, i, i2);
                }
            });
            this.f45565c.setLooping(this.f45567e);
        } catch (IOException e) {
            CrashHelper.m82479c(e);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m69957p() {
        bnl0.m105525M0(this.f45563a, true);
    }

    /* JADX INFO: renamed from: q */
    public void m69958q() {
        this.f45569g = null;
        m69957p();
        try {
            dyh0 dyh0Var = this.f45565c;
            if (dyh0Var != null) {
                dyh0Var.stop();
            }
        } catch (IllegalStateException e) {
            CrashHelper.m82479c(e);
        } finally {
            this.f45565c = null;
        }
    }

    public void setCoverUrl(@Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        izs.m142868s("context_square", this.f45563a, str);
    }

    public void setMute(boolean z) {
        dyh0 dyh0Var = this.f45565c;
        if (dyh0Var != null) {
            if (z) {
                dyh0Var.setVolume(0.0f, 0.0f);
            } else {
                dyh0Var.setVolume(1.0f, 1.0f);
            }
        }
    }

    public void setNeedAdjustUI(boolean z) {
        this.f45568f = z;
    }

    public void setRadius(float f) {
        C12638b c12638b = new C12638b(f);
        this.f45564b.setOutlineProvider(c12638b);
        this.f45564b.setClipToOutline(true);
        this.f45563a.setOutlineProvider(c12638b);
        this.f45563a.setClipToOutline(true);
    }

    public LiveSquareMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f45567e = true;
        this.f45568f = false;
        m69951j(context);
    }

    public LiveSquareMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f45567e = true;
        this.f45568f = false;
        m69951j(context);
    }
}
