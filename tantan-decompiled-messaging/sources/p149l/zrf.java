package p149l;

import java.io.File;
import project.android.imageprocessing.model.FilterOptions;

/* JADX INFO: loaded from: classes3.dex */
public class zrf extends jr2 {

    /* JADX INFO: renamed from: c */
    private isf f204512c;

    public zrf() {
        this.f204512c = null;
        this.f204512c = new isf();
        yrf yrfVar = new yrf();
        this.f204512c.addTarget(yrfVar);
        yrfVar.addTarget(this);
        registerFilter(this.f204512c);
        registerFilter(yrfVar);
        registerEffectInnerFilter(this.f204512c);
        registerEffectInnerFilter(yrfVar);
        registerInitialFilter(this.f204512c);
        registerTerminalFilter(yrfVar);
    }

    @Override // p149l.AbstractC17477i4
    public void setFilterOptions(FilterOptions filterOptions) {
        super.setFilterOptions(filterOptions);
        this.f204512c.setLookUpPath(filterOptions.getFolder() + File.separator + "mask.png");
    }
}
