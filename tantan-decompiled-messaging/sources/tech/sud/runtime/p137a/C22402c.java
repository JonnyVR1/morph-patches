package tech.sud.runtime.p137a;

import android.app.Activity;
import android.widget.FrameLayout;
import java.util.HashMap;
import tech.sud.runtime.component.p141d.C22417a;
import tech.sud.runtime.component.p145h.C22435f;
import tech.sud.runtime.core.C22443b;
import tech.sud.runtime.core.C22448g;

/* JADX INFO: renamed from: tech.sud.runtime.a.c */
/* JADX INFO: loaded from: classes3.dex */
public class C22402c implements InterfaceC22400a {

    /* JADX INFO: renamed from: a */
    private C22443b f207534a;

    /* JADX INFO: renamed from: b */
    private final C22448g f207535b;

    /* JADX INFO: renamed from: c */
    private final C22417a f207536c;

    public C22402c() {
        C22448g c22448g = new C22448g();
        this.f207535b = c22448g;
        this.f207536c = new C22417a(c22448g);
    }

    @Override // tech.sud.runtime.p137a.InterfaceC22400a
    /* JADX INFO: renamed from: a */
    public void mo221584a(String str, String str2) {
        C22443b c22443b = this.f207534a;
        if (c22443b == null || c22443b.f207865b) {
            return;
        }
        this.f207536c.m221743b(str, str2);
    }

    @Override // tech.sud.runtime.p137a.InterfaceC22400a
    /* JADX INFO: renamed from: b */
    public void mo221589b(String str, String str2) {
        C22443b c22443b = this.f207534a;
        if (c22443b != null) {
            c22443b.m221952b(str, str2);
        }
    }

    @Override // tech.sud.runtime.p137a.InterfaceC22400a
    /* JADX INFO: renamed from: c */
    public void mo221590c() {
        this.f207534a.m221957g();
    }

    @Override // tech.sud.runtime.p137a.InterfaceC22400a
    /* JADX INFO: renamed from: d */
    public void mo221591d() {
        this.f207534a.m221956f();
    }

    @Override // tech.sud.runtime.p137a.InterfaceC22400a
    /* JADX INFO: renamed from: e */
    public String[] mo221592e() {
        return this.f207534a.m221959i();
    }

    @Override // tech.sud.runtime.p137a.InterfaceC22400a
    /* JADX INFO: renamed from: b */
    public void mo221588b() {
        this.f207534a.m221958h();
    }

    @Override // tech.sud.runtime.p137a.InterfaceC22400a
    /* JADX INFO: renamed from: a */
    public Object mo221581a() {
        return this.f207534a.f207864a;
    }

    @Override // tech.sud.runtime.p137a.InterfaceC22400a
    /* JADX INFO: renamed from: a */
    public void mo221583a(FrameLayout frameLayout) {
        this.f207534a.m221947a(frameLayout);
    }

    @Override // tech.sud.runtime.p137a.InterfaceC22400a
    /* JADX INFO: renamed from: a */
    public void mo221587a(boolean z) {
        this.f207534a.m221946a();
    }

    @Override // tech.sud.runtime.p137a.InterfaceC22400a
    /* JADX INFO: renamed from: a */
    public void mo221585a(String str, InterfaceC22400a.a aVar) {
        this.f207536c.m221741a(str, aVar);
    }

    @Override // tech.sud.runtime.p137a.InterfaceC22400a
    /* JADX INFO: renamed from: a */
    public void mo221582a(Activity activity, HashMap<String, String> map) {
        this.f207534a = new C22443b(activity, this.f207535b, map, this.f207536c);
    }

    @Override // tech.sud.runtime.p137a.InterfaceC22400a
    /* JADX INFO: renamed from: a */
    public void mo221586a(InterfaceC22401b interfaceC22401b) {
        C22448g.m221981a(interfaceC22401b);
        C22435f.m221855a(interfaceC22401b);
    }
}
