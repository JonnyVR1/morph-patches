package p009l;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.params.SessionConfiguration;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public final /* synthetic */ class ljh0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ SessionConfiguration m17895a(int i, List list, Executor executor, CameraCaptureSession.StateCallback stateCallback) {
        return new SessionConfiguration(i, list, executor, stateCallback);
    }
}
