package p003l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class asf extends v03 implements fql {

    /* JADX INFO: renamed from: g */
    protected List<kqe> f2269g = new ArrayList();

    /* JADX INFO: renamed from: i */
    protected long f2270i = 0;

    /* JADX INFO: renamed from: j */
    protected boolean f2271j = true;

    /* JADX INFO: renamed from: k */
    protected boolean f2272k = true;

    @Override // p003l.fql
    public void addEffectTimeInfo(kqe kqeVar) {
        List<kqe> list = this.f2269g;
        if (list != null) {
            list.add(kqeVar);
        }
    }

    @Override // p003l.fql
    public void clearEffectTimeInfos() {
        List<kqe> list = this.f2269g;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f2269g.clear();
    }

    @Override // p003l.mcj, p003l.ccj
    public void drawFrame() {
        rbj rbjVar;
        if (this.dirty) {
            drawSub();
        }
        synchronized (this.listLock) {
            try {
                for (jcj jcjVar : this.targets) {
                    if (jcjVar != null && (rbjVar = this.glFrameBuffer) != null) {
                        jcjVar.newTextureReady(rbjVar.m7173i()[0], this, this.dirty);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p003l.ccj
    public void onDrawFrame() {
        if (this.f2271j) {
            super.onDrawFrame();
            return;
        }
        List<kqe> list = this.f2269g;
        if (list == null || list.size() <= 0) {
            for (jcj jcjVar : this.targets) {
                if (jcjVar != null) {
                    jcjVar.newTextureReady(this.texture_in, this, true);
                }
            }
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.f2269g.size(); i++) {
            if (this.f2270i >= this.f2269g.get(i).f5006a && this.f2270i <= this.f2269g.get(i).f5007b) {
                super.onDrawFrame();
                this.f2272k = false;
                z = true;
            }
        }
        if (z) {
            return;
        }
        this.f2272k = true;
        for (jcj jcjVar2 : this.targets) {
            if (jcjVar2 != null) {
                jcjVar2.newTextureReady(this.texture_in, this, true);
            }
        }
    }

    @Override // p003l.fql
    public void removeLast(kqe kqeVar) {
        List<kqe> list = this.f2269g;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f2269g.remove(kqeVar);
    }

    @Override // p003l.fql
    public void setGlobalEffect(boolean z) {
        this.f2271j = z;
    }

    @Override // p003l.fql, p003l.q7m
    public void setTimeStamp(long j) {
        this.f2270i = j;
    }
}
