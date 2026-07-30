package p153l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ptf extends h5w implements rsl {

    /* JADX INFO: renamed from: a */
    protected List<ore> f154040a = new ArrayList();

    /* JADX INFO: renamed from: b */
    protected long f154041b = 0;

    /* JADX INFO: renamed from: c */
    protected boolean f154042c = true;

    /* JADX INFO: renamed from: d */
    protected boolean f154043d = true;

    @Override // p153l.rsl
    public void addEffectTimeInfo(ore oreVar) {
        List<ore> list = this.f154040a;
        if (list != null) {
            list.add(oreVar);
        }
    }

    @Override // p153l.rsl
    public void clearEffectTimeInfos() {
        List<ore> list = this.f154040a;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f154040a.clear();
    }

    @Override // p153l.wej
    public void onDrawFrame() {
        if (this.f154042c) {
            super.onDrawFrame();
            return;
        }
        List<ore> list = this.f154040a;
        if (list == null || list.size() <= 0) {
            for (dfj dfjVar : this.targets) {
                if (dfjVar != null) {
                    dfjVar.newTextureReady(this.texture_in, this, true);
                }
            }
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.f154040a.size(); i++) {
            if (this.f154041b >= this.f154040a.get(i).f148698a && this.f154041b <= this.f154040a.get(i).f148699b) {
                super.onDrawFrame();
                this.f154043d = false;
                z = true;
            }
        }
        if (z) {
            return;
        }
        this.f154043d = true;
        for (dfj dfjVar2 : this.targets) {
            if (dfjVar2 != null) {
                dfjVar2.newTextureReady(this.texture_in, this, true);
            }
        }
    }

    @Override // p153l.rsl
    public void removeLast(ore oreVar) {
        List<ore> list = this.f154040a;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f154040a.remove(oreVar);
    }

    @Override // p153l.rsl
    public void setGlobalEffect(boolean z) {
        this.f154042c = z;
    }

    @Override // p153l.rsl, p153l.gam
    public void setTimeStamp(long j) {
        this.f154041b = j;
    }
}
