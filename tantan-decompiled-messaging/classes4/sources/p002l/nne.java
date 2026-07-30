package p002l;

import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopFragmentFactory;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.profilelist.view.ProfileIntegrityOptView;
import com.p1.mobile.putong.core.util.FriendPurposeHelper;
import com.p1.mobile.putong.data.Physical;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.lqa;
import l.mcr;
import l.o6j0;
import l.one;
import l.upa;
import l.vwb;
import l.wn90;
import l.x2c0;
import l.xdl0;
import v.VImage;
import v.VLinear_Dividers;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class nne extends ah90 {

    /* JADX INFO: renamed from: A */
    public VText f16111A;

    /* JADX INFO: renamed from: B */
    public LinearLayout f16112B;

    /* JADX INFO: renamed from: C */
    public VText f16113C;

    /* JADX INFO: renamed from: D */
    public VText f16114D;

    /* JADX INFO: renamed from: E */
    public LinearLayout f16115E;

    /* JADX INFO: renamed from: F */
    public VText f16116F;

    /* JADX INFO: renamed from: G */
    public VText f16117G;

    /* JADX INFO: renamed from: H */
    public LinearLayout f16118H;

    /* JADX INFO: renamed from: I */
    public VText f16119I;

    /* JADX INFO: renamed from: J */
    public VText f16120J;

    /* JADX INFO: renamed from: K */
    public LinearLayout f16121K;

    /* JADX INFO: renamed from: u */
    public VLinear_Dividers f16122u;

    /* JADX INFO: renamed from: v */
    public VText f16123v;

    /* JADX INFO: renamed from: w */
    public ProfileIntegrityOptView f16124w;

    /* JADX INFO: renamed from: x */
    public VImage f16125x;

    /* JADX INFO: renamed from: y */
    public VText f16126y;

    /* JADX INFO: renamed from: z */
    public VText f16127z;

    public nne(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m18871V(View view) {
        o6j0.c("e_edit_profile_exercise", "p_edit_profile_view", new o6j0.a[0]);
        LoopFragmentFactory.m1957S(mo3351O().m9268i2(), mo3351O().mo1514J1(), LoopInputType.FITNESS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: W */
    public /* synthetic */ void m18872W(View view) {
        o6j0.c("e_edit_profile_drinking", "p_edit_profile_view", new o6j0.a[0]);
        LoopFragmentFactory.m1957S(mo3351O().m9268i2(), mo3351O().mo1514J1(), LoopInputType.DRINKING);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: X */
    public /* synthetic */ void m18873X(View view) {
        o6j0.c("e_edit_profile_smoking", "p_edit_profile_view", new o6j0.a[0]);
        LoopFragmentFactory.m1957S(mo3351O().m9268i2(), mo3351O().mo1514J1(), LoopInputType.SMOKING);
    }

    /* JADX INFO: renamed from: U */
    public View m18874U(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return one.b(this, layoutInflater, viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: j */
    public void mo3279j(View view) {
        super.mo3279j(view);
        VText vText = this.f16123v;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        vText.setTypeface(typeface);
        this.f16113C.setTypeface(typeface);
        this.f16116F.setTypeface(typeface);
        this.f16119I.setTypeface(typeface);
        xdl0.E0(this.f16112B, new View.OnClickListener() { // from class: l.kne
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f14430a.m18871V(view2);
            }
        });
        xdl0.E0(this.f16115E, new View.OnClickListener() { // from class: l.lne
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f14961a.m18872W(view2);
            }
        });
        xdl0.E0(this.f16118H, new View.OnClickListener() { // from class: l.mne
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f15492a.m18873X(view2);
            }
        });
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        return true;
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m18874U(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        Drawable drawable = mo3351O().act().getResources().getDrawable(x2c0.Gl);
        drawable.setBounds(0, 0, drawable.getMinimumWidth(), drawable.getMinimumHeight());
        Drawable drawable2 = mo3351O().act().getResources().getDrawable(x2c0.El);
        drawable2.setBounds(0, 0, drawable2.getMinimumWidth(), drawable2.getMinimumHeight());
        this.f16114D.setText("");
        this.f16117G.setText("");
        this.f16120J.setText("");
        if (mo3351O().m9268i2() == null) {
            return;
        }
        if (NullChecker.a(mo3351O().m9268i2().profile) && NullChecker.a(mo3351O().m9268i2().profile.extensions) && NullChecker.a(mo3351O().m9268i2().profile.extensions.physical)) {
            Physical physical = mo3351O().m9268i2().profile.extensions.physical;
            if (!vwb.J(physical.drink) && !TextUtils.isEmpty((CharSequence) physical.drink.get(0)) && !TextUtils.equals(FriendPurposeHelper.DrinkType.getDes((String) physical.drink.get(0)), "暂不透露")) {
                this.f16117G.setText(FriendPurposeHelper.DrinkType.getDes((String) physical.drink.get(0)));
            }
            if (!vwb.J(physical.fitness) && !TextUtils.isEmpty((CharSequence) physical.fitness.get(0)) && !TextUtils.equals(FriendPurposeHelper.FitnessType.getDes((String) physical.fitness.get(0)), "暂不透露")) {
                this.f16114D.setText(FriendPurposeHelper.FitnessType.getDes((String) physical.fitness.get(0)));
            }
            if (!vwb.J(physical.smoke) && !TextUtils.isEmpty((CharSequence) physical.smoke.get(0)) && !TextUtils.equals(FriendPurposeHelper.SmokeType.getDes((String) physical.smoke.get(0)), "暂不透露")) {
                this.f16120J.setText(FriendPurposeHelper.SmokeType.getDes((String) physical.smoke.get(0)));
            }
        }
        mra0.m18143b(this.f16114D, drawable2, drawable);
        mra0.m18143b(this.f16117G, drawable2, drawable);
        mra0.m18143b(this.f16120J, drawable2, drawable);
        int i = lqa.s().weight.livingHabit;
        float fI = wn90.F().I(mo3351O().m9268i2(), i);
        VText vText = this.f16123v;
        if (fI >= i) {
            i = 0;
        }
        m9650P(vText, "生活习惯", i);
        if (!upa.L3()) {
            xdl0.M(this.f16124w, false);
            return;
        }
        User userM9268i2 = mo3351O().m9268i2();
        int i2 = lqa.s().weight.livingHabit;
        if (i2 <= 0) {
            xdl0.M(this.f16124w, false);
            return;
        }
        this.f16124w.m3436P((int) wn90.F().I(userM9268i2, i2), i2, "完善我的生活习惯");
        xdl0.M(this.f16124w, true);
    }
}
