package com.mp4parser.iso14496.part12;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.b1q;
import p153l.f3d0;
import p153l.rn4;
import p153l.w0q;
import p153l.y0q;

/* JADX INFO: loaded from: classes8.dex */
public class SampleAuxiliaryInformationSizesBox extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final String TYPE = "saiz";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_10 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_11 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9 = null;
    private String auxInfoType;
    private String auxInfoTypeParameter;
    private short defaultSampleInfoSize;
    private int sampleCount;
    private short[] sampleInfoSizes;

    static {
        ajc$preClinit();
    }

    public SampleAuxiliaryInformationSizesBox() {
        super(TYPE);
        this.sampleInfoSizes = new short[0];
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("SampleAuxiliaryInformationSizesBox.java", SampleAuxiliaryInformationSizesBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSize", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", Constants.INT, FirebaseAnalytics.Param.INDEX, "", Constants.SHORT), 57);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAuxInfoType", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 107);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSampleCount", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", Constants.INT, "sampleCount", "", Constants.VOID), 144);
        ajc$tjp_11 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 149);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setAuxInfoType", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "java.lang.String", "auxInfoType", "", Constants.VOID), 111);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAuxInfoTypeParameter", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "java.lang.String"), 115);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setAuxInfoTypeParameter", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "java.lang.String", "auxInfoTypeParameter", "", Constants.VOID), 119);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDefaultSampleInfoSize", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", Constants.INT), 123);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDefaultSampleInfoSize", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", Constants.INT, "defaultSampleInfoSize", "", Constants.VOID), 127);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSampleInfoSizes", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", "[S"), CipherSuite.TLS_RSA_WITH_CAMELLIA_256_CBC_SHA);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSampleInfoSizes", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "[S", "sampleInfoSizes", "", Constants.VOID), CipherSuite.TLS_DHE_RSA_WITH_CAMELLIA_256_CBC_SHA);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSampleCount", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationSizesBox", "", "", "", Constants.INT), 140);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.auxInfoType = y0q.m213886b(byteBuffer);
            this.auxInfoTypeParameter = y0q.m213886b(byteBuffer);
        }
        this.defaultSampleInfoSize = (short) y0q.m213898n(byteBuffer);
        int iM182119a = rn4.m182119a(y0q.m213895k(byteBuffer));
        this.sampleCount = iM182119a;
        if (this.defaultSampleInfoSize == 0) {
            this.sampleInfoSizes = new short[iM182119a];
            for (int i = 0; i < this.sampleCount; i++) {
                this.sampleInfoSizes[i] = (short) y0q.m213898n(byteBuffer);
            }
        }
    }

    public String getAuxInfoType() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this));
        return this.auxInfoType;
    }

    public String getAuxInfoTypeParameter() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this));
        return this.auxInfoTypeParameter;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) == 1) {
            byteBuffer.put(w0q.m204214d(this.auxInfoType));
            byteBuffer.put(w0q.m204214d(this.auxInfoTypeParameter));
        }
        b1q.m101498j(byteBuffer, this.defaultSampleInfoSize);
        if (this.defaultSampleInfoSize != 0) {
            b1q.m101495g(byteBuffer, this.sampleCount);
            return;
        }
        b1q.m101495g(byteBuffer, this.sampleInfoSizes.length);
        short[] sArr = this.sampleInfoSizes;
        for (short s : sArr) {
            b1q.m101498j(byteBuffer, s);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return ((getFlags() & 1) == 1 ? 12 : 4) + 5 + (this.defaultSampleInfoSize == 0 ? this.sampleInfoSizes.length : 0);
    }

    public int getDefaultSampleInfoSize() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_5, this, this));
        return this.defaultSampleInfoSize;
    }

    public int getSampleCount() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_9, this, this));
        return this.sampleCount;
    }

    public short[] getSampleInfoSizes() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_7, this, this));
        short[] sArr = this.sampleInfoSizes;
        return Arrays.copyOf(sArr, sArr.length);
    }

    public short getSize(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this, Conversions.intObject(i)));
        return getDefaultSampleInfoSize() == 0 ? this.sampleInfoSizes[i] : this.defaultSampleInfoSize;
    }

    public void setAuxInfoType(String str) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this, str));
        this.auxInfoType = str;
    }

    public void setAuxInfoTypeParameter(String str) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_4, this, this, str));
        this.auxInfoTypeParameter = str;
    }

    public void setDefaultSampleInfoSize(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_6, this, this, Conversions.intObject(i)));
        this.defaultSampleInfoSize = (short) i;
    }

    public void setSampleCount(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_10, this, this, Conversions.intObject(i)));
        this.sampleCount = i;
    }

    public void setSampleInfoSizes(short[] sArr) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_8, this, this, sArr));
        this.sampleInfoSizes = Arrays.copyOf(sArr, sArr.length);
    }

    public String toString() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_11, this, this));
        return "SampleAuxiliaryInformationSizesBox{defaultSampleInfoSize=" + ((int) this.defaultSampleInfoSize) + ", sampleCount=" + this.sampleCount + ", auxInfoType='" + this.auxInfoType + "', auxInfoTypeParameter='" + this.auxInfoTypeParameter + "'}";
    }
}
