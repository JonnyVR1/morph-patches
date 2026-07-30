package p149l;

import android.util.Pair;
import com.p046p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.JsonAdapter;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class rpq<V extends BaseData> {

    /* JADX INFO: renamed from: d */
    public static rpq f160551d;

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap<String, ArrayList<Pair<String, ObjectJsonAdapter>>> f160552a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    public ArrayList<ObjectJsonAdapter<V>> f160553b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public ArrayList<pp2> f160554c = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public static rpq m180387b() {
        if (f160551d == null) {
            f160551d = new rpq();
        }
        return f160551d;
    }

    /* JADX INFO: renamed from: a */
    public ArrayList<ObjectJsonAdapter<V>> m180388a() {
        return new ArrayList<>(this.f160553b);
    }

    /* JADX INFO: renamed from: c */
    public ArrayList<Pair<String, ObjectJsonAdapter>> m180389c(String str) {
        return this.f160552a.get(str);
    }

    /* JADX INFO: renamed from: d */
    public ArrayList<pp2> m180390d() {
        return new ArrayList<>(this.f160554c);
    }

    /* JADX INFO: renamed from: e */
    public void m180391e(JsonAdapter<V> jsonAdapter, pp2 pp2Var) {
        if (jsonAdapter != null) {
            ObjectJsonAdapter<V> objectJsonAdapter = (ObjectJsonAdapter) jsonAdapter;
            this.f160553b.remove(objectJsonAdapter);
            this.f160553b.add(objectJsonAdapter);
        }
        if (pp2Var != null) {
            this.f160554c.add(pp2Var);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m180392f(String str, JsonAdapter jsonAdapter) {
        m180393g(str, jsonAdapter, jsonAdapter.getDataClass());
    }

    /* JADX INFO: renamed from: g */
    public void m180393g(String str, JsonAdapter jsonAdapter, Class cls) {
        if (jsonAdapter instanceof ObjectJsonAdapter) {
            ObjectJsonAdapter objectJsonAdapter = (ObjectJsonAdapter) jsonAdapter;
            ArrayList<Pair<String, ObjectJsonAdapter>> arrayList = this.f160552a.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(new Pair<>(cls.getName(), objectJsonAdapter));
            this.f160552a.put(str, arrayList);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m180394h() {
        this.f160552a.clear();
        this.f160553b.clear();
        this.f160554c.clear();
    }

    /* JADX INFO: renamed from: i */
    public void m180395i(pp2 pp2Var, JsonAdapter<V> jsonAdapter) {
        this.f160554c.remove(pp2Var);
        this.f160553b.remove((ObjectJsonAdapter) jsonAdapter);
    }
}
