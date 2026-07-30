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
import p153l.azk0;
import p153l.b1q;
import p153l.f3d0;
import p153l.oo4;
import p153l.y0q;

/* JADX INFO: loaded from: classes7.dex */
public abstract class AbstractSampleEncryptionBox extends AbstractFullBox {
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_0 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_1 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_2 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_3 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_4 = null;
    private static final /* synthetic */ JoinPoint.StaticPart ajc$tjp_5 = null;
    protected int algorithmId;
    List<oo4> entries;
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

    private List<oo4> parseEntries(ByteBuffer byteBuffer, long j, int i) {
        ArrayList arrayList = new ArrayList();
        while (true) {
            long j2 = j - 1;
            if (j <= 0) {
                return arrayList;
            }
            try {
                oo4 oo4Var = new oo4();
                byte[] bArr = new byte[i];
                oo4Var.f148285a = bArr;
                byteBuffer.get(bArr);
                if ((getFlags() & 2) > 0) {
                    oo4Var.f148286b = new oo4.InterfaceC19181j[y0q.m213893i(byteBuffer)];
                    int i2 = 0;
                    while (true) {
                        oo4.InterfaceC19181j[] interfaceC19181jArr = oo4Var.f148286b;
                        if (i2 >= interfaceC19181jArr.length) {
                            break;
                        }
                        interfaceC19181jArr[i2] = oo4Var.m168562a(y0q.m213893i(byteBuffer), y0q.m213895k(byteBuffer));
                        i2++;
                    }
                }
                arrayList.add(oo4Var);
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
            this.algorithmId = y0q.m213894j(byteBuffer);
            this.ivSize = y0q.m213898n(byteBuffer);
            byte[] bArr = new byte[16];
            this.kid = bArr;
            byteBuffer.get(bArr);
        }
        long jM213895k = y0q.m213895k(byteBuffer);
        ByteBuffer byteBufferDuplicate = byteBuffer.duplicate();
        ByteBuffer byteBufferDuplicate2 = byteBuffer.duplicate();
        List<oo4> entries = parseEntries(byteBufferDuplicate, jM213895k, 8);
        this.entries = entries;
        if (entries == null) {
            this.entries = parseEntries(byteBufferDuplicate2, jM213895k, 16);
            byteBuffer.position((byteBuffer.position() + byteBuffer.remaining()) - byteBufferDuplicate2.remaining());
        } else {
            byteBuffer.position((byteBuffer.position() + byteBuffer.remaining()) - byteBufferDuplicate.remaining());
        }
        if (this.entries != null) {
            return;
        }
        azk0.m101074a("Cannot parse SampleEncryptionBox");
    }

    public boolean equals(Object obj) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_3, this, this, obj));
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
        List<oo4> list = this.entries;
        List<oo4> list2 = abstractSampleEncryptionBox.entries;
        if (list == null ? list2 == null : list.equals(list2)) {
            return Arrays.equals(this.kid, abstractSampleEncryptionBox.kid);
        }
        return false;
    }

    @Override // com.googlecode.mp4parser.AbstractBox, p153l.ef3, com.coremedia.iso.boxes.FullBox
    public void getBox(WritableByteChannel writableByteChannel) throws IOException {
        super.getBox(writableByteChannel);
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public void getContent(ByteBuffer byteBuffer) {
        writeVersionAndFlags(byteBuffer);
        if (isOverrideTrackEncryptionBoxParameters()) {
            b1q.m101494f(byteBuffer, this.algorithmId);
            b1q.m101498j(byteBuffer, this.ivSize);
            byteBuffer.put(this.kid);
        }
        b1q.m101495g(byteBuffer, this.entries.size());
        for (oo4 oo4Var : this.entries) {
            if (oo4Var.m168563b() > 0) {
                byte[] bArr = oo4Var.f148285a;
                if (bArr.length != 8 && bArr.length != 16) {
                    azk0.m101074a("IV must be either 8 or 16 bytes");
                    return;
                }
                byteBuffer.put(bArr);
                if (isSubSampleEncryption()) {
                    b1q.m101493e(byteBuffer, oo4Var.f148286b.length);
                    for (oo4.InterfaceC19181j interfaceC19181j : oo4Var.f148286b) {
                        b1q.m101493e(byteBuffer, interfaceC19181j.clear());
                        b1q.m101495g(byteBuffer, interfaceC19181j.mo168564a());
                    }
                }
            }
        }
    }

    @Override // com.googlecode.mp4parser.AbstractBox
    public long getContentSize() {
        long length = (isOverrideTrackEncryptionBoxParameters() ? 8 + ((long) this.kid.length) : 4L) + 4;
        Iterator<oo4> it = this.entries.iterator();
        while (it.hasNext()) {
            length += (long) it.next().m168563b();
        }
        return length;
    }

    public List<oo4> getEntries() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_1, this, this));
        return this.entries;
    }

    public List<Short> getEntrySizes() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_5, this, this));
        ArrayList arrayList = new ArrayList(this.entries.size());
        for (oo4 oo4Var : this.entries) {
            short length = (short) oo4Var.f148285a.length;
            if (isSubSampleEncryption()) {
                length = (short) (((short) (length + 2)) + (oo4Var.f148286b.length * 6));
            }
            arrayList.add(Short.valueOf(length));
        }
        return arrayList;
    }

    public int getOffsetToFirstIV() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_0, this, this));
        return (getSize() > 4294967296L ? 16 : 8) + (isOverrideTrackEncryptionBoxParameters() ? this.kid.length + 4 : 0) + 4;
    }

    public int hashCode() {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_4, this, this));
        int i = ((this.algorithmId * 31) + this.ivSize) * 31;
        byte[] bArr = this.kid;
        int iHashCode = (i + (bArr != null ? Arrays.hashCode(bArr) : 0)) * 31;
        List<oo4> list = this.entries;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public boolean isOverrideTrackEncryptionBoxParameters() {
        return (getFlags() & 1) > 0;
    }

    public boolean isSubSampleEncryption() {
        return (getFlags() & 2) > 0;
    }

    public void setEntries(List<oo4> list) {
        f3d0.m123722b().m123723c(Factory.makeJP(ajc$tjp_2, this, this, list));
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
