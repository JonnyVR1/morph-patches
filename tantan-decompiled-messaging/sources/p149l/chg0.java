package p149l;

import android.content.Context;
import com.p046p1.mobile.putong.live.livingroom.intl.game.sudMGPWrapper.state.SudMGPMGState;
import java.lang.ref.WeakReference;
import tech.sud.gip.asr.base.BaseRealSudASRImpl;
import tech.sud.gip.asr.base.model.InitASRParamModel;
import tech.sud.gip.core.ISudFSMMG;

/* JADX INFO: loaded from: classes3.dex */
public final class chg0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f80872a;

    public chg0(oqg0 oqg0Var) {
        this.f80872a = oqg0Var;
    }

    @Override // p149l.njg0
    /* JADX INFO: renamed from: a */
    public final void mo100626a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        yfg0 yfg0VarM214551a;
        t6g0 t6g0Var = this.f80872a.f145150m;
        if (t6g0Var != null && (((yfg0VarM214551a = yfg0.m214551a(str4)) != null && yfg0VarM214551a.f198056a) || t6g0Var.f168615b.f180520v != null)) {
            v8g0 v8g0Var = t6g0Var.f168615b;
            if (v8g0Var.f180520v == null) {
                Context context = v8g0Var.f180506h;
                v8g0 v8g0Var2 = t6g0Var.f168614a;
                String str5 = v8g0Var.f180501c;
                long j = v8g0Var.f180503e;
                String str6 = v8g0Var.f180502d;
                InitASRParamModel initASRParamModel = new InitASRParamModel();
                initASRParamModel.context = context;
                initASRParamModel.iSudFSTAPP = new WeakReference<>(v8g0Var2);
                initASRParamModel.userId = str5;
                initASRParamModel.mgId = j;
                initASRParamModel.roomId = str6;
                v8g0Var.f180520v = new ecg0(initASRParamModel);
            }
            BaseRealSudASRImpl baseRealSudASRImpl = t6g0Var.f168615b.f180520v.f90501a;
            if (baseRealSudASRImpl != null) {
                baseRealSudASRImpl.handleGameASR(str4);
            }
        }
        ISudFSMMG iSudFSMMG = (ISudFSMMG) this.f80872a.f145140c.get();
        if (iSudFSMMG != null) {
            iSudFSMMG.onGameStateChange(y6g0Var, SudMGPMGState.MG_COMMON_GAME_ASR, str4);
        }
    }
}
