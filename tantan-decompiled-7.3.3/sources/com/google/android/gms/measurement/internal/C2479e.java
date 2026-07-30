package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import androidx.annotation.VisibleForTesting;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.internal.measurement.AbstractC2372u0;
import com.google.android.gms.internal.measurement.C2345h;
import com.google.android.gms.internal.measurement.C2347i;
import com.google.android.gms.internal.measurement.C2349j;
import com.google.android.gms.internal.measurement.C2350j0;
import com.google.android.gms.internal.measurement.C2352k0;
import com.google.android.gms.internal.measurement.C2357n;
import com.google.android.gms.internal.measurement.zzc;
import com.google.android.gms.internal.measurement.zzfr$zza;
import com.google.android.gms.internal.measurement.zzkb;
import com.google.android.gms.measurement.internal.C2479e;
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
import p153l.ajr0;
import p153l.ajx0;
import p153l.asr0;
import p153l.d6x0;
import p153l.g0y0;
import p153l.g9s0;
import p153l.hny0;
import p153l.isx0;
import p153l.jlr0;
import p153l.kgy0;
import p153l.l01;
import p153l.njy0;
import p153l.o7s0;
import p153l.opr0;
import p153l.prx0;
import p153l.pwy0;
import p153l.qsx0;
import p153l.vjy0;
import p153l.vmy0;
import p153l.vzy0;
import p153l.wxw0;
import p153l.xgw;
import p153l.zbr0;
import p153l.zrx0;

