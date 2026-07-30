package p153l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes6.dex */
public class sr2 {

    /* JADX INFO: renamed from: c */
    public final hzf0 f170291c;

    /* JADX INFO: renamed from: a */
    public final Map<String, syf0> f170289a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Set<syf0> f170290b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArraySet<jzf0> f170292d = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: e */
    public boolean f170293e = true;

    public sr2(hzf0 hzf0Var) {
        if (hzf0Var == null) {
            wg3.m206174a("springLooper is required");
            throw null;
        }
        this.f170291c = hzf0Var;
        hzf0Var.m137892a(this);
    }

    /* JADX INFO: renamed from: a */
    public void m187583a(String str) {
        syf0 syf0Var = this.f170289a.get(str);
        if (syf0Var == null) {
            v1d0.m199002a("springId ", str, " does not reference a registered spring");
            return;
        }
        this.f170290b.add(syf0Var);
        if (m187587e()) {
            this.f170293e = false;
            this.f170291c.mo131019b();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m187584b(double d) {
        for (syf0 syf0Var : this.f170290b) {
            if (syf0Var.m188564r()) {
                syf0Var.m188548b(d / 1000.0d);
            } else {
                this.f170290b.remove(syf0Var);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public syf0 m187585c() {
        syf0 syf0Var = new syf0(this);
        m187589g(syf0Var);
        return syf0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m187586d(syf0 syf0Var) {
        if (syf0Var == null) {
            wg3.m206174a("spring is required");
        } else {
            this.f170290b.remove(syf0Var);
            this.f170289a.remove(syf0Var.m188553g());
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m187587e() {
        return this.f170293e;
    }

    /* JADX INFO: renamed from: f */
    public void m187588f(double d) {
        Iterator<jzf0> it = this.f170292d.iterator();
        while (it.hasNext()) {
            it.next().m147662b(this);
        }
        m187584b(d);
        if (this.f170290b.isEmpty()) {
            this.f170293e = true;
        }
        Iterator<jzf0> it2 = this.f170292d.iterator();
        while (it2.hasNext()) {
            it2.next().m147661a(this);
        }
        if (this.f170293e) {
            this.f170291c.mo131020c();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m187589g(syf0 syf0Var) {
        if (syf0Var == null) {
            wg3.m206174a("spring is required");
        } else if (this.f170289a.containsKey(syf0Var.m188553g())) {
            wg3.m206174a("spring is already registered");
        } else {
            this.f170289a.put(syf0Var.m188553g(), syf0Var);
        }
    }
}
