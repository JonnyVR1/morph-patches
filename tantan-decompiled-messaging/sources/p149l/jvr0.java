package p149l;

import android.content.Context;
import android.content.p004pm.PackageManager$OnChecksumsReadyListener;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.internal.ads.C2120d;
import com.google.android.gms.internal.ads.C2200n;
import com.google.android.gms.internal.ads.C2268v3;
import java.io.ByteArrayInputStream;
import java.lang.reflect.InvocationTargetException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public final class jvr0 extends rwr0 {

    /* JADX INFO: renamed from: j */
    public static final swr0 f119971j = new swr0();

    /* JADX INFO: renamed from: i */
    public final Context f119972i;

    public jvr0(vur0 vur0Var, String str, String str2, zpr0 zpr0Var, int i, int i2, Context context, C2120d c2120d) {
        super(vur0Var, "CbnHJiUmcb7bV3nHtVfkQJESWUzuF9spYS2HkpVPEQ4sOQCQUFomcsL6vpMTm+JY", "m4BHDSYRnsEEIrYlgM0yy1C5NfyYnIIeJvwgjuCY5HY=", zpr0Var, i, 27);
        this.f119972i = context;
    }

    @Override // p149l.rwr0
    /* JADX INFO: renamed from: a */
    public final void mo99305a() throws IllegalAccessException, InvocationTargetException {
        int i;
        jrr0 jrr0Var;
        AtomicReference atomicReferenceM186355a = f119971j.m186355a(this.f119972i.getPackageName());
        synchronized (atomicReferenceM186355a) {
            try {
                jrr0 jrr0Var2 = (jrr0) atomicReferenceM186355a.get();
                if (jrr0Var2 == null || yur0.m216157d(jrr0Var2.f119433a) || jrr0Var2.f119433a.equals("E") || jrr0Var2.f119433a.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                    if (yur0.m216157d(null)) {
                        yur0.m216157d(null);
                        i = 3;
                    } else {
                        i = 5;
                    }
                    Boolean boolValueOf = Boolean.valueOf(i == 3);
                    Boolean bool = (Boolean) d1s0.m109677c().m144697a(m7s0.f132315m2);
                    String strM143537c = ((Boolean) d1s0.m109677c().m144697a(m7s0.f132302l2)).booleanValue() ? m143537c() : null;
                    if (bool.booleanValue() && this.f161368b.m200112p() && yur0.m216157d(strM143537c)) {
                        strM143537c = m143538d();
                    }
                    jrr0 jrr0Var3 = new jrr0((String) this.f161372f.invoke(null, this.f119972i, boolValueOf, strM143537c));
                    if (yur0.m216157d(jrr0Var3.f119433a) || jrr0Var3.f119433a.equals("E")) {
                        int i2 = i - 1;
                        if (i2 == 3) {
                            String strM143538d = m143538d();
                            if (!yur0.m216157d(strM143538d)) {
                                jrr0Var3.f119433a = strM143538d;
                            }
                        } else if (i2 == 4) {
                            throw null;
                        }
                    }
                    atomicReferenceM186355a.set(jrr0Var3);
                }
                jrr0Var = (jrr0) atomicReferenceM186355a.get();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f161371e) {
            if (jrr0Var != null) {
                try {
                    this.f161371e.m219797y0(jrr0Var.f119433a);
                    this.f161371e.m219755R(jrr0Var.f119434b);
                    this.f161371e.m219757T(jrr0Var.f119435c);
                    this.f161371e.m219773j0(jrr0Var.f119436d);
                    this.f161371e.m219795x0(jrr0Var.f119437e);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m143537c() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] bArrM216159f = yur0.m216159f((String) d1s0.m109677c().m144697a(m7s0.f132328n2));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrM216159f)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(yur0.m216159f((String) d1s0.m109677c().m144697a(m7s0.f132341o2)))));
            }
            Context context = this.f119972i;
            String packageName = context.getPackageName();
            this.f161368b.m200109k();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals(j6f.LATITUDE_SOUTH)) {
                return null;
            }
            final C2268v3 c2268v3M13379C = C2268v3.m13379C();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: l.wwr0
                public final void onChecksumsReady(List list) {
                    C2268v3 c2268v3 = c2268v3M13379C;
                    if (list == null) {
                        c2268v3.mo13021e(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ApkChecksum apkChecksumM190904a = twr0.m190904a(list.get(i));
                            if (apkChecksumM190904a.getType() == 8) {
                                c2268v3.mo13021e(yur0.m216155b(apkChecksumM190904a.getValue()));
                                return;
                            }
                        }
                        c2268v3.mo13021e(null);
                    } catch (Throwable unused) {
                        c2268v3.mo13021e(null);
                    }
                }
            });
            return (String) c2268v3M13379C.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m143538d() {
        try {
            if (this.f161368b.m200110l() != null) {
                this.f161368b.m200110l().get();
            }
            C2200n c2200nM200102c = this.f161368b.m200102c();
            if (c2200nM200102c == null || !c2200nM200102c.m12998v0()) {
                return null;
            }
            return c2200nM200102c.m12996K0();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }
}
