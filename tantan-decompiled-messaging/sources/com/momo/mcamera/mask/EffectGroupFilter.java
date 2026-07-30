package com.momo.mcamera.mask;

import com.momo.mcamera.filtermanager.EffectFilterCreator;
import com.momo.mcamera.mask.bean.EffectFilterItem;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p149l.AbstractC17477i4;
import p149l.ccj;
import p149l.etf;
import p149l.gql;
import p149l.jcj;
import p149l.mcj;
import p149l.pjw;
import p149l.q7m;
import p149l.ts2;
import p149l.ydk;
import project.android.imageprocessing.model.FilterOptions;

/* JADX INFO: loaded from: classes7.dex */
public class EffectGroupFilter extends ydk implements etf, q7m, StickerAdjustFilter.IOrderable {
    private ConcurrentHashMap<String, AbstractC17477i4> mEffectFilterMap;
    private CopyOnWriteArrayList<ccj> mFiltersToDestroy;
    private NormalFilter mNormalFilter;
    private EffectRenderFinishListener mRenderFinishListener;
    private ts2 mTerminalFilter;
    private final int INVALID_MODEL_TYPE = -1;
    private int orderedIndex = 0;

    public interface EffectRenderFinishListener {
        void onRenderFinish();
    }

    public EffectGroupFilter() {
        NormalFilter normalFilter = new NormalFilter();
        this.mNormalFilter = normalFilter;
        normalFilter.addTarget(this);
        registerInitialFilter(this.mNormalFilter);
        registerTerminalFilter(this.mNormalFilter);
        this.mTerminalFilter = this.mNormalFilter;
        this.mFiltersToDestroy = new CopyOnWriteArrayList<>();
        this.mEffectFilterMap = new ConcurrentHashMap<>();
    }

    private void addTerminalFilter(AbstractC17477i4 abstractC17477i4) {
        this.mTerminalFilter.removeTarget(this);
        this.mTerminalFilter.addTarget(abstractC17477i4);
        ts2 ts2Var = this.mTerminalFilter;
        abstractC17477i4.parentFilter = ts2Var;
        removeTerminalFilter(ts2Var);
        registerFilter(this.mTerminalFilter);
        this.mTerminalFilter = abstractC17477i4;
        abstractC17477i4.addTarget(this);
        registerTerminalFilter(this.mTerminalFilter);
    }

    /* JADX INFO: Access modifiers changed from: private */
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
    public void removeEffectFilter(AbstractC17477i4 abstractC17477i4) {
        EffectRenderFinishListener effectRenderFinishListener;
        ts2 ts2Var = abstractC17477i4.parentFilter;
        ts2Var.removeTarget(abstractC17477i4);
        if (this.mTerminalFilter == abstractC17477i4) {
            removeTerminalFilter(abstractC17477i4);
            registerTerminalFilter(ts2Var);
            ts2Var.addTarget(this);
            this.mTerminalFilter = ts2Var;
        } else {
            removeFilter(abstractC17477i4);
            ts2 ts2Var2 = (ts2) abstractC17477i4.getTargets().get(0);
            abstractC17477i4.removeTarget(ts2Var2);
            ts2Var2.parentFilter = ts2Var;
            ts2Var.addTarget(ts2Var2);
        }
        this.mFiltersToDestroy.add(abstractC17477i4);
        this.mEffectFilterMap.remove(abstractC17477i4.getFilterOptions().getName());
        if (this.mEffectFilterMap.size() != 0 || (effectRenderFinishListener = this.mRenderFinishListener) == null) {
            return;
        }
        effectRenderFinishListener.onRenderFinish();
    }

