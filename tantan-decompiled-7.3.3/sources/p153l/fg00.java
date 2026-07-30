package p153l;

import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ValueObject;
import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class fg00<T extends ValueObject, O extends ValueObject> extends AbstractList {

    /* JADX INFO: renamed from: a */
    public JsonAdapter<T> f98877a;

    /* JADX INFO: renamed from: b */
    public List<O> f98878b;

    public fg00(JsonAdapter<T> jsonAdapter) {
        this.f98877a = jsonAdapter;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public T get(int i) {
        O o = this.f98878b.get(i);
        if (o == null) {
            return null;
        }
        return (T) csj0.m112185c(o, this.f98877a);
    }

    /* JADX INFO: renamed from: c */
    public List<O> m125473c() {
        return this.f98878b;
    }

    /* JADX INFO: renamed from: f */
    public void m125474f(List<O> list) {
        this.f98878b = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i) {
        return this.f98878b.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        List<O> list = this.f98878b;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return this.f98878b.size();
    }
}
