package p149l;

import com.p046p1.mobile.android.app.Act;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class c35 {
    /* JADX INFO: renamed from: a */
    public static void m104971a(Act act, ArrayList<g2l0> arrayList) {
        if (vwb.m200296J(arrayList)) {
            return;
        }
        if (arrayList.size() == 1) {
            arrayList.get(0).mo94566a(act);
            return;
        }
        int i = 0;
        while (i < arrayList.size() - 1) {
            g2l0 g2l0Var = arrayList.get(i);
            i++;
            g2l0Var.m124172i(arrayList.get(i));
        }
        arrayList.get(0).mo94566a(act);
    }
}
