package p149l;

import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.p065ui.permission.PermissionHelper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes13.dex */
public class mj60 extends g2l0 {
    @Override // p149l.g2l0
    /* JADX INFO: renamed from: a */
    public void mo94566a(final Act act) {
        super.mo94566a(act);
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.CAMERA");
        arrayList.add("android.permission.RECORD_AUDIO");
        PermissionHelper.m79882c().m79899q(arrayList).m79905w(false).m79903u(true).m79892j(true).m79895m(new d30() { // from class: l.kj60
            @Override // p149l.d30
            public final void call() {
                this.f123435a.m154785m(act);
            }
        }, new e30() { // from class: l.lj60
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128285a.m154786n(act, (PermissionHelper.PermissionDeniedReason) obj);
            }
        }).m79891i(act);
    }

    @Override // p149l.g2l0
    /* JADX INFO: renamed from: f */
    public String mo94567f() {
        return "phonePermission";
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m154785m(Act act) {
        m124169e(act);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m154786n(Act act, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        dt0.m113504D(act);
        m124166b("cancel");
    }
}
