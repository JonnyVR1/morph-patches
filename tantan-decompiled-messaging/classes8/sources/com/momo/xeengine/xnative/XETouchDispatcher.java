package com.momo.xeengine.xnative;

import android.view.MotionEvent;
import android.view.View;
import androidx.annotation.Keep;
import com.momo.xeengine.event.ITouchEventHandler;
import com.momo.xeengine.xnative.XETouchDispatcher;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public class XETouchDispatcher extends XETouchDispatcherNative implements ITouchEventHandler {
    private long eventDispatcherIns;
    protected Executor executor;

    public XETouchDispatcher(Executor executor, long j) {
        this.executor = executor;
        this.eventDispatcherIns = j;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m616a(XETouchDispatcher xETouchDispatcher, int i, int[] iArr, float[] fArr, float[] fArr2) {
        long j = xETouchDispatcher.eventDispatcherIns;
        if (j != 0) {
            xETouchDispatcher.nativeHandleTouchesEnd(j, i, iArr, fArr, fArr2);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m617b(XETouchDispatcher xETouchDispatcher, int i, int[] iArr, float[] fArr, float[] fArr2) {
        long j = xETouchDispatcher.eventDispatcherIns;
        if (j != 0) {
            xETouchDispatcher.nativeHandleTouchesMove(j, i, iArr, fArr, fArr2);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m618c(XETouchDispatcher xETouchDispatcher, int i, int[] iArr, float[] fArr, float[] fArr2) {
        long j = xETouchDispatcher.eventDispatcherIns;
        if (j != 0) {
            xETouchDispatcher.nativeHandleTouchesBegin(j, i, iArr, fArr, fArr2);
        }
    }

    @Override // com.momo.xeengine.event.ITouchEventHandler
    public void handleTouchEvent(MotionEvent motionEvent, float f, float f2) {
        int actionMasked = motionEvent.getActionMasked();
        final int pointerCount = motionEvent.getPointerCount();
        final int[] iArr = new int[pointerCount];
        final float[] fArr = new float[pointerCount];
        final float[] fArr2 = new float[pointerCount];
        for (int i = 0; i < pointerCount; i++) {
            iArr[i] = motionEvent.getPointerId(i);
            fArr[i] = motionEvent.getX(i) * f;
            fArr2[i] = motionEvent.getY(i) * f2;
        }
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked == 2) {
                    this.executor.execute(new Runnable() { // from class: l.rcq0
                        @Override // java.lang.Runnable
                        public final void run() {
                            XETouchDispatcher.m617b(this.f4068a, pointerCount, iArr, fArr, fArr2);
                        }
                    });
                    return;
                } else if (actionMasked != 3) {
                    if (actionMasked != 5) {
                        if (actionMasked != 6) {
                            return;
                        }
                    }
                }
            }
            this.executor.execute(new Runnable() { // from class: l.qcq0
                @Override // java.lang.Runnable
                public final void run() {
                    XETouchDispatcher.m616a(this.f3848a, pointerCount, iArr, fArr, fArr2);
                }
            });
            return;
        }
        this.executor.execute(new Runnable() { // from class: l.pcq0
            @Override // java.lang.Runnable
            public final void run() {
                XETouchDispatcher.m618c(this.f3712a, pointerCount, iArr, fArr, fArr2);
            }
        });
    }

    @Override // com.momo.xeengine.event.ITouchEventHandler
    public boolean handleTouchHitTest() {
        long j = this.eventDispatcherIns;
        if (j != 0) {
            return nativeHandleTouchHitTest(j);
        }
        return false;
    }

    public void release() {
        this.executor = null;
        this.eventDispatcherIns = 0L;
    }

    @Override // com.momo.xeengine.event.ITouchEventHandler
    public void handleTouchEvent(MotionEvent motionEvent, View view) {
        handleTouchEvent(motionEvent, nativeGetWindowWidth(this.eventDispatcherIns) / view.getWidth(), nativeGetWindowHeight(this.eventDispatcherIns) / view.getHeight());
    }
}
