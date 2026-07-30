package p149l;

import android.content.Intent;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.marry.audit.MarryInfoAuditStatusAct;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class fna0 extends ah90 {

    /* JADX INFO: renamed from: u */
    public VText f98411u;

    public fna0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m122292T(View view) {
        Intent intentM47401Z1 = MarryInfoAuditStatusAct.m47401Z1(mo52800O().act(), "profile");
        MarryInfoAuditStatusAct.m47402c2(intentM47401Z1);
        mo52800O().act().startActivity(intentM47401Z1);
        mo52800O().act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: S */
    public View m122293S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return gna0.m127120b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        this.f98411u.setTypeface(Typeface.DEFAULT_BOLD);
        xdl0.m208329E0(view, new View.OnClickListener() { // from class: l.ena0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f92290a.m122292T(view2);
            }
        });
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return mo52800O().mo51119m0();
    }

    @Override // p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m122293S(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
    }
}
