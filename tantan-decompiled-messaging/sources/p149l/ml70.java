package p149l;

import com.p046p1.mobile.putong.live.base.data.BLivePKCardItem;
import com.p046p1.mobile.putong.live.base.data.BLivePKCardShowListWithBoth;
import com.p046p1.mobile.putong.live.base.data.BLivePkOwner;
import com.p046p1.mobile.putong.live.livingroom.recreation.p062pk.internal.PkViewInternal;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ml70 extends pat<pn40> {

    /* JADX INFO: renamed from: i */
    public final PkViewInternal f134408i;

    /* JADX INFO: renamed from: j */
    public List<BLivePkOwner> f134409j;

    public ml70(bsm bsmVar, PkViewInternal pkViewInternal) {
        super(bsmVar);
        this.f134409j = new ArrayList();
        this.f134408i = pkViewInternal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P3 */
    public final void m155130P3(List<BLivePkOwner> list, BLivePKCardShowListWithBoth bLivePKCardShowListWithBoth) {
        BLivePkOwner bLivePkOwnerNew_ = BLivePkOwner.new_();
        bLivePkOwnerNew_.itemCardList = bLivePKCardShowListWithBoth.BLiveUserItemCards;
        bLivePkOwnerNew_.userId = ((pn40) m206027E2()).m132140j0();
        list.add(bLivePkOwnerNew_);
        BLivePkOwner bLivePkOwnerNew_2 = BLivePkOwner.new_();
        bLivePkOwnerNew_2.itemCardList = bLivePKCardShowListWithBoth.BLiveOtherUserItemCardsList;
        list.add(bLivePkOwnerNew_2);
    }

    /* JADX INFO: renamed from: R3 */
    public void m155131R3(List<BLivePkOwner> list) {
        if (!vwb.m200296J(this.f134409j)) {
            list = this.f134409j;
        }
        if (list.size() != 2) {
            return;
        }
        BLivePkOwner bLivePkOwner = (BLivePkOwner) vwb.m200346r(list, new w9j() { // from class: l.hl70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f108326a.m155133T3((BLivePkOwner) obj);
            }
        });
        BLivePkOwner bLivePkOwner2 = (BLivePkOwner) vwb.m200346r(list, new w9j() { // from class: l.il70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f113774a.m155134U3((BLivePkOwner) obj);
            }
        });
        if (bLivePkOwner == null || bLivePkOwner2 == null) {
            return;
        }
        bLivePkOwner.itemCardList = vwb.m200339n(bLivePkOwner.itemCardList, new w9j() { // from class: l.jl70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(PkViewInternal.m76059F((BLivePKCardItem) obj) >= 0);
            }
        });
        bLivePkOwner2.itemCardList = vwb.m200339n(bLivePkOwner2.itemCardList, new w9j() { // from class: l.kl70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(PkViewInternal.m76059F((BLivePKCardItem) obj) >= 0);
            }
        });
        if (vwb.m200296J(bLivePkOwner.itemCardList)) {
            this.f134408i.m76120u0(true, false);
        }
        if (vwb.m200296J(bLivePkOwner2.itemCardList)) {
            this.f134408i.m76120u0(false, false);
        }
        if (bLivePkOwner.itemCardList.size() > 0) {
            BLivePKCardItem bLivePKCardItem = bLivePkOwner.itemCardList.get(0);
            if (PkViewInternal.m76059F(bLivePKCardItem) > 0) {
                if (bLivePKCardItem.showCountdown) {
                    int size = bLivePkOwner.itemCardList.size();
                    PkViewInternal pkViewInternal = this.f134408i;
                    if (size > 1) {
                        pkViewInternal.m76110g0(bLivePkOwner.itemCardList, true);
                    } else {
                        pkViewInternal.m76109f0(bLivePkOwner, true);
                    }
                } else {
                    this.f134408i.m76109f0(bLivePkOwner, true);
                }
            }
        }
        if (bLivePkOwner2.itemCardList.size() > 0) {
            BLivePKCardItem bLivePKCardItem2 = bLivePkOwner2.itemCardList.get(0);
            if (PkViewInternal.m76059F(bLivePKCardItem2) > 0) {
                if (bLivePKCardItem2.showCountdown) {
                    int size2 = bLivePkOwner2.itemCardList.size();
                    PkViewInternal pkViewInternal2 = this.f134408i;
                    if (size2 > 1) {
                        pkViewInternal2.m76110g0(bLivePkOwner2.itemCardList, false);
                    } else {
                        pkViewInternal2.m76109f0(bLivePkOwner2, false);
                    }
                } else {
                    this.f134408i.m76109f0(bLivePkOwner2, false);
                }
            }
        }
        BLivePKCardItem bLivePKCardItemM155132S3 = !vwb.m200296J(bLivePkOwner2.itemCardList) ? m155132S3(bLivePkOwner2.itemCardList, "mistCard") : null;
        boolean z = (bLivePKCardItemM155132S3 == null && (vwb.m200296J(bLivePkOwner.itemCardList) ? null : m155132S3(bLivePkOwner.itemCardList, "mistCard")) == null) ? false : true;
        this.f134408i.m76108e0(z, bLivePKCardItemM155132S3 != null);
        if (!vwb.m200296J(bLivePkOwner.itemCardList)) {
            this.f134408i.f51600d.m76143a((m155132S3(bLivePkOwner.itemCardList, "magnetCard") == null || z) ? false : true);
        }
        if (!vwb.m200296J(bLivePkOwner2.itemCardList)) {
            this.f134408i.f51600d.m76145c((m155132S3(bLivePkOwner2.itemCardList, "magnetCard") == null || z) ? false : true);
        }
        this.f134408i.m76103Z();
    }

    /* JADX INFO: renamed from: S3 */
    public BLivePKCardItem m155132S3(List<BLivePKCardItem> list, final String str) {
        return (BLivePKCardItem) vwb.m200346r(list, new w9j() { // from class: l.ll70
            @Override // p149l.w9j
            public final Object call(Object obj) {
                BLivePKCardItem bLivePKCardItem = (BLivePKCardItem) obj;
                return Boolean.valueOf(bLivePKCardItem.type.equals(str) && PkViewInternal.m76059F(bLivePKCardItem) > 0);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ Boolean m155133T3(BLivePkOwner bLivePkOwner) {
        return Boolean.valueOf(bLivePkOwner.userId.equals(((pn40) m206027E2()).m132140j0()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ Boolean m155134U3(BLivePkOwner bLivePkOwner) {
        return Boolean.valueOf(!bLivePkOwner.userId.equals(((pn40) m206027E2()).m132140j0()));
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m155135V3(BLivePKCardShowListWithBoth bLivePKCardShowListWithBoth) {
        ArrayList arrayList = new ArrayList();
        this.f134409j = arrayList;
        m155130P3(arrayList, bLivePKCardShowListWithBoth);
        m155131R3(this.f134409j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        duringCreated(((pn40) m206027E2()).m132160q1().f170444e2).subscribe(ffw.m121197h(new e30() { // from class: l.gl70
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103301a.m155135V3((BLivePKCardShowListWithBoth) obj);
            }
        }));
    }
}
