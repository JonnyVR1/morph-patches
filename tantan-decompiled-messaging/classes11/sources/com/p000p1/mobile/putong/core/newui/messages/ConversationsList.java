package com.p000p1.mobile.putong.core.newui.messages;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.common.base.Optional;
import com.p000p1.mobile.putong.core.newui.group.GroupSuggestAct;
import com.p000p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p000p1.mobile.putong.core.newui.messages.anim.view.NewQuickChatAudioHeader;
import com.p000p1.mobile.putong.core.newui.messages.anim.view.PullQuickChatLayout;
import com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView;
import com.p000p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderView;
import com.p000p1.mobile.putong.core.newui.messages.anim.view.wengweng.WengWengHeaderView;
import com.p000p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p000p1.mobile.putong.core.newui.messages.business.IntlVisitorConversationView;
import com.p000p1.mobile.putong.newui.main.base.TabName;
import com.p000p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p1.mobile.android.app.App;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.ab.IntlCountryCodeController;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.app.PutongFrag;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.core.api.g;
import com.p1.mobile.putong.core.api.i;
import com.p1.mobile.putong.core.data.CertificationNewConfig;
import com.p1.mobile.putong.core.data.ChatGroup;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.core.data.ConversationRefreshIntervalConfig;
import com.p1.mobile.putong.core.data.CoreFeedStateCounter;
import com.p1.mobile.putong.core.data.InsertConversationsList;
import com.p1.mobile.putong.core.data.MessageFilterConfig;
import com.p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p1.mobile.putong.core.data.UserPrivilege;
import com.p1.mobile.putong.core.data.VerificationCenter;
import com.p1.mobile.putong.core.data.WechatNotifySetting;
import com.p1.mobile.putong.core.ui.filter.FilterVerificationUserMsgDlg;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchManager;
import com.p1.mobile.putong.core.ui.onlinematch.OnlineMatchPushUser;
import com.p1.mobile.putong.data.Links;
import com.p1.mobile.putong.data.User;
import com.p1.mobile.putong.data.UserLiveLabel;
import com.p1.mobile.putong.data.tenum.TEnum;
import com.tantanapp.common.data.DbObject;
import com.tantanapp.common.utils.CrashHelper;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import l.cnr;
import l.d30;
import l.daj;
import l.e30;
import l.e51;
import l.emr;
import l.f6c0;
import l.f8c;
import l.fap;
import l.fpb0;
import l.ggi;
import l.j760;
import l.jjb0;
import l.jo0;
import l.ke50;
import l.knb0;
import l.kq6;
import l.mkd0;
import l.ml6;
import l.n3b0;
import l.o6j0;
import l.ogl0;
import l.qib0;
import l.qqi0;
import l.r65;
import l.roj0;
import l.sqb0;
import l.sw6;
import l.t100;
import l.u4c0;
import l.u59;
import l.upa;
import l.v930;
import l.v9j;
import l.vwb;
import l.w0c0;
import l.w9j;
import l.wp1;
import l.x2c0;
import l.x9j;
import l.xdl0;
import l.xma;
import l.y19;
import l.y9j;
import l.z9j;
import l.zvf0;
import p009l.cqp;
import p009l.fel;
import p009l.g050;
import p009l.io6;
import p009l.jx50;
import p009l.mqi0;
import p009l.p36;
import p009l.q860;
import p009l.r6n;
import p009l.rd6;
import p009l.u26;
import p009l.v76;
import p009l.wf6;
import p009l.wn90;
import p009l.yij0;
import rx.Notification;
import rx.c;
import rx.schedulers.Schedulers;
import rx.subjects.a;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VList;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationsList extends SwipeRefreshLayout implements SwipeRefreshLayout.j {

    /* JADX INFO: renamed from: r1 */
    public static int f3856r1;

    /* JADX INFO: renamed from: s1 */
    public static a<List<Conversation>> f3857s1 = a.c(new ArrayList());

    /* JADX INFO: renamed from: t1 */
    public static a<roj0> f3858t1;

    /* JADX INFO: renamed from: u1 */
    public static a<roj0> f3859u1;

    /* JADX INFO: renamed from: v1 */
    public static a<roj0> f3860v1;

    /* JADX INFO: renamed from: w1 */
    public static a<roj0> f3861w1;

    /* JADX INFO: renamed from: x1 */
    public static final C0293d f3862x1;

    /* JADX INFO: renamed from: E0 */
    public ConversationsListHeadView f3863E0;

    /* JADX INFO: renamed from: F0 */
    public final int f3864F0;

    /* JADX INFO: renamed from: G0 */
    public final int f3865G0;

    /* JADX INFO: renamed from: H0 */
    public final int f3866H0;

    /* JADX INFO: renamed from: I0 */
    public final int f3867I0;

    /* JADX INFO: renamed from: J0 */
    public final int f3868J0;

    /* JADX INFO: renamed from: K0 */
    public final int f3869K0;

    /* JADX INFO: renamed from: L0 */
    public final int f3870L0;

    /* JADX INFO: renamed from: M0 */
    public a<roj0> f3871M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f3872N0;

    /* JADX INFO: renamed from: O0 */
    public a<Integer> f3873O0;

    /* JADX INFO: renamed from: P0 */
    public a<q860<Conversation>> f3874P0;

    /* JADX INFO: renamed from: Q0 */
    public a<List<Conversation>> f3875Q0;

    /* JADX INFO: renamed from: R0 */
    public a<List<Conversation>> f3876R0;

    /* JADX INFO: renamed from: S */
    public ConversationsList f3877S;

    /* JADX INFO: renamed from: S0 */
    public a<List<Conversation>> f3878S0;

    /* JADX INFO: renamed from: T */
    public PullQuickChatLayout f3879T;

    /* JADX INFO: renamed from: T0 */
    public a<List<Conversation>> f3880T0;

    /* JADX INFO: renamed from: U */
    public FrameLayout f3881U;

    /* JADX INFO: renamed from: U0 */
    public a<List<Conversation>> f3882U0;

    /* JADX INFO: renamed from: V */
    public ConvCellList f3883V;

    /* JADX INFO: renamed from: V0 */
    public a<List<Conversation>> f3884V0;

    /* JADX INFO: renamed from: W */
    public ConversationFilterLayout f3885W;

    /* JADX INFO: renamed from: W0 */
    public a<q860<Conversation>> f3886W0;

    /* JADX INFO: renamed from: X0 */
    public a<q860<Conversation>> f3887X0;

    /* JADX INFO: renamed from: Y0 */
    public List<Conversation> f3888Y0;

    /* JADX INFO: renamed from: Z0 */
    public List<Conversation> f3889Z0;

    /* JADX INFO: renamed from: a1 */
    public boolean f3890a1;

    /* JADX INFO: renamed from: b1 */
    public boolean f3891b1;

    /* JADX INFO: renamed from: c1 */
    public boolean f3892c1;

    /* JADX INFO: renamed from: d1 */
    public QuickChatHeaderBaseView f3893d1;

    /* JADX INFO: renamed from: e1 */
    public boolean f3894e1;

    /* JADX INFO: renamed from: f1 */
    public String f3895f1;

    /* JADX INFO: renamed from: g1 */
    public boolean f3896g1;

    /* JADX INFO: renamed from: h1 */
    public boolean f3897h1;

    /* JADX INFO: renamed from: i1 */
    public ConversationListFrag f3898i1;

    /* JADX INFO: renamed from: j1 */
    public ConversationFilterLayout f3899j1;

    /* JADX INFO: renamed from: k0 */
    public Boolean f3900k0;

    /* JADX INFO: renamed from: k1 */
    public d30 f3901k1;

    /* JADX INFO: renamed from: l1 */
    public boolean f3902l1;

    /* JADX INFO: renamed from: m1 */
    public final int f3903m1;

    /* JADX INFO: renamed from: n1 */
    public final int f3904n1;

    /* JADX INFO: renamed from: o1 */
    public final int f3905o1;

    /* JADX INFO: renamed from: p0 */
    public C0294e f3906p0;

    /* JADX INFO: renamed from: p1 */
    public int f3907p1;

    /* JADX INFO: renamed from: q1 */
    public float f3908q1;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationsList$a */
    public class C0290a implements AdapterView.OnItemClickListener {
        public C0290a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (view instanceof ConversationItemView) {
                ((ConversationItemView) view).f3711t.call();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationsList$b */
    public class C0291b implements AdapterView.OnItemLongClickListener {
        public C0291b() {
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (view instanceof ConversationItemView) {
                return ((Boolean) ((ConversationItemView) view).f3712u.call()).booleanValue();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationsList$c */
    public class C0292c implements AbsListView.OnScrollListener {
        public C0292c() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            if (absListView.getChildCount() <= 0) {
                return;
            }
            if (upa.d3() || upa.G0()) {
                ConversationsList.this.m5537F2();
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 0) {
                g gVar = CoreModule.c.f0;
                jx50 jx50Var = gVar.R;
                jx50Var.f15352a = false;
                jx50Var.m17235e(gVar.S, false);
                if (NullChecker.a(ConversationsList.this.f3893d1)) {
                    ConversationsList.this.f3893d1.mo6129f();
                }
                ConversationsList.this.f3883V.m4690e();
            } else {
                if (!CoreModule.c.f0.R.f15352a) {
                    ConversationsList.this.f3883V.m4689d();
                }
                CoreModule.c.f0.R.f15352a = true;
            }
            if (i == 1) {
                d.l().k("showNewMatchUserGuidePop");
                d.l().k("newUserShowGuidePop");
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationsList$d */
    public static class C0293d {

        /* JADX INFO: renamed from: a */
        public long f3912a;

        /* JADX INFO: renamed from: b */
        public boolean f3913b;

        /* JADX INFO: renamed from: c */
        public final Runnable f3914c;

        public C0293d() {
            this.f3912a = 0L;
            this.f3913b = false;
            this.f3914c = new Runnable() { // from class: l.pp6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f18822a.m5602c();
                }
            };
        }

        /* JADX INFO: renamed from: b */
        public void m5601b() {
            this.f3912a = 0L;
            e51.J(this.f3914c);
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m5602c() {
            ConversationsList.f3858t1.onNext(roj0.a);
            this.f3912a = SystemClock.elapsedRealtime();
            this.f3913b = false;
            rd6.m21505C("ConversationList refreshObs onNext(Unit.UNIT)");
        }

        /* JADX INFO: renamed from: d */
        public void m5603d() {
            ConversationRefreshIntervalConfig conversationRefreshIntervalConfigN = upa.n();
            long j = NullChecker.a(conversationRefreshIntervalConfigN) ? conversationRefreshIntervalConfigN.conversationRefreshObsInterval * 1000 : 0;
            if (Math.abs(SystemClock.elapsedRealtime() - this.f3912a) >= j) {
                this.f3914c.run();
            } else {
                if (this.f3913b) {
                    return;
                }
                this.f3913b = true;
                e51.H(App.e, this.f3914c, j);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationsList$e */
    public class C0294e extends wp1<Conversation> implements p36 {

        /* JADX INFO: renamed from: d */
        public C0304a f3916d;

        /* JADX INFO: renamed from: f */
        public Links f3918f;

        /* JADX INFO: renamed from: h */
        public final cnr f3920h;

        /* JADX INFO: renamed from: c */
        public List<Conversation> f3915c = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: e */
        public boolean f3917e = false;

        /* JADX INFO: renamed from: g */
        public boolean f3919g = false;

        /* JADX INFO: renamed from: i */
        public final int f3921i = Color.parseColor("#4c4c4c");

        /* JADX INFO: renamed from: j */
        public final int f3922j = Color.parseColor("#999999");

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationsList$e$a */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AllPairsAct.m4625d2(ConversationsList.this.m5508l1());
                zvf0.u("e_all_match_click", "p_messages_view", new j760[]{vwb.Y("message_tab", "online")});
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationsList$e$b */
        public class b implements View.OnClickListener {
            public b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ConversationsList.this.m5508l1().startActivity(new Intent((Context) ConversationsList.this.m5508l1(), (Class<?>) GroupSuggestAct.class));
                zvf0.r("e_more_groups_click", "p_messages_view");
            }
        }

        public C0294e() {
            this.f3920h = new cnr(ConversationsList.this.f3883V, new e30() { // from class: l.qp6
                public final void call(Object obj) {
                    this.f19422a.m5604G((Integer) obj);
                }
            }, 4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: G */
        public /* synthetic */ void m5604G(Integer num) {
            if (num.intValue() >= getCount()) {
                return;
            }
            Conversation conversation = (Conversation) getItem(num.intValue());
            if (!(upa.V1() && ml6.a(conversation)) && NullChecker.a(conversation)) {
                User userPa = CoreModule.c.e0.Pa(conversation.otherUser);
                if (NullChecker.a(userPa)) {
                    qib0.G.z0(sw6.b(userPa).profileSmall());
                }
            }
        }

        /* JADX INFO: renamed from: A */
        public int m5609A() {
            return m5611C(null);
        }

        /* JADX INFO: renamed from: B */
        public C0304a m5610B() {
            return this.f3916d;
        }

        /* JADX INFO: renamed from: C */
        public int m5611C(Conversation conversation) {
            int i;
            int i2;
            if (!vwb.J(this.f3915c)) {
                int iM5961k = NullChecker.a(this.f3916d) ? this.f3916d.m5961k() : 0;
                i = iM5961k;
                i2 = -1;
                int i3 = -1;
                while (true) {
                    if (i < getCount()) {
                        if (getItemViewType(i) == 0 || getItemViewType(i) == 16 || getItemViewType(i) == 11 || getItemViewType(i) == 23) {
                            Conversation conversation2 = this.f3915c.get(i - iM5961k);
                            if (NullChecker.a(conversation) && TextUtils.equals(((DbObject) conversation2).id, ((DbObject) conversation).id)) {
                                i3 = i;
                            }
                            if ((!conversation2.read.booleanValue() && !conversation2.localEverHasMessage) || ((TextUtils.equals(((DbObject) conversation2).id, "conversation_feed_state") && !conversation2.read.booleanValue()) || ((TextUtils.equals(((DbObject) conversation2).id, "conversation_feed_interaction") && !conversation2.read.booleanValue()) || ((TextUtils.equals(((DbObject) conversation2).id, "conversation_feed_featured") && !conversation2.read.booleanValue()) || conversation2.unreadMessages > 0)))) {
                                if (i2 < 0) {
                                    i2 = i;
                                }
                                if (conversation != null) {
                                    if (i > i3 && i3 >= 0) {
                                        break;
                                    }
                                }
                            }
                        }
                        i++;
                    }
                    i = -1;
                    break;
                }
            }
            i = -1;
            i2 = -1;
            if (i >= 0) {
                return i;
            }
            if (i2 >= 0) {
                return i2;
            }
            return -1;
        }

        /* JADX INFO: renamed from: D */
        public final boolean m5612D() {
            return vwb.J(this.f3915c);
        }

        /* JADX INFO: renamed from: E */
        public boolean m5613E() {
            return upa.G0() && NullChecker.a(ConversationsList.this.f3899j1) && xdl0.O0(ConversationsList.this.f3899j1) && ConversationsList.this.f3899j1.m4791F() && this.f3919g;
        }

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ void m5614F(View view) {
            if (NullChecker.a(ConversationsList.this.f3899j1)) {
                ConversationsList conversationsList = ConversationsList.this;
                ConversationFilterLayout conversationFilterLayout = conversationsList.f3899j1;
                int currentSortType = conversationsList.f3863E0.getCurrentSortType();
                ConversationsListHeadView conversationsListHeadView = ConversationsList.this.f3863E0;
                conversationFilterLayout.m4808y(currentSortType, conversationsListHeadView.m5664g0(conversationsListHeadView.getCurrentSortType()));
            }
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m5615H(final String str) {
            if (CoreModule.c.f0.R.f15352a) {
                return;
            }
            List<Conversation> list = this.f3915c;
            if (list instanceof ArrayList) {
                int iG = vwb.G(list, new w9j() { // from class: l.tp6
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(str, ((DbObject) ((Conversation) obj)).id));
                    }
                });
                if (iG >= 0) {
                    this.f3915c.remove(iG);
                }
                ConversationsList.this.m5592v2();
            }
        }

        /* JADX INFO: renamed from: I */
        public final boolean m5616I() {
            return m5612D() || (this.f3915c.size() == 1 && User.isTeamAccount(this.f3915c.get(0).otherUser) && !ConversationsList.this.f3897h1);
        }

        /* JADX INFO: renamed from: J */
        public final boolean m5617J() {
            return m5612D() || (this.f3915c.size() == 1 && User.isTeamAccount(this.f3915c.get(0).otherUser) && !ConversationsList.this.f3897h1);
        }

        /* JADX INFO: renamed from: K */
        public void m5618K(final String str) {
            e51.G(new Runnable() { // from class: l.sp6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f20408a.m5615H(str);
                }
            });
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference fix 'apply assigned field type' failed
        java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
        	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
        	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
        	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
         */
        /* JADX INFO: renamed from: L */
        public void m5619L(List<Conversation> list, boolean z, int i) {
            if (m5613E()) {
                return;
            }
            this.f3919g = false;
            int currentSortType = ConversationsList.this.f3863E0.getCurrentSortType();
            this.f3915c = list;
            this.f3916d = new C0304a(ConversationsList.this, this, i);
            ConversationsList.this.f3871M0.onNext(roj0.a);
            boolean z2 = (currentSortType == 6 || currentSortType == 7 || currentSortType == 8 || currentSortType == 11) ? false : true;
            this.f3916d.m5967s(z2);
            boolean z3 = ConversationsList.this.f3872N0;
            ConversationsList conversationsList = ConversationsList.this;
            if (z3) {
                conversationsList.f3883V.setFooterDividersEnabled(false);
            } else {
                conversationsList.f3883V.setFooterDividersEnabled(!m5616I());
            }
            if (ConversationsList.this.f3896g1) {
                ConversationsList.f3856r1 = list.size() - 1;
            }
            this.f3920h.f();
            if (!z2 && vwb.J(this.f3915c)) {
                ConversationsList.this.m5531C2();
            }
            notifyDataSetChanged();
            ConversationsList.this.f3863E0.m5666i0(z);
        }

        /* JADX INFO: renamed from: M */
        public void m5620M(@NonNull List<Conversation> list, boolean z) {
            this.f3919g = true;
            if (upa.w3()) {
                this.f3916d.m5968t();
            }
            if (z) {
                this.f3915c.addAll(list);
            } else {
                this.f3915c = new ArrayList(list);
            }
            ConversationsList.this.m5592v2();
        }

        /* JADX INFO: renamed from: N */
        public final void m5621N(View view) {
            ConversationsList.this.f3883V.setFooterDividersEnabled(false);
            int currentSortType = ConversationsList.this.f3863E0.getCurrentSortType();
            String string = ConversationsList.this.getContext().getResources().getString(R.string.x1);
            view.findViewById(u4c0.V4).setImageResource(x2c0.e6);
            if (currentSortType == 7) {
                string = ConversationsList.this.getContext().getResources().getString(R.string.Fj);
            } else if (currentSortType == 8) {
                string = ConversationsList.this.getContext().getResources().getString(R.string.Gj);
            } else if (currentSortType == 11) {
                string = "当前没有异常的会话";
            }
            VText vTextFindViewById = view.findViewById(u4c0.X4);
            if (NullChecker.a(vTextFindViewById)) {
                vTextFindViewById.setText(string);
            }
        }

        /* JADX INFO: renamed from: O */
        public final void m5622O(View view) {
            ConversationsList.this.f3883V.setFooterDividersEnabled(false);
            int currentSortType = ConversationsList.this.f3863E0.getCurrentSortType();
            SimpleDraweeView simpleDraweeViewFindViewById = view.findViewById(u4c0.w3);
            VText vTextFindViewById = view.findViewById(u4c0.z3);
            VText vTextFindViewById2 = view.findViewById(u4c0.L0);
            if (currentSortType == 2) {
                qib0.G.Y0(simpleDraweeViewFindViewById, x2c0.ye);
                vTextFindViewById.setText("好友均未在线");
                vTextFindViewById2.setVisibility(0);
                vTextFindViewById2.setText("查看全部配对");
                xdl0.E0(vTextFindViewById2, new a());
                o6j0.i("e_all_match_click", "p_messages_view");
                return;
            }
            if (currentSortType == 6) {
                qib0.G.Y0(simpleDraweeViewFindViewById, x2c0.xe);
                vTextFindViewById.setText("你还没有加入或创建群聊");
                vTextFindViewById2.setVisibility(0);
                vTextFindViewById2.setText("发现更多群聊");
                xdl0.E0(vTextFindViewById2, new b());
                o6j0.i("e_more_groups_click", "p_messages_view");
            }
        }

        /* JADX INFO: renamed from: P */
        public final void m5623P(View view) {
            VImage vImageFindViewById = view.findViewById(u4c0.V4);
            VText vTextFindViewById = view.findViewById(u4c0.Y4);
            VText vTextFindViewById2 = view.findViewById(u4c0.X4);
            if (vImageFindViewById == null || vTextFindViewById == null || vTextFindViewById2 == null) {
                return;
            }
            vTextFindViewById.setTextColor(this.f3921i);
            vTextFindViewById2.setTextColor(this.f3922j);
            if (IntlCountryCodeController.v()) {
                vImageFindViewById.setBackground(null);
                vImageFindViewById.setImageResource(x2c0.hq);
                vImageFindViewById.setScaleType(ImageView.ScaleType.FIT_CENTER);
                vTextFindViewById.setText(R.string.br);
                vTextFindViewById2.setText(R.string.ar);
            } else {
                vImageFindViewById.setBackgroundResource(x2c0.Ct);
                vTextFindViewById.setText(R.string.g2);
                vTextFindViewById2.setText(R.string.f2);
            }
            VText vTextFindViewById3 = view.findViewById(u4c0.W4);
            VFrame vFrameFindViewById = view.findViewById(u4c0.Bd);
            xdl0.M(vFrameFindViewById, false);
            xdl0.k0(vFrameFindViewById);
            xdl0.M(vTextFindViewById3, false);
            xdl0.M(vImageFindViewById, m5617J());
            xdl0.M(vTextFindViewById2, m5617J());
            xdl0.M(vTextFindViewById, m5617J());
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: Q */
        public void m5624Q(q860<Conversation> q860Var) {
            if (m5613E()) {
                return;
            }
            boolean z = false;
            this.f3919g = false;
            this.f3915c = q860Var.f19068a;
            if (NullChecker.a(q860Var.f19069b) && NullChecker.a(q860Var.f19069b.links) && !TextUtils.isEmpty(q860Var.f19069b.links.next)) {
                z = true;
            }
            this.f3917e = z;
            this.f3918f = NullChecker.a(q860Var.f19069b) ? q860Var.f19069b.links : null;
            this.f3920h.f();
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: e */
        public void m5625e(int i) {
            if (m5613E()) {
                return;
            }
            this.f3920h.e(i);
            if (!ConversationsList.this.f3872N0 || vwb.J(this.f3915c) || this.f3915c.size() <= 0 || this.f3915c.size() - i > 1 || !this.f3917e || !NullChecker.a(this.f3918f)) {
                return;
            }
            CoreModule.c.f0.fn(this.f3918f);
        }

        public int getCount() {
            int currentSortType;
            if (ConversationsList.this.f3872N0) {
                return Math.max(1, this.f3915c.size());
            }
            if (m5613E()) {
                int size = this.f3915c.size();
                if (upa.w3()) {
                    size += this.f3916d.m5961k();
                }
                return Math.max(1, size);
            }
            if (NullChecker.a(ConversationsList.this.f3863E0) && ((currentSortType = ConversationsList.this.f3863E0.getCurrentSortType()) == 6 || currentSortType == 7 || currentSortType == 8 || currentSortType == 11)) {
                return (vwb.J(this.f3915c) ? 1 : 0) + this.f3915c.size();
            }
            int iM5961k = (NullChecker.a(this.f3916d) ? this.f3916d.m5961k() : 0) + this.f3915c.size();
            return m5616I() ? iM5961k + 1 : iM5961k;
        }

        public Object getItem(int i) {
            int i2;
            if (m5613E() && !upa.w3()) {
                if (vwb.J(this.f3915c)) {
                    return null;
                }
                return this.f3915c.get(i);
            }
            if (ConversationsList.this.f3872N0) {
                if (i < this.f3915c.size()) {
                    return this.f3915c.get(i);
                }
                return null;
            }
            int iM5961k = NullChecker.a(this.f3916d) ? this.f3916d.m5961k() : 0;
            if (i >= iM5961k && (i2 = i - iM5961k) >= 0 && i2 < this.f3915c.size()) {
                return this.f3915c.get(i2);
            }
            return null;
        }

        public long getItemId(int i) {
            return i;
        }

        public int getItemViewType(int i) {
            if (ConversationsList.this.f3872N0) {
                return (vwb.J(this.f3915c) && i == 0) ? 8 : 9;
            }
            if (m5613E() && vwb.J(this.f3915c) && (!upa.w3() || this.f3916d.m5961k() == 0)) {
                return 42;
            }
            int currentSortType = ConversationsList.this.f3863E0.getCurrentSortType();
            int iM5961k = (!NullChecker.a(this.f3916d) || (m5613E() && !upa.w3())) ? 0 : this.f3916d.m5961k();
            if (vwb.J(this.f3915c) && i == 0 && (currentSortType == 6 || currentSortType == 7 || currentSortType == 11 || currentSortType == 8)) {
                return 12;
            }
            if (i >= 0 && i < iM5961k) {
                return this.f3916d.m5962l(i);
            }
            if (m5616I() && i == getCount() - 1) {
                return 3;
            }
            if (getItem(i) instanceof Conversation) {
                Conversation conversation = (Conversation) getItem(i);
                if (TEnum.equals(conversation.status, "dismissed")) {
                    return 7;
                }
                if (ml6.a(conversation)) {
                    return 11;
                }
                if (fap.k(conversation)) {
                    return 10;
                }
                if (TextUtils.equals("feedstate", conversation.convType)) {
                    return 16;
                }
                if (TextUtils.equals("virtualvoice", conversation.convType)) {
                    return 23;
                }
                if (TextUtils.equals("fakeReceiveLikeGuideSVip", conversation.convType)) {
                    return 27;
                }
                if (TextUtils.equals("liveactivites", conversation.convType)) {
                    return 29;
                }
                if (TextUtils.equals("fakeIntlReceiveLikeGuideSVip", conversation.convType)) {
                    return 41;
                }
                if (TextUtils.equals("local_instant_chat_guide", conversation.convType)) {
                    return 45;
                }
                if (TextUtils.equals("fake_conversation_oof_pick", ((DbObject) conversation).id)) {
                    return 30;
                }
                if (TextUtils.equals("fake_conversation_oof_enter", ((DbObject) conversation).id)) {
                    return 31;
                }
                if (TextUtils.equals("fake_conversation_profile_featured", ((DbObject) conversation).id)) {
                    return 37;
                }
                if (rd6.m21506C0(conversation)) {
                    return 32;
                }
                if (TextUtils.equals("fake_conversation_blindbox_enter", ((DbObject) conversation).id)) {
                    return 34;
                }
                if (TextUtils.equals("fake_conversation_surprise_gift_box", ((DbObject) conversation).id)) {
                    return 36;
                }
                if (TextUtils.equals("fake_conversation_local_summary_marriage_conversation", ((DbObject) conversation).id)) {
                    return 40;
                }
                if (TextUtils.equals("fake_conversation_profile_like_enter", ((DbObject) conversation).id)) {
                    return 38;
                }
                if (TextUtils.equals("fake_conversation_fold_conversation", ((DbObject) conversation).id)) {
                    return 39;
                }
                if (TextUtils.equals("fake_conversation_weaken_conversation", ((DbObject) conversation).id)) {
                    return 46;
                }
                if (TextUtils.equals("fake_conversation_local_team_group_conversation", ((DbObject) conversation).id)) {
                    return 43;
                }
                if (TextUtils.equals("fake_conversation_local_limited_trial_see_fold", ((DbObject) conversation).id)) {
                    return 44;
                }
            }
            return 0;
        }

        public int getViewTypeCount() {
            return 49;
        }

        @Override // p009l.p36
        /* JADX INFO: renamed from: h */
        public int mo5626h() {
            return getCount();
        }

        @Override // p009l.p36
        /* JADX INFO: renamed from: k */
        public List<Conversation> mo5628k() {
            return this.f3915c;
        }

        @Override // p009l.p36
        /* JADX INFO: renamed from: l */
        public int mo5629l() {
            if ((!m5613E() || upa.w3()) && NullChecker.a(this.f3916d)) {
                return this.f3916d.m5961k();
            }
            return 0;
        }

        /* JADX INFO: renamed from: m */
        public View m5630m(ViewGroup viewGroup, int i) {
            if (ConversationsList.this.f3872N0) {
                ConversationsList conversationsList = ConversationsList.this;
                return i == 8 ? conversationsList.m5508l1().inflater().inflate(f6c0.pc, (ViewGroup) ConversationsList.this.f3883V, false) : rd6.m21512a(conversationsList.m5508l1(), viewGroup);
            }
            if (i == 28) {
                return ConversationsList.this.m5508l1().inflater().inflate(f6c0.U1, (ViewGroup) ConversationsList.this.f3883V, false);
            }
            if (i == 12) {
                return ConversationsList.this.m5508l1().inflater().inflate(f6c0.F3, (ViewGroup) ConversationsList.this.f3883V, false);
            }
            if (i == 3) {
                ConversationsList conversationsList2 = ConversationsList.this;
                return !conversationsList2.f3897h1 ? conversationsList2.m5508l1().inflater().inflate(f6c0.k, (ViewGroup) ConversationsList.this.f3883V, false) : conversationsList2.m5508l1().inflater().inflate(f6c0.l, (ViewGroup) ConversationsList.this.f3883V, false);
            }
            if (i == 1 || i == 14) {
                return ConversationsList.this.m5508l1().inflater().inflate(f6c0.c0, (ViewGroup) ConversationsList.this.f3883V, false);
            }
            if (i == 48) {
                return ConversationsList.this.m5508l1().inflater().inflate(f6c0.B4, (ViewGroup) ConversationsList.this.f3883V, false);
            }
            if (i == 13) {
                return rd6.m21512a(ConversationsList.this.m5508l1(), viewGroup);
            }
            if (i == 15) {
                return ConversationsList.this.m5508l1().inflater().inflate(f6c0.K1, (ViewGroup) ConversationsList.this.f3883V, false);
            }
            if (i == 16) {
                return ConversationsList.this.m5508l1().inflater().inflate(f6c0.S1, (ViewGroup) ConversationsList.this.f3883V, false);
            }
            if (i == 17) {
                return rd6.m21512a(ConversationsList.this.m5508l1(), ConversationsList.this.f3883V);
            }
            if (i == 23) {
                return ConversationsList.this.m5508l1().inflater().inflate(f6c0.T1, (ViewGroup) ConversationsList.this.f3883V, false);
            }
            if (i == 30 || i == 31 || i == 37) {
                return ConversationsList.this.m5508l1().inflater().inflate(f6c0.J1, (ViewGroup) ConversationsList.this.f3883V, false);
            }
            if (i == 43) {
                return ConversationsList.this.m5508l1().inflater().inflate(f6c0.R1, (ViewGroup) ConversationsList.this.f3883V, false);
            }
            if (i == 27) {
                return ConversationsList.this.m5508l1().inflater().inflate(f6c0.P1, (ViewGroup) ConversationsList.this.f3883V, false);
            }
            if (i == 41) {
                return ConversationsList.this.m5508l1().inflater().inflate(f6c0.M1, (ViewGroup) ConversationsList.this.f3883V, false);
            }
            if (i == 45) {
                return ConversationsList.this.m5508l1().inflater().inflate(f6c0.L1, (ViewGroup) ConversationsList.this.f3883V, false);
            }
            if (i == 32) {
                return rd6.m21507G(ConversationsList.this.m5508l1(), viewGroup);
            }
            if (i == 33) {
                return ConversationsList.this.m5508l1().inflater().inflate(f6c0.N1, (ViewGroup) ConversationsList.this.f3883V, false);
            }
            if (i == 34) {
                return ConversationsList.this.m5508l1().inflater().inflate(f6c0.I1, (ViewGroup) ConversationsList.this.f3883V, false);
            }
            if (i == 36) {
                return ConversationsList.this.m5508l1().inflater().inflate(f6c0.Q1, (ViewGroup) ConversationsList.this.f3883V, false);
            }
            if (i == 38) {
                return ConversationsList.this.m5508l1().inflater().inflate(f6c0.O1, (ViewGroup) ConversationsList.this.f3883V, false);
            }
            if (i == 39) {
                return ConversationsList.this.m5508l1().inflater().inflate(f6c0.Z1, (ViewGroup) ConversationsList.this.f3883V, false);
            }
            if (i == 46) {
                return ConversationsList.this.m5508l1().inflater().inflate(f6c0.b2, (ViewGroup) ConversationsList.this.f3883V, false);
            }
            if (i == 42) {
                return ConversationsList.this.m5508l1().inflater().inflate(f6c0.W1, (ViewGroup) ConversationsList.this.f3883V, false);
            }
            if (i == 44) {
                return rd6.m21512a(ConversationsList.this.m5508l1(), viewGroup);
            }
            if (i == 47) {
                return CoreModule.Q().m9021Ms(ConversationsList.this.m5508l1(), ConversationsList.this.f3906p0).getView();
            }
            return rd6.m21511Z(ConversationsList.this.m5508l1(), viewGroup, i == 11);
        }

        @Override // p009l.p36
        /* JADX INFO: renamed from: o */
        public int mo5631o() {
            ConversationsListHeadView conversationsListHeadView = ConversationsList.this.f3863E0;
            if (conversationsListHeadView != null) {
                return conversationsListHeadView.getCurrentSortType();
            }
            return -1;
        }

        @Override // p009l.p36
        /* JADX INFO: renamed from: q */
        public void mo5632q() {
            ConversationsList.this.m5592v2();
        }

        @Override // p009l.p36
        /* JADX INFO: renamed from: v */
        public c<Boolean> mo5633v() {
            return ConversationsList.this.f3898i1.getParentFragment() instanceof PutongFrag ? ConversationsList.this.f3898i1.getParentFragment().L4() : c.just(Boolean.TRUE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public void m5627j(View view, Conversation conversation, int i, int i2) {
            int iIntValue;
            int iD;
            if (ConversationsList.this.f3872N0) {
                if (i != 8) {
                    ((NewConversationItemView) view).m5902u4(this, conversation, null, i2, null);
                    return;
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = t100.c().heightPixels - t100.d(340.0f);
                view.setLayoutParams(layoutParams);
                ConversationsList.this.f3883V.setFooterDividersEnabled(false);
                return;
            }
            if (i == 28) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = -1;
                if (((Integer) CoreModule.c.e0.k3.get()).intValue() == 0 || ((Integer) CoreModule.c.e0.l3.get()).intValue() == 0) {
                    layoutParams2.height = t100.c().heightPixels - t100.d(340.0f);
                } else {
                    layoutParams2.height = (((Integer) CoreModule.c.e0.k3.get()).intValue() - ((Integer) CoreModule.c.e0.l3.get()).intValue()) - t100.d(44.0f);
                }
                xdl0.X(view.findViewById(u4c0.v7), (int) (((double) ((layoutParams2.height - t100.d(261.0f)) / 2)) - (((double) layoutParams2.height) * 0.1d)));
                view.setLayoutParams(layoutParams2);
                m5622O(view);
                return;
            }
            if (i == 12) {
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                layoutParams3.width = -1;
                layoutParams3.height = t100.c().heightPixels - t100.d(340.0f);
                view.setLayoutParams(layoutParams3);
                m5621N(view);
                return;
            }
            if (i == 42) {
                View viewFindViewById = view.findViewById(u4c0.x3);
                xdl0.M(viewFindViewById, true);
                if (((Integer) CoreModule.c.e0.k3.get()).intValue() == 0 || ((Integer) CoreModule.c.e0.l3.get()).intValue() == 0) {
                    iIntValue = t100.c().heightPixels;
                    iD = t100.d(340.0f);
                } else {
                    iIntValue = ((Integer) CoreModule.c.e0.k3.get()).intValue() - ((Integer) CoreModule.c.e0.l3.get()).intValue();
                    iD = t100.d(44.0f);
                }
                xdl0.C0(viewFindViewById, iIntValue - iD);
                TextView textView = (TextView) view.findViewById(u4c0.u3);
                textView.setText("重置筛选");
                xdl0.E0(textView, new View.OnClickListener() { // from class: l.rp6
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f19940a.m5614F(view2);
                    }
                });
                ((TextView) view.findViewById(u4c0.A3)).setText("没有找到符合条件的消息\n你可以减少筛选项试试");
                return;
            }
            if (i == 3) {
                if (ConversationsList.this.f3897h1) {
                    return;
                }
                m5623P(view);
                return;
            }
            if (i == 1 || i == 14) {
                ((BusinessConversationView) view).m6449i0(ConversationsList.this.m5508l1(), this);
            } else if (i == 48) {
                ((IntlVisitorConversationView) view).m6455m0(ConversationsList.this.m5508l1(), this);
            } else if (i != 2) {
                if (i == 0) {
                    try {
                        ConversationsList conversationsList = ConversationsList.this;
                        ((NewConversationItemView) view).m5889h4(this, conversation, conversationsList.f3901k1, conversationsList.f3896g1, i2, null);
                    } catch (ClassCastException e) {
                        CrashHelper.c(e);
                    }
                } else if (i == 11) {
                    ConversationsList conversationsList2 = ConversationsList.this;
                    ((NewConversationItemView) view).m5893l4(this, conversation, conversationsList2.f3901k1, conversationsList2.f3896g1, i2, null);
                } else if (i != 5) {
                    if (i == 7) {
                        ((NewConversationItemView) view).m5902u4(this, conversation, ConversationsList.this.f3901k1, i2, null);
                    } else if (i == 10) {
                        ((NewConversationItemView) view).m5895n4(this);
                    } else if (i == 13) {
                        ((NewConversationItemView) view).m5898q4(this, i2);
                    } else if (i == 15) {
                        ((ConversationItemGoogleAdView) view).m4923c(ConversationsList.this.m5508l1(), ConversationsList.this.f3896g1);
                    } else if (i == 16) {
                        ConversationsList.this.m5533D2(conversation.additional.feedStateCounter);
                        ((ConversationItemUserStatesView) view).m5046i(ConversationsList.this.m5508l1(), conversation);
                    } else if (i == 17) {
                        ((NewConversationItemView) view).m5903v4(this, ConversationsList.this.m5508l1());
                    } else if (i == 23) {
                        ((ConversationItemVirtualVoiceGroupView) view).m5149E0(ConversationsList.this.m5508l1(), conversation, i2);
                    } else if (i == 30) {
                        ((ConversationItemFriendMoments) view).m4919p(this, conversation.otherUser);
                    } else if (i == 31) {
                        ((ConversationItemFriendMoments) view).m4918o(this, conversation.otherUser);
                    } else if (i == 37) {
                        ((ConversationItemFriendMoments) view).m4920q(this, conversation.otherUser);
                    } else if (i == 27) {
                        ((ConversationItemReceiveLikeView) view).m5001k(this, conversation);
                    } else if (i == 41) {
                        try {
                            ((ConversationItemIntlReceiveLikeView) view).m4953k(conversation);
                        } catch (ClassCastException e2) {
                            CrashHelper.c(e2);
                        }
                    } else if (i == 45) {
                        ((ConversationItemInstantChatGuideView) view).m4936m(ConversationsList.this.m5508l1(), conversation);
                    } else if (i == 32) {
                        ConversationsList conversationsList3 = ConversationsList.this;
                        ((NewConversationItemView) view).m5892k4(this, conversation, conversationsList3.f3901k1, conversationsList3.f3896g1, i2, null);
                    } else if (i == 33) {
                        ((ConversationItemPlatinumPinLike) view).m4980q(this, i2);
                    } else if (i == 35) {
                        ((NewConversationItemView) view).m5891j4(this, conversation, ConversationsList.this.m5508l1());
                    } else if (i == 34) {
                        ((ConversationItemBlindBoxEntrance) view).m4902e(conversation);
                    } else if (i == 36) {
                        ((ConversationItemSurpriseBoxEntrance) view).m5015f(conversation);
                    } else if (i == 40) {
                        ((NewConversationItemView) view).m5899r4(this, conversation);
                    } else if (i == 38) {
                        ((ConversationItemProfileLikeEntrance) view).m4990i(conversation, this);
                    } else if (i == 39) {
                        ((ConversationFoldView) view).m4814T(ConversationsList.this.m5508l1(), this);
                    } else if (i == 46) {
                        ((ConversationWeakenView) view).m5428d0(ConversationsList.this.m5508l1(), this);
                    } else if (i == 43) {
                        ((ConversationItemTeamGroup) view).m5032o(this, conversation);
                    } else if (i == 44) {
                        ((NewConversationItemView) view).m5897p4(this, i2, ConversationsList.this.f3889Z0);
                    } else if (i == 47) {
                        ((cqp) view).m12763z(i2);
                    }
                }
            }
            if (!m5613E() || i2 < this.f3915c.size() - 3 || this.f3915c.size() <= 10) {
                return;
            }
            ConversationsList.this.f3899j1.m4802Q(this, true);
        }

        /* JADX INFO: renamed from: z */
        public boolean m5635z(User user, Conversation conversation) {
            return ConversationsList.this.f3899j1.m4786A(conversation, user);
        }
    }

    static {
        roj0 roj0Var = roj0.a;
        f3858t1 = a.c(roj0Var);
        f3859u1 = a.c(roj0Var);
        f3860v1 = a.c(roj0Var);
        f3861w1 = a.c(roj0Var);
        f3862x1 = new C0293d();
    }

    public ConversationsList(Context context) {
        super(context);
        this.f3900k0 = null;
        this.f3864F0 = 23;
        this.f3865G0 = 39;
        this.f3866H0 = 40;
        this.f3867I0 = 41;
        this.f3868J0 = 42;
        this.f3869K0 = 43;
        this.f3870L0 = 45;
        this.f3871M0 = a.c(roj0.a);
        this.f3872N0 = false;
        this.f3873O0 = a.c(0);
        this.f3874P0 = a.c(q860.m20833b());
        this.f3875Q0 = a.c(new ArrayList());
        this.f3876R0 = a.c(new ArrayList());
        this.f3878S0 = a.c(new ArrayList());
        this.f3880T0 = a.c(new ArrayList());
        this.f3882U0 = a.c(new ArrayList());
        this.f3884V0 = a.c(new ArrayList());
        this.f3886W0 = a.c(q860.m20833b());
        this.f3887X0 = a.c(q860.m20833b());
        this.f3888Y0 = new ArrayList();
        this.f3889Z0 = new ArrayList();
        this.f3891b1 = false;
        this.f3892c1 = false;
        this.f3894e1 = false;
        this.f3895f1 = null;
        this.f3896g1 = false;
        this.f3897h1 = false;
        this.f3902l1 = false;
        this.f3903m1 = 6;
        this.f3904n1 = 40;
        this.f3905o1 = 50;
    }

    /* JADX INFO: renamed from: A2 */
    public static void m5434A2() {
        m5437B2(false);
    }

    /* JADX INFO: renamed from: B2 */
    public static void m5437B2(boolean z) {
        rd6.m21505C("refreshObs 强制刷新 = " + z);
        if (z) {
            f3862x1.m5601b();
        }
        f3862x1.m5603d();
    }

    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ void m5449H0(ggi.a aVar) {
        if (aVar == null || aVar.a == null) {
            return;
        }
        r6n.m21419f().f19656b.onNext((InsertConversationsList) aVar.a);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m5454K(Throwable th) {
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m5458M(boolean[] zArr) {
        List listJ = CoreModule.k.m.y.j();
        for (int i = 0; i < listJ.size() && i < 50; i++) {
            double d = ((Conversation) listJ.get(i)).additional.quickChat.expire;
            if (d > 0.0d && d < mqi0.m18550o()) {
                zArr[0] = true;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m5464P(List list) {
        CoreModule.c.f0.a2 = "";
        int iMin = Math.min(list.size(), 50);
        int i = 0;
        for (int i2 = 0; i2 < iMin && i < 20; i2++) {
            Conversation conversation = (Conversation) list.get(i2);
            if (!conversation.newMatchExpShowInList()) {
                if (!TextUtils.isEmpty(CoreModule.c.f0.a2)) {
                    StringBuilder sb = new StringBuilder();
                    g gVar = CoreModule.c.f0;
                    sb.append(gVar.a2);
                    sb.append(",");
                    gVar.a2 = sb.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                g gVar2 = CoreModule.c.f0;
                sb2.append(gVar2.a2);
                sb2.append(((DbObject) conversation).id);
                gVar2.a2 = sb2.toString();
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m5467Q0(Throwable th) {
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ Boolean m5469R0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m5470S(Throwable th) {
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m5472T(Throwable th) {
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ Boolean m5474U(Boolean bool) {
        if (bool.booleanValue()) {
            return Boolean.FALSE;
        }
        CertificationNewConfig certificationNewConfigJ = upa.J();
        boolean zH = qqi0.h(mqi0.m18550o(), (long) CoreModule.c.e0.na().createdTime, 7);
        boolean z = false;
        boolean z2 = CoreModule.c.f0.kf() < (CoreModule.c.e0.na().isFemale() ? certificationNewConfigJ.femaleLimit : certificationNewConfigJ.maleLimit);
        boolean z3 = CoreModule.c.f0.mf(1) <= 0;
        if ((!zH && z2) || (zH && z3)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m5475U0(Throwable th) {
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ void m5481X0(Throwable th) {
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ Boolean m5483Y0(q860 q860Var) {
        final boolean[] zArr = {false};
        f8c.o().B(new d30() { // from class: l.qn6
            public final void call() {
                ConversationsList.m5458M(zArr);
            }
        });
        return Boolean.valueOf(zArr[0]);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m5498g0(Throwable th) {
    }

    private void getFeedUserStateCounter() {
        m5508l1().duringCreated(CoreModule.c.q1.w3().take(1)).subscribe(mkd0.H(new e30() { // from class: l.am6
            public final void call(Object obj) {
                this.f9574a.m5545M1((roj0) obj);
            }
        }, new e30() { // from class: l.lm6
            public final void call(Object obj) {
                ConversationsList.m5470S((Throwable) obj);
            }
        }));
    }

    private c<Boolean> getPicCerGuideObs() {
        return (!jjb0.b() || CoreModule.K().me_().isPicVerificationVerified() || ((Integer) CoreModule.c.e0.W3.get()).intValue() >= 3 || mqi0.m18550o() <= ((Long) CoreModule.c.e0.V3.get()).longValue() || (upa.g() && wn90.m24339F().m24384R())) ? c.just(Boolean.FALSE) : c.combineLatest(CoreModule.c.B0.j4().filter(new w9j() { // from class: l.zo6
            public final Object call(Object obj) {
                return Boolean.valueOf(NullChecker.a((VerificationCenter) obj));
            }
        }).map(new w9j() { // from class: l.kp6
            public final Object call(Object obj) {
                VerificationCenter verificationCenter = (VerificationCenter) obj;
                return Boolean.valueOf(TEnum.equals(verificationCenter.picVerificationInfo.status, "verified") || TEnum.equals(verificationCenter.picVerificationInfo.status, "pending"));
            }
        }).distinctUntilChanged(), m5508l1().lifecycle().filter(new w9j() { // from class: l.op6
            public final Object call(Object obj) {
                return Boolean.valueOf(((com.p1.mobile.android.app.c) obj) == com.p1.mobile.android.app.c.i && v930.h() == TabName.Msg);
            }
        }), new x9j() { // from class: l.bm6
            public final Object call(Object obj, Object obj2) {
                return ConversationsList.m5520w0((Boolean) obj, (com.p1.mobile.android.app.c) obj2);
            }
        }).observeOn(Schedulers.io()).map(new w9j() { // from class: l.cm6
            public final Object call(Object obj) {
                return ConversationsList.m5474U((Boolean) obj);
            }
        }).observeOn(jo0.a());
    }

    private c<Boolean> getSortInvalidConvObs() {
        return CoreModule.c.f0.p2.map(new w9j() { // from class: l.oo6
            public final Object call(Object obj) {
                return this.f18190a.m5546N1((roj0) obj);
            }
        }).distinctUntilChanged();
    }

    private c<Integer> getTotalLiker() {
        return CoreModule.c.u0.O6().map(new w9j() { // from class: l.wm6
            public final Object call(Object obj) {
                return ConversationsList.m5513q0((CoreLikers.a) obj);
            }
        }).distinctUntilChanged();
    }

    private c<Integer> getWeakenedTipsObs() {
        return c.just(-1);
    }

    private c<WechatNotifySetting> getWechatNotifyObs() {
        return c.just((Object) null);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m5500h0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: l1 */
    public PutongAct m5508l1() {
        return getContext();
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m5511o0(com.p1.mobile.android.app.c cVar) {
        if (cVar == com.p1.mobile.android.app.c.i) {
            i iVar = CoreModule.c.q1;
            i.S.onNext(roj0.a);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ Integer m5513q0(CoreLikers.a aVar) {
        if (n3b0.q()) {
            return Integer.valueOf(aVar.b);
        }
        return -1;
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m5517u0(Throwable th) {
    }

    /* JADX INFO: renamed from: v0 */
    public static /* synthetic */ void m5518v0(List list, boolean z) {
        if (vwb.J(list)) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            Conversation conversationClone = ((Conversation) list.get(i)).clone();
            int i2 = z ? 2 : 1;
            if (i2 != conversationClone.localIsLimitedTrialSee) {
                conversationClone.localIsLimitedTrialSee = i2;
                CoreModule.k.m.upsert(conversationClone);
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ Boolean m5520w0(Boolean bool, com.p1.mobile.android.app.c cVar) {
        return bool;
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ void m5522x0(Boolean bool) {
        OnlineMatchManager.z().A.onNext("过期闪聊配对在这里");
        OnlineMatchManager.z().l.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ Boolean m5524y0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m5525z(Throwable th) {
    }

    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ j760 m5526z0(j760 j760Var) {
        final List list = (List) j760Var.a;
        String str = (String) j760Var.b;
        if (vwb.J(list)) {
            return j760Var;
        }
        final boolean z = ((long) list.size()) > emr.INSTANCE.d() && ("trialEnd".equals(str) || "waiting".equals(str) || "expired".equals(str));
        f8c.o().B(new d30() { // from class: l.lp6
            public final void call() {
                ConversationsList.m5518v0(list, z);
            }
        });
        return j760Var;
    }

    /* JADX INFO: renamed from: z2 */
    public static void m5527z2() {
        f3861w1.onNext(roj0.a);
    }

    /* JADX INFO: renamed from: A1 */
    public final void m5528A1() {
        if (y19.T()) {
            xdl0.M(this.f3863E0.f3968z, true);
            xdl0.E0(this.f3863E0.f3968z, new View.OnClickListener() { // from class: l.nn6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f17580a.m5567i2(view);
                }
            });
            this.f3898i1.duringCreated(c.combineLatest(CoreModule.c.e0.o9(), CoreModule.c.B0.j4(), new x9j() { // from class: l.on6
                public final Object call(Object obj, Object obj2) {
                    return new j760((User) obj, (VerificationCenter) obj2);
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.pn6
                public final void call(Object obj) {
                    this.f18793a.m5568j2((j760) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: B1 */
    public final void m5529B1() {
        if (ogl0.X()) {
            m5508l1().duringCreated(new v9j() { // from class: l.rn6
                public final Object call() {
                    return mkd0.r(CoreModule.c.C0.u3(SummarizedPrivilegesId.get("svip")).map(new w9j() { // from class: l.jo6
                        public final Object call(Object obj) {
                            return Boolean.valueOf(xma.L3());
                        }
                    }), CoreModule.c.C0.u3(SummarizedPrivilegesId.get("limitedTrialSee")).map(new w9j() { // from class: l.ko6
                        public final Object call(Object obj) {
                            return Boolean.valueOf(xma.E3());
                        }
                    }), new x9j() { // from class: l.lo6
                        public final Object call(Object obj, Object obj2) {
                            return j760.a((Boolean) obj, (Boolean) obj2);
                        }
                    });
                }
            }).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.tn6
                public final void call(Object obj) {
                    this.f20775a.m5570k2((j760) obj);
                }
            }));
            m5508l1().duringCreated(new v9j() { // from class: l.un6
                public final Object call() {
                    return this.f21263a.m5571l2();
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.vn6
                public final void call(Object obj) {
                    this.f21658a.m5573m2((j760) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: C1 */
    public final void m5530C1() {
        if (upa.G0()) {
            m5508l1().duringCreated(CoreModule.c.f0.ff()).subscribe(mkd0.G(new e30() { // from class: l.cn6
                public final void call(Object obj) {
                    ConversationsList.m5464P((List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: C2 */
    public void m5531C2() {
        this.f3883V.setAdapter(this.f3906p0);
    }

    /* JADX INFO: renamed from: D1 */
    public final void m5532D1() {
        m5508l1().duringCreated(r6n.m21419f().f19655a.k().compose(mkd0.C()).doOnNext(new e30() { // from class: l.mo6
            public final void call(Object obj) {
                ConversationsList.m5449H0((ggi.a) obj);
            }
        }).flatMap(new w9j() { // from class: l.no6
            public final Object call(Object obj) {
                return CoreModule.c.f0.rn();
            }
        }).take(1)).subscribe(mkd0.H(new e30() { // from class: l.po6
            public final void call(Object obj) {
                r6n.m21419f().m21425g((List) obj);
            }
        }, new e30() { // from class: l.qo6
            public final void call(Object obj) {
                ConversationsList.m5467Q0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D2 */
    public final void m5533D2(CoreFeedStateCounter coreFeedStateCounter) {
        if (this.f3891b1) {
            this.f3891b1 = false;
            zvf0.A("e_match_state", "p_messages_view", new j760[]{new j760("has_red_dot", (!NullChecker.a(coreFeedStateCounter) || coreFeedStateCounter.unread <= 0) ? "no" : "yes")});
        }
    }

    /* JADX INFO: renamed from: E1 */
    public final void m5534E1() {
        m5508l1().duringCreated(mkd0.s(f3859u1, this.f3886W0, this.f3887X0, new y9j() { // from class: l.yo6
            /* JADX INFO: renamed from: a */
            public final Object m25484a(Object obj, Object obj2, Object obj3) {
                return vwb.Y((q860) obj2, (q860) obj3);
            }
        })).onBackpressureDrop(new e30() { // from class: l.ap6
            public final void call(Object obj) {
                CrashHelper.d(new IllegalStateException("ConversationsList backpressure problem! - list filter map problem"), 100);
            }
        }).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.bp6
            public final void call(Object obj) {
                this.f10227a.m5575n2((j760) obj);
            }
        }, new e30() { // from class: l.cp6
            public final void call(Object obj) {
                ConversationsList.m5525z((Throwable) obj);
            }
        }));
        c cVarPh = CoreModule.c.f0.ph();
        a<q860<Conversation>> aVar = this.f3886W0;
        Objects.requireNonNull(aVar);
        cVarPh.subscribe(new io6(aVar));
        c cVarQh = CoreModule.c.f0.qh();
        a<q860<Conversation>> aVar2 = this.f3887X0;
        Objects.requireNonNull(aVar2);
        cVarQh.subscribe(new io6(aVar2));
    }

    /* JADX INFO: renamed from: E2 */
    public void m5535E2() {
        if (NullChecker.a(this.f3899j1)) {
            this.f3899j1.m4806U();
        }
    }

    /* JADX INFO: renamed from: F1 */
    public final boolean m5536F1(Conversation conversation, HashMap<String, UserLiveLabel> map) {
        if (map != null && !map.isEmpty()) {
            if ("group".equals(conversation.convType)) {
                ChatGroup chatGroupS6 = CoreModule.c.g0.s6(conversation.otherUser);
                if (NullChecker.a(chatGroupS6)) {
                    return map.get(chatGroupS6.ownerUserId) != null;
                }
            }
            if (map.get(((DbObject) conversation).id) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: F2 */
    public final void m5537F2() {
        if (this.f3863E0 == null) {
            return;
        }
        int firstVisiblePosition = this.f3883V.getFirstVisiblePosition();
        boolean z = false;
        int iMax = (!xdl0.O0(this.f3863E0.f3961s) || firstVisiblePosition > 0) ? 0 : Math.max(this.f3863E0.f3961s.getTop() + this.f3863E0.getTop(), 0);
        int initHeight = (NullChecker.a(this.f3893d1) && xdl0.O0(this.f3893d1)) ? this.f3893d1.getInitHeight() : 0;
        if (this.f3863E0.getTop() >= 0) {
            iMax = firstVisiblePosition > 0 ? 0 : this.f3863E0.f3961s.getTop();
        } else if (initHeight > 0 && (iMax = Math.max(iMax, initHeight)) == initHeight) {
            z = true;
        }
        boolean z2 = iMax != 0 ? z : true;
        xdl0.X(this.f3899j1, iMax);
        xdl0.e0(this.f3899j1, t100.h);
        ConvCellList convCellList = this.f3883V;
        if (z2) {
            convCellList.setClipHeight(iMax + this.f3899j1.getHeight());
        } else {
            convCellList.setClipHeight(-1);
        }
    }

    /* JADX INFO: renamed from: G1 */
    public boolean m5538G1() {
        if (upa.a2()) {
            return false;
        }
        return this.f3896g1;
    }

    /* JADX INFO: renamed from: G2 */
    public void m5539G2() {
        if (NullChecker.a(this.f3906p0) && NullChecker.a(this.f3906p0.m5610B()) && C0304a.m5957p((String) CoreModule.c.f0.J0.get()) && !this.f3906p0.m5610B().m5965o(13)) {
            this.f3906p0.m5610B().m5964n();
            this.f3906p0.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: H1 */
    public boolean m5540H1() {
        return this.f3896g1;
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m5541I1(knb0 knb0Var) {
        CrashHelper.d(new IllegalStateException("ConversationsList backpressure problem! - list filter problem isSearchList = " + this.f3897h1), 100);
    }

    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m5542J1(knb0 knb0Var) {
        if (knb0Var.a == null || this.f3906p0.m5613E()) {
            return;
        }
        int currentSortType = this.f3863E0.getCurrentSortType();
        if (NullChecker.a(this.f3863E0)) {
            if (currentSortType == 1) {
                this.f3888Y0 = (List) knb0Var.b;
            } else if (currentSortType == 4 && NullChecker.a(((knb0) knb0Var.a).a)) {
                Object obj = knb0Var.a;
                this.f3888Y0 = ((q860) ((knb0) obj).a).f19068a;
                this.f3906p0.m5624Q((q860) ((knb0) obj).a);
                this.f3872N0 = true;
            } else if (currentSortType == 6 && NullChecker.a(((knb0) knb0Var.a).b)) {
                this.f3888Y0 = (List) ((knb0) knb0Var.a).b;
            } else if (currentSortType == 7 && NullChecker.a(((knb0) knb0Var.a).c)) {
                this.f3888Y0 = (List) ((knb0) knb0Var.a).c;
            } else if (currentSortType == 8 && NullChecker.a(((knb0) knb0Var.a).d)) {
                this.f3888Y0 = (List) ((knb0) knb0Var.a).d;
            } else if (currentSortType == 11 && NullChecker.a(knb0Var.d)) {
                this.f3888Y0 = (List) knb0Var.d;
            }
            m5437B2(true);
        }
    }

    /* JADX INFO: renamed from: K1 */
    public final /* synthetic */ void m5543K1(j760 j760Var) {
        CrashHelper.d(new IllegalStateException("ConversationsList backpressure problem! - list problem isSearchList = " + this.f3897h1), 100);
    }

    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m5544L1(j760 j760Var) {
        if (this.f3906p0.m5613E()) {
            return;
        }
        List<Conversation> list = (List) j760Var.a;
        int iIntValue = ((Integer) j760Var.b).intValue();
        if (this.f3863E0.getCurrentSortType() != 0) {
            list = this.f3888Y0;
        }
        List<Conversation> listM5598y2 = m5598y2(list, m5538G1());
        if (upa.a2()) {
            CoreModule.c.f0.ho(m5538G1(), listM5598y2);
        }
        if (this.f3863E0.getCurrentSortType() != 4) {
            this.f3906p0.m5619L(listM5598y2, false, iIntValue);
            this.f3872N0 = false;
        }
        StringBuilder sb = new StringBuilder("ConversationList Render (size = ");
        sb.append(vwb.J(listM5598y2) ? 0 : listM5598y2.size());
        sb.append(")");
        rd6.m21505C(sb.toString());
    }

    /* JADX INFO: renamed from: M1 */
    public final /* synthetic */ void m5545M1(roj0 roj0Var) {
        this.f3891b1 = true;
        m5572m1();
    }

    /* JADX INFO: renamed from: N1 */
    public final /* synthetic */ Boolean m5546N1(roj0 roj0Var) {
        return Boolean.valueOf(this.f3863E0.getCurrentSortType() == 11);
    }

    /* JADX INFO: renamed from: O1 */
    public final /* synthetic */ void m5547O1(Boolean bool) {
        this.f3877S.setRefreshing(true);
    }

    /* JADX INFO: renamed from: P1 */
    public final /* synthetic */ void m5548P1(Throwable th) {
        if (m5508l1().isFinishing()) {
            return;
        }
        this.f3877S.setRefreshing(false);
        if (upa.a2()) {
            m5434A2();
        }
    }

    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ void m5549Q1() {
        if (m5508l1().isFinishing()) {
            return;
        }
        this.f3877S.setRefreshing(false);
        if (upa.a2()) {
            m5434A2();
        }
    }

    /* JADX INFO: renamed from: R1 */
    public final /* synthetic */ void m5550R1() {
        m5508l1().duringCreated(CoreModule.c.f0.on().map(new w9j() { // from class: l.fn6
            public final Object call(Object obj) {
                return Boolean.valueOf(((q860) obj).m20834c());
            }
        }).takeUntil(new w9j() { // from class: l.gn6
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }).filter(new w9j() { // from class: l.in6
            public final Object call(Object obj) {
                return ConversationsList.m5469R0((Boolean) obj);
            }
        }).distinctUntilChanged()).subscribe(mkd0.I(new e30() { // from class: l.jn6
            public final void call(Object obj) {
                this.f15235a.m5547O1((Boolean) obj);
            }
        }, new e30() { // from class: l.kn6
            public final void call(Object obj) {
                this.f15771a.m5548P1((Throwable) obj);
            }
        }, new d30() { // from class: l.ln6
            public final void call() {
                this.f16267a.m5549Q1();
            }
        }));
    }

    /* JADX INFO: renamed from: S1 */
    public final /* synthetic */ c m5551S1() {
        return this.f3896g1 ? CoreModule.c.f0.ip() : c.just(roj0.a);
    }

    /* JADX INFO: renamed from: T1 */
    public final /* synthetic */ void m5552T1(roj0 roj0Var) {
        int currentSortType = this.f3863E0.getCurrentSortType();
        if (NullChecker.a(this.f3899j1)) {
            this.f3899j1.m4808y(currentSortType, this.f3863E0.m5664g0(currentSortType));
        }
        if (currentSortType == 4) {
            CoreModule.c.f0.fn((Links) null);
            this.f3883V.setFooterDividersEnabled(false);
        } else if (currentSortType == 6) {
            this.f3883V.setFooterDividersEnabled(false);
        }
        if (NullChecker.a(this.f3899j1) && NullChecker.a(this.f3893d1) && NullChecker.a(getConversationHeadRecommendLayout())) {
            m5537F2();
        }
        if (currentSortType == 0) {
            m5437B2(true);
        } else {
            f3859u1.onNext(roj0.a);
        }
    }

    /* JADX INFO: renamed from: U1 */
    public final /* synthetic */ void m5553U1(Map map) {
        this.f3906p0.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: V1 */
    public final /* synthetic */ void m5554V1(String str) {
        this.f3863E0.m5655I0(str);
        OnlineMatchManager.z().A.onNext("");
    }

    /* JADX INFO: renamed from: W1 */
    public final /* synthetic */ void m5555W1(Boolean bool) {
        this.f3890a1 = bool.booleanValue();
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m5556X1(UserPrivilege userPrivilege) {
        boolean zS3 = xma.S3(SummarizedPrivilegesId.get("seeWhoLikedMe"));
        Boolean bool = this.f3900k0;
        if (bool == null || bool.booleanValue() != zS3) {
            this.f3900k0 = Boolean.valueOf(zS3);
            CoreModule.c.K0.x3().onNext(Optional.of(roj0.a));
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ Boolean m5557Y1(TabName tabName) {
        boolean z = false;
        if (tabName == TabName.Msg && !sqb0.O().V(false, true) && sqb0.O().H() && !fpb0.d() && !this.f3893d1.mo6128e() && !OnlineMatchManager.z().L() && !sqb0.O().Y()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m5558Z1(TabName tabName) {
        fpb0.e(m5508l1(), false, (OnlineMatchPushUser) null);
        sqb0.O().w0();
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m5559a2() {
        this.f3863E0.m5653G0(this.f3899j1.f3478c);
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m5560b2(Integer num) {
        VLinear vLinear = this.f3863E0;
        if (vLinear == null || !xdl0.O0(vLinear)) {
            return;
        }
        this.f3863E0.m5652E0(this.f3893d1.getInitHeight());
        if (upa.G0()) {
            m5537F2();
        }
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m5561c2(u26 u26Var) {
        if (u26Var.f20965c.booleanValue()) {
            this.f3863E0.m5654H0();
            return;
        }
        if (NullChecker.a(u26Var.f20964b) && NotificationCheckerCommon.m9539a() != NotificationCheckerCommon.State.opened && !mqi0.m18535D(((Long) CoreModule.c.e0.q5.get()).longValue())) {
            this.f3863E0.m5660N0(u26Var.f20964b);
            return;
        }
        if (u26Var.f20963a.booleanValue()) {
            this.f3863E0.m5656J0();
            return;
        }
        boolean zM5590u2 = m5590u2(u26Var.f20966d.intValue());
        ConversationsListHeadView conversationsListHeadView = this.f3863E0;
        if (zM5590u2) {
            conversationsListHeadView.m5659M0(this.f3906p0, u26Var.f20966d.intValue());
        } else {
            conversationsListHeadView.m5658L0(ConversationsListHeadView.TipType.NONE);
        }
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m5562d2(roj0 roj0Var) {
        getFeedUserStateCounter();
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m5563e2(List list, d30 d30Var, d30 d30Var2) {
        this.f3906p0.m5619L(list, true, -1);
        if (NullChecker.a(d30Var)) {
            d30Var.call();
        }
        if (TextUtils.isEmpty(this.f3895f1)) {
            return;
        }
        m5595x1(this.f3895f1, d30Var, d30Var2);
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m5564f2(String str, final d30 d30Var, final d30 d30Var2) {
        final List arrayList = (List) CoreModule.c.f0.af(str).a;
        if (!NullChecker.a(arrayList)) {
            arrayList = new ArrayList();
        }
        e51.G(new Runnable() { // from class: l.np6
            @Override // java.lang.Runnable
            public final void run() {
                this.f17592a.m5563e2(arrayList, d30Var, d30Var2);
            }
        });
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m5565g2(roj0 roj0Var) {
        CoreModule.Q().m9019M6().m12091j(m5508l1());
    }

    public ConversationHeadRecommendLayout getConversationHeadRecommendLayout() {
        return this.f3863E0.getConversationHeadRecommendLayout();
    }

    public C0294e getConversationsAdapter() {
        return this.f3906p0;
    }

    public c<List<Conversation>> getLimitedTrialSeeConversations() {
        return !ogl0.X() ? c.just(new ArrayList()) : CoreModule.k.m.o0().m();
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m5566h2(com.p1.mobile.android.app.c cVar) {
        if (cVar == com.p1.mobile.android.app.c.i) {
            CoreModule.Q().m9019M6().m12091j(m5508l1());
        }
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m5567i2(View view) {
        zvf0.u("e_message_set_receive_verified", "p_messages_view", new j760[]{j760.a("switch_type", CoreModule.c.e0.g8() ? "open" : "close")});
        new FilterVerificationUserMsgDlg(m5508l1(), FilterVerificationUserMsgDlg.FilterFrom.CONV_LIST).show();
    }

    /* JADX INFO: renamed from: j2 */
    public final /* synthetic */ void m5568j2(j760 j760Var) {
        if (((User) j760Var.a).isOpenFilterVeriMsg() && NullChecker.a(j760Var.b) && NullChecker.a(((VerificationCenter) j760Var.b).picVerificationInfo) && TEnum.equals(((VerificationCenter) j760Var.b).picVerificationInfo.status, "verified")) {
            this.f3863E0.f3968z.setImageResource(x2c0.H5);
        } else {
            this.f3863E0.f3968z.setImageResource(x2c0.G5);
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final void m5569k1(View view) {
        kq6.a(this, view);
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m5570k2(j760 j760Var) {
        m5592v2();
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ c m5571l2() {
        return mkd0.r(getLimitedTrialSeeConversations(), CoreModule.c.B2.o3().distinctUntilChanged(), new x9j() { // from class: l.dp6
            public final Object call(Object obj, Object obj2) {
                return j760.a((List) obj, (String) obj2);
            }
        }).observeOn(Schedulers.io()).map(new w9j() { // from class: l.ep6
            public final Object call(Object obj) {
                return ConversationsList.m5526z0((j760) obj);
            }
        }).observeOn(jo0.a());
    }

    /* JADX INFO: renamed from: m1 */
    public final c<List<Conversation>> m5572m1() {
        return this.f3897h1 ? CoreModule.c.f0.rn() : CoreModule.c.f0.gf();
    }

    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m5573m2(j760 j760Var) {
        List list = (List) j760Var.a;
        String str = (String) j760Var.b;
        if (vwb.J(list)) {
            return;
        }
        boolean z = ((long) list.size()) > emr.INSTANCE.d();
        if (!"expired".equals(str) && z && ("trialEnd".equals(str) || "waiting".equals(str))) {
            this.f3889Z0.clear();
            this.f3889Z0.addAll(list);
            CoreModule.c.f0.qq(this.f3889Z0.get(0).latestTime);
        } else {
            this.f3889Z0.clear();
            CoreModule.c.f0.qq(-1.0d);
        }
        m5592v2();
    }

    /* JADX INFO: renamed from: n1 */
    public final void m5574n1() {
        if (this.f3902l1) {
            return;
        }
        this.f3902l1 = true;
        m5508l1().duringCreated(mkd0.w(f3859u1, this.f3874P0, this.f3875Q0, this.f3876R0, this.f3878S0, this.f3880T0, this.f3884V0, this.f3882U0, new daj() { // from class: l.eo6
            /* JADX INFO: renamed from: a */
            public final Object m14008a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
                return vwb.Z(vwb.Z((q860) obj2, (List) obj3, (List) obj4, (List) obj5), (List) obj6, (List) obj7, (List) obj8);
            }
        })).onBackpressureDrop(new e30() { // from class: l.fo6
            public final void call(Object obj) {
                this.f13113a.m5541I1((knb0) obj);
            }
        }).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.go6
            public final void call(Object obj) {
                this.f13652a.m5542J1((knb0) obj);
            }
        }, new e30() { // from class: l.ho6
            public final void call(Object obj) {
                ConversationsList.m5475U0((Throwable) obj);
            }
        }));
        c cVarVn = CoreModule.c.f0.vn();
        a<q860<Conversation>> aVar = this.f3874P0;
        Objects.requireNonNull(aVar);
        cVarVn.subscribe(new io6(aVar));
        c cVarTn = CoreModule.c.f0.tn();
        a<List<Conversation>> aVar2 = this.f3875Q0;
        Objects.requireNonNull(aVar2);
        cVarTn.subscribe(new v76(aVar2));
        c cVarYf = CoreModule.c.f0.yf();
        a<List<Conversation>> aVar3 = this.f3876R0;
        Objects.requireNonNull(aVar3);
        cVarYf.subscribe(new v76(aVar3));
        c cVarNg = CoreModule.c.f0.Ng();
        a<List<Conversation>> aVar4 = this.f3878S0;
        Objects.requireNonNull(aVar4);
        cVarNg.subscribe(new v76(aVar4));
        c cVarEq = CoreModule.c.f0.eq();
        a<List<Conversation>> aVar5 = this.f3880T0;
        Objects.requireNonNull(aVar5);
        cVarEq.subscribe(new v76(aVar5));
        c cVarSh = CoreModule.c.f0.sh();
        a<List<Conversation>> aVar6 = this.f3882U0;
        Objects.requireNonNull(aVar6);
        cVarSh.subscribe(new v76(aVar6));
    }

    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m5575n2(j760 j760Var) {
        int currentSortType = this.f3863E0.getCurrentSortType();
        if (NullChecker.a(this.f3863E0)) {
            if (currentSortType == 9 && NullChecker.a(((q860) j760Var.a).f19068a)) {
                this.f3888Y0 = ((q860) j760Var.a).f19068a;
            } else if (currentSortType == 10 && NullChecker.a(((q860) j760Var.b).f19068a)) {
                this.f3888Y0 = ((q860) j760Var.b).f19068a;
            }
            m5437B2(true);
        }
    }

    /* JADX INFO: renamed from: o1 */
    public final void m5576o1() {
        m5508l1().duringCreated(mkd0.s(f3858t1, f3857s1, this.f3873O0.distinctUntilChanged(), new y9j() { // from class: l.ro6
            /* JADX INFO: renamed from: a */
            public final Object m21759a(Object obj, Object obj2, Object obj3) {
                return j760.a((List) obj2, (Integer) obj3);
            }
        })).onBackpressureDrop(new e30() { // from class: l.so6
            public final void call(Object obj) {
                this.f20399a.m5543K1((j760) obj);
            }
        }).observeOn(jo0.a()).subscribe(mkd0.G(new e30() { // from class: l.to6
            public final void call(Object obj) {
                this.f20788a.m5544L1((j760) obj);
            }
        }));
        if (this.f3897h1) {
            m5508l1().duringCreated(CoreModule.c.f0.rn()).subscribe(mkd0.G(new e30() { // from class: l.uo6
                public final void call(Object obj) {
                    ConversationsList.f3857s1.onNext((List) obj);
                }
            }));
        } else {
            m5508l1().duringCreated(f3861w1.switchMap(new w9j() { // from class: l.vo6
                public final Object call(Object obj) {
                    return CoreModule.c.f0.jn(false);
                }
            })).subscribe(mkd0.G(new e30() { // from class: l.wo6
                public final void call(Object obj) {
                    ConversationsList.f3857s1.onNext((List) obj);
                }
            }));
        }
        c<Integer> totalLiker = getTotalLiker();
        final a<Integer> aVar = this.f3873O0;
        Objects.requireNonNull(aVar);
        totalLiker.subscribe(new e30() { // from class: l.xo6
            public final void call(Object obj) {
                aVar.onNext((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m5577o2(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        if (NullChecker.a(this.f3893d1)) {
            this.f3893d1.mo6130g(i4, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m5569k1(this);
        this.f3899j1 = this.f3885W;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f3908q1 = MotionEvent.obtain(motionEvent).getX();
        } else if (action == 2 && Math.abs(motionEvent.getX() - this.f3908q1) > this.f3907p1) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Type inference failed for: r5v3, types: [android.widget.ListAdapter, com.p1.mobile.putong.core.newui.messages.ConversationsList$e] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: p1 */
    public void m5578p1(boolean z) {
        this.f3897h1 = z;
        this.f3883V.setCrashLogFlag("ConversationsList");
        this.f3863E0 = (ConversationsListHeadView) m5508l1().inflater().inflate(f6c0.ge, (ViewGroup) null, false);
        if (!z) {
            getConversationHeadRecommendLayout().m4858V();
        }
        this.f3883V.addHeaderView(this.f3863E0, null, true);
        this.f3883V.setHeaderDividersEnabled(false);
        ?? c0294e = new C0294e();
        this.f3906p0 = c0294e;
        this.f3883V.setAdapter((ListAdapter) c0294e);
        this.f3883V.setRecyclerListener(this.f3906p0);
        this.f3883V.addFooterView(new View(m5508l1()));
        this.f3883V.setNestedScrollingEnabled(true);
        if (upa.e3()) {
            this.f3881U.setClipChildren(false);
            this.f3883V.setClipChildren(false);
        }
        this.f3877S.setOnRefreshListener(this);
        this.f3877S.setColorSchemeResources(new int[]{w0c0.N1, w0c0.K1, w0c0.L1, w0c0.M1});
        this.f3907p1 = ViewConfiguration.get(m5508l1()).getScaledTouchSlop();
        m5584r2();
        if (wf6.m24193e()) {
            this.f3883V.setOnItemClickListener(new C0290a());
            this.f3883V.setOnItemLongClickListener(new C0291b());
        }
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m5579p2(Notification notification) {
        this.f3877S.setRefreshing(false);
        if (notification.j()) {
            yij0.m25382D(notification.e());
        }
    }

    /* JADX INFO: renamed from: q */
    public void m5580q() {
        if (this.f3872N0) {
            CoreModule.c.f0.fn((Links) null).materialize().first().subscribe(mkd0.G(new e30() { // from class: l.sn6
                public final void call(Object obj) {
                    this.f20374a.m5579p2((Notification) obj);
                }
            }));
        } else {
            CoreModule.c.f0.Fo().materialize().first().subscribe(mkd0.G(new e30() { // from class: l.do6
                public final void call(Object obj) {
                    this.f11925a.m5582q2((Notification) obj);
                }
            }));
        }
        CoreModule.c.K0.x3().onNext(Optional.of(roj0.a));
    }

    /* JADX INFO: renamed from: q1 */
    public final String m5581q1(boolean z) {
        LinkedHashMap<String, UserLiveLabel> linkedHashMapM5583r1 = m5583r1(z);
        if (linkedHashMapM5583r1 == null || linkedHashMapM5583r1.isEmpty()) {
            return null;
        }
        return linkedHashMapM5583r1.entrySet().iterator().next().getValue().userId;
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m5582q2(Notification notification) {
        this.f3877S.setRefreshing(false);
        if (notification.j()) {
            yij0.m25382D(notification.e());
        }
    }

    /* JADX INFO: renamed from: r1 */
    public final LinkedHashMap<String, UserLiveLabel> m5583r1(boolean z) {
        return z ? (LinkedHashMap) CoreModule.c.f0.B2.e() : (LinkedHashMap) CoreModule.c.f0.C2.e();
    }

    /* JADX INFO: renamed from: r2 */
    public void m5584r2() {
        this.f3883V.setOverScrollListener(new VList.a() { // from class: l.hn6
            /* JADX INFO: renamed from: a */
            public final void m15883a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
                this.f14180a.m5577o2(i, i2, i3, i4, i5, i6, i7, i8, z);
            }
        });
        this.f3883V.setOnScrollListener(new C0292c());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v26, types: [android.view.View, com.p1.mobile.putong.core.newui.messages.ConversationHeadRecommendLayout] */
    /* JADX INFO: renamed from: s1 */
    public void m5585s1(ConversationListFrag conversationListFrag) {
        FrameLayout.LayoutParams layoutParams;
        this.f3898i1 = conversationListFrag;
        if (!isInEditMode()) {
            if (u59.E()) {
                if (u59.E()) {
                    this.f3893d1 = new WengWengHeaderView(m5508l1());
                    layoutParams = new FrameLayout.LayoutParams(-1, 0);
                } else if (ogl0.P()) {
                    this.f3893d1 = new NewQuickChatAudioHeader(m5508l1());
                    layoutParams = new FrameLayout.LayoutParams(-1, 0);
                } else {
                    this.f3893d1 = new QuickChatHeaderView(m5508l1());
                    layoutParams = new FrameLayout.LayoutParams(-1, t100.e);
                    QuickChatHeaderBaseView quickChatHeaderBaseView = this.f3893d1;
                    int i = t100.j;
                    quickChatHeaderBaseView.setPadding(i, 0, i, 0);
                    this.f3893d1.setBackgroundColor(Color.parseColor("#ffffff"));
                }
                this.f3879T.addView(this.f3893d1, layoutParams);
                this.f3877S.setEnabled(false);
                this.f3893d1.setAct(m5508l1());
                this.f3893d1.mo6127d(this);
                this.f3879T.setHeadView(this.f3893d1);
                this.f3879T.setConversationsList(this);
                this.f3863E0.m5652E0(this.f3893d1.getInitHeight());
                boolean zG0 = upa.G0();
                ConversationFilterLayout conversationFilterLayout = this.f3899j1;
                if (zG0) {
                    xdl0.M(conversationFilterLayout, true);
                    this.f3899j1.m4789D(this, new Runnable() { // from class: l.dm6
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f11898a.m5588t2();
                        }
                    }, new Runnable() { // from class: l.pm6
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f18785a.m5559a2();
                        }
                    });
                    m5537F2();
                } else {
                    xdl0.M(conversationFilterLayout, false);
                }
                this.f3893d1.setChangeHeightListrener(new e30() { // from class: l.tm6
                    public final void call(Object obj) {
                        this.f20769a.m5560b2((Integer) obj);
                    }
                });
            }
            this.f3863E0.init();
            this.f3863E0.setFilterPopShow(new Runnable() { // from class: l.um6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f21244a.m5574n1();
                }
            });
            if (!this.f3897h1 && conversationListFrag != null) {
                conversationListFrag.m5206j5().m21081a(this.f3863E0.f3960r);
            }
            if (upa.a2()) {
                m5508l1().duringCreated(CoreModule.c.f0.Fq()).subscribe(mkd0.G(new e30() { // from class: l.vm6
                    public final void call(Object obj) {
                        ConversationsList.f3860v1.onNext(roj0.a);
                    }
                }));
            }
            xdl0.M(this.f3863E0.f3955m, true);
            ?? conversationHeadRecommendLayout = getConversationHeadRecommendLayout();
            xdl0.M((View) conversationHeadRecommendLayout, true);
            conversationHeadRecommendLayout.m4871k0(null);
            e51.H(m5508l1(), new Runnable() { // from class: l.xm6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22647a.m5550R1();
                }
            }, 1000L);
            m5596x2();
            m5508l1().duringCreated(new v9j() { // from class: l.ym6
                public final Object call() {
                    return this.f23142a.m5551S1();
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.zm6
                public final void call(Object obj) {
                    this.f23734a.m5552T1((roj0) obj);
                }
            }));
            m5591v1();
            m5508l1().duringCreated(CoreModule.c.e0.N7()).subscribe(mkd0.G(new e30() { // from class: l.an6
                public final void call(Object obj) {
                    this.f9583a.m5553U1((Map) obj);
                }
            }));
        }
        if (ke50.d()) {
            m5508l1().duringCreated(OnlineMatchManager.z().A).filter(new w9j() { // from class: l.bn6
                public final Object call(Object obj) {
                    return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
                }
            }).subscribe(mkd0.H(new e30() { // from class: l.em6
                public final void call(Object obj) {
                    this.f12601a.m5554V1((String) obj);
                }
            }, new e30() { // from class: l.fm6
                public final void call(Object obj) {
                    ConversationsList.m5472T((Throwable) obj);
                }
            }));
            if (!((Boolean) OnlineMatchManager.z().l.get()).booleanValue()) {
                m5508l1().duringCreated(this.f3874P0.observeOn(Schedulers.io()).filter(new w9j() { // from class: l.gm6
                    public final Object call(Object obj) {
                        return Boolean.valueOf(!((Boolean) OnlineMatchManager.z().l.get()).booleanValue());
                    }
                }).take(1).onBackpressureDrop().map(new w9j() { // from class: l.hm6
                    public final Object call(Object obj) {
                        return ConversationsList.m5483Y0((q860) obj);
                    }
                }).filter(new w9j() { // from class: l.im6
                    public final Object call(Object obj) {
                        return ConversationsList.m5524y0((Boolean) obj);
                    }
                }).take(1).observeOn(jo0.a())).subscribe(mkd0.H(new e30() { // from class: l.jm6
                    public final void call(Object obj) {
                        ConversationsList.m5522x0((Boolean) obj);
                    }
                }, new e30() { // from class: l.km6
                    public final void call(Object obj) {
                        ConversationsList.m5481X0((Throwable) obj);
                    }
                }));
            }
        }
        m5508l1().duringCreated(CoreModule.c.f0.xe().throttleFirst(5L, TimeUnit.MINUTES)).subscribe(mkd0.G(new e30() { // from class: l.mm6
            public final void call(Object obj) {
                CoreModule.c.f0.jo();
            }
        }));
        m5508l1().duringCreated(g050.m14714c()).distinctUntilChanged().subscribe(mkd0.G(new e30() { // from class: l.nm6
            public final void call(Object obj) {
                this.f17576a.m5555W1((Boolean) obj);
            }
        }));
        m5508l1().duringCreated(new v9j() { // from class: l.om6
            public final Object call() {
                return CoreModule.c.C0.u3(SummarizedPrivilegesId.get("seeWhoLikedMe"));
            }
        }).subscribe(mkd0.G(new e30() { // from class: l.qm6
            public final void call(Object obj) {
                this.f19385a.m5556X1((UserPrivilege) obj);
            }
        }));
        if (ke50.e()) {
            m5508l1().duringCreated(m5508l1().m3895i7()).filter(new w9j() { // from class: l.rm6
                public final Object call(Object obj) {
                    return this.f19905a.m5557Y1((TabName) obj);
                }
            }).subscribe(mkd0.G(new e30() { // from class: l.sm6
                public final void call(Object obj) {
                    this.f20361a.m5558Z1((TabName) obj);
                }
            }));
        }
        m5587t1();
        m5528A1();
        m5589u1();
        m5593w1();
        m5530C1();
        m5529B1();
        m5599z1();
    }

    /* JADX INFO: renamed from: s2 */
    public final void m5586s2(long j, long j2, String str) {
        long j3 = j2 - j;
        if (j3 < 32) {
            return;
        }
        CrashHelper.c(new IllegalStateException("ConversationsList processLiveState IllegalStateException ", new IllegalStateException("ConversationsList processLiveState tag " + str + " during " + j3)));
    }

    /* JADX INFO: renamed from: t1 */
    public final void m5587t1() {
        this.f3898i1.duringCreated(c.combineLatest(getPicCerGuideObs(), getWechatNotifyObs(), getSortInvalidConvObs(), getWeakenedTipsObs(), new z9j() { // from class: l.dn6
            /* JADX INFO: renamed from: b */
            public final Object m13423b(Object obj, Object obj2, Object obj3, Object obj4) {
                return new u26((Boolean) obj, (WechatNotifySetting) obj2, (Boolean) obj3, (Integer) obj4);
            }
        })).subscribe(mkd0.G(new e30() { // from class: l.en6
            public final void call(Object obj) {
                this.f12618a.m5561c2((u26) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t2 */
    public void m5588t2() {
        VList vList = this.f3883V;
        if (vList == null) {
            return;
        }
        vList.setSelection(0);
        m5537F2();
    }

    /* JADX INFO: renamed from: u1 */
    public final void m5589u1() {
        boolean zM = r65.m();
        ConversationsListHeadView conversationsListHeadView = this.f3863E0;
        if (zM) {
            conversationsListHeadView.f3959q.m4758l(this.f3898i1, "", 1);
        } else {
            conversationsListHeadView.f3959q.m4754h();
        }
    }

    /* JADX INFO: renamed from: u2 */
    public final boolean m5590u2(int i) {
        MessageFilterConfig messageFilterConfigY0 = upa.y0();
        if (messageFilterConfigY0 != null && i > 1) {
            long jM18550o = mqi0.m18550o();
            boolean z = jM18550o > ((Long) CoreModule.c.e0.F5.get()).longValue();
            boolean zBooleanValue = ((Boolean) CoreModule.c.f0.v0.get()).booleanValue();
            boolean zBooleanValue2 = ((Boolean) CoreModule.c.f0.cg().get()).booleanValue();
            if (z && zBooleanValue && !zBooleanValue2) {
                if (this.f3863E0.f3943O == null) {
                    if (jM18550o - ((Long) CoreModule.c.e0.D5.get()).longValue() <= TimeUnit.DAYS.toMillis(messageFilterConfigY0.shownDayLimit)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v1 */
    public final void m5591v1() {
        m5576o1();
        m5532D1();
        m5534E1();
        m5597y1();
        if (CoreModule.N().fs()) {
            PutongAct putongActM5508l1 = m5508l1();
            i iVar = CoreModule.c.q1;
            putongActM5508l1.duringCreated(i.S).subscribe(mkd0.G(new e30() { // from class: l.yn6
                public final void call(Object obj) {
                    this.f23154a.m5562d2((roj0) obj);
                }
            }));
            this.f3898i1.lifecycle().subscribe(mkd0.G(new e30() { // from class: l.zn6
                public final void call(Object obj) {
                    ConversationsList.m5511o0((com.p1.mobile.android.app.c) obj);
                }
            }));
        }
        m5508l1().lifecycle().filter(new w9j() { // from class: l.ao6
            public final Object call(Object obj) {
                return Boolean.valueOf(((com.p1.mobile.android.app.c) obj) == com.p1.mobile.android.app.c.i);
            }
        }).subscribe(mkd0.H(new e30() { // from class: l.bo6
            public final void call(Object obj) {
                ConversationsList.f3859u1.onNext(roj0.a);
            }
        }, new e30() { // from class: l.co6
            public final void call(Object obj) {
                ConversationsList.m5517u0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v2 */
    public void m5592v2() {
        if (NullChecker.a(this.f3906p0)) {
            this.f3906p0.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: w1 */
    public final void m5593w1() {
        CoreModule.c.f0.lp();
        CoreModule.c.f0.pp();
    }

    /* JADX INFO: renamed from: w2 */
    public void m5594w2() {
        if (NullChecker.a(this.f3906p0)) {
            this.f3906p0.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void m5595x1(final String str, final d30 d30Var, final d30 d30Var2) {
        this.f3901k1 = d30Var2;
        this.f3894e1 = false;
        e51.y(new Runnable() { // from class: l.mp6
            @Override // java.lang.Runnable
            public final void run() {
                this.f17009a.m5564f2(str, d30Var, d30Var2);
            }
        });
    }

    /* JADX INFO: renamed from: x2 */
    public final void m5596x2() {
        if (upa.a2()) {
            m5508l1().duringCreated(m5538G1() ? CoreModule.c.f0.Fq() : CoreModule.c.f0.zn()).subscribe(mkd0.G(new e30() { // from class: l.mn6
                public final void call(Object obj) {
                    ConversationsList.m5434A2();
                }
            }));
        }
    }

    /* JADX INFO: renamed from: y1 */
    public final void m5597y1() {
        m5508l1().duringCreated(CoreModule.Q().m9019M6().m12101t()).observeOn(Schedulers.io()).subscribe(mkd0.H(new e30() { // from class: l.fp6
            public final void call(Object obj) {
                ConversationsList.m5434A2();
            }
        }, new e30() { // from class: l.gp6
            public final void call(Object obj) {
                ConversationsList.m5454K((Throwable) obj);
            }
        }));
        m5508l1().duringCreated(CoreModule.Q().m9019M6().m12087f()).subscribe(mkd0.H(new e30() { // from class: l.hp6
            public final void call(Object obj) {
                this.f14205a.m5565g2((roj0) obj);
            }
        }, new e30() { // from class: l.ip6
            public final void call(Object obj) {
                ConversationsList.m5500h0((Throwable) obj);
            }
        }));
        this.f3898i1.lifecycle().subscribe(mkd0.G(new e30() { // from class: l.jp6
            public final void call(Object obj) {
                this.f15253a.m5566h2((com.p1.mobile.android.app.c) obj);
            }
        }));
        CoreModule.Q().m9019M6().m12091j(m5508l1());
    }

    /* JADX WARN: Code duplicated, block: B:104:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0073  */
    /* JADX WARN: Code duplicated, block: B:32:0x007d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0088  */
    /* JADX WARN: Code duplicated, block: B:37:0x0098  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ad A[LOOP:5: B:35:0x008e->B:40:0x00ad, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:45:0x00bf  */
    /* JADX INFO: renamed from: y2 */
    public final List<Conversation> m5598y2(List<Conversation> list, boolean z) {
        LinkedHashMap linkedHashMapZg;
        String strM5581q1;
        long j;
        int i;
        Conversation conversation;
        List<Conversation> list2 = list;
        if (upa.a2() && !vwb.J(list2) && !this.f3877S.i() && (linkedHashMapZg = CoreModule.c.f0.zg(z)) != null && !linkedHashMapZg.isEmpty()) {
            long jM18550o = mqi0.m18550o();
            HashSet hashSetVg = CoreModule.c.f0.vg(z);
            int iMin = Math.min(list2.size(), 40);
            int i2 = z ? 1 : 2;
            if (!linkedHashMapZg.isEmpty()) {
                int i3 = 0;
                while (true) {
                    if (i3 < Math.min(3, iMin)) {
                        if (!m5536F1(list2.get(i3), linkedHashMapZg)) {
                            i3++;
                        }
                    } else if (list2.size() > 3) {
                        strM5581q1 = m5581q1(z);
                        if (TextUtils.isEmpty(strM5581q1)) {
                            m5586s2(jM18550o, mqi0.m18550o(), "1");
                            return list2;
                        }
                        j = jM18550o;
                        i = 0;
                        while (true) {
                            if (i < Math.min(40, list2.size())) {
                                conversation = null;
                                break;
                            }
                            if (TextUtils.equals(((DbObject) list2.get(i)).id, strM5581q1)) {
                                conversation = list2.get(i);
                                break;
                            }
                            i++;
                        }
                        if (conversation == null) {
                            m5586s2(j, mqi0.m18550o(), "2");
                            return list2;
                        }
                        fel felVar = new fel(list2, 40);
                        felVar.remove(conversation);
                        felVar.add(i2, conversation);
                        m5586s2(j, mqi0.m18549n(), "insert");
                        list2 = felVar;
                    }
                    j = jM18550o;
                }
            } else if (list2.size() > 3) {
                strM5581q1 = m5581q1(z);
                if (TextUtils.isEmpty(strM5581q1)) {
                    m5586s2(jM18550o, mqi0.m18550o(), "1");
                    return list2;
                }
                j = jM18550o;
                i = 0;
                while (true) {
                    if (i < Math.min(40, list2.size())) {
                        conversation = null;
                        break;
                    }
                    if (TextUtils.equals(((DbObject) list2.get(i)).id, strM5581q1)) {
                        conversation = list2.get(i);
                        break;
                    }
                    i++;
                }
                if (conversation == null) {
                    m5586s2(j, mqi0.m18550o(), "2");
                    return list2;
                }
                fel felVar2 = new fel(list2, 40);
                felVar2.remove(conversation);
                felVar2.add(i2, conversation);
                m5586s2(j, mqi0.m18549n(), "insert");
                list2 = felVar2;
            } else {
                j = jM18550o;
            }
            if (!hashSetVg.isEmpty()) {
                m5586s2(j, mqi0.m18550o(), "3");
                return list2;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (!linkedHashMapZg.isEmpty()) {
                int i4 = 6;
                for (int i5 = 0; i5 < iMin; i5++) {
                    Conversation conversation2 = list2.get(i5);
                    if (m5536F1(conversation2, linkedHashMapZg)) {
                        if (conversation2.localHasMessage) {
                            arrayList2.add(conversation2);
                        } else {
                            arrayList.add(conversation2);
                        }
                    }
                    i4--;
                    if (i4 == 0 || i5 == iMin - 1) {
                        Iterator it = arrayList2.iterator();
                        int i6 = 2;
                        while (it.hasNext()) {
                            hashSetVg.add(((DbObject) ((Conversation) it.next())).id);
                            i6--;
                            if (i6 == 0) {
                                break;
                            }
                        }
                        if (i6 > 0) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                hashSetVg.add(((DbObject) ((Conversation) it2.next())).id);
                                i6--;
                                if (i6 == 0) {
                                    break;
                                }
                            }
                        }
                        arrayList2.clear();
                        arrayList.clear();
                        i4 = 6;
                    }
                }
            }
            if (!vwb.J(hashSetVg)) {
                int i7 = 0;
                for (int i8 = 0; i8 < iMin; i8++) {
                    Conversation conversation3 = list2.get(i8);
                    i7 = hashSetVg.contains(((DbObject) conversation3).id) ? i7 + 1 : 0;
                    if (i7 == 3) {
                        hashSetVg.remove(((DbObject) conversation3).id);
                        i7 = 0;
                    }
                }
            }
            m5586s2(j, mqi0.m18550o(), "4");
        }
        return list2;
    }

    /* JADX INFO: renamed from: z1 */
    public final void m5599z1() {
        if (CoreModule.Q().m9019M6().m12084c()) {
            m5508l1().duringCreated(CoreModule.Q().m9019M6().m12094m()).observeOn(jo0.a()).subscribe(mkd0.H(new e30() { // from class: l.wn6
                public final void call(Object obj) {
                    ConversationsList.m5434A2();
                }
            }, new e30() { // from class: l.xn6
                public final void call(Object obj) {
                    ConversationsList.m5498g0((Throwable) obj);
                }
            }));
        }
    }

    public ConversationsList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3900k0 = null;
        this.f3864F0 = 23;
        this.f3865G0 = 39;
        this.f3866H0 = 40;
        this.f3867I0 = 41;
        this.f3868J0 = 42;
        this.f3869K0 = 43;
        this.f3870L0 = 45;
        this.f3871M0 = a.c(roj0.a);
        this.f3872N0 = false;
        this.f3873O0 = a.c(0);
        this.f3874P0 = a.c(q860.m20833b());
        this.f3875Q0 = a.c(new ArrayList());
        this.f3876R0 = a.c(new ArrayList());
        this.f3878S0 = a.c(new ArrayList());
        this.f3880T0 = a.c(new ArrayList());
        this.f3882U0 = a.c(new ArrayList());
        this.f3884V0 = a.c(new ArrayList());
        this.f3886W0 = a.c(q860.m20833b());
        this.f3887X0 = a.c(q860.m20833b());
        this.f3888Y0 = new ArrayList();
        this.f3889Z0 = new ArrayList();
        this.f3891b1 = false;
        this.f3892c1 = false;
        this.f3894e1 = false;
        this.f3895f1 = null;
        this.f3896g1 = false;
        this.f3897h1 = false;
        this.f3902l1 = false;
        this.f3903m1 = 6;
        this.f3904n1 = 40;
        this.f3905o1 = 50;
    }
}
