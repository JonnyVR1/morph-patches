package com.momo.mcamera.mask.beauty;

import p153l.ogk;
import p153l.omw;
import p153l.suf;

/* JADX INFO: loaded from: classes8.dex */
public class DrawFaceWarpGroupFilter extends ogk implements suf {
    private DrawFaceWarpSrcFilter drawFaceWarpSrcFilter = new DrawFaceWarpSrcFilter();
    private DrawFaceWarpDstFilter drawFaceWarpDstFilter = new DrawFaceWarpDstFilter();

    public DrawFaceWarpGroupFilter() {
        registerInitialFilter(this.drawFaceWarpSrcFilter);
        this.drawFaceWarpSrcFilter.addTarget(this.drawFaceWarpDstFilter);
        registerTerminalFilter(this.drawFaceWarpDstFilter);
        this.drawFaceWarpDstFilter.addTarget(this);
    }

    @Override // p153l.suf
    public void setMMCVInfo(omw omwVar) {
        DrawFaceWarpSrcFilter drawFaceWarpSrcFilter = this.drawFaceWarpSrcFilter;
        if (drawFaceWarpSrcFilter != null) {
            drawFaceWarpSrcFilter.setMMCVInfo(omwVar);
        }
        DrawFaceWarpDstFilter drawFaceWarpDstFilter = this.drawFaceWarpDstFilter;
        if (drawFaceWarpDstFilter != null) {
            drawFaceWarpDstFilter.setMMCVInfo(omwVar);
        }
    }
}
