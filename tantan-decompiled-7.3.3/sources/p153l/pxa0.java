package p153l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import p151v.VDraweeView;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class pxa0 extends nxa0 {

    /* JADX INFO: renamed from: A */
    public VDraweeView f154546A;

    /* JADX INFO: renamed from: B */
    public VDraweeView f154547B;

    public pxa0(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    @Override // p153l.nxa0, p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return super.mo53912l();
    }

    @Override // p153l.nxa0, p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        View viewInflate = mo53983O().mo146493H2().inflate(kec0.f125587Qa, viewGroup, false);
        this.f144099u = (VLinear_Dividers) viewInflate.findViewById(adc0.f70523q9);
        this.f144100v = (VText) viewInflate.findViewById(adc0.f70308de);
        this.f144101w = (VDraweeView) viewInflate.findViewById(adc0.f70118S7);
        this.f144102x = (VText) viewInflate.findViewById(adc0.f69914G7);
        this.f144103y = (VText) viewInflate.findViewById(adc0.f70274be);
        this.f154546A = (VDraweeView) viewInflate.findViewById(adc0.f69949I8);
        this.f154547B = (VDraweeView) viewInflate.findViewById(adc0.f70404j9);
        return viewInflate;
    }

    @Override // p153l.nxa0, p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        super.mo53914t();
        uqb0.f180374G.m127111J0(this.f154547B, mo53983O().mo52252K2().picture(0).profileSmall(), true);
        uqb0.f180374G.m127111J0(this.f154546A, CoreModule.f18264c.f20381e0.m116600p9().picture(0).profileSmall(), true);
        this.f144102x.setTypeface(Typeface.defaultFromStyle(1));
        this.f144100v.setTypeface(Typeface.defaultFromStyle(1));
    }
}
