package p149l;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes10.dex */
public class c3e0 {

    /* JADX INFO: renamed from: a */
    public final tpd0 f78930a;

    /* JADX INFO: renamed from: b */
    public final uqd0 f78931b;

    /* JADX INFO: renamed from: c */
    public boolean f78932c;

    /* JADX INFO: renamed from: d */
    public final Set<String> f78933d;

    /* JADX INFO: renamed from: e */
    public final HashSet<String> f78934e;

    /* JADX INFO: renamed from: l.c3e0$a */
    public static class C16048a {

        /* JADX INFO: renamed from: a */
        public static final c3e0 f78935a = new c3e0();
    }

    public c3e0() {
        this.f78930a = new tpd0("school_downloaded_version", 0);
        this.f78931b = new uqd0("school_list_json_Sp", "");
        this.f78932c = false;
        this.f78933d = new HashSet();
        this.f78934e = new HashSet<>();
    }

    /* JADX INFO: renamed from: b */
    public static c3e0 m105003b() {
        return C16048a.f78935a;
    }

    /* JADX INFO: renamed from: a */
    public final void m105004a() {
        this.f78933d.clear();
    }

    /* JADX INFO: renamed from: c */
    public void m105005c() {
        this.f78934e.clear();
    }

    /* JADX INFO: renamed from: d */
    public void m105006d() {
        m105004a();
        e51.m114774y(new Runnable() { // from class: l.b3e0
            @Override // java.lang.Runnable
            public final void run() {
                this.f73206a.m105005c();
            }
        });
    }
}
