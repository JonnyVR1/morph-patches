package p003l;

import android.content.Context;
import java.lang.ref.WeakReference;
import l.ecg0;
import l.njg0;
import l.t6g0;
import l.v8g0;
import l.y6g0;
import l.yfg0;
import tech.sud.gip.asr.base.BaseRealSudASRImpl;
import tech.sud.gip.asr.base.model.InitASRParamModel;
import tech.sud.gip.core.ISudFSMMG;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public final class chg0 implements njg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ oqg0 f2647a;

    public chg0(oqg0 oqg0Var) {
        this.f2647a = oqg0Var;
    }

    /* JADX INFO: renamed from: a */
    public final void m3262a(String str, String str2, String str3, String str4, y6g0 y6g0Var) {
        yfg0 yfg0VarA;
        t6g0 t6g0Var = this.f2647a.f6216m;
        if (t6g0Var != null && (((yfg0VarA = yfg0.a(str4)) != null && yfg0VarA.a) || t6g0Var.b.v != null)) {
            v8g0 v8g0Var = t6g0Var.b;
            if (v8g0Var.v == null) {
                Context context = v8g0Var.h;
                v8g0 v8g0Var2 = t6g0Var.a;
                String str5 = v8g0Var.c;
                long j = v8g0Var.e;
                String str6 = v8g0Var.d;
                InitASRParamModel initASRParamModel = new InitASRParamModel();
                initASRParamModel.context = context;
                initASRParamModel.iSudFSTAPP = new WeakReference<>(v8g0Var2);
                initASRParamModel.userId = str5;
                initASRParamModel.mgId = j;
                initASRParamModel.roomId = str6;
                v8g0Var.v = new ecg0(initASRParamModel);
            }
            BaseRealSudASRImpl baseRealSudASRImpl = t6g0Var.b.v.a;
            if (baseRealSudASRImpl != null) {
                baseRealSudASRImpl.handleGameASR(str4);
            }
        }
        ISudFSMMG iSudFSMMG = (ISudFSMMG) this.f2647a.f6206c.get();
        if (iSudFSMMG != null) {
            iSudFSMMG.onGameStateChange(y6g0Var, "mg_common_game_asr", str4);
        }
    }
}
