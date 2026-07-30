package p149l;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes6.dex */
public final class ezr0 {

    /* JADX INFO: renamed from: a */
    public final int f93938a;

    /* JADX INFO: renamed from: b */
    public final bzr0 f93939b = new gzr0();

    public ezr0(int i) {
        this.f93938a = i;
    }

    /* JADX INFO: renamed from: a */
    public final String m119010a(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            sb.append(((String) arrayList.get(i)).toLowerCase(Locale.US));
            sb.append('\n');
        }
        String[] strArrSplit = sb.toString().split(SignParameters.NEW_LINE);
        if (strArrSplit.length == 0) {
            return "";
        }
        dzr0 dzr0Var = new dzr0();
        PriorityQueue priorityQueue = new PriorityQueue(this.f93938a, new czr0(this));
        for (String str : strArrSplit) {
            String[] strArrM123919b = fzr0.m123919b(str, false);
            if (strArrM123919b.length != 0) {
                jzr0.m143942c(strArrM123919b, this.f93938a, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                dzr0Var.f88505b.write(this.f93939b.mo104643b(((izr0) it.next()).f115596b));
            } catch (IOException e) {
                x2t0.m206867e("Error while writing hash to byteStream", e);
            }
        }
        return dzr0Var.toString();
    }
}
