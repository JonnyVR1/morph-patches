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
import p153l.cox;
import p153l.r4m;
import p153l.s4m;

/* JADX INFO: loaded from: classes11.dex */
public class SurfaceRenderView extends SurfaceView {

    /* JADX INFO: renamed from: a */
    public cox f56960a;

    /* JADX INFO: renamed from: b */
    public SurfaceHolderCallbackC13820b f56961b;

    /* JADX INFO: renamed from: com.tantanapp.ijk.media.ttplayerapi.widget.media.SurfaceRenderView$a */
    public static final class C13819a implements s4m {

        /* JADX INFO: renamed from: a */
        public SurfaceRenderView f56962a;

        /* JADX INFO: renamed from: b */
        public SurfaceHolder f56963b;

        public C13819a(@NonNull SurfaceRenderView surfaceRenderView, @Nullable SurfaceHolder surfaceHolder) {
            this.f56962a = surfaceRenderView;
            this.f56963b = surfaceHolder;
        }
    }

    /* JADX INFO: renamed from: com.tantanapp.ijk.media.ttplayerapi.widget.media.SurfaceRenderView$b */
    public static final class SurfaceHolderCallbackC13820b implements SurfaceHolder.Callback {

        /* JADX INFO: renamed from: a */
        public SurfaceHolder f56964a;

        /* JADX INFO: renamed from: b */
        public boolean f56965b;

        /* JADX INFO: renamed from: c */
        public int f56966c;

        /* JADX INFO: renamed from: d */
        public int f56967d;

        /* JADX INFO: renamed from: e */
        public int f56968e;

        /* JADX INFO: renamed from: f */
        public WeakReference<SurfaceRenderView> f56969f;

        /* JADX INFO: renamed from: g */
        public Map<r4m, Object> f56970g = new ConcurrentHashMap();

        public SurfaceHolderCallbackC13820b(@NonNull SurfaceRenderView surfaceRenderView) {
            this.f56969f = new WeakReference<>(surfaceRenderView);
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
            this.f56964a = surfaceHolder;
            this.f56965b = true;
            this.f56966c = i;
            this.f56967d = i2;
            this.f56968e = i3;
            C13819a c13819a = new C13819a(this.f56969f.get(), this.f56964a);
            Iterator<r4m> it = this.f56970g.keySet().iterator();
            while (it.hasNext()) {
                it.next().m179776b(c13819a, i, i2, i3);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceCreated(SurfaceHolder surfaceHolder) {
            this.f56964a = surfaceHolder;
            this.f56965b = false;
            this.f56966c = 0;
            this.f56967d = 0;
            this.f56968e = 0;
            C13819a c13819a = new C13819a(this.f56969f.get(), this.f56964a);
            Iterator<r4m> it = this.f56970g.keySet().iterator();
            while (it.hasNext()) {
                it.next().m179775a(c13819a, 0, 0);
            }
        }

        @Override // android.view.SurfaceHolder.Callback
        public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
            this.f56964a = null;
            this.f56965b = false;
            this.f56966c = 0;
            this.f56967d = 0;
            this.f56968e = 0;
            C13819a c13819a = new C13819a(this.f56969f.get(), this.f56964a);
            Iterator<r4m> it = this.f56970g.keySet().iterator();
            while (it.hasNext()) {
                it.next().m179777c(c13819a);
            }
        }
    }

    public SurfaceRenderView(Context context) {
        super(context);
        m82534a(context);
    }

    /* JADX INFO: renamed from: a */
    public final void m82534a(Context context) {
        this.f56960a = new cox(this);
        this.f56961b = new SurfaceHolderCallbackC13820b(this);
        getHolder().addCallback(this.f56961b);
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
        this.f56960a.m111710a(i, i2);
        setMeasuredDimension(this.f56960a.m111712c(), this.f56960a.m111711b());
    }

    public void setAspectRatio(int i) {
        this.f56960a.m111713d(i);
        requestLayout();
    }

    public void setVideoRotation(int i) {
        Log.e("", "SurfaceView doesn't support rotation (" + i + ")!\n");
    }

    public SurfaceRenderView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m82534a(context);
    }

    public SurfaceRenderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m82534a(context);
    }
}
