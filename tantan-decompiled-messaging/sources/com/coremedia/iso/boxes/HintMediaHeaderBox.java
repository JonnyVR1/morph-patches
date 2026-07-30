package com.coremedia.iso.boxes;

import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p149l.bzp;
import p149l.cvc0;
import p149l.yyp;

/* JADX INFO: loaded from: classes.dex */
public class HintMediaHeaderBox extends AbstractMediaHeaderBox {
    public static final String TYPE = "hmhd";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private long avgBitrate;
    private int avgPduSize;
    private long maxBitrate;
    private int maxPduSize;

    static {
        ajc$preClinit();
    }

    public HintMediaHeaderBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("HintMediaHeaderBox.java", HintMediaHeaderBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getMaxPduSize", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", Constants.INT), 42);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAvgPduSize", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", Constants.INT), 46);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getMaxBitrate", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", Constants.LONG), 50);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAvgBitrate", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", Constants.LONG), 54);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.HintMediaHeaderBox", "", "", "", "java.lang.String"), 84);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.maxPduSize = yyp.m216556i(byteBuffer);
        this.avgPduSize = yyp.m216556i(byteBuffer);
        this.maxBitrate = yyp.m216558k(byteBuffer);
        this.avgBitrate = yyp.m216558k(byteBuffer);
        yyp.m216558k(byteBuffer);
    }

    public long getAvgBitrate() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this));
        return this.avgBitrate;
    }

    public int getAvgPduSize() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this));
        return this.avgPduSize;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        bzp.m104633e(byteBuffer, this.maxPduSize);
        bzp.m104633e(byteBuffer, this.avgPduSize);
        bzp.m104635g(byteBuffer, this.maxBitrate);
        bzp.m104635g(byteBuffer, this.avgBitrate);
        bzp.m104635g(byteBuffer, 0L);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 20L;
    }

    public long getMaxBitrate() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.maxBitrate;
    }

    public int getMaxPduSize() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.maxPduSize;
    }

    public String toString() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_4, this, this));
        return "HintMediaHeaderBox{maxPduSize=" + this.maxPduSize + ", avgPduSize=" + this.avgPduSize + ", maxBitrate=" + this.maxBitrate + ", avgBitrate=" + this.avgBitrate + '}';
    }
}
