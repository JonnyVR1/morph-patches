package p149l;

import com.google.android.gms.internal.ads.C2277w4;
import com.google.android.gms.internal.ads.zzgvz;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* JADX INFO: loaded from: classes6.dex */
public final class how0 {

    /* JADX INFO: renamed from: a */
    public final Class f108866a;

    /* JADX INFO: renamed from: d */
    public iow0 f108869d;

    /* JADX INFO: renamed from: b */
    public ConcurrentMap f108867b = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c */
    public final List f108868c = new ArrayList();

    /* JADX INFO: renamed from: e */
    public h1x0 f108870e = h1x0.f105474b;

    public /* synthetic */ how0(Class cls, gow0 gow0Var) {
        this.f108866a = cls;
    }

    /* JADX INFO: renamed from: a */
    public final how0 m132283a(Object obj, Object obj2, C2277w4 c2277w4) throws GeneralSecurityException {
        m132287e(obj, obj2, c2277w4, false);
        return this;
    }

    /* JADX INFO: renamed from: b */
    public final how0 m132284b(Object obj, Object obj2, C2277w4 c2277w4) throws GeneralSecurityException {
        m132287e(obj, obj2, c2277w4, true);
        return this;
    }

    /* JADX INFO: renamed from: c */
    public final how0 m132285c(h1x0 h1x0Var) {
        if (this.f108867b != null) {
            this.f108870e = h1x0Var;
            return this;
        }
        qkq0.m175383a("setAnnotations cannot be called after build");
        return null;
    }

    /* JADX INFO: renamed from: d */
    public final mow0 m132286d() throws GeneralSecurityException {
        ConcurrentMap concurrentMap = this.f108867b;
        if (concurrentMap == null) {
            qkq0.m175383a("build cannot be called twice");
            return null;
        }
        mow0 mow0Var = new mow0(concurrentMap, this.f108868c, this.f108869d, this.f108870e, this.f108866a, null);
        this.f108867b = null;
        return mow0Var;
    }

    /* JADX INFO: renamed from: e */
    public final how0 m132287e(Object obj, Object obj2, C2277w4 c2277w4, boolean z) throws GeneralSecurityException {
        byte[] bArrArray;
        if (this.f108867b == null) {
            qkq0.m175383a("addPrimitive cannot be called after build");
            return null;
        }
        if (obj == null && obj2 == null) {
            j8w0.m140474a("at least one of the `fullPrimitive` or `primitive` must be set");
            return null;
        }
        if (c2277w4.m13433U() != 3) {
            j8w0.m140474a("only ENABLED key is allowed");
            return null;
        }
        Integer numValueOf = Integer.valueOf(c2277w4.m13429L());
        if (c2277w4.m13431P() == zzgvz.RAW) {
            numValueOf = null;
        }
        rnw0 rnw0VarM114032b = dxw0.m114030d().m114032b(wxw0.m206041a(c2277w4.m13430M().m13327Q(), c2277w4.m13430M().m13326P(), c2277w4.m13430M().m13325M(), c2277w4.m13431P(), numValueOf), uow0.m194569a());
        int iOrdinal = c2277w4.m13431P().ordinal();
        if (iOrdinal == 1) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 1).putInt(c2277w4.m13429L()).array();
        } else if (iOrdinal == 2) {
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(c2277w4.m13429L()).array();
        } else if (iOrdinal != 3) {
            if (iOrdinal != 4) {
                j8w0.m140474a("unknown output prefix type");
                return null;
            }
            bArrArray = ByteBuffer.allocate(5).put((byte) 0).putInt(c2277w4.m13429L()).array();
        } else {
            bArrArray = inw0.f114070a;
        }
        iow0 iow0Var = new iow0(obj, obj2, bArrArray, c2277w4.m13433U(), c2277w4.m13431P(), c2277w4.m13429L(), c2277w4.m13430M().m13327Q(), rnw0VarM114032b);
        ConcurrentMap concurrentMap = this.f108867b;
        List list = this.f108868c;
        ArrayList arrayList = new ArrayList();
        arrayList.add(iow0Var);
        kow0 kow0Var = new kow0(iow0Var.m137397g(), null);
        List list2 = (List) concurrentMap.put(kow0Var, Collections.unmodifiableList(arrayList));
        if (list2 != null) {
            ArrayList arrayList2 = new ArrayList();
            arrayList2.addAll(list2);
            arrayList2.add(iow0Var);
            concurrentMap.put(kow0Var, Collections.unmodifiableList(arrayList2));
        }
        list.add(iow0Var);
        if (!z) {
            return this;
        }
        if (this.f108869d == null) {
            this.f108869d = iow0Var;
            return this;
        }
        qkq0.m175383a("you cannot set two primary primitives");
        return null;
    }
}
