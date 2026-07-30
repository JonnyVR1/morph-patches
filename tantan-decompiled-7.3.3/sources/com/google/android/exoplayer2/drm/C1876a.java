package com.google.android.exoplayer2.drm;

import android.net.Uri;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import com.google.android.exoplayer2.C1944n;
import com.google.common.primitives.Ints;
import java.util.Map;
import org.aspectj.lang.JoinPoint;
import p153l.bmk0;
import p153l.g6c;
import p153l.gyj0;
import p153l.kpd;
import p153l.w11;
import p153l.zde;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.a */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1876a implements zde {

    /* JADX INFO: renamed from: a */
    public final Object f7493a = new Object();

    /* JADX INFO: renamed from: b */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public C1944n.f f7494b;

    /* JADX INFO: renamed from: c */
    @GuardedBy(JoinPoint.SYNCHRONIZATION_LOCK)
    public InterfaceC1878c f7495c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public g6c.InterfaceC17163a f7496d;

    /* JADX INFO: renamed from: e */
    @Nullable
    public String f7497e;

    @Override // p153l.zde
    /* JADX INFO: renamed from: a */
    public InterfaceC1878c mo9964a(C1944n c1944n) {
        InterfaceC1878c interfaceC1878c;
        w11.m204369e(c1944n.f7997b);
        C1944n.f fVar = c1944n.f7997b.f8096c;
        if (fVar == null || bmk0.f77313a < 18) {
            return InterfaceC1878c.f7503a;
        }
        synchronized (this.f7493a) {
            try {
                if (!bmk0.m105123c(fVar, this.f7494b)) {
                    this.f7494b = fVar;
                    this.f7495c = m9965b(fVar);
                }
                interfaceC1878c = (InterfaceC1878c) w11.m204369e(this.f7495c);
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1878c;
    }

    @RequiresApi(18)
    /* JADX INFO: renamed from: b */
    public final InterfaceC1878c m9965b(C1944n.f fVar) {
        g6c.InterfaceC17163a interfaceC17163aM150710d = this.f7496d;
        if (interfaceC17163aM150710d == null) {
            interfaceC17163aM150710d = new kpd.C18234b().m150710d(this.f7497e);
        }
        Uri uri = fVar.f8052c;
        C1884i c1884i = new C1884i(uri == null ? null : uri.toString(), fVar.f8057h, interfaceC17163aM150710d);
        gyj0<Map.Entry<String, String>> it = fVar.f8054e.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, String> next = it.next();
            c1884i.m10033e(next.getKey(), next.getValue());
        }
        DefaultDrmSessionManager defaultDrmSessionManagerM9938a = new DefaultDrmSessionManager.C1868b().m9942e(fVar.f8050a, C1883h.f7512d).m9939b(fVar.f8055f).m9940c(fVar.f8056g).m9941d(Ints.m16524n(fVar.f8059j)).m9938a(c1884i);
        defaultDrmSessionManagerM9938a.m9925E(0, fVar.m10712e());
        return defaultDrmSessionManagerM9938a;
    }
}
