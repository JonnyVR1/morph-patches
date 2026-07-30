package p153l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
@svd(tags = {4})
public class iid extends cj2 {

    /* JADX INFO: renamed from: n */
    private static Logger f115074n = Logger.getLogger(iid.class.getName());

    /* JADX INFO: renamed from: d */
    int f115075d;

    /* JADX INFO: renamed from: e */
    int f115076e;

    /* JADX INFO: renamed from: f */
    int f115077f;

    /* JADX INFO: renamed from: g */
    int f115078g;

    /* JADX INFO: renamed from: h */
    long f115079h;

    /* JADX INFO: renamed from: i */
    long f115080i;

    /* JADX INFO: renamed from: j */
    oid f115081j;

    /* JADX INFO: renamed from: k */
    od1 f115082k;

    /* JADX INFO: renamed from: l */
    List<r0a0> f115083l = new ArrayList();

    /* JADX INFO: renamed from: m */
    byte[] f115084m;

    @Override // p153l.cj2
    /* JADX INFO: renamed from: e */
    public void mo98560e(ByteBuffer byteBuffer) throws IOException {
        int iM110047a;
        this.f115075d = y0q.m213898n(byteBuffer);
        int iM213898n = y0q.m213898n(byteBuffer);
        this.f115076e = iM213898n >>> 2;
        this.f115077f = (iM213898n >> 1) & 1;
        this.f115078g = y0q.m213894j(byteBuffer);
        this.f115079h = y0q.m213895k(byteBuffer);
        this.f115080i = y0q.m213895k(byteBuffer);
        if (byteBuffer.remaining() > 2) {
            int iPosition = byteBuffer.position();
            cj2 cj2VarM103053a = b950.m103053a(this.f115075d, byteBuffer);
            int iPosition2 = byteBuffer.position() - iPosition;
            Logger logger = f115074n;
            StringBuilder sb = new StringBuilder();
            sb.append(cj2VarM103053a);
            sb.append(" - DecoderConfigDescr1 read: ");
            sb.append(iPosition2);
            sb.append(", size: ");
            sb.append(cj2VarM103053a != null ? Integer.valueOf(cj2VarM103053a.m110047a()) : null);
            logger.finer(sb.toString());
            if (cj2VarM103053a != null && iPosition2 < (iM110047a = cj2VarM103053a.m110047a())) {
                byte[] bArr = new byte[iM110047a - iPosition2];
                this.f115084m = bArr;
                byteBuffer.get(bArr);
            }
            if (cj2VarM103053a instanceof oid) {
                this.f115081j = (oid) cj2VarM103053a;
            }
            if (cj2VarM103053a instanceof od1) {
                this.f115082k = (od1) cj2VarM103053a;
            }
        }
        while (byteBuffer.remaining() > 2) {
            long jPosition = byteBuffer.position();
            cj2 cj2VarM103053a2 = b950.m103053a(this.f115075d, byteBuffer);
            long jPosition2 = ((long) byteBuffer.position()) - jPosition;
            Logger logger2 = f115074n;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cj2VarM103053a2);
            sb2.append(" - DecoderConfigDescr2 read: ");
            sb2.append(jPosition2);
            sb2.append(", size: ");
            sb2.append(cj2VarM103053a2 != null ? Integer.valueOf(cj2VarM103053a2.m110047a()) : null);
            logger2.finer(sb2.toString());
            if (cj2VarM103053a2 instanceof r0a0) {
                this.f115083l.add((r0a0) cj2VarM103053a2);
            }
        }
    }

    @Override // p153l.cj2
    public String toString() {
        StringBuilder sb = new StringBuilder("DecoderConfigDescriptor{objectTypeIndication=");
        sb.append(this.f115075d);
        sb.append(", streamType=");
        sb.append(this.f115076e);
        sb.append(", upStream=");
        sb.append(this.f115077f);
        sb.append(", bufferSizeDB=");
        sb.append(this.f115078g);
        sb.append(", maxBitRate=");
        sb.append(this.f115079h);
        sb.append(", avgBitRate=");
        sb.append(this.f115080i);
        sb.append(", decoderSpecificInfo=");
        sb.append(this.f115081j);
        sb.append(", audioSpecificInfo=");
        sb.append(this.f115082k);
        sb.append(", configDescriptorDeadBytes=");
        byte[] bArr = this.f115084m;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sb.append(g2l.m128633a(bArr));
        sb.append(", profileLevelIndicationDescriptors=");
        List<r0a0> list = this.f115083l;
        sb.append(list == null ? "null" : Arrays.asList(list).toString());
        sb.append('}');
        return sb.toString();
    }
}
