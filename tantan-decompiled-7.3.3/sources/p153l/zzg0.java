package p153l;

import androidx.core.app.NotificationCompat;
import java.lang.ref.WeakReference;
import org.json.JSONObject;
import tech.sud.logger.LogUtils;

/* JADX INFO: loaded from: classes.dex */
public final class zzg0 implements apg0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ WeakReference f206702a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ String f206703b;

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ String f206704c;

    public zzg0(WeakReference weakReference, String str, String str2) {
        this.f206702a = weakReference;
        this.f206703b = str;
        this.f206704c = str2;
    }

    @Override // p153l.apg0
    public final void onCompleted(String str) {
        qtg0 qtg0Var = (qtg0) this.f206702a.get();
        if (qtg0Var != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                jSONObject.put("request_id", this.f206703b);
                jSONObject.put(NotificationCompat.CATEGORY_EVENT, this.f206704c);
                str = jSONObject.toString();
            } catch (Exception e) {
                LogUtils.file("SudAiManager", LogUtils.getErrorInfo(e));
            }
            qtg0Var.onCompleted(str);
        }
    }

    @Override // p153l.apg0
    public final void onFailure(int i, String str) {
        qtg0 qtg0Var = (qtg0) this.f206702a.get();
        if (qtg0Var != null) {
            qtg0Var.onCompleted(nhg0.m163092a(i, this.f206703b, str));
        }
    }
}
