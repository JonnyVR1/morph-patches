package p153l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ktf extends n760 implements rsl {

    /* JADX INFO: renamed from: a */
    protected List<ore> f128682a = new ArrayList();

    /* JADX INFO: renamed from: b */
    protected long f128683b = 0;

    /* JADX INFO: renamed from: c */
    protected boolean f128684c = true;

    /* JADX INFO: renamed from: d */
    protected boolean f128685d = true;

    @Override // p153l.rsl
    public void addEffectTimeInfo(ore oreVar) {
        List<ore> list = this.f128682a;
        if (list != null) {
            list.add(oreVar);
        }
    }

    @Override // p153l.rsl
    public void clearEffectTimeInfos() {
        List<ore> list = this.f128682a;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f128682a.clear();
    }

    @Override // p153l.wej
    public void onDrawFrame() {
        if (this.f128684c) {
            super.onDrawFrame();
            return;
        }
        List<ore> list = this.f128682a;
        if (list == null || list.size() <= 0) {
            for (dfj dfjVar : this.targets) {
                if (dfjVar != null) {
                    dfjVar.newTextureReady(this.texture_in, this, true);
                }
            }
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.f128682a.size(); i++) {
            if (this.f128683b >= this.f128682a.get(i).f148698a && this.f128683b <= this.f128682a.get(i).f148699b) {
                super.onDrawFrame();
                this.f128685d = false;
                z = true;
            }
        }
        if (z) {
            return;
        }
        this.f128685d = true;
        for (dfj dfjVar2 : this.targets) {
            if (dfjVar2 != null) {
                dfjVar2.newTextureReady(this.texture_in, this, true);
            }
        }
    }

    @Override // p153l.rsl
    public void removeLast(ore oreVar) {
        List<ore> list = this.f128682a;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f128682a.remove(oreVar);
    }

    @Override // p153l.rsl
    public void setGlobalEffect(boolean z) {
        this.f128684c = z;
    }

    @Override // p153l.rsl, p153l.gam
    public void setTimeStamp(long j) {
        this.f128683b = j;
    }
}
