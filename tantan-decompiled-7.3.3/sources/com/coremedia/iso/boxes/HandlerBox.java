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
import p153l.b1q;
import p153l.f3d0;
import p153l.slk0;
import p153l.w0q;
import p153l.y0q;

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
    private long f5779a;

    /* JADX INFO: renamed from: b */
    private long f5780b;

    /* JADX INFO: renamed from: c */
    private long f5781c;
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
        this.shouldBeZeroButAppleWritesHereSomeValue = y0q.m213895k(byteBuffer);
        this.handlerType = y0q.m213886b(byteBuffer);
        this.f5779a = y0q.m213895k(byteBuffer);
        this.f5780b = y0q.m213895k(byteBuffer);
        this.f5781c = y0q.m213895k(byteBuffer);
        if (byteBuffer.remaining() <= 0) {
            this.zeroTerm = false;
            return;
        }
        String strM213892h = y0q.m213892h(byteBuffer, byteBuffer.remaining());
        this.name = strM213892h;
        if (!strM213892h.endsWith("\u0000")) {
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
        b1q.m101495g(byteBuffer, this.shouldBeZeroButAppleWritesHereSomeValue);
        byteBuffer.put(w0q.m204214d(this.handlerType));
        b1q.m101495g(byteBuffer, this.f5779a);
        b1q.m101495g(byteBuffer, this.f5780b);
        b1q.m101495g(byteBuffer, this.f5781c);
        String str = this.name;
        if (str != null) {
            byteBuffer.put(slk0.m186593b(str));
        }
        if (this.zeroTerm) {
            byteBuffer.put((byte) 0);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        boolean z = this.zeroTerm;
        String str = this.name;
        return z ? slk0.m186594c(str) + 25 : slk0.m186594c(str) + 24;
    }

    public String getHandlerType() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.handlerType;
    }

    public String getHumanReadableTrackType() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_4, this, this));
        Map<String, String> map = readableTypes;
        return map.get(this.handlerType) != null ? map.get(this.handlerType) : "Unknown Handler Type";
    }

    public String getName() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this));
        return this.name;
    }

    public void setHandlerType(String str) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this, str));
        this.handlerType = str;
    }

    public void setName(String str) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, str));
        this.name = str;
    }

    public String toString() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_5, this, this));
        return "HandlerBox[handlerType=" + getHandlerType() + ";name=" + getName() + com.clevertap.android.sdk.Constants.AES_SUFFIX;
    }
}
