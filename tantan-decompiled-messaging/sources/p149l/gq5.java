package p149l;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.PurchaseType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.data.UserPrivilegeContent;
import com.p046p1.mobile.putong.core.message.R$string;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import java.util.List;
import p147v.VImage;
import p147v.VText_NoTopPadding;
import tech.sud.gip.core.view.round.RoundedDrawable;

/* JADX INFO: loaded from: classes3.dex */
public class gq5 {

    /* JADX INFO: renamed from: a */
    public final Act f103879a;

    /* JADX INFO: renamed from: b */
    public final Conversation f103880b;

    /* JADX INFO: renamed from: c */
    public final boolean f103881c;

    /* JADX INFO: renamed from: d */
    public View f103882d;

    /* JADX INFO: renamed from: l.gq5$a */
    public class C17141a implements g30<PurchaseType, Act, String> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ User f103883a;

        public C17141a(User user) {
            this.f103883a = user;
        }

        @Override // p149l.g30
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void mo36055a(PurchaseType purchaseType, Act act, String str) {
            gq5.this.m127530p(this.f103883a);
        }
    }

    public gq5(Act act, Conversation conversation) {
        this.f103879a = act;
        this.f103880b = conversation;
        this.f103881c = xp5.m210468h(conversation);
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ void m127519e(User user) {
        Act actM104962d = c30.m104962d();
        if (actM104962d == null || actM104962d.isDestroyed()) {
            return;
        }
        CoreModule.m29935P().m94651a().mo33516ho(actM104962d, user);
    }

    /* JADX INFO: renamed from: j */
    public View m127524j(ViewGroup viewGroup, final User user) {
        Act act;
        m127532r();
        if (viewGroup == null || (act = this.f103879a) == null || user == null) {
            return null;
        }
        View viewInflate = LayoutInflater.from(act).inflate(l6c0.f126550r, viewGroup, false);
        this.f103882d = viewInflate;
        AppCompatTextView appCompatTextView = (AppCompatTextView) viewInflate.findViewById(y4c0.f196051U);
        VText_NoTopPadding vText_NoTopPadding = (VText_NoTopPadding) this.f103882d.findViewById(y4c0.f196045T);
        View viewFindViewById = this.f103882d.findViewById(y4c0.f196033R);
        VImage vImage = (VImage) this.f103882d.findViewById(y4c0.f196039S);
        if (this.f103881c) {
            appCompatTextView.setText(App.f15369e.getString(R$string.f20776I3));
            appCompatTextView.setTextColor(Color.parseColor("#3D2747"));
            vText_NoTopPadding.setText(R$string.f20840Q3);
        } else {
            appCompatTextView.setText(String.format(App.f15369e.getString(R$string.f20760G3), user.name));
            vText_NoTopPadding.setText(R$string.f20768H3);
            vText_NoTopPadding.setTextColor(RoundedDrawable.DEFAULT_BORDER_COLOR);
            viewFindViewById.setBackgroundResource(c3c0.f78575M);
        }
        xdl0.m208344M(vImage, true);
        vImage.setImageResource(this.f103881c ? c3c0.f78504E0 : c3c0.f78522G0);
        xdl0.m208329E0(viewFindViewById, new View.OnClickListener() { // from class: l.yp5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f199395a.m127526l(user, view);
            }
        });
        return this.f103882d;
    }

    /* JADX INFO: renamed from: k */
    public final int m127525k(List<UserPrivilege> list) {
        UserPrivilege userPrivilege;
        UserPrivilegeContent userPrivilegeContent;
        if (list == null || (userPrivilege = (UserPrivilege) vwb.m200346r(list, new w9j() { // from class: l.eq5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                UserPrivilege userPrivilege2 = (UserPrivilege) obj;
                return Boolean.valueOf(userPrivilege2 != null && TextUtils.equals(userPrivilege2.f56011id, "compliment"));
            }
        })) == null || (userPrivilegeContent = userPrivilege.content) == null) {
            return 0;
        }
        return userPrivilegeContent.remaining;
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m127526l(User user, View view) {
        m127533s(true);
        if (this.f103881c) {
            m127531q(user);
        } else {
            m127530p(user);
        }
    }

    /* JADX INFO: renamed from: m */
    public final /* synthetic */ void m127527m(String str, final User user, roj0 roj0Var) {
        CoreModule.f17545c.f19642f0.m32973gp(str);
        this.f103879a.m66873d2();
        e51.m114743H(App.f15369e, new Runnable() { // from class: l.fq5
            @Override // java.lang.Runnable
            public final void run() {
                gq5.m127519e(user);
            }
        }, 300L);
    }

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ void m127528n(final User user, final String str, List list) {
        if (m127525k(list) > 0) {
            CoreModule.f17545c.f19642f0.m32600Bq(str).subscribe(mkd0.m154956H(new e30() { // from class: l.cq5
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f82027a.m127527m(str, user, (roj0) obj);
                }
            }, new e30() { // from class: l.dq5
                @Override // p149l.e30
                public final void call(Object obj) {
                    lsi0.m151595y(App.f15369e.getString(R$string.f20719B2));
                }
            }));
        } else {
            CoreModule.m29935P().m94651a().mo36050R7(OMSDialogPositon.p_chat_view, "failed");
            CoreModule.m29935P().m94656g().mo35016Kd(this.f103879a, "", new C17141a(user), null);
        }
    }

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ void m127529o(Throwable th) {
        CoreModule.m29935P().m94656g().mo35016Kd(this.f103879a, "", null, null);
    }

    /* JADX INFO: renamed from: p */
    public final void m127530p(final User user) {
        final String str = this.f103880b.otherUser;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        CoreModule.f17545c.f19555C0.m210112u4().subscribe(mkd0.m154956H(new e30() { // from class: l.aq5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f71129a.m127528n(user, str, (List) obj);
            }
        }, new e30() { // from class: l.bq5
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76753a.m127529o((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q */
    public final void m127531q(User user) {
        if (user == null) {
            return;
        }
        if (xp5.m210474n() || xma.m210052Q3() > 0 || CoreModule.f17557o.m195057d().mo33767Ve()) {
            CoreModule.m29935P().m94651a().mo158290Q3(this.f103879a, user, new d30() { // from class: l.zp5
                @Override // p149l.d30
                public final void call() {
                    CoreModule.f17545c.f19642f0.m32650Fo();
                }
            }, "p_intl_message_view,e_im_compliment_upgrade_guide,click");
        } else {
            CoreModule.m29935P().m94651a().mo33574r6(this.f103879a, "p_intl_message_view,e_im_compliment_upgrade_guide,click", Privilege.immediately_match, null, null);
        }
    }

    /* JADX INFO: renamed from: r */
    public void m127532r() {
        View view = this.f103882d;
        if (view != null && (view.getParent() instanceof ViewGroup)) {
            ((ViewGroup) this.f103882d.getParent()).removeView(this.f103882d);
        }
        this.f103882d = null;
    }

    /* JADX INFO: renamed from: s */
    public void m127533s(boolean z) {
        j760 j760VarM140076a = j760.m140076a("compliment_upgrade_type", this.f103881c ? SummarizedPrivilegesId.ultraPremium : "premium");
        if (z) {
            zvf0.m220399u("e_im_compliment_upgrade_guide", OMSDialogPositon.p_chat_view, j760VarM140076a);
        } else {
            zvf0.m220368A("e_im_compliment_upgrade_guide", OMSDialogPositon.p_chat_view, j760VarM140076a);
        }
    }

    /* JADX INFO: renamed from: t */
    public boolean m127534t() {
        return xp5.m210463c(this.f103880b);
    }
}
