package p149l;

import android.view.View;
import com.google.android.gms.internal.ads.C2258u1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class c7w0 implements a7w0 {

    /* JADX INFO: renamed from: a */
    public final a7w0 f79662a;

    public c7w0(a7w0 a7w0Var) {
        this.f79662a = a7w0Var;
    }

    @Override // p149l.a7w0
    /* JADX INFO: renamed from: a */
    public final JSONObject mo95305a(View view) {
        JSONObject jSONObjectM144704a = k7w0.m144704a(0, 0, 0, 0);
        int iM13337b = C2258u1.m13337b();
        int i = iM13337b - 1;
        if (iM13337b == 0) {
            throw null;
        }
        try {
            jSONObjectM144704a.put("noOutputDevice", i == 0);
            return jSONObjectM144704a;
        } catch (JSONException e) {
            l7w0.m148830a("Error with setting output device status", e);
            return jSONObjectM144704a;
        }
    }

    @Override // p149l.a7w0
    /* JADX INFO: renamed from: b */
    public final void mo95306b(View view, JSONObject jSONObject, z6w0 z6w0Var, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        n6w0 n6w0VarM158096a = n6w0.m158096a();
        if (n6w0VarM158096a != null) {
            Collection collectionM158097b = n6w0VarM158096a.m158097b();
            int size = collectionM158097b.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            Iterator it = collectionM158097b.iterator();
            while (it.hasNext()) {
                View viewM115114f = ((e6w0) it.next()).m115114f();
                if (viewM115114f != null && viewM115114f.isAttachedToWindow() && viewM115114f.isShown()) {
                    View view2 = viewM115114f;
                    while (true) {
                        if (view2 == null) {
                            View rootView = viewM115114f.getRootView();
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
            z6w0Var.mo95380a((View) arrayList.get(i2), this.f79662a, jSONObject, z2);
        }
    }
}
