package p153l;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatPartnerText;
import com.p051p1.mobile.putong.core.data.ChatPartners;
import com.p051p1.mobile.putong.core.newui.partner.ChatPartnerSelectFriendAct;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.account.JailedDialogLikeAct;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import p151v.VDraweeView;
import p151v.VIcon;

/* JADX INFO: loaded from: classes12.dex */
public class y2g0 extends g1e {

    /* JADX INFO: renamed from: j */
    public FrameLayout f197214j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f197215k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f197216l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f197217m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f197218n;

    /* JADX INFO: renamed from: o */
    public VIcon f197219o;

    /* JADX INFO: renamed from: p */
    public VText_Bold f197220p;

    /* JADX INFO: renamed from: q */
    public TextView f197221q;

    /* JADX INFO: renamed from: r */
    public FrameLayout f197222r;

    /* JADX INFO: renamed from: s */
    public TextView f197223s;

    /* JADX INFO: renamed from: t */
    public TextView f197224t;

    /* JADX INFO: renamed from: u */
    public Act f197225u;

    /* JADX INFO: renamed from: v */
    public ChatPartners f197226v;

    /* JADX INFO: renamed from: w */
    public int f197227w;

    /* JADX INFO: renamed from: x */
    public x20 f197228x;

    /* JADX INFO: renamed from: l.y2g0$a */
    public class ViewOnClickListenerC21495a implements View.OnClickListener {
        public ViewOnClickListenerC21495a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!NullChecker.m82486a(y2g0.this.f197226v) || jyb.m147479J(y2g0.this.f197226v.texts)) {
                return;
            }
            List<ChatPartnerText> list = y2g0.this.f197226v.texts;
            int iNextInt = new Random().nextInt(list.size());
            int i = y2g0.this.f197227w;
            if (iNextInt == i) {
                iNextInt = i < list.size() + (-2) ? y2g0.this.f197227w + 1 : 0;
            }
            y2g0.this.f197227w = iNextInt;
            y2g0.this.f197221q.setText(list.get(iNextInt).value);
        }
    }

    public y2g0(Context context) {
        super(context, false, 0);
        this.f197227w = 0;
        if (NullChecker.m82486a(getWindow())) {
            getWindow().setBackgroundDrawableResource(dbc0.f87653zr);
        }
        setCancelable(false);
        this.f197225u = (Act) context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m214065N(View view) {
        m214073U(this.f197226v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m214066O(View view) {
        m214072T(this.f197226v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m214067S(Envelope envelope) {
        CoreModule.f18264c.f20384f0.m33653Fo();
        CoreModule.m30932N().mo61504Tg();
        och0.m167218d();
        x20 x20Var = this.f197228x;
        if (x20Var != null) {
            x20Var.call();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: M */
    public View m214068M(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return z2g0.m218418b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m214069P(View view) {
        m214072T(this.f197226v);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m214070Q(View view) {
        m214072T(this.f197226v);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m214071R(View view) {
        x20 x20Var = this.f197228x;
        if (x20Var != null) {
            x20Var.call();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: T */
    public void m214072T(ChatPartners chatPartners) {
        if (!NullChecker.m82486a(chatPartners) || jyb.m147479J(chatPartners.texts) || chatPartners.texts.size() <= this.f197227w) {
            return;
        }
        x20 x20Var = this.f197228x;
        if (x20Var != null) {
            x20Var.call();
        }
        dismiss();
        ChatPartnerText chatPartnerText = chatPartners.texts.get(this.f197227w);
        this.f197225u.startActivity(ChatPartnerSelectFriendAct.m44117a2(this.f197225u, chatPartners, chatPartnerText.f21111id, "from_start_chatting_now_dialg"));
        List<User> list = this.f197226v.users;
        String str = "";
        if (!jyb.m147479J(list)) {
            Iterator<User> it = list.iterator();
            while (it.hasNext()) {
                str = str + it.next().f56859id + Constants.SEPARATOR_COMMA;
            }
        }
        i4g0.m138523u("e_surprisebox_friend", "p_suggest_users_home_view", jyb.m147494Y("other_uid", str), jyb.m147494Y("preset_word", chatPartnerText.value));
    }

    /* JADX INFO: renamed from: U */
    public final void m214073U(ChatPartners chatPartners) {
        if (!NullChecker.m82486a(chatPartners) || jyb.m147479J(chatPartners.texts) || chatPartners.texts.size() <= this.f197227w || jyb.m147479J(chatPartners.users)) {
            return;
        }
        if (CoreModule.m30930K().me_().isBanned()) {
            JailedDialogLikeAct.m45369p2(true);
            return;
        }
        if (CoreModule.m30930K().me_().isJailedOrRestrict()) {
            gta.m132210e().m132214d().mo34768Vc();
            return;
        }
        ChatPartnerText chatPartnerText = chatPartners.texts.get(this.f197227w);
        this.f197225u.duringCreated(CoreModule.f18264c.f20381e0.m116609ra(chatPartnerText.f21111id, jyb.m147486Q(chatPartners.users, new qcj() { // from class: l.v2g0
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((User) obj).f56859id;
            }
        }))).subscribe(psd0.m173597H(new y20() { // from class: l.w2g0
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f186898a.m214067S((Envelope) obj);
            }
        }, new y20() { // from class: l.x2g0
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165651y("网络错误，请重试");
            }
        }));
        List<User> list = this.f197226v.users;
        String str = "";
        if (!jyb.m147479J(list)) {
            Iterator<User> it = list.iterator();
            while (it.hasNext()) {
                str = str + it.next().f56859id + Constants.SEPARATOR_COMMA;
            }
        }
        i4g0.m138523u("e_surprisebox_friend", "p_suggest_users_home_view", jyb.m147494Y("other_uid", str), jyb.m147494Y("preset_word", chatPartnerText.value));
    }

    /* JADX INFO: renamed from: V */
    public void m214074V(x20 x20Var) {
        this.f197228x = x20Var;
    }

    /* JADX INFO: renamed from: W */
    public void m214075W(ChatPartners chatPartners) {
        super.show();
        this.f197226v = chatPartners;
        if (NullChecker.m82486a(chatPartners)) {
            List<User> list = chatPartners.users;
            List<ChatPartnerText> list2 = chatPartners.texts;
            if (!jyb.m147479J(list)) {
                User user = list.get(0);
                uqb0.f180374G.m127115L0(this.f197216l, user.m61308fp().profileMiddle().formatted());
                CoreModule.f18264c.f20401k2.f118669b0.put(user.m61308fp().profile180().formatted());
                if (list.size() >= 2) {
                    uqb0.f180374G.m127115L0(this.f197217m, list.get(1).m61308fp().profileMiddle().formatted());
                }
                if (list.size() >= 3) {
                    uqb0.f180374G.m127115L0(this.f197218n, list.get(2).m61308fp().profileMiddle().formatted());
                }
                this.f197223s.setText(String.format("为你找到%S个你感兴趣的聊天搭子", Integer.valueOf(list.size())));
            }
            if (!jyb.m147479J(list2)) {
                int iNextInt = new Random().nextInt(list2.size());
                this.f197227w = iNextInt;
                this.f197221q.setText(list2.get(iNextInt).value);
            }
        }
        i4g0.m138526x("e_surprisebox_friend", "p_suggest_users_home_view");
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0075a, p153l.nu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m214068M(this.f197225u.inflater(), null));
        uqb0.f180374G.m127138Y0(this.f197215k, dbc0.f87459tq);
        bnl0.m105509E0(this.f197222r, new ViewOnClickListenerC21495a());
        bnl0.m105509E0(this.f197224t, new View.OnClickListener() { // from class: l.q2g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f155332a.m214065N(view);
            }
        });
        bnl0.m105509E0(this.f197216l, new View.OnClickListener() { // from class: l.r2g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f160938a.m214066O(view);
            }
        });
        bnl0.m105509E0(this.f197217m, new View.OnClickListener() { // from class: l.s2g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f165890a.m214069P(view);
            }
        });
        bnl0.m105509E0(this.f197218n, new View.OnClickListener() { // from class: l.t2g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f171757a.m214070Q(view);
            }
        });
        bnl0.m105509E0(this.f197219o, new View.OnClickListener() { // from class: l.u2g0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177212a.m214071R(view);
            }
        });
    }
}
