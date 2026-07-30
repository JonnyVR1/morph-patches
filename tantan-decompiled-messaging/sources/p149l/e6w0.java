package p149l;

import android.view.View;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.ads.zzfog;
import com.google.android.gms.internal.ads.zzfok;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes6.dex */
public final class e6w0 extends b6w0 {

    /* JADX INFO: renamed from: i */
    public static final Pattern f89643i = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* JADX INFO: renamed from: a */
    public final d6w0 f89644a;

    /* JADX INFO: renamed from: b */
    public final c6w0 f89645b;

    /* JADX INFO: renamed from: d */
    public h8w0 f89647d;

    /* JADX INFO: renamed from: e */
    public e7w0 f89648e;

    /* JADX INFO: renamed from: c */
    public final List f89646c = new ArrayList();

    /* JADX INFO: renamed from: f */
    public boolean f89649f = false;

    /* JADX INFO: renamed from: g */
    public boolean f89650g = false;

    /* JADX INFO: renamed from: h */
    public final String f89651h = UUID.randomUUID().toString();

    public e6w0(c6w0 c6w0Var, d6w0 d6w0Var) {
        this.f89645b = c6w0Var;
        this.f89644a = d6w0Var;
        m115119k(null);
        if (d6w0Var.m110196d() == zzfog.HTML || d6w0Var.m110196d() == zzfog.JAVASCRIPT) {
            this.f89648e = new f7w0(d6w0Var.m110195a());
        } else {
            this.f89648e = new i7w0(d6w0Var.m110201i(), null);
        }
        this.f89648e.mo115226k();
        n6w0.m158096a().m158099d(this);
        x6w0.m207211a().m207215d(this.f89648e.m115216a(), c6w0Var.m105511b());
    }

    @Override // p149l.b6w0
    /* JADX INFO: renamed from: b */
    public final void mo100477b(View view, zzfok zzfokVar, @Nullable String str) {
        q6w0 q6w0Var;
        if (this.f89650g) {
            return;
        }
        if (!f89643i.matcher("Ad overlay").matches()) {
            ig3.m135964a("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
            return;
        }
        Iterator it = this.f89646c.iterator();
        do {
            if (!it.hasNext()) {
                q6w0Var = null;
                break;
            }
            q6w0Var = (q6w0) it.next();
        } while (q6w0Var.m173176b().get() != view);
        if (q6w0Var == null) {
            this.f89646c.add(new q6w0(view, zzfokVar, "Ad overlay"));
        }
    }

    @Override // p149l.b6w0
    /* JADX INFO: renamed from: c */
    public final void mo100478c() {
        if (this.f89650g) {
            return;
        }
        this.f89647d.clear();
        if (!this.f89650g) {
            this.f89646c.clear();
        }
        this.f89650g = true;
        x6w0.m207211a().m207214c(this.f89648e.m115216a());
        n6w0.m158096a().m158100e(this);
        this.f89648e.mo115218c();
        this.f89648e = null;
    }

    @Override // p149l.b6w0
    /* JADX INFO: renamed from: d */
    public final void mo100479d(View view) {
        if (this.f89650g || m115114f() == view) {
            return;
        }
        m115119k(view);
        this.f89648e.m115217b();
        Collection<e6w0> collectionM158098c = n6w0.m158096a().m158098c();
        if (collectionM158098c == null || collectionM158098c.isEmpty()) {
            return;
        }
        for (e6w0 e6w0Var : collectionM158098c) {
            if (e6w0Var != this && e6w0Var.m115114f() == view) {
                e6w0Var.f89647d.clear();
            }
        }
    }

    @Override // p149l.b6w0
    /* JADX INFO: renamed from: e */
    public final void mo100480e() {
        if (this.f89649f) {
            return;
        }
        this.f89649f = true;
        n6w0.m158096a().m158101f(this);
        this.f89648e.m115224i(y6w0.m213252c().m213253b());
        this.f89648e.m115220e(l6w0.m148782b().m148784c());
        this.f89648e.mo115222g(this, this.f89644a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f */
    public final View m115114f() {
        return (View) this.f89647d.get();
    }

    /* JADX INFO: renamed from: g */
    public final e7w0 m115115g() {
        return this.f89648e;
    }

    /* JADX INFO: renamed from: h */
    public final String m115116h() {
        return this.f89651h;
    }

    /* JADX INFO: renamed from: i */
    public final List m115117i() {
        return this.f89646c;
    }

    /* JADX INFO: renamed from: j */
    public final boolean m115118j() {
        return this.f89649f && !this.f89650g;
    }

    /* JADX INFO: renamed from: k */
    public final void m115119k(View view) {
        this.f89647d = new h8w0(view);
    }
}
