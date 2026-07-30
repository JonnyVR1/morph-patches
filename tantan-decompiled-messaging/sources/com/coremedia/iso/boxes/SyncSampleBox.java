package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p149l.bzp;
import p149l.cvc0;
import p149l.sm4;
import p149l.yyp;

/* JADX INFO: loaded from: classes.dex */
public class SyncSampleBox extends AbstractFullBox {
    public static final String TYPE = "stss";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private long[] sampleNumber;

    static {
        ajc$preClinit();
    }

    public SyncSampleBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("SyncSampleBox.java", SyncSampleBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "", "[J"), 46);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.SyncSampleBox", "", "", "", "java.lang.String"), 77);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSampleNumber", "com.coremedia.iso.boxes.SyncSampleBox", "[J", "sampleNumber", "", Constants.VOID), 81);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        int iM184929a = sm4.m184929a(yyp.m216558k(byteBuffer));
        this.sampleNumber = new long[iM184929a];
        for (int i = 0; i < iM184929a; i++) {
            this.sampleNumber[i] = yyp.m216558k(byteBuffer);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        bzp.m104635g(byteBuffer, this.sampleNumber.length);
        for (long j : this.sampleNumber) {
            bzp.m104635g(byteBuffer, j);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (this.sampleNumber.length * 4) + 8;
    }

    public long[] getSampleNumber() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.sampleNumber;
    }

    public void setSampleNumber(long[] jArr) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this, jArr));
        this.sampleNumber = jArr;
    }

    public String toString() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this));
        return "SyncSampleBox[entryCount=" + this.sampleNumber.length + com.clevertap.android.sdk.Constants.AES_SUFFIX;
    }
}
