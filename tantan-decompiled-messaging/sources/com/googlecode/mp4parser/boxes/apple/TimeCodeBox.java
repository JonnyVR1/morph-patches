package com.googlecode.mp4parser.boxes.apple;

import com.coremedia.iso.boxes.sampleentry.SampleEntry;
import com.googlecode.mp4parser.AbstractBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.bzp;
import p149l.cvc0;
import p149l.yyp;

/* JADX INFO: loaded from: classes7.dex */
public class TimeCodeBox extends AbstractBox implements SampleEntry {
    public static final String TYPE = "tmcd";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_10 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_11 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_12 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_13 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_14 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_15 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_16 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9 = null;
    int dataReferenceIndex;
    long flags;
    int frameDuration;
    int numberOfFrames;
    int reserved1;
    int reserved2;
    byte[] rest;
    int timeScale;

    static {
        ajc$preClinit();
    }

    public TimeCodeBox() {
        super(TYPE);
        this.rest = new byte[0];
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("TimeCodeBox.java", TimeCodeBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDataReferenceIndex", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", Constants.INT), 81);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDataReferenceIndex", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", Constants.INT, "dataReferenceIndex", "", Constants.VOID), 85);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setReserved1", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", Constants.INT, "reserved1", "", Constants.VOID), 130);
        ajc$tjp_11 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getReserved2", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", Constants.INT), 134);
        ajc$tjp_12 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setReserved2", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", Constants.INT, "reserved2", "", Constants.VOID), CipherSuite.TLS_PSK_WITH_RC4_128_SHA);
        ajc$tjp_13 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getFlags", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", Constants.LONG), CipherSuite.TLS_DHE_PSK_WITH_RC4_128_SHA);
        ajc$tjp_14 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setFlags", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", Constants.LONG, "flags", "", Constants.VOID), CipherSuite.TLS_RSA_PSK_WITH_RC4_128_SHA);
        ajc$tjp_15 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getRest", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "[B"), 150);
        ajc$tjp_16 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setRest", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "[B", "rest", "", Constants.VOID), 154);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", "java.lang.String"), 91);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getTimeScale", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", Constants.INT), 102);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setTimeScale", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", Constants.INT, "timeScale", "", Constants.VOID), 106);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getFrameDuration", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", Constants.INT), 110);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setFrameDuration", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", Constants.INT, "frameDuration", "", Constants.VOID), 114);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getNumberOfFrames", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", Constants.INT), 118);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setNumberOfFrames", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", Constants.INT, "numberOfFrames", "", Constants.VOID), 122);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getReserved1", "com.googlecode.mp4parser.boxes.apple.TimeCodeBox", "", "", "", Constants.INT), 126);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        byteBuffer.position(6);
        this.dataReferenceIndex = yyp.m216556i(byteBuffer);
        this.reserved1 = byteBuffer.getInt();
        this.flags = yyp.m216558k(byteBuffer);
        this.timeScale = byteBuffer.getInt();
        this.frameDuration = byteBuffer.getInt();
        this.numberOfFrames = yyp.m216561n(byteBuffer);
        this.reserved2 = yyp.m216557j(byteBuffer);
        byte[] bArr = new byte[byteBuffer.remaining()];
        this.rest = bArr;
        byteBuffer.get(bArr);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        byteBuffer.put(new byte[6]);
        bzp.m104633e(byteBuffer, this.dataReferenceIndex);
        byteBuffer.putInt(this.reserved1);
        bzp.m104635g(byteBuffer, this.flags);
        byteBuffer.putInt(this.timeScale);
        byteBuffer.putInt(this.frameDuration);
        bzp.m104638j(byteBuffer, this.numberOfFrames);
        bzp.m104634f(byteBuffer, this.reserved2);
        byteBuffer.put(this.rest);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return this.rest.length + 28;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry
    public int getDataReferenceIndex() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.dataReferenceIndex;
    }

    public long getFlags() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_13, this, this));
        return this.flags;
    }

    public int getFrameDuration() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_5, this, this));
        return this.frameDuration;
    }

    public int getNumberOfFrames() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_7, this, this));
        return this.numberOfFrames;
    }

    public int getReserved1() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_9, this, this));
        return this.reserved1;
    }

    public int getReserved2() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_11, this, this));
        return this.reserved2;
    }

    public byte[] getRest() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_15, this, this));
        return this.rest;
    }

    public int getTimeScale() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this));
        return this.timeScale;
    }

    @Override // com.coremedia.iso.boxes.sampleentry.SampleEntry
    public void setDataReferenceIndex(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        this.dataReferenceIndex = i;
    }

    public void setFlags(long j) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_14, this, this, Conversions.longObject(j)));
        this.flags = j;
    }

    public void setFrameDuration(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_6, this, this, Conversions.intObject(i)));
        this.frameDuration = i;
    }

    public void setNumberOfFrames(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_8, this, this, Conversions.intObject(i)));
        this.numberOfFrames = i;
    }

    public void setReserved1(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_10, this, this, Conversions.intObject(i)));
        this.reserved1 = i;
    }

    public void setReserved2(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_12, this, this, Conversions.intObject(i)));
        this.reserved2 = i;
    }

    public void setRest(byte[] bArr) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_16, this, this, bArr));
        this.rest = bArr;
    }

    public void setTimeScale(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_4, this, this, Conversions.intObject(i)));
        this.timeScale = i;
    }

    public String toString() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return "TimeCodeBox{timeScale=" + this.timeScale + ", frameDuration=" + this.frameDuration + ", numberOfFrames=" + this.numberOfFrames + ", reserved1=" + this.reserved1 + ", reserved2=" + this.reserved2 + ", flags=" + this.flags + '}';
    }
}
