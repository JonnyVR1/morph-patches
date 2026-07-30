package com.p046p1.mobile.putong.live.livingroom.voice.membermanager.online;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC0616v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.p046p1.mobile.putong.data.OMSTemplateModeType;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.live.base.data.BLiveMember;
import com.p046p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p046p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import com.p046p1.mobile.putong.live.livingroom.R$string;
import com.p046p1.mobile.putong.live.livingroom.voice.membermanager.online.MemberOnLinePageView;
import com.p069ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
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
import p147v.smart_refresh.SmartRefreshLayout;
import p147v.smart_refresh.footer.TTRefreshFooter;
import p147v.smart_refresh.header.TTRefreshHeader;
import p149l.alk0;
import p149l.df50;
import p149l.e30;
import p149l.ecy;
import p149l.fcy;
import p149l.hnc0;
import p149l.i3c0;
import p149l.i5o0;
import p149l.jby;
import p149l.lsi0;
import p149l.lyn0;
import p149l.me50;
import p149l.mqv;
import p149l.nnn0;
import p149l.rsm0;
import p149l.t6c0;
import p149l.u4n0;
import p149l.vwb;
import p149l.w8u;
import p149l.xdl0;
import p149l.yby;
import p149l.ypv;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 k2\u00020\u0001:\u0001lB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0013\u0010\u000eJ!\u0010\u0018\u001a\u00020\n2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u000eJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010#\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u000f¢\u0006\u0004\b%\u0010&R\"\u0010-\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010Q\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u00100\u001a\u0004\bO\u00102\"\u0004\bP\u00104R\"\u0010U\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u00108\u001a\u0004\bS\u0010:\"\u0004\bT\u0010<R\"\u0010]\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010e\u001a\u0004\u0018\u00010^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR,\u0010\u0017\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010\u0019¨\u0006m"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/online/MemberOnLinePageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "m0", "(Landroid/view/View;)V", "q0", "()V", "", "isShow", "n0", "(Z)V", "onFinishInflate", "Ll/ecy;", "Ll/nnn0;", "Ll/fcy;", "presenter", "r0", "(Ll/ecy;)V", "p0", "Ll/lyn0;", "voiceMemberInfo", "setMemberData", "(Ll/lyn0;)V", "", "userId", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCallInvite;", "invite", "v0", "(Ljava/lang/String;Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCallInvite;)V", "u0", "()Z", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/online/MemberOnLinePageView;", "get_rootView", "()Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/online/MemberOnLinePageView;", "set_rootView", "(Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/online/MemberOnLinePageView;)V", "_rootView", "Lv/VLinear;", "e", "Lv/VLinear;", "get_share_root", "()Lv/VLinear;", "set_share_root", "(Lv/VLinear;)V", "_share_root", "Lv/VImage;", "f", "Lv/VImage;", "get_share_root_share_go", "()Lv/VImage;", "set_share_root_share_go", "(Lv/VImage;)V", "_share_root_share_go", "Lv/smart_refresh/SmartRefreshLayout;", "g", "Lv/smart_refresh/SmartRefreshLayout;", "get_refresh_layout", "()Lv/smart_refresh/SmartRefreshLayout;", "set_refresh_layout", "(Lv/smart_refresh/SmartRefreshLayout;)V", "_refresh_layout", "Lv/VRecyclerView;", "h", "Lv/VRecyclerView;", "get_recyclerView", "()Lv/VRecyclerView;", "set_recyclerView", "(Lv/VRecyclerView;)V", "_recyclerView", RXScreenCaptureService.KEY_INDEX, "get_empty", "set_empty", "_empty", "j", "get_empty_icon", "set_empty_icon", "_empty_icon", "Lv/VText;", "k", "Lv/VText;", "get_empty_text", "()Lv/VText;", "set_empty_text", "(Lv/VText;)V", "_empty_text", "Ll/jby;", BLiveStormDanmakuGiftResourceType.f44444l, "Ll/jby;", "getManagerListAdapter", "()Ll/jby;", "setManagerListAdapter", "(Ll/jby;)V", "managerListAdapter", "m", "Ll/ecy;", "getPresenter", "()Ll/ecy;", "setPresenter", "Companion", "a", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class MemberOnLinePageView extends ConstraintLayout {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public MemberOnLinePageView _rootView;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    public VLinear _share_root;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    public VImage _share_root_share_go;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    public SmartRefreshLayout _refresh_layout;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public VRecyclerView _recyclerView;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public VLinear _empty;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    public VImage _empty_icon;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    public VText _empty_text;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    @Nullable
    public jby managerListAdapter;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public ecy<?, ?> presenter;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.membermanager.online.MemberOnLinePageView$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/online/MemberOnLinePageView$a;", "", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/online/MemberOnLinePageView;", "a", "(Landroid/view/LayoutInflater;)Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/online/MemberOnLinePageView;", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final MemberOnLinePageView m78644a(@NotNull LayoutInflater inflater) {
            inflater.getClass();
            View viewInflate = inflater.inflate(t6c0.f168179S3, (ViewGroup) null, false);
            viewInflate.getClass();
            return (MemberOnLinePageView) viewInflate;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.membermanager.online.MemberOnLinePageView$b */
    @Metadata(m87231d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m87232d2 = {"com/p1/mobile/putong/live/livingroom/voice/membermanager/online/MemberOnLinePageView$b", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "livingroom_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class C13044b extends RecyclerView.AbstractC0582t {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ ecy<nnn0, fcy> f53717a;

        public C13044b(ecy<nnn0, fcy> ecyVar) {
            this.f53717a = ecyVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0582t
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            recyclerView.getClass();
            if (newState != 0 || recyclerView.canScrollVertically(1) || recyclerView.getAdapter() == null) {
                return;
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            adapter.getClass();
            if (adapter.getItemCount() == this.f53717a.m206027E2().f108764u && this.f53717a.m206027E2().mo149813j().isNormalLive()) {
                lsi0.m151580j(w8u.m202218u(R$string.f47428o7, Integer.valueOf(this.f53717a.m206027E2().f108764u)));
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    @JvmOverloads
    public MemberOnLinePageView(@NotNull Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
        context.getClass();
    }

    /* JADX INFO: renamed from: i0 */
    public static void m78630i0(MemberOnLinePageView memberOnLinePageView, View view) {
        ecy<?, ?> ecyVar = memberOnLinePageView.presenter;
        if (ecyVar != null) {
            i5o0.m134517b(ecyVar);
            ecyVar.m206028F2().VoiceVirtualLiveEvent.openSharePanelDialog().m172467p();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static void m78631j0(MemberOnLinePageView memberOnLinePageView, String str) {
        nnn0 nnn0Var;
        ecy<?, ?> ecyVar = memberOnLinePageView.presenter;
        u4n0.m191752k(memberOnLinePageView.presenter, (ecyVar == null || (nnn0Var = (nnn0) ecyVar.m206027E2()) == null) ? null : nnn0Var.m132140j0(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public static void m78632k0(MemberOnLinePageView memberOnLinePageView, mqv mqvVar) {
        mqvVar.getClass();
        BLiveVoiceCall bLiveVoiceCallM156006i = mqvVar.m156006i();
        if (alk0.m97309h(bLiveVoiceCallM156006i)) {
            u4n0.m191748g(memberOnLinePageView.presenter, bLiveVoiceCallM156006i, "voice-manager");
            if (memberOnLinePageView.m78642u0()) {
                rsm0.m180712t();
                return;
            } else {
                rsm0.m180713u();
                return;
            }
        }
        if (Intrinsics.m87488d(BLiveMember.STATUS_INVITE_CAN_INVITE, ((BLiveMember) mqvVar.f135304a).inviteStatus)) {
            if (NullChecker.m81303a(bLiveVoiceCallM156006i)) {
                ecy<?, ?> ecyVar = memberOnLinePageView.presenter;
                if (ecyVar != null) {
                    ecyVar.m115771d4(bLiveVoiceCallM156006i.user);
                }
            } else {
                User userM156005h = mqvVar.m156005h();
                if (userM156005h == null) {
                    return;
                }
                ecy<?, ?> ecyVar2 = memberOnLinePageView.presenter;
                if (ecyVar2 != null) {
                    ecyVar2.m115771d4(userM156005h.f56011id);
                }
            }
            if (memberOnLinePageView.m78642u0()) {
                rsm0.m180714v();
            } else {
                rsm0.m180715w();
            }
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: o0 */
    public static final MemberOnLinePageView m78634o0(@NotNull LayoutInflater layoutInflater) {
        return INSTANCE.m78644a(layoutInflater);
    }

    /* JADX INFO: renamed from: q0 */
    private final void m78635q0() {
        this.managerListAdapter = new jby(this.presenter, new e30() { // from class: l.wby
            @Override // p149l.e30
            public final void call(Object obj) {
                MemberOnLinePageView.m78631j0(this.f185629a, (String) obj);
            }
        }, new e30() { // from class: l.xby
            @Override // p149l.e30
            public final void call(Object obj) {
                MemberOnLinePageView.m78632k0(this.f191972a, (mqv) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public static final void m78636s0(ecy ecyVar, hnc0 hnc0Var) {
        hnc0Var.getClass();
        ecyVar.mo115769V3();
    }

    /* JADX INFO: renamed from: t0 */
    public static final void m78637t0(ecy ecyVar, hnc0 hnc0Var) {
        hnc0Var.getClass();
        ecyVar.mo115768U3();
    }

    @Nullable
    public final jby getManagerListAdapter() {
        return this.managerListAdapter;
    }

    @Nullable
    public final ecy<?, ?> getPresenter() {
        return this.presenter;
    }

    @NotNull
    public final VLinear get_empty() {
        VLinear vLinear = this._empty;
        if (vLinear != null) {
            return vLinear;
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
    public final VRecyclerView get_recyclerView() {
        VRecyclerView vRecyclerView = this._recyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m87502r("_recyclerView");
        return null;
    }

    @NotNull
    public final SmartRefreshLayout get_refresh_layout() {
        SmartRefreshLayout smartRefreshLayout = this._refresh_layout;
        if (smartRefreshLayout != null) {
            return smartRefreshLayout;
        }
        Intrinsics.m87502r("_refresh_layout");
        return null;
    }

    @NotNull
    public final MemberOnLinePageView get_rootView() {
        MemberOnLinePageView memberOnLinePageView = this._rootView;
        if (memberOnLinePageView != null) {
            return memberOnLinePageView;
        }
        Intrinsics.m87502r("_rootView");
        return null;
    }

    @NotNull
    public final VLinear get_share_root() {
        VLinear vLinear = this._share_root;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m87502r("_share_root");
        return null;
    }

    @NotNull
    public final VImage get_share_root_share_go() {
        VImage vImage = this._share_root_share_go;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m87502r("_share_root_share_go");
        return null;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m78638m0(View view) {
        yby.m213986a(this, view);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m78639n0(boolean isShow) {
        xdl0.m208344M(get_empty(), isShow);
        get_empty_icon().setImageDrawable(get_empty_icon().getContext().getDrawable(i3c0.f110761K3));
        get_empty_text().setText("暂无数据");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78638m0(this);
        xdl0.m208329E0(get_share_root(), new View.OnClickListener() { // from class: l.tby
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MemberOnLinePageView.m78630i0(this.f169367a, view);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public final void m78640p0() {
        get_refresh_layout().m223775t();
        get_refresh_layout().m223770o();
    }

    /* JADX INFO: renamed from: r0 */
    public final void m78641r0(@NotNull final ecy<nnn0, fcy> presenter) {
        presenter.getClass();
        this.presenter = presenter;
        m78635q0();
        VRecyclerView vRecyclerView = get_recyclerView();
        vRecyclerView.setAdapter(this.managerListAdapter);
        vRecyclerView.setHasFixedSize(true);
        vRecyclerView.setLayoutManager(new LinearLayoutManager(vRecyclerView.getContext()));
        RecyclerView.AbstractC0574l itemAnimator = vRecyclerView.getItemAnimator();
        itemAnimator.getClass();
        ((AbstractC0616v) itemAnimator).setSupportsChangeAnimations(false);
        vRecyclerView.addOnScrollListener(new C13044b(presenter));
        get_refresh_layout().mo223163S(new TTRefreshHeader(presenter.act()));
        get_refresh_layout().mo223161Q(new TTRefreshFooter(presenter.act()));
        get_refresh_layout().mo223159O(new df50() { // from class: l.uby
            @Override // p149l.df50
            /* JADX INFO: renamed from: w2 */
            public final void mo57954w2(hnc0 hnc0Var) {
                MemberOnLinePageView.m78636s0(presenter, hnc0Var);
            }
        });
        get_refresh_layout().mo223158M(new me50() { // from class: l.vby
            @Override // p149l.me50
            /* JADX INFO: renamed from: a */
            public final void mo77835a(hnc0 hnc0Var) {
                MemberOnLinePageView.m78637t0(presenter, hnc0Var);
            }
        });
        jby jbyVar = this.managerListAdapter;
        jbyVar.getClass();
        jbyVar.m140835I(new lyn0(null, false));
    }

    public final void setManagerListAdapter(@Nullable jby jbyVar) {
        this.managerListAdapter = jbyVar;
    }

    public final void setMemberData(@NotNull lyn0 voiceMemberInfo) {
        voiceMemberInfo.getClass();
        jby jbyVar = this.managerListAdapter;
        jbyVar.getClass();
        jbyVar.m140835I(voiceMemberInfo);
        m78640p0();
        m78639n0(vwb.m200296J(voiceMemberInfo.f130587a));
    }

    public final void setPresenter(@Nullable ecy<?, ?> ecyVar) {
        this.presenter = ecyVar;
    }

    public final void set_empty(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._empty = vLinear;
    }

    public final void set_empty_icon(@NotNull VImage vImage) {
        vImage.getClass();
        this._empty_icon = vImage;
    }

    public final void set_empty_text(@NotNull VText vText) {
        vText.getClass();
        this._empty_text = vText;
    }

    public final void set_recyclerView(@NotNull VRecyclerView vRecyclerView) {
        vRecyclerView.getClass();
        this._recyclerView = vRecyclerView;
    }

    public final void set_refresh_layout(@NotNull SmartRefreshLayout smartRefreshLayout) {
        smartRefreshLayout.getClass();
        this._refresh_layout = smartRefreshLayout;
    }

    public final void set_rootView(@NotNull MemberOnLinePageView memberOnLinePageView) {
        memberOnLinePageView.getClass();
        this._rootView = memberOnLinePageView;
    }

    public final void set_share_root(@NotNull VLinear vLinear) {
        vLinear.getClass();
        this._share_root = vLinear;
    }

    public final void set_share_root_share_go(@NotNull VImage vImage) {
        vImage.getClass();
        this._share_root_share_go = vImage;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [l.ho2] */
    /* JADX INFO: renamed from: u0 */
    public final boolean m78642u0() {
        String strM199309D0 = ypv.f199493a.m199309D0();
        ecy<?, ?> ecyVar = this.presenter;
        ecyVar.getClass();
        String str = ecyVar.m206027E2().m132146l0().f56011id;
        str.getClass();
        if (TextUtils.isEmpty(strM199309D0)) {
            return false;
        }
        return Intrinsics.m87488d(strM199309D0, str);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m78643v0(@Nullable String userId, @Nullable BLiveVoiceCallInvite invite) {
        jby jbyVar = this.managerListAdapter;
        jbyVar.getClass();
        jbyVar.m140836J(userId, invite);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @JvmOverloads
    public MemberOnLinePageView(@NotNull Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    public /* synthetic */ MemberOnLinePageView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }
}
