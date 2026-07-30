package com.googlecode.mp4parser.boxes.dece;

import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.f3d0;
import p153l.slk0;
import p153l.x3k;
import p153l.y0q;

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
        this.profileVersion = y0q.m213892h(byteBuffer, 4);
        this.apid = y0q.m213891g(byteBuffer);
    }

    public String getApid() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.apid;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (getVersion() != 0) {
            x3k.m209245a("Unknown ainf version ", getVersion());
            return;
        }
        byteBuffer.put(slk0.m186593b(this.profileVersion), 0, 4);
        byteBuffer.put(slk0.m186593b(this.apid));
        byteBuffer.put((byte) 0);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return slk0.m186594c(this.apid) + 9;
    }

    public String getProfileVersion() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.profileVersion;
    }

    public boolean isHidden() {
        return (getFlags() & 1) == 1;
    }

    public void setApid(String str) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, str));
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
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this, str));
        this.profileVersion = str;
    }
}
