package com.p046p1.mobile.putong.core.newui.messages;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.p048ui.bubble.C4348d;
import com.p046p1.mobile.putong.app.PutongAct;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.R$string;
import com.p046p1.mobile.putong.core.data.FriendInfo;
import com.p046p1.mobile.putong.core.data.FriendSuggestInfo;
import com.p046p1.mobile.putong.core.data.FriendSuggestReason;
import com.p046p1.mobile.putong.core.data.GrowthMesInfo;
import com.p046p1.mobile.putong.core.data.InteractionType;
import com.p046p1.mobile.putong.core.data.LiveMultiCallInfo;
import com.p046p1.mobile.putong.core.data.Message;
import com.p046p1.mobile.putong.core.data.MonetizationChatSeeUser;
import com.p046p1.mobile.putong.core.data.QuickChatCardInfo;
import com.p046p1.mobile.putong.core.data.RealtimeRefreshNewMatch;
import com.p046p1.mobile.putong.core.data.Recommended;
import com.p046p1.mobile.putong.core.data.Relation;
import com.p046p1.mobile.putong.core.data.SpotLightLiveInfo;
import com.p046p1.mobile.putong.core.data.SpotLightSeeInfo;
import com.p046p1.mobile.putong.core.newui.messages.ConversationHeadRecommendLayout;
import com.p046p1.mobile.putong.core.newui.messages.recommend.view.NewMatchItemLayout;
import com.p046p1.mobile.putong.data.User;
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
import p133rx.C22306c;
import p133rx.subjects.C22392a;
import p147v.VFrame;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.a86;
import p149l.c4g0;
import p149l.d30;
import p149l.dac0;
import p149l.e30;
import p149l.e51;
import p149l.f6c0;
import p149l.lrb;
import p149l.mkd0;
import p149l.mqi0;
import p149l.rd6;
import p149l.t100;
import p149l.u76;
import p149l.upa;
import p149l.v76;
import p149l.vwb;
import p149l.w9j;
import p149l.x2c0;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class ConversationHeadRecommendLayout extends VFrame {

    /* JADX INFO: renamed from: x */
    public static C8115c f24739x;

    /* JADX INFO: renamed from: a */
    public ConversationHeadRecommendLayout f24740a;

    /* JADX INFO: renamed from: b */
    public VLinear f24741b;

    /* JADX INFO: renamed from: c */
    public VFrame f24742c;

    /* JADX INFO: renamed from: d */
    public SVGAnimationView f24743d;

    /* JADX INFO: renamed from: e */
    public VText f24744e;

    /* JADX INFO: renamed from: f */
    public VText f24745f;

    /* JADX INFO: renamed from: g */
    public TextView f24746g;

    /* JADX INFO: renamed from: h */
    public ViewStub f24747h;

    /* JADX INFO: renamed from: i */
    public VRecyclerView f24748i;

    /* JADX INFO: renamed from: j */
    public SVGAnimationView f24749j;

    /* JADX INFO: renamed from: k */
    public View f24750k;

    /* JADX INFO: renamed from: l */
    public c4g0 f24751l;

    /* JADX INFO: renamed from: m */
    public C8114b f24752m;

    /* JADX INFO: renamed from: n */
    public final C22392a<List<C8115c>> f24753n;

    /* JADX INFO: renamed from: o */
    public long f24754o;

    /* JADX INFO: renamed from: p */
    public BaseConversationMatchItemLayout f24755p;

    /* JADX INFO: renamed from: q */
    public IntlConversationOnlyBoostView f24756q;

    /* JADX INFO: renamed from: r */
    public double f24757r;

    /* JADX INFO: renamed from: s */
    public boolean f24758s;

    /* JADX INFO: renamed from: t */
    public boolean f24759t;

    /* JADX INFO: renamed from: u */
    public C22392a<Boolean> f24760u;

    /* JADX INFO: renamed from: v */
    public List<C8115c> f24761v;

    /* JADX INFO: renamed from: w */
    public boolean f24762w;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationHeadRecommendLayout$a */
    public class C8113a extends RecyclerView.AbstractC0582t {
        public C8113a() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i) {
            super.onScrollStateChanged(recyclerView, i);
            if (i == 1) {
                C4348d.m20896l().m20900k("showNewMatchUserGuidePop");
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationHeadRecommendLayout$b */
    public class C8114b extends dac0<C8115c> {

        /* JADX INFO: renamed from: c */
        public final List<C8115c> f24764c;

        /* JADX INFO: renamed from: d */
        public final Set<String> f24765d;

        public C8114b() {
            ArrayList arrayList = new ArrayList();
            this.f24764c = arrayList;
            this.f24765d = new HashSet();
            arrayList.add(new C8115c(12, ""));
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0014  */
        /* JADX INFO: renamed from: E */
        public static /* synthetic */ Boolean m40777E(String str, C8115c c8115c) {
            boolean z;
            if (NullChecker.m81303a(c8115c) && TextUtils.equals(str, c8115c.f24777d)) {
                z = c8115c.f24774a != 1;
            }
            return Boolean.valueOf(z);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: C */
        public int getPageCount() {
            return this.f24764c.size();
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: D */
        public View mo28825D(ViewGroup viewGroup, int i) {
            int i2 = C8115c.f24770G;
            ConversationHeadRecommendLayout conversationHeadRecommendLayout = ConversationHeadRecommendLayout.this;
            if (i == i2) {
                return conversationHeadRecommendLayout.m40758P().inflater().inflate(f6c0.f95390Hb, viewGroup, false);
            }
            if (conversationHeadRecommendLayout.m40767Z()) {
                return ConversationHeadRecommendLayout.this.m40758P().inflater().inflate(f6c0.f95374Gb, viewGroup, false);
            }
            if (i == 1 || i == 14) {
                return ConversationHeadRecommendLayout.this.m40758P().inflater().inflate(f6c0.f95604V1, viewGroup, false);
            }
            if (i == 9) {
                return ConversationHeadRecommendLayout.this.m40758P().inflater().inflate(f6c0.f95542R3, viewGroup, false);
            }
            ConversationHeadRecommendLayout conversationHeadRecommendLayout2 = ConversationHeadRecommendLayout.this;
            if (i == 10) {
                return conversationHeadRecommendLayout2.m40758P().inflater().inflate(f6c0.f95314D, viewGroup, false);
            }
            if (conversationHeadRecommendLayout2.m40768a0(i)) {
                return ConversationHeadRecommendLayout.this.m40758P().inflater().inflate(f6c0.f95685a2, viewGroup, false);
            }
            if (i == 20) {
                return ConversationHeadRecommendLayout.this.m40758P().inflater().inflate(f6c0.f95364G1, viewGroup, false);
            }
            if (i == 22) {
                return ConversationHeadRecommendLayout.this.m40758P().inflater().inflate(f6c0.f95348F1, viewGroup, false);
            }
            ConversationHeadRecommendLayout conversationHeadRecommendLayout3 = ConversationHeadRecommendLayout.this;
            return i == 24 ? conversationHeadRecommendLayout3.m40758P().inflater().inflate(f6c0.f95380H1, viewGroup, false) : conversationHeadRecommendLayout3.m40758P().inflater().inflate(f6c0.f95358Fb, viewGroup, false);
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public void mo28823A(View view, C8115c c8115c, int i, int i2) {
            if (i == 0) {
                m40791S(view);
                return;
            }
            if (i == C8115c.f24770G) {
                ConversationHeadRecommendLayout conversationHeadRecommendLayout = ConversationHeadRecommendLayout.this;
                ((NewMatchItemLayout) view).m42542o(conversationHeadRecommendLayout.f24752m, c8115c, conversationHeadRecommendLayout.f24749j);
                return;
            }
            if (ConversationHeadRecommendLayout.this.m40767Z()) {
                m40795W(view, c8115c);
                return;
            }
            if (i == 1 || i == 14) {
                m40794V(view, c8115c);
                return;
            }
            if (i == 9) {
                ((ConversationHeadIntlSeeItem) view).m40735L(this);
                return;
            }
            if (i == 10) {
                m40788P(view, c8115c, i2);
                if (upa.m194847z()) {
                    view.setBackgroundResource(x2c0.f189672Qg);
                    return;
                }
                return;
            }
            if (ConversationHeadRecommendLayout.this.m40768a0(i)) {
                m40797Y(view, c8115c, i2);
                return;
            }
            if (i == 20) {
                m40792T(view, c8115c);
                if (upa.m194847z()) {
                    view.setBackgroundResource(x2c0.f189672Qg);
                    return;
                }
                return;
            }
            if (i == 22) {
                m40789Q(view, c8115c);
                if (upa.m194847z()) {
                    view.setBackgroundResource(x2c0.f189672Qg);
                    return;
                }
                return;
            }
            if (i == 24) {
                m40790R(view, c8115c);
                return;
            }
            m40796X(view, c8115c, i2);
            if (upa.m194847z()) {
                view.setBackgroundResource(x2c0.f189672Qg);
            }
        }

        /* JADX INFO: renamed from: J */
        public void m40782J() {
            this.f24765d.clear();
        }

        /* JADX INFO: renamed from: K */
        public Act m40783K() {
            return ConversationHeadRecommendLayout.this.m40758P();
        }

        /* JADX INFO: renamed from: L */
        public List<C8115c> m40784L() {
            return this.f24764c;
        }

        @Override // p149l.dac0
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public C8115c getItem(int i) {
            return this.f24764c.get(i);
        }

        /* JADX INFO: renamed from: N */
        public final /* synthetic */ void m40786N(final String str, boolean z) {
            List list = (List) ConversationHeadRecommendLayout.this.f24753n.m221515e();
            int iM200293G = vwb.m200293G(list, new w9j() { // from class: l.y76
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    ConversationHeadRecommendLayout.C8115c c8115c = (ConversationHeadRecommendLayout.C8115c) obj;
                    return Boolean.valueOf(NullChecker.m81303a(c8115c) && TextUtils.equals(str, c8115c.f24777d));
                }
            });
            if (iM200293G >= 0) {
                C8115c c8115c = (C8115c) list.get(iM200293G);
                if (NullChecker.m81303a(c8115c) && z && c8115c.m40799b()) {
                    return;
                } else {
                    list.remove(iM200293G);
                }
            }
            int iM200293G2 = vwb.m200293G(this.f24764c, new w9j() { // from class: l.z76
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return ConversationHeadRecommendLayout.C8114b.m40777E(str, (ConversationHeadRecommendLayout.C8115c) obj);
                }
            });
            if (iM200293G2 >= 0) {
                C8115c c8115c2 = this.f24764c.get(iM200293G2);
                if (NullChecker.m81303a(c8115c2) && z && c8115c2.m40799b()) {
                    return;
                }
                this.f24764c.remove(iM200293G2);
                if (vwb.m200296J(this.f24764c)) {
                    this.f24764c.add(new C8115c(0, ""));
                }
                notifyDataSetChanged();
            }
        }

        /* JADX INFO: renamed from: O */
        public void m40787O(final String str, final boolean z) {
            e51.m114743H(ConversationHeadRecommendLayout.this.m40758P(), new Runnable() { // from class: l.x76
                @Override // java.lang.Runnable
                public final void run() {
                    this.f191316a.m40786N(str, z);
                }
            }, 100L);
        }

        /* JADX INFO: renamed from: P */
        public final void m40788P(View view, C8115c c8115c, int i) {
            if (view instanceof ConversationAllPairItemView) {
                ((ConversationAllPairItemView) view).m40624Z(ConversationHeadRecommendLayout.this.f24752m, c8115c, i);
            }
        }

        /* JADX INFO: renamed from: Q */
        public final void m40789Q(View view, C8115c c8115c) {
            if (view instanceof ConversationHeadBackUserTipLayout) {
                ((ConversationHeadBackUserTipLayout) view).m40722z(ConversationHeadRecommendLayout.this.m40758P(), c8115c);
            }
        }

        /* JADX INFO: renamed from: R */
        public final void m40790R(View view, C8115c c8115c) {
            if (view instanceof ConversationCityCentreCardLayout) {
                ((ConversationCityCentreCardLayout) view).m40663l(ConversationHeadRecommendLayout.this.m40758P(), c8115c.f24777d, 2);
            }
        }

        /* JADX INFO: renamed from: S */
        public final void m40791S(View view) {
            if (view instanceof BaseConversationRecommendItemView) {
                ((BaseConversationRecommendItemView) view).mo40574F();
            }
        }

        /* JADX INFO: renamed from: T */
        public final void m40792T(View view, C8115c c8115c) {
            if (view instanceof ConversationHeadLikerItemLayout) {
                ((ConversationHeadLikerItemLayout) view).m40741u(ConversationHeadRecommendLayout.this.m40758P(), c8115c);
            }
        }

        /* JADX INFO: renamed from: U */
        public void m40793U(List<C8115c> list) {
            this.f24764c.clear();
            this.f24764c.addAll(list);
            notifyDataSetChanged();
        }

        /* JADX INFO: renamed from: V */
        public final void m40794V(View view, C8115c c8115c) {
            if (view instanceof ConversationMatchItemLayout) {
                ConversationHeadRecommendLayout.this.f24755p = (ConversationMatchItemLayout) view;
            }
            if (NullChecker.m81303a(ConversationHeadRecommendLayout.this.f24755p)) {
                ConversationHeadRecommendLayout.this.f24755p.mo40563P(ConversationHeadRecommendLayout.this.m40758P(), ConversationHeadRecommendLayout.this, c8115c);
            }
        }

        /* JADX INFO: renamed from: W */
        public final void m40795W(View view, C8115c c8115c) {
            if (view instanceof RecommendNormalUserView) {
                ConversationHeadRecommendLayout conversationHeadRecommendLayout = ConversationHeadRecommendLayout.this;
                ((RecommendNormalUserView) view).m41804a0(conversationHeadRecommendLayout.f24752m, conversationHeadRecommendLayout, c8115c);
            }
        }

        /* JADX INFO: renamed from: X */
        public final void m40796X(View view, C8115c c8115c, int i) {
            if (view instanceof ConversationRecommendItemView) {
                ConversationHeadRecommendLayout conversationHeadRecommendLayout = ConversationHeadRecommendLayout.this;
                ((ConversationRecommendItemView) view).m41266X(conversationHeadRecommendLayout.f24752m, conversationHeadRecommendLayout, c8115c);
            }
        }

        /* JADX INFO: renamed from: Y */
        public final void m40797Y(View view, C8115c c8115c, int i) {
            if (view instanceof ConversationSuperBoostItemView) {
                ((ConversationSuperBoostItemView) view).m41295D0(c8115c, i);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public int getItemViewType(int i) {
            int i2 = this.f24764c.get(i).f24774a;
            if (i2 == C8115c.f24767D || i2 == C8115c.f24768E || i2 == C8115c.f24769F) {
                return 1;
            }
            return i2;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationHeadRecommendLayout$c */
    public static class C8115c {

        /* JADX INFO: renamed from: D */
        public static int f24767D = 25;

        /* JADX INFO: renamed from: E */
        public static int f24768E = 26;

        /* JADX INFO: renamed from: F */
        public static int f24769F = 27;

        /* JADX INFO: renamed from: G */
        public static int f24770G = 28;

        /* JADX INFO: renamed from: A */
        @Nullable
        public MonetizationChatSeeUser f24771A;

        /* JADX INFO: renamed from: B */
        @Nullable
        public GrowthMesInfo f24772B;

        /* JADX INFO: renamed from: C */
        public String f24773C;

        /* JADX INFO: renamed from: a */
        public int f24774a;

        /* JADX INFO: renamed from: d */
        public String f24777d;

        /* JADX INFO: renamed from: g */
        public String f24780g;

        /* JADX INFO: renamed from: h */
        public int f24781h;

        /* JADX INFO: renamed from: i */
        public String f24782i;

        /* JADX INFO: renamed from: j */
        public String f24783j;

        /* JADX INFO: renamed from: k */
        public String f24784k;

        /* JADX INFO: renamed from: l */
        public float f24785l;

        /* JADX INFO: renamed from: m */
        public int f24786m;

        /* JADX INFO: renamed from: n */
        public User f24787n;

        /* JADX INFO: renamed from: o */
        public SpotLightLiveInfo f24788o;

        /* JADX INFO: renamed from: p */
        public SpotLightSeeInfo f24789p;

        /* JADX INFO: renamed from: q */
        public InteractionType f24790q;

        /* JADX INFO: renamed from: r */
        public Relation f24791r;

        /* JADX INFO: renamed from: s */
        public String f24792s;

        /* JADX INFO: renamed from: t */
        public String f24793t;

        /* JADX INFO: renamed from: w */
        @Nullable
        public LiveMultiCallInfo f24796w;

        /* JADX INFO: renamed from: x */
        @Nullable
        public Recommended f24797x;

        /* JADX INFO: renamed from: y */
        @Nullable
        public QuickChatCardInfo f24798y;

        /* JADX INFO: renamed from: z */
        @Nullable
        public User f24799z;

        /* JADX INFO: renamed from: b */
        public String f24775b = "";

        /* JADX INFO: renamed from: c */
        public String f24776c = "";

        /* JADX INFO: renamed from: e */
        public String f24778e = "";

        /* JADX INFO: renamed from: f */
        public boolean f24779f = false;

        /* JADX INFO: renamed from: u */
        public int f24794u = 0;

        /* JADX INFO: renamed from: v */
        public int f24795v = 0;

        public C8115c(int i, @NonNull String str) {
            this.f24774a = i;
            this.f24777d = str;
        }

        /* JADX INFO: renamed from: a */
        public String m40798a() {
            if (!NullChecker.m81303a(this.f24796w)) {
                return "";
            }
            String str = this.f24796w.role;
            return !TextUtils.isEmpty(str) ? str : "";
        }

        /* JADX INFO: renamed from: b */
        public boolean m40799b() {
            int i = this.f24774a;
            return i == 16 || i == 17 || i == 18;
        }

        @NotNull
        public String toString() {
            return "HeadCovItem{type=" + this.f24774a + ", forceText='" + this.f24775b + "', text='" + this.f24776c + "', userId='" + this.f24777d + "', anchorId='" + this.f24778e + "', isLiving=" + this.f24779f + ", liveId='" + this.f24780g + "', index=" + this.f24781h + ", liveLabel='" + this.f24782i + "', liveState='" + this.f24783j + "', topicId='" + this.f24784k + "'}";
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.ConversationHeadRecommendLayout$d */
    public class C8116d extends RecyclerView.AbstractC0576n {

        /* JADX INFO: renamed from: a */
        public final int f24800a;

        public C8116d(int i) {
            this.f24800a = i;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(@NonNull Rect rect, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull RecyclerView.C0588z c0588z) {
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == 0) {
                rect.left = t100.m186890d(14.0f);
                rect.right = this.f24800a;
            } else if (NullChecker.m81303a(ConversationHeadRecommendLayout.this.f24752m) && childAdapterPosition == ConversationHeadRecommendLayout.this.f24752m.getPageCount() - 1) {
                rect.left = this.f24800a;
                rect.right = t100.m186890d(14.0f);
            } else {
                int i = this.f24800a;
                rect.left = i;
                rect.right = i;
            }
        }
    }

    public ConversationHeadRecommendLayout(Context context) {
        super(context);
        this.f24753n = C22392a.m221513c(new ArrayList());
        this.f24754o = mqi0.m155944o();
        this.f24757r = -1.0d;
        this.f24758s = false;
        this.f24759t = false;
        this.f24760u = C22392a.m221513c(Boolean.TRUE);
        this.f24761v = new ArrayList();
        this.f24762w = true;
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ Boolean m40742B(Act.C4299r c4299r) {
        return c4299r == null ? Boolean.FALSE : Boolean.valueOf(NullChecker.m81303a(c4299r.f15343a.get()));
    }

    /* JADX INFO: renamed from: C */
    public static /* synthetic */ void m40743C(Throwable th) {
    }

    /* JADX INFO: renamed from: u */
    public static /* synthetic */ void m40753u(Bundle bundle) {
    }

    /* JADX INFO: renamed from: v */
    public static /* synthetic */ void m40754v(Throwable th) {
    }

    /* JADX INFO: renamed from: O */
    public final void m40757O(View view) {
        a86.m95335a(this, view);
    }

    /* JADX INFO: renamed from: P */
    public PutongAct m40758P() {
        return (PutongAct) getContext();
    }

    /* JADX INFO: renamed from: Q */
    public final void m40759Q() {
        mkd0.m154992z(this.f24751l);
        this.f24751l = Act.foreground().map(new w9j() { // from class: l.o76
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return ConversationHeadRecommendLayout.m40742B((Act.C4299r) obj);
            }
        }).distinctUntilChanged().subscribe(mkd0.m154956H(new e30() { // from class: l.p76
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f147479a.m40770c0((Boolean) obj);
            }
        }, new e30() { // from class: l.q76
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationHeadRecommendLayout.m40754v((Throwable) obj);
            }
        }));
        m40758P().creates(new e30() { // from class: l.r76
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationHeadRecommendLayout.m40753u((Bundle) obj);
            }
        }, new d30() { // from class: l.s76
            @Override // p149l.d30
            public final void call() {
                this.f162896a.m40769b0();
            }
        });
    }

    /* JADX INFO: renamed from: R */
    public final void m40760R() {
        m40758P().duringCreated(CoreModule.f17545c.f19642f0.m33176wn()).subscribe(mkd0.m154955G(new e30() { // from class: l.l76
            @Override // p149l.e30
            public final void call(Object obj) {
                this.f126694a.m40775j0((Message) obj);
            }
        }));
        if (!this.f24759t) {
            m40759Q();
        }
        m40761S();
    }

    /* JADX INFO: renamed from: S */
    public void m40761S() {
        C22306c c22306cDuringCreated = m40758P().duringCreated(CoreModule.f17545c.f19642f0.f19916Z.flatMap(new w9j() { // from class: l.t76
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f168667a.m40772f0((String) obj);
            }
        }).filter(new u76()));
        C22392a<List<C8115c>> c22392a = this.f24753n;
        Objects.requireNonNull(c22392a);
        c22306cDuringCreated.subscribe(mkd0.m154956H(new v76(c22392a), new e30() { // from class: l.w76
            @Override // p149l.e30
            public final void call(Object obj) {
                ConversationHeadRecommendLayout.m40743C((Throwable) obj);
            }
        }));
    }

    /* JADX INFO: renamed from: T */
    public void m40762T(C8115c c8115c) {
        if (NullChecker.m81303a(c8115c)) {
            List<C8115c> listM221515e = this.f24753n.m221515e();
            if (vwb.m200296J(listM221515e)) {
                return;
            }
            listM221515e.remove(c8115c);
            listM221515e.add(c8115c);
            this.f24753n.onNext(listM221515e);
        }
    }

    /* JADX INFO: renamed from: V */
    public void m40763V() {
        this.f24759t = upa.m194717Y0().function_switch;
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getContext(), 0, false);
        linearLayoutManager.canScrollVertically();
        this.f24748i.setLayoutManager(linearLayoutManager);
        this.f24752m = new C8114b();
        this.f24748i.addItemDecoration(new C8116d(t100.m186890d(7.5f)));
        this.f24748i.setAdapter(this.f24752m);
        this.f24748i.setOverScrollMode(0);
        this.f24748i.addOnScrollListener(new C8113a());
        this.f24745f.setTextSize(2, 15.0f);
        this.f24745f.setTypeface(Typeface.DEFAULT_BOLD);
        m40760R();
        m40774h0();
        xdl0.m208360X(this.f24745f, t100.m186890d(5.0f));
        this.f24750k.setVisibility(8);
        this.f24745f.setText(m40758P().string(R$string.f19028w9));
        xdl0.m208344M(this.f24746g, false);
        if (m40767Z()) {
            xdl0.m208344M(this.f24745f, false);
            int headRecommendListHeight = getHeadRecommendListHeight();
            xdl0.m208325C0(this.f24748i, headRecommendListHeight);
            xdl0.m208325C0(this.f24740a, headRecommendListHeight);
            xdl0.m208360X(this.f24748i, 0);
            if (upa.m194741d3()) {
                xdl0.m208344M(this.f24750k, false);
            }
        }
    }

    /* JADX INFO: renamed from: W */
    public final List<C8115c> m40764W(List<FriendInfo> list) {
        ArrayList arrayList = new ArrayList();
        if (!vwb.m200296J(list)) {
            for (int i = 0; i < list.size(); i++) {
                FriendInfo friendInfo = list.get(i);
                C8115c c8115c = new C8115c(m40765X(friendInfo.suggest.reason), friendInfo.userId);
                FriendSuggestInfo friendSuggestInfo = friendInfo.suggest;
                c8115c.f24775b = friendSuggestInfo.forceText;
                c8115c.f24776c = friendSuggestInfo.text;
                c8115c.f24790q = friendSuggestInfo.interactionType;
                c8115c.f24791r = friendSuggestInfo.relation;
                c8115c.f24792s = friendSuggestInfo.roomId;
                arrayList.add(c8115c);
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: X */
    public final int m40765X(FriendSuggestReason friendSuggestReason) {
        if (!NullChecker.m81303a(friendSuggestReason)) {
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
    public final void m40766Y(List<C8115c> list, boolean z) {
        if (list.size() > 1) {
            ListIterator<C8115c> listIterator = list.listIterator();
            while (listIterator.hasNext()) {
                C8115c next = listIterator.next();
                if (next.f24774a != 11 && next.f24787n == null) {
                    listIterator.remove();
                }
            }
        }
        setVisibility(0);
        this.f24760u.onNext(Boolean.TRUE);
        if (NullChecker.m81303a(this.f24748i.getItemAnimator())) {
            this.f24748i.getItemAnimator().setChangeDuration(0L);
        }
        if (list.size() == 1 && list.get(0).f24774a == 11 && list.get(0).f24786m == 0) {
            this.f24748i.setVisibility(8);
            IntlConversationOnlyBoostView intlConversationOnlyBoostView = this.f24756q;
            if (intlConversationOnlyBoostView == null) {
                this.f24756q = (IntlConversationOnlyBoostView) this.f24747h.inflate();
                lrb.m151154f().m151164n(true);
                this.f24756q.setOnClickListener(new View.OnClickListener() { // from class: l.m76
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.f131793a.m40773g0(view);
                    }
                });
            } else {
                intlConversationOnlyBoostView.setVisibility(0);
            }
            this.f24756q.m41661i0();
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            layoutParams.height = t100.m186890d(135.0f);
            setLayoutParams(layoutParams);
        } else {
            ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
            layoutParams2.height = t100.m186890d(149.0f);
            setLayoutParams(layoutParams2);
            this.f24748i.setVisibility(0);
            if (NullChecker.m81303a(this.f24756q)) {
                this.f24756q.setVisibility(8);
            }
        }
        C8114b c8114b = this.f24752m;
        if (!z) {
            c8114b.m40793U(list);
        } else {
            c8114b.f24764c.set(0, list.get(0));
            this.f24752m.notifyItemChanged(0);
        }
    }

    /* JADX INFO: renamed from: Z */
    public final boolean m40767Z() {
        return upa.m194805q2() || upa.m194741d3();
    }

    /* JADX INFO: renamed from: a0 */
    public final boolean m40768a0(int i) {
        return i == 11 || i == 12 || i == 13;
    }

    /* JADX INFO: renamed from: b0 */
    public final /* synthetic */ void m40769b0() {
        mkd0.m154992z(this.f24751l);
    }

    /* JADX INFO: renamed from: c0 */
    public final /* synthetic */ void m40770c0(Boolean bool) {
        if (!bool.booleanValue()) {
            this.f24754o = mqi0.m155944o();
        } else if (mqi0.m155944o() - this.f24754o > AuthenticationTokenClaims.MAX_TIME_SINCE_TOKEN_ISSUED) {
            this.f24754o = mqi0.m155944o();
            CoreModule.f17545c.f19642f0.f19916Z.onNext("");
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final /* synthetic */ C22306c m40771e0(List list) {
        return C22306c.just(m40764W(list));
    }

    /* JADX INFO: renamed from: f0 */
    public final /* synthetic */ C22306c m40772f0(String str) throws IOException {
        if (NullChecker.m81303a(this.f24752m) && TextUtils.equals(str, "message_tab_hide_to_show_refresh")) {
            this.f24752m.m40782J();
        }
        double dM155944o = (mqi0.m155944o() - CoreModule.f17545c.f19642f0.f19919a0) / 1000.0d;
        RealtimeRefreshNewMatch realtimeRefreshNewMatchM194717Y0 = upa.m194717Y0();
        if (!TextUtils.isEmpty(str) && !this.f24758s && ((!TextUtils.equals(str, "message_tab_hide_to_show_refresh") || dM155944o <= realtimeRefreshNewMatchM194717Y0.message_tab_hide_to_show_refresh_interval) && (!TextUtils.equals(str, "message_tab_generate_new_match_refresh") || dM155944o <= realtimeRefreshNewMatchM194717Y0.message_tab_generate_new_match_refresh_interval))) {
            return C22306c.just(null);
        }
        this.f24758s = false;
        return CoreModule.f17545c.f19642f0.m33144ug().flatMap(new w9j() { // from class: l.n76
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return this.f137486a.m40771e0((List) obj);
            }
        });
    }

    /* JADX INFO: renamed from: g0 */
    public final /* synthetic */ void m40773g0(View view) {
        lrb.m151154f().m151155d(m40758P());
    }

    public int getHeadRecommendListHeight() {
        if (upa.m194741d3()) {
            return t100.m186890d(115.0f);
        }
        return upa.m194805q2() ? t100.m186890d(112.0f) : this.f24748i.getHeight();
    }

    public C22306c<List<C8115c>> getRecommendListObs() {
        return this.f24753n;
    }

    public C22306c<Boolean> getVisibleObs() {
        return this.f24760u;
    }

    /* JADX INFO: renamed from: h0 */
    public final void m40774h0() {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.height = t100.m186890d(149.0f);
        setLayoutParams(layoutParams);
    }

    /* JADX INFO: renamed from: j0 */
    public final void m40775j0(Message message) {
        if (NullChecker.m81303a(message) && message.isMe()) {
            String str = message.hostId;
            if (TextUtils.isEmpty(str)) {
                str = message.cid;
            }
            if (NullChecker.m81303a(this.f24752m)) {
                this.f24752m.m40787O(str, true);
            }
        }
    }

    /* JADX INFO: renamed from: k0 */
    public void m40776k0(List<C8115c> list) {
        if (!vwb.m200296J(list)) {
            m40766Y(list, false);
        } else {
            setVisibility(8);
            this.f24760u.onNext(Boolean.FALSE);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m40757O(this);
        this.f24744e.setTypeface(Typeface.DEFAULT_BOLD);
        xdl0.m208344M(this.f24742c, false);
        xdl0.m208344M(this.f24744e, false);
        xdl0.m208344M(this.f24745f, true);
        if (upa.m194746e3()) {
            NewMatchItemLayout.m42534i();
            xdl0.m208360X(this.f24749j, -t100.m186890d(7.0f));
            if (upa.m194847z()) {
                rd6.m178882v(t100.m186890d(86.0f), this.f24749j);
                xdl0.m208358V(this.f24749j, 0);
            } else {
                rd6.m178882v(t100.m186890d(70.0f), this.f24749j);
                xdl0.m208358V(this.f24749j, t100.m186890d(6.0f));
            }
        }
    }

    public ConversationHeadRecommendLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f24753n = C22392a.m221513c(new ArrayList());
        this.f24754o = mqi0.m155944o();
        this.f24757r = -1.0d;
        this.f24758s = false;
        this.f24759t = false;
        this.f24760u = C22392a.m221513c(Boolean.TRUE);
        this.f24761v = new ArrayList();
        this.f24762w = true;
    }

    public ConversationHeadRecommendLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f24753n = C22392a.m221513c(new ArrayList());
        this.f24754o = mqi0.m155944o();
        this.f24757r = -1.0d;
        this.f24758s = false;
        this.f24759t = false;
        this.f24760u = C22392a.m221513c(Boolean.TRUE);
        this.f24761v = new ArrayList();
        this.f24762w = true;
    }
}
