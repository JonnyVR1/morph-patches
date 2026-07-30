package com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper;

import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.livingroom.intl.game.api.IntlGameApiProvider;
import com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.model.GameConfigModel;
import com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.model.GameViewInfoModel;
import com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.state.SudMGPMGState;
import java.util.HashMap;
import p153l.civ;
import p153l.deg0;
import p153l.dhw;
import p153l.euk;
import p153l.htd0;
import p153l.i4g0;
import p153l.jyb;
import p153l.lej0;
import p153l.q8g0;
import p153l.u8n;
import p153l.y20;
import p153l.zrv;
import tech.sud.gip.core.ISudFSMStateHandle;

/* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.a */
/* JADX INFO: loaded from: classes5.dex */
public class C13038a extends BaseGameHelper {

    /* JADX INFO: renamed from: k */
    public GameViewInfoModel.GameViewRectModel f51845k;

    /* JADX INFO: renamed from: l */
    public a f51846l;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.a$a */
    public interface a {
        /* JADX INFO: renamed from: J0 */
        default void mo76469J0() {
        }

        /* JADX INFO: renamed from: Q0 */
        default void mo76470Q0(SudMGPMGState.MGCommonGameSound mGCommonGameSound) {
        }

        /* JADX INFO: renamed from: R0 */
        default void mo76471R0(String str, SudMGPMGState.MGCommonPlayerIn mGCommonPlayerIn) {
        }

        /* JADX INFO: renamed from: T0 */
        default void mo76472T0(String str, boolean z) {
        }

        /* JADX INFO: renamed from: Z */
        void mo76473Z(View view);

        /* JADX INFO: renamed from: n0 */
        void mo76474n0();

        /* JADX INFO: renamed from: n1 */
        default void mo76475n1(String str, SudMGPMGState.MGCommonPlayerPlaying mGCommonPlayerPlaying) {
        }

        void onGameDestroyed();

        void onGameStarted();

        /* JADX INFO: renamed from: t0 */
        void mo76476t0();

        /* JADX INFO: renamed from: x0 */
        default void mo76477x0(SudMGPMGState.MGCommonGameSoundState mGCommonGameSoundState) {
        }
    }

    public C13038a(Act act) {
        super(act);
    }

    /* JADX INFO: renamed from: G */
    public GameConfigModel m76460G() {
        return this.f51830g;
    }

    /* JADX INFO: renamed from: H */
    public void m76461H(String str) {
        this.f51826c.notifyAPPCommonSelfKick(str);
    }

    /* JADX INFO: renamed from: I */
    public void m76462I(long j) {
        this.f51826c.notifyAPPCommonGameScore(j);
    }

    /* JADX INFO: renamed from: J */
    public void m76463J() {
        this.f51826c.notifyAPPCommonSelfIn(true, -1, true, 1);
    }

    /* JADX INFO: renamed from: K */
    public void m76464K() {
        this.f51826c.notifyAPPCommonSelfPlaying(false, null, null);
    }

    /* JADX INFO: renamed from: L */
    public void m76465L() {
        this.f51826c.notifyAPPCommonSelfReady(false);
    }

    /* JADX INFO: renamed from: M */
    public void m76466M() {
        this.f51826c.notifyAPPCommonSelfReady(true);
    }

    /* JADX INFO: renamed from: N */
    public void m76467N() {
        this.f51826c.notifyAPPCommonSelfIn(false, -1, true, 1);
    }

