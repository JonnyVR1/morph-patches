package p149l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class yr5 extends zj10 {

    /* JADX INFO: renamed from: e */
    private List<ts2> f199632e;

    /* JADX INFO: renamed from: f */
    private List<mcj> f199633f;

    /* JADX INFO: renamed from: g */
    private List<mcj> f199634g;

    /* JADX INFO: renamed from: i */
    private List<mcj> f199635i;

    public yr5(int i) {
        super(i);
        this.f199632e = new ArrayList();
        this.f199633f = new ArrayList();
        this.f199634g = new ArrayList();
        this.f199635i = new ArrayList();
    }

    /* JADX INFO: renamed from: Q1 */
    public void m215779Q1(mcj mcjVar) {
        if (this.f199635i.contains(mcjVar)) {
            return;
        }
        this.f199635i.add(mcjVar);
    }

    /* JADX INFO: renamed from: R1 */
    public void m215780R1(mcj mcjVar) {
        this.f199633f.add(mcjVar);
        m215779Q1(mcjVar);
    }

    @Override // p149l.xj10, p149l.mcj, p149l.ccj
    public void destroy() {
        super.destroy();
        Iterator<mcj> it = this.f199635i.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
    }

    @Override // p149l.xj10, p149l.ts2, p149l.jcj
    public void newTextureReady(int i, mcj mcjVar, boolean z) {
        if (this.f199634g.contains(mcjVar)) {
            if (this.texturesReceived.contains(mcjVar)) {
                return;
            }
            super.newTextureReady(i, mcjVar, z);
            Iterator<ts2> it = this.f199632e.iterator();
            while (it.hasNext()) {
                it.next().newTextureReady(i, mcjVar, z);
            }
            return;
        }
        if (this.f199633f.contains(mcjVar)) {
            super.newTextureReady(i, mcjVar, z);
            return;
        }
        Iterator<ts2> it2 = this.f199632e.iterator();
        while (it2.hasNext()) {
            it2.next().newTextureReady(i, mcjVar, z);
        }
    }

    public void registerInitialFilter(ts2 ts2Var) {
        this.f199632e.add(ts2Var);
        m215779Q1(ts2Var);
    }

    @Override // p149l.ccj
    public void setRenderSize(int i, int i2) {
        Iterator<mcj> it = this.f199635i.iterator();
        while (it.hasNext()) {
            it.next().setRenderSize(i, i2);
        }
        super.setRenderSize(i, i2);
    }
}
