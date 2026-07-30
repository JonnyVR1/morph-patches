package com.googlecode.mp4parser.boxes;

import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;
import java.util.UUID;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.internal.Conversions;
import org.aspectj.runtime.reflect.Factory;
import p149l.bzp;
import p149l.cvc0;
import p149l.yyp;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractTrackEncryptionBox extends AbstractFullBox {
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_6 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_7 = null;
    int defaultAlgorithmId;
    int defaultIvSize;
    byte[] default_KID;

    static {
        ajc$preClinit();
    }

    public AbstractTrackEncryptionBox(String str) {
        super(str);
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("AbstractTrackEncryptionBox.java", AbstractTrackEncryptionBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDefaultAlgorithmId", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "", "", "", Constants.INT), 24);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDefaultAlgorithmId", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", Constants.INT, "defaultAlgorithmId", "", Constants.VOID), 28);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDefaultIvSize", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "", "", "", Constants.INT), 32);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDefaultIvSize", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", Constants.INT, "defaultIvSize", "", Constants.VOID), 36);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getDefault_KID", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "", "", "", "java.util.UUID"), 40);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setDefault_KID", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "java.util.UUID", "uuid", "", Constants.VOID), 46);
        ajc$tjp_6 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "equals", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "java.lang.Object", "o", "", Constants.BOOLEAN), 76);
        ajc$tjp_7 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "hashCode", "com.googlecode.mp4parser.boxes.AbstractTrackEncryptionBox", "", "", "", Constants.INT), 90);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        this.defaultAlgorithmId = yyp.m216557j(byteBuffer);
        this.defaultIvSize = yyp.m216561n(byteBuffer);
        byte[] bArr = new byte[16];
        this.default_KID = bArr;
        byteBuffer.get(bArr);
    }

    public boolean equals(Object obj) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_6, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractTrackEncryptionBox abstractTrackEncryptionBox = (AbstractTrackEncryptionBox) obj;
        return this.defaultAlgorithmId == abstractTrackEncryptionBox.defaultAlgorithmId && this.defaultIvSize == abstractTrackEncryptionBox.defaultIvSize && Arrays.equals(this.default_KID, abstractTrackEncryptionBox.default_KID);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        bzp.m104634f(byteBuffer, this.defaultAlgorithmId);
        bzp.m104638j(byteBuffer, this.defaultIvSize);
        byteBuffer.put(this.default_KID);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        return 24L;
    }

    public int getDefaultAlgorithmId() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.defaultAlgorithmId;
    }

    public int getDefaultIvSize() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.defaultIvSize;
    }

    public UUID getDefault_KID() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_4, this, this));
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.default_KID);
        byteBufferWrap.order(ByteOrder.BIG_ENDIAN);
        return new UUID(byteBufferWrap.getLong(), byteBufferWrap.getLong());
    }

    public int hashCode() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_7, this, this));
        int i = ((this.defaultAlgorithmId * 31) + this.defaultIvSize) * 31;
        byte[] bArr = this.default_KID;
        return i + (bArr != null ? Arrays.hashCode(bArr) : 0);
    }

    public void setDefaultAlgorithmId(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, Conversions.intObject(i)));
        this.defaultAlgorithmId = i;
    }

    public void setDefaultIvSize(int i) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this, Conversions.intObject(i)));
        this.defaultIvSize = i;
    }

    public void setDefault_KID(UUID uuid) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_5, this, this, uuid));
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[16]);
        byteBufferWrap.putLong(uuid.getMostSignificantBits());
        byteBufferWrap.putLong(uuid.getLeastSignificantBits());
        this.default_KID = byteBufferWrap.array();
    }
}
