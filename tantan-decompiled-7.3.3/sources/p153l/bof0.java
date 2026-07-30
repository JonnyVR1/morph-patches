package p153l;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class bof0 extends AbstractC17634i4 implements rsl {
    protected List<ore> mEffectTimeList = new ArrayList();
    protected long mCurrentTime = 0;
    protected boolean mGlobalEffect = true;
    protected boolean isFirstTime = true;

    @Override // p153l.rsl
    public void addEffectTimeInfo(ore oreVar) {
        List<ore> list = this.mEffectTimeList;
        if (list != null) {
            list.add(oreVar);
        }
    }

    @Override // p153l.rsl
    public void clearEffectTimeInfos() {
        List<ore> list = this.mEffectTimeList;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.mEffectTimeList.clear();
    }

    public List<ore> getEffectTimeList() {
        ArrayList arrayList = new ArrayList(this.mEffectTimeList.size());
        Collections.copy(arrayList, this.mEffectTimeList);
        return arrayList;
    }

    public Object getFilterTag() {
        return getClass();
    }

    @Override // p153l.wej
    public void onDrawFrame() {
        if (this.mGlobalEffect) {
            super.onDrawFrame();
            return;
        }
        List<ore> list = this.mEffectTimeList;
        if (list == null || list.size() <= 0) {
            for (dfj dfjVar : this.targets) {
                if (dfjVar != null) {
                    dfjVar.newTextureReady(this.texture_in, this, true);
                }
            }
            return;
        }
        boolean z = false;
        for (int i = 0; i < this.mEffectTimeList.size(); i++) {
            if (this.mCurrentTime >= this.mEffectTimeList.get(i).f148698a && this.mCurrentTime <= this.mEffectTimeList.get(i).f148699b) {
                super.onDrawFrame();
                this.isFirstTime = false;
                z = true;
            }
        }
        if (z) {
            return;
        }
        this.isFirstTime = true;
        for (dfj dfjVar2 : this.targets) {
            if (dfjVar2 != null) {
                dfjVar2.newTextureReady(this.texture_in, this, true);
            }
        }
    }

    @Override // p153l.rsl
    public void removeLast(ore oreVar) {
        List<ore> list = this.mEffectTimeList;
        if (list == null || list.size() <= 0) {
            return;
        }
        this.mEffectTimeList.remove(oreVar);
    }

    @Override // p153l.rsl
    public void setGlobalEffect(boolean z) {
        this.mGlobalEffect = z;
    }

    @Override // p153l.AbstractC17634i4, p153l.gam
    public void setTimeStamp(long j) {
        this.mCurrentTime = j;
    }

    public jt2 getBasicFilter() {
        return this;
    }
}
