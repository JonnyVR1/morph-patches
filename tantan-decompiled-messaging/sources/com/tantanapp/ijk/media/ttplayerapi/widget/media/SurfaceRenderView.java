package com.tantanapp.ijk.media.ttplayerapi.widget.media;

import android.annotation.TargetApi;
import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p149l.efx;
import p149l.y1m;
import p149l.z1m;

/* JADX INFO: loaded from: classes13.dex */
public class SurfaceRenderView extends SurfaceView {

    /* JADX INFO: renamed from: a */
    public efx f56112a;

    /* JADX INFO: renamed from: b */
    public SurfaceHolderCallbackC13657b f56113b;

    /* JADX INFO: renamed from: com.tantanapp.ijk.media.ttplayerapi.widget.media.SurfaceRenderView$a */
    public static final class C13656a implements z1m {

        /* JADX INFO: renamed from: a */
        public SurfaceRenderView f56114a;

        /* JADX INFO: renamed from: b */
        public SurfaceHolder f56115b;

        public C13656a(@NonNull SurfaceRenderView surfaceRenderView, @Nullable SurfaceHolder surfaceHolder) {
            this.f56114a = surfaceRenderView;
            this.f56115b = surfaceHolder;
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.ijk.media.ttplayerapi.widget.media.SurfaceRenderView$b */
    public static final class SurfaceHolderCallbackC13657b implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a */
        public SurfaceHolder f56116a;

        /* JADX INFO: renamed from: b */
        public boolean f56117b;

        /* JADX INFO: renamed from: c */
        public int f56118c;

        /* JADX INFO: renamed from: d */
        public int f56119d;

        /* JADX INFO: renamed from: e */
        public int f56120e;

        /* JADX INFO: renamed from: f */
        public WeakReference<SurfaceRenderView> f56121f;

        /* JADX INFO: renamed from: g */
        public Map<y1m, Object> f56122g = new ConcurrentHashMap();

        public SurfaceHolderCallbackC13657b(@NonNull SurfaceRenderView surfaceRenderView) {
            this.f56121f = new WeakReference<>(surfaceRenderView);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            this.f56116a = surfaceHolder;
            this.f56117b = true;
            this.f56118c = i;
            this.f56119d = i2;
            this.f56120e = i3;
            C13656a c13656a = new C13656a(this.f56121f.get(), this.f56116a);
            Iterator<y1m> it = this.f56122g.keySet().iterator();
            while (it.hasNext()) {
                it.next().m212241b(c13656a, i, i2, i3);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            this.f56116a = surfaceHolder;
            this.f56117b = false;
            this.f56118c = 0;
            this.f56119d = 0;
            this.f56120e = 0;
            C13656a c13656a = new C13656a(this.f56121f.get(), this.f56116a);
            Iterator<y1m> it = this.f56122g.keySet().iterator();
            while (it.hasNext()) {
                it.next().m212240a(c13656a, 0, 0);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            this.f56116a = null;
            this.f56117b = false;
            this.f56118c = 0;
            this.f56119d = 0;
            this.f56120e = 0;
            C13656a c13656a = new C13656a(this.f56121f.get(), this.f56116a);
            Iterator<y1m> it = this.f56122g.keySet().iterator();
            while (it.hasNext()) {
                it.next().m212242c(c13656a);
            }
        }
    }

    public SurfaceRenderView(Context context) {
        super(context);
        m81351a(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m81351a(Context context) {
        this.f56112a = new efx(this);
        this.f56113b = new SurfaceHolderCallbackC13657b(this);
        getHolder().addCallback(this.f56113b);
        getHolder().setType(0);
    }

    public View getView() {
        return this;
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(SurfaceRenderView.class.getName());
    }

    @Override // android.view.View
    @TargetApi(14)
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(SurfaceRenderView.class.getName());
    }

    @Override // android.view.SurfaceView, android.view.View
    public void onMeasure(int i, int i2) {
        this.f56112a.m116097a(i, i2);
        setMeasuredDimension(this.f56112a.m116099c(), this.f56112a.m116098b());
    }

    public void setAspectRatio(int i) {
        this.f56112a.m116100d(i);
        requestLayout();
    }

    public void setVideoRotation(int i) {
        Log.e("", "SurfaceView doesn't support rotation (" + i + ")!\n");
    }

    public SurfaceRenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m81351a(context);
    }

    public SurfaceRenderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m81351a(context);
    }
}
