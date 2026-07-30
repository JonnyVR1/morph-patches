package p153l;

import androidx.annotation.NonNull;
import com.google.gson.JsonObject;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: loaded from: classes11.dex */
public class tyv {

    /* JADX INFO: renamed from: g */
    public static SimpleDateFormat f176708g = new SimpleDateFormat("yyyy-MM-dd");

    /* JADX INFO: renamed from: a */
    public String f176709a;

    /* JADX INFO: renamed from: b */
    public String f176710b;

    /* JADX INFO: renamed from: c */
    public String f176711c;

    /* JADX INFO: renamed from: d */
    public String f176712d;

    /* JADX INFO: renamed from: e */
    public long f176713e;

    /* JADX INFO: renamed from: f */
    public Date f176714f;

    public tyv(String str, @NonNull String str2, String str3, long j, Date date) {
        this.f176709a = str;
        this.f176710b = str2;
        this.f176712d = str3;
        this.f176713e = j == -1 ? 0L : j;
        this.f176714f = date;
        this.f176711c = kiw.m149979d(new File(str2));
    }

    /* JADX INFO: renamed from: a */
    public String m193622a() {
        return this.f176710b;
    }

    /* JADX INFO: renamed from: b */
    public String m193623b() {
        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("app_version", this.f176709a);
        jsonObject.addProperty("md5", this.f176711c);
        jsonObject.addProperty("user_id", this.f176712d);
        jsonObject.addProperty("task_id", Long.valueOf(this.f176713e));
        jsonObject.addProperty("date", f176708g.format(this.f176714f));
        return jsonObject.toString();
    }
}
