package com.momo.mcamera.mask.beauty;

import p153l.omw;

/* JADX INFO: loaded from: classes8.dex */
public class DrawFaceWarpDstFilter extends DrawFaceWarpSrcFilter {
    @Override // com.momo.mcamera.mask.beauty.DrawFaceWarpSrcFilter
    public String getColor() {
        return "vec4(0.0, 0.0, 1.0, 1.0)";
    }

    @Override // com.momo.mcamera.mask.beauty.DrawFaceWarpSrcFilter
    public String getPointSize() {
        return "3.0";
    }

    @Override // com.momo.mcamera.mask.beauty.DrawFaceWarpSrcFilter
    public void handCoord(int i, omw omwVar) {
        this.facePos222[i] = omwVar.f148031r[i];
    }
}
