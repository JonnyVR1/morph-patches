package com.coremedia.iso.boxes.apple;

import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p153l.b1q;
import p153l.f3d0;
import p153l.rn4;
import p153l.slk0;
import p153l.w0q;
import p153l.y0q;

/* JADX INFO: loaded from: classes.dex */
public class AppleDataReferenceBox extends AbstractFullBox {
    public static final String TYPE = "rdrf";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private String dataReference;
    private int dataReferenceSize;
    private String dataReferenceType;

    static {
        ajc$preClinit();
    }

    public AppleDataReferenceBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("AppleDataReferenceBox.java", AppleDataReferenceBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDataReferenceSize", "com.coremedia.iso.boxes.apple.AppleDataReferenceBox", "", "", "", Constants.LONG), 63);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDataReferenceType", "com.coremedia.iso.boxes.apple.AppleDataReferenceBox", "", "", "", "java.lang.String"), 67);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDataReference", "com.coremedia.iso.boxes.apple.AppleDataReferenceBox", "", "", "", "java.lang.String"), 71);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.dataReferenceType = y0q.m213886b(byteBuffer);
        int iM182119a = rn4.m182119a(y0q.m213895k(byteBuffer));
        this.dataReferenceSize = iM182119a;
        this.dataReference = y0q.m213892h(byteBuffer, iM182119a);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(w0q.m204214d(this.dataReferenceType));
        b1q.m101495g(byteBuffer, this.dataReferenceSize);
        byteBuffer.put(slk0.m186593b(this.dataReference));
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return this.dataReferenceSize + 12;
    }

    public String getDataReference() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.dataReference;
    }

    public long getDataReferenceSize() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.dataReferenceSize;
    }

    public String getDataReferenceType() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this));
        return this.dataReferenceType;
    }
}
