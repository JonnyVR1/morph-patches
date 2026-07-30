package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.p000p1.mobile.putong.core.newui.messages.NewConversationItemView;
import com.p000p1.mobile.putong.core.newui.messages.marriage.MarriageMsgAct;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.Dialog;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.g;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.ChatHeat;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import l.aaj;
import l.baj;
import l.c4g0;
import l.d30;
import l.dml;
import l.e30;
import l.fap;
import l.i36;
import l.j760;
import l.jo0;
import l.knb0;
import l.mkd0;
import l.oa8;
import l.roj0;
import l.u59;
import l.upa;
import l.vwb;
import l.w9j;
import l.wp1;
import l.x9j;
import l.xaj0;
import l.xdl0;
import l.y9j;
import p009l.cpl;
import p009l.gm20;
import p009l.mqi0;
import p009l.p36;
import p009l.pi6;
import p009l.q860;
import p009l.rd6;
import p009l.wj20;
import rx.c;
import rx.schedulers.Schedulers;
import rx.subjects.a;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class NewConversationItemView extends ConversationItemView {

    /* JADX INFO: renamed from: w */
    public c4g0 f4053w;

    /* JADX INFO: renamed from: x */
    public a<Integer> f4054x;

    /* JADX INFO: renamed from: y */
    public a<ChatHeat> f4055y;

    public NewConversationItemView(Context context) {
        super(context);
        this.f4054x = a.c(0);
        this.f4055y = a.c(ChatHeat.new_());
    }

    /* JADX INFO: renamed from: E2 */
    public static /* synthetic */ knb0 m5808E2(Message message, ChatGroup chatGroup, User user, Conversation conversation, roj0 roj0Var) {
        return new knb0(message, chatGroup, user, conversation);
    }

    /* JADX INFO: renamed from: O2 */
    public static /* synthetic */ Conversation m5818O2(q860 q860Var) {
        if (!NullChecker.a(q860Var) || vwb.J(q860Var.f19068a)) {
            return null;
        }
        return (Conversation) q860Var.f19068a.get(0);
    }

    /* JADX INFO: renamed from: U2 */
    public static /* synthetic */ void m5824U2(Throwable th) {
    }

    /* JADX INFO: renamed from: V2 */
    public static /* synthetic */ c m5825V2(final j760 j760Var) {
        Object obj;
        return (((Conversation) j760Var.a).unreadMessages == 0 || (obj = j760Var.b) == null || vwb.J(((q860) obj).f19068a)) ? c.just(j760.a(j760Var, (Object) null)) : CoreModule.c.f0.Tn(((DbObject) ((Conversation) vwb.F(((q860) j760Var.b).f19068a))).id).map(new w9j() { // from class: l.sl20
            public final Object call(Object obj2) {
                return j760.a(j760Var, (Message) vwb.F(((q860) obj2).f19068a));
            }
        });
    }

    /* JADX INFO: renamed from: r3 */
    public static /* synthetic */ Message m5846r3(q860 q860Var) {
        return (Message) vwb.r(q860Var.f19068a, new w9j() { // from class: l.fl20
            public final Object call(Object obj) {
                Message message = (Message) obj;
                return Boolean.valueOf((TEnum.equals(message.messageType, "tantan_verify_toast") || TEnum.equals(message.messageType, "live_vip_greet") || TEnum.equals(message.messageType, "local_tickle_tip") || TEnum.equals(message.messageType, "soul_test_guide") || TEnum.equals(message.messageType, "local_friend_comment_toast") || TEnum.equals(message.messageType, "local_intl_prompt_message_type")) ? false : true);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: y3 */
    public /* synthetic */ void m5854y3(j760 j760Var) {
        this.f4054x.onNext((Integer) j760Var.a);
    }

    /* JADX INFO: renamed from: A3 */
    public final /* synthetic */ void m5856A3(cpl cplVar) {
        m5091P1(this.f3704m);
    }

    /* JADX INFO: renamed from: B3 */
    public final /* synthetic */ void m5857B3(cpl cplVar) {
        cplVar.mo6578X0(this.f3704m);
    }

    /* JADX INFO: renamed from: C3 */
    public final /* synthetic */ void m5858C3(xaj0 xaj0Var) {
        pi6 pi6Var = this.f3704m;
        pi6Var.f18623b = (User) xaj0Var.a;
        pi6Var.f18622a = (Conversation) xaj0Var.b;
        if (!vwb.J(((q860) xaj0Var.c).f19068a)) {
            this.f3704m.f18614I = (Message) ((q860) xaj0Var.c).f19068a.get(0);
        }
        m21560b(this.f3703l, new e30() { // from class: l.rl20
            public final void call(Object obj) {
                this.f19899a.m5857B3((cpl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: D3 */
    public final /* synthetic */ void m5859D3(cpl cplVar) {
        cplVar.mo5123t0(this.f3704m);
    }

    /* JADX INFO: renamed from: E3 */
    public final /* synthetic */ void m5860E3(cpl cplVar) {
        cplVar.mo6556J(this.f3704m);
    }

    /* JADX INFO: renamed from: F3 */
    public final /* synthetic */ void m5861F3(Conversation conversation) {
        this.f3704m.f18622a = conversation;
        m21560b(this.f3703l, new e30() { // from class: l.hl20
            public final void call(Object obj) {
                this.f14165a.m5860E3((cpl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: G3 */
    public final /* synthetic */ void m5862G3(Message message) {
        this.f3702k.onNext(message);
    }

    /* JADX INFO: renamed from: H3 */
    public final /* synthetic */ void m5863H3(final pi6 pi6Var, knb0 knb0Var) {
        pi6Var.f18607B = (ChatGroup) knb0Var.b;
        pi6Var.f18644w = (User) knb0Var.c;
        pi6Var.m20298b((Message) knb0Var.a);
        pi6Var.f18622a = (Conversation) knb0Var.d;
        pi6Var.f18608C = this.f3700i;
        m21560b(this.f3703l, new e30() { // from class: l.kl20
            public final void call(Object obj) {
                ((cpl) obj).mo6568e(pi6Var);
            }
        });
        m21547S0(pi6Var);
    }

    /* JADX INFO: renamed from: I3 */
    public final /* synthetic */ void m5864I3(final pi6 pi6Var, j760 j760Var) {
        Object obj = j760Var.a;
        pi6Var.f18613H = ((Conversation) ((j760) obj).a).unreadMessages;
        pi6Var.f18612G = ((Conversation) ((j760) obj).a).latestTime;
        pi6Var.f18614I = (Message) j760Var.b;
        pi6Var.f18619N = ((q860) ((j760) obj).b).f19068a.size();
        m21560b(this.f3703l, new e30() { // from class: l.pl20
            public final void call(Object obj2) {
                ((cpl) obj2).mo6576P(pi6Var);
            }
        });
    }

    /* JADX INFO: renamed from: J3 */
    public final /* synthetic */ void m5865J3(cpl cplVar) {
        cplVar.mo5115m0(this.f3704m);
    }

    /* JADX INFO: renamed from: K3 */
    public final /* synthetic */ void m5866K3(j760 j760Var, cpl cplVar) {
        cplVar.mo6589l0((Conversation) j760Var.b, (User) j760Var.a, this.f3704m);
    }

    /* JADX INFO: renamed from: L3 */
    public final /* synthetic */ void m5867L3(final j760 j760Var) {
        m21560b(this.f3703l, new e30() { // from class: l.ql20
            public final void call(Object obj) {
                this.f19372a.m5866K3(j760Var, (cpl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: M3 */
    public final /* synthetic */ void m5868M3(cpl cplVar) {
        cplVar.mo5089F0(this.f3704m);
    }

    /* JADX INFO: renamed from: N3 */
    public final /* synthetic */ void m5869N3(j760 j760Var, cpl cplVar) {
        cplVar.mo5130z0((Conversation) j760Var.b, (User) j760Var.a, this.f3704m);
    }

    /* JADX INFO: renamed from: O3 */
    public final /* synthetic */ void m5870O3(final j760 j760Var) {
        m21560b(this.f3703l, new e30() { // from class: l.el20
            public final void call(Object obj) {
                this.f12598a.m5869N3(j760Var, (cpl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: P3 */
    public final /* synthetic */ void m5871P3(cpl cplVar) {
        cplVar.mo6577U(this.f3704m);
    }

    /* JADX INFO: renamed from: Q3 */
    public final /* synthetic */ void m5872Q3(View view) {
        m5090O1().startActivity(MarriageMsgAct.m6644Z1(m5090O1()));
    }

    /* JADX INFO: renamed from: R3 */
    public final /* synthetic */ xaj0 m5873R3(Conversation conversation) {
        List<Message> listJ = CoreModule.k.c.Z(((DbObject) conversation).id, conversation.clearedTime, CoreModule.c.f0.jg(((DbObject) conversation).id, true)).j();
        User userOa = CoreModule.c.e0.oa(((DbObject) conversation).id);
        return xaj0.a(conversation, userOa, m21545R0(listJ, userOa));
    }

    /* JADX INFO: renamed from: S3 */
    public final /* synthetic */ Conversation m5874S3(Conversation conversation) {
        this.f3704m.f18622a = conversation;
        return conversation;
    }

    /* JADX INFO: renamed from: T3 */
    public final /* synthetic */ void m5875T3(cpl cplVar) {
        cplVar.mo6625E(this.f3704m);
    }

    /* JADX INFO: renamed from: U3 */
    public final /* synthetic */ void m5876U3(j760 j760Var) {
        pi6 pi6Var = this.f3704m;
        Object obj = j760Var.a;
        pi6Var.f18620O = (Conversation) ((xaj0) obj).a;
        pi6Var.f18623b = (User) ((xaj0) obj).b;
        pi6Var.f18614I = (Message) ((xaj0) obj).c;
        pi6Var.f18622a = (Conversation) j760Var.b;
        m21560b(this.f3703l, new e30() { // from class: l.nl20
            public final void call(Object obj2) {
                this.f17567a.m5875T3((cpl) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: V3 */
    public final /* synthetic */ Message m5877V3(List list) {
        return rd6.m21522t(list, this.f3704m.f18623b);
    }

    /* JADX INFO: renamed from: W3 */
    public final /* synthetic */ void m5878W3(Message message) {
        this.f3701j.onNext(message);
    }

    /* JADX INFO: renamed from: X3 */
    public final /* synthetic */ void m5879X3(cpl cplVar) {
        cplVar.mo6579d(this.f3704m);
    }

    /* JADX INFO: renamed from: Y3 */
    public final /* synthetic */ void m5880Y3(xaj0 xaj0Var) {
        pi6 pi6Var = this.f3704m;
        pi6Var.f18623b = (User) xaj0Var.b;
        pi6Var.m20298b((Message) xaj0Var.a);
        this.f3704m.f18622a = (Conversation) xaj0Var.c;
        m21560b(this.f3703l, new e30() { // from class: l.ol20
            public final void call(Object obj) {
                this.f18129a.m5879X3((cpl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: Z3 */
    public final /* synthetic */ void m5881Z3(Conversation conversation, Dialog dialog, View view, int i, CharSequence charSequence) {
        if (charSequence.equals(m5090O1().getString(R.string.j))) {
            fap.g(conversation);
        }
    }

    /* JADX INFO: renamed from: a4 */
    public final /* synthetic */ boolean m5882a4(final Conversation conversation, View view) {
        ArrayList arrayListF0 = vwb.f0(new CharSequence[]{m5090O1().getString(R.string.j)});
        m5090O1().dialog().f0((CharSequence[]) arrayListF0.toArray(new CharSequence[arrayListF0.size()])).g0(new Dialog.g() { // from class: l.ll20
            /* JADX INFO: renamed from: a */
            public final void m17953a(Dialog dialog, View view2, int i, CharSequence charSequence) {
                this.f16244a.m5881Z3(conversation, dialog, view2, i, charSequence);
            }
        }).z0();
        return false;
    }

    /* JADX INFO: renamed from: b4 */
    public final /* synthetic */ void m5883b4(Conversation conversation, View view) {
        m5090O1().startActivity(MessagesAct.e2(m5090O1(), ((DbObject) conversation).id, 25, new j760[]{vwb.Y("theme_type", "greet_chat"), vwb.Y("greet_from", "")}));
    }

    /* JADX INFO: renamed from: c4 */
    public final /* synthetic */ void m5884c4(final pi6 pi6Var, j760 j760Var) {
        pi6Var.f18623b = (User) j760Var.a;
        pi6Var.f18622a = (Conversation) j760Var.b;
        m21560b(this.f3703l, new e30() { // from class: l.jl20
            public final void call(Object obj) {
                ((cpl) obj).mo6580d0(pi6Var);
            }
        });
    }

    /* JADX INFO: renamed from: d4 */
    public final /* synthetic */ void m5885d4(cpl cplVar) {
        m5092Q1(this.f3704m);
    }

    /* JADX INFO: renamed from: e4 */
    public final /* synthetic */ void m5886e4(cpl cplVar) {
        cplVar.mo6574G0(this.f3704m);
    }

    /* JADX INFO: renamed from: f4 */
    public final /* synthetic */ void m5887f4(j760 j760Var) {
        this.f3704m.f18624c = (User) j760Var.a;
        m21560b(this.f3703l, new e30() { // from class: l.gl20
            public final void call(Object obj) {
                this.f13638a.m5886e4((cpl) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g4 */
    public final /* synthetic */ void m5888g4(roj0 roj0Var) {
        m5127v2();
    }

    @Override // com.p000p1.mobile.putong.core.newui.messages.ConversationItemView, p009l.rd6
    public /* bridge */ /* synthetic */ HashMap getUserLiveLabelHashMap() {
        return super.getUserLiveLabelHashMap();
    }

    /* JADX INFO: renamed from: h4 */
    public void m5889h4(p36 p36Var, Conversation conversation, d30 d30Var, boolean z, int i, String str) {
        pi6 pi6Var = new pi6(this, p36Var, conversation);
        pi6Var.f18626e = z;
        pi6Var.f18628g = i;
        pi6Var.f18634m = i;
        pi6Var.f18615J = d30Var;
        pi6Var.f18622a = conversation;
        pi6Var.f18646y = str;
        m5890i4(pi6Var);
    }

    /* JADX INFO: renamed from: i4 */
    public void m5890i4(final pi6 pi6Var) {
        if (pi6Var == null) {
            return;
        }
        this.f3704m = pi6Var;
        rd6.m21505C("NewConversationItemView start id = " + ((DbObject) pi6Var.f18622a).id);
        if (u59.T() && (TextUtils.equals(((DbObject) pi6Var.f18622a).id, "fake_conversation_greeting") || TextUtils.equals(((DbObject) pi6Var.f18622a).id, "fake_conversation_anonymous_greeting"))) {
            pi6Var.f18623b = null;
        }
        pi6Var.f18629h = ((p36) pi6Var.f18625d).mo5629l();
        pi6Var.f18631j = "default";
        m21560b(this.f3703l, new e30() { // from class: l.mk20
            public final void call(Object obj) {
                ((cpl) obj).mo5123t0(pi6Var);
            }
        });
        if (pi6Var.f18643v) {
            return;
        }
        this.f4054x.onNext(0);
        pi6Var.f18625d.c(m5090O1(), (u59.d0() && CoreModule.P().b().v6(pi6Var.f18622a)) ? CoreModule.P().b().Da(((DbObject) pi6Var.f18622a).id) : c.just(new j760(-1, Boolean.FALSE))).subscribe(mkd0.G(new e30() { // from class: l.nk20
            public final void call(Object obj) {
                this.f17549a.m5854y3((j760) obj);
            }
        }));
        pi6Var.f18625d.c(m5090O1(), mkd0.v(CoreModule.c.e0.Ka(pi6Var.f18622a.otherUser).distinctUntilChanged(), CoreModule.c.e0.o9().distinctUntilChanged(), m21553W(pi6Var.f18625d) ? CoreModule.c.f0.Ue(((DbObject) pi6Var.f18622a).id).distinctUntilChanged() : c.just(pi6Var.f18622a), this.f4054x.distinctUntilChanged(), this.f3699h, this.f3701j.distinctUntilChanged(), new baj() { // from class: l.ok20
            /* JADX INFO: renamed from: a */
            public final Object m19916a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
                User user = (User) obj;
                User user2 = (User) obj2;
                Conversation conversation = (Conversation) obj3;
                Integer num = (Integer) obj4;
                return j760.a(xaj0.a(user, user2, conversation), j760.a(num, (Message) obj6));
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.pk20
            public final void call(Object obj) {
                this.f18760a.m5905z3(pi6Var, (j760) obj);
            }
        }));
        m5904w4(((DbObject) pi6Var.f18622a).id);
    }

    /* JADX INFO: renamed from: j4 */
    public void m5891j4(p36 p36Var, Conversation conversation, Act act) {
        if (this.f3704m == null) {
            this.f3704m = new pi6(this, p36Var, conversation);
        }
        m21560b(this.f3703l, new e30() { // from class: l.vj20
            public final void call(Object obj) {
                this.f21600a.m5856A3((cpl) obj);
            }
        });
        p36Var.c(act, c.combineLatest(CoreModule.c.e0.Ka(this.f3704m.f18622a.otherUser), CoreModule.c.f0.Ne(((DbObject) this.f3704m.f18622a).id), CoreModule.c.f0.Tn(this.f3704m.f18622a.otherUser), new wj20())).subscribe(mkd0.G(new e30() { // from class: l.xj20
            public final void call(Object obj) {
                this.f22624a.m5858C3((xaj0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: k4 */
    public void m5892k4(p36 p36Var, Conversation conversation, d30 d30Var, boolean z, int i, String str) {
        pi6 pi6Var = new pi6(this, p36Var, conversation);
        this.f3704m = pi6Var;
        pi6Var.f18626e = z;
        pi6Var.f18628g = i;
        pi6Var.f18634m = i;
        pi6Var.f18615J = d30Var;
        pi6Var.f18622a = conversation;
        pi6Var.f18646y = str;
        if (u59.T() && (TextUtils.equals(((DbObject) this.f3704m.f18622a).id, "fake_conversation_greeting") || TextUtils.equals(((DbObject) this.f3704m.f18622a).id, "fake_conversation_anonymous_greeting"))) {
            this.f3704m.f18623b = null;
        }
        pi6 pi6Var2 = this.f3704m;
        pi6Var2.f18629h = ((p36) pi6Var2.f18625d).mo5629l();
        this.f3704m.f18631j = "default";
        m21560b(this.f3703l, new e30() { // from class: l.rk20
            public final void call(Object obj) {
                this.f19880a.m5859D3((cpl) obj);
            }
        });
        pi6 pi6Var3 = this.f3704m;
        pi6Var3.f18625d.c(pi6Var3.f18645x, CoreModule.c.f0.Ne(((DbObject) conversation).id)).subscribe(mkd0.G(new e30() { // from class: l.sk20
            public final void call(Object obj) {
                this.f20319a.m5861F3((Conversation) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: l4 */
    public void m5893l4(p36 p36Var, Conversation conversation, d30 d30Var, boolean z, int i, String str) {
        pi6 pi6Var = new pi6(this, p36Var, conversation);
        pi6Var.f18626e = z;
        pi6Var.f18628g = i;
        pi6Var.f18615J = d30Var;
        pi6Var.f18646y = str;
        m5894m4(pi6Var);
    }

    /* JADX INFO: renamed from: m4 */
    public void m5894m4(final pi6 pi6Var) {
        if (pi6Var == null) {
            return;
        }
        this.f3704m = pi6Var;
        dml dmlVar = pi6Var.f18625d;
        PutongAct putongActM5090O1 = m5090O1();
        g gVar = CoreModule.c.f0;
        Conversation conversation = pi6Var.f18622a;
        dmlVar.c(putongActM5090O1, gVar.Un(((DbObject) conversation).id, NullChecker.a(conversation.group) ? pi6Var.f18622a.group.joinedTime : -1.0d).map(new w9j() { // from class: l.tk20
            public final Object call(Object obj) {
                return NewConversationItemView.m5846r3((q860) obj);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.uk20
            public final void call(Object obj) {
                this.f21232a.m5862G3((Message) obj);
            }
        }));
        m21560b(this.f3703l, new e30() { // from class: l.vk20
            public final void call(Object obj) {
                ((cpl) obj).mo5114m(pi6Var);
            }
        });
        pi6Var.f18625d.c(m5090O1(), mkd0.u(this.f3702k.distinctUntilChanged(), CoreModule.c.g0.o6(pi6Var.f18622a.otherUser).distinctUntilChanged(), TextUtils.isEmpty(pi6Var.f18639r) ? c.just((Object) null) : CoreModule.c.e0.Ka(pi6Var.f18639r).distinctUntilChanged(), CoreModule.c.f0.Ne(((DbObject) pi6Var.f18622a).id).distinctUntilChanged(), this.f3699h, new aaj() { // from class: l.wk20
            /* JADX INFO: renamed from: a */
            public final Object m24306a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                return NewConversationItemView.m5808E2((Message) obj, (ChatGroup) obj2, (User) obj3, (Conversation) obj4, (roj0) obj5);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.xk20
            public final void call(Object obj) {
                this.f22632a.m5863H3(pi6Var, (knb0) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: n4 */
    public void m5895n4(p36 p36Var) {
        m5896o4(new pi6(this, p36Var, null));
    }

    /* JADX INFO: renamed from: o4 */
    public void m5896o4(final pi6 pi6Var) {
        if (pi6Var == null) {
            return;
        }
        this.f3704m = pi6Var;
        pi6Var.f18611F = new AtomicInteger(0);
        m21560b(this.f3703l, new e30() { // from class: l.vl20
            public final void call(Object obj) {
                ((cpl) obj).mo5108h0(pi6Var);
            }
        });
        pi6Var.f18625d.c(m5090O1(), mkd0.r(CoreModule.c.f0.Ne("-770011"), CoreModule.c.f0.Ap(), new x9j() { // from class: l.wl20
            public final Object call(Object obj, Object obj2) {
                return j760.a((Conversation) obj, (q860) obj2);
            }
        })).flatMap(new w9j() { // from class: l.xl20
            public final Object call(Object obj) {
                return NewConversationItemView.m5825V2((j760) obj);
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.yl20
            public final void call(Object obj) {
                this.f23132a.m5864I3(pi6Var, (j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: p4 */
    public void m5897p4(p36 p36Var, int i, List<Conversation> list) {
        if (vwb.J(list)) {
            return;
        }
        pi6 pi6Var = new pi6(this, p36Var, list.get(0));
        this.f3704m = pi6Var;
        pi6Var.f18621P = list;
        pi6Var.f18628g = i;
        m21560b(this.f3703l, new e30() { // from class: l.cl20
            public final void call(Object obj) {
                this.f10661a.m5865J3((cpl) obj);
            }
        });
        mkd0.z(this.f4053w);
        this.f4053w = null;
        this.f4053w = p36Var.c(m5090O1(), mkd0.r(CoreModule.c.e0.Ka(((DbObject) this.f3704m.f18622a).id), CoreModule.k.m.uiGet(((DbObject) this.f3704m.f18622a).id), new gm20())).subscribe(mkd0.G(new e30() { // from class: l.dl20
            public final void call(Object obj) {
                this.f11894a.m5867L3((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: q4 */
    public void m5898q4(p36 p36Var, int i) {
        Conversation conversationNew_ = Conversation.new_();
        String str = (String) CoreModule.c.f0.J0.get();
        ((DbObject) conversationNew_).id = str;
        conversationNew_.otherUser = str;
        if (this.f3704m == null) {
            this.f3704m = new pi6(this, p36Var, conversationNew_);
        }
        this.f3704m.f18628g = i;
        m21560b(this.f3703l, new e30() { // from class: l.kk20
            public final void call(Object obj) {
                this.f15740a.m5868M3((cpl) obj);
            }
        });
        p36Var.c(m5090O1(), mkd0.r(CoreModule.c.e0.Ka(((DbObject) this.f3704m.f18622a).id), CoreModule.k.m.uiGet(((DbObject) this.f3704m.f18622a).id), new gm20())).subscribe(mkd0.G(new e30() { // from class: l.lk20
            public final void call(Object obj) {
                this.f16202a.m5870O3((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: r4 */
    public void m5899r4(p36 p36Var, Conversation conversation) {
        this.f3704m = new pi6(this, p36Var, conversation);
        m21560b(this.f3703l, new e30() { // from class: l.yj20
            public final void call(Object obj) {
                this.f23102a.m5871P3((cpl) obj);
            }
        });
        xdl0.E0(this, new View.OnClickListener() { // from class: l.zj20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f23705a.m5872Q3(view);
            }
        });
        p36Var.c(m5090O1(), mkd0.r(CoreModule.c.f0.cf().map(new w9j() { // from class: l.ak20
            public final Object call(Object obj) {
                return NewConversationItemView.m5818O2((q860) obj);
            }
        }).filter(new oa8()).observeOn(Schedulers.io()).map(new w9j() { // from class: l.bk20
            public final Object call(Object obj) {
                return this.f10146a.m5873R3((Conversation) obj);
            }
        }), CoreModule.c.f0.Ne(((DbObject) conversation).id).map(new w9j() { // from class: l.ck20
            public final Object call(Object obj) {
                return this.f10650a.m5874S3((Conversation) obj);
            }
        }), new x9j() { // from class: l.dk20
            public final Object call(Object obj, Object obj2) {
                return j760.a((xaj0) obj, (Conversation) obj2);
            }
        })).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.ek20
            public final void call(Object obj) {
                this.f12591a.m5876U3((j760) obj);
            }
        }, new e30() { // from class: l.gk20
            public final void call(Object obj) {
                NewConversationItemView.m5824U2((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: s4 */
    public void m5900s4(final Conversation conversation, wp1<Conversation> wp1Var) {
        if (this.f3704m == null) {
            this.f3704m = new pi6(this, wp1Var, conversation);
        }
        this.f3704m.f18625d.c(m5090O1(), CoreModule.k.c.W(((DbObject) this.f3704m.f18622a).id).m().map(new w9j() { // from class: l.uj20
            public final Object call(Object obj) {
                return this.f21207a.m5877V3((List) obj);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.fk20
            public final void call(Object obj) {
                this.f13069a.m5878W3((Message) obj);
            }
        }));
        wp1Var.c(m5090O1(), mkd0.s(this.f3701j.distinctUntilChanged(), CoreModule.c.e0.Ka(conversation.otherUser).distinctUntilChanged(), CoreModule.c.f0.Ne(((DbObject) conversation).id).distinctUntilChanged(), new y9j() { // from class: l.qk20
            /* JADX INFO: renamed from: a */
            public final Object m21079a(Object obj, Object obj2, Object obj3) {
                return xaj0.a((Message) obj, (User) obj2, (Conversation) obj3);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.bl20
            public final void call(Object obj) {
                this.f10167a.m5880Y3((xaj0) obj);
            }
        }));
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.ml20
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f16987a.m5882a4(conversation, view);
            }
        });
        setOnClickListener(new View.OnClickListener() { // from class: l.ul20
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21236a.m5883b4(conversation, view);
            }
        });
    }

    /* JADX INFO: renamed from: t4 */
    public void m5901t4(final pi6 pi6Var) {
        if (pi6Var == null) {
            return;
        }
        this.f3704m = pi6Var;
        pi6Var.f18631j = "svip";
        m21560b(this.f3703l, new e30() { // from class: l.hk20
            public final void call(Object obj) {
                ((cpl) obj).mo5088A(pi6Var);
            }
        });
        pi6Var.f18625d.c(m5090O1(), mkd0.r(CoreModule.c.e0.Ka(pi6Var.f18622a.otherUser), CoreModule.c.f0.Ne(pi6Var.f18622a.otherUser), new x9j() { // from class: l.ik20
            public final Object call(Object obj, Object obj2) {
                return j760.a((User) obj, (Conversation) obj2);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.jk20
            public final void call(Object obj) {
                this.f15213a.m5884c4(pi6Var, (j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: u4 */
    public void m5902u4(dml dmlVar, Conversation conversation, d30 d30Var, int i, String str) {
        pi6 pi6Var = new pi6(this, dmlVar, conversation);
        pi6Var.f18646y = str;
        pi6Var.f18615J = d30Var;
        pi6Var.f18634m = i;
        m5901t4(pi6Var);
    }

    /* JADX INFO: renamed from: v4 */
    public void m5903v4(p36 p36Var, Act act) {
        if (this.f3704m == null) {
            this.f3704m = new pi6(this, p36Var, null);
        }
        m21560b(this.f3703l, new e30() { // from class: l.yk20
            public final void call(Object obj) {
                this.f23111a.m5885d4((cpl) obj);
            }
        });
        p36Var.c(act, c.combineLatest(CoreModule.c.e0.o9(), CoreModule.c.f0.R0.obs().observeOn(jo0.a()).distinctUntilChanged(), new x9j() { // from class: l.zk20
            public final Object call(Object obj, Object obj2) {
                return new j760((User) obj, (String) obj2);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.al20
            public final void call(Object obj) {
                this.f9562a.m5887f4((j760) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: w4 */
    public final void m5904w4(String str) {
        if (upa.r1() && i36.g().o(str)) {
            this.f3704m.f18625d.c(m5090O1(), i36.g().i(str)).subscribe(mkd0.G(new e30() { // from class: l.tl20
                public final void call(Object obj) {
                    this.f20762a.m5888g4((roj0) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: z3 */
    public final /* synthetic */ void m5905z3(final pi6 pi6Var, j760 j760Var) {
        Object obj = j760Var.a;
        pi6Var.f18623b = (User) ((xaj0) obj).a;
        pi6Var.f18624c = (User) ((xaj0) obj).b;
        pi6Var.f18606A = NullChecker.a(((j760) j760Var.b).a) ? ((Integer) ((j760) j760Var.b).a).intValue() : 0;
        pi6Var.m20298b((Message) ((j760) j760Var.b).b);
        long jM18550o = mqi0.m18550o();
        Object obj2 = j760Var.a;
        if (((xaj0) obj2).c != null) {
            pi6Var.f18622a = (Conversation) ((xaj0) obj2).c;
        } else if (!NullChecker.a(pi6Var.f18622a) || !TextUtils.equals(pi6Var.f18622a.convType, "intlSeeChatRequest")) {
            dml dmlVar = pi6Var.f18625d;
            if (dmlVar instanceof ConversationsList.C0294e) {
                ((ConversationsList.C0294e) dmlVar).m5618K(((DbObject) pi6Var.f18623b).id);
                return;
            }
            return;
        }
        m21560b(this.f3703l, new e30() { // from class: l.il20
            public final void call(Object obj3) {
                ((cpl) obj3).mo6564Q0(pi6Var);
            }
        });
        m21547S0(pi6Var);
        if (m21553W(pi6Var.f18625d) && !((ConversationsList.C0294e) pi6Var.f18625d).m5635z(pi6Var.f18623b, pi6Var.f18622a)) {
            ((ConversationsList.C0294e) pi6Var.f18625d).m5618K(((DbObject) pi6Var.f18622a).id);
        }
        StringBuilder sb = new StringBuilder("name = ");
        sb.append(NullChecker.a(pi6Var.f18623b) ? pi6Var.f18623b.name : "");
        sb.append("  during = ");
        sb.append(mqi0.m18550o() - jM18550o);
        rd6.m21505C(sb.toString());
    }

    public NewConversationItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4054x = a.c(0);
        this.f4055y = a.c(ChatHeat.new_());
    }

    public NewConversationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4054x = a.c(0);
        this.f4055y = a.c(ChatHeat.new_());
    }
}
