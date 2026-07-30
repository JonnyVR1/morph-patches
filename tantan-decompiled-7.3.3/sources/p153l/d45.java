package p153l;

import com.p051p1.mobile.android.app.Act;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class d45 {
    /* JADX INFO: renamed from: a */
    public static void m114108a(Act act, ArrayList<lbl0> arrayList) {
        if (jyb.m147479J(arrayList)) {
            return;
        }
        if (arrayList.size() == 1) {
            arrayList.get(0).mo96996a(act);
            return;
        }
        int i = 0;
        while (i < arrayList.size() - 1) {
            lbl0 lbl0Var = arrayList.get(i);
            i++;
            lbl0Var.m153586i(arrayList.get(i));
        }
        arrayList.get(0).mo96996a(act);
    }
}
