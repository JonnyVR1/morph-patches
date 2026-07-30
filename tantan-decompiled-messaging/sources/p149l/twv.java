package p149l;

import androidx.annotation.NonNull;
import com.google.gson.JsonObject;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes13.dex */
public class twv {

    /* JADX INFO: renamed from: g */
    public static SimpleDateFormat f172424g = new SimpleDateFormat("yyyy-MM-dd");

    /* JADX INFO: renamed from: a */
    public String f172425a;

    /* JADX INFO: renamed from: b */
    public String f172426b;

    /* JADX INFO: renamed from: c */
    public String f172427c;

    /* JADX INFO: renamed from: d */
    public String f172428d;

    /* JADX INFO: renamed from: e */
    public long f172429e;

    /* JADX INFO: renamed from: f */
    public Date f172430f;

    public twv(String str, @NonNull String str2, String str3, long j, Date date) {
        this.f172425a = str;
        this.f172426b = str2;
        this.f172428d = str3;
        this.f172429e = j == -1 ? 0L : j;
        this.f172430f = date;
        this.f172427c = mgw.m154579d(new File(str2));
    }

    /* JADX INFO: renamed from: a */
    public String m190907a() {
        return this.f172426b;
    }

    /* JADX INFO: renamed from: b */
    public String m190908b() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("app_version", this.f172425a);
        jsonObject.addProperty("md5", this.f172427c);
        jsonObject.addProperty("user_id", this.f172428d);
        jsonObject.addProperty("task_id", Long.valueOf(this.f172429e));
        jsonObject.addProperty("date", f172424g.format(this.f172430f));
        return jsonObject.toString();
    }
}
