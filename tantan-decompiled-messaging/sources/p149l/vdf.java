package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpEditItemView;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8639c;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputCar;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputHouse;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputIncome;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserWealth;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class vdf extends AbstractC8639c {

    /* JADX INFO: renamed from: u */
    public ExpEditItemView f181081u;

    /* JADX INFO: renamed from: v */
    public ExpEditItemView f181082v;

    /* JADX INFO: renamed from: w */
    public ExpEditItemView f181083w;

    public vdf(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m197994V() {
        o6j0.m162859c("e_edit_profile_income", "p_edit_profile_view", new o6j0.C18854a[0]);
        fif.m121508c(m51157i(), new ExpLoopInputIncome());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m197995W() {
        o6j0.m162859c("e_edit_profile_car", "p_edit_profile_view", new o6j0.C18854a[0]);
        fif.m121508c(m51157i(), new ExpLoopInputCar());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m197996X() {
        o6j0.m162859c("e_edit_profile_house", "p_edit_profile_view", new o6j0.C18854a[0]);
        fif.m121508c(m51157i(), new ExpLoopInputHouse());
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: m */
    public String mo51161m() {
        return "我的资产";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: n */
    public String mo51162n() {
        return "asset";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: q */
    public void mo51165q(View view) {
        super.mo51165q(view);
        m51170v(this.f181081u, new d30() { // from class: l.sdf
            @Override // p149l.d30
            public final void call() {
                this.f163837a.m197994V();
            }
        }, true);
        m51170v(this.f181083w, new d30() { // from class: l.tdf
            @Override // p149l.d30
            public final void call() {
                this.f169547a.m197995W();
            }
        }, true);
        m51170v(this.f181082v, new d30() { // from class: l.udf
            @Override // p149l.d30
            public final void call() {
                this.f175915a.m197996X();
            }
        }, true);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: y */
    public View mo51173y(ViewGroup viewGroup) {
        ExpEditItemView expEditItemView = new ExpEditItemView(viewGroup.getContext());
        this.f181081u = expEditItemView;
        expEditItemView.m50829d("年收入", x2c0.f189467Js);
        ExpEditItemView expEditItemView2 = new ExpEditItemView(viewGroup.getContext());
        this.f181083w = expEditItemView2;
        expEditItemView2.m50829d("车产", x2c0.f189405Hs);
        ExpEditItemView expEditItemView3 = new ExpEditItemView(viewGroup.getContext());
        this.f181082v = expEditItemView3;
        expEditItemView3.m50829d("房产", x2c0.f189436Is);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(this.f181081u);
        linearLayout.addView(this.f181081u.getDividerView());
        linearLayout.addView(this.f181083w);
        linearLayout.addView(this.f181083w.getDividerView());
        linearLayout.addView(this.f181082v);
        return linearLayout;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: z */
    public void mo51174z() {
        String strM129701M;
        String strM129730n;
        String str;
        User userM51154f = m51154f();
        UserWealth userWealth = userM51154f.profile.extensions.wealth;
        List<String> list = userWealth.upperIncome;
        List<String> list2 = userWealth.lowIncome;
        String str2 = "";
        if (vwb.m200296J(list2) && vwb.m200296J(list)) {
            strM129701M = "";
        } else {
            strM129701M = h7j.m129701M(list, list2);
            if (pj90.m169808v(strM129701M)) {
                strM129701M = "";
            }
        }
        List<String> list3 = userM51154f.profile.extensions.wealth.car;
        if (vwb.m200296J(list3)) {
            strM129730n = "";
        } else {
            strM129730n = h7j.m129730n(list3.get(0));
            if (pj90.m169808v(strM129730n)) {
                strM129730n = "";
            }
        }
        UserWealth userWealth2 = userM51154f.profile.extensions.wealth;
        List<String> list4 = userWealth2.house;
        List<String> list5 = userWealth2.houseRegion;
        List<String> list6 = userWealth2.houseSubRegion;
        if (!vwb.m200296J(list4)) {
            if (vwb.m200296J(list6) || TextUtils.isEmpty(list6.get(0))) {
                str = (vwb.m200296J(list5) || TextUtils.isEmpty(list5.get(0))) ? "" : list5.get(0);
            } else {
                str = list6.get(0);
            }
            String strM129699K = h7j.m129699K(list4.get(0), str);
            if (!pj90.m169808v(strM129699K)) {
                str2 = strM129699K;
            }
        }
        m51226Q(this.f181081u, strM129701M);
        m51226Q(this.f181083w, strM129730n);
        m51226Q(this.f181082v, str2);
    }
}
