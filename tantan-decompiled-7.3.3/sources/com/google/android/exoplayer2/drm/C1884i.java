package com.google.android.exoplayer2.drm;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.android.exoplayer2.upstream.C2070a;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.eclipse.jetty.http.MimeTypes;
import p153l.bmk0;
import p153l.g6c;
import p153l.j6c;
import p153l.p4g0;
import p153l.w11;
import p153l.zr3;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.i */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1884i implements InterfaceC1885j {

    /* JADX INFO: renamed from: a */
    public final g6c.InterfaceC17163a f7516a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f7517b;

    /* JADX INFO: renamed from: c */
    public final boolean f7518c;

    /* JADX INFO: renamed from: d */
    public final Map<String, String> f7519d;

    public C1884i(@Nullable String str, boolean z, g6c.InterfaceC17163a interfaceC17163a) {
        w11.m204365a((z && TextUtils.isEmpty(str)) ? false : true);
        this.f7516a = interfaceC17163a;
        this.f7517b = str;
        this.f7518c = z;
        this.f7519d = new HashMap();
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m10029c(g6c.InterfaceC17163a interfaceC17163a, String str, @Nullable byte[] bArr, Map<String, String> map) throws MediaDrmCallbackException {
        p4g0 p4g0Var = new p4g0(interfaceC17163a.mo129219a());
        C2070a c2070aM12162a = new C2070a.b().m12171j(str).m12166e(map).m12165d(2).m12164c(bArr).m12163b(1).m12162a();
        int i = 0;
        C2070a c2070aM12162a2 = c2070aM12162a;
        while (true) {
            try {
                j6c j6cVar = new j6c(p4g0Var, c2070aM12162a2);
                try {
                    byte[] bArrM105134f1 = bmk0.m105134f1(j6cVar);
                    bmk0.m105156n(j6cVar);
                    return bArrM105134f1;
                } catch (HttpDataSource$InvalidResponseCodeException e) {
                    try {
                        String strM10030d = m10030d(e, i);
                        if (strM10030d == null) {
                            throw e;
                        }
                        i++;
                        c2070aM12162a2 = c2070aM12162a2.m12157a().m12171j(strM10030d).m12162a();
                        bmk0.m105156n(j6cVar);
                    } catch (Throwable th) {
                        bmk0.m105156n(j6cVar);
                        throw th;
                    }
                }
            } catch (Exception e2) {
                throw new MediaDrmCallbackException(c2070aM12162a, (Uri) w11.m204369e(p4g0Var.m170566q()), p4g0Var.mo11175a(), p4g0Var.m170565j(), e2);
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static String m10030d(HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException, int i) {
        Map<String, List<String>> map;
        List<String> list;
        int i2 = httpDataSource$InvalidResponseCodeException.responseCode;
        if ((i2 != 307 && i2 != 308) || i >= 5 || (map = httpDataSource$InvalidResponseCodeException.headerFields) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1885j
    /* JADX INFO: renamed from: a */
    public byte[] mo10031a(UUID uuid, InterfaceC1882g.a aVar) throws MediaDrmCallbackException {
        String str;
        String strM10009b = aVar.m10009b();
        if (this.f7518c || TextUtils.isEmpty(strM10009b)) {
            strM10009b = this.f7517b;
        }
        if (TextUtils.isEmpty(strM10009b)) {
            C2070a.b bVar = new C2070a.b();
            Uri uri = Uri.EMPTY;
            throw new MediaDrmCallbackException(bVar.m12170i(uri).m12162a(), uri, ImmutableMap.m15769of(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = zr3.f205733e;
        if (uuid2.equals(uuid)) {
            str = MimeTypes.TEXT_XML;
        } else {
            str = zr3.f205731c.equals(uuid) ? "application/json" : OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE;
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f7519d) {
            map.putAll(this.f7519d);
        }
        return m10029c(this.f7516a, strM10009b, aVar.m10008a(), map);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1885j
    /* JADX INFO: renamed from: b */
    public byte[] mo10032b(UUID uuid, InterfaceC1882g.d dVar) throws MediaDrmCallbackException {
        return m10029c(this.f7516a, dVar.m10012b() + "&signedRequest=" + bmk0.m105073E(dVar.m10011a()), null, Collections.EMPTY_MAP);
    }

    /* JADX INFO: renamed from: e */
    public void m10033e(String str, String str2) {
        w11.m204369e(str);
        w11.m204369e(str2);
        synchronized (this.f7519d) {
            this.f7519d.put(str, str2);
        }
    }
}
