package com.momo.mcamera.mask;

import p153l.gfj;
import p153l.omw;

/* JADX INFO: loaded from: classes8.dex */
public class CXFaceSkinComposeFilter extends BaseSkinComposeFilter {
    private CXFaceSkinSmoothFilter mFaceSkinSmoothFilter;
    private CXFaceSkinSmoothFilter mFaceSkinSmoothFilterMask;

    public CXFaceSkinComposeFilter() {
        this.mFaceSkinSmoothFilter = null;
        this.mFaceSkinSmoothFilterMask = null;
        CXFaceSkinSmoothFilter cXFaceSkinSmoothFilter = new CXFaceSkinSmoothFilter();
        this.mFaceSkinSmoothFilter = cXFaceSkinSmoothFilter;
        cXFaceSkinSmoothFilter.skinStep = 1;
        CXFaceSkinSmoothFilter cXFaceSkinSmoothFilter2 = new CXFaceSkinSmoothFilter();
        this.mFaceSkinSmoothFilterMask = cXFaceSkinSmoothFilter2;
        cXFaceSkinSmoothFilter2.skinStep = 2;
        this.mFaceSkinSmoothFilter.addTarget(cXFaceSkinSmoothFilter2);
        this.mFaceSkinSmoothFilterMask.addTarget(this);
        registerInitialFilter(this.mFaceSkinSmoothFilter);
        registerTerminalFilter(this.mFaceSkinSmoothFilterMask);
    }

    @Override // p153l.ogk, p153l.jt2, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        super.newTextureReady(i, gfjVar, z);
    }

    @Override // com.momo.mcamera.mask.BaseSkinComposeFilter, p153l.suf
    public void setMMCVInfo(omw omwVar) {
        this.mFaceSkinSmoothFilter.setMMCVInfo(omwVar);
        this.mFaceSkinSmoothFilterMask.setMMCVInfo(omwVar);
    }

    @Override // com.momo.mcamera.mask.BaseSkinComposeFilter
    public void setSmoothLevel(float f) {
        this.mFaceSkinSmoothFilter.setSkinParameter(f, f);
        this.mFaceSkinSmoothFilterMask.setSkinParameter(f, f);
    }

    public void setSmoothingPath(String str) {
        this.mFaceSkinSmoothFilter.setMaskPath(str);
        this.mFaceSkinSmoothFilterMask.setMaskPath(str);
    }

    public void setType(int i) {
        this.mFaceSkinSmoothFilter.setType(i);
        this.mFaceSkinSmoothFilterMask.setType(i);
    }
}
