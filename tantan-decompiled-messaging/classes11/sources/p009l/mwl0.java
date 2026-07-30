package p009l;

import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.p1.mobile.android.app.Act;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.e30;
import l.g5c0;
import l.h1c0;
import l.j760;
import l.kvc0;
import l.nnn0;
import l.t100;
import l.t6c0;
import l.vwb;
import l.w9j;
import l.zvf0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class mwl0 {

    /* JADX INFO: renamed from: a */
    public final LinearLayout f17127a;

    /* JADX INFO: renamed from: b */
    public final LinearLayout f17128b;

    /* JADX INFO: renamed from: c */
    public DialogInterface.OnDismissListener f17129c;

    public mwl0(Act act) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(act).inflate(t6c0.Oa, (ViewGroup) null, false);
        this.f17128b = linearLayout;
        this.f17127a = (LinearLayout) linearLayout.findViewById(g5c0.Q2);
        linearLayout.findViewById(g5c0.f0).setOnClickListener(new View.OnClickListener() { // from class: l.jwl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15349a.m18658f(view);
            }
        });
    }

    /* JADX INFO: renamed from: e */
    public View m18657e() {
        return this.f17128b;
    }

    /* JADX INFO: renamed from: f */
    public final /* synthetic */ void m18658f(View view) {
        DialogInterface.OnDismissListener onDismissListener = this.f17129c;
        if (onDismissListener != null) {
            onDismissListener.onDismiss(null);
        }
    }

    /* JADX INFO: renamed from: g */
    public final /* synthetic */ void m18659g(final e30 e30Var, gzo0 gzo0Var) {
        TextView textView = new TextView(this.f17128b.getContext());
        textView.setLayoutParams(new LinearLayout.LayoutParams(-1, t100.E));
        textView.setEnabled(true);
        textView.setTextColor(kvc0.a(h1c0.p1));
        textView.setTextSize(2, 15.0f);
        textView.setText(gzo0Var.getText());
        textView.setGravity(17);
        final String key = gzo0Var.getKey();
        textView.setOnClickListener(new View.OnClickListener() { // from class: l.lwl0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                e30Var.call(key);
            }
        });
        this.f17127a.addView(textView);
    }

    /* JADX INFO: renamed from: h */
    public <D extends nnn0> void m18660h(List<gzo0> list, v4m0<D> v4m0Var, String str, final e30<String> e30Var) {
        this.f17127a.removeAllViews();
        vwb.z(list, new e30() { // from class: l.iwl0
            public final void call(Object obj) {
                this.f14843a.m18659g(e30Var, (gzo0) obj);
            }
        });
        m18662j(v4m0Var, str, list);
    }

    /* JADX INFO: renamed from: i */
    public void m18661i(DialogInterface.OnDismissListener onDismissListener) {
        this.f17129c = onDismissListener;
    }

    /* JADX INFO: renamed from: j */
    public void m18662j(wjm0 wjm0Var, String str, List<gzo0> list) {
        if (wjm0Var == null || ((gzo0) vwb.r(list, new w9j() { // from class: l.kwl0
            public final Object call(Object obj) {
                return Boolean.valueOf(TextUtils.equals(((gzo0) obj).getKey(), "sayHello"));
            }
        })) == null) {
            return;
        }
        zvf0.A("e_audio_greeting", "p_audio_profile", new j760[]{j760.a("anchorId", ((DbObject) wjm0Var.E2().l0()).id), j760.a("liveId", wjm0Var.E2().k()), j760.a("receiver_user_id", str)});
    }
}
