package p149l;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class kr90 extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f124332u;

    /* JADX INFO: renamed from: v */
    public VText f124333v;

    /* JADX INFO: renamed from: w */
    public VText f124334w;

    public kr90(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: R */
    public View m146971R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return lr90.m151141b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        this.f124333v.setTypeface(Typeface.DEFAULT_BOLD);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return false;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m146971R(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        this.f124334w.setText(mo52800O().mo51069K2().description);
    }
}
