package com.googlecode.mp4parser.boxes.dece;

import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.b1q;
import p153l.f3d0;
import p153l.slk0;
import p153l.y0q;

/* JADX INFO: loaded from: classes7.dex */
public class ContentInformationBox extends AbstractFullBox {
    public static final String TYPE = "cinf";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_10 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_11 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_12 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_13 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9 = null;
    Map<String, String> brandEntries;
    String codecs;
    Map<String, String> idEntries;
    String languages;
    String mimeSubtypeName;
    String profileLevelIdc;
    String protection;

    static {
        ajc$preClinit();
    }

    public ContentInformationBox() {
        super(TYPE);
        this.brandEntries = new LinkedHashMap();
        this.idEntries = new LinkedHashMap();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("ContentInformationBox.java", ContentInformationBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getMimeSubtypeName", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 144);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setMimeSubtypeName", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "mimeSubtypeName", "", Constants.VOID), 148);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getBrandEntries", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.util.Map"), 184);
        ajc$tjp_11 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setBrandEntries", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.util.Map", "brandEntries", "", Constants.VOID), 188);
        ajc$tjp_12 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getIdEntries", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.util.Map"), 192);
        ajc$tjp_13 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setIdEntries", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.util.Map", "idEntries", "", Constants.VOID), CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA256);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getProfileLevelIdc", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), CipherSuite.TLS_DH_RSA_WITH_SEED_CBC_SHA);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setProfileLevelIdc", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "profileLevelIdc", "", Constants.VOID), CipherSuite.TLS_RSA_WITH_AES_128_GCM_SHA256);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getCodecs", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 160);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setCodecs", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "codecs", "", Constants.VOID), CipherSuite.TLS_DH_DSS_WITH_AES_128_GCM_SHA256);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getProtection", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), CipherSuite.TLS_PSK_WITH_AES_128_GCM_SHA256);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setProtection", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "protection", "", Constants.VOID), CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getLanguages", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "", "", "", "java.lang.String"), 176);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setLanguages", "com.googlecode.mp4parser.boxes.dece.ContentInformationBox", "java.lang.String", "languages", "", Constants.VOID), 180);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.mimeSubtypeName = y0q.m213891g(byteBuffer);
        this.profileLevelIdc = y0q.m213891g(byteBuffer);
        this.codecs = y0q.m213891g(byteBuffer);
        this.protection = y0q.m213891g(byteBuffer);
        this.languages = y0q.m213891g(byteBuffer);
        int iM213898n = y0q.m213898n(byteBuffer);
        while (true) {
            int i = iM213898n - 1;
            if (iM213898n <= 0) {
                break;
            }
            this.brandEntries.put(y0q.m213891g(byteBuffer), y0q.m213891g(byteBuffer));
            iM213898n = i;
        }
        int iM213898n2 = y0q.m213898n(byteBuffer);
        while (true) {
            int i2 = iM213898n2 - 1;
            if (iM213898n2 <= 0) {
                return;
            }
            this.idEntries.put(y0q.m213891g(byteBuffer), y0q.m213891g(byteBuffer));
            iM213898n2 = i2;
        }
    }

    public Map<String, String> getBrandEntries() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_10, this, this));
        return this.brandEntries;
    }

    public String getCodecs() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.codecs;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        b1q.m101500l(byteBuffer, this.mimeSubtypeName);
        b1q.m101500l(byteBuffer, this.profileLevelIdc);
        b1q.m101500l(byteBuffer, this.codecs);
        b1q.m101500l(byteBuffer, this.protection);
        b1q.m101500l(byteBuffer, this.languages);
        b1q.m101498j(byteBuffer, this.brandEntries.size());
        for (Map.Entry<String, String> entry : this.brandEntries.entrySet()) {
            b1q.m101500l(byteBuffer, entry.getKey());
            b1q.m101500l(byteBuffer, entry.getValue());
        }
        b1q.m101498j(byteBuffer, this.idEntries.size());
        for (Map.Entry<String, String> entry2 : this.idEntries.entrySet()) {
            b1q.m101500l(byteBuffer, entry2.getKey());
            b1q.m101500l(byteBuffer, entry2.getValue());
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        long jM186594c = ((long) (slk0.m186594c(this.mimeSubtypeName) + 1)) + 4 + ((long) (slk0.m186594c(this.profileLevelIdc) + 1)) + ((long) (slk0.m186594c(this.codecs) + 1)) + ((long) (slk0.m186594c(this.protection) + 1)) + ((long) (slk0.m186594c(this.languages) + 1)) + 1;
        for (Map.Entry<String, String> entry : this.brandEntries.entrySet()) {
            jM186594c = jM186594c + ((long) (slk0.m186594c(entry.getKey()) + 1)) + ((long) (slk0.m186594c(entry.getValue()) + 1));
        }
        long jM186594c2 = jM186594c + 1;
        for (Map.Entry<String, String> entry2 : this.idEntries.entrySet()) {
            jM186594c2 = jM186594c2 + ((long) (slk0.m186594c(entry2.getKey()) + 1)) + ((long) (slk0.m186594c(entry2.getValue()) + 1));
        }
        return jM186594c2;
    }

    public Map<String, String> getIdEntries() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_12, this, this));
        return this.idEntries;
    }

    public String getLanguages() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_8, this, this));
        return this.languages;
    }

    public String getMimeSubtypeName() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.mimeSubtypeName;
    }

    public String getProfileLevelIdc() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.profileLevelIdc;
    }

    public String getProtection() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_6, this, this));
        return this.protection;
    }

    public void setBrandEntries(Map<String, String> map) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_11, this, this, map));
        this.brandEntries = map;
    }

    public void setCodecs(String str) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_5, this, this, str));
        this.codecs = str;
    }

    public void setIdEntries(Map<String, String> map) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_13, this, this, map));
        this.idEntries = map;
    }

    public void setLanguages(String str) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_9, this, this, str));
        this.languages = str;
    }

    public void setMimeSubtypeName(String str) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, str));
        this.mimeSubtypeName = str;
    }

    public void setProfileLevelIdc(String str) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this, str));
        this.profileLevelIdc = str;
    }

    public void setProtection(String str) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_7, this, this, str));
        this.protection = str;
    }
}
