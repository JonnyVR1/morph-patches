package com.google.android.gms.internal.play_billing;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.play_billing.AbstractC2380d0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p149l.aox0;
import p149l.byv;
import p149l.eix0;
import p149l.eox0;
import p149l.f3c;
import p149l.hiw0;
import p149l.ifx0;
import p149l.iix0;
import p149l.irx0;
import p149l.jox0;
import p149l.ksx0;
import p149l.m1x0;
import p149l.nmx0;
import p149l.ohg0;
import p149l.oox0;
import p149l.pkq0;
import p149l.sgw0;
import p149l.smx0;
import p149l.whx0;
import p149l.x4x0;

/* JADX INFO: renamed from: com.google.android.gms.internal.play_billing.d0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2380d0<MessageType extends AbstractC2380d0<MessageType, BuilderType>, BuilderType extends ifx0<MessageType, BuilderType>> extends AbstractC2421y<MessageType, BuilderType> {
    private static final Map zzb = new ConcurrentHashMap();
    private int zzd = -1;
    protected irx0 zzc = irx0.m137921c();

    /* JADX INFO: renamed from: f */
    public static AbstractC2380d0 m14757f(AbstractC2380d0 abstractC2380d0, byte[] bArr, int i, int i2, x4x0 x4x0Var) throws zzhr {
        if (i2 == 0) {
            return abstractC2380d0;
        }
        AbstractC2380d0 abstractC2380d0M14773m = abstractC2380d0.m14773m();
        try {
            oox0 oox0VarM98002b = aox0.m98001a().m98002b(abstractC2380d0M14773m.getClass());
            oox0VarM98002b.mo14817d(abstractC2380d0M14773m, bArr, 0, i2, new sgw0(x4x0Var));
            oox0VarM98002b.mo14814a(abstractC2380d0M14773m);
            return abstractC2380d0M14773m;
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
            hiw0.m131310a("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            return null;
        }
    }

    /* JADX INFO: renamed from: l */
    public static AbstractC2380d0 m14758l(Class cls) {
        Map map = zzb;
        AbstractC2380d0 abstractC2380d0 = (AbstractC2380d0) map.get(cls);
        if (abstractC2380d0 == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2380d0 = (AbstractC2380d0) map.get(cls);
            } catch (ClassNotFoundException e) {
                byv.m104511a("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (abstractC2380d0 != null) {
            return abstractC2380d0;
        }
        AbstractC2380d0 abstractC2380d1 = (AbstractC2380d0) ((AbstractC2380d0) ksx0.m147118j(cls)).mo14747h(6, null, null);
        if (abstractC2380d1 != null) {
            map.put(cls, abstractC2380d1);
            return abstractC2380d1;
        }
        ohg0.m164364a();
        return null;
    }

    /* JADX INFO: renamed from: n */
    public static AbstractC2380d0 m14759n(AbstractC2380d0 abstractC2380d0, byte[] bArr, x4x0 x4x0Var) throws zzhr {
        AbstractC2380d0 abstractC2380d0M14757f = m14757f(abstractC2380d0, bArr, 0, bArr.length, x4x0Var);
        if (abstractC2380d0M14757f == null || m14765x(abstractC2380d0M14757f, true)) {
            return abstractC2380d0M14757f;
        }
        throw new zzji(abstractC2380d0M14757f).zza();
    }

    /* JADX INFO: renamed from: o */
    public static eix0 m14760o() {
        return whx0.m203253f();
    }

    /* JADX INFO: renamed from: q */
    public static iix0 m14761q() {
        return eox0.m117519c();
    }

    /* JADX INFO: renamed from: r */
    public static Object m14762r(Method method, Object obj, Object... objArr) {
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

    /* JADX INFO: renamed from: s */
    public static Object m14763s(smx0 smx0Var, String str, Object[] objArr) {
        return new jox0(smx0Var, str, objArr);
    }

    /* JADX INFO: renamed from: v */
    public static void m14764v(Class cls, AbstractC2380d0 abstractC2380d0) {
        abstractC2380d0.m14776u();
        zzb.put(cls, abstractC2380d0);
    }

    /* JADX INFO: renamed from: x */
    public static final boolean m14765x(AbstractC2380d0 abstractC2380d0, boolean z) {
        byte bByteValue = ((Byte) abstractC2380d0.mo14747h(1, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo14816c = aox0.m98001a().m98002b(abstractC2380d0.getClass()).mo14816c(abstractC2380d0);
        if (z) {
            abstractC2380d0.mo14747h(2, true != zMo14816c ? null : abstractC2380d0, null);
        }
        return zMo14816c;
    }

    @Override // p149l.smx0
    /* JADX INFO: renamed from: a */
    public final void mo14766a(AbstractC2372a0 abstractC2372a0) throws IOException {
        aox0.m98001a().m98002b(getClass()).mo14818e(this, m1x0.m152625b(abstractC2372a0));
    }

    @Override // com.google.android.gms.internal.play_billing.AbstractC2421y
    /* JADX INFO: renamed from: b */
    public final int mo14767b(oox0 oox0Var) {
        if (m14768e()) {
            int iZza = oox0Var.zza(this);
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
        int iZza2 = oox0Var.zza(this);
        if (iZza2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
            return iZza2;
        }
        f3c.m119257a("serialized size must be non-negative, was ", iZza2);
        return 0;
    }

    /* JADX INFO: renamed from: e */
    public final boolean m14768e() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return aox0.m98001a().m98002b(getClass()).mo14815b(this, (AbstractC2380d0) obj);
    }

    /* JADX INFO: renamed from: g */
    public final int m14769g(oox0 oox0Var) {
        return aox0.m98001a().m98002b(getClass()).zza(this);
    }

    /* JADX INFO: renamed from: h */
    public abstract Object mo14747h(int i, Object obj, Object obj2);

    public final int hashCode() {
        if (m14768e()) {
            return m14770i();
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int iM14770i = m14770i();
        this.zza = iM14770i;
        return iM14770i;
    }

    /* JADX INFO: renamed from: i */
    public final int m14770i() {
        return aox0.m98001a().m98002b(getClass()).zzb(this);
    }

    /* JADX INFO: renamed from: j */
    public final ifx0 m14771j() {
        return (ifx0) mo14747h(5, null, null);
    }

    /* JADX INFO: renamed from: k */
    public final ifx0 m14772k() {
        ifx0 ifx0Var = (ifx0) mo14747h(5, null, null);
        ifx0Var.m135958j(this);
        return ifx0Var;
    }

    /* JADX INFO: renamed from: m */
    public final AbstractC2380d0 m14773m() {
        return (AbstractC2380d0) mo14747h(4, null, null);
    }

    @Override // p149l.smx0
    /* JADX INFO: renamed from: p */
    public final /* synthetic */ nmx0 mo14774p() {
        return (ifx0) mo14747h(5, null, null);
    }

    /* JADX INFO: renamed from: t */
    public final void m14775t() {
        aox0.m98001a().m98002b(getClass()).mo14814a(this);
        m14776u();
    }

    public final String toString() {
        return C2386g0.m14789a(this, super.toString());
    }

    /* JADX INFO: renamed from: u */
    public final void m14776u() {
        this.zzd &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    /* JADX INFO: renamed from: w */
    public final void m14777w(int i) {
        this.zzd = (this.zzd & Integer.MIN_VALUE) | Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    @Override // p149l.xmx0
    public final /* synthetic */ smx0 zzi() {
        return (AbstractC2380d0) mo14747h(6, null, null);
    }

    @Override // p149l.smx0
    public final int zzk() {
        if (m14768e()) {
            int iM14769g = m14769g(null);
            if (iM14769g >= 0) {
                return iM14769g;
            }
            f3c.m119257a("serialized size must be non-negative, was ", iM14769g);
            return 0;
        }
        int i = this.zzd & Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int iM14769g2 = m14769g(null);
        if (iM14769g2 >= 0) {
            this.zzd = (this.zzd & Integer.MIN_VALUE) | iM14769g2;
            return iM14769g2;
        }
        f3c.m119257a("serialized size must be non-negative, was ", iM14769g2);
        return 0;
    }

    @Override // p149l.xmx0
    public final boolean zzl() {
        return m14765x(this, true);
    }
}
