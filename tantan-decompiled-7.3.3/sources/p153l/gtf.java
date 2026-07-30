package p153l;

import java.io.File;
import project.android.imageprocessing.model.FilterOptions;

/* JADX INFO: loaded from: classes3.dex */
public class gtf extends zr2 {

    /* JADX INFO: renamed from: c */
    private ptf f106407c;

    public gtf() {
        this.f106407c = null;
        this.f106407c = new ptf();
        ftf ftfVar = new ftf();
        this.f106407c.addTarget(ftfVar);
        ftfVar.addTarget(this);
        registerFilter(this.f106407c);
        registerFilter(ftfVar);
        registerEffectInnerFilter(this.f106407c);
        registerEffectInnerFilter(ftfVar);
        registerInitialFilter(this.f106407c);
        registerTerminalFilter(ftfVar);
    }

    @Override // p153l.AbstractC17634i4
    public void setFilterOptions(FilterOptions filterOptions) {
        super.setFilterOptions(filterOptions);
        this.f106407c.setLookUpPath(filterOptions.getFolder() + File.separator + "mask.png");
    }
}
