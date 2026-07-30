package com.momo.mcamera.mask.lightskin;

import com.momo.mcamera.mask.BaseSkinComposeFilter;
import com.momo.mcamera.mask.NormalFilter;
import p153l.gfj;
import p153l.omw;
import p153l.suf;

/* JADX INFO: loaded from: classes8.dex */
public class LightSkinSmoothGroupFilter extends BaseSkinComposeFilter implements suf {
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

    @Override // p153l.ogk, p153l.gfj, p153l.wej
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

    @Override // p153l.ogk, p153l.jt2, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        if (!getTerminalFilters().contains(gfjVar)) {
            int iMin = Math.min(gfjVar.getWidth() / 2, 360);
            int iMin2 = Math.min(gfjVar.getHeight() / 2, 480);
            this.box1Filter.setRenderSize(iMin, iMin2);
            this.box3Filter.setRenderSize(iMin, iMin2);
            this.highContrastFilter.setRenderSize(iMin, iMin2);
            this.smoothExtFilter.setRenderSize(gfjVar.getWidth(), gfjVar.getHeight());
        }
        super.newTextureReady(i, gfjVar, z);
    }

    @Override // com.momo.mcamera.mask.BaseSkinComposeFilter, p153l.suf
    public void setMMCVInfo(omw omwVar) {
        LightSkinSmoothFilter lightSkinSmoothFilter = this.smoothExtFilter;
        if (lightSkinSmoothFilter != null) {
            lightSkinSmoothFilter.setMMCVInfo(omwVar);
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
