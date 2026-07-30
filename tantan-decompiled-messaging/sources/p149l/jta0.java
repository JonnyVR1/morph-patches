package p149l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.p053ui.vip.likers.LikersAct;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p147v.VButton;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class jta0 extends ah90 {

    /* JADX INFO: renamed from: u */
    public LinearLayout f119581u;

    /* JADX INFO: renamed from: v */
    public VText f119582v;

    /* JADX INFO: renamed from: w */
    public VButton f119583w;

    /* JADX INFO: renamed from: x */
    public VText f119584x;

    public jta0(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m143098T(View view) {
        o6j0.m162859c("e_see_who_liked_me_banner", OMSDialogPositon.p_suggest_user_profile_info_view, new o6j0.C18854a[0]);
        if (CoreModule.f17545c.m31484o3() == null) {
            lsi0.m151584n(R$string.f18813p4);
        } else if (CoreModule.f17545c.m31484o3().likersLimit.remaining > 0) {
            mo52800O().act().startActivity(LikersAct.m56544X1(mo52800O().act(), ""));
        } else {
            CoreModule.m29935P().m94651a().mo33622wr(mo52800O().act(), "p_suggest_user_profile_info_view,e_see_who_liked_me_banner,click", Privilege.see_who_likes_me);
        }
    }

    @Override // p149l.ah90
    /* JADX INFO: renamed from: O */
    public a1m mo52800O() {
        return (a1m) this.f108534c;
    }

    /* JADX INFO: renamed from: S */
    public View m143099S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return kta0.m147207b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: l */
    public boolean mo52729l() {
        User userMo51069K2 = mo52800O().mo51069K2();
        return mo52800O().mo51075P1() && !mo52800O().mo51119m0() && NullChecker.m81303a(userMo51069K2.profile.receivedLikes) && !nkp.m159984c() && (vdj.m197999a() || userMo51069K2.profile.receivedLikes.longValue() >= 1);
    }

    @Override // p149l.hn2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo52730s(ViewGroup viewGroup) {
        return m143099S(mo52800O().mo94568H2(), viewGroup);
    }

    @Override // p149l.hn2
    /* JADX INFO: renamed from: t */
    public void mo52731t() {
        User userMo51069K2 = mo52800O().mo51069K2();
        long jLongValue = userMo51069K2.profile.receivedLikes.longValue();
        String str = jLongValue + "";
        if (CoreModule.f17545c.f19561E0.m203802y3(userMo51069K2) && jLongValue > 99) {
            str = "99+";
        }
        this.f119582v.setText(i0g0.m133847N(mo52800O().act().getString(R$string.f18399bl, str), mo52800O().act().color(w0c0.f183796P1), eqh0.m117752c(3)));
        this.f119583w.setText(R$string.f18675kl);
        this.f119583w.setOnClickListener(new View.OnClickListener() { // from class: l.ita0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f114868a.m143098T(view);
            }
        });
    }
}
