package com.p008ss.android.ttvecamera.cameraalgorithm;

import androidx.annotation.Keep;
import com.p008ss.android.ttvecamera.AbstractC0726c;
import com.p008ss.android.ttvecamera.TECameraFrame;
import p009l.qih0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@Keep
public class TECameraAlgorithmInterface {

    public static class TECameraAlgoResult {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.cameraalgorithm.TECameraAlgorithmInterface$a */
    public interface InterfaceC0727a {
    }

    /* JADX INFO: renamed from: com.ss.android.ttvecamera.cameraalgorithm.TECameraAlgorithmInterface$b */
    public interface InterfaceC0728b {
    }

    public TECameraAlgorithmInterface(AbstractC0726c abstractC0726c) {
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

    public void setErrorListener(InterfaceC0727a interfaceC0727a) {
    }

    public void setProcessListener(InterfaceC0728b interfaceC0728b) {
    }

    public int updateCameraAlgorithmParam(TECameraAlgorithmParam tECameraAlgorithmParam) {
        return 0;
    }
}
