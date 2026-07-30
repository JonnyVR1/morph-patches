package p153l;

import android.util.Pair;
import com.p051p1.mobile.putong.dbcenter.parse.ObjectJsonAdapter;
import com.tantanapp.common.data.BaseData;
import com.tantanapp.common.data.JsonAdapter;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes12.dex */
public class rrq<V extends BaseData> {

    /* JADX INFO: renamed from: d */
    public static rrq f164594d;

    /* JADX INFO: renamed from: a */
    public ConcurrentHashMap<String, ArrayList<Pair<String, ObjectJsonAdapter>>> f164595a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b */
    public ArrayList<ObjectJsonAdapter<V>> f164596b = new ArrayList<>();

    /* JADX INFO: renamed from: c */
    public ArrayList<gq2> f164597c = new ArrayList<>();

    /* JADX INFO: renamed from: b */
    public static rrq m182815b() {
        if (f164594d == null) {
            f164594d = new rrq();
        }
        return f164594d;
    }

    /* JADX INFO: renamed from: a */
    public ArrayList<ObjectJsonAdapter<V>> m182816a() {
        return new ArrayList<>(this.f164596b);
    }

    /* JADX INFO: renamed from: c */
    public ArrayList<Pair<String, ObjectJsonAdapter>> m182817c(String str) {
        return this.f164595a.get(str);
    }

    /* JADX INFO: renamed from: d */
    public ArrayList<gq2> m182818d() {
        return new ArrayList<>(this.f164597c);
    }

    /* JADX INFO: renamed from: e */
    public void m182819e(JsonAdapter<V> jsonAdapter, gq2 gq2Var) {
        if (jsonAdapter != null) {
            ObjectJsonAdapter<V> objectJsonAdapter = (ObjectJsonAdapter) jsonAdapter;
            this.f164596b.remove(objectJsonAdapter);
            this.f164596b.add(objectJsonAdapter);
        }
        if (gq2Var != null) {
            this.f164597c.add(gq2Var);
        }
    }

    /* JADX INFO: renamed from: f */
    public void m182820f(String str, JsonAdapter jsonAdapter) {
        m182821g(str, jsonAdapter, jsonAdapter.getDataClass());
    }

    /* JADX INFO: renamed from: g */
    public void m182821g(String str, JsonAdapter jsonAdapter, Class cls) {
        if (jsonAdapter instanceof ObjectJsonAdapter) {
            ObjectJsonAdapter objectJsonAdapter = (ObjectJsonAdapter) jsonAdapter;
            ArrayList<Pair<String, ObjectJsonAdapter>> arrayList = this.f164595a.get(str);
            if (arrayList == null) {
                arrayList = new ArrayList<>();
            }
            arrayList.add(new Pair<>(cls.getName(), objectJsonAdapter));
            this.f164595a.put(str, arrayList);
        }
    }

    /* JADX INFO: renamed from: h */
    public void m182822h() {
        this.f164595a.clear();
        this.f164596b.clear();
        this.f164597c.clear();
    }

    /* JADX INFO: renamed from: i */
    public void m182823i(gq2 gq2Var, JsonAdapter<V> jsonAdapter) {
        this.f164597c.remove(gq2Var);
        this.f164596b.remove((ObjectJsonAdapter) jsonAdapter);
    }
}
