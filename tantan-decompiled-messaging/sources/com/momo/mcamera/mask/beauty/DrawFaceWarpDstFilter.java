package com.momo.mcamera.mask.beauty;

import p149l.pjw;

/* JADX INFO: loaded from: classes7.dex */
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
    public void handCoord(int i, pjw pjwVar) {
        this.facePos222[i] = pjwVar.f149911r[i];
    }
}
