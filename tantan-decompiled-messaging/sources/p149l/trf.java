package p149l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class trf extends sij implements fql {

    /* JADX INFO: renamed from: b */
    protected List<kqe> f171813b;

    /* JADX INFO: renamed from: c */
    protected long f171814c;

    /* JADX INFO: renamed from: d */
    protected boolean f171815d;

    /* JADX INFO: renamed from: e */
    protected boolean f171816e;

    public trf(float f) {
        super(f);
        this.f171813b = new ArrayList();
        this.f171814c = 0L;
        this.f171815d = true;
        this.f171816e = true;
    }

    /* JADX INFO: renamed from: S1 */
    public void m190412S1(float f) {
        this.f164718a = f;
    }

    @Override // p149l.fql
    public void addEffectTimeInfo(kqe kqeVar) {
        List<kqe> list = this.f171813b;
        if (list != null) {
            list.add(kqeVar);
        }
    }

    @Override // p149l.fql
    public void clearEffectTimeInfos() {
        List<kqe> list = this.f171813b;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f171813b.clear();
    }

    @Override // p149l.ccj
    public void onDrawFrame() {
        if (this.f171815d) {
            super.onDrawFrame();
            return;
        }
        List<kqe> list = this.f171813b;
        if (list == null || list.size() <= 0) {
            for (jcj jcjVar : this.targets) {
                if (jcjVar != null) {
                    jcjVar.newTextureReady(this.texture_in, this, true);
                }
            }
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.f171813b.size(); i++) {
            if (this.f171814c >= this.f171813b.get(i).f124252a && this.f171814c <= this.f171813b.get(i).f124253b) {
                super.onDrawFrame();
                this.f171816e = false;
                z = true;
            }
        }
        if (z) {
            return;
        }
        this.f171816e = true;
        for (jcj jcjVar2 : this.targets) {
            if (jcjVar2 != null) {
                jcjVar2.newTextureReady(this.texture_in, this, true);
            }
        }
    }

    @Override // p149l.fql
    public void removeLast(kqe kqeVar) {
        List<kqe> list = this.f171813b;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f171813b.remove(kqeVar);
    }

    @Override // p149l.fql
    public void setGlobalEffect(boolean z) {
        this.f171815d = z;
    }

    @Override // p149l.fql, p149l.q7m
    public void setTimeStamp(long j) {
        this.f171814c = j;
    }
}
