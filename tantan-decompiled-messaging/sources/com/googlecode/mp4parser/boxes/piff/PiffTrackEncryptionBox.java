package com.googlecode.mp4parser.boxes.piff;

import com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox;
import com.meituan.robust.Constants;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p149l.cvc0;

/* JADX INFO: loaded from: classes7.dex */
public class PiffTrackEncryptionBox extends AbstractTrackEncryptionBox {
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;

    static {
        ajc$preClinit();
    }

    public PiffTrackEncryptionBox() {
        super("uuid");
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("PiffTrackEncryptionBox.java", PiffTrackEncryptionBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getFlags", "com.googlecode.mp4parser.boxes.piff.PiffTrackEncryptionBox", "", "", "", Constants.INT), 29);
    }

    @Override // com.googlecode.mp4parser.AbstractFullBox, com.coremedia.iso.boxes.FullBox
    public int getFlags() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return 0;
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public byte[] getUserType() {
        return new byte[]{-119, 116, -37, -50, 123, -25, 76, 81, -124, -7, 113, 72, -7, -120, 37, 84};
    }
}
