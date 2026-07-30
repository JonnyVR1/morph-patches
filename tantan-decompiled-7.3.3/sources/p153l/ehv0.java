package p153l;

import android.text.TextUtils;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.util.Clock;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes6.dex */
public final class ehv0 {

    /* JADX INFO: renamed from: a */
    public final Clock f94079a;

    /* JADX INFO: renamed from: b */
    public final ghv0 f94080b;

    /* JADX INFO: renamed from: c */
    public final yew0 f94081c;

    /* JADX INFO: renamed from: d */
    @GuardedBy("this")
    public final LinkedHashMap f94082d = new LinkedHashMap();

    /* JADX INFO: renamed from: e */
    public final boolean f94083e = ((Boolean) jas0.m144075c().m176505a(sgs0.f168138S6)).booleanValue();

    /* JADX INFO: renamed from: f */
    public final tcv0 f94084f;

    /* JADX INFO: renamed from: g */
    public boolean f94085g;

    /* JADX INFO: renamed from: h */
    public long f94086h;

    /* JADX INFO: renamed from: i */
    public long f94087i;

    public ehv0(Clock clock, ghv0 ghv0Var, tcv0 tcv0Var, yew0 yew0Var) {
        this.f94079a = clock;
        this.f94080b = ghv0Var;
        this.f94084f = tcv0Var;
        this.f94081c = yew0Var;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized long m120863a() {
        return this.f94086h;
    }

    /* JADX INFO: renamed from: f */
    public final synchronized hpr m120864f(b7w0 b7w0Var, q6w0 q6w0Var, hpr hprVar, uew0 uew0Var) {
        t6w0 t6w0Var = b7w0Var.f75343b.f68854b;
        long jElapsedRealtime = this.f94079a.elapsedRealtime();
        String str = q6w0Var.f155917x;
        if (str != null) {
            this.f94082d.put(q6w0Var, new dhv0(str, q6w0Var.f155886g0, 9, 0L, null));
            pvw0.m173991r(hprVar, new chv0(this, jElapsedRealtime, t6w0Var, q6w0Var, str, uew0Var, b7w0Var), oct0.f146738f);
        }
        return hprVar;
    }

    /* JADX INFO: renamed from: g */
    public final synchronized String m120865g() {
        ArrayList arrayList;
        try {
            arrayList = new ArrayList();
            Iterator it = this.f94082d.entrySet().iterator();
            while (it.hasNext()) {
                dhv0 dhv0Var = (dhv0) ((Map.Entry) it.next()).getValue();
                if (dhv0Var.f88558c != Integer.MAX_VALUE) {
                    arrayList.add(dhv0Var.toString());
                }
            }
        } catch (Throwable th) {
            throw th;
        }
        return TextUtils.join("_", arrayList);
    }

    /* JADX INFO: renamed from: i */
    public final synchronized void m120866i(@Nullable q6w0 q6w0Var) {
        try {
            this.f94086h = this.f94079a.elapsedRealtime() - this.f94087i;
            if (q6w0Var != null) {
                this.f94084f.m190513e(q6w0Var);
            }
            this.f94085g = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    /* JADX INFO: renamed from: j */
    public final synchronized void m120867j() {
        this.f94086h = this.f94079a.elapsedRealtime() - this.f94087i;
    }

    /* JADX INFO: renamed from: k */
    public final synchronized void m120868k(List list) {
        this.f94087i = this.f94079a.elapsedRealtime();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            q6w0 q6w0Var = (q6w0) it.next();
            if (!TextUtils.isEmpty(q6w0Var.f155917x)) {
                this.f94082d.put(q6w0Var, new dhv0(q6w0Var.f155917x, q6w0Var.f155886g0, Api.BaseClientBuilder.API_PRIORITY_OTHER, 0L, null));
            }
        }
    }

    /* JADX INFO: renamed from: l */
    public final synchronized void m120869l() {
        this.f94087i = this.f94079a.elapsedRealtime();
    }

    /* JADX INFO: renamed from: m */
    public final synchronized void m120870m(q6w0 q6w0Var) {
        dhv0 dhv0Var = (dhv0) this.f94082d.get(q6w0Var);
        if (dhv0Var == null || this.f94085g) {
            return;
        }
        dhv0Var.f88558c = 8;
    }

    /* JADX INFO: renamed from: q */
    public final synchronized boolean m120871q(q6w0 q6w0Var) {
        dhv0 dhv0Var = (dhv0) this.f94082d.get(q6w0Var);
        if (dhv0Var == null) {
            return false;
        }
        return dhv0Var.f88558c == 8;
    }
}
