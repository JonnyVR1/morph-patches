package p149l;

import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class sje0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m184483a(gul gulVar) {
        try {
            gulVar.mo70198T();
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            m184487e("attachModule", gulVar.getClass().getName(), e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m184484b(gul gulVar) {
        try {
            gulVar.mo69117n();
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            m184487e("destroy", gulVar.getClass().getName(), e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m184485c(gul gulVar) {
        if ((gulVar instanceof l3m) && (gulVar instanceof k4t)) {
            try {
                ((k4t) gulVar).mo111727s2();
            } catch (Exception e) {
                CrashHelper.m81296c(e);
                m184487e("actDestroy", gulVar.getClass().getName(), e);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m184486d(gul gulVar) {
        try {
            gulVar.mo72465t();
        } catch (Exception e) {
            CrashHelper.m81296c(e);
            m184487e("validState", gulVar.getClass().getName(), e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m184488f(HashMap<String, gul> map) {
        if (map == null) {
            return;
        }
        vwb.m200354z(new HashMap(map).values(), new e30() { // from class: l.rje0
            @Override // p149l.e30
            public final void call(Object obj) {
                sje0.m184484b((gul) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static void m184489g(HashMap<String, gul> map) {
        if (map == null) {
            return;
        }
        vwb.m200354z(new HashMap(map).values(), new e30() { // from class: l.qje0
            @Override // p149l.e30
            public final void call(Object obj) {
                sje0.m184485c((gul) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static void m184490h(HashMap<String, gul> map) {
        if (map == null) {
            return;
        }
        vwb.m200354z(new HashMap(map).values(), new e30() { // from class: l.pje0
            @Override // p149l.e30
            public final void call(Object obj) {
                sje0.m184483a((gul) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static void m184491i(HashMap<String, gul> map) {
        if (map == null) {
            return;
        }
        vwb.m200354z(new HashMap(map).values(), new e30() { // from class: l.oje0
            @Override // p149l.e30
            public final void call(Object obj) {
                sje0.m184486d((gul) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static void m184487e(String str, String str2, Exception exc) {
    }
}
