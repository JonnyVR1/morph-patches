package p149l;

import androidx.annotation.Nullable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.dvbsi.AppInfoTable;
import java.nio.ByteBuffer;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class ow0 extends ygf0 {
    @Nullable
    /* JADX INFO: renamed from: c */
    public static Metadata m166212c(c860 c860Var) {
        c860Var.m105674r(12);
        int iM105660d = (c860Var.m105660d() + c860Var.m105664h(12)) - 4;
        c860Var.m105674r(44);
        c860Var.m105675s(c860Var.m105664h(12));
        c860Var.m105674r(16);
        ArrayList arrayList = new ArrayList();
        while (true) {
            String strM105668l = null;
            if (c860Var.m105660d() >= iM105660d) {
                break;
            }
            c860Var.m105674r(48);
            int iM105664h = c860Var.m105664h(8);
            c860Var.m105674r(4);
            int iM105660d2 = c860Var.m105660d() + c860Var.m105664h(12);
            String strM105668l2 = null;
            while (c860Var.m105660d() < iM105660d2) {
                int iM105664h2 = c860Var.m105664h(8);
                int iM105664h3 = c860Var.m105664h(8);
                int iM105660d3 = c860Var.m105660d() + iM105664h3;
                if (iM105664h2 == 2) {
                    int iM105664h4 = c860Var.m105664h(16);
                    c860Var.m105674r(8);
                    if (iM105664h4 == 3) {
                        while (c860Var.m105660d() < iM105660d3) {
                            strM105668l = c860Var.m105668l(c860Var.m105664h(8), fs4.f99034a);
                            int iM105664h5 = c860Var.m105664h(8);
                            for (int i = 0; i < iM105664h5; i++) {
                                c860Var.m105675s(c860Var.m105664h(8));
                            }
                        }
                    }
                } else if (iM105664h2 == 21) {
                    strM105668l2 = c860Var.m105668l(iM105664h3, fs4.f99034a);
                }
                c860Var.m105672p(iM105660d3 * 8);
            }
            c860Var.m105672p(iM105660d2 * 8);
            if (strM105668l != null && strM105668l2 != null) {
                arrayList.add(new AppInfoTable(iM105664h, strM105668l.concat(strM105668l2)));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new Metadata(arrayList);
    }

    @Override // p149l.ygf0
    @Nullable
    /* JADX INFO: renamed from: b */
    public Metadata mo122590b(e100 e100Var, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            return m166212c(new c860(byteBuffer.array(), byteBuffer.limit()));
        }
        return null;
    }
}
