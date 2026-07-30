package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.Dialog;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4891g;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.ChatHeat;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationType;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.newui.messages.NewConversationItemView;
import com.p051p1.mobile.putong.core.newui.messages.marriage.MarriageMsgAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p137rx.C22421c;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;
import p153l.bkj0;
import p153l.bnl0;
import p153l.d79;
import p153l.dq1;
import p153l.fcp;
import p153l.fo0;
import p153l.gra;
import p153l.gs20;
import p153l.gu20;
import p153l.jyb;
import p153l.kcg0;
import p153l.n46;
import p153l.orl;
import p153l.ovb0;
import p153l.pf60;
import p153l.pol;
import p153l.psd0;
import p153l.pzi0;
import p153l.qcj;
import p153l.qu20;
import p153l.rcj;
import p153l.sb8;
import p153l.scj;
import p153l.sj6;
import p153l.u46;
import p153l.ucj;
import p153l.ue6;
import p153l.uxj0;
import p153l.vcj;
import p153l.vg60;
import p153l.x20;
import p153l.y20;

/* JADX INFO: loaded from: classes11.dex */
public class NewConversationItemView extends ConversationItemView {

    /* JADX INFO: renamed from: w */
    public kcg0 f26017w;

    /* JADX INFO: renamed from: x */
    public C22507a<Integer> f26018x;

    /* JADX INFO: renamed from: y */
    public C22507a<ChatHeat> f26019y;

    public NewConversationItemView(Context context) {
        super(context);
        this.f26018x = C22507a.m222759c(0);
        this.f26019y = C22507a.m222759c(ChatHeat.new_());
    }

    /* JADX INFO: renamed from: E2 */
    public static /* synthetic */ ovb0 m42695E2(Message message, ChatGroup chatGroup, User user, Conversation conversation, uxj0 uxj0Var) {
        return new ovb0(message, chatGroup, user, conversation);
    }

    /* JADX INFO: renamed from: O2 */
    public static /* synthetic */ Conversation m42705O2(vg60 vg60Var) {
        if (!NullChecker.m82486a(vg60Var) || jyb.m147479J(vg60Var.f184001a)) {
            return null;
        }
        return (Conversation) vg60Var.f184001a.get(0);
    }

