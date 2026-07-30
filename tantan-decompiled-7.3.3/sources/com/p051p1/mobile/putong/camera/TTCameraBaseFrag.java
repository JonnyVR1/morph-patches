package com.p051p1.mobile.putong.camera;

import android.os.Bundle;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.camera.picture.TTCameraPictureFrag;
import com.p051p1.mobile.putong.camera.video.TTCameraVideoFrag;

/* JADX INFO: loaded from: classes9.dex */
public class TTCameraBaseFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public final String f17933A = getClass().getSimpleName();

    /* JADX INFO: renamed from: z */
    public TTCameraConfig f17934z;

    /* JADX INFO: renamed from: M4 */
    public static TTCameraBaseFrag m30708M4(TTCameraConfig tTCameraConfig) {
        TTCameraBaseFrag tTCameraVideoFrag = tTCameraConfig.m30723o() ? new TTCameraVideoFrag() : new TTCameraPictureFrag();
        Bundle bundle = new Bundle();
        bundle.putParcelable("camera_config", tTCameraConfig);
        tTCameraVideoFrag.setArguments(bundle);
        return tTCameraVideoFrag;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
        super.mo21582d4();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f17934z = (TTCameraConfig) arguments.getParcelable("camera_config");
        }
    }
}
