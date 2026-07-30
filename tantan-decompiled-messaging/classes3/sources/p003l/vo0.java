package p003l;

import java.util.ArrayList;
import java.util.List;
import l.vwb;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class vo0 {

    /* JADX INFO: renamed from: b */
    public int f8361b = -1;

    /* JADX INFO: renamed from: a */
    public List<uo0> f8360a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public void m8385a() {
        if (vwb.J(this.f8360a)) {
            return;
        }
        int i = this.f8361b + 1;
        this.f8361b = i;
        this.f8361b = i % this.f8360a.size();
    }

    /* JADX INFO: renamed from: b */
    public void m8386b() {
        this.f8361b = 0;
    }

    /* JADX INFO: renamed from: c */
    public boolean m8387c() {
        return this.f8361b >= 0 && !vwb.J(this.f8360a);
    }

    /* JADX INFO: renamed from: d */
    public boolean m8388d() {
        return this.f8361b == this.f8360a.size() - 1;
    }

    /* JADX INFO: renamed from: e */
    public uo0 m8389e() {
        int i = this.f8361b;
        if (i < 0 || i >= this.f8360a.size()) {
            return null;
        }
        return this.f8360a.get(this.f8361b);
    }

    /* JADX INFO: renamed from: f */
    public long m8390f() {
        int i = this.f8361b;
        if (i < 0 || i >= this.f8360a.size()) {
            return -1L;
        }
        return this.f8360a.get(this.f8361b).f8042c;
    }
}
