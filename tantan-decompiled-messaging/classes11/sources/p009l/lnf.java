package p009l;

import android.os.Bundle;
import com.p1.mobile.android.app.Act;
import java.util.HashMap;
import l.d30;
import l.e30;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class lnf {

    /* JADX INFO: renamed from: b */
    public static lnf f16268b;

    /* JADX INFO: renamed from: a */
    public HashMap<String, emf> f16269a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m17965b(Bundle bundle) {
    }

    /* JADX INFO: renamed from: d */
    public static lnf m17966d() {
        if (f16268b == null) {
            synchronized (lnf.class) {
                try {
                    if (f16268b == null) {
                        f16268b = new lnf();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f16268b;
    }

    /* JADX INFO: renamed from: c */
    public emf m17967c(Act act) {
        final String strValueOf = String.valueOf(act.hashCode());
        emf emfVar = this.f16269a.get(strValueOf);
        if (emfVar != null) {
            return emfVar;
        }
        emf emfVar2 = new emf();
        this.f16269a.put(strValueOf, emfVar2);
        act.creates(new e30() { // from class: l.jnf
            public final void call(Object obj) {
                lnf.m17965b((Bundle) obj);
            }
        }, new d30() { // from class: l.knf
            public final void call() {
                this.f15776a.m17968e(strValueOf);
            }
        });
        return emfVar2;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m17968e(String str) {
        this.f16269a.remove(str);
    }
}
