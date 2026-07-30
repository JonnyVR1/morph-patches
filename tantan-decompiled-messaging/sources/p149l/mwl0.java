package p149l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import java.util.List;

/* JADX INFO: loaded from: classes11.dex */
public class mwl0 {

    /* JADX INFO: renamed from: a */
    public final LinearLayout f136063a;

    /* JADX INFO: renamed from: b */
    public final LinearLayout f136064b;

    /* JADX INFO: renamed from: c */
    public DialogInterface.OnDismissListener f136065c;

    public mwl0(Act act) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(act).inflate(t6c0.f168138Oa, (ViewGroup) null, false);
        this.f136064b = linearLayout;
        this.f136063a = (LinearLayout) linearLayout.findViewById(g5c0.f100785Q2);
        linearLayout.findViewById(g5c0.f100923f0).setOnClickListener(new View.OnClickListener() { // from class: l.jwl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120098a.m156745f(view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public View m156744e() {
        return this.f136064b;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m156745f(View view) {
        DialogInterface.OnDismissListener onDismissListener = this.f136065c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m156746g(final e30 e30Var, gzo0 gzo0Var) {
        TextView textView = new TextView(this.f136064b.getContext());
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, t100.f167230E));
        textView.setEnabled(true);
        textView.setTextColor(kvc0.m147352a(h1c0.f105395p1));
        textView.setTextSize(2, 15.0f);
        textView.setText(gzo0Var.getText());
        textView.setGravity(17);
        final String str = gzo0Var.getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String();
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.lwl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(str);
            }
        });
        this.f136063a.addView(textView);
    }

    /* JADX INFO: renamed from: h */
    public <D extends nnn0> void m156747h(List<gzo0> list, v4m0<D> v4m0Var, String str, final e30<String> e30Var) {
        this.f136063a.removeAllViews();
        vwb.m200354z(list, new e30() { // from class: l.iwl0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f115283a.m156746g(e30Var, (gzo0) obj);
            }
        });
        m156749j(v4m0Var, str, list);
    }

    /* JADX INFO: renamed from: i */
    public void m156748i(DialogInterface.OnDismissListener onDismissListener) {
        this.f136065c = onDismissListener;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [l.ho2] */
    /* JADX WARN: Type inference failed for: r1v1, types: [l.ho2, l.lh20] */
    /* JADX INFO: renamed from: j */
    public void m156749j(wjm0 wjm0Var, String str, List<gzo0> list) {
        if (wjm0Var == null || ((gzo0) vwb.m200346r(list, new w9j() { // from class: l.kwl0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((gzo0) obj).getCom.clevertap.android.sdk.Constants.KEY_KEY java.lang.String(), SummarizedPrivilegesId.sayHello));
            }
        })) == null) {
            return;
        }
        zvf0.m220368A("e_audio_greeting", "p_audio_profile", j760.m140076a("anchorId", wjm0Var.m206027E2().m132146l0().f56011id), j760.m140076a("liveId", wjm0Var.m206027E2().m149814k()), j760.m140076a("receiver_user_id", str));
    }
}
