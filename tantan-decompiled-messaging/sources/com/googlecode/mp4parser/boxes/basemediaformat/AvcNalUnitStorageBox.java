package com.googlecode.mp4parser.boxes.basemediaformat;

import com.googlecode.mp4parser.AbstractBox;
import com.meituan.robust.Constants;
import com.mp4parser.iso14496.part15.AvcConfigurationBox;
import java.nio.ByteBuffer;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p149l.cvc0;
import p149l.jp1;

/* JADX INFO: loaded from: classes7.dex */
public class AvcNalUnitStorageBox extends AbstractBox {
    public static final String TYPE = "avcn";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7 = null;
    jp1 avcDecoderConfigurationRecord;

    static {
        ajc$preClinit();
    }

    public AvcNalUnitStorageBox(AvcConfigurationBox avcConfigurationBox) {
        super(TYPE);
        this.avcDecoderConfigurationRecord = avcConfigurationBox.getavcDecoderConfigurationRecord();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("AvcNalUnitStorageBox.java", AvcNalUnitStorageBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAvcDecoderConfigurationRecord", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "com.mp4parser.iso14496.part15.AvcDecoderConfigurationRecord"), 44);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getLengthSizeMinusOne", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", Constants.INT), 49);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSPS", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "[Ljava.lang.String;"), 53);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getPPS", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "[Ljava.lang.String;"), 57);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSequenceParameterSetsAsStrings", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.util.List"), 61);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSequenceParameterSetExtsAsStrings", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.util.List"), 65);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getPictureParameterSetsAsStrings", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.util.List"), 69);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.googlecode.mp4parser.boxes.basemediaformat.AvcNalUnitStorageBox", "", "", "", "java.lang.String"), 89);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        this.avcDecoderConfigurationRecord = new jp1(byteBuffer);
    }

    public jp1 getAvcDecoderConfigurationRecord() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.avcDecoderConfigurationRecord;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        this.avcDecoderConfigurationRecord.m142559a(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return this.avcDecoderConfigurationRecord.m142560b();
    }

    public int getLengthSizeMinusOne() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this));
        return this.avcDecoderConfigurationRecord.f119035e;
    }

    public String[] getPPS() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this));
        return this.avcDecoderConfigurationRecord.m142561c();
    }

    public List<String> getPictureParameterSetsAsStrings() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_6, this, this));
        return this.avcDecoderConfigurationRecord.m142562d();
    }

    public String[] getSPS() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.avcDecoderConfigurationRecord.m142563e();
    }

    public List<String> getSequenceParameterSetExtsAsStrings() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_5, this, this));
        return this.avcDecoderConfigurationRecord.m142564f();
    }

    public List<String> getSequenceParameterSetsAsStrings() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.avcDecoderConfigurationRecord.m142565g();
    }

    public String toString() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_7, this, this));
        return "AvcNalUnitStorageBox{SPS=" + this.avcDecoderConfigurationRecord.m142565g() + ",PPS=" + this.avcDecoderConfigurationRecord.m142562d() + ",lengthSize=" + (this.avcDecoderConfigurationRecord.f119035e + 1) + '}';
    }

    public AvcNalUnitStorageBox() {
        super(TYPE);
    }
}
