package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.AbstractC2349u0;
import com.google.android.gms.internal.measurement.C2322h;
import com.google.android.gms.internal.measurement.C2324i;
import com.google.android.gms.internal.measurement.C2326j;
import com.google.android.gms.internal.measurement.C2327j0;
import com.google.android.gms.internal.measurement.C2329k0;
import com.google.android.gms.internal.measurement.C2334n;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzfr$zza;
import com.google.android.gms.internal.measurement.zzkb;
import com.google.android.gms.measurement.internal.C2456e;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import org.checkerframework.dataflow.qual.Pure;
import p149l.a0s0;
import p149l.arx0;
import p149l.bey0;
import p149l.cjx0;
import p149l.dcr0;
import p149l.e01;
import p149l.e7y0;
import p149l.hay0;
import p149l.igr0;
import p149l.iyr0;
import p149l.jix0;
import p149l.jny0;
import p149l.kjx0;
import p149l.pay0;
import p149l.pdy0;
import p149l.pqy0;
import p149l.qow0;
import p149l.t2r0;
import p149l.tix0;
import p149l.u9r0;
import p149l.u9x0;
import p149l.uir0;
import p149l.xww0;
import p149l.zew;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C2456e extends hay0 implements dcr0 {

    /* JADX INFO: renamed from: d */
    public final Map<String, Map<String, String>> f10472d;

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public final Map<String, Set<String>> f10473e;

    /* JADX INFO: renamed from: f */
    @VisibleForTesting
    public final Map<String, Map<String, Boolean>> f10474f;

    /* JADX INFO: renamed from: g */
    @VisibleForTesting
    public final Map<String, Map<String, Boolean>> f10475g;

    /* JADX INFO: renamed from: h */
    public final Map<String, C2326j> f10476h;

    /* JADX INFO: renamed from: i */
    public final Map<String, Map<String, Integer>> f10477i;

    /* JADX INFO: renamed from: j */
    @VisibleForTesting
    public final zew<String, a0s0> f10478j;

    /* JADX INFO: renamed from: k */
    public final pqy0 f10479k;

    /* JADX INFO: renamed from: l */
    public final Map<String, String> f10480l;

    /* JADX INFO: renamed from: m */
    public final Map<String, String> f10481m;

    /* JADX INFO: renamed from: n */
    public final Map<String, String> f10482n;

    public C2456e(C2461j c2461j) {
        super(c2461j);
        this.f10472d = new e01();
        this.f10473e = new e01();
        this.f10474f = new e01();
        this.f10475g = new e01();
        this.f10476h = new e01();
        this.f10480l = new e01();
        this.f10481m = new e01();
        this.f10482n = new e01();
        this.f10477i = new e01();
        this.f10478j = new jix0(this, 20);
        this.f10479k = new tix0(this);
    }

    /* JADX INFO: renamed from: u */
    public static zzje.zza m15107u(zzfr$zza.zze zzeVar) {
        int i = cjx0.f81257b[zzeVar.ordinal()];
        if (i == 1) {
            return zzje.zza.AD_STORAGE;
        }
        if (i == 2) {
            return zzje.zza.ANALYTICS_STORAGE;
        }
        if (i == 3) {
            return zzje.zza.AD_USER_DATA;
        }
        if (i != 4) {
            return null;
        }
        return zzje.zza.AD_PERSONALIZATION;
    }

    /* JADX INFO: renamed from: w */
    public static Map<String, String> m15108w(C2326j c2326j) {
        e01 e01Var = new e01();
        if (c2326j != null) {
            for (C2334n c2334n : c2326j.m14219Y()) {
                e01Var.put(c2334n.m14242C(), c2334n.m14243D());
            }
        }
        return e01Var;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ a0s0 m15110y(C2456e c2456e, String str) {
        c2456e.m130251o();
        Preconditions.checkNotEmpty(str);
        if (!c2456e.m15127Q(str)) {
            return null;
        }
        if (!c2456e.f10476h.containsKey(str) || c2456e.f10476h.get(str) == null) {
            c2456e.m15137a0(str);
        } else {
            c2456e.m15111A(str, c2456e.f10476h.get(str));
        }
        return c2456e.f10478j.m218425i().get(str);
    }

    @WorkerThread
    /* JADX INFO: renamed from: A */
    public final void m15111A(final String str, C2326j c2326j) {
        if (c2326j.m14224h() == 0) {
            this.f10478j.m218422f(str);
            return;
        }
        zzj().m211416E().m123937b("EES programs found", Integer.valueOf(c2326j.m14224h()));
        C2329k0 c2329k0 = c2326j.m14218X().get(0);
        try {
            a0s0 a0s0Var = new a0s0();
            a0s0Var.m94479c("internal.remoteConfig", new Callable() { // from class: l.fix0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new i4y0("internal.remoteConfig", new qix0(this.f97731a, str));
                }
            });
            a0s0Var.m94479c("internal.appMetadata", new Callable() { // from class: l.bix0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final C2456e c2456e = this.f75845a;
                    final String str2 = str;
                    return new sty0("internal.appMetadata", new Callable() { // from class: l.thx0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C2456e c2456e2 = c2456e;
                            String str3 = str2;
                            thw0 thw0VarM136107G0 = c2456e2.mo15140k().m136107G0(str3);
                            HashMap map = new HashMap();
                            map.put("platform", "android");
                            map.put("package_name", str3);
                            map.put("gmp_version", 106000L);
                            if (thw0VarM136107G0 != null) {
                                String strM188999o = thw0VarM136107G0.m188999o();
                                if (strM188999o != null) {
                                    map.put("app_version", strM188999o);
                                }
                                map.put("app_version_int", Long.valueOf(thw0VarM136107G0.m188965U()));
                                map.put("dynamite_version", Long.valueOf(thw0VarM136107G0.m189014v0()));
                            }
                            return map;
                        }
                    });
                }
            });
            a0s0Var.m94479c("internal.logger", new Callable() { // from class: l.nix0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new ljy0(this.f139165a.f10479k);
                }
            });
            a0s0Var.m94478b(c2329k0);
            this.f10478j.m218421e(str, a0s0Var);
            zzj().m211416E().m123938c("EES program loaded for appId, activities", str, Integer.valueOf(c2329k0.m14237B().m14203h()));
            Iterator<C2327j0> it = c2329k0.m14237B().m14202D().iterator();
            while (it.hasNext()) {
                zzj().m211416E().m123937b("EES program activity", it.next().m14233C());
            }
        } catch (zzc unused) {
            zzj().m211412A().m123937b("Failed to load EES program. appId", str);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: B */
    public final boolean m15112B(String str, byte[] bArr, String str2, String str3) {
        m130251o();
        mo15092h();
        Preconditions.checkNotEmpty(str);
        C2326j.a aVarM14363t = m15146t(str, bArr).m14363t();
        if (aVarM14363t == null) {
            return false;
        }
        m15148z(str, aVarM14363t);
        m15111A(str, (C2326j) ((AbstractC2349u0) aVarM14363t.mo14369H()));
        this.f10476h.put(str, (C2326j) ((AbstractC2349u0) aVarM14363t.mo14369H()));
        this.f10480l.put(str, aVarM14363t.m14231z());
        this.f10481m.put(str, str2);
        this.f10482n.put(str, str3);
        this.f10472d.put(str, m15108w((C2326j) ((AbstractC2349u0) aVarM14363t.mo14369H())));
        mo15140k().m136130T(str, new ArrayList(aVarM14363t.m14225A()));
        try {
            aVarM14363t.m14230y();
            bArr = ((C2326j) ((AbstractC2349u0) aVarM14363t.mo14369H())).m14254g();
        } catch (RuntimeException e) {
            zzj().m211417F().m123938c("Unable to serialize reduced-size config. Storing full config instead. appId", xww0.m211405p(str), e);
        }
        igr0 igr0VarMo15140k = mo15140k();
        Preconditions.checkNotEmpty(str);
        igr0VarMo15140k.mo15092h();
        igr0VarMo15140k.m130251o();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (igr0VarMo15140k.m136166v().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                igr0VarMo15140k.zzj().m211412A().m123937b("Failed to update remote config (got 0). appId", xww0.m211405p(str));
            }
        } catch (SQLiteException e2) {
            igr0VarMo15140k.zzj().m211412A().m123938c("Error storing remote config. appId", xww0.m211405p(str), e2);
        }
        this.f10476h.put(str, (C2326j) ((AbstractC2349u0) aVarM14363t.mo14369H()));
        return true;
    }

    @WorkerThread
    /* JADX INFO: renamed from: C */
    public final int m15113C(String str, String str2) {
        Integer num;
        mo15092h();
        m15137a0(str);
        Map<String, Integer> map = this.f10477i.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    @WorkerThread
    /* JADX INFO: renamed from: D */
    public final zzfr$zza m15114D(String str) {
        mo15092h();
        m15137a0(str);
        C2326j c2326jM15116F = m15116F(str);
        if (c2326jM15116F == null || !c2326jM15116F.m14220Z()) {
            return null;
        }
        return c2326jM15116F.m14212I();
    }

    @WorkerThread
    /* JADX INFO: renamed from: E */
    public final zzje.zza m15115E(String str, zzje.zza zzaVar) {
        mo15092h();
        m15137a0(str);
        zzfr$zza zzfr_zzaM15114D = m15114D(str);
        if (zzfr_zzaM15114D == null) {
            return null;
        }
        for (zzfr$zza.C2364c c2364c : zzfr_zzaM15114D.m14580G()) {
            if (zzaVar == m15107u(c2364c.m14589D())) {
                return m15107u(c2364c.m14588C());
            }
        }
        return null;
    }

    @WorkerThread
    /* JADX INFO: renamed from: F */
    public final C2326j m15116F(String str) {
        m130251o();
        mo15092h();
        Preconditions.checkNotEmpty(str);
        m15137a0(str);
        return this.f10476h.get(str);
    }

    @WorkerThread
    /* JADX INFO: renamed from: G */
    public final boolean m15117G(String str, zzje.zza zzaVar) {
        mo15092h();
        m15137a0(str);
        zzfr$zza zzfr_zzaM15114D = m15114D(str);
        if (zzfr_zzaM15114D == null) {
            return false;
        }
        for (zzfr$zza.C2362a c2362a : zzfr_zzaM15114D.m14579E()) {
            if (zzaVar == m15107u(c2362a.m14586D())) {
                if (c2362a.m14585C() == zzfr$zza.zzd.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    @WorkerThread
    /* JADX INFO: renamed from: H */
    public final boolean m15118H(String str, String str2) {
        Boolean bool;
        mo15092h();
        m15137a0(str);
        if ("ecommerce_purchase".equals(str2) || FirebaseAnalytics.Event.PURCHASE.equals(str2) || FirebaseAnalytics.Event.REFUND.equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f10475g.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @WorkerThread
    /* JADX INFO: renamed from: I */
    public final String m15119I(String str) {
        mo15092h();
        return this.f10482n.get(str);
    }

    @WorkerThread
    /* JADX INFO: renamed from: J */
    public final boolean m15120J(String str, String str2) {
        Boolean bool;
        mo15092h();
        m15137a0(str);
        if (m15128R(str) && bey0.m101426D0(str2)) {
            return true;
        }
        if (m15130T(str) && bey0.m101427E0(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f10474f.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @WorkerThread
    /* JADX INFO: renamed from: K */
    public final String m15121K(String str) {
        mo15092h();
        return this.f10481m.get(str);
    }

    @WorkerThread
    /* JADX INFO: renamed from: L */
    public final String m15122L(String str) {
        mo15092h();
        m15137a0(str);
        return this.f10480l.get(str);
    }

    @WorkerThread
    /* JADX INFO: renamed from: M */
    public final Set<String> m15123M(String str) {
        mo15092h();
        m15137a0(str);
        return this.f10473e.get(str);
    }

    @WorkerThread
    /* JADX INFO: renamed from: N */
    public final SortedSet<String> m15124N(String str) {
        mo15092h();
        m15137a0(str);
        TreeSet treeSet = new TreeSet();
        zzfr$zza zzfr_zzaM15114D = m15114D(str);
        if (zzfr_zzaM15114D != null) {
            Iterator<zzfr$zza.C2365d> it = zzfr_zzaM15114D.m14578D().iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().m14591C());
            }
        }
        return treeSet;
    }

    @WorkerThread
    /* JADX INFO: renamed from: O */
    public final void m15125O(String str) {
        mo15092h();
        this.f10481m.put(str, null);
    }

    @WorkerThread
    /* JADX INFO: renamed from: P */
    public final void m15126P(String str) {
        mo15092h();
        this.f10476h.remove(str);
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m15127Q(String str) {
        C2326j c2326j;
        return (TextUtils.isEmpty(str) || (c2326j = this.f10476h.get(str)) == null || c2326j.m14224h() == 0) ? false : true;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m15128R(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    @WorkerThread
    /* JADX INFO: renamed from: S */
    public final boolean m15129S(String str) {
        mo15092h();
        m15137a0(str);
        zzfr$zza zzfr_zzaM15114D = m15114D(str);
        return zzfr_zzaM15114D == null || !zzfr_zzaM15114D.m14583L() || zzfr_zzaM15114D.m14582K();
    }

    /* JADX INFO: renamed from: T */
    public final boolean m15130T(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }

    @WorkerThread
    /* JADX INFO: renamed from: U */
    public final boolean m15131U(String str) {
        mo15092h();
        m15137a0(str);
        return this.f10473e.get(str) != null && this.f10473e.get(str).contains("app_instance_id");
    }

    @WorkerThread
    /* JADX INFO: renamed from: V */
    public final boolean m15132V(String str) {
        mo15092h();
        m15137a0(str);
        if (this.f10473e.get(str) != null) {
            return this.f10473e.get(str).contains("device_model") || this.f10473e.get(str).contains("device_info");
        }
        return false;
    }

    @WorkerThread
    /* JADX INFO: renamed from: W */
    public final boolean m15133W(String str) {
        mo15092h();
        m15137a0(str);
        return this.f10473e.get(str) != null && this.f10473e.get(str).contains("enhanced_user_id");
    }

    @WorkerThread
    /* JADX INFO: renamed from: X */
    public final boolean m15134X(String str) {
        mo15092h();
        m15137a0(str);
        return this.f10473e.get(str) != null && this.f10473e.get(str).contains("google_signals");
    }

    @WorkerThread
    /* JADX INFO: renamed from: Y */
    public final boolean m15135Y(String str) {
        mo15092h();
        m15137a0(str);
        if (this.f10473e.get(str) != null) {
            return this.f10473e.get(str).contains("os_version") || this.f10473e.get(str).contains("device_info");
        }
        return false;
    }

    @WorkerThread
    /* JADX INFO: renamed from: Z */
    public final boolean m15136Z(String str) {
        mo15092h();
        m15137a0(str);
        return this.f10473e.get(str) != null && this.f10473e.get(str).contains("user_id");
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ u9r0 mo15085a() {
        return super.mo15085a();
    }

    @WorkerThread
    /* JADX INFO: renamed from: a0 */
    public final void m15137a0(String str) {
        m130251o();
        mo15092h();
        Preconditions.checkNotEmpty(str);
        if (this.f10476h.get(str) == null) {
            uir0 uir0VarM136113J0 = mo15140k().m136113J0(str);
            if (uir0VarM136113J0 != null) {
                C2326j.a aVarM14363t = m15146t(str, uir0VarM136113J0.f176684a).m14363t();
                m15148z(str, aVarM14363t);
                this.f10472d.put(str, m15108w((C2326j) ((AbstractC2349u0) aVarM14363t.mo14369H())));
                this.f10476h.put(str, (C2326j) ((AbstractC2349u0) aVarM14363t.mo14369H()));
                m15111A(str, (C2326j) ((AbstractC2349u0) aVarM14363t.mo14369H()));
                this.f10480l.put(str, aVarM14363t.m14231z());
                this.f10481m.put(str, uir0VarM136113J0.f176685b);
                this.f10482n.put(str, uir0VarM136113J0.f176686c);
                return;
            }
            this.f10472d.put(str, null);
            this.f10474f.put(str, null);
            this.f10473e.put(str, null);
            this.f10475g.put(str, null);
            this.f10476h.put(str, null);
            this.f10480l.put(str, null);
            this.f10481m.put(str, null);
            this.f10482n.put(str, null);
            this.f10477i.put(str, null);
        }
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ iyr0 mo15086b() {
        return super.mo15086b();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ qow0 mo15087c() {
        return super.mo15087c();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ u9x0 mo15088d() {
        return super.mo15088d();
    }

    @Override // p149l.spx0
    @Pure
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ bey0 mo15089e() {
        return super.mo15089e();
    }

    @Override // p149l.spx0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo15090f() {
        super.mo15090f();
    }

    @Override // p149l.spx0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ void mo15091g() {
        super.mo15091g();
    }

    @Override // p149l.spx0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo15092h() {
        super.mo15092h();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ pdy0 mo15138i() {
        return super.mo15138i();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ jny0 mo15139j() {
        return super.mo15139j();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ igr0 mo15140k() {
        return super.mo15140k();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ C2456e mo15141l() {
        return super.mo15141l();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ e7y0 mo15142m() {
        return super.mo15142m();
    }

    @Override // p149l.kay0
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ pay0 mo15143n() {
        return super.mo15143n();
    }

    @Override // p149l.hay0
    /* JADX INFO: renamed from: r */
    public final boolean mo15144r() {
        return false;
    }

    @WorkerThread
    /* JADX INFO: renamed from: s */
    public final long m15145s(String str) {
        String strZza = zza(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(strZza)) {
            return 0L;
        }
        try {
            return Long.parseLong(strZza);
        } catch (NumberFormatException e) {
            zzj().m211417F().m123938c("Unable to parse timezone offset. appId", xww0.m211405p(str), e);
            return 0L;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: t */
    public final C2326j m15146t(String str, byte[] bArr) {
        if (bArr == null) {
            return C2326j.m14208M();
        }
        try {
            C2326j c2326j = (C2326j) ((AbstractC2349u0) ((C2326j.a) pdy0.m168454K(C2326j.m14206K(), bArr)).mo14369H());
            zzj().m211416E().m123938c("Parsed config. version, gmp_app_id", c2326j.m14223c0() ? Long.valueOf(c2326j.m14211G()) : null, c2326j.m14221a0() ? c2326j.m14214T() : null);
            return c2326j;
        } catch (zzkb e) {
            zzj().m211417F().m123938c("Unable to merge remote config. appId", xww0.m211405p(str), e);
            return C2326j.m14208M();
        } catch (RuntimeException e2) {
            zzj().m211417F().m123938c("Unable to merge remote config. appId", xww0.m211405p(str), e2);
            return C2326j.m14208M();
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: v */
    public final zzjh m15147v(String str, zzje.zza zzaVar) {
        mo15092h();
        m15137a0(str);
        zzfr$zza zzfr_zzaM15114D = m15114D(str);
        if (zzfr_zzaM15114D == null) {
            return zzjh.UNINITIALIZED;
        }
        for (zzfr$zza.C2362a c2362a : zzfr_zzaM15114D.m14581I()) {
            if (m15107u(c2362a.m14586D()) == zzaVar) {
                int i = cjx0.f81258c[c2362a.m14585C().ordinal()];
                if (i != 1) {
                    return i != 2 ? zzjh.UNINITIALIZED : zzjh.GRANTED;
                }
                return zzjh.DENIED;
            }
        }
        return zzjh.UNINITIALIZED;
    }

    /* JADX INFO: renamed from: z */
    public final void m15148z(String str, C2326j.a aVar) {
        HashSet hashSet = new HashSet();
        e01 e01Var = new e01();
        e01 e01Var2 = new e01();
        e01 e01Var3 = new e01();
        if (aVar != null) {
            Iterator<C2322h> it = aVar.m14226B().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().m14182C());
            }
            for (int i = 0; i < aVar.m14227v(); i++) {
                C2324i.a aVarM14363t = aVar.m14228w(i).m14363t();
                if (aVarM14363t.m14197x().isEmpty()) {
                    zzj().m211417F().m123936a("EventConfig contained null event name");
                } else {
                    String strM14197x = aVarM14363t.m14197x();
                    String strM98576b = arx0.m98576b(aVarM14363t.m14197x());
                    if (!TextUtils.isEmpty(strM98576b)) {
                        aVarM14363t = aVarM14363t.m14196w(strM98576b);
                        aVar.m14229x(i, aVarM14363t);
                    }
                    if (aVarM14363t.m14192A() && aVarM14363t.m14198y()) {
                        e01Var.put(strM14197x, Boolean.TRUE);
                    }
                    if (aVarM14363t.m14193B() && aVarM14363t.m14199z()) {
                        e01Var2.put(aVarM14363t.m14197x(), Boolean.TRUE);
                    }
                    if (aVarM14363t.m14194C()) {
                        if (aVarM14363t.m14195v() < 2 || aVarM14363t.m14195v() > 65535) {
                            zzj().m211417F().m123938c("Invalid sampling rate. Event name, sample rate", aVarM14363t.m14197x(), Integer.valueOf(aVarM14363t.m14195v()));
                        } else {
                            e01Var3.put(aVarM14363t.m14197x(), Integer.valueOf(aVarM14363t.m14195v()));
                        }
                    }
                }
            }
        }
        this.f10473e.put(str, hashSet);
        this.f10474f.put(str, e01Var);
        this.f10475g.put(str, e01Var2);
        this.f10477i.put(str, e01Var3);
    }

    @Override // p149l.dcr0
    @WorkerThread
    public final String zza(String str, String str2) {
        mo15092h();
        m15137a0(str);
        Map<String, String> map = this.f10472d.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ t2r0 zzd() {
        return super.zzd();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ xww0 zzj() {
        return super.zzj();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ kjx0 zzl() {
        return super.zzl();
    }

    @Override // p149l.spx0, p149l.bqx0
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
