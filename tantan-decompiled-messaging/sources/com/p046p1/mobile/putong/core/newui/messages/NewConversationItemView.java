package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.Dialog;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.C4740g;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.ChatHeat;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationType;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.newui.messages.NewConversationItemView;
import com.p046p1.mobile.putong.core.newui.messages.marriage.MarriageMsgAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import p133rx.C22306c;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;
import p149l.aaj;
import p149l.baj;
import p149l.c4g0;
import p149l.cpl;
import p149l.d30;
import p149l.dml;
import p149l.e30;
import p149l.fap;
import p149l.gm20;
import p149l.i36;
import p149l.j760;
import p149l.jo0;
import p149l.knb0;
import p149l.mkd0;
import p149l.mqi0;
import p149l.oa8;
import p149l.p36;
import p149l.pi6;
import p149l.q860;
import p149l.rd6;
import p149l.roj0;
import p149l.u59;
import p149l.upa;
import p149l.vwb;
import p149l.w9j;
import p149l.wj20;
import p149l.wl20;
import p149l.wp1;
import p149l.x9j;
import p149l.xaj0;
import p149l.xdl0;
import p149l.y9j;

/* JADX INFO: loaded from: classes11.dex */
public class NewConversationItemView extends ConversationItemView {

    /* JADX INFO: renamed from: w */
    public c4g0 f25275w;

    /* JADX INFO: renamed from: x */
    public C22392a<Integer> f25276x;

    /* JADX INFO: renamed from: y */
    public C22392a<ChatHeat> f25277y;

    public NewConversationItemView(Context context) {
        super(context);
        this.f25276x = C22392a.m221513c(0);
        this.f25277y = C22392a.m221513c(ChatHeat.new_());
    }

    /* JADX INFO: renamed from: E2 */
    public static /* synthetic */ knb0 m41684E2(Message message, ChatGroup chatGroup, User user, Conversation conversation, roj0 roj0Var) {
        return new knb0(message, chatGroup, user, conversation);
    }

    /* JADX INFO: renamed from: O2 */
    public static /* synthetic */ Conversation m41694O2(q860 q860Var) {
        if (!NullChecker.m81303a(q860Var) || vwb.m200296J(q860Var.f153135a)) {
            return null;
        }
        return (Conversation) q860Var.f153135a.get(0);
    }

