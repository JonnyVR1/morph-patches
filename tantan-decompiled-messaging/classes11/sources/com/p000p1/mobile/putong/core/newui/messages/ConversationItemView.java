package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.newui.greet.DynamicGreetListAct;
import com.p000p1.mobile.putong.core.newui.main.NewMainAct;
import com.p000p1.mobile.putong.core.newui.messages.ConversationItemView;
import com.p000p1.mobile.putong.core.newui.messages.addressbook.ConversationAddressBookUnMatchAct;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.c0;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.Greeting;
import com.p1.mobile.putong.core.data.InsertConversationsList;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.PaymentResultWrapper;
import com.p1.mobile.putong.core.data.Privilege;
import com.p1.mobile.putong.core.ui.citytop.CityTopLikersAct;
import com.p1.mobile.putong.core.ui.intl.greet.message.IntlDynamicGreetListAct;
import com.p1.mobile.putong.core.ui.messages.MessagesAct;
import com.p1.mobile.putong.core.ui.messages.SeeLetterListAct;
import com.p1.mobile.putong.core.ui.profile.ProfileAct;
import com.p1.mobile.putong.core.ui.purchase.c;
import com.p1.mobile.putong.data.Relationship;
import com.p1.mobile.putong.data.RelationshipStatus;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserLiveLabel;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.NullChecker;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;
import l.c40;
import l.c4g0;
import l.d30;
import l.dml;
import l.e30;
import l.e51;
import l.emr;
import l.fap;
import l.i36;
import l.j760;
import l.lsi0;
import l.mkd0;
import l.ml6;
import l.n3b0;
import l.o6j0;
import l.ogl0;
import l.oxz;
import l.qp8;
import l.roj0;
import l.ruy;
import l.tbk;
import l.u4c0;
import l.u59;
import l.upa;
import l.v9j;
import l.vwb;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.xma;
import l.xp5;
import l.zvf0;
import l.zz6;
import p009l.ah60;
import p009l.cpl;
import p009l.ll6;
import p009l.mqi0;
import p009l.p36;
import p009l.pi6;
import p009l.r6n;
import p009l.rd6;
import p009l.rwu;
import p009l.u4e;
import p009l.wf6;
import p009l.ye40;
import rx.subjects.a;
import v.VListCell;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public abstract class ConversationItemView extends LinearLayout implements View.OnClickListener, c0.c, cpl {

    /* JADX INFO: renamed from: v */
    public static boolean f3691v;

    /* JADX INFO: renamed from: a */
    @Nullable
    public cpl f3692a;

    /* JADX INFO: renamed from: b */
    @Nullable
    public cpl f3693b;

    /* JADX INFO: renamed from: c */
    @Nullable
    public cpl f3694c;

    /* JADX INFO: renamed from: d */
    @Nullable
    public cpl f3695d;

    /* JADX INFO: renamed from: e */
    public cpl f3696e;

    /* JADX INFO: renamed from: f */
    public cpl f3697f;

    /* JADX INFO: renamed from: g */
    public cpl f3698g;

    /* JADX INFO: renamed from: h */
    public a<roj0> f3699h;

    /* JADX INFO: renamed from: i */
    public final c4g0[] f3700i;

    /* JADX INFO: renamed from: j */
    public a<Message> f3701j;

    /* JADX INFO: renamed from: k */
    public a<Message> f3702k;

    /* JADX INFO: renamed from: l */
    public List<cpl> f3703l;

    /* JADX INFO: renamed from: m */
    public pi6 f3704m;

    /* JADX INFO: renamed from: n */
    public c40 f3705n;

    /* JADX INFO: renamed from: o */
    public c40 f3706o;

    /* JADX INFO: renamed from: p */
    public final Runnable f3707p;

    /* JADX INFO: renamed from: q */
    public final Runnable f3708q;

    /* JADX INFO: renamed from: r */
    public View.OnClickListener f3709r;

    /* JADX INFO: renamed from: s */
    public View.OnLongClickListener f3710s;

    /* JADX INFO: renamed from: t */
    public d30 f3711t;

    /* JADX INFO: renamed from: u */
    public v9j<Boolean> f3712u;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationItemView$a */
    public class C0281a implements d30 {
        public C0281a() {
        }

        public void call() {
            if (NullChecker.a(ConversationItemView.this.f3709r)) {
                ConversationItemView.this.f3709r.onClick(ConversationItemView.this);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationItemView$b */
    public class C0282b implements v9j<Boolean> {
        public C0282b() {
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            return NullChecker.a(ConversationItemView.this.f3710s) ? Boolean.valueOf(ConversationItemView.this.f3710s.onLongClick(ConversationItemView.this)) : Boolean.FALSE;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationItemView$c */
    public class ViewOnLongClickListenerC0283c implements View.OnLongClickListener {

        /* JADX INFO: renamed from: a */
        public String f3715a;

        /* JADX INFO: renamed from: b */
        public String f3716b;

        public ViewOnLongClickListenerC0283c(String str, String str2) {
            this.f3715a = str;
            this.f3716b = str2;
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m5134c(View view) {
            ConversationItemView.this.f3705n.b();
        }

        /* JADX INFO: renamed from: d */
        public final /* synthetic */ void m5135d(VListCell vListCell, VListCell.a aVar, int i) {
            if (aVar.a.equals(ConversationItemView.this.m5090O1().getString(R.string.cp))) {
                CoreModule.c.f0.Tf(this.f3716b);
            }
            ConversationItemView.this.f3705n.b();
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            if (!NullChecker.a(CoreModule.c.e0.Pa(this.f3715a))) {
                return false;
            }
            ArrayList arrayListF0 = vwb.f0(new CharSequence[]{ConversationItemView.this.m5090O1().getString(R.string.cp)});
            c40.b bVar = new c40.b(ConversationItemView.this.m5090O1());
            ConversationItemView conversationItemView = ConversationItemView.this;
            conversationItemView.f3705n = bVar.I(conversationItemView.getResources().getString(R.string.c)).U(new View.OnClickListener() { // from class: l.dd6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f11773a.m5134c(view2);
                }
            }).Q(arrayListF0).V(new c40.d() { // from class: l.ed6
                /* JADX INFO: renamed from: a */
                public final void m13831a(VListCell vListCell, VListCell.a aVar, int i) {
                    this.f12511a.m5135d(vListCell, aVar, i);
                }
            }).F();
            ConversationItemView.this.f3705n.f();
            return true;
        }
    }

    public ConversationItemView(Context context) {
        super(context);
        this.f3699h = a.c(roj0.a);
        this.f3700i = new c4g0[1];
        Message message = pi6.f18605U;
        this.f3701j = a.c(message);
        this.f3702k = a.c(message);
        this.f3703l = new ArrayList();
        this.f3707p = new Runnable() { // from class: l.rb6
            @Override // java.lang.Runnable
            public final void run() {
                this.f19718a.m5117n2();
            }
        };
        this.f3708q = new Runnable() { // from class: l.cc6
            @Override // java.lang.Runnable
            public final void run() {
                this.f10510a.m5118o2();
            }
        };
        this.f3711t = new C0281a();
        this.f3712u = new C0282b();
    }

    /* JADX INFO: renamed from: F1 */
    public static /* synthetic */ void m5053F1(pi6 pi6Var, Boolean bool) {
        if (bool.booleanValue() && !pi6Var.f18635n) {
            o6j0.h("e_message_limited_time_match", "p_messages_view", new o6j0.a[0]);
            pi6Var.f18635n = true;
        }
        if (bool.booleanValue()) {
            return;
        }
        pi6Var.f18635n = false;
    }

    /* JADX INFO: renamed from: R1 */
    public static boolean m5062R1(Conversation conversation) {
        return false;
    }

    private String getMCShowPositionStr() {
        dml dmlVar = this.f3704m.f18625d;
        if (!(dmlVar instanceof p36)) {
            return "";
        }
        p36 p36Var = (p36) dmlVar;
        StringBuilder sb = new StringBuilder();
        int iMo5626h = p36Var.mo5626h() - p36Var.mo5628k().size();
        pi6 pi6Var = this.f3704m;
        if (iMo5626h > 0) {
            sb.append((pi6Var.f18628g + 1) - iMo5626h);
        } else {
            sb.append(pi6Var.f18628g + 1);
        }
        sb.append("/");
        if (p36Var.mo5628k().isEmpty()) {
            sb.append(p36Var.mo5626h());
        } else {
            sb.append(p36Var.mo5628k().size());
        }
        return sb.toString();
    }

    /* JADX INFO: renamed from: n1 */
    public static /* synthetic */ void m5075n1(Throwable th) {
    }

    /* JADX INFO: renamed from: r1 */
    public static /* synthetic */ void m5079r1(Throwable th) {
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: A */
    public void mo5088A(final pi6 pi6Var) {
        this.f3704m = pi6Var;
        setOnClickListener(this);
        Conversation conversation = pi6Var.f18622a;
        setOnLongClickListener(new ViewOnLongClickListenerC0283c(conversation.otherUser, ((DbObject) conversation).id));
        pi6Var.f18625d.c(m5090O1(), CoreModule.c.f0.Pp()).filter(new w9j() { // from class: l.ic6
            public final Object call(Object obj) {
                return Boolean.valueOf(pi6Var.f18622a.otherUser.equals((String) obj));
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.jc6
            public final void call(Object obj) {
                this.f15052a.m5105e2((String) obj);
            }
        }, new e30() { // from class: l.kc6
            public final void call(Object obj) {
                this.f15600a.m5106f2((Throwable) obj);
            }
        }));
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: F0 */
    public void mo5089F0(final pi6 pi6Var) {
        this.f3704m = pi6Var;
        final SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        final long jLongValue = (((Long) CoreModule.c.f0.I0.get()).longValue() / 1000) - (((Long) CoreModule.c.f0.H0.get()).longValue() / 1000);
        pi6Var.f18625d.c(m5090O1(), CoreModule.c.t1.n("countdown_conv_list_key")).subscribe(mkd0.G(new e30() { // from class: l.wb6
            public final void call(Object obj) {
                this.f21987a.m5100Z1(simpleDateFormat, jLongValue, (c0.b) obj);
            }
        }));
        xdl0.E0(this, new View.OnClickListener() { // from class: l.xb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f22496a.m5101a2(pi6Var, view);
            }
        });
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.yb6
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f22981a.m5104d2(view);
            }
        });
        ((p36) pi6Var.f18625d).mo5633v().subscribe(mkd0.G(new e30() { // from class: l.zb6
            public final void call(Object obj) {
                ConversationItemView.m5053F1(pi6Var, (Boolean) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: O1 */
    public PutongAct m5090O1() {
        return getContext();
    }

    /* JADX INFO: renamed from: P1 */
    public void m5091P1(final pi6 pi6Var) {
        this.f3704m = pi6Var;
        xdl0.E0(this, new View.OnClickListener() { // from class: l.sb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f20152a.m5097W1(pi6Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: Q1 */
    public void m5092Q1(pi6 pi6Var) {
        this.f3704m = pi6Var;
        setOnLongClickListener(new View.OnLongClickListener() { // from class: l.mc6
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                return this.f16798a.m5110i2(view);
            }
        });
    }

    /* JADX INFO: renamed from: S1 */
    public final void m5093S1(String str) {
        c0.a aVarD;
        String str2 = "countdown_item_limited_trial_see" + ((DbObject) this.f3704m.f18622a).id;
        long jM18550o = mqi0.m18550o();
        if (!"trialing".equals(str) || jM18550o >= CoreModule.c.B2.m3()) {
            aVarD = (!"waiting".equals(str) || jM18550o >= CoreModule.c.B2.m3()) ? null : new c0.a().h(60L).a(true).g(str2).f(CoreModule.c.B2.m3()).d(this);
        } else {
            aVarD = new c0.a().h(1L).a(true).g(str2).f(CoreModule.c.B2.m3()).d(this);
        }
        if (!NullChecker.a(aVarD)) {
            CoreModule.c.t1.u(str2);
        } else {
            CoreModule.c.t1.r(aVarD);
            this.f3704m.f18625d.c(m5090O1(), CoreModule.c.t1.n(str2)).subscribe(mkd0.G(new e30() { // from class: l.oc6
                public final void call(Object obj) {
                    this.f17894a.m5113l2((c0.b) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: T1 */
    public final /* synthetic */ void m5094T1(Intent intent, View view) {
        getContext().startActivity(intent);
    }

    /* JADX INFO: renamed from: U1 */
    public final /* synthetic */ void m5095U1(Message message) {
        this.f3701j.onNext(message);
    }

    /* JADX INFO: renamed from: V1 */
    public final /* synthetic */ void m5096V1(c0.b bVar) {
        m5127v2();
    }

    /* JADX INFO: renamed from: W1 */
    public final /* synthetic */ void m5097W1(pi6 pi6Var, View view) {
        zvf0.u("e_city_cover_received_greet", "p_messages_view", new j760[]{vwb.Y("cityc_red_dot_number", Integer.valueOf(pi6Var.f18622a.unreadMessages)), vwb.Y("city_c_cell_uid", pi6Var.f18622a.otherUser)});
        m5090O1().startActivity(CityTopLikersAct.Y1(m5090O1()));
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m5098X1(pi6 pi6Var, View view) {
        fap.i().f();
        zvf0.r("e_letter_receive_entrance", "p_messages_view");
        getContext().startActivity(SeeLetterListAct.Y1(getContext(), pi6Var.f18611F.get()));
    }

    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ void m5099Y1(View view) {
        c.x0(m5090O1(), "p_messages,seetrial_recover_group", Privilege.see_who_likes_me);
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m5100Z1(SimpleDateFormat simpleDateFormat, long j, c0.b bVar) {
        if (TextUtils.equals(bVar.b, "countdown_conv_list_key")) {
            mo6596r(simpleDateFormat, bVar.f, bVar.d, j);
        }
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m5101a2(pi6 pi6Var, View view) {
        m21569k(pi6Var.f18623b);
        m5090O1().startActivity(MessagesAct.k2(m5090O1(), ((DbObject) pi6Var.f18622a).id, false, false, 29));
        o6j0.c("e_message_limited_time_match", "p_messages_view", new o6j0.a[0]);
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m5102b2(View view) {
        this.f3706o.b();
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m5103c2(VListCell vListCell, VListCell.a aVar, int i) {
        CoreModule.c.f0.sp();
        m21566h();
        this.f3706o.b();
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ boolean m5104d2(View view) {
        c40 c40VarF = new c40.b(view.getContext()).I(getResources().getString(R.string.c)).U(new View.OnClickListener() { // from class: l.sc6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f20164a.m5102b2(view2);
            }
        }).Q(vwb.f0(new CharSequence[]{m5090O1().getString(R.string.j)})).V(new c40.d() { // from class: l.tc6
            /* JADX INFO: renamed from: a */
            public final void m22481a(VListCell vListCell, VListCell.a aVar, int i) {
                this.f20611a.m5103c2(vListCell, aVar, i);
            }
        }).F();
        this.f3706o = c40VarF;
        c40VarF.f();
        return false;
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m5105e2(String str) {
        Conversation conversationXe = CoreModule.c.f0.Xe(str);
        if (m5090O1().lifecycle_() != com.p1.mobile.android.app.c.i || !NullChecker.a(conversationXe) || TEnum.equals(conversationXe.status, "deleted") || TEnum.equals(conversationXe.status, "removed") || TEnum.equals(conversationXe.status, "invisible")) {
            return;
        }
        lsi0.w(R.string.Ll);
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m5106f2(Throwable th) {
        if (m5090O1().lifecycle_() == com.p1.mobile.android.app.c.i) {
            lsi0.w(R.string.Kl);
        }
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m5107g2(View view) {
        this.f3706o.b();
    }

    @Override // p009l.rd6
    public /* bridge */ /* synthetic */ HashMap getUserLiveLabelHashMap() {
        return super.getUserLiveLabelHashMap();
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: h0 */
    public void mo5108h0(final pi6 pi6Var) {
        zvf0.x("e_letter_receive_entrance", "p_messages_view");
        setOnClickListener(new View.OnClickListener() { // from class: l.lc6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f16067a.m5098X1(pi6Var, view);
            }
        });
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m5109h2(ArrayList arrayList, VListCell vListCell, VListCell.a aVar, int i) {
        this.f3706o.b();
        if (i >= arrayList.size() || i < 0) {
            return;
        }
        this.f3706o.b();
        if (TextUtils.equals(aVar.a, "删除聊天")) {
            CoreModule.c.e0.Q1.put(-1L);
            ConversationsList.m5434A2();
        }
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ boolean m5110i2(View view) {
        if (!((Boolean) CoreModule.c.f0.X0.get()).booleanValue()) {
            return false;
        }
        final ArrayList arrayList = new ArrayList();
        arrayList.add("删除聊天");
        c40 c40VarF = new c40.b(getContext()).I(getContext().getResources().getString(R.string.c)).U(new View.OnClickListener() { // from class: l.uc6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f21065a.m5107g2(view2);
            }
        }).Q(arrayList).V(new c40.d() { // from class: l.vc6
            /* JADX INFO: renamed from: a */
            public final void m23354a(VListCell vListCell, VListCell.a aVar, int i) {
                this.f21529a.m5109h2(arrayList, vListCell, aVar, i);
            }
        }).F();
        this.f3706o = c40VarF;
        c40VarF.f();
        return true;
    }

    /* JADX INFO: renamed from: j2 */
    public final /* synthetic */ void m5111j2() {
        CoreModule.k.m.delete(((DbObject) this.f3704m.f18622a).id);
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m5112k2() {
        CoreModule.c.U.a(new d30() { // from class: l.cd6
            public final void call() {
                this.f10543a.m5111j2();
            }
        });
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ void m5113l2(c0.b bVar) {
        if (NullChecker.a(bVar) && bVar.a) {
            CoreModule.c.B2.y3();
        }
        m5127v2();
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: m */
    public void mo5114m(pi6 pi6Var) {
        setOnClickListener(this);
        final ConversationLongClick conversationLongClick = new ConversationLongClick(pi6Var);
        setOnLongClickListener(conversationLongClick);
        if (pi6Var.f18622a.isTop() && TextUtils.isEmpty(pi6Var.f18646y)) {
            setBackgroundResource(x2c0.lu);
        } else {
            setBackgroundResource(x2c0.ku);
        }
        if (m5090O1() instanceof NewMainAct) {
            pi6Var.f18625d.c(m5090O1(), ((NewMainAct) m5090O1()).m3895i7()).filter(new w9j() { // from class: l.tb6
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) != TabName.Msg);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.ub6
                public final void call(Object obj) {
                    conversationLongClick.m5288d0();
                }
            }));
        }
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: m0 */
    public void mo5115m0(pi6 pi6Var) {
        m5093S1(emr.INSTANCE.e());
        xdl0.E0(this, new View.OnClickListener() { // from class: l.vb6
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f21517a.m5099Y1(view);
            }
        });
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m5116m2(User user, Relationship relationship) {
        r6n.m21419f().f19665k.put(((DbObject) user).id);
        r6n.m21419f().m21433p(((DbObject) user).id);
        CoreModule.c.e0.W9(((DbObject) user).id);
        if (TEnum.equals(relationship.state, "matched")) {
            CoreModule.c.u0.x7(((DbObject) user).id);
        }
        r6n.m21419f().m21435r(((DbObject) user).id, true);
        if (IntlCountryCodeController.g()) {
            ruy.g().k(((DbObject) user).id).subscribe(mkd0.B());
        }
        dml dmlVar = this.f3704m.f18625d;
        if (dmlVar instanceof p36) {
            ((p36) dmlVar).mo5632q();
        }
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m5117n2() {
        if (NullChecker.a(this.f3704m.f18622a)) {
            CoreModule.c.f0.yp(((DbObject) this.f3704m.f18622a).id);
        }
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m5118o2() {
        if (NullChecker.a(this.f3704m.f18622a)) {
            CoreModule.c.f0.xp(((DbObject) this.f3704m.f18622a).id);
        }
    }

    /* JADX WARN: Code duplicated, block: B:137:0x0388  */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        String str;
        String str2;
        if (this.f3697f.mo6575K0()) {
            return;
        }
        pi6 pi6Var = this.f3704m;
        final Conversation conversation = pi6Var.f18622a;
        final User user = pi6Var.f18623b;
        if (rd6.m21519o(conversation)) {
            CoreModule.P().a().qm(m5090O1(), "p_message,blur_cell", Privilege.see_who_likes_me, new e30() { // from class: l.nc6
                public final void call(Object obj) {
                    this.f17402a.m5120q2(conversation, obj);
                }
            });
            return;
        }
        m21580w(this.f3704m);
        boolean z = true;
        if (xp5.f(conversation)) {
            zvf0.r("e_message_tab_compliment_cell_click", "p_messages_view");
            if (!f3691v) {
                zvf0.x("e_message_tab_compliment_cell_click", "p_messages_view");
                f3691v = true;
            }
        }
        if (NullChecker.a(user) && NullChecker.a(this.f3704m.f18622a) && TextUtils.equals(this.f3704m.f18622a.convType, "intlSeeChatRequest")) {
            if (!n3b0.q()) {
                m5124t2();
                return;
            }
            r6n.m21419f().f19660f.put(((DbObject) user).id);
            r6n.m21419f().m21436s(((DbObject) user).id, false, true);
            zvf0.u("e_chat_request_operate", "p_messages_view", new j760[]{vwb.Y("show_where", this.f3704m.f18626e ? "matchList" : "chatList"), vwb.Y("request_show_type", this.f3704m.f18630i), vwb.Y("show_position", getMCShowPositionStr()), vwb.Y("chat_request_operate", "click")});
            CoreModule.P().a().Sl(m5090O1(), "p_messages_view,e_chat_request,click", Privilege.see_chat_request_gp, new d30() { // from class: l.wc6
                public final void call() {
                    r6n.m21419f().f19660f.put("");
                }
            }, TextUtils.concat("chat_request_", ((DbObject) user).id).toString());
            ah60.m11408E().subscribe(mkd0.G(new e30() { // from class: l.xc6
                public final void call(Object obj) {
                    this.f22506a.m5121r2(user, (PaymentResultWrapper) obj);
                }
            }));
            return;
        }
        if (r6n.m21419f().f19656b.e() != null && !vwb.J(((InsertConversationsList) r6n.m21419f().f19656b.e()).users)) {
            ah60.m11408E().subscribe(mkd0.G(new e30() { // from class: l.yc6
                public final void call(Object obj) {
                    this.f22993a.m5122s2((PaymentResultWrapper) obj);
                }
            }));
        }
        if (NullChecker.a(this.f3692a) && this.f3692a.mo6627O()) {
            zvf0.s("e_red_dot_message_chat", "p_messages_view", u4e.m22746c("red_dot", "red_dot_normal", "chat_bar", "message_list_page", "tips"));
        } else {
            zvf0.s("e_red_dot_message_chat", "p_messages_view", u4e.m22747d());
        }
        if (NullChecker.a(this.f3704m.f18615J)) {
            this.f3704m.f18615J.call();
        }
        if (upa.V1() && NullChecker.a(conversation) && ml6.a(conversation)) {
            ChatGroup chatGroupH7 = CoreModule.c.g0.h7(conversation.otherUser);
            boolean zA = NullChecker.a(chatGroupH7);
            String str3 = conversation.otherUser;
            if (zA) {
                o6j0.c("e_group_item", "p_messages_view", new o6j0.a[]{o6j0.a.h("groupchat_id", str3), o6j0.a.f("is_anonymou_group", tbk.s(chatGroupH7) ? 1 : 0)});
            } else {
                o6j0.c("e_group_item", "p_messages_view", new o6j0.a[]{o6j0.a.h("groupchat_id", str3), o6j0.a.f("is_anonymou_group", 0)});
            }
        }
        oxz.a();
        String str4 = "";
        if ((u59.T() || upa.I2()) && (TextUtils.equals(((DbObject) conversation).id, "fake_conversation_greeting") || TextUtils.equals(((DbObject) conversation).id, "fake_conversation_anonymous_greeting"))) {
            if (u59.T()) {
                zvf0.r("e_intl_message_im_hi_enter", "p_messages_view");
                m5090O1().startActivity(IntlDynamicGreetListAct.X1(m5090O1(), (Greeting) null, ""));
                return;
            }
            if (ye40.m25301b()) {
                o6j0.c("e_kankan_stranger_message", "p_messages_view", new o6j0.a[]{o6j0.a.h("is_red_dot", "1"), o6j0.a.h("is_greeting_new", "1")});
            } else if (NullChecker.a(conversation) && TextUtils.equals(((DbObject) conversation).id, "fake_conversation_anonymous_greeting")) {
                o6j0.c("e_anonymous_cell", "p_messages_view", new o6j0.a[0]);
            } else {
                o6j0.c("e_kankan_stranger_message", "p_messages_view", new o6j0.a[]{o6j0.a.h("is_red_dot", conversation.additional.kankan.greetingSummaryDetail.unseen <= 0 ? "0" : "1"), o6j0.a.h("is_greeting_new", "0")});
            }
            PutongAct putongActM5090O1 = m5090O1();
            PutongAct putongActM5090O2 = m5090O1();
            if (NullChecker.a(conversation) && TextUtils.equals(((DbObject) conversation).id, "fake_conversation_anonymous_greeting")) {
                str4 = "from_anonymous_greeting";
            }
            putongActM5090O1.startActivity(DynamicGreetListAct.m384X1(putongActM5090O2, null, str4));
            if (ye40.m25301b()) {
                CoreModule.c.r0.m5();
                return;
            }
            return;
        }
        if (!ogl0.X() || !conversation.isLimitedTrialSee(CoreModule.H().userId()) || xma.L3() || CoreModule.c.e0.p9().isFemale()) {
            m21569k(user);
            m5090O1().startActivity(MessagesAct.M2(m5090O1(), ((DbObject) conversation).id, false, false, 29, this.f3704m.f18637p, user != null && User.isAiStory(((DbObject) user).id)));
        } else {
            String strE = emr.INSTANCE.e();
            if ("trialEnd".equals(strE) || "waiting".equals(strE) || "expired".equals(strE)) {
                c.x0(m5090O1(), "p_messages,seetrial_recover_one", Privilege.see_who_likes_me);
            } else {
                m21569k(user);
                m5090O1().startActivity(MessagesAct.M2(m5090O1(), ((DbObject) conversation).id, false, false, 29, this.f3704m.f18637p, user != null && User.isAiStory(((DbObject) user).id)));
            }
        }
        if (NullChecker.a(conversation) && TextUtils.equals(conversation.otherUser, rwu.m21862h())) {
            o6j0.c("e_live_vip_customer_service", "p_messages_view", new o6j0.a[0]);
        }
        String string = (NullChecker.a(conversation) && NullChecker.a(conversation.additional) && NullChecker.a(conversation.additional.tag) && NullChecker.a(conversation.additional.tag.type) && !TEnum.equals(conversation.additional.tag.type, "unknown_")) ? conversation.additional.tag.type.toString() : "";
        if (m21557Z0(this.f3704m.f18622a) && !this.f3704m.f18622a.hasRemoveLabel() && this.f3704m.f18622a.unreadMessages == 0) {
            str = "1," + i36.g().j(((DbObject) conversation).id, true);
        } else {
            str = "";
        }
        if (m21576q(this.f3704m)) {
            str2 = "gotoreply";
        } else {
            Conversation conversation2 = this.f3704m.f18622a;
            if (conversation2.unreadMessages > 0 || !m21575p0(conversation2) || TextUtils.isEmpty(this.f3704m.f18622a.property.conversationTag.suggestExpireTime) || mqi0.m18550o() >= Long.parseLong(this.f3704m.f18622a.property.conversationTag.suggestExpireTime) * 1000) {
                str2 = "";
            } else if (!TextUtils.isEmpty(this.f3704m.f18622a.property.conversationTag.emoji)) {
                str2 = "emoji";
            } else if (TextUtils.isEmpty(this.f3704m.f18622a.property.conversationTag.suggestText)) {
                str2 = "";
            } else {
                str2 = "startchat";
            }
        }
        o6j0.a aVarH = o6j0.a.h("create_time", zz6.h.format(conversation.createdTime));
        o6j0.a aVarH2 = o6j0.a.h("is_online", CoreModule.c.N0.j3(user) ? "1" : "0");
        StringBuilder sb = new StringBuilder("");
        pi6 pi6Var2 = this.f3704m;
        sb.append(pi6Var2.f18634m - pi6Var2.f18629h);
        o6j0.a aVarH3 = o6j0.a.h("new_match_rank", sb.toString());
        o6j0.a aVarH4 = o6j0.a.h("moments_user_id", conversation.otherUser);
        o6j0.a aVarH5 = o6j0.a.h("operation_id", this.f3704m.f18633l);
        o6j0.a aVarH6 = o6j0.a.h("is_new_moment", "0");
        o6j0.a aVarH7 = o6j0.a.h("new_msg_page_module", (m21546S(conversation) || m21570l(conversation)) ? "0" : "1");
        o6j0.a aVarH8 = o6j0.a.h("chat_guide", str);
        if (!conversation.isFakeHeartbeatConv() && !conversation.isFakeQuickChatConv()) {
            z = false;
        }
        o6j0.a aVarI = o6j0.a.i("is_fake", z);
        o6j0.a aVarH9 = o6j0.a.h("is_onlive_anchor", this.f3704m.f18616K);
        o6j0.a aVarH10 = o6j0.a.h("is_red_dot", conversation.read.booleanValue() ? "0" : "1");
        o6j0.a aVarH11 = o6j0.a.h("other_uid", conversation.otherUser);
        o6j0.a aVarF = o6j0.a.f("red_dot_num", conversation.unreadMessages);
        o6j0.a aVarI2 = o6j0.a.i("chat_game_show", false);
        o6j0.a aVarH12 = o6j0.a.h("love_letter", "");
        if (i36.g().o(((DbObject) conversation).id) && !conversation.hasRemoveLabel()) {
            string = "longtimenosee";
        }
        o6j0.c("e_messages_view_match", "p_messages_view", new o6j0.a[]{aVarH, aVarH2, aVarH3, aVarH4, aVarH5, aVarH6, aVarH7, aVarH8, aVarI, aVarH9, aVarH10, aVarH11, aVarF, aVarI2, aVarH12, o6j0.a.h("user_tag", string), o6j0.a.h("day_number", this.f3704m.f18618M), o6j0.a.h("pairing_type", conversation.hasReSwipeConvIceBreak() ? "break_ice" : "unbreak_ice"), o6j0.a.h("messagec_cell_type", ll6.m17954a(conversation)), o6j0.a.h("is_platinum_top_chat", (CoreModule.P().g().b8() && conversation.isPlatinumTop()) ? "yes" : "no"), o6j0.a.h("message_tab", m21564g(this.f3704m.f18625d)), o6j0.a.h("guide_type", str2), o6j0.a.f("spark_level", ll6.m17958e(conversation)), o6j0.a.f("message_pairs", ll6.m17957d(conversation)), o6j0.a.f("is_close_friend", ll6.m17955b(conversation)), o6j0.a.f("is_top_recommend", ll6.m17956c(conversation))});
        m21582x0(this.f3704m);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        e51.J(this.f3708q);
        CoreModule.c.t1.t(this);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        if (upa.z()) {
            xdl0.C0(this, pi6.f18602R);
        }
        this.f3696e = this;
        this.f3703l.add(this);
        cpl cplVar = (cpl) findViewById(u4c0.Z4);
        this.f3697f = cplVar;
        this.f3703l.add(cplVar);
        cpl cplVar2 = (cpl) findViewById(u4c0.ge);
        this.f3698g = cplVar2;
        this.f3703l.add(cplVar2);
        cpl cplVar3 = (cpl) findViewById(u4c0.Zc);
        this.f3692a = cplVar3;
        if (NullChecker.a(cplVar3)) {
            this.f3703l.add(this.f3692a);
        }
        cpl cplVar4 = (cpl) findViewById(u4c0.U4);
        this.f3693b = cplVar4;
        if (NullChecker.a(cplVar4)) {
            this.f3703l.add(this.f3693b);
        }
        cpl cplVar5 = (cpl) findViewById(u4c0.P4);
        this.f3694c = cplVar5;
        if (NullChecker.a(cplVar5)) {
            this.f3703l.add(this.f3694c);
        }
        cpl cplVar6 = (cpl) findViewById(u4c0.yb);
        this.f3695d = cplVar6;
        if (NullChecker.a(cplVar6)) {
            this.f3703l.add(this.f3695d);
        }
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m5119p2(pi6 pi6Var, LinkedHashMap linkedHashMap) {
        if (((UserLiveLabel) linkedHashMap.get(pi6Var.f18623b)) != null) {
            pi6Var.f18627f = true;
            m5127v2();
        } else if (pi6Var.f18627f) {
            pi6Var.f18627f = false;
            m5127v2();
        }
    }

    @Override // android.view.View
    public boolean performClick() {
        if (!NullChecker.a(this.f3709r)) {
            return super.performClick();
        }
        this.f3709r.onClick(this);
        return true;
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m5120q2(Conversation conversation, Object obj) {
        m5127v2();
        if (conversation.lowPayOneSideConv()) {
            return;
        }
        performClick();
    }

    /* JADX INFO: renamed from: r2 */
    public final /* synthetic */ void m5121r2(User user, PaymentResultWrapper paymentResultWrapper) {
        Object obj = paymentResultWrapper.tag;
        if ((obj instanceof String) && TextUtils.equals((String) obj, TextUtils.concat("chat_request_", ((DbObject) user).id).toString())) {
            m5124t2();
        }
    }

    /* JADX INFO: renamed from: s2 */
    public final /* synthetic */ void m5122s2(PaymentResultWrapper paymentResultWrapper) {
        dml dmlVar = this.f3704m.f18625d;
        if (dmlVar instanceof p36) {
            ((p36) dmlVar).mo5632q();
        }
    }

    @Override // android.view.View
    public void setOnClickListener(@Nullable View.OnClickListener onClickListener) {
        if (!wf6.m24193e() || !NullChecker.a(this.f3704m) || this.f3704m.f18636o || (m5090O1() instanceof ConversationAddressBookUnMatchAct)) {
            super.setOnClickListener(onClickListener);
        } else {
            this.f3709r = onClickListener;
        }
    }

    @Override // android.view.View
    public void setOnLongClickListener(@Nullable View.OnLongClickListener onLongClickListener) {
        if (!wf6.m24193e() || (m5090O1() instanceof ConversationAddressBookUnMatchAct)) {
            super.setOnLongClickListener(onLongClickListener);
        } else {
            this.f3710s = onLongClickListener;
        }
    }

    @Override // p009l.bpl
    public void setPicPercent(float f) {
        this.f3697f.setPicPercent(f);
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: t0 */
    public void mo5123t0(final pi6 pi6Var) {
        if (pi6Var.f18643v && NullChecker.a(pi6Var.f18623b)) {
            final Intent intentV2 = ProfileAct.v2(m5090O1(), ((DbObject) pi6Var.f18623b).id, "from_conversation_search_view", false, false, false, RelationshipStatus.get("unknown_"), 273, false, true, false, false);
            xdl0.E0(this, new View.OnClickListener() { // from class: l.ac6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f9382a.m5094T1(intentV2, view);
                }
            });
            return;
        }
        setOnClickListener(this);
        final ConversationLongClick conversationLongClick = new ConversationLongClick(pi6Var);
        setOnLongClickListener(conversationLongClick);
        if (pi6Var.f18622a.isMarriageConv()) {
            setBackgroundResource(x2c0.ku);
        } else if (CoreModule.P().g().b8() && pi6Var.f18622a.isPlatinumTop() && !m21553W(pi6Var.f18625d)) {
            setBackgroundResource(x2c0.Ee);
        } else if (pi6Var.f18622a.isTop() && TextUtils.isEmpty(pi6Var.f18646y) && !m21553W(pi6Var.f18625d)) {
            setBackgroundResource(x2c0.lu);
        } else {
            setBackgroundResource(x2c0.ku);
        }
        if ((m5090O1() instanceof NewMainAct) && NullChecker.a(pi6Var.f18625d)) {
            pi6Var.f18625d.c(m5090O1(), ((NewMainAct) m5090O1()).m3895i7().filter(new w9j() { // from class: l.bc6
                public final Object call(Object obj) {
                    return Boolean.valueOf(((TabName) obj) != TabName.Msg);
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.dc6
                public final void call(Object obj) {
                    conversationLongClick.m5288d0();
                }
            }));
        }
        if (!upa.a2()) {
            m5126u2(pi6Var);
        }
        if (rd6.m21506C0(pi6Var.f18622a)) {
            m21560b(this.f3703l, new e30() { // from class: l.ec6
                public final void call(Object obj) {
                    ((cpl) obj).mo6556J(pi6Var);
                }
            });
            return;
        }
        this.f3701j.onNext(pi6.f18605U);
        if (NullChecker.a(pi6Var.f18622a)) {
            pi6Var.f18625d.c(m5090O1(), CoreModule.k.c.Z(((DbObject) pi6Var.f18622a).id, pi6Var.f18622a.clearedTime, false).m().map(new w9j() { // from class: l.fc6
                public final Object call(Object obj) {
                    return rd6.m21522t((List) obj, pi6Var.f18623b);
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.gc6
                public final void call(Object obj) {
                    this.f13434a.m5095U1((Message) obj);
                }
            }));
        }
        if (u59.d0() && NullChecker.a(pi6Var.f18622a) && "lovebuzz".equals(pi6Var.f18622a.convType)) {
            if (CoreModule.l.b().Pj(pi6Var.f18622a)) {
                c0.a aVar = new c0.a();
                aVar.g("countdown_item_love_buzz_key" + ((DbObject) pi6Var.f18622a).id).f(pi6Var.f18622a.property.intl_love_buzz.expire).h(60L).a(true).d(this);
                CoreModule.c.t1.r(aVar);
                pi6Var.f18625d.c(m5090O1(), CoreModule.c.t1.n("countdown_item_love_buzz_key" + ((DbObject) pi6Var.f18622a).id)).subscribe(mkd0.G(new e30() { // from class: l.hc6
                    public final void call(Object obj) {
                        this.f13960a.m5096V1((c0.b) obj);
                    }
                }));
            } else {
                CoreModule.c.t1.u("countdown_item_love_buzz_key" + ((DbObject) pi6Var.f18622a).id);
            }
        }
        m21531F(m5090O1(), ((DbObject) pi6Var.f18622a).id, (p36) pi6Var.f18625d, this);
        m5128w2();
        e51.J(this.f3707p);
        Conversation conversation = pi6Var.f18622a;
        int i = conversation.level;
        if (i == 55) {
            if (NullChecker.a(conversation.additional) && NullChecker.a(pi6Var.f18622a.additional.tag) && pi6Var.f18622a.additional.tag.expireTime * 1000 > mqi0.m18550o()) {
                e51.H(getContext(), this.f3707p, (pi6Var.f18622a.additional.tag.expireTime * 1000) - mqi0.m18550o());
            } else {
                CoreModule.c.f0.yp(((DbObject) pi6Var.f18622a).id);
            }
        } else if (i == 90 && CoreModule.P().g().b8()) {
            e51.J(this.f3708q);
            if (NullChecker.a(pi6Var.f18622a.additional) && NullChecker.a(pi6Var.f18622a.additional.pinChat) && pi6Var.f18622a.additional.pinChat.expireTime > mqi0.m18550o()) {
                m5129x2();
                e51.H(getContext(), this.f3708q, (long) (pi6Var.f18622a.additional.pinChat.expireTime - mqi0.m18550o()));
            } else {
                CoreModule.c.f0.xp(((DbObject) pi6Var.f18622a).id);
                CoreModule.c.t1.u("countdown_item_platinum_pin" + ((DbObject) pi6Var.f18622a).id);
            }
        }
        if (!ogl0.X() || !pi6Var.f18622a.isLimitedTrialSee(CoreModule.H().userId()) || xma.L3() || CoreModule.c.e0.p9().isFemale()) {
            return;
        }
        m5093S1(emr.INSTANCE.e());
    }

    /* JADX INFO: renamed from: t2 */
    public final void m5124t2() {
        final User user = this.f3704m.f18623b;
        m5090O1().duringCreated(CoreModule.c.m0.V7(true, false, (Map) null, user, (String) null)).subscribe(mkd0.H(new e30() { // from class: l.ad6
            public final void call(Object obj) {
                this.f9409a.m5116m2(user, (Relationship) obj);
            }
        }, new e30() { // from class: l.bd6
            public final void call(Object obj) {
                ConversationItemView.m5079r1((Throwable) obj);
            }
        }));
        m5090O1().duringCreated(CoreModule.c.m0.n6());
    }

    /* JADX INFO: renamed from: u */
    public void m5125u(String str, long j, long j2, long j3, long j4) {
        if (NullChecker.a(this.f3704m) && NullChecker.a(this.f3704m.f18622a)) {
            if (!TextUtils.equals(str, "exclusive_tag_" + ((DbObject) this.f3704m.f18622a).id)) {
                if (!TextUtils.equals(str, "love_script_tag_" + ((DbObject) this.f3704m.f18622a).id)) {
                    if (!TextUtils.equals("countdown_item_platinum_pin" + ((DbObject) this.f3704m.f18622a).id, str)) {
                        if (TextUtils.equals(str, "heartbeat_conv_item_" + ((DbObject) this.f3704m.f18622a).id) && this.f3704m.f18622a.isHeartbeatConv() && mqi0.m18550o() >= this.f3704m.f18622a.additional.heartbeatMatch.expireTime) {
                            e51.y(new Runnable() { // from class: l.zc6
                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.f23559a.m5112k2();
                                }
                            });
                            return;
                        }
                        return;
                    }
                }
            }
            m5127v2();
        }
    }

    /* JADX INFO: renamed from: u2 */
    public final void m5126u2(final pi6 pi6Var) {
        if (!qp8.b() || pi6Var == null) {
            return;
        }
        pi6Var.f18627f = ((LinkedHashMap) CoreModule.c.f0.B2.e()).containsKey(pi6Var.f18623b);
        pi6Var.f18625d.c(m5090O1(), CoreModule.c.f0.Fq()).subscribe(mkd0.H(new e30() { // from class: l.qc6
            public final void call(Object obj) {
                this.f19133a.m5119p2(pi6Var, (LinkedHashMap) obj);
            }
        }, new e30() { // from class: l.rc6
            public final void call(Object obj) {
                ConversationItemView.m5075n1((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v2 */
    public void m5127v2() {
        this.f3699h.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: w2 */
    public final void m5128w2() {
        if (NullChecker.a(this.f3704m) && NullChecker.a(this.f3704m.f18622a) && NullChecker.a(this.f3704m.f18622a.property) && NullChecker.a(this.f3704m.f18622a.property.loveScript) && "lovescript".equals(this.f3704m.f18622a.convType)) {
            long j = this.f3704m.f18622a.property.loveScript.expireTime;
            if (j == 0 || j <= mqi0.m18550o()) {
                return;
            }
            c0.a aVar = new c0.a();
            aVar.g("love_script_tag_" + ((DbObject) this.f3704m.f18622a).id).f(this.f3704m.f18622a.property.loveScript.expireTime).h(1L).a(true).d(this);
            CoreModule.c.t1.r(aVar);
            if (this.f3704m.f18632k.a("e_story_mtached_cell_click")) {
                return;
            }
            zvf0.A("e_story_mtached_cell_click", "p_messages_view", new j760[]{vwb.Y("cell_numbers", 0)});
            this.f3704m.f18632k.b("e_story_mtached_cell_click");
        }
    }

    /* JADX INFO: renamed from: x2 */
    public final void m5129x2() {
        c0.a aVar = new c0.a();
        aVar.g("countdown_item_platinum_pin" + ((DbObject) this.f3704m.f18622a).id).f((long) this.f3704m.f18622a.additional.pinChat.expireTime).h(1L).a(true).d(this);
        CoreModule.c.t1.r(aVar);
    }

    @Override // p009l.cpl
    /* JADX INFO: renamed from: z0 */
    public void mo5130z0(Conversation conversation, User user, pi6 pi6Var) {
        this.f3704m = pi6Var;
        pi6Var.f18622a = conversation;
        if (NullChecker.a(conversation) && pi6Var.f18622a.localEverHasMessage) {
            m21566h();
        } else {
            m21560b(this.f3703l, new e30() { // from class: l.pc6
                public final void call(Object obj) {
                    ((cpl) obj).mo6569y0();
                }
            });
        }
    }

    public ConversationItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3699h = a.c(roj0.a);
        this.f3700i = new c4g0[1];
        Message message = pi6.f18605U;
        this.f3701j = a.c(message);
        this.f3702k = a.c(message);
        this.f3703l = new ArrayList();
        this.f3707p = new Runnable() { // from class: l.rb6
            @Override // java.lang.Runnable
            public final void run() {
                this.f19718a.m5117n2();
            }
        };
        this.f3708q = new Runnable() { // from class: l.cc6
            @Override // java.lang.Runnable
            public final void run() {
                this.f10510a.m5118o2();
            }
        };
        this.f3711t = new C0281a();
        this.f3712u = new C0282b();
    }

    public ConversationItemView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3699h = a.c(roj0.a);
        this.f3700i = new c4g0[1];
        Message message = pi6.f18605U;
        this.f3701j = a.c(message);
        this.f3702k = a.c(message);
        this.f3703l = new ArrayList();
        this.f3707p = new Runnable() { // from class: l.rb6
            @Override // java.lang.Runnable
            public final void run() {
                this.f19718a.m5117n2();
            }
        };
        this.f3708q = new Runnable() { // from class: l.cc6
            @Override // java.lang.Runnable
            public final void run() {
                this.f10510a.m5118o2();
            }
        };
        this.f3711t = new C0281a();
        this.f3712u = new C0282b();
    }
}
