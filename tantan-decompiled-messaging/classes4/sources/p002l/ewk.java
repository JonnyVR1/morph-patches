package p002l;

import com.tantanapp.common.utils.CrashHelper;
import java.util.HashMap;
import l.e30;
import l.hb80;
import l.jb80;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class ewk<T> {

    /* JADX INFO: renamed from: a */
    public final HashMap<String, hb80<T>> f10022a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public final int f10023b;

    public ewk(int i) {
        this.f10023b = i;
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m12793a(hb80 hb80Var) {
        Object objAcquire = hb80Var.acquire();
        while (objAcquire != null) {
            objAcquire = hb80Var.acquire();
        }
    }

    /* JADX INFO: renamed from: b */
    public T m12794b(String str) {
        if (this.f10022a.get(str) == null) {
            this.f10022a.put(str, new jb80(this.f10023b));
        }
        return (T) this.f10022a.get(str).acquire();
    }

    /* JADX INFO: renamed from: c */
    public void m12795c() {
        if (!this.f10022a.values().isEmpty()) {
            vwb.z(this.f10022a.values(), new e30() { // from class: l.dwk
                public final void call(Object obj) {
                    ewk.m12793a((hb80) obj);
                }
            });
        }
        this.f10022a.clear();
    }

    /* JADX INFO: renamed from: d */
    public boolean m12796d(String str, T t) {
        hb80<T> hb80Var = this.f10022a.get(str);
        if (hb80Var != null) {
            try {
                hb80Var.release(t);
                return true;
            } catch (Exception e) {
                CrashHelper.c(e);
            }
        }
        return false;
    }
}
