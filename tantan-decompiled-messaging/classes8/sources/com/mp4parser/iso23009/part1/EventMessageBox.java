package com.mp4parser.iso23009.part1;

import com.googlecode.mp4parser.AbstractFullBox;
import com.momo.xeengine.gift.GiftLogEvent;
import java.nio.ByteBuffer;
import l.bzp;
import l.cvc0;
import l.mck0;
import l.yyp;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
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
    long f508id;
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
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getSchemeIdUri", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "java.lang.String"), 59);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setSchemeIdUri", "com.mp4parser.iso23009.part1.EventMessageBox", "java.lang.String", "schemeIdUri", "", "void"), 63);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getId", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "long"), 99);
        ajc$tjp_11 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setId", "com.mp4parser.iso23009.part1.EventMessageBox", "long", "id", "", "void"), 103);
        ajc$tjp_12 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getMessageData", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "[B"), 107);
        ajc$tjp_13 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setMessageData", "com.mp4parser.iso23009.part1.EventMessageBox", "[B", "messageData", "", "void"), 111);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getValue", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "java.lang.String"), 67);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setValue", "com.mp4parser.iso23009.part1.EventMessageBox", "java.lang.String", "value", "", "void"), 71);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getTimescale", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "long"), 75);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setTimescale", "com.mp4parser.iso23009.part1.EventMessageBox", "long", "timescale", "", "void"), 79);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getPresentationTimeDelta", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "long"), 83);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setPresentationTimeDelta", "com.mp4parser.iso23009.part1.EventMessageBox", "long", "presentationTimeDelta", "", "void"), 87);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getEventDuration", "com.mp4parser.iso23009.part1.EventMessageBox", "", "", "", "long"), 91);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setEventDuration", "com.mp4parser.iso23009.part1.EventMessageBox", "long", "eventDuration", "", "void"), 95);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.schemeIdUri = yyp.g(byteBuffer);
        this.value = yyp.g(byteBuffer);
        this.timescale = yyp.k(byteBuffer);
        this.presentationTimeDelta = yyp.k(byteBuffer);
        this.eventDuration = yyp.k(byteBuffer);
        this.f508id = yyp.k(byteBuffer);
        byte[] bArr = new byte[byteBuffer.remaining()];
        this.messageData = bArr;
        byteBuffer.get(bArr);
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        bzp.k(byteBuffer, this.schemeIdUri);
        bzp.k(byteBuffer, this.value);
        bzp.g(byteBuffer, this.timescale);
        bzp.g(byteBuffer, this.presentationTimeDelta);
        bzp.g(byteBuffer, this.eventDuration);
        bzp.g(byteBuffer, this.f508id);
        byteBuffer.put(this.messageData);
    }

    public long getContentSize() {
        return mck0.c(this.schemeIdUri) + 22 + mck0.c(this.value) + this.messageData.length;
    }

    public long getEventDuration() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_8, this, this));
        return this.eventDuration;
    }

    public long getId() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_10, this, this));
        return this.f508id;
    }

    public byte[] getMessageData() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_12, this, this));
        return this.messageData;
    }

    public long getPresentationTimeDelta() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_6, this, this));
        return this.presentationTimeDelta;
    }

    public String getSchemeIdUri() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.schemeIdUri;
    }

    public long getTimescale() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.timescale;
    }

    public String getValue() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.value;
    }

    public void setEventDuration(long j) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_9, this, this, Conversions.longObject(j)));
        this.eventDuration = j;
    }

    public void setId(long j) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_11, this, this, Conversions.longObject(j)));
        this.f508id = j;
    }

    public void setMessageData(byte[] bArr) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_13, this, this, bArr));
        this.messageData = bArr;
    }

    public void setPresentationTimeDelta(long j) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_7, this, this, Conversions.longObject(j)));
        this.presentationTimeDelta = j;
    }

    public void setSchemeIdUri(String str) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_1, this, this, str));
        this.schemeIdUri = str;
    }

    public void setTimescale(long j) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_5, this, this, Conversions.longObject(j)));
        this.timescale = j;
    }

    public void setValue(String str) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_3, this, this, str));
        this.value = str;
    }
}
