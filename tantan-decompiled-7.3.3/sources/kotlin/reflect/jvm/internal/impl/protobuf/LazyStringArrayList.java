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
    public static final LazyStringList f66352b = new LazyStringArrayList().mo92254m();

    /* JADX INFO: renamed from: a */
    public final List<Object> f66353a;

    public LazyStringArrayList(LazyStringList lazyStringList) {
        this.f66353a = new ArrayList(lazyStringList.size());
        addAll(lazyStringList);
    }

    /* JADX INFO: renamed from: c */
    public static ByteString m92246c(Object obj) {
        if (obj instanceof ByteString) {
            return (ByteString) obj;
        }
        return obj instanceof String ? ByteString.m92040i((String) obj) : ByteString.m92038g((byte[]) obj);
    }

    /* JADX INFO: renamed from: f */
    public static String m92247f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof ByteString ? ((ByteString) obj).m92044D() : Internal.m92239b((byte[]) obj);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    /* JADX INFO: renamed from: Q */
    public ByteString mo92248Q(int i) {
        Object obj = this.f66353a.get(i);
        ByteString byteStringM92246c = m92246c(obj);
        if (byteStringM92246c != obj) {
            this.f66353a.set(i, byteStringM92246c);
        }
        return byteStringM92246c;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    /* JADX INFO: renamed from: S */
    public void mo92249S(ByteString byteString) {
        this.f66353a.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void add(int i, String str) {
        this.f66353a.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
        if (collection instanceof LazyStringList) {
            collection = ((LazyStringList) collection).mo92253k();
        }
        boolean zAddAll = this.f66353a.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f66353a.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public String remove(int i) {
        Object objRemove = this.f66353a.remove(i);
        ((AbstractList) this).modCount++;
        return m92247f(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        Object obj = this.f66353a.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String strM92044D = byteString.m92044D();
            if (byteString.mo92052r()) {
                this.f66353a.set(i, strM92044D);
            }
            return strM92044D;
        }
        byte[] bArr = (byte[]) obj;
        String strM92239b = Internal.m92239b(bArr);
        if (Internal.m92238a(bArr)) {
            this.f66353a.set(i, strM92239b);
        }
        return strM92239b;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public String set(int i, String str) {
        return m92247f(this.f66353a.set(i, str));
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    /* JADX INFO: renamed from: k */
    public List<?> mo92253k() {
        return Collections.unmodifiableList(this.f66353a);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.LazyStringList
    /* JADX INFO: renamed from: m */
    public LazyStringList mo92254m() {
        return new UnmodifiableLazyStringList(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f66353a.size();
    }

    public LazyStringArrayList() {
        this.f66353a = new ArrayList();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
