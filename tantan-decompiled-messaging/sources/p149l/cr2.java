package p149l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes6.dex */
public class cr2 {

    /* JADX INFO: renamed from: c */
    public final yqf0 f82145c;

    /* JADX INFO: renamed from: a */
    public final Map<String, jqf0> f82143a = new HashMap();

    /* JADX INFO: renamed from: b */
    public final Set<jqf0> f82144b = new CopyOnWriteArraySet();

    /* JADX INFO: renamed from: d */
    public final CopyOnWriteArraySet<arf0> f82146d = new CopyOnWriteArraySet<>();

    /* JADX INFO: renamed from: e */
    public boolean f82147e = true;

    public cr2(yqf0 yqf0Var) {
        if (yqf0Var == null) {
            ig3.m135964a("springLooper is required");
            throw null;
        }
        this.f82145c = yqf0Var;
        yqf0Var.m215721a(this);
    }

    /* JADX INFO: renamed from: a */
    public void m108320a(String str) {
        jqf0 jqf0Var = this.f82143a.get(str);
        if (jqf0Var == null) {
            qtc0.m176411a("springId ", str, " does not reference a registered spring");
            return;
        }
        this.f82144b.add(jqf0Var);
        if (m108324e()) {
            this.f82147e = false;
            this.f82145c.mo146663b();
        }
    }

    /* JADX INFO: renamed from: b */
    public void m108321b(double d) {
        for (jqf0 jqf0Var : this.f82144b) {
            if (jqf0Var.m142807r()) {
                jqf0Var.m142791b(d / 1000.0d);
            } else {
                this.f82144b.remove(jqf0Var);
            }
        }
    }

    /* JADX INFO: renamed from: c */
    public jqf0 m108322c() {
        jqf0 jqf0Var = new jqf0(this);
        m108326g(jqf0Var);
        return jqf0Var;
    }

    /* JADX INFO: renamed from: d */
    public void m108323d(jqf0 jqf0Var) {
        if (jqf0Var == null) {
            ig3.m135964a("spring is required");
        } else {
            this.f82144b.remove(jqf0Var);
            this.f82143a.remove(jqf0Var.m142796g());
        }
    }

    /* JADX INFO: renamed from: e */
    public boolean m108324e() {
        return this.f82147e;
    }

    /* JADX INFO: renamed from: f */
    public void m108325f(double d) {
        Iterator<arf0> it = this.f82146d.iterator();
        while (it.hasNext()) {
            it.next().m98389b(this);
        }
        m108321b(d);
        if (this.f82144b.isEmpty()) {
            this.f82147e = true;
        }
        Iterator<arf0> it2 = this.f82146d.iterator();
        while (it2.hasNext()) {
            it2.next().m98388a(this);
        }
        if (this.f82147e) {
            this.f82145c.mo146664c();
        }
    }

    /* JADX INFO: renamed from: g */
    public void m108326g(jqf0 jqf0Var) {
        if (jqf0Var == null) {
            ig3.m135964a("spring is required");
        } else if (this.f82143a.containsKey(jqf0Var.m142796g())) {
            ig3.m135964a("spring is already registered");
        } else {
            this.f82143a.put(jqf0Var.m142796g(), jqf0Var);
        }
    }
}
