package com.p051p1.mobile.putong.live.livingroom.virtual.giftwalllocal.giftwall;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p051p1.mobile.putong.data.BloodType;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftItem;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceGiftWallListDetail;
import com.p051p1.mobile.putong.live.livingroom.virtual.giftwalllocal.giftwall.GiftWallPageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p151v.VImage;
import p151v.VLinear;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.bnl0;
import p153l.g2k;
import p153l.jyb;
import p153l.k2k;
import p153l.kjn0;
import p153l.l51;
import p153l.p7f;
import p153l.qa00;
import p153l.rwn0;
import p153l.s2k;
import p153l.y20;
import p153l.yec0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m88120d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 \u0084\u00012\u00020\u0001:\u0002\u0085\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0013\u0010\u0012J)\u0010\u0018\u001a\u00020\n2\u001a\b\u0002\u0010\u0017\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0014¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u001a\b\u0002\u0010\u0017\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010!\u001a\u00020\n2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\n¢\u0006\u0004\b#\u0010\u0012R\"\u0010*\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010F\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010=\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR\"\u0010J\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010=\u001a\u0004\bH\u0010?\"\u0004\bI\u0010AR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010i\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010m\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010d\u001a\u0004\bk\u0010f\"\u0004\bl\u0010hR\"\u0010q\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010d\u001a\u0004\bo\u0010f\"\u0004\bp\u0010hR\u0016\u0010s\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u00104R$\u0010{\u001a\u0004\u0018\u00010t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR$\u0010\u007f\u001a\u0004\u0018\u00010t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b|\u0010v\u001a\u0004\b}\u0010x\"\u0004\b~\u0010zR(\u0010\u0083\u0001\u001a\u0004\u0018\u00010t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010v\u001a\u0005\b\u0081\u0001\u0010x\"\u0005\b\u0082\u0001\u0010z¨\u0006\u0086\u0001"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/giftwalllocal/giftwall/GiftWallPageView;", "Lcom/p1/mobile/putong/live/livingroom/virtual/giftwalllocal/giftwall/MLiveNestedScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "a0", "(Landroid/view/View;)V", "", FirebaseAnalytics.Param.INDEX, "g0", "(I)V", "b0", "()V", "onFinishInflate", "Ll/k2k;", "Ll/rwn0;", "Ll/g2k;", "presenter", "f0", "(Ll/k2k;)V", "Lv/VRecyclerView;", "recycler", "e0", "(Lv/VRecyclerView;Ll/k2k;)V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceGiftWallListDetail;", "newData", "setListDate", "(Ljava/util/List;)V", "c0", "G", "Lcom/p1/mobile/putong/live/livingroom/virtual/giftwalllocal/giftwall/GiftWallPageView;", "get_root", "()Lcom/p1/mobile/putong/live/livingroom/virtual/giftwalllocal/giftwall/GiftWallPageView;", "set_root", "(Lcom/p1/mobile/putong/live/livingroom/virtual/giftwalllocal/giftwall/GiftWallPageView;)V", "_root", "Lcom/p1/mobile/putong/live/livingroom/virtual/giftwalllocal/giftwall/VoiceGiftWallBriefView;", "H", "Lcom/p1/mobile/putong/live/livingroom/virtual/giftwalllocal/giftwall/VoiceGiftWallBriefView;", "get_gift_wall_enter", "()Lcom/p1/mobile/putong/live/livingroom/virtual/giftwalllocal/giftwall/VoiceGiftWallBriefView;", "set_gift_wall_enter", "(Lcom/p1/mobile/putong/live/livingroom/virtual/giftwalllocal/giftwall/VoiceGiftWallBriefView;)V", "_gift_wall_enter", "Lv/VLinear;", "I", "Lv/VLinear;", "get_mini_tabs", "()Lv/VLinear;", "set_mini_tabs", "(Lv/VLinear;)V", "_mini_tabs", "Landroid/widget/TextView;", "J", "Landroid/widget/TextView;", "get_tab_all", "()Landroid/widget/TextView;", "set_tab_all", "(Landroid/widget/TextView;)V", "_tab_all", "K", "get_tab_light", "set_tab_light", "_tab_light", "L", "get_tab_dark", "set_tab_dark", "_tab_dark", "Landroid/widget/LinearLayout;", "M", "Landroid/widget/LinearLayout;", "get_empty", "()Landroid/widget/LinearLayout;", "set_empty", "(Landroid/widget/LinearLayout;)V", "_empty", "Lv/VImage;", "N", "Lv/VImage;", "get_empty_icon", "()Lv/VImage;", "set_empty_icon", "(Lv/VImage;)V", "_empty_icon", "Lv/VText;", BloodType.f39576O, "Lv/VText;", "get_empty_text", "()Lv/VText;", "set_empty_text", "(Lv/VText;)V", "_empty_text", "P", "Lv/VRecyclerView;", "get_allRecyclerView", "()Lv/VRecyclerView;", "set_allRecyclerView", "(Lv/VRecyclerView;)V", "_allRecyclerView", "Q", "get_lightRecyclerView", "set_lightRecyclerView", "_lightRecyclerView", "R", "get_darkRecyclerView", "set_darkRecyclerView", "_darkRecyclerView", p7f.LATITUDE_SOUTH, "currentIndex", "Ll/kjn0;", p7f.GPS_DIRECTION_TRUE, "Ll/kjn0;", "getAllAdapter", "()Ll/kjn0;", "setAllAdapter", "(Ll/kjn0;)V", "allAdapter", "U", "getLightAdapter", "setLightAdapter", "lightAdapter", p7f.GPS_MEASUREMENT_INTERRUPTED, "getDarkAdapter", "setDarkAdapter", "darkAdapter", "Companion", "a", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class GiftWallPageView extends MLiveNestedScrollView {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    public GiftWallPageView _root;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    public VoiceGiftWallBriefView _gift_wall_enter;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    public VLinear _mini_tabs;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    public TextView _tab_all;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    public TextView _tab_light;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    public TextView _tab_dark;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    public LinearLayout _empty;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    public VImage _empty_icon;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    public VText _empty_text;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    public VRecyclerView _allRecyclerView;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    public VRecyclerView _lightRecyclerView;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    public VRecyclerView _darkRecyclerView;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    public int currentIndex;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    @Nullable
    public kjn0 allAdapter;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @Nullable
    public kjn0 lightAdapter;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @Nullable
    public kjn0 darkAdapter;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.giftwalllocal.giftwall.GiftWallPageView$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/giftwalllocal/giftwall/GiftWallPageView$a;", "", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Lcom/p1/mobile/putong/live/livingroom/virtual/giftwalllocal/giftwall/GiftWallPageView;", "a", "(Landroid/view/LayoutInflater;)Lcom/p1/mobile/putong/live/livingroom/virtual/giftwalllocal/giftwall/GiftWallPageView;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final GiftWallPageView m78152a(@NotNull LayoutInflater inflater) {
            inflater.getClass();
            View viewInflate = inflater.inflate(yec0.f198928T8, (ViewGroup) null, false);
            viewInflate.getClass();
            return (GiftWallPageView) viewInflate;
        }

        public Companion() {
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public GiftWallPageView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: T */
    public static void m78138T(GiftWallPageView giftWallPageView) {
        bnl0.m105505C0(giftWallPageView.get_allRecyclerView(), giftWallPageView.get_root().getHeight());
        bnl0.m105505C0(giftWallPageView.get_darkRecyclerView(), giftWallPageView.get_root().getHeight());
        bnl0.m105505C0(giftWallPageView.get_lightRecyclerView(), giftWallPageView.get_root().getHeight());
        giftWallPageView.setTopHeight(qa00.m175859d(200.0f));
    }

    /* JADX INFO: renamed from: U */
    public static void m78139U(k2k k2kVar, BLiveVoiceGiftItem bLiveVoiceGiftItem) {
        if (k2kVar != null) {
            k2kVar.m147978e4(bLiveVoiceGiftItem);
        }
    }

    /* JADX INFO: renamed from: V */
    public static void m78140V(GiftWallPageView giftWallPageView, View view) {
        giftWallPageView.m78147g0(2);
    }

    /* JADX INFO: renamed from: W */
    public static void m78141W(GiftWallPageView giftWallPageView, View view) {
        giftWallPageView.m78147g0(0);
    }

    /* JADX INFO: renamed from: X */
    public static void m78142X(GiftWallPageView giftWallPageView, View view) {
        giftWallPageView.m78147g0(1);
    }

    /* JADX INFO: renamed from: Y */
    public static void m78143Y(k2k k2kVar, BLiveVoiceGiftItem bLiveVoiceGiftItem) {
        if (k2kVar != null) {
            k2kVar.m147978e4(bLiveVoiceGiftItem);
        }
    }

    /* JADX INFO: renamed from: Z */
    public static void m78144Z(k2k k2kVar, BLiveVoiceGiftItem bLiveVoiceGiftItem) {
        if (k2kVar != null) {
            k2kVar.m147978e4(bLiveVoiceGiftItem);
        }
    }

    /* JADX INFO: renamed from: b0 */
    private final void m78145b0() {
        if (get_tab_all().isSelected()) {
            LinearLayout linearLayout = get_empty();
            kjn0 kjn0Var = this.allAdapter;
            bnl0.m105524M(linearLayout, kjn0Var != null && kjn0Var.mo29823C() == 0);
        } else if (get_tab_light().isSelected()) {
            LinearLayout linearLayout2 = get_empty();
            kjn0 kjn0Var2 = this.lightAdapter;
            bnl0.m105524M(linearLayout2, kjn0Var2 != null && kjn0Var2.mo29823C() == 0);
        } else if (get_tab_dark().isSelected()) {
            LinearLayout linearLayout3 = get_empty();
            kjn0 kjn0Var3 = this.darkAdapter;
            bnl0.m105524M(linearLayout3, kjn0Var3 != null && kjn0Var3.mo29823C() == 0);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d0 */
    public static final GiftWallPageView m78146d0(@NotNull LayoutInflater layoutInflater) {
        return INSTANCE.m78152a(layoutInflater);
    }

    /* JADX INFO: renamed from: g0 */
    private final void m78147g0(int index) {
        this.currentIndex = index;
        get_tab_all().setSelected(index == 0);
        get_tab_light().setSelected(index == 1);
        get_tab_dark().setSelected(index == 2);
        bnl0.m105524M(get_allRecyclerView(), index == 0);
        bnl0.m105524M(get_lightRecyclerView(), index == 1);
        bnl0.m105524M(get_darkRecyclerView(), index == 2);
        m78145b0();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m78148a0(View view) {
        s2k.m184125a(this, view);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m78149c0() {
        get_gift_wall_enter().m78154i0();
        kjn0 kjn0Var = this.allAdapter;
        if (kjn0Var != null) {
            kjn0Var.m150050F();
        }
        kjn0 kjn0Var2 = this.lightAdapter;
        if (kjn0Var2 != null) {
            kjn0Var2.m150050F();
        }
        kjn0 kjn0Var3 = this.darkAdapter;
        if (kjn0Var3 != null) {
            kjn0Var3.m150050F();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m78150e0(@NotNull VRecyclerView recycler, @Nullable k2k<rwn0, g2k> presenter) {
        recycler.getClass();
        recycler.setLayoutManager(new GridLayoutManager(presenter != null ? presenter.act() : null, 3));
        recycler.setNestedScrollingEnabled(true);
        recycler.setHasFixedSize(true);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m78151f0(@Nullable final k2k<rwn0, g2k> presenter) {
        this.allAdapter = new kjn0(presenter, new y20() { // from class: l.l2k
            @Override // p153l.y20
            public final void call(Object obj) {
                GiftWallPageView.m78139U(presenter, (BLiveVoiceGiftItem) obj);
            }
        });
        this.lightAdapter = new kjn0(presenter, new y20() { // from class: l.m2k
            @Override // p153l.y20
            public final void call(Object obj) {
                GiftWallPageView.m78143Y(presenter, (BLiveVoiceGiftItem) obj);
            }
        });
        this.darkAdapter = new kjn0(presenter, new y20() { // from class: l.n2k
            @Override // p153l.y20
            public final void call(Object obj) {
                GiftWallPageView.m78144Z(presenter, (BLiveVoiceGiftItem) obj);
            }
        });
        get_allRecyclerView().setAdapter(this.allAdapter);
        get_lightRecyclerView().setAdapter(this.lightAdapter);
        get_darkRecyclerView().setAdapter(this.darkAdapter);
        m78150e0(get_allRecyclerView(), presenter);
        m78150e0(get_lightRecyclerView(), presenter);
        m78150e0(get_darkRecyclerView(), presenter);
        m78147g0(0);
        bnl0.m105509E0(get_tab_all(), new View.OnClickListener() { // from class: l.o2k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftWallPageView.m78141W(this.f144745a, view);
            }
        });
        bnl0.m105509E0(get_tab_light(), new View.OnClickListener() { // from class: l.p2k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftWallPageView.m78142X(this.f150273a, view);
            }
        });
        bnl0.m105509E0(get_tab_dark(), new View.OnClickListener() { // from class: l.q2k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftWallPageView.m78140V(this.f155347a, view);
            }
        });
        l51.m152887G(new Runnable() { // from class: l.r2k
            @Override // java.lang.Runnable
            public final void run() {
                GiftWallPageView.m78138T(this.f160946a);
            }
        });
    }

    @Nullable
    public final kjn0 getAllAdapter() {
        return this.allAdapter;
    }

    @Nullable
    public final kjn0 getDarkAdapter() {
        return this.darkAdapter;
    }

    @Nullable
    public final kjn0 getLightAdapter() {
        return this.lightAdapter;
    }

    @NotNull
    public final VRecyclerView get_allRecyclerView() {
        VRecyclerView vRecyclerView = this._allRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m88391r("_allRecyclerView");
        return null;
    }

    @NotNull
    public final VRecyclerView get_darkRecyclerView() {
        VRecyclerView vRecyclerView = this._darkRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m88391r("_darkRecyclerView");
        return null;
    }

    @NotNull
    public final LinearLayout get_empty() {
        LinearLayout linearLayout = this._empty;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m88391r("_empty");
        return null;
    }

    @NotNull
    public final VImage get_empty_icon() {
        VImage vImage = this._empty_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_empty_icon");
        return null;
    }

    @NotNull
    public final VText get_empty_text() {
        VText vText = this._empty_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m88391r("_empty_text");
        return null;
    }

    @NotNull
    public final VoiceGiftWallBriefView get_gift_wall_enter() {
        VoiceGiftWallBriefView voiceGiftWallBriefView = this._gift_wall_enter;
        if (voiceGiftWallBriefView != null) {
            return voiceGiftWallBriefView;
        }
        Intrinsics.m88391r("_gift_wall_enter");
        return null;
    }

    @NotNull
    public final VRecyclerView get_lightRecyclerView() {
        VRecyclerView vRecyclerView = this._lightRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m88391r("_lightRecyclerView");
        return null;
    }

    @NotNull
    public final VLinear get_mini_tabs() {
        VLinear vLinear = this._mini_tabs;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_mini_tabs");
        return null;
    }

    @NotNull
    public final GiftWallPageView get_root() {
        GiftWallPageView giftWallPageView = this._root;
        if (giftWallPageView != null) {
            return giftWallPageView;
        }
        Intrinsics.m88391r("_root");
        return null;
    }

    @NotNull
    public final TextView get_tab_all() {
        TextView textView = this._tab_all;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_tab_all");
        return null;
    }

    @NotNull
    public final TextView get_tab_dark() {
        TextView textView = this._tab_dark;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_tab_dark");
        return null;
    }

    @NotNull
    public final TextView get_tab_light() {
        TextView textView = this._tab_light;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m88391r("_tab_light");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78148a0(this);
    }

    public final void setAllAdapter(@Nullable kjn0 kjn0Var) {
        this.allAdapter = kjn0Var;
    }

    public final void setDarkAdapter(@Nullable kjn0 kjn0Var) {
        this.darkAdapter = kjn0Var;
    }

    public final void setLightAdapter(@Nullable kjn0 kjn0Var) {
        this.lightAdapter = kjn0Var;
    }

    public final void setListDate(@NotNull List<? extends BLiveVoiceGiftWallListDetail> newData) {
        newData.getClass();
        if (!jyb.m147479J(newData) && newData.size() >= 3) {
            kjn0 kjn0Var = this.allAdapter;
            if (kjn0Var != null) {
                kjn0Var.m150052H(newData.get(0).gifts);
            }
            kjn0 kjn0Var2 = this.lightAdapter;
            if (kjn0Var2 != null) {
                kjn0Var2.m150052H(newData.get(1).gifts);
            }
            kjn0 kjn0Var3 = this.darkAdapter;
            if (kjn0Var3 != null) {
                kjn0Var3.m150052H(newData.get(2).gifts);
            }
        }
        m78145b0();
    }

    public final void set_allRecyclerView(@NotNull VRecyclerView vRecyclerView) {
        vRecyclerView.getClass();
        this._allRecyclerView = vRecyclerView;
    }

    public final void set_darkRecyclerView(@NotNull VRecyclerView vRecyclerView) {
        vRecyclerView.getClass();
        this._darkRecyclerView = vRecyclerView;
    }

    public final void set_empty(@NotNull LinearLayout linearLayout) {
        linearLayout.getClass();
        this._empty = linearLayout;
    }

    public final void set_empty_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._empty_icon = vImage;
    }

    public final void set_empty_text(@NotNull VText vText) {
        vText.getClass();
        this._empty_text = vText;
    }

    public final void set_gift_wall_enter(@NotNull VoiceGiftWallBriefView voiceGiftWallBriefView) {
        voiceGiftWallBriefView.getClass();
        this._gift_wall_enter = voiceGiftWallBriefView;
    }

    public final void set_lightRecyclerView(@NotNull VRecyclerView vRecyclerView) {
        vRecyclerView.getClass();
        this._lightRecyclerView = vRecyclerView;
    }

    public final void set_mini_tabs(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._mini_tabs = vLinear;
    }

    public final void set_root(@NotNull GiftWallPageView giftWallPageView) {
        giftWallPageView.getClass();
        this._root = giftWallPageView;
    }

    public final void set_tab_all(@NotNull TextView textView) {
        textView.getClass();
        this._tab_all = textView;
    }

    public final void set_tab_dark(@NotNull TextView textView) {
        textView.getClass();
        this._tab_dark = textView;
    }

    public final void set_tab_light(@NotNull TextView textView) {
        textView.getClass();
        this._tab_light = textView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public GiftWallPageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ GiftWallPageView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
