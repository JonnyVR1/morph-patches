package com.coremedia.iso.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import p153l.b1q;
import p153l.f3d0;
import p153l.y0q;

/* JADX INFO: loaded from: classes.dex */
public final class OmaDrmAccessUnitFormatBox extends AbstractFullBox {
    public static final String TYPE = "odaf";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private byte allBits;
    private int initVectorLength;
    private int keyIndicatorLength;
    private boolean selectiveEncryption;

    static {
        ajc$preClinit();
    }

    public OmaDrmAccessUnitFormatBox() {
        super(TYPE);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("OmaDrmAccessUnitFormatBox.java", OmaDrmAccessUnitFormatBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "isSelectiveEncryption", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "", "", "", Constants.BOOLEAN), 46);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getKeyIndicatorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "", "", "", Constants.INT), 50);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getInitVectorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", "", "", "", Constants.INT), 54);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setInitVectorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", Constants.INT, "initVectorLength", "", Constants.VOID), 58);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setKeyIndicatorLength", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", Constants.INT, "keyIndicatorLength", "", Constants.VOID), 62);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setAllBits", "com.coremedia.iso.boxes.OmaDrmAccessUnitFormatBox", Constants.BYTE, "allBits", "", Constants.VOID), 66);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        byte bM213898n = (byte) y0q.m213898n(byteBuffer);
        this.allBits = bM213898n;
        this.selectiveEncryption = (bM213898n & 128) == 128;
        this.keyIndicatorLength = y0q.m213898n(byteBuffer);
        this.initVectorLength = y0q.m213898n(byteBuffer);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        b1q.m101498j(byteBuffer, this.allBits);
        b1q.m101498j(byteBuffer, this.keyIndicatorLength);
        b1q.m101498j(byteBuffer, this.initVectorLength);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 7L;
    }

    public int getInitVectorLength() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.initVectorLength;
    }

    public int getKeyIndicatorLength() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this));
        return this.keyIndicatorLength;
    }

    public boolean isSelectiveEncryption() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.selectiveEncryption;
    }

    public void setAllBits(byte b) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_5, this, this, Conversions.byteObject(b)));
        this.allBits = b;
        this.selectiveEncryption = (b & 128) == 128;
    }

    public void setInitVectorLength(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i)));
        this.initVectorLength = i;
    }

    public void setKeyIndicatorLength(int i) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_4, this, this, Conversions.intObject(i)));
        this.keyIndicatorLength = i;
    }
}
