package com.googlecode.mp4parser.boxes.dece;

import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import java.util.LinkedHashMap;
import java.util.Map;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.bzp;
import p149l.cvc0;
import p149l.mck0;
import p149l.yyp;

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
        this.mimeSubtypeName = yyp.m216554g(byteBuffer);
        this.profileLevelIdc = yyp.m216554g(byteBuffer);
        this.codecs = yyp.m216554g(byteBuffer);
        this.protection = yyp.m216554g(byteBuffer);
        this.languages = yyp.m216554g(byteBuffer);
        int iM216561n = yyp.m216561n(byteBuffer);
        while (true) {
            int i = iM216561n - 1;
            if (iM216561n <= 0) {
                break;
            }
            this.brandEntries.put(yyp.m216554g(byteBuffer), yyp.m216554g(byteBuffer));
            iM216561n = i;
        }
        int iM216561n2 = yyp.m216561n(byteBuffer);
        while (true) {
            int i2 = iM216561n2 - 1;
            if (iM216561n2 <= 0) {
                return;
            }
            this.idEntries.put(yyp.m216554g(byteBuffer), yyp.m216554g(byteBuffer));
            iM216561n2 = i2;
        }
    }

    public Map<String, String> getBrandEntries() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_10, this, this));
        return this.brandEntries;
    }

    public String getCodecs() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.codecs;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        bzp.m104640l(byteBuffer, this.mimeSubtypeName);
        bzp.m104640l(byteBuffer, this.profileLevelIdc);
        bzp.m104640l(byteBuffer, this.codecs);
        bzp.m104640l(byteBuffer, this.protection);
        bzp.m104640l(byteBuffer, this.languages);
        bzp.m104638j(byteBuffer, this.brandEntries.size());
        for (Map.Entry<String, String> entry : this.brandEntries.entrySet()) {
            bzp.m104640l(byteBuffer, entry.getKey());
            bzp.m104640l(byteBuffer, entry.getValue());
        }
        bzp.m104638j(byteBuffer, this.idEntries.size());
        for (Map.Entry<String, String> entry2 : this.idEntries.entrySet()) {
            bzp.m104640l(byteBuffer, entry2.getKey());
            bzp.m104640l(byteBuffer, entry2.getValue());
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        long jM154018c = ((long) (mck0.m154018c(this.mimeSubtypeName) + 1)) + 4 + ((long) (mck0.m154018c(this.profileLevelIdc) + 1)) + ((long) (mck0.m154018c(this.codecs) + 1)) + ((long) (mck0.m154018c(this.protection) + 1)) + ((long) (mck0.m154018c(this.languages) + 1)) + 1;
        for (Map.Entry<String, String> entry : this.brandEntries.entrySet()) {
            jM154018c = jM154018c + ((long) (mck0.m154018c(entry.getKey()) + 1)) + ((long) (mck0.m154018c(entry.getValue()) + 1));
        }
        long jM154018c2 = jM154018c + 1;
        for (Map.Entry<String, String> entry2 : this.idEntries.entrySet()) {
            jM154018c2 = jM154018c2 + ((long) (mck0.m154018c(entry2.getKey()) + 1)) + ((long) (mck0.m154018c(entry2.getValue()) + 1));
        }
        return jM154018c2;
    }

    public Map<String, String> getIdEntries() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_12, this, this));
        return this.idEntries;
    }

    public String getLanguages() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_8, this, this));
        return this.languages;
    }

    public String getMimeSubtypeName() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.mimeSubtypeName;
    }

    public String getProfileLevelIdc() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.profileLevelIdc;
    }

    public String getProtection() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_6, this, this));
        return this.protection;
    }

    public void setBrandEntries(Map<String, String> map) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_11, this, this, map));
        this.brandEntries = map;
    }

    public void setCodecs(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_5, this, this, str));
        this.codecs = str;
    }

    public void setIdEntries(Map<String, String> map) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_13, this, this, map));
        this.idEntries = map;
    }

    public void setLanguages(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_9, this, this, str));
        this.languages = str;
    }

    public void setMimeSubtypeName(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, str));
        this.mimeSubtypeName = str;
    }

    public void setProfileLevelIdc(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this, str));
        this.profileLevelIdc = str;
    }

    public void setProtection(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_7, this, this, str));
        this.protection = str;
    }
}
