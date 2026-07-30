package p149l;

import android.content.DialogInterface;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.newui.fake.C7846b;
import com.p046p1.mobile.putong.core.p053ui.growth.fakenew.ProfileExampleItemView;
import com.p046p1.mobile.putong.data.Gender;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import p133rx.C22306c;
import p147v.VButton;
import p147v.VLinear;

/* JADX INFO: loaded from: classes10.dex */
public class gk90 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m126607a(cwf0 cwf0Var, c4g0 c4g0Var, d30 d30Var, DialogInterface dialogInterface) {
        i0e.m133796e(cwf0Var);
        mkd0.m154992z(c4g0Var);
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m126608b(Runnable runnable, dd80 dd80Var, View view) {
        zvf0.m220396r("e_fake_alert_example_popup_replace_button", "p_fake_alert_example_popup");
        if (NullChecker.m81303a(runnable)) {
            runnable.run();
        }
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m126609c(dd80 dd80Var, roj0 roj0Var) {
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m126610d(dd80 dd80Var, View view) {
        zvf0.m220396r("e_fake_alert_example_popup_close_button", "p_fake_alert_example_popup");
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m126611e(Act act, Gender gender, final Runnable runnable, final d30 d30Var) {
        final cwf0 cwf0Var = new cwf0("p_fake_alert_example_popup", Dialog.class.getName());
        View viewInflate = act.getLayoutInflater().inflate(f6c0.f95308C9, (ViewGroup) null);
        VLinear vLinear = (VLinear) viewInflate.findViewById(u4c0.f174176b7);
        ProfileExampleItemView profileExampleItemView = (ProfileExampleItemView) act.getLayoutInflater().inflate(f6c0.f95324D9, (ViewGroup) null);
        profileExampleItemView.f29538d.setImageResource(TEnum.equals(gender, "male") ? x2c0.f189398Hl : x2c0.f189584Nl);
        profileExampleItemView.f29541g.setImageResource(TEnum.equals(gender, "male") ? x2c0.f189429Il : x2c0.f189615Ol);
        profileExampleItemView.f29542h.setImageResource(TEnum.equals(gender, "male") ? x2c0.f189460Jl : x2c0.f189646Pl);
        profileExampleItemView.f29539e.setText(TEnum.equals(gender, "male") ? "许凯 25" : "安琪 25");
        profileExampleItemView.f29540f.setText(Html.fromHtml((TEnum.equals(gender, "male") ? act.getString(R$string.f19053x4) : act.getString(R$string.f19023w4)).replace("%s", "<font color='#ff6244'>1663</font>")));
        vLinear.addView(profileExampleItemView);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) profileExampleItemView.getLayoutParams();
        int i = t100.f167257f;
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        profileExampleItemView.setLayoutParams(layoutParams);
        ProfileExampleItemView profileExampleItemView2 = (ProfileExampleItemView) act.getLayoutInflater().inflate(f6c0.f95324D9, (ViewGroup) null);
        profileExampleItemView2.f29538d.setImageResource(TEnum.equals(gender, "male") ? x2c0.f189491Kl : x2c0.f189677Ql);
        profileExampleItemView2.f29541g.setImageResource(TEnum.equals(gender, "male") ? x2c0.f189522Ll : x2c0.f189708Rl);
        profileExampleItemView2.f29542h.setImageResource(TEnum.equals(gender, "male") ? x2c0.f189553Ml : x2c0.f189739Sl);
        profileExampleItemView2.f29539e.setText(TEnum.equals(gender, "male") ? "高晨 22" : "戴晨馨 22");
        profileExampleItemView2.f29540f.setText(Html.fromHtml((TEnum.equals(gender, "male") ? act.getString(R$string.f19053x4) : act.getString(R$string.f19023w4)).replace("%s", "<font color='#ff6244'>1829</font>")));
        vLinear.addView(profileExampleItemView2);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) profileExampleItemView2.getLayoutParams();
        layoutParams2.topMargin = i;
        layoutParams2.bottomMargin = i;
        profileExampleItemView2.setLayoutParams(layoutParams2);
        final dd80 dd80VarM110960O = new dd80.C16336a(act).m110963R(viewInflate).m110961P(true).m110958M(true).m110960O();
        viewInflate.findViewById(u4c0.f173718A1).setOnClickListener(new View.OnClickListener() { // from class: l.ck90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gk90.m126610d(dd80VarM110960O, view);
            }
        });
        ((VButton) viewInflate.findViewById(u4c0.f174120Y0)).setOnClickListener(new View.OnClickListener() { // from class: l.dk90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gk90.m126608b(runnable, dd80VarM110960O, view);
            }
        });
        final c4g0 c4g0VarSubscribe = act.duringCreated((C22306c) C7846b.m36420r().m36434q(), false).subscribe(mkd0.m154955G(new e30() { // from class: l.ek90
            @Override // p149l.e30
            public final void call(Object obj) {
                gk90.m126609c(dd80VarM110960O, (roj0) obj);
            }
        }));
        dd80VarM110960O.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.fk90
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                gk90.m126607a(cwf0Var, c4g0VarSubscribe, d30Var, dialogInterface);
            }
        });
        dd80VarM110960O.show();
        i0e.m133797f(cwf0Var);
    }
}
