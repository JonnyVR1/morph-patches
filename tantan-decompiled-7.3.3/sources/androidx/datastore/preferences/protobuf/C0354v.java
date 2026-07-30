package androidx.datastore.preferences.protobuf;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import p153l.fig0;
import p153l.hyj0;
import p153l.wbr;

/* JADX INFO: renamed from: androidx.datastore.preferences.protobuf.v */
/* JADX INFO: loaded from: classes.dex */
public class C0354v extends AbstractC0323c<String> implements wbr, RandomAccess {

    /* JADX INFO: renamed from: c */
    public static final C0354v f1750c;

    /* JADX INFO: renamed from: d */
    public static final wbr f1751d;

    /* JADX INFO: renamed from: b */
    public final List<Object> f1752b;

    static {
        C0354v c0354v = new C0354v();
        f1750c = c0354v;
        c0354v.mo1820n();
        f1751d = c0354v;
    }

    public C0354v(int i) {
        this((ArrayList<Object>) new ArrayList(i));
    }

    /* JADX INFO: renamed from: f */
    public static String m2358f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof ByteString ? ((ByteString) obj).toStringUtf8() : C0351s.m2349j((byte[]) obj);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0323c, java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection<? extends String> collection) {
        m1819a();
        if (collection instanceof wbr) {
            collection = ((wbr) collection).mo2364k();
        }
        boolean zAddAll = this.f1752b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public void add(int i, String str) {
        m1819a();
        this.f1752b.add(i, str);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0323c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        m1819a();
        this.f1752b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p153l.wbr
    /* JADX INFO: renamed from: e0 */
    public Object mo2360e0(int i) {
        return this.f1752b.get(i);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0323c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // androidx.datastore.preferences.protobuf.C0351s.i
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C0354v mo2015d(int i) {
        if (i < size()) {
            fig0.m125680a();
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.f1752b);
        return new C0354v((ArrayList<Object>) arrayList);
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
        String strM2349j = C0351s.m2349j(bArr);
        if (C0351s.m2346g(bArr)) {
            this.f1752b.set(i, strM2349j);
        }
        return strM2349j;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public String remove(int i) {
        m1819a();
        Object objRemove = this.f1752b.remove(i);
        ((AbstractList) this).modCount++;
        return m2358f(objRemove);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0323c, java.util.AbstractList, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public String set(int i, String str) {
        m1819a();
        return m2358f(this.f1752b.set(i, str));
    }

    @Override // p153l.wbr
    /* JADX INFO: renamed from: k */
    public List<?> mo2364k() {
        return Collections.unmodifiableList(this.f1752b);
    }

    @Override // p153l.wbr
    /* JADX INFO: renamed from: m */
    public wbr mo2365m() {
        return mo1821q() ? new hyj0(this) : this;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0323c, androidx.datastore.preferences.protobuf.C0351s.i
    /* JADX INFO: renamed from: q */
    public /* bridge */ /* synthetic */ boolean mo1821q() {
        return super.mo1821q();
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0323c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0323c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f1752b.size();
    }

    @Override // p153l.wbr
    /* JADX INFO: renamed from: t */
    public void mo2366t(ByteString byteString) {
        m1819a();
        this.f1752b.add(byteString);
        ((AbstractList) this).modCount++;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0323c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public C0354v() {
        this(10);
    }

    public C0354v(ArrayList<Object> arrayList) {
        this.f1752b = arrayList;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0323c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }
}
