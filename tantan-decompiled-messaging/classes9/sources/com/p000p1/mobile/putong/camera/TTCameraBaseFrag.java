package com.p000p1.mobile.putong.camera;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.p000p1.mobile.putong.app.PutongFrag;
import com.p000p1.mobile.putong.camera.picture.TTCameraPictureFrag;
import com.p000p1.mobile.putong.camera.video.TTCameraVideoFrag;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class TTCameraBaseFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public final String f1203A = getClass().getSimpleName();

    /* JADX INFO: renamed from: z */
    public TTCameraConfig f1204z;

    /* JADX INFO: renamed from: M4 */
    public static TTCameraBaseFrag m1620M4(TTCameraConfig tTCameraConfig) {
        Fragment tTCameraVideoFrag = tTCameraConfig.m1635o() ? new TTCameraVideoFrag() : new TTCameraPictureFrag();
        Bundle bundle = new Bundle();
        bundle.putParcelable("camera_config", tTCameraConfig);
        tTCameraVideoFrag.setArguments(bundle);
        return tTCameraVideoFrag;
    }

    @Override // com.p000p1.mobile.putong.app.PutongFrag
    /* JADX INFO: renamed from: d4 */
    public void mo1548d4() {
        super.mo1548d4();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f1204z = (TTCameraConfig) arguments.getParcelable("camera_config");
        }
    }
}
