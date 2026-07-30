package com.mp4parser.iso14496.part15;

import com.googlecode.mp4parser.AbstractBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.f3d0;
import p153l.qp1;

/* JADX INFO: loaded from: classes8.dex */
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
    public qp1 avcDecoderConfigurationRecord;

    static {
        ajc$preClinit();
    }

    public AvcConfigurationBox() {
        super(TYPE);
        this.avcDecoderConfigurationRecord = new qp1();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("AvcConfigurationBox.java", AvcConfigurationBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", Constants.INT), 44);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", Constants.INT), 48);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", Constants.INT, "avcLevelIndication", "", Constants.VOID), 84);
        ajc$tjp_11 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", Constants.INT, "lengthSizeMinusOne", "", Constants.VOID), 88);
        ajc$tjp_12 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSets", "", Constants.VOID), 92);
        ajc$tjp_13 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "pictureParameterSets", "", Constants.VOID), 96);
        ajc$tjp_14 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", Constants.INT), 100);
        ajc$tjp_15 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setChromaFormat", "com.mp4parser.iso14496.part15.AvcConfigurationBox", Constants.INT, "chromaFormat", "", Constants.VOID), 104);
        ajc$tjp_16 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", Constants.INT), 108);
        ajc$tjp_17 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setBitDepthLumaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", Constants.INT, "bitDepthLumaMinus8", "", Constants.VOID), 112);
        ajc$tjp_18 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", Constants.INT), 116);
        ajc$tjp_19 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setBitDepthChromaMinus8", "com.mp4parser.iso14496.part15.AvcConfigurationBox", Constants.INT, "bitDepthChromaMinus8", "", Constants.VOID), 120);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", Constants.INT), 52);
        ajc$tjp_20 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 124);
        ajc$tjp_21 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSequenceParameterSetExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.util.List", "sequenceParameterSetExts", "", Constants.VOID), 128);
        ajc$tjp_22 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "hasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", Constants.BOOLEAN), CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA);
        ajc$tjp_23 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setHasExts", "com.mp4parser.iso14496.part15.AvcConfigurationBox", Constants.BOOLEAN, "hasExts", "", Constants.VOID), CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA);
        ajc$tjp_24 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getContentSize", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", Constants.LONG), CipherSuite.TLS_RSA_PSK_WITH_3DES_EDE_CBC_SHA);
        ajc$tjp_25 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getContent", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "java.nio.ByteBuffer", "byteBuffer", "", Constants.VOID), 153);
        ajc$tjp_26 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "[Ljava.lang.String;"), 158);
        ajc$tjp_27 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getPPS", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "[Ljava.lang.String;"), 162);
        ajc$tjp_28 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getavcDecoderConfigurationRecord", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"), 167);
        ajc$tjp_29 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.lang.String"), CipherSuite.TLS_RSA_PSK_WITH_AES_128_GCM_SHA256);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAvcLevelIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", Constants.INT), 56);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getLengthSizeMinusOne", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", Constants.INT), 60);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSequenceParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 64);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getPictureParameterSets", "com.mp4parser.iso14496.part15.AvcConfigurationBox", "", "", "", "java.util.List"), 68);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setConfigurationVersion", "com.mp4parser.iso14496.part15.AvcConfigurationBox", Constants.INT, "configurationVersion", "", Constants.VOID), 72);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setAvcProfileIndication", "com.mp4parser.iso14496.part15.AvcConfigurationBox", Constants.INT, "avcProfileIndication", "", Constants.VOID), 76);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setProfileCompatibility", "com.mp4parser.iso14496.part15.AvcConfigurationBox", Constants.INT, "profileCompatibility", "", Constants.VOID), 80);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.avcDecoderConfigurationRecord = new qp1(byteBuffer);
    }

    public int getAvcLevelIndication() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this));
        return this.avcDecoderConfigurationRecord.f158803d;
    }

    public int getAvcProfileIndication() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this));
        return this.avcDecoderConfigurationRecord.f158801b;
    }

    public int getBitDepthChromaMinus8() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_18, this, this));
        return this.avcDecoderConfigurationRecord.f158810k;
    }

    public int getBitDepthLumaMinus8() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_16, this, this));
        return this.avcDecoderConfigurationRecord.f158809j;
    }

    public int getChromaFormat() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_14, this, this));
        return this.avcDecoderConfigurationRecord.f158808i;
    }

    public int getConfigurationVersion() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.avcDecoderConfigurationRecord.f158800a;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_25, this, this, byteBuffer));
        this.avcDecoderConfigurationRecord.m177392a(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_24, this, this));
        return this.avcDecoderConfigurationRecord.m177393b();
    }

    public int getLengthSizeMinusOne() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.avcDecoderConfigurationRecord.f158804e;
    }

    public String[] getPPS() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_27, this, this));
        return this.avcDecoderConfigurationRecord.m177394c();
    }

    public List<byte[]> getPictureParameterSets() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_6, this, this));
        return Collections.unmodifiableList(this.avcDecoderConfigurationRecord.f158806g);
    }

    public int getProfileCompatibility() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.avcDecoderConfigurationRecord.f158802c;
    }

    public String[] getSPS() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_26, this, this));
        return this.avcDecoderConfigurationRecord.m177396e();
    }

    public List<byte[]> getSequenceParameterSetExts() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_20, this, this));
        return this.avcDecoderConfigurationRecord.f158811l;
    }

    public List<byte[]> getSequenceParameterSets() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_5, this, this));
        return Collections.unmodifiableList(this.avcDecoderConfigurationRecord.f158805f);
    }

    public qp1 getavcDecoderConfigurationRecord() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_28, this, this));
        return this.avcDecoderConfigurationRecord;
    }

    public boolean hasExts() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_22, this, this));
        return this.avcDecoderConfigurationRecord.f158807h;
    }

    public void setAvcLevelIndication(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_10, this, this, Conversions.intObject(i)));
        this.avcDecoderConfigurationRecord.f158803d = i;
    }

    public void setAvcProfileIndication(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_8, this, this, Conversions.intObject(i)));
        this.avcDecoderConfigurationRecord.f158801b = i;
    }

    public void setBitDepthChromaMinus8(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_19, this, this, Conversions.intObject(i)));
        this.avcDecoderConfigurationRecord.f158810k = i;
    }

    public void setBitDepthLumaMinus8(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_17, this, this, Conversions.intObject(i)));
        this.avcDecoderConfigurationRecord.f158809j = i;
    }

    public void setChromaFormat(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_15, this, this, Conversions.intObject(i)));
        this.avcDecoderConfigurationRecord.f158808i = i;
    }

    public void setConfigurationVersion(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_7, this, this, Conversions.intObject(i)));
        this.avcDecoderConfigurationRecord.f158800a = i;
    }

    public void setHasExts(boolean z) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_23, this, this, Conversions.booleanObject(z)));
        this.avcDecoderConfigurationRecord.f158807h = z;
    }

    public void setLengthSizeMinusOne(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_11, this, this, Conversions.intObject(i)));
        this.avcDecoderConfigurationRecord.f158804e = i;
    }

    public void setPictureParameterSets(List<byte[]> list) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_13, this, this, list));
        this.avcDecoderConfigurationRecord.f158806g = list;
    }

    public void setProfileCompatibility(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_9, this, this, Conversions.intObject(i)));
        this.avcDecoderConfigurationRecord.f158802c = i;
    }

    public void setSequenceParameterSetExts(List<byte[]> list) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_21, this, this, list));
        this.avcDecoderConfigurationRecord.f158811l = list;
    }

    public void setSequenceParameterSets(List<byte[]> list) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_12, this, this, list));
        this.avcDecoderConfigurationRecord.f158805f = list;
    }

    public String toString() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_29, this, this));
        return "AvcConfigurationBox{avcDecoderConfigurationRecord=" + this.avcDecoderConfigurationRecord + '}';
    }
}
