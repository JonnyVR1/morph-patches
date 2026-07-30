package p149l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.ChatPartnerHistoryData;
import com.p046p1.mobile.putong.core.newui.partner.ChatPartnerUserItem;
import com.p046p1.mobile.putong.core.p053ui.VText_Bold;
import com.p046p1.mobile.putong.core.p053ui.account.JailedDialogLikeAct;
import com.p046p1.mobile.putong.data.Emotion;
import com.p046p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p147v.VImage;
import p147v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class s05 implements s7m<j05> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f161723a;

    /* JADX INFO: renamed from: b */
    public VImage f161724b;

    /* JADX INFO: renamed from: c */
    public VImage f161725c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f161726d;

    /* JADX INFO: renamed from: e */
    public VText f161727e;

    /* JADX INFO: renamed from: f */
    public ChatPartnerUserItem f161728f;

    /* JADX INFO: renamed from: g */
    public ChatPartnerUserItem f161729g;

    /* JADX INFO: renamed from: h */
    public ChatPartnerUserItem f161730h;

    /* JADX INFO: renamed from: i */
    public ChatPartnerUserItem f161731i;

    /* JADX INFO: renamed from: j */
    public ChatPartnerUserItem f161732j;

    /* JADX INFO: renamed from: k */
    public ChatPartnerUserItem f161733k;

    /* JADX INFO: renamed from: l */
    public ChatPartnerUserItem f161734l;

    /* JADX INFO: renamed from: m */
    public ChatPartnerUserItem f161735m;

    /* JADX INFO: renamed from: n */
    public ChatPartnerUserItem f161736n;

    /* JADX INFO: renamed from: o */
    public VText_Bold f161737o;

    /* JADX INFO: renamed from: p */
    public VText_Bold f161738p;

    /* JADX INFO: renamed from: q */
    public final Act f161739q;

    /* JADX INFO: renamed from: r */
    public j05 f161740r;

    /* JADX INFO: renamed from: s */
    public cwf0 f161741s;

    /* JADX INFO: renamed from: t */
    public List<ChatPartnerUserItem> f161742t;

    public s05(Act act) {
        this.f161739q = act;
    }

    /* JADX INFO: renamed from: A */
    public final void m181833A() {
        if (this.f161741s == null) {
            this.f161741s = i0e.m133794c("p_chatting_partner_signal_back_pop", Dialog.class.getName());
        }
        if (m181836m().size() <= 0) {
            getAct().m47815F2();
        } else {
            i0e.m133797f(this.f161741s);
            new xh0.C21150a(getAct()).m208731j(String.format(Locale.CHINA, "聊聊信号将发送给%d个好友", Integer.valueOf(m181836m().size()))).m208728g(true).m208723b(true).m208739r("确认").m208727f("取消").m208736o(new View.OnClickListener() { // from class: l.m05
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f130710a.m181842v(view);
                }
            }).m208724c(new View.OnClickListener() { // from class: l.n05
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f136470a.m181843w(view);
                }
            }).m208734m(new DialogInterface.OnDismissListener() { // from class: l.o05
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f141287a.m181844x(dialogInterface);
                }
            }).m208722a().m208721g();
        }
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f161739q;
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f161739q;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m181834k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m181834k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return t05.m186813b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(j05 j05Var) {
        this.f161740r = j05Var;
    }

    /* JADX INFO: renamed from: m */
    public List<ChatPartnerHistoryData> m181836m() {
        ArrayList arrayList = new ArrayList();
        for (ChatPartnerUserItem chatPartnerUserItem : this.f161742t) {
            if (chatPartnerUserItem.f26352d && NullChecker.m81303a(chatPartnerUserItem.f26353e)) {
                arrayList.add(chatPartnerUserItem.f26353e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public String m181837n() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f161742t.size(); i++) {
            ChatPartnerUserItem chatPartnerUserItem = this.f161742t.get(i);
            if (chatPartnerUserItem.f26352d && NullChecker.m81303a(chatPartnerUserItem.f26353e)) {
                if (i == 0) {
                    sb.append(chatPartnerUserItem.f26353e.f20368id);
                } else {
                    sb.append(Constants.SEPARATOR_COMMA);
                    sb.append(chatPartnerUserItem.f26353e.f20368id);
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: p */
    public void m181838p() {
        ArrayList arrayList = new ArrayList();
        this.f161742t = arrayList;
        arrayList.add(this.f161728f);
        this.f161742t.add(this.f161729g);
        this.f161742t.add(this.f161730h);
        this.f161742t.add(this.f161731i);
        this.f161742t.add(this.f161732j);
        this.f161742t.add(this.f161733k);
        this.f161742t.add(this.f161734l);
        this.f161742t.add(this.f161735m);
        this.f161742t.add(this.f161736n);
        Iterator<ChatPartnerUserItem> it = this.f161742t.iterator();
        while (it.hasNext()) {
            xdl0.m208344M(it.next(), false);
        }
        xdl0.m208360X(this.f161724b, hmb.m131709n1(getAct()) + t100.m186890d(6.0f));
        xdl0.m208329E0(this.f161724b, new View.OnClickListener() { // from class: l.k05
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f120451a.m181839q(view);
            }
        });
        xdl0.m208329E0(this.f161737o, new View.OnClickListener() { // from class: l.l05
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f125465a.m181840s(view);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m181839q(View view) {
        zvf0.m220396r("e_back", getAct().pageId());
        m181833A();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m181840s(View view) {
        if (m181836m().size() > 0) {
            m181846z("p_chatting_partner_signal_result");
        } else {
            getAct().m47815F2();
        }
        zvf0.m220399u("e_confirm", getAct().pageId(), j760.m140076a("receive_number", Integer.valueOf(m181836m().size())), j760.m140076a("other_uid", m181837n()), j760.m140076a("refer_source", this.f161740r.f115638c));
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m181841u(Envelope envelope) {
        CoreModule.f17545c.f19642f0.m32650Fo();
        CoreModule.m29934N().mo60320Tg();
        if (TextUtils.equals(this.f161740r.getFrom(), "from_start_chatting_now_dialg")) {
            g4h0.m124372d();
        }
        if (c30.m104964f(getAct())) {
            getAct().m47815F2();
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m181842v(View view) {
        zvf0.m220399u("e_confirm", "p_chatting_partner_signal_back_pop", j760.m140076a("receive_number", Integer.valueOf(m181836m().size())));
        m181846z("p_chatting_partner_signal_back_pop");
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m181843w(View view) {
        zvf0.m220396r("e_cancel", "p_chatting_partner_signal_back_pop");
        getAct().m47815F2();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m181844x(DialogInterface dialogInterface) {
        i0e.m133796e(this.f161741s);
    }

    /* JADX INFO: renamed from: y */
    public void m181845y(List<ChatPartnerHistoryData> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i < this.f161742t.size()) {
                this.f161742t.get(i).m43115v(list.get(i));
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m181846z(String str) {
        if (CoreModule.m29932K().me_().isBanned()) {
            JailedDialogLikeAct.m44186o2(true);
            return;
        }
        if (CoreModule.m29932K().me_().isJailedOrRestrict()) {
            ura.m195053e().m195057d().mo33765Vc();
            return;
        }
        if (CoreModule.m29934N().mo60276Gc() == null) {
            Emotion emotionM139226f = j15.m139226f("聊天");
            if (NullChecker.m81303a(emotionM139226f)) {
                zvf0.m220399u("e_set_my_state_post", str, j760.m140076a("state_id", emotionM139226f.f38748id));
            }
        }
        getAct().duringCreated(CoreModule.f17545c.f19639e0.m169536ra(this.f161740r.m139127g0(), vwb.m200303Q(m181836m(), new w9j() { // from class: l.p05
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ((ChatPartnerHistoryData) obj).f20368id;
            }
        }))).subscribe(mkd0.m154956H(new e30() { // from class: l.q05
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f152002a.m181841u((Envelope) obj);
            }
        }, new e30() { // from class: l.r05
            @Override // p149l.e30
            public final void call(Object obj) {
                lsi0.m151595y("网络错误，请重试");
            }
        }));
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
