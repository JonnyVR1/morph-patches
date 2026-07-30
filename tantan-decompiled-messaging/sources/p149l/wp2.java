package p149l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class wp2 extends xj10 implements fql {

    /* JADX INFO: renamed from: a */
    protected List<kqe> f187486a;

    /* JADX INFO: renamed from: b */
    protected long f187487b;

    /* JADX INFO: renamed from: c */
    protected boolean f187488c;

    /* JADX INFO: renamed from: d */
    protected boolean f187489d;

    public wp2(int i) {
        super(i);
        this.f187486a = new ArrayList();
        this.f187487b = 0L;
        this.f187488c = true;
        this.f187489d = true;
    }

    @Override // p149l.fql
    public void addEffectTimeInfo(kqe kqeVar) {
        List<kqe> list = this.f187486a;
        if (list != null) {
            list.add(kqeVar);
        }
    }

    @Override // p149l.fql
    public void clearEffectTimeInfos() {
        List<kqe> list = this.f187486a;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f187486a.clear();
    }

    @Override // p149l.ccj
    public void onDrawFrame() {
        if (this.f187488c) {
            super.onDrawFrame();
            return;
        }
        List<kqe> list = this.f187486a;
        if (list == null || list.size() <= 0) {
            for (jcj jcjVar : this.targets) {
                if (jcjVar != null) {
                    jcjVar.newTextureReady(this.texture_in, this, true);
                }
            }
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.f187486a.size(); i++) {
            if (this.f187487b >= this.f187486a.get(i).f124252a && this.f187487b <= this.f187486a.get(i).f124253b) {
                super.onDrawFrame();
                this.f187489d = false;
                z = true;
            }
        }
        if (z) {
            return;
        }
        this.f187489d = true;
        for (jcj jcjVar2 : this.targets) {
            if (jcjVar2 != null) {
                jcjVar2.newTextureReady(this.texture_in, this, true);
            }
        }
    }

    @Override // p149l.fql
    public void removeLast(kqe kqeVar) {
        List<kqe> list = this.f187486a;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f187486a.remove(kqeVar);
    }

    @Override // p149l.fql
    public void setGlobalEffect(boolean z) {
        this.f187488c = z;
    }

    public void setTimeStamp(long j) {
        this.f187487b = j;
    }
}
