package com.google.android.exoplayer2.video.spherical;

import android.content.Context;
import android.graphics.PointF;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.BinderThread;

/* JADX INFO: renamed from: com.google.android.exoplayer2.video.spherical.b */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ViewOnTouchListenerC2087b extends GestureDetector.SimpleOnGestureListener implements View.OnTouchListener, C2086a.a {

    /* JADX INFO: renamed from: c */
    public final a f9664c;

    /* JADX INFO: renamed from: d */
    public final float f9665d;

    /* JADX INFO: renamed from: e */
    public final GestureDetector f9666e;

    /* JADX INFO: renamed from: a */
    public final PointF f9662a = new PointF();

    /* JADX INFO: renamed from: b */
    public final PointF f9663b = new PointF();

    /* JADX INFO: renamed from: f */
    public volatile float f9667f = 3.1415927f;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.video.spherical.b$a */
    public interface a {
        /* JADX INFO: renamed from: b */
        void mo12249b(PointF pointF);

        default boolean onSingleTapUp(MotionEvent motionEvent) {
            return false;
        }
    }

    public ViewOnTouchListenerC2087b(Context context, a aVar, float f) {
        this.f9664c = aVar;
        this.f9665d = f;
        this.f9666e = new GestureDetector(context, this);
    }

    @Override // com.google.android.exoplayer2.video.spherical.C2086a.a
    @BinderThread
    /* JADX INFO: renamed from: a */
    public void mo12248a(float[] fArr, float f) {
        this.f9667f = -f;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(MotionEvent motionEvent) {
        this.f9662a.set(motionEvent.getX(), motionEvent.getY());
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        float x = (motionEvent2.getX() - this.f9662a.x) / this.f9665d;
        float y = motionEvent2.getY();
        PointF pointF = this.f9662a;
        float f3 = (y - pointF.y) / this.f9665d;
        pointF.set(motionEvent2.getX(), motionEvent2.getY());
        double d = this.f9667f;
        float fCos = (float) Math.cos(d);
        float fSin = (float) Math.sin(d);
        PointF pointF2 = this.f9663b;
        pointF2.x -= (fCos * x) - (fSin * f3);
        float f4 = pointF2.y + (fSin * x) + (fCos * f3);
        pointF2.y = f4;
        pointF2.y = Math.max(-45.0f, Math.min(45.0f, f4));
        this.f9664c.mo12249b(this.f9663b);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(MotionEvent motionEvent) {
        return this.f9664c.onSingleTapUp(motionEvent);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        return this.f9666e.onTouchEvent(motionEvent);
    }
}