/* JADX INFO: renamed from: com.google.android.gms.measurement.internal.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C2479e extends njy0 implements jlr0 {

    /* JADX INFO: renamed from: d */
    public final Map<String, Map<String, String>> f10509d;

    /* JADX INFO: renamed from: e */
    @VisibleForTesting
    public final Map<String, Set<String>> f10510e;

    /* JADX INFO: renamed from: f */
    @VisibleForTesting
    public final Map<String, Map<String, Boolean>> f10511f;

    /* JADX INFO: renamed from: g */
    @VisibleForTesting
    public final Map<String, Map<String, Boolean>> f10512g;

    /* JADX INFO: renamed from: h */
    public final Map<String, C2349j> f10513h;

    /* JADX INFO: renamed from: i */
    public final Map<String, Map<String, Integer>> f10514i;

    /* JADX INFO: renamed from: j */
    @VisibleForTesting
    public final xgw<String, g9s0> f10515j;

    /* JADX INFO: renamed from: k */
    public final vzy0 f10516k;

    /* JADX INFO: renamed from: l */
    public final Map<String, String> f10517l;

    /* JADX INFO: renamed from: m */
    public final Map<String, String> f10518m;

    /* JADX INFO: renamed from: n */
    public final Map<String, String> f10519n;

    public C2479e(C2484j c2484j) {
        super(c2484j);
        this.f10509d = new l01();
        this.f10510e = new l01();
        this.f10511f = new l01();
        this.f10512g = new l01();
        this.f10513h = new l01();
        this.f10517l = new l01();
        this.f10518m = new l01();
        this.f10519n = new l01();
        this.f10514i = new l01();
        this.f10515j = new prx0(this, 20);
        this.f10516k = new zrx0(this);
    }

    /* JADX INFO: renamed from: u */
    public static zzje.zza m15161u(zzfr$zza.zze zzeVar) {
        int i = isx0.f116776b[zzeVar.ordinal()];
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
    public static Map<String, String> m15162w(C2349j c2349j) {
        l01 l01Var = new l01();
        if (c2349j != null) {
            for (C2357n c2357n : c2349j.m14273Y()) {
                l01Var.put(c2357n.m14296C(), c2357n.m14297D());
            }
        }
        return l01Var;
    }

    /* JADX INFO: renamed from: y */
    public static /* synthetic */ g9s0 m15164y(C2479e c2479e, String str) {
        c2479e.m163482o();
        Preconditions.checkNotEmpty(str);
        if (!c2479e.m15181Q(str)) {
            return null;
        }
        if (!c2479e.f10513h.containsKey(str) || c2479e.f10513h.get(str) == null) {
            c2479e.m15191a0(str);
        } else {
            c2479e.m15165A(str, c2479e.f10513h.get(str));
        }
        return c2479e.f10515j.m210959i().get(str);
    }

    @WorkerThread
    /* JADX INFO: renamed from: A */
    public final void m15165A(final String str, C2349j c2349j) {
        if (c2349j.m14278h() == 0) {
            this.f10515j.m210956f(str);
            return;
        }
        zzj().m114562E().m153301b("EES programs found", Integer.valueOf(c2349j.m14278h()));
        C2352k0 c2352k0 = c2349j.m14272X().get(0);
        try {
            g9s0 g9s0Var = new g9s0();
            g9s0Var.m129606c("internal.remoteConfig", new Callable() { // from class: l.lrx0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new ody0("internal.remoteConfig", new wrx0(this.f133375a, str));
                }
            });
            g9s0Var.m129606c("internal.appMetadata", new Callable() { // from class: l.hrx0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    final C2479e c2479e = this.f111393a;
                    final String str2 = str;
                    return new y2z0("internal.appMetadata", new Callable() { // from class: l.zqx0
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            C2479e c2479e2 = c2479e;
                            String str3 = str2;
                            zqw0 zqw0VarM168706G0 = c2479e2.mo15194k().m168706G0(str3);
                            HashMap map = new HashMap();
                            map.put("platform", "android");
                            map.put("package_name", str3);
                            map.put("gmp_version", 106000L);
                            if (zqw0VarM168706G0 != null) {
                                String strM221127o = zqw0VarM168706G0.m221127o();
                                if (strM221127o != null) {
                                    map.put("app_version", strM221127o);
                                }
                                map.put("app_version_int", Long.valueOf(zqw0VarM168706G0.m221093U()));
                                map.put("dynamite_version", Long.valueOf(zqw0VarM168706G0.m221142v0()));
                            }
                            return map;
                        }
                    });
                }
            });
            g9s0Var.m129606c("internal.logger", new Callable() { // from class: l.trx0
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return new rsy0(this.f175951a.f10516k);
                }
            });
            g9s0Var.m129605b(c2352k0);
            this.f10515j.m210955e(str, g9s0Var);
            zzj().m114562E().m153302c("EES program loaded for appId, activities", str, Integer.valueOf(c2352k0.m14291B().m14257h()));
            Iterator<C2350j0> it = c2352k0.m14291B().m14256D().iterator();
            while (it.hasNext()) {
                zzj().m114562E().m153301b("EES program activity", it.next().m14287C());
            }
        } catch (zzc unused) {
            zzj().m114558A().m153301b("Failed to load EES program. appId", str);
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: B */
    public final boolean m15166B(String str, byte[] bArr, String str2, String str3) {
        m163482o();
        mo15146h();
        Preconditions.checkNotEmpty(str);
        C2349j.a aVarM14417t = m15200t(str, bArr).m14417t();
        if (aVarM14417t == null) {
            return false;
        }
        m15202z(str, aVarM14417t);
        m15165A(str, (C2349j) ((AbstractC2372u0) aVarM14417t.mo14423H()));
        this.f10513h.put(str, (C2349j) ((AbstractC2372u0) aVarM14417t.mo14423H()));
        this.f10517l.put(str, aVarM14417t.m14285z());
        this.f10518m.put(str, str2);
        this.f10519n.put(str, str3);
        this.f10509d.put(str, m15162w((C2349j) ((AbstractC2372u0) aVarM14417t.mo14423H())));
        mo15194k().m168729T(str, new ArrayList(aVarM14417t.m14279A()));
        try {
            aVarM14417t.m14284y();
            bArr = ((C2349j) ((AbstractC2372u0) aVarM14417t.mo14423H())).m14308g();
        } catch (RuntimeException e) {
            zzj().m114563F().m153302c("Unable to serialize reduced-size config. Storing full config instead. appId", d6x0.m114551p(str), e);
        }
        opr0 opr0VarMo15194k = mo15194k();
        Preconditions.checkNotEmpty(str);
        opr0VarMo15194k.mo15146h();
        opr0VarMo15194k.m163482o();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (opr0VarMo15194k.m168765v().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                opr0VarMo15194k.zzj().m114558A().m153301b("Failed to update remote config (got 0). appId", d6x0.m114551p(str));
            }
        } catch (SQLiteException e2) {
            opr0VarMo15194k.zzj().m114558A().m153302c("Error storing remote config. appId", d6x0.m114551p(str), e2);
        }
        this.f10513h.put(str, (C2349j) ((AbstractC2372u0) aVarM14417t.mo14423H()));
        return true;
    }

    @WorkerThread
    /* JADX INFO: renamed from: C */
    public final int m15167C(String str, String str2) {
        Integer num;
        mo15146h();
        m15191a0(str);
        Map<String, Integer> map = this.f10514i.get(str);
        if (map == null || (num = map.get(str2)) == null) {
            return 1;
        }
        return num.intValue();
    }

    @WorkerThread
    /* JADX INFO: renamed from: D */
    public final zzfr$zza m15168D(String str) {
        mo15146h();
        m15191a0(str);
        C2349j c2349jM15170F = m15170F(str);
        if (c2349jM15170F == null || !c2349jM15170F.m14274Z()) {
            return null;
        }
        return c2349jM15170F.m14266I();
    }

    @WorkerThread
    /* JADX INFO: renamed from: E */
    public final zzje.zza m15169E(String str, zzje.zza zzaVar) {
        mo15146h();
        m15191a0(str);
        zzfr$zza zzfr_zzaM15168D = m15168D(str);
        if (zzfr_zzaM15168D == null) {
            return null;
        }
        for (zzfr$zza.C2387c c2387c : zzfr_zzaM15168D.m14634G()) {
            if (zzaVar == m15161u(c2387c.m14643D())) {
                return m15161u(c2387c.m14642C());
            }
        }
        return null;
    }

    @WorkerThread
    /* JADX INFO: renamed from: F */
    public final C2349j m15170F(String str) {
        m163482o();
        mo15146h();
        Preconditions.checkNotEmpty(str);
        m15191a0(str);
        return this.f10513h.get(str);
    }

    @WorkerThread
    /* JADX INFO: renamed from: G */
    public final boolean m15171G(String str, zzje.zza zzaVar) {
        mo15146h();
        m15191a0(str);
        zzfr$zza zzfr_zzaM15168D = m15168D(str);
        if (zzfr_zzaM15168D == null) {
            return false;
        }
        for (zzfr$zza.C2385a c2385a : zzfr_zzaM15168D.m14633E()) {
            if (zzaVar == m15161u(c2385a.m14640D())) {
                if (c2385a.m14639C() == zzfr$zza.zzd.GRANTED) {
                    return true;
                }
            }
        }
        return false;
    }

    @WorkerThread
    /* JADX INFO: renamed from: H */
    public final boolean m15172H(String str, String str2) {
        Boolean bool;
        mo15146h();
        m15191a0(str);
        if ("ecommerce_purchase".equals(str2) || FirebaseAnalytics.Event.PURCHASE.equals(str2) || FirebaseAnalytics.Event.REFUND.equals(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f10512g.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @WorkerThread
    /* JADX INFO: renamed from: I */
    public final String m15173I(String str) {
        mo15146h();
        return this.f10519n.get(str);
    }

    @WorkerThread
    /* JADX INFO: renamed from: J */
    public final boolean m15174J(String str, String str2) {
        Boolean bool;
        mo15146h();
        m15191a0(str);
        if (m15182R(str) && hny0.m136293D0(str2)) {
            return true;
        }
        if (m15184T(str) && hny0.m136294E0(str2)) {
            return true;
        }
        Map<String, Boolean> map = this.f10511f.get(str);
        if (map == null || (bool = map.get(str2)) == null) {
            return false;
        }
        return bool.booleanValue();
    }

    @WorkerThread
    /* JADX INFO: renamed from: K */
    public final String m15175K(String str) {
        mo15146h();
        return this.f10518m.get(str);
    }

    @WorkerThread
    /* JADX INFO: renamed from: L */
    public final String m15176L(String str) {
        mo15146h();
        m15191a0(str);
        return this.f10517l.get(str);
    }

    @WorkerThread
    /* JADX INFO: renamed from: M */
    public final Set<String> m15177M(String str) {
        mo15146h();
        m15191a0(str);
        return this.f10510e.get(str);
    }

    @WorkerThread
    /* JADX INFO: renamed from: N */
    public final SortedSet<String> m15178N(String str) {
        mo15146h();
        m15191a0(str);
        TreeSet treeSet = new TreeSet();
        zzfr$zza zzfr_zzaM15168D = m15168D(str);
        if (zzfr_zzaM15168D != null) {
            Iterator<zzfr$zza.C2388d> it = zzfr_zzaM15168D.m14632D().iterator();
            while (it.hasNext()) {
                treeSet.add(it.next().m14645C());
            }
        }
        return treeSet;
    }

    @WorkerThread
    /* JADX INFO: renamed from: O */
    public final void m15179O(String str) {
        mo15146h();
        this.f10518m.put(str, null);
    }

    @WorkerThread
    /* JADX INFO: renamed from: P */
    public final void m15180P(String str) {
        mo15146h();
        this.f10513h.remove(str);
    }

    /* JADX INFO: renamed from: Q */
    public final boolean m15181Q(String str) {
        C2349j c2349j;
        return (TextUtils.isEmpty(str) || (c2349j = this.f10513h.get(str)) == null || c2349j.m14278h() == 0) ? false : true;
    }

    /* JADX INFO: renamed from: R */
    public final boolean m15182R(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_internal"));
    }

    @WorkerThread
    /* JADX INFO: renamed from: S */
    public final boolean m15183S(String str) {
        mo15146h();
        m15191a0(str);
        zzfr$zza zzfr_zzaM15168D = m15168D(str);
        return zzfr_zzaM15168D == null || !zzfr_zzaM15168D.m14637L() || zzfr_zzaM15168D.m14636K();
    }

    /* JADX INFO: renamed from: T */
    public final boolean m15184T(String str) {
        return "1".equals(zza(str, "measurement.upload.blacklist_public"));
    }

    @WorkerThread
    /* JADX INFO: renamed from: U */
    public final boolean m15185U(String str) {
        mo15146h();
        m15191a0(str);
        return this.f10510e.get(str) != null && this.f10510e.get(str).contains("app_instance_id");
    }

    @WorkerThread
    /* JADX INFO: renamed from: V */
    public final boolean m15186V(String str) {
        mo15146h();
        m15191a0(str);
        if (this.f10510e.get(str) != null) {
            return this.f10510e.get(str).contains("device_model") || this.f10510e.get(str).contains("device_info");
        }
        return false;
    }

    @WorkerThread
    /* JADX INFO: renamed from: W */
    public final boolean m15187W(String str) {
        mo15146h();
        m15191a0(str);
        return this.f10510e.get(str) != null && this.f10510e.get(str).contains("enhanced_user_id");
    }

    @WorkerThread
    /* JADX INFO: renamed from: X */
    public final boolean m15188X(String str) {
        mo15146h();
        m15191a0(str);
        return this.f10510e.get(str) != null && this.f10510e.get(str).contains("google_signals");
    }

    @WorkerThread
    /* JADX INFO: renamed from: Y */
    public final boolean m15189Y(String str) {
        mo15146h();
        m15191a0(str);
        if (this.f10510e.get(str) != null) {
            return this.f10510e.get(str).contains("os_version") || this.f10510e.get(str).contains("device_info");
        }
        return false;
    }

    @WorkerThread
    /* JADX INFO: renamed from: Z */
    public final boolean m15190Z(String str) {
        mo15146h();
        m15191a0(str);
        return this.f10510e.get(str) != null && this.f10510e.get(str).contains("user_id");
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: a */
    public final /* bridge */ /* synthetic */ ajr0 mo15139a() {
        return super.mo15139a();
    }

    @WorkerThread
    /* JADX INFO: renamed from: a0 */
    public final void m15191a0(String str) {
        m163482o();
        mo15146h();
        Preconditions.checkNotEmpty(str);
        if (this.f10513h.get(str) == null) {
            asr0 asr0VarM168712J0 = mo15194k().m168712J0(str);
            if (asr0VarM168712J0 != null) {
                C2349j.a aVarM14417t = m15200t(str, asr0VarM168712J0.f73168a).m14417t();
                m15202z(str, aVarM14417t);
                this.f10509d.put(str, m15162w((C2349j) ((AbstractC2372u0) aVarM14417t.mo14423H())));
                this.f10513h.put(str, (C2349j) ((AbstractC2372u0) aVarM14417t.mo14423H()));
                m15165A(str, (C2349j) ((AbstractC2372u0) aVarM14417t.mo14423H()));
                this.f10517l.put(str, aVarM14417t.m14285z());
                this.f10518m.put(str, asr0VarM168712J0.f73169b);
                this.f10519n.put(str, asr0VarM168712J0.f73170c);
                return;
            }
            this.f10509d.put(str, null);
            this.f10511f.put(str, null);
            this.f10510e.put(str, null);
            this.f10512g.put(str, null);
            this.f10513h.put(str, null);
            this.f10517l.put(str, null);
            this.f10518m.put(str, null);
            this.f10519n.put(str, null);
            this.f10514i.put(str, null);
        }
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: b */
    public final /* bridge */ /* synthetic */ o7s0 mo15140b() {
        return super.mo15140b();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: c */
    public final /* bridge */ /* synthetic */ wxw0 mo15141c() {
        return super.mo15141c();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: d */
    public final /* bridge */ /* synthetic */ ajx0 mo15142d() {
        return super.mo15142d();
    }

    @Override // p153l.yyx0
    @Pure
    /* JADX INFO: renamed from: e */
    public final /* bridge */ /* synthetic */ hny0 mo15143e() {
        return super.mo15143e();
    }

    @Override // p153l.yyx0
    /* JADX INFO: renamed from: f */
    public final /* bridge */ /* synthetic */ void mo15144f() {
        super.mo15144f();
    }

    @Override // p153l.yyx0
    /* JADX INFO: renamed from: g */
    public final /* bridge */ /* synthetic */ void mo15145g() {
        super.mo15145g();
    }

    @Override // p153l.yyx0
    /* JADX INFO: renamed from: h */
    public final /* bridge */ /* synthetic */ void mo15146h() {
        super.mo15146h();
    }

    @Override // p153l.qjy0
    /* JADX INFO: renamed from: i */
    public final /* bridge */ /* synthetic */ vmy0 mo15192i() {
        return super.mo15192i();
    }

    @Override // p153l.qjy0
    /* JADX INFO: renamed from: j */
    public final /* bridge */ /* synthetic */ pwy0 mo15193j() {
        return super.mo15193j();
    }

    @Override // p153l.qjy0
    /* JADX INFO: renamed from: k */
    public final /* bridge */ /* synthetic */ opr0 mo15194k() {
        return super.mo15194k();
    }

    @Override // p153l.qjy0
    /* JADX INFO: renamed from: l */
    public final /* bridge */ /* synthetic */ C2479e mo15195l() {
        return super.mo15195l();
    }

    @Override // p153l.qjy0
    /* JADX INFO: renamed from: m */
    public final /* bridge */ /* synthetic */ kgy0 mo15196m() {
        return super.mo15196m();
    }

    @Override // p153l.qjy0
    /* JADX INFO: renamed from: n */
    public final /* bridge */ /* synthetic */ vjy0 mo15197n() {
        return super.mo15197n();
    }

    @Override // p153l.njy0
    /* JADX INFO: renamed from: r */
    public final boolean mo15198r() {
        return false;
    }

    @WorkerThread
    /* JADX INFO: renamed from: s */
    public final long m15199s(String str) {
        String strZza = zza(str, "measurement.account.time_zone_offset_minutes");
        if (TextUtils.isEmpty(strZza)) {
            return 0L;
        }
        try {
            return Long.parseLong(strZza);
        } catch (NumberFormatException e) {
            zzj().m114563F().m153302c("Unable to parse timezone offset. appId", d6x0.m114551p(str), e);
            return 0L;
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: t */
    public final C2349j m15200t(String str, byte[] bArr) {
        if (bArr == null) {
            return C2349j.m14262M();
        }
        try {
            C2349j c2349j = (C2349j) ((AbstractC2372u0) ((C2349j.a) vmy0.m201859K(C2349j.m14260K(), bArr)).mo14423H());
            zzj().m114562E().m153302c("Parsed config. version, gmp_app_id", c2349j.m14277c0() ? Long.valueOf(c2349j.m14265G()) : null, c2349j.m14275a0() ? c2349j.m14268T() : null);
            return c2349j;
        } catch (zzkb e) {
            zzj().m114563F().m153302c("Unable to merge remote config. appId", d6x0.m114551p(str), e);
            return C2349j.m14262M();
        } catch (RuntimeException e2) {
            zzj().m114563F().m153302c("Unable to merge remote config. appId", d6x0.m114551p(str), e2);
            return C2349j.m14262M();
        }
    }

    @WorkerThread
    /* JADX INFO: renamed from: v */
    public final zzjh m15201v(String str, zzje.zza zzaVar) {
        mo15146h();
        m15191a0(str);
        zzfr$zza zzfr_zzaM15168D = m15168D(str);
        if (zzfr_zzaM15168D == null) {
            return zzjh.UNINITIALIZED;
        }
        for (zzfr$zza.C2385a c2385a : zzfr_zzaM15168D.m14635I()) {
            if (m15161u(c2385a.m14640D()) == zzaVar) {
                int i = isx0.f116777c[c2385a.m14639C().ordinal()];
                if (i != 1) {
                    return i != 2 ? zzjh.UNINITIALIZED : zzjh.GRANTED;
                }
                return zzjh.DENIED;
            }
        }
        return zzjh.UNINITIALIZED;
    }

    /* JADX INFO: renamed from: z */
    public final void m15202z(String str, C2349j.a aVar) {
        HashSet hashSet = new HashSet();
        l01 l01Var = new l01();
        l01 l01Var2 = new l01();
        l01 l01Var3 = new l01();
        if (aVar != null) {
            Iterator<C2345h> it = aVar.m14280B().iterator();
            while (it.hasNext()) {
                hashSet.add(it.next().m14236C());
            }
            for (int i = 0; i < aVar.m14281v(); i++) {
                C2347i.a aVarM14417t = aVar.m14282w(i).m14417t();
                if (aVarM14417t.m14251x().isEmpty()) {
                    zzj().m114563F().m153300a("EventConfig contained null event name");
                } else {
                    String strM14251x = aVarM14417t.m14251x();
                    String strM128476b = g0y0.m128476b(aVarM14417t.m14251x());
                    if (!TextUtils.isEmpty(strM128476b)) {
                        aVarM14417t = aVarM14417t.m14250w(strM128476b);
                        aVar.m14283x(i, aVarM14417t);
                    }
                    if (aVarM14417t.m14246A() && aVarM14417t.m14252y()) {
                        l01Var.put(strM14251x, Boolean.TRUE);
                    }
                    if (aVarM14417t.m14247B() && aVarM14417t.m14253z()) {
                        l01Var2.put(aVarM14417t.m14251x(), Boolean.TRUE);
                    }
                    if (aVarM14417t.m14248C()) {
                        if (aVarM14417t.m14249v() < 2 || aVarM14417t.m14249v() > 65535) {
                            zzj().m114563F().m153302c("Invalid sampling rate. Event name, sample rate", aVarM14417t.m14251x(), Integer.valueOf(aVarM14417t.m14249v()));
                        } else {
                            l01Var3.put(aVarM14417t.m14251x(), Integer.valueOf(aVarM14417t.m14249v()));
                        }
                    }
                }
            }
        }
        this.f10510e.put(str, hashSet);
        this.f10511f.put(str, l01Var);
        this.f10512g.put(str, l01Var2);
        this.f10514i.put(str, l01Var3);
    }

    @Override // p153l.jlr0
    @WorkerThread
    public final String zza(String str, String str2) {
        mo15146h();
        m15191a0(str);
        Map<String, String> map = this.f10509d.get(str);
        if (map != null) {
            return map.get(str2);
        }
        return null;
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ Clock zzb() {
        return super.zzb();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ zbr0 zzd() {
        return super.zzd();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ d6x0 zzj() {
        return super.zzj();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ qsx0 zzl() {
        return super.zzl();
    }

    @Override // p153l.yyx0, p153l.hzx0
    @Pure
    public final /* bridge */ /* synthetic */ Context zza() {
        return super.zza();
    }
}
