package com.tencent.liteav.basic.p088c;

import android.graphics.SurfaceTexture;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: renamed from: com.tencent.liteav.basic.c.m */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC14020m {
    /* JADX INFO: renamed from: a */
    void mo82765a();

    /* JADX INFO: renamed from: a */
    void mo82766a(int i, boolean z);

    /* JADX INFO: renamed from: a */
    void mo82767a(int i, boolean z, int i2, int i3, int i4, boolean z2);

    /* JADX INFO: renamed from: a */
    void mo82768a(Runnable runnable);

    /* JADX INFO: renamed from: a */
    void mo82769a(boolean z);

    /* JADX INFO: renamed from: a */
    void mo82770a(byte[] bArr);

    EGLContext getGLContext();

    SurfaceTexture getSurfaceTexture();

    void setRendMirror(int i);

    void setRendMode(int i);

    void setSurfaceTextureListener(InterfaceC14021n interfaceC14021n);
}
