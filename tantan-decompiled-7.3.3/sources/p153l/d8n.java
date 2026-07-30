package p153l;

import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.pay.R$string;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;

/* JADX INFO: loaded from: classes4.dex */
public class d8n {

    /* JADX INFO: renamed from: a */
    public LinearLayout f85655a;

    /* JADX INFO: renamed from: b */
    public TextView f85656b;

    /* JADX INFO: renamed from: c */
    public TextView f85657c;

    /* JADX INFO: renamed from: d */
    public final Act f85658d;

    public d8n(Act act) {
        this.f85658d = act;
    }

    /* JADX INFO: renamed from: a */
    public View m114914a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return e8n.m119831b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: b */
    public View m114915b() {
        View viewM114914a = m114914a(this.f85658d.inflater(), null);
        m114916c();
        return viewM114914a;
    }

    /* JADX INFO: renamed from: c */
    public void m114916c() {
        TextView textView = this.f85657c;
        Act act = this.f85658d;
        textView.setText(z7a.m218874q0(act, act.getString(IntlCountryCodeController.m29114k() ? R$string.f28287f2 : R$string.f28193X1, this.f85658d.string(R$string.f28311h2), this.f85658d.string(R$string.f28176V6)), this.f85658d.string(R$string.f28311h2), zwk.m221910j(), this.f85658d.string(R$string.f28176V6), zwk.m221909i()));
        this.f85657c.setMovementMethod(LinkMovementMethod.getInstance());
    }
}
