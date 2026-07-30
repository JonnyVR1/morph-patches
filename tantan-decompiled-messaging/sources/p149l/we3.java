package p149l;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.cosmos.mdlog.MDLog;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.heytap.mcssdk.mode.CommandMessage;
import com.p046p1.mobile.putong.live.base.data.LovePlanetStage;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class we3 {

    /* JADX INFO: renamed from: a */
    private static final List<ve3> f185902a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public static boolean m202829a() {
        return mei.m154202h();
    }

    /* JADX INFO: renamed from: b */
    public static void m202830b(@NonNull ve3 ve3Var) {
        if (m202829a()) {
            try {
                if (ve3Var.m198148e()) {
                    MDLog.m7389d("tlrk", "record: " + ve3Var.toString());
                    f185902a.add(ve3Var);
                }
                m202832d();
            } catch (Exception unused) {
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public static void m202831c(@NonNull xe3 xe3Var) {
        if (!m202829a() || TextUtils.isEmpty(xe3Var.f192524a) || TextUtils.isEmpty(xe3Var.f192525b)) {
            return;
        }
        List<ve3> list = f185902a;
        if (list.size() > 0) {
            for (ve3 ve3Var : list) {
                if (xe3Var.f192524a.equalsIgnoreCase(ve3Var.m198145a())) {
                    MDLog.m7399w("tlrk", "record result : " + xe3Var.toString());
                    ve3Var.m198151h(xe3Var.m208504a());
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: d */
    private static void m202832d() {
        ArrayList arrayList = new ArrayList();
        Iterator<ve3> it = f185902a.iterator();
        while (it.hasNext()) {
            ve3 next = it.next();
            if (next.m198149f()) {
                arrayList.add(next.m198153j());
                it.remove();
            }
        }
        MDLog.m7391e("tlrk", "cacheSize: " + f185902a.size() + " insert size : " + arrayList.size());
        lhw.m149857b().m149860e(arrayList);
    }

    /* JADX INFO: renamed from: e */
    public static void m202833e() {
        if (m202829a()) {
            try {
                List<ghw> listM149859c = lhw.m149857b().m149859c();
                if (listM149859c == null || listM149859c.size() <= 0) {
                    return;
                }
                MDLog.m7389d("tlrk", "upload and update list size : " + listM149859c.size());
                for (ghw ghwVar : listM149859c) {
                    gnw.m127190a("momo-web").m128649e("mk_bridge_invoke").m128650f(ghwVar.m126224a()).m128645a(onw.m165243m(ghwVar.m126231h())).m128645a(new onw("namespace", ghwVar.m126228e())).m128645a(new onw(FirebaseAnalytics.Param.METHOD, ghwVar.m126227d())).m128645a(new onw(CommandMessage.PARAMS, ghwVar.m126229f())).m128645a(new onw(LovePlanetStage.result, ghwVar.m126230g())).m128647c();
                    ghwVar.m126233j(1);
                }
                lhw.m149857b().m149861f(listM149859c);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
