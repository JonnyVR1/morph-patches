package com.momo.mcamera.mask.beauty.facerig;

import p153l.ogk;
import p153l.omw;
import p153l.suf;

/* JADX INFO: loaded from: classes8.dex */
public class DrawFaceRigGroupFilter extends ogk implements suf {
    private DrawFaceRigSrcFilter drawFaceRigSrcFilter;

    public DrawFaceRigGroupFilter() {
        DrawFaceRigSrcFilter drawFaceRigSrcFilter = new DrawFaceRigSrcFilter();
        this.drawFaceRigSrcFilter = drawFaceRigSrcFilter;
        registerInitialFilter(drawFaceRigSrcFilter);
        registerTerminalFilter(this.drawFaceRigSrcFilter);
        this.drawFaceRigSrcFilter.addTarget(this);
    }

    @Override // p153l.suf
    public void setMMCVInfo(omw omwVar) {
        DrawFaceRigSrcFilter drawFaceRigSrcFilter = this.drawFaceRigSrcFilter;
        if (drawFaceRigSrcFilter != null) {
            drawFaceRigSrcFilter.setMMCVInfo(omwVar);
        }
    }
}
