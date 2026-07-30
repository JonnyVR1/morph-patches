package p149l;

import android.app.Activity;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.StickStatus;
import com.p046p1.mobile.putong.data.Followship;
import com.p046p1.mobile.putong.data.FollowshipStatus;
import com.p046p1.mobile.putong.data.LikeFrom;
import com.p046p1.mobile.putong.data.MatchScData;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import p133rx.subjects.C22393b;
import p147v.VText;

/* JADX INFO: loaded from: classes4.dex */
public class hra0 {

    /* JADX INFO: renamed from: k */
    public static C22393b<roj0> f109191k = C22393b.m221521b();

    /* JADX INFO: renamed from: a */
    public a1m f109192a;

    /* JADX INFO: renamed from: b */
    public TextView f109193b;

    /* JADX INFO: renamed from: c */
    public TextView f109194c;

    /* JADX INFO: renamed from: d */
    public VText f109195d;

    /* JADX INFO: renamed from: e */
    public c4g0 f109196e;

    /* JADX INFO: renamed from: f */
    public boolean f109197f;

    /* JADX INFO: renamed from: g */
    public String f109198g;

    /* JADX INFO: renamed from: h */
    public boolean f109199h = false;

    /* JADX INFO: renamed from: i */
    public boolean f109200i = false;

    /* JADX INFO: renamed from: j */
    public xh0 f109201j;

