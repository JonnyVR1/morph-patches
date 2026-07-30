package p153l;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class ct5 extends js10 {

    /* JADX INFO: renamed from: e */
    private List<jt2> f83662e;

    /* JADX INFO: renamed from: f */
    private List<gfj> f83663f;

    /* JADX INFO: renamed from: g */
    private List<gfj> f83664g;

    /* JADX INFO: renamed from: i */
    private List<gfj> f83665i;

    public ct5(int i) {
        super(i);
        this.f83662e = new ArrayList();
        this.f83663f = new ArrayList();
        this.f83664g = new ArrayList();
        this.f83665i = new ArrayList();
    }

    /* JADX INFO: renamed from: Q1 */
    public void m112445Q1(gfj gfjVar) {
        if (this.f83665i.contains(gfjVar)) {
            return;
        }
        this.f83665i.add(gfjVar);
    }

    /* JADX INFO: renamed from: R1 */
    public void m112446R1(gfj gfjVar) {
        this.f83663f.add(gfjVar);
        m112445Q1(gfjVar);
    }

    @Override // p153l.hs10, p153l.gfj, p153l.wej
    public void destroy() {
        super.destroy();
        Iterator<gfj> it = this.f83665i.iterator();
        while (it.hasNext()) {
            it.next().destroy();
        }
    }

    @Override // p153l.hs10, p153l.jt2, p153l.dfj
    public void newTextureReady(int i, gfj gfjVar, boolean z) {
        if (this.f83664g.contains(gfjVar)) {
            if (this.texturesReceived.contains(gfjVar)) {
                return;
            }
            super.newTextureReady(i, gfjVar, z);
            Iterator<jt2> it = this.f83662e.iterator();
            while (it.hasNext()) {
                it.next().newTextureReady(i, gfjVar, z);
            }
            return;
        }
        if (this.f83663f.contains(gfjVar)) {
            super.newTextureReady(i, gfjVar, z);
            return;
        }
        Iterator<jt2> it2 = this.f83662e.iterator();
        while (it2.hasNext()) {
            it2.next().newTextureReady(i, gfjVar, z);
        }
    }

    public void registerInitialFilter(jt2 jt2Var) {
        this.f83662e.add(jt2Var);
        m112445Q1(jt2Var);
    }

    @Override // p153l.wej
    public void setRenderSize(int i, int i2) {
        Iterator<gfj> it = this.f83665i.iterator();
        while (it.hasNext()) {
            it.next().setRenderSize(i, i2);
        }
        super.setRenderSize(i, i2);
    }
}
