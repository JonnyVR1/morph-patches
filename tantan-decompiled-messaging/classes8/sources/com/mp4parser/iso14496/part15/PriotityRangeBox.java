package com.mp4parser.iso14496.part15;

import com.googlecode.mp4parser.AbstractBox;
import com.momo.xeengine.gift.GiftLogEvent;
import java.nio.ByteBuffer;
import l.bzp;
import l.cvc0;
import l.yyp;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
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
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getReserved1", "com.mp4parser.iso14496.part15.PriotityRangeBox", "", "", "", "int"), 45);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setReserved1", "com.mp4parser.iso14496.part15.PriotityRangeBox", "int", "reserved1", "", "void"), 49);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getMin_priorityId", "com.mp4parser.iso14496.part15.PriotityRangeBox", "", "", "", "int"), 53);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setMin_priorityId", "com.mp4parser.iso14496.part15.PriotityRangeBox", "int", "min_priorityId", "", "void"), 57);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getReserved2", "com.mp4parser.iso14496.part15.PriotityRangeBox", "", "", "", "int"), 61);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setReserved2", "com.mp4parser.iso14496.part15.PriotityRangeBox", "int", "reserved2", "", "void"), 65);
        ajc$tjp_6 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getMax_priorityId", "com.mp4parser.iso14496.part15.PriotityRangeBox", "", "", "", "int"), 69);
        ajc$tjp_7 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setMax_priorityId", "com.mp4parser.iso14496.part15.PriotityRangeBox", "int", "max_priorityId", "", "void"), 73);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        int iN = yyp.n(byteBuffer);
        this.reserved1 = (iN & 192) >> 6;
        this.min_priorityId = iN & 63;
        int iN2 = yyp.n(byteBuffer);
        this.reserved2 = (iN2 & 192) >> 6;
        this.max_priorityId = iN2 & 63;
    }

    public void getContent(ByteBuffer byteBuffer) {
        bzp.j(byteBuffer, (this.reserved1 << 6) + this.min_priorityId);
        bzp.j(byteBuffer, (this.reserved2 << 6) + this.max_priorityId);
    }

    public long getContentSize() {
        return 2L;
    }

    public int getMax_priorityId() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_6, this, this));
        return this.max_priorityId;
    }

    public int getMin_priorityId() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.min_priorityId;
    }

    public int getReserved1() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.reserved1;
    }

    public int getReserved2() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.reserved2;
    }

    public void setMax_priorityId(int i) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_7, this, this, Conversions.intObject(i)));
        this.max_priorityId = i;
    }

    public void setMin_priorityId(int i) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i)));
        this.min_priorityId = i;
    }

    public void setReserved1(int i) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        this.reserved1 = i;
    }

    public void setReserved2(int i) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_5, this, this, Conversions.intObject(i)));
        this.reserved2 = i;
    }
}
