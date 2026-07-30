package com.mp4parser.iso14496.part12;

import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p149l.bzp;
import p149l.cvc0;
import p149l.sm4;
import p149l.wyp;
import p149l.yyp;

/* JADX INFO: loaded from: classes8.dex */
public class SampleAuxiliaryInformationOffsetsBox extends AbstractFullBox {
    public static final String TYPE = "saio";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private String auxInfoType;
    private String auxInfoTypeParameter;
    private long[] offsets;

    static {
        ajc$preClinit();
    }

    public SampleAuxiliaryInformationOffsetsBox() {
        super(TYPE);
        this.offsets = new long[0];
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("SampleAuxiliaryInformationOffsetsBox.java", SampleAuxiliaryInformationOffsetsBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAuxInfoType", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "", "", "", "java.lang.String"), 107);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setAuxInfoType", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "java.lang.String", "auxInfoType", "", Constants.VOID), 111);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAuxInfoTypeParameter", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "", "", "", "java.lang.String"), 115);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setAuxInfoTypeParameter", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "java.lang.String", "auxInfoTypeParameter", "", Constants.VOID), 119);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getOffsets", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "", "", "", "[J"), 123);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setOffsets", "com.mp4parser.iso14496.part12.SampleAuxiliaryInformationOffsetsBox", "[J", "offsets", "", Constants.VOID), 127);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) == 1) {
            this.auxInfoType = yyp.m216549b(byteBuffer);
            this.auxInfoTypeParameter = yyp.m216549b(byteBuffer);
        }
        int iM184929a = sm4.m184929a(yyp.m216558k(byteBuffer));
        this.offsets = new long[iM184929a];
        for (int i = 0; i < iM184929a; i++) {
            int version = getVersion();
            long[] jArr = this.offsets;
            if (version == 0) {
                jArr[i] = yyp.m216558k(byteBuffer);
            } else {
                jArr[i] = yyp.m216560m(byteBuffer);
            }
        }
    }

    public String getAuxInfoType() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.auxInfoType;
    }

    public String getAuxInfoTypeParameter() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.auxInfoTypeParameter;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) == 1) {
            byteBuffer.put(wyp.m206118d(this.auxInfoType));
            byteBuffer.put(wyp.m206118d(this.auxInfoTypeParameter));
        }
        bzp.m104635g(byteBuffer, this.offsets.length);
        for (long j : this.offsets) {
            if (getVersion() == 0) {
                bzp.m104635g(byteBuffer, j);
            } else {
                bzp.m104637i(byteBuffer, j);
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        int version = getVersion();
        long[] jArr = this.offsets;
        return (version == 0 ? jArr.length * 4 : jArr.length * 8) + 8 + ((getFlags() & 1) != 1 ? 0 : 8);
    }

    public long[] getOffsets() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.offsets;
    }

    public void setAuxInfoType(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, str));
        this.auxInfoType = str;
    }

    public void setAuxInfoTypeParameter(String str) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this, str));
        this.auxInfoTypeParameter = str;
    }

    public void setOffsets(long[] jArr) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_5, this, this, jArr));
        this.offsets = jArr;
    }
}
