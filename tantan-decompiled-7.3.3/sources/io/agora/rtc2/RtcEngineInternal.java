package io.agora.rtc2;

import android.opengl.EGLContext;

/* JADX INFO: loaded from: classes2.dex */
public abstract class RtcEngineInternal extends RtcEngineEx {
    public abstract int enableTransportQualityIndication(boolean z);

    public abstract String makeQualityReportUrl(String str, String str2, String str3, int i);

    public abstract int monitorAudioRouteChange(boolean z);

    public abstract int setApiCallMode(int i);

    public abstract int setProfile(String str, boolean z);

    public abstract int setTextureId(int i, EGLContext eGLContext, int i2, int i3, long j);

    public abstract int setTextureId(int i, javax.microedition.khronos.egl.EGLContext eGLContext, int i2, int i3, long j);

    public abstract int updateSharedContext(EGLContext eGLContext);

    public abstract int updateSharedContext(javax.microedition.khronos.egl.EGLContext eGLContext);
}
