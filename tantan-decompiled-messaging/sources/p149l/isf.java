package p149l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class isf extends j3w implements fql {

    /* JADX INFO: renamed from: a */
    protected List<kqe> f114756a = new ArrayList();

    /* JADX INFO: renamed from: b */
    protected long f114757b = 0;

    /* JADX INFO: renamed from: c */
    protected boolean f114758c = true;

    /* JADX INFO: renamed from: d */
    protected boolean f114759d = true;

    @Override // p149l.fql
    public void addEffectTimeInfo(kqe kqeVar) {
        List<kqe> list = this.f114756a;
        if (list != null) {
            list.add(kqeVar);
        }
    }

    @Override // p149l.fql
    public void clearEffectTimeInfos() {
        List<kqe> list = this.f114756a;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f114756a.clear();
    }

    @Override // p149l.ccj
    public void onDrawFrame() {
        if (this.f114758c) {
            super.onDrawFrame();
            return;
        }
        List<kqe> list = this.f114756a;
        if (list == null || list.size() <= 0) {
            for (jcj jcjVar : this.targets) {
                if (jcjVar != null) {
                    jcjVar.newTextureReady(this.texture_in, this, true);
                }
            }
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.f114756a.size(); i++) {
            if (this.f114757b >= this.f114756a.get(i).f124252a && this.f114757b <= this.f114756a.get(i).f124253b) {
                super.onDrawFrame();
                this.f114759d = false;
                z = true;
            }
        }
        if (z) {
            return;
        }
        this.f114759d = true;
        for (jcj jcjVar2 : this.targets) {
            if (jcjVar2 != null) {
                jcjVar2.newTextureReady(this.texture_in, this, true);
            }
        }
    }

    @Override // p149l.fql
    public void removeLast(kqe kqeVar) {
        List<kqe> list = this.f114756a;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f114756a.remove(kqeVar);
    }

    @Override // p149l.fql
    public void setGlobalEffect(boolean z) {
        this.f114758c = z;
    }

    @Override // p149l.fql, p149l.q7m
    public void setTimeStamp(long j) {
        this.f114757b = j;
    }
}
