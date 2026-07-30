package p149l;

import android.content.Context;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes6.dex */
public final class lmv0 implements qlv0 {

    /* JADX INFO: renamed from: a */
    public final aiw0 f128830a;

    /* JADX INFO: renamed from: b */
    public final Context f128831b;

    /* JADX INFO: renamed from: c */
    public final rmw0 f128832c;

    /* JADX INFO: renamed from: d */
    public final ScheduledExecutorService f128833d;

    /* JADX INFO: renamed from: e */
    public final h3v0 f128834e;

    /* JADX INFO: renamed from: f */
    public final iyv0 f128835f;

    public lmv0(aiw0 aiw0Var, Context context, rmw0 rmw0Var, ScheduledExecutorService scheduledExecutorService, h3v0 h3v0Var, iyv0 iyv0Var) {
        this.f128830a = aiw0Var;
        this.f128831b = context;
        this.f128832c = rmw0Var;
        this.f128833d = scheduledExecutorService;
        this.f128834e = h3v0Var;
        this.f128835f = iyv0Var;
    }

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ gnr m150619a(Throwable th) throws Exception {
        nmv0 nmv0Var;
        qts0.m176477c(this.f128831b).mo176483b(th, "TopicsSignal.fetchTopicsSignal");
        if (th instanceof SecurityException) {
            nmv0Var = new nmv0("", 2, null);
        } else if (th instanceof IllegalStateException) {
            nmv0Var = new nmv0("", 3, null);
        } else if (th instanceof IllegalArgumentException) {
            nmv0Var = new nmv0("", 4, null);
        } else {
            nmv0Var = th instanceof TimeoutException ? new nmv0("", 5, null) : new nmv0("", 0, null);
        }
        return jmw0.m142235h(nmv0Var);
    }

    @Override // p149l.qlv0
    public final int zza() {
        return 56;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (r5.f128835f.f115494d.zzy != com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED.getValue()) goto L10;
     */
    @Override // p149l.qlv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final p149l.gnr zzb() {
        /*
            r5 = this;
            l.x6s0 r0 = p149l.m7s0.f132094U9
            l.k7s0 r1 = p149l.d1s0.m109677c()
            java.lang.Object r0 = r1.m144697a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L74
            l.aiw0 r0 = r5.f128830a
            boolean r0 = r0.mo96955n()
            if (r0 == 0) goto L74
            l.x6s0 r0 = p149l.m7s0.f132130X9
            l.k7s0 r1 = p149l.d1s0.m109677c()
            java.lang.Object r0 = r1.m144697a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L3a
            l.iyv0 r0 = r5.f128835f
            com.google.android.gms.ads.RequestConfiguration$PublisherPrivacyPersonalizationState r1 = com.google.android.gms.ads.RequestConfiguration.PublisherPrivacyPersonalizationState.DISABLED
            int r1 = r1.getValue()
            com.google.android.gms.ads.internal.client.zzl r0 = r0.f115494d
            int r0 = r0.zzy
            if (r0 == r1) goto L74
        L3a:
            l.h3v0 r0 = r5.f128834e
            r1 = 0
            l.gnr r0 = r0.m129178a(r1)
            l.x6s0 r1 = p149l.m7s0.f132106V9
            l.k7s0 r2 = p149l.d1s0.m109677c()
            java.lang.Object r1 = r2.m144697a(r1)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            long r1 = (long) r1
            java.util.concurrent.ScheduledExecutorService r3 = r5.f128833d
            java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.MILLISECONDS
            l.gnr r0 = p149l.jmw0.m142242o(r0, r1, r4, r3)
            l.amw0 r0 = p149l.amw0.m97696C(r0)
            l.rmw0 r1 = r5.f128832c
            l.jmv0 r2 = new p149l.rlw0() { // from class: l.jmv0
                static {
                    /*
                        l.jmv0 r0 = new l.jmv0
                        r0.<init>()
                        
                        // error: 0x0005: SPUT (r0 I:l.jmv0) l.jmv0.a l.jmv0
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p149l.jmv0.<clinit>():void");
                }

                {
                    /*
                        r0 = this;
                        r0.<init>()
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p149l.jmv0.<init>():void");
                }

                @Override // p149l.rlw0
                public final p149l.gnr zza(java.lang.Object r5) {
                    /*
                        r4 = this;
                        l.hkj r5 = (p149l.hkj) r5
                        l.fdx0 r4 = com.google.android.gms.internal.ads.C2101a6.m12523L()
                        java.util.List r5 = r5.m131566a()
                        java.util.Iterator r5 = r5.iterator()
                    Le:
                        boolean r0 = r5.hasNext()
                        if (r0 == 0) goto L3d
                        java.lang.Object r0 = r5.next()
                        l.xxi0 r0 = (p149l.xxi0) r0
                        l.edx0 r1 = com.google.android.gms.internal.ads.C2302z5.m13528L()
                        int r2 = r0.getTopicId()
                        r1.m115841s(r2)
                        long r2 = r0.getModelVersion()
                        r1.m115839q(r2)
                        long r2 = r0.getTaxonomyVersion()
                        r1.m115840r(r2)
                        com.google.android.gms.internal.ads.p5 r0 = r1.m153521m()
                        com.google.android.gms.internal.ads.z5 r0 = (com.google.android.gms.internal.ads.C2302z5) r0
                        r4.m121013q(r0)
                        goto Le
                    L3d:
                        com.google.android.gms.internal.ads.p5 r4 = r4.m153521m()
                        com.google.android.gms.internal.ads.a6 r4 = (com.google.android.gms.internal.ads.C2101a6) r4
                        byte[] r4 = r4.m12744h()
                        r5 = 1
                        java.lang.String r4 = android.util.Base64.encodeToString(r4, r5)
                        l.nmv0 r0 = new l.nmv0
                        r1 = 0
                        r0.<init>(r4, r5, r1)
                        l.gnr r4 = p149l.jmw0.m142235h(r0)
                        return r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p149l.jmv0.zza(java.lang.Object):l.gnr");
                }
            }
            l.gnr r0 = p149l.jmw0.m142241n(r0, r2, r1)
            l.kmv0 r1 = new l.kmv0
            r1.<init>()
            l.rmw0 r5 = r5.f128832c
            java.lang.Class<java.lang.Throwable> r2 = java.lang.Throwable.class
            l.gnr r5 = p149l.jmw0.m142233f(r0, r2, r1, r5)
            return r5
        L74:
            l.nmv0 r5 = new l.nmv0
            r0 = -1
            r1 = 0
            java.lang.String r2 = ""
            r5.<init>(r2, r0, r1)
            l.gnr r5 = p149l.jmw0.m142235h(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p149l.lmv0.zzb():l.gnr");
    }
}
