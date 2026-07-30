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
public class TierBitRateBox extends AbstractBox {
    public static final String TYPE = "tibr";
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
    long avgBitRate;
    long baseBitRate;
    long maxBitRate;
    long tierAvgBitRate;
    long tierBaseBitRate;
    long tierMaxBitRate;

    static {
        ajc$preClinit();
    }

    public TierBitRateBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("TierBitRateBox.java", TierBitRateBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getBaseBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", "long"), 52);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setBaseBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "long", "baseBitRate", "", "void"), 56);
        ajc$tjp_10 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getTierAvgBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", "long"), 92);
        ajc$tjp_11 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setTierAvgBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "long", "tierAvgBitRate", "", "void"), 96);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getMaxBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", "long"), 60);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setMaxBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "long", "maxBitRate", "", "void"), 64);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getAvgBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", "long"), 68);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setAvgBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "long", "avgBitRate", "", "void"), 72);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getTierBaseBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", "long"), 76);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setTierBaseBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "long", "tierBaseBitRate", "", "void"), 80);
        ajc$tjp_8 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getTierMaxBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", "long"), 84);
        ajc$tjp_9 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setTierMaxBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "long", "tierMaxBitRate", "", "void"), 88);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        this.baseBitRate = yyp.k(byteBuffer);
        this.maxBitRate = yyp.k(byteBuffer);
        this.avgBitRate = yyp.k(byteBuffer);
        this.tierBaseBitRate = yyp.k(byteBuffer);
        this.tierMaxBitRate = yyp.k(byteBuffer);
        this.tierAvgBitRate = yyp.k(byteBuffer);
    }

    public long getAvgBitRate() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.avgBitRate;
    }

    public long getBaseBitRate() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.baseBitRate;
    }

    public void getContent(ByteBuffer byteBuffer) {
        bzp.g(byteBuffer, this.baseBitRate);
        bzp.g(byteBuffer, this.maxBitRate);
        bzp.g(byteBuffer, this.avgBitRate);
        bzp.g(byteBuffer, this.tierBaseBitRate);
        bzp.g(byteBuffer, this.tierMaxBitRate);
        bzp.g(byteBuffer, this.tierAvgBitRate);
    }

    public long getContentSize() {
        return 24L;
    }

    public long getMaxBitRate() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.maxBitRate;
    }

    public long getTierAvgBitRate() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_10, this, this));
        return this.tierAvgBitRate;
    }

    public long getTierBaseBitRate() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_6, this, this));
        return this.tierBaseBitRate;
    }

    public long getTierMaxBitRate() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_8, this, this));
        return this.tierMaxBitRate;
    }

    public void setAvgBitRate(long j) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_5, this, this, Conversions.longObject(j)));
        this.avgBitRate = j;
    }

    public void setBaseBitRate(long j) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.longObject(j)));
        this.baseBitRate = j;
    }

    public void setMaxBitRate(long j) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_3, this, this, Conversions.longObject(j)));
        this.maxBitRate = j;
    }

    public void setTierAvgBitRate(long j) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_11, this, this, Conversions.longObject(j)));
        this.tierAvgBitRate = j;
    }

    public void setTierBaseBitRate(long j) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_7, this, this, Conversions.longObject(j)));
        this.tierBaseBitRate = j;
    }

    public void setTierMaxBitRate(long j) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_9, this, this, Conversions.longObject(j)));
        this.tierMaxBitRate = j;
    }
}
