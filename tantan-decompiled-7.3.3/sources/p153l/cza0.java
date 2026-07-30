package p153l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class cza0 extends aza0 {

    /* JADX INFO: renamed from: A */
    public VText f84452A;

    public cza0(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    @Override // p153l.aza0, p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        this.f84452A.setTypeface(Typeface.defaultFromStyle(1));
    }

    @Override // p153l.aza0, p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        View viewInflate = mo53983O().mo146493H2().inflate(kec0.f125651Ua, viewGroup, false);
        this.f74120u = (VLinear_Dividers) viewInflate.findViewById(adc0.f70406jb);
        this.f74122w = (VText) viewInflate.findViewById(adc0.f70513q);
        VText vText = (VText) viewInflate.findViewById(adc0.f70390ib);
        this.f74121v = vText;
        this.f84452A = vText;
        return viewInflate;
    }

    @Override // p153l.aza0, p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        super.mo53914t();
    }
}
