package p003l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class lsf extends elf0 implements fql {

    /* JADX INFO: renamed from: a */
    protected List<kqe> f5406a = new ArrayList();

    /* JADX INFO: renamed from: b */
    protected long f5407b = 0;

    /* JADX INFO: renamed from: c */
    protected boolean f5408c = true;

    /* JADX INFO: renamed from: d */
    protected boolean f5409d = true;

    @Override // p003l.fql
    public void addEffectTimeInfo(kqe kqeVar) {
        List<kqe> list = this.f5406a;
        if (list != null) {
            list.add(kqeVar);
        }
    }

    @Override // p003l.fql
    public void clearEffectTimeInfos() {
        List<kqe> list = this.f5406a;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f5406a.clear();
    }

    @Override // p003l.ccj
    public void onDrawFrame() {
        if (this.f5408c) {
            super.onDrawFrame();
            return;
        }
        List<kqe> list = this.f5406a;
        if (list == null || list.size() <= 0) {
            for (jcj jcjVar : this.targets) {
                if (jcjVar != null) {
                    jcjVar.newTextureReady(this.texture_in, this, true);
                }
            }
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.f5406a.size(); i++) {
            if (this.f5407b >= this.f5406a.get(i).f5006a && this.f5407b <= this.f5406a.get(i).f5007b) {
                super.onDrawFrame();
                this.f5409d = false;
                z = true;
            }
        }
        if (z) {
            return;
        }
        this.f5409d = true;
        for (jcj jcjVar2 : this.targets) {
            if (jcjVar2 != null) {
                jcjVar2.newTextureReady(this.texture_in, this, true);
            }
        }
    }

    @Override // p003l.fql
    public void removeLast(kqe kqeVar) {
        List<kqe> list = this.f5406a;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f5406a.remove(kqeVar);
    }

    @Override // p003l.fql
    public void setGlobalEffect(boolean z) {
        this.f5408c = z;
    }

    @Override // p003l.fql, p003l.q7m
    public void setTimeStamp(long j) {
        this.f5407b = j;
    }
}
