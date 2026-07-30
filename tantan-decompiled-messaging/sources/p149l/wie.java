package p149l;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes7.dex */
@eud(tags = {3})
public class wie extends vi2 {

    /* JADX INFO: renamed from: q */
    private static Logger f186524q = Logger.getLogger(wie.class.getName());

    /* JADX INFO: renamed from: d */
    int f186525d;

    /* JADX INFO: renamed from: e */
    int f186526e;

    /* JADX INFO: renamed from: f */
    int f186527f;

    /* JADX INFO: renamed from: g */
    int f186528g;

    /* JADX INFO: renamed from: h */
    int f186529h;

    /* JADX INFO: renamed from: j */
    String f186531j;

    /* JADX INFO: renamed from: k */
    int f186532k;

    /* JADX INFO: renamed from: l */
    int f186533l;

    /* JADX INFO: renamed from: m */
    int f186534m;

    /* JADX INFO: renamed from: n */
    chd f186535n;

    /* JADX INFO: renamed from: o */
    zkd0 f186536o;

    /* JADX INFO: renamed from: i */
    int f186530i = 0;

    /* JADX INFO: renamed from: p */
    List<vi2> f186537p = new ArrayList();

    @Override // p149l.vi2
    /* JADX INFO: renamed from: e */
    public void mo106861e(ByteBuffer byteBuffer) throws IOException {
        this.f186525d = yyp.m216556i(byteBuffer);
        int iM216561n = yyp.m216561n(byteBuffer);
        int i = iM216561n >>> 7;
        this.f186526e = i;
        this.f186527f = (iM216561n >>> 6) & 1;
        this.f186528g = (iM216561n >>> 5) & 1;
        this.f186529h = iM216561n & 31;
        if (i == 1) {
            this.f186533l = yyp.m216556i(byteBuffer);
        }
        if (this.f186527f == 1) {
            int iM216561n2 = yyp.m216561n(byteBuffer);
            this.f186530i = iM216561n2;
            this.f186531j = yyp.m216555h(byteBuffer, iM216561n2);
        }
        if (this.f186528g == 1) {
            this.f186534m = yyp.m216556i(byteBuffer);
        }
        int iM198492b = m198492b() + 4 + (this.f186526e == 1 ? 2 : 0) + (this.f186527f == 1 ? this.f186530i + 1 : 0) + (this.f186528g == 1 ? 2 : 0);
        int iPosition = byteBuffer.position();
        if (m198491a() > iM198492b + 2) {
            vi2 vi2VarM152502a = m050.m152502a(-1, byteBuffer);
            long jPosition = byteBuffer.position() - iPosition;
            Logger logger = f186524q;
            StringBuilder sb = new StringBuilder();
            sb.append(vi2VarM152502a);
            sb.append(" - ESDescriptor1 read: ");
            sb.append(jPosition);
            sb.append(", size: ");
            sb.append(vi2VarM152502a != null ? Integer.valueOf(vi2VarM152502a.m198491a()) : null);
            logger.finer(sb.toString());
            if (vi2VarM152502a != null) {
                int iM198491a = vi2VarM152502a.m198491a();
                byteBuffer.position(iPosition + iM198491a);
                iM198492b += iM198491a;
            } else {
                iM198492b = (int) (((long) iM198492b) + jPosition);
            }
            if (vi2VarM152502a instanceof chd) {
                this.f186535n = (chd) vi2VarM152502a;
            }
        }
        int iPosition2 = byteBuffer.position();
        if (m198491a() > iM198492b + 2) {
            vi2 vi2VarM152502a2 = m050.m152502a(-1, byteBuffer);
            long jPosition2 = byteBuffer.position() - iPosition2;
            Logger logger2 = f186524q;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(vi2VarM152502a2);
            sb2.append(" - ESDescriptor2 read: ");
            sb2.append(jPosition2);
            sb2.append(", size: ");
            sb2.append(vi2VarM152502a2 != null ? Integer.valueOf(vi2VarM152502a2.m198491a()) : null);
            logger2.finer(sb2.toString());
            if (vi2VarM152502a2 != null) {
                int iM198491a2 = vi2VarM152502a2.m198491a();
                byteBuffer.position(iPosition2 + iM198491a2);
                iM198492b += iM198491a2;
            } else {
                iM198492b = (int) (((long) iM198492b) + jPosition2);
            }
            if (vi2VarM152502a2 instanceof zkd0) {
                this.f186536o = (zkd0) vi2VarM152502a2;
            }
        } else {
            f186524q.warning("SLConfigDescriptor is missing!");
        }
        while (m198491a() - iM198492b > 2) {
            int iPosition3 = byteBuffer.position();
            vi2 vi2VarM152502a3 = m050.m152502a(-1, byteBuffer);
            long jPosition3 = byteBuffer.position() - iPosition3;
            Logger logger3 = f186524q;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(vi2VarM152502a3);
            sb3.append(" - ESDescriptor3 read: ");
            sb3.append(jPosition3);
            sb3.append(", size: ");
            sb3.append(vi2VarM152502a3 != null ? Integer.valueOf(vi2VarM152502a3.m198491a()) : null);
            logger3.finer(sb3.toString());
            if (vi2VarM152502a3 != null) {
                int iM198491a3 = vi2VarM152502a3.m198491a();
                byteBuffer.position(iPosition3 + iM198491a3);
                iM198492b += iM198491a3;
            } else {
                iM198492b = (int) (((long) iM198492b) + jPosition3);
            }
            this.f186537p.add(vi2VarM152502a3);
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        wie wieVar = (wie) obj;
        if (this.f186527f != wieVar.f186527f || this.f186530i != wieVar.f186530i || this.f186533l != wieVar.f186533l || this.f186525d != wieVar.f186525d || this.f186534m != wieVar.f186534m || this.f186528g != wieVar.f186528g || this.f186532k != wieVar.f186532k || this.f186526e != wieVar.f186526e || this.f186529h != wieVar.f186529h) {
            return false;
        }
        String str = this.f186531j;
        String str2 = wieVar.f186531j;
        if (str == null ? str2 != null : !str.equals(str2)) {
            return false;
        }
        chd chdVar = this.f186535n;
        chd chdVar2 = wieVar.f186535n;
        if (chdVar == null ? chdVar2 != null : !chdVar.equals(chdVar2)) {
            return false;
        }
        List<vi2> list = this.f186537p;
        List<vi2> list2 = wieVar.f186537p;
        if (list == null ? list2 != null : !list.equals(list2)) {
            return false;
        }
        zkd0 zkd0Var = this.f186536o;
        zkd0 zkd0Var2 = wieVar.f186536o;
        return zkd0Var == null ? zkd0Var2 == null : zkd0Var.equals(zkd0Var2);
    }

    public int hashCode() {
        int i = ((((((((((this.f186525d * 31) + this.f186526e) * 31) + this.f186527f) * 31) + this.f186528g) * 31) + this.f186529h) * 31) + this.f186530i) * 31;
        String str = this.f186531j;
        int iHashCode = (((((((i + (str != null ? str.hashCode() : 0)) * 31) + this.f186532k) * 31) + this.f186533l) * 31) + this.f186534m) * 31;
        chd chdVar = this.f186535n;
        int iHashCode2 = (iHashCode + (chdVar != null ? chdVar.hashCode() : 0)) * 31;
        zkd0 zkd0Var = this.f186536o;
        int iHashCode3 = (iHashCode2 + (zkd0Var != null ? zkd0Var.hashCode() : 0)) * 31;
        List<vi2> list = this.f186537p;
        return iHashCode3 + (list != null ? list.hashCode() : 0);
    }

    @Override // p149l.vi2
    public String toString() {
        return "ESDescriptor{esId=" + this.f186525d + ", streamDependenceFlag=" + this.f186526e + ", URLFlag=" + this.f186527f + ", oCRstreamFlag=" + this.f186528g + ", streamPriority=" + this.f186529h + ", URLLength=" + this.f186530i + ", URLString='" + this.f186531j + "', remoteODFlag=" + this.f186532k + ", dependsOnEsId=" + this.f186533l + ", oCREsId=" + this.f186534m + ", decoderConfigDescriptor=" + this.f186535n + ", slConfigDescriptor=" + this.f186536o + '}';
    }
}
