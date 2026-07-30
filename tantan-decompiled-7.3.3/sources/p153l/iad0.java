package p153l;

import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.live.base.bean.UserRightType;
import com.p051p1.mobile.putong.live.external.page.rights.list.view.RightEquipDialogContentView;

/* JADX INFO: loaded from: classes9.dex */
public class iad0 {

    /* JADX INFO: renamed from: a */
    public tbd0 f113585a;

    /* JADX INFO: renamed from: b */
    public jbt f113586b;

    /* JADX INFO: renamed from: c */
    public RightEquipDialogContentView f113587c;

    /* JADX INFO: renamed from: d */
    public Act f113588d;

    /* JADX INFO: renamed from: e */
    public UserRightType f113589e;

    public iad0(UserRightType userRightType, Act act, tbd0 tbd0Var) {
        this.f113589e = userRightType;
        this.f113588d = act;
        this.f113585a = tbd0Var;
    }

    /* JADX INFO: renamed from: c */
    public void m139184c() {
        jbt jbtVar = this.f113586b;
        if (jbtVar == null || !jbtVar.isShowing()) {
            return;
        }
        this.f113586b.dismiss();
    }

    /* JADX INFO: renamed from: d */
    public UserRightType m139185d() {
        return this.f113589e;
    }

    /* JADX INFO: renamed from: e */
    public final void m139186e() {
        if (this.f113586b == null) {
            this.f113587c = (RightEquipDialogContentView) LayoutInflater.from(this.f113588d).inflate(xec0.f193859e1, (ViewGroup) null);
            this.f113586b = new jbt(this.f113588d, this.f113587c);
        }
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m139187f() {
        jbt jbtVar = this.f113586b;
        if (jbtVar == null || !jbtVar.isShowing()) {
            return;
        }
        this.f113586b.dismiss();
        this.f113587c.m71794t0();
        this.f113585a.m189996S0();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m139188g(DialogInterface dialogInterface) {
        this.f113587c.m71794t0();
    }

    /* JADX INFO: renamed from: h */
    public void m139189h(String str, String str2) {
        this.f113585a.m189995R0(str, str2, true);
    }

    /* JADX INFO: renamed from: i */
    public void m139190i(String str) {
        this.f113585a.m189995R0(str, "", false);
    }

    /* JADX INFO: renamed from: j */
    public void m139191j(a9d0 a9d0Var) {
        jbt jbtVar = this.f113586b;
        if (jbtVar == null || !jbtVar.isShowing()) {
            return;
        }
        this.f113587c.m71789B0(a9d0Var);
    }

    /* JADX INFO: renamed from: k */
    public void m139192k(d9d0 d9d0Var) {
        m139186e();
        if (this.f113586b.isShowing()) {
            return;
        }
        this.f113587c.m71795u0(this, d9d0Var, new x20() { // from class: l.gad0
            @Override // p153l.x20
            public final void call() {
                this.f102977a.m139187f();
            }
        });
        this.f113586b.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.had0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f108492a.m139188g(dialogInterface);
            }
        });
        this.f113586b.show();
    }
}
