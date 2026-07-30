package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import p149l.bzp;
import p149l.cvc0;
import p149l.mck0;
import p149l.wyp;
import p149l.yyp;

/* JADX INFO: loaded from: classes.dex */
public class SchemeTypeBox extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "schm";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    String schemeType;
    String schemeUri;
    long schemeVersion;

    static {
        ajc$preClinit();
    }

    public SchemeTypeBox() {
        super(TYPE);
        this.schemeType = "    ";
        this.schemeUri = null;
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("SchemeTypeBox.java", SchemeTypeBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSchemeType", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "java.lang.String"), 44);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSchemeVersion", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", Constants.LONG), 48);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSchemeUri", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "java.lang.String"), 52);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSchemeType", "com.coremedia.iso.boxes.SchemeTypeBox", "java.lang.String", "schemeType", "", Constants.VOID), 56);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSchemeVersion", "com.coremedia.iso.boxes.SchemeTypeBox", Constants.INT, "schemeVersion", "", Constants.VOID), 61);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSchemeUri", "com.coremedia.iso.boxes.SchemeTypeBox", "java.lang.String", "schemeUri", "", Constants.VOID), 65);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.SchemeTypeBox", "", "", "", "java.lang.String"), 93);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.schemeType = yyp.m216549b(byteBuffer);
        this.schemeVersion = yyp.m216558k(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.schemeUri = yyp.m216554g(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(wyp.m206118d(this.schemeType));
        bzp.m104635g(byteBuffer, this.schemeVersion);
        if ((getFlags() & 1) == 1) {
            byteBuffer.put(mck0.m154017b(this.schemeUri));
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return ((getFlags() & 1) == 1 ? mck0.m154018c(this.schemeUri) + 1 : 0) + 12;
    }

    public String getSchemeType() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.schemeType;
    }

    public String getSchemeUri() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.schemeUri;
    }

    public long getSchemeVersion() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this));
        return this.schemeVersion;
    }

    public void setSchemeType(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this, str));
        this.schemeType = str;
    }

    public void setSchemeUri(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_5, this, this, str));
        this.schemeUri = str;
    }

    public void setSchemeVersion(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_4, this, this, Conversions.intObject(i)));
        this.schemeVersion = i;
    }

    public String toString() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_6, this, this));
        return "Schema Type Box[schemeUri=" + this.schemeUri + "; schemeType=" + this.schemeType + "; schemeVersion=" + this.schemeVersion + "; ]";
    }
}
