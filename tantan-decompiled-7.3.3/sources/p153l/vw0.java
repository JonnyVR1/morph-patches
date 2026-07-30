package p153l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class vw0 extends gpf0 {
    @Nullable
    /* JADX INFO: renamed from: c */
    public static Metadata m203040c(hg60 hg60Var) {
        hg60Var.m134915r(12);
        int iM134901d = (hg60Var.m134901d() + hg60Var.m134905h(12)) - 4;
        hg60Var.m134915r(44);
        hg60Var.m134916s(hg60Var.m134905h(12));
        hg60Var.m134915r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strM134909l = null;
            if (hg60Var.m134901d() >= iM134901d) {
                break;
            }
            hg60Var.m134915r(48);
            int iM134905h = hg60Var.m134905h(8);
            hg60Var.m134915r(4);
            int iM134901d2 = hg60Var.m134901d() + hg60Var.m134905h(12);
            String strM134909l2 = null;
            while (hg60Var.m134901d() < iM134901d2) {
                int iM134905h2 = hg60Var.m134905h(8);
                int iM134905h3 = hg60Var.m134905h(8);
                int iM134901d3 = hg60Var.m134901d() + iM134905h3;
                if (iM134905h2 == 2) {
                    int iM134905h4 = hg60Var.m134905h(16);
                    hg60Var.m134915r(8);
                    if (iM134905h4 == 3) {
                        while (hg60Var.m134901d() < iM134901d3) {
                            strM134909l = hg60Var.m134909l(hg60Var.m134905h(8), et4.f95687a);
                            int iM134905h5 = hg60Var.m134905h(8);
                            for (int i = 0; i < iM134905h5; i++) {
                                hg60Var.m134916s(hg60Var.m134905h(8));
                            }
                        }
                    }
                } else if (iM134905h2 == 21) {
                    strM134909l2 = hg60Var.m134909l(iM134905h3, et4.f95687a);
                }
                hg60Var.m134913p(iM134901d3 * 8);
            }
            hg60Var.m134913p(iM134901d2 * 8);
            if (strM134909l != null && strM134909l2 != null) {
                arrayList.add(new AppInfoTable(iM134905h, strM134909l.concat(strM134909l2)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    @Override // p153l.gpf0
    @Nullable
    /* JADX INFO: renamed from: b */
    public Metadata mo108050b(ba00 ba00Var, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return m203040c(new hg60(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
