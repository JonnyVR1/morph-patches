package com.momo.mcamera.ThirdPartEffect.Pott.filter;

import com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup.EsTemplateProgramGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
class EsProgramGroupRenderFilter extends PottMVFilter {
    protected EsTemplateProgramGroup headGroup;
    protected List<EsTemplateProgramGroup> templateProgramGroups = new ArrayList();
    protected int groupRenderIndex = 0;
    private boolean groupInitialized = false;

    public void addRenderGroup(EsTemplateProgramGroup esTemplateProgramGroup) {
        this.templateProgramGroups.add(esTemplateProgramGroup);
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.filter.PottMVFilter, p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        for (EsTemplateProgramGroup esTemplateProgramGroup : this.templateProgramGroups) {
            if (esTemplateProgramGroup != null) {
                esTemplateProgramGroup.destroy();
            }
        }
        this.templateProgramGroups.clear();
        this.headGroup = null;
        this.groupRenderIndex = 0;
    }

    @Override // p153l.gfj, p153l.wej
    public void handleSizeChange() {
        super.handleSizeChange();
        for (EsTemplateProgramGroup esTemplateProgramGroup : this.templateProgramGroups) {
            if (esTemplateProgramGroup != null) {
                esTemplateProgramGroup.updateRenderSize(getWidth(), getHeight());
            }
        }
    }

    @Override // p153l.wej
    public void initWithGLContext() {
        super.initWithGLContext();
        setBackgroundRed(1.0f);
        setBackgroundGreen(1.0f);
        setBackgroundBlue(1.0f);
        setBackgroundAlpha(1.0f);
        if (this.groupInitialized) {
            return;
        }
        Iterator<EsTemplateProgramGroup> it = this.templateProgramGroups.iterator();
        while (it.hasNext()) {
            it.next().initAllInfo();
        }
        this.groupInitialized = true;
    }

    @Override // com.momo.mcamera.ThirdPartEffect.Pott.filter.PottMVFilter
    public void onDrawPrograms() {
        EsTemplateProgramGroup esTemplateProgramGroup;
        if (this.templateProgramGroups.size() > 0 && this.groupRenderIndex < this.templateProgramGroups.size() && ((esTemplateProgramGroup = this.headGroup) == null || esTemplateProgramGroup.getRendingStatus() == 3)) {
            EsTemplateProgramGroup esTemplateProgramGroup2 = this.headGroup;
            if (esTemplateProgramGroup2 != null) {
                esTemplateProgramGroup2.recycleImageBuffers();
            }
            this.headGroup = this.templateProgramGroups.get(this.groupRenderIndex);
            this.groupRenderIndex++;
        }
        EsTemplateProgramGroup esTemplateProgramGroup3 = this.headGroup;
        if (esTemplateProgramGroup3 != null) {
            esTemplateProgramGroup3.setTimeStamp(this.curTimeStamp);
            this.headGroup.drawGroup();
        }
    }

    public void resetGroupStatus() {
        this.headGroup = null;
        this.groupRenderIndex = 0;
        this.curTimeStamp = 0L;
        this.firstTimestamp = -1L;
    }
}
