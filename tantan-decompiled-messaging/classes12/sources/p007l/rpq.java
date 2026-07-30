package p007l;

import android.util.Pair;
import com.p000p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.JsonAdapter;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class rpq<V extends BaseData> {

    /* JADX INFO: renamed from: d */
    public static rpq f12709d;

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap<String, ArrayList<Pair<String, ObjectJsonAdapter>>> f12710a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    public ArrayList<ObjectJsonAdapter<V>> f12711b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public ArrayList<pp2> f12712c = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public static rpq m13943b() {
        if (f12709d == null) {
            f12709d = new rpq();
        }
        return f12709d;
    }

    /* JADX INFO: renamed from: a */
    public ArrayList<ObjectJsonAdapter<V>> m13944a() {
        return new ArrayList<>(this.f12711b);
    }

    /* JADX INFO: renamed from: c */
    public ArrayList<Pair<String, ObjectJsonAdapter>> m13945c(String str) {
        return this.f12710a.get(str);
    }

    /* JADX INFO: renamed from: d */
    public ArrayList<pp2> m13946d() {
        return new ArrayList<>(this.f12712c);
    }

    /* JADX INFO: renamed from: e */
    public void m13947e(JsonAdapter<V> jsonAdapter, pp2 pp2Var) {
        if (jsonAdapter != null) {
            ObjectJsonAdapter<V> objectJsonAdapter = (ObjectJsonAdapter) jsonAdapter;
            this.f12711b.remove(objectJsonAdapter);
            this.f12711b.add(objectJsonAdapter);
        }
        if (pp2Var != null) {
            this.f12712c.add(pp2Var);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m13948f(String str, JsonAdapter jsonAdapter) {
        m13949g(str, jsonAdapter, jsonAdapter.getDataClass());
    }

    /* JADX INFO: renamed from: g */
    public void m13949g(String str, JsonAdapter jsonAdapter, Class cls) {
        if (jsonAdapter instanceof ObjectJsonAdapter) {
            ObjectJsonAdapter objectJsonAdapter = (ObjectJsonAdapter) jsonAdapter;
            ArrayList<Pair<String, ObjectJsonAdapter>> arrayList = this.f12710a.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(new Pair<>(cls.getName(), objectJsonAdapter));
            this.f12710a.put(str, arrayList);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m13950h() {
        this.f12710a.clear();
        this.f12711b.clear();
        this.f12712c.clear();
    }

    /* JADX INFO: renamed from: i */
    public void m13951i(pp2 pp2Var, JsonAdapter<V> jsonAdapter) {
        this.f12712c.remove(pp2Var);
        this.f12711b.remove((ObjectJsonAdapter) jsonAdapter);
    }
}
