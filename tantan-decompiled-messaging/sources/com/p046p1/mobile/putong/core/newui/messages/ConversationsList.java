package com.p046p1.mobile.putong.core.newui.messages;

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
import com.clevertap.android.sdk.Constants;
import com.facebook.drawee.view.SimpleDraweeView;
import com.google.common.base.Optional;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p046p1.mobile.android.app.App;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.api.C4740g;
import com.p046p1.mobile.putong.core.api.C4743i;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.data.CertificationNewConfig;
import com.p046p1.mobile.putong.core.data.ChatGroup;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.data.ConversationRefreshIntervalConfig;
import com.p046p1.mobile.putong.core.data.ConversationType;
import com.p046p1.mobile.putong.core.data.CoreFeedStateCounter;
import com.p046p1.mobile.putong.core.data.InsertConversationsList;
import com.p046p1.mobile.putong.core.data.MessageFilterConfig;
import com.p046p1.mobile.putong.core.data.SeeSwitchName;
import com.p046p1.mobile.putong.core.data.SeeTrialStatusType;
import com.p046p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p046p1.mobile.putong.core.data.UserPrivilege;
import com.p046p1.mobile.putong.core.data.VerificationCenter;
import com.p046p1.mobile.putong.core.data.WechatNotifySetting;
import com.p046p1.mobile.putong.core.newui.group.GroupSuggestAct;
import com.p046p1.mobile.putong.core.newui.main.NewMainAct;
import com.p046p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.NewQuickChatAudioHeader;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.PullQuickChatLayout;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderView;
import com.p046p1.mobile.putong.core.newui.messages.anim.view.wengweng.WengWengHeaderView;
import com.p046p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p046p1.mobile.putong.core.newui.messages.business.IntlVisitorConversationView;
import com.p046p1.mobile.putong.core.p053ui.filter.FilterVerificationUserMsgDlg;
import com.p046p1.mobile.putong.core.p053ui.onlinematch.OnlineMatchManager;
import com.p046p1.mobile.putong.data.Links;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.data.UserLiveLabel;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import com.p046p1.mobile.putong.newui.main.base.TabName;
import com.p046p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p046p1.mobile.putong.p049ab.IntlCountryCodeController;
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
import p133rx.C22306c;
import p133rx.Notification;
import p133rx.schedulers.Schedulers;
import p133rx.subjects.C22392a;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VList;
import p147v.VText;
import p149l.cnr;
import p149l.cqp;
import p149l.d30;
import p149l.daj;
import p149l.e30;
import p149l.e51;
import p149l.emr;
import p149l.f6c0;
import p149l.f8c;
import p149l.fap;
import p149l.fel;
import p149l.fpb0;
import p149l.g050;
import p149l.ggi;
import p149l.io6;
import p149l.j760;
import p149l.jjb0;
import p149l.jo0;
import p149l.jx50;
import p149l.ke50;
import p149l.knb0;
import p149l.kq6;
import p149l.mkd0;
import p149l.ml6;
import p149l.mqi0;
import p149l.n3b0;
import p149l.o6j0;
import p149l.ogl0;
import p149l.on6;
import p149l.p36;
import p149l.q860;
import p149l.qib0;
import p149l.qqi0;
import p149l.r65;
import p149l.r6n;
import p149l.rd6;
import p149l.roj0;
import p149l.sqb0;
import p149l.sw6;
import p149l.t100;
import p149l.u26;
import p149l.u4c0;
import p149l.u59;
import p149l.upa;
import p149l.v76;
import p149l.v9j;
import p149l.vwb;
import p149l.w0c0;
import p149l.w9j;
import p149l.wf6;
import p149l.wn90;
import p149l.wp1;
import p149l.x2c0;
import p149l.x9j;
import p149l.xdl0;
import p149l.xma;
import p149l.y19;
import p149l.y9j;
import p149l.yij0;
import p149l.z9j;
import p149l.zo6;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationsList extends SwipeRefreshLayout implements SwipeRefreshLayout.InterfaceC0700j {

    /* JADX INFO: renamed from: r1 */
    public static int f25078r1;

    /* JADX INFO: renamed from: s1 */
    public static C22392a<List<Conversation>> f25079s1 = C22392a.m221513c(new ArrayList());

    /* JADX INFO: renamed from: t1 */
    public static C22392a<roj0> f25080t1;

    /* JADX INFO: renamed from: u1 */
    public static C22392a<roj0> f25081u1;

    /* JADX INFO: renamed from: v1 */
    public static C22392a<roj0> f25082v1;

    /* JADX INFO: renamed from: w1 */
    public static C22392a<roj0> f25083w1;

    /* JADX INFO: renamed from: x1 */
    public static final C8129d f25084x1;

    /* JADX INFO: renamed from: E0 */
    public ConversationsListHeadView f25085E0;

    /* JADX INFO: renamed from: F0 */
    public final int f25086F0;

    /* JADX INFO: renamed from: G0 */
    public final int f25087G0;

    /* JADX INFO: renamed from: H0 */
    public final int f25088H0;

    /* JADX INFO: renamed from: I0 */
    public final int f25089I0;

    /* JADX INFO: renamed from: J0 */
    public final int f25090J0;

    /* JADX INFO: renamed from: K0 */
    public final int f25091K0;

    /* JADX INFO: renamed from: L0 */
    public final int f25092L0;

    /* JADX INFO: renamed from: M0 */
    public C22392a<roj0> f25093M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f25094N0;

    /* JADX INFO: renamed from: O0 */
    public C22392a<Integer> f25095O0;

    /* JADX INFO: renamed from: P0 */
    public C22392a<q860<Conversation>> f25096P0;

    /* JADX INFO: renamed from: Q0 */
    public C22392a<List<Conversation>> f25097Q0;

    /* JADX INFO: renamed from: R0 */
    public C22392a<List<Conversation>> f25098R0;

    /* JADX INFO: renamed from: S */
    public ConversationsList f25099S;

    /* JADX INFO: renamed from: S0 */
    public C22392a<List<Conversation>> f25100S0;

    /* JADX INFO: renamed from: T */
    public PullQuickChatLayout f25101T;

    /* JADX INFO: renamed from: T0 */
    public C22392a<List<Conversation>> f25102T0;

    /* JADX INFO: renamed from: U */
    public FrameLayout f25103U;

    /* JADX INFO: renamed from: U0 */
    public C22392a<List<Conversation>> f25104U0;

    /* JADX INFO: renamed from: V */
    public ConvCellList f25105V;

    /* JADX INFO: renamed from: V0 */
    public C22392a<List<Conversation>> f25106V0;

    /* JADX INFO: renamed from: W */
    public ConversationFilterLayout f25107W;

    /* JADX INFO: renamed from: W0 */
    public C22392a<q860<Conversation>> f25108W0;

    /* JADX INFO: renamed from: X0 */
    public C22392a<q860<Conversation>> f25109X0;

    /* JADX INFO: renamed from: Y0 */
    public List<Conversation> f25110Y0;

    /* JADX INFO: renamed from: Z0 */
    public List<Conversation> f25111Z0;

    /* JADX INFO: renamed from: a1 */
    public boolean f25112a1;

    /* JADX INFO: renamed from: b1 */
    public boolean f25113b1;

    /* JADX INFO: renamed from: c1 */
    public boolean f25114c1;

    /* JADX INFO: renamed from: d1 */
    public QuickChatHeaderBaseView f25115d1;

    /* JADX INFO: renamed from: e1 */
    public boolean f25116e1;

    /* JADX INFO: renamed from: f1 */
    public String f25117f1;

    /* JADX INFO: renamed from: g1 */
    public boolean f25118g1;

    /* JADX INFO: renamed from: h1 */
    public boolean f25119h1;

    /* JADX INFO: renamed from: i1 */
    public ConversationListFrag f25120i1;

    /* JADX INFO: renamed from: j1 */
    public ConversationFilterLayout f25121j1;

    /* JADX INFO: renamed from: k0 */
    public Boolean f25122k0;

    /* JADX INFO: renamed from: k1 */
    public d30 f25123k1;

    /* JADX INFO: renamed from: l1 */
    public boolean f25124l1;

    /* JADX INFO: renamed from: m1 */
    public final int f25125m1;

    /* JADX INFO: renamed from: n1 */
    public final int f25126n1;

    /* JADX INFO: renamed from: o1 */
    public final int f25127o1;

    /* JADX INFO: renamed from: p0 */
    public C8130e f25128p0;

    /* JADX INFO: renamed from: p1 */
    public int f25129p1;

    /* JADX INFO: renamed from: q1 */
    public float f25130q1;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationsList$a */
    public class C8126a implements AdapterView.OnItemClickListener {
        public C8126a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (view instanceof ConversationItemView) {
                ((ConversationItemView) view).f24933t.call();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationsList$b */
    public class C8127b implements AdapterView.OnItemLongClickListener {
        public C8127b() {
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (view instanceof ConversationItemView) {
                return ((ConversationItemView) view).f24934u.call().booleanValue();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationsList$c */
    public class C8128c implements AbsListView.OnScrollListener {
        public C8128c() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            if (absListView.getChildCount() <= 0) {
                return;
            }
            if (upa.m194741d3() || upa.m194637G0()) {
                ConversationsList.this.m41431F2();
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 0) {
                C4740g c4740g = CoreModule.f17545c.f19642f0;
                jx50 jx50Var = c4740g.f19892R;
                jx50Var.f120193a = false;
                jx50Var.m143759e(c4740g.f19895S, false);
                if (NullChecker.m81303a(ConversationsList.this.f25115d1)) {
                    ConversationsList.this.f25115d1.mo41987f();
                }
                ConversationsList.this.f25105V.m40597e();
            } else {
                if (!CoreModule.f17545c.f19642f0.f19892R.f120193a) {
                    ConversationsList.this.f25105V.m40596d();
                }
                CoreModule.f17545c.f19642f0.f19892R.f120193a = true;
            }
            if (i == 1) {
                C4348d.m20896l().m20900k("showNewMatchUserGuidePop");
                C4348d.m20896l().m20900k("newUserShowGuidePop");
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationsList$d */
    public static class C8129d {

        /* JADX INFO: renamed from: a */
        public long f25134a;

        /* JADX INFO: renamed from: b */
        public boolean f25135b;

        /* JADX INFO: renamed from: c */
        public final Runnable f25136c;

        public C8129d() {
            this.f25134a = 0L;
            this.f25135b = false;
            this.f25136c = new Runnable() { // from class: l.pp6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f150628a.m41495c();
                }
            };
        }

        /* JADX INFO: renamed from: b */
        public void m41494b() {
            this.f25134a = 0L;
            e51.m114745J(this.f25136c);
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m41495c() {
            ConversationsList.f25080t1.m132487l(roj0.f160388a);
            this.f25134a = SystemClock.elapsedRealtime();
            this.f25135b = false;
            rd6.m178864C("ConversationList refreshObs onNext(Unit.UNIT)");
        }

        /* JADX INFO: renamed from: d */
        public void m41496d() {
            ConversationRefreshIntervalConfig conversationRefreshIntervalConfigM194787n = upa.m194787n();
            long j = NullChecker.m81303a(conversationRefreshIntervalConfigM194787n) ? conversationRefreshIntervalConfigM194787n.conversationRefreshObsInterval * 1000 : 0;
            if (Math.abs(SystemClock.elapsedRealtime() - this.f25134a) >= j) {
                this.f25136c.run();
            } else {
                if (this.f25135b) {
                    return;
                }
                this.f25135b = true;
                e51.m114743H(App.f15369e, this.f25136c, j);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationsList$e */
    public class C8130e extends wp1<Conversation> implements p36 {

        /* JADX INFO: renamed from: d */
        public C8140a f25138d;

        /* JADX INFO: renamed from: f */
        public Links f25140f;

        /* JADX INFO: renamed from: h */
        public final cnr f25142h;

        /* JADX INFO: renamed from: c */
        public List<Conversation> f25137c = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: e */
        public boolean f25139e = false;

        /* JADX INFO: renamed from: g */
        public boolean f25141g = false;

        /* JADX INFO: renamed from: i */
        public final int f25143i = Color.parseColor("#4c4c4c");

        /* JADX INFO: renamed from: j */
        public final int f25144j = Color.parseColor("#999999");

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationsList$e$a */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AllPairsAct.m40534d2(ConversationsList.this.m41402l1());
                zvf0.m220399u("e_all_match_click", OMSDialogPositon.p_messages_view, vwb.m200311Y(SeeSwitchName.message_tab, "online"));
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationsList$e$b */
        public class b implements View.OnClickListener {
            public b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ConversationsList.this.m41402l1().startActivity(new Intent(ConversationsList.this.m41402l1(), (Class<?>) GroupSuggestAct.class));
                zvf0.m220396r("e_more_groups_click", OMSDialogPositon.p_messages_view);
            }
        }

        public C8130e() {
            this.f25142h = new cnr(ConversationsList.this.f25105V, new e30() { // from class: l.qp6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f155676a.m41497G((Integer) obj);
                }
            }, 4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: G */
        public /* synthetic */ void m41497G(Integer num) {
            if (num.intValue() >= getCount()) {
                return;
            }
            Conversation conversation = (Conversation) getItem(num.intValue());
            if (!(upa.m194706V1() && ml6.m155116a(conversation)) && NullChecker.m81303a(conversation)) {
                User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(conversation.otherUser);
                if (NullChecker.m81303a(userM169430Pa)) {
                    qib0.f154691G.m102379z0(sw6.m186127b(userM169430Pa).profileSmall());
                }
            }
        }

        /* JADX INFO: renamed from: A */
        public int m41502A() {
            return m41504C(null);
        }

        /* JADX INFO: renamed from: B */
        public C8140a m41503B() {
            return this.f25138d;
        }

        /* JADX INFO: renamed from: C */
        public int m41504C(Conversation conversation) {
            int i;
            int i2;
            if (!vwb.m200296J(this.f25137c)) {
                int iM41835k = NullChecker.m81303a(this.f25138d) ? this.f25138d.m41835k() : 0;
                i = iM41835k;
                i2 = -1;
                int i3 = -1;
                while (true) {
                    if (i < getCount()) {
                        if (getItemViewType(i) == 0 || getItemViewType(i) == 16 || getItemViewType(i) == 11 || getItemViewType(i) == 23) {
                            Conversation conversation2 = this.f25137c.get(i - iM41835k);
                            if (NullChecker.m81303a(conversation) && TextUtils.equals(conversation2.f56011id, conversation.f56011id)) {
                                i3 = i;
                            }
                            if ((!conversation2.read.booleanValue() && !conversation2.localEverHasMessage) || ((TextUtils.equals(conversation2.f56011id, "conversation_feed_state") && !conversation2.read.booleanValue()) || ((TextUtils.equals(conversation2.f56011id, "conversation_feed_interaction") && !conversation2.read.booleanValue()) || ((TextUtils.equals(conversation2.f56011id, "conversation_feed_featured") && !conversation2.read.booleanValue()) || conversation2.unreadMessages > 0)))) {
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
        public final boolean m41505D() {
            return vwb.m200296J(this.f25137c);
        }

        /* JADX INFO: renamed from: E */
        public boolean m41506E() {
            return upa.m194637G0() && NullChecker.m81303a(ConversationsList.this.f25121j1) && xdl0.m208349O0(ConversationsList.this.f25121j1) && ConversationsList.this.f25121j1.m40696F() && this.f25141g;
        }

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ void m41507F(View view) {
            if (NullChecker.m81303a(ConversationsList.this.f25121j1)) {
                ConversationsList conversationsList = ConversationsList.this;
                ConversationFilterLayout conversationFilterLayout = conversationsList.f25121j1;
                int currentSortType = conversationsList.f25085E0.getCurrentSortType();
                ConversationsListHeadView conversationsListHeadView = ConversationsList.this.f25085E0;
                conversationFilterLayout.m40713y(currentSortType, conversationsListHeadView.m41555g0(conversationsListHeadView.getCurrentSortType()));
            }
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m41508H(final String str) {
            if (CoreModule.f17545c.f19642f0.f19892R.f120193a) {
                return;
            }
            List<Conversation> list = this.f25137c;
            if (list instanceof ArrayList) {
                int iM200293G = vwb.m200293G(list, new w9j() { // from class: l.tp6
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(str, ((Conversation) obj).f56011id));
                    }
                });
                if (iM200293G >= 0) {
                    this.f25137c.remove(iM200293G);
                }
                ConversationsList.this.m41485v2();
            }
        }

        /* JADX INFO: renamed from: I */
        public final boolean m41509I() {
            return m41505D() || (this.f25137c.size() == 1 && User.isTeamAccount(this.f25137c.get(0).otherUser) && !ConversationsList.this.f25119h1);
        }

        /* JADX INFO: renamed from: J */
        public final boolean m41510J() {
            return m41505D() || (this.f25137c.size() == 1 && User.isTeamAccount(this.f25137c.get(0).otherUser) && !ConversationsList.this.f25119h1);
        }

        /* JADX INFO: renamed from: K */
        public void m41511K(final String str) {
            e51.m114742G(new Runnable() { // from class: l.sp6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f165751a.m41508H(str);
                }
            });
        }

        /* JADX INFO: renamed from: L */
        public void m41512L(List<Conversation> list, boolean z, int i) {
            if (m41506E()) {
                return;
            }
            this.f25141g = false;
            int currentSortType = ConversationsList.this.f25085E0.getCurrentSortType();
            this.f25137c = list;
            this.f25138d = new C8140a(ConversationsList.this, this, i);
            ConversationsList.this.f25093M0.m132487l(roj0.f160388a);
            boolean z2 = (currentSortType == 6 || currentSortType == 7 || currentSortType == 8 || currentSortType == 11) ? false : true;
            this.f25138d.m41841s(z2);
            boolean z3 = ConversationsList.this.f25094N0;
            ConversationsList conversationsList = ConversationsList.this;
            if (z3) {
                conversationsList.f25105V.setFooterDividersEnabled(false);
            } else {
                conversationsList.f25105V.setFooterDividersEnabled(!m41509I());
            }
            if (ConversationsList.this.f25118g1) {
                ConversationsList.f25078r1 = list.size() - 1;
            }
            this.f25142h.m107830f();
            if (!z2 && vwb.m200296J(this.f25137c)) {
                ConversationsList.this.m41425C2();
            }
            notifyDataSetChanged();
            ConversationsList.this.f25085E0.m41557i0(z);
        }

        /* JADX INFO: renamed from: M */
        public void m41513M(@NonNull List<Conversation> list, boolean z) {
            this.f25141g = true;
            if (upa.m194836w3()) {
                this.f25138d.m41842t();
            }
            if (z) {
                this.f25137c.addAll(list);
            } else {
                this.f25137c = new ArrayList(list);
            }
            ConversationsList.this.m41485v2();
        }

        /* JADX INFO: renamed from: N */
        public final void m41514N(View view) {
            ConversationsList.this.f25105V.setFooterDividersEnabled(false);
            int currentSortType = ConversationsList.this.f25085E0.getCurrentSortType();
            String string = ConversationsList.this.getContext().getResources().getString(R$string.f19050x1);
            ((VImage) view.findViewById(u4c0.f174076V4)).setImageResource(x2c0.f190099e6);
            if (currentSortType == 7) {
                string = ConversationsList.this.getContext().getResources().getString(R$string.f17736Fj);
            } else if (currentSortType == 8) {
                string = ConversationsList.this.getContext().getResources().getString(R$string.f17766Gj);
            } else if (currentSortType == 11) {
                string = "当前没有异常的会话";
            }
            VText vText = (VText) view.findViewById(u4c0.f174108X4);
            if (NullChecker.m81303a(vText)) {
                vText.setText(string);
            }
        }

        /* JADX INFO: renamed from: O */
        public final void m41515O(View view) {
            ConversationsList.this.f25105V.setFooterDividersEnabled(false);
            int currentSortType = ConversationsList.this.f25085E0.getCurrentSortType();
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(u4c0.f174528w3);
            VText vText = (VText) view.findViewById(u4c0.f174579z3);
            VText vText2 = (VText) view.findViewById(u4c0.f173904L0);
            if (currentSortType == 2) {
                qib0.f154691G.m102354Y0(simpleDraweeView, x2c0.f190745ye);
                vText.setText("好友均未在线");
                vText2.setVisibility(0);
                vText2.setText("查看全部配对");
                xdl0.m208329E0(vText2, new a());
                o6j0.m162865i("e_all_match_click", OMSDialogPositon.p_messages_view);
                return;
            }
            if (currentSortType == 6) {
                qib0.f154691G.m102354Y0(simpleDraweeView, x2c0.f190713xe);
                vText.setText("你还没有加入或创建群聊");
                vText2.setVisibility(0);
                vText2.setText("发现更多群聊");
                xdl0.m208329E0(vText2, new b());
                o6j0.m162865i("e_more_groups_click", OMSDialogPositon.p_messages_view);
            }
        }

        /* JADX INFO: renamed from: P */
        public final void m41516P(View view) {
            VImage vImage = (VImage) view.findViewById(u4c0.f174076V4);
            VText vText = (VText) view.findViewById(u4c0.f174124Y4);
            VText vText2 = (VText) view.findViewById(u4c0.f174108X4);
            if (vImage == null || vText == null || vText2 == null) {
                return;
            }
            vText.setTextColor(this.f25143i);
            vText2.setTextColor(this.f25144j);
            if (IntlCountryCodeController.m28126v()) {
                vImage.setBackground(null);
                vImage.setImageResource(x2c0.f190215hq);
                vImage.setScaleType(ImageView.ScaleType.FIT_CENTER);
                vText.setText(R$string.f18405br);
                vText2.setText(R$string.f18374ar);
            } else {
                vImage.setBackgroundResource(x2c0.f189247Ct);
                vText.setText(R$string.f18534g2);
                vText2.setText(R$string.f18503f2);
            }
            VText vText3 = (VText) view.findViewById(u4c0.f174092W4);
            VFrame vFrame = (VFrame) view.findViewById(u4c0.f173747Bd);
            xdl0.m208344M(vFrame, false);
            xdl0.m208384k0(vFrame);
            xdl0.m208344M(vText3, false);
            xdl0.m208344M(vImage, m41510J());
            xdl0.m208344M(vText2, m41510J());
            xdl0.m208344M(vText, m41510J());
        }

        /* JADX INFO: renamed from: Q */
        public void m41517Q(q860<Conversation> q860Var) {
            if (m41506E()) {
                return;
            }
            boolean z = false;
            this.f25141g = false;
            this.f25137c = q860Var.f153135a;
            if (NullChecker.m81303a(q860Var.f153136b) && NullChecker.m81303a(q860Var.f153136b.links) && !TextUtils.isEmpty(q860Var.f153136b.links.next)) {
                z = true;
            }
            this.f25139e = z;
            this.f25140f = NullChecker.m81303a(q860Var.f153136b) ? q860Var.f153136b.links : null;
            this.f25142h.m107830f();
            notifyDataSetChanged();
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: e */
        public void mo41518e(int i) {
            if (m41506E()) {
                return;
            }
            this.f25142h.m107829e(i);
            if (!ConversationsList.this.f25094N0 || vwb.m200296J(this.f25137c) || this.f25137c.size() <= 0 || this.f25137c.size() - i > 1 || !this.f25139e || !NullChecker.m81303a(this.f25140f)) {
                return;
            }
            CoreModule.f17545c.f19642f0.m32959fn(this.f25140f);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int currentSortType;
            if (ConversationsList.this.f25094N0) {
                return Math.max(1, this.f25137c.size());
            }
            if (m41506E()) {
                int size = this.f25137c.size();
                if (upa.m194836w3()) {
                    size += this.f25138d.m41835k();
                }
                return Math.max(1, size);
            }
            if (NullChecker.m81303a(ConversationsList.this.f25085E0) && ((currentSortType = ConversationsList.this.f25085E0.getCurrentSortType()) == 6 || currentSortType == 7 || currentSortType == 8 || currentSortType == 11)) {
                return (vwb.m200296J(this.f25137c) ? 1 : 0) + this.f25137c.size();
            }
            int iM41835k = (NullChecker.m81303a(this.f25138d) ? this.f25138d.m41835k() : 0) + this.f25137c.size();
            return m41509I() ? iM41835k + 1 : iM41835k;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            int i2;
            if (m41506E() && !upa.m194836w3()) {
                if (vwb.m200296J(this.f25137c)) {
                    return null;
                }
                return this.f25137c.get(i);
            }
            if (ConversationsList.this.f25094N0) {
                if (i < this.f25137c.size()) {
                    return this.f25137c.get(i);
                }
                return null;
            }
            int iM41835k = NullChecker.m81303a(this.f25138d) ? this.f25138d.m41835k() : 0;
            if (i >= iM41835k && (i2 = i - iM41835k) >= 0 && i2 < this.f25137c.size()) {
                return this.f25137c.get(i2);
            }
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            if (ConversationsList.this.f25094N0) {
                return (vwb.m200296J(this.f25137c) && i == 0) ? 8 : 9;
            }
            if (m41506E() && vwb.m200296J(this.f25137c) && (!upa.m194836w3() || this.f25138d.m41835k() == 0)) {
                return 42;
            }
            int currentSortType = ConversationsList.this.f25085E0.getCurrentSortType();
            int iM41835k = (!NullChecker.m81303a(this.f25138d) || (m41506E() && !upa.m194836w3())) ? 0 : this.f25138d.m41835k();
            if (vwb.m200296J(this.f25137c) && i == 0 && (currentSortType == 6 || currentSortType == 7 || currentSortType == 11 || currentSortType == 8)) {
                return 12;
            }
            if (i >= 0 && i < iM41835k) {
                return this.f25138d.m41836l(i);
            }
            if (m41509I() && i == getCount() - 1) {
                return 3;
            }
            if (getItem(i) instanceof Conversation) {
                Conversation conversation = (Conversation) getItem(i);
                if (TEnum.equals(conversation.status, "dismissed")) {
                    return 7;
                }
                if (ml6.m155116a(conversation)) {
                    return 11;
                }
                if (fap.m120257k(conversation)) {
                    return 10;
                }
                if (TextUtils.equals(ConversationType.feedstate, conversation.convType)) {
                    return 16;
                }
                if (TextUtils.equals(ConversationType.virtualvoice, conversation.convType)) {
                    return 23;
                }
                if (TextUtils.equals(ConversationType.fakeReceiveLikeGuideSVip, conversation.convType)) {
                    return 27;
                }
                if (TextUtils.equals(ConversationType.liveactivites, conversation.convType)) {
                    return 29;
                }
                if (TextUtils.equals(ConversationType.fakeIntlReceiveLikeGuideSVip, conversation.convType)) {
                    return 41;
                }
                if (TextUtils.equals(ConversationType.local_instant_chat_guide, conversation.convType)) {
                    return 45;
                }
                if (TextUtils.equals("fake_conversation_oof_pick", conversation.f56011id)) {
                    return 30;
                }
                if (TextUtils.equals("fake_conversation_oof_enter", conversation.f56011id)) {
                    return 31;
                }
                if (TextUtils.equals("fake_conversation_profile_featured", conversation.f56011id)) {
                    return 37;
                }
                if (rd6.m178865C0(conversation)) {
                    return 32;
                }
                if (TextUtils.equals("fake_conversation_blindbox_enter", conversation.f56011id)) {
                    return 34;
                }
                if (TextUtils.equals("fake_conversation_surprise_gift_box", conversation.f56011id)) {
                    return 36;
                }
                if (TextUtils.equals("fake_conversation_local_summary_marriage_conversation", conversation.f56011id)) {
                    return 40;
                }
                if (TextUtils.equals("fake_conversation_profile_like_enter", conversation.f56011id)) {
                    return 38;
                }
                if (TextUtils.equals("fake_conversation_fold_conversation", conversation.f56011id)) {
                    return 39;
                }
                if (TextUtils.equals("fake_conversation_weaken_conversation", conversation.f56011id)) {
                    return 46;
                }
                if (TextUtils.equals("fake_conversation_local_team_group_conversation", conversation.f56011id)) {
                    return 43;
                }
                if (TextUtils.equals("fake_conversation_local_limited_trial_see_fold", conversation.f56011id)) {
                    return 44;
                }
            }
            return 0;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 49;
        }

        @Override // p149l.p36
        /* JADX INFO: renamed from: h */
        public int mo41519h() {
            return getCount();
        }

        @Override // p149l.p36
        /* JADX INFO: renamed from: k */
        public List<Conversation> mo41520k() {
            return this.f25137c;
        }

        @Override // p149l.p36
        /* JADX INFO: renamed from: l */
        public int mo41521l() {
            if ((!m41506E() || upa.m194836w3()) && NullChecker.m81303a(this.f25138d)) {
                return this.f25138d.m41835k();
            }
            return 0;
        }

        @Override // p149l.wp1
        /* JADX INFO: renamed from: m */
        public View mo20403m(ViewGroup viewGroup, int i) {
            if (ConversationsList.this.f25094N0) {
                ConversationsList conversationsList = ConversationsList.this;
                return i == 8 ? conversationsList.m41402l1().inflater().inflate(f6c0.f95949pc, (ViewGroup) ConversationsList.this.f25105V, false) : rd6.m178871a(conversationsList.m41402l1(), viewGroup);
            }
            if (i == 28) {
                return ConversationsList.this.m41402l1().inflater().inflate(f6c0.f95588U1, (ViewGroup) ConversationsList.this.f25105V, false);
            }
            if (i == 12) {
                return ConversationsList.this.m41402l1().inflater().inflate(f6c0.f95350F3, (ViewGroup) ConversationsList.this.f25105V, false);
            }
            if (i == 3) {
                ConversationsList conversationsList2 = ConversationsList.this;
                return !conversationsList2.f25119h1 ? conversationsList2.m41402l1().inflater().inflate(f6c0.f95851k, (ViewGroup) ConversationsList.this.f25105V, false) : conversationsList2.m41402l1().inflater().inflate(f6c0.f95868l, (ViewGroup) ConversationsList.this.f25105V, false);
            }
            if (i == 1 || i == 14) {
                return ConversationsList.this.m41402l1().inflater().inflate(f6c0.f95717c0, (ViewGroup) ConversationsList.this.f25105V, false);
            }
            if (i == 48) {
                return ConversationsList.this.m41402l1().inflater().inflate(f6c0.f95287B4, (ViewGroup) ConversationsList.this.f25105V, false);
            }
            if (i == 13) {
                return rd6.m178871a(ConversationsList.this.m41402l1(), viewGroup);
            }
            if (i == 15) {
                return ConversationsList.this.m41402l1().inflater().inflate(f6c0.f95428K1, (ViewGroup) ConversationsList.this.f25105V, false);
            }
            if (i == 16) {
                return ConversationsList.this.m41402l1().inflater().inflate(f6c0.f95556S1, (ViewGroup) ConversationsList.this.f25105V, false);
            }
            if (i == 17) {
                return rd6.m178871a(ConversationsList.this.m41402l1(), ConversationsList.this.f25105V);
            }
            if (i == 23) {
                return ConversationsList.this.m41402l1().inflater().inflate(f6c0.f95572T1, (ViewGroup) ConversationsList.this.f25105V, false);
            }
            if (i == 30 || i == 31 || i == 37) {
                return ConversationsList.this.m41402l1().inflater().inflate(f6c0.f95412J1, (ViewGroup) ConversationsList.this.f25105V, false);
            }
            if (i == 43) {
                return ConversationsList.this.m41402l1().inflater().inflate(f6c0.f95540R1, (ViewGroup) ConversationsList.this.f25105V, false);
            }
            if (i == 27) {
                return ConversationsList.this.m41402l1().inflater().inflate(f6c0.f95508P1, (ViewGroup) ConversationsList.this.f25105V, false);
            }
            if (i == 41) {
                return ConversationsList.this.m41402l1().inflater().inflate(f6c0.f95460M1, (ViewGroup) ConversationsList.this.f25105V, false);
            }
            if (i == 45) {
                return ConversationsList.this.m41402l1().inflater().inflate(f6c0.f95444L1, (ViewGroup) ConversationsList.this.f25105V, false);
            }
            if (i == 32) {
                return rd6.m178866G(ConversationsList.this.m41402l1(), viewGroup);
            }
            if (i == 33) {
                return ConversationsList.this.m41402l1().inflater().inflate(f6c0.f95476N1, (ViewGroup) ConversationsList.this.f25105V, false);
            }
            if (i == 34) {
                return ConversationsList.this.m41402l1().inflater().inflate(f6c0.f95396I1, (ViewGroup) ConversationsList.this.f25105V, false);
            }
            if (i == 36) {
                return ConversationsList.this.m41402l1().inflater().inflate(f6c0.f95524Q1, (ViewGroup) ConversationsList.this.f25105V, false);
            }
            if (i == 38) {
                return ConversationsList.this.m41402l1().inflater().inflate(f6c0.f95492O1, (ViewGroup) ConversationsList.this.f25105V, false);
            }
            if (i == 39) {
                return ConversationsList.this.m41402l1().inflater().inflate(f6c0.f95668Z1, (ViewGroup) ConversationsList.this.f25105V, false);
            }
            if (i == 46) {
                return ConversationsList.this.m41402l1().inflater().inflate(f6c0.f95702b2, (ViewGroup) ConversationsList.this.f25105V, false);
            }
            if (i == 42) {
                return ConversationsList.this.m41402l1().inflater().inflate(f6c0.f95620W1, (ViewGroup) ConversationsList.this.f25105V, false);
            }
            if (i == 44) {
                return rd6.m178871a(ConversationsList.this.m41402l1(), viewGroup);
            }
            if (i == 47) {
                return CoreModule.m29936Q().mo67231Ms(ConversationsList.this.m41402l1(), ConversationsList.this.f25128p0).getView();
            }
            return rd6.m178870Z(ConversationsList.this.m41402l1(), viewGroup, i == 11);
        }

        @Override // p149l.p36
        /* JADX INFO: renamed from: o */
        public int mo41522o() {
            ConversationsListHeadView conversationsListHeadView = ConversationsList.this.f25085E0;
            if (conversationsListHeadView != null) {
                return conversationsListHeadView.getCurrentSortType();
            }
            return -1;
        }

        @Override // p149l.p36
        /* JADX INFO: renamed from: q */
        public void mo41523q() {
            ConversationsList.this.m41485v2();
        }

        @Override // p149l.p36
        /* JADX INFO: renamed from: v */
        public C22306c<Boolean> mo41524v() {
            return ConversationsList.this.f25120i1.getParentFragment() instanceof PutongFrag ? ((PutongFrag) ConversationsList.this.f25120i1.getParentFragment()).m29640L4() : C22306c.just(Boolean.TRUE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p149l.wp1
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public void mo20402j(View view, Conversation conversation, int i, int i2) {
            int iIntValue;
            int iM186890d;
            if (ConversationsList.this.f25094N0) {
                if (i != 8) {
                    ((NewConversationItemView) view).m41778u4(this, conversation, null, i2, null);
                    return;
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = t100.m186889c().heightPixels - t100.m186890d(340.0f);
                view.setLayoutParams(layoutParams);
                ConversationsList.this.f25105V.setFooterDividersEnabled(false);
                return;
            }
            if (i == 28) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = -1;
                if (CoreModule.f17545c.f19639e0.f149408k3.get().intValue() == 0 || CoreModule.f17545c.f19639e0.f149416l3.get().intValue() == 0) {
                    layoutParams2.height = t100.m186889c().heightPixels - t100.m186890d(340.0f);
                } else {
                    layoutParams2.height = (CoreModule.f17545c.f19639e0.f149408k3.get().intValue() - CoreModule.f17545c.f19639e0.f149416l3.get().intValue()) - t100.m186890d(44.0f);
                }
                xdl0.m208360X((VLinear) view.findViewById(u4c0.f174515v7), (int) (((double) ((layoutParams2.height - t100.m186890d(261.0f)) / 2)) - (((double) layoutParams2.height) * 0.1d)));
                view.setLayoutParams(layoutParams2);
                m41515O(view);
                return;
            }
            if (i == 12) {
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                layoutParams3.width = -1;
                layoutParams3.height = t100.m186889c().heightPixels - t100.m186890d(340.0f);
                view.setLayoutParams(layoutParams3);
                m41514N(view);
                return;
            }
            if (i == 42) {
                View viewFindViewById = view.findViewById(u4c0.f174545x3);
                xdl0.m208344M(viewFindViewById, true);
                if (CoreModule.f17545c.f19639e0.f149408k3.get().intValue() == 0 || CoreModule.f17545c.f19639e0.f149416l3.get().intValue() == 0) {
                    iIntValue = t100.m186889c().heightPixels;
                    iM186890d = t100.m186890d(340.0f);
                } else {
                    iIntValue = CoreModule.f17545c.f19639e0.f149408k3.get().intValue() - CoreModule.f17545c.f19639e0.f149416l3.get().intValue();
                    iM186890d = t100.m186890d(44.0f);
                }
                xdl0.m208325C0(viewFindViewById, iIntValue - iM186890d);
                TextView textView = (TextView) view.findViewById(u4c0.f174494u3);
                textView.setText("重置筛选");
                xdl0.m208329E0(textView, new View.OnClickListener() { // from class: l.rp6
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f160479a.m41507F(view2);
                    }
                });
                ((TextView) view.findViewById(u4c0.f173720A3)).setText("没有找到符合条件的消息\n你可以减少筛选项试试");
                return;
            }
            if (i == 3) {
                if (ConversationsList.this.f25119h1) {
                    return;
                }
                m41516P(view);
                return;
            }
            if (i == 1 || i == 14) {
                ((BusinessConversationView) view).m42297i0(ConversationsList.this.m41402l1(), this);
            } else if (i == 48) {
                ((IntlVisitorConversationView) view).m42303m0(ConversationsList.this.m41402l1(), this);
            } else if (i != 2) {
                if (i == 0) {
                    try {
                        ConversationsList conversationsList = ConversationsList.this;
                        ((NewConversationItemView) view).m41765h4(this, conversation, conversationsList.f25123k1, conversationsList.f25118g1, i2, null);
                    } catch (ClassCastException e) {
                        CrashHelper.m81296c(e);
                    }
                } else if (i == 11) {
                    ConversationsList conversationsList2 = ConversationsList.this;
                    ((NewConversationItemView) view).m41769l4(this, conversation, conversationsList2.f25123k1, conversationsList2.f25118g1, i2, null);
                } else if (i != 5) {
                    if (i == 7) {
                        ((NewConversationItemView) view).m41778u4(this, conversation, ConversationsList.this.f25123k1, i2, null);
                    } else if (i == 10) {
                        ((NewConversationItemView) view).m41771n4(this);
                    } else if (i == 13) {
                        ((NewConversationItemView) view).m41774q4(this, i2);
                    } else if (i == 15) {
                        ((ConversationItemGoogleAdView) view).m40825c(ConversationsList.this.m41402l1(), ConversationsList.this.f25118g1);
                    } else if (i == 16) {
                        ConversationsList.this.m41427D2(conversation.additional.feedStateCounter);
                        ((ConversationItemUserStatesView) view).m40945i(ConversationsList.this.m41402l1(), conversation);
                    } else if (i == 17) {
                        ((NewConversationItemView) view).m41779v4(this, ConversationsList.this.m41402l1());
                    } else if (i == 23) {
                        ((ConversationItemVirtualVoiceGroupView) view).m41047E0(ConversationsList.this.m41402l1(), conversation, i2);
                    } else if (i == 30) {
                        ((ConversationItemFriendMoments) view).m40821p(this, conversation.otherUser);
                    } else if (i == 31) {
                        ((ConversationItemFriendMoments) view).m40820o(this, conversation.otherUser);
                    } else if (i == 37) {
                        ((ConversationItemFriendMoments) view).m40822q(this, conversation.otherUser);
                    } else if (i == 27) {
                        ((ConversationItemReceiveLikeView) view).m40902k(this, conversation);
                    } else if (i == 41) {
                        try {
                            ((ConversationItemIntlReceiveLikeView) view).m40855k(conversation);
                        } catch (ClassCastException e2) {
                            CrashHelper.m81296c(e2);
                        }
                    } else if (i == 45) {
                        ((ConversationItemInstantChatGuideView) view).m40838m(ConversationsList.this.m41402l1(), conversation);
                    } else if (i == 32) {
                        ConversationsList conversationsList3 = ConversationsList.this;
                        ((NewConversationItemView) view).m41768k4(this, conversation, conversationsList3.f25123k1, conversationsList3.f25118g1, i2, null);
                    } else if (i == 33) {
                        ((ConversationItemPlatinumPinLike) view).m40882q(this, i2);
                    } else if (i == 35) {
                        ((NewConversationItemView) view).m41767j4(this, conversation, ConversationsList.this.m41402l1());
                    } else if (i == 34) {
                        ((ConversationItemBlindBoxEntrance) view).m40804e(conversation);
                    } else if (i == 36) {
                        ((ConversationItemSurpriseBoxEntrance) view).m40916f(conversation);
                    } else if (i == 40) {
                        ((NewConversationItemView) view).m41775r4(this, conversation);
                    } else if (i == 38) {
                        ((ConversationItemProfileLikeEntrance) view).m40891i(conversation, this);
                    } else if (i == 39) {
                        ((ConversationFoldView) view).m40719T(ConversationsList.this.m41402l1(), this);
                    } else if (i == 46) {
                        ((ConversationWeakenView) view).m41322d0(ConversationsList.this.m41402l1(), this);
                    } else if (i == 43) {
                        ((ConversationItemTeamGroup) view).m40932o(this, conversation);
                    } else if (i == 44) {
                        ((NewConversationItemView) view).m41773p4(this, i2, ConversationsList.this.f25111Z0);
                    } else if (i == 47) {
                        ((cqp) view).mo70401z(i2);
                    }
                }
            }
            if (!m41506E() || i2 < this.f25137c.size() - 3 || this.f25137c.size() <= 10) {
                return;
            }
            ConversationsList.this.f25121j1.m40707Q(this, true);
        }

        /* JADX INFO: renamed from: z */
        public boolean m41526z(User user, Conversation conversation) {
            return ConversationsList.this.f25121j1.m40691A(conversation, user);
        }
    }

    static {
        roj0 roj0Var = roj0.f160388a;
        f25080t1 = C22392a.m221513c(roj0Var);
        f25081u1 = C22392a.m221513c(roj0Var);
        f25082v1 = C22392a.m221513c(roj0Var);
        f25083w1 = C22392a.m221513c(roj0Var);
        f25084x1 = new C8129d();
    }

    public ConversationsList(Context context) {
        super(context);
        this.f25122k0 = null;
        this.f25086F0 = 23;
        this.f25087G0 = 39;
        this.f25088H0 = 40;
        this.f25089I0 = 41;
        this.f25090J0 = 42;
        this.f25091K0 = 43;
        this.f25092L0 = 45;
        this.f25093M0 = C22392a.m221513c(roj0.f160388a);
        this.f25094N0 = false;
        this.f25095O0 = C22392a.m221513c(0);
        this.f25096P0 = C22392a.m221513c(q860.m173342b());
        this.f25097Q0 = C22392a.m221513c(new ArrayList());
        this.f25098R0 = C22392a.m221513c(new ArrayList());
        this.f25100S0 = C22392a.m221513c(new ArrayList());
        this.f25102T0 = C22392a.m221513c(new ArrayList());
        this.f25104U0 = C22392a.m221513c(new ArrayList());
        this.f25106V0 = C22392a.m221513c(new ArrayList());
        this.f25108W0 = C22392a.m221513c(q860.m173342b());
        this.f25109X0 = C22392a.m221513c(q860.m173342b());
        this.f25110Y0 = new ArrayList();
        this.f25111Z0 = new ArrayList();
        this.f25113b1 = false;
        this.f25114c1 = false;
        this.f25116e1 = false;
        this.f25117f1 = null;
        this.f25118g1 = false;
        this.f25119h1 = false;
        this.f25124l1 = false;
        this.f25125m1 = 6;
        this.f25126n1 = 40;
        this.f25127o1 = 50;
    }

    /* JADX INFO: renamed from: A2 */
    public static void m41328A2() {
        m41331B2(false);
    }

    /* JADX INFO: renamed from: B2 */
    public static void m41331B2(boolean z) {
        rd6.m178864C("refreshObs 强制刷新 = " + z);
        if (z) {
            f25084x1.m41494b();
        }
        f25084x1.m41496d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ void m41343H0(ggi.C17074a c17074a) {
        if (c17074a == null || c17074a.f102512a == 0) {
            return;
        }
        r6n.m178067f().f157954b.m132487l((InsertConversationsList) c17074a.f102512a);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m41348K(Throwable th) {
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m41352M(boolean[] zArr) {
        List<T> listM165617j = CoreModule.f17553k.f91950m.f118485y.m165617j();
        for (int i = 0; i < listM165617j.size() && i < 50; i++) {
            double d = ((Conversation) listM165617j.get(i)).additional.quickChat.expire;
            if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d < mqi0.m155944o()) {
                zArr[0] = true;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m41358P(List list) {
        CoreModule.f17545c.f19642f0.f19921a2 = "";
        int iMin = Math.min(list.size(), 50);
        int i = 0;
        for (int i2 = 0; i2 < iMin && i < 20; i2++) {
            Conversation conversation = (Conversation) list.get(i2);
            if (!conversation.newMatchExpShowInList()) {
                if (!TextUtils.isEmpty(CoreModule.f17545c.f19642f0.f19921a2)) {
                    StringBuilder sb = new StringBuilder();
                    C4740g c4740g = CoreModule.f17545c.f19642f0;
                    sb.append(c4740g.f19921a2);
                    sb.append(Constants.SEPARATOR_COMMA);
                    c4740g.f19921a2 = sb.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                C4740g c4740g2 = CoreModule.f17545c.f19642f0;
                sb2.append(c4740g2.f19921a2);
                sb2.append(conversation.f56011id);
                c4740g2.f19921a2 = sb2.toString();
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m41361Q0(Throwable th) {
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ Boolean m41363R0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m41364S(Throwable th) {
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m41366T(Throwable th) {
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ Boolean m41368U(Boolean bool) {
        if (bool.booleanValue()) {
            return Boolean.FALSE;
        }
        CertificationNewConfig certificationNewConfigM194651J = upa.m194651J();
        boolean zM175940h = qqi0.m175940h(mqi0.m155944o(), (long) CoreModule.f17545c.f19639e0.m169520na().createdTime, 7);
        boolean z = false;
        boolean z2 = CoreModule.f17545c.f19642f0.m33013kf() < (CoreModule.f17545c.f19639e0.m169520na().isFemale() ? certificationNewConfigM194651J.femaleLimit : certificationNewConfigM194651J.maleLimit);
        boolean z3 = CoreModule.f17545c.f19642f0.m33039mf(1) <= 0;
        if ((!zM175940h && z2) || (zM175940h && z3)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m41369U0(Throwable th) {
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ void m41375X0(Throwable th) {
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ Boolean m41377Y0(q860 q860Var) {
        final boolean[] zArr = {false};
        f8c.m119878o().m119881B(new d30() { // from class: l.qn6
            @Override // p149l.d30
            public final void call() {
                ConversationsList.m41352M(zArr);
            }
        });
        return Boolean.valueOf(zArr[0]);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m41392g0(Throwable th) {
    }

    private void getFeedUserStateCounter() {
        m41402l1().duringCreated(CoreModule.f17545c.f19676q1.m33275w3().take(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.am6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f70565a.m41439M1((roj0) obj);
            }
        }, new e30() { // from class: l.lm6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationsList.m41364S((Throwable) obj);
            }
        }));
    }

    private C22306c<Boolean> getPicCerGuideObs() {
        return (!jjb0.m141784b() || CoreModule.m29932K().me_().isPicVerificationVerified() || CoreModule.f17545c.f19639e0.f149297W3.get().intValue() >= 3 || mqi0.m155944o() <= CoreModule.f17545c.f19639e0.f149289V3.get().longValue() || (upa.m194752g() && wn90.m204602F().m204647R())) ? C22306c.just(Boolean.FALSE) : C22306c.combineLatest(CoreModule.f17545c.f19552B0.m31611j4().filter(new zo6()).map(new w9j() { // from class: l.kp6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                VerificationCenter verificationCenter = (VerificationCenter) obj;
                return Boolean.valueOf(TEnum.equals(verificationCenter.picVerificationInfo.status, "verified") || TEnum.equals(verificationCenter.picVerificationInfo.status, "pending"));
            }
        }).distinctUntilChanged(), m41402l1().lifecycle().filter(new w9j() { // from class: l.op6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i && v930.m197534h() == TabName.Msg);
            }
        }), new x9j() { // from class: l.bm6
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return ConversationsList.m41414w0((Boolean) obj, (C4319c) obj2);
            }
        }).observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.cm6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ConversationsList.m41368U((Boolean) obj);
            }
        }).observeOn(jo0.m142408a());
    }

    private C22306c<Boolean> getSortInvalidConvObs() {
        return CoreModule.f17545c.f19642f0.f19966p2.map(new w9j() { // from class: l.oo6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f144848a.m41440N1((roj0) obj);
            }
        }).distinctUntilChanged();
    }

    private C22306c<Integer> getTotalLiker() {
        return CoreModule.f17545c.f19687u0.m30405O6().map(new w9j() { // from class: l.wm6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ConversationsList.m41407q0((CoreLikers.C4719a) obj);
            }
        }).distinctUntilChanged();
    }

    private C22306c<Integer> getWeakenedTipsObs() {
        return C22306c.just(-1);
    }

    private C22306c<WechatNotifySetting> getWechatNotifyObs() {
        return C22306c.just(null);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m41394h0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public PutongAct m41402l1() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m41405o0(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            C4743i c4743i = CoreModule.f17545c.f19676q1;
            C4743i.f20009S.m132487l(roj0.f160388a);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ Integer m41407q0(CoreLikers.C4719a c4719a) {
        if (n3b0.m157742q()) {
            return Integer.valueOf(c4719a.f19270b);
        }
        return -1;
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m41411u0(Throwable th) {
    }

    /* JADX INFO: renamed from: v0 */
    public static /* synthetic */ void m41412v0(List list, boolean z) {
        if (vwb.m200296J(list)) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            Conversation conversationMo223809clone = ((Conversation) list.get(i)).mo223809clone();
            int i2 = z ? 2 : 1;
            if (i2 != conversationMo223809clone.localIsLimitedTrialSee) {
                conversationMo223809clone.localIsLimitedTrialSee = i2;
                CoreModule.f17553k.f91950m.upsert(conversationMo223809clone);
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ Boolean m41414w0(Boolean bool, C4319c c4319c) {
        return bool;
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ void m41416x0(Boolean bool) {
        OnlineMatchManager.m50143z().f32586A.m132487l("过期闪聊配对在这里");
        OnlineMatchManager.m50143z().f32608l.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ Boolean m41418y0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m41419z(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ j760 m41420z0(j760 j760Var) {
        final List list = (List) j760Var.f116564a;
        String str = (String) j760Var.f116565b;
        if (vwb.m200296J(list)) {
            return j760Var;
        }
        final boolean z = ((long) list.size()) > emr.INSTANCE.m117222d() && (SeeTrialStatusType.trialEnd.equals(str) || "waiting".equals(str) || "expired".equals(str));
        f8c.m119878o().m119881B(new d30() { // from class: l.lp6
            @Override // p149l.d30
            public final void call() {
                ConversationsList.m41412v0(list, z);
            }
        });
        return j760Var;
    }

    /* JADX INFO: renamed from: z2 */
    public static void m41421z2() {
        f25083w1.m132487l(roj0.f160388a);
    }

    /* JADX INFO: renamed from: A1 */
    public final void m41422A1() {
        if (y19.m212160T()) {
            xdl0.m208344M(this.f25085E0.f25190z, true);
            xdl0.m208329E0(this.f25085E0.f25190z, new View.OnClickListener() { // from class: l.nn6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f139698a.m41461i2(view);
                }
            });
            this.f25120i1.duringCreated(C22306c.combineLatest(CoreModule.f17545c.f19639e0.m169523o9(), CoreModule.f17545c.f19552B0.m31611j4(), new on6())).subscribe(mkd0.m154955G(new e30() { // from class: l.pn6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f150367a.m41462j2((j760) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: B1 */
    public final void m41423B1() {
        if (ogl0.m164245X()) {
            m41402l1().duringCreated(new v9j() { // from class: l.rn6
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return mkd0.m154984r(CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("svip")).map(new w9j() { // from class: l.jo6
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return Boolean.valueOf(xma.m210047L3());
                        }
                    }), CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("limitedTrialSee")).map(new w9j() { // from class: l.ko6
                        @Override // p149l.w9j
                        public final Object call(Object obj) {
                            return Boolean.valueOf(xma.m210042E3());
                        }
                    }), new x9j() { // from class: l.lo6
                        @Override // p149l.x9j
                        public final Object call(Object obj, Object obj2) {
                            return j760.m140076a((Boolean) obj, (Boolean) obj2);
                        }
                    });
                }
            }).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.tn6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f171211a.m41464k2((j760) obj);
                }
            }));
            m41402l1().duringCreated(new v9j() { // from class: l.un6
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f177336a.m41465l2();
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.vn6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f182208a.m41467m2((j760) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: C1 */
    public final void m41424C1() {
        if (upa.m194637G0()) {
            m41402l1().duringCreated(CoreModule.f17545c.f19642f0.m32951ff()).subscribe(mkd0.m154955G(new e30() { // from class: l.cn6
                @Override // p149l.e30
                public final void call(Object obj) {
                    ConversationsList.m41358P((List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: C2 */
    public void m41425C2() {
        this.f25105V.setAdapter((ListAdapter) this.f25128p0);
    }

    /* JADX INFO: renamed from: D1 */
    public final void m41426D1() {
        m41402l1().duringCreated(r6n.m178067f().f157953a.m125973k().compose(mkd0.m154951C()).doOnNext(new e30() { // from class: l.mo6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationsList.m41343H0((ggi.C17074a) obj);
            }
        }).flatMap(new w9j() { // from class: l.no6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return CoreModule.f17545c.f19642f0.m33112rn();
            }
        }).take(1)).subscribe(mkd0.m154956H(new e30() { // from class: l.po6
            @Override // p149l.e30
            public final void call(Object obj) {
                r6n.m178067f().m178073g((List) obj);
            }
        }, new e30() { // from class: l.qo6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationsList.m41361Q0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D2 */
    public final void m41427D2(CoreFeedStateCounter coreFeedStateCounter) {
        if (this.f25113b1) {
            this.f25113b1 = false;
            zvf0.m220368A("e_match_state", OMSDialogPositon.p_messages_view, new j760("has_red_dot", (!NullChecker.m81303a(coreFeedStateCounter) || coreFeedStateCounter.unread <= 0) ? "no" : "yes"));
        }
    }

    /* JADX INFO: renamed from: E1 */
    public final void m41428E1() {
        m41402l1().duringCreated(mkd0.m154985s(f25081u1, this.f25108W0, this.f25109X0, new y9j() { // from class: l.yo6
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return vwb.m200311Y((q860) obj2, (q860) obj3);
            }
        })).onBackpressureDrop(new e30() { // from class: l.ap6
            @Override // p149l.e30
            public final void call(Object obj) {
                CrashHelper.m81297d(new IllegalStateException("ConversationsList backpressure problem! - list filter map problem"), 100);
            }
        }).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.bp6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f76606a.m41469n2((j760) obj);
            }
        }, new e30() { // from class: l.cp6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationsList.m41419z((Throwable) obj);
            }
        }));
        C22306c<q860<Conversation>> c22306cM33080ph = CoreModule.f17545c.f19642f0.m33080ph();
        C22392a<q860<Conversation>> c22392a = this.f25108W0;
        Objects.requireNonNull(c22392a);
        c22306cM33080ph.subscribe(new io6(c22392a));
        C22306c<q860<Conversation>> c22306cM33093qh = CoreModule.f17545c.f19642f0.m33093qh();
        C22392a<q860<Conversation>> c22392a2 = this.f25109X0;
        Objects.requireNonNull(c22392a2);
        c22306cM33093qh.subscribe(new io6(c22392a2));
    }

    /* JADX INFO: renamed from: E2 */
    public void m41429E2() {
        if (NullChecker.m81303a(this.f25121j1)) {
            this.f25121j1.m40711U();
        }
    }

    /* JADX INFO: renamed from: F1 */
    public final boolean m41430F1(Conversation conversation, HashMap<String, UserLiveLabel> map) {
        if (map != null && !map.isEmpty()) {
            if ("group".equals(conversation.convType)) {
                ChatGroup chatGroupM31920s6 = CoreModule.f17545c.f19645g0.m31920s6(conversation.otherUser);
                if (NullChecker.m81303a(chatGroupM31920s6)) {
                    return map.get(chatGroupM31920s6.ownerUserId) != null;
                }
            }
            if (map.get(conversation.f56011id) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: F2 */
    public final void m41431F2() {
        if (this.f25085E0 == null) {
            return;
        }
        int firstVisiblePosition = this.f25105V.getFirstVisiblePosition();
        boolean z = false;
        int iMax = (!xdl0.m208349O0(this.f25085E0.f25183s) || firstVisiblePosition > 0) ? 0 : Math.max(this.f25085E0.f25183s.getTop() + this.f25085E0.getTop(), 0);
        int initHeight = (NullChecker.m81303a(this.f25115d1) && xdl0.m208349O0(this.f25115d1)) ? this.f25115d1.getInitHeight() : 0;
        if (this.f25085E0.getTop() >= 0) {
            iMax = firstVisiblePosition > 0 ? 0 : this.f25085E0.f25183s.getTop();
        } else if (initHeight > 0 && (iMax = Math.max(iMax, initHeight)) == initHeight) {
            z = true;
        }
        boolean z2 = iMax != 0 ? z : true;
        xdl0.m208360X(this.f25121j1, iMax);
        xdl0.m208372e0(this.f25121j1, t100.f167259h);
        ConvCellList convCellList = this.f25105V;
        if (z2) {
            convCellList.setClipHeight(iMax + this.f25121j1.getHeight());
        } else {
            convCellList.setClipHeight(-1);
        }
    }

    /* JADX INFO: renamed from: G1 */
    public boolean m41432G1() {
        if (upa.m194726a2()) {
            return false;
        }
        return this.f25118g1;
    }

    /* JADX INFO: renamed from: G2 */
    public void m41433G2() {
        if (NullChecker.m81303a(this.f25128p0) && NullChecker.m81303a(this.f25128p0.m41503B()) && C8140a.m41831p(CoreModule.f17545c.f19642f0.f19868J0.get()) && !this.f25128p0.m41503B().m41839o(13)) {
            this.f25128p0.m41503B().m41838n();
            this.f25128p0.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: H1 */
    public boolean m41434H1() {
        return this.f25118g1;
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m41435I1(knb0 knb0Var) {
        CrashHelper.m81297d(new IllegalStateException("ConversationsList backpressure problem! - list filter problem isSearchList = " + this.f25119h1), 100);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m41436J1(knb0 knb0Var) {
        if (knb0Var.f123873a == 0 || this.f25128p0.m41506E()) {
            return;
        }
        int currentSortType = this.f25085E0.getCurrentSortType();
        if (NullChecker.m81303a(this.f25085E0)) {
            if (currentSortType == 1) {
                this.f25110Y0 = (List) knb0Var.f123874b;
            } else if (currentSortType == 4 && NullChecker.m81303a(((knb0) knb0Var.f123873a).f123873a)) {
                A a = knb0Var.f123873a;
                this.f25110Y0 = ((q860) ((knb0) a).f123873a).f153135a;
                this.f25128p0.m41517Q((q860) ((knb0) a).f123873a);
                this.f25094N0 = true;
            } else if (currentSortType == 6 && NullChecker.m81303a(((knb0) knb0Var.f123873a).f123874b)) {
                this.f25110Y0 = (List) ((knb0) knb0Var.f123873a).f123874b;
            } else if (currentSortType == 7 && NullChecker.m81303a(((knb0) knb0Var.f123873a).f123875c)) {
                this.f25110Y0 = (List) ((knb0) knb0Var.f123873a).f123875c;
            } else if (currentSortType == 8 && NullChecker.m81303a(((knb0) knb0Var.f123873a).f123876d)) {
                this.f25110Y0 = (List) ((knb0) knb0Var.f123873a).f123876d;
            } else if (currentSortType == 11 && NullChecker.m81303a(knb0Var.f123876d)) {
                this.f25110Y0 = (List) knb0Var.f123876d;
            }
            m41331B2(true);
        }
    }

    /* JADX INFO: renamed from: K1 */
    public final /* synthetic */ void m41437K1(j760 j760Var) {
        CrashHelper.m81297d(new IllegalStateException("ConversationsList backpressure problem! - list problem isSearchList = " + this.f25119h1), 100);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m41438L1(j760 j760Var) {
        if (this.f25128p0.m41506E()) {
            return;
        }
        List<Conversation> list = (List) j760Var.f116564a;
        int iIntValue = ((Integer) j760Var.f116565b).intValue();
        if (this.f25085E0.getCurrentSortType() != 0) {
            list = this.f25110Y0;
        }
        List<Conversation> listM41491y2 = m41491y2(list, m41432G1());
        if (upa.m194726a2()) {
            CoreModule.f17545c.f19642f0.m32984ho(m41432G1(), listM41491y2);
        }
        if (this.f25085E0.getCurrentSortType() != 4) {
            this.f25128p0.m41512L(listM41491y2, false, iIntValue);
            this.f25094N0 = false;
        }
        StringBuilder sb = new StringBuilder("ConversationList Render (size = ");
        sb.append(vwb.m200296J(listM41491y2) ? 0 : listM41491y2.size());
        sb.append(")");
        rd6.m178864C(sb.toString());
    }

    /* JADX INFO: renamed from: M1 */
    public final /* synthetic */ void m41439M1(roj0 roj0Var) {
        this.f25113b1 = true;
        m41466m1();
    }

    /* JADX INFO: renamed from: N1 */
    public final /* synthetic */ Boolean m41440N1(roj0 roj0Var) {
        return Boolean.valueOf(this.f25085E0.getCurrentSortType() == 11);
    }

    /* JADX INFO: renamed from: O1 */
    public final /* synthetic */ void m41441O1(Boolean bool) {
        this.f25099S.setRefreshing(true);
    }

    /* JADX INFO: renamed from: P1 */
    public final /* synthetic */ void m41442P1(Throwable th) {
        if (m41402l1().isFinishing()) {
            return;
        }
        this.f25099S.setRefreshing(false);
        if (upa.m194726a2()) {
            m41328A2();
        }
    }

    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ void m41443Q1() {
        if (m41402l1().isFinishing()) {
            return;
        }
        this.f25099S.setRefreshing(false);
        if (upa.m194726a2()) {
            m41328A2();
        }
    }

    /* JADX INFO: renamed from: R1 */
    public final /* synthetic */ void m41444R1() {
        m41402l1().duringCreated(CoreModule.f17545c.f19642f0.m33073on().map(new w9j() { // from class: l.fn6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((q860) obj).m173343c());
            }
        }).takeUntil((w9j<? super R, Boolean>) new w9j() { // from class: l.gn6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }).filter(new w9j() { // from class: l.in6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ConversationsList.m41363R0((Boolean) obj);
            }
        }).distinctUntilChanged()).subscribe(mkd0.m154957I(new e30() { // from class: l.jn6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f118812a.m41441O1((Boolean) obj);
            }
        }, new e30() { // from class: l.kn6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f123860a.m41442P1((Throwable) obj);
            }
        }, new d30() { // from class: l.ln6
            @Override // p149l.d30
            public final void call() {
                this.f128965a.m41443Q1();
            }
        }));
    }

    /* JADX INFO: renamed from: S1 */
    public final /* synthetic */ C22306c m41445S1() {
        return this.f25118g1 ? CoreModule.f17545c.f19642f0.m32997ip() : C22306c.just(roj0.f160388a);
    }

    /* JADX INFO: renamed from: T1 */
    public final /* synthetic */ void m41446T1(roj0 roj0Var) {
        int currentSortType = this.f25085E0.getCurrentSortType();
        if (NullChecker.m81303a(this.f25121j1)) {
            this.f25121j1.m40713y(currentSortType, this.f25085E0.m41555g0(currentSortType));
        }
        if (currentSortType == 4) {
            CoreModule.f17545c.f19642f0.m32959fn(null);
            this.f25105V.setFooterDividersEnabled(false);
        } else if (currentSortType == 6) {
            this.f25105V.setFooterDividersEnabled(false);
        }
        if (NullChecker.m81303a(this.f25121j1) && NullChecker.m81303a(this.f25115d1) && NullChecker.m81303a(getConversationHeadRecommendLayout())) {
            m41431F2();
        }
        if (currentSortType == 0) {
            m41331B2(true);
        } else {
            f25081u1.m132487l(roj0.f160388a);
        }
    }

    /* JADX INFO: renamed from: U1 */
    public final /* synthetic */ void m41447U1(Map map) {
        this.f25128p0.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: V1 */
    public final /* synthetic */ void m41448V1(String str) {
        this.f25085E0.m41546I0(str);
        OnlineMatchManager.m50143z().f32586A.m132487l("");
    }

    /* JADX INFO: renamed from: W1 */
    public final /* synthetic */ void m41449W1(Boolean bool) {
        this.f25112a1 = bool.booleanValue();
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m41450X1(UserPrivilege userPrivilege) {
        boolean zM210054S3 = xma.m210054S3(SummarizedPrivilegesId.get("seeWhoLikedMe"));
        Boolean bool = this.f25122k0;
        if (bool == null || bool.booleanValue() != zM210054S3) {
            this.f25122k0 = Boolean.valueOf(zM210054S3);
            CoreModule.f17545c.f19579K0.m176989x3().m132487l(Optional.m15413of(roj0.f160388a));
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ Boolean m41451Y1(TabName tabName) {
        boolean z = false;
        if (tabName == TabName.Msg && !sqb0.m185498O().m185552V(false, true) && sqb0.m185498O().m185542H() && !fpb0.m122587d() && !this.f25115d1.mo41986e() && !OnlineMatchManager.m50143z().m50155L() && !sqb0.m185498O().m185554Y()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m41452Z1(TabName tabName) {
        fpb0.m122588e(m41402l1(), false, null);
        sqb0.m185498O().m185569w0();
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m41453a2() {
        this.f25085E0.m41544G0(this.f25121j1.f24700c);
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m41454b2(Integer num) {
        ConversationsListHeadView conversationsListHeadView = this.f25085E0;
        if (conversationsListHeadView == null || !xdl0.m208349O0(conversationsListHeadView)) {
            return;
        }
        this.f25085E0.m41543E0(this.f25115d1.getInitHeight());
        if (upa.m194637G0()) {
            m41431F2();
        }
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m41455c2(u26 u26Var) {
        if (u26Var.f173074c.booleanValue()) {
            this.f25085E0.m41545H0();
            return;
        }
        if (NullChecker.m81303a(u26Var.f173073b) && NotificationCheckerCommon.m79220a() != NotificationCheckerCommon.State.opened && !mqi0.m155929D(CoreModule.f17545c.f19639e0.f149456q5.get().longValue())) {
            this.f25085E0.m41551N0(u26Var.f173073b);
            return;
        }
        if (u26Var.f173072a.booleanValue()) {
            this.f25085E0.m41547J0();
            return;
        }
        boolean zM41483u2 = m41483u2(u26Var.f173075d.intValue());
        ConversationsListHeadView conversationsListHeadView = this.f25085E0;
        if (zM41483u2) {
            conversationsListHeadView.m41550M0(this.f25128p0, u26Var.f173075d.intValue());
        } else {
            conversationsListHeadView.m41549L0(ConversationsListHeadView.TipType.NONE);
        }
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m41456d2(roj0 roj0Var) {
        getFeedUserStateCounter();
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m41457e2(List list, d30 d30Var, d30 d30Var2) {
        this.f25128p0.m41512L(list, true, -1);
        if (NullChecker.m81303a(d30Var)) {
            d30Var.call();
        }
        if (TextUtils.isEmpty(this.f25117f1)) {
            return;
        }
        m41488x1(this.f25117f1, d30Var, d30Var2);
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m41458f2(String str, final d30 d30Var, final d30 d30Var2) {
        final List<Conversation> arrayList = CoreModule.f17545c.f19642f0.m32892af(str).f116564a;
        if (!NullChecker.m81303a(arrayList)) {
            arrayList = new ArrayList<>();
        }
        e51.m114742G(new Runnable() { // from class: l.np6
            @Override // java.lang.Runnable
            public final void run() {
                this.f139929a.m41457e2(arrayList, d30Var, d30Var2);
            }
        });
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m41459g2(roj0 roj0Var) {
        CoreModule.m29936Q().mo67229M6().mo102425j(m41402l1());
    }

    public ConversationHeadRecommendLayout getConversationHeadRecommendLayout() {
        return this.f25085E0.getConversationHeadRecommendLayout();
    }

    public C8130e getConversationsAdapter() {
        return this.f25128p0;
    }

    public C22306c<List<Conversation>> getLimitedTrialSeeConversations() {
        return !ogl0.m164245X() ? C22306c.just(new ArrayList()) : CoreModule.f17553k.f91950m.m142002o0().m165620m();
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m41460h2(C4319c c4319c) {
        if (c4319c == C4319c.f15548i) {
            CoreModule.m29936Q().mo67229M6().mo102425j(m41402l1());
        }
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m41461i2(View view) {
        zvf0.m220399u("e_message_set_receive_verified", OMSDialogPositon.p_messages_view, j760.m140076a("switch_type", CoreModule.f17545c.f19639e0.m169490g8() ? "open" : "close"));
        new FilterVerificationUserMsgDlg(m41402l1(), FilterVerificationUserMsgDlg.FilterFrom.CONV_LIST).show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j2 */
    public final /* synthetic */ void m41462j2(j760 j760Var) {
        if (((User) j760Var.f116564a).isOpenFilterVeriMsg() && NullChecker.m81303a(j760Var.f116565b) && NullChecker.m81303a(((VerificationCenter) j760Var.f116565b).picVerificationInfo) && TEnum.equals(((VerificationCenter) j760Var.f116565b).picVerificationInfo.status, "verified")) {
            this.f25085E0.f25190z.setImageResource(x2c0.f189382H5);
        } else {
            this.f25085E0.f25190z.setImageResource(x2c0.f189351G5);
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final void m41463k1(View view) {
        kq6.m146926a(this, view);
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m41464k2(j760 j760Var) {
        m41485v2();
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ C22306c m41465l2() {
        return mkd0.m154984r(getLimitedTrialSeeConversations(), CoreModule.f17545c.f19554B2.m141778o3().distinctUntilChanged(), new x9j() { // from class: l.dp6
            @Override // p149l.x9j
            public final Object call(Object obj, Object obj2) {
                return j760.m140076a((List) obj, (String) obj2);
            }
        }).observeOn(Schedulers.m221493io()).map(new w9j() { // from class: l.ep6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ConversationsList.m41420z0((j760) obj);
            }
        }).observeOn(jo0.m142408a());
    }

    /* JADX INFO: renamed from: m1 */
    public final C22306c<List<Conversation>> m41466m1() {
        return this.f25119h1 ? CoreModule.f17545c.f19642f0.m33112rn() : CoreModule.f17545c.f19642f0.m32963gf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m41467m2(j760 j760Var) {
        List list = (List) j760Var.f116564a;
        String str = (String) j760Var.f116565b;
        if (vwb.m200296J(list)) {
            return;
        }
        boolean z = ((long) list.size()) > emr.INSTANCE.m117222d();
        if (!"expired".equals(str) && z && (SeeTrialStatusType.trialEnd.equals(str) || "waiting".equals(str))) {
            this.f25111Z0.clear();
            this.f25111Z0.addAll(list);
            CoreModule.f17545c.f19642f0.m33102qq(this.f25111Z0.get(0).latestTime);
        } else {
            this.f25111Z0.clear();
            CoreModule.f17545c.f19642f0.m33102qq(-1.0d);
        }
        m41485v2();
    }

    /* JADX INFO: renamed from: n1 */
    public final void m41468n1() {
        if (this.f25124l1) {
            return;
        }
        this.f25124l1 = true;
        m41402l1().duringCreated(mkd0.m154989w(f25081u1, this.f25096P0, this.f25097Q0, this.f25098R0, this.f25100S0, this.f25102T0, this.f25106V0, this.f25104U0, new daj() { // from class: l.eo6
            @Override // p149l.daj
            /* JADX INFO: renamed from: a */
            public final Object mo110612a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
                return vwb.m200312Z(vwb.m200312Z((q860) obj2, (List) obj3, (List) obj4, (List) obj5), (List) obj6, (List) obj7, (List) obj8);
            }
        })).onBackpressureDrop(new e30() { // from class: l.fo6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f98508a.m41435I1((knb0) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.go6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f103655a.m41436J1((knb0) obj);
            }
        }, new e30() { // from class: l.ho6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationsList.m41369U0((Throwable) obj);
            }
        }));
        C22306c<q860<Conversation>> c22306cM33164vn = CoreModule.f17545c.f19642f0.m33164vn();
        C22392a<q860<Conversation>> c22392a = this.f25096P0;
        Objects.requireNonNull(c22392a);
        c22306cM33164vn.subscribe(new io6(c22392a));
        C22306c<List<Conversation>> c22306cM33138tn = CoreModule.f17545c.f19642f0.m33138tn();
        C22392a<List<Conversation>> c22392a2 = this.f25097Q0;
        Objects.requireNonNull(c22392a2);
        c22306cM33138tn.subscribe(new v76(c22392a2));
        C22306c<List<Conversation>> c22306cM33193yf = CoreModule.f17545c.f19642f0.m33193yf();
        C22392a<List<Conversation>> c22392a3 = this.f25098R0;
        Objects.requireNonNull(c22392a3);
        c22306cM33193yf.subscribe(new v76(c22392a3));
        C22306c<List<Conversation>> c22306cM32739Ng = CoreModule.f17545c.f19642f0.m32739Ng();
        C22392a<List<Conversation>> c22392a4 = this.f25100S0;
        Objects.requireNonNull(c22392a4);
        c22306cM32739Ng.subscribe(new v76(c22392a4));
        C22306c<List<Conversation>> c22306cM32950eq = CoreModule.f17545c.f19642f0.m32950eq();
        C22392a<List<Conversation>> c22392a5 = this.f25102T0;
        Objects.requireNonNull(c22392a5);
        c22306cM32950eq.subscribe(new v76(c22392a5));
        C22306c<List<Conversation>> c22306cM33119sh = CoreModule.f17545c.f19642f0.m33119sh();
        C22392a<List<Conversation>> c22392a6 = this.f25104U0;
        Objects.requireNonNull(c22392a6);
        c22306cM33119sh.subscribe(new v76(c22392a6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m41469n2(j760 j760Var) {
        int currentSortType = this.f25085E0.getCurrentSortType();
        if (NullChecker.m81303a(this.f25085E0)) {
            if (currentSortType == 9 && NullChecker.m81303a(((q860) j760Var.f116564a).f153135a)) {
                this.f25110Y0 = ((q860) j760Var.f116564a).f153135a;
            } else if (currentSortType == 10 && NullChecker.m81303a(((q860) j760Var.f116565b).f153135a)) {
                this.f25110Y0 = ((q860) j760Var.f116565b).f153135a;
            }
            m41331B2(true);
        }
    }

    /* JADX INFO: renamed from: o1 */
    public final void m41470o1() {
        m41402l1().duringCreated(mkd0.m154985s(f25080t1, f25079s1, this.f25095O0.distinctUntilChanged(), new y9j() { // from class: l.ro6
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return j760.m140076a((List) obj2, (Integer) obj3);
            }
        })).onBackpressureDrop(new e30() { // from class: l.so6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f165549a.m41437K1((j760) obj);
            }
        }).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.to6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171320a.m41438L1((j760) obj);
            }
        }));
        if (this.f25119h1) {
            m41402l1().duringCreated(CoreModule.f17545c.f19642f0.m33112rn()).subscribe(mkd0.m154955G(new e30() { // from class: l.uo6
                @Override // p149l.e30
                public final void call(Object obj) {
                    ConversationsList.f25079s1.m132487l((List) obj);
                }
            }));
        } else {
            m41402l1().duringCreated((C22306c) f25083w1.switchMap(new w9j() { // from class: l.vo6
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return CoreModule.f17545c.f19642f0.m33008jn(false);
                }
            })).subscribe(mkd0.m154955G(new e30() { // from class: l.wo6
                @Override // p149l.e30
                public final void call(Object obj) {
                    ConversationsList.f25079s1.m132487l((List) obj);
                }
            }));
        }
        C22306c<Integer> totalLiker = getTotalLiker();
        final C22392a<Integer> c22392a = this.f25095O0;
        Objects.requireNonNull(c22392a);
        totalLiker.subscribe(new e30() { // from class: l.xo6
            @Override // p149l.e30
            public final void call(Object obj) {
                c22392a.m132487l((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m41471o2(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        if (NullChecker.m81303a(this.f25115d1)) {
            this.f25115d1.mo41988g(i4, false);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41463k1(this);
        this.f25121j1 = this.f25107W;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f25130q1 = MotionEvent.obtain(motionEvent).getX();
        } else if (action == 2 && Math.abs(motionEvent.getX() - this.f25130q1) > this.f25129p1) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX INFO: renamed from: p1 */
    public void m41472p1(boolean z) {
        this.f25119h1 = z;
        this.f25105V.setCrashLogFlag("ConversationsList");
        this.f25085E0 = (ConversationsListHeadView) m41402l1().inflater().inflate(f6c0.f95799ge, (ViewGroup) null, false);
        if (!z) {
            getConversationHeadRecommendLayout().m40763V();
        }
        this.f25105V.addHeaderView(this.f25085E0, null, true);
        this.f25105V.setHeaderDividersEnabled(false);
        C8130e c8130e = new C8130e();
        this.f25128p0 = c8130e;
        this.f25105V.setAdapter((ListAdapter) c8130e);
        this.f25105V.setRecyclerListener(this.f25128p0);
        this.f25105V.addFooterView(new View(m41402l1()));
        this.f25105V.setNestedScrollingEnabled(true);
        if (upa.m194746e3()) {
            this.f25103U.setClipChildren(false);
            this.f25105V.setClipChildren(false);
        }
        this.f25099S.setOnRefreshListener(this);
        this.f25099S.setColorSchemeResources(w0c0.f183790N1, w0c0.f183781K1, w0c0.f183784L1, w0c0.f183787M1);
        this.f25129p1 = ViewConfiguration.get(m41402l1()).getScaledTouchSlop();
        m41477r2();
        if (wf6.m202950e()) {
            this.f25105V.setOnItemClickListener(new C8126a());
            this.f25105V.setOnItemLongClickListener(new C8127b());
        }
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m41473p2(Notification notification) {
        this.f25099S.setRefreshing(false);
        if (notification.m221299j()) {
            yij0.m214926D(notification.m221294e());
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0700j
    /* JADX INFO: renamed from: q */
    public void mo4094q() {
        if (this.f25094N0) {
            CoreModule.f17545c.f19642f0.m32959fn(null).materialize().first().subscribe(mkd0.m154955G(new e30() { // from class: l.sn6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f165413a.m41473p2((Notification) obj);
                }
            }));
        } else {
            CoreModule.f17545c.f19642f0.m32650Fo().materialize().first().subscribe(mkd0.m154955G(new e30() { // from class: l.do6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f87131a.m41475q2((Notification) obj);
                }
            }));
        }
        CoreModule.f17545c.f19579K0.m176989x3().m132487l(Optional.m15413of(roj0.f160388a));
    }

    /* JADX INFO: renamed from: q1 */
    public final String m41474q1(boolean z) {
        LinkedHashMap<String, UserLiveLabel> linkedHashMapM41476r1 = m41476r1(z);
        if (linkedHashMapM41476r1 == null || linkedHashMapM41476r1.isEmpty()) {
            return null;
        }
        return linkedHashMapM41476r1.entrySet().iterator().next().getValue().userId;
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m41475q2(Notification notification) {
        this.f25099S.setRefreshing(false);
        if (notification.m221299j()) {
            yij0.m214926D(notification.m221294e());
        }
    }

    /* JADX INFO: renamed from: r1 */
    public final LinkedHashMap<String, UserLiveLabel> m41476r1(boolean z) {
        return z ? CoreModule.f17545c.f19642f0.f19846B2.m221515e() : CoreModule.f17545c.f19642f0.f19849C2.m221515e();
    }

    /* JADX INFO: renamed from: r2 */
    public void m41477r2() {
        this.f25105V.setOverScrollListener(new VList.InterfaceC22544a() { // from class: l.hn6
            @Override // p147v.VList.InterfaceC22544a
            /* JADX INFO: renamed from: a */
            public final void mo131882a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
                this.f108585a.m41471o2(i, i2, i3, i4, i5, i6, i7, i8, z);
            }
        });
        this.f25105V.setOnScrollListener(new C8128c());
    }

    /* JADX INFO: renamed from: s1 */
    public void m41478s1(ConversationListFrag conversationListFrag) {
        FrameLayout.LayoutParams layoutParams;
        this.f25120i1 = conversationListFrag;
        if (!isInEditMode()) {
            if (u59.m191796E()) {
                if (u59.m191796E()) {
                    this.f25115d1 = new WengWengHeaderView(m41402l1());
                    layoutParams = new FrameLayout.LayoutParams(-1, 0);
                } else if (ogl0.m164237P()) {
                    this.f25115d1 = new NewQuickChatAudioHeader(m41402l1());
                    layoutParams = new FrameLayout.LayoutParams(-1, 0);
                } else {
                    this.f25115d1 = new QuickChatHeaderView(m41402l1());
                    layoutParams = new FrameLayout.LayoutParams(-1, t100.f167256e);
                    QuickChatHeaderBaseView quickChatHeaderBaseView = this.f25115d1;
                    int i = t100.f167261j;
                    quickChatHeaderBaseView.setPadding(i, 0, i, 0);
                    this.f25115d1.setBackgroundColor(Color.parseColor("#ffffff"));
                }
                this.f25101T.addView(this.f25115d1, layoutParams);
                this.f25099S.setEnabled(false);
                this.f25115d1.setAct(m41402l1());
                this.f25115d1.mo41985d(this);
                this.f25101T.setHeadView(this.f25115d1);
                this.f25101T.setConversationsList(this);
                this.f25085E0.m41543E0(this.f25115d1.getInitHeight());
                boolean zM194637G0 = upa.m194637G0();
                ConversationFilterLayout conversationFilterLayout = this.f25121j1;
                if (zM194637G0) {
                    xdl0.m208344M(conversationFilterLayout, true);
                    this.f25121j1.m40694D(this, new Runnable() { // from class: l.dm6
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f86902a.m41481t2();
                        }
                    }, new Runnable() { // from class: l.pm6
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f150193a.m41453a2();
                        }
                    });
                    m41431F2();
                } else {
                    xdl0.m208344M(conversationFilterLayout, false);
                }
                this.f25115d1.setChangeHeightListrener(new e30() { // from class: l.tm6
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        this.f171133a.m41454b2((Integer) obj);
                    }
                });
            }
            this.f25085E0.init();
            this.f25085E0.setFilterPopShow(new Runnable() { // from class: l.um6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f177197a.m41468n1();
                }
            });
            if (!this.f25119h1 && conversationListFrag != null) {
                conversationListFrag.m41100j5().m175379a(this.f25085E0.f25182r);
            }
            if (upa.m194726a2()) {
                m41402l1().duringCreated(CoreModule.f17545c.f19642f0.m32652Fq()).subscribe(mkd0.m154955G(new e30() { // from class: l.vm6
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ConversationsList.f25082v1.m132487l(roj0.f160388a);
                    }
                }));
            }
            xdl0.m208344M(this.f25085E0.f25177m, true);
            ConversationHeadRecommendLayout conversationHeadRecommendLayout = getConversationHeadRecommendLayout();
            xdl0.m208344M(conversationHeadRecommendLayout, true);
            conversationHeadRecommendLayout.m40776k0(null);
            e51.m114743H(m41402l1(), new Runnable() { // from class: l.xm6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f193532a.m41444R1();
                }
            }, 1000L);
            m41489x2();
            m41402l1().duringCreated(new v9j() { // from class: l.ym6
                @Override // p149l.v9j, java.util.concurrent.Callable
                public final Object call() {
                    return this.f198963a.m41445S1();
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.zm6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f203698a.m41446T1((roj0) obj);
                }
            }));
            m41484v1();
            m41402l1().duringCreated(CoreModule.f17545c.f19639e0.m169419N7()).subscribe(mkd0.m154955G(new e30() { // from class: l.an6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f70712a.m41447U1((Map) obj);
                }
            }));
        }
        if (ke50.m145717d()) {
            m41402l1().duringCreated(OnlineMatchManager.m50143z().f32586A).filter(new w9j() { // from class: l.bn6
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
                }
            }).subscribe(mkd0.m154956H(new e30() { // from class: l.em6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f92185a.m41448V1((String) obj);
                }
            }, new e30() { // from class: l.fm6
                @Override // p149l.e30
                public final void call(Object obj) {
                    ConversationsList.m41366T((Throwable) obj);
                }
            }));
            if (!OnlineMatchManager.m50143z().f32608l.get().booleanValue()) {
                m41402l1().duringCreated(this.f25096P0.observeOn(Schedulers.m221493io()).filter(new w9j() { // from class: l.gm6
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(!OnlineMatchManager.m50143z().f32608l.get().booleanValue());
                    }
                }).take(1).onBackpressureDrop().map(new w9j() { // from class: l.hm6
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ConversationsList.m41377Y0((q860) obj);
                    }
                }).filter(new w9j() { // from class: l.im6
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return ConversationsList.m41418y0((Boolean) obj);
                    }
                }).take(1).observeOn(jo0.m142408a())).subscribe(mkd0.m154956H(new e30() { // from class: l.jm6
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ConversationsList.m41416x0((Boolean) obj);
                    }
                }, new e30() { // from class: l.km6
                    @Override // p149l.e30
                    public final void call(Object obj) {
                        ConversationsList.m41375X0((Throwable) obj);
                    }
                }));
            }
        }
        m41402l1().duringCreated(CoreModule.f17545c.f19642f0.m33180xe().throttleFirst(5L, TimeUnit.MINUTES)).subscribe(mkd0.m154955G(new e30() { // from class: l.mm6
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19642f0.m33009jo();
            }
        }));
        m41402l1().duringCreated(g050.m123952c()).distinctUntilChanged().subscribe(mkd0.m154955G(new e30() { // from class: l.nm6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f139613a.m41449W1((Boolean) obj);
            }
        }));
        m41402l1().duringCreated(new v9j() { // from class: l.om6
            @Override // p149l.v9j, java.util.concurrent.Callable
            public final Object call() {
                return CoreModule.f17545c.f19555C0.m210111u3(SummarizedPrivilegesId.get("seeWhoLikedMe"));
            }
        }).subscribe(mkd0.m154955G(new e30() { // from class: l.qm6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f155283a.m41450X1((UserPrivilege) obj);
            }
        }));
        if (ke50.m145718e()) {
            m41402l1().duringCreated(((NewMainAct) m41402l1()).m39819i7()).filter(new w9j() { // from class: l.rm6
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return this.f160063a.m41451Y1((TabName) obj);
                }
            }).subscribe(mkd0.m154955G(new e30() { // from class: l.sm6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f165327a.m41452Z1((TabName) obj);
                }
            }));
        }
        m41480t1();
        m41422A1();
        m41482u1();
        m41486w1();
        m41424C1();
        m41423B1();
        m41492z1();
    }

    /* JADX INFO: renamed from: s2 */
    public final void m41479s2(long j, long j2, String str) {
        long j3 = j2 - j;
        if (j3 < 32) {
            return;
        }
        CrashHelper.m81296c(new IllegalStateException("ConversationsList processLiveState IllegalStateException ", new IllegalStateException("ConversationsList processLiveState tag " + str + " during " + j3)));
    }

    /* JADX INFO: renamed from: t1 */
    public final void m41480t1() {
        this.f25120i1.duringCreated(C22306c.combineLatest(getPicCerGuideObs(), getWechatNotifyObs(), getSortInvalidConvObs(), getWeakenedTipsObs(), new z9j() { // from class: l.dn6
            @Override // p149l.z9j
            /* JADX INFO: renamed from: b */
            public final Object mo100621b(Object obj, Object obj2, Object obj3, Object obj4) {
                return new u26((Boolean) obj, (WechatNotifySetting) obj2, (Boolean) obj3, (Integer) obj4);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.en6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f92280a.m41455c2((u26) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t2 */
    public void m41481t2() {
        ConvCellList convCellList = this.f25105V;
        if (convCellList == null) {
            return;
        }
        convCellList.setSelection(0);
        m41431F2();
    }

    /* JADX INFO: renamed from: u1 */
    public final void m41482u1() {
        boolean zM178035m = r65.m178035m();
        ConversationsListHeadView conversationsListHeadView = this.f25085E0;
        if (zM178035m) {
            conversationsListHeadView.f25181q.m40663l(this.f25120i1, "", 1);
        } else {
            conversationsListHeadView.f25181q.m40659h();
        }
    }

    /* JADX INFO: renamed from: u2 */
    public final boolean m41483u2(int i) {
        MessageFilterConfig messageFilterConfigM194843y0 = upa.m194843y0();
        if (messageFilterConfigM194843y0 != null && i > 1) {
            long jM155944o = mqi0.m155944o();
            boolean z = jM155944o > CoreModule.f17545c.f19639e0.f149174F5.get().longValue();
            boolean zBooleanValue = CoreModule.f17545c.f19642f0.f19982v0.get().booleanValue();
            boolean zBooleanValue2 = CoreModule.f17545c.f19642f0.m32917cg().get().booleanValue();
            if (z && zBooleanValue && !zBooleanValue2) {
                if (this.f25085E0.f25165O == null) {
                    if (jM155944o - CoreModule.f17545c.f19639e0.f149160D5.get().longValue() <= TimeUnit.DAYS.toMillis(messageFilterConfigM194843y0.shownDayLimit)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v1 */
    public final void m41484v1() {
        m41470o1();
        m41426D1();
        m41428E1();
        m41490y1();
        if (CoreModule.m29934N().mo60353fs()) {
            PutongAct putongActM41402l1 = m41402l1();
            C4743i c4743i = CoreModule.f17545c.f19676q1;
            putongActM41402l1.duringCreated(C4743i.f20009S).subscribe(mkd0.m154955G(new e30() { // from class: l.yn6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f199146a.m41456d2((roj0) obj);
                }
            }));
            this.f25120i1.lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.zn6
                @Override // p149l.e30
                public final void call(Object obj) {
                    ConversationsList.m41405o0((C4319c) obj);
                }
            }));
        }
        m41402l1().lifecycle().filter(new w9j() { // from class: l.ao6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).subscribe(mkd0.m154956H(new e30() { // from class: l.bo6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationsList.f25081u1.m132487l(roj0.f160388a);
            }
        }, new e30() { // from class: l.co6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationsList.m41411u0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v2 */
    public void m41485v2() {
        if (NullChecker.m81303a(this.f25128p0)) {
            this.f25128p0.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: w1 */
    public final void m41486w1() {
        CoreModule.f17545c.f19642f0.m33036lp();
        CoreModule.f17545c.f19642f0.m33088pp();
    }

    /* JADX INFO: renamed from: w2 */
    public void m41487w2() {
        if (NullChecker.m81303a(this.f25128p0)) {
            this.f25128p0.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void m41488x1(final String str, final d30 d30Var, final d30 d30Var2) {
        this.f25123k1 = d30Var2;
        this.f25116e1 = false;
        e51.m114774y(new Runnable() { // from class: l.mp6
            @Override // java.lang.Runnable
            public final void run() {
                this.f135010a.m41458f2(str, d30Var, d30Var2);
            }
        });
    }

    /* JADX INFO: renamed from: x2 */
    public final void m41489x2() {
        if (upa.m194726a2()) {
            m41402l1().duringCreated(m41432G1() ? CoreModule.f17545c.f19642f0.m32652Fq() : CoreModule.f17545c.f19642f0.m33214zn()).subscribe(mkd0.m154955G(new e30() { // from class: l.mn6
                @Override // p149l.e30
                public final void call(Object obj) {
                    ConversationsList.m41328A2();
                }
            }));
        }
    }

    /* JADX INFO: renamed from: y1 */
    public final void m41490y1() {
        m41402l1().duringCreated(CoreModule.m29936Q().mo67229M6().mo102435t()).observeOn(Schedulers.m221493io()).subscribe(mkd0.m154956H(new e30() { // from class: l.fp6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationsList.m41328A2();
            }
        }, new e30() { // from class: l.gp6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationsList.m41348K((Throwable) obj);
            }
        }));
        m41402l1().duringCreated(CoreModule.m29936Q().mo67229M6().mo102421f()).subscribe(mkd0.m154956H(new e30() { // from class: l.hp6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f108898a.m41459g2((roj0) obj);
            }
        }, new e30() { // from class: l.ip6
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationsList.m41394h0((Throwable) obj);
            }
        }));
        this.f25120i1.lifecycle().subscribe(mkd0.m154955G(new e30() { // from class: l.jp6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f119084a.m41460h2((C4319c) obj);
            }
        }));
        CoreModule.m29936Q().mo67229M6().mo102425j(m41402l1());
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
    public final List<Conversation> m41491y2(List<Conversation> list, boolean z) {
        LinkedHashMap<String, UserLiveLabel> linkedHashMapM33207zg;
        String strM41474q1;
        long j;
        int i;
        Conversation conversation;
        List<Conversation> list2 = list;
        if (upa.m194726a2() && !vwb.m200296J(list2) && !this.f25099S.m4079i() && (linkedHashMapM33207zg = CoreModule.f17545c.f19642f0.m33207zg(z)) != null && !linkedHashMapM33207zg.isEmpty()) {
            long jM155944o = mqi0.m155944o();
            HashSet<String> hashSetM33157vg = CoreModule.f17545c.f19642f0.m33157vg(z);
            int iMin = Math.min(list2.size(), 40);
            int i2 = z ? 1 : 2;
            if (!linkedHashMapM33207zg.isEmpty()) {
                int i3 = 0;
                while (true) {
                    if (i3 < Math.min(3, iMin)) {
                        if (!m41430F1(list2.get(i3), linkedHashMapM33207zg)) {
                            i3++;
                        }
                    } else if (list2.size() > 3) {
                        strM41474q1 = m41474q1(z);
                        if (TextUtils.isEmpty(strM41474q1)) {
                            m41479s2(jM155944o, mqi0.m155944o(), "1");
                            return list2;
                        }
                        j = jM155944o;
                        i = 0;
                        while (true) {
                            if (i < Math.min(40, list2.size())) {
                                conversation = null;
                                break;
                            }
                            if (TextUtils.equals(list2.get(i).f56011id, strM41474q1)) {
                                conversation = list2.get(i);
                                break;
                            }
                            i++;
                        }
                        if (conversation == null) {
                            m41479s2(j, mqi0.m155944o(), "2");
                            return list2;
                        }
                        fel felVar = new fel(list2, 40);
                        felVar.remove(conversation);
                        felVar.add(i2, conversation);
                        m41479s2(j, mqi0.m155943n(), "insert");
                        list2 = felVar;
                    }
                    j = jM155944o;
                }
            } else if (list2.size() > 3) {
                strM41474q1 = m41474q1(z);
                if (TextUtils.isEmpty(strM41474q1)) {
                    m41479s2(jM155944o, mqi0.m155944o(), "1");
                    return list2;
                }
                j = jM155944o;
                i = 0;
                while (true) {
                    if (i < Math.min(40, list2.size())) {
                        conversation = null;
                        break;
                    }
                    if (TextUtils.equals(list2.get(i).f56011id, strM41474q1)) {
                        conversation = list2.get(i);
                        break;
                    }
                    i++;
                }
                if (conversation == null) {
                    m41479s2(j, mqi0.m155944o(), "2");
                    return list2;
                }
                fel felVar2 = new fel(list2, 40);
                felVar2.remove(conversation);
                felVar2.add(i2, conversation);
                m41479s2(j, mqi0.m155943n(), "insert");
                list2 = felVar2;
            } else {
                j = jM155944o;
            }
            if (!hashSetM33157vg.isEmpty()) {
                m41479s2(j, mqi0.m155944o(), "3");
                return list2;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (!linkedHashMapM33207zg.isEmpty()) {
                int i4 = 6;
                for (int i5 = 0; i5 < iMin; i5++) {
                    Conversation conversation2 = list2.get(i5);
                    if (m41430F1(conversation2, linkedHashMapM33207zg)) {
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
                            hashSetM33157vg.add(((Conversation) it.next()).f56011id);
                            i6--;
                            if (i6 == 0) {
                                break;
                            }
                        }
                        if (i6 > 0) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                hashSetM33157vg.add(((Conversation) it2.next()).f56011id);
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
            if (!vwb.m200296J(hashSetM33157vg)) {
                int i7 = 0;
                for (int i8 = 0; i8 < iMin; i8++) {
                    Conversation conversation3 = list2.get(i8);
                    i7 = hashSetM33157vg.contains(conversation3.f56011id) ? i7 + 1 : 0;
                    if (i7 == 3) {
                        hashSetM33157vg.remove(conversation3.f56011id);
                        i7 = 0;
                    }
                }
            }
            m41479s2(j, mqi0.m155944o(), "4");
        }
        return list2;
    }

    /* JADX INFO: renamed from: z1 */
    public final void m41492z1() {
        if (CoreModule.m29936Q().mo67229M6().mo102418c()) {
            m41402l1().duringCreated(CoreModule.m29936Q().mo67229M6().mo102428m()).observeOn(jo0.m142408a()).subscribe(mkd0.m154956H(new e30() { // from class: l.wn6
                @Override // p149l.e30
                public final void call(Object obj) {
                    ConversationsList.m41328A2();
                }
            }, new e30() { // from class: l.xn6
                @Override // p149l.e30
                public final void call(Object obj) {
                    ConversationsList.m41392g0((Throwable) obj);
                }
            }));
        }
    }

    public ConversationsList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25122k0 = null;
        this.f25086F0 = 23;
        this.f25087G0 = 39;
        this.f25088H0 = 40;
        this.f25089I0 = 41;
        this.f25090J0 = 42;
        this.f25091K0 = 43;
        this.f25092L0 = 45;
        this.f25093M0 = C22392a.m221513c(roj0.f160388a);
        this.f25094N0 = false;
        this.f25095O0 = C22392a.m221513c(0);
        this.f25096P0 = C22392a.m221513c(q860.m173342b());
        this.f25097Q0 = C22392a.m221513c(new ArrayList());
        this.f25098R0 = C22392a.m221513c(new ArrayList());
        this.f25100S0 = C22392a.m221513c(new ArrayList());
        this.f25102T0 = C22392a.m221513c(new ArrayList());
        this.f25104U0 = C22392a.m221513c(new ArrayList());
        this.f25106V0 = C22392a.m221513c(new ArrayList());
        this.f25108W0 = C22392a.m221513c(q860.m173342b());
        this.f25109X0 = C22392a.m221513c(q860.m173342b());
        this.f25110Y0 = new ArrayList();
        this.f25111Z0 = new ArrayList();
        this.f25113b1 = false;
        this.f25114c1 = false;
        this.f25116e1 = false;
        this.f25117f1 = null;
        this.f25118g1 = false;
        this.f25119h1 = false;
        this.f25124l1 = false;
        this.f25125m1 = 6;
        this.f25126n1 = 40;
        this.f25127o1 = 50;
    }
}
