package com.momo.mcamera.mask.beauty.facerig;

import com.momo.mcamera.mask.beauty.body.DrawBodyWarpSrcFilter;
import p153l.omw;

/* JADX INFO: loaded from: classes8.dex */
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
    public void handCoord(int i, omw omwVar) {
        this.data = omwVar.f148023j.f96001b.dst_warp_points_;
    }
}
