package p149l;

import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public class ewk<T> {

    /* JADX INFO: renamed from: a */
    public final HashMap<String, hb80<T>> f93505a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public final int f93506b;

    public ewk(int i) {
        this.f93506b = i;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m118470a(hb80 hb80Var) {
        Object objAcquire = hb80Var.acquire();
        while (objAcquire != null) {
            objAcquire = hb80Var.acquire();
        }
    }

    /* JADX INFO: renamed from: b */
    public T m118471b(String str) {
        if (this.f93505a.get(str) == null) {
            this.f93505a.put(str, new jb80(this.f93506b));
        }
        return this.f93505a.get(str).acquire();
    }

    /* JADX INFO: renamed from: c */
    public void m118472c() {
        if (!this.f93505a.values().isEmpty()) {
            vwb.m200354z(this.f93505a.values(), new e30() { // from class: l.dwk
                @Override // p149l.e30
                public final void call(Object obj) {
                    ewk.m118470a((hb80) obj);
                }
            });
        }
        this.f93505a.clear();
    }

    /* JADX INFO: renamed from: d */
    public boolean m118473d(String str, T t) {
        hb80<T> hb80Var = this.f93505a.get(str);
        if (hb80Var != null) {
            try {
                hb80Var.release(t);
                return true;
            } catch (Exception e) {
                CrashHelper.m81296c(e);
            }
        }
        return false;
    }
}
