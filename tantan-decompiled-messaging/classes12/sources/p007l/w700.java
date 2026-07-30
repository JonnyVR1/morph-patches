package p007l;

import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ValueObject;
import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class w700<T extends ValueObject, O extends ValueObject> extends AbstractList {

    /* JADX INFO: renamed from: a */
    public JsonAdapter<T> f14434a;

    /* JADX INFO: renamed from: b */
    public List<O> f14435b;

    public w700(JsonAdapter<T> jsonAdapter) {
        this.f14434a = jsonAdapter;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public T get(int i) {
        O o = this.f14435b.get(i);
        if (o == null) {
            return null;
        }
        return (T) zij0.m17471c(o, this.f14434a);
    }

    /* JADX INFO: renamed from: c */
    public List<O> m15709c() {
        return this.f14435b;
    }

    /* JADX INFO: renamed from: f */
    public void m15710f(List<O> list) {
        this.f14435b = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i) {
        return this.f14435b.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        List<O> list = this.f14435b;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return this.f14435b.size();
    }
}
