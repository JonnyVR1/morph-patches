package com.p046p1.mobile.putong.core.p053ui.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.C0602h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.api.CoreLikers;
import com.p046p1.mobile.putong.core.data.Conversation;
import com.p046p1.mobile.putong.core.p053ui.main.ConversationsPage;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p133rx.C22306c;
import p133rx.Notification;
import p147v.VRecyclerView;
import p149l.a1c0;
import p149l.br6;
import p149l.c3c0;
import p149l.d30;
import p149l.dac0;
import p149l.e30;
import p149l.e51;
import p149l.ejc0;
import p149l.fu7;
import p149l.jo0;
import p149l.jxk;
import p149l.l6c0;
import p149l.mkd0;
import p149l.q860;
import p149l.roj0;
import p149l.t100;
import p149l.w9j;
import p149l.xaj0;
import p149l.y9j;
import p149l.yij0;

/* JADX INFO: loaded from: classes3.dex */
public class ConversationsPage extends SwipeRefreshLayout implements SwipeRefreshLayout.InterfaceC0700j {

    /* JADX INFO: renamed from: E0 */
    public int f30318E0;

    /* JADX INFO: renamed from: F0 */
    public int f30319F0;

    /* JADX INFO: renamed from: S */
    public ConversationsPage f30320S;

    /* JADX INFO: renamed from: T */
    public VRecyclerView f30321T;

    /* JADX INFO: renamed from: U */
    public boolean f30322U;

    /* JADX INFO: renamed from: V */
    public e30<String> f30323V;

    /* JADX INFO: renamed from: W */
    public C8438a f30324W;

    /* JADX INFO: renamed from: k0 */
    public jxk f30325k0;

    /* JADX INFO: renamed from: p0 */
    public View f30326p0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.main.ConversationsPage$a */
    public class C8438a extends dac0<Conversation> {

        /* JADX INFO: renamed from: c */
        public int f30327c;

        /* JADX INFO: renamed from: d */
        public boolean f30328d;

        /* JADX INFO: renamed from: e */
        public boolean f30329e;

        /* JADX INFO: renamed from: f */
        public List<Conversation> f30330f;

        /* JADX INFO: renamed from: g */
        public ejc0 f30331g;

