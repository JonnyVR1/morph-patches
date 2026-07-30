package p002l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.ui.vip.likers.LikersAct;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import l.eqh0;
import l.i0g0;
import l.kta0;
import l.lsi0;
import l.mcr;
import l.nkp;
import l.o6j0;
import l.vdj;
import l.w0c0;
import v.VButton;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class jta0 extends ah90 {

    /* JADX INFO: renamed from: u */
    public LinearLayout f14010u;

    /* JADX INFO: renamed from: v */
    public VText f14011v;

    /* JADX INFO: renamed from: w */
    public VButton f14012w;

    /* JADX INFO: renamed from: x */
    public VText f14013x;

    public jta0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m16221T(View view) {
        o6j0.c("e_see_who_liked_me_banner", "p_suggest_user_profile_info_view", new o6j0.a[0]);
        if (CoreModule.c.o3() == null) {
            lsi0.n(R.string.p4);
        } else if (CoreModule.c.o3().likersLimit.remaining > 0) {
            mo3351O().act().startActivity(LikersAct.X1(mo3351O().act(), ""));
        } else {
            CoreModule.P().a().wr(mo3351O().act(), "p_suggest_user_profile_info_view,e_see_who_liked_me_banner,click", Privilege.see_who_likes_me);
        }
    }

    @Override // p002l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo3351O() {
        return (a1m) this.f12125c;
    }

    /* JADX INFO: renamed from: S */
    public View m16222S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kta0.b(this, layoutInflater, viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo3280l() {
        User userMo1517K2 = mo3351O().mo1517K2();
        return mo3351O().mo1523P1() && !mo3351O().mo1570m0() && NullChecker.a(userMo1517K2.profile.receivedLikes) && !nkp.c() && (vdj.a() || userMo1517K2.profile.receivedLikes.longValue() >= 1);
    }

    @Override // p002l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo3281s(ViewGroup viewGroup) {
        return m16222S(mo3351O().mo9267H2(), viewGroup);
    }

    @Override // p002l.hn2
    /* JADX INFO: renamed from: t */
    public void mo3282t() {
        User userMo1517K2 = mo3351O().mo1517K2();
        long jLongValue = userMo1517K2.profile.receivedLikes.longValue();
        String str = jLongValue + "";
        if (CoreModule.c.E0.y3(userMo1517K2) && jLongValue > 99) {
            str = "99+";
        }
        this.f14011v.setText(i0g0.N(mo3351O().act().getString(R.string.bl, str), mo3351O().act().color(w0c0.P1), eqh0.c(3)));
        this.f14012w.setText(R.string.kl);
        this.f14012w.setOnClickListener(new View.OnClickListener() { // from class: l.ita0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f13407a.m16221T(view);
            }
        });
    }
}
