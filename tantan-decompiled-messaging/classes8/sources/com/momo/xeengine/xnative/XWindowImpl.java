package com.momo.xeengine.xnative;

import androidx.annotation.Keep;
import com.momo.xeengine.xnative.XWindowImpl;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public class XWindowImpl extends XWindowNative implements IXWindow {
    private final Executor executor;
    private long point;
    int width = 0;
    int height = 0;

    public XWindowImpl(Executor executor, long j) {
        this.executor = executor;
        this.point = j;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m619a(XWindowImpl xWindowImpl, float f, float f2, float f3, float f4) {
        long j = xWindowImpl.point;
        if (j != 0) {
            xWindowImpl.nativeSetSafeArea(j, f, f2, f3, f4);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m620b(XWindowImpl xWindowImpl, int i, int i2) {
        long j = xWindowImpl.point;
        if (j != 0) {
            xWindowImpl.width = i;
            xWindowImpl.height = i2;
            xWindowImpl.nativeSetSize(j, i, i2);
        }
    }

    @Override // com.momo.xeengine.xnative.IXWindow
    public void SetSafeArea(final float f, final float f2, final float f3, final float f4) {
        this.executor.execute(new Runnable() { // from class: l.vcq0
            @Override // java.lang.Runnable
            public final void run() {
                XWindowImpl.m619a(this.f4967a, f, f2, f3, f4);
            }
        });
    }

    @Override // com.momo.xeengine.xnative.IXWindow
    public void SetSize(final int i, final int i2) {
        this.executor.execute(new Runnable() { // from class: l.wcq0
            @Override // java.lang.Runnable
            public final void run() {
                XWindowImpl.m620b(this.f5035a, i, i2);
            }
        });
    }

    @Override // com.momo.xeengine.xnative.IXWindow
    public int getHeight() {
        return this.height;
    }

    @Override // com.momo.xeengine.xnative.IXWindow
    public int getWidth() {
        return this.width;
    }

    public void release() {
        this.point = 0L;
    }
}
