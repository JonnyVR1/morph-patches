package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.data.AuthData;
import com.p046p1.mobile.putong.live.external.page.rights.list.view.RightDetailDialogContentView;

/* JADX INFO: loaded from: classes13.dex */
public class z1d0 {

    /* JADX INFO: renamed from: a */
    public Act f201066a;

    /* JADX INFO: renamed from: b */
    public i9t f201067b;

    /* JADX INFO: renamed from: c */
    public RightDetailDialogContentView f201068c;

    /* JADX INFO: renamed from: d */
    public String f201069d;

    public z1d0(Act act) {
        this.f201066a = act;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m216792c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public void m216793d() {
        i9t i9tVar = this.f201067b;
        if (i9tVar == null || !i9tVar.isShowing()) {
            return;
        }
        this.f201067b.dismiss();
    }

    /* JADX INFO: renamed from: e */
    public final void m216794e(Act act) {
        this.f201068c = (RightDetailDialogContentView) LayoutInflater.from(act).inflate(s6c0.f162665F0, (ViewGroup) null);
        i9t i9tVar = new i9t(act, this.f201068c);
        this.f201067b = i9tVar;
        i9tVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.y1d0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f195403a.m216796g(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final boolean m216795f(Act act) {
        return act == null || act.isDestroyed() || act.isFinishing();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m216796g(DialogInterface dialogInterface) {
        this.f201068c.m70580d();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m216797h(String str, AuthData authData) {
        if (m216795f(this.f201066a)) {
            return;
        }
        String str2 = authData.accessToken;
        this.f201069d = str2;
        this.f201068c.m70584h(this.f201066a, str, str2, this);
    }

    /* JADX INFO: renamed from: i */
    public void m216798i() {
        RightDetailDialogContentView rightDetailDialogContentView = this.f201068c;
        if (rightDetailDialogContentView != null) {
            rightDetailDialogContentView.m70583g();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m216799j(final String str) {
        l9s.m149070d().observeOn(jo0.m142408a()).subscribe(ffw.m121194e(new e30() { // from class: l.w1d0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f183990a.m216797h(str, (AuthData) obj);
            }
        }, new e30() { // from class: l.x1d0
            @Override // p149l.e30
            public final void call(Object obj) {
                z1d0.m216792c((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public void m216800k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f201067b == null) {
            m216794e(this.f201066a);
        }
        this.f201067b.show();
        if (TextUtils.isEmpty(this.f201069d)) {
            m216799j(str);
        } else {
            this.f201068c.m70584h(this.f201066a, str, this.f201069d, this);
        }
    }
}
