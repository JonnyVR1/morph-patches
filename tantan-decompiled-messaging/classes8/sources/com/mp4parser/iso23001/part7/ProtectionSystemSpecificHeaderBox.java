package com.mp4parser.iso23001.part7;

import com.googlecode.mp4parser.AbstractFullBox;
import com.momo.xeengine.gift.GiftLogEvent;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import l.bzp;
import l.cvc0;
import l.ihj0;
import l.sm4;
import l.yyp;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
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
        OMA2_SYSTEM_ID = ihj0.b(UUID.fromString("A2B55680-6F43-11E0-9A3F-0002A5D5C51B"));
        PLAYREADY_SYSTEM_ID = ihj0.b(UUID.fromString("9A04F079-9840-4286-AB92-E65BE0885F95"));
    }

    public ProtectionSystemSpecificHeaderBox() {
        super(TYPE);
        this.keyIds = new ArrayList();
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("ProtectionSystemSpecificHeaderBox.java", ProtectionSystemSpecificHeaderBox.class);
        ajc$tjp_0 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getKeyIds", "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox", "", "", "", "java.util.List"), 43);
        ajc$tjp_1 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setKeyIds", "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox", "java.util.List", "keyIds", "", "void"), 47);
        ajc$tjp_2 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getSystemId", "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox", "", "", "", "[B"), 54);
        ajc$tjp_3 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setSystemId", "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox", "[B", "systemId", "", "void"), 58);
        ajc$tjp_4 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "getContent", "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox", "", "", "", "[B"), 63);
        ajc$tjp_5 = factory.makeSJP("method-execution", factory.makeMethodSig(GiftLogEvent.EVENT_ID_PLAY_SUCCESS, "setContent", "com.mp4parser.iso23001.part7.ProtectionSystemSpecificHeaderBox", "[B", "content", "", "void"), 67);
    }

    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        byte[] bArr = new byte[16];
        this.systemId = bArr;
        byteBuffer.get(bArr);
        if (getVersion() > 0) {
            int iA = sm4.a(yyp.k(byteBuffer));
            while (true) {
                int i = iA - 1;
                if (iA <= 0) {
                    break;
                }
                byte[] bArr2 = new byte[16];
                byteBuffer.get(bArr2);
                this.keyIds.add(ihj0.a(bArr2));
                iA = i;
            }
        }
        yyp.k(byteBuffer);
        byte[] bArr3 = new byte[byteBuffer.remaining()];
        this.content = bArr3;
        byteBuffer.get(bArr3);
    }

    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        byteBuffer.put(this.systemId, 0, 16);
        if (getVersion() > 0) {
            bzp.g(byteBuffer, this.keyIds.size());
            Iterator<UUID> it = this.keyIds.iterator();
            while (it.hasNext()) {
                byteBuffer.put(ihj0.b(it.next()));
            }
        }
        bzp.g(byteBuffer, this.content.length);
        byteBuffer.put(this.content);
    }

    public long getContentSize() {
        long length = this.content.length + 24;
        return getVersion() > 0 ? length + 4 + ((long) (this.keyIds.size() * 16)) : length;
    }

    public List<UUID> getKeyIds() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_0, this, this));
        return this.keyIds;
    }

    public byte[] getSystemId() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_2, this, this));
        return this.systemId;
    }

    public void setContent(byte[] bArr) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_5, this, this, bArr));
        this.content = bArr;
    }

    public void setKeyIds(List<UUID> list) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_1, this, this, list));
        this.keyIds = list;
    }

    public void setSystemId(byte[] bArr) {
        cvc0.b().c(Factory.makeJP(ajc$tjp_3, this, this, bArr));
        this.systemId = bArr;
    }

    public byte[] getContent() {
        cvc0.b().c(Factory.makeJP(ajc$tjp_4, this, this));
        return this.content;
    }
}
