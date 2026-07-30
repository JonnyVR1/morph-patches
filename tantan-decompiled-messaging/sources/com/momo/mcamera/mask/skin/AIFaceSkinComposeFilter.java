package com.momo.mcamera.mask.skin;

import com.momo.mcamera.mask.BaseSkinComposeFilter;
import p149l.cn40;
import p149l.etf;
import p149l.pjw;

/* JADX INFO: loaded from: classes7.dex */
public class AIFaceSkinComposeFilter extends BaseSkinComposeFilter implements etf {
    private AIFaceSkinSmoothFilter mFaceSkinSmoothFilter;
    private AISkinBlurFilter mSkinBlurFilter;
    private AISkinMixFilter mSkinMixFilter;

    public AIFaceSkinComposeFilter() {
        this.mSkinMixFilter = null;
        this.mFaceSkinSmoothFilter = null;
        this.mSkinBlurFilter = null;
        cn40 cn40Var = new cn40();
        AIFaceSkinSmoothFilter aIFaceSkinSmoothFilter = new AIFaceSkinSmoothFilter();
        this.mFaceSkinSmoothFilter = aIFaceSkinSmoothFilter;
        aIFaceSkinSmoothFilter.setSkinSmoothScale(1.0f);
        AISkinBlurFilter aISkinBlurFilter = new AISkinBlurFilter(0.9f);
        this.mSkinBlurFilter = aISkinBlurFilter;
        aISkinBlurFilter.setBackgroundColour(0.5f, 0.5f, 0.5f, 1.0f);
        this.mSkinMixFilter = new AISkinMixFilter();
        cn40Var.addTarget(this.mFaceSkinSmoothFilter);
        this.mFaceSkinSmoothFilter.addTarget(this.mSkinBlurFilter);
        cn40Var.addTarget(this.mSkinMixFilter);
        this.mSkinBlurFilter.addTarget(this.mSkinMixFilter);
        this.mSkinMixFilter.registerFilterLocation(this.mSkinBlurFilter, 0);
        this.mSkinMixFilter.registerFilterLocation(cn40Var, 1);
        this.mSkinMixFilter.addTarget(this);
        registerInitialFilter(cn40Var);
        registerFilter(this.mSkinBlurFilter);
        registerFilter(this.mFaceSkinSmoothFilter);
        registerTerminalFilter(this.mSkinMixFilter);
    }

    @Override // com.momo.mcamera.mask.BaseSkinComposeFilter, p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        this.mFaceSkinSmoothFilter.setMMCVInfo(pjwVar);
        this.mSkinBlurFilter.setMMCVInfo(pjwVar);
    }

    @Override // com.momo.mcamera.mask.BaseSkinComposeFilter
    public void setSmoothLevel(float f) {
        this.mFaceSkinSmoothFilter.setSkinSmoothScale(f);
    }
}
