package com.momo.mcamera.mask.lightskin;

import com.momo.mcamera.mask.BaseSkinComposeFilter;
import com.momo.mcamera.mask.NormalFilter;
import p149l.etf;
import p149l.mcj;
import p149l.pjw;

/* JADX INFO: loaded from: classes7.dex */
public class LightSkinSmoothGroupFilter extends BaseSkinComposeFilter implements etf {
    NormalFilter normalFilter = new NormalFilter();
    BoxFilter box1Filter = new BoxFilter();
    BoxFilter box3Filter = new BoxFilter();
    HighContrastFilter highContrastFilter = new HighContrastFilter();
    LightSkinSmoothFilter smoothExtFilter = new LightSkinSmoothFilter();

    public LightSkinSmoothGroupFilter() {
        this.normalFilter.addTarget(this.box1Filter);
        this.normalFilter.addTarget(this.highContrastFilter);
        this.box1Filter.addTarget(this.highContrastFilter);
        this.highContrastFilter.registerFilterLocation(this.normalFilter);
        this.highContrastFilter.registerFilterLocation(this.box1Filter);
        this.highContrastFilter.addTarget(this.box3Filter);
        this.normalFilter.addTarget(this.smoothExtFilter);
        this.box1Filter.addTarget(this.smoothExtFilter);
        this.box3Filter.addTarget(this.smoothExtFilter);
        this.smoothExtFilter.addTarget(this);
        this.smoothExtFilter.registerFilterLocation(this.normalFilter);
        this.smoothExtFilter.registerFilterLocation(this.box1Filter);
        this.smoothExtFilter.registerFilterLocation(this.box3Filter);
        registerInitialFilter(this.normalFilter);
        registerFilter(this.box1Filter);
        registerFilter(this.box3Filter);
        registerFilter(this.highContrastFilter);
        registerTerminalFilter(this.smoothExtFilter);
    }

    @Override // p149l.ydk, p149l.mcj, p149l.ccj
    public synchronized void destroy() {
        super.destroy();
    }

    public float getSmoothLevel() {
        LightSkinSmoothFilter lightSkinSmoothFilter = this.smoothExtFilter;
        if (lightSkinSmoothFilter != null) {
            return lightSkinSmoothFilter.getSmoothLevel();
        }
        return 0.0f;
    }

    @Override // p149l.ydk, p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        if (!getTerminalFilters().contains(mcjVar)) {
            int iMin = Math.min(mcjVar.getWidth() / 2, 360);
            int iMin2 = Math.min(mcjVar.getHeight() / 2, 480);
            this.box1Filter.setRenderSize(iMin, iMin2);
            this.box3Filter.setRenderSize(iMin, iMin2);
            this.highContrastFilter.setRenderSize(iMin, iMin2);
            this.smoothExtFilter.setRenderSize(mcjVar.getWidth(), mcjVar.getHeight());
        }
        super.newTextureReady(i, mcjVar, z);
    }

    @Override // com.momo.mcamera.mask.BaseSkinComposeFilter, p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        LightSkinSmoothFilter lightSkinSmoothFilter = this.smoothExtFilter;
        if (lightSkinSmoothFilter != null) {
            lightSkinSmoothFilter.setMMCVInfo(pjwVar);
        }
    }

    @Override // com.momo.mcamera.mask.BaseSkinComposeFilter
    public void setSmoothLevel(float f) {
        LightSkinSmoothFilter lightSkinSmoothFilter = this.smoothExtFilter;
        if (lightSkinSmoothFilter != null) {
            lightSkinSmoothFilter.setSmoothLevel(f);
        }
    }
}
