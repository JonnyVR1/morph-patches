package p149l;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class vwn0 implements s7m<ojm0> {

    /* JADX INFO: renamed from: a */
    public ojm0 f183359a;

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return null;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(ojm0 ojm0Var) {
        this.f183359a = ojm0Var;
    }

    /* JADX INFO: renamed from: c */
    public final /* synthetic */ void m200434c(Dialog dialog, View view, int i, CharSequence charSequence) {
        this.f183359a.m164703f4(charSequence);
    }

    /* JADX INFO: renamed from: d */
    public void m200435d(Act act, List<String> list) {
        act.dialog().m20535e0(list).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.uwn0
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view, int i, CharSequence charSequence) {
                this.f178664a.m200434c(dialog, view, i, charSequence);
            }
        }).m20496B(true).m20568z0();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
