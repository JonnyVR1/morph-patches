package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.ads.AbstractC2245p5;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p153l.aix0;
import p153l.dgx0;
import p153l.ejx0;
import p153l.ekx0;
import p153l.fhx0;
import p153l.fjx0;
import p153l.fkx0;
import p153l.jhx0;
import p153l.nkx0;
import p153l.o4c;
import p153l.okx0;
import p153l.pkx0;
import p153l.plx0;
import p153l.qjx0;
import p153l.shx0;
import p153l.ukx0;
import p153l.vtq0;
import p153l.wgx0;
import p153l.whx0;
import p153l.wpg0;
import p153l.xgx0;
import p153l.xlx0;
import p153l.yzv;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.p5 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2245p5<MessageType extends AbstractC2245p5<MessageType, BuilderType>, BuilderType extends shx0<MessageType, BuilderType>> extends AbstractC2181h5<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected plx0 zzc = plx0.m172889c();

    /* JADX INFO: renamed from: C */
    public static void m13213C(Class cls, AbstractC2245p5 abstractC2245p5) {
        abstractC2245p5.m13231B();
        zzb.put(cls, abstractC2245p5);
    }

    /* JADX INFO: renamed from: J */
    public static AbstractC2245p5 m13214J(AbstractC2245p5 abstractC2245p5) throws zzhag {
        if (abstractC2245p5 == null || abstractC2245p5.m13233E()) {
            return abstractC2245p5;
        }
        zzhag zzhagVarZza = new zzhco(abstractC2245p5).zza();
        zzhagVarZza.zzh(abstractC2245p5);
        throw zzhagVarZza;
    }

    /* JADX INFO: renamed from: K */
    public static AbstractC2245p5 m13215K(AbstractC2245p5 abstractC2245p5, byte[] bArr, int i, int i2, jhx0 jhx0Var) throws zzhag {
        AbstractC2245p5 abstractC2245p5M13242m = abstractC2245p5.m13242m();
        try {
            ukx0 ukx0VarM163671b = nkx0.m163670a().m163671b(abstractC2245p5M13242m.getClass());
            ukx0VarM163671b.mo13341d(abstractC2245p5M13242m, bArr, 0, i2, new dgx0(jhx0Var));
            ukx0VarM163671b.mo13338a(abstractC2245p5M13242m);
            return abstractC2245p5M13242m;
        } catch (zzhag e) {
            zzhag zzhagVar = e;
            if (zzhagVar.zzl()) {
                zzhagVar = new zzhag(zzhagVar);
            }
            zzhagVar.zzh(abstractC2245p5M13242m);
            throw zzhagVar;
        } catch (zzhco e2) {
            zzhag zzhagVarZza = e2.zza();
            zzhagVarZza.zzh(abstractC2245p5M13242m);
            throw zzhagVarZza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzhag) {
                throw ((zzhag) e3.getCause());
            }
            zzhag zzhagVar2 = new zzhag(e3);
            zzhagVar2.zzh(abstractC2245p5M13242m);
            throw zzhagVar2;
        } catch (IndexOutOfBoundsException unused) {
            zzhag zzhagVarZzj = zzhag.zzj();
            zzhagVarZzj.zzh(abstractC2245p5M13242m);
            throw zzhagVarZzj;
        }
    }

    /* JADX INFO: renamed from: l */
    public static AbstractC2245p5 m13216l(Class cls) {
        Map map = zzb;
        AbstractC2245p5 abstractC2245p5 = (AbstractC2245p5) map.get(cls);
        if (abstractC2245p5 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2245p5 = (AbstractC2245p5) map.get(cls);
            } catch (ClassNotFoundException e) {
                yzv.m218057a("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (abstractC2245p5 != null) {
            return abstractC2245p5;
        }
        AbstractC2245p5 abstractC2245p6 = (AbstractC2245p5) ((AbstractC2245p5) xlx0.m211702o(cls)).mo12560H(6, null, null);
        if (abstractC2245p6 != null) {
            map.put(cls, abstractC2245p6);
            return abstractC2245p6;
        }
        wpg0.m207458a();
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static AbstractC2245p5 m13217n(AbstractC2245p5 abstractC2245p5, zzgyl zzgylVar) throws zzhag {
        jhx0 jhx0Var = jhx0.f121021c;
        wgx0 wgx0VarZzl = zzgylVar.zzl();
        AbstractC2245p5 abstractC2245p5M13242m = abstractC2245p5.m13242m();
        try {
            ukx0 ukx0VarM163671b = nkx0.m163670a().m163671b(abstractC2245p5M13242m.getClass());
            ukx0VarM163671b.mo13343f(abstractC2245p5M13242m, xgx0.m210969l(wgx0VarZzl), jhx0Var);
            ukx0VarM163671b.mo13338a(abstractC2245p5M13242m);
            try {
                wgx0VarZzl.mo12836B(0);
                m13214J(abstractC2245p5M13242m);
                m13214J(abstractC2245p5M13242m);
                return abstractC2245p5M13242m;
            } catch (zzhag e) {
                e.zzh(abstractC2245p5M13242m);
                throw e;
            }
        } catch (zzhag e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzhag(e);
            }
            e.zzh(abstractC2245p5M13242m);
            throw e;
        } catch (zzhco e3) {
            zzhag zzhagVarZza = e3.zza();
            zzhagVarZza.zzh(abstractC2245p5M13242m);
            throw zzhagVarZza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzhag) {
                throw ((zzhag) e4.getCause());
            }
            zzhag zzhagVar = new zzhag(e4);
            zzhagVar.zzh(abstractC2245p5M13242m);
            throw zzhagVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzhag) {
                throw ((zzhag) e5.getCause());
            }
            throw e5;
        }
    }

    /* JADX INFO: renamed from: o */
    public static AbstractC2245p5 m13218o(AbstractC2245p5 abstractC2245p5, byte[] bArr) throws zzhag {
        AbstractC2245p5 abstractC2245p5M13215K = m13215K(abstractC2245p5, bArr, 0, bArr.length, jhx0.f121021c);
        m13214J(abstractC2245p5M13215K);
        return abstractC2245p5M13215K;
    }

    /* JADX INFO: renamed from: p */
    public static AbstractC2245p5 m13219p(AbstractC2245p5 abstractC2245p5, zzgyl zzgylVar, jhx0 jhx0Var) throws zzhag {
        wgx0 wgx0VarZzl = zzgylVar.zzl();
        AbstractC2245p5 abstractC2245p5M13242m = abstractC2245p5.m13242m();
        try {
            ukx0 ukx0VarM163671b = nkx0.m163670a().m163671b(abstractC2245p5M13242m.getClass());
            ukx0VarM163671b.mo13343f(abstractC2245p5M13242m, xgx0.m210969l(wgx0VarZzl), jhx0Var);
            ukx0VarM163671b.mo13338a(abstractC2245p5M13242m);
            try {
                wgx0VarZzl.mo12836B(0);
                m13214J(abstractC2245p5M13242m);
                return abstractC2245p5M13242m;
            } catch (zzhag e) {
                e.zzh(abstractC2245p5M13242m);
                throw e;
            }
        } catch (zzhag e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzhag(e);
            }
            e.zzh(abstractC2245p5M13242m);
            throw e;
        } catch (zzhco e3) {
            zzhag zzhagVarZza = e3.zza();
            zzhagVarZza.zzh(abstractC2245p5M13242m);
            throw zzhagVarZza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzhag) {
                throw ((zzhag) e4.getCause());
            }
            zzhag zzhagVar = new zzhag(e4);
            zzhagVar.zzh(abstractC2245p5M13242m);
            throw zzhagVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzhag) {
                throw ((zzhag) e5.getCause());
            }
            throw e5;
        }
    }

    /* JADX INFO: renamed from: q */
    public static AbstractC2245p5 m13220q(AbstractC2245p5 abstractC2245p5, InputStream inputStream, jhx0 jhx0Var) throws zzhag {
        wgx0 wgx0VarM206328g = wgx0.m206328g(inputStream, 4096);
        AbstractC2245p5 abstractC2245p5M13242m = abstractC2245p5.m13242m();
        try {
            ukx0 ukx0VarM163671b = nkx0.m163670a().m163671b(abstractC2245p5M13242m.getClass());
            ukx0VarM163671b.mo13343f(abstractC2245p5M13242m, xgx0.m210969l(wgx0VarM206328g), jhx0Var);
            ukx0VarM163671b.mo13338a(abstractC2245p5M13242m);
            m13214J(abstractC2245p5M13242m);
            return abstractC2245p5M13242m;
        } catch (zzhag e) {
            e = e;
            if (e.zzl()) {
                e = new zzhag(e);
            }
            e.zzh(abstractC2245p5M13242m);
            throw e;
        } catch (zzhco e2) {
            zzhag zzhagVarZza = e2.zza();
            zzhagVarZza.zzh(abstractC2245p5M13242m);
            throw zzhagVarZza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzhag) {
                throw ((zzhag) e3.getCause());
            }
            zzhag zzhagVar = new zzhag(e3);
            zzhagVar.zzh(abstractC2245p5M13242m);
            throw zzhagVar;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzhag) {
                throw ((zzhag) e4.getCause());
            }
            throw e4;
        }
    }

    /* JADX INFO: renamed from: r */
    public static AbstractC2245p5 m13221r(AbstractC2245p5 abstractC2245p5, byte[] bArr, jhx0 jhx0Var) throws zzhag {
        AbstractC2245p5 abstractC2245p5M13215K = m13215K(abstractC2245p5, bArr, 0, bArr.length, jhx0Var);
        m13214J(abstractC2245p5M13215K);
        return abstractC2245p5M13215K;
    }

    /* JADX INFO: renamed from: s */
    public static aix0 m13222s() {
        return whx0.m206524f();
    }

    /* JADX INFO: renamed from: t */
    public static aix0 m13223t(aix0 aix0Var) {
        int size = aix0Var.size();
        return aix0Var.zzd(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: renamed from: u */
    public static ejx0 m13224u() {
        return qjx0.m176900f();
    }

    /* JADX INFO: renamed from: v */
    public static ejx0 m13225v(ejx0 ejx0Var) {
        int size = ejx0Var.size();
        return ejx0Var.zzd(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: renamed from: w */
    public static fjx0 m13226w() {
        return okx0.m168062c();
    }

    /* JADX INFO: renamed from: x */
    public static fjx0 m13227x(fjx0 fjx0Var) {
        int size = fjx0Var.size();
        return fjx0Var.zzd(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: renamed from: y */
    public static Object m13228y(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            vtq0.m202761a("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            vtq0.m202761a("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    /* JADX INFO: renamed from: z */
    public static Object m13229z(fkx0 fkx0Var, String str, Object[] objArr) {
        return new pkx0(fkx0Var, str, objArr);
    }

    /* JADX INFO: renamed from: A */
    public final void m13230A() {
        nkx0.m163670a().m163671b(getClass()).mo13338a(this);
        m13231B();
    }

    /* JADX INFO: renamed from: B */
    public final void m13231B() {
        this.zzd &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX INFO: renamed from: D */
    public final void m13232D(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m13233E() {
        byte bByteValue = ((Byte) mo12560H(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo13340c = nkx0.m163670a().m163671b(getClass()).mo13340c(this);
        mo12560H(2, true != zMo13340c ? null : this, null);
        return zMo13340c;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m13234F() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: G */
    public final int m13235G() {
        return nkx0.m163670a().m163671b(getClass()).zzb(this);
    }

    /* JADX INFO: renamed from: H */
    public abstract Object mo12560H(int i, Object obj, Object obj2);

    @Override // p153l.gkx0
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ fkx0 mo13236a() {
        return (AbstractC2245p5) mo12560H(6, null, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2181h5
    /* JADX INFO: renamed from: b */
    public final int mo12795b(ukx0 ukx0Var) {
        if (m13234F()) {
            int iZza = ukx0Var.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            o4c.m165980a("serialized size must be non-negative, was ", iZza);
            return 0;
        }
        int i = this.zzd & Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZza2 = ukx0Var.zza(this);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
            return iZza2;
        }
        o4c.m165980a("serialized size must be non-negative, was ", iZza2);
        return 0;
    }

    @Override // p153l.fkx0
    /* JADX INFO: renamed from: d */
    public final void mo13237d(AbstractC2237o5 abstractC2237o5) throws IOException {
        nkx0.m163670a().m163671b(getClass()).mo13342e(this, fhx0.m125610l(abstractC2237o5));
    }

    @Override // p153l.fkx0
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ ekx0 mo13238e() {
        return (shx0) mo12560H(5, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return nkx0.m163670a().m163671b(getClass()).mo13339b(this, (AbstractC2245p5) obj);
    }

    public final int hashCode() {
        if (m13234F()) {
            return m13235G();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iM13235G = m13235G();
        this.zza = iM13235G;
        return iM13235G;
    }

    /* JADX INFO: renamed from: i */
    public final int m13239i(ukx0 ukx0Var) {
        return nkx0.m163670a().m163671b(getClass()).zza(this);
    }

    /* JADX INFO: renamed from: j */
    public final shx0 m13240j() {
        return (shx0) mo12560H(5, null, null);
    }

    /* JADX INFO: renamed from: k */
    public final shx0 m13241k() {
        shx0 shx0Var = (shx0) mo12560H(5, null, null);
        shx0Var.m185948k(this);
        return shx0Var;
    }

    /* JADX INFO: renamed from: m */
    public final AbstractC2245p5 m13242m() {
        return (AbstractC2245p5) mo12560H(4, null, null);
    }

    public final String toString() {
        return C2261r5.m13287a(this, super.toString());
    }

    @Override // p153l.fkx0
    public final int zzaz() {
        if (m13234F()) {
            int iM13239i = m13239i(null);
            if (iM13239i >= 0) {
                return iM13239i;
            }
            o4c.m165980a("serialized size must be non-negative, was ", iM13239i);
            return 0;
        }
        int i = this.zzd & Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iM13239i2 = m13239i(null);
        if (iM13239i2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iM13239i2;
            return iM13239i2;
        }
        o4c.m165980a("serialized size must be non-negative, was ", iM13239i2);
        return 0;
    }
}
