package p149l;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class y6s0 {

    /* JADX INFO: renamed from: a */
    public final List f196638a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final List f196639b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final List f196640c = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final List m213241a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f196639b.iterator();
        while (it.hasNext()) {
            String str = (String) d1s0.m109677c().m144697a((x6s0) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(q7s0.m173294a());
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final List m213242b() {
        List listM213241a = m213241a();
        Iterator it = this.f196640c.iterator();
        while (it.hasNext()) {
            String str = (String) d1s0.m109677c().m144697a((x6s0) it.next());
            if (!TextUtils.isEmpty(str)) {
                listM213241a.add(str);
            }
        }
        listM213241a.addAll(q7s0.m173295b());
        return listM213241a;
    }

    /* JADX INFO: renamed from: c */
    public final void m213243c(x6s0 x6s0Var) {
        this.f196639b.add(x6s0Var);
    }

    /* JADX INFO: renamed from: d */
    public final void m213244d(x6s0 x6s0Var) {
        this.f196638a.add(x6s0Var);
    }

    /* JADX INFO: renamed from: e */
    public final void m213245e(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (x6s0 x6s0Var : this.f196638a) {
            if (x6s0Var.m207206e() == 1) {
                x6s0Var.mo178098d(editor, x6s0Var.mo178095a(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            x2t0.m206866d("Flag Json is null.");
        }
    }
}
