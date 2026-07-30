package p003l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class wp2 extends xj10 implements fql {

    /* JADX INFO: renamed from: a */
    protected List<kqe> f8585a;

    /* JADX INFO: renamed from: b */
    protected long f8586b;

    /* JADX INFO: renamed from: c */
    protected boolean f8587c;

    /* JADX INFO: renamed from: d */
    protected boolean f8588d;

    public wp2(int i) {
        super(i);
        this.f8585a = new ArrayList();
        this.f8586b = 0L;
        this.f8587c = true;
        this.f8588d = true;
    }

    @Override // p003l.fql
    public void addEffectTimeInfo(kqe kqeVar) {
        List<kqe> list = this.f8585a;
        if (list != null) {
            list.add(kqeVar);
        }
    }

    @Override // p003l.fql
    public void clearEffectTimeInfos() {
        List<kqe> list = this.f8585a;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f8585a.clear();
    }

    @Override // p003l.ccj
    public void onDrawFrame() {
        if (this.f8587c) {
            super.onDrawFrame();
            return;
        }
        List<kqe> list = this.f8585a;
        if (list == null || list.size() <= 0) {
            for (jcj jcjVar : this.targets) {
                if (jcjVar != null) {
                    jcjVar.newTextureReady(this.texture_in, this, true);
                }
            }
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.f8585a.size(); i++) {
            if (this.f8586b >= this.f8585a.get(i).f5006a && this.f8586b <= this.f8585a.get(i).f5007b) {
                super.onDrawFrame();
                this.f8588d = false;
                z = true;
            }
        }
        if (z) {
            return;
        }
        this.f8588d = true;
        for (jcj jcjVar2 : this.targets) {
            if (jcjVar2 != null) {
                jcjVar2.newTextureReady(this.texture_in, this, true);
            }
        }
    }

    @Override // p003l.fql
    public void removeLast(kqe kqeVar) {
        List<kqe> list = this.f8585a;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f8585a.remove(kqeVar);
    }

    @Override // p003l.fql
    public void setGlobalEffect(boolean z) {
        this.f8587c = z;
    }

    public void setTimeStamp(long j) {
        this.f8586b = j;
    }
}
