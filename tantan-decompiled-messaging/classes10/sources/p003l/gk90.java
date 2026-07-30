package p003l;

import android.content.DialogInterface;
import android.text.Html;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.p000p1.mobile.putong.core.p001ui.growth.fakenew.ProfileExampleItemView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.newui.fake.b;
import com.p1.mobile.putong.data.Gender;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import l.c4g0;
import l.cwf0;
import l.d30;
import l.dd80;
import l.e30;
import l.f6c0;
import l.i0e;
import l.mkd0;
import l.roj0;
import l.t100;
import l.u4c0;
import l.x2c0;
import l.zvf0;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes10.dex */
public class gk90 {
    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m6713a(cwf0 cwf0Var, c4g0 c4g0Var, d30 d30Var, DialogInterface dialogInterface) {
        i0e.e(cwf0Var);
        mkd0.z(c4g0Var);
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m6714b(Runnable runnable, dd80 dd80Var, View view) {
        zvf0.r("e_fake_alert_example_popup_replace_button", "p_fake_alert_example_popup");
        if (NullChecker.a(runnable)) {
            runnable.run();
        }
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ void m6715c(dd80 dd80Var, roj0 roj0Var) {
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ void m6716d(dd80 dd80Var, View view) {
        zvf0.r("e_fake_alert_example_popup_close_button", "p_fake_alert_example_popup");
        if (dd80Var.isShowing()) {
            dd80Var.dismiss();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View, com.p1.mobile.putong.core.ui.growth.fakenew.ProfileExampleItemView] */
    /* JADX WARN: Type inference failed for: r4v2, types: [android.view.View, com.p1.mobile.putong.core.ui.growth.fakenew.ProfileExampleItemView] */
    /* JADX INFO: renamed from: e */
    public static void m6717e(Act act, Gender gender, final Runnable runnable, final d30 d30Var) {
        final cwf0 cwf0Var = new cwf0("p_fake_alert_example_popup", Dialog.class.getName());
        View viewInflate = act.getLayoutInflater().inflate(f6c0.C9, (ViewGroup) null);
        VLinear vLinear = (VLinear) viewInflate.findViewById(u4c0.b7);
        ?? r4 = (ProfileExampleItemView) act.getLayoutInflater().inflate(f6c0.D9, (ViewGroup) null);
        r4.f1932d.setImageResource(TEnum.equals(gender, "male") ? x2c0.Hl : x2c0.Nl);
        r4.f1935g.setImageResource(TEnum.equals(gender, "male") ? x2c0.Il : x2c0.Ol);
        r4.f1936h.setImageResource(TEnum.equals(gender, "male") ? x2c0.Jl : x2c0.Pl);
        r4.f1933e.setText(TEnum.equals(gender, "male") ? "许凯 25" : "安琪 25");
        r4.f1934f.setText(Html.fromHtml((TEnum.equals(gender, "male") ? act.getString(R.string.x4) : act.getString(R.string.w4)).replace("%s", "<font color='#ff6244'>1663</font>")));
        vLinear.addView(r4);
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) r4.getLayoutParams();
        int i = t100.f;
        layoutParams.topMargin = i;
        layoutParams.bottomMargin = i;
        r4.setLayoutParams(layoutParams);
        ?? r3 = (ProfileExampleItemView) act.getLayoutInflater().inflate(f6c0.D9, (ViewGroup) null);
        r3.f1932d.setImageResource(TEnum.equals(gender, "male") ? x2c0.Kl : x2c0.Ql);
        r3.f1935g.setImageResource(TEnum.equals(gender, "male") ? x2c0.Ll : x2c0.Rl);
        r3.f1936h.setImageResource(TEnum.equals(gender, "male") ? x2c0.Ml : x2c0.Sl);
        r3.f1933e.setText(TEnum.equals(gender, "male") ? "高晨 22" : "戴晨馨 22");
        r3.f1934f.setText(Html.fromHtml((TEnum.equals(gender, "male") ? act.getString(R.string.x4) : act.getString(R.string.w4)).replace("%s", "<font color='#ff6244'>1829</font>")));
        vLinear.addView(r3);
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) r3.getLayoutParams();
        layoutParams2.topMargin = i;
        layoutParams2.bottomMargin = i;
        r3.setLayoutParams(layoutParams2);
        final dd80 dd80VarO = new dd80.a(act).R(viewInflate).P(true).M(true).O();
        viewInflate.findViewById(u4c0.A1).setOnClickListener(new View.OnClickListener() { // from class: l.ck90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gk90.m6716d(dd80VarO, view);
            }
        });
        viewInflate.findViewById(u4c0.Y0).setOnClickListener(new View.OnClickListener() { // from class: l.dk90
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                gk90.m6714b(runnable, dd80VarO, view);
            }
        });
        final c4g0 c4g0VarSubscribe = act.duringCreated(b.r().q(), false).subscribe(mkd0.G(new e30() { // from class: l.ek90
            public final void call(Object obj) {
                gk90.m6715c(dd80VarO, (roj0) obj);
            }
        }));
        dd80VarO.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: l.fk90
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                gk90.m6713a(cwf0Var, c4g0VarSubscribe, d30Var, dialogInterface);
            }
        });
        dd80VarO.show();
        i0e.f(cwf0Var);
    }
}
