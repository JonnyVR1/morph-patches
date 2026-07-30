package com.momo.mcamera.mask.beauty;

import p149l.etf;
import p149l.pjw;
import p149l.ydk;

/* JADX INFO: loaded from: classes7.dex */
public class DrawFaceWarpGroupFilter extends ydk implements etf {
    private DrawFaceWarpSrcFilter drawFaceWarpSrcFilter = new DrawFaceWarpSrcFilter();
    private DrawFaceWarpDstFilter drawFaceWarpDstFilter = new DrawFaceWarpDstFilter();

    public DrawFaceWarpGroupFilter() {
        registerInitialFilter(this.drawFaceWarpSrcFilter);
        this.drawFaceWarpSrcFilter.addTarget(this.drawFaceWarpDstFilter);
        registerTerminalFilter(this.drawFaceWarpDstFilter);
        this.drawFaceWarpDstFilter.addTarget(this);
    }

    @Override // p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        DrawFaceWarpSrcFilter drawFaceWarpSrcFilter = this.drawFaceWarpSrcFilter;
        if (drawFaceWarpSrcFilter != null) {
            drawFaceWarpSrcFilter.setMMCVInfo(pjwVar);
        }
        DrawFaceWarpDstFilter drawFaceWarpDstFilter = this.drawFaceWarpDstFilter;
        if (drawFaceWarpDstFilter != null) {
            drawFaceWarpDstFilter.setMMCVInfo(pjwVar);
        }
    }
}
