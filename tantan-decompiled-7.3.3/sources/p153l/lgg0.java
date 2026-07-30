package p153l;

import java.lang.ref.WeakReference;
import org.json.JSONObject;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class lgg0 implements apg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WeakReference f131961a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f131962b;

    public lgg0(WeakReference weakReference, String str) {
        this.f131961a = weakReference;
        this.f131962b = str;
    }

    @Override // p153l.apg0
    public final void onCompleted(String str) {
        qtg0 qtg0Var = (qtg0) this.f131961a.get();
        if (qtg0Var != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.put("request_id", this.f131962b);
                str = jSONObject.toString();
            } catch (Exception e) {
                LogUtils.file("SudAiManager", LogUtils.getErrorInfo(e));
            }
            qtg0Var.onCompleted(str);
        }
    }

    @Override // p153l.apg0
    public final void onFailure(int i, String str) {
        qtg0 qtg0Var = (qtg0) this.f131961a.get();
        if (qtg0Var != null) {
            qtg0Var.onCompleted(nhg0.m163092a(i, this.f131962b, str));
        }
    }
}