        public C8438a() {
            this.f30327c = 0;
            this.f30328d = false;
            this.f30329e = false;
            this.f30330f = Collections.EMPTY_LIST;
            this.f30331g = new ejc0(ConversationsPage.this.m47300M(), ConversationsPage.this.f30321T, new e30() { // from class: l.zq6
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f204345a.m47322I((Integer) obj);
                }
            }, 4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: I */
        public /* synthetic */ void m47322I(Integer num) {
            Conversation item = getItem(num.intValue());
            if (NullChecker.m81303a(item)) {
                ConversationView.m47281k(item);
            }
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int mo28824C() {
            ConversationsPage conversationsPage = ConversationsPage.this;
            if (!conversationsPage.f30322U || conversationsPage.f30318E0 != 0) {
                return this.f30330f.size();
            }
            return (this.f30328d ? 1 : 0) + (this.f30327c == 0 ? 0 : 1) + this.f30330f.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            return ConversationsPage.this.m47300M().inflater().inflate(l6c0.f126316I4, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, Conversation conversation, int i, int i2) {
            if (i == 0) {
                ConversationView conversationView = (ConversationView) view;
                ConversationsPage conversationsPage = ConversationsPage.this;
                conversationView.m47287j(this, conversation, conversationsPage.f30322U, conversationsPage.f30323V, conversationsPage.f30318E0, i2);
            }
        }

        /* JADX INFO: renamed from: G */
        public final Conversation m47324G(int i) {
            if (i >= this.f30330f.size()) {
                return null;
            }
            return this.f30330f.get(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        @Override // p149l.dac0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public Conversation getItem(int i) {
            ?? r0;
            ConversationsPage conversationsPage = ConversationsPage.this;
            if (!conversationsPage.f30322U || conversationsPage.f30318E0 != 0) {
                return m47324G(i);
            }
            ?? r1 = this.f30328d;
            if (this.f30327c != 0) {
                r0 = r1;
                r0 = r1 + 1;
            }
            if (i < r0) {
                return null;
            }
            return m47324G(i - r0);
        }

        /* JADX INFO: renamed from: J */
        public void m47326J(boolean z, int i, List<Conversation> list) {
            this.f30328d = z;
            this.f30327c = i;
            this.f30330f = list;
            this.f30329e = true;
            this.f30331g.m116782h();
            notifyDataSetChanged();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: e */
        public void mo47327e(int i) {
            this.f30331g.m116781g(i);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public long getItemId(int i) {
            return i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            ?? r0;
            ConversationsPage conversationsPage = ConversationsPage.this;
            if (conversationsPage.f30322U && conversationsPage.f30318E0 == 0) {
                ?? r1 = this.f30328d;
                if (this.f30327c != 0) {
                    r0 = r1;
                    r0 = r1 + 1;
                }
                if (i < r0) {
                    return 1;
                }
            }
            return 0;
        }
    }

    public ConversationsPage(Context context) {
        super(context);
        this.f30322U = true;
        this.f30318E0 = 0;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ Integer m47292D(CoreLikers.C4719a c4719a) {
        if (CoreModule.m29935P().m94658i().mo33489e2()) {
            return Integer.valueOf(c4719a.f19270b);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public PutongAct m47300M() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m47301V() {
        if (m47300M().isFinishing()) {
            return;
        }
        this.f30320S.setRefreshing(false);
    }

    /* JADX INFO: renamed from: Z */
    private C22306c<roj0> m47302Z() {
        return CoreModule.f17545c.f19642f0.m32650Fo();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ Boolean m47304x(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ Boolean m47306z(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: L */
    public final void m47307L(View view) {
        br6.m103474a(this, view);
    }

    /* JADX INFO: renamed from: N */
    public final void m47308N() {
        if (this.f30325k0.m143816z()) {
            return;
        }
        this.f30325k0.m143813F(this.f30326p0);
    }

    /* JADX INFO: renamed from: O */
    public final void m47309O(List<Conversation> list) {
        if (!CoreModule.m29935P().m94658i().mo158293R()) {
            m47319a0();
            return;
        }
        if (list.size() == 0) {
            m47308N();
            return;
        }
        if (list.size() != 1) {
            m47319a0();
        } else if (User.isTeamAccount(list.get(0).otherUser)) {
            m47308N();
        } else {
            m47319a0();
        }
    }

    /* JADX INFO: renamed from: P */
    public final C22306c<q860<Conversation>> m47310P(int i) {
        if (i == 0) {
            return CoreModule.m29935P().m94658i().mo158222E() ? CoreModule.f17545c.f19642f0.m33151un() : CoreModule.f17545c.f19642f0.m33073on();
        }
        if (i != 1) {
            return C22306c.just(q860.m173342b());
        }
        return CoreModule.m29935P().m94658i().mo158222E() ? CoreModule.f17545c.f19642f0.m32975hf() : CoreModule.f17545c.f19642f0.m32868Ye();
    }

    /* JADX INFO: renamed from: Q */
    public void m47311Q(int i, boolean z, e30<String> e30Var, final boolean z2) {
        this.f30322U = z;
        this.f30323V = e30Var;
        this.f30318E0 = i;
        if (isInEditMode()) {
            return;
        }
        e51.m114743H(m47300M(), new Runnable() { // from class: l.qq6
            @Override // java.lang.Runnable
            public final void run() {
                this.f155868a.m47316W();
            }
        }, 1000L);
        m47300M().duringCreated(ConnectivityReceiver.m81290m().observeOn(jo0.m142408a()).map(new w9j() { // from class: l.rq6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m81284g());
            }
        }).distinctUntilChanged().skip(1).filter(new w9j() { // from class: l.sq6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ConversationsPage.m47306z((Boolean) obj);
            }
        })).subscribe(mkd0.m154955G(new e30() { // from class: l.tq6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f171549a.m47317X((Boolean) obj);
            }
        }));
        m47300M().duringCreated(mkd0.m154985s(CoreModule.f17545c.f19642f0.f19955m0.obs(), m47310P(i), CoreModule.f17545c.f19687u0.m30405O6().map(new w9j() { // from class: l.uq6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ConversationsPage.m47292D((CoreLikers.C4719a) obj);
            }
        }).distinctUntilChanged(), new y9j() { // from class: l.vq6
            @Override // p149l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo94599a(Object obj, Object obj2, Object obj3) {
                return new xaj0((Integer) obj, (q860) obj2, (Integer) obj3);
            }
        })).observeOn(jo0.m142408a()).subscribe(mkd0.m154955G(new e30() { // from class: l.wq6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f187646a.m47312R(z2, (xaj0) obj);
            }
        }));
        m47300M().duringCreated(CoreModule.f17545c.f19639e0.m169419N7()).subscribe(mkd0.m154955G(new e30() { // from class: l.xq6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f193986a.m47313S((Map) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m47312R(boolean z, xaj0 xaj0Var) {
        m47320b0(z, ((Integer) xaj0Var.f191751a).intValue(), ((q860) xaj0Var.f191752b).f153135a, ((Integer) xaj0Var.f191753c).intValue());
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m47313S(Map map) {
        this.f30324W.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m47314T(Boolean bool) {
        boolean zMo158354c = CoreModule.m29935P().m94658i().mo158354c();
        ConversationsPage conversationsPage = this.f30320S;
        if (zMo158354c) {
            conversationsPage.setRefreshing(false);
        } else {
            conversationsPage.setRefreshing(true);
        }
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m47315U(Throwable th) {
        if (m47300M().isFinishing()) {
            return;
        }
        this.f30320S.setRefreshing(false);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m47316W() {
        m47300M().duringCreated(CoreModule.f17545c.f19642f0.m33073on().map(new fu7()).takeUntil((w9j<? super R, Boolean>) new w9j() { // from class: l.yq6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }).filter(new w9j() { // from class: l.mq6
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ConversationsPage.m47304x((Boolean) obj);
            }
        }).distinctUntilChanged()).subscribe(mkd0.m154957I(new e30() { // from class: l.nq6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f140041a.m47314T((Boolean) obj);
            }
        }, new e30() { // from class: l.oq6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f145110a.m47315U((Throwable) obj);
            }
        }, new d30() { // from class: l.pq6
            @Override // p149l.d30
            public final void call() {
                this.f150761a.m47301V();
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m47317X(Boolean bool) {
        if (this.f30320S.m4079i()) {
            CoreModule.f17545c.f19642f0.m32650Fo();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m47318Y(Notification notification) {
        this.f30320S.setRefreshing(false);
        if (notification.m221299j()) {
            yij0.m214926D(notification.m221294e());
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m47319a0() {
        if (this.f30325k0.m143816z()) {
            this.f30325k0.m143810C();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m47320b0(boolean z, int i, List<Conversation> list, int i2) {
        if (z) {
            m47309O(list);
        } else {
            m47319a0();
        }
        boolean z2 = this.f30322U && this.f30318E0 == 0 && CoreModule.m29935P().m94658i().mo158245I2(i2);
        C8438a c8438a = this.f30324W;
        if (this.f30318E0 != 0 || !this.f30322U) {
            i = 0;
        }
        c8438a.m47326J(z2, i, list);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m47307L(this);
        C0602h c0602h = new C0602h(getContext(), 1);
        c0602h.m3705h(m47300M().drawable(c3c0.f78754g7));
        this.f30321T.addItemDecoration(c0602h);
        this.f30321T.setLayoutManager(new LinearLayoutManager(m47300M()));
        C8438a c8438a = new C8438a();
        this.f30324W = c8438a;
        jxk jxkVar = new jxk(c8438a);
        this.f30325k0 = jxkVar;
        this.f30321T.setAdapter(jxkVar);
        if (this.f30326p0 == null) {
            View viewInflate = m47300M().inflater().inflate(l6c0.f126319J0, (ViewGroup) null);
            this.f30326p0 = viewInflate;
            viewInflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        }
        this.f30325k0.m143813F(this.f30326p0);
        this.f30320S.setOnRefreshListener(this);
        this.f30320S.setColorSchemeResources(a1c0.f67139U, a1c0.f67136R, a1c0.f67137S, a1c0.f67138T);
        this.f30319F0 = ViewConfiguration.get(m47300M()).getScaledTouchSlop();
        if (CoreModule.m29935P().m94658i().mo158354c()) {
            VRecyclerView vRecyclerView = this.f30321T;
            vRecyclerView.setPadding(vRecyclerView.getPaddingLeft(), this.f30321T.getPaddingTop(), this.f30321T.getPaddingRight(), t100.m186890d(75.0f));
            this.f30321T.setClipToPadding(false);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!NullChecker.m81303a(this.f30321T.getChildAt(0)) || this.f30321T.getChildAt(0).getTop() == 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0700j
    /* JADX INFO: renamed from: q */
    public void mo4094q() {
        m47302Z().materialize().first().subscribe(mkd0.m154955G(new e30() { // from class: l.lq6
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f129296a.m47318Y((Notification) obj);
            }
        }));
        if (CoreModule.m29935P().m94658i().mo158354c()) {
            CoreModule.f17545c.f19555C0.m210112u4();
        }
    }

    public ConversationsPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f30322U = true;
        this.f30318E0 = 0;
    }
}
