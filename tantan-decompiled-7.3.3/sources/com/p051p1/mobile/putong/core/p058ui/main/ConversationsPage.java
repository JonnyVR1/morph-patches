package com.p051p1.mobile.putong.core.p058ui.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.C0604h;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.api.CoreLikers;
import com.p051p1.mobile.putong.core.data.Conversation;
import com.p051p1.mobile.putong.core.p058ui.main.ConversationsPage;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.ConnectivityReceiver;
import com.tantanapp.common.utils.NullChecker;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import p137rx.C22421c;
import p137rx.Notification;
import p151v.VRecyclerView;
import p153l.bkj0;
import p153l.bsj0;
import p153l.es6;
import p153l.fo0;
import p153l.g9c0;
import p153l.ibc0;
import p153l.jic0;
import p153l.jv7;
import p153l.l51;
import p153l.lrc0;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.qec0;
import p153l.scj;
import p153l.uxj0;
import p153l.vg60;
import p153l.x20;
import p153l.y20;
import p153l.zzk;

/* JADX INFO: loaded from: classes3.dex */
public class ConversationsPage extends SwipeRefreshLayout implements SwipeRefreshLayout.InterfaceC0702j {

    /* JADX INFO: renamed from: E0 */
    public int f31166E0;

    /* JADX INFO: renamed from: F0 */
    public int f31167F0;

    /* JADX INFO: renamed from: S */
    public ConversationsPage f31168S;

    /* JADX INFO: renamed from: T */
    public VRecyclerView f31169T;

    /* JADX INFO: renamed from: U */
    public boolean f31170U;

    /* JADX INFO: renamed from: V */
    public y20<String> f31171V;

    /* JADX INFO: renamed from: W */
    public C8601a f31172W;

    /* JADX INFO: renamed from: k0 */
    public zzk f31173k0;

    /* JADX INFO: renamed from: p0 */
    public View f31174p0;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.main.ConversationsPage$a */
    public class C8601a extends jic0<Conversation> {

        /* JADX INFO: renamed from: c */
        public int f31175c;

        /* JADX INFO: renamed from: d */
        public boolean f31176d;

        /* JADX INFO: renamed from: e */
        public boolean f31177e;

        /* JADX INFO: renamed from: f */
        public List<Conversation> f31178f;

        /* JADX INFO: renamed from: g */
        public lrc0 f31179g;

