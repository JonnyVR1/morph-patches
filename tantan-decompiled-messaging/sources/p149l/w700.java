package p149l;

import com.tantanapp.common.data.JsonAdapter;
import com.tantanapp.common.data.ValueObject;
import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes12.dex */
public class w700<T extends ValueObject, O extends ValueObject> extends AbstractList {

    /* JADX INFO: renamed from: a */
    public JsonAdapter<T> f185015a;

    /* JADX INFO: renamed from: b */
    public List<O> f185016b;

    public w700(JsonAdapter<T> jsonAdapter) {
        this.f185015a = jsonAdapter;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public T get(int i) {
        O o = this.f185016b.get(i);
        if (o == null) {
            return null;
        }
        return (T) zij0.m219048c(o, this.f185015a);
    }

    /* JADX INFO: renamed from: c */
    public List<O> m202002c() {
        return this.f185016b;
    }

    /* JADX INFO: renamed from: f */
    public void m202003f(List<O> list) {
        this.f185016b = list;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i) {
        return this.f185016b.remove(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        List<O> list = this.f185016b;
        if (list == null || list.isEmpty()) {
            return 0;
        }
        return this.f185016b.size();
    }
}
