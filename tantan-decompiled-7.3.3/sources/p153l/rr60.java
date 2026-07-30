package p153l;

import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.p070ui.permission.PermissionHelper;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class rr60 extends lbl0 {
    @Override // p153l.lbl0
    /* JADX INFO: renamed from: a */
    public void mo96996a(final Act act) {
        super.mo96996a(act);
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.CAMERA");
        arrayList.add("android.permission.RECORD_AUDIO");
        PermissionHelper.m81065c().m81082q(arrayList).m81088w(false).m81086u(true).m81075j(true).m81078m(new x20() { // from class: l.pr60
            @Override // p153l.x20
            public final void call() {
                this.f153728a.m182718m(act);
            }
        }, new y20() { // from class: l.qr60
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159069a.m182719n(act, (PermissionHelper.PermissionDeniedReason) obj);
            }
        }).m81074i(act);
    }

    @Override // p153l.lbl0
    /* JADX INFO: renamed from: f */
    public String mo96997f() {
        return "phonePermission";
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m182718m(Act act) {
        m153583e(act);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m182719n(Act act, PermissionHelper.PermissionDeniedReason permissionDeniedReason) {
        it0.m142010D(act);
        m153580b("cancel");
    }
}
