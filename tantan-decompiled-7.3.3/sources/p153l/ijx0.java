package p153l;

import com.google.android.gms.internal.ads.C2317y5;
import com.google.android.gms.internal.ads.zzgyl;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes6.dex */
public final class ijx0 extends bgx0 implements RandomAccess, jjx0 {

    /* JADX INFO: renamed from: c */
    public static final ijx0 f115305c;

    /* JADX INFO: renamed from: d */
    @Deprecated
    public static final jjx0 f115306d;

    /* JADX INFO: renamed from: b */
    public final List f115307b;

    static {
        ijx0 ijx0Var = new ijx0(false);
        f115305c = ijx0Var;
        f115306d = ijx0Var;
    }

    public ijx0(int i) {
        ArrayList arrayList = new ArrayList(i);
        super(true);
        this.f115307b = arrayList;
    }

    /* JADX INFO: renamed from: f */
    public static String m140241f(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        return obj instanceof zzgyl ? ((zzgyl) obj).zzx(gjx0.f104689b) : gjx0.m130565d((byte[]) obj);
    }

    @Override // p153l.jjx0
    /* JADX INFO: renamed from: Z */
    public final void mo140242Z(zzgyl zzgylVar) {
        m104285a();
        this.f115307b.add(zzgylVar);
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ void add(int i, Object obj) {
        m104285a();
        this.f115307b.add(i, (String) obj);
        ((AbstractList) this).modCount++;
    }

    @Override // p153l.bgx0, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection collection) {
        m104285a();
        if (collection instanceof jjx0) {
            collection = ((jjx0) collection).zzh();
        }
        boolean zAddAll = this.f115307b.addAll(i, collection);
        ((AbstractList) this).modCount++;
        return zAddAll;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final String get(int i) {
        Object obj = this.f115307b.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzgyl) {
            zzgyl zzgylVar = (zzgyl) obj;
            String strZzx = zzgylVar.zzx(gjx0.f104689b);
            if (zzgylVar.zzp()) {
                this.f115307b.set(i, strZzx);
            }
            return strZzx;
        }
        byte[] bArr = (byte[]) obj;
        String strM130565d = gjx0.m130565d(bArr);
        if (C2317y5.m13555i(bArr)) {
            this.f115307b.set(i, strM130565d);
        }
        return strM130565d;
    }

    @Override // p153l.bgx0, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        m104285a();
        this.f115307b.clear();
        ((AbstractList) this).modCount++;
    }

    @Override // p153l.bgx0, java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i) {
        m104285a();
        Object objRemove = this.f115307b.remove(i);
        ((AbstractList) this).modCount++;
        return m140241f(objRemove);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        m104285a();
        return m140241f(this.f115307b.set(i, (String) obj));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f115307b.size();
    }

    @Override // p153l.fjx0
    public final /* bridge */ /* synthetic */ fjx0 zzd(int i) {
        if (i < size()) {
            fig0.m125680a();
            return null;
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.f115307b);
        return new ijx0(arrayList);
    }

    @Override // p153l.jjx0
    public final jjx0 zze() {
        return zzc() ? new slx0(this) : this;
    }

    @Override // p153l.jjx0
    public final Object zzf(int i) {
        return this.f115307b.get(i);
    }

    @Override // p153l.jjx0
    public final List zzh() {
        return Collections.unmodifiableList(this.f115307b);
    }

    public ijx0() {
        this(10);
    }

    public ijx0(ArrayList arrayList) {
        super(true);
        this.f115307b = arrayList;
    }

    public ijx0(boolean z) {
        super(false);
        this.f115307b = Collections.EMPTY_LIST;
    }

    @Override // p153l.bgx0, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        return addAll(size(), collection);
    }
}