    /* JADX INFO: renamed from: U2 */
    public static /* synthetic */ void m42711U2(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V2 */
    public static /* synthetic */ C22421c m42712V2(final pf60 pf60Var) {
        S s;
        return (((Conversation) pf60Var.f152156a).unreadMessages == 0 || (s = pf60Var.f152157b) == 0 || jyb.m147479J(((vg60) s).f184001a)) ? C22421c.just(pf60.m172085a(pf60Var, null)) : CoreModule.f18264c.f20384f0.m33820Tn(((Conversation) jyb.m147475F(((vg60) pf60Var.f152157b).f184001a)).f56859id).map(new qcj() { // from class: l.cu20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return pf60.m172085a(pf60Var, (Message) jyb.m147475F(((vg60) obj).f184001a));
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public static /* synthetic */ Message m42733r3(vg60 vg60Var) {
        return (Message) jyb.m147529r(vg60Var.f184001a, new qcj() { // from class: l.pt20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                Message message = (Message) obj;
                return Boolean.valueOf((TEnum.equals(message.messageType, "tantan_verify_toast") || TEnum.equals(message.messageType, "live_vip_greet") || TEnum.equals(message.messageType, "local_tickle_tip") || TEnum.equals(message.messageType, MessageType.soul_test_guide) || TEnum.equals(message.messageType, "local_friend_comment_toast") || TEnum.equals(message.messageType, MessageType.local_intl_prompt_message_type)) ? false : true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y3 */
    public /* synthetic */ void m42741y3(pf60 pf60Var) {
        this.f26018x.m137019l((Integer) pf60Var.f152156a);
    }

    /* JADX INFO: renamed from: A3 */
    public final /* synthetic */ void m42743A3(orl orlVar) {
        m42001P1(this.f25668m);
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ void m42744B3(orl orlVar) {
        orlVar.mo43434X0(this.f25668m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ void m42745C3(bkj0 bkj0Var) {
        sj6 sj6Var = this.f25668m;
        sj6Var.f168927b = (User) bkj0Var.f77081a;
        sj6Var.f168926a = (Conversation) bkj0Var.f77082b;
        if (!jyb.m147479J(((vg60) bkj0Var.f77083c).f184001a)) {
            this.f25668m.f168918I = (Message) ((vg60) bkj0Var.f77083c).f184001a.get(0);
        }
        m195713b(this.f25667l, new y20() { // from class: l.bu20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78422a.m42744B3((orl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ void m42746D3(orl orlVar) {
        orlVar.mo42033t0(this.f25668m);
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ void m42747E3(orl orlVar) {
        orlVar.mo43412J(this.f25668m);
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ void m42748F3(Conversation conversation) {
        this.f25668m.f168926a = conversation;
        m195713b(this.f25667l, new y20() { // from class: l.rt20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164764a.m42747E3((orl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ void m42749G3(Message message) {
        this.f25666k.m137019l(message);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ void m42750H3(final sj6 sj6Var, ovb0 ovb0Var) {
        sj6Var.f168911B = (ChatGroup) ovb0Var.f149249b;
        sj6Var.f168948w = (User) ovb0Var.f149250c;
        sj6Var.m186060b((Message) ovb0Var.f149248a);
        sj6Var.f168926a = (Conversation) ovb0Var.f149251d;
        sj6Var.f168912C = this.f25664i;
        m195713b(this.f25667l, new y20() { // from class: l.ut20
            @Override // p153l.y20
            public final void call(Object obj) {
                ((orl) obj).mo43424e(sj6Var);
            }
        });
        m195700S0(sj6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ void m42751I3(final sj6 sj6Var, pf60 pf60Var) {
        F f = pf60Var.f152156a;
        sj6Var.f168917H = ((Conversation) ((pf60) f).f152156a).unreadMessages;
        sj6Var.f168916G = ((Conversation) ((pf60) f).f152156a).latestTime;
        sj6Var.f168918I = (Message) pf60Var.f152157b;
        sj6Var.f168923N = ((vg60) ((pf60) f).f152157b).f184001a.size();
        m195713b(this.f25667l, new y20() { // from class: l.zt20
            @Override // p153l.y20
            public final void call(Object obj) {
                ((orl) obj).mo43432P(sj6Var);
            }
        });
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ void m42752J3(orl orlVar) {
        orlVar.mo42025m0(this.f25668m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ void m42753K3(pf60 pf60Var, orl orlVar) {
        orlVar.mo43445l0((Conversation) pf60Var.f152157b, (User) pf60Var.f152156a, this.f25668m);
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m42754L3(final pf60 pf60Var) {
        m195713b(this.f25667l, new y20() { // from class: l.au20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73462a.m42753K3(pf60Var, (orl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m42755M3(orl orlVar) {
        orlVar.mo41999F0(this.f25668m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m42756N3(pf60 pf60Var, orl orlVar) {
        orlVar.mo42039z0((Conversation) pf60Var.f152157b, (User) pf60Var.f152156a, this.f25668m);
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m42757O3(final pf60 pf60Var) {
        m195713b(this.f25667l, new y20() { // from class: l.ot20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148920a.m42756N3(pf60Var, (orl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m42758P3(orl orlVar) {
        orlVar.mo43433U(this.f25668m);
    }

    /* JADX INFO: renamed from: Q3 */
    public final /* synthetic */ void m42759Q3(View view) {
        m42000O1().startActivity(MarriageMsgAct.m43500a2(m42000O1()));
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ bkj0 m42760R3(Conversation conversation) {
        List<Message> listM208674j = CoreModule.f18272k.f115535c.m189464Z(conversation.f56859id, conversation.clearedTime, CoreModule.f18264c.f20384f0.m34004jg(conversation.f56859id, true)).m208674j();
        User userM116597oa = CoreModule.f18264c.f20381e0.m116597oa(conversation.f56859id);
        return bkj0.m104818a(conversation, userM116597oa, m195698R0(listM208674j, userM116597oa));
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ Conversation m42761S3(Conversation conversation) {
        this.f25668m.f168926a = conversation;
        return conversation;
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m42762T3(orl orlVar) {
        orlVar.mo43481E(this.f25668m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m42763U3(pf60 pf60Var) {
        sj6 sj6Var = this.f25668m;
        F f = pf60Var.f152156a;
        sj6Var.f168924O = (Conversation) ((bkj0) f).f77081a;
        sj6Var.f168927b = (User) ((bkj0) f).f77082b;
        sj6Var.f168918I = (Message) ((bkj0) f).f77083c;
        sj6Var.f168926a = (Conversation) pf60Var.f152157b;
        m195713b(this.f25667l, new y20() { // from class: l.xt20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196179a.m42762T3((orl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ Message m42764V3(List list) {
        return ue6.m195675t(list, this.f25668m.f168927b);
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m42765W3(Message message) {
        this.f25665j.m137019l(message);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m42766X3(orl orlVar) {
        orlVar.mo43435d(this.f25668m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m42767Y3(bkj0 bkj0Var) {
        sj6 sj6Var = this.f25668m;
        sj6Var.f168927b = (User) bkj0Var.f77082b;
        sj6Var.m186060b((Message) bkj0Var.f77081a);
        this.f25668m.f168926a = (Conversation) bkj0Var.f77083c;
        m195713b(this.f25667l, new y20() { // from class: l.yt20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f201483a.m42766X3((orl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m42768Z3(Conversation conversation, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (charSequence.equals(m42000O1().getString(R$string.f19352j))) {
            fcp.m125021g(conversation);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ boolean m42769a4(final Conversation conversation, View view) {
        ArrayList arrayListM147507f0 = jyb.m147507f0(m42000O1().getString(R$string.f19352j));
        m42000O1().dialog().m21535f0((CharSequence[]) arrayListM147507f0.toArray(new CharSequence[arrayListM147507f0.size()])).m21536g0(new Dialog.InterfaceC4462g() { // from class: l.vt20
            @Override // com.p051p1.mobile.android.app.Dialog.InterfaceC4462g
            /* JADX INFO: renamed from: a */
            public final void mo21568a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                this.f185683a.m42768Z3(conversation, dialog, view2, i, charSequence);
            }
        }).m21567z0();
        return false;
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m42770b4(Conversation conversation, View view) {
        m42000O1().startActivity(MessagesAct.m50123g2(m42000O1(), conversation.f56859id, 25, jyb.m147494Y("theme_type", "greet_chat"), jyb.m147494Y("greet_from", "")));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m42771c4(final sj6 sj6Var, pf60 pf60Var) {
        sj6Var.f168927b = (User) pf60Var.f152156a;
        sj6Var.f168926a = (Conversation) pf60Var.f152157b;
        m195713b(this.f25667l, new y20() { // from class: l.tt20
            @Override // p153l.y20
            public final void call(Object obj) {
                ((orl) obj).mo43436d0(sj6Var);
            }
        });
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m42772d4(orl orlVar) {
        m42002Q1(this.f25668m);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m42773e4(orl orlVar) {
        orlVar.mo43430G0(this.f25668m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m42774f4(pf60 pf60Var) {
        this.f25668m.f168928c = (User) pf60Var.f152156a;
        m195713b(this.f25667l, new y20() { // from class: l.qt20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159381a.m42773e4((orl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m42775g4(uxj0 uxj0Var) {
        m42036v2();
    }

    @Override // com.p051p1.mobile.putong.core.newui.messages.ConversationItemView, p153l.ue6
    public /* bridge */ /* synthetic */ HashMap getUserLiveLabelHashMap() {
        return super.getUserLiveLabelHashMap();
    }

    /* JADX INFO: renamed from: h4 */
    public void m42776h4(u46 u46Var, Conversation conversation, x20 x20Var, boolean z, int i, String str) {
        sj6 sj6Var = new sj6(this, u46Var, conversation);
        sj6Var.f168930e = z;
        sj6Var.f168932g = i;
        sj6Var.f168938m = i;
        sj6Var.f168919J = x20Var;
        sj6Var.f168926a = conversation;
        sj6Var.f168950y = str;
        m42777i4(sj6Var);
    }

    /* JADX INFO: renamed from: i4 */
    public void m42777i4(final sj6 sj6Var) {
        if (sj6Var == null) {
            return;
        }
        this.f25668m = sj6Var;
        ue6.m195658C("NewConversationItemView start id = " + sj6Var.f168926a.f56859id);
        if (d79.m114662U() && (TextUtils.equals(sj6Var.f168926a.f56859id, "fake_conversation_greeting") || TextUtils.equals(sj6Var.f168926a.f56859id, "fake_conversation_anonymous_greeting"))) {
            sj6Var.f168927b = null;
        }
        sj6Var.f168933h = ((u46) sj6Var.f168929d).mo42532l();
        sj6Var.f168935j = "default";
        m195713b(this.f25667l, new y20() { // from class: l.ws20
            @Override // p153l.y20
            public final void call(Object obj) {
                ((orl) obj).mo42033t0(sj6Var);
            }
        });
        if (sj6Var.f168947v) {
            return;
        }
        this.f26018x.m137019l(0);
        sj6Var.f168929d.mo68557c(m42000O1(), (d79.m114675e0() && CoreModule.m30933P().m143406b().mo36129v6(sj6Var.f168926a)) ? CoreModule.m30933P().m143406b().mo36096Da(sj6Var.f168926a.f56859id) : C22421c.just(new pf60(-1, Boolean.FALSE))).subscribe(psd0.m173596G(new y20() { // from class: l.xs20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f196055a.m42741y3((pf60) obj);
            }
        }));
        sj6Var.f168929d.mo68557c(m42000O1(), psd0.m173629v(CoreModule.f18264c.f20381e0.m116483Ka(sj6Var.f168926a.otherUser).distinctUntilChanged(), CoreModule.f18264c.f20381e0.m116596o9().distinctUntilChanged(), m195706W(sj6Var.f168929d) ? CoreModule.f18264c.f20384f0.m33823Ue(sj6Var.f168926a.f56859id).distinctUntilChanged() : C22421c.just(sj6Var.f168926a), this.f26018x.distinctUntilChanged(), this.f25663h, this.f25665j.distinctUntilChanged(), new vcj() { // from class: l.ys20
            @Override // p153l.vcj
            /* JADX INFO: renamed from: a */
            public final Object mo103927a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                User user = (User) obj;
                User user2 = (User) obj2;
                Conversation conversation = (Conversation) obj3;
                Integer num = (Integer) obj4;
                return pf60.m172085a(bkj0.m104818a(user, user2, conversation), pf60.m172085a(num, (Message) obj6));
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.zs20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205843a.m42792z3(sj6Var, (pf60) obj);
            }
        }));
        m42791w4(sj6Var.f168926a.f56859id);
    }

    /* JADX INFO: renamed from: j4 */
    public void m42778j4(u46 u46Var, Conversation conversation, Act act) {
        if (this.f25668m == null) {
            this.f25668m = new sj6(this, u46Var, conversation);
        }
        m195713b(this.f25667l, new y20() { // from class: l.fs20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f100521a.m42743A3((orl) obj);
            }
        });
        u46Var.mo68557c(act, C22421c.combineLatest(CoreModule.f18264c.f20381e0.m116483Ka(this.f25668m.f168926a.otherUser), CoreModule.f18264c.f20384f0.m33740Ne(this.f25668m.f168926a.f56859id), CoreModule.f18264c.f20384f0.m33820Tn(this.f25668m.f168926a.otherUser), new gs20())).subscribe(psd0.m173596G(new y20() { // from class: l.hs20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111404a.m42745C3((bkj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k4 */
    public void m42779k4(u46 u46Var, Conversation conversation, x20 x20Var, boolean z, int i, String str) {
        sj6 sj6Var = new sj6(this, u46Var, conversation);
        this.f25668m = sj6Var;
        sj6Var.f168930e = z;
        sj6Var.f168932g = i;
        sj6Var.f168938m = i;
        sj6Var.f168919J = x20Var;
        sj6Var.f168926a = conversation;
        sj6Var.f168950y = str;
        if (d79.m114662U() && (TextUtils.equals(this.f25668m.f168926a.f56859id, "fake_conversation_greeting") || TextUtils.equals(this.f25668m.f168926a.f56859id, "fake_conversation_anonymous_greeting"))) {
            this.f25668m.f168927b = null;
        }
        sj6 sj6Var2 = this.f25668m;
        sj6Var2.f168933h = ((u46) sj6Var2.f168929d).mo42532l();
        this.f25668m.f168935j = "default";
        m195713b(this.f25667l, new y20() { // from class: l.bt20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f78323a.m42746D3((orl) obj);
            }
        });
        sj6 sj6Var3 = this.f25668m;
        sj6Var3.f168929d.mo68557c(sj6Var3.f168949x, CoreModule.f18264c.f20384f0.m33740Ne(conversation.f56859id)).subscribe(psd0.m173596G(new y20() { // from class: l.ct20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f83658a.m42748F3((Conversation) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l4 */
    public void m42780l4(u46 u46Var, Conversation conversation, x20 x20Var, boolean z, int i, String str) {
        sj6 sj6Var = new sj6(this, u46Var, conversation);
        sj6Var.f168930e = z;
        sj6Var.f168932g = i;
        sj6Var.f168919J = x20Var;
        sj6Var.f168950y = str;
        m42781m4(sj6Var);
    }

    /* JADX INFO: renamed from: m4 */
    public void m42781m4(final sj6 sj6Var) {
        if (sj6Var == null) {
            return;
        }
        this.f25668m = sj6Var;
        pol polVar = sj6Var.f168929d;
        PutongAct putongActM42000O1 = m42000O1();
        C4891g c4891g = CoreModule.f18264c.f20384f0;
        Conversation conversation = sj6Var.f168926a;
        polVar.mo68557c(putongActM42000O1, c4891g.m33832Un(conversation.f56859id, NullChecker.m82486a(conversation.group) ? sj6Var.f168926a.group.joinedTime : -1.0d).map(new qcj() { // from class: l.dt20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return NewConversationItemView.m42733r3((vg60) obj);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.et20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95680a.m42749G3((Message) obj);
            }
        }));
        m195713b(this.f25667l, new y20() { // from class: l.ft20
            @Override // p153l.y20
            public final void call(Object obj) {
                ((orl) obj).mo42024m(sj6Var);
            }
        });
        sj6Var.f168929d.mo68557c(m42000O1(), psd0.m173628u(this.f25666k.distinctUntilChanged(), CoreModule.f18264c.f20387g0.m32911o6(sj6Var.f168926a.otherUser).distinctUntilChanged(), TextUtils.isEmpty(sj6Var.f168943r) ? C22421c.just(null) : CoreModule.f18264c.f20381e0.m116483Ka(sj6Var.f168943r).distinctUntilChanged(), CoreModule.f18264c.f20384f0.m33740Ne(sj6Var.f168926a.f56859id).distinctUntilChanged(), this.f25663h, new ucj() { // from class: l.gt20
            @Override // p153l.ucj
            /* JADX INFO: renamed from: a */
            public final Object mo115512a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return NewConversationItemView.m42695E2((Message) obj, (ChatGroup) obj2, (User) obj3, (Conversation) obj4, (uxj0) obj5);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.ht20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f111503a.m42750H3(sj6Var, (ovb0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n4 */
    public void m42782n4(u46 u46Var) {
        m42783o4(new sj6(this, u46Var, null));
    }

    /* JADX INFO: renamed from: o4 */
    public void m42783o4(final sj6 sj6Var) {
        if (sj6Var == null) {
            return;
        }
        this.f25668m = sj6Var;
        sj6Var.f168915F = new AtomicInteger(0);
        m195713b(this.f25667l, new y20() { // from class: l.fu20
            @Override // p153l.y20
            public final void call(Object obj) {
                ((orl) obj).mo42018h0(sj6Var);
            }
        });
        sj6Var.f168929d.mo68557c(m42000O1(), psd0.m173625r(CoreModule.f18264c.f20384f0.m33740Ne(User.LOCAL_ID_INTL_SEE_LETTER), CoreModule.f18264c.f20384f0.m33589Ap(), new gu20())).flatMap(new qcj() { // from class: l.hu20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return NewConversationItemView.m42712V2((pf60) obj);
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.iu20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116887a.m42751I3(sj6Var, (pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p4 */
    public void m42784p4(u46 u46Var, int i, List<Conversation> list) {
        if (jyb.m147479J(list)) {
            return;
        }
        sj6 sj6Var = new sj6(this, u46Var, list.get(0));
        this.f25668m = sj6Var;
        sj6Var.f168925P = list;
        sj6Var.f168932g = i;
        m195713b(this.f25667l, new y20() { // from class: l.mt20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138540a.m42752J3((orl) obj);
            }
        });
        psd0.m173633z(this.f26017w);
        this.f26017w = null;
        this.f26017w = u46Var.mo68557c(m42000O1(), psd0.m173625r(CoreModule.f18264c.f20381e0.m116483Ka(this.f25668m.f168926a.f56859id), CoreModule.f18272k.f115545m.uiGet(this.f25668m.f168926a.f56859id), new qu20())).subscribe(psd0.m173596G(new y20() { // from class: l.nt20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f143575a.m42754L3((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q4 */
    public void m42785q4(u46 u46Var, int i) {
        Conversation conversationNew_ = Conversation.new_();
        String str = CoreModule.f18264c.f20384f0.f20610J0.get();
        conversationNew_.f56859id = str;
        conversationNew_.otherUser = str;
        if (this.f25668m == null) {
            this.f25668m = new sj6(this, u46Var, conversationNew_);
        }
        this.f25668m.f168932g = i;
        m195713b(this.f25667l, new y20() { // from class: l.us20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f180724a.m42755M3((orl) obj);
            }
        });
        u46Var.mo68557c(m42000O1(), psd0.m173625r(CoreModule.f18264c.f20381e0.m116483Ka(this.f25668m.f168926a.f56859id), CoreModule.f18272k.f115545m.uiGet(this.f25668m.f168926a.f56859id), new qu20())).subscribe(psd0.m173596G(new y20() { // from class: l.vs20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185551a.m42757O3((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r4 */
    public void m42786r4(u46 u46Var, Conversation conversation) {
        this.f25668m = new sj6(this, u46Var, conversation);
        m195713b(this.f25667l, new y20() { // from class: l.is20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116623a.m42758P3((orl) obj);
            }
        });
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.js20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f122424a.m42759Q3(view);
            }
        });
        u46Var.mo68557c(m42000O1(), psd0.m173625r(CoreModule.f18264c.f20384f0.m33919cf().map(new qcj() { // from class: l.ks20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return NewConversationItemView.m42705O2((vg60) obj);
            }
        }).filter(new sb8()).observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.ls20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f133386a.m42760R3((Conversation) obj);
            }
        }), CoreModule.f18264c.f20384f0.m33740Ne(conversation.f56859id).map(new qcj() { // from class: l.ms20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f138439a.m42761S3((Conversation) obj);
            }
        }), new rcj() { // from class: l.ns20
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return pf60.m172085a((bkj0) obj, (Conversation) obj2);
            }
        })).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.os20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148781a.m42763U3((pf60) obj);
            }
        }, new y20() { // from class: l.qs20
            @Override // p153l.y20
            public final void call(Object obj) {
                NewConversationItemView.m42711U2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s4 */
    public void m42787s4(final Conversation conversation, dq1<Conversation> dq1Var) {
        if (this.f25668m == null) {
            this.f25668m = new sj6(this, dq1Var, conversation);
        }
        this.f25668m.f168929d.mo68557c(m42000O1(), CoreModule.f18272k.f115535c.m189461W(this.f25668m.f168926a.f56859id).m208677m().map(new qcj() { // from class: l.es20
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f95562a.m42764V3((List) obj);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.ps20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f153871a.m42765W3((Message) obj);
            }
        }));
        dq1Var.mo68557c(m42000O1(), psd0.m173626s(this.f25665j.distinctUntilChanged(), CoreModule.f18264c.f20381e0.m116483Ka(conversation.otherUser).distinctUntilChanged(), CoreModule.f18264c.f20384f0.m33740Ne(conversation.f56859id).distinctUntilChanged(), new scj() { // from class: l.at20
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return bkj0.m104818a((Message) obj, (User) obj2, (Conversation) obj3);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.lt20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f133511a.m42767Y3((bkj0) obj);
            }
        }));
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.wt20
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f190709a.m42769a4(conversation, view);
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: l.eu20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f95836a.m42770b4(conversation, view);
            }
        });
    }

    /* JADX INFO: renamed from: t4 */
    public void m42788t4(final sj6 sj6Var) {
        if (sj6Var == null) {
            return;
        }
        this.f25668m = sj6Var;
        sj6Var.f168935j = "svip";
        m195713b(this.f25667l, new y20() { // from class: l.rs20
            @Override // p153l.y20
            public final void call(Object obj) {
                ((orl) obj).mo41998A(sj6Var);
            }
        });
        sj6Var.f168929d.mo68557c(m42000O1(), psd0.m173625r(CoreModule.f18264c.f20381e0.m116483Ka(sj6Var.f168926a.otherUser), CoreModule.f18264c.f20384f0.m33740Ne(sj6Var.f168926a.otherUser), new rcj() { // from class: l.ss20
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return pf60.m172085a((User) obj, (Conversation) obj2);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.ts20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f175957a.m42771c4(sj6Var, (pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u4 */
    public void m42789u4(pol polVar, Conversation conversation, x20 x20Var, int i, String str) {
        sj6 sj6Var = new sj6(this, polVar, conversation);
        sj6Var.f168950y = str;
        sj6Var.f168919J = x20Var;
        sj6Var.f168938m = i;
        m42788t4(sj6Var);
    }

    /* JADX INFO: renamed from: v4 */
    public void m42790v4(u46 u46Var, Act act) {
        if (this.f25668m == null) {
            this.f25668m = new sj6(this, u46Var, null);
        }
        m195713b(this.f25667l, new y20() { // from class: l.it20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116786a.m42772d4((orl) obj);
            }
        });
        u46Var.mo68557c(act, C22421c.combineLatest(CoreModule.f18264c.f20381e0.m116596o9(), CoreModule.f18264c.f20384f0.f20635R0.obs().observeOn(fo0.m126432a()).distinctUntilChanged(), new rcj() { // from class: l.jt20
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return new pf60((User) obj, (String) obj2);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.kt20
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128644a.m42774f4((pf60) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w4 */
    public final void m42791w4(String str) {
        if (gra.m131740r1() && n46.m161541g().m161552o(str)) {
            this.f25668m.f168929d.mo68557c(m42000O1(), n46.m161541g().m161546i(str)).subscribe(psd0.m173596G(new y20() { // from class: l.du20
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f90738a.m42775g4((uxj0) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ void m42792z3(final sj6 sj6Var, pf60 pf60Var) {
        F f = pf60Var.f152156a;
        sj6Var.f168927b = (User) ((bkj0) f).f77081a;
        sj6Var.f168928c = (User) ((bkj0) f).f77082b;
        sj6Var.f168910A = NullChecker.m82486a(((pf60) pf60Var.f152157b).f152156a) ? ((Integer) ((pf60) pf60Var.f152157b).f152156a).intValue() : 0;
        sj6Var.m186060b((Message) ((pf60) pf60Var.f152157b).f152157b);
        long jM174454o = pzi0.m174454o();
        F f2 = pf60Var.f152156a;
        if (((bkj0) f2).f77083c != 0) {
            sj6Var.f168926a = (Conversation) ((bkj0) f2).f77083c;
        } else if (!NullChecker.m82486a(sj6Var.f168926a) || !TextUtils.equals(sj6Var.f168926a.convType, ConversationType.intlSeeChatRequest)) {
            pol polVar = sj6Var.f168929d;
            if (polVar instanceof ConversationsList.C8281e) {
                ((ConversationsList.C8281e) polVar).m42522K(sj6Var.f168927b.f56859id);
                return;
            }
            return;
        }
        m195713b(this.f25667l, new y20() { // from class: l.st20
            @Override // p153l.y20
            public final void call(Object obj) {
                ((orl) obj).mo43420Q0(sj6Var);
            }
        });
        m195700S0(sj6Var);
        if (m195706W(sj6Var.f168929d) && !((ConversationsList.C8281e) sj6Var.f168929d).m42537z(sj6Var.f168927b, sj6Var.f168926a)) {
            ((ConversationsList.C8281e) sj6Var.f168929d).m42522K(sj6Var.f168926a.f56859id);
        }
        StringBuilder sb = new StringBuilder("name = ");
        sb.append(NullChecker.m82486a(sj6Var.f168927b) ? sj6Var.f168927b.name : "");
        sb.append("  during = ");
        sb.append(pzi0.m174454o() - jM174454o);
        ue6.m195658C(sb.toString());
    }

    public NewConversationItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26018x = C22507a.m222759c(0);
        this.f26019y = C22507a.m222759c(ChatHeat.new_());
    }

    public NewConversationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26018x = C22507a.m222759c(0);
        this.f26019y = C22507a.m222759c(ChatHeat.new_());
    }
}
