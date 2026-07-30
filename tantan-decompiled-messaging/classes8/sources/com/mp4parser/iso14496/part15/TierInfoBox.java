package com.mp4parser.iso14496.part15;

import com.googlecode.mp4parser.AbstractBox;
import com.momo.xeengine.gift.GiftLogEvent;
import java.nio.ByteBuffer;
import l.bzp;
import l.cvc0;
import l.yyp;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
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
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getTierID", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 69);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setTierID", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "tierID", "", "void"), 73);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getVisualWidth", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 109);
        ajc$tjp_11 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setVisualWidth", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "visualWidth", "", "void"), 113);
        ajc$tjp_12 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getVisualHeight", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 117);
        ajc$tjp_13 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setVisualHeight", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "visualHeight", "", "void"), 121);
        ajc$tjp_14 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getDiscardable", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 125);
        ajc$tjp_15 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setDiscardable", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "discardable", "", "void"), 129);
        ajc$tjp_16 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getConstantFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 133);
        ajc$tjp_17 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setConstantFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "constantFrameRate", "", "void"), 137);
        ajc$tjp_18 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getReserved2", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 141);
        ajc$tjp_19 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setReserved2", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "reserved2", "", "void"), 145);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getProfileIndication", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 77);
        ajc$tjp_20 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 149);
        ajc$tjp_21 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setFrameRate", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "frameRate", "", "void"), 153);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setProfileIndication", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "profileIndication", "", "void"), 81);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getProfile_compatibility", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 85);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setProfile_compatibility", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "profile_compatibility", "", "void"), 89);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getLevelIndication", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 93);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setLevelIndication", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "levelIndication", "", "void"), 97);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getReserved1", "com.mp4parser.iso14496.part15.TierInfoBox", "", "", "", "int"), 101);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setReserved1", "com.mp4parser.iso14496.part15.TierInfoBox", "int", "reserved1", "", "void"), 105);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        this.tierID = yyp.i(byteBuffer);
        this.profileIndication = yyp.n(byteBuffer);
        this.profile_compatibility = yyp.n(byteBuffer);
        this.levelIndication = yyp.n(byteBuffer);
        this.reserved1 = yyp.n(byteBuffer);
        this.visualWidth = yyp.i(byteBuffer);
        this.visualHeight = yyp.i(byteBuffer);
        int iN = yyp.n(byteBuffer);
        this.discardable = (iN & 192) >> 6;
        this.constantFrameRate = (iN & 48) >> 4;
        this.reserved2 = iN & 15;
        this.frameRate = yyp.i(byteBuffer);
    }

    public int getConstantFrameRate() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_16, this, this));
        return this.constantFrameRate;
    }

    public void getContent(ByteBuffer byteBuffer) {
        bzp.e(byteBuffer, this.tierID);
        bzp.j(byteBuffer, this.profileIndication);
        bzp.j(byteBuffer, this.profile_compatibility);
        bzp.j(byteBuffer, this.levelIndication);
        bzp.j(byteBuffer, this.reserved1);
        bzp.e(byteBuffer, this.visualWidth);
        bzp.e(byteBuffer, this.visualHeight);
        bzp.j(byteBuffer, (this.discardable << 6) + (this.constantFrameRate << 4) + this.reserved2);
        bzp.e(byteBuffer, this.frameRate);
    }

    public long getContentSize() {
        return 13L;
    }

    public int getDiscardable() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_14, this, this));
        return this.discardable;
    }

    public int getFrameRate() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_20, this, this));
        return this.frameRate;
    }

    public int getLevelIndication() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_6, this, this));
        return this.levelIndication;
    }

    public int getProfileIndication() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.profileIndication;
    }

    public int getProfile_compatibility() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.profile_compatibility;
    }

    public int getReserved1() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_8, this, this));
        return this.reserved1;
    }

    public int getReserved2() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_18, this, this));
        return this.reserved2;
    }

    public int getTierID() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.tierID;
    }

    public int getVisualHeight() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_12, this, this));
        return this.visualHeight;
    }

    public int getVisualWidth() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_10, this, this));
        return this.visualWidth;
    }

    public void setConstantFrameRate(int i) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_17, this, this, Conversions.intObject(i)));
        this.constantFrameRate = i;
    }

    public void setDiscardable(int i) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_15, this, this, Conversions.intObject(i)));
        this.discardable = i;
    }

    public void setFrameRate(int i) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_21, this, this, Conversions.intObject(i)));
        this.frameRate = i;
    }

    public void setLevelIndication(int i) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_7, this, this, Conversions.intObject(i)));
        this.levelIndication = i;
    }

    public void setProfileIndication(int i) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i)));
        this.profileIndication = i;
    }

    public void setProfile_compatibility(int i) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_5, this, this, Conversions.intObject(i)));
        this.profile_compatibility = i;
    }

    public void setReserved1(int i) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_9, this, this, Conversions.intObject(i)));
        this.reserved1 = i;
    }

    public void setReserved2(int i) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_19, this, this, Conversions.intObject(i)));
        this.reserved2 = i;
    }

    public void setTierID(int i) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        this.tierID = i;
    }

    public void setVisualHeight(int i) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_13, this, this, Conversions.intObject(i)));
        this.visualHeight = i;
    }

    public void setVisualWidth(int i) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_11, this, this, Conversions.intObject(i)));
        this.visualWidth = i;
    }
}
