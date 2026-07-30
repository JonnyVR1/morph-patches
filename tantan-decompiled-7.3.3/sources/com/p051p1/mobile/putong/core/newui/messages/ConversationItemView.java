package com.p051p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.RunnableC4884c0;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationType;
import com.p051p1.mobile.putong.core.data.LocalPlaceBan;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MessageType;
import com.p051p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p051p1.mobile.putong.core.data.Privilege;
import com.p051p1.mobile.putong.core.data.SeeSwitchName;
import com.p051p1.mobile.putong.core.data.SeeTrialStatusType;
import com.p051p1.mobile.putong.core.newui.greet.DynamicGreetListAct;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.messages.ConversationItemView;
import com.p051p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookUnMatchAct;
import com.p051p1.mobile.putong.core.p058ui.citytop.CityTopLikersAct;
import com.p051p1.mobile.putong.core.p058ui.intl.greet.message.IntlDynamicGreetListAct;
import com.p051p1.mobile.putong.core.p058ui.messages.MessagesAct;
import com.p051p1.mobile.putong.core.p058ui.messages.SeeLetterListAct;
import com.p051p1.mobile.putong.core.p058ui.profile.ProfileAct;
import com.p051p1.mobile.putong.core.p058ui.purchase.C8927c;
import com.p051p1.mobile.putong.data.ConversationStatus;
import com.p051p1.mobile.putong.data.DetectCategoryType;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.Relationship;
import com.p051p1.mobile.putong.data.RelationshipStatus;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserLiveLabel;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
import com.tantanapp.common.utils.NullChecker;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TimeZone;
import p137rx.subjects.C22507a;
import p151v.VListCell;
import p153l.Cfor;
import p153l.adc0;
import p153l.bnl0;
import p153l.br5;
import p153l.c17;
import p153l.d79;
import p153l.dbc0;
import p153l.fcp;
import p153l.fp60;
import p153l.gra;
import p153l.i4g0;
import p153l.i6e;
import p153l.jek;
import p153l.joa;
import p153l.jyb;
import p153l.kcg0;
import p153l.l51;
import p153l.l600;
import p153l.mn40;
import p153l.n46;
import p153l.o1j0;
import p153l.o3z;
import p153l.om6;
import p153l.orl;
import p153l.pcj;
import p153l.pm6;
import p153l.pol;
import p153l.psd0;
import p153l.pzi0;
import p153l.qcj;
import p153l.r8n;
import p153l.rbb0;
import p153l.sfj0;
import p153l.sj6;
import p153l.spl0;
import p153l.syu;
import p153l.u46;
import p153l.ue6;
import p153l.uxj0;
import p153l.vq8;
import p153l.w30;
import p153l.x20;
import p153l.y20;
import p153l.zg6;

/* JADX INFO: loaded from: classes11.dex */
public abstract class ConversationItemView extends LinearLayout implements View.OnClickListener, RunnableC4884c0.c, orl {

    /* JADX INFO: renamed from: v */
    public static boolean f25655v;

    /* JADX INFO: renamed from: a */
    @Nullable
    public orl f25656a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public orl f25657b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public orl f25658c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public orl f25659d;

    /* JADX INFO: renamed from: e */
    public orl f25660e;

    /* JADX INFO: renamed from: f */
    public orl f25661f;

    /* JADX INFO: renamed from: g */
    public orl f25662g;

    /* JADX INFO: renamed from: h */
    public C22507a<uxj0> f25663h;

    /* JADX INFO: renamed from: i */
    public final kcg0[] f25664i;

    /* JADX INFO: renamed from: j */
    public C22507a<Message> f25665j;

    /* JADX INFO: renamed from: k */
    public C22507a<Message> f25666k;

    /* JADX INFO: renamed from: l */
    public List<orl> f25667l;

    /* JADX INFO: renamed from: m */
    public sj6 f25668m;

    /* JADX INFO: renamed from: n */
    public w30 f25669n;

    /* JADX INFO: renamed from: o */
    public w30 f25670o;

    /* JADX INFO: renamed from: p */
    public final Runnable f25671p;

    /* JADX INFO: renamed from: q */
    public final Runnable f25672q;

    /* JADX INFO: renamed from: r */
    public View.OnClickListener f25673r;

    /* JADX INFO: renamed from: s */
    public View.OnLongClickListener f25674s;

    /* JADX INFO: renamed from: t */
    public x20 f25675t;

    /* JADX INFO: renamed from: u */
    public pcj<Boolean> f25676u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationItemView$a */
    public class C8268a implements x20 {
        public C8268a() {
        }

