package com.momo.mcamera.mask.beauty.body;

import p153l.ogk;
import p153l.omw;
import p153l.suf;

/* JADX INFO: loaded from: classes8.dex */
public class DrawBodyWarpGroupFilter extends ogk implements suf {
    private DrawBodyWarpSrcFilter drawBodyWarpSrcFilter = new DrawBodyWarpSrcFilter();
    private DrawBodyWarpDstFilter drawBodyWarpDstFilter = new DrawBodyWarpDstFilter();

    public DrawBodyWarpGroupFilter() {
        registerInitialFilter(this.drawBodyWarpSrcFilter);
        this.drawBodyWarpSrcFilter.addTarget(this.drawBodyWarpDstFilter);
        registerTerminalFilter(this.drawBodyWarpDstFilter);
        this.drawBodyWarpDstFilter.addTarget(this);
    }

    @Override // p153l.suf
    public void setMMCVInfo(omw omwVar) {
        DrawBodyWarpSrcFilter drawBodyWarpSrcFilter = this.drawBodyWarpSrcFilter;
        if (drawBodyWarpSrcFilter != null) {
            drawBodyWarpSrcFilter.setMMCVInfo(omwVar);
        }
        DrawBodyWarpDstFilter drawBodyWarpDstFilter = this.drawBodyWarpDstFilter;
        if (drawBodyWarpDstFilter != null) {
            drawBodyWarpDstFilter.setMMCVInfo(omwVar);
        }
    }
}
