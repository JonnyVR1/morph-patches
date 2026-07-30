package p153l;

import org.json.JSONObject;
import tech.sud.gip.core.p140ai.ISudListenerAiSse;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class qpg0 implements cwg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ISudListenerAiSse f158870a;

    public qpg0(ISudListenerAiSse iSudListenerAiSse) {
        this.f158870a = iSudListenerAiSse;
    }

    @Override // p153l.cwg0
    /* JADX INFO: renamed from: a */
    public final void mo112901a(String str) {
        String strOptString;
        LogUtils.file("SudAiModelImpl", "aiSse onFailure:" + str);
        pyg0.f154639b.remove(this);
        int i = -1;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i = jSONObject.getInt("ret_code");
            strOptString = jSONObject.optString("ret_msg");
        } catch (Exception e) {
            LogUtils.file("SudAiModelImpl", LogUtils.getErrorInfo(e));
            strOptString = null;
        }
        this.f158870a.onFailure(i, strOptString);
    }

    @Override // p153l.cwg0
    public final void onCompleted() {
        LogUtils.file("SudAiModelImpl", "aiSse onCompleted");
        pyg0.f154639b.remove(this);
        this.f158870a.onCompleted();
    }

    @Override // p153l.cwg0
    public final void onSseLine(String str) {
        LogUtils.file("SudAiModelImpl", "aiSse onSseLine:" + str);
        this.f158870a.onSseLine(str);
    }
}
