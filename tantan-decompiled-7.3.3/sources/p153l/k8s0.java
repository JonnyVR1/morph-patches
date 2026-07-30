package p153l;

import com.alibaba.sdk.android.oss.signer.SignParameters;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import java.util.PriorityQueue;

/* JADX INFO: loaded from: classes6.dex */
public final class k8s0 {

    /* JADX INFO: renamed from: a */
    public final int f124413a;

    /* JADX INFO: renamed from: b */
    public final h8s0 f124414b = new m8s0();

    public k8s0(int i) {
        this.f124413a = i;
    }

    /* JADX INFO: renamed from: a */
    public final String m148747a(ArrayList arrayList) {
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
        j8s0 j8s0Var = new j8s0();
        PriorityQueue priorityQueue = new PriorityQueue(this.f124413a, new i8s0(this));
        for (String str : strArrSplit) {
            String[] strArrM153299b = l8s0.m153299b(str, false);
            if (strArrM153299b.length != 0) {
                p8s0.m171272c(strArrM153299b, this.f124413a, 6, priorityQueue);
            }
        }
        Iterator it = priorityQueue.iterator();
        while (it.hasNext()) {
            try {
                j8s0Var.f118814b.write(this.f124414b.mo133954b(((o8s0) it.next()).f145464b));
            } catch (IOException e) {
                dct0.m115296e("Error while writing hash to byteStream", e);
            }
        }
        return j8s0Var.toString();
    }
}
