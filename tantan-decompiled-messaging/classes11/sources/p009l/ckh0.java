package p009l;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@RequiresApi(api = 21)
public class ckh0 extends fjh0 {
    public ckh0(@NonNull z3m.InterfaceC1341a interfaceC1341a) {
        super(interfaceC1341a);
    }

    @Override // p009l.z3m
    /* JADX INFO: renamed from: a */
    public void mo12076a(@NonNull CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
    }
}
