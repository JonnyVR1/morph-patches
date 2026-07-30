package p153l;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class egs0 {

    /* JADX INFO: renamed from: a */
    public final List f93971a = new ArrayList();

    /* JADX INFO: renamed from: b */
    public final List f93972b = new ArrayList();

    /* JADX INFO: renamed from: c */
    public final List f93973c = new ArrayList();

    /* JADX INFO: renamed from: a */
    public final List m120796a() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f93972b.iterator();
        while (it.hasNext()) {
            String str = (String) jas0.m144075c().m176505a((dgs0) it.next());
            if (!TextUtils.isEmpty(str)) {
                arrayList.add(str);
            }
        }
        arrayList.addAll(wgs0.m206231a());
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public final List m120797b() {
        List listM120796a = m120796a();
        Iterator it = this.f93973c.iterator();
        while (it.hasNext()) {
            String str = (String) jas0.m144075c().m176505a((dgs0) it.next());
            if (!TextUtils.isEmpty(str)) {
                listM120796a.add(str);
            }
        }
        listM120796a.addAll(wgs0.m206232b());
        return listM120796a;
    }

    /* JADX INFO: renamed from: c */
    public final void m120798c(dgs0 dgs0Var) {
        this.f93972b.add(dgs0Var);
    }

    /* JADX INFO: renamed from: d */
    public final void m120799d(dgs0 dgs0Var) {
        this.f93971a.add(dgs0Var);
    }

    /* JADX INFO: renamed from: e */
    public final void m120800e(SharedPreferences.Editor editor, int i, JSONObject jSONObject) {
        for (dgs0 dgs0Var : this.f93971a) {
            if (dgs0Var.m115747e() == 1) {
                dgs0Var.mo97727d(editor, dgs0Var.mo97724a(jSONObject));
            }
        }
        if (jSONObject != null) {
            editor.putString("flag_configuration", jSONObject.toString());
        } else {
            dct0.m115295d("Flag Json is null.");
        }
    }
}
