package p002l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import l.f6c0;
import l.mcr;
import l.u4c0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class yqa0 extends wqa0 {

    /* JADX INFO: renamed from: A */
    public VText f23037A;

    public yqa0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    @Override // p002l.wqa0, p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        this.f23037A.setTypeface(Typeface.defaultFromStyle(1));
    }

    @Override // p002l.wqa0, p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        View viewInflate = mo3351O().mo9267H2().inflate(f6c0.Na, viewGroup, false);
        this.f21929u = viewInflate.findViewById(u4c0.hb);
        this.f21931w = viewInflate.findViewById(u4c0.q);
        VText vTextFindViewById = viewInflate.findViewById(u4c0.gb);
        this.f21930v = vTextFindViewById;
        this.f23037A = vTextFindViewById;
        return viewInflate;
    }

    @Override // p002l.wqa0, p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        super.mo3282t();
    }
}
