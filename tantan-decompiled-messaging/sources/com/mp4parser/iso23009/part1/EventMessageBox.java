package com.mp4parser.iso23009.part1;

import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import p149l.bzp;
import p149l.cvc0;
import p149l.mck0;
import p149l.yyp;

/* JADX INFO: loaded from: classes8.dex */
public class EventMessageBox extends AbstractFullBox {
    public static final String TYPE = "emsg";
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
    long eventDuration;

    /* JADX INFO: renamed from: id */
    long f14809id;
    byte[] messageData;
    long presentationTimeDelta;
    String schemeIdUri;
    long timescale;
    String value;

    static {
        ajc$preClinit();
    }

    public EventMessageBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("EventMessageBox.java", EventMessageBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSchemeIdUri", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "java.lang.String"), 59);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSchemeIdUri", "com.mp4parser.iso23009.part1.EventMessageBox", "java.lang.String", "schemeIdUri", "", Constants.VOID), 63);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getId", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", Constants.LONG), 99);
        ajc$tjp_11 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setId", "com.mp4parser.iso23009.part1.EventMessageBox", Constants.LONG, "id", "", Constants.VOID), 103);
        ajc$tjp_12 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getMessageData", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "[B"), 107);
        ajc$tjp_13 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setMessageData", "com.mp4parser.iso23009.part1.EventMessageBox", "[B", "messageData", "", Constants.VOID), 111);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getValue", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "java.lang.String"), 67);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setValue", "com.mp4parser.iso23009.part1.EventMessageBox", "java.lang.String", "value", "", Constants.VOID), 71);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getTimescale", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", Constants.LONG), 75);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setTimescale", "com.mp4parser.iso23009.part1.EventMessageBox", Constants.LONG, "timescale", "", Constants.VOID), 79);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getPresentationTimeDelta", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", Constants.LONG), 83);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setPresentationTimeDelta", "com.mp4parser.iso23009.part1.EventMessageBox", Constants.LONG, "presentationTimeDelta", "", Constants.VOID), 87);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEventDuration", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", Constants.LONG), 91);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setEventDuration", "com.mp4parser.iso23009.part1.EventMessageBox", Constants.LONG, "eventDuration", "", Constants.VOID), 95);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.schemeIdUri = yyp.m216554g(byteBuffer);
        this.value = yyp.m216554g(byteBuffer);
        this.timescale = yyp.m216558k(byteBuffer);
        this.presentationTimeDelta = yyp.m216558k(byteBuffer);
        this.eventDuration = yyp.m216558k(byteBuffer);
        this.f14809id = yyp.m216558k(byteBuffer);
        byte[] bArr = new byte[byteBuffer.remaining()];
        this.messageData = bArr;
        byteBuffer.get(bArr);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        bzp.m104639k(byteBuffer, this.schemeIdUri);
        bzp.m104639k(byteBuffer, this.value);
        bzp.m104635g(byteBuffer, this.timescale);
        bzp.m104635g(byteBuffer, this.presentationTimeDelta);
        bzp.m104635g(byteBuffer, this.eventDuration);
        bzp.m104635g(byteBuffer, this.f14809id);
        byteBuffer.put(this.messageData);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return mck0.m154018c(this.schemeIdUri) + 22 + mck0.m154018c(this.value) + this.messageData.length;
    }

    public long getEventDuration() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_8, this, this));
        return this.eventDuration;
    }

    public long getId() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_10, this, this));
        return this.f14809id;
    }

    public byte[] getMessageData() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_12, this, this));
        return this.messageData;
    }

    public long getPresentationTimeDelta() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_6, this, this));
        return this.presentationTimeDelta;
    }

    public String getSchemeIdUri() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.schemeIdUri;
    }

    public long getTimescale() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.timescale;
    }

    public String getValue() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.value;
    }

    public void setEventDuration(long j) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_9, this, this, Conversions.longObject(j)));
        this.eventDuration = j;
    }

    public void setId(long j) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_11, this, this, Conversions.longObject(j)));
        this.f14809id = j;
    }

    public void setMessageData(byte[] bArr) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_13, this, this, bArr));
        this.messageData = bArr;
    }

    public void setPresentationTimeDelta(long j) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_7, this, this, Conversions.longObject(j)));
        this.presentationTimeDelta = j;
    }

    public void setSchemeIdUri(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, str));
        this.schemeIdUri = str;
    }

    public void setTimescale(long j) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_5, this, this, Conversions.longObject(j)));
        this.timescale = j;
    }

    public void setValue(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this, str));
        this.value = str;
    }
}
