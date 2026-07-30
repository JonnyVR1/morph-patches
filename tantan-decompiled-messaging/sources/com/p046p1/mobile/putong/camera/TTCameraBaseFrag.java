package com.p046p1.mobile.putong.camera;

import android.os.Bundle;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.camera.picture.TTCameraPictureFrag;
import com.p046p1.mobile.putong.camera.video.TTCameraVideoFrag;

/* JADX INFO: loaded from: classes9.dex */
public class TTCameraBaseFrag extends PutongFrag {

    /* JADX INFO: renamed from: A */
    public final String f17214A = getClass().getSimpleName();

    /* JADX INFO: renamed from: z */
    public TTCameraConfig f17215z;

    /* JADX INFO: renamed from: M4 */
    public static TTCameraBaseFrag m29710M4(TTCameraConfig tTCameraConfig) {
        TTCameraBaseFrag tTCameraVideoFrag = tTCameraConfig.m29725o() ? new TTCameraVideoFrag() : new TTCameraPictureFrag();
        Bundle bundle = new Bundle();
        bundle.putParcelable("camera_config", tTCameraConfig);
        tTCameraVideoFrag.setArguments(bundle);
        return tTCameraVideoFrag;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        super.mo20583d4();
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f17215z = (TTCameraConfig) arguments.getParcelable("camera_config");
        }
    }
}
