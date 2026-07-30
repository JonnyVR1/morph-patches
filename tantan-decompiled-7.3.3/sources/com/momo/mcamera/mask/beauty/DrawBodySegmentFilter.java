package com.momo.mcamera.mask.beauty;

import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.mask.beauty.body.DrawBodyWarpSrcFilter;
import com.momo.mcamera.util.MDLogTag;
import p153l.omw;

/* JADX INFO: loaded from: classes8.dex */
public class DrawBodySegmentFilter extends DrawBodyWarpSrcFilter {
    @Override // com.momo.mcamera.mask.beauty.body.DrawBodyWarpSrcFilter
    public void updateFaceInfo(omw omwVar) {
        float[] fArr;
        int iM168299n = omwVar.m168299n();
        if (iM168299n <= 0) {
            MDLog.m7443d(MDLogTag.MOMENT_RENDER_TAG, "No face");
            return;
        }
        for (int i = 0; i < iM168299n; i++) {
            if (omwVar.f148025l != null && (fArr = omwVar.f148026m.src_warp_points_) != null) {
                float[] fArr2 = this.data;
                if (fArr2 == null || fArr2.length != fArr.length) {
                    this.data = new float[fArr.length];
                }
                handCoord(i, omwVar);
            }
        }
    }
}
