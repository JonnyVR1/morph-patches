package p153l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class z5o0 implements iam<ssm0> {

    /* JADX INFO: renamed from: a */
    public ssm0 f203072a;

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(ssm0 ssm0Var) {
        this.f203072a = ssm0Var;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m218722c(Dialog dialog, View view, int i, CharSequence charSequence) {
        this.f203072a.m187743f4(charSequence);
    }

    /* JADX INFO: renamed from: d */
    public void m218723d(Act act, List<String> list) {
        act.dialog().m21534e0(list).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.y5o0
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f197575a.m218722c(dialog, view, i, charSequence);
            }
        }).m21495B(true).m21567z0();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
