package p153l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.ExpEditItemView;
import com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8802c;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputDrinking;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputFitness;
import com.p051p1.mobile.putong.core.p058ui.profile.exploop.item.ExpLoopInputSmoking;
import com.p051p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p051p1.mobile.putong.data.Physical;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class xaf extends AbstractC8802c {

    /* JADX INFO: renamed from: u */
    public ExpEditItemView f193024u;

    /* JADX INFO: renamed from: v */
    public ExpEditItemView f193025v;

    /* JADX INFO: renamed from: w */
    public ExpEditItemView f193026w;

    public xaf(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m209850V() {
        sfj0.m185596c("e_edit_profile_exercise", "p_edit_profile_view", new sfj0.C20032a[0]);
        ljf.m154506c(m52340i(), new ExpLoopInputFitness());
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m209851W() {
        sfj0.m185596c("e_edit_profile_drinking", "p_edit_profile_view", new sfj0.C20032a[0]);
        ljf.m154506c(m52340i(), new ExpLoopInputDrinking());
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m209852X() {
        sfj0.m185596c("e_edit_profile_smoking", "p_edit_profile_view", new sfj0.C20032a[0]);
        ljf.m154506c(m52340i(), new ExpLoopInputSmoking());
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: m */
    public String mo52344m() {
        return "生活习惯";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: n */
    public String mo52345n() {
        return "habit";
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: q */
    public void mo52348q(View view) {
        super.mo52348q(view);
        m52353v(this.f193024u, new x20() { // from class: l.uaf
            @Override // p153l.x20
            public final void call() {
                this.f178204a.m209850V();
            }
        }, true);
        m52353v(this.f193025v, new x20() { // from class: l.vaf
            @Override // p153l.x20
            public final void call() {
                this.f183087a.m209851W();
            }
        }, true);
        m52353v(this.f193026w, new x20() { // from class: l.waf
            @Override // p153l.x20
            public final void call() {
                this.f188118a.m209852X();
            }
        }, true);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: y */
    public View mo52356y(ViewGroup viewGroup) {
        ExpEditItemView expEditItemView = new ExpEditItemView(viewGroup.getContext());
        this.f193024u = expEditItemView;
        expEditItemView.m52012d("运动锻炼", dbc0.f87165kt);
        ExpEditItemView expEditItemView2 = new ExpEditItemView(viewGroup.getContext());
        this.f193025v = expEditItemView2;
        expEditItemView2.m52012d("喝酒", dbc0.f87132jt);
        ExpEditItemView expEditItemView3 = new ExpEditItemView(viewGroup.getContext());
        this.f193026w = expEditItemView3;
        expEditItemView3.m52012d("吸烟", dbc0.f87198lt);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(this.f193024u);
        linearLayout.addView(this.f193024u.getDividerView());
        linearLayout.addView(this.f193025v);
        linearLayout.addView(this.f193025v.getDividerView());
        linearLayout.addView(this.f193026w);
        return linearLayout;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x008c  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
    @Override // com.p051p1.mobile.putong.core.p058ui.profile.exp.item.AbstractC8800a
    /* JADX INFO: renamed from: z */
    public void mo52357z() {
        String des;
        String des2;
        String des3;
        String str = "";
        if (NullChecker.m82486a(m52337f().profile) && NullChecker.m82486a(m52337f().profile.extensions) && NullChecker.m82486a(m52337f().profile.extensions.physical)) {
            Physical physical = m52355x().m189086i2().profile.extensions.physical;
            if (jyb.m147479J(physical.drink) || TextUtils.isEmpty(physical.drink.get(0))) {
                des2 = "";
            } else {
                des2 = FriendPurposeHelper.DrinkType.getDes(physical.drink.get(0));
                if (tr90.m192433v(des2)) {
                    des2 = "";
                }
            }
            if (jyb.m147479J(physical.fitness) || TextUtils.isEmpty(physical.fitness.get(0))) {
                des3 = "";
            } else {
                des3 = FriendPurposeHelper.FitnessType.getDes(physical.fitness.get(0));
                if (tr90.m192433v(des3)) {
                    des3 = "";
                }
            }
            if (jyb.m147479J(physical.smoke) || TextUtils.isEmpty(physical.smoke.get(0))) {
                des = "";
            } else {
                des = FriendPurposeHelper.SmokeType.getDes(physical.smoke.get(0));
                if (tr90.m192433v(des)) {
                    des = "";
                }
            }
            str = des3;
        } else {
            des = "";
            des2 = des;
        }
        m52409Q(this.f193024u, str);
        m52409Q(this.f193025v, des2);
        m52409Q(this.f193026w, des);
    }
}
