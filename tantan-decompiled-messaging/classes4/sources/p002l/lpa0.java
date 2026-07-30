package p002l;

import android.graphics.Typeface;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.CoreModule;
import l.f6c0;
import l.mcr;
import l.qib0;
import l.u4c0;
import v.VDraweeView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lpa0 extends jpa0 {

    /* JADX INFO: renamed from: A */
    public VDraweeView f14976A;

    /* JADX INFO: renamed from: B */
    public VDraweeView f14977B;

    public lpa0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    @Override // p002l.jpa0, p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return super.mo3280l();
    }

    @Override // p002l.jpa0, p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        View viewInflate = mo3351O().mo9267H2().inflate(f6c0.Ja, viewGroup, false);
        this.f13970u = viewInflate.findViewById(u4c0.o9);
        this.f13971v = viewInflate.findViewById(u4c0.ae);
        this.f13972w = viewInflate.findViewById(u4c0.Q7);
        this.f13973x = viewInflate.findViewById(u4c0.E7);
        this.f13974y = viewInflate.findViewById(u4c0.Yd);
        this.f14976A = viewInflate.findViewById(u4c0.G8);
        this.f14977B = viewInflate.findViewById(u4c0.h9);
        return viewInflate;
    }

    @Override // p002l.jpa0, p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        super.mo3282t();
        qib0.G.J0(this.f14977B, mo3351O().mo1517K2().picture(0).profileSmall(), true);
        qib0.G.J0(this.f14976A, CoreModule.c.e0.p9().picture(0).profileSmall(), true);
        this.f13973x.setTypeface(Typeface.defaultFromStyle(1));
        this.f13971v.setTypeface(Typeface.defaultFromStyle(1));
    }
}
