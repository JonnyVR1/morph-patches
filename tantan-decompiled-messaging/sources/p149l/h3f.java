package p149l;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.gson.JsonObject;

/* JADX INFO: loaded from: classes13.dex */
public class h3f {

    /* JADX INFO: renamed from: a */
    public String f105734a;

    /* JADX INFO: renamed from: b */
    @NonNull
    public String f105735b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public String f105736c;

    public h3f(@NonNull String str) {
        this.f105734a = str;
    }

    /* JADX INFO: renamed from: a */
    public String m129165a() {
        return this.f105735b;
    }

    /* JADX INFO: renamed from: b */
    public String m129166b() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("format", this.f105734a);
        return jsonObject.toString();
    }

    /* JADX INFO: renamed from: c */
    public String m129167c() {
        return this.f105736c;
    }

    /* JADX INFO: renamed from: d */
    public void m129168d(String str) {
        this.f105735b = str;
    }

    /* JADX INFO: renamed from: e */
    public void m129169e(String str) {
        this.f105736c = str;
    }
}
