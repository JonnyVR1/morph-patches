package com.momo.mcamera.filtermanager.filterext;

import android.graphics.PointF;
import com.momo.mcamera.mask.NormalFilter;
import com.momo.mcamera.mask.TriggerBlendFilter;
import p149l.ts2;
import p149l.ydk;

/* JADX INFO: loaded from: classes6.dex */
public class SourceMergeFilter extends ydk {
    private SourceInputOverlayFilter overlayFilter;
    private TriggerBlendFilter triggerBlendFilter;

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public SourceMergeFilter(SourceInputOverlayFilter sourceInputOverlayFilter) {
        this.overlayFilter = sourceInputOverlayFilter;
        ts2 normalFilter = new NormalFilter();
        TriggerBlendFilter triggerBlendFilter = new TriggerBlendFilter();
        this.triggerBlendFilter = triggerBlendFilter;
        normalFilter.addTarget(triggerBlendFilter);
        sourceInputOverlayFilter.addTarget(this.triggerBlendFilter);
        this.triggerBlendFilter.registerFilterLocation(normalFilter, 0);
        this.triggerBlendFilter.registerFilterLocation(sourceInputOverlayFilter, 1);
        this.triggerBlendFilter.addTarget(this);
        registerInitialFilter(normalFilter);
        registerInitialFilter(sourceInputOverlayFilter);
        registerTerminalFilter(this.triggerBlendFilter);
    }

    public void setOverlayPosition(float f, float f2, PointF pointF, float f3) {
        SourceInputOverlayFilter sourceInputOverlayFilter = this.overlayFilter;
        if (sourceInputOverlayFilter != null) {
            sourceInputOverlayFilter.setOverlayPosition(f, f2, pointF, f3);
        }
    }

    public String toString() {
        SourceInputOverlayFilter sourceInputOverlayFilter = this.overlayFilter;
        return sourceInputOverlayFilter != null ? sourceInputOverlayFilter.toString() : super.toString();
    }
}
