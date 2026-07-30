package com.googlecode.mp4parser.boxes.apple;

import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import p149l.cvc0;

/* JADX INFO: loaded from: classes7.dex */
public class AppleTrackNumberBox extends AppleDataBox {
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;

    /* JADX INFO: renamed from: a */
    int f11707a;

    /* JADX INFO: renamed from: b */
    int f11708b;

    static {
        ajc$preClinit();
    }

    public AppleTrackNumberBox() {
        super("trkn", 0);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("AppleTrackNumberBox.java", AppleTrackNumberBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getA", "com.googlecode.mp4parser.boxes.apple.AppleTrackNumberBox", "", "", "", Constants.INT), 16);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setA", "com.googlecode.mp4parser.boxes.apple.AppleTrackNumberBox", Constants.INT, "a", "", Constants.VOID), 20);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getB", "com.googlecode.mp4parser.boxes.apple.AppleTrackNumberBox", "", "", "", Constants.INT), 24);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setB", "com.googlecode.mp4parser.boxes.apple.AppleTrackNumberBox", Constants.INT, "b", "", Constants.VOID), 28);
    }

    public int getA() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.f11707a;
    }

    public int getB() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.f11708b;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    public int getDataLength() {
        return 8;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    public void parseData(ByteBuffer byteBuffer) {
        this.f11707a = byteBuffer.getInt();
        this.f11708b = byteBuffer.getInt();
    }

    public void setA(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        this.f11707a = i;
    }

    public void setB(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i)));
        this.f11708b = i;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    public byte[] writeData() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.putInt(this.f11707a);
        byteBufferAllocate.putInt(this.f11708b);
        return byteBufferAllocate.array();
    }
}
