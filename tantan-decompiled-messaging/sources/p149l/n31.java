package p149l;

import androidx.annotation.NonNull;
import com.google.gson.JsonObject;

/* JADX INFO: loaded from: classes13.dex */
public class n31 {

    /* JADX INFO: renamed from: a */
    @NonNull
    public o31.C18825e f136897a;

    public n31(@NonNull o31.C18825e c18825e) {
        this.f136897a = c18825e;
    }

    @NonNull
    /* JADX INFO: renamed from: a */
    public String m157686a() {
        return this.f136897a.m162349b();
    }

    @NonNull
    /* JADX INFO: renamed from: b */
    public String m157687b() {
        return this.f136897a.m162350c();
    }

    @NonNull
    /* JADX INFO: renamed from: c */
    public String m157688c() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("app_version", this.f136897a.m162348a());
        jsonObject.addProperty("md5", this.f136897a.m162351d());
        return jsonObject.toString();
    }
}
