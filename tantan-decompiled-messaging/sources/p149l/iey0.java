package p149l;

import android.util.Base64;
import androidx.annotation.Nullable;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;

/* JADX INFO: loaded from: classes6.dex */
public final class iey0 implements qey0 {

    /* JADX INFO: renamed from: i */
    public static final zfw0 f112935i = new zfw0() { // from class: l.eey0
        @Override // p149l.zfw0
        public final Object zza() {
            return iey0.m135825m();
        }
    };

    /* JADX INFO: renamed from: j */
    public static final Random f112936j = new Random();

    /* JADX INFO: renamed from: a */
    public final qpt0 f112937a;

    /* JADX INFO: renamed from: b */
    public final bnt0 f112938b;

    /* JADX INFO: renamed from: c */
    public final HashMap f112939c;

    /* JADX INFO: renamed from: d */
    public final zfw0 f112940d;

    /* JADX INFO: renamed from: e */
    public oey0 f112941e;

    /* JADX INFO: renamed from: f */
    public xqt0 f112942f;

    /* JADX INFO: renamed from: g */
    @Nullable
    public String f112943g;

    /* JADX INFO: renamed from: h */
    public long f112944h;

    public iey0(zfw0 zfw0Var) {
        this.f112940d = zfw0Var;
        this.f112937a = new qpt0();
        this.f112938b = new bnt0();
        this.f112939c = new HashMap();
        this.f112942f = xqt0.f194042a;
        this.f112944h = -1L;
    }

