package com.momo.mcamera.mask;

import com.cosmos.mdlog.MDLog;
import p149l.gjf0;
import p149l.pjw;

/* JADX INFO: loaded from: classes7.dex */
public class SkinChooseFilter extends BaseSkinComposeFilter {
    public static int SKIN_TYPE_SMOOTH_8_0 = 1;
    public static int SKIN_TYPE_SMOOTH_DEFAULT;
    private float currentLevel;
    private FaceSkinSmoothFilter faceSkinSmoothFilter;
    private NormalFilter normalFilter;
    private gjf0 skinSmoothingFilter;
    private int skinTypeSaved;
    private boolean useOldFilter;

    public SkinChooseFilter(boolean z, float f, int i) {
        this.useOldFilter = z;
        this.currentLevel = f;
        this.skinTypeSaved = i;
        if (z) {
            NormalFilter normalFilter = new NormalFilter();
            this.normalFilter = normalFilter;
            if (f == 0.0f) {
                registerInitialFilter(normalFilter);
                registerTerminalFilter(this.normalFilter);
                this.normalFilter.addTarget(this);
                return;
            }
            gjf0 gjf0Var = new gjf0();
            this.skinSmoothingFilter = gjf0Var;
            gjf0Var.setSmoothLevel(f);
            this.normalFilter.addTarget(this.skinSmoothingFilter);
            registerInitialFilter(this.normalFilter);
            registerTerminalFilter(this.skinSmoothingFilter);
            this.skinSmoothingFilter.addTarget(this);
            return;
        }
        NormalFilter normalFilter2 = new NormalFilter();
        this.normalFilter = normalFilter2;
        if (f == 0.0f) {
            registerInitialFilter(normalFilter2);
            registerTerminalFilter(this.normalFilter);
            this.normalFilter.addTarget(this);
            return;
        }
        int i2 = this.skinTypeSaved;
        if (i2 == SKIN_TYPE_SMOOTH_DEFAULT) {
            this.faceSkinSmoothFilter = new FaceSkinSmoothFilter();
        } else if (i2 == SKIN_TYPE_SMOOTH_8_0) {
            this.faceSkinSmoothFilter = new FaceSkinSmoothFilter(FaceSkinSmoothFilter.edgePassFilterVersion.transitionalGuidedFilter);
        } else {
            MDLog.m7391e("Beauty TAG", "Wrong type parameters.");
        }
        this.faceSkinSmoothFilter.setSkinSmoothScale(f);
        this.normalFilter.addTarget(this.faceSkinSmoothFilter);
        registerInitialFilter(this.normalFilter);
        registerTerminalFilter(this.faceSkinSmoothFilter);
        this.faceSkinSmoothFilter.addTarget(this);
    }

    @Override // p149l.ydk, p149l.mcj, p149l.ccj
    public synchronized void destroy() {
        try {
            super.destroy();
            NormalFilter normalFilter = this.normalFilter;
            if (normalFilter != null) {
                normalFilter.destroy();
            }
            FaceSkinSmoothFilter faceSkinSmoothFilter = this.faceSkinSmoothFilter;
            if (faceSkinSmoothFilter != null) {
                faceSkinSmoothFilter.destroy();
            }
            gjf0 gjf0Var = this.skinSmoothingFilter;
            if (gjf0Var != null) {
                gjf0Var.destroy();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public float getSkinLevel() {
        return this.currentLevel;
    }

    @Override // p149l.ydk, p149l.mcj, p149l.ccj
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        NormalFilter normalFilter = this.normalFilter;
        if (normalFilter != null) {
            normalFilter.releaseFrameBuffer();
        }
        FaceSkinSmoothFilter faceSkinSmoothFilter = this.faceSkinSmoothFilter;
        if (faceSkinSmoothFilter != null) {
            faceSkinSmoothFilter.releaseFrameBuffer();
        }
        gjf0 gjf0Var = this.skinSmoothingFilter;
        if (gjf0Var != null) {
            gjf0Var.releaseFrameBuffer();
        }
    }

    @Override // com.momo.mcamera.mask.BaseSkinComposeFilter, p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        FaceSkinSmoothFilter faceSkinSmoothFilter = this.faceSkinSmoothFilter;
        if (faceSkinSmoothFilter != null) {
            faceSkinSmoothFilter.setMMCVInfo(pjwVar);
        }
    }

    @Override // com.momo.mcamera.mask.BaseSkinComposeFilter
    public void setSmoothLevel(float f) {
        synchronized (getLockObject()) {
            try {
                if (this.useOldFilter) {
                    float f2 = this.currentLevel;
                    if (f != 0.0f) {
                        if (f2 == 0.0f) {
                            if (this.skinSmoothingFilter == null) {
                                this.skinSmoothingFilter = new gjf0();
                            }
                            this.normalFilter.removeTarget(this);
                            this.normalFilter.addTarget(this.skinSmoothingFilter);
                            removeTerminalFilter(this.normalFilter);
                            registerTerminalFilter(this.skinSmoothingFilter);
                            this.skinSmoothingFilter.addTarget(this);
                        }
                        this.skinSmoothingFilter.setSmoothLevel(f);
                    } else if (f2 != 0.0f) {
                        this.skinSmoothingFilter.setSmoothLevel(0.0f);
                        this.skinSmoothingFilter.removeTarget(this);
                        this.normalFilter.removeTarget(this.skinSmoothingFilter);
                        removeTerminalFilter(this.skinSmoothingFilter);
                        registerTerminalFilter(this.normalFilter);
                        this.normalFilter.addTarget(this);
                        registerFilter(this.skinSmoothingFilter);
                        this.currentLevel = f;
                    }
                    this.currentLevel = f;
                } else {
                    float f3 = this.currentLevel;
                    if (f != 0.0f) {
                        if (f3 == 0.0f) {
                            if (this.faceSkinSmoothFilter == null) {
                                int i = this.skinTypeSaved;
                                if (i == SKIN_TYPE_SMOOTH_DEFAULT) {
                                    this.faceSkinSmoothFilter = new FaceSkinSmoothFilter();
                                } else if (i == SKIN_TYPE_SMOOTH_8_0) {
                                    this.faceSkinSmoothFilter = new FaceSkinSmoothFilter(FaceSkinSmoothFilter.edgePassFilterVersion.transitionalGuidedFilter);
                                } else {
                                    MDLog.m7391e("Beauty TAG", "Wrong type parameters.");
                                }
                            }
                            this.normalFilter.removeTarget(this);
                            this.normalFilter.addTarget(this.faceSkinSmoothFilter);
                            removeTerminalFilter(this.normalFilter);
                            registerTerminalFilter(this.faceSkinSmoothFilter);
                            this.faceSkinSmoothFilter.addTarget(this);
                        }
                        this.faceSkinSmoothFilter.setSkinSmoothScale(f);
                    } else if (f3 != 0.0f) {
                        this.faceSkinSmoothFilter.setSkinSmoothScale(0.0f);
                        this.faceSkinSmoothFilter.removeTarget(this);
                        this.normalFilter.removeTarget(this.faceSkinSmoothFilter);
                        removeTerminalFilter(this.faceSkinSmoothFilter);
                        registerTerminalFilter(this.normalFilter);
                        this.normalFilter.addTarget(this);
                        registerFilter(this.faceSkinSmoothFilter);
                        this.currentLevel = f;
                    }
                    this.currentLevel = f;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
