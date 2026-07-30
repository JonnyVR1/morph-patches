package p153l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.JsonObject;

/* JADX INFO: loaded from: classes11.dex */
public class m4f {

    /* JADX INFO: renamed from: a */
    public String f134787a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public String f134788b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f134789c;

    public m4f(@NonNull String str) {
        this.f134787a = str;
    }

    /* JADX INFO: renamed from: a */
    public String m157003a() {
        return this.f134788b;
    }

    /* JADX INFO: renamed from: b */
    public String m157004b() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("format", this.f134787a);
        return jsonObject.toString();
    }

    /* JADX INFO: renamed from: c */
    public String m157005c() {
        return this.f134789c;
    }

    /* JADX INFO: renamed from: d */
    public void m157006d(String str) {
        this.f134788b = str;
    }

    /* JADX INFO: renamed from: e */
    public void m157007e(String str) {
        this.f134789c = str;
    }
}
