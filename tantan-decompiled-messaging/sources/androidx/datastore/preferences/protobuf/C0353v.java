package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import p149l.epj0;
import p149l.u9r;
import p149l.x9g0;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v */
/* JADX INFO: loaded from: classes.dex */
public class C0353v extends AbstractC0322c<String> implements u9r, RandomAccess {

    /* JADX INFO: renamed from: c */
    public static final C0353v f1750c;

    /* JADX INFO: renamed from: d */
    public static final u9r f1751d;

    /* JADX INFO: renamed from: b */
    public final List<Object> f1752b;

    static {
        C0353v c0353v = new C0353v();
        f1750c = c0353v;
        c0353v.mo1819n();
        f1751d = c0353v;
    }

    public C0353v(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    /* JADX INFO: renamed from: f */
    public static String m2357f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof ByteString ? ((ByteString) obj).toStringUtf8() : C0350s.m2348j((byte[]) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0322c, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
        m1818a();
        if (collection instanceof u9r) {
            collection = ((u9r) collection).mo2363k();
        }
        boolean zAddAll = this.f1752b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i, String str) {
        m1818a();
        this.f1752b.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0322c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m1818a();
        this.f1752b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p149l.u9r
    /* JADX INFO: renamed from: d0 */
    public Object mo2359d0(int i) {
        return this.f1752b.get(i);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0322c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.C0350s.i
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0353v mo2014d(int i) {
        if (i < size()) {
            x9g0.m207497a();
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.f1752b);
        return new C0353v((ArrayList<Object>) arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public String get(int i) {
        Object obj = this.f1752b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ByteString) {
            ByteString byteString = (ByteString) obj;
            String stringUtf8 = byteString.toStringUtf8();
            if (byteString.isValidUtf8()) {
                this.f1752b.set(i, stringUtf8);
            }
            return stringUtf8;
        }
        byte[] bArr = (byte[]) obj;
        String strM2348j = C0350s.m2348j(bArr);
        if (C0350s.m2345g(bArr)) {
            this.f1752b.set(i, strM2348j);
        }
        return strM2348j;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public String remove(int i) {
        m1818a();
        Object objRemove = this.f1752b.remove(i);
        ((AbstractList) this).modCount++;
        return m2357f(objRemove);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0322c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public String set(int i, String str) {
        m1818a();
        return m2357f(this.f1752b.set(i, str));
    }

    @Override // p149l.u9r
    /* JADX INFO: renamed from: k */
    public List<?> mo2363k() {
        return Collections.unmodifiableList(this.f1752b);
    }

    @Override // p149l.u9r
    /* JADX INFO: renamed from: m */
    public u9r mo2364m() {
        return mo1820q() ? new epj0(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0322c, androidx.datastore.preferences.protobuf.C0350s.i
    /* JADX INFO: renamed from: q */
    public /* bridge */ /* synthetic */ boolean mo1820q() {
        return super.mo1820q();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0322c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0322c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f1752b.size();
    }

    @Override // p149l.u9r
    /* JADX INFO: renamed from: t */
    public void mo2365t(ByteString byteString) {
        m1818a();
        this.f1752b.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0322c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public C0353v() {
        this(10);
    }

    public C0353v(ArrayList<Object> arrayList) {
        this.f1752b = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0322c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
