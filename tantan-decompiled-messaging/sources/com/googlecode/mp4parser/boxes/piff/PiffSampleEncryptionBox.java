package com.googlecode.mp4parser.boxes.piff;

import com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox;
import com.meituan.robust.Constants;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import p149l.cvc0;

/* JADX INFO: loaded from: classes7.dex */
public class PiffSampleEncryptionBox extends AbstractSampleEncryptionBox {
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;

    static {
        ajc$preClinit();
    }

    public PiffSampleEncryptionBox() {
        super("uuid");
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("PiffSampleEncryptionBox.java", PiffSampleEncryptionBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAlgorithmId", "com.googlecode.mp4parser.boxes.piff.PiffSampleEncryptionBox", "", "", "", Constants.INT), 46);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setAlgorithmId", "com.googlecode.mp4parser.boxes.piff.PiffSampleEncryptionBox", Constants.INT, "algorithmId", "", Constants.VOID), 50);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getIvSize", "com.googlecode.mp4parser.boxes.piff.PiffSampleEncryptionBox", "", "", "", Constants.INT), 54);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setIvSize", "com.googlecode.mp4parser.boxes.piff.PiffSampleEncryptionBox", Constants.INT, "ivSize", "", Constants.VOID), 58);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getKid", "com.googlecode.mp4parser.boxes.piff.PiffSampleEncryptionBox", "", "", "", "[B"), 62);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setKid", "com.googlecode.mp4parser.boxes.piff.PiffSampleEncryptionBox", "[B", "kid", "", Constants.VOID), 66);
    }

    public int getAlgorithmId() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.algorithmId;
    }

    public int getIvSize() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.ivSize;
    }

    public byte[] getKid() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.kid;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public byte[] getUserType() {
        return new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
    }

    @Override // com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox
    public boolean isOverrideTrackEncryptionBoxParameters() {
        return (getFlags() & 1) > 0;
    }

    public void setAlgorithmId(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        this.algorithmId = i;
    }

    public void setIvSize(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i)));
        this.ivSize = i;
    }

    public void setKid(byte[] bArr) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_5, this, this, bArr));
        this.kid = bArr;
    }

    public void setOverrideTrackEncryptionBoxParameters(boolean z) {
        if (z) {
            setFlags(getFlags() | 1);
        } else {
            setFlags(getFlags() & 16777214);
        }
    }
}
