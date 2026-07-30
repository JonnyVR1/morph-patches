package p149l;

import androidx.core.app.NotificationCompat;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class rrg0 implements sgg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WeakReference f160746a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f160747b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f160748c;

    public rrg0(WeakReference weakReference, String str, String str2) {
        this.f160746a = weakReference;
        this.f160747b = str;
        this.f160748c = str2;
    }

    @Override // p149l.sgg0
    public final void onCompleted(String str) {
        ilg0 ilg0Var = (ilg0) this.f160746a.get();
        if (ilg0Var != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.put("request_id", this.f160747b);
                jSONObject.put(NotificationCompat.CATEGORY_EVENT, this.f160748c);
                str = jSONObject.toString();
            } catch (Exception e) {
                LogUtils.file("SudAiManager", LogUtils.getErrorInfo(e));
            }
            ilg0Var.onCompleted(str);
        }
    }

    @Override // p149l.sgg0
    public final void onFailure(int i, String str) {
        ilg0 ilg0Var = (ilg0) this.f160746a.get();
        if (ilg0Var != null) {
            ilg0Var.onCompleted(f9g0.m120080a(i, this.f160747b, str));
        }
    }
}
