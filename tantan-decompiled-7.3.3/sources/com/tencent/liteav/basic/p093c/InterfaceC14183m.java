package com.tencent.liteav.basic.p093c;

import android.graphics.SurfaceTexture;
import javax.microedition.khronos.egl.EGLContext;

/* JADX INFO: renamed from: com.tencent.liteav.basic.c.m */
/* JADX INFO: loaded from: classes2.dex */
public interface InterfaceC14183m {
    /* JADX INFO: renamed from: a */
    void mo83948a();

    /* JADX INFO: renamed from: a */
    void mo83949a(int i, boolean z);

    /* JADX INFO: renamed from: a */
    void mo83950a(int i, boolean z, int i2, int i3, int i4, boolean z2);

    /* JADX INFO: renamed from: a */
    void mo83951a(Runnable runnable);

    /* JADX INFO: renamed from: a */
    void mo83952a(boolean z);

    /* JADX INFO: renamed from: a */
    void mo83953a(byte[] bArr);

    EGLContext getGLContext();

    SurfaceTexture getSurfaceTexture();

    void setRendMirror(int i);

    void setRendMode(int i);

    void setSurfaceTextureListener(InterfaceC14184n interfaceC14184n);
}
