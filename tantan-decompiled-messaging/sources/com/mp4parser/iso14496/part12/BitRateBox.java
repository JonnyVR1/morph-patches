package com.mp4parser.iso14496.part12;

import com.googlecode.mp4parser.AbstractBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import p149l.bzp;
import p149l.cvc0;
import p149l.yyp;

/* JADX INFO: loaded from: classes8.dex */
public final class BitRateBox extends AbstractBox {
    public static final String TYPE = "btrt";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private long avgBitrate;
    private long bufferSizeDb;
    private long maxBitrate;

    static {
        ajc$preClinit();
    }

    public BitRateBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("BitRateBox.java", BitRateBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getBufferSizeDb", "com.mp4parser.iso14496.part12.BitRateBox", "", "", "", Constants.LONG), 74);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setBufferSizeDb", "com.mp4parser.iso14496.part12.BitRateBox", Constants.LONG, "bufferSizeDb", "", Constants.VOID), 82);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getMaxBitrate", "com.mp4parser.iso14496.part12.BitRateBox", "", "", "", Constants.LONG), 90);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setMaxBitrate", "com.mp4parser.iso14496.part12.BitRateBox", Constants.LONG, "maxBitrate", "", Constants.VOID), 98);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAvgBitrate", "com.mp4parser.iso14496.part12.BitRateBox", "", "", "", Constants.LONG), 106);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setAvgBitrate", "com.mp4parser.iso14496.part12.BitRateBox", Constants.LONG, "avgBitrate", "", Constants.VOID), 114);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.bufferSizeDb = yyp.m216558k(byteBuffer);
        this.maxBitrate = yyp.m216558k(byteBuffer);
        this.avgBitrate = yyp.m216558k(byteBuffer);
    }

    public long getAvgBitrate() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.avgBitrate;
    }

    public long getBufferSizeDb() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.bufferSizeDb;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        bzp.m104635g(byteBuffer, this.bufferSizeDb);
        bzp.m104635g(byteBuffer, this.maxBitrate);
        bzp.m104635g(byteBuffer, this.avgBitrate);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 12L;
    }

    public long getMaxBitrate() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.maxBitrate;
    }

    public void setAvgBitrate(long j) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_5, this, this, Conversions.longObject(j)));
        this.avgBitrate = j;
    }

    public void setBufferSizeDb(long j) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.longObject(j)));
        this.bufferSizeDb = j;
    }

    public void setMaxBitrate(long j) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this, Conversions.longObject(j)));
        this.maxBitrate = j;
    }
}
