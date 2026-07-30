package p153l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class lt2 extends bof0 implements rsl {
    private Object syncFilter = new Object();
    private List<jt2> initialFilters = new ArrayList();
    private List<jt2> terminalFilters = new ArrayList();
    private List<jt2> filters = new ArrayList();
    private List<rsl> innerEffectFilters = new ArrayList();

    @Override // p153l.bof0, p153l.rsl
    public void addEffectTimeInfo(ore oreVar) {
        super.addEffectTimeInfo(oreVar);
        Iterator<rsl> it = this.innerEffectFilters.iterator();
        while (it.hasNext()) {
            it.next().addEffectTimeInfo(oreVar);
        }
    }

    @Override // p153l.bof0, p153l.rsl
    public void clearEffectTimeInfos() {
        super.clearEffectTimeInfos();
        Iterator<rsl> it = this.innerEffectFilters.iterator();
        while (it.hasNext()) {
            it.next().clearEffectTimeInfos();
        }
    }

    @Override // p153l.gfj, p153l.wej
    public synchronized void destroy() {
        super.destroy();
        Iterator<jt2> it = this.filters.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
    }

    public List<jt2> getInitialFilters() {
        return this.initialFilters;
    }

    public List<jt2> getTerminalFilters() {
        return this.terminalFilters;
    }

    @Override // p153l.AbstractC17634i4, p153l.jt2, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        if (!this.terminalFilters.contains(gfjVar)) {
            this.glFrameBuffer = gfjVar.glFrameBuffer;
            synchronized (getLockObject()) {
                synchronized (this.syncFilter) {
                    try {
                        Iterator<jt2> it = this.initialFilters.iterator();
                        while (it.hasNext()) {
                            it.next().newTextureReady(i, gfjVar, z);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return;
        }
        setWidth(gfjVar.getWidth());
        setHeight(gfjVar.getHeight());
        synchronized (getLockObject()) {
            try {
                for (dfj dfjVar : getRenderTargets()) {
                    this.glFrameBuffer = gfjVar.glFrameBuffer;
                    dfjVar.newTextureReady(i, this, z);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void registerEffectInnerFilter(rsl rslVar) {
        if (!this.innerEffectFilters.contains(rslVar)) {
            this.innerEffectFilters.add(rslVar);
        }
    }

    public synchronized void registerFilter(jt2 jt2Var) {
        if (!this.filters.contains(jt2Var)) {
            this.filters.add(jt2Var);
        }
    }

    public synchronized void registerInitialFilter(jt2 jt2Var) {
        synchronized (this.syncFilter) {
            this.initialFilters.add(jt2Var);
            registerFilter(jt2Var);
        }
    }

    public synchronized void registerTerminalFilter(jt2 jt2Var) {
        this.terminalFilters.add(jt2Var);
        registerFilter(jt2Var);
    }

    @Override // p153l.gfj, p153l.wej
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        Iterator<jt2> it = this.filters.iterator();
        while (it.hasNext()) {
            it.next().releaseFrameBuffer();
        }
    }

    public synchronized void removeFilter(jt2 jt2Var) {
        this.filters.remove(jt2Var);
    }

    public synchronized void removeInitialFilter(jt2 jt2Var) {
        synchronized (this.syncFilter) {
            this.initialFilters.remove(jt2Var);
            this.filters.remove(jt2Var);
        }
    }

    @Override // p153l.bof0, p153l.rsl
    public void removeLast(ore oreVar) {
        super.removeLast(oreVar);
        Iterator<rsl> it = this.innerEffectFilters.iterator();
        while (it.hasNext()) {
            it.next().removeLast(oreVar);
        }
    }

    public synchronized void removeTerminalFilter(jt2 jt2Var) {
        this.terminalFilters.remove(jt2Var);
        this.filters.remove(jt2Var);
    }

    @Override // p153l.bof0, p153l.rsl
    public void setGlobalEffect(boolean z) {
        super.setGlobalEffect(z);
        Iterator<rsl> it = this.innerEffectFilters.iterator();
        while (it.hasNext()) {
            it.next().setGlobalEffect(z);
        }
    }

    @Override // p153l.wej
    public void setRenderSize(int i, int i2) {
        Iterator<jt2> it = this.filters.iterator();
        while (it.hasNext()) {
            it.next().setRenderSize(i, i2);
        }
    }

    @Override // p153l.bof0, p153l.AbstractC17634i4, p153l.gam
    public void setTimeStamp(long j) {
        super.setTimeStamp(j);
        Iterator<rsl> it = this.innerEffectFilters.iterator();
        while (it.hasNext()) {
            it.next().setTimeStamp(j);
        }
    }
}