    /* JADX INFO: renamed from: U2 */
    public static /* synthetic */ void m41700U2(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V2 */
    public static /* synthetic */ C22306c m41701V2(final j760 j760Var) {
        S s;
        return (((Conversation) j760Var.f116564a).unreadMessages == 0 || (s = j760Var.f116565b) == 0 || vwb.m200296J(((q860) s).f153135a)) ? C22306c.just(j760.m140076a(j760Var, null)) : CoreModule.f17545c.f19642f0.m32817Tn(((Conversation) vwb.m200292F(((q860) j760Var.f116565b).f153135a)).f56011id).map(new w9j() { // from class: l.sl20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return j760.m140076a(j760Var, (Message) vwb.m200292F(((q860) obj).f153135a));
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public static /* synthetic */ Message m41722r3(q860 q860Var) {
        return (Message) vwb.m200346r(q860Var.f153135a, new w9j() { // from class: l.fl20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                Message message = (Message) obj;
                return Boolean.valueOf((TEnum.equals(message.messageType, "tantan_verify_toast") || TEnum.equals(message.messageType, "live_vip_greet") || TEnum.equals(message.messageType, "local_tickle_tip") || TEnum.equals(message.messageType, MessageType.soul_test_guide) || TEnum.equals(message.messageType, "local_friend_comment_toast") || TEnum.equals(message.messageType, MessageType.local_intl_prompt_message_type)) ? false : true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: y3 */
    public /* synthetic */ void m41730y3(j760 j760Var) {
        this.f25276x.m132487l((Integer) j760Var.f116564a);
    }

    /* JADX INFO: renamed from: A3 */
    public final /* synthetic */ void m41732A3(cpl cplVar) {
        m40990P1(this.f24926m);
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ void m41733B3(cpl cplVar) {
        cplVar.mo42423X0(this.f24926m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ void m41734C3(xaj0 xaj0Var) {
        pi6 pi6Var = this.f24926m;
        pi6Var.f149102b = (User) xaj0Var.f191751a;
        pi6Var.f149101a = (Conversation) xaj0Var.f191752b;
        if (!vwb.m200296J(((q860) xaj0Var.f191753c).f153135a)) {
            this.f24926m.f149093I = (Message) ((q860) xaj0Var.f191753c).f153135a.get(0);
        }
        m178919b(this.f24925l, new e30() { // from class: l.rl20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159922a.m41733B3((cpl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ void m41735D3(cpl cplVar) {
        cplVar.mo41022t0(this.f24926m);
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ void m41736E3(cpl cplVar) {
        cplVar.mo42401J(this.f24926m);
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ void m41737F3(Conversation conversation) {
        this.f24926m.f149101a = conversation;
        m178919b(this.f24925l, new e30() { // from class: l.hl20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108307a.m41736E3((cpl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ void m41738G3(Message message) {
        this.f24924k.m132487l(message);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ void m41739H3(final pi6 pi6Var, knb0 knb0Var) {
        pi6Var.f149086B = (ChatGroup) knb0Var.f123874b;
        pi6Var.f149123w = (User) knb0Var.f123875c;
        pi6Var.m169159b((Message) knb0Var.f123873a);
        pi6Var.f149101a = (Conversation) knb0Var.f123876d;
        pi6Var.f149087C = this.f24922i;
        m178919b(this.f24925l, new e30() { // from class: l.kl20
            @Override // p149l.e30
            public final void call(Object obj) {
                ((cpl) obj).mo42413e(pi6Var);
            }
        });
        m178906S0(pi6Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ void m41740I3(final pi6 pi6Var, j760 j760Var) {
        F f = j760Var.f116564a;
        pi6Var.f149092H = ((Conversation) ((j760) f).f116564a).unreadMessages;
        pi6Var.f149091G = ((Conversation) ((j760) f).f116564a).latestTime;
        pi6Var.f149093I = (Message) j760Var.f116565b;
        pi6Var.f149098N = ((q860) ((j760) f).f116565b).f153135a.size();
        m178919b(this.f24925l, new e30() { // from class: l.pl20
            @Override // p149l.e30
            public final void call(Object obj) {
                ((cpl) obj).mo42421P(pi6Var);
            }
        });
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ void m41741J3(cpl cplVar) {
        cplVar.mo41014m0(this.f24926m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ void m41742K3(j760 j760Var, cpl cplVar) {
        cplVar.mo42434l0((Conversation) j760Var.f116565b, (User) j760Var.f116564a, this.f24926m);
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m41743L3(final j760 j760Var) {
        m178919b(this.f24925l, new e30() { // from class: l.ql20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155187a.m41742K3(j760Var, (cpl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m41744M3(cpl cplVar) {
        cplVar.mo40988F0(this.f24926m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m41745N3(j760 j760Var, cpl cplVar) {
        cplVar.mo41028z0((Conversation) j760Var.f116565b, (User) j760Var.f116564a, this.f24926m);
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m41746O3(final j760 j760Var) {
        m178919b(this.f24925l, new e30() { // from class: l.el20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92058a.m41745N3(j760Var, (cpl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m41747P3(cpl cplVar) {
        cplVar.mo42422U(this.f24926m);
    }

    /* JADX INFO: renamed from: Q3 */
    public final /* synthetic */ void m41748Q3(View view) {
        m40989O1().startActivity(MarriageMsgAct.m42489Z1(m40989O1()));
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ xaj0 m41749R3(Conversation conversation) {
        List<Message> listM165617j = CoreModule.f17553k.f91940c.m206068Z(conversation.f56011id, conversation.clearedTime, CoreModule.f17545c.f19642f0.m33001jg(conversation.f56011id, true)).m165617j();
        User userM169524oa = CoreModule.f17545c.f19639e0.m169524oa(conversation.f56011id);
        return xaj0.m207578a(conversation, userM169524oa, m178904R0(listM165617j, userM169524oa));
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ Conversation m41750S3(Conversation conversation) {
        this.f24926m.f149101a = conversation;
        return conversation;
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m41751T3(cpl cplVar) {
        cplVar.mo42470E(this.f24926m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m41752U3(j760 j760Var) {
        pi6 pi6Var = this.f24926m;
        F f = j760Var.f116564a;
        pi6Var.f149099O = (Conversation) ((xaj0) f).f191751a;
        pi6Var.f149102b = (User) ((xaj0) f).f191752b;
        pi6Var.f149093I = (Message) ((xaj0) f).f191753c;
        pi6Var.f149101a = (Conversation) j760Var.f116565b;
        m178919b(this.f24925l, new e30() { // from class: l.nl20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139502a.m41751T3((cpl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ Message m41753V3(List list) {
        return rd6.m178881t(list, this.f24926m.f149102b);
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m41754W3(Message message) {
        this.f24923j.m132487l(message);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m41755X3(cpl cplVar) {
        cplVar.mo42424d(this.f24926m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m41756Y3(xaj0 xaj0Var) {
        pi6 pi6Var = this.f24926m;
        pi6Var.f149102b = (User) xaj0Var.f191752b;
        pi6Var.m169159b((Message) xaj0Var.f191751a);
        this.f24926m.f149101a = (Conversation) xaj0Var.f191753c;
        m178919b(this.f24925l, new e30() { // from class: l.ol20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f144477a.m41755X3((cpl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m41757Z3(Conversation conversation, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (charSequence.equals(m40989O1().getString(R$string.f18622j))) {
            fap.m120254g(conversation);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ boolean m41758a4(final Conversation conversation, View view) {
        ArrayList arrayListM200324f0 = vwb.m200324f0(m40989O1().getString(R$string.f18622j));
        m40989O1().dialog().m20536f0((CharSequence[]) arrayListM200324f0.toArray(new CharSequence[arrayListM200324f0.size()])).m20537g0(new Dialog.InterfaceC4311g() { // from class: l.ll20
            @Override // com.p046p1.mobile.android.app.Dialog.InterfaceC4311g
            /* JADX INFO: renamed from: a */
            public final void mo20569a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                this.f128634a.m41757Z3(conversation, dialog, view2, i, charSequence);
            }
        }).m20568z0();
        return false;
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m41759b4(Conversation conversation, View view) {
        m40989O1().startActivity(MessagesAct.m48940e2(m40989O1(), conversation.f56011id, 25, vwb.m200311Y("theme_type", "greet_chat"), vwb.m200311Y("greet_from", "")));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m41760c4(final pi6 pi6Var, j760 j760Var) {
        pi6Var.f149102b = (User) j760Var.f116564a;
        pi6Var.f149101a = (Conversation) j760Var.f116565b;
        m178919b(this.f24925l, new e30() { // from class: l.jl20
            @Override // p149l.e30
            public final void call(Object obj) {
                ((cpl) obj).mo42425d0(pi6Var);
            }
        });
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m41761d4(cpl cplVar) {
        m40991Q1(this.f24926m);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m41762e4(cpl cplVar) {
        cplVar.mo42419G0(this.f24926m);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m41763f4(j760 j760Var) {
        this.f24926m.f149103c = (User) j760Var.f116564a;
        m178919b(this.f24925l, new e30() { // from class: l.gl20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103279a.m41762e4((cpl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m41764g4(roj0 roj0Var) {
        m41025v2();
    }

    @Override // com.p046p1.mobile.putong.core.newui.messages.ConversationItemView, p149l.rd6
    public /* bridge */ /* synthetic */ HashMap getUserLiveLabelHashMap() {
        return super.getUserLiveLabelHashMap();
    }

    /* JADX INFO: renamed from: h4 */
    public void m41765h4(p36 p36Var, Conversation conversation, d30 d30Var, boolean z, int i, String str) {
        pi6 pi6Var = new pi6(this, p36Var, conversation);
        pi6Var.f149105e = z;
        pi6Var.f149107g = i;
        pi6Var.f149113m = i;
        pi6Var.f149094J = d30Var;
        pi6Var.f149101a = conversation;
        pi6Var.f149125y = str;
        m41766i4(pi6Var);
    }

    /* JADX INFO: renamed from: i4 */
    public void m41766i4(final pi6 pi6Var) {
        if (pi6Var == null) {
            return;
        }
        this.f24926m = pi6Var;
        rd6.m178864C("NewConversationItemView start id = " + pi6Var.f149101a.f56011id);
        if (u59.m191811T() && (TextUtils.equals(pi6Var.f149101a.f56011id, "fake_conversation_greeting") || TextUtils.equals(pi6Var.f149101a.f56011id, "fake_conversation_anonymous_greeting"))) {
            pi6Var.f149102b = null;
        }
        pi6Var.f149108h = ((p36) pi6Var.f149104d).mo41521l();
        pi6Var.f149110j = "default";
        m178919b(this.f24925l, new e30() { // from class: l.mk20
            @Override // p149l.e30
            public final void call(Object obj) {
                ((cpl) obj).mo41022t0(pi6Var);
            }
        });
        if (pi6Var.f149122v) {
            return;
        }
        this.f25276x.m132487l(0);
        pi6Var.f149104d.mo67374c(m40989O1(), (u59.m191823d0() && CoreModule.m29935P().m94652b().mo35126v6(pi6Var.f149101a)) ? CoreModule.m29935P().m94652b().mo35093Da(pi6Var.f149101a.f56011id) : C22306c.just(new j760(-1, Boolean.FALSE))).subscribe(mkd0.m154955G(new e30() { // from class: l.nk20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139371a.m41730y3((j760) obj);
            }
        }));
        pi6Var.f149104d.mo67374c(m40989O1(), mkd0.m154988v(CoreModule.f17545c.f19639e0.m169410Ka(pi6Var.f149101a.otherUser).distinctUntilChanged(), CoreModule.f17545c.f19639e0.m169523o9().distinctUntilChanged(), m178912W(pi6Var.f149104d) ? CoreModule.f17545c.f19642f0.m32820Ue(pi6Var.f149101a.f56011id).distinctUntilChanged() : C22306c.just(pi6Var.f149101a), this.f25276x.distinctUntilChanged(), this.f24921h, this.f24923j.distinctUntilChanged(), new baj() { // from class: l.ok20
            @Override // p149l.baj
            /* JADX INFO: renamed from: a */
            public final Object mo100908a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                User user = (User) obj;
                User user2 = (User) obj2;
                Conversation conversation = (Conversation) obj3;
                Integer num = (Integer) obj4;
                return j760.m140076a(xaj0.m207578a(user, user2, conversation), j760.m140076a(num, (Message) obj6));
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.pk20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f149930a.m41781z3(pi6Var, (j760) obj);
            }
        }));
        m41780w4(pi6Var.f149101a.f56011id);
    }

    /* JADX INFO: renamed from: j4 */
    public void m41767j4(p36 p36Var, Conversation conversation, Act act) {
        if (this.f24926m == null) {
            this.f24926m = new pi6(this, p36Var, conversation);
        }
        m178919b(this.f24925l, new e30() { // from class: l.vj20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f181660a.m41732A3((cpl) obj);
            }
        });
        p36Var.mo67374c(act, C22306c.combineLatest(CoreModule.f17545c.f19639e0.m169410Ka(this.f24926m.f149101a.otherUser), CoreModule.f17545c.f19642f0.m32737Ne(this.f24926m.f149101a.f56011id), CoreModule.f17545c.f19642f0.m32817Tn(this.f24926m.f149101a.otherUser), new wj20())).subscribe(mkd0.m154955G(new e30() { // from class: l.xj20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193172a.m41734C3((xaj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k4 */
    public void m41768k4(p36 p36Var, Conversation conversation, d30 d30Var, boolean z, int i, String str) {
        pi6 pi6Var = new pi6(this, p36Var, conversation);
        this.f24926m = pi6Var;
        pi6Var.f149105e = z;
        pi6Var.f149107g = i;
        pi6Var.f149113m = i;
        pi6Var.f149094J = d30Var;
        pi6Var.f149101a = conversation;
        pi6Var.f149125y = str;
        if (u59.m191811T() && (TextUtils.equals(this.f24926m.f149101a.f56011id, "fake_conversation_greeting") || TextUtils.equals(this.f24926m.f149101a.f56011id, "fake_conversation_anonymous_greeting"))) {
            this.f24926m.f149102b = null;
        }
        pi6 pi6Var2 = this.f24926m;
        pi6Var2.f149108h = ((p36) pi6Var2.f149104d).mo41521l();
        this.f24926m.f149110j = "default";
        m178919b(this.f24925l, new e30() { // from class: l.rk20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f159772a.m41735D3((cpl) obj);
            }
        });
        pi6 pi6Var3 = this.f24926m;
        pi6Var3.f149104d.mo67374c(pi6Var3.f149124x, CoreModule.f17545c.f19642f0.m32737Ne(conversation.f56011id)).subscribe(mkd0.m154955G(new e30() { // from class: l.sk20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f164932a.m41737F3((Conversation) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l4 */
    public void m41769l4(p36 p36Var, Conversation conversation, d30 d30Var, boolean z, int i, String str) {
        pi6 pi6Var = new pi6(this, p36Var, conversation);
        pi6Var.f149105e = z;
        pi6Var.f149107g = i;
        pi6Var.f149094J = d30Var;
        pi6Var.f149125y = str;
        m41770m4(pi6Var);
    }

    /* JADX INFO: renamed from: m4 */
    public void m41770m4(final pi6 pi6Var) {
        if (pi6Var == null) {
            return;
        }
        this.f24926m = pi6Var;
        dml dmlVar = pi6Var.f149104d;
        PutongAct putongActM40989O1 = m40989O1();
        C4740g c4740g = CoreModule.f17545c.f19642f0;
        Conversation conversation = pi6Var.f149101a;
        dmlVar.mo67374c(putongActM40989O1, c4740g.m32829Un(conversation.f56011id, NullChecker.m81303a(conversation.group) ? pi6Var.f149101a.group.joinedTime : -1.0d).map(new w9j() { // from class: l.tk20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return NewConversationItemView.m41722r3((q860) obj);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.uk20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f176902a.m41738G3((Message) obj);
            }
        }));
        m178919b(this.f24925l, new e30() { // from class: l.vk20
            @Override // p149l.e30
            public final void call(Object obj) {
                ((cpl) obj).mo41013m(pi6Var);
            }
        });
        pi6Var.f149104d.mo67374c(m40989O1(), mkd0.m154987u(this.f24924k.distinctUntilChanged(), CoreModule.f17545c.f19645g0.m31908o6(pi6Var.f149101a.otherUser).distinctUntilChanged(), TextUtils.isEmpty(pi6Var.f149118r) ? C22306c.just(null) : CoreModule.f17545c.f19639e0.m169410Ka(pi6Var.f149118r).distinctUntilChanged(), CoreModule.f17545c.f19642f0.m32737Ne(pi6Var.f149101a.f56011id).distinctUntilChanged(), this.f24921h, new aaj() { // from class: l.wk20
            @Override // p149l.aaj
            /* JADX INFO: renamed from: a */
            public final Object mo95547a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return NewConversationItemView.m41684E2((Message) obj, (ChatGroup) obj2, (User) obj3, (Conversation) obj4, (roj0) obj5);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.xk20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193258a.m41739H3(pi6Var, (knb0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n4 */
    public void m41771n4(p36 p36Var) {
        m41772o4(new pi6(this, p36Var, null));
    }

    /* JADX INFO: renamed from: o4 */
    public void m41772o4(final pi6 pi6Var) {
        if (pi6Var == null) {
            return;
        }
        this.f24926m = pi6Var;
        pi6Var.f149090F = new AtomicInteger(0);
        m178919b(this.f24925l, new e30() { // from class: l.vl20
            @Override // p149l.e30
            public final void call(Object obj) {
                ((cpl) obj).mo41007h0(pi6Var);
            }
        });
        pi6Var.f149104d.mo67374c(m40989O1(), mkd0.m154984r(CoreModule.f17545c.f19642f0.m32737Ne(User.LOCAL_ID_INTL_SEE_LETTER), CoreModule.f17545c.f19642f0.m32586Ap(), new wl20())).flatMap(new w9j() { // from class: l.xl20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return NewConversationItemView.m41701V2((j760) obj);
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.yl20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198857a.m41740I3(pi6Var, (j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p4 */
    public void m41773p4(p36 p36Var, int i, List<Conversation> list) {
        if (vwb.m200296J(list)) {
            return;
        }
        pi6 pi6Var = new pi6(this, p36Var, list.get(0));
        this.f24926m = pi6Var;
        pi6Var.f149100P = list;
        pi6Var.f149107g = i;
        m178919b(this.f24925l, new e30() { // from class: l.cl20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f81364a.m41741J3((cpl) obj);
            }
        });
        mkd0.m154992z(this.f25275w);
        this.f25275w = null;
        this.f25275w = p36Var.mo67374c(m40989O1(), mkd0.m154984r(CoreModule.f17545c.f19639e0.m169410Ka(this.f24926m.f149101a.f56011id), CoreModule.f17553k.f91950m.uiGet(this.f24926m.f149101a.f56011id), new gm20())).subscribe(mkd0.m154955G(new e30() { // from class: l.dl20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f86776a.m41743L3((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q4 */
    public void m41774q4(p36 p36Var, int i) {
        Conversation conversationNew_ = Conversation.new_();
        String str = CoreModule.f17545c.f19642f0.f19868J0.get();
        conversationNew_.f56011id = str;
        conversationNew_.otherUser = str;
        if (this.f24926m == null) {
            this.f24926m = new pi6(this, p36Var, conversationNew_);
        }
        this.f24926m.f149107g = i;
        m178919b(this.f24925l, new e30() { // from class: l.kk20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123525a.m41744M3((cpl) obj);
            }
        });
        p36Var.mo67374c(m40989O1(), mkd0.m154984r(CoreModule.f17545c.f19639e0.m169410Ka(this.f24926m.f149101a.f56011id), CoreModule.f17553k.f91950m.uiGet(this.f24926m.f149101a.f56011id), new gm20())).subscribe(mkd0.m154955G(new e30() { // from class: l.lk20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f128443a.m41746O3((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r4 */
    public void m41775r4(p36 p36Var, Conversation conversation) {
        this.f24926m = new pi6(this, p36Var, conversation);
        m178919b(this.f24925l, new e30() { // from class: l.yj20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198578a.m41747P3((cpl) obj);
            }
        });
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.zj20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f203376a.m41748Q3(view);
            }
        });
        p36Var.mo67374c(m40989O1(), mkd0.m154984r(CoreModule.f17545c.f19642f0.m32916cf().map(new w9j() { // from class: l.ak20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return NewConversationItemView.m41694O2((q860) obj);
            }
        }).filter(new oa8()).observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.bk20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f75963a.m41749R3((Conversation) obj);
            }
        }), CoreModule.f17545c.f19642f0.m32737Ne(conversation.f56011id).map(new w9j() { // from class: l.ck20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f81271a.m41750S3((Conversation) obj);
            }
        }), new x9j() { // from class: l.dk20
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return j760.m140076a((xaj0) obj, (Conversation) obj2);
            }
        })).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.ek20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f91929a.m41752U3((j760) obj);
            }
        }, new e30() { // from class: l.gk20
            @Override // p149l.e30
            public final void call(Object obj) {
                NewConversationItemView.m41700U2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s4 */
    public void m41776s4(final Conversation conversation, wp1<Conversation> wp1Var) {
        if (this.f24926m == null) {
            this.f24926m = new pi6(this, wp1Var, conversation);
        }
        this.f24926m.f149104d.mo67374c(m40989O1(), CoreModule.f17553k.f91940c.m206065W(this.f24926m.f149101a.f56011id).m165620m().map(new w9j() { // from class: l.uj20
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f176732a.m41753V3((List) obj);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.fk20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98033a.m41754W3((Message) obj);
            }
        }));
        wp1Var.mo67374c(m40989O1(), mkd0.m154985s(this.f24923j.distinctUntilChanged(), CoreModule.f17545c.f19639e0.m169410Ka(conversation.otherUser).distinctUntilChanged(), CoreModule.f17545c.f19642f0.m32737Ne(conversation.f56011id).distinctUntilChanged(), new y9j() { // from class: l.qk20
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return xaj0.m207578a((Message) obj, (User) obj2, (Conversation) obj3);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.bl20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76158a.m41756Y3((xaj0) obj);
            }
        }));
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ml20
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f134402a.m41758a4(conversation, view);
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: l.ul20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f177008a.m41759b4(conversation, view);
            }
        });
    }

    /* JADX INFO: renamed from: t4 */
    public void m41777t4(final pi6 pi6Var) {
        if (pi6Var == null) {
            return;
        }
        this.f24926m = pi6Var;
        pi6Var.f149110j = "svip";
        m178919b(this.f24925l, new e30() { // from class: l.hk20
            @Override // p149l.e30
            public final void call(Object obj) {
                ((cpl) obj).mo40987A(pi6Var);
            }
        });
        pi6Var.f149104d.mo67374c(m40989O1(), mkd0.m154984r(CoreModule.f17545c.f19639e0.m169410Ka(pi6Var.f149101a.otherUser), CoreModule.f17545c.f19642f0.m32737Ne(pi6Var.f149101a.otherUser), new x9j() { // from class: l.ik20
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return j760.m140076a((User) obj, (Conversation) obj2);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.jk20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118333a.m41760c4(pi6Var, (j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u4 */
    public void m41778u4(dml dmlVar, Conversation conversation, d30 d30Var, int i, String str) {
        pi6 pi6Var = new pi6(this, dmlVar, conversation);
        pi6Var.f149125y = str;
        pi6Var.f149094J = d30Var;
        pi6Var.f149113m = i;
        m41777t4(pi6Var);
    }

    /* JADX INFO: renamed from: v4 */
    public void m41779v4(p36 p36Var, Act act) {
        if (this.f24926m == null) {
            this.f24926m = new pi6(this, p36Var, null);
        }
        m178919b(this.f24925l, new e30() { // from class: l.yk20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f198707a.m41761d4((cpl) obj);
            }
        });
        p36Var.mo67374c(act, C22306c.combineLatest(CoreModule.f17545c.f19639e0.m169523o9(), CoreModule.f17545c.f19642f0.f19893R0.obs().observeOn(jo0.m142408a()).distinctUntilChanged(), new x9j() { // from class: l.zk20
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return new j760((User) obj, (String) obj2);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.al20
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70400a.m41763f4((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w4 */
    public final void m41780w4(String str) {
        if (upa.m194809r1() && i36.m134149g().m134160o(str)) {
            this.f24926m.f149104d.mo67374c(m40989O1(), i36.m134149g().m134154i(str)).subscribe(mkd0.m154955G(new e30() { // from class: l.tl20
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f170991a.m41764g4((roj0) obj);
                }
            }));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ void m41781z3(final pi6 pi6Var, j760 j760Var) {
        F f = j760Var.f116564a;
        pi6Var.f149102b = (User) ((xaj0) f).f191751a;
        pi6Var.f149103c = (User) ((xaj0) f).f191752b;
        pi6Var.f149085A = NullChecker.m81303a(((j760) j760Var.f116565b).f116564a) ? ((Integer) ((j760) j760Var.f116565b).f116564a).intValue() : 0;
        pi6Var.m169159b((Message) ((j760) j760Var.f116565b).f116565b);
        long jM155944o = mqi0.m155944o();
        F f2 = j760Var.f116564a;
        if (((xaj0) f2).f191753c != 0) {
            pi6Var.f149101a = (Conversation) ((xaj0) f2).f191753c;
        } else if (!NullChecker.m81303a(pi6Var.f149101a) || !TextUtils.equals(pi6Var.f149101a.convType, ConversationType.intlSeeChatRequest)) {
            dml dmlVar = pi6Var.f149104d;
            if (dmlVar instanceof ConversationsList.C8130e) {
                ((ConversationsList.C8130e) dmlVar).m41511K(pi6Var.f149102b.f56011id);
                return;
            }
            return;
        }
        m178919b(this.f24925l, new e30() { // from class: l.il20
            @Override // p149l.e30
            public final void call(Object obj) {
                ((cpl) obj).mo42409Q0(pi6Var);
            }
        });
        m178906S0(pi6Var);
        if (m178912W(pi6Var.f149104d) && !((ConversationsList.C8130e) pi6Var.f149104d).m41526z(pi6Var.f149102b, pi6Var.f149101a)) {
            ((ConversationsList.C8130e) pi6Var.f149104d).m41511K(pi6Var.f149101a.f56011id);
        }
        StringBuilder sb = new StringBuilder("name = ");
        sb.append(NullChecker.m81303a(pi6Var.f149102b) ? pi6Var.f149102b.name : "");
        sb.append("  during = ");
        sb.append(mqi0.m155944o() - jM155944o);
        rd6.m178864C(sb.toString());
    }

    public NewConversationItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25276x = C22392a.m221513c(0);
        this.f25277y = C22392a.m221513c(ChatHeat.new_());
    }

    public NewConversationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25276x = C22392a.m221513c(0);
        this.f25277y = C22392a.m221513c(ChatHeat.new_());
    }
}
