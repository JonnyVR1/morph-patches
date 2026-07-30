package com.p000p1.mobile.putong.core.p001ui.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p000p1.mobile.putong.core.p001ui.main.ConversationsPage;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.CoreLikers;
import com.p1.mobile.putong.core.data.Conversation;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import l.a1c0;
import l.br6;
import l.c3c0;
import l.e51;
import l.fu7;
import l.l6c0;
import l.mkd0;
import l.q860;
import l.roj0;
import l.t100;
import l.xaj0;
import l.yij0;
import p003l.d30;
import p003l.dac0;
import p003l.e30;
import p003l.ejc0;
import p003l.jo0;
import p003l.jxk;
import p003l.m250;
import p003l.w9j;
import p003l.y9j;
import p014rx.C1099c;
import p014rx.Notification;
import p028v.VRecyclerView;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class ConversationsPage extends SwipeRefreshLayout implements SwipeRefreshLayout.j {

    /* JADX INFO: renamed from: E0 */
    public int f209E0;

    /* JADX INFO: renamed from: F0 */
    public int f210F0;

    /* JADX INFO: renamed from: S */
    public ConversationsPage f211S;

    /* JADX INFO: renamed from: T */
    public VRecyclerView f212T;

    /* JADX INFO: renamed from: U */
    public boolean f213U;

    /* JADX INFO: renamed from: V */
    public e30<String> f214V;

    /* JADX INFO: renamed from: W */
    public C0021a f215W;

    /* JADX INFO: renamed from: k0 */
    public jxk f216k0;

    /* JADX INFO: renamed from: p0 */
    public View f217p0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.main.ConversationsPage$a */
    public class C0021a extends dac0<Conversation> {

        /* JADX INFO: renamed from: c */
        public int f218c;

        /* JADX INFO: renamed from: d */
        public boolean f219d;

        /* JADX INFO: renamed from: e */
        public boolean f220e;

        /* JADX INFO: renamed from: f */
        public List<Conversation> f221f;

        /* JADX INFO: renamed from: g */
        public ejc0 f222g;

        public C0021a() {
            this.f218c = 0;
            this.f219d = false;
            this.f220e = false;
            this.f221f = Collections.EMPTY_LIST;
            this.f222g = new ejc0(ConversationsPage.this.m330M(), ConversationsPage.this.f212T, new e30() { // from class: l.zq6
                @Override // p003l.e30
                public final void call(Object obj) {
                    this.f9399a.m353I((Integer) obj);
                }
            }, 4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: I */
        public /* synthetic */ void m353I(Integer num) {
            Conversation item = getItem(num.intValue());
            if (NullChecker.a(item)) {
                ConversationView.m311k(item);
            }
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: C */
        public int mo203C() {
            ConversationsPage conversationsPage = ConversationsPage.this;
            if (!conversationsPage.f213U || conversationsPage.f209E0 != 0) {
                return this.f221f.size();
            }
            return (this.f219d ? 1 : 0) + (this.f218c == 0 ? 0 : 1) + this.f221f.size();
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: D */
        public View mo204D(ViewGroup viewGroup, int i) {
            return ConversationsPage.this.m330M().inflater().inflate(l6c0.I4, viewGroup, false);
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo202A(View view, Conversation conversation, int i, int i2) {
            if (i == 0) {
                ConversationView conversationView = (ConversationView) view;
                ConversationsPage conversationsPage = ConversationsPage.this;
                conversationView.m317j(this, conversation, conversationsPage.f213U, conversationsPage.f214V, conversationsPage.f209E0, i2);
            }
        }

        /* JADX INFO: renamed from: G */
        public final Conversation m355G(int i) {
            if (i >= this.f221f.size()) {
                return null;
            }
            return this.f221f.get(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        @Override // p003l.dac0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public Conversation getItem(int i) {
            ?? r0;
            ConversationsPage conversationsPage = ConversationsPage.this;
            if (!conversationsPage.f213U || conversationsPage.f209E0 != 0) {
                return m355G(i);
            }
            ?? r1 = this.f219d;
            if (this.f218c != 0) {
                r0 = r1;
                r0 = r1 + 1;
            }
            if (i < r0) {
                return null;
            }
            return m355G(i - r0);
        }

        /* JADX INFO: renamed from: J */
        public void m357J(boolean z, int i, List<Conversation> list) {
            this.f219d = z;
            this.f218c = i;
            this.f221f = list;
            this.f220e = true;
            this.f222g.m3853h();
            notifyDataSetChanged();
        }

        @Override // p003l.dac0
        /* JADX INFO: renamed from: e */
        public void mo358e(int i) {
            this.f222g.m3852g(i);
        }

        public long getItemId(int i) {
            return i;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        public int getItemViewType(int i) {
            ?? r0;
            ConversationsPage conversationsPage = ConversationsPage.this;
            if (conversationsPage.f213U && conversationsPage.f209E0 == 0) {
                ?? r1 = this.f219d;
                if (this.f218c != 0) {
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
        this.f213U = true;
        this.f209E0 = 0;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ Integer m322D(CoreLikers.a aVar) {
        if (CoreModule.P().i().e2()) {
            return Integer.valueOf(aVar.b);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: M */
    public PutongAct m330M() {
        return getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m331V() {
        if (m330M().isFinishing()) {
            return;
        }
        this.f211S.setRefreshing(false);
    }

    /* JADX INFO: renamed from: Z */
    private C1099c<roj0> m332Z() {
        return CoreModule.c.f0.Fo();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ Boolean m334x(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ Boolean m336z(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: L */
    public final void m337L(View view) {
        br6.a(this, view);
    }

    /* JADX INFO: renamed from: N */
    public final void m338N() {
        if (this.f216k0.m5456z()) {
            return;
        }
        this.f216k0.m5453F(this.f217p0);
    }

    /* JADX INFO: renamed from: O */
    public final void m339O(List<Conversation> list) {
        if (!CoreModule.P().i().R()) {
            m349a0();
            return;
        }
        if (list.size() == 0) {
            m338N();
            return;
        }
        if (list.size() != 1) {
            m349a0();
        } else if (User.isTeamAccount(list.get(0).otherUser)) {
            m338N();
        } else {
            m349a0();
        }
    }

    /* JADX INFO: renamed from: P */
    public final C1099c<q860<Conversation>> m340P(int i) {
        if (i == 0) {
            return CoreModule.P().i().E() ? CoreModule.c.f0.un() : CoreModule.c.f0.on();
        }
        if (i != 1) {
            return C1099c.just(q860.b());
        }
        return CoreModule.P().i().E() ? CoreModule.c.f0.hf() : CoreModule.c.f0.Ye();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public void m341Q(int i, boolean z, e30<String> e30Var, final boolean z2) {
        this.f213U = z;
        this.f214V = e30Var;
        this.f209E0 = i;
        if (isInEditMode()) {
            return;
        }
        e51.H(m330M(), new Runnable() { // from class: l.qq6
            @Override // java.lang.Runnable
            public final void run() {
                this.f6669a.m346W();
            }
        }, 1000L);
        m330M().duringCreated(ConnectivityReceiver.m().observeOn(jo0.m5414a()).map(new w9j() { // from class: l.rq6
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.g());
            }
        }).distinctUntilChanged().skip(1).filter(new w9j() { // from class: l.sq6
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return ConversationsPage.m336z((Boolean) obj);
            }
        })).subscribe((m250) mkd0.G(new e30() { // from class: l.tq6
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f7585a.m347X((Boolean) obj);
            }
        }));
        m330M().duringCreated(mkd0.s(CoreModule.c.f0.m0.obs(), m340P(i), CoreModule.c.u0.O6().map(new w9j() { // from class: l.uq6
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return ConversationsPage.m322D((CoreLikers.a) obj);
            }
        }).distinctUntilChanged(), new y9j() { // from class: l.vq6
            @Override // p003l.y9j
            /* JADX INFO: renamed from: a */
            public final Object mo2764a(Object obj, Object obj2, Object obj3) {
                return new xaj0((Integer) obj, (q860) obj2, (Integer) obj3);
            }
        })).observeOn(jo0.m5414a()).subscribe((m250) mkd0.G(new e30() { // from class: l.wq6
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f8600a.m342R(z2, (xaj0) obj);
            }
        }));
        m330M().duringCreated(CoreModule.c.e0.N7()).subscribe((m250) mkd0.G(new e30() { // from class: l.xq6
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f8818a.m343S((Map) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m342R(boolean z, xaj0 xaj0Var) {
        m350b0(z, ((Integer) xaj0Var.a).intValue(), ((q860) xaj0Var.b).a, ((Integer) xaj0Var.c).intValue());
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m343S(Map map) {
        this.f215W.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m344T(Boolean bool) {
        boolean zC = CoreModule.P().i().c();
        ConversationsPage conversationsPage = this.f211S;
        if (zC) {
            conversationsPage.setRefreshing(false);
        } else {
            conversationsPage.setRefreshing(true);
        }
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m345U(Throwable th) {
        if (m330M().isFinishing()) {
            return;
        }
        this.f211S.setRefreshing(false);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m346W() {
        m330M().duringCreated(CoreModule.c.f0.on().map(new fu7()).takeUntil(new w9j() { // from class: l.yq6
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }).filter(new w9j() { // from class: l.mq6
            @Override // p003l.w9j
            public final Object call(Object obj) {
                return ConversationsPage.m334x((Boolean) obj);
            }
        }).distinctUntilChanged()).subscribe((m250) mkd0.I(new e30() { // from class: l.nq6
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5950a.m344T((Boolean) obj);
            }
        }, new e30() { // from class: l.oq6
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f6202a.m345U((Throwable) obj);
            }
        }, new d30() { // from class: l.pq6
            @Override // p003l.d30
            public final void call() {
                this.f6489a.m331V();
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m347X(Boolean bool) {
        if (this.f211S.i()) {
            CoreModule.c.f0.Fo();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m348Y(Notification notification) {
        this.f211S.setRefreshing(false);
        if (notification.m9756j()) {
            yij0.D(notification.m9751e());
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m349a0() {
        if (this.f216k0.m5456z()) {
            this.f216k0.m5450C();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m350b0(boolean z, int i, List<Conversation> list, int i2) {
        if (z) {
            m339O(list);
        } else {
            m349a0();
        }
        boolean z2 = this.f213U && this.f209E0 == 0 && CoreModule.P().i().I2(i2);
        C0021a c0021a = this.f215W;
        if (this.f209E0 != 0 || !this.f213U) {
            i = 0;
        }
        c0021a.m357J(z2, i, list);
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
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m337L(this);
        h hVar = new h(getContext(), 1);
        hVar.h(m330M().drawable(c3c0.g7));
        this.f212T.addItemDecoration(hVar);
        this.f212T.setLayoutManager(new LinearLayoutManager(m330M()));
        C0021a c0021a = new C0021a();
        this.f215W = c0021a;
        jxk jxkVar = new jxk(c0021a);
        this.f216k0 = jxkVar;
        this.f212T.setAdapter(jxkVar);
        if (this.f217p0 == null) {
            View viewInflate = m330M().inflater().inflate(l6c0.J0, (ViewGroup) null);
            this.f217p0 = viewInflate;
            viewInflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        }
        this.f216k0.m5453F(this.f217p0);
        this.f211S.setOnRefreshListener(this);
        this.f211S.setColorSchemeResources(new int[]{a1c0.U, a1c0.R, a1c0.S, a1c0.T});
        this.f210F0 = ViewConfiguration.get(m330M()).getScaledTouchSlop();
        if (CoreModule.P().i().c()) {
            RecyclerView recyclerView = this.f212T;
            recyclerView.setPadding(recyclerView.getPaddingLeft(), this.f212T.getPaddingTop(), this.f212T.getPaddingRight(), t100.d(75.0f));
            this.f212T.setClipToPadding(false);
        }
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!NullChecker.a(this.f212T.getChildAt(0)) || this.f212T.getChildAt(0).getTop() == 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    /* JADX INFO: renamed from: q */
    public void m351q() {
        m332Z().materialize().first().subscribe((m250<? super Notification<roj0>>) mkd0.G(new e30() { // from class: l.lq6
            @Override // p003l.e30
            public final void call(Object obj) {
                this.f5384a.m348Y((Notification) obj);
            }
        }));
        if (CoreModule.P().i().c()) {
            CoreModule.c.C0.u4();
        }
    }

    public ConversationsPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f213U = true;
        this.f209E0 = 0;
    }
}
