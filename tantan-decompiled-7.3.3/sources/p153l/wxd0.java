package p153l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.gson.Gson;

/* JADX INFO: loaded from: classes3.dex */
public class wxd0 {

    /* JADX INFO: renamed from: a */
    public final wyd0 f191483a;

    /* JADX INFO: renamed from: b */
    public final Gson f191484b = new Gson();

    public wxd0(@NonNull String str) {
        this.f191483a = new wyd0(str, null);
    }

    /* JADX INFO: renamed from: a */
    public void m208401a() {
        this.f191483a.clear();
    }

    /* JADX INFO: renamed from: b */
    public <T> T m208402b(@NonNull Class<T> cls) {
        String str = this.f191483a.get();
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return (T) this.f191484b.fromJson(str, (Class) cls);
    }

    /* JADX INFO: renamed from: c */
    public void m208403c(@NonNull Object obj) {
        this.f191483a.put(this.f191484b.toJson(obj));
    }
}
