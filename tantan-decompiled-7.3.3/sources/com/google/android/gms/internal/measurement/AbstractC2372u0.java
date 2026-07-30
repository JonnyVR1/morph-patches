package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.measurement.AbstractC2372u0;
import com.google.android.gms.internal.measurement.AbstractC2372u0.b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p153l.a0y0;
import p153l.azx0;
import p153l.b3y0;
import p153l.e1y0;
import p153l.ecy0;
import p153l.efy0;
import p153l.f6y0;
import p153l.hay0;
import p153l.i4y0;
import p153l.i9y0;
import p153l.kfy0;
import p153l.kux0;
import p153l.m2y0;
import p153l.m9y0;
import p153l.nvx0;
import p153l.nxx0;
import p153l.o4c;
import p153l.ocy0;
import p153l.qby0;
import p153l.szx0;
import p153l.v0y0;
import p153l.v9y0;
import p153l.vby0;
import p153l.vtq0;
import p153l.wg3;
import p153l.wpg0;
import p153l.xux0;
import p153l.yzv;
import p153l.z3y0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2372u0<MessageType extends AbstractC2372u0<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends AbstractC2360o0<MessageType, BuilderType> {
    private static Map<Class<?>, AbstractC2372u0<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected efy0 zzb = efy0.m120738k();

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u0$a */
    public static class a<T extends AbstractC2372u0<T, ?>> extends xux0<T> {
        public a(T t) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u0$b */
    public static abstract class b<MessageType extends AbstractC2372u0<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends kux0<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a */
        public final MessageType f10298a;

        /* JADX INFO: renamed from: b */
        public MessageType f10299b;

        public b(MessageType messagetype) {
            this.f10298a = messagetype;
            if (messagetype.m14407A()) {
                wg3.m206174a("Default instance must be immutable.");
                throw null;
            }
            this.f10299b = (MessageType) messagetype.m14418u();
        }

        /* JADX INFO: renamed from: o */
        public static <MessageType> void m14421o(MessageType messagetype, MessageType messagetype2) {
            vby0.m200747a().m200749c(messagetype).mo14512c(messagetype, messagetype2);
        }

        @Override // p153l.v9y0
        /* JADX INFO: renamed from: a */
        public final boolean mo14412a() {
            return AbstractC2372u0.m14403q(this.f10299b, false);
        }

        @Override // p153l.kux0
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            b bVar = (b) this.f10298a.mo13848k(e.f10304e, null, null);
            bVar.f10299b = (MessageType) mo14422F();
            return bVar;
        }

        @Override // p153l.kux0
        /* JADX INFO: renamed from: d */
        public final /* synthetic */ kux0 mo14428m(nxx0 nxx0Var, C2368s0 c2368s0) throws IOException {
            return (b) mo14428m(nxx0Var, c2368s0);
        }

        @Override // p153l.kux0
        /* JADX INFO: renamed from: e */
        public final /* synthetic */ kux0 mo14425e(byte[] bArr, int i, int i2) throws zzkb {
            return m14434t(bArr, 0, i2, C2368s0.f10294c);
        }

        @Override // p153l.kux0
        /* JADX INFO: renamed from: f */
        public final /* synthetic */ kux0 mo14426f(byte[] bArr, int i, int i2, C2368s0 c2368s0) throws zzkb {
            return m14434t(bArr, 0, i2, c2368s0);
        }

        @Override // p153l.kux0
        /* JADX INFO: renamed from: l */
        public final /* synthetic */ kux0 clone() {
            return (b) clone();
        }

        /* JADX INFO: renamed from: n */
        public final BuilderType m14429n(MessageType messagetype) {
            if (this.f10298a.equals(messagetype)) {
                return this;
            }
            if (!this.f10299b.m14407A()) {
                m14433s();
            }
            m14421o(this.f10299b, messagetype);
            return this;
        }

        @Override // p153l.i9y0
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public final MessageType mo14423H() {
            MessageType messagetype = (MessageType) mo14422F();
            if (AbstractC2372u0.m14403q(messagetype, true)) {
                return messagetype;
            }
            throw new zzmh(messagetype);
        }

        @Override // p153l.i9y0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public MessageType mo14422F() {
            boolean zM14407A = this.f10299b.m14407A();
            MessageType messagetype = this.f10299b;
            if (!zM14407A) {
                return messagetype;
            }
            messagetype.m14419y();
            return this.f10299b;
        }

        /* JADX INFO: renamed from: r */
        public final void m14432r() {
            if (this.f10299b.m14407A()) {
                return;
            }
            m14433s();
        }

        /* JADX INFO: renamed from: s */
        public void m14433s() {
            MessageType messagetype = (MessageType) this.f10298a.m14418u();
            m14421o(messagetype, this.f10299b);
            this.f10299b = messagetype;
        }

        /* JADX INFO: renamed from: t */
        public final BuilderType m14434t(byte[] bArr, int i, int i2, C2368s0 c2368s0) throws zzkb {
            if (!this.f10299b.m14407A()) {
                m14433s();
            }
            try {
                vby0.m200747a().m200749c(this.f10299b).mo14514e(this.f10299b, bArr, 0, i2, new nvx0(c2368s0));
                return this;
            } catch (zzkb e) {
                throw e;
            } catch (IOException e2) {
                vtq0.m202761a("Reading from byte array should not throw IOException.", e2);
                return null;
            } catch (IndexOutOfBoundsException unused) {
                throw zzkb.zzi();
            }
        }

        @Override // p153l.kux0
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final BuilderType mo14428m(nxx0 nxx0Var, C2368s0 c2368s0) throws IOException {
            if (!this.f10299b.m14407A()) {
                m14433s();
            }
            try {
                vby0.m200747a().m200749c(this.f10299b).mo14513d(this.f10299b, azx0.m101099w(nxx0Var), c2368s0);
                return this;
            } catch (RuntimeException e) {
                if (e.getCause() instanceof IOException) {
                    throw ((IOException) e.getCause());
                }
                throw e;
            }
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u0$c */
    public static final class c implements e1y0<c> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // p153l.e1y0
        /* JADX INFO: renamed from: d */
        public final hay0 mo14436d(hay0 hay0Var, hay0 hay0Var2) {
            throw new NoSuchMethodError();
        }

        @Override // p153l.e1y0
        /* JADX INFO: renamed from: k */
        public final i9y0 mo14437k(i9y0 i9y0Var, m9y0 m9y0Var) {
            throw new NoSuchMethodError();
        }

        @Override // p153l.e1y0
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // p153l.e1y0
        public final zzms zzb() {
            throw new NoSuchMethodError();
        }

        @Override // p153l.e1y0
        public final zzmz zzc() {
            throw new NoSuchMethodError();
        }

        @Override // p153l.e1y0
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // p153l.e1y0
        public final boolean zze() {
            throw new NoSuchMethodError();
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u0$d */
    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType> extends AbstractC2372u0<MessageType, BuilderType> implements v9y0 {
        protected v0y0<c> zzc = v0y0.m198949i();

        /* JADX INFO: renamed from: B */
        public final v0y0<c> m14438B() {
            if (this.zzc.m198961r()) {
                this.zzc = (v0y0) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u0$e */
    public static final enum e {

        /* JADX INFO: renamed from: a */
        public static final int f10300a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f10301b = 2;

        /* JADX INFO: renamed from: c */
        public static final int f10302c = 3;

        /* JADX INFO: renamed from: d */
        public static final int f10303d = 4;

        /* JADX INFO: renamed from: e */
        public static final int f10304e = 5;

        /* JADX INFO: renamed from: f */
        public static final int f10305f = 6;

        /* JADX INFO: renamed from: g */
        public static final int f10306g = 7;

        /* JADX INFO: renamed from: h */
        public static final /* synthetic */ int[] f10307h = {1, 2, 3, 4, 5, 6, 7};

        /* JADX INFO: renamed from: a */
        public static int[] m14439a() {
            return (int[]) f10307h.clone();
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u0$f */
    public static class f<ContainingType extends m9y0, Type> extends a0y0<ContainingType, Type> {
    }

    /* JADX INFO: renamed from: h */
    private final int m14396h() {
        return vby0.m200747a().m200749c(this).zzb(this);
    }

    /* JADX INFO: renamed from: j */
    public static <T extends AbstractC2372u0<?, ?>> T m14397j(Class<T> cls) {
        T t = (T) zzc.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) zzc.get(cls);
            } catch (ClassNotFoundException e2) {
                yzv.m218057a("Class initialization cannot fail.", e2);
                return null;
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((AbstractC2372u0) kfy0.m149639b(cls)).mo13848k(e.f10305f, null, null);
        if (t2 != null) {
            zzc.put((Class<?>) cls, t2);
            return t2;
        }
        wpg0.m207458a();
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static Object m14398l(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            vtq0.m202761a("Couldn't use Java reflection to implement protocol message reflection.", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
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

    /* JADX INFO: renamed from: m */
    public static Object m14399m(m9y0 m9y0Var, String str, Object[] objArr) {
        return new ecy0(m9y0Var, str, objArr);
    }

    /* JADX INFO: renamed from: n */
    public static b3y0 m14400n(b3y0 b3y0Var) {
        return b3y0Var.zza(b3y0Var.size() << 1);
    }

    /* JADX INFO: renamed from: o */
    public static <E> i4y0<E> m14401o(i4y0<E> i4y0Var) {
        return i4y0Var.zza(i4y0Var.size() << 1);
    }

    /* JADX INFO: renamed from: p */
    public static <T extends AbstractC2372u0<?, ?>> void m14402p(Class<T> cls, T t) {
        t.m14420z();
        zzc.put(cls, t);
    }

    /* JADX INFO: renamed from: q */
    public static final <T extends AbstractC2372u0<T, ?>> boolean m14403q(T t, boolean z) {
        byte bByteValue = ((Byte) t.mo13848k(e.f10300a, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo14511b = vby0.m200747a().m200749c(t).mo14511b(t);
        if (z) {
            t.mo13848k(e.f10301b, zMo14511b ? t : null, null);
        }
        return zMo14511b;
    }

    /* JADX INFO: renamed from: v */
    public static z3y0 m14404v() {
        return m2y0.m156909f();
    }

    /* JADX INFO: renamed from: w */
    public static b3y0 m14405w() {
        return f6y0.m124330f();
    }

    /* JADX INFO: renamed from: x */
    public static <E> i4y0<E> m14406x() {
        return qby0.m176093h();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m14407A() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // p153l.m9y0
    /* JADX INFO: renamed from: P */
    public final int mo14408P() {
        return mo14305c(null);
    }

    @Override // p153l.m9y0
    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ i9y0 mo14409Q() {
        return (b) mo13848k(e.f10304e, null, null);
    }

    @Override // p153l.m9y0
    /* JADX INFO: renamed from: R */
    public final /* synthetic */ i9y0 mo14410R() {
        return ((b) mo13848k(e.f10304e, null, null)).m14429n(this);
    }

    @Override // p153l.m9y0
    /* JADX INFO: renamed from: S */
    public final void mo14411S(zzjc zzjcVar) throws IOException {
        vby0.m200747a().m200749c(this).mo14510a(this, szx0.m188687N(zzjcVar));
    }

    @Override // p153l.v9y0
    /* JADX INFO: renamed from: a */
    public final boolean mo14412a() {
        return m14403q(this, true);
    }

    @Override // p153l.v9y0
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ m9y0 mo14413b() {
        return (AbstractC2372u0) mo13848k(e.f10305f, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2360o0
    /* JADX INFO: renamed from: c */
    public final int mo14305c(ocy0 ocy0Var) {
        if (m14407A()) {
            int iM14415r = m14415r(ocy0Var);
            if (iM14415r >= 0) {
                return iM14415r;
            }
            o4c.m165980a("serialized size must be non-negative, was ", iM14415r);
            return 0;
        }
        if (mo14306e() != Integer.MAX_VALUE) {
            return mo14306e();
        }
        int iM14415r2 = m14415r(ocy0Var);
        mo14307f(iM14415r2);
        return iM14415r2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2360o0
    /* JADX INFO: renamed from: e */
    public final int mo14306e() {
        return this.zzd & Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return vby0.m200747a().m200749c(this).mo14515f(this, (AbstractC2372u0) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2360o0
    /* JADX INFO: renamed from: f */
    public final void mo14307f(int i) {
        if (i < 0) {
            o4c.m165980a("serialized size must be non-negative, was ", i);
        } else {
            this.zzd = (i & Api.BaseClientBuilder.API_PRIORITY_OTHER) | (this.zzd & Integer.MIN_VALUE);
        }
    }

    public int hashCode() {
        if (m14407A()) {
            return m14396h();
        }
        if (this.zza == 0) {
            this.zza = m14396h();
        }
        return this.zza;
    }

    /* JADX INFO: renamed from: i */
    public final <MessageType extends AbstractC2372u0<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType m14414i(MessageType messagetype) {
        return (BuilderType) m14416s().m14429n(messagetype);
    }

    /* JADX INFO: renamed from: k */
    public abstract Object mo13848k(int i, Object obj, Object obj2);

    /* JADX INFO: renamed from: r */
    public final int m14415r(ocy0<?> ocy0Var) {
        return ocy0Var == null ? vby0.m200747a().m200749c(this).zza(this) : ocy0Var.zza(this);
    }

    /* JADX INFO: renamed from: s */
    public final <MessageType extends AbstractC2372u0<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType m14416s() {
        return (BuilderType) mo13848k(e.f10304e, null, null);
    }

    /* JADX INFO: renamed from: t */
    public final BuilderType m14417t() {
        return (BuilderType) ((b) mo13848k(e.f10304e, null, null)).m14429n(this);
    }

    public String toString() {
        return C2374v0.m14464a(this, super.toString());
    }

    /* JADX INFO: renamed from: u */
    public final MessageType m14418u() {
        return (MessageType) mo13848k(e.f10303d, null, null);
    }

    /* JADX INFO: renamed from: y */
    public final void m14419y() {
        vby0.m200747a().m200749c(this).zzd(this);
        m14420z();
    }

    /* JADX INFO: renamed from: z */
    public final void m14420z() {
        this.zzd &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }
}
