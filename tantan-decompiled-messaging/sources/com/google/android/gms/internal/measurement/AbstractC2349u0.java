package com.google.android.gms.internal.measurement;

import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.measurement.AbstractC2349u0;
import com.google.android.gms.internal.measurement.AbstractC2349u0.b;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p149l.b1y0;
import p149l.byv;
import p149l.c0y0;
import p149l.cvx0;
import p149l.e6y0;
import p149l.elx0;
import p149l.f3c;
import p149l.g0y0;
import p149l.gtx0;
import p149l.hmx0;
import p149l.hox0;
import p149l.i3y0;
import p149l.ig3;
import p149l.k2y0;
import p149l.mqx0;
import p149l.ohg0;
import p149l.p0y0;
import p149l.p2y0;
import p149l.pkq0;
import p149l.prx0;
import p149l.rlx0;
import p149l.tux0;
import p149l.upx0;
import p149l.uqx0;
import p149l.vtx0;
import p149l.y2y0;
import p149l.y5y0;
import p149l.yrx0;
import p149l.zwx0;

/* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u0 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC2349u0<MessageType extends AbstractC2349u0<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends AbstractC2337o0<MessageType, BuilderType> {
    private static Map<Class<?>, AbstractC2349u0<?, ?>> zzc = new ConcurrentHashMap();
    private int zzd = -1;
    protected y5y0 zzb = y5y0.m213023k();

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u0$a */
    public static class a<T extends AbstractC2349u0<T, ?>> extends rlx0<T> {
        public a(T t) {
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u0$b */
    public static abstract class b<MessageType extends AbstractC2349u0<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> extends elx0<MessageType, BuilderType> {

        /* JADX INFO: renamed from: a */
        public final MessageType f10261a;

        /* JADX INFO: renamed from: b */
        public MessageType f10262b;

        public b(MessageType messagetype) {
            this.f10261a = messagetype;
            if (messagetype.m14353A()) {
                ig3.m135964a("Default instance must be immutable.");
                throw null;
            }
            this.f10262b = (MessageType) messagetype.m14364u();
        }

        /* JADX INFO: renamed from: o */
        public static <MessageType> void m14367o(MessageType messagetype, MessageType messagetype2) {
            p2y0.m167229a().m167231c(messagetype).mo14458c(messagetype, messagetype2);
        }

        @Override // p149l.p0y0
        /* JADX INFO: renamed from: a */
        public final boolean mo14358a() {
            return AbstractC2349u0.m14349q(this.f10262b, false);
        }

        @Override // p149l.elx0
        public /* synthetic */ Object clone() throws CloneNotSupportedException {
            b bVar = (b) this.f10261a.mo13794k(e.f10267e, null, null);
            bVar.f10262b = (MessageType) mo14368F();
            return bVar;
        }

        @Override // p149l.elx0
        /* JADX INFO: renamed from: d */
        public final /* synthetic */ elx0 mo14374m(hox0 hox0Var, C2345s0 c2345s0) throws IOException {
            return (b) mo14374m(hox0Var, c2345s0);
        }

        @Override // p149l.elx0
        /* JADX INFO: renamed from: e */
        public final /* synthetic */ elx0 mo14371e(byte[] bArr, int i, int i2) throws zzkb {
            return m14380t(bArr, 0, i2, C2345s0.f10257c);
        }

        @Override // p149l.elx0
        /* JADX INFO: renamed from: f */
        public final /* synthetic */ elx0 mo14372f(byte[] bArr, int i, int i2, C2345s0 c2345s0) throws zzkb {
            return m14380t(bArr, 0, i2, c2345s0);
        }

        @Override // p149l.elx0
        /* JADX INFO: renamed from: l */
        public final /* synthetic */ elx0 clone() {
            return (b) clone();
        }

        /* JADX INFO: renamed from: n */
        public final BuilderType m14375n(MessageType messagetype) {
            if (this.f10261a.equals(messagetype)) {
                return this;
            }
            if (!this.f10262b.m14353A()) {
                m14379s();
            }
            m14367o(this.f10262b, messagetype);
            return this;
        }

        @Override // p149l.c0y0
        /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
        public final MessageType mo14369H() {
            MessageType messagetype = (MessageType) mo14368F();
            if (AbstractC2349u0.m14349q(messagetype, true)) {
                return messagetype;
            }
            throw new zzmh(messagetype);
        }

        @Override // p149l.c0y0
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
        public MessageType mo14368F() {
            boolean zM14353A = this.f10262b.m14353A();
            MessageType messagetype = this.f10262b;
            if (!zM14353A) {
                return messagetype;
            }
            messagetype.m14365y();
            return this.f10262b;
        }

        /* JADX INFO: renamed from: r */
        public final void m14378r() {
            if (this.f10262b.m14353A()) {
                return;
            }
            m14379s();
        }

        /* JADX INFO: renamed from: s */
        public void m14379s() {
            MessageType messagetype = (MessageType) this.f10261a.m14364u();
            m14367o(messagetype, this.f10262b);
            this.f10262b = messagetype;
        }

        /* JADX INFO: renamed from: t */
        public final BuilderType m14380t(byte[] bArr, int i, int i2, C2345s0 c2345s0) throws zzkb {
            if (!this.f10262b.m14353A()) {
                m14379s();
            }
            try {
                p2y0.m167229a().m167231c(this.f10262b).mo14460e(this.f10262b, bArr, 0, i2, new hmx0(c2345s0));
                return this;
            } catch (zzkb e) {
                throw e;
            } catch (IOException e2) {
                pkq0.m170054a("Reading from byte array should not throw IOException.", e2);
                return null;
            } catch (IndexOutOfBoundsException unused) {
                throw zzkb.zzi();
            }
        }

        @Override // p149l.elx0
        /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
        public final BuilderType mo14374m(hox0 hox0Var, C2345s0 c2345s0) throws IOException {
            if (!this.f10262b.m14353A()) {
                m14379s();
            }
            try {
                p2y0.m167229a().m167231c(this.f10262b).mo14459d(this.f10262b, upx0.m194941w(hox0Var), c2345s0);
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
    public static final class c implements yrx0<c> {
        @Override // java.lang.Comparable
        public final /* synthetic */ int compareTo(Object obj) {
            throw new NoSuchMethodError();
        }

        @Override // p149l.yrx0
        /* JADX INFO: renamed from: d */
        public final b1y0 mo14382d(b1y0 b1y0Var, b1y0 b1y0Var2) {
            throw new NoSuchMethodError();
        }

        @Override // p149l.yrx0
        /* JADX INFO: renamed from: k */
        public final c0y0 mo14383k(c0y0 c0y0Var, g0y0 g0y0Var) {
            throw new NoSuchMethodError();
        }

        @Override // p149l.yrx0
        public final int zza() {
            throw new NoSuchMethodError();
        }

        @Override // p149l.yrx0
        public final zzms zzb() {
            throw new NoSuchMethodError();
        }

        @Override // p149l.yrx0
        public final zzmz zzc() {
            throw new NoSuchMethodError();
        }

        @Override // p149l.yrx0
        public final boolean zzd() {
            throw new NoSuchMethodError();
        }

        @Override // p149l.yrx0
        public final boolean zze() {
            throw new NoSuchMethodError();
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u0$d */
    public static abstract class d<MessageType extends d<MessageType, BuilderType>, BuilderType> extends AbstractC2349u0<MessageType, BuilderType> implements p0y0 {
        protected prx0<c> zzc = prx0.m171079i();

        /* JADX INFO: renamed from: B */
        public final prx0<c> m14384B() {
            if (this.zzc.m171091r()) {
                this.zzc = (prx0) this.zzc.clone();
            }
            return this.zzc;
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u0$e */
    public static final enum e {

        /* JADX INFO: renamed from: a */
        public static final int f10263a = 1;

        /* JADX INFO: renamed from: b */
        public static final int f10264b = 2;

        /* JADX INFO: renamed from: c */
        public static final int f10265c = 3;

        /* JADX INFO: renamed from: d */
        public static final int f10266d = 4;

        /* JADX INFO: renamed from: e */
        public static final int f10267e = 5;

        /* JADX INFO: renamed from: f */
        public static final int f10268f = 6;

        /* JADX INFO: renamed from: g */
        public static final int f10269g = 7;

        /* JADX INFO: renamed from: h */
        public static final /* synthetic */ int[] f10270h = {1, 2, 3, 4, 5, 6, 7};

        /* JADX INFO: renamed from: a */
        public static int[] m14385a() {
            return (int[]) f10270h.clone();
        }
    }

    /* JADX INFO: renamed from: com.google.android.gms.internal.measurement.u0$f */
    public static class f<ContainingType extends g0y0, Type> extends uqx0<ContainingType, Type> {
    }

    /* JADX INFO: renamed from: h */
    private final int m14342h() {
        return p2y0.m167229a().m167231c(this).zzb(this);
    }

    /* JADX INFO: renamed from: j */
    public static <T extends AbstractC2349u0<?, ?>> T m14343j(Class<T> cls) {
        T t = (T) zzc.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) zzc.get(cls);
            } catch (ClassNotFoundException e2) {
                byv.m104511a("Class initialization cannot fail.", e2);
                return null;
            }
        }
        if (t != null) {
            return t;
        }
        T t2 = (T) ((AbstractC2349u0) e6y0.m115129b(cls)).mo13794k(e.f10268f, null, null);
        if (t2 != null) {
            zzc.put((Class<?>) cls, t2);
            return t2;
        }
        ohg0.m164364a();
        return null;
    }

    /* JADX INFO: renamed from: l */
    public static Object m14344l(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            pkq0.m170054a("Couldn't use Java reflection to implement protocol message reflection.", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
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

    /* JADX INFO: renamed from: m */
    public static Object m14345m(g0y0 g0y0Var, String str, Object[] objArr) {
        return new y2y0(g0y0Var, str, objArr);
    }

    /* JADX INFO: renamed from: n */
    public static vtx0 m14346n(vtx0 vtx0Var) {
        return vtx0Var.zza(vtx0Var.size() << 1);
    }

    /* JADX INFO: renamed from: o */
    public static <E> cvx0<E> m14347o(cvx0<E> cvx0Var) {
        return cvx0Var.zza(cvx0Var.size() << 1);
    }

    /* JADX INFO: renamed from: p */
    public static <T extends AbstractC2349u0<?, ?>> void m14348p(Class<T> cls, T t) {
        t.m14366z();
        zzc.put(cls, t);
    }

    /* JADX INFO: renamed from: q */
    public static final <T extends AbstractC2349u0<T, ?>> boolean m14349q(T t, boolean z) {
        byte bByteValue = ((Byte) t.mo13794k(e.f10263a, null, null)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo14457b = p2y0.m167229a().m167231c(t).mo14457b(t);
        if (z) {
            t.mo13794k(e.f10264b, zMo14457b ? t : null, null);
        }
        return zMo14457b;
    }

    /* JADX INFO: renamed from: v */
    public static tux0 m14350v() {
        return gtx0.m128005f();
    }

    /* JADX INFO: renamed from: w */
    public static vtx0 m14351w() {
        return zwx0.m220736f();
    }

    /* JADX INFO: renamed from: x */
    public static <E> cvx0<E> m14352x() {
        return k2y0.m144359h();
    }

    /* JADX INFO: renamed from: A */
    public final boolean m14353A() {
        return (this.zzd & Integer.MIN_VALUE) != 0;
    }

    @Override // p149l.g0y0
    /* JADX INFO: renamed from: P */
    public final int mo14354P() {
        return mo14251c(null);
    }

    @Override // p149l.g0y0
    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ c0y0 mo14355Q() {
        return (b) mo13794k(e.f10267e, null, null);
    }

    @Override // p149l.g0y0
    /* JADX INFO: renamed from: R */
    public final /* synthetic */ c0y0 mo14356R() {
        return ((b) mo13794k(e.f10267e, null, null)).m14375n(this);
    }

    @Override // p149l.g0y0
    /* JADX INFO: renamed from: S */
    public final void mo14357S(zzjc zzjcVar) throws IOException {
        p2y0.m167229a().m167231c(this).mo14456a(this, mqx0.m156008N(zzjcVar));
    }

    @Override // p149l.p0y0
    /* JADX INFO: renamed from: a */
    public final boolean mo14358a() {
        return m14349q(this, true);
    }

    @Override // p149l.p0y0
    /* JADX INFO: renamed from: b */
    public final /* synthetic */ g0y0 mo14359b() {
        return (AbstractC2349u0) mo13794k(e.f10268f, null, null);
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2337o0
    /* JADX INFO: renamed from: c */
    public final int mo14251c(i3y0 i3y0Var) {
        if (m14353A()) {
            int iM14361r = m14361r(i3y0Var);
            if (iM14361r >= 0) {
                return iM14361r;
            }
            f3c.m119257a("serialized size must be non-negative, was ", iM14361r);
            return 0;
        }
        if (mo14252e() != Integer.MAX_VALUE) {
            return mo14252e();
        }
        int iM14361r2 = m14361r(i3y0Var);
        mo14253f(iM14361r2);
        return iM14361r2;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2337o0
    /* JADX INFO: renamed from: e */
    public final int mo14252e() {
        return this.zzd & Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return p2y0.m167229a().m167231c(this).mo14461f(this, (AbstractC2349u0) obj);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC2337o0
    /* JADX INFO: renamed from: f */
    public final void mo14253f(int i) {
        if (i < 0) {
            f3c.m119257a("serialized size must be non-negative, was ", i);
        } else {
            this.zzd = (i & Api.BaseClientBuilder.API_PRIORITY_OTHER) | (this.zzd & Integer.MIN_VALUE);
        }
    }

    public int hashCode() {
        if (m14353A()) {
            return m14342h();
        }
        if (this.zza == 0) {
            this.zza = m14342h();
        }
        return this.zza;
    }

    /* JADX INFO: renamed from: i */
    public final <MessageType extends AbstractC2349u0<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType m14360i(MessageType messagetype) {
        return (BuilderType) m14362s().m14375n(messagetype);
    }

    /* JADX INFO: renamed from: k */
    public abstract Object mo13794k(int i, Object obj, Object obj2);

    /* JADX INFO: renamed from: r */
    public final int m14361r(i3y0<?> i3y0Var) {
        return i3y0Var == null ? p2y0.m167229a().m167231c(this).zza(this) : i3y0Var.zza(this);
    }

    /* JADX INFO: renamed from: s */
    public final <MessageType extends AbstractC2349u0<MessageType, BuilderType>, BuilderType extends b<MessageType, BuilderType>> BuilderType m14362s() {
        return (BuilderType) mo13794k(e.f10267e, null, null);
    }

    /* JADX INFO: renamed from: t */
    public final BuilderType m14363t() {
        return (BuilderType) ((b) mo13794k(e.f10267e, null, null)).m14375n(this);
    }

    public String toString() {
        return C2351v0.m14410a(this, super.toString());
    }

    /* JADX INFO: renamed from: u */
    public final MessageType m14364u() {
        return (MessageType) mo13794k(e.f10266d, null, null);
    }

    /* JADX INFO: renamed from: y */
    public final void m14365y() {
        p2y0.m167229a().m167231c(this).zzd(this);
        m14366z();
    }

    /* JADX INFO: renamed from: z */
    public final void m14366z() {
        this.zzd &= Api.BaseClientBuilder.API_PRIORITY_OTHER;
    }
}
