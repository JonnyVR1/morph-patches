package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveSettingButtonCategory;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.Area;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class sve0 extends i6t<rwn0, qe3> {

    /* JADX INFO: renamed from: i */
    public List<qrm0<?>> f170834i;

    /* JADX INFO: renamed from: j */
    public vb3 f170835j;

    public sve0(dum<rwn0> dumVar) {
        super(dumVar);
        this.f170834i = new ArrayList();
        mo52715C(new qe3());
    }

    /* JADX INFO: renamed from: P3 */
    private void m188202P3() {
        ((qe3) this.viewModel).m176226e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S3 */
    public /* synthetic */ void m188203S3(vxj0 vxj0Var) {
        m188205W3();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T3 */
    public /* synthetic */ void m188204T3(vxj0 vxj0Var) {
        m188202P3();
    }

    /* JADX INFO: renamed from: W3 */
    private void m188205W3() {
        m213811F2().BottomEvent.onSettingDialogShow().m199277p();
        ((qe3) this.viewModel).m176231l();
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m188206R3(Area area) {
        m188208V3(this.f170835j, this.f170834i);
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
    }

    /* JADX INFO: renamed from: U3 */
    public void m188207U3() {
        m213811F2().BottomEvent.onSettingDialogDismiss().m199277p();
    }

    /* JADX INFO: renamed from: V3 */
    public void m188208V3(vb3 vb3Var, List<qrm0<?>> list) {
        this.f170834i = list;
        this.f170835j = vb3Var;
        ArrayList arrayList = new ArrayList();
        int iMo112223E = 0;
        boolean zMo103476l1 = false;
        for (final qrm0<?> qrm0Var : list) {
            BLiveSettingButtonCategory bLiveSettingButtonCategory = (BLiveSettingButtonCategory) jyb.m147529r(vb3Var.f183196d, new qcj() { // from class: l.qve0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((BLiveSettingButtonCategory) obj).f45283id == qrm0Var.f159148m.category);
                }
            });
            if (bLiveSettingButtonCategory == null) {
                return;
            }
            if (!zMo103476l1) {
                zMo103476l1 = qrm0Var.mo103476l1();
            }
            iMo112223E += qrm0Var.mo112223E();
            ic3<?> ic3VarM177583g4 = qrm0Var.m177583g4(arrayList.size(), bLiveSettingButtonCategory);
            if (ic3VarM177583g4 != null) {
                arrayList.add(ic3VarM177583g4);
            }
        }
        ((ifv) zrv.m221194l(htd0.f111523e)).f114701j.put(Boolean.valueOf(jyb.m147520m(arrayList, new qcj() { // from class: l.rve0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((ic3) obj).m139425I().isGiftSwitch());
            }
        })));
        ((qe3) this.viewModel).m176230k(arrayList);
        if (iMo112223E == 0) {
            iMo112223E = zMo103476l1 ? -1 : 0;
        }
        m213811F2().BottomZoneEvent.setSettingButtonRedPoint().mo199273j(Integer.valueOf(iMo112223E));
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().BottomZoneEvent.refreshButton().m199270g()).filter(new qcj() { // from class: l.mve0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Area) obj) == Area.SETTING);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.nve0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143795a.m188206R3((Area) obj);
            }
        }));
        duringCreated(m213811F2().BottomZoneEvent.showSettingDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.ove0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f149260a.m188203S3((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().BottomZoneEvent.hideSettingDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.pve0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f154288a.m188204T3((vxj0) obj);
            }
        }));
    }
}
