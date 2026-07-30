package p153l;

import android.content.Context;
import android.content.DialogInterface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.ChatPartnerHistoryData;
import com.p051p1.mobile.putong.core.newui.partner.ChatPartnerUserItem;
import com.p051p1.mobile.putong.core.p058ui.VText_Bold;
import com.p051p1.mobile.putong.core.p058ui.account.JailedDialogLikeAct;
import com.p051p1.mobile.putong.data.Emotion;
import com.p051p1.mobile.putong.data.Envelope;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import p151v.VImage;
import p151v.VText;

/* JADX INFO: loaded from: classes11.dex */
public class r15 implements iam<i15> {

    /* JADX INFO: renamed from: a */
    public ConstraintLayout f160757a;

    /* JADX INFO: renamed from: b */
    public VImage f160758b;

    /* JADX INFO: renamed from: c */
    public VImage f160759c;

    /* JADX INFO: renamed from: d */
    public VText_Bold f160760d;

    /* JADX INFO: renamed from: e */
    public VText f160761e;

    /* JADX INFO: renamed from: f */
    public ChatPartnerUserItem f160762f;

    /* JADX INFO: renamed from: g */
    public ChatPartnerUserItem f160763g;

    /* JADX INFO: renamed from: h */
    public ChatPartnerUserItem f160764h;

    /* JADX INFO: renamed from: i */
    public ChatPartnerUserItem f160765i;

    /* JADX INFO: renamed from: j */
    public ChatPartnerUserItem f160766j;

    /* JADX INFO: renamed from: k */
    public ChatPartnerUserItem f160767k;

    /* JADX INFO: renamed from: l */
    public ChatPartnerUserItem f160768l;

    /* JADX INFO: renamed from: m */
    public ChatPartnerUserItem f160769m;

    /* JADX INFO: renamed from: n */
    public ChatPartnerUserItem f160770n;

    /* JADX INFO: renamed from: o */
    public VText_Bold f160771o;

    /* JADX INFO: renamed from: p */
    public VText_Bold f160772p;

    /* JADX INFO: renamed from: q */
    public final Act f160773q;

    /* JADX INFO: renamed from: r */
    public i15 f160774r;

    /* JADX INFO: renamed from: s */
    public l4g0 f160775s;

    /* JADX INFO: renamed from: t */
    public List<ChatPartnerUserItem> f160776t;

    public r15(Act act) {
        this.f160773q = act;
    }

