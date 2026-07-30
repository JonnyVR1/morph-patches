package p006l;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.p000p1.mobile.putong.core.CoreModule;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.putong.core.data.ChatPartnerText;
import com.p1.mobile.putong.core.data.ChatPartners;
import com.p1.mobile.putong.core.newui.partner.ChatPartnerSelectFriendAct;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.core.ui.account.JailedDialogLikeAct;
import com.p1.mobile.putong.data.Envelope;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import l.d30;
import l.e30;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.quf0;
import l.szd;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VIcon;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class puf0 extends szd {

    /* JADX INFO: renamed from: j */
    public FrameLayout f19346j;

    /* JADX INFO: renamed from: k */
    public VDraweeView f19347k;

    /* JADX INFO: renamed from: l */
    public VDraweeView f19348l;

    /* JADX INFO: renamed from: m */
    public VDraweeView f19349m;

    /* JADX INFO: renamed from: n */
    public VDraweeView f19350n;

    /* JADX INFO: renamed from: o */
    public VIcon f19351o;

    /* JADX INFO: renamed from: p */
    public VText_Bold f19352p;

    /* JADX INFO: renamed from: q */
    public TextView f19353q;

    /* JADX INFO: renamed from: r */
    public FrameLayout f19354r;

    /* JADX INFO: renamed from: s */
    public TextView f19355s;

    /* JADX INFO: renamed from: t */
    public TextView f19356t;

    /* JADX INFO: renamed from: u */
    public Act f19357u;

    /* JADX INFO: renamed from: v */
    public ChatPartners f19358v;

    /* JADX INFO: renamed from: w */
    public int f19359w;

    /* JADX INFO: renamed from: x */
    public d30 f19360x;

    /* JADX INFO: renamed from: l.puf0$a */
    public class ViewOnClickListenerC1151a implements View.OnClickListener {
        public ViewOnClickListenerC1151a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (!NullChecker.a(puf0.this.f19358v) || vwb.J(puf0.this.f19358v.texts)) {
                return;
            }
            List list = puf0.this.f19358v.texts;
            int iNextInt = new Random().nextInt(list.size());
            int i = puf0.this.f19359w;
            if (iNextInt == i) {
                iNextInt = i < list.size() + (-2) ? puf0.this.f19359w + 1 : 0;
            }
            puf0.this.f19359w = iNextInt;
            puf0.this.f19353q.setText(((ChatPartnerText) list.get(iNextInt)).value);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public puf0(Context context) {
        super(context, false, 0);
        this.f19359w = 0;
        if (NullChecker.a(getWindow())) {
            getWindow().setBackgroundDrawableResource(x2c0.f26063Lq);
        }
        setCancelable(false);
        this.f19357u = (Act) context;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: N */
    public /* synthetic */ void m21722N(View view) {
        m21730U(this.f19358v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: O */
    public /* synthetic */ void m21723O(View view) {
        m21729T(this.f19358v);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: S */
    public /* synthetic */ void m21724S(Envelope envelope) {
        CoreModule.f1534c.f3631f0.m4580Fo();
        CoreModule.m1853N().Tg();
        g4h0.m15569d();
        d30 d30Var = this.f19360x;
        if (d30Var != null) {
            d30Var.call();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: M */
    public View m21725M(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return quf0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: P */
    public final /* synthetic */ void m21726P(View view) {
        m21729T(this.f19358v);
    }

    /* JADX INFO: renamed from: Q */
    public final /* synthetic */ void m21727Q(View view) {
        m21729T(this.f19358v);
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m21728R(View view) {
        d30 d30Var = this.f19360x;
        if (d30Var != null) {
            d30Var.call();
        }
        dismiss();
    }

    /* JADX INFO: renamed from: T */
    public void m21729T(ChatPartners chatPartners) {
        if (!NullChecker.a(chatPartners) || vwb.J(chatPartners.texts) || chatPartners.texts.size() <= this.f19359w) {
            return;
        }
        d30 d30Var = this.f19360x;
        if (d30Var != null) {
            d30Var.call();
        }
        dismiss();
        ChatPartnerText chatPartnerText = (ChatPartnerText) chatPartners.texts.get(this.f19359w);
        this.f19357u.startActivity(ChatPartnerSelectFriendAct.Z1(this.f19357u, chatPartners, chatPartnerText.id, "from_start_chatting_now_dialg"));
        List list = this.f19358v.users;
        String str = "";
        if (!vwb.J(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                str = str + ((DbObject) ((User) it.next())).id + ",";
            }
        }
        zvf0.u("e_surprisebox_friend", "p_suggest_users_home_view", new j760[]{vwb.Y("other_uid", str), vwb.Y("preset_word", chatPartnerText.value)});
    }

    /* JADX INFO: renamed from: U */
    public final void m21730U(ChatPartners chatPartners) {
        if (!NullChecker.a(chatPartners) || vwb.J(chatPartners.texts) || chatPartners.texts.size() <= this.f19359w || vwb.J(chatPartners.users)) {
            return;
        }
        if (CoreModule.m1851K().me_().isBanned()) {
            JailedDialogLikeAct.o2(true);
            return;
        }
        if (CoreModule.m1851K().me_().isJailedOrRestrict()) {
            ura.m25555e().m25559d().m5702Vc();
            return;
        }
        ChatPartnerText chatPartnerText = (ChatPartnerText) chatPartners.texts.get(this.f19359w);
        this.f19357u.duringCreated(CoreModule.f1534c.f3628e0.m21499ra(chatPartnerText.id, vwb.Q(chatPartners.users, new w9j() { // from class: l.muf0
            public final Object call(Object obj) {
                return ((DbObject) ((User) obj)).id;
            }
        }))).subscribe(mkd0.H(new e30() { // from class: l.nuf0
            public final void call(Object obj) {
                this.f17873a.m21724S((Envelope) obj);
            }
        }, new e30() { // from class: l.ouf0
            public final void call(Object obj) {
                lsi0.y("网络错误，请重试");
            }
        }));
        List list = this.f19358v.users;
        String str = "";
        if (!vwb.J(list)) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                str = str + ((DbObject) ((User) it.next())).id + ",";
            }
        }
        zvf0.u("e_surprisebox_friend", "p_suggest_users_home_view", new j760[]{vwb.Y("other_uid", str), vwb.Y("preset_word", chatPartnerText.value)});
    }

    /* JADX INFO: renamed from: V */
    public void m21731V(d30 d30Var) {
        this.f19360x = d30Var;
    }

    /* JADX INFO: renamed from: W */
    public void m21732W(ChatPartners chatPartners) {
        super.show();
        this.f19358v = chatPartners;
        if (NullChecker.a(chatPartners)) {
            List list = chatPartners.users;
            List list2 = chatPartners.texts;
            if (!vwb.J(list)) {
                User user = (User) list.get(0);
                qib0.f19782G.m12744L0(this.f19348l, user.fp().profileMiddle().formatted());
                CoreModule.f1534c.f3648k2.f24992b0.put(user.fp().profile180().formatted());
                if (list.size() >= 2) {
                    qib0.f19782G.m12744L0(this.f19349m, ((User) list.get(1)).fp().profileMiddle().formatted());
                }
                if (list.size() >= 3) {
                    qib0.f19782G.m12744L0(this.f19350n, ((User) list.get(2)).fp().profileMiddle().formatted());
                }
                this.f19355s.setText(String.format("为你找到%S个你感兴趣的聊天搭子", Integer.valueOf(list.size())));
            }
            if (!vwb.J(list2)) {
                int iNextInt = new Random().nextInt(list2.size());
                this.f19359w = iNextInt;
                this.f19353q.setText(((ChatPartnerText) list2.get(iNextInt)).value);
            }
        }
        zvf0.x("e_surprisebox_friend", "p_suggest_users_home_view");
    }

    public void onCreate(Bundle bundle) {
        super/*androidx.appcompat.app.a*/.onCreate(bundle);
        setContentView(m21725M(this.f19357u.inflater(), null));
        qib0.f19782G.m12767Y0(this.f19347k, x2c0.f25875Fp);
        xdl0.E0(this.f19354r, new ViewOnClickListenerC1151a());
        xdl0.E0(this.f19356t, new View.OnClickListener() { // from class: l.huf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14087a.m21722N(view);
            }
        });
        xdl0.E0(this.f19348l, new View.OnClickListener() { // from class: l.iuf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f14791a.m21723O(view);
            }
        });
        xdl0.E0(this.f19349m, new View.OnClickListener() { // from class: l.juf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15432a.m21726P(view);
            }
        });
        xdl0.E0(this.f19350n, new View.OnClickListener() { // from class: l.kuf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16002a.m21727Q(view);
            }
        });
        xdl0.E0(this.f19351o, new View.OnClickListener() { // from class: l.luf0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16654a.m21728R(view);
            }
        });
    }
}
