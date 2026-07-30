package p002l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.ExpEditItemView;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0064c;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputCar;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputHouse;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputIncome;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserWealth;
import java.util.List;
import l.d30;
import l.mcr;
import l.o6j0;
import l.pj90;
import l.vwb;
import l.x2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class vdf extends AbstractC0064c {

    /* JADX INFO: renamed from: u */
    public ExpEditItemView f21089u;

    /* JADX INFO: renamed from: v */
    public ExpEditItemView f21090v;

    /* JADX INFO: renamed from: w */
    public ExpEditItemView f21091w;

    public vdf(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m23885V() {
        o6j0.c("e_edit_profile_income", "p_edit_profile_view", new o6j0.a[0]);
        fif.m13250c(m1609i(), new ExpLoopInputIncome());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m23886W() {
        o6j0.c("e_edit_profile_car", "p_edit_profile_view", new o6j0.a[0]);
        fif.m13250c(m1609i(), new ExpLoopInputCar());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m23887X() {
        o6j0.c("e_edit_profile_house", "p_edit_profile_view", new o6j0.a[0]);
        fif.m13250c(m1609i(), new ExpLoopInputHouse());
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: m */
    public String mo1613m() {
        return "我的资产";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: n */
    public String mo1614n() {
        return "asset";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: q */
    public void mo1617q(View view) {
        super.mo1617q(view);
        m1622v(this.f21089u, new d30() { // from class: l.sdf
            public final void call() {
                this.f18934a.m23885V();
            }
        }, true);
        m1622v(this.f21091w, new d30() { // from class: l.tdf
            public final void call() {
                this.f20190a.m23886W();
            }
        }, true);
        m1622v(this.f21090v, new d30() { // from class: l.udf
            public final void call() {
                this.f20595a.m23887X();
            }
        }, true);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: y */
    public View mo1625y(ViewGroup viewGroup) {
        ExpEditItemView expEditItemView = new ExpEditItemView(viewGroup.getContext());
        this.f21089u = expEditItemView;
        expEditItemView.m1275d("年收入", x2c0.Js);
        ExpEditItemView expEditItemView2 = new ExpEditItemView(viewGroup.getContext());
        this.f21091w = expEditItemView2;
        expEditItemView2.m1275d("车产", x2c0.Hs);
        ExpEditItemView expEditItemView3 = new ExpEditItemView(viewGroup.getContext());
        this.f21090v = expEditItemView3;
        expEditItemView3.m1275d("房产", x2c0.Is);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(this.f21089u);
        linearLayout.addView(this.f21089u.getDividerView());
        linearLayout.addView(this.f21091w);
        linearLayout.addView(this.f21091w.getDividerView());
        linearLayout.addView(this.f21090v);
        return linearLayout;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: z */
    public void mo1626z() {
        String strM14232M;
        String strM14261n;
        String str;
        User userM1606f = m1606f();
        UserWealth userWealth = userM1606f.profile.extensions.wealth;
        List list = userWealth.upperIncome;
        List list2 = userWealth.lowIncome;
        String str2 = "";
        if (vwb.J(list2) && vwb.J(list)) {
            strM14232M = "";
        } else {
            strM14232M = h7j.m14232M(list, list2);
            if (pj90.v(strM14232M)) {
                strM14232M = "";
            }
        }
        List list3 = userM1606f.profile.extensions.wealth.car;
        if (vwb.J(list3)) {
            strM14261n = "";
        } else {
            strM14261n = h7j.m14261n((String) list3.get(0));
            if (pj90.v(strM14261n)) {
                strM14261n = "";
            }
        }
        UserWealth userWealth2 = userM1606f.profile.extensions.wealth;
        List list4 = userWealth2.house;
        List list5 = userWealth2.houseRegion;
        List list6 = userWealth2.houseSubRegion;
        if (!vwb.J(list4)) {
            if (vwb.J(list6) || TextUtils.isEmpty((CharSequence) list6.get(0))) {
                str = (vwb.J(list5) || TextUtils.isEmpty((CharSequence) list5.get(0))) ? "" : (String) list5.get(0);
            } else {
                str = (String) list6.get(0);
            }
            String strM14230K = h7j.m14230K((String) list4.get(0), str);
            if (!pj90.v(strM14230K)) {
                str2 = strM14230K;
            }
        }
        m1681Q(this.f21089u, strM14232M);
        m1681Q(this.f21091w, strM14261n);
        m1681Q(this.f21090v, str2);
    }
}
