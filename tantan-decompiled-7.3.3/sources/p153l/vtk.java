package p153l;

import com.p051p1.mobile.putong.data.OMSEventId;

/* JADX INFO: loaded from: classes11.dex */
public class vtk extends o8l {
    public vtk(String str, boolean z) {
        super(str, z);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ void m202689h(p8l.C19323a c19323a) {
        if (iz40.m142788y(c19323a.f151041b.m101951T4(), true)) {
            return;
        }
        c19323a.f151041b.f74502G.m137019l(Boolean.TRUE);
    }

    @Override // p153l.o8l
    /* JADX INFO: renamed from: d */
    public boolean mo130140d(final p8l.C19323a c19323a) {
        if (gra.m131555D2()) {
            iz40.m142762G(c19323a.m171258a(), true);
        } else {
            iz40.m142761F(c19323a.m171258a(), new x20() { // from class: l.ttk
                @Override // p153l.x20
                public final void call() {
                    c19323a.f151041b.m101976Y4();
                }
            }, new x20() { // from class: l.utk
                @Override // p153l.x20
                public final void call() {
                    vtk.m202689h(c19323a);
                }
            });
        }
        return true;
    }

    @Override // p153l.o8l
    /* JADX INFO: renamed from: f */
    public boolean mo130142f(p8l.C19323a c19323a) {
        if (spl0.m187397w()) {
            return uqb0.f180403i0.m218282a(pk50.m172568j().m172574f().m181661Y(this.f145424a, OMSEventId.e_page_switch, "p_suggest_users_home_view"));
        }
        return false;
    }
}