    public hra0(a1m a1mVar) {
        this.f109192a = a1mVar;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m132656e(Throwable th) {
    }

    /* JADX INFO: renamed from: k */
    public static boolean m132657k(User user) {
        if (NullChecker.m81303a(user) && NullChecker.m81303a(user.verifications) && NullChecker.m81303a(user.verifications.anchor)) {
            return user.verifications.anchor.verified;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void m132658f(boolean z, TextView textView, TextView textView2, mcr mcrVar, String str, String str2, boolean z2, VText vText) {
        this.f109197f = z;
        this.f109193b = textView;
        this.f109194c = textView2;
        this.f109195d = vText;
        this.f109198g = str2;
        this.f109199h = z2;
        mkd0.m154992z(this.f109196e);
        this.f109196e = mcrVar.duringCreated(qib0.f154713b0.f139233d.mo60387s9()).subscribe(mkd0.m154956H(new e30() { // from class: l.cra0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f82194a.m132663l((j760) obj);
            }
        }, new e30() { // from class: l.dra0
            @Override // p149l.e30
            public final void call(Object obj) {
                hra0.m132656e((Throwable) obj);
            }
        }));
        if (NullChecker.m81303a(str)) {
            m132666o(CoreModule.m29934N().getUserById(str));
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m132659g() {
        return (this.f109194c == null || this.f109193b == null) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public void m132660h(String str, boolean z) {
        if (this.f109200i && z) {
            return;
        }
        this.f109200i = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(j760.m140076a("owner_id", str));
        arrayList.add(j760.m140076a("receiver_user_id", str));
        arrayList.add(j760.m140076a("subscribe_button_place", StickStatus.top));
        o6j0.m162868l(MatchScData.ModuleId.mid_e_follow, OMSDialogPositon.p_suggest_user_profile_info_view, (j760[]) arrayList.toArray(new j760[0]));
    }

    /* JADX INFO: renamed from: i */
    public void m132661i(boolean z, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j760.m140076a("owner_id", str));
        arrayList.add(j760.m140076a("receiver_user_id", str));
        arrayList.add(j760.m140076a("subscribe_button_place", StickStatus.top));
        o6j0.m162861e(z ? MatchScData.ModuleId.mid_e_follow : "e_cancelfollow", OMSDialogPositon.p_suggest_user_profile_info_view, (j760[]) arrayList.toArray(new j760[0]));
    }

    /* JADX INFO: renamed from: j */
    public boolean m132662j(User user) {
        Followship followship = user.localFollowship;
        if (followship == null) {
            return false;
        }
        return TEnum.equals(followship.state, "matched") || TEnum.equals(user.localFollowship.state, FollowshipStatus.following);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m132663l(j760 j760Var) {
        F f = j760Var.f116564a;
        if (f != 0) {
            m132666o((User) f);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m132664m(User user, boolean z, View view) {
        User user2;
        if (NullChecker.m81303a(this.f109193b) && TextUtils.equals(this.f109193b.getText().toString(), "喜欢")) {
            Activity activityM208328E = xdl0.m208328E(this.f109193b);
            if (activityM208328E instanceof Act) {
                user2 = user;
                yz9.m216632z((Act) activityM208328E, user2, true, null, LikeFrom.get("likers"), null, null, null, new boolean[0]);
            } else {
                user2 = user;
            }
            zvf0.m220399u(MatchScData.ModuleId.mid_e_likeButton, "PutongPageIds.P_SUGGEST_USER_PROFILE_INFO_VIEW", vwb.m200311Y("moments_user_id", user2.f56011id));
            return;
        }
        if (z) {
            Activity activityM208328E2 = xdl0.m208328E(this.f109193b);
            m132661i(false, user.f56011id);
            if (activityM208328E2 instanceof Act) {
                m132669r((Act) activityM208328E2, user);
                return;
            }
            return;
        }
        if (user.profile.moments.hidePublicMoments && !User.isMatched(user)) {
            m132661i(true, user.f56011id);
            lsi0.m151593w(R$string.f18016P);
        } else {
            f109191k.m132487l(roj0.f160388a);
            m132661i(true, user.f56011id);
            qib0.f154713b0.f139233d.mo60380or(CoreModule.m29931H().userId(), user, true, OMSDialogPositon.p_suggest_user_profile_info_view);
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m132665n(View view) {
        this.f109201j.m208717c();
    }

    /* JADX INFO: renamed from: o */
    public void m132666o(final User user) {
        if (!m132659g() || user == null) {
            return;
        }
        Relationship relationship = user.localRelationship;
        if (relationship != null && TEnum.equals(relationship.state, "matched")) {
            xdl0.m208344M(this.f109194c, false);
            xdl0.m208344M(this.f109193b, false);
            return;
        }
        final boolean zM132662j = m132662j(user);
        xdl0.m208345M0(this.f109193b, !this.f109199h);
        xdl0.m208345M0(this.f109194c, true);
        TextView textView = this.f109193b;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView.setTypeface(typeface);
        this.f109194c.setTypeface(typeface);
        this.f109194c.requestLayout();
        this.f109193b.requestLayout();
        if (zM132662j) {
            boolean zEquals = TEnum.equals(user.localFollowship.state, FollowshipStatus.following);
            TextView textView2 = this.f109193b;
            if (zEquals) {
                textView2.setText(R$string.f18690l5);
                this.f109194c.setText(R$string.f18690l5);
                m132667p();
            } else {
                textView2.setText(R$string.f18659k5);
                this.f109194c.setText(R$string.f18659k5);
                m132667p();
            }
        } else {
            m132668q(user);
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.era0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f92898a.m132664m(user, zM132662j, view);
            }
        };
        xdl0.m208329E0(this.f109193b, onClickListener);
        xdl0.m208329E0(this.f109194c, onClickListener);
        if (NullChecker.m81303a(this.f109195d)) {
            xdl0.m208344M(this.f109195d, this.f109199h);
            this.f109195d.setTypeface(typeface);
            if (zM132662j) {
                boolean zEquals2 = TEnum.equals(user.localFollowship.state, FollowshipStatus.following);
                VText vText = this.f109195d;
                if (zEquals2) {
                    vText.setText(R$string.f18690l5);
                } else {
                    vText.setText(R$string.f18659k5);
                }
            }
            xdl0.m208329E0(this.f109195d, onClickListener);
            if (CoreModule.m29934N().mo60261Bd() && !m132657k(user)) {
                xdl0.m208344M(this.f109195d, false);
            }
        }
        if (CoreModule.m29934N().mo60261Bd() && !m132657k(user)) {
            xdl0.m208344M(this.f109193b, false);
            xdl0.m208344M(this.f109194c, false);
        }
        FollowshipStatus followshipStatus = NullChecker.m81303a(user.localFollowship) ? user.localFollowship.state : null;
        if (upa.m194670M3() || !CoreModule.m29934N().mo60389so()) {
            return;
        }
        if (CoreModule.m29934N().mo60396ud(user) || (NullChecker.m81303a(followshipStatus) && TEnum.equals(followshipStatus, FollowshipStatus.following))) {
            xdl0.m208344M(this.f109193b, false);
            xdl0.m208344M(this.f109194c, false);
        } else {
            xdl0.m208344M(this.f109193b, true);
            xdl0.m208344M(this.f109194c, true);
            this.f109193b.setText("喜欢");
            this.f109194c.setText("喜欢");
        }
        xdl0.m208344M(this.f109193b, false);
        xdl0.m208344M(this.f109194c, false);
        if (NullChecker.m81303a(this.f109195d)) {
            xdl0.m208344M(this.f109195d, false);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m132667p() {
        this.f109200i = false;
        this.f109193b.setBackgroundResource(x2c0.f189781U1);
        this.f109193b.setTextColor(637534208);
        this.f109194c.setBackgroundResource(x2c0.f189781U1);
        this.f109194c.setTextColor(637534208);
        if (this.f109199h) {
            this.f109195d.setBackgroundResource(x2c0.f189812V1);
            this.f109195d.setTextColor(637534208);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m132668q(User user) {
        m132660h(user.f56011id, true);
        this.f109193b.setText(CoreModule.f17544b.getResources().getString(R$string.f18721m5));
        this.f109193b.setBackgroundResource(x2c0.f190602u);
        this.f109193b.setTextColor(-1);
        this.f109194c.setText(CoreModule.f17544b.getResources().getString(R$string.f18721m5));
        this.f109194c.setBackgroundResource(x2c0.f190602u);
        this.f109194c.setTextColor(CoreModule.f17544b.getResources().getColor(w0c0.f183834b2));
        if (this.f109199h) {
            this.f109195d.setText(CoreModule.f17544b.getResources().getString(R$string.f18721m5));
            this.f109195d.setBackgroundResource(x2c0.f190602u);
            this.f109195d.setTextColor(-1);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m132669r(Act act, final User user) {
        xh0.C21150a c21150a = new xh0.C21150a(act);
        c21150a.m208731j(act.getResources().getString(R$string.f17927M0)).m208738q(R$string.f18136T).m208737p(w0c0.f183773I).m208736o(new View.OnClickListener() { // from class: l.fra0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qib0.f154713b0.f139233d.mo60380or(CoreModule.m29931H().userId(), user, false, OMSDialogPositon.p_suggest_user_profile_info_view);
            }
        }).m208726e(R$string.f18408c).m208724c(new View.OnClickListener() { // from class: l.gra0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f104038a.m132665n(view);
            }
        });
        xh0 xh0VarM208722a = c21150a.m208722a();
        this.f109201j = xh0VarM208722a;
        xh0VarM208722a.m208721g();
    }
}
