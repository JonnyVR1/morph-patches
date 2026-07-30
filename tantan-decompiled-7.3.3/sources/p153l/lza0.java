package p153l;

import android.app.Activity;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.StickStatus;
import com.p051p1.mobile.putong.data.Followship;
import com.p051p1.mobile.putong.data.FollowshipStatus;
import com.p051p1.mobile.putong.data.LikeFrom;
import com.p051p1.mobile.putong.data.MatchScData;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p137rx.subjects.C22508b;
import p151v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class lza0 {

    /* JADX INFO: renamed from: k */
    public static C22508b<uxj0> f134167k = C22508b.m222767b();

    /* JADX INFO: renamed from: a */
    public t3m f134168a;

    /* JADX INFO: renamed from: b */
    public TextView f134169b;

    /* JADX INFO: renamed from: c */
    public TextView f134170c;

    /* JADX INFO: renamed from: d */
    public VText f134171d;

    /* JADX INFO: renamed from: e */
    public kcg0 f134172e;

    /* JADX INFO: renamed from: f */
    public boolean f134173f;

    /* JADX INFO: renamed from: g */
    public String f134174g;

    /* JADX INFO: renamed from: h */
    public boolean f134175h = false;

    /* JADX INFO: renamed from: i */
    public boolean f134176i = false;

    /* JADX INFO: renamed from: j */
    public th0 f134177j;

    public lza0(t3m t3mVar) {
        this.f134168a = t3mVar;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m156412e(Throwable th) {
    }

    /* JADX INFO: renamed from: k */
    public static boolean m156413k(User user) {
        if (NullChecker.m82486a(user) && NullChecker.m82486a(user.verifications) && NullChecker.m82486a(user.verifications.anchor)) {
            return user.verifications.anchor.verified;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void m156414f(boolean z, TextView textView, TextView textView2, ner nerVar, String str, String str2, boolean z2, VText vText) {
        this.f134173f = z;
        this.f134169b = textView;
        this.f134170c = textView2;
        this.f134171d = vText;
        this.f134174g = str2;
        this.f134175h = z2;
        psd0.m173633z(this.f134172e);
        this.f134172e = nerVar.duringCreated(uqb0.f180396b0.f170327d.mo61571s9()).subscribe(psd0.m173597H(new y20() { // from class: l.gza0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f107184a.m156419l((pf60) obj);
            }
        }, new y20() { // from class: l.hza0
            @Override // p153l.y20
            public final void call(Object obj) {
                lza0.m156412e((Throwable) obj);
            }
        }));
        if (NullChecker.m82486a(str)) {
            m156422o(CoreModule.m30932N().getUserById(str));
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m156415g() {
        return (this.f134170c == null || this.f134169b == null) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public void m156416h(String str, boolean z) {
        if (this.f134176i && z) {
            return;
        }
        this.f134176i = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(pf60.m172085a("owner_id", str));
        arrayList.add(pf60.m172085a("receiver_user_id", str));
        arrayList.add(pf60.m172085a("subscribe_button_place", StickStatus.top));
        sfj0.m185605l(MatchScData.ModuleId.mid_e_follow, OMSDialogPositon.p_suggest_user_profile_info_view, (pf60[]) arrayList.toArray(new pf60[0]));
    }

    /* JADX INFO: renamed from: i */
    public void m156417i(boolean z, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(pf60.m172085a("owner_id", str));
        arrayList.add(pf60.m172085a("receiver_user_id", str));
        arrayList.add(pf60.m172085a("subscribe_button_place", StickStatus.top));
        sfj0.m185598e(z ? MatchScData.ModuleId.mid_e_follow : "e_cancelfollow", OMSDialogPositon.p_suggest_user_profile_info_view, (pf60[]) arrayList.toArray(new pf60[0]));
    }

    /* JADX INFO: renamed from: j */
    public boolean m156418j(User user) {
        Followship followship = user.localFollowship;
        if (followship == null) {
            return false;
        }
        return TEnum.equals(followship.state, "matched") || TEnum.equals(user.localFollowship.state, FollowshipStatus.following);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m156419l(pf60 pf60Var) {
        F f = pf60Var.f152156a;
        if (f != 0) {
            m156422o((User) f);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m156420m(User user, boolean z, View view) {
        User user2;
        if (NullChecker.m82486a(this.f134169b) && TextUtils.equals(this.f134169b.getText().toString(), "喜欢")) {
            Activity activityM105508E = bnl0.m105508E(this.f134169b);
            if (activityM105508E instanceof Act) {
                user2 = user;
                j1a.m143109z((Act) activityM105508E, user2, true, null, LikeFrom.get("likers"), null, null, null, new boolean[0]);
            } else {
                user2 = user;
            }
            i4g0.m138523u(MatchScData.ModuleId.mid_e_likeButton, "PutongPageIds.P_SUGGEST_USER_PROFILE_INFO_VIEW", jyb.m147494Y("moments_user_id", user2.f56859id));
            return;
        }
        if (z) {
            Activity activityM105508E2 = bnl0.m105508E(this.f134169b);
            m156417i(false, user.f56859id);
            if (activityM105508E2 instanceof Act) {
                m156425r((Act) activityM105508E2, user);
                return;
            }
            return;
        }
        if (user.profile.moments.hidePublicMoments && !User.isMatched(user)) {
            m156417i(true, user.f56859id);
            o1j0.m165649w(R$string.f18746P);
        } else {
            f134167k.m137019l(uxj0.f181467a);
            m156417i(true, user.f56859id);
            uqb0.f180396b0.f170327d.mo61564or(CoreModule.m30929H().userId(), user, true, OMSDialogPositon.p_suggest_user_profile_info_view);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m156421n(View view) {
        this.f134177j.m191137c();
    }

    /* JADX INFO: renamed from: o */
    public void m156422o(final User user) {
        if (!m156415g() || user == null) {
            return;
        }
        Relationship relationship = user.localRelationship;
        if (relationship != null && TEnum.equals(relationship.state, "matched")) {
            bnl0.m105524M(this.f134170c, false);
            bnl0.m105524M(this.f134169b, false);
            return;
        }
        final boolean zM156418j = m156418j(user);
        bnl0.m105525M0(this.f134169b, !this.f134175h);
        bnl0.m105525M0(this.f134170c, true);
        TextView textView = this.f134169b;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView.setTypeface(typeface);
        this.f134170c.setTypeface(typeface);
        this.f134170c.requestLayout();
        this.f134169b.requestLayout();
        if (zM156418j) {
            boolean zEquals = TEnum.equals(user.localFollowship.state, FollowshipStatus.following);
            TextView textView2 = this.f134169b;
            if (zEquals) {
                textView2.setText(R$string.f19482n5);
                this.f134170c.setText(R$string.f19482n5);
                m156423p();
            } else {
                textView2.setText(R$string.f19451m5);
                this.f134170c.setText(R$string.f19451m5);
                m156423p();
            }
        } else {
            m156424q(user);
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.iza0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117682a.m156420m(user, zM156418j, view);
            }
        };
        bnl0.m105509E0(this.f134169b, onClickListener);
        bnl0.m105509E0(this.f134170c, onClickListener);
        if (NullChecker.m82486a(this.f134171d)) {
            bnl0.m105524M(this.f134171d, this.f134175h);
            this.f134171d.setTypeface(typeface);
            if (zM156418j) {
                boolean zEquals2 = TEnum.equals(user.localFollowship.state, FollowshipStatus.following);
                VText vText = this.f134171d;
                if (zEquals2) {
                    vText.setText(R$string.f19482n5);
                } else {
                    vText.setText(R$string.f19451m5);
                }
            }
            bnl0.m105509E0(this.f134171d, onClickListener);
            if (CoreModule.m30932N().mo61445Bd() && !m156413k(user)) {
                bnl0.m105524M(this.f134171d, false);
            }
        }
        if (CoreModule.m30932N().mo61445Bd() && !m156413k(user)) {
            bnl0.m105524M(this.f134169b, false);
            bnl0.m105524M(this.f134170c, false);
        }
        FollowshipStatus followshipStatus = NullChecker.m82486a(user.localFollowship) ? user.localFollowship.state : null;
        if (gra.m131601M3() || !CoreModule.m30932N().mo61573so()) {
            return;
        }
        if (CoreModule.m30932N().mo61580ud(user) || (NullChecker.m82486a(followshipStatus) && TEnum.equals(followshipStatus, FollowshipStatus.following))) {
            bnl0.m105524M(this.f134169b, false);
            bnl0.m105524M(this.f134170c, false);
        } else {
            bnl0.m105524M(this.f134169b, true);
            bnl0.m105524M(this.f134170c, true);
            this.f134169b.setText("喜欢");
            this.f134170c.setText("喜欢");
        }
        bnl0.m105524M(this.f134169b, false);
        bnl0.m105524M(this.f134170c, false);
        if (NullChecker.m82486a(this.f134171d)) {
            bnl0.m105524M(this.f134171d, false);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m156423p() {
        this.f134176i = false;
        this.f134169b.setBackgroundResource(dbc0.f86650V1);
        this.f134169b.setTextColor(637534208);
        this.f134170c.setBackgroundResource(dbc0.f86650V1);
        this.f134170c.setTextColor(637534208);
        if (this.f134175h) {
            this.f134171d.setBackgroundResource(dbc0.f86682W1);
            this.f134171d.setTextColor(637534208);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m156424q(User user) {
        m156416h(user.f56859id, true);
        this.f134169b.setText(CoreModule.f18263b.getResources().getString(R$string.f19513o5));
        this.f134169b.setBackgroundResource(dbc0.f87497v);
        this.f134169b.setTextColor(-1);
        this.f134170c.setText(CoreModule.f18263b.getResources().getString(R$string.f19513o5));
        this.f134170c.setBackgroundResource(dbc0.f87497v);
        this.f134170c.setTextColor(CoreModule.f18263b.getResources().getColor(c9c0.f80407c2));
        if (this.f134175h) {
            this.f134171d.setText(CoreModule.f18263b.getResources().getString(R$string.f19513o5));
            this.f134171d.setBackgroundResource(dbc0.f87497v);
            this.f134171d.setTextColor(-1);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m156425r(Act act, final User user) {
        th0.C20312a c20312a = new th0.C20312a(act);
        c20312a.m191151j(act.getResources().getString(R$string.f18657M0)).m191158q(R$string.f18866T).m191157p(c9c0.f80342I).m191156o(new View.OnClickListener() { // from class: l.jza0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                uqb0.f180396b0.f170327d.mo61564or(CoreModule.m30929H().userId(), user, false, OMSDialogPositon.p_suggest_user_profile_info_view);
            }
        }).m191146e(R$string.f19138c).m191144c(new View.OnClickListener() { // from class: l.kza0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f129396a.m156421n(view);
            }
        });
        th0 th0VarM191142a = c20312a.m191142a();
        this.f134177j = th0VarM191142a;
        th0VarM191142a.m191141g();
    }
}
