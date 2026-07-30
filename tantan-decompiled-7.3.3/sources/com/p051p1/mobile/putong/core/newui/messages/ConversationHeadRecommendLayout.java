package com.p051p1.mobile.putong.core.newui.messages;

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
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.AuthenticationTokenClaims;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.p053ui.bubble.C4499d;
import com.p051p1.mobile.putong.app.PutongAct;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.R$string;
import com.p051p1.mobile.putong.core.data.FriendInfo;
import com.p051p1.mobile.putong.core.data.FriendSuggestInfo;
import com.p051p1.mobile.putong.core.data.FriendSuggestReason;
import com.p051p1.mobile.putong.core.data.GrowthMesInfo;
import com.p051p1.mobile.putong.core.data.InteractionType;
import com.p051p1.mobile.putong.core.data.LiveMultiCallInfo;
import com.p051p1.mobile.putong.core.data.Message;
import com.p051p1.mobile.putong.core.data.MonetizationChatSeeUser;
import com.p051p1.mobile.putong.core.data.QuickChatCardInfo;
import com.p051p1.mobile.putong.core.data.RealtimeRefreshNewMatch;
import com.p051p1.mobile.putong.core.data.Recommended;
import com.p051p1.mobile.putong.core.data.Relation;
import com.p051p1.mobile.putong.core.data.SpotLightLiveInfo;
import com.p051p1.mobile.putong.core.data.SpotLightSeeInfo;
import com.p051p1.mobile.putong.core.newui.messages.ConversationHeadRecommendLayout;
import com.p051p1.mobile.putong.core.newui.messages.recommend.view.NewMatchItemLayout;
import com.p051p1.mobile.putong.data.User;
import com.tantan.library.svga.SVGAnimationView;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import p137rx.C22421c;
import p137rx.subjects.C22507a;
import p151v.VFrame;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.a96;
import p153l.bnl0;
import p153l.dbc0;
import p153l.f96;
import p153l.gra;
import p153l.jic0;
import p153l.jyb;
import p153l.kcg0;
import p153l.kec0;
import p153l.l51;
import p153l.psd0;
import p153l.pzi0;
import p153l.qa00;
import p153l.qcj;
import p153l.ue6;
import p153l.x20;
import p153l.y20;
import p153l.z86;
import p153l.zsb;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationHeadRecommendLayout extends VFrame {

    /* JADX INFO: renamed from: x */
    public static C8266c f25481x;

    /* JADX INFO: renamed from: a */
    public ConversationHeadRecommendLayout f25482a;

    /* JADX INFO: renamed from: b */
    public VLinear f25483b;

    /* JADX INFO: renamed from: c */
    public VFrame f25484c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f25485d;

    /* JADX INFO: renamed from: e */
    public VText f25486e;

    /* JADX INFO: renamed from: f */
    public VText f25487f;

    /* JADX INFO: renamed from: g */
    public TextView f25488g;

    /* JADX INFO: renamed from: h */
    public ViewStub f25489h;

    /* JADX INFO: renamed from: i */
    public VRecyclerView f25490i;

    /* JADX INFO: renamed from: j */
    public SVGAnimationView f25491j;

    /* JADX INFO: renamed from: k */
    public View f25492k;

    /* JADX INFO: renamed from: l */
    public kcg0 f25493l;

    /* JADX INFO: renamed from: m */
    public C8265b f25494m;

    /* JADX INFO: renamed from: n */
    public final C22507a<List<C8266c>> f25495n;

    /* JADX INFO: renamed from: o */
    public long f25496o;

    /* JADX INFO: renamed from: p */
    public BaseConversationMatchItemLayout f25497p;

    /* JADX INFO: renamed from: q */
    public IntlConversationOnlyBoostView f25498q;

    /* JADX INFO: renamed from: r */
    public double f25499r;

    /* JADX INFO: renamed from: s */
    public boolean f25500s;

    /* JADX INFO: renamed from: t */
    public boolean f25501t;

    /* JADX INFO: renamed from: u */
    public C22507a<Boolean> f25502u;

    /* JADX INFO: renamed from: v */
    public List<C8266c> f25503v;

    /* JADX INFO: renamed from: w */
    public boolean f25504w;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationHeadRecommendLayout$a */
    public class C8264a extends RecyclerView.AbstractC0584t {
        public C8264a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 1) {
                C4499d.m21895l().m21899k("showNewMatchUserGuidePop");
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationHeadRecommendLayout$b */
    public class C8265b extends jic0<C8266c> {

        /* JADX INFO: renamed from: c */
        public final List<C8266c> f25506c;

        /* JADX INFO: renamed from: d */
        public final Set<String> f25507d;

        public C8265b() {
            ArrayList arrayList = new ArrayList();
            this.f25506c = arrayList;
            this.f25507d = new HashSet();
            arrayList.add(new C8266c(12, ""));
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0014  */
        /* JADX INFO: renamed from: E */
        public static /* synthetic */ Boolean m41788E(String str, C8266c c8266c) {
            boolean z;
            if (NullChecker.m82486a(c8266c) && TextUtils.equals(str, c8266c.f25519d)) {
                z = c8266c.f25516a != 1;
            }
            return Boolean.valueOf(z);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f25506c.size();
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: D */
        public View mo29824D(ViewGroup viewGroup, int i) {
            int i2 = C8266c.f25512G;
            ConversationHeadRecommendLayout conversationHeadRecommendLayout = ConversationHeadRecommendLayout.this;
            if (i == i2) {
                return conversationHeadRecommendLayout.m41769P().inflater().inflate(kec0.f125556Ob, viewGroup, false);
            }
            if (conversationHeadRecommendLayout.m41778Z()) {
                return ConversationHeadRecommendLayout.this.m41769P().inflater().inflate(kec0.f125540Nb, viewGroup, false);
            }
            if (i == 1 || i == 14) {
                return ConversationHeadRecommendLayout.this.m41769P().inflater().inflate(kec0.f125658V1, viewGroup, false);
            }
            if (i == 9) {
                return ConversationHeadRecommendLayout.this.m41769P().inflater().inflate(kec0.f125596R3, viewGroup, false);
            }
            ConversationHeadRecommendLayout conversationHeadRecommendLayout2 = ConversationHeadRecommendLayout.this;
            if (i == 10) {
                return conversationHeadRecommendLayout2.m41769P().inflater().inflate(kec0.f125366D, viewGroup, false);
            }
            if (conversationHeadRecommendLayout2.m41779a0(i)) {
                return ConversationHeadRecommendLayout.this.m41769P().inflater().inflate(kec0.f125739a2, viewGroup, false);
            }
            if (i == 20) {
                return ConversationHeadRecommendLayout.this.m41769P().inflater().inflate(kec0.f125418G1, viewGroup, false);
            }
            if (i == 22) {
                return ConversationHeadRecommendLayout.this.m41769P().inflater().inflate(kec0.f125402F1, viewGroup, false);
            }
            ConversationHeadRecommendLayout conversationHeadRecommendLayout3 = ConversationHeadRecommendLayout.this;
            return i == 24 ? conversationHeadRecommendLayout3.m41769P().inflater().inflate(kec0.f125434H1, viewGroup, false) : conversationHeadRecommendLayout3.m41769P().inflater().inflate(kec0.f125524Mb, viewGroup, false);
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public void mo29822A(View view, C8266c c8266c, int i, int i2) {
            if (i == 0) {
                m41802S(view);
                return;
            }
            if (i == C8266c.f25512G) {
                ConversationHeadRecommendLayout conversationHeadRecommendLayout = ConversationHeadRecommendLayout.this;
                ((NewMatchItemLayout) view).m43553o(conversationHeadRecommendLayout.f25494m, c8266c, conversationHeadRecommendLayout.f25491j);
                return;
            }
            if (ConversationHeadRecommendLayout.this.m41778Z()) {
                m41806W(view, c8266c);
                return;
            }
            if (i == 1 || i == 14) {
                m41805V(view, c8266c);
                return;
            }
            if (i == 9) {
                ((ConversationHeadIntlSeeItem) view).m41746L(this);
                return;
            }
            if (i == 10) {
                m41799P(view, c8266c, i2);
                if (gra.m131778z()) {
                    view.setBackgroundResource(dbc0.f86122Eh);
                    return;
                }
                return;
            }
            if (ConversationHeadRecommendLayout.this.m41779a0(i)) {
                m41808Y(view, c8266c, i2);
                return;
            }
            if (i == 20) {
                m41803T(view, c8266c);
                if (gra.m131778z()) {
                    view.setBackgroundResource(dbc0.f86122Eh);
                    return;
                }
                return;
            }
            if (i == 22) {
                m41800Q(view, c8266c);
                if (gra.m131778z()) {
                    view.setBackgroundResource(dbc0.f86122Eh);
                    return;
                }
                return;
            }
            if (i == 24) {
                m41801R(view, c8266c);
                return;
            }
            m41807X(view, c8266c, i2);
            if (gra.m131778z()) {
                view.setBackgroundResource(dbc0.f86122Eh);
            }
        }

        /* JADX INFO: renamed from: J */
        public void m41793J() {
            this.f25507d.clear();
        }

        /* JADX INFO: renamed from: K */
        public Act m41794K() {
            return ConversationHeadRecommendLayout.this.m41769P();
        }

        /* JADX INFO: renamed from: L */
        public List<C8266c> m41795L() {
            return this.f25506c;
        }

        @Override // p153l.jic0
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public C8266c getItem(int i) {
            return this.f25506c.get(i);
        }

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ void m41797N(final String str, boolean z) {
            List list = (List) ConversationHeadRecommendLayout.this.f25495n.m222761e();
            int iM147476G = jyb.m147476G(list, new qcj() { // from class: l.d96
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    ConversationHeadRecommendLayout.C8266c c8266c = (ConversationHeadRecommendLayout.C8266c) obj;
                    return Boolean.valueOf(NullChecker.m82486a(c8266c) && TextUtils.equals(str, c8266c.f25519d));
                }
            });
            if (iM147476G >= 0) {
                C8266c c8266c = (C8266c) list.get(iM147476G);
                if (NullChecker.m82486a(c8266c) && z && c8266c.m41810b()) {
                    return;
                } else {
                    list.remove(iM147476G);
                }
            }
            int iM147476G2 = jyb.m147476G(this.f25506c, new qcj() { // from class: l.e96
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return ConversationHeadRecommendLayout.C8265b.m41788E(str, (ConversationHeadRecommendLayout.C8266c) obj);
                }
            });
            if (iM147476G2 >= 0) {
                C8266c c8266c2 = this.f25506c.get(iM147476G2);
                if (NullChecker.m82486a(c8266c2) && z && c8266c2.m41810b()) {
                    return;
                }
                this.f25506c.remove(iM147476G2);
                if (jyb.m147479J(this.f25506c)) {
                    this.f25506c.add(new C8266c(0, ""));
                }
                notifyDataSetChanged();
            }
        }

        /* JADX INFO: renamed from: O */
        public void m41798O(final String str, final boolean z) {
            l51.m152888H(ConversationHeadRecommendLayout.this.m41769P(), new Runnable() { // from class: l.c96
                @Override // java.lang.Runnable
                public final void run() {
                    this.f80300a.m41797N(str, z);
                }
            }, 100L);
        }

        /* JADX INFO: renamed from: P */
        public final void m41799P(View view, C8266c c8266c, int i) {
            if (view instanceof ConversationAllPairItemView) {
                ((ConversationAllPairItemView) view).m41635Z(ConversationHeadRecommendLayout.this.f25494m, c8266c, i);
            }
        }

        /* JADX INFO: renamed from: Q */
        public final void m41800Q(View view, C8266c c8266c) {
            if (view instanceof ConversationHeadBackUserTipLayout) {
                ((ConversationHeadBackUserTipLayout) view).m41733z(ConversationHeadRecommendLayout.this.m41769P(), c8266c);
            }
        }

        /* JADX INFO: renamed from: R */
        public final void m41801R(View view, C8266c c8266c) {
            if (view instanceof ConversationCityCentreCardLayout) {
                ((ConversationCityCentreCardLayout) view).m41674l(ConversationHeadRecommendLayout.this.m41769P(), c8266c.f25519d, 2);
            }
        }

        /* JADX INFO: renamed from: S */
        public final void m41802S(View view) {
            if (view instanceof BaseConversationRecommendItemView) {
                ((BaseConversationRecommendItemView) view).mo41585F();
            }
        }

        /* JADX INFO: renamed from: T */
        public final void m41803T(View view, C8266c c8266c) {
            if (view instanceof ConversationHeadLikerItemLayout) {
                ((ConversationHeadLikerItemLayout) view).m41752u(ConversationHeadRecommendLayout.this.m41769P(), c8266c);
            }
        }

        /* JADX INFO: renamed from: U */
        public void m41804U(List<C8266c> list) {
            this.f25506c.clear();
            this.f25506c.addAll(list);
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: V */
        public final void m41805V(View view, C8266c c8266c) {
            if (view instanceof ConversationMatchItemLayout) {
                ConversationHeadRecommendLayout.this.f25497p = (ConversationMatchItemLayout) view;
            }
            if (NullChecker.m82486a(ConversationHeadRecommendLayout.this.f25497p)) {
                ConversationHeadRecommendLayout.this.f25497p.mo41574P(ConversationHeadRecommendLayout.this.m41769P(), ConversationHeadRecommendLayout.this, c8266c);
            }
        }

        /* JADX INFO: renamed from: W */
        public final void m41806W(View view, C8266c c8266c) {
            if (view instanceof RecommendNormalUserView) {
                ConversationHeadRecommendLayout conversationHeadRecommendLayout = ConversationHeadRecommendLayout.this;
                ((RecommendNormalUserView) view).m42815a0(conversationHeadRecommendLayout.f25494m, conversationHeadRecommendLayout, c8266c);
            }
        }

        /* JADX INFO: renamed from: X */
        public final void m41807X(View view, C8266c c8266c, int i) {
            if (view instanceof ConversationRecommendItemView) {
                ConversationHeadRecommendLayout conversationHeadRecommendLayout = ConversationHeadRecommendLayout.this;
                ((ConversationRecommendItemView) view).m42277X(conversationHeadRecommendLayout.f25494m, conversationHeadRecommendLayout, c8266c);
            }
        }

        /* JADX INFO: renamed from: Y */
        public final void m41808Y(View view, C8266c c8266c, int i) {
            if (view instanceof ConversationSuperBoostItemView) {
                ((ConversationSuperBoostItemView) view).m42306D0(c8266c, i);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            int i2 = this.f25506c.get(i).f25516a;
            if (i2 == C8266c.f25509D || i2 == C8266c.f25510E || i2 == C8266c.f25511F) {
                return 1;
            }
            return i2;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationHeadRecommendLayout$c */
    public static class C8266c {

        /* JADX INFO: renamed from: D */
        public static int f25509D = 25;

        /* JADX INFO: renamed from: E */
        public static int f25510E = 26;

        /* JADX INFO: renamed from: F */
        public static int f25511F = 27;

        /* JADX INFO: renamed from: G */
        public static int f25512G = 28;

        /* JADX INFO: renamed from: A */
        @Nullable
        public MonetizationChatSeeUser f25513A;

        /* JADX INFO: renamed from: B */
        @Nullable
        public GrowthMesInfo f25514B;

        /* JADX INFO: renamed from: C */
        public String f25515C;

        /* JADX INFO: renamed from: a */
        public int f25516a;

        /* JADX INFO: renamed from: d */
        public String f25519d;

        /* JADX INFO: renamed from: g */
        public String f25522g;

        /* JADX INFO: renamed from: h */
        public int f25523h;

        /* JADX INFO: renamed from: i */
        public String f25524i;

        /* JADX INFO: renamed from: j */
        public String f25525j;

        /* JADX INFO: renamed from: k */
        public String f25526k;

        /* JADX INFO: renamed from: l */
        public float f25527l;

        /* JADX INFO: renamed from: m */
        public int f25528m;

        /* JADX INFO: renamed from: n */
        public User f25529n;

        /* JADX INFO: renamed from: o */
        public SpotLightLiveInfo f25530o;

        /* JADX INFO: renamed from: p */
        public SpotLightSeeInfo f25531p;

        /* JADX INFO: renamed from: q */
        public InteractionType f25532q;

        /* JADX INFO: renamed from: r */
        public Relation f25533r;

        /* JADX INFO: renamed from: s */
        public String f25534s;

        /* JADX INFO: renamed from: t */
        public String f25535t;

        /* JADX INFO: renamed from: w */
        @Nullable
        public LiveMultiCallInfo f25538w;

        /* JADX INFO: renamed from: x */
        @Nullable
        public Recommended f25539x;

        /* JADX INFO: renamed from: y */
        @Nullable
        public QuickChatCardInfo f25540y;

        /* JADX INFO: renamed from: z */
        @Nullable
        public User f25541z;

        /* JADX INFO: renamed from: b */
        public String f25517b = "";

        /* JADX INFO: renamed from: c */
        public String f25518c = "";

        /* JADX INFO: renamed from: e */
        public String f25520e = "";

        /* JADX INFO: renamed from: f */
        public boolean f25521f = false;

        /* JADX INFO: renamed from: u */
        public int f25536u = 0;

        /* JADX INFO: renamed from: v */
        public int f25537v = 0;

        public C8266c(int i, @NonNull String str) {
            this.f25516a = i;
            this.f25519d = str;
        }

        /* JADX INFO: renamed from: a */
        public String m41809a() {
            if (!NullChecker.m82486a(this.f25538w)) {
                return "";
            }
            String str = this.f25538w.role;
            return !TextUtils.isEmpty(str) ? str : "";
        }

        /* JADX INFO: renamed from: b */
        public boolean m41810b() {
            int i = this.f25516a;
            return i == 16 || i == 17 || i == 18;
        }

        @NotNull
        public String toString() {
            return "HeadCovItem{type=" + this.f25516a + ", forceText='" + this.f25517b + "', text='" + this.f25518c + "', userId='" + this.f25519d + "', anchorId='" + this.f25520e + "', isLiving=" + this.f25521f + ", liveId='" + this.f25522g + "', index=" + this.f25523h + ", liveLabel='" + this.f25524i + "', liveState='" + this.f25525j + "', topicId='" + this.f25526k + "'}";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationHeadRecommendLayout$d */
    public class C8267d extends RecyclerView.AbstractC0578n {

        /* JADX INFO: renamed from: a */
        public final int f25542a;

        public C8267d(int i) {
            this.f25542a = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0561a0 c0561a0) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                rect.left = qa00.m175859d(14.0f);
                rect.right = this.f25542a;
            } else if (NullChecker.m82486a(ConversationHeadRecommendLayout.this.f25494m) && childAdapterPosition == ConversationHeadRecommendLayout.this.f25494m.getPageCount() - 1) {
                rect.left = this.f25542a;
                rect.right = qa00.m175859d(14.0f);
            } else {
                int i = this.f25542a;
                rect.left = i;
                rect.right = i;
            }
        }
    }

    public ConversationHeadRecommendLayout(Context context) {
        super(context);
        this.f25495n = C22507a.m222759c(new ArrayList());
        this.f25496o = pzi0.m174454o();
        this.f25499r = -1.0d;
        this.f25500s = false;
        this.f25501t = false;
        this.f25502u = C22507a.m222759c(Boolean.TRUE);
        this.f25503v = new ArrayList();
        this.f25504w = true;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ Boolean m41753B(Act.C4450r c4450r) {
        return c4450r == null ? Boolean.FALSE : Boolean.valueOf(NullChecker.m82486a(c4450r.f16062a.get()));
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m41754C(Throwable th) {
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m41764u(Bundle bundle) {
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m41765v(Throwable th) {
    }

    /* JADX INFO: renamed from: O */
    public final void m41768O(View view) {
        f96.m124631a(this, view);
    }

    /* JADX INFO: renamed from: P */
    public PutongAct m41769P() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: Q */
    public final void m41770Q() {
        psd0.m173633z(this.f25493l);
        this.f25493l = Act.foreground().map(new qcj() { // from class: l.t86
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return ConversationHeadRecommendLayout.m41753B((Act.C4450r) obj);
            }
        }).distinctUntilChanged().subscribe(psd0.m173597H(new y20() { // from class: l.u86
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f177973a.m41781c0((Boolean) obj);
            }
        }, new y20() { // from class: l.v86
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationHeadRecommendLayout.m41765v((Throwable) obj);
            }
        }));
        m41769P().creates(new y20() { // from class: l.w86
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationHeadRecommendLayout.m41764u((Bundle) obj);
            }
        }, new x20() { // from class: l.x86
            @Override // p153l.x20
            public final void call() {
                this.f192792a.m41780b0();
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final void m41771R() {
        m41769P().duringCreated(CoreModule.f18264c.f20384f0.m34179wn()).subscribe(psd0.m173596G(new y20() { // from class: l.q86
            @Override // p153l.y20
            public final void call(Object obj) {
                this.f156078a.m41786j0((Message) obj);
            }
        }));
        if (!this.f25501t) {
            m41770Q();
        }
        m41772S();
    }

    /* JADX INFO: renamed from: S */
    public void m41772S() {
        C22421c c22421cDuringCreated = m41769P().duringCreated(CoreModule.f18264c.f20384f0.f20658Z.flatMap(new qcj() { // from class: l.y86
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f197943a.m41783f0((String) obj);
            }
        }).filter(new z86()));
        C22507a<List<C8266c>> c22507a = this.f25495n;
        Objects.requireNonNull(c22507a);
        c22421cDuringCreated.subscribe(psd0.m173597H(new a96(c22507a), new y20() { // from class: l.b96
            @Override // p153l.y20
            public final void call(Object obj) {
                ConversationHeadRecommendLayout.m41754C((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public void m41773T(C8266c c8266c) {
        if (NullChecker.m82486a(c8266c)) {
            List<C8266c> listM222761e = this.f25495n.m222761e();
            if (jyb.m147479J(listM222761e)) {
                return;
            }
            listM222761e.remove(c8266c);
            listM222761e.add(c8266c);
            this.f25495n.onNext(listM222761e);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m41774V() {
        this.f25501t = gra.m131648Y0().function_switch;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        linearLayoutManager.canScrollVertically();
        this.f25490i.setLayoutManager(linearLayoutManager);
        this.f25494m = new C8265b();
        this.f25490i.addItemDecoration(new C8267d(qa00.m175859d(7.5f)));
        this.f25490i.setAdapter(this.f25494m);
        this.f25490i.setOverScrollMode(0);
        this.f25490i.addOnScrollListener(new C8264a());
        this.f25487f.setTextSize(2, 15.0f);
        this.f25487f.setTypeface(Typeface.DEFAULT_BOLD);
        m41771R();
        m41785h0();
        bnl0.m105540X(this.f25487f, qa00.m175859d(5.0f));
        this.f25492k.setVisibility(8);
        this.f25487f.setText(m41769P().string(R$string.f18357C9));
        bnl0.m105524M(this.f25488g, false);
        if (m41778Z()) {
            bnl0.m105524M(this.f25487f, false);
            int headRecommendListHeight = getHeadRecommendListHeight();
            bnl0.m105505C0(this.f25490i, headRecommendListHeight);
            bnl0.m105505C0(this.f25482a, headRecommendListHeight);
            bnl0.m105540X(this.f25490i, 0);
            if (gra.m131672d3()) {
                bnl0.m105524M(this.f25492k, false);
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final List<C8266c> m41775W(List<FriendInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (!jyb.m147479J(list)) {
            for (int i = 0; i < list.size(); i++) {
                FriendInfo friendInfo = list.get(i);
                C8266c c8266c = new C8266c(m41776X(friendInfo.suggest.reason), friendInfo.userId);
                FriendSuggestInfo friendSuggestInfo = friendInfo.suggest;
                c8266c.f25517b = friendSuggestInfo.forceText;
                c8266c.f25518c = friendSuggestInfo.text;
                c8266c.f25532q = friendSuggestInfo.interactionType;
                c8266c.f25533r = friendSuggestInfo.relation;
                c8266c.f25534s = friendSuggestInfo.roomId;
                arrayList.add(c8266c);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: X */
    public final int m41776X(FriendSuggestReason friendSuggestReason) {
        if (!NullChecker.m82486a(friendSuggestReason)) {
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

    /* JADX INFO: renamed from: Y */
    public final void m41777Y(List<C8266c> list, boolean z) {
        if (list.size() > 1) {
            ListIterator<C8266c> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                C8266c next = listIterator.next();
                if (next.f25516a != 11 && next.f25529n == null) {
                    listIterator.remove();
                }
            }
        }
        setVisibility(0);
        this.f25502u.onNext(Boolean.TRUE);
        if (NullChecker.m82486a(this.f25490i.getItemAnimator())) {
            this.f25490i.getItemAnimator().setChangeDuration(0L);
        }
        if (list.size() == 1 && list.get(0).f25516a == 11 && list.get(0).f25528m == 0) {
            this.f25490i.setVisibility(8);
            IntlConversationOnlyBoostView intlConversationOnlyBoostView = this.f25498q;
            if (intlConversationOnlyBoostView == null) {
                this.f25498q = (IntlConversationOnlyBoostView) this.f25489h.inflate();
                zsb.m221313f().m221323n(true);
                this.f25498q.setOnClickListener(new View.OnClickListener() { // from class: l.r86
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f161669a.m41784g0(view);
                    }
                });
            } else {
                intlConversationOnlyBoostView.setVisibility(0);
            }
            this.f25498q.m42672i0();
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.height = qa00.m175859d(135.0f);
            setLayoutParams(layoutParams);
        } else {
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            layoutParams2.height = qa00.m175859d(149.0f);
            setLayoutParams(layoutParams2);
            this.f25490i.setVisibility(0);
            if (NullChecker.m82486a(this.f25498q)) {
                this.f25498q.setVisibility(8);
            }
        }
        C8265b c8265b = this.f25494m;
        if (!z) {
            c8265b.m41804U(list);
        } else {
            c8265b.f25506c.set(0, list.get(0));
            this.f25494m.notifyItemChanged(0);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m41778Z() {
        return gra.m131736q2() || gra.m131672d3();
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m41779a0(int i) {
        return i == 11 || i == 12 || i == 13;
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m41780b0() {
        psd0.m173633z(this.f25493l);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m41781c0(Boolean bool) {
        if (!bool.booleanValue()) {
            this.f25496o = pzi0.m174454o();
        } else if (pzi0.m174454o() - this.f25496o > AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED) {
            this.f25496o = pzi0.m174454o();
            CoreModule.f18264c.f20384f0.f20658Z.onNext("");
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ C22421c m41782e0(List list) {
        return C22421c.just(m41775W(list));
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ C22421c m41783f0(String str) throws IOException {
        if (NullChecker.m82486a(this.f25494m) && TextUtils.equals(str, "message_tab_hide_to_show_refresh")) {
            this.f25494m.m41793J();
        }
        double dM174454o = (pzi0.m174454o() - CoreModule.f18264c.f20384f0.f20661a0) / 1000.0d;
        RealtimeRefreshNewMatch realtimeRefreshNewMatchM131648Y0 = gra.m131648Y0();
        if (!TextUtils.isEmpty(str) && !this.f25500s && ((!TextUtils.equals(str, "message_tab_hide_to_show_refresh") || dM174454o <= realtimeRefreshNewMatchM131648Y0.message_tab_hide_to_show_refresh_interval) && (!TextUtils.equals(str, "message_tab_generate_new_match_refresh") || dM174454o <= realtimeRefreshNewMatchM131648Y0.message_tab_generate_new_match_refresh_interval))) {
            return C22421c.just(null);
        }
        this.f25500s = false;
        return CoreModule.f18264c.f20384f0.m34147ug().flatMap(new qcj() { // from class: l.s86
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return this.f166743a.m41782e0((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m41784g0(View view) {
        zsb.m221313f().m221314d(m41769P());
    }

    public int getHeadRecommendListHeight() {
        if (gra.m131672d3()) {
            return qa00.m175859d(115.0f);
        }
        return gra.m131736q2() ? qa00.m175859d(112.0f) : this.f25490i.getHeight();
    }

    public C22421c<List<C8266c>> getRecommendListObs() {
        return this.f25495n;
    }

    public C22421c<Boolean> getVisibleObs() {
        return this.f25502u;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m41785h0() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = qa00.m175859d(149.0f);
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m41786j0(Message message) {
        if (NullChecker.m82486a(message) && message.isMe()) {
            String str = message.hostId;
            if (TextUtils.isEmpty(str)) {
                str = message.cid;
            }
            if (NullChecker.m82486a(this.f25494m)) {
                this.f25494m.m41798O(str, true);
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m41787k0(List<C8266c> list) {
        if (!jyb.m147479J(list)) {
            m41777Y(list, false);
        } else {
            setVisibility(8);
            this.f25502u.onNext(Boolean.FALSE);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m41768O(this);
        this.f25486e.setTypeface(Typeface.DEFAULT_BOLD);
        bnl0.m105524M(this.f25484c, false);
        bnl0.m105524M(this.f25486e, false);
        bnl0.m105524M(this.f25487f, true);
        if (gra.m131677e3()) {
            NewMatchItemLayout.m43545i();
            bnl0.m105540X(this.f25491j, -qa00.m175859d(7.0f));
            if (gra.m131778z()) {
                ue6.m195676v(qa00.m175859d(86.0f), this.f25491j);
                bnl0.m105538V(this.f25491j, 0);
            } else {
                ue6.m195676v(qa00.m175859d(70.0f), this.f25491j);
                bnl0.m105538V(this.f25491j, qa00.m175859d(6.0f));
            }
        }
    }

    public ConversationHeadRecommendLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25495n = C22507a.m222759c(new ArrayList());
        this.f25496o = pzi0.m174454o();
        this.f25499r = -1.0d;
        this.f25500s = false;
        this.f25501t = false;
        this.f25502u = C22507a.m222759c(Boolean.TRUE);
        this.f25503v = new ArrayList();
        this.f25504w = true;
    }

    public ConversationHeadRecommendLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25495n = C22507a.m222759c(new ArrayList());
        this.f25496o = pzi0.m174454o();
        this.f25499r = -1.0d;
        this.f25500s = false;
        this.f25501t = false;
        this.f25502u = C22507a.m222759c(Boolean.TRUE);
        this.f25503v = new ArrayList();
        this.f25504w = true;
    }
}
