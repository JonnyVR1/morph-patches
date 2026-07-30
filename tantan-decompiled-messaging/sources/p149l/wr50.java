package p149l;

import android.text.TextUtils;
import android.util.ArrayMap;
import android.view.View;
import com.p046p1.mobile.longlink.msg.livemedal.LongLinkMedalMessage;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.live.base.data.BLiveMyCardInfo;
import com.p046p1.mobile.putong.live.base.data.BLiveOperation;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItemPopUp;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationPopupType;
import com.p046p1.mobile.putong.live.base.data.BLiveTurboCardInfo;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p046p1.mobile.putong.live.livingroom.increment.operation.OperationEntryView;
import com.tantanapp.common.utils.NullChecker;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class wr50 extends h4t<ho2, OperationEntryView> {

    /* JADX INFO: renamed from: i */
    public final LinkedList f187765i;

    /* JADX INFO: renamed from: j */
    public final Map<Integer, LiveMessage> f187766j;

    public wr50(bsm bsmVar, OperationEntryView operationEntryView) {
        super(bsmVar);
        this.f187765i = new LinkedList();
        this.f187766j = new ArrayMap();
        mo51532C(operationEntryView);
        m144512z2(new nt50(bsmVar, ((OperationEntryView) this.viewModel).f48051h));
        m144512z2(new u8t(bsmVar, ((OperationEntryView) this.viewModel).f48049f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a4 */
    public /* synthetic */ void m205131a4(e8t e8tVar) {
        if (BLiveOperation.REFRESH_UNIT.equals(e8tVar.f89863a)) {
            m205141f4(null, null);
            return;
        }
        BLiveOperation bLiveOperation = e8tVar.f89863a;
        if (bLiveOperation.showOperationDrawer) {
            m205141f4(vwb.m200339n(bLiveOperation.operations, new w9j() { // from class: l.vr50
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(NullChecker.m81303a(((BLiveOperationItem) obj).popup));
                }
            }), e8tVar.f89864b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: b4 */
    public /* synthetic */ void m205132b4(ku50 ku50Var) {
        m205140e4();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
        vt50.m199915c().m199918d(this.f188512e);
    }

    /* JADX INFO: renamed from: V3 */
    public final void m205133V3(ku50 ku50Var) {
        if (((ggv) ypv.m215673l(fld0.f98148c)).f102548i) {
            m206028F2().OperationsEvent.showOperationsItem().mo172463j(new ku50.C18083a(8100).m147259d(ku50Var.m147247e()).m147256a());
        } else {
            this.f187765i.add(0, ku50Var);
            m205144i4();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2] */
    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m205134W3() {
        m206027E2().m132066G1(BLiveOperation.REFRESH_UNIT);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m205135X3(BLiveOperationItem bLiveOperationItem) {
        if (NullChecker.m81303a(bLiveOperationItem.popup)) {
            if (TEnum.equals(bLiveOperationItem.popup.popupType, BLiveOperationPopupType.H5PopUp)) {
                m206028F2().OperationsEvent.openH5Dlg().mo172463j(new ku50.C18083a(8100).m147261f(bLiveOperationItem.popup.h5PopUp).m147256a());
                return;
            }
            boolean z = bLiveOperationItem.popup.isFirstPriority;
            LinkedList linkedList = this.f187765i;
            if (z) {
                linkedList.add(0, bLiveOperationItem);
            } else {
                linkedList.add(bLiveOperationItem);
            }
        }
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m205136Y3(LongLinkMedalMessage.TurboCardReceiveEvent turboCardReceiveEvent) {
        ((OperationEntryView) this.viewModel).m75032l0(turboCardReceiveEvent);
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m205137Z3(LongLinkMedalMessage.TurboCardResultNotice turboCardResultNotice) {
        ((OperationEntryView) this.viewModel).m75031k0(turboCardResultNotice);
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m205138c4(ku50 ku50Var) {
        mo129310p3(8100, ku50Var.m147249g().jumpScheme);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [l.ho2] */
    /* JADX INFO: renamed from: d4 */
    public final void m205139d4(BLiveTurboCardInfo bLiveTurboCardInfo) {
        if (bLiveTurboCardInfo.hasShow || bLiveTurboCardInfo.myCardList.size() <= 0) {
            return;
        }
        BLiveMyCardInfo bLiveMyCardInfo = bLiveTurboCardInfo.myCardList.get(0);
        try {
            m206027E2().m132070I1(LongLinkMedalMessage.TurboCardReceiveEvent.newBuilder().setType(LongLinkMedalMessage.CardTypeEnum.valueOf(bLiveMyCardInfo.cardType.toUpperCase())).setUrl(bLiveMyCardInfo.url).build());
        } catch (IllegalArgumentException unused) {
        }
    }

    /* JADX INFO: renamed from: e4 */
    public void m205140e4() {
        ((ggv) ypv.m215673l(fld0.f98148c)).f102548i = false;
        m129320z3(500L, new Runnable() { // from class: l.ur50
            @Override // java.lang.Runnable
            public final void run() {
                this.f177808a.m205134W3();
            }
        });
    }

    /* JADX INFO: renamed from: f4 */
    public void m205141f4(List<BLiveOperationItem> list, Map<Integer, LiveMessage> map) {
        if (NullChecker.m81303a(map) && !map.isEmpty()) {
            this.f187766j.putAll(map);
        }
        if (NullChecker.m81303a(list) && list.size() > 0) {
            vwb.m200354z(list, new e30() { // from class: l.mr50
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f135334a.m205135X3((BLiveOperationItem) obj);
                }
            });
        }
        m205144i4();
    }

    /* JADX INFO: renamed from: g4 */
    public void m205142g4(String str, BLiveOperationItemPopUp bLiveOperationItemPopUp) {
        m206028F2().OperationsEvent.openH5Drawer().mo172463j(new ku50.C18083a(8100).m147261f(bLiveOperationItemPopUp.h5Drawer).m147260e(str).m147256a());
    }

    /* JADX INFO: renamed from: h4 */
    public void m205143h4(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        m206028F2().OpenH5Event.open().mo172463j(jp50.m142568c(8100).m142598B(str).m142603t(17).m142600q());
    }

    /* JADX INFO: renamed from: i4 */
    public final void m205144i4() {
        LiveMessage liveMessageRemove;
        if (((ggv) ypv.m215673l(fld0.f98148c)).f102548i || this.f187765i.isEmpty()) {
            return;
        }
        boolean z = this.f187765i.getFirst() instanceof BLiveOperationItem;
        LinkedList linkedList = this.f187765i;
        if (!z) {
            if (linkedList.getFirst() instanceof ku50) {
                m206028F2().OperationsEvent.boostStart().mo172463j((ku50) this.f187765i.poll());
                return;
            }
            return;
        }
        BLiveOperationItem bLiveOperationItem = (BLiveOperationItem) linkedList.poll();
        BLiveOperationItemPopUp bLiveOperationItemPopUp = bLiveOperationItem.popup;
        String string = bLiveOperationItemPopUp.popupType.toString();
        string.getClass();
        if (string.equals(BLiveOperationPopupType.H5Drawer)) {
            m205142g4(bLiveOperationItem.type, bLiveOperationItemPopUp);
        } else if (string.equals(BLiveOperationPopupType.TextDrawer) && (liveMessageRemove = this.f187766j.remove(Integer.valueOf(bLiveOperationItem.hashCode()))) != null) {
            m206028F2().OperationsEvent.openOperationMessage().mo172463j(new ku50.C18083a(8100).m147259d(bLiveOperationItem).m147258c(liveMessageRemove).m147256a());
        }
    }

    @Override // p149l.h4t, p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: n */
    public void mo69117n() {
        super.mo69117n();
        ((ggv) ypv.m215673l(fld0.f98148c)).f102548i = false;
        vt50.m199915c().m199917b();
        this.f187765i.clear();
        this.f187766j.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v14, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r0v5, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v4, types: [l.ho2, l.lh20] */
    /* JADX WARN: Type inference failed for: r2v0, types: [l.ho2, l.lh20] */
    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        if (m206032L2()) {
            xdl0.m208344M((View) this.viewModel, true);
        }
        duringCreated(m206027E2().m132160q1().m189050I()).subscribe(mkd0.m154955G(new e30() { // from class: l.lr50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129464a.m205136Y3((LongLinkMedalMessage.TurboCardReceiveEvent) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().m189048H()).subscribe(mkd0.m154955G(new e30() { // from class: l.nr50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140158a.m205137Z3((LongLinkMedalMessage.TurboCardResultNotice) obj);
            }
        }));
        duringCreated(zfv.m218524P0(m206032L2() ? "anchor" : "audience", m206027E2().mo149817n().f44324id, m206027E2().mo149813j().liveMode)).subscribe(ffw.m121197h(new e30() { // from class: l.or50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145234a.m205139d4((BLiveTurboCardInfo) obj);
            }
        }));
        duringCreated(m206027E2().m132160q1().m189042E()).subscribe(ffw.m121197h(new e30() { // from class: l.pr50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f150856a.m205131a4((e8t) obj);
            }
        }));
        duringCreated(m206028F2().OperationsEvent.showEntranceAnim().m172460g()).subscribe(new e30() { // from class: l.qr50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155966a.m205133V3((ku50) obj);
            }
        });
        duringCreated(m206028F2().OperationsEvent.refreshOperationMessage().m172460g()).subscribe(ffw.m121193d(new e30() { // from class: l.rr50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f160725a.m205132b4((ku50) obj);
            }
        }));
        duringCreated(m206028F2().OperationsEvent.openH5Dlg().m172460g()).filter(new w9j() { // from class: l.sr50
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.m81303a(((ku50) obj).m147249g()));
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.tr50
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171789a.m205138c4((ku50) obj);
            }
        }));
    }
}
