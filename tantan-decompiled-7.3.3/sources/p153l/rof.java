package p153l;

import android.os.Bundle;
import com.p051p1.mobile.android.app.Act;
import java.util.HashMap;

/* JADX INFO: loaded from: classes11.dex */
public class rof {

    /* JADX INFO: renamed from: b */
    public static rof f164189b;

    /* JADX INFO: renamed from: a */
    public HashMap<String, knf> f164190a = new HashMap<>();

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m182404b(Bundle bundle) {
    }

    /* JADX INFO: renamed from: d */
    public static rof m182405d() {
        if (f164189b == null) {
            synchronized (rof.class) {
                try {
                    if (f164189b == null) {
                        f164189b = new rof();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return f164189b;
    }

    /* JADX INFO: renamed from: c */
    public knf m182406c(Act act) {
        final String strValueOf = String.valueOf(act.hashCode());
        knf knfVar = this.f164190a.get(strValueOf);
        if (knfVar != null) {
            return knfVar;
        }
        knf knfVar2 = new knf();
        this.f164190a.put(strValueOf, knfVar2);
        act.creates(new y20() { // from class: l.pof
            @Override // p153l.y20
            public final void call(Object obj) {
                rof.m182404b((Bundle) obj);
            }
        }, new x20() { // from class: l.qof
            @Override // p153l.x20
            public final void call() {
                this.f158730a.m182407e(strValueOf);
            }
        });
        return knfVar2;
    }

    /* JADX INFO: renamed from: e */
    public final /* synthetic */ void m182407e(String str) {
        this.f164190a.remove(str);
    }
}
