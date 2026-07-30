package p153l;

import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import p151v.VImage;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class xya0 extends ep90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f196728u;

    /* JADX INFO: renamed from: v */
    public VImage f196729v;

    /* JADX INFO: renamed from: w */
    public VText f196730w;

    /* JADX INFO: renamed from: x */
    public VText f196731x;

    public xya0(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    @Override // p153l.ep90
    /* JADX INFO: renamed from: O */
    public t3m mo53983O() {
        return (t3m) this.f148056c;
    }

    /* JADX INFO: renamed from: R */
    public View m213603R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return yya0.m217958b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return true;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m213603R(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        this.f196730w.setTypeface(Typeface.DEFAULT_BOLD);
        String strMo53547y0 = mo53983O().mo53547y0();
        if (TextUtils.isEmpty(strMo53547y0)) {
            return;
        }
        this.f196731x.setText(strMo53547y0);
    }
}
