package com.p046p1.mobile.putong.live.livingroom.virtual.giftwalllocal.giftwall;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.p046p1.mobile.putong.data.BloodType;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftItem;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceGiftWallListDetail;
import com.p046p1.mobile.putong.live.livingroom.virtual.giftwalllocal.giftwall.GiftWallPageView;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmOverloads;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p147v.VImage;
import p147v.VLinear;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.c0k;
import p149l.e30;
import p149l.e51;
import p149l.gan0;
import p149l.j6f;
import p149l.nnn0;
import p149l.qzj;
import p149l.t100;
import p149l.t6c0;
import p149l.uzj;
import p149l.vwb;
import p149l.xdl0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m87231d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 \u0084\u00012\u00020\u0001:\u0002\u0085\u0001B\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0013\u0010\u0012J)\u0010\u0018\u001a\u00020\n2\u001a\b\u0002\u0010\u0017\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0014¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001c\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001a2\u001a\b\u0002\u0010\u0017\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0006\u0012\u0004\u0018\u00010\u0016\u0018\u00010\u0014¢\u0006\u0004\b\u001c\u0010\u001dJ\u001b\u0010!\u001a\u00020\n2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\n¢\u0006\u0004\b#\u0010\u0012R\"\u0010*\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u00102\u001a\u00020+8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010F\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010=\u001a\u0004\bD\u0010?\"\u0004\bE\u0010AR\"\u0010J\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010=\u001a\u0004\bH\u0010?\"\u0004\bI\u0010AR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010i\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010m\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bj\u0010d\u001a\u0004\bk\u0010f\"\u0004\bl\u0010hR\"\u0010q\u001a\u00020\u001a8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bn\u0010d\u001a\u0004\bo\u0010f\"\u0004\bp\u0010hR\u0016\u0010s\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u00104R$\u0010{\u001a\u0004\u0018\u00010t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR$\u0010\u007f\u001a\u0004\u0018\u00010t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b|\u0010v\u001a\u0004\b}\u0010x\"\u0004\b~\u0010zR(\u0010\u0083\u0001\u001a\u0004\u0018\u00010t8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010v\u001a\u0005\b\u0081\u0001\u0010x\"\u0005\b\u0082\u0001\u0010z¨\u0006\u0086\u0001"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/giftwalllocal/giftwall/GiftWallPageView;", "Lcom/p1/mobile/putong/live/livingroom/virtual/giftwalllocal/giftwall/MLiveNestedScrollView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "a0", "(Landroid/view/View;)V", "", FirebaseAnalytics.Param.INDEX, "g0", "(I)V", "b0", "()V", "onFinishInflate", "Ll/uzj;", "Ll/nnn0;", "Ll/qzj;", "presenter", "f0", "(Ll/uzj;)V", "Lv/VRecyclerView;", "recycler", "e0", "(Lv/VRecyclerView;Ll/uzj;)V", "", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceGiftWallListDetail;", "newData", "setListDate", "(Ljava/util/List;)V", "c0", "G", "Lcom/p1/mobile/putong/live/livingroom/virtual/giftwalllocal/giftwall/GiftWallPageView;", "get_root", "()Lcom/p1/mobile/putong/live/livingroom/virtual/giftwalllocal/giftwall/GiftWallPageView;", "set_root", "(Lcom/p1/mobile/putong/live/livingroom/virtual/giftwalllocal/giftwall/GiftWallPageView;)V", "_root", "Lcom/p1/mobile/putong/live/livingroom/virtual/giftwalllocal/giftwall/VoiceGiftWallBriefView;", "H", "Lcom/p1/mobile/putong/live/livingroom/virtual/giftwalllocal/giftwall/VoiceGiftWallBriefView;", "get_gift_wall_enter", "()Lcom/p1/mobile/putong/live/livingroom/virtual/giftwalllocal/giftwall/VoiceGiftWallBriefView;", "set_gift_wall_enter", "(Lcom/p1/mobile/putong/live/livingroom/virtual/giftwalllocal/giftwall/VoiceGiftWallBriefView;)V", "_gift_wall_enter", "Lv/VLinear;", "I", "Lv/VLinear;", "get_mini_tabs", "()Lv/VLinear;", "set_mini_tabs", "(Lv/VLinear;)V", "_mini_tabs", "Landroid/widget/TextView;", "J", "Landroid/widget/TextView;", "get_tab_all", "()Landroid/widget/TextView;", "set_tab_all", "(Landroid/widget/TextView;)V", "_tab_all", "K", "get_tab_light", "set_tab_light", "_tab_light", "L", "get_tab_dark", "set_tab_dark", "_tab_dark", "Landroid/widget/LinearLayout;", "M", "Landroid/widget/LinearLayout;", "get_empty", "()Landroid/widget/LinearLayout;", "set_empty", "(Landroid/widget/LinearLayout;)V", "_empty", "Lv/VImage;", "N", "Lv/VImage;", "get_empty_icon", "()Lv/VImage;", "set_empty_icon", "(Lv/VImage;)V", "_empty_icon", "Lv/VText;", BloodType.f38728O, "Lv/VText;", "get_empty_text", "()Lv/VText;", "set_empty_text", "(Lv/VText;)V", "_empty_text", "P", "Lv/VRecyclerView;", "get_allRecyclerView", "()Lv/VRecyclerView;", "set_allRecyclerView", "(Lv/VRecyclerView;)V", "_allRecyclerView", "Q", "get_lightRecyclerView", "set_lightRecyclerView", "_lightRecyclerView", "R", "get_darkRecyclerView", "set_darkRecyclerView", "_darkRecyclerView", j6f.LATITUDE_SOUTH, "currentIndex", "Ll/gan0;", j6f.GPS_DIRECTION_TRUE, "Ll/gan0;", "getAllAdapter", "()Ll/gan0;", "setAllAdapter", "(Ll/gan0;)V", "allAdapter", "U", "getLightAdapter", "setLightAdapter", "lightAdapter", j6f.GPS_MEASUREMENT_INTERRUPTED, "getDarkAdapter", "setDarkAdapter", "darkAdapter", "Companion", "a", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
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
    public gan0 allAdapter;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    @Nullable
    public gan0 lightAdapter;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    @Nullable
    public gan0 darkAdapter;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.virtual.giftwalllocal.giftwall.GiftWallPageView$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/virtual/giftwalllocal/giftwall/GiftWallPageView$a;", "", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Lcom/p1/mobile/putong/live/livingroom/virtual/giftwalllocal/giftwall/GiftWallPageView;", "a", "(Landroid/view/LayoutInflater;)Lcom/p1/mobile/putong/live/livingroom/virtual/giftwalllocal/giftwall/GiftWallPageView;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final GiftWallPageView m76969a(@NotNull LayoutInflater inflater) {
            inflater.getClass();
            View viewInflate = inflater.inflate(t6c0.f168196T8, (ViewGroup) null, false);
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
    public static void m76955T(GiftWallPageView giftWallPageView) {
        xdl0.m208325C0(giftWallPageView.get_allRecyclerView(), giftWallPageView.get_root().getHeight());
        xdl0.m208325C0(giftWallPageView.get_darkRecyclerView(), giftWallPageView.get_root().getHeight());
        xdl0.m208325C0(giftWallPageView.get_lightRecyclerView(), giftWallPageView.get_root().getHeight());
        giftWallPageView.setTopHeight(t100.m186890d(200.0f));
    }

    /* JADX INFO: renamed from: U */
    public static void m76956U(uzj uzjVar, BLiveVoiceGiftItem bLiveVoiceGiftItem) {
        if (uzjVar != null) {
            uzjVar.m196430e4(bLiveVoiceGiftItem);
        }
    }

    /* JADX INFO: renamed from: V */
    public static void m76957V(GiftWallPageView giftWallPageView, View view) {
        giftWallPageView.m76964g0(2);
    }

    /* JADX INFO: renamed from: W */
    public static void m76958W(GiftWallPageView giftWallPageView, View view) {
        giftWallPageView.m76964g0(0);
    }

    /* JADX INFO: renamed from: X */
    public static void m76959X(GiftWallPageView giftWallPageView, View view) {
        giftWallPageView.m76964g0(1);
    }

    /* JADX INFO: renamed from: Y */
    public static void m76960Y(uzj uzjVar, BLiveVoiceGiftItem bLiveVoiceGiftItem) {
        if (uzjVar != null) {
            uzjVar.m196430e4(bLiveVoiceGiftItem);
        }
    }

    /* JADX INFO: renamed from: Z */
    public static void m76961Z(uzj uzjVar, BLiveVoiceGiftItem bLiveVoiceGiftItem) {
        if (uzjVar != null) {
            uzjVar.m196430e4(bLiveVoiceGiftItem);
        }
    }

    /* JADX INFO: renamed from: b0 */
    private final void m76962b0() {
        if (get_tab_all().isSelected()) {
            LinearLayout linearLayout = get_empty();
            gan0 gan0Var = this.allAdapter;
            xdl0.m208344M(linearLayout, gan0Var != null && gan0Var.mo28824C() == 0);
        } else if (get_tab_light().isSelected()) {
            LinearLayout linearLayout2 = get_empty();
            gan0 gan0Var2 = this.lightAdapter;
            xdl0.m208344M(linearLayout2, gan0Var2 != null && gan0Var2.mo28824C() == 0);
        } else if (get_tab_dark().isSelected()) {
            LinearLayout linearLayout3 = get_empty();
            gan0 gan0Var3 = this.darkAdapter;
            xdl0.m208344M(linearLayout3, gan0Var3 != null && gan0Var3.mo28824C() == 0);
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: d0 */
    public static final GiftWallPageView m76963d0(@NotNull LayoutInflater layoutInflater) {
        return INSTANCE.m76969a(layoutInflater);
    }

    /* JADX INFO: renamed from: g0 */
    private final void m76964g0(int index) {
        this.currentIndex = index;
        get_tab_all().setSelected(index == 0);
        get_tab_light().setSelected(index == 1);
        get_tab_dark().setSelected(index == 2);
        xdl0.m208344M(get_allRecyclerView(), index == 0);
        xdl0.m208344M(get_lightRecyclerView(), index == 1);
        xdl0.m208344M(get_darkRecyclerView(), index == 2);
        m76962b0();
    }

    /* JADX INFO: renamed from: a0 */
    public final void m76965a0(View view) {
        c0k.m104760a(this, view);
    }

    /* JADX INFO: renamed from: c0 */
    public final void m76966c0() {
        get_gift_wall_enter().m76971i0();
        gan0 gan0Var = this.allAdapter;
        if (gan0Var != null) {
            gan0Var.m125004F();
        }
        gan0 gan0Var2 = this.lightAdapter;
        if (gan0Var2 != null) {
            gan0Var2.m125004F();
        }
        gan0 gan0Var3 = this.darkAdapter;
        if (gan0Var3 != null) {
            gan0Var3.m125004F();
        }
    }

    /* JADX INFO: renamed from: e0 */
    public final void m76967e0(@NotNull VRecyclerView recycler, @Nullable uzj<nnn0, qzj> presenter) {
        recycler.getClass();
        recycler.setLayoutManager(new GridLayoutManager(presenter != null ? presenter.act() : null, 3));
        recycler.setNestedScrollingEnabled(true);
        recycler.setHasFixedSize(true);
    }

    /* JADX INFO: renamed from: f0 */
    public final void m76968f0(@Nullable final uzj<nnn0, qzj> presenter) {
        this.allAdapter = new gan0(presenter, new e30() { // from class: l.vzj
            @Override // p149l.e30
            public final void call(Object obj) {
                GiftWallPageView.m76956U(presenter, (BLiveVoiceGiftItem) obj);
            }
        });
        this.lightAdapter = new gan0(presenter, new e30() { // from class: l.wzj
            @Override // p149l.e30
            public final void call(Object obj) {
                GiftWallPageView.m76960Y(presenter, (BLiveVoiceGiftItem) obj);
            }
        });
        this.darkAdapter = new gan0(presenter, new e30() { // from class: l.xzj
            @Override // p149l.e30
            public final void call(Object obj) {
                GiftWallPageView.m76961Z(presenter, (BLiveVoiceGiftItem) obj);
            }
        });
        get_allRecyclerView().setAdapter(this.allAdapter);
        get_lightRecyclerView().setAdapter(this.lightAdapter);
        get_darkRecyclerView().setAdapter(this.darkAdapter);
        m76967e0(get_allRecyclerView(), presenter);
        m76967e0(get_lightRecyclerView(), presenter);
        m76967e0(get_darkRecyclerView(), presenter);
        m76964g0(0);
        xdl0.m208329E0(get_tab_all(), new View.OnClickListener() { // from class: l.yzj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftWallPageView.m76958W(this.f200892a, view);
            }
        });
        xdl0.m208329E0(get_tab_light(), new View.OnClickListener() { // from class: l.zzj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftWallPageView.m76959X(this.f205804a, view);
            }
        });
        xdl0.m208329E0(get_tab_dark(), new View.OnClickListener() { // from class: l.a0k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                GiftWallPageView.m76957V(this.f67046a, view);
            }
        });
        e51.m114742G(new Runnable() { // from class: l.b0k
            @Override // java.lang.Runnable
            public final void run() {
                GiftWallPageView.m76955T(this.f72442a);
            }
        });
    }

    @Nullable
    public final gan0 getAllAdapter() {
        return this.allAdapter;
    }

    @Nullable
    public final gan0 getDarkAdapter() {
        return this.darkAdapter;
    }

    @Nullable
    public final gan0 getLightAdapter() {
        return this.lightAdapter;
    }

    @NotNull
    public final VRecyclerView get_allRecyclerView() {
        VRecyclerView vRecyclerView = this._allRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m87502r("_allRecyclerView");
        return null;
    }

    @NotNull
    public final VRecyclerView get_darkRecyclerView() {
        VRecyclerView vRecyclerView = this._darkRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m87502r("_darkRecyclerView");
        return null;
    }

    @NotNull
    public final LinearLayout get_empty() {
        LinearLayout linearLayout = this._empty;
        if (linearLayout != null) {
            return linearLayout;
        }
        Intrinsics.m87502r("_empty");
        return null;
    }

    @NotNull
    public final VImage get_empty_icon() {
        VImage vImage = this._empty_icon;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_empty_icon");
        return null;
    }

    @NotNull
    public final VText get_empty_text() {
        VText vText = this._empty_text;
        if (vText != null) {
            return vText;
        }
        Intrinsics.m87502r("_empty_text");
        return null;
    }

    @NotNull
    public final VoiceGiftWallBriefView get_gift_wall_enter() {
        VoiceGiftWallBriefView voiceGiftWallBriefView = this._gift_wall_enter;
        if (voiceGiftWallBriefView != null) {
            return voiceGiftWallBriefView;
        }
        Intrinsics.m87502r("_gift_wall_enter");
        return null;
    }

    @NotNull
    public final VRecyclerView get_lightRecyclerView() {
        VRecyclerView vRecyclerView = this._lightRecyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m87502r("_lightRecyclerView");
        return null;
    }

    @NotNull
    public final VLinear get_mini_tabs() {
        VLinear vLinear = this._mini_tabs;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_mini_tabs");
        return null;
    }

    @NotNull
    public final GiftWallPageView get_root() {
        GiftWallPageView giftWallPageView = this._root;
        if (giftWallPageView != null) {
            return giftWallPageView;
        }
        Intrinsics.m87502r("_root");
        return null;
    }

    @NotNull
    public final TextView get_tab_all() {
        TextView textView = this._tab_all;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_tab_all");
        return null;
    }

    @NotNull
    public final TextView get_tab_dark() {
        TextView textView = this._tab_dark;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_tab_dark");
        return null;
    }

    @NotNull
    public final TextView get_tab_light() {
        TextView textView = this._tab_light;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_tab_light");
        return null;
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m76965a0(this);
    }

    public final void setAllAdapter(@Nullable gan0 gan0Var) {
        this.allAdapter = gan0Var;
    }

    public final void setDarkAdapter(@Nullable gan0 gan0Var) {
        this.darkAdapter = gan0Var;
    }

    public final void setLightAdapter(@Nullable gan0 gan0Var) {
        this.lightAdapter = gan0Var;
    }

    public final void setListDate(@NotNull List<? extends BLiveVoiceGiftWallListDetail> newData) {
        newData.getClass();
        if (!vwb.m200296J(newData) && newData.size() >= 3) {
            gan0 gan0Var = this.allAdapter;
            if (gan0Var != null) {
                gan0Var.m125006H(newData.get(0).gifts);
            }
            gan0 gan0Var2 = this.lightAdapter;
            if (gan0Var2 != null) {
                gan0Var2.m125006H(newData.get(1).gifts);
            }
            gan0 gan0Var3 = this.darkAdapter;
            if (gan0Var3 != null) {
                gan0Var3.m125006H(newData.get(2).gifts);
            }
        }
        m76962b0();
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
