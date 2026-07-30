package p153l;

import com.p051p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.Area;
import com.p051p1.mobile.putong.live.livingroom.voice.bottom.BottomMenuView;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class b7c0 extends i6t<rwn0, BottomMenuView> {

    /* JADX INFO: renamed from: i */
    public List<qrm0<?>> f75274i;

    public b7c0(dum<rwn0> dumVar, BottomMenuView bottomMenuView) {
        super(dumVar);
        mo52715C(bottomMenuView);
    }

    /* JADX INFO: renamed from: N3 */
    public AbstractC17128g4.a m102828N3(int i, String str) {
        AbstractC17128g4.a aVarM102829O3 = m102829O3(i);
        if (aVarM102829O3 != null) {
            return aVarM102829O3;
        }
        str.getClass();
        switch (str) {
            case "settingButtonBubble":
            case "setVoiceRoomBgBubble":
            case "voiceRoomGameCenterBubble":
                return m102830P3("settingButton");
            case "gamePanelButtonBubble":
                return m102830P3(BLiveButtonType.intlGamePanel);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final AbstractC17128g4.a m102829O3(final int i) {
        qrm0 qrm0Var = (qrm0) jyb.m147529r(this.f75274i, new qcj() { // from class: l.a7c0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((qrm0) obj).m177580Z3() == i);
            }
        });
        if (qrm0Var == null || qrm0Var.mo177581d4() == null) {
            return null;
        }
        return new AbstractC17128g4.a(qrm0Var.mo177581d4());
    }

    /* JADX INFO: renamed from: P3 */
    public AbstractC17128g4.a m102830P3(final String str) {
        qrm0 qrm0Var = (qrm0) jyb.m147529r(this.f75274i, new qcj() { // from class: l.z6c0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((qrm0) obj).mo112224a4().equals(str));
            }
        });
        if (qrm0Var == null || qrm0Var.mo177581d4() == null) {
            return null;
        }
        return new AbstractC17128g4.a(qrm0Var.mo177581d4());
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m102831R3(Area area) {
        m102832S3(this.f75274i);
    }

    /* JADX INFO: renamed from: S3 */
    public void m102832S3(List<qrm0<?>> list) {
        this.f75274i = list;
        V v2 = this.viewModel;
        if (list == null) {
            ((BottomMenuView) v2).m78930c();
        } else {
            ((BottomMenuView) v2).setItems(list);
        }
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: T */
    public void mo71381T() {
        super.mo71381T();
    }

    @Override // p153l.l6t, p153l.uwl
    /* JADX INFO: renamed from: t */
    public void mo73648t() {
        super.mo73648t();
        ((BottomMenuView) this.viewModel).m78929b(true);
        duringCreated(m213811F2().BottomZoneEvent.refreshButton().m199270g()).filter(new qcj() { // from class: l.x6c0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((Area) obj) == Area.BOTTOM);
            }
        }).subscribe(dhw.m115825d(new y20() { // from class: l.y6c0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f197678a.m102831R3((Area) obj);
            }
        }));
    }
}
