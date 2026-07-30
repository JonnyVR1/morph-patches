package com.momo.mcamera.ThirdPartEffect.Pott.filter;

import android.graphics.Bitmap;
import com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup.EsTemplateProgramGroup;

/* JADX INFO: loaded from: classes6.dex */
public class MixProgramGroupRenderFilter extends EsProgramGroupRenderFilter {
    EsTemplateProgramGroup nextGroup;

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.filter.EsProgramGroupRenderFilter
    public /* bridge */ /* synthetic */ void addRenderGroup(EsTemplateProgramGroup esTemplateProgramGroup) {
        super.addRenderGroup(esTemplateProgramGroup);
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.filter.EsProgramGroupRenderFilter, com.momo.mcamera.ThirdPartEffect.Pott.filter.PottMVFilter, p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        this.nextGroup = null;
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.filter.PottMVFilter, p153l.gfj
    public /* bridge */ /* synthetic */ void drawSub() {
        super.drawSub();
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.filter.EsProgramGroupRenderFilter, p153l.gfj, p153l.wej
    public void handleSizeChange() {
        super.handleSizeChange();
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.filter.EsProgramGroupRenderFilter, com.momo.mcamera.ThirdPartEffect.Pott.filter.PottMVFilter
    public void onDrawPrograms() {
        EsTemplateProgramGroup esTemplateProgramGroup;
        EsTemplateProgramGroup esTemplateProgramGroup2;
        if (this.templateProgramGroups.size() > 0 && this.groupRenderIndex < this.templateProgramGroups.size() && ((esTemplateProgramGroup2 = this.headGroup) == null || esTemplateProgramGroup2.getRendingStatus() == 3)) {
            EsTemplateProgramGroup esTemplateProgramGroup3 = this.headGroup;
            if (esTemplateProgramGroup3 != null) {
                esTemplateProgramGroup3.recycleImageBuffers();
            }
            this.headGroup = this.templateProgramGroups.get(this.groupRenderIndex);
            this.groupRenderIndex++;
        }
        EsTemplateProgramGroup esTemplateProgramGroup4 = this.headGroup;
        if (esTemplateProgramGroup4 != null) {
            esTemplateProgramGroup4.setTimeStamp(this.curTimeStamp);
            this.headGroup.drawGroup();
        }
        if (this.templateProgramGroups.size() <= 1 || this.groupRenderIndex >= this.templateProgramGroups.size() || (esTemplateProgramGroup = this.headGroup) == null) {
            return;
        }
        if (esTemplateProgramGroup.getRendingStatus() == 2 || this.headGroup.getRendingStatus() == 3) {
            EsTemplateProgramGroup esTemplateProgramGroup5 = this.templateProgramGroups.get(this.groupRenderIndex);
            this.nextGroup = esTemplateProgramGroup5;
            if (esTemplateProgramGroup5 != null) {
                esTemplateProgramGroup5.setTimeStamp(this.curTimeStamp);
                this.nextGroup.drawGroup();
            }
        }
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.filter.EsProgramGroupRenderFilter
    public void resetGroupStatus() {
        super.resetGroupStatus();
        this.nextGroup = null;
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.filter.PottMVFilter, p153l.gam
    public void setTimeStamp(long j) {
        super.setTimeStamp(j);
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.filter.PottMVFilter
    public /* bridge */ /* synthetic */ void setTotalFrameCount(long j) {
        super.setTotalFrameCount(j);
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.filter.PottMVFilter
    public /* bridge */ /* synthetic */ Bitmap snapPicture(int i, int i2) {
        return super.snapPicture(i, i2);
    }
}
