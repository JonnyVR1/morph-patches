package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.data.AuthData;
import com.p051p1.mobile.putong.live.external.page.rights.list.view.RightDetailDialogContentView;

/* JADX INFO: loaded from: classes9.dex */
public class cad0 {

    /* JADX INFO: renamed from: a */
    public Act f80577a;

    /* JADX INFO: renamed from: b */
    public jbt f80578b;

    /* JADX INFO: renamed from: c */
    public RightDetailDialogContentView f80579c;

    /* JADX INFO: renamed from: d */
    public String f80580d;

    public cad0(Act act) {
        this.f80577a = act;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m108482c(Throwable th) {
    }

    /* JADX INFO: renamed from: d */
    public void m108483d() {
        jbt jbtVar = this.f80578b;
        if (jbtVar == null || !jbtVar.isShowing()) {
            return;
        }
        this.f80578b.dismiss();
    }

    /* JADX INFO: renamed from: e */
    public final void m108484e(Act act) {
        this.f80579c = (RightDetailDialogContentView) LayoutInflater.from(act).inflate(xec0.f193779F0, (ViewGroup) null);
        jbt jbtVar = new jbt(act, this.f80579c);
        this.f80578b = jbtVar;
        jbtVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.bad0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f75677a.m108486g(dialogInterface);
            }
        });
    }

    /* JADX INFO: renamed from: f */
    public final boolean m108485f(Act act) {
        return act == null || act.isDestroyed() || act.isFinishing();
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m108486g(DialogInterface dialogInterface) {
        this.f80579c.m71763d();
    }

    /* JADX INFO: renamed from: h */
    public final /* synthetic */ void m108487h(String str, AuthData authData) {
        if (m108485f(this.f80577a)) {
            return;
        }
        String str2 = authData.accessToken;
        this.f80580d = str2;
        this.f80579c.m71767h(this.f80577a, str, str2, this);
    }

    /* JADX INFO: renamed from: i */
    public void m108488i() {
        RightDetailDialogContentView rightDetailDialogContentView = this.f80579c;
        if (rightDetailDialogContentView != null) {
            rightDetailDialogContentView.m71766g();
        }
    }

    /* JADX INFO: renamed from: j */
    public final void m108489j(final String str) {
        mbs.m157847d().observeOn(fo0.m126432a()).subscribe(dhw.m115826e(new y20() { // from class: l.z9d0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203471a.m108487h(str, (AuthData) obj);
            }
        }, new y20() { // from class: l.aad0
            @Override // p153l.y20
            public final void call(Object obj) {
                cad0.m108482c((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k */
    public void m108490k(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (this.f80578b == null) {
            m108484e(this.f80577a);
        }
        this.f80578b.show();
        if (TextUtils.isEmpty(this.f80580d)) {
            m108489j(str);
        } else {
            this.f80579c.m71767h(this.f80577a, str, this.f80580d, this);
        }
    }
}
