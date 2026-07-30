package p002l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import l.f6c0;
import l.mcr;
import l.t100;
import l.u4c0;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class rqa0 extends pqa0 {

    /* JADX INFO: renamed from: y */
    public VText f18643y;

    public rqa0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    @Override // p002l.pqa0, p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        this.f18643y.setTypeface(Typeface.SANS_SERIF, 1);
        boolean zMo1570m0 = mo3351O().mo1570m0();
        VText vText = this.f18643y;
        if (zMo1570m0) {
            xdl0.c0(vText, t100.d(8.0f));
            xdl0.f0(this.f18643y, t100.d(28.0f));
        } else {
            xdl0.c0(vText, t100.d(4.0f));
            xdl0.f0(this.f18643y, t100.d(20.0f));
        }
    }

    @Override // p002l.pqa0, p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        View viewInflate = mo3351O().mo9267H2().inflate(f6c0.l9, viewGroup, false);
        this.f17613u = viewInflate.findViewById(u4c0.ab);
        VText vTextFindViewById = viewInflate.findViewById(u4c0.Ld);
        this.f18643y = vTextFindViewById;
        this.f17614v = vTextFindViewById;
        this.f17615w = viewInflate.findViewById(u4c0.Kd);
        this.f17616x = viewInflate.findViewById(u4c0.Jd);
        return viewInflate;
    }
}
