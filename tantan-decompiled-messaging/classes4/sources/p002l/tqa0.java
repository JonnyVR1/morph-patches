package p002l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import l.mcr;
import l.uqa0;
import v.VImage;
import v.VLinear_Dividers;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class tqa0 extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f20335u;

    /* JADX INFO: renamed from: v */
    public VImage f20336v;

    /* JADX INFO: renamed from: w */
    public VText f20337w;

    /* JADX INFO: renamed from: x */
    public VText f20338x;

    public tqa0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    @Override // p002l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo3351O() {
        return (a1m) this.f12125c;
    }

    /* JADX INFO: renamed from: R */
    public View m23106R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uqa0.b(this, layoutInflater, viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return true;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m23106R(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        this.f20337w.setTypeface(Typeface.DEFAULT_BOLD);
        String strMo2897y0 = mo3351O().mo2897y0();
        if (TextUtils.isEmpty(strMo2897y0)) {
            return;
        }
        this.f20338x.setText(strMo2897y0);
    }
}
