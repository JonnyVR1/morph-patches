package p003l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.Gson;
import l.uqd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class upd0 {

    /* JADX INFO: renamed from: a */
    public final uqd0 f8054a;

    /* JADX INFO: renamed from: b */
    public final Gson f8055b = new Gson();

    public upd0(@NonNull String str) {
        this.f8054a = new uqd0(str, (String) null);
    }

    /* JADX INFO: renamed from: a */
    public void m8194a() {
        this.f8054a.clear();
    }

    /* JADX INFO: renamed from: b */
    public <T> T m8195b(@NonNull Class<T> cls) {
        String str = (String) this.f8054a.get();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (T) this.f8055b.fromJson(str, cls);
    }

    /* JADX INFO: renamed from: c */
    public void m8196c(@NonNull Object obj) {
        this.f8054a.put(this.f8055b.toJson(obj));
    }
}
