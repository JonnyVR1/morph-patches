package com.p051p1.mobile.putong.core.newui.messages;

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
import com.p051p1.mobile.android.app.App;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.api.C4891g;
import com.p051p1.mobile.putong.core.api.C4894i;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.data.CertificationNewConfig;
import com.p051p1.mobile.putong.core.data.ChatGroup;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.data.ConversationRefreshIntervalConfig;
import com.p051p1.mobile.putong.core.data.ConversationType;
import com.p051p1.mobile.putong.core.data.CoreFeedStateCounter;
import com.p051p1.mobile.putong.core.data.InsertConversationsList;
import com.p051p1.mobile.putong.core.data.MessageFilterConfig;
import com.p051p1.mobile.putong.core.data.SeeSwitchName;
import com.p051p1.mobile.putong.core.data.SeeTrialStatusType;
import com.p051p1.mobile.putong.core.data.SummarizedPrivilegesId;
import com.p051p1.mobile.putong.core.data.UserPrivilege;
import com.p051p1.mobile.putong.core.data.VerificationCenter;
import com.p051p1.mobile.putong.core.data.WechatNotifySetting;
import com.p051p1.mobile.putong.core.newui.group.GroupSuggestAct;
import com.p051p1.mobile.putong.core.newui.main.NewMainAct;
import com.p051p1.mobile.putong.core.newui.messages.ConversationsList;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.NewQuickChatAudioHeader;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.PullQuickChatLayout;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderBaseView;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.QuickChatHeaderView;
import com.p051p1.mobile.putong.core.newui.messages.anim.view.wengweng.WengWengHeaderView;
import com.p051p1.mobile.putong.core.newui.messages.business.BusinessConversationView;
import com.p051p1.mobile.putong.core.newui.messages.business.IntlVisitorConversationView;
import com.p051p1.mobile.putong.core.p058ui.filter.FilterVerificationUserMsgDlg;
import com.p051p1.mobile.putong.core.p058ui.onlinematch.OnlineMatchManager;
import com.p051p1.mobile.putong.data.Links;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.data.UserLiveLabel;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import com.p051p1.mobile.putong.newui.main.base.TabName;
import com.p051p1.mobile.putong.notifications.NotificationCheckerCommon;
import com.p051p1.mobile.putong.p054ab.IntlCountryCodeController;
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
import p137rx.C22421c;
import p137rx.Notification;
import p137rx.schedulers.Schedulers;
import p137rx.subjects.C22507a;
import p151v.VFrame;
import p151v.VImage;
import p151v.VLinear;
import p151v.VList;
import p151v.VText;
import p153l.Cfor;
import p153l.a96;
import p153l.adc0;
import p153l.aw90;
import p153l.bnl0;
import p153l.bsj0;
import p153l.c9c0;
import p153l.cq6;
import p153l.csp;
import p153l.d79;
import p153l.dbc0;
import p153l.dji;
import p153l.dpr;
import p153l.dq1;
import p153l.fcp;
import p153l.fo0;
import p153l.gra;
import p153l.h39;
import p153l.i4g0;
import p153l.joa;
import p153l.jxb0;
import p153l.jyb;
import p153l.kec0;
import p153l.l51;
import p153l.l9c;
import p153l.lp6;
import p153l.nr6;
import p153l.nrb0;
import p153l.ovb0;
import p153l.p560;
import p153l.pcj;
import p153l.pf60;
import p153l.pm6;
import p153l.psd0;
import p153l.pzi0;
import p153l.qa00;
import p153l.qcj;
import p153l.r8n;
import p153l.rbb0;
import p153l.rcj;
import p153l.rm50;
import p153l.ro6;
import p153l.s75;
import p153l.scj;
import p153l.sfj0;
import p153l.spl0;
import p153l.tcj;
import p153l.tzi0;
import p153l.u46;
import p153l.ue6;
import p153l.uqb0;
import p153l.uxj0;
import p153l.v850;
import p153l.vg60;
import p153l.vgl;
import p153l.vx6;
import p153l.wyb0;
import p153l.x20;
import p153l.xcj;
import p153l.y20;
import p153l.z36;
import p153l.zg6;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationsList extends SwipeRefreshLayout implements SwipeRefreshLayout.InterfaceC0702j {

    /* JADX INFO: renamed from: r1 */
    public static int f25820r1;

    /* JADX INFO: renamed from: s1 */
    public static C22507a<List<Conversation>> f25821s1 = C22507a.m222759c(new ArrayList());

    /* JADX INFO: renamed from: t1 */
    public static C22507a<uxj0> f25822t1;

    /* JADX INFO: renamed from: u1 */
    public static C22507a<uxj0> f25823u1;

    /* JADX INFO: renamed from: v1 */
    public static C22507a<uxj0> f25824v1;

    /* JADX INFO: renamed from: w1 */
    public static C22507a<uxj0> f25825w1;

    /* JADX INFO: renamed from: x1 */
    public static final C8280d f25826x1;

    /* JADX INFO: renamed from: E0 */
    public ConversationsListHeadView f25827E0;

    /* JADX INFO: renamed from: F0 */
    public final int f25828F0;

    /* JADX INFO: renamed from: G0 */
    public final int f25829G0;

    /* JADX INFO: renamed from: H0 */
    public final int f25830H0;

    /* JADX INFO: renamed from: I0 */
    public final int f25831I0;

    /* JADX INFO: renamed from: J0 */
    public final int f25832J0;

    /* JADX INFO: renamed from: K0 */
    public final int f25833K0;

    /* JADX INFO: renamed from: L0 */
    public final int f25834L0;

    /* JADX INFO: renamed from: M0 */
    public C22507a<uxj0> f25835M0;

    /* JADX INFO: renamed from: N0 */
    public boolean f25836N0;

    /* JADX INFO: renamed from: O0 */
    public C22507a<Integer> f25837O0;

    /* JADX INFO: renamed from: P0 */
    public C22507a<vg60<Conversation>> f25838P0;

    /* JADX INFO: renamed from: Q0 */
    public C22507a<List<Conversation>> f25839Q0;

    /* JADX INFO: renamed from: R0 */
    public C22507a<List<Conversation>> f25840R0;

    /* JADX INFO: renamed from: S */
    public ConversationsList f25841S;

    /* JADX INFO: renamed from: S0 */
    public C22507a<List<Conversation>> f25842S0;

    /* JADX INFO: renamed from: T */
    public PullQuickChatLayout f25843T;

    /* JADX INFO: renamed from: T0 */
    public C22507a<List<Conversation>> f25844T0;

    /* JADX INFO: renamed from: U */
    public FrameLayout f25845U;

    /* JADX INFO: renamed from: U0 */
    public C22507a<List<Conversation>> f25846U0;

    /* JADX INFO: renamed from: V */
    public ConvCellList f25847V;

    /* JADX INFO: renamed from: V0 */
    public C22507a<List<Conversation>> f25848V0;

    /* JADX INFO: renamed from: W */
    public ConversationFilterLayout f25849W;

    /* JADX INFO: renamed from: W0 */
    public C22507a<vg60<Conversation>> f25850W0;

    /* JADX INFO: renamed from: X0 */
    public C22507a<vg60<Conversation>> f25851X0;

    /* JADX INFO: renamed from: Y0 */
    public List<Conversation> f25852Y0;

    /* JADX INFO: renamed from: Z0 */
    public List<Conversation> f25853Z0;

    /* JADX INFO: renamed from: a1 */
    public boolean f25854a1;

    /* JADX INFO: renamed from: b1 */
    public boolean f25855b1;

    /* JADX INFO: renamed from: c1 */
    public boolean f25856c1;

    /* JADX INFO: renamed from: d1 */
    public QuickChatHeaderBaseView f25857d1;

    /* JADX INFO: renamed from: e1 */
    public boolean f25858e1;

    /* JADX INFO: renamed from: f1 */
    public String f25859f1;

    /* JADX INFO: renamed from: g1 */
    public boolean f25860g1;

    /* JADX INFO: renamed from: h1 */
    public boolean f25861h1;

    /* JADX INFO: renamed from: i1 */
    public ConversationListFrag f25862i1;

    /* JADX INFO: renamed from: j1 */
    public ConversationFilterLayout f25863j1;

    /* JADX INFO: renamed from: k0 */
    public Boolean f25864k0;

    /* JADX INFO: renamed from: k1 */
    public x20 f25865k1;

    /* JADX INFO: renamed from: l1 */
    public boolean f25866l1;

    /* JADX INFO: renamed from: m1 */
    public final int f25867m1;

    /* JADX INFO: renamed from: n1 */
    public final int f25868n1;

    /* JADX INFO: renamed from: o1 */
    public final int f25869o1;

    /* JADX INFO: renamed from: p0 */
    public C8281e f25870p0;

    /* JADX INFO: renamed from: p1 */
    public int f25871p1;

    /* JADX INFO: renamed from: q1 */
    public float f25872q1;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationsList$a */
    public class C8277a implements AdapterView.OnItemClickListener {
        public C8277a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (view instanceof ConversationItemView) {
                ((ConversationItemView) view).f25675t.call();
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationsList$b */
    public class C8278b implements AdapterView.OnItemLongClickListener {
        public C8278b() {
        }

        @Override // android.widget.AdapterView.OnItemLongClickListener
        public boolean onItemLongClick(AdapterView<?> adapterView, View view, int i, long j) {
            if (view instanceof ConversationItemView) {
                return ((ConversationItemView) view).f25676u.call().booleanValue();
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationsList$c */
    public class C8279c implements AbsListView.OnScrollListener {
        public C8279c() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i, int i2, int i3) {
            if (absListView.getChildCount() <= 0) {
                return;
            }
            if (gra.m131672d3() || gra.m131568G0()) {
                ConversationsList.this.m42442F2();
            }
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i) {
            if (i == 0) {
                C4891g c4891g = CoreModule.f18264c.f20384f0;
                p560 p560Var = c4891g.f20634R;
                p560Var.f150611a = false;
                p560Var.m170616e(c4891g.f20637S, false);
                if (NullChecker.m82486a(ConversationsList.this.f25857d1)) {
                    ConversationsList.this.f25857d1.mo42998f();
                }
                ConversationsList.this.f25847V.m41608e();
            } else {
                if (!CoreModule.f18264c.f20384f0.f20634R.f150611a) {
                    ConversationsList.this.f25847V.m41607d();
                }
                CoreModule.f18264c.f20384f0.f20634R.f150611a = true;
            }
            if (i == 1) {
                C4499d.m21895l().m21899k("showNewMatchUserGuidePop");
                C4499d.m21895l().m21899k("newUserShowGuidePop");
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationsList$d */
    public static class C8280d {

        /* JADX INFO: renamed from: a */
        public long f25876a;

        /* JADX INFO: renamed from: b */
        public boolean f25877b;

        /* JADX INFO: renamed from: c */
        public final Runnable f25878c;

        public C8280d() {
            this.f25876a = 0L;
            this.f25877b = false;
            this.f25878c = new Runnable() { // from class: l.sq6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f170147a.m42506c();
                }
            };
        }

        /* JADX INFO: renamed from: b */
        public void m42505b() {
            this.f25876a = 0L;
            l51.m152890J(this.f25878c);
        }

        /* JADX INFO: renamed from: c */
        public final /* synthetic */ void m42506c() {
            ConversationsList.f25822t1.m137019l(uxj0.f181467a);
            this.f25876a = SystemClock.elapsedRealtime();
            this.f25877b = false;
            ue6.m195658C("ConversationList refreshObs onNext(Unit.UNIT)");
        }

        /* JADX INFO: renamed from: d */
        public void m42507d() {
            ConversationRefreshIntervalConfig conversationRefreshIntervalConfigM131718n = gra.m131718n();
            long j = NullChecker.m82486a(conversationRefreshIntervalConfigM131718n) ? conversationRefreshIntervalConfigM131718n.conversationRefreshObsInterval * 1000 : 0;
            if (Math.abs(SystemClock.elapsedRealtime() - this.f25876a) >= j) {
                this.f25878c.run();
            } else {
                if (this.f25877b) {
                    return;
                }
                this.f25877b = true;
                l51.m152888H(App.f16088e, this.f25878c, j);
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationsList$e */
    public class C8281e extends dq1<Conversation> implements u46 {

        /* JADX INFO: renamed from: d */
        public C8291a f25880d;

        /* JADX INFO: renamed from: f */
        public Links f25882f;

        /* JADX INFO: renamed from: h */
        public final dpr f25884h;

        /* JADX INFO: renamed from: c */
        public List<Conversation> f25879c = Collections.EMPTY_LIST;

        /* JADX INFO: renamed from: e */
        public boolean f25881e = false;

        /* JADX INFO: renamed from: g */
        public boolean f25883g = false;

        /* JADX INFO: renamed from: i */
        public final int f25885i = Color.parseColor("#4c4c4c");

        /* JADX INFO: renamed from: j */
        public final int f25886j = Color.parseColor("#999999");

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationsList$e$a */
        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                AllPairsAct.m41545e2(ConversationsList.this.m42413l1());
                i4g0.m138523u("e_all_match_click", OMSDialogPositon.p_messages_view, jyb.m147494Y(SeeSwitchName.message_tab, "online"));
            }
        }

        /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationsList$e$b */
        public class b implements View.OnClickListener {
            public b() {
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                ConversationsList.this.m42413l1().startActivity(new Intent(ConversationsList.this.m42413l1(), (Class<?>) GroupSuggestAct.class));
                i4g0.m138520r("e_more_groups_click", OMSDialogPositon.p_messages_view);
            }
        }

        public C8281e() {
            this.f25884h = new dpr(ConversationsList.this.f25847V, new y20() { // from class: l.tq6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f175682a.m42508G((Integer) obj);
                }
            }, 4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: G */
        public /* synthetic */ void m42508G(Integer num) {
            if (num.intValue() >= getCount()) {
                return;
            }
            Conversation conversation = (Conversation) getItem(num.intValue());
            if (!(gra.m131637V1() && pm6.m172913a(conversation)) && NullChecker.m82486a(conversation)) {
                User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(conversation.otherUser);
                if (NullChecker.m82486a(userM116503Pa)) {
                    uqb0.f180374G.m127162z0(vx6.m203838b(userM116503Pa).profileSmall());
                }
            }
        }

        /* JADX INFO: renamed from: A */
        public int m42513A() {
            return m42515C(null);
        }

        /* JADX INFO: renamed from: B */
        public C8291a m42514B() {
            return this.f25880d;
        }

        /* JADX INFO: renamed from: C */
        public int m42515C(Conversation conversation) {
            int i;
            int i2;
            if (!jyb.m147479J(this.f25879c)) {
                int iM42846k = NullChecker.m82486a(this.f25880d) ? this.f25880d.m42846k() : 0;
                i = iM42846k;
                i2 = -1;
                int i3 = -1;
                while (true) {
                    if (i < getCount()) {
                        if (getItemViewType(i) == 0 || getItemViewType(i) == 16 || getItemViewType(i) == 11 || getItemViewType(i) == 23) {
                            Conversation conversation2 = this.f25879c.get(i - iM42846k);
                            if (NullChecker.m82486a(conversation) && TextUtils.equals(conversation2.f56859id, conversation.f56859id)) {
                                i3 = i;
                            }
                            if ((!conversation2.read.booleanValue() && !conversation2.localEverHasMessage) || ((TextUtils.equals(conversation2.f56859id, "conversation_feed_state") && !conversation2.read.booleanValue()) || ((TextUtils.equals(conversation2.f56859id, "conversation_feed_interaction") && !conversation2.read.booleanValue()) || ((TextUtils.equals(conversation2.f56859id, "conversation_feed_featured") && !conversation2.read.booleanValue()) || conversation2.unreadMessages > 0)))) {
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
        public final boolean m42516D() {
            return jyb.m147479J(this.f25879c);
        }

        /* JADX INFO: renamed from: E */
        public boolean m42517E() {
            return gra.m131568G0() && NullChecker.m82486a(ConversationsList.this.f25863j1) && bnl0.m105529O0(ConversationsList.this.f25863j1) && ConversationsList.this.f25863j1.m41707F() && this.f25883g;
        }

        /* JADX INFO: renamed from: F */
        public final /* synthetic */ void m42518F(View view) {
            if (NullChecker.m82486a(ConversationsList.this.f25863j1)) {
                ConversationsList conversationsList = ConversationsList.this;
                ConversationFilterLayout conversationFilterLayout = conversationsList.f25863j1;
                int currentSortType = conversationsList.f25827E0.getCurrentSortType();
                ConversationsListHeadView conversationsListHeadView = ConversationsList.this.f25827E0;
                conversationFilterLayout.m41724y(currentSortType, conversationsListHeadView.m42566g0(conversationsListHeadView.getCurrentSortType()));
            }
        }

        /* JADX INFO: renamed from: H */
        public final /* synthetic */ void m42519H(final String str) {
            if (CoreModule.f18264c.f20384f0.f20634R.f150611a) {
                return;
            }
            List<Conversation> list = this.f25879c;
            if (list instanceof ArrayList) {
                int iM147476G = jyb.m147476G(list, new qcj() { // from class: l.wq6
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(TextUtils.equals(str, ((Conversation) obj).f56859id));
                    }
                });
                if (iM147476G >= 0) {
                    this.f25879c.remove(iM147476G);
                }
                ConversationsList.this.m42496v2();
            }
        }

        /* JADX INFO: renamed from: I */
        public final boolean m42520I() {
            return m42516D() || (this.f25879c.size() == 1 && User.isTeamAccount(this.f25879c.get(0).otherUser) && !ConversationsList.this.f25861h1);
        }

        /* JADX INFO: renamed from: J */
        public final boolean m42521J() {
            return m42516D() || (this.f25879c.size() == 1 && User.isTeamAccount(this.f25879c.get(0).otherUser) && !ConversationsList.this.f25861h1);
        }

        /* JADX INFO: renamed from: K */
        public void m42522K(final String str) {
            l51.m152887G(new Runnable() { // from class: l.vq6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f185333a.m42519H(str);
                }
            });
        }

        /* JADX INFO: renamed from: L */
        public void m42523L(List<Conversation> list, boolean z, int i) {
            if (m42517E()) {
                return;
            }
            this.f25883g = false;
            int currentSortType = ConversationsList.this.f25827E0.getCurrentSortType();
            this.f25879c = list;
            this.f25880d = new C8291a(ConversationsList.this, this, i);
            ConversationsList.this.f25835M0.m137019l(uxj0.f181467a);
            boolean z2 = (currentSortType == 6 || currentSortType == 7 || currentSortType == 8 || currentSortType == 11) ? false : true;
            this.f25880d.m42852s(z2);
            boolean z3 = ConversationsList.this.f25836N0;
            ConversationsList conversationsList = ConversationsList.this;
            if (z3) {
                conversationsList.f25847V.setFooterDividersEnabled(false);
            } else {
                conversationsList.f25847V.setFooterDividersEnabled(!m42520I());
            }
            if (ConversationsList.this.f25860g1) {
                ConversationsList.f25820r1 = list.size() - 1;
            }
            this.f25884h.m117423f();
            if (!z2 && jyb.m147479J(this.f25879c)) {
                ConversationsList.this.m42436C2();
            }
            notifyDataSetChanged();
            ConversationsList.this.f25827E0.m42568i0(z);
        }

        /* JADX INFO: renamed from: M */
        public void m42524M(@NonNull List<Conversation> list, boolean z) {
            this.f25883g = true;
            if (gra.m131767w3()) {
                this.f25880d.m42853t();
            }
            if (z) {
                this.f25879c.addAll(list);
            } else {
                this.f25879c = new ArrayList(list);
            }
            ConversationsList.this.m42496v2();
        }

        /* JADX INFO: renamed from: N */
        public final void m42525N(View view) {
            ConversationsList.this.f25847V.setFooterDividersEnabled(false);
            int currentSortType = ConversationsList.this.f25827E0.getCurrentSortType();
            String string = ConversationsList.this.getContext().getResources().getString(R$string.f19788x1);
            ((VImage) view.findViewById(adc0.f70199X4)).setImageResource(dbc0.f86979f6);
            if (currentSortType == 7) {
                string = ConversationsList.this.getContext().getResources().getString(R$string.f19128bk);
            } else if (currentSortType == 8) {
                string = ConversationsList.this.getContext().getResources().getString(R$string.f19159ck);
            } else if (currentSortType == 11) {
                string = "当前没有异常的会话";
            }
            VText vText = (VText) view.findViewById(adc0.f70231Z4);
            if (NullChecker.m82486a(vText)) {
                vText.setText(string);
            }
        }

        /* JADX INFO: renamed from: O */
        public final void m42526O(View view) {
            ConversationsList.this.f25847V.setFooterDividersEnabled(false);
            int currentSortType = ConversationsList.this.f25827E0.getCurrentSortType();
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) view.findViewById(adc0.f70653y3);
            VText vText = (VText) view.findViewById(adc0.f69825B3);
            VText vText2 = (VText) view.findViewById(adc0.f69992L0);
            if (currentSortType == 2) {
                uqb0.f180374G.m127138Y0(simpleDraweeView, dbc0.f87250nf);
                vText.setText("好友均未在线");
                vText2.setVisibility(0);
                vText2.setText("查看全部配对");
                bnl0.m105509E0(vText2, new a());
                sfj0.m185602i("e_all_match_click", OMSDialogPositon.p_messages_view);
                return;
            }
            if (currentSortType == 6) {
                uqb0.f180374G.m127138Y0(simpleDraweeView, dbc0.f87217mf);
                vText.setText("你还没有加入或创建群聊");
                vText2.setVisibility(0);
                vText2.setText("发现更多群聊");
                bnl0.m105509E0(vText2, new b());
                sfj0.m185602i("e_more_groups_click", OMSDialogPositon.p_messages_view);
            }
        }

        /* JADX INFO: renamed from: P */
        public final void m42527P(View view) {
            VImage vImage = (VImage) view.findViewById(adc0.f70199X4);
            VText vText = (VText) view.findViewById(adc0.f70248a5);
            VText vText2 = (VText) view.findViewById(adc0.f70231Z4);
            if (vImage == null || vText == null || vText2 == null) {
                return;
            }
            vText.setTextColor(this.f25885i);
            vText2.setTextColor(this.f25886j);
            if (IntlCountryCodeController.m29125v()) {
                vImage.setBackground(null);
                vImage.setImageResource(dbc0.f86675Vq);
                vImage.setScaleType(ImageView.ScaleType.FIT_CENTER);
                vText.setText(R$string.f19783wr);
                vText2.setText(R$string.f19752vr);
            } else {
                vImage.setBackgroundResource(dbc0.f87364qu);
                vText.setText(R$string.f19264g2);
                vText2.setText(R$string.f19233f2);
            }
            VText vText3 = (VText) view.findViewById(adc0.f70215Y4);
            VFrame vFrame = (VFrame) view.findViewById(adc0.f69869Dd);
            bnl0.m105524M(vFrame, false);
            bnl0.m105564k0(vFrame);
            bnl0.m105524M(vText3, false);
            bnl0.m105524M(vImage, m42521J());
            bnl0.m105524M(vText2, m42521J());
            bnl0.m105524M(vText, m42521J());
        }

        /* JADX INFO: renamed from: Q */
        public void m42528Q(vg60<Conversation> vg60Var) {
            if (m42517E()) {
                return;
            }
            boolean z = false;
            this.f25883g = false;
            this.f25879c = vg60Var.f184001a;
            if (NullChecker.m82486a(vg60Var.f184002b) && NullChecker.m82486a(vg60Var.f184002b.links) && !TextUtils.isEmpty(vg60Var.f184002b.links.next)) {
                z = true;
            }
            this.f25881e = z;
            this.f25882f = NullChecker.m82486a(vg60Var.f184002b) ? vg60Var.f184002b.links : null;
            this.f25884h.m117423f();
            notifyDataSetChanged();
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: e */
        public void mo42529e(int i) {
            if (m42517E()) {
                return;
            }
            this.f25884h.m117422e(i);
            if (!ConversationsList.this.f25836N0 || jyb.m147479J(this.f25879c) || this.f25879c.size() <= 0 || this.f25879c.size() - i > 1 || !this.f25881e || !NullChecker.m82486a(this.f25882f)) {
                return;
            }
            CoreModule.f18264c.f20384f0.m33962fn(this.f25882f);
        }

        @Override // android.widget.Adapter
        public int getCount() {
            int currentSortType;
            if (ConversationsList.this.f25836N0) {
                return Math.max(1, this.f25879c.size());
            }
            if (m42517E()) {
                int size = this.f25879c.size();
                if (gra.m131767w3()) {
                    size += this.f25880d.m42846k();
                }
                return Math.max(1, size);
            }
            if (NullChecker.m82486a(ConversationsList.this.f25827E0) && ((currentSortType = ConversationsList.this.f25827E0.getCurrentSortType()) == 6 || currentSortType == 7 || currentSortType == 8 || currentSortType == 11)) {
                return (jyb.m147479J(this.f25879c) ? 1 : 0) + this.f25879c.size();
            }
            int iM42846k = (NullChecker.m82486a(this.f25880d) ? this.f25880d.m42846k() : 0) + this.f25879c.size();
            return m42520I() ? iM42846k + 1 : iM42846k;
        }

        @Override // android.widget.Adapter
        public Object getItem(int i) {
            int i2;
            if (m42517E() && !gra.m131767w3()) {
                if (jyb.m147479J(this.f25879c)) {
                    return null;
                }
                return this.f25879c.get(i);
            }
            if (ConversationsList.this.f25836N0) {
                if (i < this.f25879c.size()) {
                    return this.f25879c.get(i);
                }
                return null;
            }
            int iM42846k = NullChecker.m82486a(this.f25880d) ? this.f25880d.m42846k() : 0;
            if (i >= iM42846k && (i2 = i - iM42846k) >= 0 && i2 < this.f25879c.size()) {
                return this.f25879c.get(i2);
            }
            return null;
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getItemViewType(int i) {
            if (ConversationsList.this.f25836N0) {
                return (jyb.m147479J(this.f25879c) && i == 0) ? 8 : 9;
            }
            if (m42517E() && jyb.m147479J(this.f25879c) && (!gra.m131767w3() || this.f25880d.m42846k() == 0)) {
                return 42;
            }
            int currentSortType = ConversationsList.this.f25827E0.getCurrentSortType();
            int iM42846k = (!NullChecker.m82486a(this.f25880d) || (m42517E() && !gra.m131767w3())) ? 0 : this.f25880d.m42846k();
            if (jyb.m147479J(this.f25879c) && i == 0 && (currentSortType == 6 || currentSortType == 7 || currentSortType == 11 || currentSortType == 8)) {
                return 12;
            }
            if (i >= 0 && i < iM42846k) {
                return this.f25880d.m42847l(i);
            }
            if (m42520I() && i == getCount() - 1) {
                return 3;
            }
            if (getItem(i) instanceof Conversation) {
                Conversation conversation = (Conversation) getItem(i);
                if (TEnum.equals(conversation.status, "dismissed")) {
                    return 7;
                }
                if (pm6.m172913a(conversation)) {
                    return 11;
                }
                if (fcp.m125024k(conversation)) {
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
                if (TextUtils.equals("fake_conversation_oof_pick", conversation.f56859id)) {
                    return 30;
                }
                if (TextUtils.equals("fake_conversation_oof_enter", conversation.f56859id)) {
                    return 31;
                }
                if (TextUtils.equals("fake_conversation_profile_featured", conversation.f56859id)) {
                    return 37;
                }
                if (ue6.m195659C0(conversation)) {
                    return 32;
                }
                if (TextUtils.equals("fake_conversation_blindbox_enter", conversation.f56859id)) {
                    return 34;
                }
                if (TextUtils.equals("fake_conversation_surprise_gift_box", conversation.f56859id)) {
                    return 36;
                }
                if (TextUtils.equals("fake_conversation_local_summary_marriage_conversation", conversation.f56859id)) {
                    return 40;
                }
                if (TextUtils.equals("fake_conversation_profile_like_enter", conversation.f56859id)) {
                    return 38;
                }
                if (TextUtils.equals("fake_conversation_fold_conversation", conversation.f56859id)) {
                    return 39;
                }
                if (TextUtils.equals("fake_conversation_weaken_conversation", conversation.f56859id)) {
                    return 46;
                }
                if (TextUtils.equals("fake_conversation_local_team_group_conversation", conversation.f56859id)) {
                    return 43;
                }
                if (TextUtils.equals("fake_conversation_local_limited_trial_see_fold", conversation.f56859id)) {
                    return 44;
                }
            }
            return 0;
        }

        @Override // android.widget.BaseAdapter, android.widget.Adapter
        public int getViewTypeCount() {
            return 49;
        }

        @Override // p153l.u46
        /* JADX INFO: renamed from: h */
        public int mo42530h() {
            return getCount();
        }

        @Override // p153l.u46
        /* JADX INFO: renamed from: k */
        public List<Conversation> mo42531k() {
            return this.f25879c;
        }

        @Override // p153l.u46
        /* JADX INFO: renamed from: l */
        public int mo42532l() {
            if ((!m42517E() || gra.m131767w3()) && NullChecker.m82486a(this.f25880d)) {
                return this.f25880d.m42846k();
            }
            return 0;
        }

        @Override // p153l.dq1
        /* JADX INFO: renamed from: m */
        public View mo21402m(ViewGroup viewGroup, int i) {
            if (ConversationsList.this.f25836N0) {
                ConversationsList conversationsList = ConversationsList.this;
                return i == 8 ? conversationsList.m42413l1().inflater().inflate(kec0.f126122wc, (ViewGroup) ConversationsList.this.f25847V, false) : ue6.m195665a(conversationsList.m42413l1(), viewGroup);
            }
            if (i == 28) {
                return ConversationsList.this.m42413l1().inflater().inflate(kec0.f125642U1, (ViewGroup) ConversationsList.this.f25847V, false);
            }
            if (i == 12) {
                return ConversationsList.this.m42413l1().inflater().inflate(kec0.f125404F3, (ViewGroup) ConversationsList.this.f25847V, false);
            }
            if (i == 3) {
                ConversationsList conversationsList2 = ConversationsList.this;
                return !conversationsList2.f25861h1 ? conversationsList2.m42413l1().inflater().inflate(kec0.f125905k, (ViewGroup) ConversationsList.this.f25847V, false) : conversationsList2.m42413l1().inflater().inflate(kec0.f125922l, (ViewGroup) ConversationsList.this.f25847V, false);
            }
            if (i == 1 || i == 14) {
                return ConversationsList.this.m42413l1().inflater().inflate(kec0.f125771c0, (ViewGroup) ConversationsList.this.f25847V, false);
            }
            if (i == 48) {
                return ConversationsList.this.m42413l1().inflater().inflate(kec0.f125337B4, (ViewGroup) ConversationsList.this.f25847V, false);
            }
            if (i == 13) {
                return ue6.m195665a(ConversationsList.this.m42413l1(), viewGroup);
            }
            if (i == 15) {
                return ConversationsList.this.m42413l1().inflater().inflate(kec0.f125482K1, (ViewGroup) ConversationsList.this.f25847V, false);
            }
            if (i == 16) {
                return ConversationsList.this.m42413l1().inflater().inflate(kec0.f125610S1, (ViewGroup) ConversationsList.this.f25847V, false);
            }
            if (i == 17) {
                return ue6.m195665a(ConversationsList.this.m42413l1(), ConversationsList.this.f25847V);
            }
            if (i == 23) {
                return ConversationsList.this.m42413l1().inflater().inflate(kec0.f125626T1, (ViewGroup) ConversationsList.this.f25847V, false);
            }
            if (i == 30 || i == 31 || i == 37) {
                return ConversationsList.this.m42413l1().inflater().inflate(kec0.f125466J1, (ViewGroup) ConversationsList.this.f25847V, false);
            }
            if (i == 43) {
                return ConversationsList.this.m42413l1().inflater().inflate(kec0.f125594R1, (ViewGroup) ConversationsList.this.f25847V, false);
            }
            if (i == 27) {
                return ConversationsList.this.m42413l1().inflater().inflate(kec0.f125562P1, (ViewGroup) ConversationsList.this.f25847V, false);
            }
            if (i == 41) {
                return ConversationsList.this.m42413l1().inflater().inflate(kec0.f125514M1, (ViewGroup) ConversationsList.this.f25847V, false);
            }
            if (i == 45) {
                return ConversationsList.this.m42413l1().inflater().inflate(kec0.f125498L1, (ViewGroup) ConversationsList.this.f25847V, false);
            }
            if (i == 32) {
                return ue6.m195660G(ConversationsList.this.m42413l1(), viewGroup);
            }
            if (i == 33) {
                return ConversationsList.this.m42413l1().inflater().inflate(kec0.f125530N1, (ViewGroup) ConversationsList.this.f25847V, false);
            }
            if (i == 34) {
                return ConversationsList.this.m42413l1().inflater().inflate(kec0.f125450I1, (ViewGroup) ConversationsList.this.f25847V, false);
            }
            if (i == 36) {
                return ConversationsList.this.m42413l1().inflater().inflate(kec0.f125578Q1, (ViewGroup) ConversationsList.this.f25847V, false);
            }
            if (i == 38) {
                return ConversationsList.this.m42413l1().inflater().inflate(kec0.f125546O1, (ViewGroup) ConversationsList.this.f25847V, false);
            }
            if (i == 39) {
                return ConversationsList.this.m42413l1().inflater().inflate(kec0.f125722Z1, (ViewGroup) ConversationsList.this.f25847V, false);
            }
            if (i == 46) {
                return ConversationsList.this.m42413l1().inflater().inflate(kec0.f125756b2, (ViewGroup) ConversationsList.this.f25847V, false);
            }
            if (i == 42) {
                return ConversationsList.this.m42413l1().inflater().inflate(kec0.f125674W1, (ViewGroup) ConversationsList.this.f25847V, false);
            }
            if (i == 44) {
                return ue6.m195665a(ConversationsList.this.m42413l1(), viewGroup);
            }
            if (i == 47) {
                return CoreModule.m30934Q().mo68414Ms(ConversationsList.this.m42413l1(), ConversationsList.this.f25870p0).getView();
            }
            return ue6.m195664Z(ConversationsList.this.m42413l1(), viewGroup, i == 11);
        }

        @Override // p153l.u46
        /* JADX INFO: renamed from: o */
        public int mo42533o() {
            ConversationsListHeadView conversationsListHeadView = ConversationsList.this.f25827E0;
            if (conversationsListHeadView != null) {
                return conversationsListHeadView.getCurrentSortType();
            }
            return -1;
        }

        @Override // p153l.u46
        /* JADX INFO: renamed from: q */
        public void mo42534q() {
            ConversationsList.this.m42496v2();
        }

        @Override // p153l.u46
        /* JADX INFO: renamed from: v */
        public C22421c<Boolean> mo42535v() {
            return ConversationsList.this.f25862i1.getParentFragment() instanceof PutongFrag ? ((PutongFrag) ConversationsList.this.f25862i1.getParentFragment()).m30638L4() : C22421c.just(Boolean.TRUE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p153l.dq1
        /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
        public void mo21401j(View view, Conversation conversation, int i, int i2) {
            int iIntValue;
            int iM175859d;
            if (ConversationsList.this.f25836N0) {
                if (i != 8) {
                    ((NewConversationItemView) view).m42789u4(this, conversation, null, i2, null);
                    return;
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                layoutParams.width = -1;
                layoutParams.height = qa00.m175858c().heightPixels - qa00.m175859d(340.0f);
                view.setLayoutParams(layoutParams);
                ConversationsList.this.f25847V.setFooterDividersEnabled(false);
                return;
            }
            if (i == 28) {
                ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                layoutParams2.width = -1;
                if (CoreModule.f18264c.f20381e0.f89265k3.get().intValue() == 0 || CoreModule.f18264c.f20381e0.f89273l3.get().intValue() == 0) {
                    layoutParams2.height = qa00.m175858c().heightPixels - qa00.m175859d(340.0f);
                } else {
                    layoutParams2.height = (CoreModule.f18264c.f20381e0.f89265k3.get().intValue() - CoreModule.f18264c.f20381e0.f89273l3.get().intValue()) - qa00.m175859d(44.0f);
                }
                bnl0.m105540X((VLinear) view.findViewById(adc0.f70640x7), (int) (((double) ((layoutParams2.height - qa00.m175859d(261.0f)) / 2)) - (((double) layoutParams2.height) * 0.1d)));
                view.setLayoutParams(layoutParams2);
                m42526O(view);
                return;
            }
            if (i == 12) {
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                layoutParams3.width = -1;
                layoutParams3.height = qa00.m175858c().heightPixels - qa00.m175859d(340.0f);
                view.setLayoutParams(layoutParams3);
                m42525N(view);
                return;
            }
            if (i == 42) {
                View viewFindViewById = view.findViewById(adc0.f70670z3);
                bnl0.m105524M(viewFindViewById, true);
                if (CoreModule.f18264c.f20381e0.f89265k3.get().intValue() == 0 || CoreModule.f18264c.f20381e0.f89273l3.get().intValue() == 0) {
                    iIntValue = qa00.m175858c().heightPixels;
                    iM175859d = qa00.m175859d(340.0f);
                } else {
                    iIntValue = CoreModule.f18264c.f20381e0.f89265k3.get().intValue() - CoreModule.f18264c.f20381e0.f89273l3.get().intValue();
                    iM175859d = qa00.m175859d(44.0f);
                }
                bnl0.m105505C0(viewFindViewById, iIntValue - iM175859d);
                TextView textView = (TextView) view.findViewById(adc0.f70619w3);
                textView.setText("重置筛选");
                bnl0.m105509E0(textView, new View.OnClickListener() { // from class: l.uq6
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        this.f180355a.m42518F(view2);
                    }
                });
                ((TextView) view.findViewById(adc0.f69842C3)).setText("没有找到符合条件的消息\n你可以减少筛选项试试");
                return;
            }
            if (i == 3) {
                if (ConversationsList.this.f25861h1) {
                    return;
                }
                m42527P(view);
                return;
            }
            if (i == 1 || i == 14) {
                ((BusinessConversationView) view).m43308i0(ConversationsList.this.m42413l1(), this);
            } else if (i == 48) {
                ((IntlVisitorConversationView) view).m43314m0(ConversationsList.this.m42413l1(), this);
            } else if (i != 2) {
                if (i == 0) {
                    try {
                        ConversationsList conversationsList = ConversationsList.this;
                        ((NewConversationItemView) view).m42776h4(this, conversation, conversationsList.f25865k1, conversationsList.f25860g1, i2, null);
                    } catch (ClassCastException e) {
                        CrashHelper.m82479c(e);
                    }
                } else if (i == 11) {
                    ConversationsList conversationsList2 = ConversationsList.this;
                    ((NewConversationItemView) view).m42780l4(this, conversation, conversationsList2.f25865k1, conversationsList2.f25860g1, i2, null);
                } else if (i != 5) {
                    if (i == 7) {
                        ((NewConversationItemView) view).m42789u4(this, conversation, ConversationsList.this.f25865k1, i2, null);
                    } else if (i == 10) {
                        ((NewConversationItemView) view).m42782n4(this);
                    } else if (i == 13) {
                        ((NewConversationItemView) view).m42785q4(this, i2);
                    } else if (i == 15) {
                        ((ConversationItemGoogleAdView) view).m41836c(ConversationsList.this.m42413l1(), ConversationsList.this.f25860g1);
                    } else if (i == 16) {
                        ConversationsList.this.m42438D2(conversation.additional.feedStateCounter);
                        ((ConversationItemUserStatesView) view).m41956i(ConversationsList.this.m42413l1(), conversation);
                    } else if (i == 17) {
                        ((NewConversationItemView) view).m42790v4(this, ConversationsList.this.m42413l1());
                    } else if (i == 23) {
                        ((ConversationItemVirtualVoiceGroupView) view).m42058E0(ConversationsList.this.m42413l1(), conversation, i2);
                    } else if (i == 30) {
                        ((ConversationItemFriendMoments) view).m41832p(this, conversation.otherUser);
                    } else if (i == 31) {
                        ((ConversationItemFriendMoments) view).m41831o(this, conversation.otherUser);
                    } else if (i == 37) {
                        ((ConversationItemFriendMoments) view).m41833q(this, conversation.otherUser);
                    } else if (i == 27) {
                        ((ConversationItemReceiveLikeView) view).m41913k(this, conversation);
                    } else if (i == 41) {
                        try {
                            ((ConversationItemIntlReceiveLikeView) view).m41866k(conversation);
                        } catch (ClassCastException e2) {
                            CrashHelper.m82479c(e2);
                        }
                    } else if (i == 45) {
                        ((ConversationItemInstantChatGuideView) view).m41849m(ConversationsList.this.m42413l1(), conversation);
                    } else if (i == 32) {
                        ConversationsList conversationsList3 = ConversationsList.this;
                        ((NewConversationItemView) view).m42779k4(this, conversation, conversationsList3.f25865k1, conversationsList3.f25860g1, i2, null);
                    } else if (i == 33) {
                        ((ConversationItemPlatinumPinLike) view).m41893q(this, i2);
                    } else if (i == 35) {
                        ((NewConversationItemView) view).m42778j4(this, conversation, ConversationsList.this.m42413l1());
                    } else if (i == 34) {
                        ((ConversationItemBlindBoxEntrance) view).m41815e(conversation);
                    } else if (i == 36) {
                        ((ConversationItemSurpriseBoxEntrance) view).m41927f(conversation);
                    } else if (i == 40) {
                        ((NewConversationItemView) view).m42786r4(this, conversation);
                    } else if (i == 38) {
                        ((ConversationItemProfileLikeEntrance) view).m41902i(conversation, this);
                    } else if (i == 39) {
                        ((ConversationFoldView) view).m41730T(ConversationsList.this.m42413l1(), this);
                    } else if (i == 46) {
                        ((ConversationWeakenView) view).m42333d0(ConversationsList.this.m42413l1(), this);
                    } else if (i == 43) {
                        ((ConversationItemTeamGroup) view).m41943o(this, conversation);
                    } else if (i == 44) {
                        ((NewConversationItemView) view).m42784p4(this, i2, ConversationsList.this.f25853Z0);
                    } else if (i == 47) {
                        ((csp) view).mo71584z(i2);
                    }
                }
            }
            if (!m42517E() || i2 < this.f25879c.size() - 3 || this.f25879c.size() <= 10) {
                return;
            }
            ConversationsList.this.f25863j1.m41718Q(this, true);
        }

        /* JADX INFO: renamed from: z */
        public boolean m42537z(User user, Conversation conversation) {
            return ConversationsList.this.f25863j1.m41702A(conversation, user);
        }
    }

    static {
        uxj0 uxj0Var = uxj0.f181467a;
        f25822t1 = C22507a.m222759c(uxj0Var);
        f25823u1 = C22507a.m222759c(uxj0Var);
        f25824v1 = C22507a.m222759c(uxj0Var);
        f25825w1 = C22507a.m222759c(uxj0Var);
        f25826x1 = new C8280d();
    }

    public ConversationsList(Context context) {
        super(context);
        this.f25864k0 = null;
        this.f25828F0 = 23;
        this.f25829G0 = 39;
        this.f25830H0 = 40;
        this.f25831I0 = 41;
        this.f25832J0 = 42;
        this.f25833K0 = 43;
        this.f25834L0 = 45;
        this.f25835M0 = C22507a.m222759c(uxj0.f181467a);
        this.f25836N0 = false;
        this.f25837O0 = C22507a.m222759c(0);
        this.f25838P0 = C22507a.m222759c(vg60.m201220b());
        this.f25839Q0 = C22507a.m222759c(new ArrayList());
        this.f25840R0 = C22507a.m222759c(new ArrayList());
        this.f25842S0 = C22507a.m222759c(new ArrayList());
        this.f25844T0 = C22507a.m222759c(new ArrayList());
        this.f25846U0 = C22507a.m222759c(new ArrayList());
        this.f25848V0 = C22507a.m222759c(new ArrayList());
        this.f25850W0 = C22507a.m222759c(vg60.m201220b());
        this.f25851X0 = C22507a.m222759c(vg60.m201220b());
        this.f25852Y0 = new ArrayList();
        this.f25853Z0 = new ArrayList();
        this.f25855b1 = false;
        this.f25856c1 = false;
        this.f25858e1 = false;
        this.f25859f1 = null;
        this.f25860g1 = false;
        this.f25861h1 = false;
        this.f25866l1 = false;
        this.f25867m1 = 6;
        this.f25868n1 = 40;
        this.f25869o1 = 50;
    }

    /* JADX INFO: renamed from: A2 */
    public static void m42339A2() {
        m42342B2(false);
    }

    /* JADX INFO: renamed from: B2 */
    public static void m42342B2(boolean z) {
        ue6.m195658C("refreshObs 强制刷新 = " + z);
        if (z) {
            f25826x1.m42505b();
        }
        f25826x1.m42507d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: H0 */
    public static /* synthetic */ void m42354H0(dji.C16549a c16549a) {
        if (c16549a == null || c16549a.f88861a == 0) {
            return;
        }
        r8n.m180219f().f161728b.m137019l((InsertConversationsList) c16549a.f88861a);
    }

    /* JADX INFO: renamed from: K */
    public static /* synthetic */ void m42359K(Throwable th) {
    }

    /* JADX INFO: renamed from: M */
    public static /* synthetic */ void m42363M(boolean[] zArr) {
        List<T> listM208674j = CoreModule.f18272k.f115545m.f137507y.m208674j();
        for (int i = 0; i < listM208674j.size() && i < 50; i++) {
            double d = ((Conversation) listM208674j.get(i)).additional.quickChat.expire;
            if (d > FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE && d < pzi0.m174454o()) {
                zArr[0] = true;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: P */
    public static /* synthetic */ void m42369P(List list) {
        CoreModule.f18264c.f20384f0.f20663a2 = "";
        int iMin = Math.min(list.size(), 50);
        int i = 0;
        for (int i2 = 0; i2 < iMin && i < 20; i2++) {
            Conversation conversation = (Conversation) list.get(i2);
            if (!conversation.newMatchExpShowInList()) {
                if (!TextUtils.isEmpty(CoreModule.f18264c.f20384f0.f20663a2)) {
                    StringBuilder sb = new StringBuilder();
                    C4891g c4891g = CoreModule.f18264c.f20384f0;
                    sb.append(c4891g.f20663a2);
                    sb.append(Constants.SEPARATOR_COMMA);
                    c4891g.f20663a2 = sb.toString();
                }
                StringBuilder sb2 = new StringBuilder();
                C4891g c4891g2 = CoreModule.f18264c.f20384f0;
                sb2.append(c4891g2.f20663a2);
                sb2.append(conversation.f56859id);
                c4891g2.f20663a2 = sb2.toString();
                i++;
            }
        }
    }

    /* JADX INFO: renamed from: Q0 */
    public static /* synthetic */ void m42372Q0(Throwable th) {
    }

    /* JADX INFO: renamed from: R0 */
    public static /* synthetic */ Boolean m42374R0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ void m42375S(Throwable th) {
    }

    /* JADX INFO: renamed from: T */
    public static /* synthetic */ void m42377T(Throwable th) {
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ Boolean m42379U(Boolean bool) {
        if (bool.booleanValue()) {
            return Boolean.FALSE;
        }
        CertificationNewConfig certificationNewConfigM131582J = gra.m131582J();
        boolean zM193670h = tzi0.m193670h(pzi0.m174454o(), (long) CoreModule.f18264c.f20381e0.m116593na().createdTime, 7);
        boolean z = false;
        boolean z2 = CoreModule.f18264c.f20384f0.m34016kf() < (CoreModule.f18264c.f20381e0.m116593na().isFemale() ? certificationNewConfigM131582J.femaleLimit : certificationNewConfigM131582J.maleLimit);
        boolean z3 = CoreModule.f18264c.f20384f0.m34042mf(1) <= 0;
        if ((!zM193670h && z2) || (zM193670h && z3)) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: U0 */
    public static /* synthetic */ void m42380U0(Throwable th) {
    }

    /* JADX INFO: renamed from: X0 */
    public static /* synthetic */ void m42386X0(Throwable th) {
    }

    /* JADX INFO: renamed from: Y0 */
    public static /* synthetic */ Boolean m42388Y0(vg60 vg60Var) {
        final boolean[] zArr = {false};
        l9c.m153394o().m153397B(new x20() { // from class: l.to6
            @Override // p153l.x20
            public final void call() {
                ConversationsList.m42363M(zArr);
            }
        });
        return Boolean.valueOf(zArr[0]);
    }

    /* JADX INFO: renamed from: g0 */
    public static /* synthetic */ void m42403g0(Throwable th) {
    }

    private void getFeedUserStateCounter() {
        m42413l1().duringCreated(CoreModule.f18264c.f20418q1.m34278w3().take(1)).subscribe(psd0.m173597H(new y20() { // from class: l.dn6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f89760a.m42450M1((uxj0) obj);
            }
        }, new y20() { // from class: l.on6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationsList.m42375S((Throwable) obj);
            }
        }));
    }

    private C22421c<Boolean> getPicCerGuideObs() {
        return (!nrb0.m164466b() || CoreModule.m30930K().me_().isPicVerificationVerified() || CoreModule.f18264c.f20381e0.f89154W3.get().intValue() >= 3 || pzi0.m174454o() <= CoreModule.f18264c.f20381e0.f89146V3.get().longValue() || (gra.m131683g() && aw90.m100562F().m100607R())) ? C22421c.just(Boolean.FALSE) : C22421c.combineLatest(CoreModule.f18264c.f20294B0.m32614j4().filter(new cq6()).map(new qcj() { // from class: l.nq6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                VerificationCenter verificationCenter = (VerificationCenter) obj;
                return Boolean.valueOf(TEnum.equals(verificationCenter.picVerificationInfo.status, "verified") || TEnum.equals(verificationCenter.picVerificationInfo.status, "pending"));
            }
        }).distinctUntilChanged(), m42413l1().lifecycle().filter(new qcj() { // from class: l.rq6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i && ji30.m144964h() == TabName.Msg);
            }
        }), new rcj() { // from class: l.en6
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return ConversationsList.m42425w0((Boolean) obj, (C4470c) obj2);
            }
        }).observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.fn6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ConversationsList.m42379U((Boolean) obj);
            }
        }).observeOn(fo0.m126432a());
    }

    private C22421c<Boolean> getSortInvalidConvObs() {
        return CoreModule.f18264c.f20384f0.f20708p2.map(new qcj() { // from class: l.rp6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f164311a.m42451N1((uxj0) obj);
            }
        }).distinctUntilChanged();
    }

    private C22421c<Integer> getTotalLiker() {
        return CoreModule.f18264c.f20429u0.m31415S6().map(new qcj() { // from class: l.zn6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ConversationsList.m42418q0((CoreLikers.C4870a) obj);
            }
        }).distinctUntilChanged();
    }

    private C22421c<Integer> getWeakenedTipsObs() {
        return C22421c.just(-1);
    }

    private C22421c<WechatNotifySetting> getWechatNotifyObs() {
        return C22421c.just(null);
    }

    /* JADX INFO: renamed from: h0 */
    public static /* synthetic */ void m42405h0(Throwable th) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l1 */
    public PutongAct m42413l1() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: o0 */
    public static /* synthetic */ void m42416o0(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            C4894i c4894i = CoreModule.f18264c.f20418q1;
            C4894i.f20751S.m137019l(uxj0.f181467a);
        }
    }

    /* JADX INFO: renamed from: q0 */
    public static /* synthetic */ Integer m42418q0(CoreLikers.C4870a c4870a) {
        if (rbb0.m180744q()) {
            return Integer.valueOf(c4870a.f20012b);
        }
        return -1;
    }

    /* JADX INFO: renamed from: u0 */
    public static /* synthetic */ void m42422u0(Throwable th) {
    }

    /* JADX INFO: renamed from: v0 */
    public static /* synthetic */ void m42423v0(List list, boolean z) {
        if (jyb.m147479J(list)) {
            return;
        }
        for (int i = 0; i < list.size(); i++) {
            Conversation conversationMo225055clone = ((Conversation) list.get(i)).mo225055clone();
            int i2 = z ? 2 : 1;
            if (i2 != conversationMo225055clone.localIsLimitedTrialSee) {
                conversationMo225055clone.localIsLimitedTrialSee = i2;
                CoreModule.f18272k.f115545m.upsert(conversationMo225055clone);
            }
        }
    }

    /* JADX INFO: renamed from: w0 */
    public static /* synthetic */ Boolean m42425w0(Boolean bool, C4470c c4470c) {
        return bool;
    }

    /* JADX INFO: renamed from: x0 */
    public static /* synthetic */ void m42427x0(Boolean bool) {
        OnlineMatchManager.m51326z().f33434A.m137019l("过期闪聊配对在这里");
        OnlineMatchManager.m51326z().f33456l.put(Boolean.TRUE);
    }

    /* JADX INFO: renamed from: y0 */
    public static /* synthetic */ Boolean m42429y0(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ void m42430z(Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: z0 */
    public static /* synthetic */ pf60 m42431z0(pf60 pf60Var) {
        final List list = (List) pf60Var.f152156a;
        String str = (String) pf60Var.f152157b;
        if (jyb.m147479J(list)) {
            return pf60Var;
        }
        final boolean z = ((long) list.size()) > Cfor.INSTANCE.m126493d() && (SeeTrialStatusType.trialEnd.equals(str) || "waiting".equals(str) || "expired".equals(str));
        l9c.m153394o().m153397B(new x20() { // from class: l.oq6
            @Override // p153l.x20
            public final void call() {
                ConversationsList.m42423v0(list, z);
            }
        });
        return pf60Var;
    }

    /* JADX INFO: renamed from: z2 */
    public static void m42432z2() {
        f25825w1.m137019l(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: A1 */
    public final void m42433A1() {
        if (h39.m133431T()) {
            bnl0.m105524M(this.f25827E0.f25932z, true);
            bnl0.m105509E0(this.f25827E0.f25932z, new View.OnClickListener() { // from class: l.qo6
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f158707a.m42472i2(view);
                }
            });
            this.f25862i1.duringCreated(C22421c.combineLatest(CoreModule.f18264c.f20381e0.m116596o9(), CoreModule.f18264c.f20294B0.m32614j4(), new ro6())).subscribe(psd0.m173596G(new y20() { // from class: l.so6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f169849a.m42473j2((pf60) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: B1 */
    public final void m42434B1() {
        if (spl0.m187372X()) {
            m42413l1().duringCreated(new pcj() { // from class: l.uo6
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return psd0.m173625r(CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("svip")).map(new qcj() { // from class: l.mp6
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return Boolean.valueOf(joa.m146361M3());
                        }
                    }), CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("limitedTrialSee")).map(new qcj() { // from class: l.np6
                        @Override // p153l.qcj
                        public final Object call(Object obj) {
                            return Boolean.valueOf(joa.m146356F3());
                        }
                    }), new rcj() { // from class: l.op6
                        @Override // p153l.rcj
                        public final Object call(Object obj, Object obj2) {
                            return pf60.m172085a((Boolean) obj, (Boolean) obj2);
                        }
                    });
                }
            }).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.wo6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f190010a.m42475k2((pf60) obj);
                }
            }));
            m42413l1().duringCreated(new pcj() { // from class: l.xo6
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f195559a.m42476l2();
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.yo6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f200955a.m42478m2((pf60) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: C1 */
    public final void m42435C1() {
        if (gra.m131568G0()) {
            m42413l1().duringCreated(CoreModule.f18264c.f20384f0.m33954ff()).subscribe(psd0.m173596G(new y20() { // from class: l.fo6
                @Override // p153l.y20
                public final void call(Object obj) {
                    ConversationsList.m42369P((List) obj);
                }
            }));
        }
    }

    /* JADX INFO: renamed from: C2 */
    public void m42436C2() {
        this.f25847V.setAdapter((ListAdapter) this.f25870p0);
    }

    /* JADX INFO: renamed from: D1 */
    public final void m42437D1() {
        m42413l1().duringCreated(r8n.m180219f().f161727a.m116105k().compose(psd0.m173592C()).doOnNext(new y20() { // from class: l.pp6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationsList.m42354H0((dji.C16549a) obj);
            }
        }).flatMap(new qcj() { // from class: l.qp6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return CoreModule.f18264c.f20384f0.m34115rn();
            }
        }).take(1)).subscribe(psd0.m173597H(new y20() { // from class: l.sp6
            @Override // p153l.y20
            public final void call(Object obj) {
                r8n.m180219f().m180225g((List) obj);
            }
        }, new y20() { // from class: l.tp6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationsList.m42372Q0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: D2 */
    public final void m42438D2(CoreFeedStateCounter coreFeedStateCounter) {
        if (this.f25855b1) {
            this.f25855b1 = false;
            i4g0.m138492A("e_match_state", OMSDialogPositon.p_messages_view, new pf60("has_red_dot", (!NullChecker.m82486a(coreFeedStateCounter) || coreFeedStateCounter.unread <= 0) ? "no" : "yes"));
        }
    }

    /* JADX INFO: renamed from: E1 */
    public final void m42439E1() {
        m42413l1().duringCreated(psd0.m173626s(f25823u1, this.f25850W0, this.f25851X0, new scj() { // from class: l.bq6
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return jyb.m147494Y((vg60) obj2, (vg60) obj3);
            }
        })).onBackpressureDrop(new y20() { // from class: l.dq6
            @Override // p153l.y20
            public final void call(Object obj) {
                CrashHelper.m82480d(new IllegalStateException("ConversationsList backpressure problem! - list filter map problem"), 100);
            }
        }).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.eq6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f95306a.m42480n2((pf60) obj);
            }
        }, new y20() { // from class: l.fq6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationsList.m42430z((Throwable) obj);
            }
        }));
        C22421c<vg60<Conversation>> c22421cM34083ph = CoreModule.f18264c.f20384f0.m34083ph();
        C22507a<vg60<Conversation>> c22507a = this.f25850W0;
        Objects.requireNonNull(c22507a);
        c22421cM34083ph.subscribe(new lp6(c22507a));
        C22421c<vg60<Conversation>> c22421cM34096qh = CoreModule.f18264c.f20384f0.m34096qh();
        C22507a<vg60<Conversation>> c22507a2 = this.f25851X0;
        Objects.requireNonNull(c22507a2);
        c22421cM34096qh.subscribe(new lp6(c22507a2));
    }

    /* JADX INFO: renamed from: E2 */
    public void m42440E2() {
        if (NullChecker.m82486a(this.f25863j1)) {
            this.f25863j1.m41722U();
        }
    }

    /* JADX INFO: renamed from: F1 */
    public final boolean m42441F1(Conversation conversation, HashMap<String, UserLiveLabel> map) {
        if (map != null && !map.isEmpty()) {
            if ("group".equals(conversation.convType)) {
                ChatGroup chatGroupM32923s6 = CoreModule.f18264c.f20387g0.m32923s6(conversation.otherUser);
                if (NullChecker.m82486a(chatGroupM32923s6)) {
                    return map.get(chatGroupM32923s6.ownerUserId) != null;
                }
            }
            if (map.get(conversation.f56859id) != null) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: F2 */
    public final void m42442F2() {
        if (this.f25827E0 == null) {
            return;
        }
        int firstVisiblePosition = this.f25847V.getFirstVisiblePosition();
        boolean z = false;
        int iMax = (!bnl0.m105529O0(this.f25827E0.f25925s) || firstVisiblePosition > 0) ? 0 : Math.max(this.f25827E0.f25925s.getTop() + this.f25827E0.getTop(), 0);
        int initHeight = (NullChecker.m82486a(this.f25857d1) && bnl0.m105529O0(this.f25857d1)) ? this.f25857d1.getInitHeight() : 0;
        if (this.f25827E0.getTop() >= 0) {
            iMax = firstVisiblePosition > 0 ? 0 : this.f25827E0.f25925s.getTop();
        } else if (initHeight > 0 && (iMax = Math.max(iMax, initHeight)) == initHeight) {
            z = true;
        }
        boolean z2 = iMax != 0 ? z : true;
        bnl0.m105540X(this.f25863j1, iMax);
        bnl0.m105552e0(this.f25863j1, qa00.f156321h);
        ConvCellList convCellList = this.f25847V;
        if (z2) {
            convCellList.setClipHeight(iMax + this.f25863j1.getHeight());
        } else {
            convCellList.setClipHeight(-1);
        }
    }

    /* JADX INFO: renamed from: G1 */
    public boolean m42443G1() {
        if (gra.m131657a2()) {
            return false;
        }
        return this.f25860g1;
    }

    /* JADX INFO: renamed from: G2 */
    public void m42444G2() {
        if (NullChecker.m82486a(this.f25870p0) && NullChecker.m82486a(this.f25870p0.m42514B()) && C8291a.m42842p(CoreModule.f18264c.f20384f0.f20610J0.get()) && !this.f25870p0.m42514B().m42850o(13)) {
            this.f25870p0.m42514B().m42849n();
            this.f25870p0.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: H1 */
    public boolean m42445H1() {
        return this.f25860g1;
    }

    /* JADX INFO: renamed from: I1 */
    public final /* synthetic */ void m42446I1(ovb0 ovb0Var) {
        CrashHelper.m82480d(new IllegalStateException("ConversationsList backpressure problem! - list filter problem isSearchList = " + this.f25861h1), 100);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: J1 */
    public final /* synthetic */ void m42447J1(ovb0 ovb0Var) {
        if (ovb0Var.f149248a == 0 || this.f25870p0.m42517E()) {
            return;
        }
        int currentSortType = this.f25827E0.getCurrentSortType();
        if (NullChecker.m82486a(this.f25827E0)) {
            if (currentSortType == 1) {
                this.f25852Y0 = (List) ovb0Var.f149249b;
            } else if (currentSortType == 4 && NullChecker.m82486a(((ovb0) ovb0Var.f149248a).f149248a)) {
                A a = ovb0Var.f149248a;
                this.f25852Y0 = ((vg60) ((ovb0) a).f149248a).f184001a;
                this.f25870p0.m42528Q((vg60) ((ovb0) a).f149248a);
                this.f25836N0 = true;
            } else if (currentSortType == 6 && NullChecker.m82486a(((ovb0) ovb0Var.f149248a).f149249b)) {
                this.f25852Y0 = (List) ((ovb0) ovb0Var.f149248a).f149249b;
            } else if (currentSortType == 7 && NullChecker.m82486a(((ovb0) ovb0Var.f149248a).f149250c)) {
                this.f25852Y0 = (List) ((ovb0) ovb0Var.f149248a).f149250c;
            } else if (currentSortType == 8 && NullChecker.m82486a(((ovb0) ovb0Var.f149248a).f149251d)) {
                this.f25852Y0 = (List) ((ovb0) ovb0Var.f149248a).f149251d;
            } else if (currentSortType == 11 && NullChecker.m82486a(ovb0Var.f149251d)) {
                this.f25852Y0 = (List) ovb0Var.f149251d;
            }
            m42342B2(true);
        }
    }

    /* JADX INFO: renamed from: K1 */
    public final /* synthetic */ void m42448K1(pf60 pf60Var) {
        CrashHelper.m82480d(new IllegalStateException("ConversationsList backpressure problem! - list problem isSearchList = " + this.f25861h1), 100);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: L1 */
    public final /* synthetic */ void m42449L1(pf60 pf60Var) {
        if (this.f25870p0.m42517E()) {
            return;
        }
        List<Conversation> list = (List) pf60Var.f152156a;
        int iIntValue = ((Integer) pf60Var.f152157b).intValue();
        if (this.f25827E0.getCurrentSortType() != 0) {
            list = this.f25852Y0;
        }
        List<Conversation> listM42502y2 = m42502y2(list, m42443G1());
        if (gra.m131657a2()) {
            CoreModule.f18264c.f20384f0.m33987ho(m42443G1(), listM42502y2);
        }
        if (this.f25827E0.getCurrentSortType() != 4) {
            this.f25870p0.m42523L(listM42502y2, false, iIntValue);
            this.f25836N0 = false;
        }
        StringBuilder sb = new StringBuilder("ConversationList Render (size = ");
        sb.append(jyb.m147479J(listM42502y2) ? 0 : listM42502y2.size());
        sb.append(")");
        ue6.m195658C(sb.toString());
    }

    /* JADX INFO: renamed from: M1 */
    public final /* synthetic */ void m42450M1(uxj0 uxj0Var) {
        this.f25855b1 = true;
        m42477m1();
    }

    /* JADX INFO: renamed from: N1 */
    public final /* synthetic */ Boolean m42451N1(uxj0 uxj0Var) {
        return Boolean.valueOf(this.f25827E0.getCurrentSortType() == 11);
    }

    /* JADX INFO: renamed from: O1 */
    public final /* synthetic */ void m42452O1(Boolean bool) {
        this.f25841S.setRefreshing(true);
    }

    /* JADX INFO: renamed from: P1 */
    public final /* synthetic */ void m42453P1(Throwable th) {
        if (m42413l1().isFinishing()) {
            return;
        }
        this.f25841S.setRefreshing(false);
        if (gra.m131657a2()) {
            m42339A2();
        }
    }

    /* JADX INFO: renamed from: Q1 */
    public final /* synthetic */ void m42454Q1() {
        if (m42413l1().isFinishing()) {
            return;
        }
        this.f25841S.setRefreshing(false);
        if (gra.m131657a2()) {
            m42339A2();
        }
    }

    /* JADX INFO: renamed from: R1 */
    public final /* synthetic */ void m42455R1() {
        m42413l1().duringCreated(CoreModule.f18264c.f20384f0.m34076on().map(new qcj() { // from class: l.io6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((vg60) obj).m201221c());
            }
        }).takeUntil((qcj<? super R, Boolean>) new qcj() { // from class: l.jo6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }).filter(new qcj() { // from class: l.lo6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ConversationsList.m42374R0((Boolean) obj);
            }
        }).distinctUntilChanged()).subscribe(psd0.m173598I(new y20() { // from class: l.mo6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f137785a.m42452O1((Boolean) obj);
            }
        }, new y20() { // from class: l.no6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f142914a.m42453P1((Throwable) obj);
            }
        }, new x20() { // from class: l.oo6
            @Override // p153l.x20
            public final void call() {
                this.f148326a.m42454Q1();
            }
        }));
    }

    /* JADX INFO: renamed from: S1 */
    public final /* synthetic */ C22421c m42456S1() {
        return this.f25860g1 ? CoreModule.f18264c.f20384f0.m34000ip() : C22421c.just(uxj0.f181467a);
    }

    /* JADX INFO: renamed from: T1 */
    public final /* synthetic */ void m42457T1(uxj0 uxj0Var) {
        int currentSortType = this.f25827E0.getCurrentSortType();
        if (NullChecker.m82486a(this.f25863j1)) {
            this.f25863j1.m41724y(currentSortType, this.f25827E0.m42566g0(currentSortType));
        }
        if (currentSortType == 4) {
            CoreModule.f18264c.f20384f0.m33962fn(null);
            this.f25847V.setFooterDividersEnabled(false);
        } else if (currentSortType == 6) {
            this.f25847V.setFooterDividersEnabled(false);
        }
        if (NullChecker.m82486a(this.f25863j1) && NullChecker.m82486a(this.f25857d1) && NullChecker.m82486a(getConversationHeadRecommendLayout())) {
            m42442F2();
        }
        if (currentSortType == 0) {
            m42342B2(true);
        } else {
            f25823u1.m137019l(uxj0.f181467a);
        }
    }

    /* JADX INFO: renamed from: U1 */
    public final /* synthetic */ void m42458U1(Map map) {
        this.f25870p0.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: V1 */
    public final /* synthetic */ void m42459V1(String str) {
        this.f25827E0.m42557I0(str);
        OnlineMatchManager.m51326z().f33434A.m137019l("");
    }

    /* JADX INFO: renamed from: W1 */
    public final /* synthetic */ void m42460W1(Boolean bool) {
        this.f25854a1 = bool.booleanValue();
    }

    /* JADX INFO: renamed from: X1 */
    public final /* synthetic */ void m42461X1(UserPrivilege userPrivilege) {
        boolean zM146368T3 = joa.m146368T3(SummarizedPrivilegesId.get("seeWhoLikedMe"));
        Boolean bool = this.f25864k0;
        if (bool == null || bool.booleanValue() != zM146368T3) {
            this.f25864k0 = Boolean.valueOf(zM146368T3);
            CoreModule.f18264c.f20321K0.m113316x3().m137019l(Optional.m15467of(uxj0.f181467a));
        }
    }

    /* JADX INFO: renamed from: Y1 */
    public final /* synthetic */ Boolean m42462Y1(TabName tabName) {
        boolean z = false;
        if (tabName == TabName.Msg && !wyb0.m208493O().m208547V(false, true) && wyb0.m208493O().m208537H() && !jxb0.m147337d() && !this.f25857d1.mo42997e() && !OnlineMatchManager.m51326z().m51338L() && !wyb0.m208493O().m208549Y()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: Z1 */
    public final /* synthetic */ void m42463Z1(TabName tabName) {
        jxb0.m147338e(m42413l1(), false, null);
        wyb0.m208493O().m208564w0();
    }

    /* JADX INFO: renamed from: a2 */
    public final /* synthetic */ void m42464a2() {
        this.f25827E0.m42555G0(this.f25863j1.f25442c);
    }

    /* JADX INFO: renamed from: b2 */
    public final /* synthetic */ void m42465b2(Integer num) {
        ConversationsListHeadView conversationsListHeadView = this.f25827E0;
        if (conversationsListHeadView == null || !bnl0.m105529O0(conversationsListHeadView)) {
            return;
        }
        this.f25827E0.m42554E0(this.f25857d1.getInitHeight());
        if (gra.m131568G0()) {
            m42442F2();
        }
    }

    /* JADX INFO: renamed from: c2 */
    public final /* synthetic */ void m42466c2(z36 z36Var) {
        if (z36Var.f202788c.booleanValue()) {
            this.f25827E0.m42556H0();
            return;
        }
        if (NullChecker.m82486a(z36Var.f202787b) && NotificationCheckerCommon.m80403a() != NotificationCheckerCommon.State.opened && !pzi0.m174439D(CoreModule.f18264c.f20381e0.f89313q5.get().longValue())) {
            this.f25827E0.m42562N0(z36Var.f202787b);
            return;
        }
        if (z36Var.f202786a.booleanValue()) {
            this.f25827E0.m42558J0();
            return;
        }
        boolean zM42494u2 = m42494u2(z36Var.f202789d.intValue());
        ConversationsListHeadView conversationsListHeadView = this.f25827E0;
        if (zM42494u2) {
            conversationsListHeadView.m42561M0(this.f25870p0, z36Var.f202789d.intValue());
        } else {
            conversationsListHeadView.m42560L0(ConversationsListHeadView.TipType.NONE);
        }
    }

    /* JADX INFO: renamed from: d2 */
    public final /* synthetic */ void m42467d2(uxj0 uxj0Var) {
        getFeedUserStateCounter();
    }

    /* JADX INFO: renamed from: e2 */
    public final /* synthetic */ void m42468e2(List list, x20 x20Var, x20 x20Var2) {
        this.f25870p0.m42523L(list, true, -1);
        if (NullChecker.m82486a(x20Var)) {
            x20Var.call();
        }
        if (TextUtils.isEmpty(this.f25859f1)) {
            return;
        }
        m42499x1(this.f25859f1, x20Var, x20Var2);
    }

    /* JADX INFO: renamed from: f2 */
    public final /* synthetic */ void m42469f2(String str, final x20 x20Var, final x20 x20Var2) {
        final List<Conversation> arrayList = CoreModule.f18264c.f20384f0.m33895af(str).f152156a;
        if (!NullChecker.m82486a(arrayList)) {
            arrayList = new ArrayList<>();
        }
        l51.m152887G(new Runnable() { // from class: l.qq6
            @Override // java.lang.Runnable
            public final void run() {
                this.f158956a.m42468e2(arrayList, x20Var, x20Var2);
            }
        });
    }

    /* JADX INFO: renamed from: g2 */
    public final /* synthetic */ void m42470g2(uxj0 uxj0Var) {
        CoreModule.m30934Q().mo68412M6().mo127339j(m42413l1());
    }

    public ConversationHeadRecommendLayout getConversationHeadRecommendLayout() {
        return this.f25827E0.getConversationHeadRecommendLayout();
    }

    public C8281e getConversationsAdapter() {
        return this.f25870p0;
    }

    public C22421c<List<Conversation>> getLimitedTrialSeeConversations() {
        return !spl0.m187372X() ? C22421c.just(new ArrayList()) : CoreModule.f18272k.f115545m.m159031o0().m208677m();
    }

    /* JADX INFO: renamed from: h2 */
    public final /* synthetic */ void m42471h2(C4470c c4470c) {
        if (c4470c == C4470c.f16267i) {
            CoreModule.m30934Q().mo68412M6().mo127339j(m42413l1());
        }
    }

    /* JADX INFO: renamed from: i2 */
    public final /* synthetic */ void m42472i2(View view) {
        i4g0.m138523u("e_message_set_receive_verified", OMSDialogPositon.p_messages_view, pf60.m172085a("switch_type", CoreModule.f18264c.f20381e0.m116563g8() ? "open" : "close"));
        new FilterVerificationUserMsgDlg(m42413l1(), FilterVerificationUserMsgDlg.FilterFrom.CONV_LIST).show();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j2 */
    public final /* synthetic */ void m42473j2(pf60 pf60Var) {
        if (((User) pf60Var.f152156a).isOpenFilterVeriMsg() && NullChecker.m82486a(pf60Var.f152157b) && NullChecker.m82486a(((VerificationCenter) pf60Var.f152157b).picVerificationInfo) && TEnum.equals(((VerificationCenter) pf60Var.f152157b).picVerificationInfo.status, "verified")) {
            this.f25827E0.f25932z.setImageResource(dbc0.f86238I5);
        } else {
            this.f25827E0.f25932z.setImageResource(dbc0.f86206H5);
        }
    }

    /* JADX INFO: renamed from: k1 */
    public final void m42474k1(View view) {
        nr6.m164461a(this, view);
    }

    /* JADX INFO: renamed from: k2 */
    public final /* synthetic */ void m42475k2(pf60 pf60Var) {
        m42496v2();
    }

    /* JADX INFO: renamed from: l2 */
    public final /* synthetic */ C22421c m42476l2() {
        return psd0.m173625r(getLimitedTrialSeeConversations(), CoreModule.f18264c.f20296B2.m186426o3().distinctUntilChanged(), new rcj() { // from class: l.gq6
            @Override // p153l.rcj
            public final Object call(Object obj, Object obj2) {
                return pf60.m172085a((List) obj, (String) obj2);
            }
        }).observeOn(Schedulers.m222739io()).map(new qcj() { // from class: l.hq6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ConversationsList.m42431z0((pf60) obj);
            }
        }).observeOn(fo0.m126432a());
    }

    /* JADX INFO: renamed from: m1 */
    public final C22421c<List<Conversation>> m42477m1() {
        return this.f25861h1 ? CoreModule.f18264c.f20384f0.m34115rn() : CoreModule.f18264c.f20384f0.m33966gf();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: m2 */
    public final /* synthetic */ void m42478m2(pf60 pf60Var) {
        List list = (List) pf60Var.f152156a;
        String str = (String) pf60Var.f152157b;
        if (jyb.m147479J(list)) {
            return;
        }
        boolean z = ((long) list.size()) > Cfor.INSTANCE.m126493d();
        if (!"expired".equals(str) && z && (SeeTrialStatusType.trialEnd.equals(str) || "waiting".equals(str))) {
            this.f25853Z0.clear();
            this.f25853Z0.addAll(list);
            CoreModule.f18264c.f20384f0.m34105qq(this.f25853Z0.get(0).latestTime);
        } else {
            this.f25853Z0.clear();
            CoreModule.f18264c.f20384f0.m34105qq(-1.0d);
        }
        m42496v2();
    }

    /* JADX INFO: renamed from: n1 */
    public final void m42479n1() {
        if (this.f25866l1) {
            return;
        }
        this.f25866l1 = true;
        m42413l1().duringCreated(psd0.m173630w(f25823u1, this.f25838P0, this.f25839Q0, this.f25840R0, this.f25842S0, this.f25844T0, this.f25848V0, this.f25846U0, new xcj() { // from class: l.hp6
            @Override // p153l.xcj
            /* JADX INFO: renamed from: a */
            public final Object mo136477a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
                return jyb.m147495Z(jyb.m147495Z((vg60) obj2, (List) obj3, (List) obj4, (List) obj5), (List) obj6, (List) obj7, (List) obj8);
            }
        })).onBackpressureDrop(new y20() { // from class: l.ip6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f116258a.m42446I1((ovb0) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.jp6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f122077a.m42447J1((ovb0) obj);
            }
        }, new y20() { // from class: l.kp6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationsList.m42380U0((Throwable) obj);
            }
        }));
        C22421c<vg60<Conversation>> c22421cM34167vn = CoreModule.f18264c.f20384f0.m34167vn();
        C22507a<vg60<Conversation>> c22507a = this.f25838P0;
        Objects.requireNonNull(c22507a);
        c22421cM34167vn.subscribe(new lp6(c22507a));
        C22421c<List<Conversation>> c22421cM34141tn = CoreModule.f18264c.f20384f0.m34141tn();
        C22507a<List<Conversation>> c22507a2 = this.f25839Q0;
        Objects.requireNonNull(c22507a2);
        c22421cM34141tn.subscribe(new a96(c22507a2));
        C22421c<List<Conversation>> c22421cM34196yf = CoreModule.f18264c.f20384f0.m34196yf();
        C22507a<List<Conversation>> c22507a3 = this.f25840R0;
        Objects.requireNonNull(c22507a3);
        c22421cM34196yf.subscribe(new a96(c22507a3));
        C22421c<List<Conversation>> c22421cM33742Ng = CoreModule.f18264c.f20384f0.m33742Ng();
        C22507a<List<Conversation>> c22507a4 = this.f25842S0;
        Objects.requireNonNull(c22507a4);
        c22421cM33742Ng.subscribe(new a96(c22507a4));
        C22421c<List<Conversation>> c22421cM33953eq = CoreModule.f18264c.f20384f0.m33953eq();
        C22507a<List<Conversation>> c22507a5 = this.f25844T0;
        Objects.requireNonNull(c22507a5);
        c22421cM33953eq.subscribe(new a96(c22507a5));
        C22421c<List<Conversation>> c22421cM34122sh = CoreModule.f18264c.f20384f0.m34122sh();
        C22507a<List<Conversation>> c22507a6 = this.f25846U0;
        Objects.requireNonNull(c22507a6);
        c22421cM34122sh.subscribe(new a96(c22507a6));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: n2 */
    public final /* synthetic */ void m42480n2(pf60 pf60Var) {
        int currentSortType = this.f25827E0.getCurrentSortType();
        if (NullChecker.m82486a(this.f25827E0)) {
            if (currentSortType == 9 && NullChecker.m82486a(((vg60) pf60Var.f152156a).f184001a)) {
                this.f25852Y0 = ((vg60) pf60Var.f152156a).f184001a;
            } else if (currentSortType == 10 && NullChecker.m82486a(((vg60) pf60Var.f152157b).f184001a)) {
                this.f25852Y0 = ((vg60) pf60Var.f152157b).f184001a;
            }
            m42342B2(true);
        }
    }

    /* JADX INFO: renamed from: o1 */
    public final void m42481o1() {
        m42413l1().duringCreated(psd0.m173626s(f25822t1, f25821s1, this.f25837O0.distinctUntilChanged(), new scj() { // from class: l.up6
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return pf60.m172085a((List) obj2, (Integer) obj3);
            }
        })).onBackpressureDrop(new y20() { // from class: l.vp6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f185214a.m42448K1((pf60) obj);
            }
        }).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.wp6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190258a.m42449L1((pf60) obj);
            }
        }));
        if (this.f25861h1) {
            m42413l1().duringCreated(CoreModule.f18264c.f20384f0.m34115rn()).subscribe(psd0.m173596G(new y20() { // from class: l.xp6
                @Override // p153l.y20
                public final void call(Object obj) {
                    ConversationsList.f25821s1.m137019l((List) obj);
                }
            }));
        } else {
            m42413l1().duringCreated((C22421c) f25825w1.switchMap(new qcj() { // from class: l.yp6
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return CoreModule.f18264c.f20384f0.m34011jn(false);
                }
            })).subscribe(psd0.m173596G(new y20() { // from class: l.zp6
                @Override // p153l.y20
                public final void call(Object obj) {
                    ConversationsList.f25821s1.m137019l((List) obj);
                }
            }));
        }
        C22421c<Integer> totalLiker = getTotalLiker();
        final C22507a<Integer> c22507a = this.f25837O0;
        Objects.requireNonNull(c22507a);
        totalLiker.subscribe(new y20() { // from class: l.aq6
            @Override // p153l.y20
            public final void call(Object obj) {
                c22507a.m137019l((Integer) obj);
            }
        });
    }

    /* JADX INFO: renamed from: o2 */
    public final /* synthetic */ void m42482o2(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
        if (NullChecker.m82486a(this.f25857d1)) {
            this.f25857d1.mo42999g(i4, false);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m42474k1(this);
        this.f25863j1 = this.f25849W;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            this.f25872q1 = MotionEvent.obtain(motionEvent).getX();
        } else if (action == 2 && Math.abs(motionEvent.getX() - this.f25872q1) > this.f25871p1) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0702j
    /* JADX INFO: renamed from: p */
    public void mo4096p() {
        if (this.f25836N0) {
            CoreModule.f18264c.f20384f0.m33962fn(null).materialize().first().subscribe(psd0.m173596G(new y20() { // from class: l.vo6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f185007a.m42484p2((Notification) obj);
                }
            }));
        } else {
            CoreModule.f18264c.f20384f0.m33653Fo().materialize().first().subscribe(psd0.m173596G(new y20() { // from class: l.gp6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f105435a.m42486q2((Notification) obj);
                }
            }));
        }
        CoreModule.f18264c.f20321K0.m113316x3().m137019l(Optional.m15467of(uxj0.f181467a));
    }

    /* JADX INFO: renamed from: p1 */
    public void m42483p1(boolean z) {
        this.f25861h1 = z;
        this.f25847V.setCrashLogFlag("ConversationsList");
        this.f25827E0 = (ConversationsListHeadView) m42413l1().inflater().inflate(kec0.f125971ne, (ViewGroup) null, false);
        if (!z) {
            getConversationHeadRecommendLayout().m41774V();
        }
        this.f25847V.addHeaderView(this.f25827E0, null, true);
        this.f25847V.setHeaderDividersEnabled(false);
        C8281e c8281e = new C8281e();
        this.f25870p0 = c8281e;
        this.f25847V.setAdapter((ListAdapter) c8281e);
        this.f25847V.setRecyclerListener(this.f25870p0);
        this.f25847V.addFooterView(new View(m42413l1()));
        this.f25847V.setNestedScrollingEnabled(true);
        if (gra.m131677e3()) {
            this.f25845U.setClipChildren(false);
            this.f25847V.setClipChildren(false);
        }
        this.f25841S.setOnRefreshListener(this);
        this.f25841S.setColorSchemeResources(c9c0.f80362O1, c9c0.f80353L1, c9c0.f80356M1, c9c0.f80359N1);
        this.f25871p1 = ViewConfiguration.get(m42413l1()).getScaledTouchSlop();
        m42488r2();
        if (zg6.m219594e()) {
            this.f25847V.setOnItemClickListener(new C8277a());
            this.f25847V.setOnItemLongClickListener(new C8278b());
        }
    }

    /* JADX INFO: renamed from: p2 */
    public final /* synthetic */ void m42484p2(Notification notification) {
        this.f25841S.setRefreshing(false);
        if (notification.m222545j()) {
            bsj0.m106246D(notification.m222540e());
        }
    }

    /* JADX INFO: renamed from: q1 */
    public final String m42485q1(boolean z) {
        LinkedHashMap<String, UserLiveLabel> linkedHashMapM42487r1 = m42487r1(z);
        if (linkedHashMapM42487r1 == null || linkedHashMapM42487r1.isEmpty()) {
            return null;
        }
        return linkedHashMapM42487r1.entrySet().iterator().next().getValue().userId;
    }

    /* JADX INFO: renamed from: q2 */
    public final /* synthetic */ void m42486q2(Notification notification) {
        this.f25841S.setRefreshing(false);
        if (notification.m222545j()) {
            bsj0.m106246D(notification.m222540e());
        }
    }

    /* JADX INFO: renamed from: r1 */
    public final LinkedHashMap<String, UserLiveLabel> m42487r1(boolean z) {
        return z ? CoreModule.f18264c.f20384f0.f20588B2.m222761e() : CoreModule.f18264c.f20384f0.f20591C2.m222761e();
    }

    /* JADX INFO: renamed from: r2 */
    public void m42488r2() {
        this.f25847V.setOverScrollListener(new VList.InterfaceC22659a() { // from class: l.ko6
            @Override // p151v.VList.InterfaceC22659a
            /* JADX INFO: renamed from: a */
            public final void mo150587a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, boolean z) {
                this.f127697a.m42482o2(i, i2, i3, i4, i5, i6, i7, i8, z);
            }
        });
        this.f25847V.setOnScrollListener(new C8279c());
    }

    /* JADX INFO: renamed from: s1 */
    public void m42489s1(ConversationListFrag conversationListFrag) {
        FrameLayout.LayoutParams layoutParams;
        this.f25862i1 = conversationListFrag;
        if (!isInEditMode()) {
            if (d79.m114647F()) {
                if (d79.m114647F()) {
                    this.f25857d1 = new WengWengHeaderView(m42413l1());
                    layoutParams = new FrameLayout.LayoutParams(-1, 0);
                } else if (spl0.m187364P()) {
                    this.f25857d1 = new NewQuickChatAudioHeader(m42413l1());
                    layoutParams = new FrameLayout.LayoutParams(-1, 0);
                } else {
                    this.f25857d1 = new QuickChatHeaderView(m42413l1());
                    layoutParams = new FrameLayout.LayoutParams(-1, qa00.f156318e);
                    QuickChatHeaderBaseView quickChatHeaderBaseView = this.f25857d1;
                    int i = qa00.f156323j;
                    quickChatHeaderBaseView.setPadding(i, 0, i, 0);
                    this.f25857d1.setBackgroundColor(Color.parseColor("#ffffff"));
                }
                this.f25843T.addView(this.f25857d1, layoutParams);
                this.f25841S.setEnabled(false);
                this.f25857d1.setAct(m42413l1());
                this.f25857d1.mo42996d(this);
                this.f25843T.setHeadView(this.f25857d1);
                this.f25843T.setConversationsList(this);
                this.f25827E0.m42554E0(this.f25857d1.getInitHeight());
                boolean zM131568G0 = gra.m131568G0();
                ConversationFilterLayout conversationFilterLayout = this.f25863j1;
                if (zM131568G0) {
                    bnl0.m105524M(conversationFilterLayout, true);
                    this.f25863j1.m41705D(this, new Runnable() { // from class: l.gn6
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f105061a.m42492t2();
                        }
                    }, new Runnable() { // from class: l.sn6
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f169645a.m42464a2();
                        }
                    });
                    m42442F2();
                } else {
                    bnl0.m105524M(conversationFilterLayout, false);
                }
                this.f25857d1.setChangeHeightListrener(new y20() { // from class: l.wn6
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        this.f189857a.m42465b2((Integer) obj);
                    }
                });
            }
            this.f25827E0.init();
            this.f25827E0.setFilterPopShow(new Runnable() { // from class: l.xn6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f195363a.m42479n1();
                }
            });
            if (!this.f25861h1 && conversationListFrag != null) {
                conversationListFrag.m42111j5().m177138a(this.f25827E0.f25924r);
            }
            if (gra.m131657a2()) {
                m42413l1().duringCreated(CoreModule.f18264c.f20384f0.m33655Fq()).subscribe(psd0.m173596G(new y20() { // from class: l.yn6
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ConversationsList.f25824v1.m137019l(uxj0.f181467a);
                    }
                }));
            }
            bnl0.m105524M(this.f25827E0.f25919m, true);
            ConversationHeadRecommendLayout conversationHeadRecommendLayout = getConversationHeadRecommendLayout();
            bnl0.m105524M(conversationHeadRecommendLayout, true);
            conversationHeadRecommendLayout.m41787k0(null);
            l51.m152888H(m42413l1(), new Runnable() { // from class: l.ao6
                @Override // java.lang.Runnable
                public final void run() {
                    this.f72425a.m42455R1();
                }
            }, 1000L);
            m42500x2();
            m42413l1().duringCreated(new pcj() { // from class: l.bo6
                @Override // p153l.pcj, java.util.concurrent.Callable
                public final Object call() {
                    return this.f77619a.m42456S1();
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.co6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f82814a.m42457T1((uxj0) obj);
                }
            }));
            m42495v1();
            m42413l1().duringCreated(CoreModule.f18264c.f20381e0.m116492N7()).subscribe(psd0.m173596G(new y20() { // from class: l.do6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f89880a.m42458U1((Map) obj);
                }
            }));
        }
        if (rm50.m182043d()) {
            m42413l1().duringCreated(OnlineMatchManager.m51326z().f33434A).filter(new qcj() { // from class: l.eo6
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(!TextUtils.isEmpty((String) obj));
                }
            }).subscribe(psd0.m173597H(new y20() { // from class: l.hn6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f110703a.m42459V1((String) obj);
                }
            }, new y20() { // from class: l.in6
                @Override // p153l.y20
                public final void call(Object obj) {
                    ConversationsList.m42377T((Throwable) obj);
                }
            }));
            if (!OnlineMatchManager.m51326z().f33456l.get().booleanValue()) {
                m42413l1().duringCreated(this.f25838P0.observeOn(Schedulers.m222739io()).filter(new qcj() { // from class: l.jn6
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(!OnlineMatchManager.m51326z().f33456l.get().booleanValue());
                    }
                }).take(1).onBackpressureDrop().map(new qcj() { // from class: l.kn6
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ConversationsList.m42388Y0((vg60) obj);
                    }
                }).filter(new qcj() { // from class: l.ln6
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return ConversationsList.m42429y0((Boolean) obj);
                    }
                }).take(1).observeOn(fo0.m126432a())).subscribe(psd0.m173597H(new y20() { // from class: l.mn6
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ConversationsList.m42427x0((Boolean) obj);
                    }
                }, new y20() { // from class: l.nn6
                    @Override // p153l.y20
                    public final void call(Object obj) {
                        ConversationsList.m42386X0((Throwable) obj);
                    }
                }));
            }
        }
        m42413l1().duringCreated(CoreModule.f18264c.f20384f0.m34183xe().throttleFirst(5L, TimeUnit.MINUTES)).subscribe(psd0.m173596G(new y20() { // from class: l.pn6
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20384f0.m34012jo();
            }
        }));
        m42413l1().duringCreated(v850.m200290c()).distinctUntilChanged().subscribe(psd0.m173596G(new y20() { // from class: l.qn6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f158466a.m42460W1((Boolean) obj);
            }
        }));
        m42413l1().duringCreated(new pcj() { // from class: l.rn6
            @Override // p153l.pcj, java.util.concurrent.Callable
            public final Object call() {
                return CoreModule.f18264c.f20297C0.m146424v3(SummarizedPrivilegesId.get("seeWhoLikedMe"));
            }
        }).subscribe(psd0.m173596G(new y20() { // from class: l.tn6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f175227a.m42461X1((UserPrivilege) obj);
            }
        }));
        if (rm50.m182044e()) {
            m42413l1().duringCreated(((NewMainAct) m42413l1()).m40829o7()).filter(new qcj() { // from class: l.un6
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return this.f179699a.m42462Y1((TabName) obj);
                }
            }).subscribe(psd0.m173596G(new y20() { // from class: l.vn6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f184837a.m42463Z1((TabName) obj);
                }
            }));
        }
        m42491t1();
        m42433A1();
        m42493u1();
        m42497w1();
        m42435C1();
        m42434B1();
        m42503z1();
    }

    /* JADX INFO: renamed from: s2 */
    public final void m42490s2(long j, long j2, String str) {
        long j3 = j2 - j;
        if (j3 < 32) {
            return;
        }
        CrashHelper.m82479c(new IllegalStateException("ConversationsList processLiveState IllegalStateException ", new IllegalStateException("ConversationsList processLiveState tag " + str + " during " + j3)));
    }

    /* JADX INFO: renamed from: t1 */
    public final void m42491t1() {
        this.f25862i1.duringCreated(C22421c.combineLatest(getPicCerGuideObs(), getWechatNotifyObs(), getSortInvalidConvObs(), getWeakenedTipsObs(), new tcj() { // from class: l.go6
            @Override // p153l.tcj
            /* JADX INFO: renamed from: b */
            public final Object mo112959b(Object obj, Object obj2, Object obj3, Object obj4) {
                return new z36((Boolean) obj, (WechatNotifySetting) obj2, (Boolean) obj3, (Integer) obj4);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.ho6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f110871a.m42466c2((z36) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: t2 */
    public void m42492t2() {
        ConvCellList convCellList = this.f25847V;
        if (convCellList == null) {
            return;
        }
        convCellList.setSelection(0);
        m42442F2();
    }

    /* JADX INFO: renamed from: u1 */
    public final void m42493u1() {
        boolean zM184965m = s75.m184965m();
        ConversationsListHeadView conversationsListHeadView = this.f25827E0;
        if (zM184965m) {
            conversationsListHeadView.f25923q.m41674l(this.f25862i1, "", 1);
        } else {
            conversationsListHeadView.f25923q.m41670h();
        }
    }

    /* JADX INFO: renamed from: u2 */
    public final boolean m42494u2(int i) {
        MessageFilterConfig messageFilterConfigM131774y0 = gra.m131774y0();
        if (messageFilterConfigM131774y0 != null && i > 1) {
            long jM174454o = pzi0.m174454o();
            boolean z = jM174454o > CoreModule.f18264c.f20381e0.f89031F5.get().longValue();
            boolean zBooleanValue = CoreModule.f18264c.f20384f0.f20724v0.get().booleanValue();
            boolean zBooleanValue2 = CoreModule.f18264c.f20384f0.m33920cg().get().booleanValue();
            if (z && zBooleanValue && !zBooleanValue2) {
                if (this.f25827E0.f25907O == null) {
                    if (jM174454o - CoreModule.f18264c.f20381e0.f89017D5.get().longValue() <= TimeUnit.DAYS.toMillis(messageFilterConfigM131774y0.shownDayLimit)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: renamed from: v1 */
    public final void m42495v1() {
        m42481o1();
        m42437D1();
        m42439E1();
        m42501y1();
        if (CoreModule.m30932N().mo61537fs()) {
            PutongAct putongActM42413l1 = m42413l1();
            C4894i c4894i = CoreModule.f18264c.f20418q1;
            putongActM42413l1.duringCreated(C4894i.f20751S).subscribe(psd0.m173596G(new y20() { // from class: l.bp6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f77731a.m42467d2((uxj0) obj);
                }
            }));
            this.f25862i1.lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.cp6
                @Override // p153l.y20
                public final void call(Object obj) {
                    ConversationsList.m42416o0((C4470c) obj);
                }
            }));
        }
        m42413l1().lifecycle().filter(new qcj() { // from class: l.dp6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).subscribe(psd0.m173597H(new y20() { // from class: l.ep6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationsList.f25823u1.m137019l(uxj0.f181467a);
            }
        }, new y20() { // from class: l.fp6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationsList.m42422u0((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: v2 */
    public void m42496v2() {
        if (NullChecker.m82486a(this.f25870p0)) {
            this.f25870p0.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: w1 */
    public final void m42497w1() {
        CoreModule.f18264c.f20384f0.m34039lp();
        CoreModule.f18264c.f20384f0.m34091pp();
    }

    /* JADX INFO: renamed from: w2 */
    public void m42498w2() {
        if (NullChecker.m82486a(this.f25870p0)) {
            this.f25870p0.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: x1 */
    public void m42499x1(final String str, final x20 x20Var, final x20 x20Var2) {
        this.f25865k1 = x20Var2;
        this.f25858e1 = false;
        l51.m152919y(new Runnable() { // from class: l.pq6
            @Override // java.lang.Runnable
            public final void run() {
                this.f153639a.m42469f2(str, x20Var, x20Var2);
            }
        });
    }

    /* JADX INFO: renamed from: x2 */
    public final void m42500x2() {
        if (gra.m131657a2()) {
            m42413l1().duringCreated(m42443G1() ? CoreModule.f18264c.f20384f0.m33655Fq() : CoreModule.f18264c.f20384f0.m34217zn()).subscribe(psd0.m173596G(new y20() { // from class: l.po6
                @Override // p153l.y20
                public final void call(Object obj) {
                    ConversationsList.m42339A2();
                }
            }));
        }
    }

    /* JADX INFO: renamed from: y1 */
    public final void m42501y1() {
        m42413l1().duringCreated(CoreModule.m30934Q().mo68412M6().mo127349t()).observeOn(Schedulers.m222739io()).subscribe(psd0.m173597H(new y20() { // from class: l.iq6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationsList.m42339A2();
            }
        }, new y20() { // from class: l.jq6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationsList.m42359K((Throwable) obj);
            }
        }));
        m42413l1().duringCreated(CoreModule.m30934Q().mo68412M6().mo127335f()).subscribe(psd0.m173597H(new y20() { // from class: l.kq6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f128176a.m42470g2((uxj0) obj);
            }
        }, new y20() { // from class: l.lq6
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationsList.m42405h0((Throwable) obj);
            }
        }));
        this.f25862i1.lifecycle().subscribe(psd0.m173596G(new y20() { // from class: l.mq6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f138007a.m42471h2((C4470c) obj);
            }
        }));
        CoreModule.m30934Q().mo68412M6().mo127339j(m42413l1());
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
    public final List<Conversation> m42502y2(List<Conversation> list, boolean z) {
        LinkedHashMap<String, UserLiveLabel> linkedHashMapM34210zg;
        String strM42485q1;
        long j;
        int i;
        Conversation conversation;
        List<Conversation> list2 = list;
        if (gra.m131657a2() && !jyb.m147479J(list2) && !this.f25841S.m4081i() && (linkedHashMapM34210zg = CoreModule.f18264c.f20384f0.m34210zg(z)) != null && !linkedHashMapM34210zg.isEmpty()) {
            long jM174454o = pzi0.m174454o();
            HashSet<String> hashSetM34160vg = CoreModule.f18264c.f20384f0.m34160vg(z);
            int iMin = Math.min(list2.size(), 40);
            int i2 = z ? 1 : 2;
            if (!linkedHashMapM34210zg.isEmpty()) {
                int i3 = 0;
                while (true) {
                    if (i3 < Math.min(3, iMin)) {
                        if (!m42441F1(list2.get(i3), linkedHashMapM34210zg)) {
                            i3++;
                        }
                    } else if (list2.size() > 3) {
                        strM42485q1 = m42485q1(z);
                        if (TextUtils.isEmpty(strM42485q1)) {
                            m42490s2(jM174454o, pzi0.m174454o(), "1");
                            return list2;
                        }
                        j = jM174454o;
                        i = 0;
                        while (true) {
                            if (i < Math.min(40, list2.size())) {
                                conversation = null;
                                break;
                            }
                            if (TextUtils.equals(list2.get(i).f56859id, strM42485q1)) {
                                conversation = list2.get(i);
                                break;
                            }
                            i++;
                        }
                        if (conversation == null) {
                            m42490s2(j, pzi0.m174454o(), "2");
                            return list2;
                        }
                        vgl vglVar = new vgl(list2, 40);
                        vglVar.remove(conversation);
                        vglVar.add(i2, conversation);
                        m42490s2(j, pzi0.m174453n(), "insert");
                        list2 = vglVar;
                    }
                    j = jM174454o;
                }
            } else if (list2.size() > 3) {
                strM42485q1 = m42485q1(z);
                if (TextUtils.isEmpty(strM42485q1)) {
                    m42490s2(jM174454o, pzi0.m174454o(), "1");
                    return list2;
                }
                j = jM174454o;
                i = 0;
                while (true) {
                    if (i < Math.min(40, list2.size())) {
                        conversation = null;
                        break;
                    }
                    if (TextUtils.equals(list2.get(i).f56859id, strM42485q1)) {
                        conversation = list2.get(i);
                        break;
                    }
                    i++;
                }
                if (conversation == null) {
                    m42490s2(j, pzi0.m174454o(), "2");
                    return list2;
                }
                vgl vglVar2 = new vgl(list2, 40);
                vglVar2.remove(conversation);
                vglVar2.add(i2, conversation);
                m42490s2(j, pzi0.m174453n(), "insert");
                list2 = vglVar2;
            } else {
                j = jM174454o;
            }
            if (!hashSetM34160vg.isEmpty()) {
                m42490s2(j, pzi0.m174454o(), "3");
                return list2;
            }
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (!linkedHashMapM34210zg.isEmpty()) {
                int i4 = 6;
                for (int i5 = 0; i5 < iMin; i5++) {
                    Conversation conversation2 = list2.get(i5);
                    if (m42441F1(conversation2, linkedHashMapM34210zg)) {
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
                            hashSetM34160vg.add(((Conversation) it.next()).f56859id);
                            i6--;
                            if (i6 == 0) {
                                break;
                            }
                        }
                        if (i6 > 0) {
                            Iterator it2 = arrayList.iterator();
                            while (it2.hasNext()) {
                                hashSetM34160vg.add(((Conversation) it2.next()).f56859id);
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
            if (!jyb.m147479J(hashSetM34160vg)) {
                int i7 = 0;
                for (int i8 = 0; i8 < iMin; i8++) {
                    Conversation conversation3 = list2.get(i8);
                    i7 = hashSetM34160vg.contains(conversation3.f56859id) ? i7 + 1 : 0;
                    if (i7 == 3) {
                        hashSetM34160vg.remove(conversation3.f56859id);
                        i7 = 0;
                    }
                }
            }
            m42490s2(j, pzi0.m174454o(), "4");
        }
        return list2;
    }

    /* JADX INFO: renamed from: z1 */
    public final void m42503z1() {
        if (CoreModule.m30934Q().mo68412M6().mo127332c()) {
            m42413l1().duringCreated(CoreModule.m30934Q().mo68412M6().mo127342m()).observeOn(fo0.m126432a()).subscribe(psd0.m173597H(new y20() { // from class: l.zo6
                @Override // p153l.y20
                public final void call(Object obj) {
                    ConversationsList.m42339A2();
                }
            }, new y20() { // from class: l.ap6
                @Override // p153l.y20
                public final void call(Object obj) {
                    ConversationsList.m42403g0((Throwable) obj);
                }
            }));
        }
    }

    public ConversationsList(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25864k0 = null;
        this.f25828F0 = 23;
        this.f25829G0 = 39;
        this.f25830H0 = 40;
        this.f25831I0 = 41;
        this.f25832J0 = 42;
        this.f25833K0 = 43;
        this.f25834L0 = 45;
        this.f25835M0 = C22507a.m222759c(uxj0.f181467a);
        this.f25836N0 = false;
        this.f25837O0 = C22507a.m222759c(0);
        this.f25838P0 = C22507a.m222759c(vg60.m201220b());
        this.f25839Q0 = C22507a.m222759c(new ArrayList());
        this.f25840R0 = C22507a.m222759c(new ArrayList());
        this.f25842S0 = C22507a.m222759c(new ArrayList());
        this.f25844T0 = C22507a.m222759c(new ArrayList());
        this.f25846U0 = C22507a.m222759c(new ArrayList());
        this.f25848V0 = C22507a.m222759c(new ArrayList());
        this.f25850W0 = C22507a.m222759c(vg60.m201220b());
        this.f25851X0 = C22507a.m222759c(vg60.m201220b());
        this.f25852Y0 = new ArrayList();
        this.f25853Z0 = new ArrayList();
        this.f25855b1 = false;
        this.f25856c1 = false;
        this.f25858e1 = false;
        this.f25859f1 = null;
        this.f25860g1 = false;
        this.f25861h1 = false;
        this.f25866l1 = false;
        this.f25867m1 = 6;
        this.f25868n1 = 40;
        this.f25869o1 = 50;
    }
}
