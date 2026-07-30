package p153l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class htf extends k13 implements rsl {

    /* JADX INFO: renamed from: g */
    protected List<ore> f111530g = new ArrayList();

    /* JADX INFO: renamed from: i */
    protected long f111531i = 0;

    /* JADX INFO: renamed from: j */
    protected boolean f111532j = true;

    /* JADX INFO: renamed from: k */
    protected boolean f111533k = true;

    @Override // p153l.rsl
    public void addEffectTimeInfo(ore oreVar) {
        List<ore> list = this.f111530g;
        if (list != null) {
            list.add(oreVar);
        }
    }

    @Override // p153l.rsl
    public void clearEffectTimeInfos() {
        List<ore> list = this.f111530g;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f111530g.clear();
    }

    @Override // p153l.gfj, p153l.wej
    public void drawFrame() {
        lej lejVar;
        if (this.dirty) {
            drawSub();
        }
        synchronized (this.listLock) {
            try {
                for (dfj dfjVar : this.targets) {
                    if (dfjVar != null && (lejVar = this.glFrameBuffer) != null) {
                        dfjVar.newTextureReady(lejVar.m153902i()[0], this, this.dirty);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p153l.wej
    public void onDrawFrame() {
        if (this.f111532j) {
            super.onDrawFrame();
            return;
        }
        List<ore> list = this.f111530g;
        if (list == null || list.size() <= 0) {
            for (dfj dfjVar : this.targets) {
                if (dfjVar != null) {
                    dfjVar.newTextureReady(this.texture_in, this, true);
                }
            }
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.f111530g.size(); i++) {
            if (this.f111531i >= this.f111530g.get(i).f148698a && this.f111531i <= this.f111530g.get(i).f148699b) {
                super.onDrawFrame();
                this.f111533k = false;
                z = true;
            }
        }
        if (z) {
            return;
        }
        this.f111533k = true;
        for (dfj dfjVar2 : this.targets) {
            if (dfjVar2 != null) {
                dfjVar2.newTextureReady(this.texture_in, this, true);
            }
        }
    }

    @Override // p153l.rsl
    public void removeLast(ore oreVar) {
        List<ore> list = this.f111530g;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f111530g.remove(oreVar);
    }

    @Override // p153l.rsl
    public void setGlobalEffect(boolean z) {
        this.f111532j = z;
    }

    @Override // p153l.rsl, p153l.gam
    public void setTimeStamp(long j) {
        this.f111531i = j;
    }
}
