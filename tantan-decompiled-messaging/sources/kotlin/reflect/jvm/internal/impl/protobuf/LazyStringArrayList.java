package kotlin.reflect.jvm.internal.impl.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes2.dex */
public class LazyStringArrayList extends AbstractList<String> implements RandomAccess, LazyStringList {

    /* JADX INFO: renamed from: b */
    public static final LazyStringList f65678b = new LazyStringArrayList().mo91363m();

    /* JADX INFO: renamed from: a */
    public final List<Object> f65679a;

    public LazyStringArrayList(LazyStringList lazyStringList) {
        this.f65679a = new ArrayList(lazyStringList.size());
        addAll(lazyStringList);
    }

    /* JADX INFO: renamed from: c */
    public static ByteString m91355c(Object obj) {
        if (obj instanceof ByteString) {
            return (ByteString) obj;
        }
        return obj instanceof String ? ByteString.m91149i((String) obj) : ByteString.m91147g((byte[]) obj);
    }

    /* JADX INFO: renamed from: f */
    public static String m91356f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof ByteString ? ((ByteString) obj).m91153D() : Internal.m91348b((byte[]) obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    /* JADX INFO: renamed from: Q */
    public ByteString mo91357Q(int i) {
        Object obj = this.f65679a.get(i);
        ByteString byteStringM91355c = m91355c(obj);
        if (byteStringM91355c != obj) {
            this.f65679a.set(i, byteStringM91355c);
        }
        return byteStringM91355c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    /* JADX INFO: renamed from: S */
    public void mo91358S(ByteString byteString) {
        this.f65679a.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(int i, String str) {
        this.f65679a.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).mo91362k();
        }
        boolean zAddAll = this.f65679a.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f65679a.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public String remove(int i) {
        Object objRemove = this.f65679a.remove(i);
        ((AbstractList) this).modCount++;
        return m91356f(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        Object obj = this.f65679a.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String strM91153D = byteString.m91153D();
            if (byteString.mo91161r()) {
                this.f65679a.set(i, strM91153D);
            }
            return strM91153D;
        }
        byte[] bArr = (byte[]) obj;
        String strM91348b = Internal.m91348b(bArr);
        if (Internal.m91347a(bArr)) {
            this.f65679a.set(i, strM91348b);
        }
        return strM91348b;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public String set(int i, String str) {
        return m91356f(this.f65679a.set(i, str));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    /* JADX INFO: renamed from: k */
    public List<?> mo91362k() {
        return Collections.unmodifiableList(this.f65679a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    /* JADX INFO: renamed from: m */
    public LazyStringList mo91363m() {
        return new UnmodifiableLazyStringList(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f65679a.size();
    }

    public LazyStringArrayList() {
        this.f65679a = new ArrayList();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
