package com.momo.mcamera.mask.beauty.facerig;

import com.momo.mcamera.mask.beauty.body.DrawBodyWarpSrcFilter;
import p149l.pjw;

/* JADX INFO: loaded from: classes7.dex */
public class DrawFaceRigDstFilter extends DrawBodyWarpSrcFilter {
    @Override // com.momo.mcamera.mask.beauty.body.DrawBodyWarpSrcFilter
    public String getColor() {
        return "vec4(0.0, 1.0, 0.0, 1.0)";
    }

    @Override // com.momo.mcamera.mask.beauty.body.DrawBodyWarpSrcFilter
    public String getPointSize() {
        return "3.0";
    }

    @Override // com.momo.mcamera.mask.beauty.body.DrawBodyWarpSrcFilter
    public void handCoord(int i, pjw pjwVar) {
        this.data = pjwVar.f149903j.f156324b.dst_warp_points_;
    }
}
