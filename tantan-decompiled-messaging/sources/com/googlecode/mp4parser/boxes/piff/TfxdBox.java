package com.googlecode.mp4parser.boxes.piff;

import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p149l.bzp;
import p149l.cvc0;
import p149l.yyp;

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
            this.fragmentAbsoluteTime = yyp.m216560m(byteBuffer);
            this.fragmentAbsoluteDuration = yyp.m216560m(byteBuffer);
        } else {
            this.fragmentAbsoluteTime = yyp.m216558k(byteBuffer);
            this.fragmentAbsoluteDuration = yyp.m216558k(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        int version = getVersion();
        long j = this.fragmentAbsoluteTime;
        if (version == 1) {
            bzp.m104637i(byteBuffer, j);
            bzp.m104637i(byteBuffer, this.fragmentAbsoluteDuration);
        } else {
            bzp.m104635g(byteBuffer, j);
            bzp.m104635g(byteBuffer, this.fragmentAbsoluteDuration);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return getVersion() == 1 ? 20 : 12;
    }

    public long getFragmentAbsoluteDuration() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this));
        return this.fragmentAbsoluteDuration;
    }

    public long getFragmentAbsoluteTime() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.fragmentAbsoluteTime;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public byte[] getUserType() {
        return new byte[]{109, 29, -101, 5, 66, -43, 68, -26, -128, -30, 20, 29, -81, -9, 87, -78};
    }
}
