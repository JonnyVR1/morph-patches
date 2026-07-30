package com.googlecode.mp4parser.boxes.dece;

import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.cvc0;
import p149l.h1k;
import p149l.mck0;
import p149l.yyp;

/* JADX INFO: loaded from: classes7.dex */
public class AssetInformationBox extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "ainf";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    String apid;
    String profileVersion;

    static {
        ajc$preClinit();
    }

    public AssetInformationBox() {
        super(TYPE);
        this.apid = "";
        this.profileVersion = "0000";
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("AssetInformationBox.java", AssetInformationBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getApid", "com.googlecode.mp4parser.boxes.dece.AssetInformationBox", "", "", "", "java.lang.String"), 131);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setApid", "com.googlecode.mp4parser.boxes.dece.AssetInformationBox", "java.lang.String", "apid", "", Constants.VOID), CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_256_CBC_SHA);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getProfileVersion", "com.googlecode.mp4parser.boxes.dece.AssetInformationBox", "", "", "", "java.lang.String"), CipherSuite.TLS_PSK_WITH_3DES_EDE_CBC_SHA);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setProfileVersion", "com.googlecode.mp4parser.boxes.dece.AssetInformationBox", "java.lang.String", "profileVersion", "", Constants.VOID), CipherSuite.TLS_DHE_PSK_WITH_3DES_EDE_CBC_SHA);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.profileVersion = yyp.m216555h(byteBuffer, 4);
        this.apid = yyp.m216554g(byteBuffer);
    }

    public String getApid() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.apid;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (getVersion() != 0) {
            h1k.m129030a("Unknown ainf version ", getVersion());
            return;
        }
        byteBuffer.put(mck0.m154017b(this.profileVersion), 0, 4);
        byteBuffer.put(mck0.m154017b(this.apid));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return mck0.m154018c(this.apid) + 9;
    }

    public String getProfileVersion() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.profileVersion;
    }

    public boolean isHidden() {
        return (getFlags() & 1) == 1;
    }

    public void setApid(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, str));
        this.apid = str;
    }

    public void setHidden(boolean z) {
        int flags = getFlags();
        if (isHidden() ^ z) {
            if (z) {
                setFlags(flags | 1);
            } else {
                setFlags(16777214 & flags);
            }
        }
    }

    public void setProfileVersion(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this, str));
        this.profileVersion = str;
    }
}
