package p153l;

import android.content.DialogInterface;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.newui.fake.C7997b;
import com.p051p1.mobile.putong.core.p058ui.growth.fakenew.ProfileExampleItemView;
import com.p051p1.mobile.putong.data.Gender;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p137rx.C22421c;
import p151v.VButton;
import p151v.VLinear;

/* JADX INFO: loaded from: classes3.dex */
public class ks90 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m151149a(l4g0 l4g0Var, kcg0 kcg0Var, x20 x20Var, DialogInterface dialogInterface) {
        w1e.m204401e(l4g0Var);
        psd0.m173633z(kcg0Var);
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m151150b(Runnable runnable, jl80 jl80Var, View view) {
        i4g0.m138520r("e_fake_alert_example_popup_replace_button", "p_fake_alert_example_popup");
        if (NullChecker.m82486a(runnable)) {
            runnable.run();
        }
        if (jl80Var.isShowing()) {
            jl80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m151151c(jl80 jl80Var, uxj0 uxj0Var) {
        if (jl80Var.isShowing()) {
            jl80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m151152d(jl80 jl80Var, View view) {
        i4g0.m138520r("e_fake_alert_example_popup_close_button", "p_fake_alert_example_popup");
        if (jl80Var.isShowing()) {
            jl80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m151153e(Act act, Gender gender, final Runnable runnable, final x20 x20Var) {
        final l4g0 l4g0Var = new l4g0("p_fake_alert_example_popup", Dialog.class.getName());
        View viewInflate = act.getLayoutInflater().inflate(kec0.f125474J9, (ViewGroup) null);
        VLinear vLinear = (VLinear) viewInflate.findViewById(adc0.f70301d7);
        ProfileExampleItemView profileExampleItemView = (ProfileExampleItemView) act.getLayoutInflater().inflate(kec0.f125490K9, (ViewGroup) null);
        profileExampleItemView.f30386d.setImageResource(TEnum.equals(gender, "male") ? dbc0.f87520vm : dbc0.f86031Bm);
        profileExampleItemView.f30389g.setImageResource(TEnum.equals(gender, "male") ? dbc0.f87552wm : dbc0.f86063Cm);
        profileExampleItemView.f30390h.setImageResource(TEnum.equals(gender, "male") ? dbc0.f87584xm : dbc0.f86095Dm);
        profileExampleItemView.f30387e.setText(TEnum.equals(gender, "male") ? "许凯 25" : "安琪 25");
        profileExampleItemView.f30388f.setText(Html.fromHtml((TEnum.equals(gender, "male") ? act.getString(R$string.f19853z4) : act.getString(R$string.f19822y4)).replace("%s", "<font color='#ff6244'>1663</font>")));
        vLinear.addView(profileExampleItemView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) profileExampleItemView.getLayoutParams();
        int i = qa00.f156319f;
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        profileExampleItemView.setLayoutParams(layoutParams);
        ProfileExampleItemView profileExampleItemView2 = (ProfileExampleItemView) act.getLayoutInflater().inflate(kec0.f125490K9, (ViewGroup) null);
        profileExampleItemView2.f30386d.setImageResource(TEnum.equals(gender, "male") ? dbc0.f87616ym : dbc0.f86127Em);
        profileExampleItemView2.f30389g.setImageResource(TEnum.equals(gender, "male") ? dbc0.f87648zm : dbc0.f86159Fm);
        profileExampleItemView2.f30390h.setImageResource(TEnum.equals(gender, "male") ? dbc0.f85999Am : dbc0.f86191Gm);
        profileExampleItemView2.f30387e.setText(TEnum.equals(gender, "male") ? "高晨 22" : "戴晨馨 22");
        profileExampleItemView2.f30388f.setText(Html.fromHtml((TEnum.equals(gender, "male") ? act.getString(R$string.f19853z4) : act.getString(R$string.f19822y4)).replace("%s", "<font color='#ff6244'>1829</font>")));
        vLinear.addView(profileExampleItemView2);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) profileExampleItemView2.getLayoutParams();
        layoutParams2.topMargin = i;
        layoutParams2.bottomMargin = i;
        profileExampleItemView2.setLayoutParams(layoutParams2);
        final jl80 jl80VarM146020O = new jl80.C17971a(act).m146023R(viewInflate).m146021P(true).m146018M(true).m146020O();
        viewInflate.findViewById(adc0.f69806A1).setOnClickListener(new View.OnClickListener() { // from class: l.gs90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ks90.m151152d(jl80VarM146020O, view);
            }
        });
        ((VButton) viewInflate.findViewById(adc0.f70211Y0)).setOnClickListener(new View.OnClickListener() { // from class: l.hs90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ks90.m151150b(runnable, jl80VarM146020O, view);
            }
        });
        final kcg0 kcg0VarSubscribe = act.duringCreated((C22421c) C7997b.m37423r().m37437q(), false).subscribe(psd0.m173596G(new y20() { // from class: l.is90
            @Override // p153l.y20
            public final void call(Object obj) {
                ks90.m151151c(jl80VarM146020O, (uxj0) obj);
            }
        }));
        jl80VarM146020O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.js90
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                ks90.m151149a(l4g0Var, kcg0VarSubscribe, x20Var, dialogInterface);
            }
        });
        jl80VarM146020O.show();
        w1e.m204402f(l4g0Var);
    }
}
