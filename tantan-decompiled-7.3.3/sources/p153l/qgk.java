package p153l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public abstract class qgk extends jt2 {

    /* JADX INFO: renamed from: a */
    private List<gfj> f157421a = new ArrayList();

    /* JADX INFO: renamed from: c */
    private List<gfj> f157423c = new ArrayList();

    /* JADX INFO: renamed from: b */
    private List<gfj> f157422b = new ArrayList();

    /* JADX INFO: renamed from: Q1 */
    public synchronized void m176491Q1(gfj gfjVar) {
        if (!this.f157422b.contains(gfjVar)) {
            this.f157422b.add(gfjVar);
        }
    }

    /* JADX INFO: renamed from: R1 */
    public synchronized void m176492R1(gfj gfjVar) {
        this.f157421a.add(gfjVar);
        m176491Q1(gfjVar);
    }

    /* JADX INFO: renamed from: S1 */
    public synchronized void m176493S1(gfj gfjVar) {
        this.f157423c.add(gfjVar);
        m176491Q1(gfjVar);
    }

    /* JADX INFO: renamed from: T1 */
    public synchronized void m176494T1(gfj gfjVar) {
        this.f157421a.remove(gfjVar);
        this.f157422b.remove(gfjVar);
    }

    /* JADX INFO: renamed from: U1 */
    public synchronized void m176495U1(gfj gfjVar) {
        this.f157423c.remove(gfjVar);
        this.f157422b.remove(gfjVar);
    }

    @Override // p153l.gfj, p153l.wej
    public synchronized void destroy() {
        super.destroy();
        Iterator<gfj> it = this.f157422b.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
    }

    @Override // p153l.jt2, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        if (!this.f157423c.contains(gfjVar)) {
            this.glFrameBuffer = gfjVar.glFrameBuffer;
            synchronized (getLockObject()) {
                try {
                    for (Object obj : this.f157421a) {
                        if (obj instanceof dfj) {
                            ((dfj) obj).newTextureReady(i, gfjVar, z);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
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

    @Override // p153l.gfj, p153l.wej
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        Iterator<gfj> it = this.f157422b.iterator();
        while (it.hasNext()) {
            it.next().releaseFrameBuffer();
        }
    }

    @Override // p153l.wej
    public void setRenderSize(int i, int i2) {
        Iterator<gfj> it = this.f157422b.iterator();
        while (it.hasNext()) {
            it.next().setRenderSize(i, i2);
        }
    }
}
