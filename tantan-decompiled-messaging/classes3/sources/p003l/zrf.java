package p003l;

import java.io.File;
import project.android.imageprocessing.model.FilterOptions;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class zrf extends jr2 {

    /* JADX INFO: renamed from: c */
    private isf f9403c;

    public zrf() {
        this.f9403c = null;
        this.f9403c = new isf();
        yrf yrfVar = new yrf();
        this.f9403c.addTarget(yrfVar);
        yrfVar.addTarget(this);
        registerFilter(this.f9403c);
        registerFilter(yrfVar);
        registerEffectInnerFilter(this.f9403c);
        registerEffectInnerFilter(yrfVar);
        registerInitialFilter(this.f9403c);
        registerTerminalFilter(yrfVar);
    }

    @Override // p003l.AbstractC0341i4
    public void setFilterOptions(FilterOptions filterOptions) {
        super.setFilterOptions(filterOptions);
        this.f9403c.setLookUpPath(filterOptions.getFolder() + File.separator + "mask.png");
    }
}
