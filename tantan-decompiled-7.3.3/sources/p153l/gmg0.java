package p153l;

import android.content.Context;
import android.os.Looper;
import tech.sud.gip.C22511R;
import tech.sud.gip.core.GameInfo;
import tech.sud.gip.core.SudLoadMGParamModel;
import tech.sud.gip.logger.SudLogger;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class gmg0 implements bkg0 {

    /* JADX INFO: renamed from: g */
    public static final String f104976g = "SudGIP ".concat(gmg0.class.getSimpleName());

    /* JADX INFO: renamed from: a */
    public final mrg0 f104977a;

    /* JADX INFO: renamed from: b */
    public final Context f104978b;

    /* JADX INFO: renamed from: c */
    public final cmg0 f104979c;

    /* JADX INFO: renamed from: d */
    public GameInfo f104980d;

    /* JADX INFO: renamed from: e */
    public boolean f104981e = false;

    /* JADX INFO: renamed from: f */
    public final SudLoadMGParamModel f104982f;

    public gmg0(Context context, SudLoadMGParamModel sudLoadMGParamModel, dlg0 dlg0Var, mrg0 mrg0Var) {
        this.f104978b = context;
        this.f104982f = sudLoadMGParamModel;
        this.f104977a = mrg0Var;
        this.f104979c = dlg0Var.f89533a;
    }

    @Override // p153l.bkg0
    /* JADX INFO: renamed from: a */
    public final void mo104809a(GameInfo gameInfo, int i, String str) {
        this.f104981e = false;
        this.f104977a.m159700c(this.f104978b.getString(C22511R.string.fsm_mgp_game_loading_stage_get_mginfo));
        long j = gameInfo.mgId;
        fhg0 fhg0Var = new fhg0(this);
        if (i == 0) {
            String str2 = this.f104982f.roomId;
            String str3 = utg0.f180946a;
            if (Looper.myLooper() != Looper.getMainLooper()) {
                fhg0Var.onFailure(-1, "Please call on UI or Main thread");
                return;
            }
            uyg0 uyg0Var = utg0.f180947b;
            if (!uyg0Var.f181601a) {
                fhg0Var.onFailure(-10103, "Please call initSDK first successfully");
                return;
            } else {
                GameInfo gameInfo2 = (GameInfo) uyg0Var.f181615o.get(Long.valueOf(j));
                tsg0.f175997c.execute(new hhg0(uyg0Var, j, uyg0Var.f181609i, gameInfo2 != null ? gameInfo2.clientVersion : 0L, str2, fhg0Var));
                return;
            }
        }
        if (1 != i) {
            LogUtils.file("SudGameLoadingStageGetMGInfo", "getMGInfo not support loadMgMode=" + i);
            SudLogger.m222813e(f104976g, "getMGInfo not support loadMgMode=" + i);
            return;
        }
        String str4 = this.f104982f.roomId;
        String str5 = utg0.f180946a;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            fhg0Var.onFailure(-1, "Please call on UI or Main thread");
            return;
        }
        uyg0 uyg0Var2 = utg0.f180947b;
        if (uyg0Var2.f181601a) {
            tsg0.f175997c.execute(new lpg0(uyg0Var2, j, uyg0Var2.f181609i, str, str4, fhg0Var));
        } else {
            fhg0Var.onFailure(-10103, "Please call initSDK first successfully");
        }
    }

    @Override // p153l.bkg0
    public final void cancel() {
        this.f104981e = true;
    }
}
