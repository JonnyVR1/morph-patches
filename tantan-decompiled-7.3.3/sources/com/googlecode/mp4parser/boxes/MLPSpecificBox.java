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
public class MLPSpecificBox extends AbstractBox {
    public static final String TYPE = "dmlp";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7 = null;
    int format_info;
    int peak_data_rate;
    int reserved;
    int reserved2;

    static {
        ajc$preClinit();
    }

    public MLPSpecificBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("MLPSpecificBox.java", MLPSpecificBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getFormat_info", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", Constants.INT), 49);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setFormat_info", "com.googlecode.mp4parser.boxes.MLPSpecificBox", Constants.INT, "format_info", "", Constants.VOID), 53);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getPeak_data_rate", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", Constants.INT), 57);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setPeak_data_rate", "com.googlecode.mp4parser.boxes.MLPSpecificBox", Constants.INT, "peak_data_rate", "", Constants.VOID), 61);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getReserved", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", Constants.INT), 65);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setReserved", "com.googlecode.mp4parser.boxes.MLPSpecificBox", Constants.INT, "reserved", "", Constants.VOID), 69);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getReserved2", "com.googlecode.mp4parser.boxes.MLPSpecificBox", "", "", "", Constants.INT), 73);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setReserved2", "com.googlecode.mp4parser.boxes.MLPSpecificBox", Constants.INT, "reserved2", "", Constants.VOID), 77);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        g13 g13Var = new g13(byteBuffer);
        this.format_info = g13Var.m128488a(32);
        this.peak_data_rate = g13Var.m128488a(15);
        this.reserved = g13Var.m128488a(1);
        this.reserved2 = g13Var.m128488a(32);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        i13 i13Var = new i13(byteBuffer);
        i13Var.m138073a(this.format_info, 32);
        i13Var.m138073a(this.peak_data_rate, 15);
        i13Var.m138073a(this.reserved, 1);
        i13Var.m138073a(this.reserved2, 32);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 10L;
    }

    public int getFormat_info() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.format_info;
    }

    public int getPeak_data_rate() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.peak_data_rate;
    }

    public int getReserved() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.reserved;
    }

    public int getReserved2() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_6, this, this));
        return this.reserved2;
    }

    public void setFormat_info(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        this.format_info = i;
    }

    public void setPeak_data_rate(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i)));
        this.peak_data_rate = i;
    }

    public void setReserved(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_5, this, this, Conversions.intObject(i)));
        this.reserved = i;
    }

    public void setReserved2(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_7, this, this, Conversions.intObject(i)));
        this.reserved2 = i;
    }
}
