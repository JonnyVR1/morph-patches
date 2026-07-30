package p153l;

import android.text.TextUtils;
import com.p051p1.mobile.putong.live.base.data.BLiveAbsData;

/* JADX INFO: loaded from: classes5.dex */
public class jlm0 extends rwn0 {
    public jlm0(szn0 szn0Var, ajt ajtVar) {
        super(szn0Var, ajtVar);
    }

    @Override // p153l.oo2
    /* JADX INFO: renamed from: F0 */
    public int mo146094F0() {
        return 1;
    }

    /* JADX INFO: renamed from: T3 */
    public void m146095T3(String str) {
        if (str == null) {
            return;
        }
        this.f165204a0 = str;
    }

    @Override // p153l.oo2
    /* JADX INFO: renamed from: e2 */
    public void mo146096e2(boolean z, BLiveAbsData bLiveAbsData) {
        BLiveAbsData bLiveAbsData2 = this.f148278v;
        if (bLiveAbsData2 == null || !TextUtils.equals(bLiveAbsData.f45171id, bLiveAbsData2.f45171id)) {
            super.mo146096e2(z, bLiveAbsData);
        } else if (this.f165194Q && this.f165196S) {
            mo118372O1(z, bLiveAbsData.f45171id, bLiveAbsData.room.f45267id);
            this.f165196S = false;
        }
    }

    @Override // p153l.rwn0, p153l.vp20
    /* JADX INFO: renamed from: p */
    public boolean mo118373p() {
        return true;
    }
}
