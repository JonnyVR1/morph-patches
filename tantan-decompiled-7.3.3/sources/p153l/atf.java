package p153l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class atf extends llj implements rsl {

    /* JADX INFO: renamed from: b */
    protected List<ore> f73347b;

    /* JADX INFO: renamed from: c */
    protected long f73348c;

    /* JADX INFO: renamed from: d */
    protected boolean f73349d;

    /* JADX INFO: renamed from: e */
    protected boolean f73350e;

    public atf(float f) {
        super(f);
        this.f73347b = new ArrayList();
        this.f73348c = 0L;
        this.f73349d = true;
        this.f73350e = true;
    }

    /* JADX INFO: renamed from: S1 */
    public void m100183S1(float f) {
        this.f132555a = f;
    }

    @Override // p153l.rsl
    public void addEffectTimeInfo(ore oreVar) {
        List<ore> list = this.f73347b;
        if (list != null) {
            list.add(oreVar);
        }
    }

    @Override // p153l.rsl
    public void clearEffectTimeInfos() {
        List<ore> list = this.f73347b;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f73347b.clear();
    }

    @Override // p153l.wej
    public void onDrawFrame() {
        if (this.f73349d) {
            super.onDrawFrame();
            return;
        }
        List<ore> list = this.f73347b;
        if (list == null || list.size() <= 0) {
            for (dfj dfjVar : this.targets) {
                if (dfjVar != null) {
                    dfjVar.newTextureReady(this.texture_in, this, true);
                }
            }
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.f73347b.size(); i++) {
            if (this.f73348c >= this.f73347b.get(i).f148698a && this.f73348c <= this.f73347b.get(i).f148699b) {
                super.onDrawFrame();
                this.f73350e = false;
                z = true;
            }
        }
        if (z) {
            return;
        }
        this.f73350e = true;
        for (dfj dfjVar2 : this.targets) {
            if (dfjVar2 != null) {
                dfjVar2.newTextureReady(this.texture_in, this, true);
            }
        }
    }

    @Override // p153l.rsl
    public void removeLast(ore oreVar) {
        List<ore> list = this.f73347b;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f73347b.remove(oreVar);
    }

    @Override // p153l.rsl
    public void setGlobalEffect(boolean z) {
        this.f73349d = z;
    }

    @Override // p153l.rsl, p153l.gam
    public void setTimeStamp(long j) {
        this.f73348c = j;
    }
}
