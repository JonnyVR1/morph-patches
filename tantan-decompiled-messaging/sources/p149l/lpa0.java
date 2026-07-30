package p149l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import p147v.VDraweeView;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class lpa0 extends jpa0 {

    /* JADX INFO: renamed from: A */
    public VDraweeView f129186A;

    /* JADX INFO: renamed from: B */
    public VDraweeView f129187B;

    public lpa0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    @Override // p149l.jpa0, p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return super.mo52729l();
    }

    @Override // p149l.jpa0, p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        View viewInflate = mo52800O().mo94568H2().inflate(f6c0.f95421Ja, viewGroup, false);
        this.f119136u = (VLinear_Dividers) viewInflate.findViewById(u4c0.f174398o9);
        this.f119137v = (VText) viewInflate.findViewById(u4c0.f174166ae);
        this.f119138w = (VDraweeView) viewInflate.findViewById(u4c0.f173996Q7);
        this.f119139x = (VText) viewInflate.findViewById(u4c0.f173792E7);
        this.f119140y = (VText) viewInflate.findViewById(u4c0.f174133Yd);
        this.f129186A = (VDraweeView) viewInflate.findViewById(u4c0.f173827G8);
        this.f129187B = (VDraweeView) viewInflate.findViewById(u4c0.f174280h9);
        return viewInflate;
    }

    @Override // p149l.jpa0, p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        super.mo52731t();
        qib0.f154691G.m102327J0(this.f129187B, mo52800O().mo51069K2().picture(0).profileSmall(), true);
        qib0.f154691G.m102327J0(this.f129186A, CoreModule.f17545c.f19639e0.m169527p9().picture(0).profileSmall(), true);
        this.f119139x.setTypeface(Typeface.defaultFromStyle(1));
        this.f119137v.setTypeface(Typeface.defaultFromStyle(1));
    }
}
