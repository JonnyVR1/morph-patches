package com.p046p1.mobile.putong.core.newui.supreme;

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
import com.p046p1.mobile.putong.core.newui.supreme.SupremeListViewModel;
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
import p149l.d1h0;
import p149l.d30;
import p149l.e30;
import p149l.jo0;
import p149l.l5b;
import p149l.mqi0;
import p149l.s7m;
import p149l.w9j;
import p149l.xdl0;
import p149l.yij0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u000f\u0010\u000b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\tJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0016\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0016\u0010\u0012J\u000f\u0010\u0017\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0017\u0010\tJ\u0011\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0007¢\u0006\u0004\b\u001f\u0010\tJ\u001d\u0010\"\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u001b2\u0006\u0010!\u001a\u00020\u001b¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u0007¢\u0006\u0004\b$\u0010\tJ\r\u0010%\u001a\u00020\u0007¢\u0006\u0004\b%\u0010\tJ\r\u0010&\u001a\u00020\u0007¢\u0006\u0004\b&\u0010\tJ#\u0010*\u001a\u00020\u00072\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'2\u0006\u0010!\u001a\u00020\u001b¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u001b¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\"\u00109\u001a\u0002028\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R\"\u0010A\u001a\u00020:8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\"\u0010I\u001a\u00020B8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\"\u0010Q\u001a\u00020J8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR\"\u0010Y\u001a\u00020R8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\"\u0010a\u001a\u00020Z8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010i\u001a\u00020b8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\"\u0010q\u001a\u00020j8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bk\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR\"\u0010x\u001a\u00020r8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0011\u0010s\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR\"\u0010\u007f\u001a\u00020y8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0014\u0010z\u001a\u0004\b{\u0010|\"\u0004\b}\u0010~R\u001d\u0010\u0085\u0001\u001a\u00030\u0080\u00018\u0006¢\u0006\u0010\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R'\u0010\u008a\u0001\u001a\u00020\u00028\u0006@\u0006X\u0086.¢\u0006\u0016\n\u0005\b0\u0010\u0086\u0001\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\"\u0005\b\u0089\u0001\u0010\u0015R'\u0010\u008d\u0001\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u0087\u0001\u0010\u008b\u0001\u001a\u0005\b\u0081\u0001\u0010-\"\u0005\b\u008c\u0001\u0010\u001eR'\u0010\u0091\u0001\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0006\b\u008e\u0001\u0010\u008b\u0001\u001a\u0005\b\u008f\u0001\u0010-\"\u0005\b\u0090\u0001\u0010\u001eR+\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0092\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0017\n\u0005\be\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001¨\u0006\u0099\u0001"}, m87232d2 = {"Lcom/p1/mobile/putong/core/newui/supreme/SupremeListViewModel;", "Ll/s7m;", "Lcom/p1/mobile/putong/core/newui/supreme/SupremeListPresenter;", "Lcom/p1/mobile/putong/core/newui/supreme/SupremeListFrag;", "frag", "<init>", "(Lcom/p1/mobile/putong/core/newui/supreme/SupremeListFrag;)V", "", "r", "()V", BaseSei.f13931Y, BaseSei.f13932Z, "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "Landroid/view/View;", "j", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "presenter", "k", "(Lcom/p1/mobile/putong/core/newui/supreme/SupremeListPresenter;)V", "inflateView", "destroy", "Landroid/content/Context;", "C0", "()Landroid/content/Context;", "", "show", "F", "(Z)V", "G", "hasIdealTypesSelected", "hasSupremePartner", "E", "(ZZ)V", b2s.C_ZONE, "I", "J", "", "Ll/l5b$a;", "users", "B", "(Ljava/util/List;Z)V", "A", "()Z", "a", "Lcom/p1/mobile/putong/core/newui/supreme/SupremeListFrag;", "m", "()Lcom/p1/mobile/putong/core/newui/supreme/SupremeListFrag;", "Lv/VFrame;", "b", "Lv/VFrame;", ResourceDirection.f38808v, "()Lv/VFrame;", "set_loading", "(Lv/VFrame;)V", "_loading", "Lv/VProgressBar;", "c", "Lv/VProgressBar;", "get_loading_progress", "()Lv/VProgressBar;", "set_loading_progress", "(Lv/VProgressBar;)V", "_loading_progress", "Landroid/widget/RelativeLayout;", Constants.INAPP_DATA_TAG, "Landroid/widget/RelativeLayout;", BaseSei.f13930X, "()Landroid/widget/RelativeLayout;", "set_rl_error_view", "(Landroid/widget/RelativeLayout;)V", "_rl_error_view", "Lv/VImage;", "e", "Lv/VImage;", "get_img_network_error", "()Lv/VImage;", "set_img_network_error", "(Lv/VImage;)V", "_img_network_error", "Lv/VText;", "f", "Lv/VText;", "get_tv_network_tips", "()Lv/VText;", "set_tv_network_tips", "(Lv/VText;)V", "_tv_network_tips", "Lv/VButton;", "g", "Lv/VButton;", "w", "()Lv/VButton;", "set_reload", "(Lv/VButton;)V", "_reload", "Lcom/p1/mobile/putong/core/newui/supreme/SupremeCountDownView;", "h", "Lcom/p1/mobile/putong/core/newui/supreme/SupremeCountDownView;", "p", "()Lcom/p1/mobile/putong/core/newui/supreme/SupremeCountDownView;", "set_countdown", "(Lcom/p1/mobile/putong/core/newui/supreme/SupremeCountDownView;)V", "_countdown", "Landroid/widget/FrameLayout;", RXScreenCaptureService.KEY_INDEX, "Landroid/widget/FrameLayout;", "q", "()Landroid/widget/FrameLayout;", "set_fl_content_layout", "(Landroid/widget/FrameLayout;)V", "_fl_content_layout", "Lv/VPullUpRecyclerView;", "Lv/VPullUpRecyclerView;", "u", "()Lv/VPullUpRecyclerView;", "set_list", "(Lv/VPullUpRecyclerView;)V", "_list", "Landroid/widget/TextView;", "Landroid/widget/TextView;", BLiveStormDanmakuGiftResourceType.f44446s, "()Landroid/widget/TextView;", "set_get_privilege", "(Landroid/widget/TextView;)V", "_get_privilege", "Lcom/p1/mobile/android/app/Act;", BLiveStormDanmakuGiftResourceType.f44444l, "Lcom/p1/mobile/android/app/Act;", "getAct", "()Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/newui/supreme/SupremeListPresenter;", "n", "()Lcom/p1/mobile/putong/core/newui/supreme/SupremeListPresenter;", "H", "supremePresenter", "Z", "setEnableScroll", "enableScroll", "o", "getFirstMVReported", "setFirstMVReported", "firstMVReported", "Ll/c4g0;", "Ll/c4g0;", "getCountDown", "()Ll/c4g0;", "setCountDown", "(Ll/c4g0;)V", "countDown", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class SupremeListViewModel implements s7m<SupremeListPresenter> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final SupremeListFrag frag;

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
    public SupremeCountDownView _countdown;

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
    public SupremeListPresenter supremePresenter;

    /* JADX INFO: renamed from: n, reason: from kotlin metadata */
    public boolean enableScroll;

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    public boolean firstMVReported;

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @Nullable
    public c4g0 countDown;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.supreme.SupremeListViewModel$a */
    @Metadata(m87231d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m87232d2 = {"com/p1/mobile/putong/core/newui/supreme/SupremeListViewModel$a", "Landroidx/recyclerview/widget/GridLayoutManager$c;", "", "position", "f", "(I)I", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C8240a extends GridLayoutManager.AbstractC0553c {

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ SupremeListViewModel$initRecyclerView$1$1 f26848b;

        public C8240a(SupremeListViewModel$initRecyclerView$1$1 supremeListViewModel$initRecyclerView$1$1) {
            this.f26848b = supremeListViewModel$initRecyclerView$1$1;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager.AbstractC0553c
        /* JADX INFO: renamed from: f */
        public int mo3329f(int position) {
            int itemViewType = SupremeListViewModel.this.getFrag().m43612S4().getItemViewType(position);
            if (itemViewType == 0 || itemViewType == 2) {
                return m3317m();
            }
            return 1;
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.supreme.SupremeListViewModel$b */
    @Metadata(m87231d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J'\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, m87232d2 = {"com/p1/mobile/putong/core/newui/supreme/SupremeListViewModel$b", "Lcom/p1/mobile/putong/core/newui/supreme/a$b;", "Ll/l5b$a;", "supremeSuggestData", "", Constants.INAPP_POSITION, "", "hasSupremePartner", "", "a", "(Ll/l5b$a;IZ)V", "member_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C8241b implements C8242a.b {
        public C8241b() {
        }

        @Override // com.p046p1.mobile.putong.core.newui.supreme.C8242a.b
        /* JADX INFO: renamed from: a */
        public void mo43666a(l5b.C18151a supremeSuggestData, int pos, boolean hasSupremePartner) {
            supremeSuggestData.getClass();
            SupremeListViewModel.this.m43658n().m43630n0(supremeSuggestData, hasSupremePartner);
        }
    }

    public SupremeListViewModel(@NotNull SupremeListFrag supremeListFrag) {
        supremeListFrag.getClass();
        this.frag = supremeListFrag;
        Act act = supremeListFrag.act();
        act.getClass();
        this.act = act;
    }

    /* JADX INFO: renamed from: a */
    public static void m43635a(SupremeListViewModel supremeListViewModel) {
        supremeListViewModel.m43658n().m43632p0();
    }

    /* JADX INFO: renamed from: b */
    public static Unit m43636b(SupremeListViewModel supremeListViewModel, Long l2) {
        if (l2.longValue() < 1000) {
            supremeListViewModel.m43653J();
        } else {
            supremeListViewModel.m43659p().m43597b(l2.longValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: renamed from: c */
    public static void m43637c(Function1 function1, Object obj) {
        function1.invoke(obj);
    }

    /* JADX INFO: renamed from: d */
    public static void m43638d(SupremeListViewModel supremeListViewModel, View view) {
        zvf0.m220396r("e_supremepartner_apply", supremeListViewModel.frag.pageId());
        supremeListViewModel.m43658n().m43633q0();
    }

    /* JADX INFO: renamed from: e */
    public static void m43639e(SupremeListViewModel supremeListViewModel, View view) {
        supremeListViewModel.m43658n().m43634r0();
    }

    /* JADX INFO: renamed from: f */
    public static Long m43640f(Long l2) {
        return Long.valueOf(mqi0.m155948s(0, 0, 1));
    }

    /* JADX INFO: renamed from: i */
    public static Long m43641i(Function1 function1, Object obj) {
        return (Long) function1.invoke(obj);
    }

    /* JADX INFO: renamed from: r */
    private final void m43642r() {
        m43644z();
        m43643y();
    }

    /* JADX INFO: renamed from: y */
    private final void m43643y() {
        xdl0.m208329E0(m43664w(), new View.OnClickListener() { // from class: l.w0h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SupremeListViewModel.m43639e(this.f183918a, view);
            }
        });
        xdl0.m208329E0(m43661s(), new View.OnClickListener() { // from class: l.x0h0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SupremeListViewModel.m43638d(this.f188970a, view);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.RecyclerView$o, com.p1.mobile.putong.core.newui.supreme.SupremeListViewModel$initRecyclerView$1$1] */
    /* JADX INFO: renamed from: z */
    private final void m43644z() {
        VPullUpRecyclerView vPullUpRecyclerViewM43662u = m43662u();
        final Act act = this.frag.act();
        ?? r2 = new GridLayoutManager(act) { // from class: com.p1.mobile.putong.core.newui.supreme.SupremeListViewModel$initRecyclerView$1$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.AbstractC0577o
            public boolean canScrollVertically() {
                return this.f26850j.getEnableScroll();
            }
        };
        r2.m3326v(new C8240a(r2));
        vPullUpRecyclerViewM43662u.setLayoutManager(r2);
        vPullUpRecyclerViewM43662u.setAdapter(this.frag.m43612S4());
        this.frag.m43612S4().m43679J(new C8241b());
    }

    /* JADX INFO: renamed from: A */
    public final boolean m43645A() {
        return xdl0.m208349O0(m43661s());
    }

    /* JADX INFO: renamed from: B */
    public final void m43646B(@NotNull List<? extends l5b.C18151a> users, boolean hasSupremePartner) {
        users.getClass();
        m43649F(false);
        xdl0.m208344M(m43661s(), !hasSupremePartner);
        if (!this.firstMVReported && !hasSupremePartner) {
            this.firstMVReported = true;
            zvf0.m220402x("e_supremepartner_apply", this.frag.pageId());
        }
        this.enableScroll = hasSupremePartner;
        this.frag.m43612S4().m43677H(users, hasSupremePartner);
    }

    /* JADX INFO: renamed from: C */
    public final void m43647C() {
        m43663v().setVisibility(8);
        m43665x().setVisibility(8);
        m43660q().setVisibility(8);
        m43659p().setVisibility(0);
        m43652I();
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.act;
    }

    /* JADX INFO: renamed from: E */
    public final void m43648E(boolean hasIdealTypesSelected, boolean hasSupremePartner) {
        m43663v().setVisibility(8);
        m43665x().setVisibility(8);
        m43659p().setVisibility(8);
        m43660q().setVisibility(0);
        this.frag.m43612S4().m43678I(hasIdealTypesSelected);
        xdl0.m208344M(m43661s(), !hasSupremePartner);
        if (!this.firstMVReported && !hasSupremePartner) {
            this.firstMVReported = true;
            zvf0.m220402x("e_supremepartner_apply", this.frag.pageId());
        }
        m43653J();
    }

    /* JADX INFO: renamed from: F */
    public final void m43649F(boolean show) {
        m43659p().setVisibility(8);
        m43665x().setVisibility(8);
        if (show) {
            m43663v().setVisibility(0);
            m43660q().setVisibility(8);
        } else {
            m43663v().setVisibility(8);
            m43660q().setVisibility(0);
        }
        m43653J();
    }

    /* JADX INFO: renamed from: G */
    public final void m43650G() {
        m43663v().setVisibility(8);
        m43665x().setVisibility(0);
        m43660q().setVisibility(8);
        m43659p().setVisibility(8);
        m43653J();
    }

    /* JADX INFO: renamed from: H */
    public final void m43651H(@NotNull SupremeListPresenter supremeListPresenter) {
        supremeListPresenter.getClass();
        this.supremePresenter = supremeListPresenter;
    }

    /* JADX INFO: renamed from: I */
    public final void m43652I() {
        m43659p().m43597b(mqi0.m155948s(0, 0, 1));
        if (this.countDown == null) {
            C22306c c22306cOnBackpressureLatest = this.act.duringCreated(C22306c.interval(1L, TimeUnit.SECONDS)).onBackpressureLatest();
            final Function1 function1 = new Function1() { // from class: l.y0h0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SupremeListViewModel.m43640f((Long) obj);
                }
            };
            C22306c c22306cObserveOn = c22306cOnBackpressureLatest.map(new w9j() { // from class: l.z0h0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return SupremeListViewModel.m43641i(function1, obj);
                }
            }).doOnUnsubscribe(new d30() { // from class: l.a1h0
                @Override // p149l.d30
                public final void call() {
                    SupremeListViewModel.m43635a(this.f67182a);
                }
            }).observeOn(jo0.m142408a());
            final Function1 function2 = new Function1() { // from class: l.b1h0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return SupremeListViewModel.m43636b(this.f72598a, (Long) obj);
                }
            };
            this.countDown = c22306cObserveOn.subscribe(new e30() { // from class: l.c1h0
                @Override // p149l.e30
                public final void call(Object obj) {
                    SupremeListViewModel.m43637c(function2, obj);
                }
            });
        }
    }

    /* JADX INFO: renamed from: J */
    public final void m43653J() {
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
        View viewM43654j = m43654j(inflater, parent);
        m43642r();
        return viewM43654j;
    }

    @NotNull
    /* JADX INFO: renamed from: j */
    public final View m43654j(@NotNull LayoutInflater inflater, @Nullable ViewGroup parent) {
        inflater.getClass();
        View viewM109613b = d1h0.m109613b(this, inflater, parent);
        viewM109613b.getClass();
        return viewM109613b;
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(@NotNull SupremeListPresenter presenter) {
        presenter.getClass();
        m43651H(presenter);
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getEnableScroll() {
        return this.enableScroll;
    }

    @NotNull
    /* JADX INFO: renamed from: m, reason: from getter */
    public final SupremeListFrag getFrag() {
        return this.frag;
    }

    @NotNull
    /* JADX INFO: renamed from: n */
    public final SupremeListPresenter m43658n() {
        SupremeListPresenter supremeListPresenter = this.supremePresenter;
        if (supremeListPresenter != null) {
            return supremeListPresenter;
        }
        Intrinsics.m87502r("supremePresenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: p */
    public final SupremeCountDownView m43659p() {
        SupremeCountDownView supremeCountDownView = this._countdown;
        if (supremeCountDownView != null) {
            return supremeCountDownView;
        }
        Intrinsics.m87502r("_countdown");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: q */
    public final FrameLayout m43660q() {
        FrameLayout frameLayout = this._fl_content_layout;
        if (frameLayout != null) {
            return frameLayout;
        }
        Intrinsics.m87502r("_fl_content_layout");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: s */
    public final TextView m43661s() {
        TextView textView = this._get_privilege;
        if (textView != null) {
            return textView;
        }
        Intrinsics.m87502r("_get_privilege");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: u */
    public final VPullUpRecyclerView m43662u() {
        VPullUpRecyclerView vPullUpRecyclerView = this._list;
        if (vPullUpRecyclerView != null) {
            return vPullUpRecyclerView;
        }
        Intrinsics.m87502r("_list");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: v */
    public final VFrame m43663v() {
        VFrame vFrame = this._loading;
        if (vFrame != null) {
            return vFrame;
        }
        Intrinsics.m87502r("_loading");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: w */
    public final VButton m43664w() {
        VButton vButton = this._reload;
        if (vButton != null) {
            return vButton;
        }
        Intrinsics.m87502r("_reload");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: x */
    public final RelativeLayout m43665x() {
        RelativeLayout relativeLayout = this._rl_error_view;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        Intrinsics.m87502r("_rl_error_view");
        return null;
    }
}
