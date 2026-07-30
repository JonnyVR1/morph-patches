package com.p046p1.mobile.putong.core.newui.customized.result;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import com.clevertap.android.sdk.Constants;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.core.newui.customized.result.PrivateCustomResultListViewModel;
import com.p046p1.mobile.putong.data.ResourceDirection;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tencent.open.SocialConstants;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p133rx.C22306c;
import p147v.VButton;
import p147v.VFrame;
import p147v.VImage;
import p147v.VProgressBar;
import p147v.VPullUpRecyclerView;
import p147v.VText;
import p149l.b2s;
import p149l.c4g0;
import p149l.d30;
import p149l.e30;
import p149l.fs80;
import p149l.jo0;
import p149l.mma;
import p149l.mqi0;
import p149l.s7m;
import p149l.w9j;
import p149l.xdl0;
import p149l.xr80;
import p149l.yij0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\tJ\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\tJ\u001d\u0010\"\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0007¢\u0006\u0004\b$\u0010\tJ\r\u0010%\u001a\u00020\u0007¢\u0006\u0004\b%\u0010\tJ\r\u0010&\u001a\u00020\u0007¢\u0006\u0004\b&\u0010\tJ#\u0010+\u001a\u00020\u00072\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010*\u001a\u00020\u001b¢\u0006\u0004\b+\u0010,J\r\u0010-\u001a\u00020\u001b¢\u0006\u0004\b-\u0010.R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\"\u0010:\u001a\u0002038\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\"\u0010B\u001a\u00020;8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\"\u0010J\u001a\u00020C8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010R\u001a\u00020K8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\"\u0010Z\u001a\u00020S8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bT\u0010U\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010b\u001a\u00020[8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR\"\u0010j\u001a\u00020c8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR\"\u0010r\u001a\u00020k8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\"\u0010y\u001a\u00020s8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR#\u0010\u0080\u0001\u001a\u00020z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR\u001d\u0010\u0086\u0001\u001a\u00030\u0081\u00018\u0006¢\u0006\u0010\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001R'\u0010\u008b\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0005\b1\u0010\u0087\u0001\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0005\b\u008a\u0001\u0010\u0015R'\u0010\u008e\u0001\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u0088\u0001\u0010\u008c\u0001\u001a\u0005\b\u0082\u0001\u0010.\"\u0005\b\u008d\u0001\u0010\u001eR,\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b\u0090\u0001\u0010\u0091\u0001\u001a\u0006\b\u0092\u0001\u0010\u0093\u0001\"\u0006\b\u0094\u0001\u0010\u0095\u0001¨\u0006\u0097\u0001"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListViewModel;", "Ll/s7m;", "Ll/xr80;", "Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListFrag;)V", "", "r", "()V", BaseSei.f13932Z, "A", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "j", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "k", "(Ll/xr80;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "", "show", "G", "(Z)V", "H", "hasIdealTypesSelected", "hasSupremePartner", "F", "(ZZ)V", "E", "J", "K", "", "Ll/mma$a;", "users", "hasPrivateCustomPrivilege", b2s.C_ZONE, "(Ljava/util/List;Z)V", "B", "()Z", "a", "Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListFrag;", "m", "()Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListFrag;", "Lv/VFrame;", "b", "Lv/VFrame;", ResourceDirection.f38808v, "()Lv/VFrame;", "set_loading", "(Lv/VFrame;)V", "_loading", "Lv/VProgressBar;", "c", "Lv/VProgressBar;", "w", "()Lv/VProgressBar;", "set_loading_progress", "(Lv/VProgressBar;)V", "_loading_progress", "Landroid/widget/RelativeLayout;", Constants.INAPP_DATA_TAG, "Landroid/widget/RelativeLayout;", BaseSei.f13931Y, "()Landroid/widget/RelativeLayout;", "set_rl_error_view", "(Landroid/widget/RelativeLayout;)V", "_rl_error_view", "Lv/VImage;", "e", "Lv/VImage;", "get_img_network_error", "()Lv/VImage;", "set_img_network_error", "(Lv/VImage;)V", "_img_network_error", "Lv/VText;", "f", "Lv/VText;", "get_tv_network_tips", "()Lv/VText;", "set_tv_network_tips", "(Lv/VText;)V", "_tv_network_tips", "Lv/VButton;", "g", "Lv/VButton;", BaseSei.f13930X, "()Lv/VButton;", "set_reload", "(Lv/VButton;)V", "_reload", "Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultCountDownView;", "h", "Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultCountDownView;", "p", "()Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultCountDownView;", "set_countdown", "(Lcom/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultCountDownView;)V", "_countdown", "Landroid/widget/FrameLayout;", RXScreenCaptureService.KEY_INDEX, "Landroid/widget/FrameLayout;", "q", "()Landroid/widget/FrameLayout;", "set_fl_content_layout", "(Landroid/widget/FrameLayout;)V", "_fl_content_layout", "Lv/VPullUpRecyclerView;", "Lv/VPullUpRecyclerView;", "u", "()Lv/VPullUpRecyclerView;", "set_list", "(Lv/VPullUpRecyclerView;)V", "_list", "Landroid/widget/TextView;", "Landroid/widget/TextView;", BLiveStormDanmakuGiftResourceType.f44446s, "()Landroid/widget/TextView;", "set_get_privilege", "(Landroid/widget/TextView;)V", "_get_privilege", "Lcom/p1/mobile/android/app/Act;", BLiveStormDanmakuGiftResourceType.f44444l, "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Ll/xr80;", "n", "()Ll/xr80;", "I", "privateCustomPresenter", "Z", "setEnableScroll", "enableScroll", "Ll/c4g0;", "o", "Ll/c4g0;", "getCountDown", "()Ll/c4g0;", "setCountDown", "(Ll/c4g0;)V", "countDown", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class PrivateCustomResultListViewModel implements s7m<xr80> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final PrivateCustomResultListFrag frag;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    public VFrame _loading;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    public VProgressBar _loading_progress;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public RelativeLayout _rl_error_view;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VImage _img_network_error;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VText _tv_network_tips;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public VButton _reload;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public PrivateCustomResultCountDownView _countdown;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public FrameLayout _fl_content_layout;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VPullUpRecyclerView _list;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public TextView _get_privilege;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @NotNull
    public final Act act;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    public xr80 privateCustomPresenter;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public boolean enableScroll;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @Nullable
    public c4g0 countDown;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.customized.result.PrivateCustomResultListViewModel$a */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m87232d2 = {"com/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListViewModel$a", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "position", "f", "(I)I", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C7837a extends GridLayoutManager.AbstractC0553c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ PrivateCustomResultListViewModel$initRecyclerView$1$1 f21329b;

        public C7837a(PrivateCustomResultListViewModel$initRecyclerView$1$1 privateCustomResultListViewModel$initRecyclerView$1$1) {
            this.f21329b = privateCustomResultListViewModel$initRecyclerView$1$1;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int position) {
            int itemViewType = PrivateCustomResultListViewModel.this.getFrag().m36209U4().getItemViewType(position);
            if (itemViewType == 0 || itemViewType == 2) {
                return m3317m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.customized.result.PrivateCustomResultListViewModel$b */
    @Metadata(m87231d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"com/p1/mobile/putong/core/newui/customized/result/PrivateCustomResultListViewModel$b", "Lcom/p1/mobile/putong/core/newui/customized/result/a$b;", "Ll/mma$a;", "privateCustomSuggestData", "", Constants.INAPP_POSITION, "", "hasPrivateCustomPrivilege", "", "a", "(Ll/mma$a;IZ)V", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C7838b implements C7839a.b {
        public C7838b() {
        }

        @Override // com.p046p1.mobile.putong.core.newui.customized.result.C7839a.b
        /* JADX INFO: renamed from: a */
        public void mo36251a(mma.C18499a privateCustomSuggestData, int pos, boolean hasPrivateCustomPrivilege) {
            privateCustomSuggestData.getClass();
            PrivateCustomResultListViewModel.this.m36241n().m210666x0(privateCustomSuggestData, hasPrivateCustomPrivilege);
        }
    }

    public PrivateCustomResultListViewModel(@NotNull PrivateCustomResultListFrag privateCustomResultListFrag) {
        privateCustomResultListFrag.getClass();
        this.frag = privateCustomResultListFrag;
        Act act = privateCustomResultListFrag.act();
        act.getClass();
        this.act = act;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView$o, com.p1.mobile.putong.core.newui.customized.result.PrivateCustomResultListViewModel$initRecyclerView$1$1] */
    /* JADX INFO: renamed from: A */
    private final void m36219A() {
        VPullUpRecyclerView vPullUpRecyclerViewM36245u = m36245u();
        final Act act = this.frag.act();
        ?? r2 = new GridLayoutManager(act) { // from class: com.p1.mobile.putong.core.newui.customized.result.PrivateCustomResultListViewModel$initRecyclerView$1$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
            public boolean canScrollVertically() {
                return this.f21331j.getEnableScroll();
            }
        };
        r2.m3326v(new C7837a(r2));
        vPullUpRecyclerViewM36245u.setLayoutManager(r2);
        vPullUpRecyclerViewM36245u.setAdapter(this.frag.m36209U4());
        this.frag.m36209U4().m36261J(new C7838b());
    }

    /* JADX INFO: renamed from: a */
    public static void m36220a(PrivateCustomResultListViewModel privateCustomResultListViewModel) {
        privateCustomResultListViewModel.m36241n().m210668z0();
    }

    /* JADX INFO: renamed from: b */
    public static void m36221b(PrivateCustomResultListViewModel privateCustomResultListViewModel, View view) {
        zvf0.m220396r("e_personalized_button", privateCustomResultListViewModel.frag.pageId());
        xr80.m210646D0(privateCustomResultListViewModel.m36241n(), null, 1, null);
    }

    /* JADX INFO: renamed from: c */
    public static void m36222c(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d */
    public static Unit m36223d(PrivateCustomResultListViewModel privateCustomResultListViewModel, Long l2) {
        if (l2.longValue() < 1000) {
            privateCustomResultListViewModel.m36236K();
        } else {
            privateCustomResultListViewModel.m36242p().m36202b(l2.longValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: e */
    public static Long m36224e(Long l2) {
        return Long.valueOf(mqi0.m155948s(0, 0, 1));
    }

    /* JADX INFO: renamed from: f */
    public static void m36225f(PrivateCustomResultListViewModel privateCustomResultListViewModel, View view) {
        privateCustomResultListViewModel.m36241n().m210663A0();
    }

    /* JADX INFO: renamed from: i */
    public static Long m36226i(Function1 function1, Object obj) {
        return (Long) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r */
    private final void m36227r() {
        m36219A();
        m36250z();
    }

    /* JADX INFO: renamed from: B */
    public final boolean m36228B() {
        return this._loading != null;
    }

    /* JADX INFO: renamed from: C */
    public final void m36229C(@NotNull List<? extends mma.C18499a> users, boolean hasPrivateCustomPrivilege) {
        users.getClass();
        m36232G(false);
        xdl0.m208344M(m36244s(), !hasPrivateCustomPrivilege);
        this.enableScroll = hasPrivateCustomPrivilege;
        this.frag.m36209U4().m36259H(users, hasPrivateCustomPrivilege);
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    /* JADX INFO: renamed from: E */
    public final void m36230E() {
        m36246v().setVisibility(8);
        m36249y().setVisibility(8);
        m36243q().setVisibility(8);
        m36242p().setVisibility(0);
        m36235J();
    }

    /* JADX INFO: renamed from: F */
    public final void m36231F(boolean hasIdealTypesSelected, boolean hasSupremePartner) {
        m36246v().setVisibility(8);
        m36249y().setVisibility(8);
        m36242p().setVisibility(8);
        m36243q().setVisibility(0);
        this.frag.m36209U4().m36260I(hasIdealTypesSelected);
        xdl0.m208344M(m36244s(), !hasSupremePartner);
        m36236K();
    }

    /* JADX INFO: renamed from: G */
    public final void m36232G(boolean show) {
        m36242p().setVisibility(8);
        m36249y().setVisibility(8);
        if (show) {
            m36246v().setVisibility(0);
            m36247w().setVisibility(0);
            m36243q().setVisibility(8);
        } else {
            m36246v().setVisibility(8);
            m36243q().setVisibility(0);
        }
        m36236K();
    }

    /* JADX INFO: renamed from: H */
    public final void m36233H() {
        m36246v().setVisibility(8);
        m36249y().setVisibility(0);
        m36243q().setVisibility(8);
        m36242p().setVisibility(8);
        m36236K();
    }

    /* JADX INFO: renamed from: I */
    public final void m36234I(@NotNull xr80 xr80Var) {
        xr80Var.getClass();
        this.privateCustomPresenter = xr80Var;
    }

    /* JADX INFO: renamed from: J */
    public final void m36235J() {
        m36242p().m36202b(mqi0.m155948s(0, 0, 1));
        if (this.countDown == null) {
            C22306c c22306cOnBackpressureLatest = this.act.duringCreated(C22306c.interval(1L, TimeUnit.SECONDS)).onBackpressureLatest();
            final Function1 function1 = new Function1() { // from class: l.as80
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PrivateCustomResultListViewModel.m36224e((Long) obj);
                }
            };
            C22306c c22306cObserveOn = c22306cOnBackpressureLatest.map(new w9j() { // from class: l.bs80
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return PrivateCustomResultListViewModel.m36226i(function1, obj);
                }
            }).doOnUnsubscribe(new d30() { // from class: l.cs80
                @Override // p149l.d30
                public final void call() {
                    PrivateCustomResultListViewModel.m36220a(this.f82332a);
                }
            }).observeOn(jo0.m142408a());
            final Function1 function2 = new Function1() { // from class: l.ds80
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return PrivateCustomResultListViewModel.m36223d(this.f87732a, (Long) obj);
                }
            };
            this.countDown = c22306cObserveOn.subscribe(new e30() { // from class: l.es80
                @Override // p149l.e30
                public final void call(Object obj) {
                    PrivateCustomResultListViewModel.m36222c(function2, obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: K */
    public final void m36236K() {
        yij0.m214943U(this.countDown);
        this.countDown = null;
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    @Override // p149l.s7m
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM36237j = m36237j(inflater, parent);
        m36227r();
        return viewM36237j;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final View m36237j(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM122922b = fs80.m122922b(this, inflater, parent);
        viewM122922b.getClass();
        return viewM122922b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull xr80 presenter) {
        presenter.getClass();
        m36234I(presenter);
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getEnableScroll() {
        return this.enableScroll;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final PrivateCustomResultListFrag getFrag() {
        return this.frag;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final xr80 m36241n() {
        xr80 xr80Var = this.privateCustomPresenter;
        if (xr80Var != null) {
            return xr80Var;
        }
        Intrinsics.m87502r("privateCustomPresenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final PrivateCustomResultCountDownView m36242p() {
        PrivateCustomResultCountDownView privateCustomResultCountDownView = this._countdown;
        if (privateCustomResultCountDownView != null) {
            return privateCustomResultCountDownView;
        }
        Intrinsics.m87502r("_countdown");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final FrameLayout m36243q() {
        FrameLayout frameLayout = this._fl_content_layout;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_fl_content_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final TextView m36244s() {
        TextView textView = this._get_privilege;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final VPullUpRecyclerView m36245u() {
        VPullUpRecyclerView vPullUpRecyclerView = this._list;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.m87502r("_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VFrame m36246v() {
        VFrame vFrame = this._loading;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_loading");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final VProgressBar m36247w() {
        VProgressBar vProgressBar = this._loading_progress;
        if (vProgressBar != null) {
            return vProgressBar;
        }
        Intrinsics.m87502r("_loading_progress");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final VButton m36248x() {
        VButton vButton = this._reload;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m87502r("_reload");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: y */
    public final RelativeLayout m36249y() {
        RelativeLayout relativeLayout = this._rl_error_view;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.m87502r("_rl_error_view");
        return null;
    }

    /* JADX INFO: renamed from: z */
    public final void m36250z() {
        xdl0.m208329E0(m36248x(), new View.OnClickListener() { // from class: l.yr80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivateCustomResultListViewModel.m36225f(this.f199645a, view);
            }
        });
        xdl0.m208329E0(m36244s(), new View.OnClickListener() { // from class: l.zr80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PrivateCustomResultListViewModel.m36221b(this.f204463a, view);
            }
        });
    }
}
