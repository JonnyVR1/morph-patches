package p149l;

import com.p046p1.mobile.putong.live.base.data.BLivePKBufferInfo;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.internal.PkViewInternal;

/* JADX INFO: loaded from: classes5.dex */
public class e460 extends pat<pn40> {

    /* JADX INFO: renamed from: i */
    public final PkViewInternal f89253i;

    /* JADX INFO: renamed from: j */
    public BLivePKBufferInfo f89254j;

    public e460(bsm bsmVar, PkViewInternal pkViewInternal) {
        super(bsmVar);
        this.f89253i = pkViewInternal;
    }

    /* JADX INFO: renamed from: K3 */
    public void m114667K3(BLivePKBufferInfo bLivePKBufferInfo) {
        BLivePKBufferInfo bLivePKBufferInfo2 = this.f89254j;
        if (bLivePKBufferInfo2 != null) {
            bLivePKBufferInfo = bLivePKBufferInfo2;
        }
        int iM76058E = PkViewInternal.m76058E(bLivePKBufferInfo.startTs, bLivePKBufferInfo.duration);
        PkViewInternal pkViewInternal = this.f89253i;
        if (iM76058E > 0) {
            pkViewInternal.m76107d0(bLivePKBufferInfo, iM76058E);
        } else {
            pkViewInternal.m76107d0(null, -1);
        }
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m114668L3(BLivePKBufferInfo bLivePKBufferInfo) {
        this.f89254j = bLivePKBufferInfo;
        m114667K3(bLivePKBufferInfo);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((pn40) m206027E2()).m132160q1().f170440d2).subscribe(ffw.m121197h(new e30() { // from class: l.d460
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f84282a.m114668L3((BLivePKBufferInfo) obj);
            }
        }));
    }
}
