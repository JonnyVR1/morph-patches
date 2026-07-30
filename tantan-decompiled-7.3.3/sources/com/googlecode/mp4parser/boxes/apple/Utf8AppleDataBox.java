package com.googlecode.mp4parser.boxes.apple;

import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p153l.f3d0;
import p153l.slk0;
import p153l.y0q;

/* JADX INFO: loaded from: classes7.dex */
public abstract class Utf8AppleDataBox extends AppleDataBox {
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    String value;

    static {
        ajc$preClinit();
    }

    public Utf8AppleDataBox(String str) {
        super(str, 1);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("Utf8AppleDataBox.java", Utf8AppleDataBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getValue", "com.googlecode.mp4parser.boxes.apple.Utf8AppleDataBox", "", "", "", "java.lang.String"), 21);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setValue", "com.googlecode.mp4parser.boxes.apple.Utf8AppleDataBox", "java.lang.String", "value", "", Constants.VOID), 30);
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    public int getDataLength() {
        return this.value.getBytes(Charset.forName("UTF-8")).length;
    }

    public String getValue() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        if (!isParsed()) {
            parseDetails();
        }
        return this.value;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    public void parseData(ByteBuffer byteBuffer) {
        this.value = y0q.m213892h(byteBuffer, byteBuffer.remaining());
    }

    public void setValue(String str) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, str));
        this.value = str;
    }

    @Override // com.googlecode.mp4parser.boxes.apple.AppleDataBox
    public byte[] writeData() {
        return slk0.m186593b(this.value);
    }
}
