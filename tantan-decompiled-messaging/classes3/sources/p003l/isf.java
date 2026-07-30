package p003l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class isf extends j3w implements fql {

    /* JADX INFO: renamed from: a */
    protected List<kqe> f4486a = new ArrayList();

    /* JADX INFO: renamed from: b */
    protected long f4487b = 0;

    /* JADX INFO: renamed from: c */
    protected boolean f4488c = true;

    /* JADX INFO: renamed from: d */
    protected boolean f4489d = true;

    @Override // p003l.fql
    public void addEffectTimeInfo(kqe kqeVar) {
        List<kqe> list = this.f4486a;
        if (list != null) {
            list.add(kqeVar);
        }
    }

    @Override // p003l.fql
    public void clearEffectTimeInfos() {
        List<kqe> list = this.f4486a;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f4486a.clear();
    }

    @Override // p003l.ccj
    public void onDrawFrame() {
        if (this.f4488c) {
            super.onDrawFrame();
            return;
        }
        List<kqe> list = this.f4486a;
        if (list == null || list.size() <= 0) {
            for (jcj jcjVar : this.targets) {
                if (jcjVar != null) {
                    jcjVar.newTextureReady(this.texture_in, this, true);
                }
            }
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.f4486a.size(); i++) {
            if (this.f4487b >= this.f4486a.get(i).f5006a && this.f4487b <= this.f4486a.get(i).f5007b) {
                super.onDrawFrame();
                this.f4489d = false;
                z = true;
            }
        }
        if (z) {
            return;
        }
        this.f4489d = true;
        for (jcj jcjVar2 : this.targets) {
            if (jcjVar2 != null) {
                jcjVar2.newTextureReady(this.texture_in, this, true);
            }
        }
    }

    @Override // p003l.fql
    public void removeLast(kqe kqeVar) {
        List<kqe> list = this.f4486a;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f4486a.remove(kqeVar);
    }

    @Override // p003l.fql
    public void setGlobalEffect(boolean z) {
        this.f4488c = z;
    }

    @Override // p003l.fql, p003l.q7m
    public void setTimeStamp(long j) {
        this.f4487b = j;
    }
}
