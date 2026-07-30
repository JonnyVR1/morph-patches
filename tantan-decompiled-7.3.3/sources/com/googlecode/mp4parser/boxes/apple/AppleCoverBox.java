package com.googlecode.mp4parser.boxes.apple;

import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p153l.f3d0;

/* JADX INFO: loaded from: classes7.dex */
public class AppleCoverBox extends AppleDataBox {
    private static final int IMAGE_TYPE_JPG = 13;
    private static final int IMAGE_TYPE_PNG = 14;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private byte[] data;

    static {
        ajc$preClinit();
    }

    public AppleCoverBox() {
        super("covr", 1);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("AppleCoverBox.java", AppleCoverBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getCoverData", "com.googlecode.mp4parser.boxes.apple.AppleCoverBox", "", "", "", "[B"), 21);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setJpg", "com.googlecode.mp4parser.boxes.apple.AppleCoverBox", "[B", "data", "", Constants.VOID), 25);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setPng", "com.googlecode.mp4parser.boxes.apple.AppleCoverBox", "[B", "data", "", Constants.VOID), 29);
    }

    private void setImageData(byte[] bArr, int i) {
        this.data = bArr;
        this.dataType = i;
    }

    public byte[] getCoverData() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.data;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    public int getDataLength() {
        return this.data.length;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    public void parseData(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.limit()];
        this.data = bArr;
        byteBuffer.get(bArr);
    }

    public void setJpg(byte[] bArr) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, bArr));
        setImageData(bArr, 13);
    }

    public void setPng(byte[] bArr) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this, bArr));
        setImageData(bArr, 14);
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    public byte[] writeData() {
        return this.data;
    }
}
