package p153l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class nq2 extends hs10 implements rsl {

    /* JADX INFO: renamed from: a */
    protected List<ore> f143161a;

    /* JADX INFO: renamed from: b */
    protected long f143162b;

    /* JADX INFO: renamed from: c */
    protected boolean f143163c;

    /* JADX INFO: renamed from: d */
    protected boolean f143164d;

    public nq2(int i) {
        super(i);
        this.f143161a = new ArrayList();
        this.f143162b = 0L;
        this.f143163c = true;
        this.f143164d = true;
    }

    @Override // p153l.rsl
    public void addEffectTimeInfo(ore oreVar) {
        List<ore> list = this.f143161a;
        if (list != null) {
            list.add(oreVar);
        }
    }

    @Override // p153l.rsl
    public void clearEffectTimeInfos() {
        List<ore> list = this.f143161a;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f143161a.clear();
    }

    @Override // p153l.wej
    public void onDrawFrame() {
        if (this.f143163c) {
            super.onDrawFrame();
            return;
        }
        List<ore> list = this.f143161a;
        if (list == null || list.size() <= 0) {
            for (dfj dfjVar : this.targets) {
                if (dfjVar != null) {
                    dfjVar.newTextureReady(this.texture_in, this, true);
                }
            }
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.f143161a.size(); i++) {
            if (this.f143162b >= this.f143161a.get(i).f148698a && this.f143162b <= this.f143161a.get(i).f148699b) {
                super.onDrawFrame();
                this.f143164d = false;
                z = true;
            }
        }
        if (z) {
            return;
        }
        this.f143164d = true;
        for (dfj dfjVar2 : this.targets) {
            if (dfjVar2 != null) {
                dfjVar2.newTextureReady(this.texture_in, this, true);
            }
        }
    }

    @Override // p153l.rsl
    public void removeLast(ore oreVar) {
        List<ore> list = this.f143161a;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f143161a.remove(oreVar);
    }

    @Override // p153l.rsl
    public void setGlobalEffect(boolean z) {
        this.f143163c = z;
    }

    public void setTimeStamp(long j) {
        this.f143162b = j;
    }
}
