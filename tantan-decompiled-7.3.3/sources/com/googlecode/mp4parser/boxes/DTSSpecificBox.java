package com.googlecode.mp4parser.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.meituan.robust.Constants;
import com.momo.momortc.MMConstants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import org.spongycastle.crypto.tls.CipherSuite;
import p153l.b1q;
import p153l.f3d0;
import p153l.g13;
import p153l.i13;
import p153l.y0q;

/* JADX INFO: loaded from: classes7.dex */
public class DTSSpecificBox extends AbstractBox {
    public static final String TYPE = "ddts";
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
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_30 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_31 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9 = null;
    long DTSSamplingFrequency;
    int LBRDurationMod;
    long avgBitRate;
    int channelLayout;
    int coreLFEPresent;
    int coreLayout;
    int coreSize;
    int frameDuration;
    long maxBitRate;
    int multiAssetFlag;
    int pcmSampleDepth;
    int representationType;
    int reserved;
    int reservedBoxPresent;
    int stereoDownmix;
    int streamConstruction;

    static {
        ajc$preClinit();
    }

    public DTSSpecificBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("DTSSpecificBox.java", DTSSpecificBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAvgBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", Constants.LONG), 89);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setAvgBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", Constants.LONG, "avgBitRate", "", Constants.VOID), 93);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getStreamConstruction", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", Constants.INT), MMConstants.ERR_WATERMARK_READ);
        ajc$tjp_11 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setStreamConstruction", "com.googlecode.mp4parser.boxes.DTSSpecificBox", Constants.INT, "streamConstruction", "", Constants.VOID), CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA);
        ajc$tjp_12 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getCoreLFEPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", Constants.INT), CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA);
        ajc$tjp_13 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setCoreLFEPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", Constants.INT, "coreLFEPresent", "", Constants.VOID), CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA);
        ajc$tjp_14 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getCoreLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", Constants.INT), CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA);
        ajc$tjp_15 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setCoreLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", Constants.INT, "coreLayout", "", Constants.VOID), 149);
        ajc$tjp_16 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getCoreSize", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", Constants.INT), 153);
        ajc$tjp_17 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setCoreSize", "com.googlecode.mp4parser.boxes.DTSSpecificBox", Constants.INT, "coreSize", "", Constants.VOID), 157);
        ajc$tjp_18 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getStereoDownmix", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", Constants.INT), 161);
        ajc$tjp_19 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setStereoDownmix", "com.googlecode.mp4parser.boxes.DTSSpecificBox", Constants.INT, "stereoDownmix", "", Constants.VOID), 165);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDTSSamplingFrequency", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", Constants.LONG), 97);
        ajc$tjp_20 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getRepresentationType", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", Constants.INT), 169);
        ajc$tjp_21 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setRepresentationType", "com.googlecode.mp4parser.boxes.DTSSpecificBox", Constants.INT, "representationType", "", Constants.VOID), CipherSuite.TLS_RSA_PSK_WITH_AES_256_GCM_SHA384);
        ajc$tjp_22 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getChannelLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", Constants.INT), 177);
        ajc$tjp_23 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setChannelLayout", "com.googlecode.mp4parser.boxes.DTSSpecificBox", Constants.INT, "channelLayout", "", Constants.VOID), 181);
        ajc$tjp_24 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getMultiAssetFlag", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", Constants.INT), 185);
        ajc$tjp_25 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setMultiAssetFlag", "com.googlecode.mp4parser.boxes.DTSSpecificBox", Constants.INT, "multiAssetFlag", "", Constants.VOID), CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256);
        ajc$tjp_26 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getLBRDurationMod", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", Constants.INT), 193);
        ajc$tjp_27 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setLBRDurationMod", "com.googlecode.mp4parser.boxes.DTSSpecificBox", Constants.INT, "LBRDurationMod", "", Constants.VOID), CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256);
        ajc$tjp_28 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getReserved", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", Constants.INT), 201);
        ajc$tjp_29 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setReserved", "com.googlecode.mp4parser.boxes.DTSSpecificBox", Constants.INT, "reserved", "", Constants.VOID), 205);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDTSSamplingFrequency", "com.googlecode.mp4parser.boxes.DTSSpecificBox", Constants.LONG, "DTSSamplingFrequency", "", Constants.VOID), 101);
        ajc$tjp_30 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getReservedBoxPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", Constants.INT), 209);
        ajc$tjp_31 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setReservedBoxPresent", "com.googlecode.mp4parser.boxes.DTSSpecificBox", Constants.INT, "reservedBoxPresent", "", Constants.VOID), 213);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getMaxBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", Constants.LONG), 105);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setMaxBitRate", "com.googlecode.mp4parser.boxes.DTSSpecificBox", Constants.LONG, "maxBitRate", "", Constants.VOID), 109);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getPcmSampleDepth", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", Constants.INT), 113);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setPcmSampleDepth", "com.googlecode.mp4parser.boxes.DTSSpecificBox", Constants.INT, "pcmSampleDepth", "", Constants.VOID), 117);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getFrameDuration", "com.googlecode.mp4parser.boxes.DTSSpecificBox", "", "", "", Constants.INT), 121);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setFrameDuration", "com.googlecode.mp4parser.boxes.DTSSpecificBox", Constants.INT, "frameDuration", "", Constants.VOID), 125);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.DTSSamplingFrequency = y0q.m213895k(byteBuffer);
        this.maxBitRate = y0q.m213895k(byteBuffer);
        this.avgBitRate = y0q.m213895k(byteBuffer);
        this.pcmSampleDepth = y0q.m213898n(byteBuffer);
        g13 g13Var = new g13(byteBuffer);
        this.frameDuration = g13Var.m128488a(2);
        this.streamConstruction = g13Var.m128488a(5);
        this.coreLFEPresent = g13Var.m128488a(1);
        this.coreLayout = g13Var.m128488a(6);
        this.coreSize = g13Var.m128488a(14);
        this.stereoDownmix = g13Var.m128488a(1);
        this.representationType = g13Var.m128488a(3);
        this.channelLayout = g13Var.m128488a(16);
        this.multiAssetFlag = g13Var.m128488a(1);
        this.LBRDurationMod = g13Var.m128488a(1);
        this.reservedBoxPresent = g13Var.m128488a(1);
        this.reserved = g13Var.m128488a(5);
    }

    public long getAvgBitRate() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.avgBitRate;
    }

    public int getChannelLayout() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_22, this, this));
        return this.channelLayout;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        b1q.m101495g(byteBuffer, this.DTSSamplingFrequency);
        b1q.m101495g(byteBuffer, this.maxBitRate);
        b1q.m101495g(byteBuffer, this.avgBitRate);
        b1q.m101498j(byteBuffer, this.pcmSampleDepth);
        i13 i13Var = new i13(byteBuffer);
        i13Var.m138073a(this.frameDuration, 2);
        i13Var.m138073a(this.streamConstruction, 5);
        i13Var.m138073a(this.coreLFEPresent, 1);
        i13Var.m138073a(this.coreLayout, 6);
        i13Var.m138073a(this.coreSize, 14);
        i13Var.m138073a(this.stereoDownmix, 1);
        i13Var.m138073a(this.representationType, 3);
        i13Var.m138073a(this.channelLayout, 16);
        i13Var.m138073a(this.multiAssetFlag, 1);
        i13Var.m138073a(this.LBRDurationMod, 1);
        i13Var.m138073a(this.reservedBoxPresent, 1);
        i13Var.m138073a(this.reserved, 5);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 20L;
    }

    public int getCoreLFEPresent() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_12, this, this));
        return this.coreLFEPresent;
    }

    public int getCoreLayout() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_14, this, this));
        return this.coreLayout;
    }

    public int getCoreSize() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_16, this, this));
        return this.coreSize;
    }

    public long getDTSSamplingFrequency() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.DTSSamplingFrequency;
    }

    public int[] getDashAudioChannelConfiguration() {
        int i;
        int channelLayout = getChannelLayout();
        int i2 = 1;
        if ((channelLayout & 1) == 1) {
            i = 4;
        } else {
            i2 = 0;
            i = 0;
        }
        if ((channelLayout & 2) == 2) {
            i2 += 2;
            i |= 3;
        }
        if ((channelLayout & 4) == 4) {
            i2 += 2;
            i |= 48;
        }
        if ((channelLayout & 8) == 8) {
            i2++;
            i |= 8;
        }
        if ((channelLayout & 16) == 16) {
            i2++;
            i |= 256;
        }
        if ((channelLayout & 32) == 32) {
            i2 += 2;
            i |= 20480;
        }
        if ((channelLayout & 64) == 64) {
            i2 += 2;
            i |= 48;
        }
        if ((channelLayout & 128) == 128) {
            i2++;
            i |= 8192;
        }
        if ((channelLayout & 256) == 256) {
            i2++;
            i |= 2048;
        }
        if ((channelLayout & 512) == 512) {
            i2 += 2;
            i |= 192;
        }
        if ((channelLayout & 1024) == 1024) {
            i2 += 2;
            i |= 1536;
        }
        if ((channelLayout & 2048) == 2048) {
            i2 += 2;
            i |= 48;
        }
        if ((channelLayout & 4096) == 4096) {
            i2++;
            i |= 8;
        }
        if ((channelLayout & 8192) == 8192) {
            i2 += 2;
            i |= 48;
        }
        if ((channelLayout & 16384) == 16384) {
            i2++;
            i |= 65536;
        }
        if ((channelLayout & 32768) == 32768) {
            i2 += 2;
            i |= 163840;
        }
        if ((channelLayout & 65536) == 65536) {
            i2++;
        }
        if ((channelLayout & 131072) == 131072) {
            i2 += 2;
        }
        return new int[]{i2, i};
    }

    public int getFrameDuration() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_8, this, this));
        return this.frameDuration;
    }

    public int getLBRDurationMod() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_26, this, this));
        return this.LBRDurationMod;
    }

    public long getMaxBitRate() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.maxBitRate;
    }

    public int getMultiAssetFlag() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_24, this, this));
        return this.multiAssetFlag;
    }

    public int getPcmSampleDepth() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_6, this, this));
        return this.pcmSampleDepth;
    }

    public int getRepresentationType() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_20, this, this));
        return this.representationType;
    }

    public int getReserved() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_28, this, this));
        return this.reserved;
    }

    public int getReservedBoxPresent() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_30, this, this));
        return this.reservedBoxPresent;
    }

    public int getStereoDownmix() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_18, this, this));
        return this.stereoDownmix;
    }

    public int getStreamConstruction() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_10, this, this));
        return this.streamConstruction;
    }

    public void setAvgBitRate(long j) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.longObject(j)));
        this.avgBitRate = j;
    }

    public void setChannelLayout(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_23, this, this, Conversions.intObject(i)));
        this.channelLayout = i;
    }

    public void setCoreLFEPresent(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_13, this, this, Conversions.intObject(i)));
        this.coreLFEPresent = i;
    }

    public void setCoreLayout(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_15, this, this, Conversions.intObject(i)));
        this.coreLayout = i;
    }

    public void setCoreSize(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_17, this, this, Conversions.intObject(i)));
        this.coreSize = i;
    }

    public void setDTSSamplingFrequency(long j) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this, Conversions.longObject(j)));
        this.DTSSamplingFrequency = j;
    }

    public void setFrameDuration(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_9, this, this, Conversions.intObject(i)));
        this.frameDuration = i;
    }

    public void setLBRDurationMod(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_27, this, this, Conversions.intObject(i)));
        this.LBRDurationMod = i;
    }

    public void setMaxBitRate(long j) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_5, this, this, Conversions.longObject(j)));
        this.maxBitRate = j;
    }

    public void setMultiAssetFlag(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_25, this, this, Conversions.intObject(i)));
        this.multiAssetFlag = i;
    }

    public void setPcmSampleDepth(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_7, this, this, Conversions.intObject(i)));
        this.pcmSampleDepth = i;
    }

    public void setRepresentationType(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_21, this, this, Conversions.intObject(i)));
        this.representationType = i;
    }

    public void setReserved(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_29, this, this, Conversions.intObject(i)));
        this.reserved = i;
    }

    public void setReservedBoxPresent(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_31, this, this, Conversions.intObject(i)));
        this.reservedBoxPresent = i;
    }

    public void setStereoDownmix(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_19, this, this, Conversions.intObject(i)));
        this.stereoDownmix = i;
    }

    public void setStreamConstruction(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_11, this, this, Conversions.intObject(i)));
        this.streamConstruction = i;
    }
}
