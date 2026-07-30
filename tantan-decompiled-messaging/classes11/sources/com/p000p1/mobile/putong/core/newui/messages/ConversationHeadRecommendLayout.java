package com.p000p1.mobile.putong.core.newui.messages;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.newui.messages.ConversationHeadRecommendLayout;
import com.p000p1.mobile.putong.core.newui.messages.recommend.view.NewMatchItemLayout;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.ui.bubble.d;
import com.p1.mobile.putong.app.PutongAct;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.R;
import com.p1.mobile.putong.core.data.FriendInfo;
import com.p1.mobile.putong.core.data.FriendSuggestInfo;
import com.p1.mobile.putong.core.data.FriendSuggestReason;
import com.p1.mobile.putong.core.data.GrowthMesInfo;
import com.p1.mobile.putong.core.data.InteractionType;
import com.p1.mobile.putong.core.data.LiveMultiCallInfo;
import com.p1.mobile.putong.core.data.Message;
import com.p1.mobile.putong.core.data.MonetizationChatSeeUser;
import com.p1.mobile.putong.core.data.QuickChatCardInfo;
import com.p1.mobile.putong.core.data.RealtimeRefreshNewMatch;
import com.p1.mobile.putong.core.data.Recommended;
import com.p1.mobile.putong.core.data.Relation;
import com.p1.mobile.putong.core.data.SpotLightLiveInfo;
import com.p1.mobile.putong.core.data.SpotLightSeeInfo;
import com.p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import l.a86;
import l.c4g0;
import l.d30;
import l.dac0;
import l.e30;
import l.e51;
import l.f6c0;
import l.mkd0;
import l.t100;
import l.upa;
import l.vwb;
import l.w9j;
import l.x2c0;
import l.xdl0;
import org.jetbrains.annotations.NotNull;
import p009l.lrb;
import p009l.mqi0;
import p009l.rd6;
import p009l.u76;
import p009l.v76;
import rx.c;
import rx.subjects.a;
import v.VFrame;
import v.VLinear;
import v.VRecyclerView;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class ConversationHeadRecommendLayout extends VFrame {

    /* JADX INFO: renamed from: x */
    public static C0279c f3517x;

    /* JADX INFO: renamed from: a */
    public ConversationHeadRecommendLayout f3518a;

    /* JADX INFO: renamed from: b */
    public VLinear f3519b;

    /* JADX INFO: renamed from: c */
    public VFrame f3520c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f3521d;

    /* JADX INFO: renamed from: e */
    public VText f3522e;

    /* JADX INFO: renamed from: f */
    public VText f3523f;

    /* JADX INFO: renamed from: g */
    public TextView f3524g;

    /* JADX INFO: renamed from: h */
    public ViewStub f3525h;

    /* JADX INFO: renamed from: i */
    public VRecyclerView f3526i;

    /* JADX INFO: renamed from: j */
    public SVGAnimationView f3527j;

    /* JADX INFO: renamed from: k */
    public View f3528k;

    /* JADX INFO: renamed from: l */
    public c4g0 f3529l;

    /* JADX INFO: renamed from: m */
    public C0278b f3530m;

    /* JADX INFO: renamed from: n */
    public final a<List<C0279c>> f3531n;

    /* JADX INFO: renamed from: o */
    public long f3532o;

    /* JADX INFO: renamed from: p */
    public BaseConversationMatchItemLayout f3533p;

    /* JADX INFO: renamed from: q */
    public IntlConversationOnlyBoostView f3534q;

    /* JADX INFO: renamed from: r */
    public double f3535r;

    /* JADX INFO: renamed from: s */
    public boolean f3536s;

    /* JADX INFO: renamed from: t */
    public boolean f3537t;

    /* JADX INFO: renamed from: u */
    public a<Boolean> f3538u;

    /* JADX INFO: renamed from: v */
    public List<C0279c> f3539v;

    /* JADX INFO: renamed from: w */
    public boolean f3540w;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationHeadRecommendLayout$a */
    public class C0277a extends RecyclerView.t {
        public C0277a() {
        }

        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 1) {
                d.l().k("showNewMatchUserGuidePop");
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationHeadRecommendLayout$b */
    public class C0278b extends dac0<C0279c> {

        /* JADX INFO: renamed from: c */
        public final List<C0279c> f3542c;

        /* JADX INFO: renamed from: d */
        public final Set<String> f3543d;

        public C0278b() {
            ArrayList arrayList = new ArrayList();
            this.f3542c = arrayList;
            this.f3543d = new HashSet();
            arrayList.add(new C0279c(12, ""));
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0014  */
        /* JADX INFO: renamed from: E */
        public static /* synthetic */ Boolean m4872E(String str, C0279c c0279c) {
            boolean z;
            if (NullChecker.a(c0279c) && TextUtils.equals(str, c0279c.f3555d)) {
                z = c0279c.f3552a != 1;
            }
            return Boolean.valueOf(z);
        }

        /* JADX INFO: renamed from: C */
        public int m4877C() {
            return this.f3542c.size();
        }

        /* JADX INFO: renamed from: D */
        public View m4878D(ViewGroup viewGroup, int i) {
            int i2 = C0279c.f3548G;
            ConversationHeadRecommendLayout conversationHeadRecommendLayout = ConversationHeadRecommendLayout.this;
            if (i == i2) {
                return conversationHeadRecommendLayout.m4853P().inflater().inflate(f6c0.Hb, viewGroup, false);
            }
            if (conversationHeadRecommendLayout.m4862Z()) {
                return ConversationHeadRecommendLayout.this.m4853P().inflater().inflate(f6c0.Gb, viewGroup, false);
            }
            if (i == 1 || i == 14) {
                return ConversationHeadRecommendLayout.this.m4853P().inflater().inflate(f6c0.V1, viewGroup, false);
            }
            if (i == 9) {
                return ConversationHeadRecommendLayout.this.m4853P().inflater().inflate(f6c0.R3, viewGroup, false);
            }
            ConversationHeadRecommendLayout conversationHeadRecommendLayout2 = ConversationHeadRecommendLayout.this;
            if (i == 10) {
                return conversationHeadRecommendLayout2.m4853P().inflater().inflate(f6c0.D, viewGroup, false);
            }
            if (conversationHeadRecommendLayout2.m4863a0(i)) {
                return ConversationHeadRecommendLayout.this.m4853P().inflater().inflate(f6c0.a2, viewGroup, false);
            }
            if (i == 20) {
                return ConversationHeadRecommendLayout.this.m4853P().inflater().inflate(f6c0.G1, viewGroup, false);
            }
            if (i == 22) {
                return ConversationHeadRecommendLayout.this.m4853P().inflater().inflate(f6c0.F1, viewGroup, false);
            }
            ConversationHeadRecommendLayout conversationHeadRecommendLayout3 = ConversationHeadRecommendLayout.this;
            return i == 24 ? conversationHeadRecommendLayout3.m4853P().inflater().inflate(f6c0.H1, viewGroup, false) : conversationHeadRecommendLayout3.m4853P().inflater().inflate(f6c0.Fb, viewGroup, false);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public void m4876A(View view, C0279c c0279c, int i, int i2) {
            if (i == 0) {
                m4889S(view);
                return;
            }
            if (i == C0279c.f3548G) {
                ConversationHeadRecommendLayout conversationHeadRecommendLayout = ConversationHeadRecommendLayout.this;
                ((NewMatchItemLayout) view).m6701o(conversationHeadRecommendLayout.f3530m, c0279c, conversationHeadRecommendLayout.f3527j);
                return;
            }
            if (ConversationHeadRecommendLayout.this.m4862Z()) {
                m4893W(view, c0279c);
                return;
            }
            if (i == 1 || i == 14) {
                m4892V(view, c0279c);
                return;
            }
            if (i == 9) {
                ((ConversationHeadIntlSeeItem) view).m4830L(this);
                return;
            }
            if (i == 10) {
                m4886P(view, c0279c, i2);
                if (upa.z()) {
                    view.setBackgroundResource(x2c0.Qg);
                    return;
                }
                return;
            }
            if (ConversationHeadRecommendLayout.this.m4863a0(i)) {
                m4895Y(view, c0279c, i2);
                return;
            }
            if (i == 20) {
                m4890T(view, c0279c);
                if (upa.z()) {
                    view.setBackgroundResource(x2c0.Qg);
                    return;
                }
                return;
            }
            if (i == 22) {
                m4887Q(view, c0279c);
                if (upa.z()) {
                    view.setBackgroundResource(x2c0.Qg);
                    return;
                }
                return;
            }
            if (i == 24) {
                m4888R(view, c0279c);
                return;
            }
            m4894X(view, c0279c, i2);
            if (upa.z()) {
                view.setBackgroundResource(x2c0.Qg);
            }
        }

        /* JADX INFO: renamed from: J */
        public void m4880J() {
            this.f3543d.clear();
        }

        /* JADX INFO: renamed from: K */
        public Act m4881K() {
            return ConversationHeadRecommendLayout.this.m4853P();
        }

        /* JADX INFO: renamed from: L */
        public List<C0279c> m4882L() {
            return this.f3542c;
        }

        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public C0279c getItem(int i) {
            return this.f3542c.get(i);
        }

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ void m4884N(final String str, boolean z) {
            List list = (List) ConversationHeadRecommendLayout.this.f3531n.e();
            int iG = vwb.G(list, new w9j() { // from class: l.y76
                public final Object call(Object obj) {
                    ConversationHeadRecommendLayout.C0279c c0279c = (ConversationHeadRecommendLayout.C0279c) obj;
                    return Boolean.valueOf(NullChecker.a(c0279c) && TextUtils.equals(str, c0279c.f3555d));
                }
            });
            if (iG >= 0) {
                C0279c c0279c = (C0279c) list.get(iG);
                if (NullChecker.a(c0279c) && z && c0279c.m4897b()) {
                    return;
                } else {
                    list.remove(iG);
                }
            }
            int iG2 = vwb.G(this.f3542c, new w9j() { // from class: l.z76
                public final Object call(Object obj) {
                    return ConversationHeadRecommendLayout.C0278b.m4872E(str, (ConversationHeadRecommendLayout.C0279c) obj);
                }
            });
            if (iG2 >= 0) {
                C0279c c0279c2 = this.f3542c.get(iG2);
                if (NullChecker.a(c0279c2) && z && c0279c2.m4897b()) {
                    return;
                }
                this.f3542c.remove(iG2);
                if (vwb.J(this.f3542c)) {
                    this.f3542c.add(new C0279c(0, ""));
                }
                notifyDataSetChanged();
            }
        }

        /* JADX INFO: renamed from: O */
        public void m4885O(final String str, final boolean z) {
            e51.H(ConversationHeadRecommendLayout.this.m4853P(), new Runnable() { // from class: l.x76
                @Override // java.lang.Runnable
                public final void run() {
                    this.f22453a.m4884N(str, z);
                }
            }, 100L);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: P */
        public final void m4886P(View view, C0279c c0279c, int i) {
            if (view instanceof ConversationAllPairItemView) {
                ((ConversationAllPairItemView) view).m4717Z(ConversationHeadRecommendLayout.this.f3530m, c0279c, i);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: Q */
        public final void m4887Q(View view, C0279c c0279c) {
            if (view instanceof ConversationHeadBackUserTipLayout) {
                ((ConversationHeadBackUserTipLayout) view).m4817z(ConversationHeadRecommendLayout.this.m4853P(), c0279c);
            }
        }

        /* JADX INFO: renamed from: R */
        public final void m4888R(View view, C0279c c0279c) {
            if (view instanceof ConversationCityCentreCardLayout) {
                ((ConversationCityCentreCardLayout) view).m4758l(ConversationHeadRecommendLayout.this.m4853P(), c0279c.f3555d, 2);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: S */
        public final void m4889S(View view) {
            if (view instanceof BaseConversationRecommendItemView) {
                ((BaseConversationRecommendItemView) view).mo4667F();
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: T */
        public final void m4890T(View view, C0279c c0279c) {
            if (view instanceof ConversationHeadLikerItemLayout) {
                ((ConversationHeadLikerItemLayout) view).m4836u(ConversationHeadRecommendLayout.this.m4853P(), c0279c);
            }
        }

        /* JADX INFO: renamed from: U */
        public void m4891U(List<C0279c> list) {
            this.f3542c.clear();
            this.f3542c.addAll(list);
            notifyDataSetChanged();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: V */
        public final void m4892V(View view, C0279c c0279c) {
            if (view instanceof ConversationMatchItemLayout) {
                ConversationHeadRecommendLayout.this.f3533p = (ConversationMatchItemLayout) view;
            }
            if (NullChecker.a(ConversationHeadRecommendLayout.this.f3533p)) {
                ConversationHeadRecommendLayout.this.f3533p.mo4656P(ConversationHeadRecommendLayout.this.m4853P(), ConversationHeadRecommendLayout.this, c0279c);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: W */
        public final void m4893W(View view, C0279c c0279c) {
            if (view instanceof RecommendNormalUserView) {
                ConversationHeadRecommendLayout conversationHeadRecommendLayout = ConversationHeadRecommendLayout.this;
                ((RecommendNormalUserView) view).m5928a0(conversationHeadRecommendLayout.f3530m, conversationHeadRecommendLayout, c0279c);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: X */
        public final void m4894X(View view, C0279c c0279c, int i) {
            if (view instanceof ConversationRecommendItemView) {
                ConversationHeadRecommendLayout conversationHeadRecommendLayout = ConversationHeadRecommendLayout.this;
                ((ConversationRecommendItemView) view).m5372X(conversationHeadRecommendLayout.f3530m, conversationHeadRecommendLayout, c0279c);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX INFO: renamed from: Y */
        public final void m4895Y(View view, C0279c c0279c, int i) {
            if (view instanceof ConversationSuperBoostItemView) {
                ((ConversationSuperBoostItemView) view).m5401D0(c0279c, i);
            }
        }

        public int getItemViewType(int i) {
            int i2 = this.f3542c.get(i).f3552a;
            if (i2 == C0279c.f3545D || i2 == C0279c.f3546E || i2 == C0279c.f3547F) {
                return 1;
            }
            return i2;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationHeadRecommendLayout$c */
    public static class C0279c {

        /* JADX INFO: renamed from: D */
        public static int f3545D = 25;

        /* JADX INFO: renamed from: E */
        public static int f3546E = 26;

        /* JADX INFO: renamed from: F */
        public static int f3547F = 27;

        /* JADX INFO: renamed from: G */
        public static int f3548G = 28;

        /* JADX INFO: renamed from: A */
        @Nullable
        public MonetizationChatSeeUser f3549A;

        /* JADX INFO: renamed from: B */
        @Nullable
        public GrowthMesInfo f3550B;

        /* JADX INFO: renamed from: C */
        public String f3551C;

        /* JADX INFO: renamed from: a */
        public int f3552a;

        /* JADX INFO: renamed from: d */
        public String f3555d;

        /* JADX INFO: renamed from: g */
        public String f3558g;

        /* JADX INFO: renamed from: h */
        public int f3559h;

        /* JADX INFO: renamed from: i */
        public String f3560i;

        /* JADX INFO: renamed from: j */
        public String f3561j;

        /* JADX INFO: renamed from: k */
        public String f3562k;

        /* JADX INFO: renamed from: l */
        public float f3563l;

        /* JADX INFO: renamed from: m */
        public int f3564m;

        /* JADX INFO: renamed from: n */
        public User f3565n;

        /* JADX INFO: renamed from: o */
        public SpotLightLiveInfo f3566o;

        /* JADX INFO: renamed from: p */
        public SpotLightSeeInfo f3567p;

        /* JADX INFO: renamed from: q */
        public InteractionType f3568q;

        /* JADX INFO: renamed from: r */
        public Relation f3569r;

        /* JADX INFO: renamed from: s */
        public String f3570s;

        /* JADX INFO: renamed from: t */
        public String f3571t;

        /* JADX INFO: renamed from: w */
        @Nullable
        public LiveMultiCallInfo f3574w;

        /* JADX INFO: renamed from: x */
        @Nullable
        public Recommended f3575x;

        /* JADX INFO: renamed from: y */
        @Nullable
        public QuickChatCardInfo f3576y;

        /* JADX INFO: renamed from: z */
        @Nullable
        public User f3577z;

        /* JADX INFO: renamed from: b */
        public String f3553b = "";

        /* JADX INFO: renamed from: c */
        public String f3554c = "";

        /* JADX INFO: renamed from: e */
        public String f3556e = "";

        /* JADX INFO: renamed from: f */
        public boolean f3557f = false;

        /* JADX INFO: renamed from: u */
        public int f3572u = 0;

        /* JADX INFO: renamed from: v */
        public int f3573v = 0;

        public C0279c(int i, @NonNull String str) {
            this.f3552a = i;
            this.f3555d = str;
        }

        /* JADX INFO: renamed from: a */
        public String m4896a() {
            if (!NullChecker.a(this.f3574w)) {
                return "";
            }
            String str = this.f3574w.role;
            return !TextUtils.isEmpty(str) ? str : "";
        }

        /* JADX INFO: renamed from: b */
        public boolean m4897b() {
            int i = this.f3552a;
            return i == 16 || i == 17 || i == 18;
        }

        @NotNull
        public String toString() {
            return "HeadCovItem{type=" + this.f3552a + ", forceText='" + this.f3553b + "', text='" + this.f3554c + "', userId='" + this.f3555d + "', anchorId='" + this.f3556e + "', isLiving=" + this.f3557f + ", liveId='" + this.f3558g + "', index=" + this.f3559h + ", liveLabel='" + this.f3560i + "', liveState='" + this.f3561j + "', topicId='" + this.f3562k + "'}";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationHeadRecommendLayout$d */
    public class C0280d extends RecyclerView.n {

        /* JADX INFO: renamed from: a */
        public final int f3578a;

        public C0280d(int i) {
            this.f3578a = i;
        }

        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.z zVar) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                rect.left = t100.d(14.0f);
                rect.right = this.f3578a;
            } else if (NullChecker.a(ConversationHeadRecommendLayout.this.f3530m) && childAdapterPosition == ConversationHeadRecommendLayout.this.f3530m.m4877C() - 1) {
                rect.left = this.f3578a;
                rect.right = t100.d(14.0f);
            } else {
                int i = this.f3578a;
                rect.left = i;
                rect.right = i;
            }
        }
    }

    public ConversationHeadRecommendLayout(Context context) {
        super(context);
        this.f3531n = a.c(new ArrayList());
        this.f3532o = mqi0.m18550o();
        this.f3535r = -1.0d;
        this.f3536s = false;
        this.f3537t = false;
        this.f3538u = a.c(Boolean.TRUE);
        this.f3539v = new ArrayList();
        this.f3540w = true;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ Boolean m4837B(Act.r rVar) {
        return rVar == null ? Boolean.FALSE : Boolean.valueOf(NullChecker.a((Activity) rVar.a.get()));
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m4838C(Throwable th) {
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m4848u(Bundle bundle) {
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m4849v(Throwable th) {
    }

    /* JADX INFO: renamed from: O */
    public final void m4852O(View view) {
        a86.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: P */
    public PutongAct m4853P() {
        return getContext();
    }

    /* JADX INFO: renamed from: Q */
    public final void m4854Q() {
        mkd0.z(this.f3529l);
        this.f3529l = Act.foreground().map(new w9j() { // from class: l.o76
            public final Object call(Object obj) {
                return ConversationHeadRecommendLayout.m4837B((Act.r) obj);
            }
        }).distinctUntilChanged().subscribe(mkd0.H(new e30() { // from class: l.p76
            public final void call(Object obj) {
                this.f18416a.m4865c0((Boolean) obj);
            }
        }, new e30() { // from class: l.q76
            public final void call(Object obj) {
                ConversationHeadRecommendLayout.m4849v((Throwable) obj);
            }
        }));
        m4853P().creates(new e30() { // from class: l.r76
            public final void call(Object obj) {
                ConversationHeadRecommendLayout.m4848u((Bundle) obj);
            }
        }, new d30() { // from class: l.s76
            public final void call() {
                this.f20124a.m4864b0();
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final void m4855R() {
        m4853P().duringCreated(CoreModule.c.f0.wn()).subscribe(mkd0.G(new e30() { // from class: l.l76
            public final void call(Object obj) {
                this.f15974a.m4870j0((Message) obj);
            }
        }));
        if (!this.f3537t) {
            m4854Q();
        }
        m4856S();
    }

    /* JADX INFO: renamed from: S */
    public void m4856S() {
        c cVarDuringCreated = m4853P().duringCreated(CoreModule.c.f0.Z.flatMap(new w9j() { // from class: l.t76
            public final Object call(Object obj) {
                return this.f20574a.m4867f0((String) obj);
            }
        }).filter(new u76()));
        a<List<C0279c>> aVar = this.f3531n;
        Objects.requireNonNull(aVar);
        cVarDuringCreated.subscribe(mkd0.H(new v76(aVar), new e30() { // from class: l.w76
            public final void call(Object obj) {
                ConversationHeadRecommendLayout.m4838C((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public void m4857T(C0279c c0279c) {
        if (NullChecker.a(c0279c)) {
            List list = (List) this.f3531n.e();
            if (vwb.J(list)) {
                return;
            }
            list.remove(c0279c);
            list.add(c0279c);
            this.f3531n.onNext(list);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: V */
    public void m4858V() {
        this.f3537t = upa.Y0().function_switch;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        linearLayoutManager.canScrollVertically();
        this.f3526i.setLayoutManager(linearLayoutManager);
        this.f3530m = new C0278b();
        this.f3526i.addItemDecoration(new C0280d(t100.d(7.5f)));
        this.f3526i.setAdapter(this.f3530m);
        this.f3526i.setOverScrollMode(0);
        this.f3526i.addOnScrollListener(new C0277a());
        this.f3523f.setTextSize(2, 15.0f);
        this.f3523f.setTypeface(Typeface.DEFAULT_BOLD);
        m4855R();
        m4869h0();
        xdl0.X(this.f3523f, t100.d(5.0f));
        this.f3528k.setVisibility(8);
        this.f3523f.setText(m4853P().string(R.string.w9));
        xdl0.M(this.f3524g, false);
        if (m4862Z()) {
            xdl0.M(this.f3523f, false);
            int headRecommendListHeight = getHeadRecommendListHeight();
            xdl0.C0(this.f3526i, headRecommendListHeight);
            xdl0.C0(this.f3518a, headRecommendListHeight);
            xdl0.X(this.f3526i, 0);
            if (upa.d3()) {
                xdl0.M(this.f3528k, false);
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final List<C0279c> m4859W(List<FriendInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (!vwb.J(list)) {
            for (int i = 0; i < list.size(); i++) {
                FriendInfo friendInfo = list.get(i);
                C0279c c0279c = new C0279c(m4860X(friendInfo.suggest.reason), friendInfo.userId);
                FriendSuggestInfo friendSuggestInfo = friendInfo.suggest;
                c0279c.f3553b = friendSuggestInfo.forceText;
                c0279c.f3554c = friendSuggestInfo.text;
                c0279c.f3568q = friendSuggestInfo.interactionType;
                c0279c.f3569r = friendSuggestInfo.relation;
                c0279c.f3570s = friendSuggestInfo.roomId;
                arrayList.add(c0279c);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: X */
    public final int m4860X(FriendSuggestReason friendSuggestReason) {
        if (!NullChecker.a(friendSuggestReason)) {
            return 8;
        }
        String string = friendSuggestReason.toString();
        string.getClass();
        switch (string) {
            case "recentMessage":
                return 4;
            case "activity":
                return 3;
            case "interaction_moment":
                return 18;
            case "oof":
                return 21;
            case "distance":
                return 5;
            case "newMatch":
                return 6;
            case "default":
                return 7;
            case "interaction_live":
                return 16;
            case "interaction_voice":
                return 17;
            default:
                return 8;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Y */
    public final void m4861Y(List<C0279c> list, boolean z) {
        if (list.size() > 1) {
            ListIterator<C0279c> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                C0279c next = listIterator.next();
                if (next.f3552a != 11 && next.f3565n == null) {
                    listIterator.remove();
                }
            }
        }
        setVisibility(0);
        this.f3538u.onNext(Boolean.TRUE);
        if (NullChecker.a(this.f3526i.getItemAnimator())) {
            this.f3526i.getItemAnimator().setChangeDuration(0L);
        }
        if (list.size() == 1 && list.get(0).f3552a == 11 && list.get(0).f3564m == 0) {
            this.f3526i.setVisibility(8);
            ConstraintLayout constraintLayout = this.f3534q;
            if (constraintLayout == null) {
                this.f3534q = (IntlConversationOnlyBoostView) this.f3525h.inflate();
                lrb.m17999f().m18009n(true);
                this.f3534q.setOnClickListener(new View.OnClickListener() { // from class: l.m76
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f16744a.m4868g0(view);
                    }
                });
            } else {
                constraintLayout.setVisibility(0);
            }
            this.f3534q.m5785i0();
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.height = t100.d(135.0f);
            setLayoutParams(layoutParams);
        } else {
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            layoutParams2.height = t100.d(149.0f);
            setLayoutParams(layoutParams2);
            this.f3526i.setVisibility(0);
            if (NullChecker.a(this.f3534q)) {
                this.f3534q.setVisibility(8);
            }
        }
        C0278b c0278b = this.f3530m;
        if (!z) {
            c0278b.m4891U(list);
        } else {
            c0278b.f3542c.set(0, list.get(0));
            this.f3530m.notifyItemChanged(0);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m4862Z() {
        return upa.q2() || upa.d3();
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m4863a0(int i) {
        return i == 11 || i == 12 || i == 13;
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m4864b0() {
        mkd0.z(this.f3529l);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m4865c0(Boolean bool) {
        if (!bool.booleanValue()) {
            this.f3532o = mqi0.m18550o();
        } else if (mqi0.m18550o() - this.f3532o > 600000) {
            this.f3532o = mqi0.m18550o();
            CoreModule.c.f0.Z.onNext("");
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ c m4866e0(List list) {
        return c.just(m4859W(list));
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ c m4867f0(String str) {
        if (NullChecker.a(this.f3530m) && TextUtils.equals(str, "message_tab_hide_to_show_refresh")) {
            this.f3530m.m4880J();
        }
        double dM18550o = (mqi0.m18550o() - CoreModule.c.f0.a0) / 1000.0d;
        RealtimeRefreshNewMatch realtimeRefreshNewMatchY0 = upa.Y0();
        if (!TextUtils.isEmpty(str) && !this.f3536s && ((!TextUtils.equals(str, "message_tab_hide_to_show_refresh") || dM18550o <= realtimeRefreshNewMatchY0.message_tab_hide_to_show_refresh_interval) && (!TextUtils.equals(str, "message_tab_generate_new_match_refresh") || dM18550o <= realtimeRefreshNewMatchY0.message_tab_generate_new_match_refresh_interval))) {
            return c.just((Object) null);
        }
        this.f3536s = false;
        return CoreModule.c.f0.ug().flatMap(new w9j() { // from class: l.n76
            public final Object call(Object obj) {
                return this.f17350a.m4866e0((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m4868g0(View view) {
        lrb.m17999f().m18000d(m4853P());
    }

    public int getHeadRecommendListHeight() {
        if (upa.d3()) {
            return t100.d(115.0f);
        }
        return upa.q2() ? t100.d(112.0f) : this.f3526i.getHeight();
    }

    public c<List<C0279c>> getRecommendListObs() {
        return this.f3531n;
    }

    public c<Boolean> getVisibleObs() {
        return this.f3538u;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: h0 */
    public final void m4869h0() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = t100.d(149.0f);
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m4870j0(Message message) {
        if (NullChecker.a(message) && message.isMe()) {
            String str = message.hostId;
            if (TextUtils.isEmpty(str)) {
                str = message.cid;
            }
            if (NullChecker.a(this.f3530m)) {
                this.f3530m.m4885O(str, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public void m4871k0(List<C0279c> list) {
        if (!vwb.J(list)) {
            m4861Y(list, false);
        } else {
            setVisibility(8);
            this.f3538u.onNext(Boolean.FALSE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m4852O(this);
        this.f3522e.setTypeface(Typeface.DEFAULT_BOLD);
        xdl0.M(this.f3520c, false);
        xdl0.M(this.f3522e, false);
        xdl0.M(this.f3523f, true);
        if (upa.e3()) {
            NewMatchItemLayout.m6693i();
            xdl0.X(this.f3527j, -t100.d(7.0f));
            if (upa.z()) {
                rd6.m21523v(t100.d(86.0f), this.f3527j);
                xdl0.V(this.f3527j, 0);
            } else {
                rd6.m21523v(t100.d(70.0f), this.f3527j);
                xdl0.V(this.f3527j, t100.d(6.0f));
            }
        }
    }

    public ConversationHeadRecommendLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3531n = a.c(new ArrayList());
        this.f3532o = mqi0.m18550o();
        this.f3535r = -1.0d;
        this.f3536s = false;
        this.f3537t = false;
        this.f3538u = a.c(Boolean.TRUE);
        this.f3539v = new ArrayList();
        this.f3540w = true;
    }

    public ConversationHeadRecommendLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3531n = a.c(new ArrayList());
        this.f3532o = mqi0.m18550o();
        this.f3535r = -1.0d;
        this.f3536s = false;
        this.f3537t = false;
        this.f3538u = a.c(Boolean.TRUE);
        this.f3539v = new ArrayList();
        this.f3540w = true;
    }
}
