package p153l;

import com.google.android.gms.internal.ads.C2300w4;
import com.google.android.gms.internal.ads.zzgvz;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes6.dex */
public final class nxw0 {

    /* JADX INFO: renamed from: a */
    public final Class f144269a;

    /* JADX INFO: renamed from: d */
    public oxw0 f144272d;

    /* JADX INFO: renamed from: b */
    public ConcurrentMap f144270b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public final List f144271c = new ArrayList();

    /* JADX INFO: renamed from: e */
    public nax0 f144273e = nax0.f141057b;

    public /* synthetic */ nxw0(Class cls, mxw0 mxw0Var) {
        this.f144269a = cls;
    }

    /* JADX INFO: renamed from: a */
    public final nxw0 m165297a(Object obj, Object obj2, C2300w4 c2300w4) throws GeneralSecurityException {
        m165301e(obj, obj2, c2300w4, false);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final nxw0 m165298b(Object obj, Object obj2, C2300w4 c2300w4) throws GeneralSecurityException {
        m165301e(obj, obj2, c2300w4, true);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final nxw0 m165299c(nax0 nax0Var) {
        if (this.f144270b != null) {
            this.f144273e = nax0Var;
            return this;
        }
        wtq0.m207906a("setAnnotations cannot be called after build");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final sxw0 m165300d() throws GeneralSecurityException {
        ConcurrentMap concurrentMap = this.f144270b;
        if (concurrentMap == null) {
            wtq0.m207906a("build cannot be called twice");
            return null;
        }
        sxw0 sxw0Var = new sxw0(concurrentMap, this.f144271c, this.f144272d, this.f144273e, this.f144269a, null);
        this.f144270b = null;
        return sxw0Var;
    }

    /* JADX INFO: renamed from: e */
    public final nxw0 m165301e(Object obj, Object obj2, C2300w4 c2300w4, boolean z) throws GeneralSecurityException {
        byte[] bArrArray;
        if (this.f144270b == null) {
            wtq0.m207906a("addPrimitive cannot be called after build");
            return null;
        }
        if (obj == null && obj2 == null) {
            phw0.m172339a("at least one of the `fullPrimitive` or `primitive` must be set");
            return null;
        }
        if (c2300w4.m13487U() != 3) {
            phw0.m172339a("only ENABLED key is allowed");
            return null;
        }
        Integer numValueOf = Integer.valueOf(c2300w4.m13483L());
        if (c2300w4.m13485P() == zzgvz.RAW) {
            numValueOf = null;
        }
        xww0 xww0VarM143727b = j6x0.m143725d().m143727b(c7x0.m108336a(c2300w4.m13484M().m13381Q(), c2300w4.m13484M().m13380P(), c2300w4.m13484M().m13379M(), c2300w4.m13485P(), numValueOf), ayw0.m100933a());
        int iOrdinal = c2300w4.m13485P().ordinal();
        if (iOrdinal == 1) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(c2300w4.m13483L()).array();
        } else if (iOrdinal == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(c2300w4.m13483L()).array();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                phw0.m172339a("unknown output prefix type");
                return null;
            }
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(c2300w4.m13483L()).array();
        } else {
            bArrArray = oww0.f149585a;
        }
        oxw0 oxw0Var = new oxw0(obj, obj2, bArrArray, c2300w4.m13487U(), c2300w4.m13485P(), c2300w4.m13483L(), c2300w4.m13484M().m13381Q(), xww0VarM143727b);
        ConcurrentMap concurrentMap = this.f144270b;
        List list = this.f144271c;
        ArrayList arrayList = new ArrayList();
        arrayList.add(oxw0Var);
        qxw0 qxw0Var = new qxw0(oxw0Var.m169744g(), null);
        List list2 = (List) concurrentMap.put(qxw0Var, Collections.unmodifiableList(arrayList));
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list2);
            arrayList2.add(oxw0Var);
            concurrentMap.put(qxw0Var, Collections.unmodifiableList(arrayList2));
        }
        list.add(oxw0Var);
        if (!z) {
            return this;
        }
        if (this.f144272d == null) {
            this.f144272d = oxw0Var;
            return this;
        }
        wtq0.m207906a("you cannot set two primary primitives");
        return null;
    }
}
