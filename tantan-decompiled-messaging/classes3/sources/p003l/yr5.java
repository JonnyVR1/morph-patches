package p003l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public abstract class yr5 extends zj10 {

    /* JADX INFO: renamed from: e */
    private List<ts2> f9116e;

    /* JADX INFO: renamed from: f */
    private List<mcj> f9117f;

    /* JADX INFO: renamed from: g */
    private List<mcj> f9118g;

    /* JADX INFO: renamed from: i */
    private List<mcj> f9119i;

    public yr5(int i) {
        super(i);
        this.f9116e = new ArrayList();
        this.f9117f = new ArrayList();
        this.f9118g = new ArrayList();
        this.f9119i = new ArrayList();
    }

    /* JADX INFO: renamed from: Q1 */
    public void m9217Q1(mcj mcjVar) {
        if (this.f9119i.contains(mcjVar)) {
            return;
        }
        this.f9119i.add(mcjVar);
    }

    /* JADX INFO: renamed from: R1 */
    public void m9218R1(mcj mcjVar) {
        this.f9117f.add(mcjVar);
        m9217Q1(mcjVar);
    }

    @Override // p003l.xj10, p003l.mcj, p003l.ccj
    public void destroy() {
        super.destroy();
        Iterator<mcj> it = this.f9119i.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
    }

    @Override // p003l.xj10, p003l.ts2, p003l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        if (this.f9118g.contains(mcjVar)) {
            if (this.texturesReceived.contains(mcjVar)) {
                return;
            }
            super.newTextureReady(i, mcjVar, z);
            Iterator<ts2> it = this.f9116e.iterator();
            while (it.hasNext()) {
                it.next().newTextureReady(i, mcjVar, z);
            }
            return;
        }
        if (this.f9117f.contains(mcjVar)) {
            super.newTextureReady(i, mcjVar, z);
            return;
        }
        Iterator<ts2> it2 = this.f9116e.iterator();
        while (it2.hasNext()) {
            it2.next().newTextureReady(i, mcjVar, z);
        }
    }

    public void registerInitialFilter(ts2 ts2Var) {
        this.f9116e.add(ts2Var);
        m9217Q1(ts2Var);
    }

    @Override // p003l.ccj
    public void setRenderSize(int i, int i2) {
        Iterator<mcj> it = this.f9119i.iterator();
        while (it.hasNext()) {
            it.next().setRenderSize(i, i2);
        }
        super.setRenderSize(i, i2);
    }
}
