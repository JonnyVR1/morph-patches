package p153l;

import android.content.Context;
import com.p051p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.state.SudMGPMGState;
import java.lang.ref.WeakReference;
import tech.sud.gip.asr.base.BaseRealSudASRImpl;
import tech.sud.gip.asr.base.model.InitASRParamModel;
import tech.sud.gip.core.ISudFSMMG;

/* JADX INFO: loaded from: classes3.dex */
public final class kpg0 implements vrg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ wyg0 f127888a;

    public kpg0(wyg0 wyg0Var) {
        this.f127888a = wyg0Var;
    }

    @Override // p153l.vrg0
    /* JADX INFO: renamed from: a */
    public final void mo115645a(String str, String str2, String str3, String str4, gfg0 gfg0Var) {
        gog0 gog0VarM131110a;
        bfg0 bfg0Var = this.f127888a.f191652m;
        if (bfg0Var != null && (((gog0VarM131110a = gog0.m131110a(str4)) != null && gog0VarM131110a.f105289a) || bfg0Var.f76491b.f88522v != null)) {
            dhg0 dhg0Var = bfg0Var.f76491b;
            if (dhg0Var.f88522v == null) {
                Context context = dhg0Var.f88508h;
                dhg0 dhg0Var2 = bfg0Var.f76490a;
                String str5 = dhg0Var.f88503c;
                long j = dhg0Var.f88505e;
                String str6 = dhg0Var.f88504d;
                InitASRParamModel initASRParamModel = new InitASRParamModel();
                initASRParamModel.context = context;
                initASRParamModel.iSudFSTAPP = new WeakReference<>(dhg0Var2);
                initASRParamModel.userId = str5;
                initASRParamModel.mgId = j;
                initASRParamModel.roomId = str6;
                dhg0Var.f88522v = new mkg0(initASRParamModel);
            }
            BaseRealSudASRImpl baseRealSudASRImpl = bfg0Var.f76491b.f88522v.f137298a;
            if (baseRealSudASRImpl != null) {
                baseRealSudASRImpl.handleGameASR(str4);
            }
        }
        ISudFSMMG iSudFSMMG = (ISudFSMMG) this.f127888a.f191642c.get();
        if (iSudFSMMG != null) {
            iSudFSMMG.onGameStateChange(gfg0Var, SudMGPMGState.MG_COMMON_GAME_ASR, str4);
        }
    }
}
