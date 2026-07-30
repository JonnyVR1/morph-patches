package p149l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
@eud(tags = {4})
public class chd extends vi2 {

    /* JADX INFO: renamed from: n */
    private static Logger f80852n = Logger.getLogger(chd.class.getName());

    /* JADX INFO: renamed from: d */
    int f80853d;

    /* JADX INFO: renamed from: e */
    int f80854e;

    /* JADX INFO: renamed from: f */
    int f80855f;

    /* JADX INFO: renamed from: g */
    int f80856g;

    /* JADX INFO: renamed from: h */
    long f80857h;

    /* JADX INFO: renamed from: i */
    long f80858i;

    /* JADX INFO: renamed from: j */
    ihd f80859j;

    /* JADX INFO: renamed from: k */
    hd1 f80860k;

    /* JADX INFO: renamed from: l */
    List<ns90> f80861l = new ArrayList();

    /* JADX INFO: renamed from: m */
    byte[] f80862m;

    @Override // p149l.vi2
    /* JADX INFO: renamed from: e */
    public void mo106861e(ByteBuffer byteBuffer) throws IOException {
        int iM198491a;
        this.f80853d = yyp.m216561n(byteBuffer);
        int iM216561n = yyp.m216561n(byteBuffer);
        this.f80854e = iM216561n >>> 2;
        this.f80855f = (iM216561n >> 1) & 1;
        this.f80856g = yyp.m216557j(byteBuffer);
        this.f80857h = yyp.m216558k(byteBuffer);
        this.f80858i = yyp.m216558k(byteBuffer);
        if (byteBuffer.remaining() > 2) {
            int iPosition = byteBuffer.position();
            vi2 vi2VarM152502a = m050.m152502a(this.f80853d, byteBuffer);
            int iPosition2 = byteBuffer.position() - iPosition;
            Logger logger = f80852n;
            StringBuilder sb = new StringBuilder();
            sb.append(vi2VarM152502a);
            sb.append(" - DecoderConfigDescr1 read: ");
            sb.append(iPosition2);
            sb.append(", size: ");
            sb.append(vi2VarM152502a != null ? Integer.valueOf(vi2VarM152502a.m198491a()) : null);
            logger.finer(sb.toString());
            if (vi2VarM152502a != null && iPosition2 < (iM198491a = vi2VarM152502a.m198491a())) {
                byte[] bArr = new byte[iM198491a - iPosition2];
                this.f80862m = bArr;
                byteBuffer.get(bArr);
            }
            if (vi2VarM152502a instanceof ihd) {
                this.f80859j = (ihd) vi2VarM152502a;
            }
            if (vi2VarM152502a instanceof hd1) {
                this.f80860k = (hd1) vi2VarM152502a;
            }
        }
        while (byteBuffer.remaining() > 2) {
            long jPosition = byteBuffer.position();
            vi2 vi2VarM152502a2 = m050.m152502a(this.f80853d, byteBuffer);
            long jPosition2 = ((long) byteBuffer.position()) - jPosition;
            Logger logger2 = f80852n;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(vi2VarM152502a2);
            sb2.append(" - DecoderConfigDescr2 read: ");
            sb2.append(jPosition2);
            sb2.append(", size: ");
            sb2.append(vi2VarM152502a2 != null ? Integer.valueOf(vi2VarM152502a2.m198491a()) : null);
            logger2.finer(sb2.toString());
            if (vi2VarM152502a2 instanceof ns90) {
                this.f80861l.add((ns90) vi2VarM152502a2);
            }
        }
    }

    @Override // p149l.vi2
    public String toString() {
        StringBuilder sb = new StringBuilder("DecoderConfigDescriptor{objectTypeIndication=");
        sb.append(this.f80853d);
        sb.append(", streamType=");
        sb.append(this.f80854e);
        sb.append(", upStream=");
        sb.append(this.f80855f);
        sb.append(", bufferSizeDB=");
        sb.append(this.f80856g);
        sb.append(", maxBitRate=");
        sb.append(this.f80857h);
        sb.append(", avgBitRate=");
        sb.append(this.f80858i);
        sb.append(", decoderSpecificInfo=");
        sb.append(this.f80859j);
        sb.append(", audioSpecificInfo=");
        sb.append(this.f80860k);
        sb.append(", configDescriptorDeadBytes=");
        byte[] bArr = this.f80862m;
        if (bArr == null) {
            bArr = new byte[0];
        }
        sb.append(qzk.m177232a(bArr));
        sb.append(", profileLevelIndicationDescriptors=");
        List<ns90> list = this.f80861l;
        sb.append(list == null ? "null" : Arrays.asList(list).toString());
        sb.append('}');
        return sb.toString();
    }
}
