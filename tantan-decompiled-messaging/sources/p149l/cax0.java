package p149l;

import com.google.android.gms.internal.ads.C2294y5;
import com.google.android.gms.internal.ads.zzgyl;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class cax0 extends v6x0 implements RandomAccess, dax0 {

    /* JADX INFO: renamed from: c */
    public static final cax0 f80083c;

    /* JADX INFO: renamed from: d */
    @Deprecated
    public static final dax0 f80084d;

    /* JADX INFO: renamed from: b */
    public final List f80085b;

    static {
        cax0 cax0Var = new cax0(false);
        f80083c = cax0Var;
        f80084d = cax0Var;
    }

    public cax0(int i) {
        ArrayList arrayList = new ArrayList(i);
        super(true);
        this.f80085b = arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static String m105951f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof zzgyl ? ((zzgyl) obj).zzx(aax0.f68608b) : aax0.m95576d((byte[]) obj);
    }

    @Override // p149l.dax0
    /* JADX INFO: renamed from: Y */
    public final void mo105952Y(zzgyl zzgylVar) {
        m197278a();
        this.f80085b.add(zzgylVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        m197278a();
        this.f80085b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p149l.v6x0, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m197278a();
        if (collection instanceof dax0) {
            collection = ((dax0) collection).zzh();
        }
        boolean zAddAll = this.f80085b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        Object obj = this.f80085b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgyl) {
            zzgyl zzgylVar = (zzgyl) obj;
            String strZzx = zzgylVar.zzx(aax0.f68608b);
            if (zzgylVar.zzp()) {
                this.f80085b.set(i, strZzx);
            }
            return strZzx;
        }
        byte[] bArr = (byte[]) obj;
        String strM95576d = aax0.m95576d(bArr);
        if (C2294y5.m13501i(bArr)) {
            this.f80085b.set(i, strM95576d);
        }
        return strM95576d;
    }

    @Override // p149l.v6x0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m197278a();
        this.f80085b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p149l.v6x0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m197278a();
        Object objRemove = this.f80085b.remove(i);
        ((AbstractList) this).modCount++;
        return m105951f(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        m197278a();
        return m105951f(this.f80085b.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f80085b.size();
    }

    @Override // p149l.z9x0
    public final /* bridge */ /* synthetic */ z9x0 zzd(int i) {
        if (i < size()) {
            x9g0.m207497a();
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.f80085b);
        return new cax0(arrayList);
    }

    @Override // p149l.dax0
    public final dax0 zze() {
        return zzc() ? new mcx0(this) : this;
    }

    @Override // p149l.dax0
    public final Object zzf(int i) {
        return this.f80085b.get(i);
    }

    @Override // p149l.dax0
    public final List zzh() {
        return Collections.unmodifiableList(this.f80085b);
    }

    public cax0() {
        this(10);
    }

    public cax0(ArrayList arrayList) {
        super(true);
        this.f80085b = arrayList;
    }

    public cax0(boolean z) {
        super(false);
        this.f80085b = Collections.EMPTY_LIST;
    }

    @Override // p149l.v6x0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
