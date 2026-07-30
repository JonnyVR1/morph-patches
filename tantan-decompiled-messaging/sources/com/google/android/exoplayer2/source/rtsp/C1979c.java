package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p149l.vck0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.c */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C1979c {

    /* JADX INFO: renamed from: a */
    public final int f8829a;

    /* JADX INFO: renamed from: b */
    public final String f8830b;

    /* JADX INFO: renamed from: c */
    public final String f8831c;

    /* JADX INFO: renamed from: d */
    public final String f8832d;

    public C1979c(int i, String str, String str2, String str3) {
        this.f8829a = i;
        this.f8830b = str;
        this.f8831c = str2;
        this.f8832d = str3;
    }

    /* JADX INFO: renamed from: a */
    public String m11483a(C1984h.a aVar, Uri uri, int i) throws ParserException {
        int i2 = this.f8829a;
        if (i2 == 1) {
            return m11484b(aVar);
        }
        if (i2 == 2) {
            return m11485c(aVar, uri, i);
        }
        throw ParserException.createForManifestWithUnsupportedFeature(null, new UnsupportedOperationException());
    }

    /* JADX INFO: renamed from: b */
    public final String m11484b(C1984h.a aVar) {
        return vck0.m197793D("Basic %s", Base64.encodeToString(C1984h.m11652d(aVar.f8926a + ":" + aVar.f8927b), 0));
    }

    /* JADX INFO: renamed from: c */
    public final String m11485c(C1984h.a aVar, Uri uri, int i) throws ParserException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            String strM11668t = C1984h.m11668t(i);
            String strM197862h1 = vck0.m197862h1(messageDigest.digest(C1984h.m11652d(aVar.f8926a + ":" + this.f8830b + ":" + aVar.f8927b)));
            StringBuilder sb = new StringBuilder();
            sb.append(strM11668t);
            sb.append(":");
            sb.append(uri);
            String strM197862h2 = vck0.m197862h1(messageDigest.digest(C1984h.m11652d(strM197862h1 + ":" + this.f8831c + ":" + vck0.m197862h1(messageDigest.digest(C1984h.m11652d(sb.toString()))))));
            return this.f8832d.isEmpty() ? vck0.m197793D("Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", aVar.f8926a, this.f8830b, this.f8831c, uri, strM197862h2) : vck0.m197793D("Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", aVar.f8926a, this.f8830b, this.f8831c, uri, strM197862h2, this.f8832d);
        } catch (NoSuchAlgorithmException e) {
            throw ParserException.createForManifestWithUnsupportedFeature(null, e);
        }
    }
}
