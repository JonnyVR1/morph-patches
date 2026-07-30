package p149l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class yqa0 extends wqa0 {

    /* JADX INFO: renamed from: A */
    public VText f199541A;

    public yqa0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    @Override // p149l.wqa0, p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        this.f199541A.setTypeface(Typeface.defaultFromStyle(1));
    }

    @Override // p149l.wqa0, p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        View viewInflate = mo52800O().mo94568H2().inflate(f6c0.f95485Na, viewGroup, false);
        this.f187673u = (VLinear_Dividers) viewInflate.findViewById(u4c0.f174282hb);
        this.f187675w = (VText) viewInflate.findViewById(u4c0.f174422q);
        VText vText = (VText) viewInflate.findViewById(u4c0.f174265gb);
        this.f187674v = vText;
        this.f199541A = vText;
        return viewInflate;
    }

    @Override // p149l.wqa0, p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        super.mo52731t();
    }
}
