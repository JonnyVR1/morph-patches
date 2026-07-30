package p002l;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import l.lr90;
import l.mcr;
import v.VLinear_Dividers;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class kr90 extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f14479u;

    /* JADX INFO: renamed from: v */
    public VText f14480v;

    /* JADX INFO: renamed from: w */
    public VText f14481w;

    public kr90(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: R */
    public View m16771R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return lr90.b(this, layoutInflater, viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        this.f14480v.setTypeface(Typeface.DEFAULT_BOLD);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return false;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m16771R(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        this.f14481w.setText(mo3351O().mo1517K2().description);
    }
}
