package com.mp4parser.iso14496.part15;

import com.googlecode.mp4parser.AbstractBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import p153l.b1q;
import p153l.f3d0;
import p153l.y0q;

/* JADX INFO: loaded from: classes8.dex */
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
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getBaseBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", Constants.LONG), 52);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setBaseBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", Constants.LONG, "baseBitRate", "", Constants.VOID), 56);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getTierAvgBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", Constants.LONG), 92);
        ajc$tjp_11 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setTierAvgBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", Constants.LONG, "tierAvgBitRate", "", Constants.VOID), 96);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getMaxBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", Constants.LONG), 60);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setMaxBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", Constants.LONG, "maxBitRate", "", Constants.VOID), 64);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAvgBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", Constants.LONG), 68);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setAvgBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", Constants.LONG, "avgBitRate", "", Constants.VOID), 72);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getTierBaseBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", Constants.LONG), 76);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setTierBaseBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", Constants.LONG, "tierBaseBitRate", "", Constants.VOID), 80);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getTierMaxBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", "", "", "", Constants.LONG), 84);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setTierMaxBitRate", "com.mp4parser.iso14496.part15.TierBitRateBox", Constants.LONG, "tierMaxBitRate", "", Constants.VOID), 88);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.baseBitRate = y0q.m213895k(byteBuffer);
        this.maxBitRate = y0q.m213895k(byteBuffer);
        this.avgBitRate = y0q.m213895k(byteBuffer);
        this.tierBaseBitRate = y0q.m213895k(byteBuffer);
        this.tierMaxBitRate = y0q.m213895k(byteBuffer);
        this.tierAvgBitRate = y0q.m213895k(byteBuffer);
    }

    public long getAvgBitRate() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.avgBitRate;
    }

    public long getBaseBitRate() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.baseBitRate;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        b1q.m101495g(byteBuffer, this.baseBitRate);
        b1q.m101495g(byteBuffer, this.maxBitRate);
        b1q.m101495g(byteBuffer, this.avgBitRate);
        b1q.m101495g(byteBuffer, this.tierBaseBitRate);
        b1q.m101495g(byteBuffer, this.tierMaxBitRate);
        b1q.m101495g(byteBuffer, this.tierAvgBitRate);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 24L;
    }

    public long getMaxBitRate() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.maxBitRate;
    }

    public long getTierAvgBitRate() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_10, this, this));
        return this.tierAvgBitRate;
    }

    public long getTierBaseBitRate() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_6, this, this));
        return this.tierBaseBitRate;
    }

    public long getTierMaxBitRate() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_8, this, this));
        return this.tierMaxBitRate;
    }

    public void setAvgBitRate(long j) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_5, this, this, Conversions.longObject(j)));
        this.avgBitRate = j;
    }

    public void setBaseBitRate(long j) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.longObject(j)));
        this.baseBitRate = j;
    }

    public void setMaxBitRate(long j) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this, Conversions.longObject(j)));
        this.maxBitRate = j;
    }

    public void setTierAvgBitRate(long j) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_11, this, this, Conversions.longObject(j)));
        this.tierAvgBitRate = j;
    }

    public void setTierBaseBitRate(long j) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_7, this, this, Conversions.longObject(j)));
        this.tierBaseBitRate = j;
    }

    public void setTierMaxBitRate(long j) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_9, this, this, Conversions.longObject(j)));
        this.tierMaxBitRate = j;
    }
}
