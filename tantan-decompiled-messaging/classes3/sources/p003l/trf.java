package p003l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class trf extends sij implements fql {

    /* JADX INFO: renamed from: b */
    protected List<kqe> f7711b;

    /* JADX INFO: renamed from: c */
    protected long f7712c;

    /* JADX INFO: renamed from: d */
    protected boolean f7713d;

    /* JADX INFO: renamed from: e */
    protected boolean f7714e;

    public trf(float f) {
        super(f);
        this.f7711b = new ArrayList();
        this.f7712c = 0L;
        this.f7713d = true;
        this.f7714e = true;
    }

    /* JADX INFO: renamed from: S1 */
    public void m7973S1(float f) {
        this.f7263a = f;
    }

    @Override // p003l.fql
    public void addEffectTimeInfo(kqe kqeVar) {
        List<kqe> list = this.f7711b;
        if (list != null) {
            list.add(kqeVar);
        }
    }

    @Override // p003l.fql
    public void clearEffectTimeInfos() {
        List<kqe> list = this.f7711b;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f7711b.clear();
    }

    @Override // p003l.ccj
    public void onDrawFrame() {
        if (this.f7713d) {
            super.onDrawFrame();
            return;
        }
        List<kqe> list = this.f7711b;
        if (list == null || list.size() <= 0) {
            for (jcj jcjVar : this.targets) {
                if (jcjVar != null) {
                    jcjVar.newTextureReady(this.texture_in, this, true);
                }
            }
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.f7711b.size(); i++) {
            if (this.f7712c >= this.f7711b.get(i).f5006a && this.f7712c <= this.f7711b.get(i).f5007b) {
                super.onDrawFrame();
                this.f7714e = false;
                z = true;
            }
        }
        if (z) {
            return;
        }
        this.f7714e = true;
        for (jcj jcjVar2 : this.targets) {
            if (jcjVar2 != null) {
                jcjVar2.newTextureReady(this.texture_in, this, true);
            }
        }
    }

    @Override // p003l.fql
    public void removeLast(kqe kqeVar) {
        List<kqe> list = this.f7711b;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f7711b.remove(kqeVar);
    }

    @Override // p003l.fql
    public void setGlobalEffect(boolean z) {
        this.f7713d = z;
    }

    @Override // p003l.fql, p003l.q7m
    public void setTimeStamp(long j) {
        this.f7712c = j;
    }
}
