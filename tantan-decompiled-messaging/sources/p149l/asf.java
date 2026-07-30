package p149l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class asf extends v03 implements fql {

    /* JADX INFO: renamed from: g */
    protected List<kqe> f71417g = new ArrayList();

    /* JADX INFO: renamed from: i */
    protected long f71418i = 0;

    /* JADX INFO: renamed from: j */
    protected boolean f71419j = true;

    /* JADX INFO: renamed from: k */
    protected boolean f71420k = true;

    @Override // p149l.fql
    public void addEffectTimeInfo(kqe kqeVar) {
        List<kqe> list = this.f71417g;
        if (list != null) {
            list.add(kqeVar);
        }
    }

    @Override // p149l.fql
    public void clearEffectTimeInfos() {
        List<kqe> list = this.f71417g;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f71417g.clear();
    }

    @Override // p149l.mcj, p149l.ccj
    public void drawFrame() {
        rbj rbjVar;
        if (this.dirty) {
            drawSub();
        }
        synchronized (this.listLock) {
            try {
                for (jcj jcjVar : this.targets) {
                    if (jcjVar != null && (rbjVar = this.glFrameBuffer) != null) {
                        jcjVar.newTextureReady(rbjVar.m178610i()[0], this, this.dirty);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p149l.ccj
    public void onDrawFrame() {
        if (this.f71419j) {
            super.onDrawFrame();
            return;
        }
        List<kqe> list = this.f71417g;
        if (list == null || list.size() <= 0) {
            for (jcj jcjVar : this.targets) {
                if (jcjVar != null) {
                    jcjVar.newTextureReady(this.texture_in, this, true);
                }
            }
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.f71417g.size(); i++) {
            if (this.f71418i >= this.f71417g.get(i).f124252a && this.f71418i <= this.f71417g.get(i).f124253b) {
                super.onDrawFrame();
                this.f71420k = false;
                z = true;
            }
        }
        if (z) {
            return;
        }
        this.f71420k = true;
        for (jcj jcjVar2 : this.targets) {
            if (jcjVar2 != null) {
                jcjVar2.newTextureReady(this.texture_in, this, true);
            }
        }
    }

    @Override // p149l.fql
    public void removeLast(kqe kqeVar) {
        List<kqe> list = this.f71417g;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f71417g.remove(kqeVar);
    }

    @Override // p149l.fql
    public void setGlobalEffect(boolean z) {
        this.f71419j = z;
    }

    @Override // p149l.fql, p149l.q7m
    public void setTimeStamp(long j) {
        this.f71418i = j;
    }
}
