package com.momo.mcamera.mask.skin;

import p153l.ogk;
import p153l.omw;
import p153l.qv40;
import p153l.suf;

/* JADX INFO: loaded from: classes8.dex */
public class AISkinChooseFilter extends ogk implements suf {
    private AIFaceSkinComposeFilter mCXFaceSkinComposeFilter;
    private Float mCurrentLevel;
    private qv40 mNormalFilter;

    public AISkinChooseFilter(Float f) {
        this.mNormalFilter = null;
        this.mCurrentLevel = f;
        this.mNormalFilter = new qv40();
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

    @Override // p153l.ogk, p153l.gfj, p153l.wej
    public synchronized void destroy() {
        try {
            super.destroy();
            qv40 qv40Var = this.mNormalFilter;
            if (qv40Var != null) {
                qv40Var.destroy();
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

    @Override // p153l.ogk, p153l.gfj, p153l.wej
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        this.mNormalFilter.releaseFrameBuffer();
        this.mCXFaceSkinComposeFilter.releaseFrameBuffer();
    }

    @Override // p153l.suf
    public void setMMCVInfo(omw omwVar) {
        this.mCXFaceSkinComposeFilter.setMMCVInfo(omwVar);
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
