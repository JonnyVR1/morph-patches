package org.eclipse.jetty.client.security;

import java.io.IOException;
import java.security.MessageDigest;
import java.util.Map;
import org.eclipse.jetty.client.HttpExchange;
import org.eclipse.jetty.http.HttpTokens;
import org.eclipse.jetty.util.TypeUtil;
import p153l.iig0;

/* JADX INFO: loaded from: classes2.dex */
public class DigestAuthentication implements Authentication {

    /* JADX INFO: renamed from: NC */
    private static final String f206813NC = "00000001";
    Map details;
    Realm securityRealm;

    public DigestAuthentication(Realm realm, Map map) {
        this.securityRealm = realm;
        this.details = map;
    }

    private static String encode(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < bArr.length; i++) {
            sb.append(Integer.toHexString((bArr[i] & 240) >>> 4));
            sb.append(Integer.toHexString(bArr[i] & 15));
        }
        return sb.toString();
    }

    public String newCnonce(HttpExchange httpExchange, Realm realm, Map map) {
        try {
            return encode(MessageDigest.getInstance("MD5").digest(String.valueOf(System.currentTimeMillis()).getBytes("ISO-8859-1")));
        } catch (Exception e) {
            iig0.m140070a(e);
            return null;
        }
    }

    public String newResponse(String str, HttpExchange httpExchange, Realm realm, Map map) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            messageDigest.update(realm.getPrincipal().getBytes("ISO-8859-1"));
            messageDigest.update(HttpTokens.COLON);
            messageDigest.update(String.valueOf(map.get("realm")).getBytes("ISO-8859-1"));
            messageDigest.update(HttpTokens.COLON);
            messageDigest.update(realm.getCredentials().getBytes("ISO-8859-1"));
            byte[] bArrDigest = messageDigest.digest();
            messageDigest.reset();
            messageDigest.update(httpExchange.getMethod().getBytes("ISO-8859-1"));
            messageDigest.update(HttpTokens.COLON);
            messageDigest.update(httpExchange.getURI().getBytes("ISO-8859-1"));
            byte[] bArrDigest2 = messageDigest.digest();
            messageDigest.update(TypeUtil.toString(bArrDigest, 16).getBytes("ISO-8859-1"));
            messageDigest.update(HttpTokens.COLON);
            messageDigest.update(String.valueOf(map.get("nonce")).getBytes("ISO-8859-1"));
            messageDigest.update(HttpTokens.COLON);
            messageDigest.update(f206813NC.getBytes("ISO-8859-1"));
            messageDigest.update(HttpTokens.COLON);
            messageDigest.update(str.getBytes("ISO-8859-1"));
            messageDigest.update(HttpTokens.COLON);
            messageDigest.update(String.valueOf(map.get("qop")).getBytes("ISO-8859-1"));
            messageDigest.update(HttpTokens.COLON);
            messageDigest.update(TypeUtil.toString(bArrDigest2, 16).getBytes("ISO-8859-1"));
            return encode(messageDigest.digest());
        } catch (Exception e) {
            iig0.m140070a(e);
            return null;
        }
    }

    @Override // org.eclipse.jetty.client.security.Authentication
    public void setCredentials(HttpExchange httpExchange) throws IOException {
        StringBuilder sb = new StringBuilder("Digest username=\"");
        sb.append(this.securityRealm.getPrincipal());
        sb.append("\", realm=\"");
        sb.append(String.valueOf(this.details.get("realm")));
        sb.append("\", nonce=\"");
        sb.append(String.valueOf(this.details.get("nonce")));
        sb.append("\", uri=\"");
        sb.append(httpExchange.getURI());
        sb.append("\", algorithm=");
        sb.append(String.valueOf(this.details.get("algorithm")));
        String strNewCnonce = newCnonce(httpExchange, this.securityRealm, this.details);
        sb.append(", response=\"");
        sb.append(newResponse(strNewCnonce, httpExchange, this.securityRealm, this.details));
        sb.append("\", qop=");
        sb.append(String.valueOf(this.details.get("qop")));
        sb.append(", nc=00000001, cnonce=\"");
        sb.append(strNewCnonce);
        sb.append('\"');
        httpExchange.setRequestHeader("Authorization", new String(sb.toString().getBytes("ISO-8859-1")));
    }
}
