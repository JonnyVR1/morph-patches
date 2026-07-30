package p149l;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopFragmentFactory;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.profilelist.view.ProfileIntegrityOptView;
import com.p046p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p046p1.mobile.putong.data.Physical;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VImage;
import p147v.VLinear_Dividers;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class nne extends ah90 {

    /* JADX INFO: renamed from: A */
    public VText f139709A;

    /* JADX INFO: renamed from: B */
    public LinearLayout f139710B;

    /* JADX INFO: renamed from: C */
    public VText f139711C;

    /* JADX INFO: renamed from: D */
    public VText f139712D;

    /* JADX INFO: renamed from: E */
    public LinearLayout f139713E;

    /* JADX INFO: renamed from: F */
    public VText f139714F;

    /* JADX INFO: renamed from: G */
    public VText f139715G;

    /* JADX INFO: renamed from: H */
    public LinearLayout f139716H;

    /* JADX INFO: renamed from: I */
    public VText f139717I;

    /* JADX INFO: renamed from: J */
    public VText f139718J;

    /* JADX INFO: renamed from: K */
    public LinearLayout f139719K;

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f139720u;

    /* JADX INFO: renamed from: v */
    public VText f139721v;

    /* JADX INFO: renamed from: w */
    public ProfileIntegrityOptView f139722w;

    /* JADX INFO: renamed from: x */
    public VImage f139723x;

    /* JADX INFO: renamed from: y */
    public VText f139724y;

    /* JADX INFO: renamed from: z */
    public VText f139725z;

    public nne(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m160202V(View view) {
        o6j0.m162859c("e_edit_profile_exercise", "p_edit_profile_view", new o6j0.C18854a[0]);
        LoopFragmentFactory.m51475S(mo52800O().m94569i2(), mo52800O().mo51066J1(), LoopInputType.FITNESS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m160203W(View view) {
        o6j0.m162859c("e_edit_profile_drinking", "p_edit_profile_view", new o6j0.C18854a[0]);
        LoopFragmentFactory.m51475S(mo52800O().m94569i2(), mo52800O().mo51066J1(), LoopInputType.DRINKING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m160204X(View view) {
        o6j0.m162859c("e_edit_profile_smoking", "p_edit_profile_view", new o6j0.C18854a[0]);
        LoopFragmentFactory.m51475S(mo52800O().m94569i2(), mo52800O().mo51066J1(), LoopInputType.SMOKING);
    }

    /* JADX INFO: renamed from: U */
    public View m160205U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return one.m165169b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: j */
    public void mo52728j(View view) {
        super.mo52728j(view);
        VText vText = this.f139721v;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f139711C.setTypeface(typeface);
        this.f139714F.setTypeface(typeface);
        this.f139717I.setTypeface(typeface);
        xdl0.m208329E0(this.f139710B, new View.OnClickListener() { // from class: l.kne
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f123882a.m160202V(view2);
            }
        });
        xdl0.m208329E0(this.f139713E, new View.OnClickListener() { // from class: l.lne
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f128984a.m160203W(view2);
            }
        });
        xdl0.m208329E0(this.f139716H, new View.OnClickListener() { // from class: l.mne
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f134751a.m160204X(view2);
            }
        });
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        return true;
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m160205U(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        Drawable drawable = mo52800O().act().getResources().getDrawable(x2c0.f189367Gl);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        Drawable drawable2 = mo52800O().act().getResources().getDrawable(x2c0.f189303El);
        drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
        this.f139712D.setText("");
        this.f139715G.setText("");
        this.f139718J.setText("");
        if (mo52800O().m94569i2() == null) {
            return;
        }
        if (NullChecker.m81303a(mo52800O().m94569i2().profile) && NullChecker.m81303a(mo52800O().m94569i2().profile.extensions) && NullChecker.m81303a(mo52800O().m94569i2().profile.extensions.physical)) {
            Physical physical = mo52800O().m94569i2().profile.extensions.physical;
            if (!vwb.m200296J(physical.drink) && !TextUtils.isEmpty(physical.drink.get(0)) && !TextUtils.equals(FriendPurposeHelper.DrinkType.getDes(physical.drink.get(0)), "暂不透露")) {
                this.f139715G.setText(FriendPurposeHelper.DrinkType.getDes(physical.drink.get(0)));
            }
            if (!vwb.m200296J(physical.fitness) && !TextUtils.isEmpty(physical.fitness.get(0)) && !TextUtils.equals(FriendPurposeHelper.FitnessType.getDes(physical.fitness.get(0)), "暂不透露")) {
                this.f139712D.setText(FriendPurposeHelper.FitnessType.getDes(physical.fitness.get(0)));
            }
            if (!vwb.m200296J(physical.smoke) && !TextUtils.isEmpty(physical.smoke.get(0)) && !TextUtils.equals(FriendPurposeHelper.SmokeType.getDes(physical.smoke.get(0)), "暂不透露")) {
                this.f139718J.setText(FriendPurposeHelper.SmokeType.getDes(physical.smoke.get(0)));
            }
        }
        mra0.m156023b(this.f139712D, drawable2, drawable);
        mra0.m156023b(this.f139715G, drawable2, drawable);
        mra0.m156023b(this.f139718J, drawable2, drawable);
        int i = lqa.m150981s().weight.livingHabit;
        float fM204640I = wn90.m204602F().m204640I(mo52800O().m94569i2(), i);
        VText vText = this.f139721v;
        if (fM204640I >= i) {
            i = 0;
        }
        m96419P(vText, "生活习惯", i);
        if (!upa.m194665L3()) {
            xdl0.m208344M(this.f139722w, false);
            return;
        }
        User userM94569i2 = mo52800O().m94569i2();
        int i2 = lqa.m150981s().weight.livingHabit;
        if (i2 <= 0) {
            xdl0.m208344M(this.f139722w, false);
            return;
        }
        this.f139722w.m52883P((int) wn90.m204602F().m204640I(userM94569i2, i2), i2, "完善我的生活习惯");
        xdl0.m208344M(this.f139722w, true);
    }
}