    /* JADX INFO: renamed from: m */
    public static String m135825m() {
        byte[] bArr = new byte[12];
        f112936j.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    @Override // p149l.qey0
    /* JADX INFO: renamed from: a */
    public final synchronized void mo135826a(s6y0 s6y0Var) {
        oey0 oey0Var;
        try {
            String str = this.f112943g;
            if (str != null) {
                gey0 gey0Var = (gey0) this.f112939c.get(str);
                if (gey0Var == null) {
                    throw null;
                }
                m135834n(gey0Var);
            }
            Iterator it = this.f112939c.values().iterator();
            while (it.hasNext()) {
                gey0 gey0Var2 = (gey0) it.next();
                it.remove();
                if (gey0Var2.f102316e && (oey0Var = this.f112941e) != null) {
                    oey0Var.mo154352i(s6y0Var, gey0Var2.f102312a, false);
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x003f A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003f, B:23:0x004b, B:24:0x0051, B:26:0x0056, B:28:0x005c, B:30:0x0073, B:31:0x009b, B:33:0x00a1, B:34:0x00a7, B:36:0x00b3, B:38:0x00b9, B:44:0x00ca), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:23:0x004b A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003f, B:23:0x004b, B:24:0x0051, B:26:0x0056, B:28:0x005c, B:30:0x0073, B:31:0x009b, B:33:0x00a1, B:34:0x00a7, B:36:0x00b3, B:38:0x00b9, B:44:0x00ca), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0073 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003f, B:23:0x004b, B:24:0x0051, B:26:0x0056, B:28:0x005c, B:30:0x0073, B:31:0x009b, B:33:0x00a1, B:34:0x00a7, B:36:0x00b3, B:38:0x00b9, B:44:0x00ca), top: B:47:0x0001 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a1 A[Catch: all -> 0x003c, TryCatch #0 {all -> 0x003c, blocks: (B:3:0x0001, B:5:0x0005, B:8:0x000f, B:10:0x0013, B:12:0x001d, B:14:0x0029, B:16:0x0033, B:21:0x003f, B:23:0x004b, B:24:0x0051, B:26:0x0056, B:28:0x005c, B:30:0x0073, B:31:0x009b, B:33:0x00a1, B:34:0x00a7, B:36:0x00b3, B:38:0x00b9, B:44:0x00ca), top: B:47:0x0001 }] */
    @Override // p149l.qey0
    /* JADX INFO: renamed from: b */
    public final synchronized void mo135827b(s6y0 s6y0Var) {
        gey0 gey0VarM135833l;
        eqy0 eqy0Var;
        gey0 gey0VarM135833l2;
        gey0 gey0Var;
        try {
            if (this.f112941e == null) {
                throw null;
            }
            if (!s6y0Var.f162866b.m210615o()) {
                eqy0 eqy0Var2 = s6y0Var.f162868d;
                if (eqy0Var2 == null) {
                    gey0VarM135833l = m135833l(s6y0Var.f162867c, s6y0Var.f162868d);
                    if (this.f112943g == null) {
                        this.f112943g = gey0VarM135833l.f102312a;
                    }
                    eqy0Var = s6y0Var.f162868d;
                    if (eqy0Var != null) {
                        gey0VarM135833l2 = m135833l(s6y0Var.f162867c, new eqy0(eqy0Var.f92867a, eqy0Var.f92870d, eqy0Var.f92868b));
                        if (!gey0VarM135833l2.f102316e) {
                            gey0VarM135833l2.f102316e = true;
                            s6y0Var.f162866b.mo112558n(s6y0Var.f162868d.f92867a, this.f112938b);
                            this.f112938b.m102868i(s6y0Var.f162868d.f92868b);
                            Math.max(0L, ggw0.m126052I(0L) + ggw0.m126052I(0L));
                            String unused = gey0VarM135833l2.f102312a;
                        }
                    }
                    if (!gey0VarM135833l.f102316e) {
                        gey0VarM135833l.f102316e = true;
                        String unused2 = gey0VarM135833l.f102312a;
                    }
                    if (gey0VarM135833l.f102312a.equals(this.f112943g)) {
                        gey0VarM135833l.f102317f = true;
                        this.f112941e.mo154354k(s6y0Var, gey0VarM135833l.f102312a);
                    }
                } else if (eqy0Var2.f92870d >= m135832k() && ((gey0Var = (gey0) this.f112939c.get(this.f112943g)) == null || gey0Var.f102314c != -1 || gey0Var.f102313b == s6y0Var.f162867c)) {
                    gey0VarM135833l = m135833l(s6y0Var.f162867c, s6y0Var.f162868d);
                    if (this.f112943g == null) {
                        this.f112943g = gey0VarM135833l.f102312a;
                    }
                    eqy0Var = s6y0Var.f162868d;
                    if (eqy0Var != null && eqy0Var.m117807b()) {
                        gey0VarM135833l2 = m135833l(s6y0Var.f162867c, new eqy0(eqy0Var.f92867a, eqy0Var.f92870d, eqy0Var.f92868b));
                        if (!gey0VarM135833l2.f102316e) {
                            gey0VarM135833l2.f102316e = true;
                            s6y0Var.f162866b.mo112558n(s6y0Var.f162868d.f92867a, this.f112938b);
                            this.f112938b.m102868i(s6y0Var.f162868d.f92868b);
                            Math.max(0L, ggw0.m126052I(0L) + ggw0.m126052I(0L));
                            String unused3 = gey0VarM135833l2.f102312a;
                        }
                    }
                    if (!gey0VarM135833l.f102316e) {
                        gey0VarM135833l.f102316e = true;
                        String unused4 = gey0VarM135833l.f102312a;
                    }
                    if (gey0VarM135833l.f102312a.equals(this.f112943g) && !gey0VarM135833l.f102317f) {
                        gey0VarM135833l.f102317f = true;
                        this.f112941e.mo154354k(s6y0Var, gey0VarM135833l.f102312a);
                    }
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.qey0
    /* JADX INFO: renamed from: c */
    public final void mo135828c(oey0 oey0Var) {
        this.f112941e = oey0Var;
    }

    @Override // p149l.qey0
    /* JADX INFO: renamed from: d */
    public final synchronized void mo135829d(s6y0 s6y0Var) {
        try {
            if (this.f112941e == null) {
                throw null;
            }
            xqt0 xqt0Var = this.f112942f;
            this.f112942f = s6y0Var.f162866b;
            Iterator it = this.f112939c.values().iterator();
            while (it.hasNext()) {
                gey0 gey0Var = (gey0) it.next();
                if (!gey0Var.m125871l(xqt0Var, this.f112942f) || gey0Var.m125870k(s6y0Var)) {
                    it.remove();
                    if (gey0Var.f102316e) {
                        if (gey0Var.f102312a.equals(this.f112943g)) {
                            m135834n(gey0Var);
                        }
                        this.f112941e.mo154352i(s6y0Var, gey0Var.f102312a, false);
                    }
                }
            }
            m135835o(s6y0Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // p149l.qey0
    /* JADX INFO: renamed from: e */
    public final synchronized String mo135830e(xqt0 xqt0Var, eqy0 eqy0Var) {
        return m135833l(xqt0Var.mo112558n(eqy0Var.f92867a, this.f112938b).f76445c, eqy0Var).f102312a;
    }

    @Override // p149l.qey0
    /* JADX INFO: renamed from: f */
    public final synchronized void mo135831f(s6y0 s6y0Var, int i) {
        try {
            if (this.f112941e == null) {
                throw null;
            }
            Iterator it = this.f112939c.values().iterator();
            while (it.hasNext()) {
                gey0 gey0Var = (gey0) it.next();
                if (gey0Var.m125870k(s6y0Var)) {
                    it.remove();
                    if (gey0Var.f102316e) {
                        boolean zEquals = gey0Var.f102312a.equals(this.f112943g);
                        boolean z = false;
                        if (i == 0 && zEquals && gey0Var.f102317f) {
                            z = true;
                        }
                        if (zEquals) {
                            m135834n(gey0Var);
                        }
                        this.f112941e.mo154352i(s6y0Var, gey0Var.f102312a, z);
                    }
                }
            }
            m135835o(s6y0Var);
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: k */
    public final long m135832k() {
        gey0 gey0Var = (gey0) this.f112939c.get(this.f112943g);
        return (gey0Var == null || gey0Var.f102314c == -1) ? this.f112944h + 1 : gey0Var.f102314c;
    }

    /* JADX INFO: renamed from: l */
    public final gey0 m135833l(int i, @Nullable eqy0 eqy0Var) {
        long j = Long.MAX_VALUE;
        gey0 gey0Var = null;
        for (gey0 gey0Var2 : this.f112939c.values()) {
            gey0Var2.m125868g(i, eqy0Var);
            if (gey0Var2.m125869j(i, eqy0Var)) {
                long j2 = gey0Var2.f102314c;
                if (j2 == -1 || j2 < j) {
                    gey0Var = gey0Var2;
                    j = j2;
                } else if (j2 == j) {
                    int i2 = ggw0.f102568a;
                    if (gey0Var.f102315d != null && gey0Var2.f102315d != null) {
                        gey0Var = gey0Var2;
                    }
                }
            }
        }
        if (gey0Var != null) {
            return gey0Var;
        }
        String strM135825m = m135825m();
        gey0 gey0Var3 = new gey0(this, strM135825m, i, eqy0Var);
        this.f112939c.put(strM135825m, gey0Var3);
        return gey0Var3;
    }

    /* JADX INFO: renamed from: n */
    public final void m135834n(gey0 gey0Var) {
        if (gey0Var.f102314c != -1) {
            this.f112944h = gey0Var.f102314c;
        }
        this.f112943g = null;
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    /* JADX INFO: renamed from: o */
    public final void m135835o(s6y0 s6y0Var) {
        if (s6y0Var.f162866b.m210615o()) {
            String str = this.f112943g;
            if (str != null) {
                gey0 gey0Var = (gey0) this.f112939c.get(str);
                gey0Var.getClass();
                m135834n(gey0Var);
                return;
            }
            return;
        }
        gey0 gey0Var2 = (gey0) this.f112939c.get(this.f112943g);
        gey0 gey0VarM135833l = m135833l(s6y0Var.f162867c, s6y0Var.f162868d);
        this.f112943g = gey0VarM135833l.f102312a;
        mo135827b(s6y0Var);
        eqy0 eqy0Var = s6y0Var.f162868d;
        if (eqy0Var == null || !eqy0Var.m117807b()) {
            return;
        }
        if (gey0Var2 != null) {
            if (gey0Var2.f102314c == eqy0Var.f92870d && gey0Var2.f102315d != null && gey0Var2.f102315d.f92868b == s6y0Var.f162868d.f92868b && gey0Var2.f102315d.f92869c == s6y0Var.f162868d.f92869c) {
                return;
            }
        }
        eqy0 eqy0Var2 = s6y0Var.f162868d;
        String unused = m135833l(s6y0Var.f162867c, new eqy0(eqy0Var2.f92867a, eqy0Var2.f92870d)).f102312a;
        String unused2 = gey0VarM135833l.f102312a;
    }

    @Override // p149l.qey0
    @Nullable
    public final synchronized String zze() {
        return this.f112943g;
    }

    public iey0() {
        throw null;
    }
}
