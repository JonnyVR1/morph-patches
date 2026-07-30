package p002l;

import android.content.Intent;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.ui.marry.audit.MarryInfoAuditStatusAct;
import l.gna0;
import l.mcr;
import l.xdl0;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class fna0 extends ah90 {

    /* JADX INFO: renamed from: u */
    public VText f10535u;

    public fna0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m13371T(View view) {
        Intent intentZ1 = MarryInfoAuditStatusAct.Z1(mo3351O().act(), "profile");
        MarryInfoAuditStatusAct.c2(intentZ1);
        mo3351O().act().startActivity(intentZ1);
        mo3351O().act().finish();
    }

    /* JADX INFO: renamed from: S */
    public View m13372S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gna0.b(this, layoutInflater, viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        this.f10535u.setTypeface(Typeface.DEFAULT_BOLD);
        xdl0.E0(view, new View.OnClickListener() { // from class: l.ena0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f9882a.m13371T(view2);
            }
        });
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return mo3351O().mo1570m0();
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m13372S(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
    }
}
