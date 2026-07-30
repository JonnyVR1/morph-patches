package com.google.android.gms.internal.ads;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.ads.AbstractC2222p5;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p149l.byv;
import p149l.d8x0;
import p149l.f3c;
import p149l.hbx0;
import p149l.ibx0;
import p149l.jbx0;
import p149l.jcx0;
import p149l.kax0;
import p149l.m8x0;
import p149l.obx0;
import p149l.ohg0;
import p149l.pkq0;
import p149l.q7x0;
import p149l.q8x0;
import p149l.r7x0;
import p149l.rcx0;
import p149l.u8x0;
import p149l.x6x0;
import p149l.y9x0;
import p149l.yax0;
import p149l.z7x0;
import p149l.z9x0;
import p149l.zax0;

/* JADX INFO: renamed from: com.google.android.gms.internal.ads.p5 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2222p5<MessageType extends AbstractC2222p5<MessageType, BuilderType>, BuilderType extends m8x0<MessageType, BuilderType>> extends AbstractC2158h5<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected jcx0 zzc = jcx0.m140997c();

    /* JADX INFO: renamed from: C */
    public static void m13159C(Class cls, AbstractC2222p5 abstractC2222p5) {
        abstractC2222p5.m13177B();
        zzb.put(cls, abstractC2222p5);
    }

    /* JADX INFO: renamed from: J */
    public static AbstractC2222p5 m13160J(AbstractC2222p5 abstractC2222p5) throws zzhag {
        if (abstractC2222p5 == null || abstractC2222p5.m13179E()) {
            return abstractC2222p5;
        }
        zzhag zzhagVarZza = new zzhco(abstractC2222p5).zza();
        zzhagVarZza.zzh(abstractC2222p5);
        throw zzhagVarZza;
    }

    /* JADX INFO: renamed from: K */
    public static AbstractC2222p5 m13161K(AbstractC2222p5 abstractC2222p5, byte[] bArr, int i, int i2, d8x0 d8x0Var) throws zzhag {
        AbstractC2222p5 abstractC2222p5M13188m = abstractC2222p5.m13188m();
        try {
            obx0 obx0VarM130352b = hbx0.m130351a().m130352b(abstractC2222p5M13188m.getClass());
            obx0VarM130352b.mo13287d(abstractC2222p5M13188m, bArr, 0, i2, new x6x0(d8x0Var));
            obx0VarM130352b.mo13284a(abstractC2222p5M13188m);
            return abstractC2222p5M13188m;
        } catch (zzhag e) {
            zzhag zzhagVar = e;
            if (zzhagVar.zzl()) {
                zzhagVar = new zzhag(zzhagVar);
            }
            zzhagVar.zzh(abstractC2222p5M13188m);
            throw zzhagVar;
        } catch (zzhco e2) {
            zzhag zzhagVarZza = e2.zza();
            zzhagVarZza.zzh(abstractC2222p5M13188m);
            throw zzhagVarZza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzhag) {
                throw ((zzhag) e3.getCause());
            }
            zzhag zzhagVar2 = new zzhag(e3);
            zzhagVar2.zzh(abstractC2222p5M13188m);
            throw zzhagVar2;
        } catch (IndexOutOfBoundsException unused) {
            zzhag zzhagVarZzj = zzhag.zzj();
            zzhagVarZzj.zzh(abstractC2222p5M13188m);
            throw zzhagVarZzj;
        }
    }

    /* JADX INFO: renamed from: l */
    public static AbstractC2222p5 m13162l(Class cls) {
        Map map = zzb;
        AbstractC2222p5 abstractC2222p5 = (AbstractC2222p5) map.get(cls);
        if (abstractC2222p5 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2222p5 = (AbstractC2222p5) map.get(cls);
            } catch (ClassNotFoundException e) {
                byv.m104511a("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (abstractC2222p5 != null) {
            return abstractC2222p5;
        }
        AbstractC2222p5 abstractC2222p6 = (AbstractC2222p5) ((AbstractC2222p5) rcx0.m178837o(cls)).mo12506H(6, null, null);
        if (abstractC2222p6 != null) {
            map.put(cls, abstractC2222p6);
            return abstractC2222p6;
        }
        ohg0.m164364a();
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static AbstractC2222p5 m13163n(AbstractC2222p5 abstractC2222p5, zzgyl zzgylVar) throws zzhag {
        d8x0 d8x0Var = d8x0.f84914c;
        q7x0 q7x0VarZzl = zzgylVar.zzl();
        AbstractC2222p5 abstractC2222p5M13188m = abstractC2222p5.m13188m();
        try {
            obx0 obx0VarM130352b = hbx0.m130351a().m130352b(abstractC2222p5M13188m.getClass());
            obx0VarM130352b.mo13289f(abstractC2222p5M13188m, r7x0.m178219l(q7x0VarZzl), d8x0Var);
            obx0VarM130352b.mo13284a(abstractC2222p5M13188m);
            try {
                q7x0VarZzl.mo12782B(0);
                m13160J(abstractC2222p5M13188m);
                m13160J(abstractC2222p5M13188m);
                return abstractC2222p5M13188m;
            } catch (zzhag e) {
                e.zzh(abstractC2222p5M13188m);
                throw e;
            }
        } catch (zzhag e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzhag(e);
            }
            e.zzh(abstractC2222p5M13188m);
            throw e;
        } catch (zzhco e3) {
            zzhag zzhagVarZza = e3.zza();
            zzhagVarZza.zzh(abstractC2222p5M13188m);
            throw zzhagVarZza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzhag) {
                throw ((zzhag) e4.getCause());
            }
            zzhag zzhagVar = new zzhag(e4);
            zzhagVar.zzh(abstractC2222p5M13188m);
            throw zzhagVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzhag) {
                throw ((zzhag) e5.getCause());
            }
            throw e5;
        }
    }

    /* JADX INFO: renamed from: o */
    public static AbstractC2222p5 m13164o(AbstractC2222p5 abstractC2222p5, byte[] bArr) throws zzhag {
        AbstractC2222p5 abstractC2222p5M13161K = m13161K(abstractC2222p5, bArr, 0, bArr.length, d8x0.f84914c);
        m13160J(abstractC2222p5M13161K);
        return abstractC2222p5M13161K;
    }

    /* JADX INFO: renamed from: p */
    public static AbstractC2222p5 m13165p(AbstractC2222p5 abstractC2222p5, zzgyl zzgylVar, d8x0 d8x0Var) throws zzhag {
        q7x0 q7x0VarZzl = zzgylVar.zzl();
        AbstractC2222p5 abstractC2222p5M13188m = abstractC2222p5.m13188m();
        try {
            obx0 obx0VarM130352b = hbx0.m130351a().m130352b(abstractC2222p5M13188m.getClass());
            obx0VarM130352b.mo13289f(abstractC2222p5M13188m, r7x0.m178219l(q7x0VarZzl), d8x0Var);
            obx0VarM130352b.mo13284a(abstractC2222p5M13188m);
            try {
                q7x0VarZzl.mo12782B(0);
                m13160J(abstractC2222p5M13188m);
                return abstractC2222p5M13188m;
            } catch (zzhag e) {
                e.zzh(abstractC2222p5M13188m);
                throw e;
            }
        } catch (zzhag e2) {
            e = e2;
            if (e.zzl()) {
                e = new zzhag(e);
            }
            e.zzh(abstractC2222p5M13188m);
            throw e;
        } catch (zzhco e3) {
            zzhag zzhagVarZza = e3.zza();
            zzhagVarZza.zzh(abstractC2222p5M13188m);
            throw zzhagVarZza;
        } catch (IOException e4) {
            if (e4.getCause() instanceof zzhag) {
                throw ((zzhag) e4.getCause());
            }
            zzhag zzhagVar = new zzhag(e4);
            zzhagVar.zzh(abstractC2222p5M13188m);
            throw zzhagVar;
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof zzhag) {
                throw ((zzhag) e5.getCause());
            }
            throw e5;
        }
    }

    /* JADX INFO: renamed from: q */
    public static AbstractC2222p5 m13166q(AbstractC2222p5 abstractC2222p5, InputStream inputStream, d8x0 d8x0Var) throws zzhag {
        q7x0 q7x0VarM173314g = q7x0.m173314g(inputStream, 4096);
        AbstractC2222p5 abstractC2222p5M13188m = abstractC2222p5.m13188m();
        try {
            obx0 obx0VarM130352b = hbx0.m130351a().m130352b(abstractC2222p5M13188m.getClass());
            obx0VarM130352b.mo13289f(abstractC2222p5M13188m, r7x0.m178219l(q7x0VarM173314g), d8x0Var);
            obx0VarM130352b.mo13284a(abstractC2222p5M13188m);
            m13160J(abstractC2222p5M13188m);
            return abstractC2222p5M13188m;
        } catch (zzhag e) {
            e = e;
            if (e.zzl()) {
                e = new zzhag(e);
            }
            e.zzh(abstractC2222p5M13188m);
            throw e;
        } catch (zzhco e2) {
            zzhag zzhagVarZza = e2.zza();
            zzhagVarZza.zzh(abstractC2222p5M13188m);
            throw zzhagVarZza;
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzhag) {
                throw ((zzhag) e3.getCause());
            }
            zzhag zzhagVar = new zzhag(e3);
            zzhagVar.zzh(abstractC2222p5M13188m);
            throw zzhagVar;
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof zzhag) {
                throw ((zzhag) e4.getCause());
            }
            throw e4;
        }
    }

    /* JADX INFO: renamed from: r */
    public static AbstractC2222p5 m13167r(AbstractC2222p5 abstractC2222p5, byte[] bArr, d8x0 d8x0Var) throws zzhag {
        AbstractC2222p5 abstractC2222p5M13161K = m13161K(abstractC2222p5, bArr, 0, bArr.length, d8x0Var);
        m13160J(abstractC2222p5M13161K);
        return abstractC2222p5M13161K;
    }

    /* JADX INFO: renamed from: s */
    public static u8x0 m13168s() {
        return q8x0.m173576f();
    }

    /* JADX INFO: renamed from: t */
    public static u8x0 m13169t(u8x0 u8x0Var) {
        int size = u8x0Var.size();
        return u8x0Var.zzd(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: renamed from: u */
    public static y9x0 m13170u() {
        return kax0.m145189f();
    }

    /* JADX INFO: renamed from: v */
    public static y9x0 m13171v(y9x0 y9x0Var) {
        int size = y9x0Var.size();
        return y9x0Var.zzd(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: renamed from: w */
    public static z9x0 m13172w() {
        return ibx0.m135273c();
    }

    /* JADX INFO: renamed from: x */
    public static z9x0 m13173x(z9x0 z9x0Var) {
        int size = z9x0Var.size();
        return z9x0Var.zzd(size == 0 ? 10 : size + size);
    }

    /* JADX INFO: renamed from: y */
    public static Object m13174y(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e) {
            pkq0.m170054a("Couldn't use Java reflection to implement protocol message reflection.", e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            pkq0.m170054a("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    /* JADX INFO: renamed from: z */
    public static Object m13175z(zax0 zax0Var, String str, Object[] objArr) {
        return new jbx0(zax0Var, str, objArr);
    }

    /* JADX INFO: renamed from: A */
    public final void m13176A() {
        hbx0.m130351a().m130352b(getClass()).mo13284a(this);
        m13177B();
    }

    /* JADX INFO: renamed from: B */
    public final void m13177B() {
        this.zzd &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX INFO: renamed from: D */
    public final void m13178D(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX INFO: renamed from: E */
    public final boolean m13179E() {
        byte bByteValue = ((Byte) mo12506H(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo13286c = hbx0.m130351a().m130352b(getClass()).mo13286c(this);
        mo12506H(2, true != zMo13286c ? null : this, null);
        return zMo13286c;
    }

    /* JADX INFO: renamed from: F */
    public final boolean m13180F() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    /* JADX INFO: renamed from: G */
    public final int m13181G() {
        return hbx0.m130351a().m130352b(getClass()).zzb(this);
    }

    /* JADX INFO: renamed from: H */
    public abstract Object mo12506H(int i, Object obj, Object obj2);

    @Override // p149l.abx0
    /* JADX INFO: renamed from: a */
    public final /* synthetic */ zax0 mo13182a() {
        return (AbstractC2222p5) mo12506H(6, null, null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2158h5
    /* JADX INFO: renamed from: b */
    public final int mo12741b(obx0 obx0Var) {
        if (m13180F()) {
            int iZza = obx0Var.zza(this);
            if (iZza >= 0) {
                return iZza;
            }
            f3c.m119257a("serialized size must be non-negative, was ", iZza);
            return 0;
        }
        int i = this.zzd & Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iZza2 = obx0Var.zza(this);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
            return iZza2;
        }
        f3c.m119257a("serialized size must be non-negative, was ", iZza2);
        return 0;
    }

    @Override // p149l.zax0
    /* JADX INFO: renamed from: d */
    public final void mo13183d(AbstractC2214o5 abstractC2214o5) throws IOException {
        hbx0.m130351a().m130352b(getClass()).mo13288e(this, z7x0.m217506l(abstractC2214o5));
    }

    @Override // p149l.zax0
    /* JADX INFO: renamed from: e */
    public final /* synthetic */ yax0 mo13184e() {
        return (m8x0) mo12506H(5, null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return hbx0.m130351a().m130352b(getClass()).mo13285b(this, (AbstractC2222p5) obj);
    }

    public final int hashCode() {
        if (m13180F()) {
            return m13181G();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iM13181G = m13181G();
        this.zza = iM13181G;
        return iM13181G;
    }

    /* JADX INFO: renamed from: i */
    public final int m13185i(obx0 obx0Var) {
        return hbx0.m130351a().m130352b(getClass()).zza(this);
    }

    /* JADX INFO: renamed from: j */
    public final m8x0 m13186j() {
        return (m8x0) mo12506H(5, null, null);
    }

    /* JADX INFO: renamed from: k */
    public final m8x0 m13187k() {
        m8x0 m8x0Var = (m8x0) mo12506H(5, null, null);
        m8x0Var.m153519k(this);
        return m8x0Var;
    }

    /* JADX INFO: renamed from: m */
    public final AbstractC2222p5 m13188m() {
        return (AbstractC2222p5) mo12506H(4, null, null);
    }

    public final String toString() {
        return C2238r5.m13233a(this, super.toString());
    }

    @Override // p149l.zax0
    public final int zzaz() {
        if (m13180F()) {
            int iM13185i = m13185i(null);
            if (iM13185i >= 0) {
                return iM13185i;
            }
            f3c.m119257a("serialized size must be non-negative, was ", iM13185i);
            return 0;
        }
        int i = this.zzd & Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iM13185i2 = m13185i(null);
        if (iM13185i2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iM13185i2;
            return iM13185i2;
        }
        f3c.m119257a("serialized size must be non-negative, was ", iM13185i2);
        return 0;
    }
}
