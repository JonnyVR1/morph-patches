package p153l;

import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.events.EventGroup;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class ik2 {
    @WorkerThread
    /* JADX INFO: renamed from: b */
    public abstract void mo140244b(Context context, EventGroup eventGroup);

    @WorkerThread
    /* JADX INFO: renamed from: c */
    public abstract void mo140245c(Context context, EventGroup eventGroup, String str);

    @WorkerThread
    /* JADX INFO: renamed from: d */
    public abstract void mo140246d(Context context, EventGroup eventGroup, String str, boolean z);

    /* JADX INFO: renamed from: e */
    public abstract void mo140247e(JSONObject jSONObject, boolean z, usi usiVar);

    /* JADX INFO: renamed from: f */
    public abstract void mo140248f();

    @AnyThread
    /* JADX INFO: renamed from: g */
    public abstract Future<?> mo140249g(Context context, JSONObject jSONObject, int i);

    @AnyThread
    /* JADX INFO: renamed from: h */
    public abstract Future<?> mo140250h(Context context, JSONObject jSONObject, int i, usi usiVar);
}
