package p009l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import java.util.List;
import l.s7m;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class vwn0 implements s7m<ojm0> {

    /* JADX INFO: renamed from: a */
    public ojm0 f21809a;

    /* JADX INFO: renamed from: C0 */
    public Context m23739C0() {
        return null;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void m23743i1(ojm0 ojm0Var) {
        this.f21809a = ojm0Var;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m23741c(Dialog dialog, View view, int i, CharSequence charSequence) {
        this.f21809a.m19884f4(charSequence);
    }

    /* JADX INFO: renamed from: d */
    public void m23742d(Act act, List<String> list) {
        act.dialog().e0(list).g0(new Dialog.g() { // from class: l.uwn0
            /* JADX INFO: renamed from: a */
            public final void m23175a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f21356a.m23741c(dialog, view, i, charSequence);
            }
        }).B(true).z0();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void destroy() {
    }
}
