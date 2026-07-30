package p153l;

import android.view.View;
import com.google.android.gms.internal.ads.C2281u1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class igw0 implements ggw0 {

    /* JADX INFO: renamed from: a */
    public final ggw0 f114825a;

    public igw0(ggw0 ggw0Var) {
        this.f114825a = ggw0Var;
    }

    @Override // p153l.ggw0
    /* JADX INFO: renamed from: a */
    public final JSONObject mo130196a(View view) {
        JSONObject jSONObjectM176521a = qgw0.m176521a(0, 0, 0, 0);
        int iM13391b = C2281u1.m13391b();
        int i = iM13391b - 1;
        if (iM13391b == 0) {
            throw null;
        }
        try {
            jSONObjectM176521a.put("noOutputDevice", i == 0);
            return jSONObjectM176521a;
        } catch (JSONException e) {
            rgw0.m181507a("Error with setting output device status", e);
            return jSONObjectM176521a;
        }
    }

    @Override // p153l.ggw0
    /* JADX INFO: renamed from: b */
    public final void mo130197b(View view, JSONObject jSONObject, fgw0 fgw0Var, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        tfw0 tfw0VarM190995a = tfw0.m190995a();
        if (tfw0VarM190995a != null) {
            Collection collectionM190996b = tfw0VarM190995a.m190996b();
            int size = collectionM190996b.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = collectionM190996b.iterator();
            while (it.hasNext()) {
                View viewM149626f = ((kfw0) it.next()).m149626f();
                if (viewM149626f != null && viewM149626f.isAttachedToWindow() && viewM149626f.isShown()) {
                    View view2 = viewM149626f;
                    while (true) {
                        if (view2 == null) {
                            View rootView = viewM149626f.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z3 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (((View) arrayList.get(i)).getZ() <= z3) {
                                        break;
                                    } else {
                                        size2 = i;
                                    }
                                }
                                arrayList.add(size2, rootView);
                                break;
                            }
                            break;
                        }
                        if (view2.getAlpha() == 0.0f) {
                            break;
                        }
                        Object parent = view2.getParent();
                        view2 = parent instanceof View ? (View) parent : null;
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            fgw0Var.mo125534a((View) arrayList.get(i2), this.f114825a, jSONObject, z2);
        }
    }
}
