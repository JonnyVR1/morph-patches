package com.p046p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.RunnableC4733c0;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationType;
import com.p046p1.mobile.putong.core.data.LocalPlaceBan;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MessageType;
import com.p046p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p046p1.mobile.putong.core.data.Privilege;
import com.p046p1.mobile.putong.core.data.SeeSwitchName;
import com.p046p1.mobile.putong.core.data.SeeTrialStatusType;
import com.p046p1.mobile.putong.core.newui.greet.DynamicGreetListAct;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.messages.ConversationItemView;
import com.p046p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookUnMatchAct;
import com.p046p1.mobile.putong.core.p053ui.citytop.CityTopLikersAct;
import com.p046p1.mobile.putong.core.p053ui.intl.greet.message.IntlDynamicGreetListAct;
import com.p046p1.mobile.putong.core.p053ui.messages.MessagesAct;
import com.p046p1.mobile.putong.core.p053ui.messages.SeeLetterListAct;
import com.p046p1.mobile.putong.core.p053ui.profile.ProfileAct;
import com.p046p1.mobile.putong.core.p053ui.purchase.C8764c;
import com.p046p1.mobile.putong.data.ConversationStatus;
import com.p046p1.mobile.putong.data.DetectCategoryType;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.Relationship;
import com.p046p1.mobile.putong.data.RelationshipStatus;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserLiveLabel;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;
import p133rx.subjects.C22392a;
import p147v.VListCell;
import p149l.ah60;
import p149l.c40;
import p149l.c4g0;
import p149l.cpl;
import p149l.d30;
import p149l.dml;
import p149l.e30;
import p149l.e51;
import p149l.emr;
import p149l.fap;
import p149l.i36;
import p149l.ll6;
import p149l.lsi0;
import p149l.mkd0;
import p149l.ml6;
import p149l.mqi0;
import p149l.n3b0;
import p149l.o6j0;
import p149l.ogl0;
import p149l.oxz;
import p149l.p36;
import p149l.pi6;
import p149l.qp8;
import p149l.r6n;
import p149l.rd6;
import p149l.roj0;
import p149l.ruy;
import p149l.rwu;
import p149l.tbk;
import p149l.u4c0;
import p149l.u4e;
import p149l.u59;
import p149l.upa;
import p149l.v9j;
import p149l.vwb;
import p149l.w9j;
import p149l.wf6;
import p149l.x2c0;
import p149l.xdl0;
import p149l.xma;
import p149l.xp5;
import p149l.ye40;
import p149l.zvf0;
import p149l.zz6;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ConversationItemView extends LinearLayout implements View.OnClickListener, RunnableC4733c0.c, cpl {

    /* JADX INFO: renamed from: v */
    public static boolean f24913v;

    /* JADX INFO: renamed from: a */
    @Nullable
    public cpl f24914a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public cpl f24915b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public cpl f24916c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public cpl f24917d;

    /* JADX INFO: renamed from: e */
    public cpl f24918e;

    /* JADX INFO: renamed from: f */
    public cpl f24919f;

    /* JADX INFO: renamed from: g */
    public cpl f24920g;

    /* JADX INFO: renamed from: h */
    public C22392a<roj0> f24921h;

    /* JADX INFO: renamed from: i */
    public final c4g0[] f24922i;

    /* JADX INFO: renamed from: j */
    public C22392a<Message> f24923j;

    /* JADX INFO: renamed from: k */
    public C22392a<Message> f24924k;

    /* JADX INFO: renamed from: l */
    public List<cpl> f24925l;

    /* JADX INFO: renamed from: m */
    public pi6 f24926m;

    /* JADX INFO: renamed from: n */
    public c40 f24927n;

    /* JADX INFO: renamed from: o */
    public c40 f24928o;

    /* JADX INFO: renamed from: p */
    public final Runnable f24929p;

    /* JADX INFO: renamed from: q */
    public final Runnable f24930q;

    /* JADX INFO: renamed from: r */
    public View.OnClickListener f24931r;

    /* JADX INFO: renamed from: s */
    public View.OnLongClickListener f24932s;

    /* JADX INFO: renamed from: t */
    public d30 f24933t;

    /* JADX INFO: renamed from: u */
    public v9j<Boolean> f24934u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationItemView$a */
    public class C8117a implements d30 {
        public C8117a() {
        }

        @Override // p149l.d30
        public void call() {
            if (NullChecker.m81303a(ConversationItemView.this.f24931r)) {
                ConversationItemView.this.f24931r.onClick(ConversationItemView.this);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationItemView$b */
    public class C8118b implements v9j<Boolean> {
        public C8118b() {
        }

        @Override // p149l.v9j, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return NullChecker.m81303a(ConversationItemView.this.f24932s) ? Boolean.valueOf(ConversationItemView.this.f24932s.onLongClick(ConversationItemView.this)) : Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationItemView$c */
    public class ViewOnLongClickListenerC8119c implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a */
        public String f24937a;

        /* JADX INFO: renamed from: b */
        public String f24938b;

        public ViewOnLongClickListenerC8119c(String str, String str2) {
            this.f24937a = str;
            this.f24938b = str2;
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m41032c(View view) {
            ConversationItemView.this.f24927n.m105113b();
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m41033d(VListCell vListCell, VListCell.C22545a c22545a, int i) {
            if (c22545a.f209159a.equals(ConversationItemView.this.m40989O1().getString(R$string.f18434cp))) {
                CoreModule.f17545c.f19642f0.m32809Tf(this.f24938b);
            }
            ConversationItemView.this.f24927n.m105113b();
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (!NullChecker.m81303a(CoreModule.f17545c.f19639e0.m169430Pa(this.f24937a))) {
                return false;
            }
            ArrayList arrayListM200324f0 = vwb.m200324f0(ConversationItemView.this.m40989O1().getString(R$string.f18434cp));
            c40.C16057b c16057b = new c40.C16057b(ConversationItemView.this.m40989O1());
            ConversationItemView conversationItemView = ConversationItemView.this;
            conversationItemView.f24927n = c16057b.m105156I(conversationItemView.getResources().getString(R$string.f18408c)).m105168U(new View.OnClickListener() { // from class: l.dd6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f85531a.m41032c(view2);
                }
            }).m105164Q(arrayListM200324f0).m105169V(new c40.InterfaceC16059d() { // from class: l.ed6
                @Override // p149l.c40.InterfaceC16059d
                /* JADX INFO: renamed from: a */
                public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                    this.f90591a.m41033d(vListCell, c22545a, i);
                }
            }).m105153F();
            ConversationItemView.this.f24927n.m105117f();
            return true;
        }
    }

    public ConversationItemView(Context context) {
        super(context);
        this.f24921h = C22392a.m221513c(roj0.f160388a);
        this.f24922i = new c4g0[1];
        Message message = pi6.f149084U;
        this.f24923j = C22392a.m221513c(message);
        this.f24924k = C22392a.m221513c(message);
        this.f24925l = new ArrayList();
        this.f24929p = new Runnable() { // from class: l.rb6
            @Override // java.lang.Runnable
            public final void run() {
                this.f158586a.m41016n2();
            }
        };
        this.f24930q = new Runnable() { // from class: l.cc6
            @Override // java.lang.Runnable
            public final void run() {
                this.f80207a.m41017o2();
            }
        };
        this.f24933t = new C8117a();
        this.f24934u = new C8118b();
    }

    /* JADX INFO: renamed from: F1 */
    public static /* synthetic */ void m40952F1(pi6 pi6Var, Boolean bool) {
        if (bool.booleanValue() && !pi6Var.f149114n) {
            o6j0.m162864h("e_message_limited_time_match", OMSDialogPositon.p_messages_view, new o6j0.C18854a[0]);
            pi6Var.f149114n = true;
        }
        if (bool.booleanValue()) {
            return;
        }
        pi6Var.f149114n = false;
    }

    /* JADX INFO: renamed from: R1 */
    public static boolean m40961R1(Conversation conversation) {
        return false;
    }

    private String getMCShowPositionStr() {
        dml dmlVar = this.f24926m.f149104d;
        if (!(dmlVar instanceof p36)) {
            return "";
        }
        p36 p36Var = (p36) dmlVar;
        StringBuilder sb = new StringBuilder();
        int iMo41519h = p36Var.mo41519h() - p36Var.mo41520k().size();
        pi6 pi6Var = this.f24926m;
        if (iMo41519h > 0) {
            sb.append((pi6Var.f149107g + 1) - iMo41519h);
        } else {
            sb.append(pi6Var.f149107g + 1);
        }
        sb.append("/");
        if (p36Var.mo41520k().isEmpty()) {
            sb.append(p36Var.mo41519h());
        } else {
            sb.append(p36Var.mo41520k().size());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: n1 */
    public static /* synthetic */ void m40974n1(Throwable th) {
    }

    /* JADX INFO: renamed from: r1 */
    public static /* synthetic */ void m40978r1(Throwable th) {
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: A */
    public void mo40987A(final pi6 pi6Var) {
        this.f24926m = pi6Var;
        setOnClickListener(this);
        Conversation conversation = pi6Var.f149101a;
        setOnLongClickListener(new ViewOnLongClickListenerC8119c(conversation.otherUser, conversation.f56011id));
        pi6Var.f149104d.mo67374c(m40989O1(), CoreModule.f17545c.f19642f0.m32772Pp()).filter(new w9j() { // from class: l.ic6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(pi6Var.f149101a.otherUser.equals((String) obj));
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.jc6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f117265a.m41004e2((String) obj);
            }
        }, new e30() { // from class: l.kc6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f122289a.m41005f2((Throwable) obj);
            }
        }));
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: F0 */
    public void mo40988F0(final pi6 pi6Var) {
        this.f24926m = pi6Var;
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        final long jLongValue = (CoreModule.f17545c.f19642f0.f19865I0.get().longValue() / 1000) - (CoreModule.f17545c.f19642f0.f19862H0.get().longValue() / 1000);
        pi6Var.f149104d.mo67374c(m40989O1(), CoreModule.f17545c.f19685t1.m31509n("countdown_conv_list_key")).subscribe(mkd0.m154955G(new e30() { // from class: l.wb6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f185558a.m40999Z1(simpleDateFormat, jLongValue, (RunnableC4733c0.b) obj);
            }
        }));
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.xb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f191931a.m41000a2(pi6Var, view);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.yb6
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f197311a.m41003d2(view);
            }
        });
        ((p36) pi6Var.f149104d).mo41524v().subscribe(mkd0.m154955G(new e30() { // from class: l.zb6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationItemView.m40952F1(pi6Var, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O1 */
    public PutongAct m40989O1() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: P1 */
    public void m40990P1(final pi6 pi6Var) {
        this.f24926m = pi6Var;
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.sb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f163504a.m40996W1(pi6Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: Q1 */
    public void m40991Q1(pi6 pi6Var) {
        this.f24926m = pi6Var;
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.mc6
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f133084a.m41009i2(view);
            }
        });
    }

    /* JADX INFO: renamed from: S1 */
    public final void m40992S1(String str) {
        RunnableC4733c0.a aVarM31520d;
        String str2 = "countdown_item_limited_trial_see" + this.f24926m.f149101a.f56011id;
        long jM155944o = mqi0.m155944o();
        if (!SeeTrialStatusType.trialing.equals(str) || jM155944o >= CoreModule.f17545c.f19554B2.m141776m3()) {
            aVarM31520d = (!"waiting".equals(str) || jM155944o >= CoreModule.f17545c.f19554B2.m141776m3()) ? null : new RunnableC4733c0.a().m31524h(60L).m31517a(true).m31523g(str2).m31522f(CoreModule.f17545c.f19554B2.m141776m3()).m31520d(this);
        } else {
            aVarM31520d = new RunnableC4733c0.a().m31524h(1L).m31517a(true).m31523g(str2).m31522f(CoreModule.f17545c.f19554B2.m141776m3()).m31520d(this);
        }
        if (!NullChecker.m81303a(aVarM31520d)) {
            CoreModule.f17545c.f19685t1.m31516u(str2);
        } else {
            CoreModule.f17545c.f19685t1.m31513r(aVarM31520d);
            this.f24926m.f149104d.mo67374c(m40989O1(), CoreModule.f17545c.f19685t1.m31509n(str2)).subscribe(mkd0.m154955G(new e30() { // from class: l.oc6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f143011a.m41012l2((RunnableC4733c0.b) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: T1 */
    public final /* synthetic */ void m40993T1(Intent intent, View view) {
        getContext().startActivity(intent);
    }

    /* JADX INFO: renamed from: U1 */
    public final /* synthetic */ void m40994U1(Message message) {
        this.f24923j.onNext(message);
    }

    /* JADX INFO: renamed from: V1 */
    public final /* synthetic */ void m40995V1(RunnableC4733c0.b bVar) {
        m41025v2();
    }

    /* JADX INFO: renamed from: W1 */
    public final /* synthetic */ void m40996W1(pi6 pi6Var, View view) {
        zvf0.m220399u("e_city_cover_received_greet", OMSDialogPositon.p_messages_view, vwb.m200311Y("cityc_red_dot_number", Integer.valueOf(pi6Var.f149101a.unreadMessages)), vwb.m200311Y("city_c_cell_uid", pi6Var.f149101a.otherUser));
        m40989O1().startActivity(CityTopLikersAct.m44584Y1(m40989O1()));
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m40997X1(pi6 pi6Var, View view) {
        fap.m120255i().m120270f();
        zvf0.m220396r("e_letter_receive_entrance", OMSDialogPositon.p_messages_view);
        getContext().startActivity(SeeLetterListAct.m49002Y1(getContext(), pi6Var.f149090F.get()));
    }

    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ void m40998Y1(View view) {
        C8764c.m53504x0(m40989O1(), "p_messages,seetrial_recover_group", Privilege.see_who_likes_me);
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m40999Z1(SimpleDateFormat simpleDateFormat, long j, RunnableC4733c0.b bVar) {
        if (TextUtils.equals(bVar.f19722b, "countdown_conv_list_key")) {
            mo42441r(simpleDateFormat, bVar.f19726f, bVar.f19724d, j);
        }
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m41000a2(pi6 pi6Var, View view) {
        m178928k(pi6Var.f149102b);
        m40989O1().startActivity(MessagesAct.m48944k2(m40989O1(), pi6Var.f149101a.f56011id, false, false, 29));
        o6j0.m162859c("e_message_limited_time_match", OMSDialogPositon.p_messages_view, new o6j0.C18854a[0]);
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m41001b2(View view) {
        this.f24928o.m105113b();
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m41002c2(VListCell vListCell, VListCell.C22545a c22545a, int i) {
        CoreModule.f17545c.f19642f0.m33127sp();
        m178925h();
        this.f24928o.m105113b();
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ boolean m41003d2(View view) {
        c40 c40VarM105153F = new c40.C16057b(view.getContext()).m105156I(getResources().getString(R$string.f18408c)).m105168U(new View.OnClickListener() { // from class: l.sc6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f163711a.m41001b2(view2);
            }
        }).m105164Q(vwb.m200324f0(m40989O1().getString(R$string.f18622j))).m105169V(new c40.InterfaceC16059d() { // from class: l.tc6
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                this.f169414a.m41002c2(vListCell, c22545a, i);
            }
        }).m105153F();
        this.f24928o = c40VarM105153F;
        c40VarM105153F.m105117f();
        return false;
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m41004e2(String str) {
        Conversation conversationM32856Xe = CoreModule.f17545c.f19642f0.m32856Xe(str);
        if (m40989O1().lifecycle_() != C4319c.f15548i || !NullChecker.m81303a(conversationM32856Xe) || TEnum.equals(conversationM32856Xe.status, "deleted") || TEnum.equals(conversationM32856Xe.status, "removed") || TEnum.equals(conversationM32856Xe.status, ConversationStatus.invisible)) {
            return;
        }
        lsi0.m151593w(R$string.f17918Ll);
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m41005f2(Throwable th) {
        if (m40989O1().lifecycle_() == C4319c.f15548i) {
            lsi0.m151593w(R$string.f17888Kl);
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m41006g2(View view) {
        this.f24928o.m105113b();
    }

    @Override // p149l.rd6
    public /* bridge */ /* synthetic */ HashMap getUserLiveLabelHashMap() {
        return super.getUserLiveLabelHashMap();
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: h0 */
    public void mo41007h0(final pi6 pi6Var) {
        zvf0.m220402x("e_letter_receive_entrance", OMSDialogPositon.p_messages_view);
        setOnClickListener(new View.OnClickListener() { // from class: l.lc6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f127378a.m40997X1(pi6Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m41008h2(ArrayList arrayList, VListCell vListCell, VListCell.C22545a c22545a, int i) {
        this.f24928o.m105113b();
        if (i >= arrayList.size() || i < 0) {
            return;
        }
        this.f24928o.m105113b();
        if (TextUtils.equals(c22545a.f209159a, "删除聊天")) {
            CoreModule.f17545c.f19639e0.f149247Q1.put(-1L);
            ConversationsList.m41328A2();
        }
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ boolean m41009i2(View view) {
        if (!CoreModule.f17545c.f19642f0.f19911X0.get().booleanValue()) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        arrayList.add("删除聊天");
        c40 c40VarM105153F = new c40.C16057b(getContext()).m105156I(getContext().getResources().getString(R$string.f18408c)).m105168U(new View.OnClickListener() { // from class: l.uc6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f175798a.m41006g2(view2);
            }
        }).m105164Q(arrayList).m105169V(new c40.InterfaceC16059d() { // from class: l.vc6
            @Override // p149l.c40.InterfaceC16059d
            /* JADX INFO: renamed from: a */
            public final void mo41896a(VListCell vListCell, VListCell.C22545a c22545a, int i) {
                this.f180910a.m41008h2(arrayList, vListCell, c22545a, i);
            }
        }).m105153F();
        this.f24928o = c40VarM105153F;
        c40VarM105153F.m105117f();
        return true;
    }

    /* JADX INFO: renamed from: j2 */
    public final /* synthetic */ void m41010j2() {
        CoreModule.f17553k.f91950m.delete(this.f24926m.f149101a.f56011id);
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m41011k2() {
        CoreModule.f17545c.f19609U.m109085a(new d30() { // from class: l.cd6
            @Override // p149l.d30
            public final void call() {
                this.f80348a.m41010j2();
            }
        });
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m41012l2(RunnableC4733c0.b bVar) {
        if (NullChecker.m81303a(bVar) && bVar.f19721a) {
            CoreModule.f17545c.f19554B2.m141782y3();
        }
        m41025v2();
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: m */
    public void mo41013m(pi6 pi6Var) {
        setOnClickListener(this);
        final ConversationLongClick conversationLongClick = new ConversationLongClick(pi6Var);
        setOnLongClickListener(conversationLongClick);
        if (pi6Var.f149101a.isTop() && TextUtils.isEmpty(pi6Var.f149125y)) {
            setBackgroundResource(x2c0.f190345lu);
        } else {
            setBackgroundResource(x2c0.f190313ku);
        }
        if (m40989O1() instanceof NewMainAct) {
            pi6Var.f149104d.mo67374c(m40989O1(), ((NewMainAct) m40989O1()).m39819i7()).filter(new w9j() { // from class: l.tb6
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) != TabName.Msg);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.ub6
                @Override // p149l.e30
                public final void call(Object obj) {
                    conversationLongClick.m41182d0();
                }
            }));
        }
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: m0 */
    public void mo41014m0(pi6 pi6Var) {
        m40992S1(emr.INSTANCE.m117223e());
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.vb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f180819a.m40998Y1(view);
            }
        });
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m41015m2(User user, Relationship relationship) {
        r6n.m178067f().f157963k.put(user.f56011id);
        r6n.m178067f().m178081p(user.f56011id);
        CoreModule.f17545c.f19639e0.m169454W9(user.f56011id);
        if (TEnum.equals(relationship.state, "matched")) {
            CoreModule.f17545c.f19687u0.m30491x7(user.f56011id);
        }
        r6n.m178067f().m178083r(user.f56011id, true);
        if (IntlCountryCodeController.m28111g()) {
            ruy.m181215g().m181223k(user.f56011id).subscribe(mkd0.m154950B());
        }
        dml dmlVar = this.f24926m.f149104d;
        if (dmlVar instanceof p36) {
            ((p36) dmlVar).mo41523q();
        }
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m41016n2() {
        if (NullChecker.m81303a(this.f24926m.f149101a)) {
            CoreModule.f17545c.f19642f0.m33203yp(this.f24926m.f149101a.f56011id);
        }
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m41017o2() {
        if (NullChecker.m81303a(this.f24926m.f149101a)) {
            CoreModule.f17545c.f19642f0.m33190xp(this.f24926m.f149101a.f56011id);
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0388  */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        String str2;
        if (this.f24919f.mo42420K0()) {
            return;
        }
        pi6 pi6Var = this.f24926m;
        final Conversation conversation = pi6Var.f149101a;
        final User user = pi6Var.f149102b;
        if (rd6.m178878o(conversation)) {
            CoreModule.m29935P().m94651a().mo33572qm(m40989O1(), "p_message,blur_cell", Privilege.see_who_likes_me, new e30() { // from class: l.nc6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f138130a.m41019q2(conversation, obj);
                }
            });
            return;
        }
        m178939w(this.f24926m);
        boolean z = true;
        if (xp5.m210466f(conversation)) {
            zvf0.m220396r("e_message_tab_compliment_cell_click", OMSDialogPositon.p_messages_view);
            if (!f24913v) {
                zvf0.m220402x("e_message_tab_compliment_cell_click", OMSDialogPositon.p_messages_view);
                f24913v = true;
            }
        }
        if (NullChecker.m81303a(user) && NullChecker.m81303a(this.f24926m.f149101a) && TextUtils.equals(this.f24926m.f149101a.convType, ConversationType.intlSeeChatRequest)) {
            if (!n3b0.m157742q()) {
                m41023t2();
                return;
            }
            r6n.m178067f().f157958f.put(user.f56011id);
            r6n.m178067f().m178084s(user.f56011id, false, true);
            zvf0.m220399u("e_chat_request_operate", OMSDialogPositon.p_messages_view, vwb.m200311Y("show_where", this.f24926m.f149105e ? LocalPlaceBan.matchList : LocalPlaceBan.chatList), vwb.m200311Y("request_show_type", this.f24926m.f149109i), vwb.m200311Y("show_position", getMCShowPositionStr()), vwb.m200311Y("chat_request_operate", "click"));
            CoreModule.m29935P().m94651a().mo33407Sl(m40989O1(), "p_messages_view,e_chat_request,click", Privilege.see_chat_request_gp, new d30() { // from class: l.wc6
                @Override // p149l.d30
                public final void call() {
                    r6n.m178067f().f157958f.put("");
                }
            }, TextUtils.concat("chat_request_", user.f56011id).toString());
            ah60.m96370E().subscribe(mkd0.m154955G(new e30() { // from class: l.xc6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f192181a.m41020r2(user, (PaymentResultWrapper) obj);
                }
            }));
            return;
        }
        if (r6n.m178067f().f157954b.m221515e() != null && !vwb.m200296J(r6n.m178067f().f157954b.m221515e().users)) {
            ah60.m96370E().subscribe(mkd0.m154955G(new e30() { // from class: l.yc6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f197415a.m41021s2((PaymentResultWrapper) obj);
                }
            }));
        }
        if (NullChecker.m81303a(this.f24914a) && this.f24914a.mo42472O()) {
            zvf0.m220397s("e_red_dot_message_chat", OMSDialogPositon.p_messages_view, u4e.m191728c("red_dot", "red_dot_normal", "chat_bar", "message_list_page", "tips"));
        } else {
            zvf0.m220397s("e_red_dot_message_chat", OMSDialogPositon.p_messages_view, u4e.m191729d());
        }
        if (NullChecker.m81303a(this.f24926m.f149094J)) {
            this.f24926m.f149094J.call();
        }
        if (upa.m194706V1() && NullChecker.m81303a(conversation) && ml6.m155116a(conversation)) {
            ChatGroup chatGroupM31886h7 = CoreModule.f17545c.f19645g0.m31886h7(conversation.otherUser);
            boolean zM81303a = NullChecker.m81303a(chatGroupM31886h7);
            String str3 = conversation.otherUser;
            if (zM81303a) {
                o6j0.m162859c("e_group_item", OMSDialogPositon.p_messages_view, o6j0.C18854a.m162878h("groupchat_id", str3), o6j0.C18854a.m162876f("is_anonymou_group", tbk.m187872s(chatGroupM31886h7) ? 1 : 0));
            } else {
                o6j0.m162859c("e_group_item", OMSDialogPositon.p_messages_view, o6j0.C18854a.m162878h("groupchat_id", str3), o6j0.C18854a.m162876f("is_anonymou_group", 0));
            }
        }
        oxz.m166600a();
        String str4 = "";
        if ((u59.m191811T() || upa.m194649I2()) && (TextUtils.equals(conversation.f56011id, "fake_conversation_greeting") || TextUtils.equals(conversation.f56011id, "fake_conversation_anonymous_greeting"))) {
            if (u59.m191811T()) {
                zvf0.m220396r("e_intl_message_im_hi_enter", OMSDialogPositon.p_messages_view);
                m40989O1().startActivity(IntlDynamicGreetListAct.m46162X1(m40989O1(), null, ""));
                return;
            }
            if (ye40.m214334b()) {
                o6j0.m162859c("e_kankan_stranger_message", OMSDialogPositon.p_messages_view, o6j0.C18854a.m162878h("is_red_dot", "1"), o6j0.C18854a.m162878h("is_greeting_new", "1"));
            } else if (NullChecker.m81303a(conversation) && TextUtils.equals(conversation.f56011id, "fake_conversation_anonymous_greeting")) {
                o6j0.m162859c("e_anonymous_cell", OMSDialogPositon.p_messages_view, new o6j0.C18854a[0]);
            } else {
                o6j0.m162859c("e_kankan_stranger_message", OMSDialogPositon.p_messages_view, o6j0.C18854a.m162878h("is_red_dot", conversation.additional.kankan.greetingSummaryDetail.unseen <= 0 ? "0" : "1"), o6j0.C18854a.m162878h("is_greeting_new", "0"));
            }
            PutongAct putongActM40989O1 = m40989O1();
            PutongAct putongActM40989O2 = m40989O1();
            if (NullChecker.m81303a(conversation) && TextUtils.equals(conversation.f56011id, "fake_conversation_anonymous_greeting")) {
                str4 = "from_anonymous_greeting";
            }
            putongActM40989O1.startActivity(DynamicGreetListAct.m36455X1(putongActM40989O2, null, str4));
            if (ye40.m214334b()) {
                CoreModule.f17545c.f19678r0.m34132m5();
                return;
            }
            return;
        }
        if (!ogl0.m164245X() || !conversation.isLimitedTrialSee(CoreModule.m29931H().userId()) || xma.m210047L3() || CoreModule.f17545c.f19639e0.m169527p9().isFemale()) {
            m178928k(user);
            m40989O1().startActivity(MessagesAct.m48932M2(m40989O1(), conversation.f56011id, false, false, 29, this.f24926m.f149116p, user != null && User.isAiStory(user.f56011id)));
        } else {
            String strM117223e = emr.INSTANCE.m117223e();
            if (SeeTrialStatusType.trialEnd.equals(strM117223e) || "waiting".equals(strM117223e) || "expired".equals(strM117223e)) {
                C8764c.m53504x0(m40989O1(), "p_messages,seetrial_recover_one", Privilege.see_who_likes_me);
            } else {
                m178928k(user);
                m40989O1().startActivity(MessagesAct.m48932M2(m40989O1(), conversation.f56011id, false, false, 29, this.f24926m.f149116p, user != null && User.isAiStory(user.f56011id)));
            }
        }
        if (NullChecker.m81303a(conversation) && TextUtils.equals(conversation.otherUser, rwu.m181459h())) {
            o6j0.m162859c("e_live_vip_customer_service", OMSDialogPositon.p_messages_view, new o6j0.C18854a[0]);
        }
        String string = (NullChecker.m81303a(conversation) && NullChecker.m81303a(conversation.additional) && NullChecker.m81303a(conversation.additional.tag) && NullChecker.m81303a(conversation.additional.tag.type) && !TEnum.equals(conversation.additional.tag.type, "unknown_")) ? conversation.additional.tag.type.toString() : "";
        if (m178916Z0(this.f24926m.f149101a) && !this.f24926m.f149101a.hasRemoveLabel() && this.f24926m.f149101a.unreadMessages == 0) {
            str = "1," + i36.m134149g().m134155j(conversation.f56011id, true);
        } else {
            str = "";
        }
        if (m178935q(this.f24926m)) {
            str2 = "gotoreply";
        } else {
            Conversation conversation2 = this.f24926m.f149101a;
            if (conversation2.unreadMessages > 0 || !m178934p0(conversation2) || TextUtils.isEmpty(this.f24926m.f149101a.property.conversationTag.suggestExpireTime) || mqi0.m155944o() >= Long.parseLong(this.f24926m.f149101a.property.conversationTag.suggestExpireTime) * 1000) {
                str2 = "";
            } else if (!TextUtils.isEmpty(this.f24926m.f149101a.property.conversationTag.emoji)) {
                str2 = "emoji";
            } else if (TextUtils.isEmpty(this.f24926m.f149101a.property.conversationTag.suggestText)) {
                str2 = "";
            } else {
                str2 = "startchat";
            }
        }
        o6j0.C18854a c18854aM162878h = o6j0.C18854a.m162878h("create_time", zz6.f205780h.format(conversation.createdTime));
        o6j0.C18854a c18854aM162878h2 = o6j0.C18854a.m162878h("is_online", CoreModule.f17545c.f19588N0.m31966j3(user) ? "1" : "0");
        StringBuilder sb = new StringBuilder("");
        pi6 pi6Var2 = this.f24926m;
        sb.append(pi6Var2.f149113m - pi6Var2.f149108h);
        o6j0.C18854a c18854aM162878h3 = o6j0.C18854a.m162878h("new_match_rank", sb.toString());
        o6j0.C18854a c18854aM162878h4 = o6j0.C18854a.m162878h("moments_user_id", conversation.otherUser);
        o6j0.C18854a c18854aM162878h5 = o6j0.C18854a.m162878h("operation_id", this.f24926m.f149112l);
        o6j0.C18854a c18854aM162878h6 = o6j0.C18854a.m162878h("is_new_moment", "0");
        o6j0.C18854a c18854aM162878h7 = o6j0.C18854a.m162878h("new_msg_page_module", (m178905S(conversation) || m178929l(conversation)) ? "0" : "1");
        o6j0.C18854a c18854aM162878h8 = o6j0.C18854a.m162878h("chat_guide", str);
        if (!conversation.isFakeHeartbeatConv() && !conversation.isFakeQuickChatConv()) {
            z = false;
        }
        o6j0.C18854a c18854aM162879i = o6j0.C18854a.m162879i("is_fake", z);
        o6j0.C18854a c18854aM162878h9 = o6j0.C18854a.m162878h("is_onlive_anchor", this.f24926m.f149095K);
        o6j0.C18854a c18854aM162878h10 = o6j0.C18854a.m162878h("is_red_dot", conversation.read.booleanValue() ? "0" : "1");
        o6j0.C18854a c18854aM162878h11 = o6j0.C18854a.m162878h("other_uid", conversation.otherUser);
        o6j0.C18854a c18854aM162876f = o6j0.C18854a.m162876f("red_dot_num", conversation.unreadMessages);
        o6j0.C18854a c18854aM162879i2 = o6j0.C18854a.m162879i("chat_game_show", false);
        o6j0.C18854a c18854aM162878h12 = o6j0.C18854a.m162878h(MessageType.love_letter, "");
        if (i36.m134149g().m134160o(conversation.f56011id) && !conversation.hasRemoveLabel()) {
            string = "longtimenosee";
        }
        o6j0.m162859c("e_messages_view_match", OMSDialogPositon.p_messages_view, c18854aM162878h, c18854aM162878h2, c18854aM162878h3, c18854aM162878h4, c18854aM162878h5, c18854aM162878h6, c18854aM162878h7, c18854aM162878h8, c18854aM162879i, c18854aM162878h9, c18854aM162878h10, c18854aM162878h11, c18854aM162876f, c18854aM162879i2, c18854aM162878h12, o6j0.C18854a.m162878h(DetectCategoryType.user_tag, string), o6j0.C18854a.m162878h("day_number", this.f24926m.f149097M), o6j0.C18854a.m162878h("pairing_type", conversation.hasReSwipeConvIceBreak() ? "break_ice" : "unbreak_ice"), o6j0.C18854a.m162878h("messagec_cell_type", ll6.m150405a(conversation)), o6j0.C18854a.m162878h("is_platinum_top_chat", (CoreModule.m29935P().m94656g().mo35048b8() && conversation.isPlatinumTop()) ? "yes" : "no"), o6j0.C18854a.m162878h(SeeSwitchName.message_tab, m178923g(this.f24926m.f149104d)), o6j0.C18854a.m162878h("guide_type", str2), o6j0.C18854a.m162876f("spark_level", ll6.m150409e(conversation)), o6j0.C18854a.m162876f("message_pairs", ll6.m150408d(conversation)), o6j0.C18854a.m162876f("is_close_friend", ll6.m150406b(conversation)), o6j0.C18854a.m162876f("is_top_recommend", ll6.m150407c(conversation)));
        m178941x0(this.f24926m);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e51.m114745J(this.f24930q);
        CoreModule.f17545c.f19685t1.m31515t(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (upa.m194847z()) {
            xdl0.m208325C0(this, pi6.f149081R);
        }
        this.f24918e = this;
        this.f24925l.add(this);
        cpl cplVar = (cpl) findViewById(u4c0.f174140Z4);
        this.f24919f = cplVar;
        this.f24925l.add(cplVar);
        cpl cplVar2 = (cpl) findViewById(u4c0.f174268ge);
        this.f24920g = cplVar2;
        this.f24925l.add(cplVar2);
        cpl cplVar3 = (cpl) findViewById(u4c0.f174148Zc);
        this.f24914a = cplVar3;
        if (NullChecker.m81303a(cplVar3)) {
            this.f24925l.add(this.f24914a);
        }
        cpl cplVar4 = (cpl) findViewById(u4c0.f174060U4);
        this.f24915b = cplVar4;
        if (NullChecker.m81303a(cplVar4)) {
            this.f24925l.add(this.f24915b);
        }
        cpl cplVar5 = (cpl) findViewById(u4c0.f173976P4);
        this.f24916c = cplVar5;
        if (NullChecker.m81303a(cplVar5)) {
            this.f24925l.add(this.f24916c);
        }
        cpl cplVar6 = (cpl) findViewById(u4c0.f174570yb);
        this.f24917d = cplVar6;
        if (NullChecker.m81303a(cplVar6)) {
            this.f24925l.add(this.f24917d);
        }
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m41018p2(pi6 pi6Var, LinkedHashMap linkedHashMap) {
        if (((UserLiveLabel) linkedHashMap.get(pi6Var.f149102b)) != null) {
            pi6Var.f149106f = true;
            m41025v2();
        } else if (pi6Var.f149106f) {
            pi6Var.f149106f = false;
            m41025v2();
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        if (!NullChecker.m81303a(this.f24931r)) {
            return super.performClick();
        }
        this.f24931r.onClick(this);
        return true;
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m41019q2(Conversation conversation, Object obj) {
        m41025v2();
        if (conversation.lowPayOneSideConv()) {
            return;
        }
        performClick();
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m41020r2(User user, PaymentResultWrapper paymentResultWrapper) {
        Object obj = paymentResultWrapper.tag;
        if ((obj instanceof String) && TextUtils.equals((String) obj, TextUtils.concat("chat_request_", user.f56011id).toString())) {
            m41023t2();
        }
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m41021s2(PaymentResultWrapper paymentResultWrapper) {
        dml dmlVar = this.f24926m.f149104d;
        if (dmlVar instanceof p36) {
            ((p36) dmlVar).mo41523q();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        if (!wf6.m202950e() || !NullChecker.m81303a(this.f24926m) || this.f24926m.f149115o || (m40989O1() instanceof ConversationAddressBookUnMatchAct)) {
            super.setOnClickListener(onClickListener);
        } else {
            this.f24931r = onClickListener;
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        if (!wf6.m202950e() || (m40989O1() instanceof ConversationAddressBookUnMatchAct)) {
            super.setOnLongClickListener(onLongClickListener);
        } else {
            this.f24932s = onLongClickListener;
        }
    }

    @Override // p149l.bpl
    public void setPicPercent(float f) {
        this.f24919f.setPicPercent(f);
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: t0 */
    public void mo41022t0(final pi6 pi6Var) {
        if (pi6Var.f149122v && NullChecker.m81303a(pi6Var.f149102b)) {
            final Intent intentM50743v2 = ProfileAct.m50743v2(m40989O1(), pi6Var.f149102b.f56011id, "from_conversation_search_view", false, false, false, RelationshipStatus.get("unknown_"), 273, false, true, false, false);
            xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.ac6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f68779a.m40993T1(intentM50743v2, view);
                }
            });
            return;
        }
        setOnClickListener(this);
        final ConversationLongClick conversationLongClick = new ConversationLongClick(pi6Var);
        setOnLongClickListener(conversationLongClick);
        if (pi6Var.f149101a.isMarriageConv()) {
            setBackgroundResource(x2c0.f190313ku);
        } else if (CoreModule.m29935P().m94656g().mo35048b8() && pi6Var.f149101a.isPlatinumTop() && !m178912W(pi6Var.f149104d)) {
            setBackgroundResource(x2c0.f189296Ee);
        } else if (pi6Var.f149101a.isTop() && TextUtils.isEmpty(pi6Var.f149125y) && !m178912W(pi6Var.f149104d)) {
            setBackgroundResource(x2c0.f190345lu);
        } else {
            setBackgroundResource(x2c0.f190313ku);
        }
        if ((m40989O1() instanceof NewMainAct) && NullChecker.m81303a(pi6Var.f149104d)) {
            pi6Var.f149104d.mo67374c(m40989O1(), ((NewMainAct) m40989O1()).m39819i7().filter(new w9j() { // from class: l.bc6
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) != TabName.Msg);
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.dc6
                @Override // p149l.e30
                public final void call(Object obj) {
                    conversationLongClick.m41182d0();
                }
            }));
        }
        if (!upa.m194726a2()) {
            m41024u2(pi6Var);
        }
        if (rd6.m178865C0(pi6Var.f149101a)) {
            m178919b(this.f24925l, new e30() { // from class: l.ec6
                @Override // p149l.e30
                public final void call(Object obj) {
                    ((cpl) obj).mo42401J(pi6Var);
                }
            });
            return;
        }
        this.f24923j.onNext(pi6.f149084U);
        if (NullChecker.m81303a(pi6Var.f149101a)) {
            pi6Var.f149104d.mo67374c(m40989O1(), CoreModule.f17553k.f91940c.m206068Z(pi6Var.f149101a.f56011id, pi6Var.f149101a.clearedTime, false).m165620m().map(new w9j() { // from class: l.fc6
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return rd6.m178881t((List) obj, pi6Var.f149102b);
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.gc6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f101992a.m40994U1((Message) obj);
                }
            }));
        }
        if (u59.m191823d0() && NullChecker.m81303a(pi6Var.f149101a) && "lovebuzz".equals(pi6Var.f149101a.convType)) {
            if (CoreModule.f17554l.m94652b().mo35101Pj(pi6Var.f149101a)) {
                RunnableC4733c0.a aVar = new RunnableC4733c0.a();
                aVar.m31523g("countdown_item_love_buzz_key" + pi6Var.f149101a.f56011id).m31522f(pi6Var.f149101a.property.intl_love_buzz.expire).m31524h(60L).m31517a(true).m31520d(this);
                CoreModule.f17545c.f19685t1.m31513r(aVar);
                pi6Var.f149104d.mo67374c(m40989O1(), CoreModule.f17545c.f19685t1.m31509n("countdown_item_love_buzz_key" + pi6Var.f149101a.f56011id)).subscribe(mkd0.m154955G(new e30() { // from class: l.hc6
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f107011a.m40995V1((RunnableC4733c0.b) obj);
                    }
                }));
            } else {
                CoreModule.f17545c.f19685t1.m31516u("countdown_item_love_buzz_key" + pi6Var.f149101a.f56011id);
            }
        }
        m178890F(m40989O1(), pi6Var.f149101a.f56011id, (p36) pi6Var.f149104d, this);
        m41026w2();
        e51.m114745J(this.f24929p);
        Conversation conversation = pi6Var.f149101a;
        int i = conversation.level;
        if (i == 55) {
            if (NullChecker.m81303a(conversation.additional) && NullChecker.m81303a(pi6Var.f149101a.additional.tag) && pi6Var.f149101a.additional.tag.expireTime * 1000 > mqi0.m155944o()) {
                e51.m114743H(getContext(), this.f24929p, (pi6Var.f149101a.additional.tag.expireTime * 1000) - mqi0.m155944o());
            } else {
                CoreModule.f17545c.f19642f0.m33203yp(pi6Var.f149101a.f56011id);
            }
        } else if (i == 90 && CoreModule.m29935P().m94656g().mo35048b8()) {
            e51.m114745J(this.f24930q);
            if (NullChecker.m81303a(pi6Var.f149101a.additional) && NullChecker.m81303a(pi6Var.f149101a.additional.pinChat) && pi6Var.f149101a.additional.pinChat.expireTime > mqi0.m155944o()) {
                m41027x2();
                e51.m114743H(getContext(), this.f24930q, (long) (pi6Var.f149101a.additional.pinChat.expireTime - mqi0.m155944o()));
            } else {
                CoreModule.f17545c.f19642f0.m33190xp(pi6Var.f149101a.f56011id);
                CoreModule.f17545c.f19685t1.m31516u("countdown_item_platinum_pin" + pi6Var.f149101a.f56011id);
            }
        }
        if (!ogl0.m164245X() || !pi6Var.f149101a.isLimitedTrialSee(CoreModule.m29931H().userId()) || xma.m210047L3() || CoreModule.f17545c.f19639e0.m169527p9().isFemale()) {
            return;
        }
        m40992S1(emr.INSTANCE.m117223e());
    }

    /* JADX INFO: renamed from: t2 */
    public final void m41023t2() {
        final User user = this.f24926m.f149102b;
        m40989O1().duringCreated(CoreModule.f17545c.f19663m0.m31061V7(true, false, null, user, null)).subscribe(mkd0.m154956H(new e30() { // from class: l.ad6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f68911a.m41015m2(user, (Relationship) obj);
            }
        }, new e30() { // from class: l.bd6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationItemView.m40978r1((Throwable) obj);
            }
        }));
        m40989O1().duringCreated(CoreModule.f17545c.f19663m0.m31128n6());
    }

    @Override // com.p046p1.mobile.putong.core.api.RunnableC4733c0.c
    /* JADX INFO: renamed from: u */
    public void mo31527u(String str, long j, long j2, long j3, long j4) {
        if (NullChecker.m81303a(this.f24926m) && NullChecker.m81303a(this.f24926m.f149101a)) {
            if (!TextUtils.equals(str, "exclusive_tag_" + this.f24926m.f149101a.f56011id)) {
                if (!TextUtils.equals(str, "love_script_tag_" + this.f24926m.f149101a.f56011id)) {
                    if (!TextUtils.equals("countdown_item_platinum_pin" + this.f24926m.f149101a.f56011id, str)) {
                        if (TextUtils.equals(str, "heartbeat_conv_item_" + this.f24926m.f149101a.f56011id) && this.f24926m.f149101a.isHeartbeatConv() && mqi0.m155944o() >= this.f24926m.f149101a.additional.heartbeatMatch.expireTime) {
                            e51.m114774y(new Runnable() { // from class: l.zc6
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f202516a.m41011k2();
                                }
                            });
                            return;
                        }
                        return;
                    }
                }
            }
            m41025v2();
        }
    }

    /* JADX INFO: renamed from: u2 */
    public final void m41024u2(final pi6 pi6Var) {
        if (!qp8.m175817b() || pi6Var == null) {
            return;
        }
        pi6Var.f149106f = CoreModule.f17545c.f19642f0.f19846B2.m221515e().containsKey(pi6Var.f149102b);
        pi6Var.f149104d.mo67374c(m40989O1(), CoreModule.f17545c.f19642f0.m32652Fq()).subscribe(mkd0.m154956H(new e30() { // from class: l.qc6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f153728a.m41018p2(pi6Var, (LinkedHashMap) obj);
            }
        }, new e30() { // from class: l.rc6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationItemView.m40974n1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v2 */
    public void m41025v2() {
        this.f24921h.onNext(roj0.f160388a);
    }

    /* JADX INFO: renamed from: w2 */
    public final void m41026w2() {
        if (NullChecker.m81303a(this.f24926m) && NullChecker.m81303a(this.f24926m.f149101a) && NullChecker.m81303a(this.f24926m.f149101a.property) && NullChecker.m81303a(this.f24926m.f149101a.property.loveScript) && "lovescript".equals(this.f24926m.f149101a.convType)) {
            long j = this.f24926m.f149101a.property.loveScript.expireTime;
            if (j == 0 || j <= mqi0.m155944o()) {
                return;
            }
            RunnableC4733c0.a aVar = new RunnableC4733c0.a();
            aVar.m31523g("love_script_tag_" + this.f24926m.f149101a.f56011id).m31522f(this.f24926m.f149101a.property.loveScript.expireTime).m31524h(1L).m31517a(true).m31520d(this);
            CoreModule.f17545c.f19685t1.m31513r(aVar);
            if (this.f24926m.f149111k.m176377a("e_story_mtached_cell_click")) {
                return;
            }
            zvf0.m220368A("e_story_mtached_cell_click", OMSDialogPositon.p_messages_view, vwb.m200311Y("cell_numbers", 0));
            this.f24926m.f149111k.m176378b("e_story_mtached_cell_click");
        }
    }

    /* JADX INFO: renamed from: x2 */
    public final void m41027x2() {
        RunnableC4733c0.a aVar = new RunnableC4733c0.a();
        aVar.m31523g("countdown_item_platinum_pin" + this.f24926m.f149101a.f56011id).m31522f((long) this.f24926m.f149101a.additional.pinChat.expireTime).m31524h(1L).m31517a(true).m31520d(this);
        CoreModule.f17545c.f19685t1.m31513r(aVar);
    }

    @Override // p149l.cpl
    /* JADX INFO: renamed from: z0 */
    public void mo41028z0(Conversation conversation, User user, pi6 pi6Var) {
        this.f24926m = pi6Var;
        pi6Var.f149101a = conversation;
        if (NullChecker.m81303a(conversation) && pi6Var.f149101a.localEverHasMessage) {
            m178925h();
        } else {
            m178919b(this.f24925l, new e30() { // from class: l.pc6
                @Override // p149l.e30
                public final void call(Object obj) {
                    ((cpl) obj).mo42414y0();
                }
            });
        }
    }

    public ConversationItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24921h = C22392a.m221513c(roj0.f160388a);
        this.f24922i = new c4g0[1];
        Message message = pi6.f149084U;
        this.f24923j = C22392a.m221513c(message);
        this.f24924k = C22392a.m221513c(message);
        this.f24925l = new ArrayList();
        this.f24929p = new Runnable() { // from class: l.rb6
            @Override // java.lang.Runnable
            public final void run() {
                this.f158586a.m41016n2();
            }
        };
        this.f24930q = new Runnable() { // from class: l.cc6
            @Override // java.lang.Runnable
            public final void run() {
                this.f80207a.m41017o2();
            }
        };
        this.f24933t = new C8117a();
        this.f24934u = new C8118b();
    }

    public ConversationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24921h = C22392a.m221513c(roj0.f160388a);
        this.f24922i = new c4g0[1];
        Message message = pi6.f149084U;
        this.f24923j = C22392a.m221513c(message);
        this.f24924k = C22392a.m221513c(message);
        this.f24925l = new ArrayList();
        this.f24929p = new Runnable() { // from class: l.rb6
            @Override // java.lang.Runnable
            public final void run() {
                this.f158586a.m41016n2();
            }
        };
        this.f24930q = new Runnable() { // from class: l.cc6
            @Override // java.lang.Runnable
            public final void run() {
                this.f80207a.m41017o2();
            }
        };
        this.f24933t = new C8117a();
        this.f24934u = new C8118b();
    }
}
