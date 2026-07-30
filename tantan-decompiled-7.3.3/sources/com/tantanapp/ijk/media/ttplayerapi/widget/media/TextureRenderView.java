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
import p153l.cox;
import p153l.r4m;
import p153l.s4m;

/* JADX INFO: loaded from: classes11.dex */
@TargetApi(14)
public class TextureRenderView extends TextureView {

    /* JADX INFO: renamed from: a */
    public cox f56971a;

    /* JADX INFO: renamed from: b */
    public TextureViewSurfaceTextureListenerC13822b f56972b;

    /* JADX INFO: renamed from: com.tantanapp.ijk.media.ttplayerapi.widget.media.TextureRenderView$a */
    public static final class C13821a implements s4m {

        /* JADX INFO: renamed from: a */
        public TextureRenderView f56973a;

        /* JADX INFO: renamed from: b */
        public SurfaceTexture f56974b;

        /* JADX INFO: renamed from: c */
        public ISurfaceTextureHost f56975c;

        public C13821a(@NonNull TextureRenderView textureRenderView, @Nullable SurfaceTexture surfaceTexture, @NonNull ISurfaceTextureHost iSurfaceTextureHost) {
            this.f56973a = textureRenderView;
            this.f56974b = surfaceTexture;
            this.f56975c = iSurfaceTextureHost;
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.ijk.media.ttplayerapi.widget.media.TextureRenderView$b */
    public static final class TextureViewSurfaceTextureListenerC13822b implements TextureView.SurfaceTextureListener, ISurfaceTextureHost {

        /* JADX INFO: renamed from: a */
        public SurfaceTexture f56976a;

        /* JADX INFO: renamed from: b */
        public boolean f56977b;

        /* JADX INFO: renamed from: c */
        public int f56978c;

        /* JADX INFO: renamed from: d */
        public int f56979d;

        /* JADX INFO: renamed from: h */
        public WeakReference<TextureRenderView> f56983h;

        /* JADX INFO: renamed from: e */
        public boolean f56980e = true;

        /* JADX INFO: renamed from: f */
        public boolean f56981f = false;

        /* JADX INFO: renamed from: g */
        public boolean f56982g = false;

        /* JADX INFO: renamed from: i */
        public Map<r4m, Object> f56984i = new ConcurrentHashMap();

        public TextureViewSurfaceTextureListenerC13822b(@NonNull TextureRenderView textureRenderView) {
            this.f56983h = new WeakReference<>(textureRenderView);
        }

        /* JADX INFO: renamed from: b */
        public void m82537b() {
            this.f56982g = true;
        }

        /* JADX INFO: renamed from: c */
        public void m82538c(boolean z) {
            this.f56980e = z;
        }

        /* JADX INFO: renamed from: d */
        public void m82539d() {
            this.f56981f = true;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            this.f56976a = surfaceTexture;
            this.f56977b = false;
            this.f56978c = 0;
            this.f56979d = 0;
            C13821a c13821a = new C13821a(this.f56983h.get(), surfaceTexture, this);
            Iterator<r4m> it = this.f56984i.keySet().iterator();
            while (it.hasNext()) {
                it.next().m179775a(c13821a, 0, 0);
            }
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            this.f56976a = surfaceTexture;
            this.f56977b = false;
            this.f56978c = 0;
            this.f56979d = 0;
            C13821a c13821a = new C13821a(this.f56983h.get(), surfaceTexture, this);
            Iterator<r4m> it = this.f56984i.keySet().iterator();
            while (it.hasNext()) {
                it.next().m179777c(c13821a);
            }
            return this.f56980e;
        }

        @Override // android.view.TextureView.SurfaceTextureListener
        public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
            this.f56976a = surfaceTexture;
            this.f56977b = true;
            this.f56978c = i;
            this.f56979d = i2;
            C13821a c13821a = new C13821a(this.f56983h.get(), surfaceTexture, this);
            Iterator<r4m> it = this.f56984i.keySet().iterator();
            while (it.hasNext()) {
                it.next().m179776b(c13821a, 0, i, i2);
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
            if (this.f56982g) {
                if (surfaceTexture != this.f56976a) {
                    surfaceTexture.release();
                    return;
                } else {
                    if (this.f56980e) {
                        return;
                    }
                    surfaceTexture.release();
                    return;
                }
            }
            boolean z = this.f56981f;
            SurfaceTexture surfaceTexture2 = this.f56976a;
            if (z) {
                if (surfaceTexture != surfaceTexture2) {
                    surfaceTexture.release();
                    return;
                } else {
                    if (this.f56980e) {
                        return;
                    }
                    m82538c(true);
                    return;
                }
            }
            if (surfaceTexture != surfaceTexture2) {
                surfaceTexture.release();
            } else {
                if (this.f56980e) {
                    return;
                }
                m82538c(true);
            }
        }
    }

    public TextureRenderView(Context context) {
        super(context);
        m82535a(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m82535a(Context context) {
        this.f56971a = new cox(this);
        TextureViewSurfaceTextureListenerC13822b textureViewSurfaceTextureListenerC13822b = new TextureViewSurfaceTextureListenerC13822b(this);
        this.f56972b = textureViewSurfaceTextureListenerC13822b;
        setSurfaceTextureListener(textureViewSurfaceTextureListenerC13822b);
    }

    public s4m getSurfaceHolder() {
        return new C13821a(this, this.f56972b.f56976a, this.f56972b);
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        this.f56972b.m82539d();
        super.onDetachedFromWindow();
        this.f56972b.m82537b();
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
        this.f56971a.m111710a(i, i2);
        setMeasuredDimension(this.f56971a.m111712c(), this.f56971a.m111711b());
    }

    public void setAspectRatio(int i) {
        this.f56971a.m111713d(i);
        requestLayout();
    }

    public void setVideoRotation(int i) {
        this.f56971a.m111714e(i);
        setRotation(i);
    }

    public TextureRenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m82535a(context);
    }

    public TextureRenderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m82535a(context);
    }
}
