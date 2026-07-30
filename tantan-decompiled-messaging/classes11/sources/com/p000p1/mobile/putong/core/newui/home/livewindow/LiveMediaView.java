package com.p000p1.mobile.putong.core.newui.home.livewindow;

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
import l.f6c0;
import l.qib0;
import l.u4c0;
import l.wph0;
import l.xdl0;
import p009l.c2t;
import p009l.fdv;
import p009l.o7r;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class LiveMediaView extends FrameLayout {

    /* JADX INFO: renamed from: a */
    public float[] f2015a;

    /* JADX INFO: renamed from: b */
    public Path f2016b;

    /* JADX INFO: renamed from: c */
    public RectF f2017c;

    /* JADX INFO: renamed from: d */
    public c2t f2018d;

    /* JADX INFO: renamed from: e */
    public float f2019e;

    /* JADX INFO: renamed from: f */
    public VDraweeView f2020f;

    /* JADX INFO: renamed from: g */
    public TextureView f2021g;

    /* JADX INFO: renamed from: h */
    public wph0 f2022h;

    /* JADX INFO: renamed from: i */
    public Surface f2023i;

    /* JADX INFO: renamed from: j */
    public boolean f2024j;

    /* JADX INFO: renamed from: k */
    @Nullable
    public Runnable f2025k;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.home.livewindow.LiveMediaView$a */
    public class TextureViewSurfaceTextureListenerC0190a implements TextureView.SurfaceTextureListener {
        public TextureViewSurfaceTextureListenerC0190a() {
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            LiveMediaView.this.f2023i = new Surface(surfaceTexture);
            if (LiveMediaView.this.f2025k != null) {
                LiveMediaView.this.f2025k.run();
                LiveMediaView.this.f2025k = null;
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            LiveMediaView.this.f2023i = null;
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
        this.f2015a = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f2016b = new Path();
        this.f2017c = new RectF();
        this.f2024j = true;
        m2738j(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        canvas.clipPath(this.f2016b);
        super.dispatchDraw(canvas);
    }

    public SimpleDraweeView getSimpleDraweeView() {
        return this.f2020f;
    }

    public TextureView getTextureView() {
        return this.f2021g;
    }

    /* JADX INFO: renamed from: h */
    public final void m2736h(int i, int i2, int i3, int i4) {
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
        this.f2021g.setTransform(matrix);
        this.f2021g.postInvalidate();
    }

    /* JADX INFO: renamed from: i */
    public final void m2737i() {
        xdl0.M0(this.f2020f, false);
        xdl0.k0(this);
    }

    /* JADX INFO: renamed from: j */
    public final void m2738j(Context context) {
        View viewInflate = o7r.m19649a(context).inflate(f6c0.Id, (ViewGroup) this, true);
        this.f2020f = viewInflate.findViewById(u4c0.b2);
        TextureView textureView = (TextureView) viewInflate.findViewById(u4c0.Wd);
        this.f2021g = textureView;
        textureView.setSurfaceTextureListener(new TextureViewSurfaceTextureListenerC0190a());
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ boolean m2740l(IMediaPlayer iMediaPlayer, int i, int i2) {
        if (i != 3) {
            return false;
        }
        m2737i();
        c2t c2tVar = this.f2018d;
        if (c2tVar == null) {
            return true;
        }
        c2tVar.onStart();
        return true;
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m2741m(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
        TextureView textureView = this.f2021g;
        if (textureView != null) {
            float f = (i * 1.0f) / i2;
            if (this.f2019e != f) {
                m2736h(textureView.getWidth(), this.f2021g.getHeight(), i, i2);
                this.f2019e = f;
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ boolean m2742n(IMediaPlayer iMediaPlayer, int i, int i2) {
        wph0 wph0Var = this.f2022h;
        if (wph0Var == null) {
            return true;
        }
        wph0Var.stop();
        this.f2022h = null;
        return true;
    }

    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void m2739k(final wph0 wph0Var, final String str) {
        if (this.f2023i == null) {
            this.f2025k = new Runnable() { // from class: l.d2t
                @Override // java.lang.Runnable
                public final void run() {
                    this.f10902a.m2739k(wph0Var, str);
                }
            };
            return;
        }
        wph0 wph0Var2 = this.f2022h;
        if (wph0Var2 != null) {
            wph0Var2.stop();
            this.f2022h = null;
        }
        this.f2022h = wph0Var;
        try {
            wph0Var.setDataSource(str);
            this.f2022h.prepareAsync();
            this.f2022h.setOnInfoListener(new IMediaPlayer.OnInfoListener() { // from class: l.e2t
                public final boolean onInfo(IMediaPlayer iMediaPlayer, int i, int i2) {
                    return this.f12168a.m2740l(iMediaPlayer, i, i2);
                }
            });
            this.f2022h.setOnVideoSizeChangedListener(new IMediaPlayer.OnVideoSizeChangedListener() { // from class: l.f2t
                public final void onVideoSizeChanged(IMediaPlayer iMediaPlayer, int i, int i2, int i3, int i4) {
                    this.f12760a.m2741m(iMediaPlayer, i, i2, i3, i4);
                }
            });
            this.f2022h.setSurface(this.f2023i);
            if (fdv.m14408a().m14409b()) {
                setVolume(true);
            } else {
                setVolume(false);
            }
            this.f2022h.setOnErrorListener(new IMediaPlayer.OnErrorListener() { // from class: l.g2t
                public final boolean onError(IMediaPlayer iMediaPlayer, int i, int i2) {
                    return this.f13277a.m2742n(iMediaPlayer, i, i2);
                }
            });
            this.f2022h.setLooping(this.f2024j);
        } catch (Exception e) {
            CrashHelper.c(e);
            m2745q();
        }
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.f2016b.reset();
        this.f2017c.set(0.0f, 0.0f, getWidth(), getHeight());
        this.f2016b.addRoundRect(this.f2017c, this.f2015a, Path.Direction.CW);
        this.f2017c.toString();
    }

    /* JADX INFO: renamed from: p */
    public void m2744p(@Nullable String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (z) {
            qib0.G.O(this.f2020f, str, 2, 30);
        } else {
            qib0.G.L0(this.f2020f, str);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m2745q() {
        xdl0.M0(this.f2020f, true);
        xdl0.k0(this);
    }

    public void setLiveMediaListener(c2t c2tVar) {
        this.f2018d = c2tVar;
    }

    public void setVolume(boolean z) {
        if (this.f2022h != null) {
            if (z) {
                fdv.m14408a().m14410c(true);
                this.f2022h.setVolume(1.0f, 1.0f);
            } else {
                fdv.m14408a().m14410c(false);
                this.f2022h.setVolume(0.0f, 0.0f);
            }
        }
    }

    public LiveMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f2015a = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f2016b = new Path();
        this.f2017c = new RectF();
        this.f2024j = true;
        m2738j(context);
    }

    public LiveMediaView(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f2015a = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.f2016b = new Path();
        this.f2017c = new RectF();
        this.f2024j = true;
        m2738j(context);
    }
}
