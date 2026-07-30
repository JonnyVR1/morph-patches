package com.momo.mcamera.mask.beauty.facerig;

import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.mask.beauty.body.DrawBodyWarpSrcFilter;
import com.momo.mcamera.util.MDLogTag;
import com.momocv.SingleFaceInfo;
import com.momocv.videoprocessor.VideoInfo;
import p149l.pjw;
import p149l.qtf;

/* JADX INFO: loaded from: classes7.dex */
public class DrawFaceRigSrcFilter extends DrawBodyWarpSrcFilter {
    @Override // com.momo.mcamera.mask.beauty.body.DrawBodyWarpSrcFilter
    public void adjustCoordnate(float[] fArr, float[] fArr2) {
        int width = getWidth();
        int height = getHeight();
        if (fArr == null || fArr.length <= 0 || fArr2 == null || fArr2.length <= 0) {
            MDLog.m7389d(MDLogTag.MOMENT_RENDER_TAG, "No face Info or buffer is empty");
            return;
        }
        for (int i = 0; i < fArr.length / 2; i++) {
            int i2 = i * 2;
            fArr[i2] = ((fArr2[i] / width) - 0.5f) * 2.0f;
            fArr[i2 + 1] = ((fArr2[(fArr.length / 2) + i] / height) - 0.5f) * (-2.0f);
        }
    }

    @Override // com.momo.mcamera.mask.beauty.body.DrawBodyWarpSrcFilter
    public void handCoord(int i, pjw pjwVar) {
        adjustCoordnate(this.data, pjwVar.f149903j.f156324b.facesinfo_[0].landmarks_68_);
    }

    @Override // com.momo.mcamera.mask.beauty.body.DrawBodyWarpSrcFilter
    public void updateFaceInfo(pjw pjwVar) {
        VideoInfo videoInfo;
        int iM169950n = pjwVar.m169950n();
        if (iM169950n <= 0) {
            MDLog.m7389d(MDLogTag.MOMENT_RENDER_TAG, "No face");
            return;
        }
        for (int i = 0; i < iM169950n; i++) {
            qtf qtfVar = pjwVar.f149903j;
            if (qtfVar != null && (videoInfo = qtfVar.f156324b) != null && videoInfo.faces_attributes_ != null) {
                SingleFaceInfo[] singleFaceInfoArr = videoInfo.facesinfo_;
                float[] fArr = this.data;
                if (fArr == null || fArr.length != singleFaceInfoArr[0].landmarks_68_.length) {
                    this.data = new float[singleFaceInfoArr[0].landmarks_68_.length];
                }
                handCoord(i, pjwVar);
            }
        }
    }
}
