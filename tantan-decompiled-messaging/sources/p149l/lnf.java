package p149l;

import android.os.Bundle;
import com.p046p1.mobile.android.app.Act;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class lnf {

    /* JADX INFO: renamed from: b */
    public static lnf f128987b;

    /* JADX INFO: renamed from: a */
    public HashMap<String, emf> f128988a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m150684b(Bundle bundle) {
    }

    /* JADX INFO: renamed from: d */
    public static lnf m150685d() {
        if (f128987b == null) {
            synchronized (lnf.class) {
                try {
                    if (f128987b == null) {
                        f128987b = new lnf();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f128987b;
    }

    /* JADX INFO: renamed from: c */
    public emf m150686c(Act act) {
        final String strValueOf = String.valueOf(act.hashCode());
        emf emfVar = this.f128988a.get(strValueOf);
        if (emfVar != null) {
            return emfVar;
        }
        emf emfVar2 = new emf();
        this.f128988a.put(strValueOf, emfVar2);
        act.creates(new e30() { // from class: l.jnf
            @Override // p149l.e30
            public final void call(Object obj) {
                lnf.m150684b((Bundle) obj);
            }
        }, new d30() { // from class: l.knf
            @Override // p149l.d30
            public final void call() {
                this.f123883a.m150687e(strValueOf);
            }
        });
        return emfVar2;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m150687e(String str) {
        this.f128988a.remove(str);
    }
}
