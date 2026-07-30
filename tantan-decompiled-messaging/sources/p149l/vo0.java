package p149l;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class vo0 {

    /* JADX INFO: renamed from: b */
    public int f182326b = -1;

    /* JADX INFO: renamed from: a */
    public List<uo0> f182325a = new ArrayList();

    /* JADX INFO: renamed from: a */
    public void m199089a() {
        if (vwb.m200296J(this.f182325a)) {
            return;
        }
        int i = this.f182326b + 1;
        this.f182326b = i;
        this.f182326b = i % this.f182325a.size();
    }

    /* JADX INFO: renamed from: b */
    public void m199090b() {
        this.f182326b = 0;
    }

    /* JADX INFO: renamed from: c */
    public boolean m199091c() {
        return this.f182326b >= 0 && !vwb.m200296J(this.f182325a);
    }

    /* JADX INFO: renamed from: d */
    public boolean m199092d() {
        return this.f182326b == this.f182325a.size() - 1;
    }

    /* JADX INFO: renamed from: e */
    public uo0 m199093e() {
        int i = this.f182326b;
        if (i < 0 || i >= this.f182325a.size()) {
            return null;
        }
        return this.f182325a.get(this.f182326b);
    }

    /* JADX INFO: renamed from: f */
    public long m199094f() {
        int i = this.f182326b;
        if (i < 0 || i >= this.f182325a.size()) {
            return -1L;
        }
        return this.f182325a.get(this.f182326b).f177487c;
    }
}
