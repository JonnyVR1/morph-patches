package com.google.android.exoplayer2.drm;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C1921n;
import com.google.common.primitives.Ints;
import java.util.Map;
import org.aspectj.lang.JoinPoint;
import p149l.a5c;
import p149l.dpj0;
import p149l.fod;
import p149l.p11;
import p149l.vce;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.a */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1853a implements vce {

    /* JADX INFO: renamed from: a */
    public final Object f7456a = new Object();

    /* JADX INFO: renamed from: b */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public C1921n.f f7457b;

    /* JADX INFO: renamed from: c */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public InterfaceC1855c f7458c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public a5c.InterfaceC15531a f7459d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public String f7460e;

    @Override // p149l.vce
    /* JADX INFO: renamed from: a */
    public InterfaceC1855c mo9910a(C1921n c1921n) {
        InterfaceC1855c interfaceC1855c;
        p11.m167011e(c1921n.f7960b);
        C1921n.f fVar = c1921n.f7960b.f8059c;
        if (fVar == null || vck0.f180948a < 18) {
            return InterfaceC1855c.f7466a;
        }
        synchronized (this.f7456a) {
            try {
                if (!vck0.m197845c(fVar, this.f7457b)) {
                    this.f7457b = fVar;
                    this.f7458c = m9911b(fVar);
                }
                interfaceC1855c = (InterfaceC1855c) p11.m167011e(this.f7458c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1855c;
    }

    @RequiresApi(18)
    /* JADX INFO: renamed from: b */
    public final InterfaceC1855c m9911b(C1921n.f fVar) {
        a5c.InterfaceC15531a interfaceC15531aM122448d = this.f7459d;
        if (interfaceC15531aM122448d == null) {
            interfaceC15531aM122448d = new fod.C16893b().m122448d(this.f7460e);
        }
        Uri uri = fVar.f8015c;
        C1861i c1861i = new C1861i(uri == null ? null : uri.toString(), fVar.f8020h, interfaceC15531aM122448d);
        dpj0<Map.Entry<String, String>> it = fVar.f8017e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            c1861i.m9979e(next.getKey(), next.getValue());
        }
        DefaultDrmSessionManager defaultDrmSessionManagerM9884a = new DefaultDrmSessionManager.C1845b().m9888e(fVar.f8013a, C1860h.f7475d).m9885b(fVar.f8018f).m9886c(fVar.f8019g).m9887d(Ints.m16469n(fVar.f8022j)).m9884a(c1861i);
        defaultDrmSessionManagerM9884a.m9871E(0, fVar.m10658e());
        return defaultDrmSessionManagerM9884a;
    }
}
