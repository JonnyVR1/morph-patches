package p149l;

import com.immomo.momomediaext.sei.BaseSei;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class onw implements ivl {

    /* JADX INFO: renamed from: a */
    private String f144823a;

    /* JADX INFO: renamed from: b */
    private Object f144824b;

    public onw(String str, Object obj) {
        this.f144823a = str;
        m165232b(obj);
        this.f144824b = obj;
    }

    /* JADX INFO: renamed from: a */
    public static ivl m165231a(String str) {
        return new onw("action", str);
    }

    /* JADX INFO: renamed from: b */
    private void m165232b(Object obj) {
        if (obj == null || (obj instanceof Number) || (obj instanceof String) || (obj instanceof JSONObject) || (obj instanceof JSONArray) || (obj instanceof Boolean)) {
            return;
        }
        ig3.m135964a("value class is not supported");
    }

    /* JADX INFO: renamed from: c */
    public static ivl m165233c(long j) {
        return new onw("createTime", Long.valueOf(j));
    }

    /* JADX INFO: renamed from: d */
    public static ivl m165234d(String str) {
        return new onw("id", str);
    }

    /* JADX INFO: renamed from: e */
    public static ivl m165235e(String str) {
        return new onw(BaseSei.INFO, str);
    }

    /* JADX INFO: renamed from: f */
    public static ivl m165236f(int i) {
        return new onw("isFirst", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: g */
    public static ivl m165237g(int i) {
        return new onw("isOfflined", Integer.valueOf(i));
    }

    /* JADX INFO: renamed from: h */
    public static ivl m165238h(JSONArray jSONArray) {
        return new onw("listArray", jSONArray);
    }

    /* JADX INFO: renamed from: i */
    public static ivl m165239i(String str) {
        return new onw("logID", str);
    }

    /* JADX INFO: renamed from: j */
    public static ivl m165240j(String str) {
        return new onw("msg", str);
    }

    /* JADX INFO: renamed from: k */
    public static ivl m165241k(String str) {
        return new onw("offlineVersion", str);
    }

    /* JADX INFO: renamed from: l */
    public static ivl m165242l(long j) {
        return new onw("uploadTime", Long.valueOf(j));
    }

    /* JADX INFO: renamed from: m */
    public static ivl m165243m(String str) {
        return new onw("url", str);
    }

    @Override // p149l.ivl
    public String getKey() {
        return this.f144823a;
    }

    @Override // p149l.ivl
    public Object getValue() {
        return this.f144824b;
    }
}
