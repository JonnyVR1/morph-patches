package p153l;

import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;

/* JADX INFO: loaded from: classes13.dex */
public class xre0 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m212818a(uwl uwlVar) {
        try {
            uwlVar.mo71381T();
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            m212822e("attachModule", uwlVar.getClass().getName(), e);
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m212819b(uwl uwlVar) {
        try {
            uwlVar.mo70300n();
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            m212822e("destroy", uwlVar.getClass().getName(), e);
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m212820c(uwl uwlVar) {
        if ((uwlVar instanceof c6m) && (uwlVar instanceof l6t)) {
            try {
                ((l6t) uwlVar).mo120629s2();
            } catch (Exception e) {
                CrashHelper.m82479c(e);
                m212822e("actDestroy", uwlVar.getClass().getName(), e);
            }
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m212821d(uwl uwlVar) {
        try {
            uwlVar.mo73648t();
        } catch (Exception e) {
            CrashHelper.m82479c(e);
            m212822e("validState", uwlVar.getClass().getName(), e);
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m212823f(HashMap<String, uwl> map) {
        if (map == null) {
            return;
        }
        jyb.m147537z(new HashMap(map).values(), new y20() { // from class: l.wre0
            @Override // p153l.y20
            public final void call(Object obj) {
                xre0.m212819b((uwl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g */
    public static void m212824g(HashMap<String, uwl> map) {
        if (map == null) {
            return;
        }
        jyb.m147537z(new HashMap(map).values(), new y20() { // from class: l.vre0
            @Override // p153l.y20
            public final void call(Object obj) {
                xre0.m212820c((uwl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: h */
    public static void m212825h(HashMap<String, uwl> map) {
        if (map == null) {
            return;
        }
        jyb.m147537z(new HashMap(map).values(), new y20() { // from class: l.ure0
            @Override // p153l.y20
            public final void call(Object obj) {
                xre0.m212818a((uwl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: i */
    public static void m212826i(HashMap<String, uwl> map) {
        if (map == null) {
            return;
        }
        jyb.m147537z(new HashMap(map).values(), new y20() { // from class: l.tre0
            @Override // p153l.y20
            public final void call(Object obj) {
                xre0.m212821d((uwl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public static void m212822e(String str, String str2, Exception exc) {
    }
}
