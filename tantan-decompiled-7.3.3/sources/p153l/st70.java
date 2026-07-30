package p153l;

import com.p051p1.mobile.putong.live.base.data.BLivePKCardItem;
import com.p051p1.mobile.putong.live.base.data.BLivePKCardShowListWithBoth;
import com.p051p1.mobile.putong.live.base.data.BLivePkOwner;
import com.p051p1.mobile.putong.live.livingroom.recreation.p067pk.internal.PkViewInternal;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class st70 extends qct<dw40> {

    /* JADX INFO: renamed from: i */
    public final PkViewInternal f170548i;

    /* JADX INFO: renamed from: j */
    public List<BLivePkOwner> f170549j;

    public st70(dum dumVar, PkViewInternal pkViewInternal) {
        super(dumVar);
        this.f170549j = new ArrayList();
        this.f170548i = pkViewInternal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P3 */
    public final void m187854P3(List<BLivePkOwner> list, BLivePKCardShowListWithBoth bLivePKCardShowListWithBoth) {
        BLivePkOwner bLivePkOwnerNew_ = BLivePkOwner.new_();
        bLivePkOwnerNew_.itemCardList = bLivePKCardShowListWithBoth.BLiveUserItemCards;
        bLivePkOwnerNew_.userId = ((dw40) m213810E2()).m168526j0();
        list.add(bLivePkOwnerNew_);
        BLivePkOwner bLivePkOwnerNew_2 = BLivePkOwner.new_();
        bLivePkOwnerNew_2.itemCardList = bLivePKCardShowListWithBoth.BLiveOtherUserItemCardsList;
        list.add(bLivePkOwnerNew_2);
    }

    /* JADX INFO: renamed from: R3 */
    public void m187855R3(List<BLivePkOwner> list) {
        if (!jyb.m147479J(this.f170549j)) {
            list = this.f170549j;
        }
        if (list.size() != 2) {
            return;
        }
        BLivePkOwner bLivePkOwner = (BLivePkOwner) jyb.m147529r(list, new qcj() { // from class: l.nt70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f143580a.m187857T3((BLivePkOwner) obj);
            }
        });
        BLivePkOwner bLivePkOwner2 = (BLivePkOwner) jyb.m147529r(list, new qcj() { // from class: l.ot70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f148931a.m187858U3((BLivePkOwner) obj);
            }
        });
        if (bLivePkOwner == null || bLivePkOwner2 == null) {
            return;
        }
        bLivePkOwner.itemCardList = jyb.m147522n(bLivePkOwner.itemCardList, new qcj() { // from class: l.pt70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(PkViewInternal.m77242F((BLivePKCardItem) obj) >= 0);
            }
        });
        bLivePkOwner2.itemCardList = jyb.m147522n(bLivePkOwner2.itemCardList, new qcj() { // from class: l.qt70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(PkViewInternal.m77242F((BLivePKCardItem) obj) >= 0);
            }
        });
        if (jyb.m147479J(bLivePkOwner.itemCardList)) {
            this.f170548i.m77303u0(true, false);
        }
        if (jyb.m147479J(bLivePkOwner2.itemCardList)) {
            this.f170548i.m77303u0(false, false);
        }
        if (bLivePkOwner.itemCardList.size() > 0) {
            BLivePKCardItem bLivePKCardItem = bLivePkOwner.itemCardList.get(0);
            if (PkViewInternal.m77242F(bLivePKCardItem) > 0) {
                if (bLivePKCardItem.showCountdown) {
                    int size = bLivePkOwner.itemCardList.size();
                    PkViewInternal pkViewInternal = this.f170548i;
                    if (size > 1) {
                        pkViewInternal.m77293g0(bLivePkOwner.itemCardList, true);
                    } else {
                        pkViewInternal.m77292f0(bLivePkOwner, true);
                    }
                } else {
                    this.f170548i.m77292f0(bLivePkOwner, true);
                }
            }
        }
        if (bLivePkOwner2.itemCardList.size() > 0) {
            BLivePKCardItem bLivePKCardItem2 = bLivePkOwner2.itemCardList.get(0);
            if (PkViewInternal.m77242F(bLivePKCardItem2) > 0) {
                if (bLivePKCardItem2.showCountdown) {
                    int size2 = bLivePkOwner2.itemCardList.size();
                    PkViewInternal pkViewInternal2 = this.f170548i;
                    if (size2 > 1) {
                        pkViewInternal2.m77293g0(bLivePkOwner2.itemCardList, false);
                    } else {
                        pkViewInternal2.m77292f0(bLivePkOwner2, false);
                    }
                } else {
                    this.f170548i.m77292f0(bLivePkOwner2, false);
                }
            }
        }
        BLivePKCardItem bLivePKCardItemM187856S3 = !jyb.m147479J(bLivePkOwner2.itemCardList) ? m187856S3(bLivePkOwner2.itemCardList, "mistCard") : null;
        boolean z = (bLivePKCardItemM187856S3 == null && (jyb.m147479J(bLivePkOwner.itemCardList) ? null : m187856S3(bLivePkOwner.itemCardList, "mistCard")) == null) ? false : true;
        this.f170548i.m77291e0(z, bLivePKCardItemM187856S3 != null);
        if (!jyb.m147479J(bLivePkOwner.itemCardList)) {
            this.f170548i.f52448d.m77326a((m187856S3(bLivePkOwner.itemCardList, "magnetCard") == null || z) ? false : true);
        }
        if (!jyb.m147479J(bLivePkOwner2.itemCardList)) {
            this.f170548i.f52448d.m77328c((m187856S3(bLivePkOwner2.itemCardList, "magnetCard") == null || z) ? false : true);
        }
        this.f170548i.m77286Z();
    }

    /* JADX INFO: renamed from: S3 */
    public BLivePKCardItem m187856S3(List<BLivePKCardItem> list, final String str) {
        return (BLivePKCardItem) jyb.m147529r(list, new qcj() { // from class: l.rt70
            @Override // p153l.qcj
            public final Object call(Object obj) {
                BLivePKCardItem bLivePKCardItem = (BLivePKCardItem) obj;
                return Boolean.valueOf(bLivePKCardItem.type.equals(str) && PkViewInternal.m77242F(bLivePKCardItem) > 0);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ Boolean m187857T3(BLivePkOwner bLivePkOwner) {
        return Boolean.valueOf(bLivePkOwner.userId.equals(((dw40) m213810E2()).m168526j0()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ Boolean m187858U3(BLivePkOwner bLivePkOwner) {
        return Boolean.valueOf(!bLivePkOwner.userId.equals(((dw40) m213810E2()).m168526j0()));
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ void m187859V3(BLivePKCardShowListWithBoth bLivePKCardShowListWithBoth) {
        ArrayList arrayList = new ArrayList();
        this.f170549j = arrayList;
        m187854P3(arrayList, bLivePKCardShowListWithBoth);
        m187855R3(this.f170549j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(((dw40) m213810E2()).m168545q1().f71711e2).subscribe(dhw.m115829h(new y20() { // from class: l.mt70
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138555a.m187859V3((BLivePKCardShowListWithBoth) obj);
            }
        }));
    }
}
