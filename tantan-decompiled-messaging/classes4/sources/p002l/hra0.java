package p002l;

import android.app.Activity;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.data.Followship;
import com.p1.mobile.putong.data.FollowshipStatus;
import com.p1.mobile.putong.data.LikeFrom;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.c4g0;
import l.e30;
import l.j760;
import l.lsi0;
import l.mcr;
import l.mkd0;
import l.o6j0;
import l.qib0;
import l.roj0;
import l.upa;
import l.vwb;
import l.w0c0;
import l.x2c0;
import l.xdl0;
import l.xh0;
import l.zvf0;
import rx.subjects.b;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class hra0 {

    /* JADX INFO: renamed from: k */
    public static b<roj0> f12240k = b.b();

    /* JADX INFO: renamed from: a */
    public a1m f12241a;

    /* JADX INFO: renamed from: b */
    public TextView f12242b;

    /* JADX INFO: renamed from: c */
    public TextView f12243c;

    /* JADX INFO: renamed from: d */
    public VText f12244d;

    /* JADX INFO: renamed from: e */
    public c4g0 f12245e;

    /* JADX INFO: renamed from: f */
    public boolean f12246f;

    /* JADX INFO: renamed from: g */
    public String f12247g;

    /* JADX INFO: renamed from: h */
    public boolean f12248h = false;

    /* JADX INFO: renamed from: i */
    public boolean f12249i = false;

    /* JADX INFO: renamed from: j */
    public xh0 f12250j;

    public hra0(a1m a1mVar) {
        this.f12241a = a1mVar;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m14740e(Throwable th) {
    }

    /* JADX INFO: renamed from: k */
    public static boolean m14741k(User user) {
        if (NullChecker.a(user) && NullChecker.a(user.verifications) && NullChecker.a(user.verifications.anchor)) {
            return user.verifications.anchor.verified;
        }
        return false;
    }

    /* JADX INFO: renamed from: f */
    public void m14742f(boolean z, TextView textView, TextView textView2, mcr mcrVar, String str, String str2, boolean z2, VText vText) {
        this.f12246f = z;
        this.f12242b = textView;
        this.f12243c = textView2;
        this.f12244d = vText;
        this.f12247g = str2;
        this.f12248h = z2;
        mkd0.z(this.f12245e);
        this.f12245e = mcrVar.duringCreated(qib0.b0.d.s9()).subscribe(mkd0.H(new e30() { // from class: l.cra0
            public final void call(Object obj) {
                this.f8910a.m14747l((j760) obj);
            }
        }, new e30() { // from class: l.dra0
            public final void call(Object obj) {
                hra0.m14740e((Throwable) obj);
            }
        }));
        if (NullChecker.a(str)) {
            m14750o(CoreModule.N().getUserById(str));
        }
    }

    /* JADX INFO: renamed from: g */
    public boolean m14743g() {
        return (this.f12243c == null || this.f12242b == null) ? false : true;
    }

    /* JADX INFO: renamed from: h */
    public void m14744h(String str, boolean z) {
        if (this.f12249i && z) {
            return;
        }
        this.f12249i = true;
        ArrayList arrayList = new ArrayList();
        arrayList.add(j760.a("owner_id", str));
        arrayList.add(j760.a("receiver_user_id", str));
        arrayList.add(j760.a("subscribe_button_place", "top"));
        o6j0.l("e_follow", "p_suggest_user_profile_info_view", (j760[]) arrayList.toArray(new j760[0]));
    }

    /* JADX INFO: renamed from: i */
    public void m14745i(boolean z, String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(j760.a("owner_id", str));
        arrayList.add(j760.a("receiver_user_id", str));
        arrayList.add(j760.a("subscribe_button_place", "top"));
        o6j0.e(z ? "e_follow" : "e_cancelfollow", "p_suggest_user_profile_info_view", (j760[]) arrayList.toArray(new j760[0]));
    }

    /* JADX INFO: renamed from: j */
    public boolean m14746j(User user) {
        Followship followship = user.localFollowship;
        if (followship == null) {
            return false;
        }
        return TEnum.equals(followship.state, "matched") || TEnum.equals(user.localFollowship.state, "following");
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m14747l(j760 j760Var) {
        Object obj = j760Var.a;
        if (obj != null) {
            m14750o((User) obj);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m14748m(User user, boolean z, View view) {
        User user2;
        if (NullChecker.a(this.f12242b) && TextUtils.equals(this.f12242b.getText().toString(), "喜欢")) {
            Act actE = xdl0.E(this.f12242b);
            if (actE instanceof Act) {
                user2 = user;
                yz9.m27011z(actE, user2, true, null, LikeFrom.get("likers"), null, null, null, new boolean[0]);
            } else {
                user2 = user;
            }
            zvf0.u("e_likeButton", "PutongPageIds.P_SUGGEST_USER_PROFILE_INFO_VIEW", new j760[]{vwb.Y("moments_user_id", ((DbObject) user2).id)});
            return;
        }
        if (z) {
            Activity activityE = xdl0.E(this.f12242b);
            m14745i(false, ((DbObject) user).id);
            if (activityE instanceof Act) {
                m14753r((Act) activityE, user);
                return;
            }
            return;
        }
        if (user.profile.moments.hidePublicMoments && !User.isMatched(user)) {
            m14745i(true, ((DbObject) user).id);
            lsi0.w(R.string.P);
        } else {
            f12240k.onNext(roj0.a);
            m14745i(true, ((DbObject) user).id);
            qib0.b0.d.or(CoreModule.H().userId(), user, true, "p_suggest_user_profile_info_view");
        }
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m14749n(View view) {
        this.f12250j.c();
    }

    /* JADX INFO: renamed from: o */
    public void m14750o(final User user) {
        if (!m14743g() || user == null) {
            return;
        }
        Relationship relationship = user.localRelationship;
        if (relationship != null && TEnum.equals(relationship.state, "matched")) {
            xdl0.M(this.f12243c, false);
            xdl0.M(this.f12242b, false);
            return;
        }
        final boolean zM14746j = m14746j(user);
        xdl0.M0(this.f12242b, !this.f12248h);
        xdl0.M0(this.f12243c, true);
        TextView textView = this.f12242b;
        Typeface typeface = Typeface.DEFAULT_BOLD;
        textView.setTypeface(typeface);
        this.f12243c.setTypeface(typeface);
        this.f12243c.requestLayout();
        this.f12242b.requestLayout();
        if (zM14746j) {
            boolean zEquals = TEnum.equals(user.localFollowship.state, "following");
            TextView textView2 = this.f12242b;
            if (zEquals) {
                textView2.setText(R.string.l5);
                this.f12243c.setText(R.string.l5);
                m14751p();
            } else {
                textView2.setText(R.string.k5);
                this.f12243c.setText(R.string.k5);
                m14751p();
            }
        } else {
            m14752q(user);
        }
        View.OnClickListener onClickListener = new View.OnClickListener() { // from class: l.era0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9951a.m14748m(user, zM14746j, view);
            }
        };
        xdl0.E0(this.f12242b, onClickListener);
        xdl0.E0(this.f12243c, onClickListener);
        if (NullChecker.a(this.f12244d)) {
            xdl0.M(this.f12244d, this.f12248h);
            this.f12244d.setTypeface(typeface);
            if (zM14746j) {
                boolean zEquals2 = TEnum.equals(user.localFollowship.state, "following");
                VText vText = this.f12244d;
                if (zEquals2) {
                    vText.setText(R.string.l5);
                } else {
                    vText.setText(R.string.k5);
                }
            }
            xdl0.E0(this.f12244d, onClickListener);
            if (CoreModule.N().Bd() && !m14741k(user)) {
                xdl0.M(this.f12244d, false);
            }
        }
        if (CoreModule.N().Bd() && !m14741k(user)) {
            xdl0.M(this.f12242b, false);
            xdl0.M(this.f12243c, false);
        }
        FollowshipStatus followshipStatus = NullChecker.a(user.localFollowship) ? user.localFollowship.state : null;
        if (upa.M3() || !CoreModule.N().so()) {
            return;
        }
        if (CoreModule.N().ud(user) || (NullChecker.a(followshipStatus) && TEnum.equals(followshipStatus, "following"))) {
            xdl0.M(this.f12242b, false);
            xdl0.M(this.f12243c, false);
        } else {
            xdl0.M(this.f12242b, true);
            xdl0.M(this.f12243c, true);
            this.f12242b.setText("喜欢");
            this.f12243c.setText("喜欢");
        }
        xdl0.M(this.f12242b, false);
        xdl0.M(this.f12243c, false);
        if (NullChecker.a(this.f12244d)) {
            xdl0.M(this.f12244d, false);
        }
    }

    /* JADX INFO: renamed from: p */
    public void m14751p() {
        this.f12249i = false;
        this.f12242b.setBackgroundResource(x2c0.U1);
        this.f12242b.setTextColor(637534208);
        this.f12243c.setBackgroundResource(x2c0.U1);
        this.f12243c.setTextColor(637534208);
        if (this.f12248h) {
            this.f12244d.setBackgroundResource(x2c0.V1);
            this.f12244d.setTextColor(637534208);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m14752q(User user) {
        m14744h(((DbObject) user).id, true);
        this.f12242b.setText(CoreModule.b.getResources().getString(R.string.m5));
        this.f12242b.setBackgroundResource(x2c0.u);
        this.f12242b.setTextColor(-1);
        this.f12243c.setText(CoreModule.b.getResources().getString(R.string.m5));
        this.f12243c.setBackgroundResource(x2c0.u);
        this.f12243c.setTextColor(CoreModule.b.getResources().getColor(w0c0.b2));
        if (this.f12248h) {
            this.f12244d.setText(CoreModule.b.getResources().getString(R.string.m5));
            this.f12244d.setBackgroundResource(x2c0.u);
            this.f12244d.setTextColor(-1);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m14753r(Act act, final User user) {
        xh0.a aVar = new xh0.a(act);
        aVar.j(act.getResources().getString(R.string.M0)).q(R.string.T).p(w0c0.I).o(new View.OnClickListener() { // from class: l.fra0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                qib0.b0.d.or(CoreModule.H().userId(), user, false, "p_suggest_user_profile_info_view");
            }
        }).e(R.string.c).c(new View.OnClickListener() { // from class: l.gra0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f11600a.m14749n(view);
            }
        });
        xh0 xh0VarA = aVar.a();
        this.f12250j = xh0VarA;
        xh0VarA.g();
    }
}
