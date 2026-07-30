package com.p051p1.mobile.putong.live.livingroom.voice.membermanager.online;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.AbstractC0618v;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.clevertap.android.sdk.Constants;
import com.p051p1.mobile.putong.data.OMSTemplateModeType;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.live.base.data.BLiveMember;
import com.p051p1.mobile.putong.live.base.data.BLiveStormDanmakuGiftResourceType;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCall;
import com.p051p1.mobile.putong.live.base.data.BLiveVoiceCallInvite;
import com.p051p1.mobile.putong.live.livingroom.R$string;
import com.p051p1.mobile.putong.live.livingroom.voice.membermanager.online.MemberOnLinePageView;
import com.p074ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.tantanapp.common.utils.NullChecker;
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
import p151v.smart_refresh.SmartRefreshLayout;
import p151v.smart_refresh.footer.TTRefreshFooter;
import p151v.smart_refresh.header.TTRefreshHeader;
import p153l.bly;
import p153l.bnl0;
import p153l.cly;
import p153l.gky;
import p153l.guk0;
import p153l.jn50;
import p153l.jyb;
import p153l.meo0;
import p153l.mvc0;
import p153l.nsv;
import p153l.o1j0;
import p153l.obc0;
import p153l.p7o0;
import p153l.rwn0;
import p153l.tm50;
import p153l.v1n0;
import p153l.vky;
import p153l.xau;
import p153l.y20;
import p153l.ydn0;
import p153l.yec0;
import p153l.zrv;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(m88120d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u0000 k2\u00020\u0001:\u0001lB\u001d\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0013\u0010\u000eJ!\u0010\u0018\u001a\u00020\n2\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\n¢\u0006\u0004\b\u001a\u0010\u000eJ\u0015\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010#\u001a\u00020\n2\b\u0010 \u001a\u0004\u0018\u00010\u001f2\b\u0010\"\u001a\u0004\u0018\u00010!¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u000f¢\u0006\u0004\b%\u0010&R\"\u0010-\u001a\u00020\u00008\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,R\"\u00105\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\"\u0010=\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b7\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010E\u001a\u00020>8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\"\u0010M\u001a\u00020F8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bG\u0010H\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\"\u0010Q\u001a\u00020.8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bN\u00100\u001a\u0004\bO\u00102\"\u0004\bP\u00104R\"\u0010U\u001a\u0002068\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bR\u00108\u001a\u0004\bS\u0010:\"\u0004\bT\u0010<R\"\u0010]\u001a\u00020V8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010e\u001a\u0004\u0018\u00010^8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\bc\u0010dR,\u0010\u0017\u001a\f\u0012\u0002\b\u0003\u0012\u0002\b\u0003\u0018\u00010\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010\u0019¨\u0006m"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/online/MemberOnLinePageView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "Landroid/view/View;", OMSTemplateModeType.view, "", "m0", "(Landroid/view/View;)V", "q0", "()V", "", "isShow", "n0", "(Z)V", "onFinishInflate", "Ll/bly;", "Ll/rwn0;", "Ll/cly;", "presenter", "r0", "(Ll/bly;)V", "p0", "Ll/p7o0;", "voiceMemberInfo", "setMemberData", "(Ll/p7o0;)V", "", "userId", "Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCallInvite;", "invite", "v0", "(Ljava/lang/String;Lcom/p1/mobile/putong/live/base/data/BLiveVoiceCallInvite;)V", "u0", "()Z", Constants.INAPP_DATA_TAG, "Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/online/MemberOnLinePageView;", "get_rootView", "()Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/online/MemberOnLinePageView;", "set_rootView", "(Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/online/MemberOnLinePageView;)V", "_rootView", "Lv/VLinear;", "e", "Lv/VLinear;", "get_share_root", "()Lv/VLinear;", "set_share_root", "(Lv/VLinear;)V", "_share_root", "Lv/VImage;", "f", "Lv/VImage;", "get_share_root_share_go", "()Lv/VImage;", "set_share_root_share_go", "(Lv/VImage;)V", "_share_root_share_go", "Lv/smart_refresh/SmartRefreshLayout;", "g", "Lv/smart_refresh/SmartRefreshLayout;", "get_refresh_layout", "()Lv/smart_refresh/SmartRefreshLayout;", "set_refresh_layout", "(Lv/smart_refresh/SmartRefreshLayout;)V", "_refresh_layout", "Lv/VRecyclerView;", "h", "Lv/VRecyclerView;", "get_recyclerView", "()Lv/VRecyclerView;", "set_recyclerView", "(Lv/VRecyclerView;)V", "_recyclerView", RXScreenCaptureService.KEY_INDEX, "get_empty", "set_empty", "_empty", "j", "get_empty_icon", "set_empty_icon", "_empty_icon", "Lv/VText;", "k", "Lv/VText;", "get_empty_text", "()Lv/VText;", "set_empty_text", "(Lv/VText;)V", "_empty_text", "Ll/gky;", BLiveStormDanmakuGiftResourceType.f45292l, "Ll/gky;", "getManagerListAdapter", "()Ll/gky;", "setManagerListAdapter", "(Ll/gky;)V", "managerListAdapter", "m", "Ll/bly;", "getPresenter", "()Ll/bly;", "setPresenter", "Companion", "a", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
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
    public gky managerListAdapter;

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @Nullable
    public bly<?, ?> presenter;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.membermanager.online.MemberOnLinePageView$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/online/MemberOnLinePageView$a;", "", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/online/MemberOnLinePageView;", "a", "(Landroid/view/LayoutInflater;)Lcom/p1/mobile/putong/live/livingroom/voice/membermanager/online/MemberOnLinePageView;", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @NotNull
        /* JADX INFO: renamed from: a */
        public final MemberOnLinePageView m79827a(@NotNull LayoutInflater inflater) {
            inflater.getClass();
            View viewInflate = inflater.inflate(yec0.f198911S3, (ViewGroup) null, false);
            viewInflate.getClass();
            return (MemberOnLinePageView) viewInflate;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.membermanager.online.MemberOnLinePageView$b */
    @Metadata(m88120d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, m88121d2 = {"com/p1/mobile/putong/live/livingroom/voice/membermanager/online/MemberOnLinePageView$b", "Landroidx/recyclerview/widget/RecyclerView$t;", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "", "newState", "", "onScrollStateChanged", "(Landroidx/recyclerview/widget/RecyclerView;I)V", "livingroom_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class C13207b extends RecyclerView.AbstractC0584t {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ bly<rwn0, cly> f54565a;

        public C13207b(bly<rwn0, cly> blyVar) {
            this.f54565a = blyVar;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0584t
        public void onScrollStateChanged(RecyclerView recyclerView, int newState) {
            recyclerView.getClass();
            if (newState != 0 || recyclerView.canScrollVertically(1) || recyclerView.getAdapter() == null) {
                return;
            }
            RecyclerView.Adapter adapter = recyclerView.getAdapter();
            adapter.getClass();
            if (adapter.getItemCount() == this.f54565a.m213810E2().f148277u && this.f54565a.m213810E2().mo183435j().isNormalLive()) {
                o1j0.m165636j(xau.m209911u(R$string.f48276o7, Integer.valueOf(this.f54565a.m213810E2().f148277u)));
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
    public static void m79813i0(MemberOnLinePageView memberOnLinePageView, View view) {
        bly<?, ?> blyVar = memberOnLinePageView.presenter;
        if (blyVar != null) {
            meo0.m158063b(blyVar);
            blyVar.m213811F2().VoiceVirtualLiveEvent.openSharePanelDialog().m199277p();
        }
    }

    /* JADX INFO: renamed from: j0 */
    public static void m79814j0(MemberOnLinePageView memberOnLinePageView, String str) {
        rwn0 rwn0Var;
        bly<?, ?> blyVar = memberOnLinePageView.presenter;
        ydn0.m215258k(memberOnLinePageView.presenter, (blyVar == null || (rwn0Var = (rwn0) blyVar.m213810E2()) == null) ? null : rwn0Var.m168526j0(), str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: k0 */
    public static void m79815k0(MemberOnLinePageView memberOnLinePageView, nsv nsvVar) {
        nsvVar.getClass();
        BLiveVoiceCall bLiveVoiceCallM164644i = nsvVar.m164644i();
        if (guk0.m132329h(bLiveVoiceCallM164644i)) {
            ydn0.m215254g(memberOnLinePageView.presenter, bLiveVoiceCallM164644i, "voice-manager");
            if (memberOnLinePageView.m79825u0()) {
                v1n0.m199042t();
                return;
            } else {
                v1n0.m199043u();
                return;
            }
        }
        if (Intrinsics.m88377d(BLiveMember.STATUS_INVITE_CAN_INVITE, ((BLiveMember) nsvVar.f143542a).inviteStatus)) {
            if (NullChecker.m82486a(bLiveVoiceCallM164644i)) {
                bly<?, ?> blyVar = memberOnLinePageView.presenter;
                if (blyVar != null) {
                    blyVar.m104946d4(bLiveVoiceCallM164644i.user);
                }
            } else {
                User userM164643h = nsvVar.m164643h();
                if (userM164643h == null) {
                    return;
                }
                bly<?, ?> blyVar2 = memberOnLinePageView.presenter;
                if (blyVar2 != null) {
                    blyVar2.m104946d4(userM164643h.f56859id);
                }
            }
            if (memberOnLinePageView.m79825u0()) {
                v1n0.m199044v();
            } else {
                v1n0.m199045w();
            }
        }
    }

    @JvmStatic
    @NotNull
    /* JADX INFO: renamed from: o0 */
    public static final MemberOnLinePageView m79817o0(@NotNull LayoutInflater layoutInflater) {
        return INSTANCE.m79827a(layoutInflater);
    }

    /* JADX INFO: renamed from: q0 */
    private final void m79818q0() {
        this.managerListAdapter = new gky(this.presenter, new y20() { // from class: l.tky
            @Override // p153l.y20
            public final void call(Object obj) {
                MemberOnLinePageView.m79814j0(this.f174773a, (String) obj);
            }
        }, new y20() { // from class: l.uky
            @Override // p153l.y20
            public final void call(Object obj) {
                MemberOnLinePageView.m79815k0(this.f179464a, (nsv) obj);
            }
        });
    }

    /* JADX INFO: renamed from: s0 */
    public static final void m79819s0(bly blyVar, mvc0 mvc0Var) {
        mvc0Var.getClass();
        blyVar.mo104944V3();
    }

    /* JADX INFO: renamed from: t0 */
    public static final void m79820t0(bly blyVar, mvc0 mvc0Var) {
        mvc0Var.getClass();
        blyVar.mo104943U3();
    }

    @Nullable
    public final gky getManagerListAdapter() {
        return this.managerListAdapter;
    }

    @Nullable
    public final bly<?, ?> getPresenter() {
        return this.presenter;
    }

    @NotNull
    public final VLinear get_empty() {
        VLinear vLinear = this._empty;
        if (vLinear != null) {
            return vLinear;
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
    public final VRecyclerView get_recyclerView() {
        VRecyclerView vRecyclerView = this._recyclerView;
        if (vRecyclerView != null) {
            return vRecyclerView;
        }
        Intrinsics.m88391r("_recyclerView");
        return null;
    }

    @NotNull
    public final SmartRefreshLayout get_refresh_layout() {
        SmartRefreshLayout smartRefreshLayout = this._refresh_layout;
        if (smartRefreshLayout != null) {
            return smartRefreshLayout;
        }
        Intrinsics.m88391r("_refresh_layout");
        return null;
    }

    @NotNull
    public final MemberOnLinePageView get_rootView() {
        MemberOnLinePageView memberOnLinePageView = this._rootView;
        if (memberOnLinePageView != null) {
            return memberOnLinePageView;
        }
        Intrinsics.m88391r("_rootView");
        return null;
    }

    @NotNull
    public final VLinear get_share_root() {
        VLinear vLinear = this._share_root;
        if (vLinear != null) {
            return vLinear;
        }
        Intrinsics.m88391r("_share_root");
        return null;
    }

    @NotNull
    public final VImage get_share_root_share_go() {
        VImage vImage = this._share_root_share_go;
        if (vImage != null) {
            return vImage;
        }
        Intrinsics.m88391r("_share_root_share_go");
        return null;
    }

    /* JADX INFO: renamed from: m0 */
    public final void m79821m0(View view) {
        vky.m201588a(this, view);
    }

    /* JADX INFO: renamed from: n0 */
    public final void m79822n0(boolean isShow) {
        bnl0.m105524M(get_empty(), isShow);
        get_empty_icon().setImageDrawable(get_empty_icon().getContext().getDrawable(obc0.f146089K3));
        get_empty_text().setText("暂无数据");
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79821m0(this);
        bnl0.m105509E0(get_share_root(), new View.OnClickListener() { // from class: l.qky
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MemberOnLinePageView.m79813i0(this.f158182a, view);
            }
        });
    }

    /* JADX INFO: renamed from: p0 */
    public final void m79823p0() {
        get_refresh_layout().m225021t();
        get_refresh_layout().m225016o();
    }

    /* JADX INFO: renamed from: r0 */
    public final void m79824r0(@NotNull final bly<rwn0, cly> presenter) {
        presenter.getClass();
        this.presenter = presenter;
        m79818q0();
        VRecyclerView vRecyclerView = get_recyclerView();
        vRecyclerView.setAdapter(this.managerListAdapter);
        vRecyclerView.setHasFixedSize(true);
        vRecyclerView.setLayoutManager(new LinearLayoutManager(vRecyclerView.getContext()));
        RecyclerView.AbstractC0576l itemAnimator = vRecyclerView.getItemAnimator();
        itemAnimator.getClass();
        ((AbstractC0618v) itemAnimator).setSupportsChangeAnimations(false);
        vRecyclerView.addOnScrollListener(new C13207b(presenter));
        get_refresh_layout().mo224409S(new TTRefreshHeader(presenter.act()));
        get_refresh_layout().mo224407Q(new TTRefreshFooter(presenter.act()));
        get_refresh_layout().mo224405O(new jn50() { // from class: l.rky
            @Override // p153l.jn50
            /* JADX INFO: renamed from: w2 */
            public final void mo59137w2(mvc0 mvc0Var) {
                MemberOnLinePageView.m79819s0(presenter, mvc0Var);
            }
        });
        get_refresh_layout().mo224404M(new tm50() { // from class: l.sky
            @Override // p153l.tm50
            /* JADX INFO: renamed from: a */
            public final void mo79018a(mvc0 mvc0Var) {
                MemberOnLinePageView.m79820t0(presenter, mvc0Var);
            }
        });
        gky gkyVar = this.managerListAdapter;
        gkyVar.getClass();
        gkyVar.m130608I(new p7o0(null, false));
    }

    public final void setManagerListAdapter(@Nullable gky gkyVar) {
        this.managerListAdapter = gkyVar;
    }

    public final void setMemberData(@NotNull p7o0 voiceMemberInfo) {
        voiceMemberInfo.getClass();
        gky gkyVar = this.managerListAdapter;
        gkyVar.getClass();
        gkyVar.m130608I(voiceMemberInfo);
        m79823p0();
        m79822n0(jyb.m147479J(voiceMemberInfo.f150952a));
    }

    public final void setPresenter(@Nullable bly<?, ?> blyVar) {
        this.presenter = blyVar;
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

    /* JADX WARN: Type inference failed for: r2v2, types: [l.oo2] */
    /* JADX INFO: renamed from: u0 */
    public final boolean m79825u0() {
        String strM207631D0 = zrv.f205799a.m207631D0();
        bly<?, ?> blyVar = this.presenter;
        blyVar.getClass();
        String str = blyVar.m213810E2().m168532l0().f56859id;
        str.getClass();
        if (TextUtils.isEmpty(strM207631D0)) {
            return false;
        }
        return Intrinsics.m88377d(strM207631D0, str);
    }

    /* JADX INFO: renamed from: v0 */
    public final void m79826v0(@Nullable String userId, @Nullable BLiveVoiceCallInvite invite) {
        gky gkyVar = this.managerListAdapter;
        gkyVar.getClass();
        gkyVar.m130609J(userId, invite);
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
