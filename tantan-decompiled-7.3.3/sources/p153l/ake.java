package p153l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
@svd(tags = {3})
public class ake extends cj2 {

    /* JADX INFO: renamed from: q */
    private static Logger f71986q = Logger.getLogger(ake.class.getName());

    /* JADX INFO: renamed from: d */
    int f71987d;

    /* JADX INFO: renamed from: e */
    int f71988e;

    /* JADX INFO: renamed from: f */
    int f71989f;

    /* JADX INFO: renamed from: g */
    int f71990g;

    /* JADX INFO: renamed from: h */
    int f71991h;

    /* JADX INFO: renamed from: j */
    String f71993j;

    /* JADX INFO: renamed from: k */
    int f71994k;

    /* JADX INFO: renamed from: l */
    int f71995l;

    /* JADX INFO: renamed from: m */
    int f71996m;

    /* JADX INFO: renamed from: n */
    iid f71997n;

    /* JADX INFO: renamed from: o */
    ctd0 f71998o;

    /* JADX INFO: renamed from: i */
    int f71992i = 0;

    /* JADX INFO: renamed from: p */
    List<cj2> f71999p = new ArrayList();

    @Override // p153l.cj2
    /* JADX INFO: renamed from: e */
    public void mo98560e(ByteBuffer byteBuffer) throws IOException {
        this.f71987d = y0q.m213893i(byteBuffer);
        int iM213898n = y0q.m213898n(byteBuffer);
        int i = iM213898n >>> 7;
        this.f71988e = i;
        this.f71989f = (iM213898n >>> 6) & 1;
        this.f71990g = (iM213898n >>> 5) & 1;
        this.f71991h = iM213898n & 31;
        if (i == 1) {
            this.f71995l = y0q.m213893i(byteBuffer);
        }
        if (this.f71989f == 1) {
            int iM213898n2 = y0q.m213898n(byteBuffer);
            this.f71992i = iM213898n2;
            this.f71993j = y0q.m213892h(byteBuffer, iM213898n2);
        }
        if (this.f71990g == 1) {
            this.f71996m = y0q.m213893i(byteBuffer);
        }
        int iM110048b = m110048b() + 4 + (this.f71988e == 1 ? 2 : 0) + (this.f71989f == 1 ? this.f71992i + 1 : 0) + (this.f71990g == 1 ? 2 : 0);
        int iPosition = byteBuffer.position();
        if (m110047a() > iM110048b + 2) {
            cj2 cj2VarM103053a = b950.m103053a(-1, byteBuffer);
            long jPosition = byteBuffer.position() - iPosition;
            Logger logger = f71986q;
            StringBuilder sb = new StringBuilder();
            sb.append(cj2VarM103053a);
            sb.append(" - ESDescriptor1 read: ");
            sb.append(jPosition);
            sb.append(", size: ");
            sb.append(cj2VarM103053a != null ? Integer.valueOf(cj2VarM103053a.m110047a()) : null);
            logger.finer(sb.toString());
            if (cj2VarM103053a != null) {
                int iM110047a = cj2VarM103053a.m110047a();
                byteBuffer.position(iPosition + iM110047a);
                iM110048b += iM110047a;
            } else {
                iM110048b = (int) (((long) iM110048b) + jPosition);
            }
            if (cj2VarM103053a instanceof iid) {
                this.f71997n = (iid) cj2VarM103053a;
            }
        }
        int iPosition2 = byteBuffer.position();
        if (m110047a() > iM110048b + 2) {
            cj2 cj2VarM103053a2 = b950.m103053a(-1, byteBuffer);
            long jPosition2 = byteBuffer.position() - iPosition2;
            Logger logger2 = f71986q;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(cj2VarM103053a2);
            sb2.append(" - ESDescriptor2 read: ");
            sb2.append(jPosition2);
            sb2.append(", size: ");
            sb2.append(cj2VarM103053a2 != null ? Integer.valueOf(cj2VarM103053a2.m110047a()) : null);
            logger2.finer(sb2.toString());
            if (cj2VarM103053a2 != null) {
                int iM110047a2 = cj2VarM103053a2.m110047a();
                byteBuffer.position(iPosition2 + iM110047a2);
                iM110048b += iM110047a2;
            } else {
                iM110048b = (int) (((long) iM110048b) + jPosition2);
            }
            if (cj2VarM103053a2 instanceof ctd0) {
                this.f71998o = (ctd0) cj2VarM103053a2;
            }
        } else {
            f71986q.warning("SLConfigDescriptor is missing!");
        }
        while (m110047a() - iM110048b > 2) {
            int iPosition3 = byteBuffer.position();
            cj2 cj2VarM103053a3 = b950.m103053a(-1, byteBuffer);
            long jPosition3 = byteBuffer.position() - iPosition3;
            Logger logger3 = f71986q;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(cj2VarM103053a3);
            sb3.append(" - ESDescriptor3 read: ");
            sb3.append(jPosition3);
            sb3.append(", size: ");
            sb3.append(cj2VarM103053a3 != null ? Integer.valueOf(cj2VarM103053a3.m110047a()) : null);
            logger3.finer(sb3.toString());
            if (cj2VarM103053a3 != null) {
                int iM110047a3 = cj2VarM103053a3.m110047a();
                byteBuffer.position(iPosition3 + iM110047a3);
                iM110048b += iM110047a3;
            } else {
                iM110048b = (int) (((long) iM110048b) + jPosition3);
            }
            this.f71999p.add(cj2VarM103053a3);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ake akeVar = (ake) obj;
        if (this.f71989f != akeVar.f71989f || this.f71992i != akeVar.f71992i || this.f71995l != akeVar.f71995l || this.f71987d != akeVar.f71987d || this.f71996m != akeVar.f71996m || this.f71990g != akeVar.f71990g || this.f71994k != akeVar.f71994k || this.f71988e != akeVar.f71988e || this.f71991h != akeVar.f71991h) {
            return false;
        }
        String str = this.f71993j;
        String str2 = akeVar.f71993j;
        if (str == null ? str2 != null : !str.equals(str2)) {
            return false;
        }
        iid iidVar = this.f71997n;
        iid iidVar2 = akeVar.f71997n;
        if (iidVar == null ? iidVar2 != null : !iidVar.equals(iidVar2)) {
            return false;
        }
        List<cj2> list = this.f71999p;
        List<cj2> list2 = akeVar.f71999p;
        if (list == null ? list2 != null : !list.equals(list2)) {
            return false;
        }
        ctd0 ctd0Var = this.f71998o;
        ctd0 ctd0Var2 = akeVar.f71998o;
        return ctd0Var == null ? ctd0Var2 == null : ctd0Var.equals(ctd0Var2);
    }

    public int hashCode() {
        int i = ((((((((((this.f71987d * 31) + this.f71988e) * 31) + this.f71989f) * 31) + this.f71990g) * 31) + this.f71991h) * 31) + this.f71992i) * 31;
        String str = this.f71993j;
        int iHashCode = (((((((i + (str != null ? str.hashCode() : 0)) * 31) + this.f71994k) * 31) + this.f71995l) * 31) + this.f71996m) * 31;
        iid iidVar = this.f71997n;
        int iHashCode2 = (iHashCode + (iidVar != null ? iidVar.hashCode() : 0)) * 31;
        ctd0 ctd0Var = this.f71998o;
        int iHashCode3 = (iHashCode2 + (ctd0Var != null ? ctd0Var.hashCode() : 0)) * 31;
        List<cj2> list = this.f71999p;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @Override // p153l.cj2
    public String toString() {
        return "ESDescriptor{esId=" + this.f71987d + ", streamDependenceFlag=" + this.f71988e + ", URLFlag=" + this.f71989f + ", oCRstreamFlag=" + this.f71990g + ", streamPriority=" + this.f71991h + ", URLLength=" + this.f71992i + ", URLString='" + this.f71993j + "', remoteODFlag=" + this.f71994k + ", dependsOnEsId=" + this.f71995l + ", oCREsId=" + this.f71996m + ", decoderConfigDescriptor=" + this.f71997n + ", slConfigDescriptor=" + this.f71998o + '}';
    }
}
