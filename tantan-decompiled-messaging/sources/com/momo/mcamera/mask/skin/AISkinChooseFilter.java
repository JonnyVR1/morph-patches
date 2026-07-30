package com.momo.mcamera.mask.skin;

import p149l.cn40;
import p149l.etf;
import p149l.pjw;
import p149l.ydk;

/* JADX INFO: loaded from: classes7.dex */
public class AISkinChooseFilter extends ydk implements etf {
    private AIFaceSkinComposeFilter mCXFaceSkinComposeFilter;
    private Float mCurrentLevel;
    private cn40 mNormalFilter;

    public AISkinChooseFilter(Float f) {
        this.mNormalFilter = null;
        this.mCurrentLevel = f;
        this.mNormalFilter = new cn40();
        if (f.floatValue() == 0.0f) {
            registerInitialFilter(this.mNormalFilter);
            registerTerminalFilter(this.mNormalFilter);
            this.mNormalFilter.addTarget(this);
            return;
        }
        AIFaceSkinComposeFilter aIFaceSkinComposeFilter = new AIFaceSkinComposeFilter();
        this.mCXFaceSkinComposeFilter = aIFaceSkinComposeFilter;
        aIFaceSkinComposeFilter.setSmoothLevel(f.floatValue());
        this.mNormalFilter.addTarget(this.mCXFaceSkinComposeFilter);
        registerInitialFilter(this.mNormalFilter);
        registerTerminalFilter(this.mCXFaceSkinComposeFilter);
        this.mCXFaceSkinComposeFilter.addTarget(this);
    }

    @Override // p149l.ydk, p149l.mcj, p149l.ccj
    public synchronized void destroy() {
        try {
            super.destroy();
            cn40 cn40Var = this.mNormalFilter;
            if (cn40Var != null) {
                cn40Var.destroy();
            }
            AIFaceSkinComposeFilter aIFaceSkinComposeFilter = this.mCXFaceSkinComposeFilter;
            if (aIFaceSkinComposeFilter != null) {
                aIFaceSkinComposeFilter.destroy();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public float getSkinLevel() {
        return this.mCurrentLevel.floatValue();
    }

    @Override // p149l.ydk, p149l.mcj, p149l.ccj
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        this.mNormalFilter.releaseFrameBuffer();
        this.mCXFaceSkinComposeFilter.releaseFrameBuffer();
    }

    @Override // p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        this.mCXFaceSkinComposeFilter.setMMCVInfo(pjwVar);
    }

    public void setSkinLevel(Float f) {
        float fFloatValue = f.floatValue();
        Float f2 = this.mCurrentLevel;
        if (fFloatValue != 0.0f) {
            if (f2.floatValue() == 0.0f) {
                AIFaceSkinComposeFilter aIFaceSkinComposeFilter = this.mCXFaceSkinComposeFilter;
                if (aIFaceSkinComposeFilter != null) {
                    aIFaceSkinComposeFilter.destroy();
                }
                this.mCXFaceSkinComposeFilter = new AIFaceSkinComposeFilter();
                this.mNormalFilter.removeTarget(this);
                this.mNormalFilter.addTarget(this.mCXFaceSkinComposeFilter);
                removeTerminalFilter(this.mNormalFilter);
                registerTerminalFilter(this.mCXFaceSkinComposeFilter);
                this.mCXFaceSkinComposeFilter.addTarget(this);
            }
            this.mCXFaceSkinComposeFilter.setSmoothLevel(f.floatValue());
        } else if (f2.floatValue() != 0.0f) {
            this.mCXFaceSkinComposeFilter.setSmoothLevel(0.0f);
            this.mCXFaceSkinComposeFilter.removeTarget(this);
            this.mNormalFilter.removeTarget(this.mCXFaceSkinComposeFilter);
            removeTerminalFilter(this.mCXFaceSkinComposeFilter);
            registerTerminalFilter(this.mNormalFilter);
            this.mNormalFilter.addTarget(this);
        }
        this.mCurrentLevel = f;
    }
}
