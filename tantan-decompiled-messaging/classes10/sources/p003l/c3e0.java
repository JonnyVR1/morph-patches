package p003l;

import java.util.HashSet;
import java.util.Set;
import l.e51;
import l.tpd0;
import l.uqd0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class c3e0 {

    /* JADX INFO: renamed from: a */
    public final tpd0 f3964a;

    /* JADX INFO: renamed from: b */
    public final uqd0 f3965b;

    /* JADX INFO: renamed from: c */
    public boolean f3966c;

    /* JADX INFO: renamed from: d */
    public final Set<String> f3967d;

    /* JADX INFO: renamed from: e */
    public final HashSet<String> f3968e;

    /* JADX INFO: renamed from: l.c3e0$a */
    public static class C3310a {

        /* JADX INFO: renamed from: a */
        public static final c3e0 f3969a = new c3e0();
    }

    public c3e0() {
        this.f3964a = new tpd0("school_downloaded_version", 0);
        this.f3965b = new uqd0("school_list_json_Sp", "");
        this.f3966c = false;
        this.f3967d = new HashSet();
        this.f3968e = new HashSet<>();
    }

    /* JADX INFO: renamed from: b */
    public static c3e0 m5845b() {
        return C3310a.f3969a;
    }

    /* JADX INFO: renamed from: a */
    public final void m5846a() {
        this.f3967d.clear();
    }

    /* JADX INFO: renamed from: c */
    public void m5847c() {
        this.f3968e.clear();
    }

    /* JADX INFO: renamed from: d */
    public void m5848d() {
        m5846a();
        e51.y(new Runnable() { // from class: l.b3e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f3307a.m5847c();
            }
        });
    }
}
