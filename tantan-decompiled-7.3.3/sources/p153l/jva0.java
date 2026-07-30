package p153l;

import android.content.Intent;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.marry.audit.MarryInfoAuditStatusAct;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class jva0 extends ep90 {

    /* JADX INFO: renamed from: u */
    public VText f122779u;

    public jva0(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m147007T(View view) {
        Intent intentM48584a2 = MarryInfoAuditStatusAct.m48584a2(mo53983O().act(), "profile");
        MarryInfoAuditStatusAct.m48585d2(intentM48584a2);
        mo53983O().act().startActivity(intentM48584a2);
        mo53983O().act().lambda$debugItems$19();
    }

    /* JADX INFO: renamed from: S */
    public View m147008S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kva0.m151661b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        this.f122779u.setTypeface(Typeface.DEFAULT_BOLD);
        bnl0.m105509E0(view, new View.OnClickListener() { // from class: l.iva0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f117033a.m147007T(view2);
            }
        });
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return mo53983O().mo52302m0();
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m147008S(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
    }
}
