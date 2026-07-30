package p002l;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.ExpEditItemView;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0064c;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputDrinking;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputFitness;
import com.p000p1.mobile.putong.core.p001ui.profile.exploop.item.ExpLoopInputSmoking;
import com.p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p1.mobile.putong.data.Physical;
import com.tantanapp.common.utils.NullChecker;
import l.d30;
import l.mcr;
import l.o6j0;
import l.pj90;
import l.vwb;
import l.x2c0;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class r9f extends AbstractC0064c {

    /* JADX INFO: renamed from: u */
    public ExpEditItemView f18423u;

    /* JADX INFO: renamed from: v */
    public ExpEditItemView f18424v;

    /* JADX INFO: renamed from: w */
    public ExpEditItemView f18425w;

    public r9f(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: V */
    public final /* synthetic */ void m21858V() {
        o6j0.c("e_edit_profile_exercise", "p_edit_profile_view", new o6j0.a[0]);
        fif.m13250c(m1609i(), new ExpLoopInputFitness());
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m21859W() {
        o6j0.c("e_edit_profile_drinking", "p_edit_profile_view", new o6j0.a[0]);
        fif.m13250c(m1609i(), new ExpLoopInputDrinking());
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m21860X() {
        o6j0.c("e_edit_profile_smoking", "p_edit_profile_view", new o6j0.a[0]);
        fif.m13250c(m1609i(), new ExpLoopInputSmoking());
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: m */
    public String mo1613m() {
        return "生活习惯";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: n */
    public String mo1614n() {
        return "habit";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: q */
    public void mo1617q(View view) {
        super.mo1617q(view);
        m1622v(this.f18423u, new d30() { // from class: l.o9f
            public final void call() {
                this.f16444a.m21858V();
            }
        }, true);
        m1622v(this.f18424v, new d30() { // from class: l.p9f
            public final void call() {
                this.f17158a.m21859W();
            }
        }, true);
        m1622v(this.f18425w, new d30() { // from class: l.q9f
            public final void call() {
                this.f17877a.m21860X();
            }
        }, true);
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: y */
    public View mo1625y(ViewGroup viewGroup) {
        ExpEditItemView expEditItemView = new ExpEditItemView(viewGroup.getContext());
        this.f18423u = expEditItemView;
        expEditItemView.m1275d("运动锻炼", x2c0.vs);
        ExpEditItemView expEditItemView2 = new ExpEditItemView(viewGroup.getContext());
        this.f18424v = expEditItemView2;
        expEditItemView2.m1275d("喝酒", x2c0.us);
        ExpEditItemView expEditItemView3 = new ExpEditItemView(viewGroup.getContext());
        this.f18425w = expEditItemView3;
        expEditItemView3.m1275d("吸烟", x2c0.ws);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(this.f18423u);
        linearLayout.addView(this.f18423u.getDividerView());
        linearLayout.addView(this.f18424v);
        linearLayout.addView(this.f18424v.getDividerView());
        linearLayout.addView(this.f18425w);
        return linearLayout;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0063  */
    /* JADX WARN: Code duplicated, block: B:21:0x008c  */
    /* JADX WARN: Code duplicated, block: B:28:0x00b5  */
    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: z */
    public void mo1626z() {
        String des;
        String des2;
        String des3;
        String str = "";
        if (NullChecker.a(m1606f().profile) && NullChecker.a(m1606f().profile.extensions) && NullChecker.a(m1606f().profile.extensions.physical)) {
            Physical physical = m1624x().m9268i2().profile.extensions.physical;
            if (vwb.J(physical.drink) || TextUtils.isEmpty((CharSequence) physical.drink.get(0))) {
                des2 = "";
            } else {
                des2 = FriendPurposeHelper.DrinkType.getDes((String) physical.drink.get(0));
                if (pj90.v(des2)) {
                    des2 = "";
                }
            }
            if (vwb.J(physical.fitness) || TextUtils.isEmpty((CharSequence) physical.fitness.get(0))) {
                des3 = "";
            } else {
                des3 = FriendPurposeHelper.FitnessType.getDes((String) physical.fitness.get(0));
                if (pj90.v(des3)) {
                    des3 = "";
                }
            }
            if (vwb.J(physical.smoke) || TextUtils.isEmpty((CharSequence) physical.smoke.get(0))) {
                des = "";
            } else {
                des = FriendPurposeHelper.SmokeType.getDes((String) physical.smoke.get(0));
                if (pj90.v(des)) {
                    des = "";
                }
            }
            str = des3;
        } else {
            des = "";
            des2 = des;
        }
        m1681Q(this.f18423u, str);
        m1681Q(this.f18424v, des2);
        m1681Q(this.f18425w, des);
    }
}
