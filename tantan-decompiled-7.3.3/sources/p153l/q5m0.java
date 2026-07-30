package p153l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import java.util.List;

/* JADX INFO: loaded from: classes10.dex */
public class q5m0 {

    /* JADX INFO: renamed from: a */
    public final LinearLayout f155740a;

    /* JADX INFO: renamed from: b */
    public final LinearLayout f155741b;

    /* JADX INFO: renamed from: c */
    public DialogInterface.OnDismissListener f155742c;

    public q5m0(Act act) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(act).inflate(yec0.f198870Oa, (ViewGroup) null, false);
        this.f155741b = linearLayout;
        this.f155740a = (LinearLayout) linearLayout.findViewById(mdc0.f136030Q2);
        linearLayout.findViewById(mdc0.f136168f0).setOnClickListener(new View.OnClickListener() { // from class: l.n5m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f140371a.m175505f(view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public View m175504e() {
        return this.f155741b;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m175505f(View view) {
        DialogInterface.OnDismissListener onDismissListener = this.f155742c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m175506g(final y20 y20Var, k8p0 k8p0Var) {
        TextView textView = new TextView(this.f155741b.getContext());
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, qa00.f156292E));
        textView.setEnabled(true);
        textView.setTextColor(n3d0.m161277a(n9c0.f140856p1));
        textView.setTextSize(2, 15.0f);
        textView.setText(k8p0Var.getText());
        textView.setGravity(17);
        final String str = k8p0Var.getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String();
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.p5m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                y20Var.call(str);
            }
        });
        this.f155740a.addView(textView);
    }

    /* JADX INFO: renamed from: h */
    public <D extends rwn0> void m175507h(List<k8p0> list, zdm0<D> zdm0Var, String str, final y20<String> y20Var) {
        this.f155740a.removeAllViews();
        jyb.m147537z(list, new y20() { // from class: l.m5m0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f134914a.m175506g(y20Var, (k8p0) obj);
            }
        });
        m175509j(zdm0Var, str, list);
    }

    /* JADX INFO: renamed from: i */
    public void m175508i(DialogInterface.OnDismissListener onDismissListener) {
        this.f155742c = onDismissListener;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.oo2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.oo2, l.vp20] */
    /* JADX INFO: renamed from: j */
    public void m175509j(atm0 atm0Var, String str, List<k8p0> list) {
        if (atm0Var == null || ((k8p0) jyb.m147529r(list, new qcj() { // from class: l.o5m0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((k8p0) obj).getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String(), SummarizedPrivilegesId.sayHello));
            }
        })) == null) {
            return;
        }
        i4g0.m138492A("e_audio_greeting", "p_audio_profile", pf60.m172085a("anchorId", atm0Var.m213810E2().m168532l0().f56859id), pf60.m172085a("liveId", atm0Var.m213810E2().m202191k()), pf60.m172085a("receiver_user_id", str));
    }
}
