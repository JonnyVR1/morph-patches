package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveBottomButton;
import com.p051p1.mobile.putong.live.base.data.BLiveEnvelope;
import com.p051p1.mobile.putong.live.base.data.BLiveSettingButtonCategory;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.livingroom.voice.api.VoiceRoomApiProvider;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.Area;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p137rx.C22421c;

/* JADX INFO: loaded from: classes5.dex */
public class won0 extends i6t<rwn0, fon0> {

    /* JADX INFO: renamed from: i */
    public List<qrm0<?>> f190052i;

    /* JADX INFO: renamed from: j */
    public vb3 f190053j;

    /* JADX INFO: renamed from: k */
    public List<Object> f190054k;

    /* JADX INFO: renamed from: l */
    public List<ic3<?>> f190055l;

    /* JADX INFO: renamed from: m */
    public final ntm0 f190056m;

    public won0(dum<rwn0> dumVar) {
        super(dumVar);
        this.f190052i = new ArrayList();
        this.f190054k = new ArrayList();
        this.f190055l = new ArrayList();
        mo52715C(new fon0());
        this.f190056m = (ntm0) m153103z2(new ntm0(dumVar));
    }

    /* JADX INFO: renamed from: J3 */
    public static /* synthetic */ vb3 m207299J3(BLiveEnvelope bLiveEnvelope) {
        return new vb3(bLiveEnvelope.data.bottomMenu);
    }

    /* JADX INFO: renamed from: K3 */
    public static /* synthetic */ Boolean m207300K3(ic3 ic3Var) {
        jc3<?> jc3Var;
        jc3<?> jc3Var2;
        if (!(ic3Var instanceof dho0) || (jc3Var2 = ((dho0) ic3Var).f88546l) == null) {
            return (!(ic3Var instanceof din0) || (jc3Var = ((din0) ic3Var).f88695l) == null) ? Boolean.FALSE : Boolean.valueOf(jc3Var.mo103476l1());
        }
        return Boolean.valueOf(jc3Var2.mo103476l1());
    }

    /* JADX INFO: renamed from: Y3 */
    public static /* synthetic */ void m207313Y3(Throwable th) {
    }

