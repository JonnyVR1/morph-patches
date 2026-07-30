package p153l;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public final class wgs0 {
    /* JADX INFO: renamed from: a */
    public static List m206231a() {
        ArrayList arrayList = new ArrayList();
        m206233c(arrayList, kis0.m149972c("gad:dynamite_module:experiment_id", ""));
        m206233c(arrayList, vis0.f184300a);
        m206233c(arrayList, vis0.f184301b);
        m206233c(arrayList, vis0.f184302c);
        m206233c(arrayList, vis0.f184303d);
        m206233c(arrayList, vis0.f184304e);
        m206233c(arrayList, vis0.f184320u);
        m206233c(arrayList, vis0.f184305f);
        m206233c(arrayList, vis0.f184312m);
        m206233c(arrayList, vis0.f184313n);
        m206233c(arrayList, vis0.f184314o);
        m206233c(arrayList, vis0.f184315p);
        m206233c(arrayList, vis0.f184316q);
        m206233c(arrayList, vis0.f184317r);
        m206233c(arrayList, vis0.f184318s);
        m206233c(arrayList, vis0.f184319t);
        m206233c(arrayList, vis0.f184306g);
        m206233c(arrayList, vis0.f184307h);
        m206233c(arrayList, vis0.f184308i);
        m206233c(arrayList, vis0.f184309j);
        m206233c(arrayList, vis0.f184310k);
        m206233c(arrayList, vis0.f184311l);
        return arrayList;
    }

    /* JADX INFO: renamed from: b */
    public static List m206232b() {
        ArrayList arrayList = new ArrayList();
        m206233c(arrayList, sjs0.f169173a);
        return arrayList;
    }

    /* JADX INFO: renamed from: c */
    public static void m206233c(List list, kis0 kis0Var) {
        String str = (String) kis0Var.m149974e();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }
}
