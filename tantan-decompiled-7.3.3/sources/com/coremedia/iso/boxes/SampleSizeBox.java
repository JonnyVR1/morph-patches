package com.coremedia.iso.boxes;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import p153l.b1q;
import p153l.f3d0;
import p153l.rn4;
import p153l.y0q;

/* JADX INFO: loaded from: classes.dex */
public class SampleSizeBox extends AbstractFullBox {
    public static final String TYPE = "stsz";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    int sampleCount;
    private long sampleSize;
    private long[] sampleSizes;

    static {
        ajc$preClinit();
    }

    public SampleSizeBox() {
        super(TYPE);
        this.sampleSizes = new long[0];
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("SampleSizeBox.java", SampleSizeBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", Constants.LONG), 50);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSampleSize", "com.coremedia.iso.boxes.SampleSizeBox", Constants.LONG, "sampleSize", "", Constants.VOID), 54);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSampleSizeAtIndex", "com.coremedia.iso.boxes.SampleSizeBox", Constants.INT, FirebaseAnalytics.Param.INDEX, "", Constants.LONG), 59);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSampleCount", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", Constants.LONG), 67);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "[J"), 76);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSampleSizes", "com.coremedia.iso.boxes.SampleSizeBox", "[J", "sampleSizes", "", Constants.VOID), 80);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.coremedia.iso.boxes.SampleSizeBox", "", "", "", "java.lang.String"), 119);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.sampleSize = y0q.m213895k(byteBuffer);
        int iM182119a = rn4.m182119a(y0q.m213895k(byteBuffer));
        this.sampleCount = iM182119a;
        if (this.sampleSize == 0) {
            this.sampleSizes = new long[iM182119a];
            for (int i = 0; i < this.sampleCount; i++) {
                this.sampleSizes[i] = y0q.m213895k(byteBuffer);
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        b1q.m101495g(byteBuffer, this.sampleSize);
        if (this.sampleSize != 0) {
            b1q.m101495g(byteBuffer, this.sampleCount);
            return;
        }
        b1q.m101495g(byteBuffer, this.sampleSizes.length);
        long[] jArr = this.sampleSizes;
        for (long j : jArr) {
            b1q.m101495g(byteBuffer, j);
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return (this.sampleSize == 0 ? this.sampleSizes.length * 4 : 0) + 12;
    }

    public long getSampleCount() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this));
        return this.sampleSize > 0 ? this.sampleCount : this.sampleSizes.length;
    }

    public long getSampleSize() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.sampleSize;
    }

    public long getSampleSizeAtIndex(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this, Conversions.intObject(i)));
        long j = this.sampleSize;
        return j > 0 ? j : this.sampleSizes[i];
    }

    public long[] getSampleSizes() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.sampleSizes;
    }

    public void setSampleSize(long j) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.longObject(j)));
        this.sampleSize = j;
    }

    public void setSampleSizes(long[] jArr) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_5, this, this, jArr));
        this.sampleSizes = jArr;
    }

    public String toString() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_6, this, this));
        return "SampleSizeBox[sampleSize=" + getSampleSize() + ";sampleCount=" + getSampleCount() + com.clevertap.android.sdk.Constants.AES_SUFFIX;
    }
}
