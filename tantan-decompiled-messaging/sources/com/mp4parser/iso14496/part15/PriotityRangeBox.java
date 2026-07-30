package com.mp4parser.iso14496.part15;

import com.googlecode.mp4parser.AbstractBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import p149l.bzp;
import p149l.cvc0;
import p149l.yyp;

/* JADX INFO: loaded from: classes8.dex */
public class PriotityRangeBox extends AbstractBox {
    public static final String TYPE = "svpr";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7 = null;
    int max_priorityId;
    int min_priorityId;
    int reserved1;
    int reserved2;

    static {
        ajc$preClinit();
    }

    public PriotityRangeBox() {
        super(TYPE);
        this.reserved1 = 0;
        this.reserved2 = 0;
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("PriotityRangeBox.java", PriotityRangeBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getReserved1", "com.mp4parser.iso14496.part15.PriotityRangeBox", "", "", "", Constants.INT), 45);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setReserved1", "com.mp4parser.iso14496.part15.PriotityRangeBox", Constants.INT, "reserved1", "", Constants.VOID), 49);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getMin_priorityId", "com.mp4parser.iso14496.part15.PriotityRangeBox", "", "", "", Constants.INT), 53);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setMin_priorityId", "com.mp4parser.iso14496.part15.PriotityRangeBox", Constants.INT, "min_priorityId", "", Constants.VOID), 57);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getReserved2", "com.mp4parser.iso14496.part15.PriotityRangeBox", "", "", "", Constants.INT), 61);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setReserved2", "com.mp4parser.iso14496.part15.PriotityRangeBox", Constants.INT, "reserved2", "", Constants.VOID), 65);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getMax_priorityId", "com.mp4parser.iso14496.part15.PriotityRangeBox", "", "", "", Constants.INT), 69);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setMax_priorityId", "com.mp4parser.iso14496.part15.PriotityRangeBox", Constants.INT, "max_priorityId", "", Constants.VOID), 73);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        int iM216561n = yyp.m216561n(byteBuffer);
        this.reserved1 = (iM216561n & 192) >> 6;
        this.min_priorityId = iM216561n & 63;
        int iM216561n2 = yyp.m216561n(byteBuffer);
        this.reserved2 = (iM216561n2 & 192) >> 6;
        this.max_priorityId = iM216561n2 & 63;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        bzp.m104638j(byteBuffer, (this.reserved1 << 6) + this.min_priorityId);
        bzp.m104638j(byteBuffer, (this.reserved2 << 6) + this.max_priorityId);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 2L;
    }

    public int getMax_priorityId() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_6, this, this));
        return this.max_priorityId;
    }

    public int getMin_priorityId() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.min_priorityId;
    }

    public int getReserved1() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.reserved1;
    }

    public int getReserved2() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.reserved2;
    }

    public void setMax_priorityId(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_7, this, this, Conversions.intObject(i)));
        this.max_priorityId = i;
    }

    public void setMin_priorityId(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i)));
        this.min_priorityId = i;
    }

    public void setReserved1(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        this.reserved1 = i;
    }

    public void setReserved2(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_5, this, this, Conversions.intObject(i)));
        this.reserved2 = i;
    }
}
