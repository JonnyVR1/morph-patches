package com.googlecode.mp4parser.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import p149l.cvc0;
import p149l.r03;
import p149l.t03;

/* JADX INFO: loaded from: classes7.dex */
public class AC3SpecificBox extends AbstractBox {
    public static final String TYPE = "dac3";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_10 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_11 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_12 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_13 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_14 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9 = null;
    int acmod;
    int bitRateCode;
    int bsid;
    int bsmod;
    int fscod;
    int lfeon;
    int reserved;

    static {
        ajc$preClinit();
    }

    public AC3SpecificBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("AC3SpecificBox.java", AC3SpecificBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getFscod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", Constants.INT), 55);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setFscod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", Constants.INT, "fscod", "", Constants.VOID), 59);
        ajc$tjp_10 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getBitRateCode", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", Constants.INT), 95);
        ajc$tjp_11 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setBitRateCode", "com.googlecode.mp4parser.boxes.AC3SpecificBox", Constants.INT, "bitRateCode", "", Constants.VOID), 99);
        ajc$tjp_12 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getReserved", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", Constants.INT), 103);
        ajc$tjp_13 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setReserved", "com.googlecode.mp4parser.boxes.AC3SpecificBox", Constants.INT, "reserved", "", Constants.VOID), 107);
        ajc$tjp_14 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "toString", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", "java.lang.String"), 112);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getBsid", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", Constants.INT), 63);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setBsid", "com.googlecode.mp4parser.boxes.AC3SpecificBox", Constants.INT, "bsid", "", Constants.VOID), 67);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getBsmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", Constants.INT), 71);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setBsmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", Constants.INT, "bsmod", "", Constants.VOID), 75);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getAcmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", Constants.INT), 79);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setAcmod", "com.googlecode.mp4parser.boxes.AC3SpecificBox", Constants.INT, "acmod", "", Constants.VOID), 83);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getLfeon", "com.googlecode.mp4parser.boxes.AC3SpecificBox", "", "", "", Constants.INT), 87);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setLfeon", "com.googlecode.mp4parser.boxes.AC3SpecificBox", Constants.INT, "lfeon", "", Constants.VOID), 91);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        r03 r03Var = new r03(byteBuffer);
        this.fscod = r03Var.m177327a(2);
        this.bsid = r03Var.m177327a(5);
        this.bsmod = r03Var.m177327a(3);
        this.acmod = r03Var.m177327a(3);
        this.lfeon = r03Var.m177327a(1);
        this.bitRateCode = r03Var.m177327a(5);
        this.reserved = r03Var.m177327a(5);
    }

    public int getAcmod() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_6, this, this));
        return this.acmod;
    }

    public int getBitRateCode() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_10, this, this));
        return this.bitRateCode;
    }

    public int getBsid() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.bsid;
    }

    public int getBsmod() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.bsmod;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        t03 t03Var = new t03(byteBuffer);
        t03Var.m186811a(this.fscod, 2);
        t03Var.m186811a(this.bsid, 5);
        t03Var.m186811a(this.bsmod, 3);
        t03Var.m186811a(this.acmod, 3);
        t03Var.m186811a(this.lfeon, 1);
        t03Var.m186811a(this.bitRateCode, 5);
        t03Var.m186811a(this.reserved, 5);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 3L;
    }

    public int getFscod() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.fscod;
    }

    public int getLfeon() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_8, this, this));
        return this.lfeon;
    }

    public int getReserved() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_12, this, this));
        return this.reserved;
    }

    public void setAcmod(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_7, this, this, Conversions.intObject(i)));
        this.acmod = i;
    }

    public void setBitRateCode(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_11, this, this, Conversions.intObject(i)));
        this.bitRateCode = i;
    }

    public void setBsid(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i)));
        this.bsid = i;
    }

    public void setBsmod(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_5, this, this, Conversions.intObject(i)));
        this.bsmod = i;
    }

    public void setFscod(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        this.fscod = i;
    }

    public void setLfeon(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_9, this, this, Conversions.intObject(i)));
        this.lfeon = i;
    }

    public void setReserved(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_13, this, this, Conversions.intObject(i)));
        this.reserved = i;
    }

    public String toString() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_14, this, this));
        return "AC3SpecificBox{fscod=" + this.fscod + ", bsid=" + this.bsid + ", bsmod=" + this.bsmod + ", acmod=" + this.acmod + ", lfeon=" + this.lfeon + ", bitRateCode=" + this.bitRateCode + ", reserved=" + this.reserved + '}';
    }
}
