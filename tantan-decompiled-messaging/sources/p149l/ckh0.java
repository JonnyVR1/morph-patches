package p149l;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes11.dex */
@RequiresApi(api = 21)
public class ckh0 extends fjh0 {
    public ckh0(@NonNull z3m.InterfaceC21616a interfaceC21616a) {
        super(interfaceC21616a);
    }

    @Override // p149l.z3m
    /* JADX INFO: renamed from: a */
    public void mo102389a(@NonNull CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
    }
}
