package p149l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import p147v.VImage;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class tqa0 extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f171559u;

    /* JADX INFO: renamed from: v */
    public VImage f171560v;

    /* JADX INFO: renamed from: w */
    public VText f171561w;

    /* JADX INFO: renamed from: x */
    public VText f171562x;

    public tqa0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    @Override // p149l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo52800O() {
        return (a1m) this.f108534c;
    }

    /* JADX INFO: renamed from: R */
    public View m190086R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uqa0.m194986b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return true;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m190086R(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        this.f171561w.setTypeface(Typeface.DEFAULT_BOLD);
        String strMo52364y0 = mo52800O().mo52364y0();
        if (TextUtils.isEmpty(strMo52364y0)) {
            return;
        }
        this.f171562x.setText(strMo52364y0);
    }
}
