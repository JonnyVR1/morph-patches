package tech.sud.runtime.p018a;

import android.app.Activity;
import android.widget.FrameLayout;
import java.util.HashMap;
import tech.sud.runtime.component.p022d.C1210a;
import tech.sud.runtime.component.p026h.C1228f;
import tech.sud.runtime.core.C1236b;
import tech.sud.runtime.core.C1241g;

/* JADX INFO: renamed from: tech.sud.runtime.a.c */
/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class C1195c implements InterfaceC1193a {

    /* JADX INFO: renamed from: a */
    private C1236b f11159a;

    /* JADX INFO: renamed from: b */
    private final C1241g f11160b;

    /* JADX INFO: renamed from: c */
    private final C1210a f11161c;

    public C1195c() {
        C1241g c1241g = new C1241g();
        this.f11160b = c1241g;
        this.f11161c = new C1210a(c1241g);
    }

    @Override // tech.sud.runtime.p018a.InterfaceC1193a
    /* JADX INFO: renamed from: a */
    public void mo10051a(String str, String str2) {
        C1236b c1236b = this.f11159a;
        if (c1236b == null || c1236b.f11490b) {
            return;
        }
        this.f11161c.m10214b(str, str2);
    }

    @Override // tech.sud.runtime.p018a.InterfaceC1193a
    /* JADX INFO: renamed from: b */
    public void mo10056b(String str, String str2) {
        C1236b c1236b = this.f11159a;
        if (c1236b != null) {
            c1236b.m10423b(str, str2);
        }
    }

    @Override // tech.sud.runtime.p018a.InterfaceC1193a
    /* JADX INFO: renamed from: c */
    public void mo10057c() {
        this.f11159a.m10428g();
    }

    @Override // tech.sud.runtime.p018a.InterfaceC1193a
    /* JADX INFO: renamed from: d */
    public void mo10058d() {
        this.f11159a.m10427f();
    }

    @Override // tech.sud.runtime.p018a.InterfaceC1193a
    /* JADX INFO: renamed from: e */
    public String[] mo10059e() {
        return this.f11159a.m10430i();
    }

    @Override // tech.sud.runtime.p018a.InterfaceC1193a
    /* JADX INFO: renamed from: b */
    public void mo10055b() {
        this.f11159a.m10429h();
    }

    @Override // tech.sud.runtime.p018a.InterfaceC1193a
    /* JADX INFO: renamed from: a */
    public Object mo10048a() {
        return this.f11159a.f11489a;
    }

    @Override // tech.sud.runtime.p018a.InterfaceC1193a
    /* JADX INFO: renamed from: a */
    public void mo10050a(FrameLayout frameLayout) {
        this.f11159a.m10418a(frameLayout);
    }

    @Override // tech.sud.runtime.p018a.InterfaceC1193a
    /* JADX INFO: renamed from: a */
    public void mo10054a(boolean z) {
        this.f11159a.m10417a();
    }

    @Override // tech.sud.runtime.p018a.InterfaceC1193a
    /* JADX INFO: renamed from: a */
    public void mo10052a(String str, InterfaceC1193a.a aVar) {
        this.f11161c.m10212a(str, aVar);
    }

    @Override // tech.sud.runtime.p018a.InterfaceC1193a
    /* JADX INFO: renamed from: a */
    public void mo10049a(Activity activity, HashMap<String, String> map) {
        this.f11159a = new C1236b(activity, this.f11160b, map, this.f11161c);
    }

    @Override // tech.sud.runtime.p018a.InterfaceC1193a
    /* JADX INFO: renamed from: a */
    public void mo10053a(InterfaceC1194b interfaceC1194b) {
        C1241g.m10452a(interfaceC1194b);
        C1228f.m10326a(interfaceC1194b);
    }
}
