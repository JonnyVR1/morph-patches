package p149l;

import androidx.annotation.Nullable;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes6.dex */
public final class a0w0 {

    /* JADX INFO: renamed from: b */
    public final int f67075b;

    /* JADX INFO: renamed from: c */
    public final int f67076c;

    /* JADX INFO: renamed from: a */
    public final LinkedList f67074a = new LinkedList();

    /* JADX INFO: renamed from: d */
    public final d1w0 f67077d = new d1w0();

    public a0w0(int i, int i2) {
        this.f67075b = i;
        this.f67076c = i2;
    }

    /* JADX INFO: renamed from: a */
    public final int m94486a() {
        return this.f67077d.m109684a();
    }

    /* JADX INFO: renamed from: b */
    public final int m94487b() {
        m94494i();
        return this.f67074a.size();
    }

    /* JADX INFO: renamed from: c */
    public final long m94488c() {
        return this.f67077d.m109685b();
    }

    /* JADX INFO: renamed from: d */
    public final long m94489d() {
        return this.f67077d.m109686c();
    }

    @Nullable
    /* JADX INFO: renamed from: e */
    public final o0w0 m94490e() {
        this.f67077d.m109689f();
        m94494i();
        if (this.f67074a.isEmpty()) {
            return null;
        }
        o0w0 o0w0Var = (o0w0) this.f67074a.remove();
        if (o0w0Var != null) {
            this.f67077d.m109691h();
        }
        return o0w0Var;
    }

    /* JADX INFO: renamed from: f */
    public final c1w0 m94491f() {
        return this.f67077d.m109687d();
    }

    /* JADX INFO: renamed from: g */
    public final String m94492g() {
        return this.f67077d.m109688e();
    }

    /* JADX INFO: renamed from: h */
    public final boolean m94493h(o0w0 o0w0Var) {
        this.f67077d.m109689f();
        m94494i();
        if (this.f67074a.size() == this.f67075b) {
            return false;
        }
        this.f67074a.add(o0w0Var);
        return true;
    }

    /* JADX INFO: renamed from: i */
    public final void m94494i() {
        while (!this.f67074a.isEmpty()) {
            if (vny0.m199064b().currentTimeMillis() - ((o0w0) this.f67074a.getFirst()).f141388d < this.f67076c) {
                return;
            }
            this.f67077d.m109690g();
            this.f67074a.remove();
        }
    }
}
