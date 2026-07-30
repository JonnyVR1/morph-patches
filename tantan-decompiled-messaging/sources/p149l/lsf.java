package p149l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class lsf extends elf0 implements fql {

    /* JADX INFO: renamed from: a */
    protected List<kqe> f129860a = new ArrayList();

    /* JADX INFO: renamed from: b */
    protected long f129861b = 0;

    /* JADX INFO: renamed from: c */
    protected boolean f129862c = true;

    /* JADX INFO: renamed from: d */
    protected boolean f129863d = true;

    @Override // p149l.fql
    public void addEffectTimeInfo(kqe kqeVar) {
        List<kqe> list = this.f129860a;
        if (list != null) {
            list.add(kqeVar);
        }
    }

    @Override // p149l.fql
    public void clearEffectTimeInfos() {
        List<kqe> list = this.f129860a;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f129860a.clear();
    }

    @Override // p149l.ccj
    public void onDrawFrame() {
        if (this.f129862c) {
            super.onDrawFrame();
            return;
        }
        List<kqe> list = this.f129860a;
        if (list == null || list.size() <= 0) {
            for (jcj jcjVar : this.targets) {
                if (jcjVar != null) {
                    jcjVar.newTextureReady(this.texture_in, this, true);
                }
            }
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.f129860a.size(); i++) {
            if (this.f129861b >= this.f129860a.get(i).f124252a && this.f129861b <= this.f129860a.get(i).f124253b) {
                super.onDrawFrame();
                this.f129863d = false;
                z = true;
            }
        }
        if (z) {
            return;
        }
        this.f129863d = true;
        for (jcj jcjVar2 : this.targets) {
            if (jcjVar2 != null) {
                jcjVar2.newTextureReady(this.texture_in, this, true);
            }
        }
    }

    @Override // p149l.fql
    public void removeLast(kqe kqeVar) {
        List<kqe> list = this.f129860a;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.f129860a.remove(kqeVar);
    }

    @Override // p149l.fql
    public void setGlobalEffect(boolean z) {
        this.f129862c = z;
    }

    @Override // p149l.fql, p149l.q7m
    public void setTimeStamp(long j) {
        this.f129861b = j;
    }
}
