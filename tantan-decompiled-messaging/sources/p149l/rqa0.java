package p149l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class rqa0 extends pqa0 {

    /* JADX INFO: renamed from: y */
    public VText f160600y;

    public rqa0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    @Override // p149l.pqa0, p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        this.f160600y.setTypeface(Typeface.SANS_SERIF, 1);
        boolean zMo51119m0 = mo52800O().mo51119m0();
        VText vText = this.f160600y;
        if (zMo51119m0) {
            xdl0.m208368c0(vText, t100.m186890d(8.0f));
            xdl0.m208374f0(this.f160600y, t100.m186890d(28.0f));
        } else {
            xdl0.m208368c0(vText, t100.m186890d(4.0f));
            xdl0.m208374f0(this.f160600y, t100.m186890d(20.0f));
        }
    }

    @Override // p149l.pqa0, p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        View viewInflate = mo52800O().mo94568H2().inflate(f6c0.f95878l9, viewGroup, false);
        this.f150776u = (VLinear_Dividers) viewInflate.findViewById(u4c0.f174163ab);
        VText vText = (VText) viewInflate.findViewById(u4c0.f173917Ld);
        this.f160600y = vText;
        this.f150777v = vText;
        this.f150778w = (VText) viewInflate.findViewById(u4c0.f173900Kd);
        this.f150779x = (VText) viewInflate.findViewById(u4c0.f173883Jd);
        return viewInflate;
    }
}
