package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpEditItemView;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8802c;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputCar;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputHouse;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputIncome;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserWealth;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class bff extends AbstractC8802c {

    /* JADX INFO: renamed from: u */
    public ExpEditItemView f76485u;

    /* JADX INFO: renamed from: v */
    public ExpEditItemView f76486v;

    /* JADX INFO: renamed from: w */
    public ExpEditItemView f76487w;

    public bff(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m103896V() {
        sfj0.m185596c("e_edit_profile_income", "p_edit_profile_view", new sfj0.C20032a[0]);
        ljf.m154506c(m52340i(), new ExpLoopInputIncome());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m103897W() {
        sfj0.m185596c("e_edit_profile_car", "p_edit_profile_view", new sfj0.C20032a[0]);
        ljf.m154506c(m52340i(), new ExpLoopInputCar());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m103898X() {
        sfj0.m185596c("e_edit_profile_house", "p_edit_profile_view", new sfj0.C20032a[0]);
        ljf.m154506c(m52340i(), new ExpLoopInputHouse());
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: m */
    public String mo52344m() {
        return "我的资产";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: n */
    public String mo52345n() {
        return "asset";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: q */
    public void mo52348q(View view) {
        super.mo52348q(view);
        m52353v(this.f76485u, new x20() { // from class: l.yef
            @Override // p153l.x20
            public final void call() {
                this.f199342a.m103896V();
            }
        }, true);
        m52353v(this.f76487w, new x20() { // from class: l.zef
            @Override // p153l.x20
            public final void call() {
                this.f204002a.m103897W();
            }
        }, true);
        m52353v(this.f76486v, new x20() { // from class: l.aff
            @Override // p153l.x20
            public final void call() {
                this.f70905a.m103898X();
            }
        }, true);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: y */
    public View mo52356y(ViewGroup viewGroup) {
        ExpEditItemView expEditItemView = new ExpEditItemView(viewGroup.getContext());
        this.f76485u = expEditItemView;
        expEditItemView.m52012d("年收入", dbc0.f87623yt);
        ExpEditItemView expEditItemView2 = new ExpEditItemView(viewGroup.getContext());
        this.f76487w = expEditItemView2;
        expEditItemView2.m52012d("车产", dbc0.f87559wt);
        ExpEditItemView expEditItemView3 = new ExpEditItemView(viewGroup.getContext());
        this.f76486v = expEditItemView3;
        expEditItemView3.m52012d("房产", dbc0.f87591xt);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(this.f76485u);
        linearLayout.addView(this.f76485u.getDividerView());
        linearLayout.addView(this.f76487w);
        linearLayout.addView(this.f76487w.getDividerView());
        linearLayout.addView(this.f76486v);
        return linearLayout;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0048  */
    /* JADX WARN: Code duplicated, block: B:9:0x0027  */
    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: z */
    public void mo52357z() {
        String strM103172M;
        String strM103201n;
        String str;
        User userM52337f = m52337f();
        UserWealth userWealth = userM52337f.profile.extensions.wealth;
        List<String> list = userWealth.upperIncome;
        List<String> list2 = userWealth.lowIncome;
        String str2 = "";
        if (jyb.m147479J(list2) && jyb.m147479J(list)) {
            strM103172M = "";
        } else {
            strM103172M = baj.m103172M(list, list2);
            if (tr90.m192433v(strM103172M)) {
                strM103172M = "";
            }
        }
        List<String> list3 = userM52337f.profile.extensions.wealth.car;
        if (jyb.m147479J(list3)) {
            strM103201n = "";
        } else {
            strM103201n = baj.m103201n(list3.get(0));
            if (tr90.m192433v(strM103201n)) {
                strM103201n = "";
            }
        }
        UserWealth userWealth2 = userM52337f.profile.extensions.wealth;
        List<String> list4 = userWealth2.house;
        List<String> list5 = userWealth2.houseRegion;
        List<String> list6 = userWealth2.houseSubRegion;
        if (!jyb.m147479J(list4)) {
            if (jyb.m147479J(list6) || TextUtils.isEmpty(list6.get(0))) {
                str = (jyb.m147479J(list5) || TextUtils.isEmpty(list5.get(0))) ? "" : list5.get(0);
            } else {
                str = list6.get(0);
            }
            String strM103170K = baj.m103170K(list4.get(0), str);
            if (!tr90.m192433v(strM103170K)) {
                str2 = strM103170K;
            }
        }
        m52409Q(this.f76485u, strM103172M);
        m52409Q(this.f76487w, strM103201n);
        m52409Q(this.f76486v, str2);
    }
}
