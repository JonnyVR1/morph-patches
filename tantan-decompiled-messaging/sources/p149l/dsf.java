package p149l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class dsf extends iz50 implements fql {

    /* JADX INFO: renamed from: a */
    protected List<kqe> f87759a = new ArrayList();

    /* JADX INFO: renamed from: b */
    protected long f87760b = 0;

    /* JADX INFO: renamed from: c */
    protected boolean f87761c = true;

    /* JADX INFO: renamed from: d */
    protected boolean f87762d = true;

    @Override // p149l.fql
    public void addEffectTimeInfo(kqe kqeVar) {
        List<kqe> list = this.f87759a;
        if (list != null) {
            list.add(kqeVar);
        }
    }

    @Override // p149l.fql
    public void clearEffectTimeInfos() {
        List<kqe> list = this.f87759a;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f87759a.clear();
    }

    @Override // p149l.ccj
    public void onDrawFrame() {
        if (this.f87761c) {
            super.onDrawFrame();
            return;
        }
        List<kqe> list = this.f87759a;
        if (list == null || list.size() <= 0) {
            for (jcj jcjVar : this.targets) {
                if (jcjVar != null) {
                    jcjVar.newTextureReady(this.texture_in, this, true);
                }
            }
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.f87759a.size(); i++) {
            if (this.f87760b >= this.f87759a.get(i).f124252a && this.f87760b <= this.f87759a.get(i).f124253b) {
                super.onDrawFrame();
                this.f87762d = false;
                z = true;
            }
        }
        if (z) {
            return;
        }
        this.f87762d = true;
        for (jcj jcjVar2 : this.targets) {
            if (jcjVar2 != null) {
                jcjVar2.newTextureReady(this.texture_in, this, true);
            }
        }
    }

    @Override // p149l.fql
    public void removeLast(kqe kqeVar) {
        List<kqe> list = this.f87759a;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f87759a.remove(kqeVar);
    }

    @Override // p149l.fql
    public void setGlobalEffect(boolean z) {
        this.f87761c = z;
    }

    @Override // p149l.fql, p149l.q7m
    public void setTimeStamp(long j) {
        this.f87760b = j;
    }
}
