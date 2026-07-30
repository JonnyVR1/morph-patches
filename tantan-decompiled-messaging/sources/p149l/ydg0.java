package p149l;

import android.content.Context;
import android.os.Looper;
import tech.sud.gip.C22396R;
import tech.sud.gip.core.GameInfo;
import tech.sud.gip.core.SudLoadMGParamModel;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class ydg0 implements tbg0 {

    /* JADX INFO: renamed from: g */
    public static final String f197562g = "SudGIP ".concat(ydg0.class.getSimpleName());

    /* JADX INFO: renamed from: a */
    public final ejg0 f197563a;

    /* JADX INFO: renamed from: b */
    public final Context f197564b;

    /* JADX INFO: renamed from: c */
    public final udg0 f197565c;

    /* JADX INFO: renamed from: d */
    public GameInfo f197566d;

    /* JADX INFO: renamed from: e */
    public boolean f197567e = false;

    /* JADX INFO: renamed from: f */
    public final SudLoadMGParamModel f197568f;

    public ydg0(Context context, SudLoadMGParamModel sudLoadMGParamModel, vcg0 vcg0Var, ejg0 ejg0Var) {
        this.f197564b = context;
        this.f197568f = sudLoadMGParamModel;
        this.f197563a = ejg0Var;
        this.f197565c = vcg0Var.f180927a;
    }

    @Override // p149l.tbg0
    /* JADX INFO: renamed from: a */
    public final void mo149032a(GameInfo gameInfo, int i, String str) {
        this.f197567e = false;
        this.f197563a.m116843c(this.f197564b.getString(C22396R.string.fsm_mgp_game_loading_stage_get_mginfo));
        long j = gameInfo.mgId;
        x8g0 x8g0Var = new x8g0(this);
        if (i == 0) {
            String str2 = this.f197568f.roomId;
            String str3 = mlg0.f134426a;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                x8g0Var.onFailure(-1, "Please call on UI or Main thread");
                return;
            }
            mqg0 mqg0Var = mlg0.f134427b;
            if (!mqg0Var.f135224a) {
                x8g0Var.onFailure(-10103, "Please call initSDK first successfully");
                return;
            } else {
                GameInfo gameInfo2 = (GameInfo) mqg0Var.f135238o.get(Long.valueOf(j));
                lkg0.f128532c.execute(new z8g0(mqg0Var, j, mqg0Var.f135232i, gameInfo2 != null ? gameInfo2.clientVersion : 0L, str2, x8g0Var));
                return;
            }
        }
        if (1 != i) {
            LogUtils.file("SudGameLoadingStageGetMGInfo", "getMGInfo not support loadMgMode=" + i);
            SudLogger.m221567e(f197562g, "getMGInfo not support loadMgMode=" + i);
            return;
        }
        String str4 = this.f197568f.roomId;
        String str5 = mlg0.f134426a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            x8g0Var.onFailure(-1, "Please call on UI or Main thread");
            return;
        }
        mqg0 mqg0Var2 = mlg0.f134427b;
        if (mqg0Var2.f135224a) {
            lkg0.f128532c.execute(new dhg0(mqg0Var2, j, mqg0Var2.f135232i, str, str4, x8g0Var));
        } else {
            x8g0Var.onFailure(-10103, "Please call initSDK first successfully");
        }
    }

    @Override // p149l.tbg0
    public final void cancel() {
        this.f197567e = true;
    }
}