        @Override // p153l.x20
        public void call() {
            if (NullChecker.m82486a(ConversationItemView.this.f25673r)) {
                ConversationItemView.this.f25673r.onClick(ConversationItemView.this);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationItemView$b */
    public class C8269b implements pcj<Boolean> {
        public C8269b() {
        }

        @Override // p153l.pcj, java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return NullChecker.m82486a(ConversationItemView.this.f25674s) ? Boolean.valueOf(ConversationItemView.this.f25674s.onLongClick(ConversationItemView.this)) : Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationItemView$c */
    public class ViewOnLongClickListenerC8270c implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a */
        public String f25679a;

        /* JADX INFO: renamed from: b */
        public String f25680b;

        public ViewOnLongClickListenerC8270c(String str, String str2) {
            this.f25679a = str;
            this.f25680b = str2;
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m42043c(View view) {
            ConversationItemView.this.f25669n.m204614b();
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m42044d(VListCell vListCell, VListCell.C22660a c22660a, int i) {
            if (c22660a.f210081a.equals(ConversationItemView.this.m42000O1().getString(R$string.f19843yp))) {
                CoreModule.f18264c.f20384f0.m33812Tf(this.f25680b);
            }
            ConversationItemView.this.f25669n.m204614b();
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (!NullChecker.m82486a(CoreModule.f18264c.f20381e0.m116503Pa(this.f25679a))) {
                return false;
            }
            ArrayList arrayListM147507f0 = jyb.m147507f0(ConversationItemView.this.m42000O1().getString(R$string.f19843yp));
            w30.C21001b c21001b = new w30.C21001b(ConversationItemView.this.m42000O1());
            ConversationItemView conversationItemView = ConversationItemView.this;
            conversationItemView.f25669n = c21001b.m204657I(conversationItemView.getResources().getString(R$string.f19138c)).m204669U(new View.OnClickListener() { // from class: l.ge6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f103771a.m42043c(view2);
                }
            }).m204665Q(arrayListM147507f0).m204670V(new w30.InterfaceC21003d() { // from class: l.he6
                @Override // p153l.w30.InterfaceC21003d
                /* JADX INFO: renamed from: a */
                public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                    this.f109066a.m42044d(vListCell, c22660a, i);
                }
            }).m204654F();
            ConversationItemView.this.f25669n.m204618f();
            return true;
        }
    }

    public ConversationItemView(Context context) {
        super(context);
        this.f25663h = C22507a.m222759c(uxj0.f181467a);
        this.f25664i = new kcg0[1];
        Message message = sj6.f168909U;
        this.f25665j = C22507a.m222759c(message);
        this.f25666k = C22507a.m222759c(message);
        this.f25667l = new ArrayList();
        this.f25671p = new Runnable() { // from class: l.uc6
            @Override // java.lang.Runnable
            public final void run() {
                this.f178407a.m42027n2();
            }
        };
        this.f25672q = new Runnable() { // from class: l.fd6
            @Override // java.lang.Runnable
            public final void run() {
                this.f98321a.m42028o2();
            }
        };
        this.f25675t = new C8268a();
        this.f25676u = new C8269b();
    }

    /* JADX INFO: renamed from: F1 */
    public static /* synthetic */ void m41963F1(sj6 sj6Var, Boolean bool) {
        if (bool.booleanValue() && !sj6Var.f168939n) {
            sfj0.m185601h("e_message_limited_time_match", OMSDialogPositon.p_messages_view, new sfj0.C20032a[0]);
            sj6Var.f168939n = true;
        }
        if (bool.booleanValue()) {
            return;
        }
        sj6Var.f168939n = false;
    }

    /* JADX INFO: renamed from: R1 */
    public static boolean m41972R1(Conversation conversation) {
        return false;
    }

    private String getMCShowPositionStr() {
        pol polVar = this.f25668m.f168929d;
        if (!(polVar instanceof u46)) {
            return "";
        }
        u46 u46Var = (u46) polVar;
        StringBuilder sb = new StringBuilder();
        int iMo42530h = u46Var.mo42530h() - u46Var.mo42531k().size();
        sj6 sj6Var = this.f25668m;
        if (iMo42530h > 0) {
            sb.append((sj6Var.f168932g + 1) - iMo42530h);
        } else {
            sb.append(sj6Var.f168932g + 1);
        }
        sb.append("/");
        if (u46Var.mo42531k().isEmpty()) {
            sb.append(u46Var.mo42530h());
        } else {
            sb.append(u46Var.mo42531k().size());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: n1 */
    public static /* synthetic */ void m41985n1(Throwable th) {
    }

    /* JADX INFO: renamed from: r1 */
    public static /* synthetic */ void m41989r1(Throwable th) {
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: A */
    public void mo41998A(final sj6 sj6Var) {
        this.f25668m = sj6Var;
        setOnClickListener(this);
        Conversation conversation = sj6Var.f168926a;
        setOnLongClickListener(new ViewOnLongClickListenerC8270c(conversation.otherUser, conversation.f56859id));
        sj6Var.f168929d.mo68557c(m42000O1(), CoreModule.f18264c.f20384f0.m33775Pp()).filter(new qcj() { // from class: l.ld6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(sj6Var.f168926a.otherUser.equals((String) obj));
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.md6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f135867a.m42015e2((String) obj);
            }
        }, new y20() { // from class: l.nd6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f141452a.m42016f2((Throwable) obj);
            }
        }));
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: F0 */
    public void mo41999F0(final sj6 sj6Var) {
        this.f25668m = sj6Var;
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        final long jLongValue = (CoreModule.f18264c.f20384f0.f20607I0.get().longValue() / 1000) - (CoreModule.f18264c.f20384f0.f20604H0.get().longValue() / 1000);
        sj6Var.f168929d.mo68557c(m42000O1(), CoreModule.f18264c.f20427t1.m32512n("countdown_conv_list_key")).subscribe(psd0.m173596G(new y20() { // from class: l.zc6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f203735a.m42010Z1(simpleDateFormat, jLongValue, (RunnableC4884c0.b) obj);
            }
        }));
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.ad6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f69786a.m42011a2(sj6Var, view);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.bd6
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f76226a.m42014d2(view);
            }
        });
        ((u46) sj6Var.f168929d).mo42535v().subscribe(psd0.m173596G(new y20() { // from class: l.cd6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationItemView.m41963F1(sj6Var, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O1 */
    public PutongAct m42000O1() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: P1 */
    public void m42001P1(final sj6 sj6Var) {
        this.f25668m = sj6Var;
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.vc6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f183333a.m42007W1(sj6Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: Q1 */
    public void m42002Q1(sj6 sj6Var) {
        this.f25668m = sj6Var;
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.pd6
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f151715a.m42020i2(view);
            }
        });
    }

    /* JADX INFO: renamed from: S1 */
    public final void m42003S1(String str) {
        RunnableC4884c0.a aVarM32523d;
        String str2 = "countdown_item_limited_trial_see" + this.f25668m.f168926a.f56859id;
        long jM174454o = pzi0.m174454o();
        if (!SeeTrialStatusType.trialing.equals(str) || jM174454o >= CoreModule.f18264c.f20296B2.m186424m3()) {
            aVarM32523d = (!"waiting".equals(str) || jM174454o >= CoreModule.f18264c.f20296B2.m186424m3()) ? null : new RunnableC4884c0.a().m32527h(60L).m32520a(true).m32526g(str2).m32525f(CoreModule.f18264c.f20296B2.m186424m3()).m32523d(this);
        } else {
            aVarM32523d = new RunnableC4884c0.a().m32527h(1L).m32520a(true).m32526g(str2).m32525f(CoreModule.f18264c.f20296B2.m186424m3()).m32523d(this);
        }
        if (!NullChecker.m82486a(aVarM32523d)) {
            CoreModule.f18264c.f20427t1.m32519u(str2);
        } else {
            CoreModule.f18264c.f20427t1.m32516r(aVarM32523d);
            this.f25668m.f168929d.mo68557c(m42000O1(), CoreModule.f18264c.f20427t1.m32512n(str2)).subscribe(psd0.m173596G(new y20() { // from class: l.rd6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f162286a.m42023l2((RunnableC4884c0.b) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: T1 */
    public final /* synthetic */ void m42004T1(Intent intent, View view) {
        getContext().startActivity(intent);
    }

    /* JADX INFO: renamed from: U1 */
    public final /* synthetic */ void m42005U1(Message message) {
        this.f25665j.onNext(message);
    }

    /* JADX INFO: renamed from: V1 */
    public final /* synthetic */ void m42006V1(RunnableC4884c0.b bVar) {
        m42036v2();
    }

    /* JADX INFO: renamed from: W1 */
    public final /* synthetic */ void m42007W1(sj6 sj6Var, View view) {
        i4g0.m138523u("e_city_cover_received_greet", OMSDialogPositon.p_messages_view, jyb.m147494Y("cityc_red_dot_number", Integer.valueOf(sj6Var.f168926a.unreadMessages)), jyb.m147494Y("city_c_cell_uid", sj6Var.f168926a.otherUser));
        m42000O1().startActivity(CityTopLikersAct.m45767Z1(m42000O1()));
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m42008X1(sj6 sj6Var, View view) {
        fcp.m125022i().m125037f();
        i4g0.m138520r("e_letter_receive_entrance", OMSDialogPositon.p_messages_view);
        getContext().startActivity(SeeLetterListAct.m50185Z1(getContext(), sj6Var.f168915F.get()));
    }

    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ void m42009Y1(View view) {
        C8927c.m54687x0(m42000O1(), "p_messages,seetrial_recover_group", Privilege.see_who_likes_me);
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m42010Z1(SimpleDateFormat simpleDateFormat, long j, RunnableC4884c0.b bVar) {
        if (TextUtils.equals(bVar.f20464b, "countdown_conv_list_key")) {
            mo43452r(simpleDateFormat, bVar.f20468f, bVar.f20466d, j);
        }
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m42011a2(sj6 sj6Var, View view) {
        m195722k(sj6Var.f168927b);
        m42000O1().startActivity(MessagesAct.m50127l2(m42000O1(), sj6Var.f168926a.f56859id, false, false, 29));
        sfj0.m185596c("e_message_limited_time_match", OMSDialogPositon.p_messages_view, new sfj0.C20032a[0]);
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m42012b2(View view) {
        this.f25670o.m204614b();
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m42013c2(VListCell vListCell, VListCell.C22660a c22660a, int i) {
        CoreModule.f18264c.f20384f0.m34130sp();
        m195719h();
        this.f25670o.m204614b();
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ boolean m42014d2(View view) {
        w30 w30VarM204654F = new w30.C21001b(view.getContext()).m204657I(getResources().getString(R$string.f19138c)).m204669U(new View.OnClickListener() { // from class: l.vd6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f183541a.m42012b2(view2);
            }
        }).m204665Q(jyb.m147507f0(m42000O1().getString(R$string.f19352j))).m204670V(new w30.InterfaceC21003d() { // from class: l.wd6
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                this.f188531a.m42013c2(vListCell, c22660a, i);
            }
        }).m204654F();
        this.f25670o = w30VarM204654F;
        w30VarM204654F.m204618f();
        return false;
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m42015e2(String str) {
        Conversation conversationM33859Xe = CoreModule.f18264c.f20384f0.m33859Xe(str);
        if (m42000O1().lifecycle_() != C4470c.f16267i || !NullChecker.m82486a(conversationM33859Xe) || TEnum.equals(conversationM33859Xe.status, "deleted") || TEnum.equals(conversationM33859Xe.status, "removed") || TEnum.equals(conversationM33859Xe.status, ConversationStatus.invisible)) {
            return;
        }
        o1j0.m165649w(R$string.f19315hm);
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m42016f2(Throwable th) {
        if (m42000O1().lifecycle_() == C4470c.f16267i) {
            o1j0.m165649w(R$string.f19284gm);
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m42017g2(View view) {
        this.f25670o.m204614b();
    }

    @Override // p153l.ue6
    public /* bridge */ /* synthetic */ HashMap getUserLiveLabelHashMap() {
        return super.getUserLiveLabelHashMap();
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: h0 */
    public void mo42018h0(final sj6 sj6Var) {
        i4g0.m138526x("e_letter_receive_entrance", OMSDialogPositon.p_messages_view);
        setOnClickListener(new View.OnClickListener() { // from class: l.od6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f146848a.m42008X1(sj6Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m42019h2(ArrayList arrayList, VListCell vListCell, VListCell.C22660a c22660a, int i) {
        this.f25670o.m204614b();
        if (i >= arrayList.size() || i < 0) {
            return;
        }
        this.f25670o.m204614b();
        if (TextUtils.equals(c22660a.f210081a, "删除聊天")) {
            CoreModule.f18264c.f20381e0.f89104Q1.put(-1L);
            ConversationsList.m42339A2();
        }
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ boolean m42020i2(View view) {
        if (!CoreModule.f18264c.f20384f0.f20653X0.get().booleanValue()) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        arrayList.add("删除聊天");
        w30 w30VarM204654F = new w30.C21001b(getContext()).m204657I(getContext().getResources().getString(R$string.f19138c)).m204669U(new View.OnClickListener() { // from class: l.xd6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f193514a.m42017g2(view2);
            }
        }).m204665Q(arrayList).m204670V(new w30.InterfaceC21003d() { // from class: l.yd6
            @Override // p153l.w30.InterfaceC21003d
            /* JADX INFO: renamed from: a */
            public final void mo42907a(VListCell vListCell, VListCell.C22660a c22660a, int i) {
                this.f198573a.m42019h2(arrayList, vListCell, c22660a, i);
            }
        }).m204654F();
        this.f25670o = w30VarM204654F;
        w30VarM204654F.m204618f();
        return true;
    }

    /* JADX INFO: renamed from: j2 */
    public final /* synthetic */ void m42021j2() {
        CoreModule.f18272k.f115545m.delete(this.f25668m.f168926a.f56859id);
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m42022k2() {
        CoreModule.f18264c.f20351U.m128074a(new x20() { // from class: l.fe6
            @Override // p153l.x20
            public final void call() {
                this.f98625a.m42021j2();
            }
        });
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m42023l2(RunnableC4884c0.b bVar) {
        if (NullChecker.m82486a(bVar) && bVar.f20463a) {
            CoreModule.f18264c.f20296B2.m186430y3();
        }
        m42036v2();
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: m */
    public void mo42024m(sj6 sj6Var) {
        setOnClickListener(this);
        final ConversationLongClick conversationLongClick = new ConversationLongClick(sj6Var);
        setOnLongClickListener(conversationLongClick);
        if (sj6Var.f168926a.isTop() && TextUtils.isEmpty(sj6Var.f168950y)) {
            setBackgroundResource(dbc0.f86807Zu);
        } else {
            setBackgroundResource(dbc0.f86775Yu);
        }
        if (m42000O1() instanceof NewMainAct) {
            sj6Var.f168929d.mo68557c(m42000O1(), ((NewMainAct) m42000O1()).m40829o7()).filter(new qcj() { // from class: l.wc6
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) != TabName.Msg);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.xc6
                @Override // p153l.y20
                public final void call(Object obj) {
                    conversationLongClick.m42193d0();
                }
            }));
        }
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: m0 */
    public void mo42025m0(sj6 sj6Var) {
        m42003S1(Cfor.INSTANCE.m126494e());
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.yc6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f198391a.m42009Y1(view);
            }
        });
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m42026m2(User user, Relationship relationship) {
        r8n.m180219f().f161737k.put(user.f56859id);
        r8n.m180219f().m180233p(user.f56859id);
        CoreModule.f18264c.f20381e0.m116527W9(user.f56859id);
        if (TEnum.equals(relationship.state, "matched")) {
            CoreModule.f18264c.f20429u0.m31383C7(user.f56859id);
        }
        r8n.m180219f().m180235r(user.f56859id, true);
        if (IntlCountryCodeController.m29110g()) {
            o3z.m165898g().m165906k(user.f56859id).subscribe(psd0.m173591B());
        }
        pol polVar = this.f25668m.f168929d;
        if (polVar instanceof u46) {
            ((u46) polVar).mo42534q();
        }
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m42027n2() {
        if (NullChecker.m82486a(this.f25668m.f168926a)) {
            CoreModule.f18264c.f20384f0.m34206yp(this.f25668m.f168926a.f56859id);
        }
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m42028o2() {
        if (NullChecker.m82486a(this.f25668m.f168926a)) {
            CoreModule.f18264c.f20384f0.m34193xp(this.f25668m.f168926a.f56859id);
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0388  */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        String str2;
        if (this.f25661f.mo43431K0()) {
            return;
        }
        sj6 sj6Var = this.f25668m;
        final Conversation conversation = sj6Var.f168926a;
        final User user = sj6Var.f168927b;
        if (ue6.m195672o(conversation)) {
            CoreModule.m30933P().m143405a().mo34575qm(m42000O1(), "p_message,blur_cell", Privilege.see_who_likes_me, new y20() { // from class: l.qd6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f156660a.m42030q2(conversation, obj);
                }
            });
            return;
        }
        m195733w(this.f25668m);
        boolean z = true;
        if (br5.m106035f(conversation)) {
            i4g0.m138520r("e_message_tab_compliment_cell_click", OMSDialogPositon.p_messages_view);
            if (!f25655v) {
                i4g0.m138526x("e_message_tab_compliment_cell_click", OMSDialogPositon.p_messages_view);
                f25655v = true;
            }
        }
        if (NullChecker.m82486a(user) && NullChecker.m82486a(this.f25668m.f168926a) && TextUtils.equals(this.f25668m.f168926a.convType, ConversationType.intlSeeChatRequest)) {
            if (!rbb0.m180744q()) {
                m42034t2();
                return;
            }
            r8n.m180219f().f161732f.put(user.f56859id);
            r8n.m180219f().m180236s(user.f56859id, false, true);
            i4g0.m138523u("e_chat_request_operate", OMSDialogPositon.p_messages_view, jyb.m147494Y("show_where", this.f25668m.f168930e ? LocalPlaceBan.matchList : LocalPlaceBan.chatList), jyb.m147494Y("request_show_type", this.f25668m.f168934i), jyb.m147494Y("show_position", getMCShowPositionStr()), jyb.m147494Y("chat_request_operate", "click"));
            CoreModule.m30933P().m143405a().mo34410Sl(m42000O1(), "p_messages_view,e_chat_request,click", Privilege.see_chat_request_gp, new x20() { // from class: l.zd6
                @Override // p153l.x20
                public final void call() {
                    r8n.m180219f().f161732f.put("");
                }
            }, TextUtils.concat("chat_request_", user.f56859id).toString());
            fp60.m126543E().subscribe(psd0.m173596G(new y20() { // from class: l.ae6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f70769a.m42031r2(user, (PaymentResultWrapper) obj);
                }
            }));
            return;
        }
        if (r8n.m180219f().f161728b.m222761e() != null && !jyb.m147479J(r8n.m180219f().f161728b.m222761e().users)) {
            fp60.m126543E().subscribe(psd0.m173596G(new y20() { // from class: l.be6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f76344a.m42032s2((PaymentResultWrapper) obj);
                }
            }));
        }
        if (NullChecker.m82486a(this.f25656a) && this.f25656a.mo43483O()) {
            i4g0.m138521s("e_red_dot_message_chat", OMSDialogPositon.p_messages_view, i6e.m138811c("red_dot", "red_dot_normal", "chat_bar", "message_list_page", "tips"));
        } else {
            i4g0.m138521s("e_red_dot_message_chat", OMSDialogPositon.p_messages_view, i6e.m138812d());
        }
        if (NullChecker.m82486a(this.f25668m.f168919J)) {
            this.f25668m.f168919J.call();
        }
        if (gra.m131637V1() && NullChecker.m82486a(conversation) && pm6.m172913a(conversation)) {
            ChatGroup chatGroupM32889h7 = CoreModule.f18264c.f20387g0.m32889h7(conversation.otherUser);
            boolean zM82486a = NullChecker.m82486a(chatGroupM32889h7);
            String str3 = conversation.otherUser;
            if (zM82486a) {
                sfj0.m185596c("e_group_item", OMSDialogPositon.p_messages_view, sfj0.C20032a.m185615h("groupchat_id", str3), sfj0.C20032a.m185613f("is_anonymou_group", jek.m144587s(chatGroupM32889h7) ? 1 : 0));
            } else {
                sfj0.m185596c("e_group_item", OMSDialogPositon.p_messages_view, sfj0.C20032a.m185615h("groupchat_id", str3), sfj0.C20032a.m185613f("is_anonymou_group", 0));
            }
        }
        l600.m153045a();
        String str4 = "";
        if ((d79.m114662U() || gra.m131580I2()) && (TextUtils.equals(conversation.f56859id, "fake_conversation_greeting") || TextUtils.equals(conversation.f56859id, "fake_conversation_anonymous_greeting"))) {
            if (d79.m114662U()) {
                i4g0.m138520r("e_intl_message_im_hi_enter", OMSDialogPositon.p_messages_view);
                m42000O1().startActivity(IntlDynamicGreetListAct.m47345Y1(m42000O1(), null, ""));
                return;
            }
            if (mn40.m159114b()) {
                sfj0.m185596c("e_kankan_stranger_message", OMSDialogPositon.p_messages_view, sfj0.C20032a.m185615h("is_red_dot", "1"), sfj0.C20032a.m185615h("is_greeting_new", "1"));
            } else if (NullChecker.m82486a(conversation) && TextUtils.equals(conversation.f56859id, "fake_conversation_anonymous_greeting")) {
                sfj0.m185596c("e_anonymous_cell", OMSDialogPositon.p_messages_view, new sfj0.C20032a[0]);
            } else {
                sfj0.m185596c("e_kankan_stranger_message", OMSDialogPositon.p_messages_view, sfj0.C20032a.m185615h("is_red_dot", conversation.additional.kankan.greetingSummaryDetail.unseen <= 0 ? "0" : "1"), sfj0.C20032a.m185615h("is_greeting_new", "0"));
            }
            PutongAct putongActM42000O1 = m42000O1();
            PutongAct putongActM42000O2 = m42000O1();
            if (NullChecker.m82486a(conversation) && TextUtils.equals(conversation.f56859id, "fake_conversation_anonymous_greeting")) {
                str4 = "from_anonymous_greeting";
            }
            putongActM42000O1.startActivity(DynamicGreetListAct.m37458Y1(putongActM42000O2, null, str4));
            if (mn40.m159114b()) {
                CoreModule.f18264c.f20420r0.m35135m5();
                return;
            }
            return;
        }
        if (!spl0.m187372X() || !conversation.isLimitedTrialSee(CoreModule.m30929H().userId()) || joa.m146361M3() || CoreModule.f18264c.f20381e0.m116600p9().isFemale()) {
            m195722k(user);
            m42000O1().startActivity(MessagesAct.m50115N2(m42000O1(), conversation.f56859id, false, false, 29, this.f25668m.f168941p, user != null && User.isAiStory(user.f56859id)));
        } else {
            String strM126494e = Cfor.INSTANCE.m126494e();
            if (SeeTrialStatusType.trialEnd.equals(strM126494e) || "waiting".equals(strM126494e) || "expired".equals(strM126494e)) {
                C8927c.m54687x0(m42000O1(), "p_messages,seetrial_recover_one", Privilege.see_who_likes_me);
            } else {
                m195722k(user);
                m42000O1().startActivity(MessagesAct.m50115N2(m42000O1(), conversation.f56859id, false, false, 29, this.f25668m.f168941p, user != null && User.isAiStory(user.f56859id)));
            }
        }
        if (NullChecker.m82486a(conversation) && TextUtils.equals(conversation.otherUser, syu.m188587h())) {
            sfj0.m185596c("e_live_vip_customer_service", OMSDialogPositon.p_messages_view, new sfj0.C20032a[0]);
        }
        String string = (NullChecker.m82486a(conversation) && NullChecker.m82486a(conversation.additional) && NullChecker.m82486a(conversation.additional.tag) && NullChecker.m82486a(conversation.additional.tag.type) && !TEnum.equals(conversation.additional.tag.type, "unknown_")) ? conversation.additional.tag.type.toString() : "";
        if (m195710Z0(this.f25668m.f168926a) && !this.f25668m.f168926a.hasRemoveLabel() && this.f25668m.f168926a.unreadMessages == 0) {
            str = "1," + n46.m161541g().m161547j(conversation.f56859id, true);
        } else {
            str = "";
        }
        if (m195729q(this.f25668m)) {
            str2 = "gotoreply";
        } else {
            Conversation conversation2 = this.f25668m.f168926a;
            if (conversation2.unreadMessages > 0 || !m195728p0(conversation2) || TextUtils.isEmpty(this.f25668m.f168926a.property.conversationTag.suggestExpireTime) || pzi0.m174454o() >= Long.parseLong(this.f25668m.f168926a.property.conversationTag.suggestExpireTime) * 1000) {
                str2 = "";
            } else if (!TextUtils.isEmpty(this.f25668m.f168926a.property.conversationTag.emoji)) {
                str2 = "emoji";
            } else if (TextUtils.isEmpty(this.f25668m.f168926a.property.conversationTag.suggestText)) {
                str2 = "";
            } else {
                str2 = "startchat";
            }
        }
        sfj0.C20032a c20032aM185615h = sfj0.C20032a.m185615h("create_time", c17.f79338h.format(conversation.createdTime));
        sfj0.C20032a c20032aM185615h2 = sfj0.C20032a.m185615h("is_online", CoreModule.f18264c.f20330N0.m32969j3(user) ? "1" : "0");
        StringBuilder sb = new StringBuilder("");
        sj6 sj6Var2 = this.f25668m;
        sb.append(sj6Var2.f168938m - sj6Var2.f168933h);
        sfj0.C20032a c20032aM185615h3 = sfj0.C20032a.m185615h("new_match_rank", sb.toString());
        sfj0.C20032a c20032aM185615h4 = sfj0.C20032a.m185615h("moments_user_id", conversation.otherUser);
        sfj0.C20032a c20032aM185615h5 = sfj0.C20032a.m185615h("operation_id", this.f25668m.f168937l);
        sfj0.C20032a c20032aM185615h6 = sfj0.C20032a.m185615h("is_new_moment", "0");
        sfj0.C20032a c20032aM185615h7 = sfj0.C20032a.m185615h("new_msg_page_module", (m195699S(conversation) || m195723l(conversation)) ? "0" : "1");
        sfj0.C20032a c20032aM185615h8 = sfj0.C20032a.m185615h("chat_guide", str);
        if (!conversation.isFakeHeartbeatConv() && !conversation.isFakeQuickChatConv()) {
            z = false;
        }
        sfj0.C20032a c20032aM185616i = sfj0.C20032a.m185616i("is_fake", z);
        sfj0.C20032a c20032aM185615h9 = sfj0.C20032a.m185615h("is_onlive_anchor", this.f25668m.f168920K);
        sfj0.C20032a c20032aM185615h10 = sfj0.C20032a.m185615h("is_red_dot", conversation.read.booleanValue() ? "0" : "1");
        sfj0.C20032a c20032aM185615h11 = sfj0.C20032a.m185615h("other_uid", conversation.otherUser);
        sfj0.C20032a c20032aM185613f = sfj0.C20032a.m185613f("red_dot_num", conversation.unreadMessages);
        sfj0.C20032a c20032aM185616i2 = sfj0.C20032a.m185616i("chat_game_show", false);
        sfj0.C20032a c20032aM185615h12 = sfj0.C20032a.m185615h(MessageType.love_letter, "");
        if (n46.m161541g().m161552o(conversation.f56859id) && !conversation.hasRemoveLabel()) {
            string = "longtimenosee";
        }
        sfj0.m185596c("e_messages_view_match", OMSDialogPositon.p_messages_view, c20032aM185615h, c20032aM185615h2, c20032aM185615h3, c20032aM185615h4, c20032aM185615h5, c20032aM185615h6, c20032aM185615h7, c20032aM185615h8, c20032aM185616i, c20032aM185615h9, c20032aM185615h10, c20032aM185615h11, c20032aM185613f, c20032aM185616i2, c20032aM185615h12, sfj0.C20032a.m185615h(DetectCategoryType.user_tag, string), sfj0.C20032a.m185615h("day_number", this.f25668m.f168922M), sfj0.C20032a.m185615h("pairing_type", conversation.hasReSwipeConvIceBreak() ? "break_ice" : "unbreak_ice"), sfj0.C20032a.m185615h("messagec_cell_type", om6.m168195a(conversation)), sfj0.C20032a.m185615h("is_platinum_top_chat", (CoreModule.m30933P().m143410g().mo36051b8() && conversation.isPlatinumTop()) ? "yes" : "no"), sfj0.C20032a.m185615h(SeeSwitchName.message_tab, m195717g(this.f25668m.f168929d)), sfj0.C20032a.m185615h("guide_type", str2), sfj0.C20032a.m185613f("spark_level", om6.m168199e(conversation)), sfj0.C20032a.m185613f("message_pairs", om6.m168198d(conversation)), sfj0.C20032a.m185613f("is_close_friend", om6.m168196b(conversation)), sfj0.C20032a.m185613f("is_top_recommend", om6.m168197c(conversation)));
        m195735x0(this.f25668m);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        l51.m152890J(this.f25672q);
        CoreModule.f18264c.f20427t1.m32518t(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (gra.m131778z()) {
            bnl0.m105505C0(this, sj6.f168906R);
        }
        this.f25660e = this;
        this.f25667l.add(this);
        orl orlVar = (orl) findViewById(adc0.f70265b5);
        this.f25661f = orlVar;
        this.f25667l.add(orlVar);
        orl orlVar2 = (orl) findViewById(adc0.f70409je);
        this.f25662g = orlVar2;
        this.f25667l.add(orlVar2);
        orl orlVar3 = (orl) findViewById(adc0.f70273bd);
        this.f25656a = orlVar3;
        if (NullChecker.m82486a(orlVar3)) {
            this.f25667l.add(this.f25656a);
        }
        orl orlVar4 = (orl) findViewById(adc0.f70183W4);
        this.f25657b = orlVar4;
        if (NullChecker.m82486a(orlVar4)) {
            this.f25667l.add(this.f25657b);
        }
        orl orlVar5 = (orl) findViewById(adc0.f70098R4);
        this.f25658c = orlVar5;
        if (NullChecker.m82486a(orlVar5)) {
            this.f25667l.add(this.f25658c);
        }
        orl orlVar6 = (orl) findViewById(adc0.f69816Ab);
        this.f25659d = orlVar6;
        if (NullChecker.m82486a(orlVar6)) {
            this.f25667l.add(this.f25659d);
        }
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m42029p2(sj6 sj6Var, LinkedHashMap linkedHashMap) {
        if (((UserLiveLabel) linkedHashMap.get(sj6Var.f168927b)) != null) {
            sj6Var.f168931f = true;
            m42036v2();
        } else if (sj6Var.f168931f) {
            sj6Var.f168931f = false;
            m42036v2();
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        if (!NullChecker.m82486a(this.f25673r)) {
            return super.performClick();
        }
        this.f25673r.onClick(this);
        return true;
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m42030q2(Conversation conversation, Object obj) {
        m42036v2();
        if (conversation.lowPayOneSideConv()) {
            return;
        }
        performClick();
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m42031r2(User user, PaymentResultWrapper paymentResultWrapper) {
        Object obj = paymentResultWrapper.tag;
        if ((obj instanceof String) && TextUtils.equals((String) obj, TextUtils.concat("chat_request_", user.f56859id).toString())) {
            m42034t2();
        }
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m42032s2(PaymentResultWrapper paymentResultWrapper) {
        pol polVar = this.f25668m.f168929d;
        if (polVar instanceof u46) {
            ((u46) polVar).mo42534q();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        if (!zg6.m219594e() || !NullChecker.m82486a(this.f25668m) || this.f25668m.f168940o || (m42000O1() instanceof ConversationAddressBookUnMatchAct)) {
            super.setOnClickListener(onClickListener);
        } else {
            this.f25673r = onClickListener;
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        if (!zg6.m219594e() || (m42000O1() instanceof ConversationAddressBookUnMatchAct)) {
            super.setOnLongClickListener(onLongClickListener);
        } else {
            this.f25674s = onLongClickListener;
        }
    }

    @Override // p153l.nrl
    public void setPicPercent(float f) {
        this.f25661f.setPicPercent(f);
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: t0 */
    public void mo42033t0(final sj6 sj6Var) {
        if (sj6Var.f168947v && NullChecker.m82486a(sj6Var.f168927b)) {
            final Intent intentM51927w2 = ProfileAct.m51927w2(m42000O1(), sj6Var.f168927b.f56859id, "from_conversation_search_view", false, false, false, RelationshipStatus.get("unknown_"), 273, false, true, false, false);
            bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.dd6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f87857a.m42004T1(intentM51927w2, view);
                }
            });
            return;
        }
        setOnClickListener(this);
        final ConversationLongClick conversationLongClick = new ConversationLongClick(sj6Var);
        setOnLongClickListener(conversationLongClick);
        if (sj6Var.f168926a.isMarriageConv()) {
            setBackgroundResource(dbc0.f86775Yu);
        } else if (CoreModule.m30933P().m143410g().mo36051b8() && sj6Var.f168926a.isPlatinumTop() && !m195706W(sj6Var.f168929d)) {
            setBackgroundResource(dbc0.f87448tf);
        } else if (sj6Var.f168926a.isTop() && TextUtils.isEmpty(sj6Var.f168950y) && !m195706W(sj6Var.f168929d)) {
            setBackgroundResource(dbc0.f86807Zu);
        } else {
            setBackgroundResource(dbc0.f86775Yu);
        }
        if ((m42000O1() instanceof NewMainAct) && NullChecker.m82486a(sj6Var.f168929d)) {
            sj6Var.f168929d.mo68557c(m42000O1(), ((NewMainAct) m42000O1()).m40829o7().filter(new qcj() { // from class: l.ed6
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) != TabName.Msg);
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.gd6
                @Override // p153l.y20
                public final void call(Object obj) {
                    conversationLongClick.m42193d0();
                }
            }));
        }
        if (!gra.m131657a2()) {
            m42035u2(sj6Var);
        }
        if (ue6.m195659C0(sj6Var.f168926a)) {
            m195713b(this.f25667l, new y20() { // from class: l.hd6
                @Override // p153l.y20
                public final void call(Object obj) {
                    ((orl) obj).mo43412J(sj6Var);
                }
            });
            return;
        }
        this.f25665j.onNext(sj6.f168909U);
        if (NullChecker.m82486a(sj6Var.f168926a)) {
            sj6Var.f168929d.mo68557c(m42000O1(), CoreModule.f18272k.f115535c.m189464Z(sj6Var.f168926a.f56859id, sj6Var.f168926a.clearedTime, false).m208677m().map(new qcj() { // from class: l.id6
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ue6.m195675t((List) obj, sj6Var.f168927b);
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.jd6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f120113a.m42005U1((Message) obj);
                }
            }));
        }
        if (d79.m114675e0() && NullChecker.m82486a(sj6Var.f168926a) && "lovebuzz".equals(sj6Var.f168926a.convType)) {
            if (CoreModule.f18273l.m143406b().mo36104Pj(sj6Var.f168926a)) {
                RunnableC4884c0.a aVar = new RunnableC4884c0.a();
                aVar.m32526g("countdown_item_love_buzz_key" + sj6Var.f168926a.f56859id).m32525f(sj6Var.f168926a.property.intl_love_buzz.expire).m32527h(60L).m32520a(true).m32523d(this);
                CoreModule.f18264c.f20427t1.m32516r(aVar);
                sj6Var.f168929d.mo68557c(m42000O1(), CoreModule.f18264c.f20427t1.m32512n("countdown_item_love_buzz_key" + sj6Var.f168926a.f56859id)).subscribe(psd0.m173596G(new y20() { // from class: l.kd6
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f125155a.m42006V1((RunnableC4884c0.b) obj);
                    }
                }));
            } else {
                CoreModule.f18264c.f20427t1.m32519u("countdown_item_love_buzz_key" + sj6Var.f168926a.f56859id);
            }
        }
        m195684F(m42000O1(), sj6Var.f168926a.f56859id, (u46) sj6Var.f168929d, this);
        m42037w2();
        l51.m152890J(this.f25671p);
        Conversation conversation = sj6Var.f168926a;
        int i = conversation.level;
        if (i == 55) {
            if (NullChecker.m82486a(conversation.additional) && NullChecker.m82486a(sj6Var.f168926a.additional.tag) && sj6Var.f168926a.additional.tag.expireTime * 1000 > pzi0.m174454o()) {
                l51.m152888H(getContext(), this.f25671p, (sj6Var.f168926a.additional.tag.expireTime * 1000) - pzi0.m174454o());
            } else {
                CoreModule.f18264c.f20384f0.m34206yp(sj6Var.f168926a.f56859id);
            }
        } else if (i == 90 && CoreModule.m30933P().m143410g().mo36051b8()) {
            l51.m152890J(this.f25672q);
            if (NullChecker.m82486a(sj6Var.f168926a.additional) && NullChecker.m82486a(sj6Var.f168926a.additional.pinChat) && sj6Var.f168926a.additional.pinChat.expireTime > pzi0.m174454o()) {
                m42038x2();
                l51.m152888H(getContext(), this.f25672q, (long) (sj6Var.f168926a.additional.pinChat.expireTime - pzi0.m174454o()));
            } else {
                CoreModule.f18264c.f20384f0.m34193xp(sj6Var.f168926a.f56859id);
                CoreModule.f18264c.f20427t1.m32519u("countdown_item_platinum_pin" + sj6Var.f168926a.f56859id);
            }
        }
        if (!spl0.m187372X() || !sj6Var.f168926a.isLimitedTrialSee(CoreModule.m30929H().userId()) || joa.m146361M3() || CoreModule.f18264c.f20381e0.m116600p9().isFemale()) {
            return;
        }
        m42003S1(Cfor.INSTANCE.m126494e());
    }

    /* JADX INFO: renamed from: t2 */
    public final void m42034t2() {
        final User user = this.f25668m.f168927b;
        m42000O1().duringCreated(CoreModule.f18264c.f20405m0.m32064V7(true, false, null, user, null)).subscribe(psd0.m173597H(new y20() { // from class: l.de6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f87988a.m42026m2(user, (Relationship) obj);
            }
        }, new y20() { // from class: l.ee6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationItemView.m41989r1((Throwable) obj);
            }
        }));
        m42000O1().duringCreated(CoreModule.f18264c.f20405m0.m32131n6());
    }

    @Override // com.p051p1.mobile.putong.core.api.RunnableC4884c0.c
    /* JADX INFO: renamed from: u */
    public void mo32530u(String str, long j, long j2, long j3, long j4) {
        if (NullChecker.m82486a(this.f25668m) && NullChecker.m82486a(this.f25668m.f168926a)) {
            if (!TextUtils.equals(str, "exclusive_tag_" + this.f25668m.f168926a.f56859id)) {
                if (!TextUtils.equals(str, "love_script_tag_" + this.f25668m.f168926a.f56859id)) {
                    if (!TextUtils.equals("countdown_item_platinum_pin" + this.f25668m.f168926a.f56859id, str)) {
                        if (TextUtils.equals(str, "heartbeat_conv_item_" + this.f25668m.f168926a.f56859id) && this.f25668m.f168926a.isHeartbeatConv() && pzi0.m174454o() >= this.f25668m.f168926a.additional.heartbeatMatch.expireTime) {
                            l51.m152919y(new Runnable() { // from class: l.ce6
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f81312a.m42022k2();
                                }
                            });
                            return;
                        }
                        return;
                    }
                }
            }
            m42036v2();
        }
    }

    /* JADX INFO: renamed from: u2 */
    public final void m42035u2(final sj6 sj6Var) {
        if (!vq8.m202358b() || sj6Var == null) {
            return;
        }
        sj6Var.f168931f = CoreModule.f18264c.f20384f0.f20588B2.m222761e().containsKey(sj6Var.f168927b);
        sj6Var.f168929d.mo68557c(m42000O1(), CoreModule.f18264c.f20384f0.m33655Fq()).subscribe(psd0.m173597H(new y20() { // from class: l.td6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f173310a.m42029p2(sj6Var, (LinkedHashMap) obj);
            }
        }, new y20() { // from class: l.ud6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationItemView.m41985n1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v2 */
    public void m42036v2() {
        this.f25663h.onNext(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: w2 */
    public final void m42037w2() {
        if (NullChecker.m82486a(this.f25668m) && NullChecker.m82486a(this.f25668m.f168926a) && NullChecker.m82486a(this.f25668m.f168926a.property) && NullChecker.m82486a(this.f25668m.f168926a.property.loveScript) && "lovescript".equals(this.f25668m.f168926a.convType)) {
            long j = this.f25668m.f168926a.property.loveScript.expireTime;
            if (j == 0 || j <= pzi0.m174454o()) {
                return;
            }
            RunnableC4884c0.a aVar = new RunnableC4884c0.a();
            aVar.m32526g("love_script_tag_" + this.f25668m.f168926a.f56859id).m32525f(this.f25668m.f168926a.property.loveScript.expireTime).m32527h(1L).m32520a(true).m32523d(this);
            CoreModule.f18264c.f20427t1.m32516r(aVar);
            if (this.f25668m.f168936k.m161054a("e_story_mtached_cell_click")) {
                return;
            }
            i4g0.m138492A("e_story_mtached_cell_click", OMSDialogPositon.p_messages_view, jyb.m147494Y("cell_numbers", 0));
            this.f25668m.f168936k.m161055b("e_story_mtached_cell_click");
        }
    }

    /* JADX INFO: renamed from: x2 */
    public final void m42038x2() {
        RunnableC4884c0.a aVar = new RunnableC4884c0.a();
        aVar.m32526g("countdown_item_platinum_pin" + this.f25668m.f168926a.f56859id).m32525f((long) this.f25668m.f168926a.additional.pinChat.expireTime).m32527h(1L).m32520a(true).m32523d(this);
        CoreModule.f18264c.f20427t1.m32516r(aVar);
    }

    @Override // p153l.orl
    /* JADX INFO: renamed from: z0 */
    public void mo42039z0(Conversation conversation, User user, sj6 sj6Var) {
        this.f25668m = sj6Var;
        sj6Var.f168926a = conversation;
        if (NullChecker.m82486a(conversation) && sj6Var.f168926a.localEverHasMessage) {
            m195719h();
        } else {
            m195713b(this.f25667l, new y20() { // from class: l.sd6
                @Override // p153l.y20
                public final void call(Object obj) {
                    ((orl) obj).mo43425y0();
                }
            });
        }
    }

    public ConversationItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25663h = C22507a.m222759c(uxj0.f181467a);
        this.f25664i = new kcg0[1];
        Message message = sj6.f168909U;
        this.f25665j = C22507a.m222759c(message);
        this.f25666k = C22507a.m222759c(message);
        this.f25667l = new ArrayList();
        this.f25671p = new Runnable() { // from class: l.uc6
            @Override // java.lang.Runnable
            public final void run() {
                this.f178407a.m42027n2();
            }
        };
        this.f25672q = new Runnable() { // from class: l.fd6
            @Override // java.lang.Runnable
            public final void run() {
                this.f98321a.m42028o2();
            }
        };
        this.f25675t = new C8268a();
        this.f25676u = new C8269b();
    }

    public ConversationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25663h = C22507a.m222759c(uxj0.f181467a);
        this.f25664i = new kcg0[1];
        Message message = sj6.f168909U;
        this.f25665j = C22507a.m222759c(message);
        this.f25666k = C22507a.m222759c(message);
        this.f25667l = new ArrayList();
        this.f25671p = new Runnable() { // from class: l.uc6
            @Override // java.lang.Runnable
            public final void run() {
                this.f178407a.m42027n2();
            }
        };
        this.f25672q = new Runnable() { // from class: l.fd6
            @Override // java.lang.Runnable
            public final void run() {
                this.f98321a.m42028o2();
            }
        };
        this.f25675t = new C8268a();
        this.f25676u = new C8269b();
    }
}
