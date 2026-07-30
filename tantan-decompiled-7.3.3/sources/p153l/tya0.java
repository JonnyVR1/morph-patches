package p153l;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class tya0 extends ep90 {

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f176651u;

    /* JADX INFO: renamed from: v */
    public VText f176652v;

    /* JADX INFO: renamed from: w */
    public VText f176653w;

    /* JADX INFO: renamed from: x */
    public VText f176654x;

    public tya0(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    @Override // p153l.ep90
    /* JADX INFO: renamed from: O */
    public t3m mo53983O() {
        return (t3m) this.f148056c;
    }

    /* JADX INFO: renamed from: T */
    public final void m193561T() {
        l51.m152911q(this.f176654x.getText().toString());
        o1j0.m165649w(R$string.f18977Wk);
    }

    /* JADX INFO: renamed from: U */
    public View m193562U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return uya0.m198581b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m193563V(View view) {
        m193561T();
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ boolean m193564W(View view) {
        m193561T();
        return true;
    }

    /* JADX INFO: renamed from: X */
    public final void m193565X() {
        if (!mo53983O().mo52236D2()) {
            this.f176654x.getPaint().setFlags(8);
        }
        this.f176654x.getPaint().setAntiAlias(true);
        this.f176654x.setOnClickListener(new View.OnClickListener() { // from class: l.rya0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165420a.m193563V(view);
            }
        });
        this.f176654x.setOnLongClickListener(new View.OnLongClickListener() { // from class: l.sya0
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f171224a.m193564W(view);
            }
        });
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        this.f176652v.setTextColor(mo53983O().act().getResources().getColor(c9c0.f80368Q1));
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        User userMo52252K2 = mo53983O().mo52252K2();
        return NullChecker.m82486a(userMo52252K2) && !TextUtils.isEmpty(userMo52252K2.publicId);
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m193562U(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        this.f176654x.setText(mo53983O().mo52252K2().publicId);
        m193565X();
    }
}
