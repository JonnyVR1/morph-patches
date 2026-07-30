package p002l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.e51;
import l.lsi0;
import l.mcr;
import l.qqa0;
import l.w0c0;
import v.VLinear_Dividers;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class pqa0 extends ah90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f17613u;

    /* JADX INFO: renamed from: v */
    public VText f17614v;

    /* JADX INFO: renamed from: w */
    public VText f17615w;

    /* JADX INFO: renamed from: x */
    public VText f17616x;

    public pqa0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    @Override // p002l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo3351O() {
        return (a1m) this.f12125c;
    }

    /* JADX INFO: renamed from: T */
    public final void m20627T() {
        e51.q(this.f17616x.getText().toString());
        lsi0.w(R.string.Ak);
    }

    /* JADX INFO: renamed from: U */
    public View m20628U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qqa0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m20629V(View view) {
        m20627T();
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ boolean m20630W(View view) {
        m20627T();
        return true;
    }

    /* JADX INFO: renamed from: X */
    public final void m20631X() {
        if (!mo3351O().mo1501D2()) {
            this.f17616x.getPaint().setFlags(8);
        }
        this.f17616x.getPaint().setAntiAlias(true);
        this.f17616x.setOnClickListener(new View.OnClickListener() { // from class: l.nqa0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16162a.m20629V(view);
            }
        });
        this.f17616x.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.oqa0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f16745a.m20630W(view);
            }
        });
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        this.f17614v.setTextColor(mo3351O().act().getResources().getColor(w0c0.P1));
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        User userMo1517K2 = mo3351O().mo1517K2();
        return NullChecker.a(userMo1517K2) && !TextUtils.isEmpty(userMo1517K2.publicId);
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m20628U(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        this.f17616x.setText(mo3351O().mo1517K2().publicId);
        m20631X();
    }
}
