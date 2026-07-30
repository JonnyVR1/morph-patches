package p153l;

import android.annotation.TargetApi;
import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
@TargetApi(21)
public class zqh0 extends crh0 {
    public zqh0(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: u */
    private static boolean m221014u() {
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

    @Override // p153l.crh0
    /* JADX INFO: renamed from: b */
    public void mo112053b(int i, CameraManager cameraManager) {
        if (m221014u()) {
            crh0.f83326b = "3";
        } else {
            super.mo112053b(i, cameraManager);
        }
    }

    @Override // p153l.crh0
    /* JADX INFO: renamed from: h */
    public String mo112058h() {
        return m221014u() ? "3" : super.mo112058h();
    }

    @Override // p153l.crh0
    /* JADX INFO: renamed from: s */
    public boolean mo112069s() {
        return !"0".equals(mo112058h()) || m221014u();
    }
}
