package p003l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class vs2 extends uff0 implements fql {
    private Object syncFilter = new Object();
    private List<ts2> initialFilters = new ArrayList();
    private List<ts2> terminalFilters = new ArrayList();
    private List<ts2> filters = new ArrayList();
    private List<fql> innerEffectFilters = new ArrayList();

    @Override // p003l.uff0, p003l.fql
    public void addEffectTimeInfo(kqe kqeVar) {
        super.addEffectTimeInfo(kqeVar);
        Iterator<fql> it = this.innerEffectFilters.iterator();
        while (it.hasNext()) {
            it.next().addEffectTimeInfo(kqeVar);
        }
    }

    @Override // p003l.uff0, p003l.fql
    public void clearEffectTimeInfos() {
        super.clearEffectTimeInfos();
        Iterator<fql> it = this.innerEffectFilters.iterator();
        while (it.hasNext()) {
            it.next().clearEffectTimeInfos();
        }
    }

    @Override // p003l.mcj, p003l.ccj
    public synchronized void destroy() {
        super.destroy();
        Iterator<ts2> it = this.filters.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
    }

    public List<ts2> getInitialFilters() {
        return this.initialFilters;
    }

    public List<ts2> getTerminalFilters() {
        return this.terminalFilters;
    }

    @Override // p003l.AbstractC0341i4, p003l.ts2, p003l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        if (!this.terminalFilters.contains(mcjVar)) {
            this.glFrameBuffer = mcjVar.glFrameBuffer;
            synchronized (getLockObject()) {
                synchronized (this.syncFilter) {
                    try {
                        Iterator<ts2> it = this.initialFilters.iterator();
                        while (it.hasNext()) {
                            it.next().newTextureReady(i, mcjVar, z);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            return;
        }
        setWidth(mcjVar.getWidth());
        setHeight(mcjVar.getHeight());
        synchronized (getLockObject()) {
            try {
                for (jcj jcjVar : getRenderTargets()) {
                    this.glFrameBuffer = mcjVar.glFrameBuffer;
                    jcjVar.newTextureReady(i, this, z);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public synchronized void registerEffectInnerFilter(fql fqlVar) {
        if (!this.innerEffectFilters.contains(fqlVar)) {
            this.innerEffectFilters.add(fqlVar);
        }
    }

    public synchronized void registerFilter(ts2 ts2Var) {
        if (!this.filters.contains(ts2Var)) {
            this.filters.add(ts2Var);
        }
    }

    public synchronized void registerInitialFilter(ts2 ts2Var) {
        synchronized (this.syncFilter) {
            this.initialFilters.add(ts2Var);
            registerFilter(ts2Var);
        }
    }

    public synchronized void registerTerminalFilter(ts2 ts2Var) {
        this.terminalFilters.add(ts2Var);
        registerFilter(ts2Var);
    }

    @Override // p003l.mcj, p003l.ccj
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        Iterator<ts2> it = this.filters.iterator();
        while (it.hasNext()) {
            it.next().releaseFrameBuffer();
        }
    }

    public synchronized void removeFilter(ts2 ts2Var) {
        this.filters.remove(ts2Var);
    }

    public synchronized void removeInitialFilter(ts2 ts2Var) {
        synchronized (this.syncFilter) {
            this.initialFilters.remove(ts2Var);
            this.filters.remove(ts2Var);
        }
    }

    @Override // p003l.uff0, p003l.fql
    public void removeLast(kqe kqeVar) {
        super.removeLast(kqeVar);
        Iterator<fql> it = this.innerEffectFilters.iterator();
        while (it.hasNext()) {
            it.next().removeLast(kqeVar);
        }
    }

    public synchronized void removeTerminalFilter(ts2 ts2Var) {
        this.terminalFilters.remove(ts2Var);
        this.filters.remove(ts2Var);
    }

    @Override // p003l.uff0, p003l.fql
    public void setGlobalEffect(boolean z) {
        super.setGlobalEffect(z);
        Iterator<fql> it = this.innerEffectFilters.iterator();
        while (it.hasNext()) {
            it.next().setGlobalEffect(z);
        }
    }

    @Override // p003l.ccj
    public void setRenderSize(int i, int i2) {
        Iterator<ts2> it = this.filters.iterator();
        while (it.hasNext()) {
            it.next().setRenderSize(i, i2);
        }
    }

    @Override // p003l.uff0, p003l.AbstractC0341i4, p003l.q7m
    public void setTimeStamp(long j) {
        super.setTimeStamp(j);
        Iterator<fql> it = this.innerEffectFilters.iterator();
        while (it.hasNext()) {
            it.next().setTimeStamp(j);
        }
    }
}
