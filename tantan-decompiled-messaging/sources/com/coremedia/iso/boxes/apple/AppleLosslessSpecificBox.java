package com.coremedia.iso.boxes.apple;

import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import p149l.bzp;
import p149l.cvc0;
import p149l.yyp;

/* JADX INFO: loaded from: classes.dex */
public final class AppleLosslessSpecificBox extends AbstractFullBox {
    public static final String TYPE = "alac";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_10 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_11 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_12 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_13 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_14 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_15 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_16 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_17 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_18 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_19 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_20 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_21 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9 = null;
    private long bitRate;
    private int channels;
    private int historyMult;
    private int initialHistory;
    private int kModifier;
    private long maxCodedFrameSize;
    private long maxSamplePerFrame;
    private long sampleRate;
    private int sampleSize;
    private int unknown1;
    private int unknown2;

    static {
        ajc$preClinit();
    }

    public AppleLosslessSpecificBox() {
        super("alac");
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("AppleLosslessSpecificBox.java", AppleLosslessSpecificBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getMaxSamplePerFrame", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", Constants.LONG), 34);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setMaxSamplePerFrame", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", Constants.INT, "maxSamplePerFrame", "", Constants.VOID), 38);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getKModifier", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", Constants.INT), 74);
        ajc$tjp_11 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setKModifier", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", Constants.INT, "kModifier", "", Constants.VOID), 78);
        ajc$tjp_12 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getChannels", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", Constants.INT), 82);
        ajc$tjp_13 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setChannels", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", Constants.INT, "channels", "", Constants.VOID), 86);
        ajc$tjp_14 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getUnknown2", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", Constants.INT), 90);
        ajc$tjp_15 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setUnknown2", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", Constants.INT, "unknown2", "", Constants.VOID), 94);
        ajc$tjp_16 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getMaxCodedFrameSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", Constants.LONG), 98);
        ajc$tjp_17 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setMaxCodedFrameSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", Constants.INT, "maxCodedFrameSize", "", Constants.VOID), 102);
        ajc$tjp_18 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getBitRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", Constants.LONG), 106);
        ajc$tjp_19 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setBitRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", Constants.INT, "bitRate", "", Constants.VOID), 110);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getUnknown1", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", Constants.INT), 42);
        ajc$tjp_20 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSampleRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", Constants.LONG), 114);
        ajc$tjp_21 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSampleRate", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", Constants.INT, "sampleRate", "", Constants.VOID), 118);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setUnknown1", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", Constants.INT, "unknown1", "", Constants.VOID), 46);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSampleSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", Constants.INT), 50);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSampleSize", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", Constants.INT, "sampleSize", "", Constants.VOID), 54);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getHistoryMult", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", Constants.INT), 58);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setHistoryMult", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", Constants.INT, "historyMult", "", Constants.VOID), 62);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getInitialHistory", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", "", "", "", Constants.INT), 66);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setInitialHistory", "com.coremedia.iso.boxes.apple.AppleLosslessSpecificBox", Constants.INT, "initialHistory", "", Constants.VOID), 70);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.maxSamplePerFrame = yyp.m216558k(byteBuffer);
        this.unknown1 = yyp.m216561n(byteBuffer);
        this.sampleSize = yyp.m216561n(byteBuffer);
        this.historyMult = yyp.m216561n(byteBuffer);
        this.initialHistory = yyp.m216561n(byteBuffer);
        this.kModifier = yyp.m216561n(byteBuffer);
        this.channels = yyp.m216561n(byteBuffer);
        this.unknown2 = yyp.m216556i(byteBuffer);
        this.maxCodedFrameSize = yyp.m216558k(byteBuffer);
        this.bitRate = yyp.m216558k(byteBuffer);
        this.sampleRate = yyp.m216558k(byteBuffer);
    }

    public long getBitRate() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_18, this, this));
        return this.bitRate;
    }

    public int getChannels() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_12, this, this));
        return this.channels;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        bzp.m104635g(byteBuffer, this.maxSamplePerFrame);
        bzp.m104638j(byteBuffer, this.unknown1);
        bzp.m104638j(byteBuffer, this.sampleSize);
        bzp.m104638j(byteBuffer, this.historyMult);
        bzp.m104638j(byteBuffer, this.initialHistory);
        bzp.m104638j(byteBuffer, this.kModifier);
        bzp.m104638j(byteBuffer, this.channels);
        bzp.m104633e(byteBuffer, this.unknown2);
        bzp.m104635g(byteBuffer, this.maxCodedFrameSize);
        bzp.m104635g(byteBuffer, this.bitRate);
        bzp.m104635g(byteBuffer, this.sampleRate);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 28L;
    }

    public int getHistoryMult() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_6, this, this));
        return this.historyMult;
    }

    public int getInitialHistory() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_8, this, this));
        return this.initialHistory;
    }

    public int getKModifier() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_10, this, this));
        return this.kModifier;
    }

    public long getMaxCodedFrameSize() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_16, this, this));
        return this.maxCodedFrameSize;
    }

    public long getMaxSamplePerFrame() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.maxSamplePerFrame;
    }

    public long getSampleRate() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_20, this, this));
        return this.sampleRate;
    }

    public int getSampleSize() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.sampleSize;
    }

    public int getUnknown1() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.unknown1;
    }

    public int getUnknown2() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_14, this, this));
        return this.unknown2;
    }

    public void setBitRate(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_19, this, this, Conversions.intObject(i)));
        this.bitRate = i;
    }

    public void setChannels(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_13, this, this, Conversions.intObject(i)));
        this.channels = i;
    }

    public void setHistoryMult(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_7, this, this, Conversions.intObject(i)));
        this.historyMult = i;
    }

    public void setInitialHistory(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_9, this, this, Conversions.intObject(i)));
        this.initialHistory = i;
    }

    public void setKModifier(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_11, this, this, Conversions.intObject(i)));
        this.kModifier = i;
    }

    public void setMaxCodedFrameSize(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_17, this, this, Conversions.intObject(i)));
        this.maxCodedFrameSize = i;
    }

    public void setMaxSamplePerFrame(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        this.maxSamplePerFrame = i;
    }

    public void setSampleRate(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_21, this, this, Conversions.intObject(i)));
        this.sampleRate = i;
    }

    public void setSampleSize(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_5, this, this, Conversions.intObject(i)));
        this.sampleSize = i;
    }

    public void setUnknown1(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i)));
        this.unknown1 = i;
    }

    public void setUnknown2(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_15, this, this, Conversions.intObject(i)));
        this.unknown2 = i;
    }
}
