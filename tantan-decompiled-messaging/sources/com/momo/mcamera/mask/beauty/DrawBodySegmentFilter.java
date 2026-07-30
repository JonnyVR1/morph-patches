package com.momo.mcamera.mask.beauty;

import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.mask.beauty.body.DrawBodyWarpSrcFilter;
import com.momo.mcamera.util.MDLogTag;
import p149l.pjw;

/* JADX INFO: loaded from: classes7.dex */
public class DrawBodySegmentFilter extends DrawBodyWarpSrcFilter {
    @Override // com.momo.mcamera.mask.beauty.body.DrawBodyWarpSrcFilter
    public void updateFaceInfo(pjw pjwVar) {
        float[] fArr;
        int iM169950n = pjwVar.m169950n();
        if (iM169950n <= 0) {
            MDLog.m7389d(MDLogTag.MOMENT_RENDER_TAG, "No face");
            return;
        }
        for (int i = 0; i < iM169950n; i++) {
            if (pjwVar.f149905l != null && (fArr = pjwVar.f149906m.src_warp_points_) != null) {
                float[] fArr2 = this.data;
                if (fArr2 == null || fArr2.length != fArr.length) {
                    this.data = new float[fArr.length];
                }
                handCoord(i, pjwVar);
            }
        }
    }
}
