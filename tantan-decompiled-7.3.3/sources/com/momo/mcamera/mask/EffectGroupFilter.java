package com.momo.mcamera.mask;

import com.momo.mcamera.filtermanager.EffectFilterCreator;
import com.momo.mcamera.mask.bean.EffectFilterItem;
import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import p153l.AbstractC17634i4;
import p153l.gam;
import p153l.gfj;
import p153l.jt2;
import p153l.ogk;
import p153l.omw;
import p153l.ssl;
import p153l.suf;
import p153l.wej;
import project.android.imageprocessing.model.FilterOptions;

/* JADX INFO: loaded from: classes8.dex */
public class EffectGroupFilter extends ogk implements suf, gam, StickerAdjustFilter.IOrderable {
    private ConcurrentHashMap<String, AbstractC17634i4> mEffectFilterMap;
    private CopyOnWriteArrayList<wej> mFiltersToDestroy;
    private NormalFilter mNormalFilter;
    private EffectRenderFinishListener mRenderFinishListener;
    private jt2 mTerminalFilter;
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

    private void addTerminalFilter(AbstractC17634i4 abstractC17634i4) {
        this.mTerminalFilter.removeTarget(this);
        this.mTerminalFilter.addTarget(abstractC17634i4);
        jt2 jt2Var = this.mTerminalFilter;
        abstractC17634i4.parentFilter = jt2Var;
        removeTerminalFilter(jt2Var);
        registerFilter(this.mTerminalFilter);
        this.mTerminalFilter = abstractC17634i4;
        abstractC17634i4.addTarget(this);
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
    public void removeEffectFilter(AbstractC17634i4 abstractC17634i4) {
        EffectRenderFinishListener effectRenderFinishListener;
        jt2 jt2Var = abstractC17634i4.parentFilter;
        jt2Var.removeTarget(abstractC17634i4);
        if (this.mTerminalFilter == abstractC17634i4) {
            removeTerminalFilter(abstractC17634i4);
            registerTerminalFilter(jt2Var);
            jt2Var.addTarget(this);
            this.mTerminalFilter = jt2Var;
        } else {
            removeFilter(abstractC17634i4);
            jt2 jt2Var2 = (jt2) abstractC17634i4.getTargets().get(0);
            abstractC17634i4.removeTarget(jt2Var2);
            jt2Var2.parentFilter = jt2Var;
            jt2Var.addTarget(jt2Var2);
        }
        this.mFiltersToDestroy.add(abstractC17634i4);
        this.mEffectFilterMap.remove(abstractC17634i4.getFilterOptions().getName());
        if (this.mEffectFilterMap.size() != 0 || (effectRenderFinishListener = this.mRenderFinishListener) == null) {
            return;
        }
        effectRenderFinishListener.onRenderFinish();
    }

    public void addEffectFilterItem(EffectFilterItem effectFilterItem) {
        AbstractC17634i4 abstractC17634i4 = this.mEffectFilterMap.get(effectFilterItem.getName());
        long duration = StickerAdjustFilter.DEFAULT_LONG_DURATION;
        if (abstractC17634i4 == null) {
            final AbstractC17634i4 processFilter = EffectFilterCreator.getProcessFilter(effectFilterItem);
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
            processFilter.setRenderFinishListener(new ssl() { // from class: com.momo.mcamera.mask.EffectGroupFilter.1
                @Override // p153l.ssl
                public void onRenderFinish() {
                    EffectGroupFilter.this.removeEffectFilter(processFilter);
                }
            });
            return;
        }
        if (effectFilterItem.getImageFolderPath() != null && effectFilterItem.getImageFolderPath().equals(abstractC17634i4.getFilterOptions().getImageFolderPath())) {
            abstractC17634i4.setDuration((abstractC17634i4.getDuration() - abstractC17634i4.getEscapedTime()) + effectFilterItem.getDuration());
            return;
        }
        FilterOptions filterOptions = EffectFilterCreator.getFilterOptions(effectFilterItem);
        if (filterOptions != null) {
            abstractC17634i4.resetFilterOptions(filterOptions);
            if (effectFilterItem.getDuration() > 0) {
                duration = effectFilterItem.getDuration();
            }
            abstractC17634i4.setDuration(duration);
        }
    }

    public void clearAll() {
        clearWithModelType(-1);
    }

    public void clearWithModelType(int i) {
        if (this.mEffectFilterMap.size() == 0) {
            return;
        }
        for (AbstractC17634i4 abstractC17634i4 : this.mEffectFilterMap.values()) {
            if (i == -1 || abstractC17634i4.getFilterOptions().getModelType() == i) {
                removeEffectFilter(abstractC17634i4);
            }
        }
    }

    @Override // p153l.ogk, p153l.gfj, p153l.wej
    public synchronized void destroy() {
        try {
            super.destroy();
            this.mEffectFilterMap.clear();
            if (this.mFiltersToDestroy.size() > 0) {
                Iterator<wej> it = this.mFiltersToDestroy.iterator();
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

    @Override // p153l.ogk, p153l.jt2, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        if (this.mFiltersToDestroy.size() > 0) {
            Iterator<wej> it = this.mFiltersToDestroy.iterator();
            while (it.hasNext()) {
                it.next().destroy();
            }
            this.mFiltersToDestroy.clear();
        }
        super.newTextureReady(i, gfjVar, z);
    }

    @Override // p153l.suf
    public void setMMCVInfo(omw omwVar) {
        if (this.mEffectFilterMap.size() == 0) {
            return;
        }
        for (gam gamVar : this.mEffectFilterMap.values()) {
            if (gamVar instanceof suf) {
                ((suf) gamVar).setMMCVInfo(omwVar);
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

    @Override // p153l.gam
    public void setTimeStamp(long j) {
        ConcurrentHashMap<String, AbstractC17634i4> concurrentHashMap = this.mEffectFilterMap;
        if (concurrentHashMap == null || concurrentHashMap.size() <= 0) {
            return;
        }
        Iterator<AbstractC17634i4> it = this.mEffectFilterMap.values().iterator();
        while (it.hasNext()) {
            it.next().setTimeStamp(j);
        }
    }
}
