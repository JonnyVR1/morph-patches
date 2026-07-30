package com.mp4parser.iso14496.part15;

import com.googlecode.mp4parser.AbstractBox;
import com.momo.xeengine.gift.GiftLogEvent;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import l.cvc0;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import p007l.jp1;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public final class AvcConfigurationBox extends AbstractBox {
    public static final String TYPE = "avcC";
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
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_22 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_23 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_24 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_25 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_26 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_27 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_28 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_29 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9 = null;
    public jp1 avcDecoderConfigurationRecord;

    static {
        ajc$preClinit();
    }

    public AvcConfigurationBox() {
        super(TYPE);
        this.avcDecoderConfigurationRecord = new jp1();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("AvcConfigurationBox.java", AvcConfigurationBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 44);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 48);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcLevelIndication", "", "void"), 84);
        ajc$tjp_11 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "lengthSizeMinusOne", "", "void"), 88);
        ajc$tjp_12 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "", "void"), 92);
        ajc$tjp_13 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "", "void"), 96);
        ajc$tjp_14 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 100);
        ajc$tjp_15 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "chromaFormat", "", "void"), 104);
        ajc$tjp_16 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 108);
        ajc$tjp_17 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthLumaMinus8", "", "void"), 112);
        ajc$tjp_18 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 116);
        ajc$tjp_19 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "bitDepthChromaMinus8", "", "void"), 120);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 52);
        ajc$tjp_20 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 124);
        ajc$tjp_21 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "", "void"), 128);
        ajc$tjp_22 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "boolean"), 132);
        ajc$tjp_23 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "boolean", "hasExts", "", "void"), 136);
        ajc$tjp_24 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "long"), 147);
        ajc$tjp_25 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "", "void"), 153);
        ajc$tjp_26 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "[Ljava.lang.String;"), 158);
        ajc$tjp_27 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "[Ljava.lang.String;"), 162);
        ajc$tjp_28 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"), 167);
        ajc$tjp_29 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.lang.String"), 172);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 56);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "int"), 60);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 64);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 68);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "configurationVersion", "", "void"), 72);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "avcProfileIndication", "", "void"), 76);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "int", "profileCompatibility", "", "void"), 80);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        this.avcDecoderConfigurationRecord = new jp1(byteBuffer);
    }

    public int getAvcLevelIndication() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_3, this, this));
        return this.avcDecoderConfigurationRecord.f3004d;
    }

    public int getAvcProfileIndication() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_1, this, this));
        return this.avcDecoderConfigurationRecord.f3002b;
    }

    public int getBitDepthChromaMinus8() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_18, this, this));
        return this.avcDecoderConfigurationRecord.f3011k;
    }

    public int getBitDepthLumaMinus8() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_16, this, this));
        return this.avcDecoderConfigurationRecord.f3010j;
    }

    public int getChromaFormat() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_14, this, this));
        return this.avcDecoderConfigurationRecord.f3009i;
    }

    public int getConfigurationVersion() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.avcDecoderConfigurationRecord.f3001a;
    }

    public void getContent(ByteBuffer byteBuffer) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_25, this, this, byteBuffer));
        this.avcDecoderConfigurationRecord.m9540a(byteBuffer);
    }

    public long getContentSize() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_24, this, this));
        return this.avcDecoderConfigurationRecord.m9541b();
    }

    public int getLengthSizeMinusOne() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.avcDecoderConfigurationRecord.f3005e;
    }

    public String[] getPPS() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_27, this, this));
        return this.avcDecoderConfigurationRecord.m9542c();
    }

    public List<byte[]> getPictureParameterSets() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_6, this, this));
        return Collections.unmodifiableList(this.avcDecoderConfigurationRecord.f3007g);
    }

    public int getProfileCompatibility() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.avcDecoderConfigurationRecord.f3003c;
    }

    public String[] getSPS() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_26, this, this));
        return this.avcDecoderConfigurationRecord.m9544e();
    }

    public List<byte[]> getSequenceParameterSetExts() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_20, this, this));
        return this.avcDecoderConfigurationRecord.f3012l;
    }

    public List<byte[]> getSequenceParameterSets() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_5, this, this));
        return Collections.unmodifiableList(this.avcDecoderConfigurationRecord.f3006f);
    }

    public jp1 getavcDecoderConfigurationRecord() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_28, this, this));
        return this.avcDecoderConfigurationRecord;
    }

    public boolean hasExts() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_22, this, this));
        return this.avcDecoderConfigurationRecord.f3008h;
    }

    public void setAvcLevelIndication(int i) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_10, this, this, Conversions.intObject(i)));
        this.avcDecoderConfigurationRecord.f3004d = i;
    }

    public void setAvcProfileIndication(int i) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_8, this, this, Conversions.intObject(i)));
        this.avcDecoderConfigurationRecord.f3002b = i;
    }

    public void setBitDepthChromaMinus8(int i) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_19, this, this, Conversions.intObject(i)));
        this.avcDecoderConfigurationRecord.f3011k = i;
    }

    public void setBitDepthLumaMinus8(int i) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_17, this, this, Conversions.intObject(i)));
        this.avcDecoderConfigurationRecord.f3010j = i;
    }

    public void setChromaFormat(int i) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_15, this, this, Conversions.intObject(i)));
        this.avcDecoderConfigurationRecord.f3009i = i;
    }

    public void setConfigurationVersion(int i) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_7, this, this, Conversions.intObject(i)));
        this.avcDecoderConfigurationRecord.f3001a = i;
    }

    public void setHasExts(boolean z) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_23, this, this, Conversions.booleanObject(z)));
        this.avcDecoderConfigurationRecord.f3008h = z;
    }

    public void setLengthSizeMinusOne(int i) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_11, this, this, Conversions.intObject(i)));
        this.avcDecoderConfigurationRecord.f3005e = i;
    }

    public void setPictureParameterSets(List<byte[]> list) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_13, this, this, list));
        this.avcDecoderConfigurationRecord.f3007g = list;
    }

    public void setProfileCompatibility(int i) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_9, this, this, Conversions.intObject(i)));
        this.avcDecoderConfigurationRecord.f3003c = i;
    }

    public void setSequenceParameterSetExts(List<byte[]> list) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_21, this, this, list));
        this.avcDecoderConfigurationRecord.f3012l = list;
    }

    public void setSequenceParameterSets(List<byte[]> list) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_12, this, this, list));
        this.avcDecoderConfigurationRecord.f3006f = list;
    }

    public String toString() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_29, this, this));
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.avcDecoderConfigurationRecord + '}';
    }
}
