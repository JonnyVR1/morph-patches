package com.p069ss.android.ttvecamera.cameraalgorithm;

import androidx.annotation.Keep;
import com.p069ss.android.ttvecamera.AbstractC13324c;
import com.p069ss.android.ttvecamera.TECameraFrame;
import p149l.qih0;

/* JADX INFO: loaded from: classes11.dex */
@Keep
public class TECameraAlgorithmInterface {

    public static class TECameraAlgoResult {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.cameraalgorithm.TECameraAlgorithmInterface$a */
    public interface InterfaceC13325a {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.cameraalgorithm.TECameraAlgorithmInterface$b */
    public interface InterfaceC13326b {
    }

    public TECameraAlgorithmInterface(AbstractC13324c abstractC13324c) {
    }

    public int addCameraAlgorithm(TECameraAlgorithmParam tECameraAlgorithmParam) {
        return 0;
    }

    public int destroy() {
        return 0;
    }

    public qih0 getResult() {
        return null;
    }

    public int init() {
        return 0;
    }

    public native int nativeAddCameraAlgorithm(long j, Object obj);

    public native int nativeAlgorithmDestroy(long j);

    public native Object nativeAlgorithmGetResult(long j);

    public void nativeCallback_onError(int i, String str) {
    }

    public void nativeCallback_onProcess(float f, boolean z) {
    }

    public native long nativeInit();

    public native TECameraAlgoResult nativeProcessAlgorithm(long j, Object obj);

    public native int nativeRemoveCameraAlgorithm(long j, int i);

    public native int nativeUpdateCameraAlgorithmParam(long j, Object obj);

    public TECameraFrame processAlgorithm(TECameraFrame tECameraFrame) {
        return null;
    }

    public int removeCameraAlgorithm(int i) {
        return 0;
    }

    public void setErrorListener(InterfaceC13325a interfaceC13325a) {
    }

    public void setProcessListener(InterfaceC13326b interfaceC13326b) {
    }

    public int updateCameraAlgorithmParam(TECameraAlgorithmParam tECameraAlgorithmParam) {
        return 0;
    }
}
