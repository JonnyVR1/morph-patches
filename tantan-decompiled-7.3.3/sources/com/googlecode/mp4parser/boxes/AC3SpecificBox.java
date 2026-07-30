package com.googlecode.mp4parser.boxes;

import com.googlecode.mp4parser.AbstractBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import p153l.f3d0;
import p153l.g13;
import p153l.i13;

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
        g13 g13Var = new g13(byteBuffer);
        this.fscod = g13Var.m128488a(2);
        this.bsid = g13Var.m128488a(5);
        this.bsmod = g13Var.m128488a(3);
        this.acmod = g13Var.m128488a(3);
        this.lfeon = g13Var.m128488a(1);
        this.bitRateCode = g13Var.m128488a(5);
        this.reserved = g13Var.m128488a(5);
    }

    public int getAcmod() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_6, this, this));
        return this.acmod;
    }

    public int getBitRateCode() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_10, this, this));
        return this.bitRateCode;
    }

    public int getBsid() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.bsid;
    }

    public int getBsmod() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.bsmod;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        i13 i13Var = new i13(byteBuffer);
        i13Var.m138073a(this.fscod, 2);
        i13Var.m138073a(this.bsid, 5);
        i13Var.m138073a(this.bsmod, 3);
        i13Var.m138073a(this.acmod, 3);
        i13Var.m138073a(this.lfeon, 1);
        i13Var.m138073a(this.bitRateCode, 5);
        i13Var.m138073a(this.reserved, 5);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 3L;
    }

    public int getFscod() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.fscod;
    }

    public int getLfeon() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_8, this, this));
        return this.lfeon;
    }

    public int getReserved() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_12, this, this));
        return this.reserved;
    }

    public void setAcmod(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_7, this, this, Conversions.intObject(i)));
        this.acmod = i;
    }

    public void setBitRateCode(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_11, this, this, Conversions.intObject(i)));
        this.bitRateCode = i;
    }

    public void setBsid(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i)));
        this.bsid = i;
    }

    public void setBsmod(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_5, this, this, Conversions.intObject(i)));
        this.bsmod = i;
    }

    public void setFscod(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        this.fscod = i;
    }

    public void setLfeon(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_9, this, this, Conversions.intObject(i)));
        this.lfeon = i;
    }

    public void setReserved(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_13, this, this, Conversions.intObject(i)));
        this.reserved = i;
    }

    public String toString() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_14, this, this));
        return "AC3SpecificBox{fscod=" + this.fscod + ", bsid=" + this.bsid + ", bsmod=" + this.bsmod + ", acmod=" + this.acmod + ", lfeon=" + this.lfeon + ", bitRateCode=" + this.bitRateCode + ", reserved=" + this.reserved + '}';
    }
}
