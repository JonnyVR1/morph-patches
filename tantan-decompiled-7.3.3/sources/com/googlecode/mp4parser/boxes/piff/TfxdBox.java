package com.googlecode.mp4parser.boxes.piff;

import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p153l.b1q;
import p153l.f3d0;
import p153l.y0q;

/* JADX INFO: loaded from: classes7.dex */
public class TfxdBox extends AbstractFullBox {
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    public long fragmentAbsoluteDuration;
    public long fragmentAbsoluteTime;

    static {
        ajc$preClinit();
    }

    public TfxdBox() {
        super("uuid");
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("TfxdBox.java", TfxdBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getFragmentAbsoluteTime", "com.googlecode.mp4parser.boxes.piff.TfxdBox", "", "", "", Constants.LONG), 79);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getFragmentAbsoluteDuration", "com.googlecode.mp4parser.boxes.piff.TfxdBox", "", "", "", Constants.LONG), 83);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if (getVersion() == 1) {
            this.fragmentAbsoluteTime = y0q.m213897m(byteBuffer);
            this.fragmentAbsoluteDuration = y0q.m213897m(byteBuffer);
        } else {
            this.fragmentAbsoluteTime = y0q.m213895k(byteBuffer);
            this.fragmentAbsoluteDuration = y0q.m213895k(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        int version = getVersion();
        long j = this.fragmentAbsoluteTime;
        if (version == 1) {
            b1q.m101497i(byteBuffer, j);
            b1q.m101497i(byteBuffer, this.fragmentAbsoluteDuration);
        } else {
            b1q.m101495g(byteBuffer, j);
            b1q.m101495g(byteBuffer, this.fragmentAbsoluteDuration);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return getVersion() == 1 ? 20 : 12;
    }

    public long getFragmentAbsoluteDuration() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this));
        return this.fragmentAbsoluteDuration;
    }

    public long getFragmentAbsoluteTime() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.fragmentAbsoluteTime;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public byte[] getUserType() {
        return new byte[]{109, 29, -101, 5, 66, -43, 68, -26, -128, -30, 20, 29, -81, -9, 87, -78};
    }
}
