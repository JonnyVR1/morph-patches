package p149l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.ExpEditItemView;
import com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8639c;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputDrinking;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputFitness;
import com.p046p1.mobile.putong.core.p053ui.profile.exploop.item.ExpLoopInputSmoking;
import com.p046p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p046p1.mobile.putong.data.Physical;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class r9f extends AbstractC8639c {

    /* JADX INFO: renamed from: u */
    public ExpEditItemView f158362u;

    /* JADX INFO: renamed from: v */
    public ExpEditItemView f158363v;

    /* JADX INFO: renamed from: w */
    public ExpEditItemView f158364w;

    public r9f(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m178366V() {
        o6j0.m162859c("e_edit_profile_exercise", "p_edit_profile_view", new o6j0.C18854a[0]);
        fif.m121508c(m51157i(), new ExpLoopInputFitness());
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m178367W() {
        o6j0.m162859c("e_edit_profile_drinking", "p_edit_profile_view", new o6j0.C18854a[0]);
        fif.m121508c(m51157i(), new ExpLoopInputDrinking());
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m178368X() {
        o6j0.m162859c("e_edit_profile_smoking", "p_edit_profile_view", new o6j0.C18854a[0]);
        fif.m121508c(m51157i(), new ExpLoopInputSmoking());
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: m */
    public String mo51161m() {
        return "生活习惯";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: n */
    public String mo51162n() {
        return "habit";
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: q */
    public void mo51165q(View view) {
        super.mo51165q(view);
        m51170v(this.f158362u, new d30() { // from class: l.o9f
            @Override // p149l.d30
            public final void call() {
                this.f142714a.m178366V();
            }
        }, true);
        m51170v(this.f158363v, new d30() { // from class: l.p9f
            @Override // p149l.d30
            public final void call() {
                this.f147764a.m178367W();
            }
        }, true);
        m51170v(this.f158364w, new d30() { // from class: l.q9f
            @Override // p149l.d30
            public final void call() {
                this.f153428a.m178368X();
            }
        }, true);
    }

    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: y */
    public View mo51173y(ViewGroup viewGroup) {
        ExpEditItemView expEditItemView = new ExpEditItemView(viewGroup.getContext());
        this.f158362u = expEditItemView;
        expEditItemView.m50829d("运动锻炼", x2c0.f190663vs);
        ExpEditItemView expEditItemView2 = new ExpEditItemView(viewGroup.getContext());
        this.f158363v = expEditItemView2;
        expEditItemView2.m50829d("喝酒", x2c0.f190631us);
        ExpEditItemView expEditItemView3 = new ExpEditItemView(viewGroup.getContext());
        this.f158364w = expEditItemView3;
        expEditItemView3.m50829d("吸烟", x2c0.f190695ws);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(this.f158362u);
        linearLayout.addView(this.f158362u.getDividerView());
        linearLayout.addView(this.f158363v);
        linearLayout.addView(this.f158363v.getDividerView());
        linearLayout.addView(this.f158364w);
        return linearLayout;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x008c  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
    @Override // com.p046p1.mobile.putong.core.p053ui.profile.exp.item.AbstractC8637a
    /* JADX INFO: renamed from: z */
    public void mo51174z() {
        String des;
        String des2;
        String des3;
        String str = "";
        if (NullChecker.m81303a(m51154f().profile) && NullChecker.m81303a(m51154f().profile.extensions) && NullChecker.m81303a(m51154f().profile.extensions.physical)) {
            Physical physical = m51172x().m94569i2().profile.extensions.physical;
            if (vwb.m200296J(physical.drink) || TextUtils.isEmpty(physical.drink.get(0))) {
                des2 = "";
            } else {
                des2 = FriendPurposeHelper.DrinkType.getDes(physical.drink.get(0));
                if (pj90.m169808v(des2)) {
                    des2 = "";
                }
            }
            if (vwb.m200296J(physical.fitness) || TextUtils.isEmpty(physical.fitness.get(0))) {
                des3 = "";
            } else {
                des3 = FriendPurposeHelper.FitnessType.getDes(physical.fitness.get(0));
                if (pj90.m169808v(des3)) {
                    des3 = "";
                }
            }
            if (vwb.m200296J(physical.smoke) || TextUtils.isEmpty(physical.smoke.get(0))) {
                des = "";
            } else {
                des = FriendPurposeHelper.SmokeType.getDes(physical.smoke.get(0));
                if (pj90.m169808v(des)) {
                    des = "";
                }
            }
            str = des3;
        } else {
            des = "";
            des2 = des;
        }
        m51226Q(this.f158362u, str);
        m51226Q(this.f158363v, des2);
        m51226Q(this.f158364w, des);
    }
}
