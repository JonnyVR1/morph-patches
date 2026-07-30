package p149l;

import org.json.JSONObject;
import tech.sud.gip.core.p136ai.ISudListenerAiSse;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class ihg0 implements ung0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ ISudListenerAiSse f113250a;

    public ihg0(ISudListenerAiSse iSudListenerAiSse) {
        this.f113250a = iSudListenerAiSse;
    }

    @Override // p149l.ung0
    /* JADX INFO: renamed from: a */
    public final void mo136200a(String str) {
        String strOptString;
        LogUtils.file("SudAiModelImpl", "aiSse onFailure:" + str);
        hqg0.f109057b.remove(this);
        int i = -1;
        try {
            JSONObject jSONObject = new JSONObject(str);
            i = jSONObject.getInt("ret_code");
            strOptString = jSONObject.optString("ret_msg");
        } catch (Exception e) {
            LogUtils.file("SudAiModelImpl", LogUtils.getErrorInfo(e));
            strOptString = null;
        }
        this.f113250a.onFailure(i, strOptString);
    }

    @Override // p149l.ung0
    public final void onCompleted() {
        LogUtils.file("SudAiModelImpl", "aiSse onCompleted");
        hqg0.f109057b.remove(this);
        this.f113250a.onCompleted();
    }

    @Override // p149l.ung0
    public final void onSseLine(String str) {
        LogUtils.file("SudAiModelImpl", "aiSse onSseLine:" + str);
        this.f113250a.onSseLine(str);
    }
}
