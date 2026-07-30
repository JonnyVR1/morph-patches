package com.momo.mcamera.mask.skin;

import com.momo.mcamera.mask.BaseSkinComposeFilter;
import p153l.omw;
import p153l.qv40;
import p153l.suf;

/* JADX INFO: loaded from: classes8.dex */
public class AIFaceSkinComposeFilter extends BaseSkinComposeFilter implements suf {
    private AIFaceSkinSmoothFilter mFaceSkinSmoothFilter;
    private AISkinBlurFilter mSkinBlurFilter;
    private AISkinMixFilter mSkinMixFilter;

    public AIFaceSkinComposeFilter() {
        this.mSkinMixFilter = null;
        this.mFaceSkinSmoothFilter = null;
        this.mSkinBlurFilter = null;
        qv40 qv40Var = new qv40();
        AIFaceSkinSmoothFilter aIFaceSkinSmoothFilter = new AIFaceSkinSmoothFilter();
        this.mFaceSkinSmoothFilter = aIFaceSkinSmoothFilter;
        aIFaceSkinSmoothFilter.setSkinSmoothScale(1.0f);
        AISkinBlurFilter aISkinBlurFilter = new AISkinBlurFilter(0.9f);
        this.mSkinBlurFilter = aISkinBlurFilter;
        aISkinBlurFilter.setBackgroundColour(0.5f, 0.5f, 0.5f, 1.0f);
        this.mSkinMixFilter = new AISkinMixFilter();
        qv40Var.addTarget(this.mFaceSkinSmoothFilter);
        this.mFaceSkinSmoothFilter.addTarget(this.mSkinBlurFilter);
        qv40Var.addTarget(this.mSkinMixFilter);
        this.mSkinBlurFilter.addTarget(this.mSkinMixFilter);
        this.mSkinMixFilter.registerFilterLocation(this.mSkinBlurFilter, 0);
        this.mSkinMixFilter.registerFilterLocation(qv40Var, 1);
        this.mSkinMixFilter.addTarget(this);
        registerInitialFilter(qv40Var);
        registerFilter(this.mSkinBlurFilter);
        registerFilter(this.mFaceSkinSmoothFilter);
        registerTerminalFilter(this.mSkinMixFilter);
    }

    @Override // com.momo.mcamera.mask.BaseSkinComposeFilter, p153l.suf
    public void setMMCVInfo(omw omwVar) {
        this.mFaceSkinSmoothFilter.setMMCVInfo(omwVar);
        this.mSkinBlurFilter.setMMCVInfo(omwVar);
    }

    @Override // com.momo.mcamera.mask.BaseSkinComposeFilter
    public void setSmoothLevel(float f) {
        this.mFaceSkinSmoothFilter.setSkinSmoothScale(f);
    }
}
