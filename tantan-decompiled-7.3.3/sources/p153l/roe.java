package p153l;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopFragmentFactory;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.profilelist.view.ProfileIntegrityOptView;
import com.p051p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p051p1.mobile.putong.data.Physical;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VImage;
import p151v.VLinear_Dividers;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class roe extends ep90 {

    /* JADX INFO: renamed from: A */
    public VText f164171A;

    /* JADX INFO: renamed from: B */
    public LinearLayout f164172B;

    /* JADX INFO: renamed from: C */
    public VText f164173C;

    /* JADX INFO: renamed from: D */
    public VText f164174D;

    /* JADX INFO: renamed from: E */
    public LinearLayout f164175E;

    /* JADX INFO: renamed from: F */
    public VText f164176F;

    /* JADX INFO: renamed from: G */
    public VText f164177G;

    /* JADX INFO: renamed from: H */
    public LinearLayout f164178H;

    /* JADX INFO: renamed from: I */
    public VText f164179I;

    /* JADX INFO: renamed from: J */
    public VText f164180J;

    /* JADX INFO: renamed from: K */
    public LinearLayout f164181K;

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f164182u;

    /* JADX INFO: renamed from: v */
    public VText f164183v;

    /* JADX INFO: renamed from: w */
    public ProfileIntegrityOptView f164184w;

    /* JADX INFO: renamed from: x */
    public VImage f164185x;

    /* JADX INFO: renamed from: y */
    public VText f164186y;

    /* JADX INFO: renamed from: z */
    public VText f164187z;

    public roe(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m182364V(View view) {
        sfj0.m185596c("e_edit_profile_exercise", "p_edit_profile_view", new sfj0.C20032a[0]);
        LoopFragmentFactory.m52658S(mo53983O().m189086i2(), mo53983O().mo52249J1(), LoopInputType.FITNESS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m182365W(View view) {
        sfj0.m185596c("e_edit_profile_drinking", "p_edit_profile_view", new sfj0.C20032a[0]);
        LoopFragmentFactory.m52658S(mo53983O().m189086i2(), mo53983O().mo52249J1(), LoopInputType.DRINKING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m182366X(View view) {
        sfj0.m185596c("e_edit_profile_smoking", "p_edit_profile_view", new sfj0.C20032a[0]);
        LoopFragmentFactory.m52658S(mo53983O().m189086i2(), mo53983O().mo52249J1(), LoopInputType.SMOKING);
    }

    /* JADX INFO: renamed from: U */
    public View m182367U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return soe.m187190b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: j */
    public void mo53911j(View view) {
        super.mo53911j(view);
        VText vText = this.f164183v;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f164173C.setTypeface(typeface);
        this.f164176F.setTypeface(typeface);
        this.f164179I.setTypeface(typeface);
        bnl0.m105509E0(this.f164172B, new View.OnClickListener() { // from class: l.ooe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f148347a.m182364V(view2);
            }
        });
        bnl0.m105509E0(this.f164175E, new View.OnClickListener() { // from class: l.poe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f153396a.m182365W(view2);
            }
        });
        bnl0.m105509E0(this.f164178H, new View.OnClickListener() { // from class: l.qoe
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f158727a.m182366X(view2);
            }
        });
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        return true;
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m182367U(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        Drawable drawable = mo53983O().act().getResources().getDrawable(dbc0.f87488um);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        Drawable drawable2 = mo53983O().act().getResources().getDrawable(dbc0.f87422sm);
        drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
        this.f164174D.setText("");
        this.f164177G.setText("");
        this.f164180J.setText("");
        if (mo53983O().m189086i2() == null) {
            return;
        }
        if (NullChecker.m82486a(mo53983O().m189086i2().profile) && NullChecker.m82486a(mo53983O().m189086i2().profile.extensions) && NullChecker.m82486a(mo53983O().m189086i2().profile.extensions.physical)) {
            Physical physical = mo53983O().m189086i2().profile.extensions.physical;
            if (!jyb.m147479J(physical.drink) && !TextUtils.isEmpty(physical.drink.get(0)) && !TextUtils.equals(FriendPurposeHelper.DrinkType.getDes(physical.drink.get(0)), "暂不透露")) {
                this.f164177G.setText(FriendPurposeHelper.DrinkType.getDes(physical.drink.get(0)));
            }
            if (!jyb.m147479J(physical.fitness) && !TextUtils.isEmpty(physical.fitness.get(0)) && !TextUtils.equals(FriendPurposeHelper.FitnessType.getDes(physical.fitness.get(0)), "暂不透露")) {
                this.f164174D.setText(FriendPurposeHelper.FitnessType.getDes(physical.fitness.get(0)));
            }
            if (!jyb.m147479J(physical.smoke) && !TextUtils.isEmpty(physical.smoke.get(0)) && !TextUtils.equals(FriendPurposeHelper.SmokeType.getDes(physical.smoke.get(0)), "暂不透露")) {
                this.f164180J.setText(FriendPurposeHelper.SmokeType.getDes(physical.smoke.get(0)));
            }
        }
        qza0.m178766b(this.f164174D, drawable2, drawable);
        qza0.m178766b(this.f164177G, drawable2, drawable);
        qza0.m178766b(this.f164180J, drawable2, drawable);
        int i = xra.m212800s().weight.livingHabit;
        float fM100600I = aw90.m100562F().m100600I(mo53983O().m189086i2(), i);
        VText vText = this.f164183v;
        if (fM100600I >= i) {
            i = 0;
        }
        m121844P(vText, "生活习惯", i);
        if (!gra.m131596L3()) {
            bnl0.m105524M(this.f164184w, false);
            return;
        }
        User userM189086i2 = mo53983O().m189086i2();
        int i2 = xra.m212800s().weight.livingHabit;
        if (i2 <= 0) {
            bnl0.m105524M(this.f164184w, false);
            return;
        }
        this.f164184w.m54066P((int) aw90.m100562F().m100600I(userM189086i2, i2), i2, "完善我的生活习惯");
        bnl0.m105524M(this.f164184w, true);
    }
}
