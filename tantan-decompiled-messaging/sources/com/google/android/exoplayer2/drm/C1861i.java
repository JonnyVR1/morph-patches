package com.google.android.exoplayer2.drm;

import android.net.Uri;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.alibaba.sdk.android.oss.common.OSSConstants;
import com.google.android.exoplayer2.upstream.C2047a;
import com.google.android.exoplayer2.upstream.HttpDataSource$InvalidResponseCodeException;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.eclipse.jetty.http.MimeTypes;
import p149l.a5c;
import p149l.ar3;
import p149l.d5c;
import p149l.gwf0;
import p149l.p11;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.drm.i */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1861i implements InterfaceC1862j {

    /* JADX INFO: renamed from: a */
    public final a5c.InterfaceC15531a f7479a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public final String f7480b;

    /* JADX INFO: renamed from: c */
    public final boolean f7481c;

    /* JADX INFO: renamed from: d */
    public final Map<String, String> f7482d;

    public C1861i(@Nullable String str, boolean z, a5c.InterfaceC15531a interfaceC15531a) {
        p11.m167007a((z && TextUtils.isEmpty(str)) ? false : true);
        this.f7479a = interfaceC15531a;
        this.f7480b = str;
        this.f7481c = z;
        this.f7482d = new HashMap();
    }

    /* JADX INFO: renamed from: c */
    public static byte[] m9975c(a5c.InterfaceC15531a interfaceC15531a, String str, @Nullable byte[] bArr, Map<String, String> map) throws MediaDrmCallbackException {
        gwf0 gwf0Var = new gwf0(interfaceC15531a.mo95019a());
        C2047a c2047aM12108a = new C2047a.b().m12117j(str).m12112e(map).m12111d(2).m12110c(bArr).m12109b(1).m12108a();
        int i = 0;
        C2047a c2047aM12108a2 = c2047aM12108a;
        while (true) {
            try {
                d5c d5cVar = new d5c(gwf0Var, c2047aM12108a2);
                try {
                    byte[] bArrM197856f1 = vck0.m197856f1(d5cVar);
                    vck0.m197878n(d5cVar);
                    return bArrM197856f1;
                } catch (HttpDataSource$InvalidResponseCodeException e) {
                    try {
                        String strM9976d = m9976d(e, i);
                        if (strM9976d == null) {
                            throw e;
                        }
                        i++;
                        c2047aM12108a2 = c2047aM12108a2.m12103a().m12117j(strM9976d).m12108a();
                        vck0.m197878n(d5cVar);
                    } catch (Throwable th) {
                        vck0.m197878n(d5cVar);
                        throw th;
                    }
                }
            } catch (Exception e2) {
                throw new MediaDrmCallbackException(c2047aM12108a, (Uri) p11.m167011e(gwf0Var.m128403q()), gwf0Var.mo11122b(), gwf0Var.m128402j(), e2);
            }
        }
    }

    @Nullable
    /* JADX INFO: renamed from: d */
    public static String m9976d(HttpDataSource$InvalidResponseCodeException httpDataSource$InvalidResponseCodeException, int i) {
        Map<String, List<String>> map;
        List<String> list;
        int i2 = httpDataSource$InvalidResponseCodeException.responseCode;
        if ((i2 != 307 && i2 != 308) || i >= 5 || (map = httpDataSource$InvalidResponseCodeException.headerFields) == null || (list = map.get("Location")) == null || list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1862j
    /* JADX INFO: renamed from: a */
    public byte[] mo9977a(UUID uuid, InterfaceC1859g.a aVar) throws MediaDrmCallbackException {
        String str;
        String strM9955b = aVar.m9955b();
        if (this.f7481c || TextUtils.isEmpty(strM9955b)) {
            strM9955b = this.f7480b;
        }
        if (TextUtils.isEmpty(strM9955b)) {
            C2047a.b bVar = new C2047a.b();
            Uri uri = Uri.EMPTY;
            throw new MediaDrmCallbackException(bVar.m12116i(uri).m12108a(), uri, ImmutableMap.m15715of(), 0L, new IllegalStateException("No license URL"));
        }
        HashMap map = new HashMap();
        UUID uuid2 = ar3.f71232e;
        if (uuid2.equals(uuid)) {
            str = MimeTypes.TEXT_XML;
        } else {
            str = ar3.f71230c.equals(uuid) ? "application/json" : OSSConstants.DEFAULT_OBJECT_CONTENT_TYPE;
        }
        map.put("Content-Type", str);
        if (uuid2.equals(uuid)) {
            map.put("SOAPAction", "http://schemas.microsoft.com/DRM/2007/03/protocols/AcquireLicense");
        }
        synchronized (this.f7482d) {
            map.putAll(this.f7482d);
        }
        return m9975c(this.f7479a, strM9955b, aVar.m9954a(), map);
    }

    @Override // com.google.android.exoplayer2.drm.InterfaceC1862j
    /* JADX INFO: renamed from: b */
    public byte[] mo9978b(UUID uuid, InterfaceC1859g.d dVar) throws MediaDrmCallbackException {
        return m9975c(this.f7479a, dVar.m9958b() + "&signedRequest=" + vck0.m197795E(dVar.m9957a()), null, Collections.EMPTY_MAP);
    }

    /* JADX INFO: renamed from: e */
    public void m9979e(String str, String str2) {
        p11.m167011e(str);
        p11.m167011e(str2);
        synchronized (this.f7482d) {
            this.f7482d.put(str, str2);
        }
    }
}
