package p149l;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.pay.R$string;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;

/* JADX INFO: loaded from: classes4.dex */
public class d6n {

    /* JADX INFO: renamed from: a */
    public LinearLayout f84643a;

    /* JADX INFO: renamed from: b */
    public TextView f84644b;

    /* JADX INFO: renamed from: c */
    public TextView f84645c;

    /* JADX INFO: renamed from: d */
    public final Act f84646d;

    public d6n(Act act) {
        this.f84646d = act;
    }

    /* JADX INFO: renamed from: a */
    public View m110179a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e6n.m115101b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public View m110180b() {
        View viewM110179a = m110179a(this.f84646d.inflater(), null);
        m110181c();
        return viewM110179a;
    }

    /* JADX INFO: renamed from: c */
    public void m110181c() {
        TextView textView = this.f84645c;
        Act act = this.f84646d;
        textView.setText(n6a.m158029q0(act, act.getString(IntlCountryCodeController.m28115k() ? R$string.f27439f2 : R$string.f27345X1, this.f84646d.string(R$string.f27463h2), this.f84646d.string(R$string.f27328V6)), this.f84646d.string(R$string.f27463h2), juk.m143328j(), this.f84646d.string(R$string.f27328V6), juk.m143327i()));
        this.f84645c.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
