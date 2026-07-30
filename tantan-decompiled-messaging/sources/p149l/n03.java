package p149l;

import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public final class n03 {
    /* JADX INFO: renamed from: a */
    public static m03 m157192a(List<xmf> list) {
        int size = list.size() << 1;
        int i = size - 1;
        if (list.get(list.size() - 1).m210124d() == null) {
            i = size - 2;
        }
        m03 m03Var = new m03(i * 12);
        int i2 = 0;
        int iM134324b = list.get(0).m210124d().m134324b();
        for (int i3 = 11; i3 >= 0; i3--) {
            if (((1 << i3) & iM134324b) != 0) {
                m03Var.m152498r(i2);
            }
            i2++;
        }
        for (int i4 = 1; i4 < list.size(); i4++) {
            xmf xmfVar = list.get(i4);
            int iM134324b2 = xmfVar.m210123c().m134324b();
            for (int i5 = 11; i5 >= 0; i5--) {
                if (((1 << i5) & iM134324b2) != 0) {
                    m03Var.m152498r(i2);
                }
                i2++;
            }
            if (xmfVar.m210124d() != null) {
                int iM134324b3 = xmfVar.m210124d().m134324b();
                for (int i6 = 11; i6 >= 0; i6--) {
                    if (((1 << i6) & iM134324b3) != 0) {
                        m03Var.m152498r(i2);
                    }
                    i2++;
                }
            }
        }
        return m03Var;
    }
}
