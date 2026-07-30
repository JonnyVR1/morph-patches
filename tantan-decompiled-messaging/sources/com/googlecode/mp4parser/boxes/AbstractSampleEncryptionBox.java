package com.googlecode.mp4parser.boxes;

import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.googlecode.mp4parser.AbstractFullBox;
import com.meituan.robust.Constants;
import java.io.IOException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.nio.channels.WritableByteChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.aspectj.lang.JoinPoint;
import org.aspectj.runtime.reflect.Factory;
import org.spongycastle.crypto.tls.CipherSuite;
import p149l.bzp;
import p149l.cvc0;
import p149l.pn4;
import p149l.upk0;
import p149l.yyp;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractSampleEncryptionBox extends AbstractFullBox {
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    protected int algorithmId;
    List<pn4> entries;
    protected int ivSize;
    protected byte[] kid;

    static {
        ajc$preClinit();
    }

    public AbstractSampleEncryptionBox(String str) {
        super(str);
        this.algorithmId = -1;
        this.ivSize = -1;
        this.kid = new byte[]{-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        this.entries = Collections.EMPTY_LIST;
    }

    private static /* synthetic */ void ajc$preClinit() {
        Factory factory = new Factory("AbstractSampleEncryptionBox.java", AbstractSampleEncryptionBox.class);
        ajc$tjp_0 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getOffsetToFirstIV", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", Constants.INT), 29);
        ajc$tjp_1 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEntries", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "java.util.List"), 89);
        ajc$tjp_2 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "setEntries", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "java.util.List", RemoteConfigConstants.ResponseFieldKey.ENTRIES, "", Constants.VOID), 93);
        ajc$tjp_3 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "equals", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "java.lang.Object", "o", "", Constants.BOOLEAN), 162);
        ajc$tjp_4 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "hashCode", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", Constants.INT), CipherSuite.TLS_DHE_DSS_WITH_CAMELLIA_128_CBC_SHA256);
        ajc$tjp_5 = factory.makeSJP(JoinPoint.METHOD_EXECUTION, factory.makeMethodSig("1", "getEntrySizes", "com.googlecode.mp4parser.boxes.AbstractSampleEncryptionBox", "", "", "", "java.util.List"), CipherSuite.TLS_DH_anon_WITH_CAMELLIA_256_CBC_SHA256);
    }

    private List<pn4> parseEntries(ByteBuffer byteBuffer, long j, int i) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            long j2 = j - 1;
            if (j <= 0) {
                return arrayList;
            }
            try {
                pn4 pn4Var = new pn4();
                byte[] bArr = new byte[i];
                pn4Var.f150325a = bArr;
                byteBuffer.get(bArr);
                if ((getFlags() & 2) > 0) {
                    pn4Var.f150326b = new pn4.InterfaceC19297j[yyp.m216556i(byteBuffer)];
                    int i2 = 0;
                    while (true) {
                        pn4.InterfaceC19297j[] interfaceC19297jArr = pn4Var.f150326b;
                        if (i2 >= interfaceC19297jArr.length) {
                            break;
                        }
                        interfaceC19297jArr[i2] = pn4Var.m170378a(yyp.m216556i(byteBuffer), yyp.m216558k(byteBuffer));
                        i2++;
                    }
                }
                arrayList.add(pn4Var);
                j = j2;
            } catch (BufferUnderflowException unused) {
                return null;
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void _parseDetails(ByteBuffer byteBuffer) {
        parseVersionAndFlags(byteBuffer);
        if ((getFlags() & 1) > 0) {
            this.algorithmId = yyp.m216557j(byteBuffer);
            this.ivSize = yyp.m216561n(byteBuffer);
            byte[] bArr = new byte[16];
            this.kid = bArr;
            byteBuffer.get(bArr);
        }
        long jM216558k = yyp.m216558k(byteBuffer);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        ByteBuffer byteBufferDuplicate2 = byteBuffer.duplicate();
        List<pn4> entries = parseEntries(byteBufferDuplicate, jM216558k, 8);
        this.entries = entries;
        if (entries == null) {
            this.entries = parseEntries(byteBufferDuplicate2, jM216558k, 16);
            byteBuffer.position((byteBuffer.position() + byteBuffer.remaining()) - byteBufferDuplicate2.remaining());
        } else {
            byteBuffer.position((byteBuffer.position() + byteBuffer.remaining()) - byteBufferDuplicate.remaining());
        }
        if (this.entries != null) {
            return;
        }
        upk0.m194883a("Cannot parse SampleEncryptionBox");
    }

    public boolean equals(Object obj) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_3, this, this, obj));
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractSampleEncryptionBox abstractSampleEncryptionBox = (AbstractSampleEncryptionBox) obj;
        if (this.algorithmId != abstractSampleEncryptionBox.algorithmId || this.ivSize != abstractSampleEncryptionBox.ivSize) {
            return false;
        }
        List<pn4> list = this.entries;
        List<pn4> list2 = abstractSampleEncryptionBox.entries;
        if (list == null ? list2 == null : list.equals(list2)) {
            return Arrays.equals(this.kid, abstractSampleEncryptionBox.kid);
        }
        return false;
    }

    @Override // com.googlecode.mp4parser.AbstractBox, p149l.pe3, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        super.getBox(writableByteChannel);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (isOverrideTrackEncryptionBoxParameters()) {
            bzp.m104634f(byteBuffer, this.algorithmId);
            bzp.m104638j(byteBuffer, this.ivSize);
            byteBuffer.put(this.kid);
        }
        bzp.m104635g(byteBuffer, this.entries.size());
        for (pn4 pn4Var : this.entries) {
            if (pn4Var.m170379b() > 0) {
                byte[] bArr = pn4Var.f150325a;
                if (bArr.length != 8 && bArr.length != 16) {
                    upk0.m194883a("IV must be either 8 or 16 bytes");
                    return;
                }
                byteBuffer.put(bArr);
                if (isSubSampleEncryption()) {
                    bzp.m104633e(byteBuffer, pn4Var.f150326b.length);
                    for (pn4.InterfaceC19297j interfaceC19297j : pn4Var.f150326b) {
                        bzp.m104633e(byteBuffer, interfaceC19297j.clear());
                        bzp.m104635g(byteBuffer, interfaceC19297j.mo170380a());
                    }
                }
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        long length = (isOverrideTrackEncryptionBoxParameters() ? 8 + ((long) this.kid.length) : 4L) + 4;
        Iterator<pn4> it = this.entries.iterator();
        while (it.hasNext()) {
            length += (long) it.next().m170379b();
        }
        return length;
    }

    public List<pn4> getEntries() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_1, this, this));
        return this.entries;
    }

    public List<Short> getEntrySizes() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_5, this, this));
        ArrayList arrayList = new ArrayList(this.entries.size());
        for (pn4 pn4Var : this.entries) {
            short length = (short) pn4Var.f150325a.length;
            if (isSubSampleEncryption()) {
                length = (short) (((short) (length + 2)) + (pn4Var.f150326b.length * 6));
            }
            arrayList.add(Short.valueOf(length));
        }
        return arrayList;
    }

    public int getOffsetToFirstIV() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_0, this, this));
        return (getSize() > 4294967296L ? 16 : 8) + (isOverrideTrackEncryptionBoxParameters() ? this.kid.length + 4 : 0) + 4;
    }

    public int hashCode() {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_4, this, this));
        int i = ((this.algorithmId * 31) + this.ivSize) * 31;
        byte[] bArr = this.kid;
        int iHashCode = (i + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
        List<pn4> list = this.entries;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public boolean isOverrideTrackEncryptionBoxParameters() {
        return (getFlags() & 1) > 0;
    }

    public boolean isSubSampleEncryption() {
        return (getFlags() & 2) > 0;
    }

    public void setEntries(List<pn4> list) {
        cvc0.m108851b().m108852c(Factory.makeJP(ajc$tjp_2, this, this, list));
        this.entries = list;
    }

    public void setSubSampleEncryption(boolean z) {
        if (z) {
            setFlags(getFlags() | 2);
        } else {
            setFlags(getFlags() & 16777213);
        }
    }
}
