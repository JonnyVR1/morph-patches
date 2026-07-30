package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes3.dex */
public class upd0 {

    /* JADX INFO: renamed from: a */
    public final uqd0 f177588a;

    /* JADX INFO: renamed from: b */
    public final Gson f177589b = new Gson();

    public upd0(@NonNull String str) {
        this.f177588a = new uqd0(str, null);
    }

    /* JADX INFO: renamed from: a */
    public void m194852a() {
        this.f177588a.clear();
    }

    /* JADX INFO: renamed from: b */
    public <T> T m194853b(@NonNull Class<T> cls) {
        String str = this.f177588a.get();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (T) this.f177589b.fromJson(str, (Class) cls);
    }

    /* JADX INFO: renamed from: c */
    public void m194854c(@NonNull Object obj) {
        this.f177588a.put(this.f177589b.toJson(obj));
    }
}
