package com.mp4parser.iso23001.part7;

import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import p149l.bzp;
import p149l.cvc0;
import p149l.ihj0;
import p149l.sm4;
import p149l.yyp;

/* JADX INFO: loaded from: classes8.dex */
public class ProtectionSystemSpecificHeaderBox extends AbstractFullBox {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static byte[] OMA2_SYSTEM_ID = null;
    public static byte[] PLAYREADY_SYSTEM_ID = null;
    public static final String TYPE = "pssh";
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    byte[] content;
    List<UUID> keyIds;
    byte[] systemId;

    static {
        ajc$preClinit();
        OMA2_SYSTEM_ID = ihj0.m136207b(UUID.fromString("A2B55680-6F43-11E0-9A3F-0002A5D5C51B"));
        PLAYREADY_SYSTEM_ID = ihj0.m136207b(UUID.fromString("9A04F079-9840-4286-AB92-E65BE0885F95"));
    }

    public ProtectionSystemSpecificHeaderBox() {
        super(TYPE);
        this.keyIds = new ArrayList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("ProtectionSystemSpecificHeaderBox.java", ProtectionSystemSpecificHeaderBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getKeyIds", "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox", "", "", "", "java.util.List"), 43);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setKeyIds", "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox", "java.util.List", "keyIds", "", Constants.VOID), 47);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getSystemId", "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox", "", "", "", "[B"), 54);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setSystemId", "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox", "[B", "systemId", "", Constants.VOID), 58);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getContent", "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox", "", "", "", "[B"), 63);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setContent", "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox", "[B", "content", "", Constants.VOID), 67);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        byte[] bArr = new byte[16];
        this.systemId = bArr;
        byteBuffer.get(bArr);
        if (getVersion() > 0) {
            int iM184929a = sm4.m184929a(yyp.m216558k(byteBuffer));
            while (true) {
                int i = iM184929a - 1;
                if (iM184929a <= 0) {
                    break;
                }
                byte[] bArr2 = new byte[16];
                byteBuffer.get(bArr2);
                this.keyIds.add(ihj0.m136206a(bArr2));
                iM184929a = i;
            }
        }
        yyp.m216558k(byteBuffer);
        byte[] bArr3 = new byte[byteBuffer.remaining()];
        this.content = bArr3;
        byteBuffer.get(bArr3);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(this.systemId, 0, 16);
        if (getVersion() > 0) {
            bzp.m104635g(byteBuffer, this.keyIds.size());
            Iterator<UUID> it = this.keyIds.iterator();
            while (it.hasNext()) {
                byteBuffer.put(ihj0.m136207b(it.next()));
            }
        }
        bzp.m104635g(byteBuffer, this.content.length);
        byteBuffer.put(this.content);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        long length = this.content.length + 24;
        return getVersion() > 0 ? length + 4 + ((long) (this.keyIds.size() * 16)) : length;
    }

    public List<UUID> getKeyIds() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.keyIds;
    }

    public byte[] getSystemId() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.systemId;
    }

    public void setContent(byte[] bArr) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_5, this, this, bArr));
        this.content = bArr;
    }

    public void setKeyIds(List<UUID> list) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this, list));
        this.keyIds = list;
    }

    public void setSystemId(byte[] bArr) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this, bArr));
        this.systemId = bArr;
    }

    public byte[] getContent() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.content;
    }
}
