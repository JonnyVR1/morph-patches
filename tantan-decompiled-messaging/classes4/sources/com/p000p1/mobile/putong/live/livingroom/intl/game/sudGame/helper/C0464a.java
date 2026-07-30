package com.p000p1.mobile.putong.live.livingroom.intl.game.sudGame.helper;

import android.view.View;
import com.p000p1.mobile.putong.live.livingroom.intl.game.api.IntlGameApiProvider;
import com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.model.GameConfigModel;
import com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.model.GameViewInfoModel;
import com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.state.SudMGPMGState;
import com.p1.mobile.android.app.Act;
import java.util.HashMap;
import l.bgv;
import l.e30;
import l.ffw;
import l.fld0;
import l.h5j0;
import l.i0g0;
import l.j760;
import l.ork;
import l.u6n;
import l.vwb;
import l.ypv;
import l.zvf0;
import p002l.v5g0;
import tech.sud.gip.core.ISudFSMStateHandle;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.a */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class C0464a extends BaseGameHelper {

    /* JADX INFO: renamed from: k */
    public GameViewInfoModel.GameViewRectModel f7039k;

    /* JADX INFO: renamed from: l */
    public a f7040l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.a$a */
    public interface a {
        /* JADX INFO: renamed from: J0 */
        default void m8905J0() {
        }

        /* JADX INFO: renamed from: Q0 */
        default void m8906Q0(SudMGPMGState.MGCommonGameSound mGCommonGameSound) {
        }

        /* JADX INFO: renamed from: R0 */
        default void m8907R0(String str, SudMGPMGState.MGCommonPlayerIn mGCommonPlayerIn) {
        }

        /* JADX INFO: renamed from: T0 */
        default void m8908T0(String str, boolean z) {
        }

        /* JADX INFO: renamed from: Z */
        void mo8909Z(View view);

        /* JADX INFO: renamed from: n0 */
        void mo8910n0();

        /* JADX INFO: renamed from: n1 */
        default void m8911n1(String str, SudMGPMGState.MGCommonPlayerPlaying mGCommonPlayerPlaying) {
        }

        void onGameDestroyed();

        void onGameStarted();

        /* JADX INFO: renamed from: t0 */
        void mo8912t0();

        /* JADX INFO: renamed from: x0 */
        default void m8913x0(SudMGPMGState.MGCommonGameSoundState mGCommonGameSoundState) {
        }
    }

    public C0464a(Act act) {
        super(act);
    }

    /* JADX INFO: renamed from: G */
    public GameConfigModel m8896G() {
        return this.f7024g;
    }

    /* JADX INFO: renamed from: H */
    public void m8897H(String str) {
        this.f7020c.notifyAPPCommonSelfKick(str);
    }

    /* JADX INFO: renamed from: I */
    public void m8898I(long j) {
        this.f7020c.notifyAPPCommonGameScore(j);
    }

    /* JADX INFO: renamed from: J */
    public void m8899J() {
        this.f7020c.notifyAPPCommonSelfIn(true, -1, true, 1);
    }

    /* JADX INFO: renamed from: K */
    public void m8900K() {
        this.f7020c.notifyAPPCommonSelfPlaying(false, null, null);
    }

    /* JADX INFO: renamed from: L */
    public void m8901L() {
        this.f7020c.notifyAPPCommonSelfReady(false);
    }

    /* JADX INFO: renamed from: M */
    public void m8902M() {
        this.f7020c.notifyAPPCommonSelfReady(true);
    }

    /* JADX INFO: renamed from: N */
    public void m8903N() {
        this.f7020c.notifyAPPCommonSelfIn(false, -1, true, 1);
    }

    /* JADX INFO: renamed from: O */
    public void m8904O(a aVar) {
        this.f7040l = aVar;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: i */
    public String mo8875i() {
        return u6n.a() ? v5g0.f20981c : v5g0.f20979a;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: j */
    public String mo8876j() {
        return u6n.a() ? v5g0.f20982d : v5g0.f20980b;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: k */
    public void mo8877k(String str, String str2, final BaseGameHelper.InterfaceC0463e interfaceC0463e) {
        this.f7018a.duringCreated(IntlGameApiProvider.getCode(str)).subscribe(ffw.e(new e30() { // from class: l.ucp
            public final void call(Object obj) {
                interfaceC0463e.onSuccess((String) obj);
            }
        }, new e30() { // from class: l.vcp
            public final void call(Object obj) {
                interfaceC0463e.mo8893a();
            }
        }));
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: l */
    public void mo8878l(GameViewInfoModel gameViewInfoModel) {
        GameViewInfoModel.GameViewRectModel gameViewRectModel = this.f7039k;
        if (gameViewRectModel != null) {
            gameViewInfoModel.view_game_rect = gameViewRectModel;
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: m */
    public String mo8879m() {
        return i0g0.y();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: o */
    public String mo8881o() {
        return ypv.a.D0();
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onGameMGCommonDestroyGameScene(ISudFSMStateHandle iSudFSMStateHandle) {
        super.onGameMGCommonDestroyGameScene(iSudFSMStateHandle);
        a aVar = this.f7040l;
        if (aVar != null) {
            aVar.onGameDestroyed();
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onGameMGCommonGameMoneyNotEnough(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameMoneyNotEnough mGCommonGameMoneyNotEnough) {
        super.onGameMGCommonGameMoneyNotEnough(iSudFSMStateHandle, mGCommonGameMoneyNotEnough);
        a aVar = this.f7040l;
        if (aVar != null) {
            aVar.mo8910n0();
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onGameMGCommonGameSound(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameSound mGCommonGameSound) {
        super.onGameMGCommonGameSound(iSudFSMStateHandle, mGCommonGameSound);
        a aVar = this.f7040l;
        if (aVar != null) {
            aVar.m8906Q0(mGCommonGameSound);
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onGameMGCommonGameSoundState(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameSoundState mGCommonGameSoundState) {
        super.onGameMGCommonGameSoundState(iSudFSMStateHandle, mGCommonGameSoundState);
        a aVar = this.f7040l;
        if (aVar != null) {
            aVar.m8913x0(mGCommonGameSoundState);
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onGameMGCommonSelfClickJoinBtn(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonSelfClickJoinBtn mGCommonSelfClickJoinBtn) {
        super.onGameMGCommonSelfClickJoinBtn(iSudFSMStateHandle, mGCommonSelfClickJoinBtn);
        a aVar = this.f7040l;
        if (aVar != null) {
            aVar.m8905J0();
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper, com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onGameStarted() {
        super.onGameStarted();
        a aVar = this.f7040l;
        if (aVar != null) {
            aVar.onGameStarted();
        }
        zvf0.B("e_sud_game_start_mgid", "p_sudgames_game_start", new j760[]{vwb.Y("sud_game_mgid", Long.valueOf(BaseGameHelper.f7017j))});
        fld0 fld0Var = fld0.f;
        boolean zBooleanValue = ((Boolean) ((bgv) ypv.l(fld0Var)).w.get()).booleanValue();
        HashMap map = new HashMap();
        map.put("sud_game_id", String.valueOf(BaseGameHelper.f7017j));
        map.put("sud_game_frist_load", String.valueOf(zBooleanValue));
        h5j0.INSTANCE.b("sud_game_loading", "load_game_end", ork.d(map));
        if (zBooleanValue) {
            ((bgv) ypv.l(fld0Var)).w.put(Boolean.FALSE);
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onPlayerMGCommonPlayerIn(ISudFSMStateHandle iSudFSMStateHandle, String str, SudMGPMGState.MGCommonPlayerIn mGCommonPlayerIn) {
        super.onPlayerMGCommonPlayerIn(iSudFSMStateHandle, str, mGCommonPlayerIn);
        a aVar = this.f7040l;
        if (aVar != null) {
            aVar.m8907R0(str, mGCommonPlayerIn);
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onPlayerMGCommonPlayerPlaying(ISudFSMStateHandle iSudFSMStateHandle, String str, SudMGPMGState.MGCommonPlayerPlaying mGCommonPlayerPlaying) {
        super.onPlayerMGCommonPlayerPlaying(iSudFSMStateHandle, str, mGCommonPlayerPlaying);
        a aVar = this.f7040l;
        if (aVar != null) {
            aVar.m8911n1(str, mGCommonPlayerPlaying);
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onPlayerMGCommonPlayerReady(ISudFSMStateHandle iSudFSMStateHandle, String str, SudMGPMGState.MGCommonPlayerReady mGCommonPlayerReady) {
        super.onPlayerMGCommonPlayerReady(iSudFSMStateHandle, str, mGCommonPlayerReady);
        a aVar = this.f7040l;
        if (aVar != null) {
            aVar.m8908T0(str, mGCommonPlayerReady.isReady);
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: q */
    public boolean mo8883q() {
        return false;
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: v */
    public void mo8888v(View view) {
        a aVar = this.f7040l;
        if (aVar != null) {
            aVar.mo8909Z(view);
        }
    }

    @Override // com.p000p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: y */
    public void mo8891y() {
        a aVar = this.f7040l;
        if (aVar != null) {
            aVar.mo8912t0();
        }
    }
}
