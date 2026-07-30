package p153l;

import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.View;
import com.p051p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.live.base.data.BLiveMyCardInfo;
import com.p051p1.mobile.putong.live.base.data.BLiveOperation;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItemPopUp;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationPopupType;
import com.p051p1.mobile.putong.live.base.data.BLiveTurboCardInfo;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p051p1.mobile.putong.live.livingroom.increment.operation.OperationEntryView;
import com.tantanapp.common.utils.NullChecker;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class c060 extends i6t<oo2, OperationEntryView> {

    /* JADX INFO: renamed from: i */
    public final LinkedList f79230i;

    /* JADX INFO: renamed from: j */
    public final Map<Integer, LiveMessage> f79231j;

    public c060(dum dumVar, OperationEntryView operationEntryView) {
        super(dumVar);
        this.f79230i = new LinkedList();
        this.f79231j = new ArrayMap();
        mo52715C(operationEntryView);
        m153103z2(new t160(dumVar, ((OperationEntryView) this.viewModel).f48899h));
        m153103z2(new vat(dumVar, ((OperationEntryView) this.viewModel).f48897f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m107357a4(fat fatVar) {
        if (BLiveOperation.REFRESH_UNIT.equals(fatVar.f98008a)) {
            m107367f4(null, null);
            return;
        }
        BLiveOperation bLiveOperation = fatVar.f98008a;
        if (bLiveOperation.showOperationDrawer) {
            m107367f4(jyb.m147522n(bLiveOperation.operations, new qcj() { // from class: l.b060
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.m82486a(((BLiveOperationItem) obj).popup));
                }
            }), fatVar.f98009b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m107358b4(q260 q260Var) {
        m107366e4();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
        b260.m102114c().m102117d(this.f196918e);
    }

    /* JADX INFO: renamed from: V3 */
    public final void m107359V3(q260 q260Var) {
        if (((hiv) zrv.m221194l(htd0.f111521c)).f110078i) {
            m213811F2().OperationsEvent.showOperationsItem().mo199273j(new q260.C19505a(8100).m175005d(q260Var.m174993e()).m175002a());
        } else {
            this.f79230i.add(0, q260Var);
            m107370i4();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2] */
    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m107360W3() {
        m213810E2().m168455G1(BLiveOperation.REFRESH_UNIT);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m107361X3(BLiveOperationItem bLiveOperationItem) {
        if (NullChecker.m82486a(bLiveOperationItem.popup)) {
            if (TEnum.equals(bLiveOperationItem.popup.popupType, BLiveOperationPopupType.H5PopUp)) {
                m213811F2().OperationsEvent.openH5Dlg().mo199273j(new q260.C19505a(8100).m175007f(bLiveOperationItem.popup.h5PopUp).m175002a());
                return;
            }
            boolean z = bLiveOperationItem.popup.isFirstPriority;
            LinkedList linkedList = this.f79230i;
            if (z) {
                linkedList.add(0, bLiveOperationItem);
            } else {
                linkedList.add(bLiveOperationItem);
            }
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m107362Y3(LongLinkMedalMessage.TurboCardReceiveEvent turboCardReceiveEvent) {
        ((OperationEntryView) this.viewModel).m76215l0(turboCardReceiveEvent);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m107363Z3(LongLinkMedalMessage.TurboCardResultNotice turboCardResultNotice) {
        ((OperationEntryView) this.viewModel).m76214k0(turboCardResultNotice);
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m107364c4(q260 q260Var) {
        mo138869p3(8100, q260Var.m174995g().jumpScheme);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.oo2] */
    /* JADX INFO: renamed from: d4 */
    public final void m107365d4(BLiveTurboCardInfo bLiveTurboCardInfo) {
        if (bLiveTurboCardInfo.hasShow || bLiveTurboCardInfo.myCardList.size() <= 0) {
            return;
        }
        BLiveMyCardInfo bLiveMyCardInfo = bLiveTurboCardInfo.myCardList.get(0);
        try {
            m213810E2().m168459I1(LongLinkMedalMessage.TurboCardReceiveEvent.newBuilder().setType(LongLinkMedalMessage.CardTypeEnum.valueOf(bLiveMyCardInfo.cardType.toUpperCase())).setUrl(bLiveMyCardInfo.url).build());
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: renamed from: e4 */
    public void m107366e4() {
        ((hiv) zrv.m221194l(htd0.f111521c)).f110078i = false;
        m138879z3(500L, new Runnable() { // from class: l.a060
            @Override // java.lang.Runnable
            public final void run() {
                this.f67691a.m107360W3();
            }
        });
    }

    /* JADX INFO: renamed from: f4 */
    public void m107367f4(List<BLiveOperationItem> list, Map<Integer, LiveMessage> map) {
        if (NullChecker.m82486a(map) && !map.isEmpty()) {
            this.f79231j.putAll(map);
        }
        if (NullChecker.m82486a(list) && list.size() > 0) {
            jyb.m147537z(list, new y20() { // from class: l.sz50
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f171357a.m107361X3((BLiveOperationItem) obj);
                }
            });
        }
        m107370i4();
    }

    /* JADX INFO: renamed from: g4 */
    public void m107368g4(String str, BLiveOperationItemPopUp bLiveOperationItemPopUp) {
        m213811F2().OperationsEvent.openH5Drawer().mo199273j(new q260.C19505a(8100).m175007f(bLiveOperationItemPopUp.h5Drawer).m175006e(str).m175002a());
    }

    /* JADX INFO: renamed from: h4 */
    public void m107369h4(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m213811F2().OpenH5Event.open().mo199273j(px50.m174112c(8100).m174141B(str).m174146t(17).m174143q());
    }

    /* JADX INFO: renamed from: i4 */
    public final void m107370i4() {
        LiveMessage liveMessageRemove;
        if (((hiv) zrv.m221194l(htd0.f111521c)).f110078i || this.f79230i.isEmpty()) {
            return;
        }
        boolean z = this.f79230i.getFirst() instanceof BLiveOperationItem;
        LinkedList linkedList = this.f79230i;
        if (!z) {
            if (linkedList.getFirst() instanceof q260) {
                m213811F2().OperationsEvent.boostStart().mo199273j((q260) this.f79230i.poll());
                return;
            }
            return;
        }
        BLiveOperationItem bLiveOperationItem = (BLiveOperationItem) linkedList.poll();
        BLiveOperationItemPopUp bLiveOperationItemPopUp = bLiveOperationItem.popup;
        String string = bLiveOperationItemPopUp.popupType.toString();
        string.getClass();
        if (string.equals(BLiveOperationPopupType.H5Drawer)) {
            m107368g4(bLiveOperationItem.type, bLiveOperationItemPopUp);
        } else if (string.equals(BLiveOperationPopupType.TextDrawer) && (liveMessageRemove = this.f79231j.remove(Integer.valueOf(bLiveOperationItem.hashCode()))) != null) {
            m213811F2().OperationsEvent.openOperationMessage().mo199273j(new q260.C19505a(8100).m175005d(bLiveOperationItem).m175004c(liveMessageRemove).m175002a());
        }
    }

    @Override // p153l.i6t, p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: n */
    public void mo70300n() {
        super.mo70300n();
        ((hiv) zrv.m221194l(htd0.f111521c)).f110078i = false;
        b260.m102114c().m102116b();
        this.f79230i.clear();
        this.f79231j.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v14, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v4, types: [l.oo2, l.vp20] */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.oo2, l.vp20] */
    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        if (m213815L2()) {
            bnl0.m105524M((View) this.viewModel, true);
        }
        duringCreated(m213810E2().m168545q1().m98232I()).subscribe(psd0.m173596G(new y20() { // from class: l.rz50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f165492a.m107362Y3((LongLinkMedalMessage.TurboCardReceiveEvent) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().m98230H()).subscribe(psd0.m173596G(new y20() { // from class: l.tz50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f176742a.m107363Z3((LongLinkMedalMessage.TurboCardResultNotice) obj);
            }
        }));
        duringCreated(aiv.m98058P0(m213815L2() ? "anchor" : "audience", m213810E2().mo183440n().f45172id, m213810E2().mo183435j().liveMode)).subscribe(dhw.m115829h(new y20() { // from class: l.uz50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f181702a.m107365d4((BLiveTurboCardInfo) obj);
            }
        }));
        duringCreated(m213810E2().m168545q1().m98224E()).subscribe(dhw.m115829h(new y20() { // from class: l.vz50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186444a.m107357a4((fat) obj);
            }
        }));
        duringCreated(m213811F2().OperationsEvent.showEntranceAnim().m199270g()).subscribe(new y20() { // from class: l.wz50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f191729a.m107359V3((q260) obj);
            }
        });
        duringCreated(m213811F2().OperationsEvent.refreshOperationMessage().m199270g()).subscribe(dhw.m115825d(new y20() { // from class: l.xz50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196837a.m107358b4((q260) obj);
            }
        }));
        duringCreated(m213811F2().OperationsEvent.openH5Dlg().m199270g()).filter(new qcj() { // from class: l.yz50
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m82486a(((q260) obj).m174995g()));
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.zz50
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f206673a.m107364c4((q260) obj);
            }
        }));
    }
}
