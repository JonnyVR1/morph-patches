package p002l;

import android.text.TextUtils;
import android.util.ArrayMap;
import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p000p1.mobile.putong.live.livingroom.increment.operation.OperationEntryView;
import com.p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.putong.live.base.data.BLiveMyCardInfo;
import com.p1.mobile.putong.live.base.data.BLiveOperation;
import com.p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p1.mobile.putong.live.base.data.BLiveOperationItemPopUp;
import com.p1.mobile.putong.live.base.data.BLiveTurboCardInfo;
import com.tantanapp.common.utils.NullChecker;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import l.bwr;
import l.e30;
import l.ffw;
import l.fld0;
import l.ggv;
import l.mkd0;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.ypv;
import rx.c;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wr50 extends h4t<ho2, OperationEntryView> {

    /* JADX INFO: renamed from: i */
    public final LinkedList f21948i;

    /* JADX INFO: renamed from: j */
    public final Map<Integer, LiveMessage> f21949j;

    public wr50(bsm bsmVar, OperationEntryView operationEntryView) {
        super(bsmVar);
        this.f21948i = new LinkedList();
        this.f21949j = new ArrayMap();
        C(operationEntryView);
        z2(new nt50(bsmVar, ((OperationEntryView) ((bwr) this).viewModel).f4093h));
        z2(new u8t(bsmVar, ((OperationEntryView) ((bwr) this).viewModel).f4091f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m25350a4(e8t e8tVar) {
        if (BLiveOperation.REFRESH_UNIT.equals(e8tVar.f9634a)) {
            m25361f4(null, null);
            return;
        }
        BLiveOperation bLiveOperation = e8tVar.f9634a;
        if (bLiveOperation.showOperationDrawer) {
            m25361f4(vwb.n(bLiveOperation.operations, new w9j() { // from class: l.vr50
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.a(((BLiveOperationItem) obj).popup));
                }
            }), e8tVar.f9635b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m25351b4(ku50 ku50Var) {
        m25360e4();
    }

    /* JADX INFO: renamed from: T */
    public void m25352T() {
        super.T();
        vt50.m24121c().m24124d(this.f22036e);
    }

    /* JADX INFO: renamed from: V3 */
    public final void m25353V3(ku50 ku50Var) {
        if (((ggv) ypv.l(fld0.c)).i) {
            m25548F2().OperationsEvent.showOperationsItem().j(new ku50.C0652a(8100).m16802d(ku50Var.m16790e()).m16799a());
        } else {
            this.f21948i.add(0, ku50Var);
            m25364i4();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m25354W3() {
        m25547E2().m14502G1(BLiveOperation.REFRESH_UNIT);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m25355X3(BLiveOperationItem bLiveOperationItem) {
        if (NullChecker.a(bLiveOperationItem.popup)) {
            if (TEnum.equals(bLiveOperationItem.popup.popupType, "H5PopUp")) {
                m25548F2().OperationsEvent.openH5Dlg().j(new ku50.C0652a(8100).m16804f(bLiveOperationItem.popup.h5PopUp).m16799a());
                return;
            }
            boolean z = bLiveOperationItem.popup.isFirstPriority;
            LinkedList linkedList = this.f21948i;
            if (z) {
                linkedList.add(0, bLiveOperationItem);
            } else {
                linkedList.add(bLiveOperationItem);
            }
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m25356Y3(LongLinkMedalMessage.TurboCardReceiveEvent turboCardReceiveEvent) {
        ((OperationEntryView) ((bwr) this).viewModel).m8642l0(turboCardReceiveEvent);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m25357Z3(LongLinkMedalMessage.TurboCardResultNotice turboCardResultNotice) {
        ((OperationEntryView) ((bwr) this).viewModel).m8641k0(turboCardResultNotice);
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m25358c4(ku50 ku50Var) {
        mo14197p3(8100, ku50Var.m16792g().jumpScheme);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: d4 */
    public final void m25359d4(BLiveTurboCardInfo bLiveTurboCardInfo) {
        if (bLiveTurboCardInfo.hasShow || bLiveTurboCardInfo.myCardList.size() <= 0) {
            return;
        }
        BLiveMyCardInfo bLiveMyCardInfo = (BLiveMyCardInfo) bLiveTurboCardInfo.myCardList.get(0);
        try {
            m25547E2().m14506I1(LongLinkMedalMessage.TurboCardReceiveEvent.newBuilder().setType(LongLinkMedalMessage.CardTypeEnum.valueOf(bLiveMyCardInfo.cardType.toUpperCase())).setUrl(bLiveMyCardInfo.url).build());
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: renamed from: e4 */
    public void m25360e4() {
        ((ggv) ypv.l(fld0.c)).i = false;
        m14207z3(500L, new Runnable() { // from class: l.ur50
            @Override // java.lang.Runnable
            public final void run() {
                this.f20759a.m25354W3();
            }
        });
    }

    /* JADX INFO: renamed from: f4 */
    public void m25361f4(List<BLiveOperationItem> list, Map<Integer, LiveMessage> map) {
        if (NullChecker.a(map) && !map.isEmpty()) {
            this.f21949j.putAll(map);
        }
        if (NullChecker.a(list) && list.size() > 0) {
            vwb.z(list, new e30() { // from class: l.mr50
                public final void call(Object obj) {
                    this.f15601a.m25355X3((BLiveOperationItem) obj);
                }
            });
        }
        m25364i4();
    }

    /* JADX INFO: renamed from: g4 */
    public void m25362g4(String str, BLiveOperationItemPopUp bLiveOperationItemPopUp) {
        m25548F2().OperationsEvent.openH5Drawer().j(new ku50.C0652a(8100).m16804f(bLiveOperationItemPopUp.h5Drawer).m16803e(str).m16799a());
    }

    /* JADX INFO: renamed from: h4 */
    public void m25363h4(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m25548F2().OpenH5Event.open().j(jp50.m16064c(8100).m16094B(str).m16099t(17).m16096q());
    }

    /* JADX INFO: renamed from: i4 */
    public final void m25364i4() {
        LiveMessage liveMessageRemove;
        if (((ggv) ypv.l(fld0.c)).i || this.f21948i.isEmpty()) {
            return;
        }
        boolean z = this.f21948i.getFirst() instanceof BLiveOperationItem;
        LinkedList linkedList = this.f21948i;
        if (!z) {
            if (linkedList.getFirst() instanceof ku50) {
                m25548F2().OperationsEvent.boostStart().j((ku50) this.f21948i.poll());
                return;
            }
            return;
        }
        BLiveOperationItem bLiveOperationItem = (BLiveOperationItem) linkedList.poll();
        BLiveOperationItemPopUp bLiveOperationItemPopUp = bLiveOperationItem.popup;
        String string = bLiveOperationItemPopUp.popupType.toString();
        string.getClass();
        if (string.equals("H5Drawer")) {
            m25362g4(bLiveOperationItem.type, bLiveOperationItemPopUp);
        } else if (string.equals("TextDrawer") && (liveMessageRemove = this.f21949j.remove(Integer.valueOf(bLiveOperationItem.hashCode()))) != null) {
            m25548F2().OperationsEvent.openOperationMessage().j(new ku50.C0652a(8100).m16802d(bLiveOperationItem).m16801c(liveMessageRemove).m16799a());
        }
    }

    @Override // p002l.h4t
    /* JADX INFO: renamed from: n */
    public void mo5949n() {
        super.mo5949n();
        ((ggv) ypv.l(fld0.c)).i = false;
        vt50.m24121c().m24123b();
        this.f21948i.clear();
        this.f21949j.clear();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v14, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v4, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: t */
    public void m25365t() {
        super.t();
        if (m25552L2()) {
            xdl0.M(((bwr) this).viewModel, true);
        }
        duringCreated(m25547E2().m14596q1().I()).subscribe(mkd0.G(new e30() { // from class: l.lr50
            public final void call(Object obj) {
                this.f15009a.m25356Y3((LongLinkMedalMessage.TurboCardReceiveEvent) obj);
            }
        }));
        duringCreated(m25547E2().m14596q1().H()).subscribe(mkd0.G(new e30() { // from class: l.nr50
            public final void call(Object obj) {
                this.f16167a.m25357Z3((LongLinkMedalMessage.TurboCardResultNotice) obj);
            }
        }));
        duringCreated(zfv.m27227P0(m25552L2() ? "anchor" : "audience", m25547E2().m17238n().id, m25547E2().m17234j().liveMode)).subscribe(ffw.h(new e30() { // from class: l.or50
            public final void call(Object obj) {
                this.f16755a.m25359d4((BLiveTurboCardInfo) obj);
            }
        }));
        duringCreated(m25547E2().m14596q1().E()).subscribe(ffw.h(new e30() { // from class: l.pr50
            public final void call(Object obj) {
                this.f17622a.m25350a4((e8t) obj);
            }
        }));
        duringCreated((c) m25548F2().OperationsEvent.showEntranceAnim().g()).subscribe(new e30() { // from class: l.qr50
            public final void call(Object obj) {
                this.f18188a.m25353V3((ku50) obj);
            }
        });
        duringCreated((c) m25548F2().OperationsEvent.refreshOperationMessage().g()).subscribe(ffw.d(new e30() { // from class: l.rr50
            public final void call(Object obj) {
                this.f18659a.m25351b4((ku50) obj);
            }
        }));
        duringCreated((c) m25548F2().OperationsEvent.openH5Dlg().g()).filter(new w9j() { // from class: l.sr50
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a(((ku50) obj).m16792g()));
            }
        }).subscribe(ffw.d(new e30() { // from class: l.tr50
            public final void call(Object obj) {
                this.f20357a.m25358c4((ku50) obj);
            }
        }));
    }
}
