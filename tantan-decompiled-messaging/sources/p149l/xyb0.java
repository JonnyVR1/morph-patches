package p149l;

import com.p046p1.mobile.putong.live.base.data.BLiveButtonType;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.Area;
import com.p046p1.mobile.putong.live.livingroom.voice.bottom.BottomMenuView;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class xyb0 extends h4t<nnn0, BottomMenuView> {

    /* JADX INFO: renamed from: i */
    public List<mim0<?>> f195037i;

    public xyb0(bsm<nnn0> bsmVar, BottomMenuView bottomMenuView) {
        super(bsmVar);
        mo51532C(bottomMenuView);
    }

    /* JADX INFO: renamed from: N3 */
    public AbstractC16991g4.a m211748N3(int i, String str) {
        AbstractC16991g4.a aVarM211749O3 = m211749O3(i);
        if (aVarM211749O3 != null) {
            return aVarM211749O3;
        }
        str.getClass();
        switch (str) {
            case "settingButtonBubble":
            case "setVoiceRoomBgBubble":
            case "voiceRoomGameCenterBubble":
                return m211750P3("settingButton");
            case "gamePanelButtonBubble":
                return m211750P3(BLiveButtonType.intlGamePanel);
            default:
                return null;
        }
    }

    /* JADX INFO: renamed from: O3 */
    public final AbstractC16991g4.a m211749O3(final int i) {
        mim0 mim0Var = (mim0) vwb.m200346r(this.f195037i, new w9j() { // from class: l.wyb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((mim0) obj).m154732Z3() == i);
            }
        });
        if (mim0Var == null || mim0Var.mo116706d4() == null) {
            return null;
        }
        return new AbstractC16991g4.a(mim0Var.mo116706d4());
    }

    /* JADX INFO: renamed from: P3 */
    public AbstractC16991g4.a m211750P3(final String str) {
        mim0 mim0Var = (mim0) vwb.m200346r(this.f195037i, new w9j() { // from class: l.vyb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((mim0) obj).mo154733a4().equals(str));
            }
        });
        if (mim0Var == null || mim0Var.mo116706d4() == null) {
            return null;
        }
        return new AbstractC16991g4.a(mim0Var.mo116706d4());
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ void m211751R3(Area area) {
        m211752S3(this.f195037i);
    }

    /* JADX INFO: renamed from: S3 */
    public void m211752S3(List<mim0<?>> list) {
        this.f195037i = list;
        V v2 = this.viewModel;
        if (list == null) {
            ((BottomMenuView) v2).m77747c();
        } else {
            ((BottomMenuView) v2).setItems(list);
        }
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: T */
    public void mo70198T() {
        super.mo70198T();
    }

    @Override // p149l.k4t, p149l.gul
    /* JADX INFO: renamed from: t */
    public void mo72465t() {
        super.mo72465t();
        ((BottomMenuView) this.viewModel).m77746b(true);
        duringCreated(m206028F2().BottomZoneEvent.refreshButton().m172460g()).filter(new w9j() { // from class: l.tyb0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((Area) obj) == Area.BOTTOM);
            }
        }).subscribe(ffw.m121193d(new e30() { // from class: l.uyb0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f178846a.m211751R3((Area) obj);
            }
        }));
    }
}
