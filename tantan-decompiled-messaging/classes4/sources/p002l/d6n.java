package p002l;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.core.pay.R;
import l.e6n;
import l.juk;
import l.n6a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class d6n {

    /* JADX INFO: renamed from: a */
    public LinearLayout f9076a;

    /* JADX INFO: renamed from: b */
    public TextView f9077b;

    /* JADX INFO: renamed from: c */
    public TextView f9078c;

    /* JADX INFO: renamed from: d */
    public final Act f9079d;

    public d6n(Act act) {
        this.f9079d = act;
    }

    /* JADX INFO: renamed from: a */
    public View m11607a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e6n.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public View m11608b() {
        View viewM11607a = m11607a(this.f9079d.inflater(), null);
        m11609c();
        return viewM11607a;
    }

    /* JADX INFO: renamed from: c */
    public void m11609c() {
        TextView textView = this.f9078c;
        Act act = this.f9079d;
        textView.setText(n6a.q0(act, act.getString(IntlCountryCodeController.k() ? R.string.f2 : R.string.X1, this.f9079d.string(R.string.h2), this.f9079d.string(R.string.V6)), new String[]{this.f9079d.string(R.string.h2), juk.j(), this.f9079d.string(R.string.V6), juk.i()}));
        this.f9078c.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
