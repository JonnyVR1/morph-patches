package p153l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.PurchaseType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.data.UserPrivilegeContent;
import com.p051p1.mobile.putong.core.message.R$string;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import java.util.List;
import p151v.VImage;
import p151v.VText_NoTopPadding;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class kr5 {

    /* JADX INFO: renamed from: a */
    public final Act f128416a;

    /* JADX INFO: renamed from: b */
    public final Conversation f128417b;

    /* JADX INFO: renamed from: c */
    public final boolean f128418c;

    /* JADX INFO: renamed from: d */
    public View f128419d;

    /* JADX INFO: renamed from: l.kr5$a */
    public class C18245a implements a30<PurchaseType, Act, String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f128420a;

        public C18245a(User user) {
            this.f128420a = user;
        }

        @Override // p153l.a30
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo37058a(PurchaseType purchaseType, Act act, String str) {
            kr5.this.m150997p(this.f128420a);
        }
    }

    public kr5(Act act, Conversation conversation) {
        this.f128416a = act;
        this.f128417b = conversation;
        this.f128418c = br5.m106037h(conversation);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m150986e(User user) {
        Act actM204489d = w20.m204489d();
        if (actM204489d == null || actM204489d.isDestroyed()) {
            return;
        }
        CoreModule.m30933P().m143405a().mo34519ho(actM204489d, user);
    }

    /* JADX INFO: renamed from: j */
    public View m150991j(ViewGroup viewGroup, final User user) {
        Act act;
        m150999r();
        if (viewGroup == null || (act = this.f128416a) == null || user == null) {
            return null;
        }
        View viewInflate = LayoutInflater.from(act).inflate(qec0.f157106r, viewGroup, false);
        this.f128419d = viewInflate;
        AppCompatTextView appCompatTextView = (AppCompatTextView) viewInflate.findViewById(edc0.f93286U);
        VText_NoTopPadding vText_NoTopPadding = (VText_NoTopPadding) this.f128419d.findViewById(edc0.f93280T);
        View viewFindViewById = this.f128419d.findViewById(edc0.f93268R);
        VImage vImage = (VImage) this.f128419d.findViewById(edc0.f93274S);
        if (this.f128418c) {
            appCompatTextView.setText(App.f16088e.getString(R$string.f21518I3));
            appCompatTextView.setTextColor(Color.parseColor("#3D2747"));
            vText_NoTopPadding.setText(R$string.f21582Q3);
        } else {
            appCompatTextView.setText(String.format(App.f16088e.getString(R$string.f21502G3), user.name));
            vText_NoTopPadding.setText(R$string.f21510H3);
            vText_NoTopPadding.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            viewFindViewById.setBackgroundResource(ibc0.f113850M);
        }
        bnl0.m105524M(vImage, true);
        vImage.setImageResource(this.f128418c ? ibc0.f113779E0 : ibc0.f113797G0);
        bnl0.m105509E0(viewFindViewById, new View.OnClickListener() { // from class: l.cr5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f83298a.m150993l(user, view);
            }
        });
        return this.f128419d;
    }

    /* JADX INFO: renamed from: k */
    public final int m150992k(List<UserPrivilege> list) {
        UserPrivilege userPrivilege;
        UserPrivilegeContent userPrivilegeContent;
        if (list == null || (userPrivilege = (UserPrivilege) jyb.m147529r(list, new qcj() { // from class: l.ir5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                UserPrivilege userPrivilege2 = (UserPrivilege) obj;
                return Boolean.valueOf(userPrivilege2 != null && TextUtils.equals(userPrivilege2.f56859id, "compliment"));
            }
        })) == null || (userPrivilegeContent = userPrivilege.content) == null) {
            return 0;
        }
        return userPrivilegeContent.remaining;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m150993l(User user, View view) {
        m151000s(true);
        if (this.f128418c) {
            m150998q(user);
        } else {
            m150997p(user);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m150994m(String str, final User user, uxj0 uxj0Var) {
        CoreModule.f18264c.f20384f0.m33976gp(str);
        this.f128416a.m68056e2();
        l51.m152888H(App.f16088e, new Runnable() { // from class: l.jr5
            @Override // java.lang.Runnable
            public final void run() {
                kr5.m150986e(user);
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m150995n(final User user, final String str, List list) {
        if (m150992k(list) > 0) {
            CoreModule.f18264c.f20384f0.m33603Bq(str).subscribe(psd0.m173597H(new y20() { // from class: l.gr5
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f106002a.m150994m(str, user, (uxj0) obj);
                }
            }, new y20() { // from class: l.hr5
                @Override // p153l.y20
                public final void call(Object obj) {
                    o1j0.m165651y(App.f16088e.getString(R$string.f21461B2));
                }
            }));
        } else {
            CoreModule.m30933P().m143405a().mo37053R7(OMSDialogPositon.p_chat_view, "failed");
            CoreModule.m30933P().m143410g().mo36019Kd(this.f128416a, "", new C18245a(user), null);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m150996o(Throwable th) {
        CoreModule.m30933P().m143410g().mo36019Kd(this.f128416a, "", null, null);
    }

    /* JADX INFO: renamed from: p */
    public final void m150997p(final User user) {
        final String str = this.f128417b.otherUser;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        CoreModule.f18264c.f20297C0.m146425v4().subscribe(psd0.m173597H(new y20() { // from class: l.er5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95444a.m150995n(user, str, (List) obj);
            }
        }, new y20() { // from class: l.fr5
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100396a.m150996o((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public final void m150998q(User user) {
        if (user == null) {
            return;
        }
        if (br5.m106043n() || joa.m146366R3() > 0 || CoreModule.f18276o.m132214d().mo34770Ve()) {
            CoreModule.m30933P().m143405a().mo180382Q3(this.f128416a, user, new x20() { // from class: l.dr5
                @Override // p153l.x20
                public final void call() {
                    CoreModule.f18264c.f20384f0.m33653Fo();
                }
            }, "p_intl_message_view,e_im_compliment_upgrade_guide,click");
        } else {
            CoreModule.m30933P().m143405a().mo34577r6(this.f128416a, "p_intl_message_view,e_im_compliment_upgrade_guide,click", Privilege.immediately_match, null, null);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m150999r() {
        View view = this.f128419d;
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.f128419d.getParent()).removeView(this.f128419d);
        }
        this.f128419d = null;
    }

    /* JADX INFO: renamed from: s */
    public void m151000s(boolean z) {
        pf60 pf60VarM172085a = pf60.m172085a("compliment_upgrade_type", this.f128418c ? SummarizedPrivilegesId.ultraPremium : "premium");
        if (z) {
            i4g0.m138523u("e_im_compliment_upgrade_guide", OMSDialogPositon.p_chat_view, pf60VarM172085a);
        } else {
            i4g0.m138492A("e_im_compliment_upgrade_guide", OMSDialogPositon.p_chat_view, pf60VarM172085a);
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean m151001t() {
        return br5.m106032c(this.f128417b);
    }
}
