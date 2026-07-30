package com.google.android.libraries.places.internal;

import com.facebook.AuthenticationTokenClaims;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.URI;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;
import p149l.aag0;

/* JADX INFO: loaded from: classes7.dex */
public final class zzbih extends zzbcv {
    static final boolean zza;
    static final boolean zzb;
    protected static final boolean zzc;
    private static final Logger zzg;
    private static final Set zzh;
    private static final String zzi;
    private static final String zzj;
    private static final String zzk;
    private static final zzbig zzl;
    private static String zzm;
    private boolean zzA;
    private zzbcr zzB;
    final zzbde zzd;
    protected boolean zzf;
    private final String zzp;
    private final String zzq;
    private final int zzr;
    private final zzbql zzs;
    private final long zzt;
    private final zzbdw zzu;
    private final zzna zzv;
    private boolean zzw;
    private Executor zzx;
    private final boolean zzy;
    private final zzbcu zzz;
    private final Random zzn = new Random();
    protected volatile zzbhz zze = zzbic.INSTANCE;
    private final AtomicReference zzo = new AtomicReference();

    static {
        Logger logger = Logger.getLogger(zzbih.class.getName());
        zzg = logger;
        zzh = Collections.unmodifiableSet(new HashSet(Arrays.asList("clientLanguage", "percentage", "clientHostname", "serviceConfig")));
        String property = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi", "true");
        zzi = property;
        String property2 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_jndi_localhost", "false");
        zzj = property2;
        String property3 = System.getProperty("io.grpc.internal.DnsNameResolverProvider.enable_service_config", "false");
        zzk = property3;
        zza = Boolean.parseBoolean(property);
        zzb = Boolean.parseBoolean(property2);
        zzc = Boolean.parseBoolean(property3);
        zzbig zzbigVar = null;
        try {
            try {
                try {
                    zzbig zzbigVar2 = (zzbig) Class.forName("io.grpc.internal.JndiResourceResolverFactory", true, zzbih.class.getClassLoader()).asSubclass(zzbig.class).getConstructor(null).newInstance(null);
                    if (zzbigVar2.zzb() != null) {
                        logger.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "JndiResourceResolverFactory not available, skipping.", zzbigVar2.zzb());
                    } else {
                        zzbigVar = zzbigVar2;
                    }
                } catch (Exception e) {
                    zzg.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't construct JndiResourceResolverFactory, skipping.", (Throwable) e);
                }
            } catch (Exception e2) {
                zzg.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Can't find JndiResourceResolverFactory ctor, skipping.", (Throwable) e2);
            }
        } catch (ClassCastException e3) {
            zzg.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to cast JndiResourceResolverFactory, skipping.", (Throwable) e3);
        } catch (ClassNotFoundException e4) {
            zzg.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "getResourceResolverFactory", "Unable to find JndiResourceResolverFactory, skipping.", (Throwable) e4);
        }
        zzl = zzbigVar;
    }

    public zzbih(String str, String str2, zzbco zzbcoVar, zzbql zzbqlVar, zzna zznaVar, boolean z) {
        zzmt.zzc(zzbcoVar, "args");
        this.zzs = zzbqlVar;
        zzmt.zzc(str2, AuthenticationTokenClaims.JSON_KEY_NAME);
        URI uriCreate = URI.create("//".concat(str2));
        zzmt.zzj(uriCreate.getHost() != null, "Invalid DNS name: %s", str2);
        String authority = uriCreate.getAuthority();
        zzmt.zzd(authority, "nameUri (%s) doesn't have an authority", uriCreate);
        this.zzp = authority;
        this.zzq = uriCreate.getHost();
        if (uriCreate.getPort() == -1) {
            this.zzr = zzbcoVar.zza();
        } else {
            this.zzr = uriCreate.getPort();
        }
        this.zzd = zzbcoVar.zzd();
        long nanos = 0;
        if (!z) {
            String property = System.getProperty("networkaddress.cache.ttl");
            long j = 30;
            if (property != null) {
                try {
                    j = Long.parseLong(property);
                } catch (NumberFormatException unused) {
                    zzg.logp(Level.WARNING, "io.grpc.internal.DnsNameResolver", "getNetworkAddressCacheTtlNanos", "Property({0}) valid is not valid number format({1}), fall back to default({2})", new Object[]{"networkaddress.cache.ttl", property, 30L});
                }
            }
            nanos = j > 0 ? TimeUnit.SECONDS.toNanos(j) : j;
        }
        this.zzt = nanos;
        this.zzv = zznaVar;
        this.zzu = zzbcoVar.zze();
        Executor executorZzf = zzbcoVar.zzf();
        this.zzx = executorZzf;
        this.zzy = executorZzf == null;
        this.zzz = zzbcoVar.zzc();
    }

    public static /* bridge */ /* synthetic */ zzazs zzg(zzbih zzbihVar) throws IOException {
        zzbdd zzbddVarZza = zzbihVar.zzd.zza(InetSocketAddress.createUnresolved(zzbihVar.zzq, zzbihVar.zzr));
        if (zzbddVarZza == null) {
            return null;
        }
        return new zzazs(Collections.singletonList(zzbddVarZza), zzaye.zza);
    }

    private static String zzm() {
        if (zzm == null) {
            try {
                zzm = InetAddress.getLocalHost().getHostName();
            } catch (UnknownHostException e) {
                aag0.m95543a(e);
                return null;
            }
        }
        return zzm;
    }

    private final void zzn() {
        if (this.zzA || this.zzw) {
            return;
        }
        if (this.zzf) {
            long j = this.zzt;
            if (j != 0 && (j <= 0 || this.zzv.zza(TimeUnit.NANOSECONDS) <= this.zzt)) {
                return;
            }
        }
        this.zzA = true;
        this.zzx.execute(new zzbie(this, this.zzB));
    }

    @Override // com.google.android.libraries.places.internal.zzbcv
    public final String zza() {
        return this.zzp;
    }

    @Override // com.google.android.libraries.places.internal.zzbcv
    public final void zzb() {
        zzmt.zzp(this.zzB != null, "not started");
        zzn();
    }

    @Override // com.google.android.libraries.places.internal.zzbcv
    public final void zzc() {
        if (this.zzw) {
            return;
        }
        this.zzw = true;
        Executor executor = this.zzx;
        if (executor == null || !this.zzy) {
            return;
        }
        zzbqm.zzc(this.zzs, executor);
        this.zzx = null;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.concurrent.Executor] */
    @Override // com.google.android.libraries.places.internal.zzbcv
    public final void zzd(zzbcr zzbcrVar) {
        zzmt.zzp(this.zzB == null, "already started");
        if (this.zzy) {
            this.zzx = zzbqm.zza(this.zzs);
        }
        this.zzB = zzbcrVar;
        zzn();
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01c3 A[Catch: RuntimeException -> 0x015e, TryCatch #1 {RuntimeException -> 0x015e, blocks: (B:70:0x013a, B:71:0x0142, B:73:0x0148, B:76:0x0161, B:78:0x0169, B:80:0x016f, B:81:0x0173, B:83:0x0179, B:87:0x018a, B:89:0x0192, B:94:0x019f, B:97:0x01ab, B:99:0x01b3, B:101:0x01b9, B:102:0x01bd, B:104:0x01c3, B:106:0x01cf, B:111:0x01d9, B:112:0x01e8), top: B:140:0x013a }] */
    /* JADX WARN: Code duplicated, block: B:108:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:156:0x01d9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:15:0x0061  */
    /* JADX WARN: Code duplicated, block: B:165:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:166:0x01cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:167:? A[LOOP:5: B:102:0x01bd->B:167:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:0x0099  */
    /* JADX WARN: Code duplicated, block: B:89:0x0192 A[Catch: RuntimeException -> 0x015e, TryCatch #1 {RuntimeException -> 0x015e, blocks: (B:70:0x013a, B:71:0x0142, B:73:0x0148, B:76:0x0161, B:78:0x0169, B:80:0x016f, B:81:0x0173, B:83:0x0179, B:87:0x018a, B:89:0x0192, B:94:0x019f, B:97:0x01ab, B:99:0x01b3, B:101:0x01b9, B:102:0x01bd, B:104:0x01c3, B:106:0x01cf, B:111:0x01d9, B:112:0x01e8), top: B:140:0x013a }] */
    /* JADX WARN: Code duplicated, block: B:93:0x019e  */
    /* JADX WARN: Code duplicated, block: B:96:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:97:0x01ab A[Catch: RuntimeException -> 0x015e, TryCatch #1 {RuntimeException -> 0x015e, blocks: (B:70:0x013a, B:71:0x0142, B:73:0x0148, B:76:0x0161, B:78:0x0169, B:80:0x016f, B:81:0x0173, B:83:0x0179, B:87:0x018a, B:89:0x0192, B:94:0x019f, B:97:0x01ab, B:99:0x01b3, B:101:0x01b9, B:102:0x01bd, B:104:0x01c3, B:106:0x01cf, B:111:0x01d9, B:112:0x01e8), top: B:140:0x013a }] */
    /* JADX WARN: Code duplicated, block: B:99:0x01b3 A[Catch: RuntimeException -> 0x015e, TryCatch #1 {RuntimeException -> 0x015e, blocks: (B:70:0x013a, B:71:0x0142, B:73:0x0148, B:76:0x0161, B:78:0x0169, B:80:0x016f, B:81:0x0173, B:83:0x0179, B:87:0x018a, B:89:0x0192, B:94:0x019f, B:97:0x01ab, B:99:0x01b3, B:101:0x01b9, B:102:0x01bd, B:104:0x01c3, B:106:0x01cf, B:111:0x01d9, B:112:0x01e8), top: B:140:0x013a }] */
    public final zzbib zzi(boolean z) {
        zzbif zzbifVarZza;
        zzbig zzbigVar;
        zzbcp zzbcpVarZzb;
        Double dZzb;
        List listZzi;
        Map mapZzj;
        Iterator it;
        int iIntValue;
        boolean z2;
        Exception exc = null;
        zzbcpVarZzb = null;
        zzbcp zzbcpVarZzb2 = null;
        exc = null;
        zzbib zzbibVar = new zzbib(null);
        try {
            try {
                try {
                    List listUnmodifiableList = Collections.unmodifiableList(Arrays.asList(InetAddress.getAllByName(this.zzq)));
                    ArrayList arrayList = new ArrayList(listUnmodifiableList.size());
                    Iterator it2 = listUnmodifiableList.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(new zzazs(Collections.singletonList(new InetSocketAddress((InetAddress) it2.next(), this.zzr)), zzaye.zza));
                    }
                    zzbibVar.zzb = Collections.unmodifiableList(arrayList);
                    if (zzc) {
                        String str = this.zzq;
                        List<String> listZza = Collections.EMPTY_LIST;
                        boolean z3 = zza;
                        boolean z4 = zzb;
                        if (!z3) {
                            zzbifVarZza = null;
                        } else if (!"localhost".equalsIgnoreCase(str)) {
                            if (!str.contains(":")) {
                                boolean z5 = true;
                                int i = 0;
                                while (i < str.length()) {
                                    char cCharAt = str.charAt(i);
                                    if (cCharAt != '.') {
                                        z5 = (z5 ? 1 : 0) & (cCharAt >= '0' && cCharAt <= '9');
                                    }
                                    i++;
                                    z5 = z5;
                                }
                                if (!z5) {
                                    zzbifVarZza = (zzbif) this.zzo.get();
                                    if (zzbifVarZza == null) {
                                        zzbifVarZza = zzbigVar.zza();
                                    }
                                }
                            }
                            zzbifVarZza = null;
                        } else if (z4) {
                            zzbifVarZza = (zzbif) this.zzo.get();
                            if (zzbifVarZza == null && (zzbigVar = zzl) != null) {
                                zzbifVarZza = zzbigVar.zza();
                            }
                        } else {
                            zzbifVarZza = null;
                        }
                        if (zzbifVarZza != null) {
                            try {
                                listZza = zzbifVarZza.zza();
                            } catch (Exception e) {
                                zzg.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveServiceConfig", "ServiceConfig resolution failure", (Throwable) e);
                            }
                        }
                        if (listZza.isEmpty()) {
                            zzg.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveServiceConfig", "No TXT records found for {0}", new Object[]{this.zzq});
                        } else {
                            Random random = this.zzn;
                            String strZzm = zzm();
                            try {
                                ArrayList<Map> arrayList2 = new ArrayList();
                                for (String str2 : listZza) {
                                    if (str2.startsWith("grpc_config=")) {
                                        Object objZza = zzbkf.zza(str2.substring(12));
                                        if (!(objZza instanceof List)) {
                                            throw new ClassCastException("wrong type ".concat(String.valueOf(objZza)));
                                        }
                                        List list = (List) objZza;
                                        zzbkg.zzf(list);
                                        arrayList2.addAll(list);
                                    } else {
                                        zzg.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "parseTxtResults", "Ignoring non service config {0}", new Object[]{str2});
                                    }
                                }
                                Map map = null;
                                for (Map map2 : arrayList2) {
                                    try {
                                        for (Map.Entry entry : map2.entrySet()) {
                                            zzng.zza(zzh.contains(entry.getKey()), "Bad key: %s", entry);
                                        }
                                        List listZzi2 = zzbkg.zzi(map2, "clientLanguage");
                                        if (listZzi2 == null || listZzi2.isEmpty()) {
                                            dZzb = zzbkg.zzb(map2, "percentage");
                                            if (dZzb == null) {
                                                listZzi = zzbkg.zzi(map2, "clientHostname");
                                                if (listZzi != null && !listZzi.isEmpty()) {
                                                    it = listZzi.iterator();
                                                    while (true) {
                                                        if (!it.hasNext()) {
                                                            map = null;
                                                        } else if (((String) it.next()).equals(strZzm)) {
                                                        }
                                                    }
                                                }
                                                mapZzj = zzbkg.zzj(map2, "serviceConfig");
                                                if (mapZzj != null) {
                                                    throw new zznh(String.format("key '%s' missing in '%s'", map2, "serviceConfig"));
                                                }
                                                map = mapZzj;
                                            } else {
                                                iIntValue = dZzb.intValue();
                                                if (iIntValue >= 0 || iIntValue > 100) {
                                                    z2 = false;
                                                } else {
                                                    z2 = true;
                                                }
                                                zzng.zza(z2, "Bad percentage: %s", dZzb);
                                                if (random.nextInt(100) >= iIntValue) {
                                                    listZzi = zzbkg.zzi(map2, "clientHostname");
                                                    if (listZzi != null) {
                                                        it = listZzi.iterator();
                                                        while (true) {
                                                            if (!it.hasNext()) {
                                                                if (((String) it.next()).equals(strZzm)) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                    mapZzj = zzbkg.zzj(map2, "serviceConfig");
                                                    if (mapZzj != null) {
                                                        throw new zznh(String.format("key '%s' missing in '%s'", map2, "serviceConfig"));
                                                    }
                                                    map = mapZzj;
                                                }
                                                map = null;
                                            }
                                        } else {
                                            Iterator it3 = listZzi2.iterator();
                                            while (true) {
                                                if (it3.hasNext()) {
                                                    if ("java".equalsIgnoreCase((String) it3.next())) {
                                                        dZzb = zzbkg.zzb(map2, "percentage");
                                                        if (dZzb == null) {
                                                            listZzi = zzbkg.zzi(map2, "clientHostname");
                                                            if (listZzi != null) {
                                                                it = listZzi.iterator();
                                                                while (true) {
                                                                    if (!it.hasNext()) {
                                                                        if (((String) it.next()).equals(strZzm)) {
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            mapZzj = zzbkg.zzj(map2, "serviceConfig");
                                                            if (mapZzj != null) {
                                                                throw new zznh(String.format("key '%s' missing in '%s'", map2, "serviceConfig"));
                                                            }
                                                            map = mapZzj;
                                                        } else {
                                                            iIntValue = dZzb.intValue();
                                                            if (iIntValue >= 0) {
                                                                z2 = false;
                                                            } else {
                                                                z2 = false;
                                                            }
                                                            zzng.zza(z2, "Bad percentage: %s", dZzb);
                                                            if (random.nextInt(100) >= iIntValue) {
                                                                listZzi = zzbkg.zzi(map2, "clientHostname");
                                                                if (listZzi != null) {
                                                                    it = listZzi.iterator();
                                                                    while (true) {
                                                                        if (!it.hasNext()) {
                                                                            if (((String) it.next()).equals(strZzm)) {
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                                mapZzj = zzbkg.zzj(map2, "serviceConfig");
                                                                if (mapZzj != null) {
                                                                    throw new zznh(String.format("key '%s' missing in '%s'", map2, "serviceConfig"));
                                                                }
                                                                map = mapZzj;
                                                            }
                                                        }
                                                    }
                                                }
                                                map = null;
                                            }
                                        }
                                        if (map != null) {
                                            break;
                                        }
                                    } catch (RuntimeException e2) {
                                        zzbcpVarZzb = zzbcp.zzb(zzbdo.zzc.zzg("failed to pick service config choice").zzf(e2));
                                    }
                                }
                                zzbcpVarZzb = map == null ? null : zzbcp.zza(map);
                            } catch (IOException e3) {
                                e = e3;
                                zzbcpVarZzb = zzbcp.zzb(zzbdo.zzc.zzg("failed to parse TXT records").zzf(e));
                            } catch (RuntimeException e4) {
                                e = e4;
                                zzbcpVarZzb = zzbcp.zzb(zzbdo.zzc.zzg("failed to parse TXT records").zzf(e));
                            }
                            if (zzbcpVarZzb != null) {
                                zzbcpVarZzb2 = zzbcpVarZzb.zzc() != null ? zzbcp.zzb(zzbcpVarZzb.zzc()) : this.zzz.zza((Map) zzbcpVarZzb.zzd());
                            }
                        }
                        zzbibVar.zzc = zzbcpVarZzb2;
                    }
                    return zzbibVar;
                } catch (Exception e5) {
                    exc = e5;
                    zznd.zza(exc);
                    throw new RuntimeException(exc);
                }
            } catch (Throwable th) {
                Exception exc2 = exc;
                if (exc2 != null) {
                    zzg.logp(Level.FINE, "io.grpc.internal.DnsNameResolver", "resolveAddresses", "Address resolution failure", (Throwable) exc2);
                }
                throw th;
            }
        } catch (Exception e6) {
            zzbibVar.zza = zzbdo.zzp.zzg("Unable to resolve host ".concat(String.valueOf(this.zzq))).zzf(e6);
            return zzbibVar;
        }
    }
}
