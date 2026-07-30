package p153l;

import android.hardware.camera2.CaptureRequest;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;

/* JADX INFO: loaded from: classes11.dex */
@RequiresApi(api = 21)
public class wrh0 extends mrh0 {
    public wrh0(@NonNull p6m.InterfaceC19309a interfaceC19309a) {
        super(interfaceC19309a);
    }

    @Override // p153l.p6m
    /* JADX INFO: renamed from: a */
    public void mo141880a(@NonNull CaptureRequest.Builder builder) {
        builder.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
        builder.set(CaptureRequest.CONTROL_AF_MODE, 3);
    }
}
