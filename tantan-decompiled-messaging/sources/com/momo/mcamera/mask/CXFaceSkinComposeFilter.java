package com.momo.mcamera.mask;

import p149l.mcj;
import p149l.pjw;

/* JADX INFO: loaded from: classes7.dex */
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

    @Override // p149l.ydk, p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        super.newTextureReady(i, mcjVar, z);
    }

    @Override // com.momo.mcamera.mask.BaseSkinComposeFilter, p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        this.mFaceSkinSmoothFilter.setMMCVInfo(pjwVar);
        this.mFaceSkinSmoothFilterMask.setMMCVInfo(pjwVar);
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
