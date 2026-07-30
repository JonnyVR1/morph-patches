package p149l;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatPartnerText;
import com.p046p1.mobile.putong.core.data.ChatPartners;
import com.p046p1.mobile.putong.core.newui.partner.ChatPartnerSelectFriendAct;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.account.JailedDialogLikeAct;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import p147v.VDraweeView;
import p147v.VIcon;

/* JADX INFO: loaded from: classes9.dex */
public class puf0 extends szd {

    /* JADX INFO: renamed from: j */
    public FrameLayout f151271j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f151272k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f151273l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f151274m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f151275n;

    /* JADX INFO: renamed from: o */
    public VIcon f151276o;

    /* JADX INFO: renamed from: p */
    public VText_Bold f151277p;

    /* JADX INFO: renamed from: q */
    public TextView f151278q;

    /* JADX INFO: renamed from: r */
    public FrameLayout f151279r;

    /* JADX INFO: renamed from: s */
    public TextView f151280s;

    /* JADX INFO: renamed from: t */
    public TextView f151281t;

    /* JADX INFO: renamed from: u */
    public Act f151282u;

    /* JADX INFO: renamed from: v */
    public ChatPartners f151283v;

    /* JADX INFO: renamed from: w */
    public int f151284w;

    /* JADX INFO: renamed from: x */
    public d30 f151285x;

