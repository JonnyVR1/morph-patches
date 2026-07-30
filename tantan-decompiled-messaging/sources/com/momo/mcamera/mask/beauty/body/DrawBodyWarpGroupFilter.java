package com.momo.mcamera.mask.beauty.body;

import p149l.etf;
import p149l.pjw;
import p149l.ydk;

/* JADX INFO: loaded from: classes7.dex */
public class DrawBodyWarpGroupFilter extends ydk implements etf {
    private DrawBodyWarpSrcFilter drawBodyWarpSrcFilter = new DrawBodyWarpSrcFilter();
    private DrawBodyWarpDstFilter drawBodyWarpDstFilter = new DrawBodyWarpDstFilter();

    public DrawBodyWarpGroupFilter() {
        registerInitialFilter(this.drawBodyWarpSrcFilter);
        this.drawBodyWarpSrcFilter.addTarget(this.drawBodyWarpDstFilter);
        registerTerminalFilter(this.drawBodyWarpDstFilter);
        this.drawBodyWarpDstFilter.addTarget(this);
    }

    @Override // p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        DrawBodyWarpSrcFilter drawBodyWarpSrcFilter = this.drawBodyWarpSrcFilter;
        if (drawBodyWarpSrcFilter != null) {
            drawBodyWarpSrcFilter.setMMCVInfo(pjwVar);
        }
        DrawBodyWarpDstFilter drawBodyWarpDstFilter = this.drawBodyWarpDstFilter;
        if (drawBodyWarpDstFilter != null) {
            drawBodyWarpDstFilter.setMMCVInfo(pjwVar);
        }
    }
}
