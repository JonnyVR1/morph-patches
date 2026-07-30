package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.play_billing.AbstractC2403d0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p153l.crx0;
import p153l.dex0;
import p153l.gxx0;
import p153l.krx0;
import p153l.kxx0;
import p153l.nrw0;
import p153l.o0y0;
import p153l.o4c;
import p153l.oox0;
import p153l.orx0;
import p153l.pxx0;
import p153l.q1y0;
import p153l.sax0;
import p153l.tvx0;
import p153l.uxx0;
import p153l.vtq0;
import p153l.wpg0;
import p153l.ypw0;
import p153l.yvx0;
import p153l.yzv;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2403d0<MessageType extends AbstractC2403d0<MessageType, BuilderType>, BuilderType extends oox0<MessageType, BuilderType>> extends AbstractC2444y<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected o0y0 zzc = o0y0.m165555c();

    /* JADX INFO: renamed from: f */
    public static AbstractC2403d0 m14811f(AbstractC2403d0 abstractC2403d0, byte[] bArr, int i, int i2, dex0 dex0Var) throws zzhr {
        if (i2 == 0) {
            return abstractC2403d0;
        }
        AbstractC2403d0 abstractC2403d0M14827m = abstractC2403d0.m14827m();
        try {
            uxx0 uxx0VarM132929b = gxx0.m132928a().m132929b(abstractC2403d0M14827m.getClass());
            uxx0VarM132929b.mo14871d(abstractC2403d0M14827m, bArr, 0, i2, new ypw0(dex0Var));
            uxx0VarM132929b.mo14868a(abstractC2403d0M14827m);
            return abstractC2403d0M14827m;
        } catch (zzhr e) {
            throw e;
        } catch (zzji e2) {
            throw e2.zza();
        } catch (IOException e3) {
            if (e3.getCause() instanceof zzhr) {
                throw ((zzhr) e3.getCause());
            }
            throw new zzhr(e3);
        } catch (IndexOutOfBoundsException unused) {
            nrw0.m164535a("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static AbstractC2403d0 m14812l(Class cls) {
        Map map = zzb;
        AbstractC2403d0 abstractC2403d0 = (AbstractC2403d0) map.get(cls);
        if (abstractC2403d0 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2403d0 = (AbstractC2403d0) map.get(cls);
            } catch (ClassNotFoundException e) {
                yzv.m218057a("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (abstractC2403d0 != null) {
            return abstractC2403d0;
        }
        AbstractC2403d0 abstractC2403d1 = (AbstractC2403d0) ((AbstractC2403d0) q1y0.m174944j(cls)).mo14801h(6, null, null);
        if (abstractC2403d1 != null) {
            map.put(cls, abstractC2403d1);
            return abstractC2403d1;
        }
        wpg0.m207458a();
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static AbstractC2403d0 m14813n(AbstractC2403d0 abstractC2403d0, byte[] bArr, dex0 dex0Var) throws zzhr {
        AbstractC2403d0 abstractC2403d0M14811f = m14811f(abstractC2403d0, bArr, 0, bArr.length, dex0Var);
        if (abstractC2403d0M14811f == null || m14819x(abstractC2403d0M14811f, true)) {
            return abstractC2403d0M14811f;
        }
        throw new zzji(abstractC2403d0M14811f).zza();
    }

    /* JADX INFO: renamed from: o */
    public static krx0 m14814o() {
        return crx0.m112091f();
    }

    /* JADX INFO: renamed from: q */
    public static orx0 m14815q() {
        return kxx0.m151897c();
    }

    /* JADX INFO: renamed from: r */
    public static Object m14816r(Method method, Object obj, Object... objArr) {
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

    /* JADX INFO: renamed from: s */
    public static Object m14817s(yvx0 yvx0Var, String str, Object[] objArr) {
        return new pxx0(yvx0Var, str, objArr);
    }

    /* JADX INFO: renamed from: v */
    public static void m14818v(Class cls, AbstractC2403d0 abstractC2403d0) {
        abstractC2403d0.m14830u();
        zzb.put(cls, abstractC2403d0);
    }

    /* JADX INFO: renamed from: x */
    public static final boolean m14819x(AbstractC2403d0 abstractC2403d0, boolean z) {
        byte bByteValue = ((Byte) abstractC2403d0.mo14801h(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo14870c = gxx0.m132928a().m132929b(abstractC2403d0.getClass()).mo14870c(abstractC2403d0);
        if (z) {
            abstractC2403d0.mo14801h(2, true != zMo14870c ? null : abstractC2403d0, null);
        }
        return zMo14870c;
    }

    @Override // p153l.yvx0
    /* JADX INFO: renamed from: a */
    public final void mo14820a(AbstractC2395a0 abstractC2395a0) throws IOException {
        gxx0.m132928a().m132929b(getClass()).mo14872e(this, sax0.m185274b(abstractC2395a0));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2444y
    /* JADX INFO: renamed from: b */
    public final int mo14821b(uxx0 uxx0Var) {
        if (m14822e()) {
            int iZza = uxx0Var.zza(this);
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
        int iZza2 = uxx0Var.zza(this);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
            return iZza2;
        }
        o4c.m165980a("serialized size must be non-negative, was ", iZza2);
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m14822e() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return gxx0.m132928a().m132929b(getClass()).mo14869b(this, (AbstractC2403d0) obj);
    }

    /* JADX INFO: renamed from: g */
    public final int m14823g(uxx0 uxx0Var) {
        return gxx0.m132928a().m132929b(getClass()).zza(this);
    }

    /* JADX INFO: renamed from: h */
    public abstract Object mo14801h(int i, Object obj, Object obj2);

    public final int hashCode() {
        if (m14822e()) {
            return m14824i();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iM14824i = m14824i();
        this.zza = iM14824i;
        return iM14824i;
    }

    /* JADX INFO: renamed from: i */
    public final int m14824i() {
        return gxx0.m132928a().m132929b(getClass()).zzb(this);
    }

    /* JADX INFO: renamed from: j */
    public final oox0 m14825j() {
        return (oox0) mo14801h(5, null, null);
    }

    /* JADX INFO: renamed from: k */
    public final oox0 m14826k() {
        oox0 oox0Var = (oox0) mo14801h(5, null, null);
        oox0Var.m168604j(this);
        return oox0Var;
    }

    /* JADX INFO: renamed from: m */
    public final AbstractC2403d0 m14827m() {
        return (AbstractC2403d0) mo14801h(4, null, null);
    }

    @Override // p153l.yvx0
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ tvx0 mo14828p() {
        return (oox0) mo14801h(5, null, null);
    }

    /* JADX INFO: renamed from: t */
    public final void m14829t() {
        gxx0.m132928a().m132929b(getClass()).mo14868a(this);
        m14830u();
    }

    public final String toString() {
        return C2409g0.m14843a(this, super.toString());
    }

    /* JADX INFO: renamed from: u */
    public final void m14830u() {
        this.zzd &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX INFO: renamed from: w */
    public final void m14831w(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // p153l.dwx0
    public final /* synthetic */ yvx0 zzi() {
        return (AbstractC2403d0) mo14801h(6, null, null);
    }

    @Override // p153l.yvx0
    public final int zzk() {
        if (m14822e()) {
            int iM14823g = m14823g(null);
            if (iM14823g >= 0) {
                return iM14823g;
            }
            o4c.m165980a("serialized size must be non-negative, was ", iM14823g);
            return 0;
        }
        int i = this.zzd & Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iM14823g2 = m14823g(null);
        if (iM14823g2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iM14823g2;
            return iM14823g2;
        }
        o4c.m165980a("serialized size must be non-negative, was ", iM14823g2);
        return 0;
    }

    @Override // p153l.dwx0
    public final boolean zzl() {
        return m14819x(this, true);
    }
}
