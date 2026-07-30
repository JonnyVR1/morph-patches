package com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper;

import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.livingroom.intl.game.api.IntlGameApiProvider;
import com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.model.GameConfigModel;
import com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.model.GameViewInfoModel;
import com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.state.SudMGPMGState;
import java.util.HashMap;
import p149l.bgv;
import p149l.e30;
import p149l.ffw;
import p149l.fld0;
import p149l.h5j0;
import p149l.i0g0;
import p149l.ork;
import p149l.u6n;
import p149l.v5g0;
import p149l.vwb;
import p149l.ypv;
import p149l.zvf0;
import tech.sud.gip.core.ISudFSMStateHandle;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.a */
/* JADX INFO: loaded from: classes4.dex */
public class C12875a extends BaseGameHelper {

    /* JADX INFO: renamed from: k */
    public GameViewInfoModel.GameViewRectModel f50997k;

    /* JADX INFO: renamed from: l */
    public a f50998l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.a$a */
    public interface a {
        /* JADX INFO: renamed from: J0 */
        default void mo75286J0() {
        }

        /* JADX INFO: renamed from: Q0 */
        default void mo75287Q0(SudMGPMGState.MGCommonGameSound mGCommonGameSound) {
        }

        /* JADX INFO: renamed from: R0 */
        default void mo75288R0(String str, SudMGPMGState.MGCommonPlayerIn mGCommonPlayerIn) {
        }

        /* JADX INFO: renamed from: T0 */
        default void mo75289T0(String str, boolean z) {
        }

        /* JADX INFO: renamed from: Z */
        void mo75290Z(View view);

        /* JADX INFO: renamed from: n0 */
        void mo75291n0();

        /* JADX INFO: renamed from: n1 */
        default void mo75292n1(String str, SudMGPMGState.MGCommonPlayerPlaying mGCommonPlayerPlaying) {
        }

        void onGameDestroyed();

        void onGameStarted();

        /* JADX INFO: renamed from: t0 */
        void mo75293t0();

        /* JADX INFO: renamed from: x0 */
        default void mo75294x0(SudMGPMGState.MGCommonGameSoundState mGCommonGameSoundState) {
        }
    }

    public C12875a(Act act) {
        super(act);
    }

    /* JADX INFO: renamed from: G */
    public GameConfigModel m75277G() {
        return this.f50982g;
    }

    /* JADX INFO: renamed from: H */
    public void m75278H(String str) {
        this.f50978c.notifyAPPCommonSelfKick(str);
    }

    /* JADX INFO: renamed from: I */
    public void m75279I(long j) {
        this.f50978c.notifyAPPCommonGameScore(j);
    }

    /* JADX INFO: renamed from: J */
    public void m75280J() {
        this.f50978c.notifyAPPCommonSelfIn(true, -1, true, 1);
    }

    /* JADX INFO: renamed from: K */
    public void m75281K() {
        this.f50978c.notifyAPPCommonSelfPlaying(false, null, null);
    }

    /* JADX INFO: renamed from: L */
    public void m75282L() {
        this.f50978c.notifyAPPCommonSelfReady(false);
    }

    /* JADX INFO: renamed from: M */
    public void m75283M() {
        this.f50978c.notifyAPPCommonSelfReady(true);
    }

    /* JADX INFO: renamed from: N */
    public void m75284N() {
        this.f50978c.notifyAPPCommonSelfIn(false, -1, true, 1);
    }

