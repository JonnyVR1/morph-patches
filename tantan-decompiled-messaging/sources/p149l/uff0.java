package p149l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class uff0 extends AbstractC17477i4 implements fql {
    protected List<kqe> mEffectTimeList = new ArrayList();
    protected long mCurrentTime = 0;
    protected boolean mGlobalEffect = true;
    protected boolean isFirstTime = true;

    @Override // p149l.fql
    public void addEffectTimeInfo(kqe kqeVar) {
        List<kqe> list = this.mEffectTimeList;
        if (list != null) {
            list.add(kqeVar);
        }
    }

    @Override // p149l.fql
    public void clearEffectTimeInfos() {
        List<kqe> list = this.mEffectTimeList;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.mEffectTimeList.clear();
    }

    public List<kqe> getEffectTimeList() {
        ArrayList arrayList = new ArrayList(this.mEffectTimeList.size());
        Collections.copy(arrayList, this.mEffectTimeList);
        return arrayList;
    }

    public Object getFilterTag() {
        return getClass();
    }

    @Override // p149l.ccj
    public void onDrawFrame() {
        if (this.mGlobalEffect) {
            super.onDrawFrame();
            return;
        }
        List<kqe> list = this.mEffectTimeList;
        if (list == null || list.size() <= 0) {
            for (jcj jcjVar : this.targets) {
                if (jcjVar != null) {
                    jcjVar.newTextureReady(this.texture_in, this, true);
                }
            }
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.mEffectTimeList.size(); i++) {
            if (this.mCurrentTime >= this.mEffectTimeList.get(i).f124252a && this.mCurrentTime <= this.mEffectTimeList.get(i).f124253b) {
                super.onDrawFrame();
                this.isFirstTime = false;
                z = true;
            }
        }
        if (z) {
            return;
        }
        this.isFirstTime = true;
        for (jcj jcjVar2 : this.targets) {
            if (jcjVar2 != null) {
                jcjVar2.newTextureReady(this.texture_in, this, true);
            }
        }
    }

    @Override // p149l.fql
    public void removeLast(kqe kqeVar) {
        List<kqe> list = this.mEffectTimeList;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.mEffectTimeList.remove(kqeVar);
    }

    @Override // p149l.fql
    public void setGlobalEffect(boolean z) {
        this.mGlobalEffect = z;
    }

    @Override // p149l.AbstractC17477i4, p149l.q7m
    public void setTimeStamp(long j) {
        this.mCurrentTime = j;
    }

    public ts2 getBasicFilter() {
        return this;
    }
}
