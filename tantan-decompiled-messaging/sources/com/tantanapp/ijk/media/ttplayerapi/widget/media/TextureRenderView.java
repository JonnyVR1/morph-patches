package com.tantanapp.ijk.media.ttplayerapi.widget.media;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.view.TextureView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.tantanapp.ijk.media.player.ISurfaceTextureHost;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p149l.efx;
import p149l.y1m;
import p149l.z1m;

/* JADX INFO: loaded from: classes13.dex */
@TargetApi(14)
public class TextureRenderView extends TextureView {

    /* JADX INFO: renamed from: a */
    public efx f56123a;

    /* JADX INFO: renamed from: b */
    public TextureViewSurfaceTextureListenerC13659b f56124b;

    /* JADX INFO: renamed from: com.tantanapp.ijk.media.ttplayerapi.widget.media.TextureRenderView$a */
    public static final class C13658a implements z1m {

        /* JADX INFO: renamed from: a */
        public TextureRenderView f56125a;

        /* JADX INFO: renamed from: b */
        public SurfaceTexture f56126b;

        /* JADX INFO: renamed from: c */
        public ISurfaceTextureHost f56127c;

        public C13658a(@NonNull TextureRenderView textureRenderView, @Nullable SurfaceTexture surfaceTexture, @NonNull ISurfaceTextureHost iSurfaceTextureHost) {
            this.f56125a = textureRenderView;
            this.f56126b = surfaceTexture;
            this.f56127c = iSurfaceTextureHost;
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.ijk.media.ttplayerapi.widget.media.TextureRenderView$b */
    public static final class TextureViewSurfaceTextureListenerC13659b implements TextureView.SurfaceTextureListener, ISurfaceTextureHost {

        /* JADX INFO: renamed from: a */
        public SurfaceTexture f56128a;

        /* JADX INFO: renamed from: b */
        public boolean f56129b;

        /* JADX INFO: renamed from: c */
        public int f56130c;

        /* JADX INFO: renamed from: d */
        public int f56131d;

        /* JADX INFO: renamed from: h */
        public WeakReference<TextureRenderView> f56135h;

        /* JADX INFO: renamed from: e */
        public boolean f56132e = true;

        /* JADX INFO: renamed from: f */
        public boolean f56133f = false;

        /* JADX INFO: renamed from: g */
        public boolean f56134g = false;

        /* JADX INFO: renamed from: i */
        public Map<y1m, Object> f56136i = new ConcurrentHashMap();

        public TextureViewSurfaceTextureListenerC13659b(@NonNull TextureRenderView textureRenderView) {
            this.f56135h = new WeakReference<>(textureRenderView);
        }

        /* JADX INFO: renamed from: b */
        public void m81354b() {
            this.f56134g = true;
        }

        /* JADX INFO: renamed from: c */
        public void m81355c(boolean z) {
            this.f56132e = z;
        }

        /* JADX INFO: renamed from: d */
        public void m81356d() {
            this.f56133f = true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            this.f56128a = surfaceTexture;
            this.f56129b = false;
            this.f56130c = 0;
            this.f56131d = 0;
            C13658a c13658a = new C13658a(this.f56135h.get(), surfaceTexture, this);
            Iterator<y1m> it = this.f56136i.keySet().iterator();
            while (it.hasNext()) {
                it.next().m212240a(c13658a, 0, 0);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.f56128a = surfaceTexture;
            this.f56129b = false;
            this.f56130c = 0;
            this.f56131d = 0;
            C13658a c13658a = new C13658a(this.f56135h.get(), surfaceTexture, this);
            Iterator<y1m> it = this.f56136i.keySet().iterator();
            while (it.hasNext()) {
                it.next().m212242c(c13658a);
            }
            return this.f56132e;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            this.f56128a = surfaceTexture;
            this.f56129b = true;
            this.f56130c = i;
            this.f56131d = i2;
            C13658a c13658a = new C13658a(this.f56135h.get(), surfaceTexture, this);
            Iterator<y1m> it = this.f56136i.keySet().iterator();
            while (it.hasNext()) {
                it.next().m212241b(c13658a, 0, i, i2);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        @Override // com.tantanapp.ijk.media.player.ISurfaceTextureHost
        public void releaseSurfaceTexture(SurfaceTexture surfaceTexture) {
            if (surfaceTexture == null) {
                return;
            }
            if (this.f56134g) {
                if (surfaceTexture != this.f56128a) {
                    surfaceTexture.release();
                    return;
                } else {
                    if (this.f56132e) {
                        return;
                    }
                    surfaceTexture.release();
                    return;
                }
            }
            boolean z = this.f56133f;
            SurfaceTexture surfaceTexture2 = this.f56128a;
            if (z) {
                if (surfaceTexture != surfaceTexture2) {
                    surfaceTexture.release();
                    return;
                } else {
                    if (this.f56132e) {
                        return;
                    }
                    m81355c(true);
                    return;
                }
            }
            if (surfaceTexture != surfaceTexture2) {
                surfaceTexture.release();
            } else {
                if (this.f56132e) {
                    return;
                }
                m81355c(true);
            }
        }
    }

    public TextureRenderView(Context context) {
        super(context);
        m81352a(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m81352a(Context context) {
        this.f56123a = new efx(this);
        TextureViewSurfaceTextureListenerC13659b textureViewSurfaceTextureListenerC13659b = new TextureViewSurfaceTextureListenerC13659b(this);
        this.f56124b = textureViewSurfaceTextureListenerC13659b;
        setSurfaceTextureListener(textureViewSurfaceTextureListenerC13659b);
    }

    public z1m getSurfaceHolder() {
        return new C13658a(this, this.f56124b.f56128a, this.f56124b);
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.f56124b.m81356d();
        super.onDetachedFromWindow();
        this.f56124b.m81354b();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(TextureRenderView.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(TextureRenderView.class.getName());
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        this.f56123a.m116097a(i, i2);
        setMeasuredDimension(this.f56123a.m116099c(), this.f56123a.m116098b());
    }

    public void setAspectRatio(int i) {
        this.f56123a.m116100d(i);
        requestLayout();
    }

    public void setVideoRotation(int i) {
        this.f56123a.m116101e(i);
        setRotation(i);
    }

    public TextureRenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m81352a(context);
    }

    public TextureRenderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m81352a(context);
    }
}
