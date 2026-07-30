package tech.sud.runtime.p141a;

import android.app.Activity;
import android.widget.FrameLayout;
import java.util.HashMap;
import tech.sud.runtime.component.p145d.C22532a;
import tech.sud.runtime.component.p149h.C22550f;
import tech.sud.runtime.core.C22558b;
import tech.sud.runtime.core.C22563g;

/* JADX INFO: renamed from: tech.sud.runtime.a.c */
/* JADX INFO: loaded from: classes3.dex */
public class C22517c implements InterfaceC22515a {

    /* JADX INFO: renamed from: a */
    private C22558b f208456a;

    /* JADX INFO: renamed from: b */
    private final C22563g f208457b;

    /* JADX INFO: renamed from: c */
    private final C22532a f208458c;

    public C22517c() {
        C22563g c22563g = new C22563g();
        this.f208457b = c22563g;
        this.f208458c = new C22532a(c22563g);
    }

    @Override // tech.sud.runtime.p141a.InterfaceC22515a
    /* JADX INFO: renamed from: a */
    public void mo222830a(String str, String str2) {
        C22558b c22558b = this.f208456a;
        if (c22558b == null || c22558b.f208787b) {
            return;
        }
        this.f208458c.m222989b(str, str2);
    }

    @Override // tech.sud.runtime.p141a.InterfaceC22515a
    /* JADX INFO: renamed from: b */
    public void mo222835b(String str, String str2) {
        C22558b c22558b = this.f208456a;
        if (c22558b != null) {
            c22558b.m223198b(str, str2);
        }
    }

    @Override // tech.sud.runtime.p141a.InterfaceC22515a
    /* JADX INFO: renamed from: c */
    public void mo222836c() {
        this.f208456a.m223203g();
    }

    @Override // tech.sud.runtime.p141a.InterfaceC22515a
    /* JADX INFO: renamed from: d */
    public void mo222837d() {
        this.f208456a.m223202f();
    }

    @Override // tech.sud.runtime.p141a.InterfaceC22515a
    /* JADX INFO: renamed from: e */
    public String[] mo222838e() {
        return this.f208456a.m223205i();
    }

    @Override // tech.sud.runtime.p141a.InterfaceC22515a
    /* JADX INFO: renamed from: b */
    public void mo222834b() {
        this.f208456a.m223204h();
    }

    @Override // tech.sud.runtime.p141a.InterfaceC22515a
    /* JADX INFO: renamed from: a */
    public Object mo222827a() {
        return this.f208456a.f208786a;
    }

    @Override // tech.sud.runtime.p141a.InterfaceC22515a
    /* JADX INFO: renamed from: a */
    public void mo222829a(FrameLayout frameLayout) {
        this.f208456a.m223193a(frameLayout);
    }

    @Override // tech.sud.runtime.p141a.InterfaceC22515a
    /* JADX INFO: renamed from: a */
    public void mo222833a(boolean z) {
        this.f208456a.m223192a();
    }

    @Override // tech.sud.runtime.p141a.InterfaceC22515a
    /* JADX INFO: renamed from: a */
    public void mo222831a(String str, InterfaceC22515a.a aVar) {
        this.f208458c.m222987a(str, aVar);
    }

    @Override // tech.sud.runtime.p141a.InterfaceC22515a
    /* JADX INFO: renamed from: a */
    public void mo222828a(Activity activity, HashMap<String, String> map) {
        this.f208456a = new C22558b(activity, this.f208457b, map, this.f208458c);
    }

    @Override // tech.sud.runtime.p141a.InterfaceC22515a
    /* JADX INFO: renamed from: a */
    public void mo222832a(InterfaceC22516b interfaceC22516b) {
        C22563g.m223227a(interfaceC22516b);
        C22550f.m223101a(interfaceC22516b);
    }
}
