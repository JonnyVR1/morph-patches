package com.googlecode.mp4parser.boxes.apple;

import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import p153l.f3d0;

/* JADX INFO: loaded from: classes7.dex */
public class AppleDiskNumberBox extends AppleDataBox {
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;

    /* JADX INFO: renamed from: a */
    int f11741a;

    /* JADX INFO: renamed from: b */
    short f11742b;

    static {
        ajc$preClinit();
    }

    public AppleDiskNumberBox() {
        super("disk", 0);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("AppleDiskNumberBox.java", AppleDiskNumberBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getA", "com.googlecode.mp4parser.boxes.apple.AppleDiskNumberBox", "", "", "", Constants.INT), 16);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setA", "com.googlecode.mp4parser.boxes.apple.AppleDiskNumberBox", Constants.INT, "a", "", Constants.VOID), 20);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getB", "com.googlecode.mp4parser.boxes.apple.AppleDiskNumberBox", "", "", "", Constants.SHORT), 24);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setB", "com.googlecode.mp4parser.boxes.apple.AppleDiskNumberBox", Constants.SHORT, "b", "", Constants.VOID), 28);
    }

    public int getA() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.f11741a;
    }

    public short getB() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.f11742b;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    public int getDataLength() {
        return 6;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    public void parseData(ByteBuffer byteBuffer) {
        this.f11741a = byteBuffer.getInt();
        this.f11742b = byteBuffer.getShort();
    }

    public void setA(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        this.f11741a = i;
    }

    public void setB(short s) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this, Conversions.shortObject(s)));
        this.f11742b = s;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    public byte[] writeData() {
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(6);
        byteBufferAllocate.putInt(this.f11741a);
        byteBufferAllocate.putShort(this.f11742b);
        return byteBufferAllocate.array();
    }
}