    /* JADX INFO: renamed from: l.puf0$a */
    public class ViewOnClickListenerC19339a implements View.OnClickListener {
        public ViewOnClickListenerC19339a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!NullChecker.m81303a(puf0.this.f151283v) || vwb.m200296J(puf0.this.f151283v.texts)) {
                return;
            }
            List<ChatPartnerText> list = puf0.this.f151283v.texts;
            int iNextInt = new Random().nextInt(list.size());
            int i = puf0.this.f151284w;
            if (iNextInt == i) {
                iNextInt = i < list.size() + (-2) ? puf0.this.f151284w + 1 : 0;
            }
            puf0.this.f151284w = iNextInt;
            puf0.this.f151278q.setText(list.get(iNextInt).value);
        }
    }

    public puf0(Context context) {
        super(context, false, 0);
        this.f151284w = 0;
        if (NullChecker.m81303a(getWindow())) {
            getWindow().setBackgroundDrawableResource(x2c0.f189527Lq);
        }
        setCancelable(false);
        this.f151282u = (Act) context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m171416N(View view) {
        m171424U(this.f151283v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m171417O(View view) {
        m171423T(this.f151283v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m171418S(Envelope envelope) {
        CoreModule.f17545c.f19642f0.m32650Fo();
        CoreModule.m29934N().mo60320Tg();
        g4h0.m124372d();
        d30 d30Var = this.f151285x;
        if (d30Var != null) {
            d30Var.call();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: M */
    public View m171419M(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return quf0.m176598b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m171420P(View view) {
        m171423T(this.f151283v);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m171421Q(View view) {
        m171423T(this.f151283v);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m171422R(View view) {
        d30 d30Var = this.f151285x;
        if (d30Var != null) {
            d30Var.call();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: T */
    public void m171423T(ChatPartners chatPartners) {
        if (!NullChecker.m81303a(chatPartners) || vwb.m200296J(chatPartners.texts) || chatPartners.texts.size() <= this.f151284w) {
            return;
        }
        d30 d30Var = this.f151285x;
        if (d30Var != null) {
            d30Var.call();
        }
        dismiss();
        ChatPartnerText chatPartnerText = chatPartners.texts.get(this.f151284w);
        this.f151282u.startActivity(ChatPartnerSelectFriendAct.m43106Z1(this.f151282u, chatPartners, chatPartnerText.f20369id, "from_start_chatting_now_dialg"));
        List<User> list = this.f151283v.users;
        String str = "";
        if (!vwb.m200296J(list)) {
            Iterator<User> it = list.iterator();
            while (it.hasNext()) {
                str = str + it.next().f56011id + Constants.SEPARATOR_COMMA;
            }
        }
        zvf0.m220399u("e_surprisebox_friend", "p_suggest_users_home_view", vwb.m200311Y("other_uid", str), vwb.m200311Y("preset_word", chatPartnerText.value));
    }

    /* JADX INFO: renamed from: U */
    public final void m171424U(ChatPartners chatPartners) {
        if (!NullChecker.m81303a(chatPartners) || vwb.m200296J(chatPartners.texts) || chatPartners.texts.size() <= this.f151284w || vwb.m200296J(chatPartners.users)) {
            return;
        }
        if (CoreModule.m29932K().me_().isBanned()) {
            JailedDialogLikeAct.m44186o2(true);
            return;
        }
        if (CoreModule.m29932K().me_().isJailedOrRestrict()) {
            ura.m195053e().m195057d().mo33765Vc();
            return;
        }
        ChatPartnerText chatPartnerText = chatPartners.texts.get(this.f151284w);
        this.f151282u.duringCreated(CoreModule.f17545c.f19639e0.m169536ra(chatPartnerText.f20369id, vwb.m200303Q(chatPartners.users, new w9j() { // from class: l.muf0
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((User) obj).f56011id;
            }
        }))).subscribe(mkd0.m154956H(new e30() { // from class: l.nuf0
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140622a.m171418S((Envelope) obj);
            }
        }, new e30() { // from class: l.ouf0
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151595y("网络错误，请重试");
            }
        }));
        List<User> list = this.f151283v.users;
        String str = "";
        if (!vwb.m200296J(list)) {
            Iterator<User> it = list.iterator();
            while (it.hasNext()) {
                str = str + it.next().f56011id + Constants.SEPARATOR_COMMA;
            }
        }
        zvf0.m220399u("e_surprisebox_friend", "p_suggest_users_home_view", vwb.m200311Y("other_uid", str), vwb.m200311Y("preset_word", chatPartnerText.value));
    }

    /* JADX INFO: renamed from: V */
    public void m171425V(d30 d30Var) {
        this.f151285x = d30Var;
    }

    /* JADX INFO: renamed from: W */
    public void m171426W(ChatPartners chatPartners) {
        super.show();
        this.f151283v = chatPartners;
        if (NullChecker.m81303a(chatPartners)) {
            List<User> list = chatPartners.users;
            List<ChatPartnerText> list2 = chatPartners.texts;
            if (!vwb.m200296J(list)) {
                User user = list.get(0);
                qib0.f154691G.m102331L0(this.f151273l, user.m60124fp().profileMiddle().formatted());
                CoreModule.f17545c.f19659k2.f184666b0.put(user.m60124fp().profile180().formatted());
                if (list.size() >= 2) {
                    qib0.f154691G.m102331L0(this.f151274m, list.get(1).m60124fp().profileMiddle().formatted());
                }
                if (list.size() >= 3) {
                    qib0.f154691G.m102331L0(this.f151275n, list.get(2).m60124fp().profileMiddle().formatted());
                }
                this.f151280s.setText(String.format("为你找到%S个你感兴趣的聊天搭子", Integer.valueOf(list.size())));
            }
            if (!vwb.m200296J(list2)) {
                int iNextInt = new Random().nextInt(list2.size());
                this.f151284w = iNextInt;
                this.f151278q.setText(list2.get(iNextInt).value);
            }
        }
        zvf0.m220402x("e_surprisebox_friend", "p_suggest_users_home_view");
    }

    @Override // androidx.appcompat.app.DialogInterfaceC0074a, p149l.hu0, android.app.Dialog
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(m171419M(this.f151282u.inflater(), null));
        qib0.f154691G.m102354Y0(this.f151272k, x2c0.f189339Fp);
        xdl0.m208329E0(this.f151279r, new ViewOnClickListenerC19339a());
        xdl0.m208329E0(this.f151281t, new View.OnClickListener() { // from class: l.huf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f109562a.m171416N(view);
            }
        });
        xdl0.m208329E0(this.f151273l, new View.OnClickListener() { // from class: l.iuf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f115012a.m171417O(view);
            }
        });
        xdl0.m208329E0(this.f151274m, new View.OnClickListener() { // from class: l.juf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f119778a.m171420P(view);
            }
        });
        xdl0.m208329E0(this.f151275n, new View.OnClickListener() { // from class: l.kuf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f124683a.m171421Q(view);
            }
        });
        xdl0.m208329E0(this.f151276o, new View.OnClickListener() { // from class: l.luf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f130056a.m171422R(view);
            }
        });
    }
}
