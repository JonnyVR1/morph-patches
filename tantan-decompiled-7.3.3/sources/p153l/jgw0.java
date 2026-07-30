package p153l;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class jgw0 implements ggw0 {

    /* JADX INFO: renamed from: a */
    public final int[] f120784a = new int[2];

    @Override // p153l.ggw0
    /* JADX INFO: renamed from: a */
    public final JSONObject mo130196a(View view) {
        if (view == null) {
            return qgw0.m176521a(0, 0, 0, 0);
        }
        int[] iArr = this.f120784a;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        int[] iArr2 = this.f120784a;
        return qgw0.m176521a(iArr2[0], iArr2[1], width, height);
    }

    @Override // p153l.ggw0
    /* JADX INFO: renamed from: b */
    public final void mo130197b(View view, JSONObject jSONObject, fgw0 fgw0Var, boolean z, boolean z2) {
        int i;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z) {
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    fgw0Var.mo125534a(viewGroup.getChildAt(i2), this, jSONObject, z2);
                }
                return;
            }
            HashMap map = new HashMap();
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                View childAt = viewGroup.getChildAt(i3);
                ArrayList arrayList = (ArrayList) map.get(Float.valueOf(childAt.getZ()));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(Float.valueOf(childAt.getZ()), arrayList);
                }
                arrayList.add(childAt);
            }
            ArrayList arrayList2 = new ArrayList(map.keySet());
            Collections.sort(arrayList2);
            int size = arrayList2.size();
            int i4 = 0;
            while (i4 < size) {
                ArrayList arrayList3 = (ArrayList) map.get((Float) arrayList2.get(i4));
                int size2 = arrayList3.size();
                int i5 = 0;
                while (true) {
                    i = i4 + 1;
                    if (i5 < size2) {
                        fgw0Var.mo125534a((View) arrayList3.get(i5), this, jSONObject, z2);
                        i5++;
                    }
                }
                i4 = i;
            }
        }
    }
}
