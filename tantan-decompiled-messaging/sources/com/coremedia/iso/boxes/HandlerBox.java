package com.coremedia.iso.boxes;

import com.facebook.AuthenticationTokenClaims;
import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p149l.bzp;
import p149l.cvc0;
import p149l.mck0;
import p149l.wyp;
import p149l.yyp;

/* JADX INFO: loaded from: classes.dex */
public class HandlerBox extends AbstractFullBox {
    public static final String TYPE = "hdlr";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    public static final Map<String, String> readableTypes;

    /* JADX INFO: renamed from: a */
    private long f5742a;

    /* JADX INFO: renamed from: b */
    private long f5743b;

    /* JADX INFO: renamed from: c */
    private long f5744c;
    private String handlerType;
    private String name;
    private long shouldBeZeroButAppleWritesHereSomeValue;
    private boolean zeroTerm;

    static {
        ajc$preClinit();
        HashMap map = new HashMap();
        map.put("odsm", "ObjectDescriptorStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("crsm", "ClockReferenceStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("sdsm", "SceneDescriptionStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("m7sm", "MPEG7Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("ocsm", "ObjectContentInfoStream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("ipsm", "IPMP Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("mjsm", "MPEG-J Stream - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        map.put("mdir", "Apple Meta Data iTunes Reader");
        map.put("mp7b", "MPEG-7 binary XML");
        map.put("mp7t", "MPEG-7 XML");
        map.put("vide", "Video Track");
        map.put("soun", "Sound Track");
        map.put(TrackReferenceTypeBox.TYPE1, "Hint Track");
        map.put("appl", "Apple specific");
        map.put("meta", "Timed Metadata track - defined in ISO/IEC JTC1/SC29/WG11 - CODING OF MOVING PICTURES AND AUDIO");
        readableTypes = Collections.unmodifiableMap(map);
    }

    public HandlerBox() {
        super(TYPE);
        this.name = null;
        this.zeroTerm = true;
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("HandlerBox.java", HandlerBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getHandlerType", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 78);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setName", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", AuthenticationTokenClaims.JSON_KEY_NAME, "", Constants.VOID), 87);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setHandlerType", "com.coremedia.iso.boxes.HandlerBox", "java.lang.String", "handlerType", "", Constants.VOID), 91);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getName", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 95);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getHumanReadableTrackType", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 99);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.HandlerBox", "", "", "", "java.lang.String"), 149);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.shouldBeZeroButAppleWritesHereSomeValue = yyp.m216558k(byteBuffer);
        this.handlerType = yyp.m216549b(byteBuffer);
        this.f5742a = yyp.m216558k(byteBuffer);
        this.f5743b = yyp.m216558k(byteBuffer);
        this.f5744c = yyp.m216558k(byteBuffer);
        if (byteBuffer.remaining() <= 0) {
            this.zeroTerm = false;
            return;
        }
        String strM216555h = yyp.m216555h(byteBuffer, byteBuffer.remaining());
        this.name = strM216555h;
        if (!strM216555h.endsWith("\u0000")) {
            this.zeroTerm = false;
            return;
        }
        String str = this.name;
        this.name = str.substring(0, str.length() - 1);
        this.zeroTerm = true;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        bzp.m104635g(byteBuffer, this.shouldBeZeroButAppleWritesHereSomeValue);
        byteBuffer.put(wyp.m206118d(this.handlerType));
        bzp.m104635g(byteBuffer, this.f5742a);
        bzp.m104635g(byteBuffer, this.f5743b);
        bzp.m104635g(byteBuffer, this.f5744c);
        String str = this.name;
        if (str != null) {
            byteBuffer.put(mck0.m154017b(str));
        }
        if (this.zeroTerm) {
            byteBuffer.put((byte) 0);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        boolean z = this.zeroTerm;
        String str = this.name;
        return z ? mck0.m154018c(str) + 25 : mck0.m154018c(str) + 24;
    }

    public String getHandlerType() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.handlerType;
    }

    public String getHumanReadableTrackType() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_4, this, this));
        Map<String, String> map = readableTypes;
        return map.get(this.handlerType) != null ? map.get(this.handlerType) : "Unknown Handler Type";
    }

    public String getName() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this));
        return this.name;
    }

    public void setHandlerType(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this, str));
        this.handlerType = str;
    }

    public void setName(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, str));
        this.name = str;
    }

    public String toString() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_5, this, this));
        return "HandlerBox[handlerType=" + getHandlerType() + ";name=" + getName() + com.clevertap.android.sdk.Constants.AES_SUFFIX;
    }
}
