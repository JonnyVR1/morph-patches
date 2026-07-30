package p149l;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
@TargetApi(21)
public class sih0 extends vih0 {
    public sih0(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: u */
    private static boolean m184340u() {
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

    @Override // p149l.vih0
    /* JADX INFO: renamed from: b */
    public void mo179507b(int i, CameraManager cameraManager) {
        if (m184340u()) {
            vih0.f181612b = "3";
        } else {
            super.mo179507b(i, cameraManager);
        }
    }

    @Override // p149l.vih0
    /* JADX INFO: renamed from: h */
    public String mo179508h() {
        return m184340u() ? "3" : super.mo179508h();
    }

    @Override // p149l.vih0
    /* JADX INFO: renamed from: s */
    public boolean mo179509s() {
        return !"0".equals(mo179508h()) || m184340u();
    }
}