    /* JADX INFO: renamed from: A */
    public final void m179373A() {
        if (this.f160775s == null) {
            this.f160775s = w1e.m204399c("p_chatting_partner_signal_back_pop", Dialog.class.getName());
        }
        if (m179376m().size() <= 0) {
            getAct().m48999H2();
        } else {
            w1e.m204402f(this.f160775s);
            new th0.C20312a(getAct()).m191151j(String.format(Locale.CHINA, "聊聊信号将发送给%d个好友", Integer.valueOf(m179376m().size()))).m191148g(true).m191143b(true).m191159r("确认").m191147f("取消").m191156o(new View.OnClickListener() { // from class: l.l15
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f129651a.m179382v(view);
                }
            }).m191144c(new View.OnClickListener() { // from class: l.m15
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f134387a.m179383w(view);
                }
            }).m191154m(new DialogInterface.OnDismissListener() { // from class: l.n15
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.f139723a.m179384x(dialogInterface);
                }
            }).m191142a().m191141g();
        }
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f160773q;
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: act */
    public Act getAct() {
        return this.f160773q;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m179374k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m179374k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return s15.m184016b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(i15 i15Var) {
        this.f160774r = i15Var;
    }

    /* JADX INFO: renamed from: m */
    public List<ChatPartnerHistoryData> m179376m() {
        ArrayList arrayList = new ArrayList();
        for (ChatPartnerUserItem chatPartnerUserItem : this.f160776t) {
            if (chatPartnerUserItem.f27094d && NullChecker.m82486a(chatPartnerUserItem.f27095e)) {
                arrayList.add(chatPartnerUserItem.f27095e);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public String m179377n() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.f160776t.size(); i++) {
            ChatPartnerUserItem chatPartnerUserItem = this.f160776t.get(i);
            if (chatPartnerUserItem.f27094d && NullChecker.m82486a(chatPartnerUserItem.f27095e)) {
                if (i == 0) {
                    sb.append(chatPartnerUserItem.f27095e.f21110id);
                } else {
                    sb.append(Constants.SEPARATOR_COMMA);
                    sb.append(chatPartnerUserItem.f27095e.f21110id);
                }
            }
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: p */
    public void m179378p() {
        ArrayList arrayList = new ArrayList();
        this.f160776t = arrayList;
        arrayList.add(this.f160762f);
        this.f160776t.add(this.f160763g);
        this.f160776t.add(this.f160764h);
        this.f160776t.add(this.f160765i);
        this.f160776t.add(this.f160766j);
        this.f160776t.add(this.f160767k);
        this.f160776t.add(this.f160768l);
        this.f160776t.add(this.f160769m);
        this.f160776t.add(this.f160770n);
        Iterator<ChatPartnerUserItem> it = this.f160776t.iterator();
        while (it.hasNext()) {
            bnl0.m105524M(it.next(), false);
        }
        bnl0.m105540X(this.f160758b, vnb.m201954n1(getAct()) + qa00.m175859d(6.0f));
        bnl0.m105509E0(this.f160758b, new View.OnClickListener() { // from class: l.j15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f117932a.m179379q(view);
            }
        });
        bnl0.m105509E0(this.f160771o, new View.OnClickListener() { // from class: l.k15
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f123450a.m179380s(view);
            }
        });
    }

    /* JADX INFO: renamed from: q */
    public final /* synthetic */ void m179379q(View view) {
        i4g0.m138520r("e_back", getAct().pageId());
        m179373A();
    }

    /* JADX INFO: renamed from: s */
    public final /* synthetic */ void m179380s(View view) {
        if (m179376m().size() > 0) {
            m179386z("p_chatting_partner_signal_result");
        } else {
            getAct().m48999H2();
        }
        i4g0.m138523u("e_confirm", getAct().pageId(), pf60.m172085a("receive_number", Integer.valueOf(m179376m().size())), pf60.m172085a("other_uid", m179377n()), pf60.m172085a("refer_source", this.f160774r.f112490c));
    }

    /* JADX INFO: renamed from: u */
    public final /* synthetic */ void m179381u(Envelope envelope) {
        CoreModule.f18264c.f20384f0.m33653Fo();
        CoreModule.m30932N().mo61504Tg();
        if (TextUtils.equals(this.f160774r.getFrom(), "from_start_chatting_now_dialg")) {
            och0.m167218d();
        }
        if (w20.m204491f(getAct())) {
            getAct().m48999H2();
        }
    }

    /* JADX INFO: renamed from: v */
    public final /* synthetic */ void m179382v(View view) {
        i4g0.m138523u("e_confirm", "p_chatting_partner_signal_back_pop", pf60.m172085a("receive_number", Integer.valueOf(m179376m().size())));
        m179386z("p_chatting_partner_signal_back_pop");
    }

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ void m179383w(View view) {
        i4g0.m138520r("e_cancel", "p_chatting_partner_signal_back_pop");
        getAct().m48999H2();
    }

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ void m179384x(DialogInterface dialogInterface) {
        w1e.m204401e(this.f160775s);
    }

    /* JADX INFO: renamed from: y */
    public void m179385y(List<ChatPartnerHistoryData> list) {
        for (int i = 0; i < list.size(); i++) {
            if (i < this.f160776t.size()) {
                this.f160776t.get(i).m44126v(list.get(i));
            }
        }
    }

    /* JADX INFO: renamed from: z */
    public final void m179386z(String str) {
        if (CoreModule.m30930K().me_().isBanned()) {
            JailedDialogLikeAct.m45369p2(true);
            return;
        }
        if (CoreModule.m30930K().me_().isJailedOrRestrict()) {
            gta.m132210e().m132214d().mo34768Vc();
            return;
        }
        if (CoreModule.m30932N().mo61460Gc() == null) {
            Emotion emotionM138165f = i25.m138165f("聊天");
            if (NullChecker.m82486a(emotionM138165f)) {
                i4g0.m138523u("e_set_my_state_post", str, pf60.m172085a("state_id", emotionM138165f.f39596id));
            }
        }
        getAct().duringCreated(CoreModule.f18264c.f20381e0.m116609ra(this.f160774r.m138077g0(), jyb.m147486Q(m179376m(), new qcj() { // from class: l.o15
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ((ChatPartnerHistoryData) obj).f21110id;
            }
        }))).subscribe(psd0.m173597H(new y20() { // from class: l.p15
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f150132a.m179381u((Envelope) obj);
            }
        }, new y20() { // from class: l.q15
            @Override // p153l.y20
            public final void call(Object obj) {
                o1j0.m165651y("网络错误，请重试");
            }
        }));
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
