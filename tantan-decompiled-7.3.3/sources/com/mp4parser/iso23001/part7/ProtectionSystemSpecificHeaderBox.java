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
import p153l.b1q;
import p153l.f3d0;
import p153l.lqj0;
import p153l.rn4;
import p153l.y0q;

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
        OMA2_SYSTEM_ID = lqj0.m155494b(UUID.fromString("A2B55680-6F43-11E0-9A3F-0002A5D5C51B"));
        PLAYREADY_SYSTEM_ID = lqj0.m155494b(UUID.fromString("9A04F079-9840-4286-AB92-E65BE0885F95"));
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
            int iM182119a = rn4.m182119a(y0q.m213895k(byteBuffer));
            while (true) {
                int i = iM182119a - 1;
                if (iM182119a <= 0) {
                    break;
                }
                byte[] bArr2 = new byte[16];
                byteBuffer.get(bArr2);
                this.keyIds.add(lqj0.m155493a(bArr2));
                iM182119a = i;
            }
        }
        y0q.m213895k(byteBuffer);
        byte[] bArr3 = new byte[byteBuffer.remaining()];
        this.content = bArr3;
        byteBuffer.get(bArr3);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(this.systemId, 0, 16);
        if (getVersion() > 0) {
            b1q.m101495g(byteBuffer, this.keyIds.size());
            Iterator<UUID> it = this.keyIds.iterator();
            while (it.hasNext()) {
                byteBuffer.put(lqj0.m155494b(it.next()));
            }
        }
        b1q.m101495g(byteBuffer, this.content.length);
        byteBuffer.put(this.content);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        long length = this.content.length + 24;
        return getVersion() > 0 ? length + 4 + ((long) (this.keyIds.size() * 16)) : length;
    }

    public List<UUID> getKeyIds() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.keyIds;
    }

    public byte[] getSystemId() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.systemId;
    }

    public void setContent(byte[] bArr) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_5, this, this, bArr));
        this.content = bArr;
    }

    public void setKeyIds(List<UUID> list) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this, list));
        this.keyIds = list;
    }

    public void setSystemId(byte[] bArr) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this, bArr));
        this.systemId = bArr;
    }

    public byte[] getContent() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.content;
    }
}
