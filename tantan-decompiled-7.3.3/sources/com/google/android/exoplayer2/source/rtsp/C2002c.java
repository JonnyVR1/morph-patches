package com.google.android.exoplayer2.source.rtsp;

import android.net.Uri;
import android.util.Base64;
import com.google.android.exoplayer2.ParserException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import p153l.bmk0;

/* JADX INFO: renamed from: com.google.android.exoplayer2.source.rtsp.c */
/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class C2002c {

    /* JADX INFO: renamed from: a */
    public final int f8866a;

    /* JADX INFO: renamed from: b */
    public final String f8867b;

    /* JADX INFO: renamed from: c */
    public final String f8868c;

    /* JADX INFO: renamed from: d */
    public final String f8869d;

    public C2002c(int i, String str, String str2, String str3) {
        this.f8866a = i;
        this.f8867b = str;
        this.f8868c = str2;
        this.f8869d = str3;
    }

    /* JADX INFO: renamed from: a */
    public String m11537a(C2007h.a aVar, Uri uri, int i) throws ParserException {
        int i2 = this.f8866a;
        if (i2 == 1) {
            return m11538b(aVar);
        }
        if (i2 == 2) {
            return m11539c(aVar, uri, i);
        }
        throw ParserException.createForManifestWithUnsupportedFeature(null, new UnsupportedOperationException());
    }

    /* JADX INFO: renamed from: b */
    public final String m11538b(C2007h.a aVar) {
        return bmk0.m105071D("Basic %s", Base64.encodeToString(C2007h.m11706d(aVar.f8963a + ":" + aVar.f8964b), 0));
    }

    /* JADX INFO: renamed from: c */
    public final String m11539c(C2007h.a aVar, Uri uri, int i) throws ParserException {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            String strM11722t = C2007h.m11722t(i);
            String strM105140h1 = bmk0.m105140h1(messageDigest.digest(C2007h.m11706d(aVar.f8963a + ":" + this.f8867b + ":" + aVar.f8964b)));
            StringBuilder sb = new StringBuilder();
            sb.append(strM11722t);
            sb.append(":");
            sb.append(uri);
            String strM105140h2 = bmk0.m105140h1(messageDigest.digest(C2007h.m11706d(strM105140h1 + ":" + this.f8868c + ":" + bmk0.m105140h1(messageDigest.digest(C2007h.m11706d(sb.toString()))))));
            return this.f8869d.isEmpty() ? bmk0.m105071D("Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\"", aVar.f8963a, this.f8867b, this.f8868c, uri, strM105140h2) : bmk0.m105071D("Digest username=\"%s\", realm=\"%s\", nonce=\"%s\", uri=\"%s\", response=\"%s\", opaque=\"%s\"", aVar.f8963a, this.f8867b, this.f8868c, uri, strM105140h2, this.f8869d);
        } catch (NoSuchAlgorithmException e) {
            throw ParserException.createForManifestWithUnsupportedFeature(null, e);
        }
    }
}
