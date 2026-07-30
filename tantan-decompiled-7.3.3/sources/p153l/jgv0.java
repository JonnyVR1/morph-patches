package p153l;

import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.internal.ads.C2291v3;
import com.google.android.gms.internal.ads.zzeml;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class jgv0 {

    /* JADX INFO: renamed from: c */
    @GuardedBy("this")
    public final C2291v3 f120764c;

    /* JADX INFO: renamed from: f */
    @GuardedBy("this")
    public fhv0 f120767f;

    /* JADX INFO: renamed from: h */
    public final String f120769h;

    /* JADX INFO: renamed from: i */
    public final int f120770i;

    /* JADX INFO: renamed from: j */
    public final ehv0 f120771j;

    /* JADX INFO: renamed from: k */
    public q6w0 f120772k;

    /* JADX INFO: renamed from: a */
    @GuardedBy("this")
    public final Map f120762a = new HashMap();

    /* JADX INFO: renamed from: b */
    @GuardedBy("this")
    public final List f120763b = new ArrayList();

    /* JADX INFO: renamed from: d */
    @GuardedBy("this")
    public final List f120765d = new ArrayList();

    /* JADX INFO: renamed from: e */
    @GuardedBy("this")
    public final Set f120766e = new HashSet();

    /* JADX INFO: renamed from: g */
    @GuardedBy("this")
    public int f120768g = Api.BaseClientBuilder.API_PRIORITY_OTHER;

    public jgv0(b7w0 b7w0Var, ehv0 ehv0Var, C2291v3 c2291v3) {
        this.f120770i = b7w0Var.f75343b.f68854b.f172382p;
        this.f120771j = ehv0Var;
        this.f120764c = c2291v3;
        this.f120769h = khv0.m149828b(b7w0Var);
        List list = b7w0Var.f75343b.f68853a;
        for (int i = 0; i < list.size(); i++) {
            this.f120762a.put((q6w0) list.get(i), Integer.valueOf(i));
        }
        this.f120763b.addAll(list);
    }

    /* JADX INFO: renamed from: a */
    public final synchronized q6w0 m144796a() {
        for (int i = 0; i < this.f120763b.size(); i++) {
            try {
                q6w0 q6w0Var = (q6w0) this.f120763b.get(i);
                String str = q6w0Var.f155912t0;
                if (!this.f120766e.contains(str)) {
                    if (!TextUtils.isEmpty(str)) {
                        this.f120766e.add(str);
                    }
                    this.f120765d.add(q6w0Var);
                    return (q6w0) this.f120763b.remove(i);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: b */
    public final synchronized void m144797b(Throwable th, q6w0 q6w0Var) {
        this.f120765d.remove(q6w0Var);
        this.f120766e.remove(q6w0Var.f155912t0);
        if (m144799d() || m144804i()) {
            return;
        }
        m144801f();
    }

    /* JADX INFO: renamed from: c */
    public final synchronized void m144798c(fhv0 fhv0Var, q6w0 q6w0Var) {
        this.f120765d.remove(q6w0Var);
        if (m144799d()) {
            fhv0Var.mo125604a();
            return;
        }
        Integer num = (Integer) this.f120762a.get(q6w0Var);
        int iIntValue = num != null ? num.intValue() : Api.BaseClientBuilder.API_PRIORITY_OTHER;
        if (iIntValue > this.f120768g) {
            this.f120771j.m120870m(q6w0Var);
            return;
        }
        if (this.f120767f != null) {
            this.f120771j.m120870m(this.f120772k);
        }
        this.f120768g = iIntValue;
        this.f120767f = fhv0Var;
        this.f120772k = q6w0Var;
        if (m144804i()) {
            return;
        }
        m144801f();
    }

    /* JADX INFO: renamed from: d */
    public final synchronized boolean m144799d() {
        return this.f120764c.isDone();
    }

    /* JADX INFO: renamed from: e */
    public final synchronized boolean m144800e() {
        if (!m144799d()) {
            List list = this.f120765d;
            if (list.size() < this.f120770i && m144802g(false)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized void m144801f() {
        this.f120771j.m120866i(this.f120772k);
        fhv0 fhv0Var = this.f120767f;
        C2291v3 c2291v3 = this.f120764c;
        if (fhv0Var != null) {
            c2291v3.mo13075e(fhv0Var);
        } else {
            c2291v3.mo13076f(new zzeml(3, this.f120769h));
        }
    }

    /* JADX INFO: renamed from: g */
    public final synchronized boolean m144802g(boolean z) {
        try {
            for (q6w0 q6w0Var : this.f120763b) {
                Integer num = (Integer) this.f120762a.get(q6w0Var);
                int iIntValue = num != null ? num.intValue() : Api.BaseClientBuilder.API_PRIORITY_OTHER;
                if (z || !this.f120766e.contains(q6w0Var.f155912t0)) {
                    int i = this.f120768g;
                    if (iIntValue < i) {
                        return true;
                    }
                    if (iIntValue > i) {
                        break;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: h */
    public final synchronized boolean m144803h() {
        try {
            Iterator it = this.f120765d.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) this.f120762a.get((q6w0) it.next());
                if ((num != null ? num.intValue() : Api.BaseClientBuilder.API_PRIORITY_OTHER) < this.f120768g) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: i */
    public final synchronized boolean m144804i() {
        return m144802g(true) || m144803h();
    }
}
