package p149l;

import android.content.Context;
import androidx.annotation.AnyThread;
import androidx.annotation.WorkerThread;
import com.clevertap.android.sdk.events.EventGroup;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public abstract class ak2 {
    @WorkerThread
    /* JADX INFO: renamed from: b */
    public abstract void mo97095b(Context context, EventGroup eventGroup);

    @WorkerThread
    /* JADX INFO: renamed from: c */
    public abstract void mo97096c(Context context, EventGroup eventGroup, String str);

    @WorkerThread
    /* JADX INFO: renamed from: d */
    public abstract void mo97097d(Context context, EventGroup eventGroup, String str, boolean z);

    /* JADX INFO: renamed from: e */
    public abstract void mo97098e(JSONObject jSONObject, boolean z, ypi ypiVar);

    /* JADX INFO: renamed from: f */
    public abstract void mo97099f();

    @AnyThread
    /* JADX INFO: renamed from: g */
    public abstract Future<?> mo97100g(Context context, JSONObject jSONObject, int i);

    @AnyThread
    /* JADX INFO: renamed from: h */
    public abstract Future<?> mo97101h(Context context, JSONObject jSONObject, int i, ypi ypiVar);
}