    public void addEffectFilterItem(EffectFilterItem effectFilterItem) {
        AbstractC17477i4 abstractC17477i4 = this.mEffectFilterMap.get(effectFilterItem.getName());
        long duration = StickerAdjustFilter.DEFAULT_LONG_DURATION;
        if (abstractC17477i4 == null) {
            final AbstractC17477i4 processFilter = EffectFilterCreator.getProcessFilter(effectFilterItem);
            if (processFilter == null) {
                return;
            }
            if (effectFilterItem.getDuration() > 0) {
                duration = effectFilterItem.getDuration();
            }
            processFilter.setDuration(duration);
            processFilter.getFilterOptions().setModelType(effectFilterItem.getModelType());
            addTerminalFilter(processFilter);
            this.mEffectFilterMap.put(processFilter.getFilterOptions().getName(), processFilter);
            processFilter.setRenderFinishListener(new gql() { // from class: com.momo.mcamera.mask.EffectGroupFilter.1
                @Override // p149l.gql
                public void onRenderFinish() {
                    EffectGroupFilter.this.removeEffectFilter(processFilter);
                }
            });
            return;
        }
        if (effectFilterItem.getImageFolderPath() != null && effectFilterItem.getImageFolderPath().equals(abstractC17477i4.getFilterOptions().getImageFolderPath())) {
            abstractC17477i4.setDuration((abstractC17477i4.getDuration() - abstractC17477i4.getEscapedTime()) + effectFilterItem.getDuration());
            return;
        }
        FilterOptions filterOptions = EffectFilterCreator.getFilterOptions(effectFilterItem);
        if (filterOptions != null) {
            abstractC17477i4.resetFilterOptions(filterOptions);
            if (effectFilterItem.getDuration() > 0) {
                duration = effectFilterItem.getDuration();
            }
            abstractC17477i4.setDuration(duration);
        }
    }

    public void clearAll() {
        clearWithModelType(-1);
    }

    public void clearWithModelType(int i) {
        if (this.mEffectFilterMap.size() == 0) {
            return;
        }
        for (AbstractC17477i4 abstractC17477i4 : this.mEffectFilterMap.values()) {
            if (i == -1 || abstractC17477i4.getFilterOptions().getModelType() == i) {
                removeEffectFilter(abstractC17477i4);
            }
        }
    }

    @Override // p149l.ydk, p149l.mcj, p149l.ccj
    public synchronized void destroy() {
        try {
            super.destroy();
            this.mEffectFilterMap.clear();
            if (this.mFiltersToDestroy.size() > 0) {
                Iterator<ccj> it = this.mFiltersToDestroy.iterator();
                while (it.hasNext()) {
                    it.next().destroy();
                }
                this.mFiltersToDestroy.clear();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // com.momo.mcamera.mask.StickerAdjustFilter.IOrderable
    public int getOrderedIndex() {
        return this.orderedIndex;
    }

    @Override // p149l.ydk, p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        if (this.mFiltersToDestroy.size() > 0) {
            Iterator<ccj> it = this.mFiltersToDestroy.iterator();
            while (it.hasNext()) {
                it.next().destroy();
            }
            this.mFiltersToDestroy.clear();
        }
        super.newTextureReady(i, mcjVar, z);
    }

    @Override // p149l.etf
    public void setMMCVInfo(pjw pjwVar) {
        if (this.mEffectFilterMap.size() == 0) {
            return;
        }
        for (jcj jcjVar : this.mEffectFilterMap.values()) {
            if (jcjVar instanceof etf) {
                ((etf) jcjVar).setMMCVInfo(pjwVar);
            }
        }
    }

    @Override // com.momo.mcamera.mask.StickerAdjustFilter.IOrderable
    public void setOrderedIndex(int i) {
        this.orderedIndex = i;
    }

    public void setRenderFinishListener(EffectRenderFinishListener effectRenderFinishListener) {
        this.mRenderFinishListener = effectRenderFinishListener;
    }

    @Override // p149l.q7m
    public void setTimeStamp(long j) {
        ConcurrentHashMap<String, AbstractC17477i4> concurrentHashMap = this.mEffectFilterMap;
        if (concurrentHashMap == null || concurrentHashMap.size() <= 0) {
            return;
        }
        Iterator<AbstractC17477i4> it = this.mEffectFilterMap.values().iterator();
        while (it.hasNext()) {
            it.next().setTimeStamp(j);
        }
    }
}
