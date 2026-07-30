package p153l;

import android.content.Context;
import android.content.p005pm.PackageManager$OnChecksumsReadyListener;
import android.content.pm.ApkChecksum;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.gms.internal.ads.C2143d;
import com.google.android.gms.internal.ads.C2223n;
import com.google.android.gms.internal.ads.C2291v3;
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
public final class p4s0 extends x5s0 {

    /* JADX INFO: renamed from: j */
    public static final y5s0 f150558j = new y5s0();

    /* JADX INFO: renamed from: i */
    public final Context f150559i;

    public p4s0(b4s0 b4s0Var, String str, String str2, fzr0 fzr0Var, int i, int i2, Context context, C2143d c2143d) {
        super(b4s0Var, "CbnHJiUmcb7bV3nHtVfkQJESWUzuF9spYS2HkpVPEQ4sOQCQUFomcsL6vpMTm+JY", "m4BHDSYRnsEEIrYlgM0yy1C5NfyYnIIeJvwgjuCY5HY=", fzr0Var, i, 27);
        this.f150559i = context;
    }

    @Override // p153l.x5s0
    /* JADX INFO: renamed from: a */
    public final void mo96251a() throws IllegalAccessException, InvocationTargetException {
        int i;
        p0s0 p0s0Var;
        AtomicReference atomicReferenceM214317a = f150558j.m214317a(this.f150559i.getPackageName());
        synchronized (atomicReferenceM214317a) {
            try {
                p0s0 p0s0Var2 = (p0s0) atomicReferenceM214317a.get();
                if (p0s0Var2 == null || e4s0.m119480d(p0s0Var2.f150091a) || p0s0Var2.f150091a.equals("E") || p0s0Var2.f150091a.equals("0000000000000000000000000000000000000000000000000000000000000000")) {
                    if (e4s0.m119480d(null)) {
                        e4s0.m119480d(null);
                        i = 3;
                    } else {
                        i = 5;
                    }
                    Boolean boolValueOf = Boolean.valueOf(i == 3);
                    Boolean bool = (Boolean) jas0.m144075c().m176505a(sgs0.f168386m2);
                    String strM170578c = ((Boolean) jas0.m144075c().m176505a(sgs0.f168373l2)).booleanValue() ? m170578c() : null;
                    if (bool.booleanValue() && this.f192519b.m102528p() && e4s0.m119480d(strM170578c)) {
                        strM170578c = m170579d();
                    }
                    p0s0 p0s0Var3 = new p0s0((String) this.f192523f.invoke(null, this.f150559i, boolValueOf, strM170578c));
                    if (e4s0.m119480d(p0s0Var3.f150091a) || p0s0Var3.f150091a.equals("E")) {
                        int i2 = i - 1;
                        if (i2 == 3) {
                            String strM170579d = m170579d();
                            if (!e4s0.m119480d(strM170579d)) {
                                p0s0Var3.f150091a = strM170579d;
                            }
                        } else if (i2 == 4) {
                            throw null;
                        }
                    }
                    atomicReferenceM214317a.set(p0s0Var3);
                }
                p0s0Var = (p0s0) atomicReferenceM214317a.get();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.f192522e) {
            if (p0s0Var != null) {
                try {
                    this.f192522e.m128332y0(p0s0Var.f150091a);
                    this.f192522e.m128290R(p0s0Var.f150092b);
                    this.f192522e.m128292T(p0s0Var.f150093c);
                    this.f192522e.m128308j0(p0s0Var.f150094d);
                    this.f192522e.m128330x0(p0s0Var.f150095e);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public final String m170578c() {
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            byte[] bArrM119482f = e4s0.m119482f((String) jas0.m144075c().m176505a(sgs0.f168399n2));
            ArrayList arrayList = new ArrayList();
            arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(bArrM119482f)));
            if (!Build.TYPE.equals("user")) {
                arrayList.add(certificateFactory.generateCertificate(new ByteArrayInputStream(e4s0.m119482f((String) jas0.m144075c().m176505a(sgs0.f168412o2)))));
            }
            Context context = this.f150559i;
            String packageName = context.getPackageName();
            this.f192519b.m102525k();
            if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals(p7f.LATITUDE_SOUTH)) {
                return null;
            }
            final C2291v3 c2291v3M13433C = C2291v3.m13433C();
            context.getPackageManager().requestChecksums(packageName, false, 8, arrayList, new PackageManager$OnChecksumsReadyListener() { // from class: l.c6s0
                public final void onChecksumsReady(List list) {
                    C2291v3 c2291v3 = c2291v3M13433C;
                    if (list == null) {
                        c2291v3.mo13075e(null);
                        return;
                    }
                    try {
                        int size = list.size();
                        for (int i = 0; i < size; i++) {
                            ApkChecksum apkChecksumM218740a = z5s0.m218740a(list.get(i));
                            if (apkChecksumM218740a.getType() == 8) {
                                c2291v3.mo13075e(e4s0.m119478b(apkChecksumM218740a.getValue()));
                                return;
                            }
                        }
                        c2291v3.mo13075e(null);
                    } catch (Throwable unused) {
                        c2291v3.mo13075e(null);
                    }
                }
            });
            return (String) c2291v3M13433C.get();
        } catch (PackageManager.NameNotFoundException | InterruptedException | NoClassDefFoundError | CertificateEncodingException | CertificateException | ExecutionException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: d */
    public final String m170579d() {
        try {
            if (this.f192519b.m102526l() != null) {
                this.f192519b.m102526l().get();
            }
            C2223n c2223nM102518c = this.f192519b.m102518c();
            if (c2223nM102518c == null || !c2223nM102518c.m13052v0()) {
                return null;
            }
            return c2223nM102518c.m13050K0();
        } catch (InterruptedException | ExecutionException unused) {
            return null;
        }
    }
}
