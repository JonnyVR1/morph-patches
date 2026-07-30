package p153l;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.p058ui.vip.likers.LikersAct;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import p151v.VButton;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class n1b0 extends ep90 {

    /* JADX INFO: renamed from: u */
    public LinearLayout f139735u;

    /* JADX INFO: renamed from: v */
    public VText f139736v;

    /* JADX INFO: renamed from: w */
    public VButton f139737w;

    /* JADX INFO: renamed from: x */
    public VText f139738x;

    public n1b0(@NonNull t3m t3mVar, ner nerVar) {
        super(t3mVar, nerVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: T */
    public /* synthetic */ void m161102T(View view) {
        sfj0.m185596c("e_see_who_liked_me_banner", OMSDialogPositon.p_suggest_user_profile_info_view, new sfj0.C20032a[0]);
        if (CoreModule.f18264c.m32487o3() == null) {
            o1j0.m165640n(R$string.f19605r4);
        } else if (CoreModule.f18264c.m32487o3().likersLimit.remaining > 0) {
            mo53983O().act().startActivity(LikersAct.m57727Y1(mo53983O().act(), ""));
        } else {
            CoreModule.m30933P().m143405a().mo34625wr(mo53983O().act(), "p_suggest_user_profile_info_view,e_see_who_liked_me_banner,click", Privilege.see_who_likes_me);
        }
    }

    @Override // p153l.ep90
    /* JADX INFO: renamed from: O */
    public t3m mo53983O() {
        return (t3m) this.f148056c;
    }

    /* JADX INFO: renamed from: S */
    public View m161103S(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return o1b0.m165590b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: l */
    public boolean mo53912l() {
        User userMo52252K2 = mo53983O().mo52252K2();
        return mo53983O().mo52258P1() && !mo53983O().mo52302m0() && NullChecker.m82486a(userMo52252K2.profile.receivedLikes) && !nmp.m163834c() && (pgj.m172244a() || userMo52252K2.profile.receivedLikes.longValue() >= 1);
    }

    @Override // p153l.on2
    @NonNull
    /* JADX INFO: renamed from: s */
    public View mo53913s(ViewGroup viewGroup) {
        return m161103S(mo53983O().mo146493H2(), viewGroup);
    }

    @Override // p153l.on2
    /* JADX INFO: renamed from: t */
    public void mo53914t() {
        User userMo52252K2 = mo53983O().mo52252K2();
        long jLongValue = userMo52252K2.profile.receivedLikes.longValue();
        String str = jLongValue + "";
        if (CoreModule.f18264c.f20303E0.m141090y3(userMo52252K2) && jLongValue > 99) {
            str = "99+";
        }
        this.f139736v.setText(q8g0.m175782N(mo53983O().act().getString(R$string.f19808xl, str), mo53983O().act().color(c9c0.f80368Q1), lyh0.m156283c(3)));
        this.f139737w.setText(R$string.f18493Gl);
        this.f139737w.setOnClickListener(new View.OnClickListener() { // from class: l.m1b0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f134403a.m161102T(view);
            }
        });
    }
}
