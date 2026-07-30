package p149l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class pqa0 extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f150776u;

    /* JADX INFO: renamed from: v */
    public VText f150777v;

    /* JADX INFO: renamed from: w */
    public VText f150778w;

    /* JADX INFO: renamed from: x */
    public VText f150779x;

    public pqa0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    @Override // p149l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo52800O() {
        return (a1m) this.f108534c;
    }

    /* JADX INFO: renamed from: T */
    public final void m170904T() {
        e51.m114766q(this.f150779x.getText().toString());
        lsi0.m151593w(R$string.f17587Ak);
    }

    /* JADX INFO: renamed from: U */
    public View m170905U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qqa0.m175880b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m170906V(View view) {
        m170904T();
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ boolean m170907W(View view) {
        m170904T();
        return true;
    }

    /* JADX INFO: renamed from: X */
    public final void m170908X() {
        if (!mo52800O().mo51053D2()) {
            this.f150779x.getPaint().setFlags(8);
        }
        this.f150779x.getPaint().setAntiAlias(true);
        this.f150779x.setOnClickListener(new View.OnClickListener() { // from class: l.nqa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140051a.m170906V(view);
            }
        });
        this.f150779x.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.oqa0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f145116a.m170907W(view);
            }
        });
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        this.f150777v.setTextColor(mo52800O().act().getResources().getColor(w0c0.f183796P1));
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        User userMo51069K2 = mo52800O().mo51069K2();
        return NullChecker.m81303a(userMo51069K2) && !TextUtils.isEmpty(userMo51069K2.publicId);
    }

    @Override // p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m170905U(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        this.f150779x.setText(mo52800O().mo51069K2().publicId);
        m170908X();
    }
}
