package p149l;

import java.lang.ref.WeakReference;
import org.json.JSONObject;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class d8g0 implements sgg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WeakReference f84869a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f84870b;

    public d8g0(WeakReference weakReference, String str) {
        this.f84869a = weakReference;
        this.f84870b = str;
    }

    @Override // p149l.sgg0
    public final void onCompleted(String str) {
        ilg0 ilg0Var = (ilg0) this.f84869a.get();
        if (ilg0Var != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.put("request_id", this.f84870b);
                str = jSONObject.toString();
            } catch (Exception e) {
                LogUtils.file("SudAiManager", LogUtils.getErrorInfo(e));
            }
            ilg0Var.onCompleted(str);
        }
    }

    @Override // p149l.sgg0
    public final void onFailure(int i, String str) {
        ilg0 ilg0Var = (ilg0) this.f84869a.get();
        if (ilg0Var != null) {
            ilg0Var.onCompleted(f9g0.m120080a(i, this.f84870b, str));
        }
    }
}
