package p149l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public abstract class aek extends ts2 {

    /* JADX INFO: renamed from: a */
    private List<mcj> f69048a = new ArrayList();

    /* JADX INFO: renamed from: c */
    private List<mcj> f69050c = new ArrayList();

    /* JADX INFO: renamed from: b */
    private List<mcj> f69049b = new ArrayList();

    /* JADX INFO: renamed from: Q1 */
    public synchronized void m96109Q1(mcj mcjVar) {
        if (!this.f69049b.contains(mcjVar)) {
            this.f69049b.add(mcjVar);
        }
    }

    /* JADX INFO: renamed from: R1 */
    public synchronized void m96110R1(mcj mcjVar) {
        this.f69048a.add(mcjVar);
        m96109Q1(mcjVar);
    }

    /* JADX INFO: renamed from: S1 */
    public synchronized void m96111S1(mcj mcjVar) {
        this.f69050c.add(mcjVar);
        m96109Q1(mcjVar);
    }

    /* JADX INFO: renamed from: T1 */
    public synchronized void m96112T1(mcj mcjVar) {
        this.f69048a.remove(mcjVar);
        this.f69049b.remove(mcjVar);
    }

    /* JADX INFO: renamed from: U1 */
    public synchronized void m96113U1(mcj mcjVar) {
        this.f69050c.remove(mcjVar);
        this.f69049b.remove(mcjVar);
    }

    @Override // p149l.mcj, p149l.ccj
    public synchronized void destroy() {
        super.destroy();
        Iterator<mcj> it = this.f69049b.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
    }

    @Override // p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        if (!this.f69050c.contains(mcjVar)) {
            this.glFrameBuffer = mcjVar.glFrameBuffer;
            synchronized (getLockObject()) {
                try {
                    for (Object obj : this.f69048a) {
                        if (obj instanceof jcj) {
                            ((jcj) obj).newTextureReady(i, mcjVar, z);
                        }
                    }
                } catch (Throwable th) {
                    throw th;
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

    @Override // p149l.mcj, p149l.ccj
    public void releaseFrameBuffer() {
        super.releaseFrameBuffer();
        Iterator<mcj> it = this.f69049b.iterator();
        while (it.hasNext()) {
            it.next().releaseFrameBuffer();
        }
    }

    @Override // p149l.ccj
    public void setRenderSize(int i, int i2) {
        Iterator<mcj> it = this.f69049b.iterator();
        while (it.hasNext()) {
            it.next().setRenderSize(i, i2);
        }
    }
}
