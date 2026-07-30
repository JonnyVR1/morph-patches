package p153l;

import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes12.dex */
public class gbe0 {

    /* JADX INFO: renamed from: a */
    public final vxd0 f103457a;

    /* JADX INFO: renamed from: b */
    public final wyd0 f103458b;

    /* JADX INFO: renamed from: c */
    public boolean f103459c;

    /* JADX INFO: renamed from: d */
    public final Set<String> f103460d;

    /* JADX INFO: renamed from: e */
    public final HashSet<String> f103461e;

    /* JADX INFO: renamed from: l.gbe0$a */
    public static class C17192a {

        /* JADX INFO: renamed from: a */
        public static final gbe0 f103462a = new gbe0();
    }

    public gbe0() {
        this.f103457a = new vxd0("school_downloaded_version", 0);
        this.f103458b = new wyd0("school_list_json_Sp", "");
        this.f103459c = false;
        this.f103460d = new HashSet();
        this.f103461e = new HashSet<>();
    }

    /* JADX INFO: renamed from: b */
    public static gbe0 m129776b() {
        return C17192a.f103462a;
    }

    /* JADX INFO: renamed from: a */
    public final void m129777a() {
        this.f103460d.clear();
    }

    /* JADX INFO: renamed from: c */
    public void m129778c() {
        this.f103461e.clear();
    }

    /* JADX INFO: renamed from: d */
    public void m129779d() {
        m129777a();
        l51.m152919y(new Runnable() { // from class: l.fbe0
            @Override // java.lang.Runnable
            public final void run() {
                this.f98092a.m129778c();
            }
        });
    }
}
