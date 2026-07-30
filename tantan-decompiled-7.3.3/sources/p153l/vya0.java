package p153l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class vya0 extends tya0 {

    /* JADX INFO: renamed from: y */
    public VText f186349y;

    public vya0(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    @Override // p153l.tya0, p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        this.f186349y.setTypeface(Typeface.SANS_SERIF, 1);
        boolean zMo52302m0 = mo53983O().mo52302m0();
        VText vText = this.f186349y;
        if (zMo52302m0) {
            bnl0.m105548c0(vText, qa00.m175859d(8.0f));
            bnl0.m105554f0(this.f186349y, qa00.m175859d(28.0f));
        } else {
            bnl0.m105548c0(vText, qa00.m175859d(4.0f));
            bnl0.m105554f0(this.f186349y, qa00.m175859d(20.0f));
        }
    }

    @Override // p153l.tya0, p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        View viewInflate = mo53983O().mo146493H2().inflate(kec0.f126051s9, viewGroup, false);
        this.f176651u = (VLinear_Dividers) viewInflate.findViewById(adc0.f70288cb);
        VText vText = (VText) viewInflate.findViewById(adc0.f70039Nd);
        this.f186349y = vText;
        this.f176652v = vText;
        this.f176653w = (VText) viewInflate.findViewById(adc0.f70022Md);
        this.f176654x = (VText) viewInflate.findViewById(adc0.f70005Ld);
        return viewInflate;
    }
}
