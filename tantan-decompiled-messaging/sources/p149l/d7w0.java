package p149l;

import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class d7w0 implements a7w0 {

    /* JADX INFO: renamed from: a */
    public final int[] f84801a = new int[2];

    @Override // p149l.a7w0
    /* JADX INFO: renamed from: a */
    public final JSONObject mo95305a(View view) {
        if (view == null) {
            return k7w0.m144704a(0, 0, 0, 0);
        }
        int[] iArr = this.f84801a;
        int width = view.getWidth();
        int height = view.getHeight();
        view.getLocationOnScreen(iArr);
        int[] iArr2 = this.f84801a;
        return k7w0.m144704a(iArr2[0], iArr2[1], width, height);
    }

    @Override // p149l.a7w0
    /* JADX INFO: renamed from: b */
    public final void mo95306b(View view, JSONObject jSONObject, z6w0 z6w0Var, boolean z, boolean z2) {
        int i;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (!z) {
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    z6w0Var.mo95380a(viewGroup.getChildAt(i2), this, jSONObject, z2);
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
                        z6w0Var.mo95380a((View) arrayList3.get(i5), this, jSONObject, z2);
                        i5++;
                    }
                }
                i4 = i;
            }
        }
    }
}
