package p149l;

import android.text.TextUtils;
import com.p046p1.mobile.putong.live.base.data.BLiveAbsData;

/* JADX INFO: loaded from: classes5.dex */
public class fcm0 extends nnn0 {
    public fcm0(oqn0 oqn0Var, zgt zgtVar) {
        super(oqn0Var, zgtVar);
    }

    @Override // p149l.ho2
    /* JADX INFO: renamed from: F0 */
    public int mo120451F0() {
        return 1;
    }

    /* JADX INFO: renamed from: T3 */
    public void m120452T3(String str) {
        if (str == null) {
            return;
        }
        this.f139757a0 = str;
    }

    @Override // p149l.ho2
    /* JADX INFO: renamed from: e2 */
    public void mo97489e2(boolean z, BLiveAbsData bLiveAbsData) {
        BLiveAbsData bLiveAbsData2 = this.f108765v;
        if (bLiveAbsData2 == null || !TextUtils.equals(bLiveAbsData.f44323id, bLiveAbsData2.f44323id)) {
            super.mo97489e2(z, bLiveAbsData);
        } else if (this.f139747Q && this.f139749S) {
            mo132082O1(z, bLiveAbsData.f44323id, bLiveAbsData.room.f44419id);
            this.f139749S = false;
        }
    }

    @Override // p149l.nnn0, p149l.lh20
    /* JADX INFO: renamed from: p */
    public boolean mo97490p() {
        return true;
    }
}