    /* JADX INFO: renamed from: O */
    public void m75285O(a aVar) {
        this.f50998l = aVar;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: i */
    public String mo75256i() {
        return u6n.m192015a() ? v5g0.f180042c : v5g0.f180040a;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: j */
    public String mo75257j() {
        return u6n.m192015a() ? v5g0.f180043d : v5g0.f180041b;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: k */
    public void mo75258k(String str, String str2, final BaseGameHelper.InterfaceC12874e interfaceC12874e) {
        this.f50976a.duringCreated(IntlGameApiProvider.getCode(str)).subscribe(ffw.m121194e(new e30() { // from class: l.ucp
            @Override // p149l.e30
            public final void call(Object obj) {
                interfaceC12874e.onSuccess((String) obj);
            }
        }, new e30() { // from class: l.vcp
            @Override // p149l.e30
            public final void call(Object obj) {
                interfaceC12874e.mo75274a();
            }
        }));
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: l */
    public void mo75259l(GameViewInfoModel gameViewInfoModel) {
        GameViewInfoModel.GameViewRectModel gameViewRectModel = this.f50997k;
        if (gameViewRectModel != null) {
            gameViewInfoModel.view_game_rect = gameViewRectModel;
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: m */
    public String mo75260m() {
        return i0g0.m133885y();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: o */
    public String mo75262o() {
        return ypv.f199493a.m199309D0();
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onGameMGCommonDestroyGameScene(ISudFSMStateHandle iSudFSMStateHandle) {
        super.onGameMGCommonDestroyGameScene(iSudFSMStateHandle);
        a aVar = this.f50998l;
        if (aVar != null) {
            aVar.onGameDestroyed();
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onGameMGCommonGameMoneyNotEnough(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameMoneyNotEnough mGCommonGameMoneyNotEnough) {
        super.onGameMGCommonGameMoneyNotEnough(iSudFSMStateHandle, mGCommonGameMoneyNotEnough);
        a aVar = this.f50998l;
        if (aVar != null) {
            aVar.mo75291n0();
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onGameMGCommonGameSound(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameSound mGCommonGameSound) {
        super.onGameMGCommonGameSound(iSudFSMStateHandle, mGCommonGameSound);
        a aVar = this.f50998l;
        if (aVar != null) {
            aVar.mo75287Q0(mGCommonGameSound);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onGameMGCommonGameSoundState(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameSoundState mGCommonGameSoundState) {
        super.onGameMGCommonGameSoundState(iSudFSMStateHandle, mGCommonGameSoundState);
        a aVar = this.f50998l;
        if (aVar != null) {
            aVar.mo75294x0(mGCommonGameSoundState);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onGameMGCommonSelfClickJoinBtn(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonSelfClickJoinBtn mGCommonSelfClickJoinBtn) {
        super.onGameMGCommonSelfClickJoinBtn(iSudFSMStateHandle, mGCommonSelfClickJoinBtn);
        a aVar = this.f50998l;
        if (aVar != null) {
            aVar.mo75286J0();
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper, com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onGameStarted() {
        super.onGameStarted();
        a aVar = this.f50998l;
        if (aVar != null) {
            aVar.onGameStarted();
        }
        zvf0.m220369B("e_sud_game_start_mgid", "p_sudgames_game_start", vwb.m200311Y("sud_game_mgid", Long.valueOf(BaseGameHelper.f50975j)));
        fld0<bgv> fld0Var = fld0.f98151f;
        boolean zBooleanValue = ((bgv) ypv.m215673l(fld0Var)).f75523w.get().booleanValue();
        HashMap map = new HashMap();
        map.put("sud_game_id", String.valueOf(BaseGameHelper.f50975j));
        map.put("sud_game_frist_load", String.valueOf(zBooleanValue));
        h5j0.INSTANCE.m129403b("sud_game_loading", "load_game_end", ork.m165672d(map));
        if (zBooleanValue) {
            ((bgv) ypv.m215673l(fld0Var)).f75523w.put(Boolean.FALSE);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onPlayerMGCommonPlayerIn(ISudFSMStateHandle iSudFSMStateHandle, String str, SudMGPMGState.MGCommonPlayerIn mGCommonPlayerIn) {
        super.onPlayerMGCommonPlayerIn(iSudFSMStateHandle, str, mGCommonPlayerIn);
        a aVar = this.f50998l;
        if (aVar != null) {
            aVar.mo75288R0(str, mGCommonPlayerIn);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onPlayerMGCommonPlayerPlaying(ISudFSMStateHandle iSudFSMStateHandle, String str, SudMGPMGState.MGCommonPlayerPlaying mGCommonPlayerPlaying) {
        super.onPlayerMGCommonPlayerPlaying(iSudFSMStateHandle, str, mGCommonPlayerPlaying);
        a aVar = this.f50998l;
        if (aVar != null) {
            aVar.mo75292n1(str, mGCommonPlayerPlaying);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onPlayerMGCommonPlayerReady(ISudFSMStateHandle iSudFSMStateHandle, String str, SudMGPMGState.MGCommonPlayerReady mGCommonPlayerReady) {
        super.onPlayerMGCommonPlayerReady(iSudFSMStateHandle, str, mGCommonPlayerReady);
        a aVar = this.f50998l;
        if (aVar != null) {
            aVar.mo75289T0(str, mGCommonPlayerReady.isReady);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: q */
    public boolean mo75264q() {
        return false;
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: v */
    public void mo75269v(View view) {
        a aVar = this.f50998l;
        if (aVar != null) {
            aVar.mo75290Z(view);
        }
    }

    @Override // com.p046p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: y */
    public void mo75272y() {
        a aVar = this.f50998l;
        if (aVar != null) {
            aVar.mo75293t0();
        }
    }
}
