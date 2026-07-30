package p149l;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.live.base.bean.UserRightType;
import com.p046p1.mobile.putong.live.external.page.rights.list.view.RightEquipDialogContentView;

/* JADX INFO: loaded from: classes13.dex */
public class f2d0 {

    /* JADX INFO: renamed from: a */
    public q3d0 f94172a;

    /* JADX INFO: renamed from: b */
    public i9t f94173b;

    /* JADX INFO: renamed from: c */
    public RightEquipDialogContentView f94174c;

    /* JADX INFO: renamed from: d */
    public Act f94175d;

    /* JADX INFO: renamed from: e */
    public UserRightType f94176e;

    public f2d0(UserRightType userRightType, Act act, q3d0 q3d0Var) {
        this.f94176e = userRightType;
        this.f94175d = act;
        this.f94172a = q3d0Var;
    }

    /* JADX INFO: renamed from: c */
    public void m119166c() {
        i9t i9tVar = this.f94173b;
        if (i9tVar == null || !i9tVar.isShowing()) {
            return;
        }
        this.f94173b.dismiss();
    }

    /* JADX INFO: renamed from: d */
    public UserRightType m119167d() {
        return this.f94176e;
    }

    /* JADX INFO: renamed from: e */
    public final void m119168e() {
        if (this.f94173b == null) {
            this.f94174c = (RightEquipDialogContentView) LayoutInflater.from(this.f94175d).inflate(s6c0.f162745e1, (ViewGroup) null);
            this.f94173b = new i9t(this.f94175d, this.f94174c);
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m119169f() {
        i9t i9tVar = this.f94173b;
        if (i9tVar == null || !i9tVar.isShowing()) {
            return;
        }
        this.f94173b.dismiss();
        this.f94174c.m70611t0();
        this.f94172a.m172795S0();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m119170g(DialogInterface dialogInterface) {
        this.f94174c.m70611t0();
    }

    /* JADX INFO: renamed from: h */
    public void m119171h(String str, String str2) {
        this.f94172a.m172794R0(str, str2, true);
    }

    /* JADX INFO: renamed from: i */
    public void m119172i(String str) {
        this.f94172a.m172794R0(str, "", false);
    }

    /* JADX INFO: renamed from: j */
    public void m119173j(x0d0 x0d0Var) {
        i9t i9tVar = this.f94173b;
        if (i9tVar == null || !i9tVar.isShowing()) {
            return;
        }
        this.f94174c.m70606B0(x0d0Var);
    }

    /* JADX INFO: renamed from: k */
    public void m119174k(a1d0 a1d0Var) {
        m119168e();
        if (this.f94173b.isShowing()) {
            return;
        }
        this.f94174c.m70612u0(this, a1d0Var, new d30() { // from class: l.d2d0
            @Override // p149l.d30
            public final void call() {
                this.f83355a.m119169f();
            }
        });
        this.f94173b.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.e2d0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f88915a.m119170g(dialogInterface);
            }
        });
        this.f94173b.show();
    }
}
