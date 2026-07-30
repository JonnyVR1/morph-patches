package p009l;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
@TargetApi(21)
public class sih0 extends vih0 {
    public sih0(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: u */
    private static boolean m22199u() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("YAL-AL00");
        arrayList.add("YAL-AL10");
        arrayList.add("YAL-TL00");
        arrayList.add("YAL-TL10");
        arrayList.add("YAL-L21");
        arrayList.add("YAL-L41");
        arrayList.add("YAL-AL50");
        arrayList.add("YAL-TL50");
        arrayList.add("YAL-L51");
        arrayList.add("SEA-AL00");
        arrayList.add("SEA-TL00");
        arrayList.add("SEA-AL10");
        arrayList.add("SEA-TL10");
        return arrayList.contains(Build.MODEL);
    }

    @Override // p009l.vih0
    /* JADX INFO: renamed from: b */
    public void mo21668b(int i, CameraManager cameraManager) {
        if (m22199u()) {
            vih0.f21594b = "3";
        } else {
            super.mo21668b(i, cameraManager);
        }
    }

    @Override // p009l.vih0
    /* JADX INFO: renamed from: h */
    public String mo21669h() {
        return m22199u() ? "3" : super.mo21669h();
    }

    @Override // p009l.vih0
    /* JADX INFO: renamed from: s */
    public boolean mo21670s() {
        return !"0".equals(mo21669h()) || m22199u();
    }
}
