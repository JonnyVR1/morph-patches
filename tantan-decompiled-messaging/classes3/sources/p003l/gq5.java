package p003l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.data.PurchaseType;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.core.data.UserPrivilegeContent;
import com.p1.mobile.putong.core.message.R;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import java.util.List;
import l.c30;
import l.c3c0;
import l.e51;
import l.j760;
import l.l6c0;
import l.lsi0;
import l.mkd0;
import l.roj0;
import l.vwb;
import l.xdl0;
import l.xma;
import l.xp5;
import l.y4c0;
import l.zvf0;
import p028v.VImage;
import p028v.VText_NoTopPadding;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class gq5 {

    /* JADX INFO: renamed from: a */
    public final Act f3967a;

    /* JADX INFO: renamed from: b */
    public final Conversation f3968b;

    /* JADX INFO: renamed from: c */
    public final boolean f3969c;

    /* JADX INFO: renamed from: d */
    public View f3970d;

    /* JADX INFO: renamed from: l.gq5$a */
    public class C0315a implements g30<PurchaseType, Act, String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f3971a;

        public C0315a(User user) {
            this.f3971a = user;
        }

        @Override // p003l.g30
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo4389a(PurchaseType purchaseType, Act act, String str) {
            gq5.this.m4675p(this.f3971a);
        }
    }

    public gq5(Act act, Conversation conversation) {
        this.f3967a = act;
        this.f3968b = conversation;
        this.f3969c = xp5.h(conversation);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m4664e(User user) {
        Act actD = c30.d();
        if (actD == null || actD.isDestroyed()) {
            return;
        }
        CoreModule.P().a().ho(actD, user);
    }

    /* JADX INFO: renamed from: j */
    public View m4669j(ViewGroup viewGroup, final User user) {
        Act act;
        m4677r();
        if (viewGroup == null || (act = this.f3967a) == null || user == null) {
            return null;
        }
        View viewInflate = LayoutInflater.from(act).inflate(l6c0.r, viewGroup, false);
        this.f3970d = viewInflate;
        AppCompatTextView appCompatTextViewFindViewById = viewInflate.findViewById(y4c0.U);
        AppCompatTextView appCompatTextView = (VText_NoTopPadding) this.f3970d.findViewById(y4c0.T);
        View viewFindViewById = this.f3970d.findViewById(y4c0.R);
        AppCompatImageView appCompatImageView = (VImage) this.f3970d.findViewById(y4c0.S);
        if (this.f3969c) {
            appCompatTextViewFindViewById.setText(App.e.getString(R.string.I3));
            appCompatTextViewFindViewById.setTextColor(Color.parseColor("#3D2747"));
            appCompatTextView.setText(R.string.Q3);
        } else {
            appCompatTextViewFindViewById.setText(String.format(App.e.getString(R.string.G3), user.name));
            appCompatTextView.setText(R.string.H3);
            appCompatTextView.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            viewFindViewById.setBackgroundResource(c3c0.M);
        }
        xdl0.M(appCompatImageView, true);
        appCompatImageView.setImageResource(this.f3969c ? c3c0.E0 : c3c0.G0);
        xdl0.E0(viewFindViewById, new View.OnClickListener() { // from class: l.yp5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f9093a.m4671l(user, view);
            }
        });
        return this.f3970d;
    }

    /* JADX INFO: renamed from: k */
    public final int m4670k(List<UserPrivilege> list) {
        UserPrivilege userPrivilege;
        UserPrivilegeContent userPrivilegeContent;
        if (list == null || (userPrivilege = (UserPrivilege) vwb.r(list, new w9j() { // from class: l.eq5
            @Override // p003l.w9j
            public final Object call(Object obj) {
                UserPrivilege userPrivilege2 = (UserPrivilege) obj;
                return Boolean.valueOf(userPrivilege2 != null && TextUtils.equals(((DbObject) userPrivilege2).id, "compliment"));
            }
        })) == null || (userPrivilegeContent = userPrivilege.content) == null) {
            return 0;
        }
        return userPrivilegeContent.remaining;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m4671l(User user, View view) {
        m4678s(true);
        if (this.f3969c) {
            m4676q(user);
        } else {
            m4675p(user);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m4672m(String str, final User user, roj0 roj0Var) {
        CoreModule.c.f0.gp(str);
        this.f3967a.finish();
        e51.H(App.e, new Runnable() { // from class: l.fq5
            @Override // java.lang.Runnable
            public final void run() {
                gq5.m4664e(user);
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m4673n(final User user, final String str, List list) {
        if (m4670k(list) > 0) {
            CoreModule.c.f0.Bq(str).subscribe((m250) mkd0.H(new e30() { // from class: l.cq5
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f2753a.m4672m(str, user, (roj0) obj);
                }
            }, new e30() { // from class: l.dq5
                @Override // p003l.e30
                public final void call(Object obj) {
                    lsi0.y(App.e.getString(R.string.B2));
                }
            }));
        } else {
            CoreModule.P().a().R7("p_chat_view", "failed");
            CoreModule.P().g().Kd(this.f3967a, "", new C0315a(user), (d30) null);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m4674o(Throwable th) {
        CoreModule.P().g().Kd(this.f3967a, "", (g30) null, (d30) null);
    }

    /* JADX INFO: renamed from: p */
    public final void m4675p(final User user) {
        final String str = this.f3968b.otherUser;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        CoreModule.c.C0.u4().subscribe((m250) mkd0.H(new e30() { // from class: l.aq5
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f2255a.m4673n(user, str, (List) obj);
            }
        }, new e30() { // from class: l.bq5
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f2471a.m4674o((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public final void m4676q(User user) {
        if (user == null) {
            return;
        }
        if (xp5.n() || xma.Q3() > 0 || CoreModule.o.d().Ve()) {
            CoreModule.P().a().Q3(this.f3967a, user, new d30() { // from class: l.zp5
                @Override // p003l.d30
                public final void call() {
                    CoreModule.c.f0.Fo();
                }
            }, "p_intl_message_view,e_im_compliment_upgrade_guide,click");
        } else {
            CoreModule.P().a().r6(this.f3967a, "p_intl_message_view,e_im_compliment_upgrade_guide,click", Privilege.immediately_match, (e30) null, (d30) null);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m4677r() {
        View view = this.f3970d;
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.f3970d.getParent()).removeView(this.f3970d);
        }
        this.f3970d = null;
    }

    /* JADX INFO: renamed from: s */
    public void m4678s(boolean z) {
        j760 j760VarA = j760.a("compliment_upgrade_type", this.f3969c ? "ultraPremium" : "premium");
        if (z) {
            zvf0.u("e_im_compliment_upgrade_guide", "p_chat_view", new j760[]{j760VarA});
        } else {
            zvf0.A("e_im_compliment_upgrade_guide", "p_chat_view", new j760[]{j760VarA});
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean m4679t() {
        return xp5.c(this.f3968b);
    }
}
