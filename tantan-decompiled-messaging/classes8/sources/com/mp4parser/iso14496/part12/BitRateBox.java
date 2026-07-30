package com.mp4parser.iso14496.part12;

import com.googlecode.mp4parser.AbstractBox;
import com.momo.xeengine.gift.GiftLogEvent;
import com.momo.xeengine.gift.XEGiftErrorCode;
import java.nio.ByteBuffer;
import l.bzp;
import l.cvc0;
import l.yyp;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
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
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getBufferSizeDb", "com.mp4parser.iso14496.part12.BitRateBox", "", "", "", "long"), 74);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setBufferSizeDb", "com.mp4parser.iso14496.part12.BitRateBox", "long", "bufferSizeDb", "", "void"), 82);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getMaxBitrate", "com.mp4parser.iso14496.part12.BitRateBox", "", "", "", "long"), 90);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setMaxBitrate", "com.mp4parser.iso14496.part12.BitRateBox", "long", "maxBitrate", "", "void"), 98);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getAvgBitrate", "com.mp4parser.iso14496.part12.BitRateBox", "", "", "", "long"), 106);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setAvgBitrate", "com.mp4parser.iso14496.part12.BitRateBox", "long", "avgBitrate", "", "void"), XEGiftErrorCode.ERROR_CODE_VIDEO_TIMEOUT);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        this.bufferSizeDb = yyp.k(byteBuffer);
        this.maxBitrate = yyp.k(byteBuffer);
        this.avgBitrate = yyp.k(byteBuffer);
    }

    public long getAvgBitrate() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.avgBitrate;
    }

    public long getBufferSizeDb() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.bufferSizeDb;
    }

    public void getContent(ByteBuffer byteBuffer) {
        bzp.g(byteBuffer, this.bufferSizeDb);
        bzp.g(byteBuffer, this.maxBitrate);
        bzp.g(byteBuffer, this.avgBitrate);
    }

    public long getContentSize() {
        return 12L;
    }

    public long getMaxBitrate() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.maxBitrate;
    }

    public void setAvgBitrate(long j) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_5, this, this, Conversions.longObject(j)));
        this.avgBitrate = j;
    }

    public void setBufferSizeDb(long j) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.longObject(j)));
        this.bufferSizeDb = j;
    }

    public void setMaxBitrate(long j) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_3, this, this, Conversions.longObject(j)));
        this.maxBitrate = j;
    }
}
