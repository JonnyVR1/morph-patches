package p153l;

import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class oz90 extends ep90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f149848u;

    /* JADX INFO: renamed from: v */
    public VText f149849v;

    /* JADX INFO: renamed from: w */
    public VText f149850w;

    public oz90(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: renamed from: R */
    public View m169916R(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return pz90.m174348b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        this.f149849v.setTypeface(Typeface.DEFAULT_BOLD);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return false;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m169916R(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        this.f149850w.setText(mo53983O().mo52252K2().description);
    }
}