    /* JADX INFO: renamed from: Z3 */
    public static /* synthetic */ void m207314Z3(vb3 vb3Var, List list, final qrm0 qrm0Var) {
        ic3<?> ic3VarM177583g4;
        BLiveSettingButtonCategory bLiveSettingButtonCategory = (BLiveSettingButtonCategory) jyb.m147529r(vb3Var.f183196d, new qcj() { // from class: l.kon0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveSettingButtonCategory) obj).f45283id == qrm0Var.f159148m.category);
            }
        });
        if (bLiveSettingButtonCategory == null || (ic3VarM177583g4 = qrm0Var.m177583g4(list.size(), bLiveSettingButtonCategory)) == null) {
            return;
        }
        list.add(ic3VarM177583g4);
    }

    /* JADX INFO: renamed from: b4 */
    private List<qrm0<?>> m207315b4(final vb3 vb3Var, List<Integer> list, final Area area) {
        final ArrayList arrayList = new ArrayList();
        final int[] iArr = {0};
        jyb.m147537z(list, new y20() { // from class: l.jon0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122041a.m207326f4(vb3Var, area, iArr, arrayList, (Integer) obj);
            }
        });
        return arrayList;
    }

    /* JADX INFO: renamed from: c4 */
    private void m207316c4() {
        ((fon0) this.viewModel).m126486e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g4 */
    public /* synthetic */ void m207317g4(Area area) {
        m207328m4(this.f190053j, this.f190052i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: h4 */
    public /* synthetic */ void m207318h4(vxj0 vxj0Var) {
        m207322n4();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i4 */
    public /* synthetic */ void m207319i4(vxj0 vxj0Var) {
        m207316c4();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k4 */
    private void m207320k4() {
        BLiveVoiceCall bLiveVoiceCallM183423Y2 = ((rwn0) m213810E2()).m183423Y2();
        boolean z = false;
        if (bLiveVoiceCallM183423Y2 != null && guk0.m132329h(bLiveVoiceCallM183423Y2) && !m213815L2()) {
            z = true;
        }
        duringCreated((C22421c) VoiceRoomApiProvider.requestBottomButtons(((rwn0) m213810E2()).m202194o(), m213815L2(), z, ((rwn0) m213810E2()).mo183435j().liveMode, ((rwn0) m213810E2()).m168526j0()).filter(new qcj() { // from class: l.qon0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveEnvelope) obj).data.bottomMenu != null);
            }
        }).map(new qcj() { // from class: l.ron0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return won0.m207299J3((BLiveEnvelope) obj);
            }
        })).subscribe(dhw.m115826e(new y20() { // from class: l.son0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f169912a.m207321l4((vb3) obj);
            }
        }, new y20() { // from class: l.ton0
            @Override // p153l.y20
            public final void call(Object obj) {
                won0.m207313Y3((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l4 */
    public void m207321l4(vb3 vb3Var) {
        if (!vb3Var.f183202j || vb3Var.f183197e == null) {
            return;
        }
        this.f190056m.m164740O3();
        List<qrm0<?>> listM207315b4 = m207315b4(vb3Var, vb3Var.f183197e.settingZone, Area.SETTING);
        this.f190056m.m164736K3();
        m207328m4(vb3Var, listM207315b4);
        ((fon0) this.viewModel).m126488l();
        m213811F2().BootBubbleEvent.dismissBubble().mo199273j("voiceRoomGameCenterBubble");
    }

    /* JADX INFO: renamed from: n4 */
    private void m207322n4() {
        m213811F2().BottomEvent.onSettingDialogShow().m199277p();
        m207320k4();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
    }

    /* JADX INFO: renamed from: a4 */
    public int m207323a4(List<ic3<?>> list) {
        return (jyb.m147479J(list) || ((ic3) jyb.m147529r(list, new qcj() { // from class: l.lon0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return won0.m207300K3((ic3) obj);
            }
        })) == null) ? 0 : -1;
    }

    /* JADX INFO: renamed from: d4 */
    public final Map<String, List<ic3<?>>> m207324d4(List<ic3<?>> list, qcj<ic3<?>, String> qcjVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (ic3<?> ic3Var : list) {
            String strCall = qcjVar.call(ic3Var);
            List arrayList = (List) linkedHashMap.get(strCall);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strCall, arrayList);
            }
            arrayList.add(ic3Var);
        }
        return linkedHashMap;
    }

    /* JADX INFO: renamed from: e4 */
    public boolean m207325e4(final int i) {
        return jyb.m147529r(this.f190052i, new qcj() { // from class: l.uon0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((qrm0) obj).m177580Z3() == i);
            }
        }) != null;
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m207326f4(vb3 vb3Var, Area area, int[] iArr, List list, final Integer num) {
        BLiveBottomButton bLiveBottomButton = (BLiveBottomButton) jyb.m147529r(vb3Var.f183195c, new qcj() { // from class: l.mon0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(num.intValue() == ((BLiveBottomButton) obj).f45187id);
            }
        });
        if (bLiveBottomButton == null) {
            return;
        }
        ve3.m201031a(bLiveBottomButton);
        qrm0<?> qrm0VarM164737L3 = this.f190056m.m164737L3(bLiveBottomButton, area, vb3Var.f183199g);
        if (qrm0VarM164737L3 != null) {
            int i = iArr[0] + 1;
            iArr[0] = i;
            qrm0VarM164737L3.f159146k = i;
            list.add(qrm0VarM164737L3);
        }
    }

    /* JADX INFO: renamed from: j4 */
    public void m207327j4() {
        m213811F2().BottomEvent.onSettingDialogDismiss().m199277p();
    }

    /* JADX INFO: renamed from: m4 */
    public void m207328m4(final vb3 vb3Var, List<qrm0<?>> list) {
        this.f190052i = list;
        this.f190053j = vb3Var;
        final fok fokVar = new fok();
        jyb.m147537z(list, new y20() { // from class: l.von0
            @Override // p153l.y20
            public final void call(Object obj) {
                won0.m207314Z3(vb3Var, fokVar, (qrm0) obj);
            }
        });
        ((ifv) zrv.m221194l(htd0.f111523e)).f114701j.put(Boolean.valueOf(jyb.m147520m(fokVar, new qcj() { // from class: l.hon0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((ic3) obj).m139425I().isGiftSwitch());
            }
        })));
        m213811F2().BottomZoneEvent.setSettingButtonRedPoint().mo199273j(Integer.valueOf(m207323a4(fokVar)));
        ((fon0) this.viewModel).m126487k(m207324d4(fokVar, new qcj() { // from class: l.ion0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((ic3) obj).mo113886r1();
            }
        }));
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        this.f190054k.clear();
        this.f190055l.clear();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        duringCreated(m213811F2().BottomZoneEvent.refreshButton().m199270g()).filter(new qcj() { // from class: l.gon0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Area) obj) == Area.SETTING);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.non0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143006a.m207317g4((Area) obj);
            }
        }));
        duringCreated(m213811F2().BottomZoneEvent.showSettingDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.oon0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148387a.m207318h4((vxj0) obj);
            }
        }));
        duringCreated(m213811F2().BottomZoneEvent.hideSettingDialog().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.pon0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153418a.m207319i4((vxj0) obj);
            }
        }));
    }
}
