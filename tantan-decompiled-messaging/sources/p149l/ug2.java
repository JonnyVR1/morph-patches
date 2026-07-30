package p149l;

import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public abstract class ug2<T> {

    /* JADX INFO: renamed from: a */
    WeakReference<T> f176346a;

    public ug2(T t) {
        this.f176346a = new WeakReference<>(t);
    }

    /* JADX INFO: renamed from: a */
    public T m193478a() {
        WeakReference<T> weakReference = this.f176346a;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public abstract void mo97996b(String str);

    /* JADX INFO: renamed from: c */
    public abstract void mo97997c(JSONObject jSONObject);
}