    /* JADX INFO: renamed from: O */
    public void m76468O(a aVar) {
        this.f51846l = aVar;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: i */
    public String mo76439i() {
        return u8n.m195065a() ? deg0.f88026c : deg0.f88024a;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: j */
    public String mo76440j() {
        return u8n.m195065a() ? deg0.f88027d : deg0.f88025b;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: k */
    public void mo76441k(String str, String str2, final BaseGameHelper.InterfaceC13037e interfaceC13037e) {
        this.f51824a.duringCreated(IntlGameApiProvider.getCode(str)).subscribe(dhw.m115826e(new y20() { // from class: l.uep
            @Override // p153l.y20
            public final void call(Object obj) {
                interfaceC13037e.onSuccess((String) obj);
            }
        }, new y20() { // from class: l.vep
            @Override // p153l.y20
            public final void call(Object obj) {
                interfaceC13037e.mo76457a();
            }
        }));
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: l */
    public void mo76442l(GameViewInfoModel gameViewInfoModel) {
        GameViewInfoModel.GameViewRectModel gameViewRectModel = this.f51845k;
        if (gameViewRectModel != null) {
            gameViewInfoModel.view_game_rect = gameViewRectModel;
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: m */
    public String mo76443m() {
        return q8g0.m175820y();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: o */
    public String mo76445o() {
        return zrv.f205799a.m207631D0();
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onGameMGCommonDestroyGameScene(ISudFSMStateHandle iSudFSMStateHandle) {
        super.onGameMGCommonDestroyGameScene(iSudFSMStateHandle);
        a aVar = this.f51846l;
        if (aVar != null) {
            aVar.onGameDestroyed();
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onGameMGCommonGameMoneyNotEnough(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameMoneyNotEnough mGCommonGameMoneyNotEnough) {
        super.onGameMGCommonGameMoneyNotEnough(iSudFSMStateHandle, mGCommonGameMoneyNotEnough);
        a aVar = this.f51846l;
        if (aVar != null) {
            aVar.mo76474n0();
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onGameMGCommonGameSound(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameSound mGCommonGameSound) {
        super.onGameMGCommonGameSound(iSudFSMStateHandle, mGCommonGameSound);
        a aVar = this.f51846l;
        if (aVar != null) {
            aVar.mo76470Q0(mGCommonGameSound);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onGameMGCommonGameSoundState(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonGameSoundState mGCommonGameSoundState) {
        super.onGameMGCommonGameSoundState(iSudFSMStateHandle, mGCommonGameSoundState);
        a aVar = this.f51846l;
        if (aVar != null) {
            aVar.mo76477x0(mGCommonGameSoundState);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onGameMGCommonSelfClickJoinBtn(ISudFSMStateHandle iSudFSMStateHandle, SudMGPMGState.MGCommonSelfClickJoinBtn mGCommonSelfClickJoinBtn) {
        super.onGameMGCommonSelfClickJoinBtn(iSudFSMStateHandle, mGCommonSelfClickJoinBtn);
        a aVar = this.f51846l;
        if (aVar != null) {
            aVar.mo76469J0();
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper, com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onGameStarted() {
        super.onGameStarted();
        a aVar = this.f51846l;
        if (aVar != null) {
            aVar.onGameStarted();
        }
        i4g0.m138493B("e_sud_game_start_mgid", "p_sudgames_game_start", jyb.m147494Y("sud_game_mgid", Long.valueOf(BaseGameHelper.f51823j)));
        htd0<civ> htd0Var = htd0.f111524f;
        boolean zBooleanValue = ((civ) zrv.m221194l(htd0Var)).f82016w.get().booleanValue();
        HashMap map = new HashMap();
        map.put("sud_game_id", String.valueOf(BaseGameHelper.f51823j));
        map.put("sud_game_frist_load", String.valueOf(zBooleanValue));
        lej0.INSTANCE.m153908b("sud_game_loading", "load_game_end", euk.m122578d(map));
        if (zBooleanValue) {
            ((civ) zrv.m221194l(htd0Var)).f82016w.put(Boolean.FALSE);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onPlayerMGCommonPlayerIn(ISudFSMStateHandle iSudFSMStateHandle, String str, SudMGPMGState.MGCommonPlayerIn mGCommonPlayerIn) {
        super.onPlayerMGCommonPlayerIn(iSudFSMStateHandle, str, mGCommonPlayerIn);
        a aVar = this.f51846l;
        if (aVar != null) {
            aVar.mo76471R0(str, mGCommonPlayerIn);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onPlayerMGCommonPlayerPlaying(ISudFSMStateHandle iSudFSMStateHandle, String str, SudMGPMGState.MGCommonPlayerPlaying mGCommonPlayerPlaying) {
        super.onPlayerMGCommonPlayerPlaying(iSudFSMStateHandle, str, mGCommonPlayerPlaying);
        a aVar = this.f51846l;
        if (aVar != null) {
            aVar.mo76475n1(str, mGCommonPlayerPlaying);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.decorator.SudFSMMGListener
    public void onPlayerMGCommonPlayerReady(ISudFSMStateHandle iSudFSMStateHandle, String str, SudMGPMGState.MGCommonPlayerReady mGCommonPlayerReady) {
        super.onPlayerMGCommonPlayerReady(iSudFSMStateHandle, str, mGCommonPlayerReady);
        a aVar = this.f51846l;
        if (aVar != null) {
            aVar.mo76472T0(str, mGCommonPlayerReady.isReady);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: q */
    public boolean mo76447q() {
        return false;
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: v */
    public void mo76452v(View view) {
        a aVar = this.f51846l;
        if (aVar != null) {
            aVar.mo76473Z(view);
        }
    }

    @Override // com.p051p1.mobile.putong.live.livingroom.intl.game.sudGame.helper.BaseGameHelper
    /* JADX INFO: renamed from: y */
    public void mo76455y() {
        a aVar = this.f51846l;
        if (aVar != null) {
            aVar.mo76476t0();
        }
    }
}
