package p009l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.p000p1.mobile.putong.core.newui.partner.ChatPartnerUserItem;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.ChatPartnerHistoryData;
import com.p1.mobile.putong.core.ui.VText_Bold;
import com.p1.mobile.putong.core.ui.account.JailedDialogLikeAct;
import com.p1.mobile.putong.data.Emotion;
import com.p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import l.c30;
import l.cwf0;
import l.e30;
import l.g4h0;
import l.hmb;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.s7m;
import l.t05;
import l.t100;
import l.ura;
import l.vwb;
import l.w9j;
import l.xdl0;
import l.xh0;
import l.zvf0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class s05 implements s7m<j05> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f20045a;

    /* JADX INFO: renamed from: b */
    public VImage f20046b;

    /* JADX INFO: renamed from: c */
    public VImage f20047c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f20048d;

    /* JADX INFO: renamed from: e */
    public VText f20049e;

    /* JADX INFO: renamed from: f */
    public ChatPartnerUserItem f20050f;

    /* JADX INFO: renamed from: g */
    public ChatPartnerUserItem f20051g;

    /* JADX INFO: renamed from: h */
    public ChatPartnerUserItem f20052h;

    /* JADX INFO: renamed from: i */
    public ChatPartnerUserItem f20053i;

    /* JADX INFO: renamed from: j */
    public ChatPartnerUserItem f20054j;

    /* JADX INFO: renamed from: k */
    public ChatPartnerUserItem f20055k;

    /* JADX INFO: renamed from: l */
    public ChatPartnerUserItem f20056l;

    /* JADX INFO: renamed from: m */
    public ChatPartnerUserItem f20057m;

    /* JADX INFO: renamed from: n */
    public ChatPartnerUserItem f20058n;

    /* JADX INFO: renamed from: o */
    public VText_Bold f20059o;

    /* JADX INFO: renamed from: p */
    public VText_Bold f20060p;

    /* JADX INFO: renamed from: q */
    public final Act f20061q;

    /* JADX INFO: renamed from: r */
    public j05 f20062r;

    /* JADX INFO: renamed from: s */
    public cwf0 f20063s;

    /* JADX INFO: renamed from: t */
    public List<ChatPartnerUserItem> f20064t;

    public s05(Act act) {
        this.f20061q = act;
    }

    /* JADX INFO: renamed from: A */
    public final void m21964A() {
        if (this.f20063s == null) {
            this.f20063s = i0e.m16062c("p_chatting_partner_signal_back_pop", Dialog.class.getName());
        }
        if (m21969m().size() <= 0) {
            act().finish();
        } else {
            i0e.m16065f(this.f20063s);
            new xh0.a(act()).j(String.format(Locale.CHINA, "聊聊信号将发送给%d个好友", Integer.valueOf(m21969m().size()))).g(true).b(true).r("确认").f("取消").o(new View.OnClickListener() { // from class: l.m05
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f16475a.m21975v(view);
                }
            }).c(new View.OnClickListener() { // from class: l.n05
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f17174a.m21976w(view);
                }
            }).m(new DialogInterface.OnDismissListener() { // from class: l.o05
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f17791a.m21977x(dialogInterface);
                }
            }).a().g();
        }
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m21965C0() {
        return this.f20061q;
    }

    @Nullable
    public Act act() {
        return this.f20061q;
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m21967k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m21967k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return t05.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void m21966i1(j05 j05Var) {
        this.f20062r = j05Var;
    }

    /* JADX INFO: renamed from: m */
    public List<ChatPartnerHistoryData> m21969m() {
        ArrayList arrayList = new ArrayList();
        for (ChatPartnerUserItem chatPartnerUserItem : this.f20064t) {
            if (chatPartnerUserItem.f5130d && NullChecker.a(chatPartnerUserItem.f5131e)) {
                arrayList.add(chatPartnerUserItem.f5131e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public String m21970n() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f20064t.size(); i++) {
            ChatPartnerUserItem chatPartnerUserItem = this.f20064t.get(i);
            if (chatPartnerUserItem.f5130d && NullChecker.a(chatPartnerUserItem.f5131e)) {
                if (i == 0) {
                    sb.append(chatPartnerUserItem.f5131e.id);
                } else {
                    sb.append(",");
                    sb.append(chatPartnerUserItem.f5131e.id);
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: p */
    public void m21971p() {
        ArrayList arrayList = new ArrayList();
        this.f20064t = arrayList;
        arrayList.add(this.f20050f);
        this.f20064t.add(this.f20051g);
        this.f20064t.add(this.f20052h);
        this.f20064t.add(this.f20053i);
        this.f20064t.add(this.f20054j);
        this.f20064t.add(this.f20055k);
        this.f20064t.add(this.f20056l);
        this.f20064t.add(this.f20057m);
        this.f20064t.add(this.f20058n);
        Iterator<ChatPartnerUserItem> it = this.f20064t.iterator();
        while (it.hasNext()) {
            xdl0.M((ChatPartnerUserItem) it.next(), false);
        }
        xdl0.X(this.f20046b, hmb.n1(act()) + t100.d(6.0f));
        xdl0.E0(this.f20046b, new View.OnClickListener() { // from class: l.k05
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15375a.m21972q(view);
            }
        });
        xdl0.E0(this.f20059o, new View.OnClickListener() { // from class: l.l05
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f15902a.m21973s(view);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m21972q(View view) {
        zvf0.r("e_back", act().pageId());
        m21964A();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m21973s(View view) {
        if (m21969m().size() > 0) {
            m21979z("p_chatting_partner_signal_result");
        } else {
            act().finish();
        }
        zvf0.u("e_confirm", act().pageId(), new j760[]{j760.a("receive_number", Integer.valueOf(m21969m().size())), j760.a("other_uid", m21970n()), j760.a("refer_source", this.f20062r.f14881c)});
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m21974u(Envelope envelope) {
        CoreModule.c.f0.Fo();
        CoreModule.N().Tg();
        if (TextUtils.equals(this.f20062r.getFrom(), "from_start_chatting_now_dialg")) {
            g4h0.d();
        }
        if (c30.f(act())) {
            act().finish();
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m21975v(View view) {
        zvf0.u("e_confirm", "p_chatting_partner_signal_back_pop", new j760[]{j760.a("receive_number", Integer.valueOf(m21969m().size()))});
        m21979z("p_chatting_partner_signal_back_pop");
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m21976w(View view) {
        zvf0.r("e_cancel", "p_chatting_partner_signal_back_pop");
        act().finish();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m21977x(DialogInterface dialogInterface) {
        i0e.m16064e(this.f20063s);
    }

    /* JADX INFO: renamed from: y */
    public void m21978y(List<ChatPartnerHistoryData> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i < this.f20064t.size()) {
                this.f20064t.get(i).m7327v(list.get(i));
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m21979z(String str) {
        if (CoreModule.K().me_().isBanned()) {
            JailedDialogLikeAct.o2(true);
            return;
        }
        if (CoreModule.K().me_().isJailedOrRestrict()) {
            ura.e().d().Vc();
            return;
        }
        if (CoreModule.N().Gc() == null) {
            Emotion emotionM16829f = j15.m16829f("聊天");
            if (NullChecker.a(emotionM16829f)) {
                zvf0.u("e_set_my_state_post", str, new j760[]{j760.a("state_id", emotionM16829f.id)});
            }
        }
        act().duringCreated(CoreModule.c.e0.ra(this.f20062r.m16817g0(), vwb.Q(m21969m(), new w9j() { // from class: l.p05
            public final Object call(Object obj) {
                return ((ChatPartnerHistoryData) obj).id;
            }
        }))).subscribe(mkd0.H(new e30() { // from class: l.q05
            public final void call(Object obj) {
                this.f18982a.m21974u((Envelope) obj);
            }
        }, new e30() { // from class: l.r05
            public final void call(Object obj) {
                lsi0.y("网络错误，请重试");
            }
        }));
    }

    public void destroy() {
    }
}