        public C8601a() {
            this.f31175c = 0;
            this.f31176d = false;
            this.f31177e = false;
            this.f31178f = Collections.EMPTY_LIST;
            this.f31179g = new lrc0(ConversationsPage.this.m48483M(), ConversationsPage.this.f31169T, new y20() { // from class: l.cs6
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f83418a.m48505I((Integer) obj);
                }
            }, 4);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: I */
        public /* synthetic */ void m48505I(Integer num) {
            Conversation item = getItem(num.intValue());
            if (NullChecker.m82486a(item)) {
                ConversationView.m48464k(item);
            }
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int mo29823C() {
            ConversationsPage conversationsPage = ConversationsPage.this;
            if (!conversationsPage.f31170U || conversationsPage.f31166E0 != 0) {
                return this.f31178f.size();
            }
            return (this.f31176d ? 1 : 0) + (this.f31175c == 0 ? 0 : 1) + this.f31178f.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            return ConversationsPage.this.m48483M().inflater().inflate(qec0.f156872I4, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, Conversation conversation, int i, int i2) {
            if (i == 0) {
                ConversationView conversationView = (ConversationView) view;
                ConversationsPage conversationsPage = ConversationsPage.this;
                conversationView.m48470j(this, conversation, conversationsPage.f31170U, conversationsPage.f31171V, conversationsPage.f31166E0, i2);
            }
        }

        /* JADX INFO: renamed from: G */
        public final Conversation m48507G(int i) {
            if (i >= this.f31178f.size()) {
                return null;
            }
            return this.f31178f.get(i);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v2, types: [boolean, int] */
        /* JADX WARN: Type inference failed for: r0v3, types: [int] */
        /* JADX WARN: Type inference failed for: r0v5 */
        /* JADX WARN: Type inference failed for: r0v6 */
        @Override // p153l.jic0
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public Conversation getItem(int i) {
            ?? r0;
            ConversationsPage conversationsPage = ConversationsPage.this;
            if (!conversationsPage.f31170U || conversationsPage.f31166E0 != 0) {
                return m48507G(i);
            }
            ?? r1 = this.f31176d;
            if (this.f31175c != 0) {
                r0 = r1;
                r0 = r1 + 1;
            }
            if (i < r0) {
                return null;
            }
            return m48507G(i - r0);
        }

        /* JADX INFO: renamed from: J */
        public void m48509J(boolean z, int i, List<Conversation> list) {
            this.f31176d = z;
            this.f31175c = i;
            this.f31178f = list;
            this.f31177e = true;
            this.f31179g.m155611h();
            notifyDataSetChanged();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: e */
        public void mo48510e(int i) {
            this.f31179g.m155610g(i);
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
            if (conversationsPage.f31170U && conversationsPage.f31166E0 == 0) {
                ?? r1 = this.f31176d;
                if (this.f31175c != 0) {
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
        this.f31170U = true;
        this.f31166E0 = 0;
    }

    /* JADX INFO: renamed from: D */
    public static /* synthetic */ Integer m48475D(CoreLikers.C4870a c4870a) {
        if (CoreModule.m30933P().m143412i().mo34492e2()) {
            return Integer.valueOf(c4870a.f20012b);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: M */
    public PutongAct m48483M() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: V */
    public /* synthetic */ void m48484V() {
        if (m48483M().isFinishing()) {
            return;
        }
        this.f31168S.setRefreshing(false);
    }

    /* JADX INFO: renamed from: Z */
    private C22421c<uxj0> m48485Z() {
        return CoreModule.f18264c.f20384f0.m33653Fo();
    }

    /* JADX INFO: renamed from: x */
    public static /* synthetic */ Boolean m48487x(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: z */
    public static /* synthetic */ Boolean m48489z(Boolean bool) {
        return bool;
    }

    /* JADX INFO: renamed from: L */
    public final void m48490L(View view) {
        es6.m122305a(this, view);
    }

    /* JADX INFO: renamed from: N */
    public final void m48491N() {
        if (this.f31173k0.m222266z()) {
            return;
        }
        this.f31173k0.m222263F(this.f31174p0);
    }

    /* JADX INFO: renamed from: O */
    public final void m48492O(List<Conversation> list) {
        if (!CoreModule.m30933P().m143412i().mo180385R()) {
            m48502a0();
            return;
        }
        if (list.size() == 0) {
            m48491N();
            return;
        }
        if (list.size() != 1) {
            m48502a0();
        } else if (User.isTeamAccount(list.get(0).otherUser)) {
            m48491N();
        } else {
            m48502a0();
        }
    }

    /* JADX INFO: renamed from: P */
    public final C22421c<vg60<Conversation>> m48493P(int i) {
        if (i == 0) {
            return CoreModule.m30933P().m143412i().mo180314E() ? CoreModule.f18264c.f20384f0.m34154un() : CoreModule.f18264c.f20384f0.m34076on();
        }
        if (i != 1) {
            return C22421c.just(vg60.m201220b());
        }
        return CoreModule.m30933P().m143412i().mo180314E() ? CoreModule.f18264c.f20384f0.m33978hf() : CoreModule.f18264c.f20384f0.m33871Ye();
    }

    /* JADX INFO: renamed from: Q */
    public void m48494Q(int i, boolean z, y20<String> y20Var, final boolean z2) {
        this.f31170U = z;
        this.f31171V = y20Var;
        this.f31166E0 = i;
        if (isInEditMode()) {
            return;
        }
        l51.m152888H(m48483M(), new Runnable() { // from class: l.tr6
            @Override // java.lang.Runnable
            public final void run() {
                this.f175807a.m48499W();
            }
        }, 1000L);
        m48483M().duringCreated(ConnectivityReceiver.m82473m().observeOn(fo0.m126432a()).map(new qcj() { // from class: l.ur6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(ConnectivityReceiver.m82467g());
            }
        }).distinctUntilChanged().skip(1).filter(new qcj() { // from class: l.vr6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ConversationsPage.m48489z((Boolean) obj);
            }
        })).subscribe(psd0.m173596G(new y20() { // from class: l.wr6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f190485a.m48500X((Boolean) obj);
            }
        }));
        m48483M().duringCreated(psd0.m173626s(CoreModule.f18264c.f20384f0.f20697m0.obs(), m48493P(i), CoreModule.f18264c.f20429u0.m31415S6().map(new qcj() { // from class: l.xr6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ConversationsPage.m48475D((CoreLikers.C4870a) obj);
            }
        }).distinctUntilChanged(), new scj() { // from class: l.yr6
            @Override // p153l.scj
            /* JADX INFO: renamed from: a */
            public final Object mo95332a(Object obj, Object obj2, Object obj3) {
                return new bkj0((Integer) obj, (vg60) obj2, (Integer) obj3);
            }
        })).observeOn(fo0.m126432a()).subscribe(psd0.m173596G(new y20() { // from class: l.zr6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f205739a.m48495R(z2, (bkj0) obj);
            }
        }));
        m48483M().duringCreated(CoreModule.f18264c.f20381e0.m116492N7()).subscribe(psd0.m173596G(new y20() { // from class: l.as6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f73082a.m48496S((Map) obj);
            }
        }));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: R */
    public final /* synthetic */ void m48495R(boolean z, bkj0 bkj0Var) {
        m48503b0(z, ((Integer) bkj0Var.f77081a).intValue(), ((vg60) bkj0Var.f77082b).f184001a, ((Integer) bkj0Var.f77083c).intValue());
    }

    /* JADX INFO: renamed from: S */
    public final /* synthetic */ void m48496S(Map map) {
        this.f31172W.notifyDataSetChanged();
    }

    /* JADX INFO: renamed from: T */
    public final /* synthetic */ void m48497T(Boolean bool) {
        boolean zMo180446c = CoreModule.m30933P().m143412i().mo180446c();
        ConversationsPage conversationsPage = this.f31168S;
        if (zMo180446c) {
            conversationsPage.setRefreshing(false);
        } else {
            conversationsPage.setRefreshing(true);
        }
    }

    /* JADX INFO: renamed from: U */
    public final /* synthetic */ void m48498U(Throwable th) {
        if (m48483M().isFinishing()) {
            return;
        }
        this.f31168S.setRefreshing(false);
    }

    /* JADX INFO: renamed from: W */
    public final /* synthetic */ void m48499W() {
        m48483M().duringCreated(CoreModule.f18264c.f20384f0.m34076on().map(new jv7()).takeUntil((qcj<? super R, Boolean>) new qcj() { // from class: l.bs6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(!((Boolean) obj).booleanValue());
            }
        }).filter(new qcj() { // from class: l.pr6
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ConversationsPage.m48487x((Boolean) obj);
            }
        }).distinctUntilChanged()).subscribe(psd0.m173598I(new y20() { // from class: l.qr6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f159068a.m48497T((Boolean) obj);
            }
        }, new y20() { // from class: l.rr6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f164558a.m48498U((Throwable) obj);
            }
        }, new x20() { // from class: l.sr6
            @Override // p153l.x20
            public final void call() {
                this.f170309a.m48484V();
            }
        }));
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m48500X(Boolean bool) {
        if (this.f31168S.m4081i()) {
            CoreModule.f18264c.f20384f0.m33653Fo();
        }
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m48501Y(Notification notification) {
        this.f31168S.setRefreshing(false);
        if (notification.m222545j()) {
            bsj0.m106246D(notification.m222540e());
        }
    }

    /* JADX INFO: renamed from: a0 */
    public final void m48502a0() {
        if (this.f31173k0.m222266z()) {
            this.f31173k0.m222260C();
        }
    }

    /* JADX INFO: renamed from: b0 */
    public final void m48503b0(boolean z, int i, List<Conversation> list, int i2) {
        if (z) {
            m48492O(list);
        } else {
            m48502a0();
        }
        boolean z2 = this.f31170U && this.f31166E0 == 0 && CoreModule.m30933P().m143412i().mo180337I2(i2);
        C8601a c8601a = this.f31172W;
        if (this.f31166E0 != 0 || !this.f31170U) {
            i = 0;
        }
        c8601a.m48509J(z2, i, list);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m48490L(this);
        C0604h c0604h = new C0604h(getContext(), 1);
        c0604h.m3706h(m48483M().drawable(ibc0.f114029g7));
        this.f31169T.addItemDecoration(c0604h);
        this.f31169T.setLayoutManager(new LinearLayoutManager(m48483M()));
        C8601a c8601a = new C8601a();
        this.f31172W = c8601a;
        zzk zzkVar = new zzk(c8601a);
        this.f31173k0 = zzkVar;
        this.f31169T.setAdapter(zzkVar);
        if (this.f31174p0 == null) {
            View viewInflate = m48483M().inflater().inflate(qec0.f156875J0, (ViewGroup) null);
            this.f31174p0 = viewInflate;
            viewInflate.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        }
        this.f31173k0.m222263F(this.f31174p0);
        this.f31168S.setOnRefreshListener(this);
        this.f31168S.setColorSchemeResources(g9c0.f102803U, g9c0.f102800R, g9c0.f102801S, g9c0.f102802T);
        this.f31167F0 = ViewConfiguration.get(m48483M()).getScaledTouchSlop();
        if (CoreModule.m30933P().m143412i().mo180446c()) {
            VRecyclerView vRecyclerView = this.f31169T;
            vRecyclerView.setPadding(vRecyclerView.getPaddingLeft(), this.f31169T.getPaddingTop(), this.f31169T.getPaddingRight(), qa00.m175859d(75.0f));
            this.f31169T.setClipToPadding(false);
        }
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout, android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (!NullChecker.m82486a(this.f31169T.getChildAt(0)) || this.f31169T.getChildAt(0).getTop() == 0) {
            return super.onInterceptTouchEvent(motionEvent);
        }
        return false;
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.InterfaceC0702j
    /* JADX INFO: renamed from: p */
    public void mo4096p() {
        m48485Z().materialize().first().subscribe(psd0.m173596G(new y20() { // from class: l.or6
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f148677a.m48501Y((Notification) obj);
            }
        }));
        if (CoreModule.m30933P().m143412i().mo180446c()) {
            CoreModule.f18264c.f20297C0.m146425v4();
        }
    }

    public ConversationsPage(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f31170U = true;
        this.f31166E0 = 0;
    }
}
