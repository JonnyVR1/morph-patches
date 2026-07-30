package p153l;

import com.p051p1.mobile.putong.live.base.data.BLivePKBufferInfo;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.internal.PkViewInternal;

/* JADX INFO: loaded from: classes5.dex */
public class jc60 extends qct<dw40> {

    /* JADX INFO: renamed from: i */
    public final PkViewInternal f120023i;

    /* JADX INFO: renamed from: j */
    public BLivePKBufferInfo f120024j;

    public jc60(dum dumVar, PkViewInternal pkViewInternal) {
        super(dumVar);
        this.f120023i = pkViewInternal;
    }

    /* JADX INFO: renamed from: K3 */
    public void m144348K3(BLivePKBufferInfo bLivePKBufferInfo) {
        BLivePKBufferInfo bLivePKBufferInfo2 = this.f120024j;
        if (bLivePKBufferInfo2 != null) {
            bLivePKBufferInfo = bLivePKBufferInfo2;
        }
        int iM77241E = PkViewInternal.m77241E(bLivePKBufferInfo.startTs, bLivePKBufferInfo.duration);
        PkViewInternal pkViewInternal = this.f120023i;
        if (iM77241E > 0) {
            pkViewInternal.m77290d0(bLivePKBufferInfo, iM77241E);
        } else {
            pkViewInternal.m77290d0(null, -1);
        }
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m144349L3(BLivePKBufferInfo bLivePKBufferInfo) {
        this.f120024j = bLivePKBufferInfo;
        m144348K3(bLivePKBufferInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((dw40) m213810E2()).m168545q1().f71707d2).subscribe(dhw.m115829h(new y20() { // from class: l.ic60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f114286a.m144349L3((BLivePKBufferInfo) obj);
            }
        }));
    }
}
