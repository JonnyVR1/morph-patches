package p149l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ydk extends ts2 {
    private Object syncFilter = new Object();
    private List<ts2> initialFilters = new ArrayList();
    private List<ts2> terminalFilters = new ArrayList();
    private List<ts2> filters = new ArrayList();

    @Override // p149l.mcj, p149l.ccj
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

    @Override // p149l.ts2, p149l.jcj
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

    @Override // p149l.mcj, p149l.ccj
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

    public synchronized void removeTerminalFilter(ts2 ts2Var) {
        this.terminalFilters.remove(ts2Var);
        this.filters.remove(ts2Var);
    }

    @Override // p149l.ccj
    public void setRenderSize(int i, int i2) {
        Iterator<ts2> it = this.filters.iterator();
        while (it.hasNext()) {
            it.next().setRenderSize(i, i2);
        }
    }
}
