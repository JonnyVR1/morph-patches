package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import p153l.f3d0;

/* JADX INFO: loaded from: classes.dex */
public class CompositionShiftLeastGreatestAtom extends AbstractFullBox {
    public static final String TYPE = "cslg";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_8 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_9 = null;
    int compositionOffsetToDisplayOffsetShift;
    int displayEndTime;
    int displayStartTime;
    int greatestDisplayOffset;
    int leastDisplayOffset;

    static {
        ajc$preClinit();
    }

    public CompositionShiftLeastGreatestAtom() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("CompositionShiftLeastGreatestAtom.java", CompositionShiftLeastGreatestAtom.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getCompositionOffsetToDisplayOffsetShift", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "", "", "", Constants.INT), 66);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setCompositionOffsetToDisplayOffsetShift", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", Constants.INT, "compositionOffsetToDisplayOffsetShift", "", Constants.VOID), 70);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getLeastDisplayOffset", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "", "", "", Constants.INT), 74);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setLeastDisplayOffset", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", Constants.INT, "leastDisplayOffset", "", Constants.VOID), 78);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getGreatestDisplayOffset", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "", "", "", Constants.INT), 82);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setGreatestDisplayOffset", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", Constants.INT, "greatestDisplayOffset", "", Constants.VOID), 86);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDisplayStartTime", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "", "", "", Constants.INT), 90);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDisplayStartTime", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", Constants.INT, "displayStartTime", "", Constants.VOID), 94);
        ajc$tjp_8 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDisplayEndTime", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", "", "", "", Constants.INT), 98);
        ajc$tjp_9 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDisplayEndTime", "com.coremedia.iso.boxes.CompositionShiftLeastGreatestAtom", Constants.INT, "displayEndTime", "", Constants.VOID), 102);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.compositionOffsetToDisplayOffsetShift = byteBuffer.getInt();
        this.leastDisplayOffset = byteBuffer.getInt();
        this.greatestDisplayOffset = byteBuffer.getInt();
        this.displayStartTime = byteBuffer.getInt();
        this.displayEndTime = byteBuffer.getInt();
    }

    public int getCompositionOffsetToDisplayOffsetShift() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.compositionOffsetToDisplayOffsetShift;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.putInt(this.compositionOffsetToDisplayOffsetShift);
        byteBuffer.putInt(this.leastDisplayOffset);
        byteBuffer.putInt(this.greatestDisplayOffset);
        byteBuffer.putInt(this.displayStartTime);
        byteBuffer.putInt(this.displayEndTime);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 24L;
    }

    public int getDisplayEndTime() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_8, this, this));
        return this.displayEndTime;
    }

    public int getDisplayStartTime() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_6, this, this));
        return this.displayStartTime;
    }

    public int getGreatestDisplayOffset() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.greatestDisplayOffset;
    }

    public int getLeastDisplayOffset() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.leastDisplayOffset;
    }

    public void setCompositionOffsetToDisplayOffsetShift(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        this.compositionOffsetToDisplayOffsetShift = i;
    }

    public void setDisplayEndTime(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_9, this, this, Conversions.intObject(i)));
        this.displayEndTime = i;
    }

    public void setDisplayStartTime(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_7, this, this, Conversions.intObject(i)));
        this.displayStartTime = i;
    }

    public void setGreatestDisplayOffset(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_5, this, this, Conversions.intObject(i)));
        this.greatestDisplayOffset = i;
    }

    public void setLeastDisplayOffset(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i)));
        this.leastDisplayOffset = i;
    }
}
