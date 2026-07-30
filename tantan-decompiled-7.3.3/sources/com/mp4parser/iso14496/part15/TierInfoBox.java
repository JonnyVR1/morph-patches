package com.mp4parser.iso14496.part15;

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
import p153l.y0q;

/* JADX INFO: loaded from: classes8.dex */
public class TierInfoBox extends AbstractBox {
    public static final String TYPE = "tiri";
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
    int constantFrameRate;
    int discardable;
    int frameRate;
    int levelIndication;
    int profileIndication;
    int profile_compatibility;
    int reserved1;
    int reserved2;
    int tierID;
    int visualHeight;
    int visualWidth;

    static {
        ajc$preClinit();
    }

    public TierInfoBox() {
        super(TYPE);
        this.reserved1 = 0;
        this.reserved2 = 0;
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("TierInfoBox.java", TierInfoBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getTierID", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", Constants.INT), 69);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setTierID", "com.mp4parser.iso14496.part15.TierInfoBox", Constants.INT, "tierID", "", Constants.VOID), 73);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getVisualWidth", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", Constants.INT), 109);
        ajc$tjp_11 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setVisualWidth", "com.mp4parser.iso14496.part15.TierInfoBox", Constants.INT, "visualWidth", "", Constants.VOID), 113);
        ajc$tjp_12 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getVisualHeight", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", Constants.INT), 117);
        ajc$tjp_13 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setVisualHeight", "com.mp4parser.iso14496.part15.TierInfoBox", Constants.INT, "visualHeight", "", Constants.VOID), 121);
        ajc$tjp_14 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDiscardable", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", Constants.INT), 125);
        ajc$tjp_15 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDiscardable", "com.mp4parser.iso14496.part15.TierInfoBox", Constants.INT, "discardable", "", Constants.VOID), MMConstants.ERR_WATERMARK_READ);
        ajc$tjp_16 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getConstantFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", Constants.INT), CipherSuite.TLS_DH_DSS_WITH_CAMELLIA_256_CBC_SHA);
        ajc$tjp_17 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setConstantFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", Constants.INT, "constantFrameRate", "", Constants.VOID), CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA);
        ajc$tjp_18 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getReserved2", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", Constants.INT), CipherSuite.TLS_PSK_WITH_AES_256_CBC_SHA);
        ajc$tjp_19 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setReserved2", "com.mp4parser.iso14496.part15.TierInfoBox", Constants.INT, "reserved2", "", Constants.VOID), CipherSuite.TLS_DHE_PSK_WITH_AES_256_CBC_SHA);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getProfileIndication", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", Constants.INT), 77);
        ajc$tjp_20 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", Constants.INT), 149);
        ajc$tjp_21 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", Constants.INT, "frameRate", "", Constants.VOID), 153);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setProfileIndication", "com.mp4parser.iso14496.part15.TierInfoBox", Constants.INT, "profileIndication", "", Constants.VOID), 81);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getProfile_compatibility", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", Constants.INT), 85);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setProfile_compatibility", "com.mp4parser.iso14496.part15.TierInfoBox", Constants.INT, "profile_compatibility", "", Constants.VOID), 89);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getLevelIndication", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", Constants.INT), 93);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setLevelIndication", "com.mp4parser.iso14496.part15.TierInfoBox", Constants.INT, "levelIndication", "", Constants.VOID), 97);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getReserved1", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", Constants.INT), 101);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setReserved1", "com.mp4parser.iso14496.part15.TierInfoBox", Constants.INT, "reserved1", "", Constants.VOID), 105);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.tierID = y0q.m213893i(byteBuffer);
        this.profileIndication = y0q.m213898n(byteBuffer);
        this.profile_compatibility = y0q.m213898n(byteBuffer);
        this.levelIndication = y0q.m213898n(byteBuffer);
        this.reserved1 = y0q.m213898n(byteBuffer);
        this.visualWidth = y0q.m213893i(byteBuffer);
        this.visualHeight = y0q.m213893i(byteBuffer);
        int iM213898n = y0q.m213898n(byteBuffer);
        this.discardable = (iM213898n & 192) >> 6;
        this.constantFrameRate = (iM213898n & 48) >> 4;
        this.reserved2 = iM213898n & 15;
        this.frameRate = y0q.m213893i(byteBuffer);
    }

    public int getConstantFrameRate() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_16, this, this));
        return this.constantFrameRate;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        b1q.m101493e(byteBuffer, this.tierID);
        b1q.m101498j(byteBuffer, this.profileIndication);
        b1q.m101498j(byteBuffer, this.profile_compatibility);
        b1q.m101498j(byteBuffer, this.levelIndication);
        b1q.m101498j(byteBuffer, this.reserved1);
        b1q.m101493e(byteBuffer, this.visualWidth);
        b1q.m101493e(byteBuffer, this.visualHeight);
        b1q.m101498j(byteBuffer, (this.discardable << 6) + (this.constantFrameRate << 4) + this.reserved2);
        b1q.m101493e(byteBuffer, this.frameRate);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 13L;
    }

    public int getDiscardable() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_14, this, this));
        return this.discardable;
    }

    public int getFrameRate() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_20, this, this));
        return this.frameRate;
    }

    public int getLevelIndication() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_6, this, this));
        return this.levelIndication;
    }

    public int getProfileIndication() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.profileIndication;
    }

    public int getProfile_compatibility() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.profile_compatibility;
    }

    public int getReserved1() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_8, this, this));
        return this.reserved1;
    }

    public int getReserved2() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_18, this, this));
        return this.reserved2;
    }

    public int getTierID() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.tierID;
    }

    public int getVisualHeight() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_12, this, this));
        return this.visualHeight;
    }

    public int getVisualWidth() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_10, this, this));
        return this.visualWidth;
    }

    public void setConstantFrameRate(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_17, this, this, Conversions.intObject(i)));
        this.constantFrameRate = i;
    }

    public void setDiscardable(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_15, this, this, Conversions.intObject(i)));
        this.discardable = i;
    }

    public void setFrameRate(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_21, this, this, Conversions.intObject(i)));
        this.frameRate = i;
    }

    public void setLevelIndication(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_7, this, this, Conversions.intObject(i)));
        this.levelIndication = i;
    }

    public void setProfileIndication(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i)));
        this.profileIndication = i;
    }

    public void setProfile_compatibility(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_5, this, this, Conversions.intObject(i)));
        this.profile_compatibility = i;
    }

    public void setReserved1(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_9, this, this, Conversions.intObject(i)));
        this.reserved1 = i;
    }

    public void setReserved2(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_19, this, this, Conversions.intObject(i)));
        this.reserved2 = i;
    }

    public void setTierID(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        this.tierID = i;
    }

    public void setVisualHeight(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_13, this, this, Conversions.intObject(i)));
        this.visualHeight = i;
    }

    public void setVisualWidth(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_11, this, this, Conversions.intObject(i)));
        this.visualWidth = i;
    }
}
