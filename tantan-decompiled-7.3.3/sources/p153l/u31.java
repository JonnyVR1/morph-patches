package p153l;

import androidx.annotation.NonNull;
import com.google.gson.JsonObject;

/* JADX INFO: loaded from: classes11.dex */
public class u31 {

    /* JADX INFO: renamed from: a */
    @NonNull
    public v31.C20730e f177275a;

    public u31(@NonNull v31.C20730e c20730e) {
        this.f177275a = c20730e;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public String m194319a() {
        return this.f177275a.m199178b();
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public String m194320b() {
        return this.f177275a.m199179c();
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public String m194321c() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("app_version", this.f177275a.m199177a());
        jsonObject.addProperty("md5", this.f177275a.m199180d());
        return jsonObject.toString();
    }
}
