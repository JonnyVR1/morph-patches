package com.momo.mcamera.mask.beauty.facerig;

import p149l.etf;
import p149l.pjw;
import p149l.ydk;

/* JADX INFO: loaded from: classes7.dex */
public class DrawFaceRigGroupFilter extends ydk implements etf {
    private DrawFaceRigSrcFilter drawFaceRigSrcFilter;

    public DrawFaceRigGroupFilter() {
        DrawFaceRigSrcFilter drawFaceRigSrcFilter = new DrawFaceRigSrcFilter();
        this.drawFaceRigSrcFilter = drawFaceRigSrcFilter;
        registerInitialFilter(drawFaceRigSrcFilter);
        registerTerminalFilter(this.drawFaceRigSrcFilter);
        this.drawFaceRigSrcFilter.addTarget(this);
    }

    @Override // p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        DrawFaceRigSrcFilter drawFaceRigSrcFilter = this.drawFaceRigSrcFilter;
        if (drawFaceRigSrcFilter != null) {
            drawFaceRigSrcFilter.setMMCVInfo(pjwVar);
        }
    }
}
